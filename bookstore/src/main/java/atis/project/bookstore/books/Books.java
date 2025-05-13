package atis.project.bookstore.books;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "books")
@Data
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private Double price;
    private boolean availability;
    private String description;
    private LocalDateTime lastUpdate;



}
