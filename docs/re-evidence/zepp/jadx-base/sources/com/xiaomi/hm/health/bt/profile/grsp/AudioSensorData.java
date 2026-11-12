package com.xiaomi.hm.health.bt.profile.grsp;

/* JADX INFO: loaded from: classes18.dex */
public class AudioSensorData extends SensorData {
    private byte[] a;

    public AudioSensorData(byte[] data) {
        this.a = null;
        this.a = data;
    }

    public byte[] getPacket() {
        return this.a;
    }

    @Override // com.xiaomi.hm.health.bt.profile.grsp.SensorData
    public SensorType getType() {
        return SensorType.ADATA;
    }

    public void setPacket(byte[] packet) {
        this.a = packet;
    }
}
