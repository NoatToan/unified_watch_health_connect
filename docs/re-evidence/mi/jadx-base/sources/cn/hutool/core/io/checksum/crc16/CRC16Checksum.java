package cn.hutool.core.io.checksum.crc16;

import defpackage.m7c;
import defpackage.tt3;
import java.io.Serializable;
import java.util.zip.Checksum;

/* JADX INFO: loaded from: classes.dex */
public abstract class CRC16Checksum implements Checksum, Serializable {
    private static final long serialVersionUID = 1;
    protected int wCRCin;

    public CRC16Checksum() {
        reset();
    }

    public String getHexValue() {
        return getHexValue(false);
    }

    @Override // java.util.zip.Checksum
    public long getValue() {
        return this.wCRCin;
    }

    @Override // java.util.zip.Checksum
    public void reset() {
        this.wCRCin = 0;
    }

    @Override // java.util.zip.Checksum
    public void update(byte[] bArr) {
        update(bArr, 0, bArr.length);
    }

    public String getHexValue(boolean z) {
        String strI = m7c.i(getValue());
        return z ? tt3.N(strI, 4, '0') : strI;
    }

    @Override // java.util.zip.Checksum
    public void update(byte[] bArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            update(bArr[i3]);
        }
    }
}
