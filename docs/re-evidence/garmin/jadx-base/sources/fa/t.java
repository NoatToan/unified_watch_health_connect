package fa;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public class t implements c {
    @Override // fa.c
    public final u createHandler(Looper looper, Handler.Callback callback) {
        return new u(new Handler(looper, callback));
    }

    @Override // fa.c
    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // fa.c
    public final long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // fa.c
    public final long nanoTime() {
        return System.nanoTime();
    }

    @Override // fa.c
    public final long uptimeMillis() {
        return SystemClock.uptimeMillis();
    }
}
