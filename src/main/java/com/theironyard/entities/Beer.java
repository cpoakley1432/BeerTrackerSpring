package com.theironyard.entities;


import javax.persistence.*;

/**
 * Created by cameronoakley on 11/10/15.
 */
@Entity
public class Beer {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    int id;

    @Column(nullable = false)
    public String name;

    @Column(nullable = false)
    public String type;

    @Column(nullable = false)
    public Integer calories;
    @ManyToOne
    @Column(nullable = false)
    public User user;
}
