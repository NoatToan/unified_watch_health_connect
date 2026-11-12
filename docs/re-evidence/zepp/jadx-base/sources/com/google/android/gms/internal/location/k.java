package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.location.LocationStatusCodes;

/* JADX INFO: loaded from: classes3.dex */
final class k extends zzaj {
    private BaseImplementation.ResultHolder<Status> a;

    public k(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.a = resultHolder;
    }

    private final void a(int i) {
        if (this.a == null) {
            Log.wtf("LocationClientImpl", "onRemoveGeofencesResult called multiple times", new Exception());
            return;
        }
        this.a.setResult(LocationStatusCodes.zzb(LocationStatusCodes.zza(i)));
        this.a = null;
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzb(int i, String[] strArr) {
        Log.wtf("LocationClientImpl", "Unexpected call to onAddGeofencesResult", new Exception());
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzc(int i, String[] strArr) {
        a(i);
    }

    @Override // com.google.android.gms.internal.location.zzak
    public final void zzd(int i, PendingIntent pendingIntent) {
        a(i);
    }
}
