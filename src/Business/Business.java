/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author AnanthaShankar
 */
public class Business {
    private AppointmentHistory aptHist;
    private Doctor d;
    
    public Business(){
        aptHist = new AppointmentHistory();
        d = new Doctor();
    }

    public AppointmentHistory getAptHist() {
        return aptHist;
    }

    public Doctor getD() {
        return d;
    }
    
    
    
}
