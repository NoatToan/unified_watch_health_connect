package com.xiaomi.hm.health.bt.profile.gdsp.dump;

/* JADX INFO: loaded from: classes18.dex */
public class HMDumpSettings {
    private int a;
    private long b;
    private long c;

    public HMDumpSettings(int select, long address, long length) {
        this.a = 0;
        this.b = 0L;
        this.c = 0L;
        this.a = select;
        this.b = address;
        this.c = length;
    }

    public long getAddress() {
        return this.b;
    }

    public byte[] getBytes() {
        long j = this.b;
        long j2 = this.c;
        return new byte[]{(byte) this.a, (byte) (j & 255), (byte) ((j >> 8) & 255), (byte) ((j >> 16) & 255), (byte) ((j >> 24) & 255), (byte) (j2 & 255), (byte) ((j2 >> 8) & 255), (byte) ((j2 >> 16) & 255), (byte) ((j2 >> 24) & 255)};
    }

    public long getLength() {
        return this.c;
    }

    public int getSelect() {
        return this.a;
    }

    public void setAddress(long address) {
        this.b = address;
    }

    public void setLength(long length) {
        this.c = length;
    }

    public void setSelect(int select) {
        this.a = select;
    }

    public String toString() {
        return "HMDumpSettings{select=" + this.a + ", address=" + this.b + ", length=" + this.c + '}';
    }
}
