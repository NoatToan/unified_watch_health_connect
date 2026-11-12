package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes11.dex */
public class o6s {
    public static void a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new RuntimeException("can't do this on ui thread");
        }
    }
}
