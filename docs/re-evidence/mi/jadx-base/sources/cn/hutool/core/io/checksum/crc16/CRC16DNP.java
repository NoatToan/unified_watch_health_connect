package cn.hutool.core.io.checksum.crc16;

/* JADX INFO: loaded from: classes.dex */
public class CRC16DNP extends CRC16Checksum {
    private static final int WC_POLY = 42684;
    private static final long serialVersionUID = 1;

    @Override // cn.hutool.core.io.checksum.crc16.CRC16Checksum, java.util.zip.Checksum
    public void update(byte[] bArr, int i, int i2) {
        super.update(bArr, i, i2);
        this.wCRCin ^= 65535;
    }

    @Override // java.util.zip.Checksum
    public void update(int i) {
        this.wCRCin = (i & 255) ^ this.wCRCin;
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = this.wCRCin;
            if ((i3 & 1) != 0) {
                this.wCRCin = (i3 >> 1) ^ WC_POLY;
            } else {
                this.wCRCin = i3 >> 1;
            }
        }
    }
}
