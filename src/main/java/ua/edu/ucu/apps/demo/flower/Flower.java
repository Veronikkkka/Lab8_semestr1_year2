package ua.edu.ucu.apps.demo.flower;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table
public class Flower  extends Item {
    @Getter
    private String color;
    private double petal;
    private int price;
    @Id  @GeneratedValue
    private Long id;

    public Flower() {

    }

    public double getPrice() {
        return price;
    }
}