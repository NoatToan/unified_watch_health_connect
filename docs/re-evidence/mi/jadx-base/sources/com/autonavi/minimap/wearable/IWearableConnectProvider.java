package com.autonavi.minimap.wearable;

import com.autonavi.minimap.wearable.inter.IProviderConnectCallback;
import com.autonavi.minimap.wearable.inter.IProviderSendCallback;

/* JADX INFO: loaded from: classes4.dex */
public interface IWearableConnectProvider {
    void connect(String str, IProviderConnectCallback iProviderConnectCallback);

    void onServiceDisconnect();

    void send(String str, String str2, IProviderSendCallback iProviderSendCallback);

    void sendNotify(String str, String str2);
}
