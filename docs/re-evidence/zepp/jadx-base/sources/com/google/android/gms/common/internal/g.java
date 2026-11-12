package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* JADX INFO: loaded from: classes3.dex */
final class g<R, T> implements PendingResultUtil.ResultConverter<R, T> {
    private final /* synthetic */ Response a;

    public g(Response response) {
        this.a = response;
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ Object convert(Result result) {
        this.a.setResult(result);
        return this.a;
    }
}
