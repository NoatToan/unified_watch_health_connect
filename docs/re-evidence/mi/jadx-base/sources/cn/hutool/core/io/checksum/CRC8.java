package cn.hutool.core.io.checksum;

import java.io.Serializable;
import java.util.zip.Checksum;

/* JADX INFO: loaded from: classes.dex */
public class CRC8 implements Checksum, Serializable {
    private static final long serialVersionUID = 1;
    private final short[] crcTable = new short[256];
    private final short init;
    private short value;

    public CRC8(int i, short s) {
        this.init = s;
        this.value = s;
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = i2;
            for (int i4 = 0; i4 < 8; i4++) {
                i3 = (i3 & 1) != 0 ? (i3 >>> 1) ^ i : i3 >>> 1;
            }
            this.crcTable[i2] = (short) i3;
        }
    }

    @Override // java.util.zip.Checksum
    public long getValue() {
        return this.value & 255;
    }

    @Override // java.util.zip.Checksum
    public void reset() {
        this.value = this.init;
    }

    @Override // java.util.zip.Checksum
    public void update(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            byte b2 = bArr[i + i3];
            short s = this.value;
            this.value = (short) (this.crcTable[(b2 ^ s) & 255] ^ (s << 8));
        }
    }

    @Override // java.util.zip.Checksum
    public void update(byte[] bArr) {
        update(bArr, 0, bArr.length);
    }

    @Override // java.util.zip.Checksum
    public void update(int i) {
        update(new byte[]{(byte) i}, 0, 1);
    }
}
