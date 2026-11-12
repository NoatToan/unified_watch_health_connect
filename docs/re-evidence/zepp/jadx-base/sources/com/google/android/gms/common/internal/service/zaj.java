package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.internal.base.zad;

/* JADX INFO: loaded from: classes3.dex */
public final class zaj extends com.google.android.gms.internal.base.zab implements zak {
    public zaj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // com.google.android.gms.common.internal.service.zak
    public final void zaa(zaaa zaaaVar) throws RemoteException {
        Parcel parcelZaa = zaa();
        zad.zaa(parcelZaa, zaaaVar);
        zac(1, parcelZaa);
    }
}
