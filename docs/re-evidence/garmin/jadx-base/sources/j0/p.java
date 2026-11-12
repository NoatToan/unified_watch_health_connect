package j0;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Handler f95958a;

    private p() {
    }

    public static Handler a() {
        if (f95958a != null) {
            return f95958a;
        }
        synchronized (p.class) {
            try {
                if (f95958a == null) {
                    f95958a = Handler.createAsync(Looper.getMainLooper());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return f95958a;
    }
}
