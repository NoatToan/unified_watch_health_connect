package com.airoha.lib153xPeq;

/* JADX INFO: loaded from: classes2.dex */
public class Ab153xPeq {
    static {
        System.loadLibrary("ab153x-peq");
    }

    public static native void calcZ(double d);

    public static native int changeRescaleCofe(int i, double d);

    public static native void destroy(int i);

    public static native int generateCofe(int i);

    public static native int generateFreqResp(int i);

    public static native int getCofeCount(int i);

    public static native short[] getCofeParam(int i);

    public static native double[] getRespFreq(int i);

    public static native double[] getRespY(int i);

    public static native void setParam(int i, double d, int i2, int i3, int i4, int i5);

    public static native void setPeqPoint(int i, int i2, double d, double d2, double d3);

    public static native void setXpfPoint(int i, int i2, double d, double d2, int i3);
}
