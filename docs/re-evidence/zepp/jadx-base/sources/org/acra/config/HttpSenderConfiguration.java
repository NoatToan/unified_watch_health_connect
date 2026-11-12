package org.acra.config;

import androidx.annotation.NonNull;
import androidx.annotation.RawRes;
import java.io.Serializable;
import org.acra.collections.ImmutableList;
import org.acra.collections.ImmutableMap;
import org.acra.security.KeyStoreFactory;
import org.acra.security.TLS;
import org.acra.sender.HttpSender;

/* JADX INFO: loaded from: classes23.dex */
public final class HttpSenderConfiguration implements Serializable, Configuration {
    private final boolean a;

    @NonNull
    private final String b;

    @NonNull
    private final String c;

    @NonNull
    private final String d;

    @NonNull
    private final HttpSender.Method e;
    private final int f;
    private final int g;
    private final boolean h;

    @NonNull
    private final Class<? extends KeyStoreFactory> i;

    @NonNull
    private final String j;

    @RawRes
    private final int k;

    @NonNull
    private final String l;
    private final boolean m;

    @NonNull
    private final ImmutableList<TLS> n;

    @NonNull
    private final ImmutableMap<String, String> o;

    public HttpSenderConfiguration(@NonNull a aVar) {
        this.a = aVar.i();
        this.b = aVar.E();
        this.c = aVar.a();
        this.d = aVar.b();
        this.e = aVar.k();
        this.f = aVar.g();
        this.g = aVar.C();
        this.h = aVar.h();
        this.i = aVar.l();
        this.j = aVar.d();
        this.k = aVar.m();
        this.l = aVar.e();
        this.m = aVar.f();
        this.n = new ImmutableList<>(aVar.D());
        this.o = new ImmutableMap<>(aVar.j());
    }

    @NonNull
    public String basicAuthLogin() {
        return this.c;
    }

    @NonNull
    public String basicAuthPassword() {
        return this.d;
    }

    @NonNull
    public String certificatePath() {
        return this.j;
    }

    @NonNull
    public String certificateType() {
        return this.l;
    }

    public boolean compress() {
        return this.m;
    }

    public int connectionTimeout() {
        return this.f;
    }

    public boolean dropReportsOnTimeout() {
        return this.h;
    }

    @Override // org.acra.config.Configuration
    public boolean enabled() {
        return this.a;
    }

    @NonNull
    public ImmutableMap<String, String> httpHeaders() {
        return this.o;
    }

    @NonNull
    public HttpSender.Method httpMethod() {
        return this.e;
    }

    @NonNull
    public Class<? extends KeyStoreFactory> keyStoreFactoryClass() {
        return this.i;
    }

    @RawRes
    public int resCertificate() {
        return this.k;
    }

    public int socketTimeout() {
        return this.g;
    }

    @NonNull
    public ImmutableList<TLS> tlsProtocols() {
        return this.n;
    }

    @NonNull
    public String uri() {
        return this.b;
    }
}
