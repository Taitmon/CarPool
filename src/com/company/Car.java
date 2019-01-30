package com.company;

public class Car
{
    private int passengerCount;

    public Car(int passengerCount)
    {
        this.passengerCount = passengerCount;
    }

    public int getPassengerCount ()
    {
        int passengerCount = this.passengerCount;
        return passengerCount;
    }

    public int setPassengerCount(int passengerCount)
    {
        if(passengerCount > 0)
        {
            this.passengerCount = passengerCount;

        }

        return passengerCount;
    }
}
