package at.michaelkoenig;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Cup {

    private String liquidType;
    private double percentFull;

    public Cup(String liquidType, double percentFull) {
        setLiquidType(liquidType);
        setPercentFull(percentFull);
    }

    public String getLiquidType() {
        return liquidType;
    }

    public final void setLiquidType(String liquidType) {
        if (liquidType != null) {
            this.liquidType = liquidType;
        }
    }

    public double getPercentFull() {
        return percentFull;
    }

    public final void setPercentFull(double percentFull) {
        if(percentFull > 100.0 || percentFull < 0.0) {
            throw new IllegalArgumentException("Percent must be >= 0.0 and <= 100.0");
        }
        this.percentFull = percentFull;
    }

    public boolean isEmpty() {
        return percentFull == 0;
    }

}
