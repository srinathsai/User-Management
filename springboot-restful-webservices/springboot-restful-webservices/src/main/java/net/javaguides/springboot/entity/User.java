package net.javaguides.springboot.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor             // Using lombok packagefor getters, setters and constructors to reduce boiler plate code.
@NoArgsConstructor
@Entity
@Table(name = "users")      //this is the key annotation to know that this class is table with our own name given after equal sign.
public class User {
    @Id //for primary key we use @Id annotation
    @GeneratedValue(strategy = GenerationType.IDENTITY) //there are 4 types of primary key generation at a time of creating new record.
    private Long id;
    @Column(nullable = false)   //@column will tell that this field of class will be a column in database. we can set values as not null,unique and max size of the column value as well.
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(unique = true,nullable = false)
    private String email;

}
