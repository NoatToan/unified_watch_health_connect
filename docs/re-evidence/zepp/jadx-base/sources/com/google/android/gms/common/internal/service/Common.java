package com.google.android.gms.common.internal.service;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes3.dex */
public final class Common {

    @RecentlyNonNull
    @KeepForSdk
    public static final Api<Api.ApiOptions.NoOptions> API;

    @RecentlyNonNull
    @KeepForSdk
    public static final Api.ClientKey<zah> CLIENT_KEY;
    private static final Api.AbstractClientBuilder<zah, Api.ApiOptions.NoOptions> a;
    public static final zab zaa;

    static {
        Api.ClientKey<zah> clientKey = new Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        a aVar = new a();
        a = aVar;
        API = new Api<>("Common.API", aVar, clientKey);
        zaa = new zae();
    }
}
