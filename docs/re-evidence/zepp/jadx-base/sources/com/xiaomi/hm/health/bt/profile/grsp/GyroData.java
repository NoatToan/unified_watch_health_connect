package com.xiaomi.hm.health.bt.profile.grsp;

/* JADX INFO: loaded from: classes18.dex */
public class GyroData extends SensorData {
    private long a = -1;
    private int b;
    private int c;
    private int d;

    public GyroData(int x, int y, int z) {
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.b = x;
        this.c = y;
        this.d = z;
    }

    public long getTimestamp() {
        return this.a;
    }

    @Override // com.xiaomi.hm.health.bt.profile.grsp.SensorData
    public SensorType getType() {
        return SensorType.GYRO;
    }

    public int getX() {
        return this.b;
    }

    public int getY() {
        return this.c;
    }

    public int getZ() {
        return this.d;
    }

    public void setTimestamp(long timestamp) {
        this.a = timestamp;
    }

    public void setX(int x) {
        this.b = x;
    }

    public void setY(int y) {
        this.c = y;
    }

    public void setZ(int z) {
        this.d = z;
    }

    public String toString() {
        return "GyroData{timestamp=" + this.a + ", x=" + this.b + ", y=" + this.c + ", z=" + this.d + '}';
    }
}
