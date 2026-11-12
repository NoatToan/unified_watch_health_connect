package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class y1f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Handler f39682a;

    public static Handler a() {
        if (f39682a != null) {
            return f39682a;
        }
        synchronized (y1f.class) {
            try {
                if (f39682a == null) {
                    f39682a = ikb.a(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f39682a;
    }
}
