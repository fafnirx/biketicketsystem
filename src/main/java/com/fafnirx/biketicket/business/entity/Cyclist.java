package com.fafnirx.biketicket.business.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
public class Cyclist implements Serializable{
    @GeneratedValue
    @Id
    private long id;
    
    private String emailAdress;
    private String username;

    public Cyclist(String emailAdress, String username) {
        this.emailAdress = emailAdress;
        this.username = username;
    }

    public Cyclist() {
    }

    public long getId() {
        return id;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    @OneToMany(mappedBy = "cyclist")
    private List<Track> tracks;
}
