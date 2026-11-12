package com.google.android.gms.common.config;

import android.os.Binder;
import android.os.StrictMode;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
public abstract class GservicesValue<T> {
    private static final Object zzc = new Object();
    protected final String zza;
    protected final Object zzb;
    private Object zzd = null;

    public GservicesValue(String str, Object obj) {
        this.zza = str;
        this.zzb = obj;
    }

    @KeepForSdk
    public static boolean isInitialized() {
        synchronized (zzc) {
        }
        return false;
    }

    @KeepForSdk
    public static GservicesValue<Boolean> value(String str, boolean z14) {
        return new zza(str, Boolean.valueOf(z14));
    }

    @KeepForSdk
    public final T get() {
        T t7;
        T t14 = (T) this.zzd;
        if (t14 != null) {
            return t14;
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        Object obj = zzc;
        synchronized (obj) {
        }
        synchronized (obj) {
            try {
            } catch (Throwable th3) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th3;
            }
        }
        try {
            t7 = (T) zza(this.zza);
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Object objZza = zza(this.zza);
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                t7 = (T) objZza;
            } catch (Throwable th4) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th4;
            }
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        return t7;
    }

    @KeepForSdk
    @Deprecated
    public final T getBinderSafe() {
        return get();
    }

    @KeepForSdk
    public void override(T t7) {
        this.zzd = t7;
        Object obj = zzc;
        synchronized (obj) {
            synchronized (obj) {
            }
        }
    }

    @KeepForSdk
    public void resetOverride() {
        this.zzd = null;
    }

    public abstract Object zza(String str);

    @KeepForSdk
    public static GservicesValue<Integer> value(String str, Integer num) {
        return new zzc(str, num);
    }

    @KeepForSdk
    public static GservicesValue<Long> value(String str, Long l14) {
        return new zzb(str, l14);
    }

    @KeepForSdk
    public static GservicesValue<String> value(String str, String str2) {
        return new zze(str, str2);
    }

    @KeepForSdk
    public static GservicesValue<Float> value(String str, Float f14) {
        return new zzd(str, f14);
    }
}
