package defpackage;

import android.os.SystemClock;
import androidx.media3.common.C;

/* JADX INFO: loaded from: classes21.dex */
public class oo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f44357c = -1;

    public static boolean b() {
        synchronized (oo.class) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - f44357c < C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
                return true;
            }
            f44357c = jElapsedRealtime;
            return false;
        }
    }
}
