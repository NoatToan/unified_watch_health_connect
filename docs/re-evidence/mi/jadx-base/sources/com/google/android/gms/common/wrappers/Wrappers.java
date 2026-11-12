package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes4.dex */
@KeepForSdk
public class Wrappers {
    private static final Wrappers zza = new Wrappers();
    private PackageManagerWrapper zzb = null;

    @KeepForSdk
    public static PackageManagerWrapper packageManager(Context context) {
        return zza.zza(context);
    }

    @VisibleForTesting
    public final synchronized PackageManagerWrapper zza(Context context) {
        try {
            if (this.zzb == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.zzb = new PackageManagerWrapper(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzb;
    }
}
