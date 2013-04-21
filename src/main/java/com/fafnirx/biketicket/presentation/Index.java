
package com.fafnirx.biketicket.presentation;

import com.fafnirx.biketicket.business.boundary.BikeTicketService;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

/**
 *
 * @author mirko
 */
@Model
public class Index {
    @Inject
    BikeTicketService ticketService;
    
    public String get( ) {
        ticketService.createCyclist("test1", "testEmail@email.com");
        return "done";
    }
    
}
