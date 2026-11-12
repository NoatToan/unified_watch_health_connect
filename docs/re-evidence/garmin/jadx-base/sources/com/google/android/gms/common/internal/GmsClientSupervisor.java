package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
public abstract class GmsClientSupervisor {
    static HandlerThread zza = null;
    private static final Object zzb = new Object();
    private static int zzc = 9;
    private static zzq zzd = null;
    private static Executor zze = null;
    private static boolean zzf = false;

    @KeepForSdk
    public static int getDefaultBindFlags() {
        return 4225;
    }

    @KeepForSdk
    public static GmsClientSupervisor getInstance(Context context) {
        synchronized (zzb) {
            try {
                if (zzd == null) {
                    zzd = new zzq(context.getApplicationContext(), zzf ? getOrStartHandlerThread().getLooper() : context.getMainLooper(), zze);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return zzd;
    }

    @KeepForSdk
    public static HandlerThread getOrStartHandlerThread() {
        synchronized (zzb) {
            try {
                HandlerThread handlerThread = zza;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", zzc);
                zza = handlerThread2;
                handlerThread2.start();
                return zza;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @KeepForSdk
    public static void setDefaultBindExecutor(Executor executor) {
        synchronized (zzb) {
            try {
                zzq zzqVar = zzd;
                if (zzqVar != null) {
                    zzqVar.zze(executor);
                }
                zze = executor;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @KeepForSdk
    public static boolean setGamHandlerThreadPriorityIfNotInitialized(int i14) {
        synchronized (zzb) {
            try {
                if (zza != null) {
                    return false;
                }
                zzc = i14;
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @KeepForSdk
    public static void setUseHandlerThreadForCallbacks() {
        synchronized (zzb) {
            try {
                zzq zzqVar = zzd;
                if (zzqVar != null && !zzf) {
                    zzqVar.zzd(getOrStartHandlerThread().getLooper());
                }
                zzf = true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @KeepForSdk
    public boolean bindService(String str, ServiceConnection serviceConnection, String str2) {
        return zza(new zzn(str, 4225, false), serviceConnection, str2, null).isSuccess();
    }

    @KeepForSdk
    public void unbindService(String str, ServiceConnection serviceConnection, String str2) {
        zzc(new zzn(str, 4225, false), serviceConnection, str2);
    }

    public abstract ConnectionResult zza(zzn zznVar, ServiceConnection serviceConnection, String str, Executor executor);

    public final void zzb(String str, String str2, int i14, ServiceConnection serviceConnection, String str3, boolean z14) {
        zzc(new zzn(str, str2, 4225, z14), serviceConnection, str3);
    }

    public abstract void zzc(zzn zznVar, ServiceConnection serviceConnection, String str);

    @KeepForSdk
    public void unbindService(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        zzc(new zzn(componentName, 4225), serviceConnection, str);
    }

    @KeepForSdk
    public boolean bindService(ComponentName componentName, ServiceConnection serviceConnection, String str, Executor executor) {
        return zza(new zzn(componentName, 4225), serviceConnection, str, executor).isSuccess();
    }

    @KeepForSdk
    public boolean bindService(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        return zza(new zzn(componentName, 4225), serviceConnection, str, null).isSuccess();
    }

    @KeepForSdk
    public static HandlerThread getOrStartHandlerThread(int i14) {
        synchronized (zzb) {
            try {
                HandlerThread handlerThread = zza;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", i14);
                zza = handlerThread2;
                handlerThread2.start();
                return zza;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
