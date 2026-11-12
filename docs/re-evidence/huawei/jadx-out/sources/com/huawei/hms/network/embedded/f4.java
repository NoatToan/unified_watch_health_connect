package com.huawei.hms.network.embedded;

import java.net.Proxy;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes34.dex */
public class f4 implements d1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a1 f14757a;

    @Override // com.huawei.hms.network.embedded.d1.a
    public boolean isAvailable() {
        return true;
    }

    @Override // com.huawei.hms.network.embedded.d1.a
    public d1 newTask() {
        return new e4(this);
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f14757a.getSslSocketFactory();
    }

    public Proxy getProxy() {
        return this.f14757a.getProxy();
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.f14757a.getHostnameVerifier();
    }

    @Override // com.huawei.hms.network.embedded.d1.a
    public String getChannel() {
        return "type_urlconnection";
    }

    public f4(a1 a1Var) {
        this.f14757a = a1Var;
    }
}
