package defpackage;

import android.os.Looper;

/* JADX INFO: loaded from: classes6.dex */
public class z5i {
    public static void a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("this funcation cannot be called in UI Thread");
        }
    }

    public static <T> T b(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void c(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
