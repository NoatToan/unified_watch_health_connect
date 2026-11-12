package cn.hutool.core.io.checksum.crc16;

/* JADX INFO: loaded from: classes.dex */
public class CRC16CCITTFalse extends CRC16Checksum {
    private static final int WC_POLY = 4129;
    private static final long serialVersionUID = 1;

    @Override // cn.hutool.core.io.checksum.crc16.CRC16Checksum, java.util.zip.Checksum
    public void reset() {
        this.wCRCin = 65535;
    }

    @Override // cn.hutool.core.io.checksum.crc16.CRC16Checksum, java.util.zip.Checksum
    public void update(byte[] bArr, int i, int i2) {
        super.update(bArr, i, i2);
        this.wCRCin &= 65535;
    }

    @Override // java.util.zip.Checksum
    public void update(int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            boolean z = ((i >> (7 - i2)) & 1) == 1;
            int i3 = this.wCRCin;
            boolean z2 = ((i3 >> 15) & 1) == 1;
            int i4 = i3 << 1;
            this.wCRCin = i4;
            if (z ^ z2) {
                this.wCRCin = i4 ^ WC_POLY;
            }
        }
    }
}
