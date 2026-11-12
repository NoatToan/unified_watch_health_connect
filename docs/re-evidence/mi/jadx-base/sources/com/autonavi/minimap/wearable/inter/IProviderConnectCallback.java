package com.autonavi.minimap.wearable.inter;

/* JADX INFO: loaded from: classes4.dex */
public interface IProviderConnectCallback {
    void onConnect(int i, String str);

    void onDisconnect(int i, String str);

    void onReceive(String str);
}
