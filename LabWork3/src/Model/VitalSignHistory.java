/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author nishipancholi
 */
public class VitalSignHistory {
    ArrayList<Observations> vitalSignHistory;
    
    public VitalSignHistory(){
        this.vitalSignHistory = new ArrayList<Observations>();
    }

    public ArrayList<Observations> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<Observations> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    public Observations createObservation(int observationId, double bloodPressure, double temperature){
        Observations observation= new Observations();
        observation.setObservationId(observationId);
        observation.setTemprature(temperature);
        observation.setBloodPressure(bloodPressure);
        
        this.vitalSignHistory.add(observation);
        
        return observation;
    }
    
    public Boolean checkObservationId(int id){
        for(Observations o:this.vitalSignHistory){
            if(o.getObservationId()== id){
                return false;
            }
        }
        return true;
    }
}
