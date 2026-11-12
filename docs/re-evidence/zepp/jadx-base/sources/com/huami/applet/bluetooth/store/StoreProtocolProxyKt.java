package com.huami.applet.bluetooth.store;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0019\u0010\u0005\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/huami/applet/bluetooth/store/StoreProtocolProxy;", "a", "Lcom/huami/applet/bluetooth/store/StoreProtocolProxy;", "getStoreProtocol", "()Lcom/huami/applet/bluetooth/store/StoreProtocolProxy;", "storeProtocol", "applet_release"}, k = 2, mv = {1, 5, 1})
public final class StoreProtocolProxyKt {

    @NotNull
    private static final StoreProtocolProxy a = new StoreProtocolProxy(new StoreProtocolImpl());

    @NotNull
    public static final StoreProtocolProxy getStoreProtocol() {
        return a;
    }
}
