package com.huawei.openalliance.ad;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class iq extends ProxySelector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<Proxy> f19262a = Collections.singletonList(Proxy.NO_PROXY);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ProxySelector f19263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f19264c;
    private final int d;

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        return (this.f19264c.equals(uri.getHost()) && this.d == uri.getPort()) ? f19262a : this.f19263b.select(uri);
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.f19263b.connectFailed(uri, socketAddress, iOException);
    }

    public static void a(String str, int i) {
        ProxySelector.setDefault(new iq(ProxySelector.getDefault(), str, i));
    }

    private iq(ProxySelector proxySelector, String str, int i) {
        if (proxySelector == null || str == null) {
            throw null;
        }
        this.f19263b = proxySelector;
        this.f19264c = str;
        this.d = i;
    }
}
