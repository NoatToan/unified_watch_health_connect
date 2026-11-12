package com.google.android.gms.internal.fitness;

import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.fitness.result.BleDevicesResult;

/* JADX INFO: loaded from: classes3.dex */
final class c0 extends zzep {
    private final BaseImplementation.ResultHolder<BleDevicesResult> b;

    private c0(BaseImplementation.ResultHolder<BleDevicesResult> resultHolder) {
        this.b = resultHolder;
    }

    @Override // com.google.android.gms.internal.fitness.zzem
    public final void zza(BleDevicesResult bleDevicesResult) {
        this.b.setResult(bleDevicesResult);
    }

    public /* synthetic */ c0(BaseImplementation.ResultHolder resultHolder, x xVar) {
        this(resultHolder);
    }
}
