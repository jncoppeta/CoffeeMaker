package edu.ncsu.csc.CoffeeMaker.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ingredient extends DomainObject {

    @Id
    @GeneratedValue
    public Long    id;

    public Integer amount;

    public String  name;

    public Ingredient () {

    }

    public Ingredient ( final String type, final Integer amount ) {
        super();
        if ( amount < 0 ) {
            throw new IllegalArgumentException( "negative amounr of ingredient" );
        }
        this.amount = amount;
        this.name = type;
    }

    @Override
    public Long getId () {
        return id;
    }

    public void setId ( final Long id ) {
        this.id = id;
    }

    public Integer getAmount () {
        return amount;
    }

    public void setAmount ( final Integer amount ) {
        this.amount = amount;
    }

    public String getType () {
        return name;
    }

    public void setType ( final String ingredient ) {
        this.name = ingredient;
    }

    @Override
    public String toString () {
        return "Ingredient [id=" + id + ", amount=" + amount + ", type=" + name + "]";
    }

}
