package com.mi.fitness.menstrual.data;

/* JADX INFO: loaded from: classes5.dex */
public class TemperatureBasicInfo {
    public float baseTemp;
    public float baseline;
    public long currentDate;
    public float diffTemp;
    public int status;

    public String toString() {
        return "TemperatureBasicInfo(currentDate=" + this.currentDate + ", baseTemp=" + this.baseTemp + ", baseline=" + this.baseline + ", diffTemp=" + this.diffTemp + ", status=" + this.status + ")";
    }
}
