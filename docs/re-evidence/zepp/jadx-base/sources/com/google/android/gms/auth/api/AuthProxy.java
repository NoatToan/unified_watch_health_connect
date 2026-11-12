package com.google.android.gms.auth.api;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzak;
import com.google.android.gms.internal.auth.zzar;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public final class AuthProxy {

    @KeepForSdk
    public static final Api<AuthProxyOptions> API;

    @KeepForSdk
    public static final ProxyApi ProxyApi;
    private static final Api.ClientKey<zzak> a;
    private static final Api.AbstractClientBuilder<zzak, AuthProxyOptions> b;

    static {
        Api.ClientKey<zzak> clientKey = new Api.ClientKey<>();
        a = clientKey;
        a aVar = new a();
        b = aVar;
        API = new Api<>("Auth.PROXY_API", aVar, clientKey);
        ProxyApi = new zzar();
    }
}
