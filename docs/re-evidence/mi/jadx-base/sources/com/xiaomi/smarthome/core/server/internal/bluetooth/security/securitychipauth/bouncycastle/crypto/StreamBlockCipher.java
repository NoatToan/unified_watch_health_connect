package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.crypto;

/* JADX INFO: loaded from: classes10.dex */
public abstract class StreamBlockCipher implements BlockCipher, StreamCipher {
    private final BlockCipher cipher;

    public StreamBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
    }

    public abstract byte calculateByte(byte b2);

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        if (i3 + i2 > bArr2.length) {
            throw new DataLengthException("output buffer too short");
        }
        int i4 = i + i2;
        if (i4 > bArr.length) {
            throw new DataLengthException("input buffer too small");
        }
        while (i < i4) {
            bArr2[i3] = calculateByte(bArr[i]);
            i3++;
            i++;
        }
        return i2;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.bouncycastle.crypto.StreamCipher
    public final byte returnByte(byte b2) {
        return calculateByte(b2);
    }
}
