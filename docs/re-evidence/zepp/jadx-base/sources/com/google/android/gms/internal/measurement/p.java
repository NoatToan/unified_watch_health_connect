package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
final class p extends r0 {
    public final /* synthetic */ Activity e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ zzee h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(zzee zzeeVar, Activity activity, String str, String str2) {
        super(zzeeVar, true);
        this.h = zzeeVar;
        this.e = activity;
        this.f = str;
        this.g = str2;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.h.g)).setCurrentScreen(ObjectWrapper.wrap(this.e), this.f, this.g, this.a);
    }
}
