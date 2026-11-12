package com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.rc4;

/* JADX INFO: loaded from: classes10.dex */
public class Rc4Cipher extends StreamCipher {
    private byte[] state;
    private int x;
    private int y;

    public Rc4Cipher(String str) {
        super(256);
        this.state = new byte[256];
        setKey(str);
    }

    private int nextState() {
        int i = (this.x + 1) & 255;
        this.x = i;
        int i2 = this.y;
        byte[] bArr = this.state;
        int i3 = (i2 + bArr[i]) & 255;
        this.y = i3;
        swap(bArr, i, i3);
        byte[] bArr2 = this.state;
        return (bArr2[this.x] + bArr2[this.y]) & 255;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.rc4.StreamCipher
    public byte decrypt(byte b2) {
        return (byte) (b2 ^ this.state[nextState()]);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.rc4.StreamCipher
    public byte encrypt(byte b2) {
        return (byte) (b2 ^ this.state[nextState()]);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.rc4.Cipher
    public void setKey(byte[] bArr) {
        this.x = 0;
        this.y = 0;
        for (int i = 0; i < 256; i++) {
            this.state[i] = (byte) i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            byte[] bArr2 = this.state;
            i2 = (i2 + bArr2[i3] + bArr[i3 % bArr.length]) & 255;
            swap(bArr2, i3, i2);
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.rc4.StreamCipher
    public void decrypt(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            bArr2[i2 + i4] = (byte) (bArr[i + i4] ^ this.state[nextState()]);
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.rc4.StreamCipher
    public void encrypt(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            bArr2[i2 + i4] = (byte) (bArr[i + i4] ^ this.state[nextState()]);
        }
    }

    public Rc4Cipher(byte[] bArr) {
        super(256);
        this.state = new byte[256];
        setKey(bArr);
    }
}
