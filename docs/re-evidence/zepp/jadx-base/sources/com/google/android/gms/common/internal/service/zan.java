package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.base.zad;

/* JADX INFO: loaded from: classes3.dex */
public final class zan extends com.google.android.gms.internal.base.zab implements zao {
    public zan(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.ICommonService");
    }

    @Override // com.google.android.gms.common.internal.service.zao
    public final void zaa(zam zamVar) throws RemoteException {
        Parcel parcelZaa = zaa();
        zad.zaa(parcelZaa, zamVar);
        zac(1, parcelZaa);
    }
}
