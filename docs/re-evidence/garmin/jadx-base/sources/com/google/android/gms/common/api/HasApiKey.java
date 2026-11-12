package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.ApiKey;

/* JADX INFO: loaded from: classes14.dex */
public interface HasApiKey<O extends Api.ApiOptions> {
    @KeepForSdk
    ApiKey<O> getApiKey();
}
