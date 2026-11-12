package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes14.dex */
public final class Hct {
    private int argb;
    private double chroma;
    private double hue;
    private double tone;

    private Hct(int i14) {
        setInternalState(i14);
    }

    public static Hct from(double d14, double d15, double d16) {
        return new Hct(HctSolver.solveToInt(d14, d15, d16));
    }

    public static Hct fromInt(int i14) {
        return new Hct(i14);
    }

    private void setInternalState(int i14) {
        this.argb = i14;
        Cam16 cam16FromInt = Cam16.fromInt(i14);
        this.hue = cam16FromInt.getHue();
        this.chroma = cam16FromInt.getChroma();
        this.tone = ColorUtils.lstarFromArgb(i14);
    }

    public double getChroma() {
        return this.chroma;
    }

    public double getHue() {
        return this.hue;
    }

    public double getTone() {
        return this.tone;
    }

    public Hct inViewingConditions(ViewingConditions viewingConditions) {
        double[] dArrXyzInViewingConditions = Cam16.fromInt(toInt()).xyzInViewingConditions(viewingConditions, null);
        Cam16 cam16FromXyzInViewingConditions = Cam16.fromXyzInViewingConditions(dArrXyzInViewingConditions[0], dArrXyzInViewingConditions[1], dArrXyzInViewingConditions[2], ViewingConditions.DEFAULT);
        return from(cam16FromXyzInViewingConditions.getHue(), cam16FromXyzInViewingConditions.getChroma(), ColorUtils.lstarFromY(dArrXyzInViewingConditions[1]));
    }

    public void setChroma(double d14) {
        setInternalState(HctSolver.solveToInt(this.hue, d14, this.tone));
    }

    public void setHue(double d14) {
        setInternalState(HctSolver.solveToInt(d14, this.chroma, this.tone));
    }

    public void setTone(double d14) {
        setInternalState(HctSolver.solveToInt(this.hue, this.chroma, d14));
    }

    public int toInt() {
        return this.argb;
    }
}
