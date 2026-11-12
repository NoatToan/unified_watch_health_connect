package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
final class q0 extends r0 {
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ zzee i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(zzee zzeeVar, String str, String str2, Object obj, boolean z) {
        super(zzeeVar, true);
        this.i = zzeeVar;
        this.e = str;
        this.f = str2;
        this.g = obj;
        this.h = z;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.i.g)).setUserProperty(this.e, this.f, ObjectWrapper.wrap(this.g), this.h, this.a);
    }
}
