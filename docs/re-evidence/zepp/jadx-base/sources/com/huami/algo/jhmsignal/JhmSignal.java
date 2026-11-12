package com.huami.algo.jhmsignal;

/* JADX INFO: loaded from: classes3.dex */
public class JhmSignal {
    static {
        System.loadLibrary("JhmSignal");
    }

    public native void deinitFilter();

    public native int getAfJudgeEcg(float[] fArr);

    public native int getAverageHR();

    public native int getEcgQualityFlag();

    public native float getHRV();

    public native float getHRVRmssd();

    public native int getHRVScore(float f);

    public native int getNoisePercent();

    public native int[] getNoisePosition();

    public native int getQuality();

    public native void initFilter();

    public native float[] smoothForDoctor(float[] fArr);

    public native SmoothResult smoothHisWithRPeaks(float[] fArr);

    public native float smoothOnline(float f);
}
