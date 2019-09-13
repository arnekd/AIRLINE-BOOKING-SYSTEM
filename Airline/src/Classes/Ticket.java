package Classes;

/**
 * The class Ticket describes a ticket, including all the necessary information about the ticket.
 *
 *
 * @author Gruppe 12
 */
public class Ticket {

    String ticketNr;
    String from;
    String to;
    int luggage;
    PriceRange priceRange;

    /**
     * Set the values in a ticket
     *
     * @param from
     * @param to
     * @param luggage
     * @param priceRange
     */
    public Ticket (String from, String to, int luggage, PriceRange priceRange) {

        this.from = from;
        this.to = to;
        this.luggage = luggage;
        this.priceRange = priceRange;
    }

    /**
     * Create a new instance of a ticket.
     *
     * @param ticket
     * @return the ticketNr
     */
    public String newTicket(Ticket ticket) {

        return "";

    }

    /**
     * Updates an existing ticket with updated information
     *
     * @param ticketNr
     * @param oldTicket
     * @return the updated ticket
     */
    public Ticket updateTicket(String ticketNr, Ticket oldTicket) {

        return this;

    }

    /**
     * Cancel/delete an existing ticket
     *
     * @param ticketNr
     * @return true if cancellation was successful, if not return false
     */
    public Boolean cancelTicket(String ticketNr) {

        return false;

    }

}

