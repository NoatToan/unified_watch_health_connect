package com.google.android.gms.internal.fitness;

import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.fitness.result.SessionStopResult;

/* JADX INFO: loaded from: classes3.dex */
final class j1 extends zzcl {
    private final BaseImplementation.ResultHolder<SessionStopResult> b;

    private j1(BaseImplementation.ResultHolder<SessionStopResult> resultHolder) {
        this.b = resultHolder;
    }

    @Override // com.google.android.gms.internal.fitness.zzci
    public final void zza(SessionStopResult sessionStopResult) {
        this.b.setResult(sessionStopResult);
    }

    public /* synthetic */ j1(BaseImplementation.ResultHolder resultHolder, c1 c1Var) {
        this(resultHolder);
    }
}
