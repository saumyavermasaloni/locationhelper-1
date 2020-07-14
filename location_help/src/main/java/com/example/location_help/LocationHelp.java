package com.example.location_help;

import android.location.Location;

public class LocationHelp
{
    public static float getDistanceinKM(double startLatitude,double startLongitude,double endLatitude, double endLongitude)
    {
        float[] result=new float[0];
        Location.distanceBetween(startLatitude,startLongitude,endLatitude,endLongitude,result);
        return result[0]/1000;
    }
}
