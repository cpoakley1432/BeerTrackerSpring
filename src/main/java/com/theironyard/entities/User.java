package com.theironyard.entities;

import com.theironyard.entities.Beer;

import javax.persistence.*;

import java.util.List;

/**
 * Created by cameronoakley on 11/11/15.
 */
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    Integer id;

    @Column(nullable = false)
    public String name;


    @Column(nullable = false)
    public String password;

    @OneToMany(mappedBy = "user")//the name of the field in the beer class
    public List<Beer> beers;
}
