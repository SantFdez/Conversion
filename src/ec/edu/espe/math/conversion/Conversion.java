/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.conversion;

import ec.edu.espe.util.UnitConstants;
import java.util.HashMap;

/**
 *
 * @author Santiago
 * This method converts metric units
@Params: 
* num: number to be converted
* unit1: start unit
* unit2: finish unit
* 
* @return
* number converted
* 
 */
public class Conversion {
    private HashMap<String,Double> unitsToMeter;

    public Conversion() {
        unitsToMeter=new HashMap<>();
        unitsToMeter.put(UnitConstants.MM, Math.pow(10, -3));
        unitsToMeter.put(UnitConstants.CM, Math.pow(10, -2));
        unitsToMeter.put(UnitConstants.DM, Math.pow(10, -1));
        unitsToMeter.put(UnitConstants.M, Math.pow(10, 0));
        unitsToMeter.put(UnitConstants.DAM, Math.pow(10, 1));
        unitsToMeter.put(UnitConstants.HM, Math.pow(10, 2));
        unitsToMeter.put(UnitConstants.KM, Math.pow(10, 3));
    }
    
   public Float convert(Float num, String unit1,String unit2){
       Double conv1=unitsToMeter.get(unit1);
       Double conv2=Math.pow(unitsToMeter.get(unit2),-1);
       return (float)(num*conv1*conv2);
   } 
   
   public Float convertSquare(Float num, String unit1, String unit2){
       Double conv1=unitsToMeter.get(unit1);
       Double conv2=Math.pow(unitsToMeter.get(unit2),-1);
       return (float)(num*Math.pow(conv1*conv2,2));
   }
   
   public Float convertVolume(Float num, String unit1, String unit2){
       Double conv1=unitsToMeter.get(unit1);
       Double conv2=Math.pow(unitsToMeter.get(unit2),-1);
       return (float)(num*Math.pow(conv1*conv2,3));
   }
    
}
