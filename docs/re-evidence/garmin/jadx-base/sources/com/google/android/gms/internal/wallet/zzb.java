package com.google.android.gms.internal.wallet;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes14.dex */
public class zzb implements IInterface {
    private final IBinder zzb;
    private final String zzc;

    public zzb(IBinder iBinder, String str) {
        this.zzb = iBinder;
        this.zzc = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.zzb;
    }

    public final Parcel obtainAndWriteInterfaceToken() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.zzc);
        return parcelObtain;
    }

    public final void zza(int i14, Parcel parcel) {
        try {
            this.zzb.transact(i14, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
