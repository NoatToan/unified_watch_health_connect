package com.google.android.gms.internal.fitness;

import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;

/* JADX INFO: loaded from: classes3.dex */
final class w0 extends zzcf {
    private final BaseImplementation.ResultHolder<ListSubscriptionsResult> b;

    private w0(BaseImplementation.ResultHolder<ListSubscriptionsResult> resultHolder) {
        this.b = resultHolder;
    }

    @Override // com.google.android.gms.internal.fitness.zzcc
    public final void zza(ListSubscriptionsResult listSubscriptionsResult) {
        this.b.setResult(listSubscriptionsResult);
    }

    public /* synthetic */ w0(BaseImplementation.ResultHolder resultHolder, t0 t0Var) {
        this(resultHolder);
    }
}
