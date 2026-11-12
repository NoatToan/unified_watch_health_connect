package cn.hutool.core.io.checksum.crc16;

/* JADX INFO: loaded from: classes.dex */
public class CRC16Ansi extends CRC16Checksum {
    private static final int WC_POLY = 40961;
    private static final long serialVersionUID = 1;

    @Override // cn.hutool.core.io.checksum.crc16.CRC16Checksum, java.util.zip.Checksum
    public void reset() {
        this.wCRCin = 65535;
    }

    @Override // java.util.zip.Checksum
    public void update(int i) {
        this.wCRCin = i ^ (this.wCRCin >> 8);
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = this.wCRCin;
            int i4 = i3 & 1;
            int i5 = i3 >> 1;
            this.wCRCin = i5;
            if (i4 == 1) {
                this.wCRCin = i5 ^ WC_POLY;
            }
        }
    }
}
