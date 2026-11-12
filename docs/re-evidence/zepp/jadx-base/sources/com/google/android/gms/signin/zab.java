package com.google.android.gms.signin;

import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.signin.internal.SignInClientImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class zab {
    private static final Api.ClientKey<SignInClientImpl> a;

    @ShowFirstParty
    private static final Api.ClientKey<SignInClientImpl> b;
    private static final Api.AbstractClientBuilder<SignInClientImpl, zac> c;
    private static final Scope d;
    private static final Scope e;
    private static final Api<zac> f;
    public static final Api.AbstractClientBuilder<SignInClientImpl, SignInOptions> zaa;
    public static final Api<SignInOptions> zab;

    static {
        Api.ClientKey<SignInClientImpl> clientKey = new Api.ClientKey<>();
        a = clientKey;
        Api.ClientKey<SignInClientImpl> clientKey2 = new Api.ClientKey<>();
        b = clientKey2;
        a aVar = new a();
        zaa = aVar;
        b bVar = new b();
        c = bVar;
        d = new Scope(Scopes.PROFILE);
        e = new Scope("email");
        zab = new Api<>("SignIn.API", aVar, clientKey);
        f = new Api<>("SignIn.INTERNAL_API", bVar, clientKey2);
    }
}
