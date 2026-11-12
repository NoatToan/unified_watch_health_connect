package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes14.dex */
final class zzba extends zzaj {
    private final BaseImplementation.ResultHolder zza;

    public zzba(BaseImplementation.ResultHolder resultHolder) {
        Preconditions.checkArgument(resultHolder != null, "listener can't be null.");
        this.zza = resultHolder;
    }

    private final void zze(int i14) {
        BaseImplementation.ResultHolder resultHolder = this.zza;
        if (i14 != 0 && (i14 < 1000 || i14 >= 1006)) {
            i14 = 13;
        }
        resultHolder.setResult(new Status(i14));
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzb(int i14, String[] strArr) {
        zze(i14);
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzc(int i14, PendingIntent pendingIntent) {
        zze(i14);
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzd(int i14, String[] strArr) {
        zze(i14);
    }
}
