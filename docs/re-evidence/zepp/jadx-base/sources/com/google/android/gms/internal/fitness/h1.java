package com.google.android.gms.internal.fitness;

import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.fitness.result.SessionReadResult;

/* JADX INFO: loaded from: classes3.dex */
final class h1 extends zzcg {
    private final BaseImplementation.ResultHolder<SessionReadResult> b;

    private h1(BaseImplementation.ResultHolder<SessionReadResult> resultHolder) {
        this.b = resultHolder;
    }

    @Override // com.google.android.gms.internal.fitness.zzch
    public final void zza(SessionReadResult sessionReadResult) {
        this.b.setResult(sessionReadResult);
    }

    public /* synthetic */ h1(BaseImplementation.ResultHolder resultHolder, c1 c1Var) {
        this(resultHolder);
    }
}
