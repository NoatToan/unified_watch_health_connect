package defpackage;

import android.content.Context;
import android.os.Looper;
import com.alipay.sdk.m.c.b;

/* JADX INFO: loaded from: classes4.dex */
public class km {
    public static boolean d = false;
    public static b e;

    public static void b(Context context) {
        if (e != null || d) {
            return;
        }
        synchronized (km.class) {
            if (e == null && !d) {
                e = kr.e(context);
                d = true;
            }
        }
    }

    public static String d(Context context) {
        synchronized (km.class) {
            try {
                if (context == null) {
                    throw new RuntimeException("Context is null");
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    throw new IllegalStateException("Cannot be called from the main thread");
                }
                b(context);
                b bVar = e;
                if (bVar != null) {
                    try {
                        return bVar.a(context);
                    } catch (Exception unused) {
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
