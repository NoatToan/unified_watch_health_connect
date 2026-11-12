package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class k0 implements RemoteCall {
    public static final RemoteCall a = new k0();

    private k0() {
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) throws RemoteException {
        ((com.google.android.gms.internal.location.zzaz) obj).zzK(new p((TaskCompletionSource) obj2));
    }
}
