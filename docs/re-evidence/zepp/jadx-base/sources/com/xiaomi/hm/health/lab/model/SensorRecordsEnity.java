package com.xiaomi.hm.health.lab.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public class SensorRecordsEnity implements Serializable {
    public static final String DEFAULT_RESOLUTION = "0";
    private long a;
    private String b;
    private int c;
    private int d;
    private short e;
    private String f;
    private long g;
    private long h;
    private long i;
    private String j;

    public static class SamplingRate implements Serializable {
        public static final short ACC_RATE = 25;
        public static final short COMMON_RATE = 1;
        public static final short GYRO_RATE = 100;
        public static final short MAGN_RATE = 25;
        public static final short NMEA_RATE = 100;
        public static final short PPG_RATE = 25;
    }

    public static class SensorType implements Serializable {
        public static final String SENSOR_A = "ACC";
        public static final String SENSOR_BAR = "BAR";
        public static final String SENSOR_ECG = "ECG";
        public static final String SENSOR_G = "GYRO";
        public static final String SENSOR_GPS = "GPS";
        public static final String SENSOR_M = "MAGN";
        public static final String SENSOR_PPG = "PPG";
        public static final String SENSOR_TEMPERATURE = "TEMPERATURE";
    }

    public int getDataCount() {
        return this.d;
    }

    public long getEndTaggingTime() {
        return this.h;
    }

    public String getFileName() {
        return this.f;
    }

    public long getLabActionId() {
        return this.a;
    }

    public String getResolution() {
        return this.j;
    }

    public short getSamplingRate() {
        return this.e;
    }

    public String getSensorType() {
        return this.b;
    }

    public int getSensorTypeIntVal() {
        String str = this.b;
        str.hashCode();
        switch (str) {
            case "TEMPERATURE":
                return 7;
            case "ACC":
                return 1;
            case "BAR":
                return 8;
            case "ECG":
                return 5;
            case "GPS":
                return 6;
            case "PPG":
                return 4;
            case "GYRO":
                return 2;
            case "MAGN":
                return 3;
            default:
                return 0;
        }
    }

    public long getStartTaggingTime() {
        return this.g;
    }

    public long getTimeCount() {
        return this.i;
    }

    public int getUploadStatus() {
        return this.c;
    }

    public void setDataCount(int i) {
        this.d = i;
    }

    public void setEndTaggingTime(long j) {
        this.h = j;
    }

    public void setFileName(String str) {
        this.f = str;
    }

    public void setLabActionId(long j) {
        this.a = j;
    }

    public void setResolution(String str) {
        this.j = str;
    }

    public void setSamplingRate(short s) {
        this.e = s;
    }

    public void setSensorType(String str) {
        this.b = str;
    }

    public void setStartTaggingTime(long j) {
        this.g = j;
    }

    public void setTimeCount(long j) {
        this.i = j;
    }

    public void setUploadStatus(int i) {
        this.c = i;
    }

    public String toString() {
        return "SensorRecordsEnity{labActionId=" + this.a + ", sensorType='" + this.b + "', uploadStatus=" + this.c + ", dataCount=" + this.d + ", samplingRate=" + ((int) this.e) + ", fileName='" + this.f + "', startTaggingTime=" + this.g + ", endTaggingTime=" + this.h + ", timeCount=" + this.i + '}';
    }
}
