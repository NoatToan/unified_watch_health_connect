package com.huami.algo.healthcare;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class SmoothResult {
    private int[] mRPeaksPosition = new int[0];
    private int rPeakCount = 0;
    private float[] mSmoothedData = new float[0];
    private int noisePercent = 0;
    private EcgNoise[] noisePosition = new EcgNoise[0];
    private int averageHR = 0;
    private float quality = 0.0f;
    private int ecgQualityFlag = 0;
    private float hrvRmssd = 0.0f;
    private int qrsWidth = 0;
    private int hrvScore = 0;
    private int resultCode = 0;

    public int getAverageHR() {
        return this.averageHR;
    }

    public int getEcgQualityFlag() {
        return this.ecgQualityFlag;
    }

    public float getHrvRmssd() {
        return this.hrvRmssd;
    }

    public int getHrvScore() {
        return this.hrvScore;
    }

    public int getNoisePercent() {
        return this.noisePercent;
    }

    public EcgNoise[] getNoisePosition() {
        return this.noisePosition;
    }

    public int getQrsWidth() {
        return this.qrsWidth;
    }

    public float getQuality() {
        return this.quality;
    }

    public int getRPeakCount() {
        return this.rPeakCount;
    }

    public int[] getRPeaksPosition() {
        return this.mRPeaksPosition;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public float[] getSmoothedData() {
        return this.mSmoothedData;
    }

    public void setAverageHR(int i) {
        this.averageHR = i;
    }

    public void setEcgQualityFlag(int i) {
        this.ecgQualityFlag = i;
    }

    public void setHrvRmssd(float f) {
        this.hrvRmssd = f;
    }

    public void setHrvScore(int i) {
        this.hrvScore = i;
    }

    public void setNoisePercent(int i) {
        this.noisePercent = i;
    }

    public void setNoisePosition(EcgNoise[] ecgNoiseArr) {
        this.noisePosition = ecgNoiseArr;
    }

    public void setQrsWidth(int i) {
        this.qrsWidth = i;
    }

    public void setQuality(float f) {
        this.quality = f;
    }

    public void setRPeakCount(int i) {
        this.rPeakCount = i;
    }

    public void setRPeaksPosition(int[] iArr) {
        this.mRPeaksPosition = iArr;
    }

    public void setResultCode(int i) {
        this.resultCode = i;
    }

    public void setSmoothedData(float[] fArr) {
        this.mSmoothedData = fArr;
    }

    public String toString() {
        return "SmoothResult{mRPeaksPosition=" + this.mRPeaksPosition.length + ", mSmoothedData=" + this.mSmoothedData.length + ", noisePercent=" + this.noisePercent + ", noisePosition=" + Arrays.toString(this.noisePosition) + ", averageHR=" + this.averageHR + ", quality=" + this.quality + ", ecgQualityFlag=" + this.ecgQualityFlag + ", hrvRmssd=" + this.hrvRmssd + ", qrsWidth=" + this.qrsWidth + ", hrvScore=" + this.hrvScore + ", resultCode=" + this.resultCode + '}';
    }
}
