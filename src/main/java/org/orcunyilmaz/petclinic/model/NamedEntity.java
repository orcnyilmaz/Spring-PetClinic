package org.orcunyilmaz.petclinic.model;

/**
 * Created by orcuny on 01/02/2017.
 */

import javax.persistence.Column;

/**
 * This is going to be used with BaseEntity for adding name property to it*/
public class NamedEntity extends BaseEntity{

    @Column (name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() { return this.getName(); }
}
