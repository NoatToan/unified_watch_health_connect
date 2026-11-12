package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes14.dex */
@KeepForSdk
public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    private static final Object zza = new Object();
    private boolean zzb = false;

    @KeepForSdk
    public static boolean canUnparcelSafely(String str) {
        synchronized (zza) {
        }
        return true;
    }

    @KeepForSdk
    public static Integer getUnparcelClientVersion() {
        synchronized (zza) {
        }
        return null;
    }

    @KeepForSdk
    public abstract boolean prepareForClientVersion(int i14);

    @KeepForSdk
    public void setShouldDowngrade(boolean z14) {
        this.zzb = z14;
    }

    @KeepForSdk
    public boolean shouldDowngrade() {
        return this.zzb;
    }
}
