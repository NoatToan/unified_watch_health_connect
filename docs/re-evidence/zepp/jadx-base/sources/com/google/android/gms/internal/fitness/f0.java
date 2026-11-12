package com.google.android.gms.internal.fitness;

import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.fitness.result.DataTypeResult;

/* JADX INFO: loaded from: classes3.dex */
final class f0 extends zzbl {
    private final BaseImplementation.ResultHolder<DataTypeResult> b;

    private f0(BaseImplementation.ResultHolder<DataTypeResult> resultHolder) {
        this.b = resultHolder;
    }

    @Override // com.google.android.gms.internal.fitness.zzbi
    public final void zzc(DataTypeResult dataTypeResult) {
        this.b.setResult(dataTypeResult);
    }

    public /* synthetic */ f0(BaseImplementation.ResultHolder resultHolder, e0 e0Var) {
        this(resultHolder);
    }
}
