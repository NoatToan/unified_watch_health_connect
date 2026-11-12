package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
final class f4 implements zzgv {
    public final com.google.android.gms.internal.measurement.zzci a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public f4(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzci zzciVar) {
        this.b = appMeasurementDynamiteService;
        this.a = zzciVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgv
    public final void interceptEvent(String str, String str2, Bundle bundle, long j) {
        try {
            this.a.zze(str, str2, bundle, j);
        } catch (RemoteException e) {
            zzfv zzfvVar = this.b.a;
            if (zzfvVar != null) {
                zzfvVar.zzay().zzk().zzb("Event interceptor threw exception", e);
            }
        }
    }
}
