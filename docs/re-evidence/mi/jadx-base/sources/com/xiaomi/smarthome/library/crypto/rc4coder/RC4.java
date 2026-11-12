package com.xiaomi.smarthome.library.crypto.rc4coder;

/* JADX INFO: loaded from: classes2.dex */
final class RC4 {
    private int _i;
    private int _j;
    private final byte[] _s = new byte[256];

    public RC4(byte[] bArr) {
        int length = bArr.length;
        for (int i = 0; i < 256; i++) {
            this._s[i] = (byte) i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            int i4 = i2 + bArr[i3 % length];
            byte[] bArr2 = this._s;
            byte b2 = bArr2[i3];
            i2 = (i4 + b2) & 255;
            bArr2[i3] = bArr2[i2];
            bArr2[i2] = b2;
        }
        this._i = 0;
        this._j = 0;
    }

    public void encrypt(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) (bArr[i] ^ output());
        }
    }

    public byte output() {
        int i = (this._i + 1) & 255;
        this._i = i;
        int i2 = this._j;
        byte[] bArr = this._s;
        byte b2 = bArr[i];
        int i3 = (i2 + b2) & 255;
        this._j = i3;
        bArr[i] = bArr[i3];
        bArr[i3] = b2;
        return bArr[(bArr[i] + b2) & 255];
    }

    public void encrypt(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            bArr[i] = (byte) (bArr[i] ^ output());
            i++;
        }
    }
}
