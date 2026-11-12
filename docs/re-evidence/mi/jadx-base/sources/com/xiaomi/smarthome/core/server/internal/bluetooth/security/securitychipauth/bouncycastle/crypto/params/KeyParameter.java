package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.crypto.params;

import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes10.dex */
public class KeyParameter implements CipherParameters {
    private byte[] key;

    public KeyParameter(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public byte[] getKey() {
        return this.key;
    }

    public KeyParameter(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.key = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }
}
