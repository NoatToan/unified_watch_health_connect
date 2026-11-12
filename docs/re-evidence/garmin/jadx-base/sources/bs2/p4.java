package bs2;

import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.google.android.gms.gcm.Task;
import java.util.zip.Checksum;

/* JADX INFO: loaded from: classes11.dex */
public class p4 implements Checksum {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f20396b = {0, 52225, 55297, 5120, 61441, 15360, Task.EXTRAS_LIMIT_BYTES, 58369, 40961, 27648, 30720, 46081, CacheDataSink.DEFAULT_BUFFER_SIZE, 39937, 34817, 17408};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20397a = 0;

    @Override // java.util.zip.Checksum
    public final long getValue() {
        return this.f20397a;
    }

    @Override // java.util.zip.Checksum
    public final void reset() {
        this.f20397a = 0;
    }

    @Override // java.util.zip.Checksum
    public final void update(int i14) {
        int i15 = this.f20397a;
        int[] iArr = f20396b;
        int i16 = iArr[i15 & 15];
        int i17 = (i15 >> 4) & 4095;
        this.f20397a = i17;
        int i18 = (i17 ^ i16) ^ iArr[i14 & 15];
        this.f20397a = i18;
        int i19 = iArr[i18 & 15];
        int i24 = (i18 >> 4) & 4095;
        this.f20397a = i24;
        this.f20397a = iArr[(i14 >> 4) & 15] ^ (i24 ^ i19);
    }

    @Override // java.util.zip.Checksum
    public final void update(byte[] bArr, int i14, int i15) {
        while (i14 < i15) {
            update(bArr[i14]);
            i14++;
        }
    }
}
