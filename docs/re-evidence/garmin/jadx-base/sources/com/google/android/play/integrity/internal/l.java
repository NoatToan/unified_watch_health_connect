package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes14.dex */
public final class l extends a implements n {
    public l(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.n
    public final void c(Bundle bundle, r rVar) {
        Parcel parcelA = a();
        c.c(parcelA, bundle);
        parcelA.writeStrongBinder(rVar);
        b(3, parcelA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.n
    public final void d(Bundle bundle, p pVar) {
        Parcel parcelA = a();
        c.c(parcelA, bundle);
        parcelA.writeStrongBinder(pVar);
        b(2, parcelA);
    }
}
