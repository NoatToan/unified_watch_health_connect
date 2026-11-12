package c1;

import com.google.android.exoplayer2.C;
import k7.h;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private c() {
    }

    public static long a(int i14, long j8) {
        long j14 = i14;
        h.b(j14 > 0, "sampleRate must be greater than 0.");
        return (C.NANOS_PER_SECOND * j8) / j14;
    }

    public static long b(int i14, long j8) {
        long j14 = i14;
        h.b(j14 > 0, "bytesPerFrame must be greater than 0.");
        return j8 / j14;
    }
}
