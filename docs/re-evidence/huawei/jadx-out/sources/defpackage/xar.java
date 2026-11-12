package defpackage;

import androidx.media3.datasource.cache.CacheDataSink;
import androidx.work.Data;
import java.util.zip.Checksum;

/* JADX INFO: loaded from: classes20.dex */
public class xar implements Checksum {
    private static final int[] d = {0, 52225, 55297, 5120, 61441, 15360, Data.MAX_DATA_BYTES, 58369, 40961, 27648, 30720, 46081, CacheDataSink.DEFAULT_BUFFER_SIZE, 39937, 34817, 17408};
    private int e;

    public xar() {
        reset();
    }

    @Override // java.util.zip.Checksum
    public long getValue() {
        return this.e;
    }

    @Override // java.util.zip.Checksum
    public void reset() {
        this.e = 0;
    }

    @Override // java.util.zip.Checksum
    public void update(int i) {
        int[] iArr = d;
        int i2 = this.e;
        int i3 = (((i2 >> 4) & 4095) ^ iArr[i2 & 15]) ^ iArr[i & 15];
        this.e = iArr[(i >> 4) & 15] ^ (((i3 >> 4) & 4095) ^ iArr[i3 & 15]);
    }

    @Override // java.util.zip.Checksum
    public void update(byte[] bArr, int i, int i2) {
        while (i < i2) {
            update(bArr[i]);
            i++;
        }
    }
}
