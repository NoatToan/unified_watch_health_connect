package com.xiaomi.hm.health.bt.profile.grsp;

/* JADX INFO: loaded from: classes18.dex */
public class PPGSensorData extends SensorData {
    private long a = -1;
    private long b;

    public PPGSensorData(long ppg) {
        this.b = -1L;
        this.b = ppg;
    }

    public long getPpg() {
        return this.b;
    }

    public long getTimestamp() {
        return this.a;
    }

    @Override // com.xiaomi.hm.health.bt.profile.grsp.SensorData
    public SensorType getType() {
        return SensorType.PPG;
    }

    public void setTimestamp(long timestamp) {
        this.a = timestamp;
    }

    public String toString() {
        return "[" + this.a + ":" + this.b + "]";
    }
}
