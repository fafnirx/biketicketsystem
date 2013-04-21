package com.fafnirx.biketicket.business.boundary;

import com.fafnirx.biketicket.business.entity.Cyclist;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author mirko
 */
@Path("biketickets")
public class BikeTicketResources {
    @GET
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public List<Cyclist> allCyclists() {
        List<Cyclist> list = new ArrayList<Cyclist>();
        list.add( new Cyclist("tom",   "tom@xml.com"));
        list.add( new Cyclist("dick",  "dick@xml.com"));
        list.add( new Cyclist("harry", "harry@xml.com"));   
        return list;
    }    
    @GET @Path("{id}")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public Cyclist getCyclist(@PathParam("id") String id) {
        int idNr = Integer.valueOf(id).intValue();
        
        String name = idNr < 20 ? "Tom" : "Harry";
        
        return new Cyclist(name, "test@xml.com");
    }
    
}
