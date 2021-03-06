package study.querydsl.entity;

import lombok.*;
import org.aspectj.lang.annotation.Aspect;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

import static lombok.AccessLevel.*;

@Getter
@Setter
@Entity
@NoArgsConstructor(access = PROTECTED)
@ToString(of = {"id", "name"})
public class Team {
    @Id @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "team")
    private List<Member> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }
}
