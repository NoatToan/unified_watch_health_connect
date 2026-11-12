package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
final class e0 extends r0 {
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ zzee g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(zzee zzeeVar, boolean z, int i, String str, Object obj, Object obj2, Object obj3) {
        super(zzeeVar, false);
        this.g = zzeeVar;
        this.e = str;
        this.f = obj;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void a() throws RemoteException {
        ((zzcc) Preconditions.checkNotNull(this.g.g)).logHealthData(5, this.e, ObjectWrapper.wrap(this.f), ObjectWrapper.wrap(null), ObjectWrapper.wrap(null));
    }
}
