package com.xiaomi.hm.health.device.firmware;

/* JADX INFO: loaded from: classes20.dex */
public class HMFwHeader {
    public static final int HEAD_LEN = 32;
    public static final int SIGNATURE_LEN = 64;
    private static final long j = 1464225096;
    private static final long k = 1313294675;
    private long a = 0;
    private long b = 0;
    private int c = 0;
    private int d = 0;
    private int e = -1;
    private int f = -1;
    private int g = -1;
    private int h = -1;
    private int i = -1;

    public static HMFwHeader parse(byte[] bArr) {
        if (bArr == null || bArr.length != 32) {
            return null;
        }
        HMFwHeader hMFwHeader = new HMFwHeader();
        hMFwHeader.a = (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24);
        hMFwHeader.b = ((bArr[5] & 255) << 8) | (bArr[4] & 255) | ((bArr[6] & 255) << 16) | ((bArr[7] & 255) << 24);
        hMFwHeader.c = ((bArr[9] & 255) << 8) | (bArr[8] & 255);
        hMFwHeader.d = ((bArr[11] & 255) << 8) | (bArr[10] & 255) | ((bArr[12] & 255) << 16) | ((bArr[13] & 255) << 24);
        hMFwHeader.e = ((bArr[15] & 255) << 8) | (bArr[14] & 255) | ((bArr[16] & 255) << 16) | ((bArr[17] & 255) << 24);
        hMFwHeader.f = ((bArr[19] & 255) << 8) | (bArr[18] & 255) | ((bArr[20] & 255) << 16) | ((bArr[21] & 255) << 24);
        hMFwHeader.g = ((bArr[23] & 255) << 8) | (bArr[22] & 255);
        hMFwHeader.h = ((bArr[25] & 255) << 8) | (bArr[24] & 255);
        hMFwHeader.i = ((bArr[27] & 255) << 8) | (bArr[26] & 255);
        return hMFwHeader;
    }

    public int getFwOrder() {
        return this.i;
    }

    public int getFwSize() {
        return this.d;
    }

    public int getFwType() {
        return this.e;
    }

    public int getFwVersion() {
        return this.f;
    }

    public int getHeaderSize() {
        return this.c;
    }

    public long getMagicH() {
        return this.b;
    }

    public long getMagicL() {
        return this.a;
    }

    public int getPnpId() {
        return this.g;
    }

    public int getPnpVersion() {
        return this.h;
    }

    public boolean isValid() {
        return this.a == j && this.b == k;
    }

    public void setFwOrder(int i) {
        this.i = i;
    }

    public void setFwSize(int i) {
        this.d = i;
    }

    public void setFwType(int i) {
        this.e = i;
    }

    public void setFwVersion(int i) {
        this.f = i;
    }

    public void setHeaderSize(int i) {
        this.c = i;
    }

    public void setMagicH(long j2) {
        this.b = j2;
    }

    public void setMagicL(long j2) {
        this.a = j2;
    }

    public void setPnpId(int i) {
        this.g = i;
    }

    public void setPnpVersion(int i) {
        this.h = i;
    }

    public String toString() {
        return "HMFwHeader{magicL=" + this.a + ", magicH=" + this.b + ", headerSize=" + this.c + ", fwSize=" + this.d + ", fwType=" + this.e + ", fwVersion=" + this.f + ", pnpId=" + this.g + ", pnpVersion=" + this.h + ", fwOrder=" + this.i + '}';
    }
}
