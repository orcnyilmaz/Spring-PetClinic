package org.orcunyilmaz.petclinic.model;

/**
 * Created by orcuny on 01/02/2017.
 */

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;

/**
 * Person Model is going to be all about Persons, how original*/
public class Person extends BaseEntity{

    @Column (name = "first_name")
    @NotEmpty
    protected String firstName;

    @Column (name = "last_name")
    @NotEmpty
    protected String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
