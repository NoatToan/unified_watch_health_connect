package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
final class g4 implements zzgw {
    public final com.google.android.gms.internal.measurement.zzci a;
    public final /* synthetic */ AppMeasurementDynamiteService b;

    public g4(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzci zzciVar) {
        this.b = appMeasurementDynamiteService;
        this.a = zzciVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgw
    public final void onEvent(String str, String str2, Bundle bundle, long j) {
        try {
            this.a.zze(str, str2, bundle, j);
        } catch (RemoteException e) {
            zzfv zzfvVar = this.b.a;
            if (zzfvVar != null) {
                zzfvVar.zzay().zzk().zzb("Event listener threw exception", e);
            }
        }
    }
}
