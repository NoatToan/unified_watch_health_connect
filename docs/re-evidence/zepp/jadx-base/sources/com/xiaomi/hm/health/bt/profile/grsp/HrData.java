package com.xiaomi.hm.health.bt.profile.grsp;

/* JADX INFO: loaded from: classes18.dex */
public class HrData extends SensorData {
    private long a;
    private int b;

    public HrData(long timestamp, int hr) {
        this.a = -1L;
        this.b = -1;
        this.a = timestamp;
        this.b = hr;
    }

    public int getHr() {
        return this.b;
    }

    public long getTimestamp() {
        return this.a;
    }

    @Override // com.xiaomi.hm.health.bt.profile.grsp.SensorData
    public SensorType getType() {
        return SensorType.HR;
    }

    public void setHr(int hr) {
        this.b = hr;
    }

    public void setTimestamp(long timestamp) {
        this.a = timestamp;
    }

    public String toString() {
        return "HrData{timestamp=" + this.a + ", hr=" + this.b + '}';
    }
}
