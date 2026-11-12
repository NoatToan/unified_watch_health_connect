package com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.rc4;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Cipher extends CryptoUtils {
    public int keySize;

    public Cipher(int i) {
        this.keySize = i;
    }

    public int keySize() {
        return this.keySize;
    }

    public byte[] makeKey(String str) {
        int i = this.keySize;
        byte[] bArr = i == 0 ? new byte[str.length()] : new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            bArr[i3] = 0;
        }
        int length = 0;
        while (i2 < str.length()) {
            bArr[length] = (byte) (bArr[length] ^ ((byte) str.charAt(i2)));
            i2++;
            length = (length + 1) % bArr.length;
        }
        return bArr;
    }

    public void setKey(String str) {
        setKey(makeKey(str));
    }

    public abstract void setKey(byte[] bArr);

    public void swap(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i];
        bArr[i] = bArr[i2];
        bArr[i2] = b2;
    }
}
