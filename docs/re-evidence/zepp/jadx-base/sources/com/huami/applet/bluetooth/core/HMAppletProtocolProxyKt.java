package com.huami.applet.bluetooth.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001c\u0010\u0005\u001a\u00020\u00008\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/huami/applet/bluetooth/core/HMAppletProtocolProxy;", "a", "Lcom/huami/applet/bluetooth/core/HMAppletProtocolProxy;", "getHMAppletProtocolProxy", "()Lcom/huami/applet/bluetooth/core/HMAppletProtocolProxy;", "hMAppletProtocolProxy", "applet_release"}, k = 2, mv = {1, 5, 1})
public final class HMAppletProtocolProxyKt {

    @NotNull
    private static final HMAppletProtocolProxy a = new HMAppletProtocolProxy(new HMAppletProtocolImpl());

    @NotNull
    public static final HMAppletProtocolProxy getHMAppletProtocolProxy() {
        return a;
    }
}
