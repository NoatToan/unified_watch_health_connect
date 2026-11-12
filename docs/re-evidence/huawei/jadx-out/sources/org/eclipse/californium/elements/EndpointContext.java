package org.eclipse.californium.elements;

import defpackage.zxs;
import java.net.InetSocketAddress;
import java.security.Principal;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public interface EndpointContext {
    Map<zxs<?>, Object> entries();

    <T> T get(zxs<T> zxsVar);

    InetSocketAddress getPeerAddress();

    Principal getPeerIdentity();

    <T> String getString(zxs<T> zxsVar);

    String getVirtualHost();

    boolean hasCriticalEntries();
}
