package wa;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    private k() {
    }

    public static androidx.media3.exoplayer.upstream.b.a a(g gVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = gVar.length();
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            if (gVar.a(i15, jElapsedRealtime)) {
                i14++;
            }
        }
        return new androidx.media3.exoplayer.upstream.b.a(1, 0, length, i14);
    }
}
