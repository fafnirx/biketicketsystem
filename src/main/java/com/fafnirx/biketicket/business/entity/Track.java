/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fafnirx.biketicket.business.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mirko
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Access(AccessType.FIELD)
public class Track {
    @GeneratedValue
    @Id
    private long id;
    private String description;
    
    public Track() {
    }

    public Track(String description) {
        this.description = description;
    }
    
    @ManyToOne
    private Cyclist cyclist;
    
    
}
