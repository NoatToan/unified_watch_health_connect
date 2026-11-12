package com.xiaomi.hm.health.ui.sportfitness.utils;

/* JADX INFO: loaded from: classes22.dex */
public class SportPaceSpeedValue {
    public boolean isKm;
    public float maxProgress;
    public int maxValue;
    public int minValue;
    public int sportType;
    public float unit;

    public SportPaceSpeedValue(int sportType, float unit, int minValue, int maxValue, boolean isKm) {
        this.sportType = sportType;
        this.unit = unit;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.isKm = isKm;
        if (sportType == 9) {
            this.maxProgress = (maxValue - minValue) / unit;
        } else {
            this.maxProgress = (maxValue - minValue) * (60.0f / unit);
        }
    }

    public SportPaceSpeedValue(int sportType, float unit, int minValue, int maxValue) {
        this.sportType = sportType;
        this.unit = unit;
        this.minValue = minValue;
        this.maxValue = maxValue;
        if (sportType == 9) {
            this.maxProgress = (maxValue - minValue) / unit;
        } else {
            this.maxProgress = (maxValue - minValue) * (60.0f / unit);
        }
    }
}
