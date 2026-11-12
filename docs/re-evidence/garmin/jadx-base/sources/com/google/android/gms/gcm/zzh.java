package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes14.dex */
public final class zzh extends com.google.android.gms.internal.gcm.zzd implements zzg {
    public zzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gcm.INetworkTaskCallback");
    }

    @Override // com.google.android.gms.gcm.zzg
    public final void zzf(int i14) {
        Parcel parcelZzd = zzd();
        parcelZzd.writeInt(i14);
        zzd(2, parcelZzd);
    }
}
