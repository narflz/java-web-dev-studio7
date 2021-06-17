package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc {
    private Integer cdSpinRateMin = 200;
    private Integer cdSpinRateMax = 500;

    public CD(String aName, ArrayList<String> someContents, Integer aCapacity, String aDiscType) {
        super(aName, someContents, aCapacity, aDiscType);

    }


    @Override
    public void spinDisc() {
        System.out.println("A " + this.getDiscType() + " spins at a rate of " + cdSpinRateMin + " - "
                + cdSpinRateMax + " rpm.");
    }


    @Override
    public void read() {
        System.out.println(this.getContents());
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
