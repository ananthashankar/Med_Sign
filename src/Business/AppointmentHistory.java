/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author AnanthaShankar
 */
public class AppointmentHistory {
    
    private ArrayList<Appointment> appointmentList;
    private ArrayList<String> availableAppointments;
    
    public AppointmentHistory(){
        
        appointmentList = new ArrayList<Appointment>();
        availableAppointments = new ArrayList<String>();
        
    }

    public ArrayList<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public ArrayList<String> getAvailableAppointments() {
        return availableAppointments;
    }

    
    public void addScheduleToScheduleDb(String schedule){
        
        availableAppointments.add(schedule);
        
    }
    
    public String deleteScheduleFromScheduleDb(String schedule){
        for(String s : availableAppointments){
        if(s.equals(schedule)){
            availableAppointments.remove(schedule);
            return "Found";
            }
        } return null;
    }
    
    public Appointment addAppointmentToAppointmentDb(){
        Appointment a = new Appointment();
        appointmentList.add(a);
        return a;
    }
    
    public Appointment removeAppointmentToAppointmentDb(int id){
        for(Appointment a : appointmentList){
            if(a.getId() == id){
               Appointment b = a;
               appointmentList.remove(a);
               return b;
            } 
        } return null;
    }
}
