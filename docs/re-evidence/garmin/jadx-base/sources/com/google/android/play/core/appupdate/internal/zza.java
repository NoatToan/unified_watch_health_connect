package com.google.android.play.core.appupdate.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes14.dex */
public class zza implements IInterface {
    private final IBinder zza;
    private final String zzb = "com.google.android.play.core.appupdate.protocol.IAppUpdateService";

    public zza(IBinder iBinder, String str) {
        this.zza = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.zza;
    }

    public final Parcel zza() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.zzb);
        return parcelObtain;
    }

    public final void zzb(int i14, Parcel parcel) {
        try {
            this.zza.transact(i14, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
