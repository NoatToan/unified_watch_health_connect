package com.xiaomi.hm.health.bt.profile.grsp;

/* JADX INFO: loaded from: classes18.dex */
public class SPO2Data extends SensorData {
    private int a;
    private int b;
    private int c;
    private long d = -1;

    public SPO2Data(int red, int infrared, int bg) {
        this.a = red;
        this.b = infrared;
        this.c = bg;
    }

    public int getBgLight() {
        return this.c;
    }

    public int getInfraredLight() {
        return this.b;
    }

    public int getRedLight() {
        return this.a;
    }

    public long getTimestamp() {
        return this.d;
    }

    @Override // com.xiaomi.hm.health.bt.profile.grsp.SensorData
    public SensorType getType() {
        return SensorType.SPO2;
    }

    public void setBgLight(int bgLight) {
        this.c = bgLight;
    }

    public void setInfraredLight(int infraredLight) {
        this.b = infraredLight;
    }

    public void setRedLight(int redLight) {
        this.a = redLight;
    }

    public void setTimestamp(long timestamp) {
        this.d = timestamp;
    }

    public String toString() {
        return "SPO2Data{redLight=" + this.a + ", infraredLight=" + this.b + ", bgLight=" + this.c + '}';
    }
}
