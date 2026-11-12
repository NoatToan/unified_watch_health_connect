package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes14.dex */
public final class g extends a implements i {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.i
    public final void c(Bundle bundle, r rVar) {
        Parcel parcelA = a();
        c.c(parcelA, bundle);
        parcelA.writeStrongBinder(rVar);
        b(6, parcelA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.i
    public final void d(Bundle bundle, k kVar) {
        Parcel parcelA = a();
        c.c(parcelA, bundle);
        parcelA.writeStrongBinder(kVar);
        b(3, parcelA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.i
    public final void e(Bundle bundle, k kVar) {
        Parcel parcelA = a();
        c.c(parcelA, bundle);
        parcelA.writeStrongBinder(kVar);
        b(2, parcelA);
    }
}
