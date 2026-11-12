package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes14.dex */
public final class zzcy extends zzbl implements zzda {
    public zzcy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final void zze(String str, String str2, Bundle bundle, long j8) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbn.zzc(parcelZza, bundle);
        parcelZza.writeLong(j8);
        zzc(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public final int zzf() {
        Parcel parcelZzP = zzP(2, zza());
        int i14 = parcelZzP.readInt();
        parcelZzP.recycle();
        return i14;
    }
}
