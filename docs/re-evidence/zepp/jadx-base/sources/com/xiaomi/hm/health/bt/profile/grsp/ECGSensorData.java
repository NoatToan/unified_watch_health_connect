package com.xiaomi.hm.health.bt.profile.grsp;

/* JADX INFO: loaded from: classes18.dex */
public class ECGSensorData extends SensorData {
    private long a = -1;
    private long b;

    public ECGSensorData(long ecg) {
        this.b = -1L;
        this.b = ecg;
    }

    public long getEcg() {
        return this.b;
    }

    public long getTimestamp() {
        return this.a;
    }

    @Override // com.xiaomi.hm.health.bt.profile.grsp.SensorData
    public SensorType getType() {
        return SensorType.ECG;
    }

    public void setTimestamp(long timestamp) {
        this.a = timestamp;
    }

    public String toString() {
        return "[" + this.b + "]";
    }
}
