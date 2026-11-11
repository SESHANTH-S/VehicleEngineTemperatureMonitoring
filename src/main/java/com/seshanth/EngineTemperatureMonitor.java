
package com.seshanth;

public class EngineTemperatureMonitor {

    public static String checkTemperature(double temperature) {

        if (temperature < 0) {
            return "Invalid Temperature";
        }
        else if (temperature <= 90) {
            return "Normal";
        }
        else if (temperature < 110) {
            return "Warning - Engine Overheating";
        }
        else {
            return "Critical - High Engine Temperature";
        }
    }

    public static void main(String[] args) {

        double[] temperatures = {80, 95, 105, 115};

        System.out.println("VEHICLE ENGINE TEMPERATURE MONITORING");
        System.out.println("-------------------------------------");

        for (double temperature : temperatures) {

            System.out.println("Engine Temperature: "
                    + temperature + " °C");

            System.out.println("Engine Status: "
                    + checkTemperature(temperature));

            System.out.println("-------------------------------------");
        }
    }
}
