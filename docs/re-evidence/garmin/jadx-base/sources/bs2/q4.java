package bs2;

import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.google.android.gms.gcm.Task;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes11.dex */
public class q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f20424a = {0, 52225, 55297, 5120, 61441, 15360, Task.EXTRAS_LIMIT_BYTES, 58369, 40961, 27648, 30720, 46081, CacheDataSink.DEFAULT_BUFFER_SIZE, 39937, 34817, 17408};

    public static final int a(byte b14, int i14) {
        int[] iArr = f20424a;
        int i15 = (((i14 >> 4) & 4095) ^ iArr[i14 & 15]) ^ iArr[b14 & Ascii.SI];
        int i16 = iArr[i15 & 15];
        return iArr[(b14 >> 4) & 15] ^ (((i15 >> 4) & 4095) ^ i16);
    }
}
