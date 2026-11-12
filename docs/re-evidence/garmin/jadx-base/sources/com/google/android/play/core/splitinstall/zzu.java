package com.google.android.play.core.splitinstall;

import android.content.Context;
import com.google.android.play.core.splitinstall.internal.zzbr;

/* JADX INFO: loaded from: classes14.dex */
public final class zzu {
    private static zzp zza;

    public static synchronized zzp zza(Context context) {
        try {
            if (zza == null) {
                zzc zzcVar = new zzc(null);
                zzcVar.zza(new zzac(zzbr.zza(context)));
                zza = zzcVar.zzb();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return zza;
    }
}
