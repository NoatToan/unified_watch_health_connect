package com.google.android.gms.internal.fitness;

import com.google.android.gms.fitness.result.DailyTotalResult;

/* JADX INFO: loaded from: classes3.dex */
final class p0 extends zzba {
    private final /* synthetic */ q0 b;

    public p0(q0 q0Var) {
        this.b = q0Var;
    }

    @Override // com.google.android.gms.internal.fitness.zzbb
    public final void zzc(DailyTotalResult dailyTotalResult) {
        this.b.setResult(dailyTotalResult);
    }
}
