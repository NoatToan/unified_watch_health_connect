package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* JADX INFO: loaded from: classes3.dex */
abstract class c<R extends Result> extends BaseImplementation.ApiMethodImpl<R, zah> {
    public c(GoogleApiClient googleApiClient) {
        super(Common.API, googleApiClient);
    }
}
