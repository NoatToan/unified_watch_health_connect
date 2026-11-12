package cn.hutool.core.io.checksum.crc16;

/* JADX INFO: loaded from: classes.dex */
public class CRC16CCITT extends CRC16Checksum {
    private static final int WC_POLY = 33800;
    private static final long serialVersionUID = 1;

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
