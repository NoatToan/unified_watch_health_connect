package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;

/* JADX INFO: loaded from: classes4.dex */
final class zak implements PendingResultUtil.ResultConverter {
    private final /* synthetic */ Response zaoy;

    public zak(Response response) {
        this.zaoy = response;
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ Object convert(Result result) {
        this.zaoy.setResult(result);
        return this.zaoy;
    }
}
