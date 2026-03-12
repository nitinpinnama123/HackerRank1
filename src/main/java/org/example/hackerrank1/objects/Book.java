package org.example.hackerrank1.objects;

import lombok.*;
import jakarta.persistence.api;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book  {
    private Long id;

    private String title;
    private String author;
    private String genre;
    private int pages;
    private int publishedYear;
}