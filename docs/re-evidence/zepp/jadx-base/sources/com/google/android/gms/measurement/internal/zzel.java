package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.xiaomi.mipush.sdk.Constants;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzel extends y0 {
    private char b;
    private long c;

    @GuardedBy("this")
    private String d;
    private final zzej e;
    private final zzej f;
    private final zzej g;
    private final zzej h;
    private final zzej i;
    private final zzej j;
    private final zzej k;
    private final zzej l;
    private final zzej m;

    public zzel(zzfv zzfvVar) {
        super(zzfvVar);
        this.b = (char) 0;
        this.c = -1L;
        this.e = new zzej(this, 6, false, false);
        this.f = new zzej(this, 6, true, false);
        this.g = new zzej(this, 6, false, true);
        this.h = new zzej(this, 5, false, false);
        this.i = new zzej(this, 5, true, false);
        this.j = new zzej(this, 5, false, true);
        this.k = new zzej(this, 4, false, false);
        this.l = new zzej(this, 3, false, false);
        this.m = new zzej(this, 2, false, false);
    }

    public static String d(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strE = e(z, obj);
        String strE2 = e(z, obj2);
        String strE3 = e(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strE)) {
            sb.append(str2);
            sb.append(strE);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strE2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strE2);
        }
        if (!TextUtils.isEmpty(strE3)) {
            sb.append(str3);
            sb.append(strE3);
        }
        return sb.toString();
    }

    @VisibleForTesting
    public static String e(boolean z, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            String str = obj.toString().charAt(0) == '-' ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "";
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof p) {
                return ((p) obj).a;
            }
            return z ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String strH = h(zzfv.class.getCanonicalName());
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && h(className).equals(strH)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
        }
        return sb2.toString();
    }

    private static String h(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? str : str.substring(0, iLastIndexOf);
    }

    public static Object zzn(String str) {
        if (str == null) {
            return null;
        }
        return new p(str);
    }

    public final zzej zzc() {
        return this.l;
    }

    public final zzej zzd() {
        return this.e;
    }

    public final zzej zze() {
        return this.g;
    }

    @Override // com.google.android.gms.measurement.internal.y0
    public final boolean zzf() {
        return false;
    }

    public final zzej zzh() {
        return this.f;
    }

    public final zzej zzi() {
        return this.k;
    }

    public final zzej zzj() {
        return this.m;
    }

    public final zzej zzk() {
        return this.h;
    }

    public final zzej zzl() {
        return this.j;
    }

    public final zzej zzm() {
        return this.i;
    }

    @VisibleForTesting
    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    public final String zzq() {
        String str;
        synchronized (this) {
            if (this.d == null) {
                if (this.zzs.zzy() != null) {
                    this.d = this.zzs.zzy();
                } else {
                    this.d = this.zzs.zzf().e();
                }
            }
            Preconditions.checkNotNull(this.d);
            str = this.d;
        }
        return str;
    }

    public final void zzt(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(zzq(), i)) {
            Log.println(i, zzq(), d(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        zzfs zzfsVarJ = this.zzs.j();
        if (zzfsVarJ == null) {
            Log.println(6, zzq(), "Scheduler not set. Not logging error/warn");
        } else if (zzfsVarJ.a()) {
            zzfsVarJ.zzp(new o(this, i >= 9 ? 8 : i, str, obj, obj2, obj3));
        } else {
            Log.println(6, zzq(), "Scheduler not initialized. Not logging error/warn");
        }
    }
}
