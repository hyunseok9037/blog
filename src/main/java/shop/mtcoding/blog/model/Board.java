package shop.mtcoding.blog.model;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Board {

    private int id;
    private String username;
    private String password;
    private String email;
    private Timestamp createdAt;
}
