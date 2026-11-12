package com.xiaomi.hm.health.bt.profile.grsp;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes18.dex */
public class PressureData extends SensorData {
    private long a;
    private int b;
    private int c;
    private int d;

    public PressureData(int touch) {
        this.a = -1L;
        this.c = -1;
        this.d = -1;
        this.b = touch;
    }

    public int getPressure() {
        return this.b;
    }

    public int getPressureAdj() {
        return this.c;
    }

    public int getPressureAlg() {
        return this.d;
    }

    public long getTimestamp() {
        return this.a;
    }

    @Override // com.xiaomi.hm.health.bt.profile.grsp.SensorData
    public SensorType getType() {
        return SensorType.PRESSURE;
    }

    public void setPressure(int pressure) {
        this.b = pressure;
    }

    public void setPressureAdj(int pressureAdj) {
        this.c = pressureAdj;
    }

    public void setPressureAlg(int pressureAlg) {
        this.d = pressureAlg;
    }

    public void setTimestamp(long timestamp) {
        this.a = timestamp;
    }

    @NonNull
    public String toString() {
        return "PressureData{timestamp=" + this.a + ", pressure=" + this.b + ", pressureAdj=" + this.c + ", pressureAlg=" + this.d + '}';
    }

    public PressureData(long timestamp, int touch) {
        this.a = -1L;
        this.c = -1;
        this.d = -1;
        this.a = timestamp;
        this.b = touch;
    }

    public PressureData(int pressure, int pressureAdj, int pressureAlg) {
        this.a = -1L;
        this.c = -1;
        this.d = -1;
        this.b = pressure;
        this.c = pressureAdj;
        this.d = pressureAlg;
    }

    public PressureData(long timestamp, int pressure, int pressureAdj, int pressureAlg) {
        this.a = -1L;
        this.c = -1;
        this.d = -1;
        this.a = timestamp;
        this.b = pressure;
        this.c = pressureAdj;
        this.d = pressureAlg;
    }
}
