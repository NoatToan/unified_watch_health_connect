package com.xiaomi.hm.health.bt.profile.grsp;

/* JADX INFO: loaded from: classes18.dex */
public enum SensorType {
    UNKNOWN(0),
    GSENSOR(1),
    PPG(2),
    ECG(4),
    NMEA(8),
    GYRO(16),
    ADATA(32),
    GEO(64),
    TIME(128),
    SPO2(256),
    HR(512),
    PRESSURE(1024),
    PP(16384),
    BAROMETER(32768),
    BODY_TEMPERATURE(65536),
    TOUCH_DATA(128);

    private int mValue;

    SensorType(int value) {
        this.mValue = -1;
        this.mValue = value;
    }

    public static SensorType from(int value) {
        for (SensorType sensorType : values()) {
            if (sensorType.getValue() == value) {
                return sensorType;
            }
        }
        return UNKNOWN;
    }

    public static SensorType fromBit(int bit) {
        for (SensorType sensorType : values()) {
            if ((sensorType.getValue() >> bit) == 1) {
                return sensorType;
            }
        }
        return UNKNOWN;
    }

    public int getValue() {
        return this.mValue;
    }
}
