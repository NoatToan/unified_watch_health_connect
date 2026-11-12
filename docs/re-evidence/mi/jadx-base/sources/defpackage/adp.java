package defpackage;

import android.os.Looper;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class adp {
    public static void a() {
        g6i.j(b(), "Not in application's main thread");
    }

    public static boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
