package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import fb1.c;
import j20.x;
import org.apache.commons.lang3.e;
import sn.a;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
public final class Preconditions {
    private Preconditions() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    public static void checkArgument(boolean z14) {
        if (z14) {
            return;
        }
        h.w();
    }

    @KeepForSdk
    public static double checkArgumentInRange(double d14, double d15, double d16, String str) {
        if (d14 < d15) {
            h.s(zza("%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d15), Double.valueOf(d16)));
            return 0.0d;
        }
        if (d14 <= d16) {
            return d14;
        }
        h.s(zza("%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d15), Double.valueOf(d16)));
        return 0.0d;
    }

    @KeepForSdk
    public static long checkArgumentNonnegative(long j8) {
        if (j8 >= 0) {
            return j8;
        }
        h.s("Given value is negative");
        return 0L;
    }

    @KeepForSdk
    public static void checkHandlerThread(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb3 = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            a.t(sb3, "Must be called on ", name2, " thread, but got ", name);
            c.y(sb3, ".");
        }
    }

    @KeepForSdk
    public static void checkMainThread(String str) {
        if (com.google.android.gms.common.util.zze.zza()) {
            return;
        }
        h.z(str);
    }

    @KeepForSdk
    public static String checkNotEmpty(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        h.s("Given String is empty or null");
        return null;
    }

    @KeepForSdk
    public static void checkNotGoogleApiHandlerThread(String str) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null || !java.util.Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            return;
        }
        h.z(str);
    }

    @KeepForSdk
    public static void checkNotMainThread(String str) {
        if (com.google.android.gms.common.util.zze.zza()) {
            h.z(str);
        }
    }

    @KeepForSdk
    public static <T> T checkNotNull(T t7, Object obj) {
        if (t7 != null) {
            return t7;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @KeepForSdk
    public static long checkNotZero(long j8) {
        if (j8 != 0) {
            return j8;
        }
        h.s("Given Long is zero");
        return 0L;
    }

    @KeepForSdk
    public static void checkState(boolean z14, Object obj) {
        if (!z14) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static String zza(String str, Object... objArr) {
        int iIndexOf;
        StringBuilder sb3 = new StringBuilder(str.length() + 48);
        int i14 = 0;
        int i15 = 0;
        while (i14 < 3 && (iIndexOf = str.indexOf("%s", i15)) != -1) {
            sb3.append(str.substring(i15, iIndexOf));
            sb3.append(objArr[i14]);
            i15 = iIndexOf + 2;
            i14++;
        }
        sb3.append(str.substring(i15));
        if (i14 < 3) {
            sb3.append(" [");
            sb3.append(objArr[i14]);
            for (int i16 = i14 + 1; i16 < 3; i16++) {
                sb3.append(", ");
                sb3.append(objArr[i16]);
            }
            sb3.append("]");
        }
        return sb3.toString();
    }

    @KeepForSdk
    public static void checkArgument(boolean z14, Object obj) {
        if (z14) {
            return;
        }
        com.google.common.base.a.a(obj);
    }

    @KeepForSdk
    public static void checkArgument(boolean z14, String str, Object... objArr) {
        if (z14) {
            return;
        }
        e.n(str, objArr);
    }

    @KeepForSdk
    public static void checkMainThread() {
        checkMainThread("Must be called on the main application thread");
    }

    @KeepForSdk
    public static void checkNotMainThread() {
        checkNotMainThread("Must not be called on the main application thread");
    }

    @KeepForSdk
    public static <T> T checkNotNull(T t7) {
        if (t7 != null) {
            return t7;
        }
        x.l("null reference");
        return null;
    }

    @KeepForSdk
    public static void checkState(boolean z14) {
        if (z14) {
            return;
        }
        x.h();
    }

    @KeepForSdk
    public static String checkNotEmpty(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        com.google.common.base.a.a(obj);
        return null;
    }

    @KeepForSdk
    public static void checkState(boolean z14, String str, Object... objArr) {
        if (!z14) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    @KeepForSdk
    public static int checkArgumentNonnegative(int i14, String str) {
        if (i14 >= 0) {
            return i14;
        }
        h.s(str);
        return 0;
    }

    @KeepForSdk
    public static int checkNotZero(int i14, Object obj) {
        if (i14 != 0) {
            return i14;
        }
        com.google.common.base.a.a(obj);
        return 0;
    }

    @KeepForSdk
    public static int checkArgumentNonnegative(int i14) {
        if (i14 >= 0) {
            return i14;
        }
        h.s("Given value is negative");
        return 0;
    }

    @KeepForSdk
    public static int checkNotZero(int i14) {
        if (i14 != 0) {
            return i14;
        }
        h.s("Given Integer is zero");
        return 0;
    }

    @KeepForSdk
    public static long checkArgumentNonnegative(long j8, String str) {
        if (j8 >= 0) {
            return j8;
        }
        h.s(str);
        return 0L;
    }

    @KeepForSdk
    public static long checkNotZero(long j8, Object obj) {
        if (j8 != 0) {
            return j8;
        }
        com.google.common.base.a.a(obj);
        return 0L;
    }

    @KeepForSdk
    public static void checkNotGoogleApiHandlerThread() {
        checkNotGoogleApiHandlerThread("Must not be called on GoogleApiHandler thread.");
    }

    @KeepForSdk
    public static float checkArgumentInRange(float f14, float f15, float f16, String str) {
        if (f14 < f15) {
            h.s(zza("%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f15), Float.valueOf(f16)));
            return 0.0f;
        }
        if (f14 <= f16) {
            return f14;
        }
        h.s(zza("%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f15), Float.valueOf(f16)));
        return 0.0f;
    }

    @KeepForSdk
    public static int checkArgumentInRange(int i14, int i15, int i16, String str) {
        if (i14 < i15) {
            h.s(zza("%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i15), Integer.valueOf(i16)));
            return 0;
        }
        if (i14 <= i16) {
            return i14;
        }
        h.s(zza("%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i15), Integer.valueOf(i16)));
        return 0;
    }

    @KeepForSdk
    public static long checkArgumentInRange(long j8, long j14, long j15, String str) {
        if (j8 < j14) {
            h.s(zza("%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j14), Long.valueOf(j15)));
            return 0L;
        }
        if (j8 <= j15) {
            return j8;
        }
        h.s(zza("%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j14), Long.valueOf(j15)));
        return 0L;
    }

    @KeepForSdk
    public static void checkHandlerThread(Handler handler, String str) {
        if (Looper.myLooper() == handler.getLooper()) {
            return;
        }
        h.z(str);
    }
}
