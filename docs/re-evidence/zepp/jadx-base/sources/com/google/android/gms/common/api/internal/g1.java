package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
final class g1 implements PendingResult.StatusListener {
    private final /* synthetic */ BasePendingResult a;
    private final /* synthetic */ zav b;

    public g1(zav zavVar, BasePendingResult basePendingResult) {
        this.b = zavVar;
        this.a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        this.b.a.remove(this.a);
    }
}
