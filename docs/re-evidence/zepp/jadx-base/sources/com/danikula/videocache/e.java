package com.danikula.videocache;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class e extends ProxySelector {
    private static final List<Proxy> d = Arrays.asList(Proxy.NO_PROXY);
    private final ProxySelector a;
    private final String b;
    private final int c;

    public e(ProxySelector proxySelector, String str, int i) {
        this.a = (ProxySelector) Preconditions.checkNotNull(proxySelector);
        this.b = (String) Preconditions.checkNotNull(str);
        this.c = i;
    }

    public static void a(String str, int i) {
        ProxySelector.setDefault(new e(ProxySelector.getDefault(), str, i));
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.a.connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        return this.b.equals(uri.getHost()) && this.c == uri.getPort() ? d : this.a.select(uri);
    }
}
