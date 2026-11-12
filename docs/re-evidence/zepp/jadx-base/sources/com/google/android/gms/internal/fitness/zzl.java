package com.google.android.gms.internal.fitness;

import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.fitness.result.DataSourcesResult;

/* JADX INFO: loaded from: classes3.dex */
public final class zzl extends zzbg {
    private final BaseImplementation.ResultHolder<DataSourcesResult> b;

    public zzl(BaseImplementation.ResultHolder<DataSourcesResult> resultHolder) {
        this.b = resultHolder;
    }

    @Override // com.google.android.gms.internal.fitness.zzbh
    public final void zza(DataSourcesResult dataSourcesResult) {
        this.b.setResult(dataSourcesResult);
    }
}
