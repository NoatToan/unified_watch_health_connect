package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes14.dex */
public class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f53402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f53403b;

    public a(IBinder iBinder, String str) {
        this.f53402a = iBinder;
        this.f53403b = str;
    }

    public final Parcel a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f53403b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f53402a;
    }

    public final void b(int i14, Parcel parcel) {
        try {
            this.f53402a.transact(i14, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
