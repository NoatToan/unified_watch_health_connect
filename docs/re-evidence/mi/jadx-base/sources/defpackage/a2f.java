package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class a2f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile ScheduledExecutorService f549a;

    public static ScheduledExecutorService a() {
        if (f549a != null) {
            return f549a;
        }
        synchronized (a2f.class) {
            try {
                if (f549a == null) {
                    f549a = new qkb(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f549a;
    }
}
