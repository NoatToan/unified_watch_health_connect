package com.google.android.gms.internal.p001authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public class zzc implements IInterface {
    private final IBinder zzc;
    private final String zzd;

    public zzc(IBinder iBinder, String str) {
        this.zzc = iBinder;
        this.zzd = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.zzc;
    }

    public final Parcel obtainAndWriteInterfaceToken() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.zzd);
        return parcelObtain;
    }

    public final void transactAndReadExceptionReturnVoid(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.zzc.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
