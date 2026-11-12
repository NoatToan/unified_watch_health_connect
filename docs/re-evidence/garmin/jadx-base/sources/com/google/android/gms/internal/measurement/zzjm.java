package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Process;
import android.os.UserManager;

/* JADX INFO: loaded from: classes14.dex */
public final class zzjm {
    private static UserManager zza;
    private static volatile boolean zzb = !zza();

    private zzjm() {
    }

    public static boolean zza() {
        return true;
    }

    public static boolean zzb(Context context) {
        return zza() && !zzd(context);
    }

    public static boolean zzc(Context context) {
        return !zza() || zzd(context);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0048 A[Catch: all -> 0x000f, TryCatch #1 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:16:0x0017, B:18:0x001b, B:19:0x0025, B:31:0x0048, B:32:0x004a, B:22:0x002b, B:24:0x0031, B:27:0x003d, B:29:0x0044), top: B:38:0x0009, inners: #0 }] */
    @TargetApi(24)
    private static boolean zzd(Context context) {
        if (zzb) {
            return true;
        }
        synchronized (zzjm.class) {
            try {
                if (zzb) {
                    return true;
                }
                int i14 = 1;
                while (true) {
                    boolean z14 = false;
                    if (i14 <= 2) {
                        if (zza == null) {
                            zza = (UserManager) context.getSystemService(UserManager.class);
                        }
                        UserManager userManager = zza;
                        if (userManager == null) {
                            z14 = true;
                        } else {
                            try {
                                if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                    z14 = true;
                                }
                            } catch (NullPointerException unused) {
                                zza = null;
                                i14++;
                            }
                        }
                        if (z14) {
                            zzb = true;
                        }
                        return z14;
                    }
                    if (z14) {
                        zza = null;
                    }
                    if (z14) {
                        zzb = true;
                    }
                    return z14;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
