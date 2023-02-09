package com.example.Sql_Rocks;


import jakarta.persistence.*;

@Entity
@Table(name = "library_card")
public class LibraryCard {

    @Id
    private int cardNo;

    private int fine;

    private int bookIssued;

    @Enumerated(value = EnumType.STRING) // To store the values in db in String format
    private CardStatus cardStatus;

    // Child class will have the foreign key of th parent class : through which
    // It connects to the other table
    @OneToOne // Mapping relation between two Entity
    @JoinColumn // You are telling : add a foreign key column --> Define the column name of the parent class, by default it's the Primary Key of the parent class
    User user;




}
