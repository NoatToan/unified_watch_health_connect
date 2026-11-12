package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* JADX INFO: loaded from: classes3.dex */
final class d extends zaa {
    private final BaseImplementation.ResultHolder<Status> b;

    public d(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.b = resultHolder;
    }

    @Override // com.google.android.gms.common.internal.service.zaa, com.google.android.gms.common.internal.service.zam
    public final void zaa(int i) throws RemoteException {
        this.b.setResult(new Status(i));
    }
}
