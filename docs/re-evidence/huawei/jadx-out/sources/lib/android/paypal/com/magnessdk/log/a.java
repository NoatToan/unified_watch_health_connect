package lib.android.paypal.com.magnessdk.log;

import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes46.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f40295b = Boolean.valueOf(System.getProperty("magnes.debug.mode", Boolean.FALSE.toString())).booleanValue();

    /* JADX INFO: renamed from: lib.android.paypal.com.magnessdk.log.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes3.dex */
    @Retention(RetentionPolicy.SOURCE)
    @interface InterfaceC0340a {
    }

    public static void e(Class<?> cls, int i, Throwable th) {
        boolean z = f40295b;
        if (z) {
            if (i == 0) {
                Log.d(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + th.getMessage(), th);
                return;
            }
            if (i == 1) {
                Log.i(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + th.getMessage(), th);
                return;
            }
            if (i == 2) {
                Log.w(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + th.getMessage(), th);
                return;
            }
            if (i == 3 && z) {
                Log.e(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + th.getMessage(), th);
            }
        }
    }

    public static void e(Class<?> cls, int i, String str) {
        boolean z = f40295b;
        if (z) {
            if (i == 0) {
                Log.d(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + str);
                return;
            }
            if (i == 1) {
                Log.i(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + str);
                return;
            }
            if (i == 2) {
                Log.w(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + str);
                return;
            }
            if (i == 3 && z) {
                Log.e(cls.getSimpleName(), "****MAGNES DEBUGGING MESSAGE**** : " + str);
            }
        }
    }
}
