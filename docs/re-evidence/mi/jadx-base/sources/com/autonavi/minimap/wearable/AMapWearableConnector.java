package com.autonavi.minimap.wearable;

import com.autonavi.minimap.wearable.inter.IProviderConnectCallback;
import com.autonavi.minimap.wearable.inter.IProviderSendCallback;

/* JADX INFO: loaded from: classes4.dex */
public class AMapWearableConnector implements IWearableConnectProvider {
    private IWearableConnectProvider mConnectProvider;

    public static class SingletonHolder {
        private static final AMapWearableConnector INSTANCE = new AMapWearableConnector();

        private SingletonHolder() {
        }
    }

    private AMapWearableConnector() {
    }

    public static AMapWearableConnector getInstance() {
        return SingletonHolder.INSTANCE;
    }

    @Override // com.autonavi.minimap.wearable.IWearableConnectProvider
    public void connect(String str, IProviderConnectCallback iProviderConnectCallback) {
        IWearableConnectProvider iWearableConnectProvider = this.mConnectProvider;
        if (iWearableConnectProvider == null) {
            return;
        }
        iWearableConnectProvider.connect(str, iProviderConnectCallback);
    }

    @Override // com.autonavi.minimap.wearable.IWearableConnectProvider
    public void onServiceDisconnect() {
        IWearableConnectProvider iWearableConnectProvider = this.mConnectProvider;
        if (iWearableConnectProvider == null) {
            return;
        }
        iWearableConnectProvider.onServiceDisconnect();
    }

    @Override // com.autonavi.minimap.wearable.IWearableConnectProvider
    public void send(String str, String str2, IProviderSendCallback iProviderSendCallback) {
        IWearableConnectProvider iWearableConnectProvider = this.mConnectProvider;
        if (iWearableConnectProvider == null) {
            return;
        }
        iWearableConnectProvider.send(str, str2, iProviderSendCallback);
    }

    @Override // com.autonavi.minimap.wearable.IWearableConnectProvider
    public void sendNotify(String str, String str2) {
        IWearableConnectProvider iWearableConnectProvider = this.mConnectProvider;
        if (iWearableConnectProvider == null) {
            return;
        }
        iWearableConnectProvider.sendNotify(str, str2);
    }

    public void setConnectProvider(IWearableConnectProvider iWearableConnectProvider) {
        this.mConnectProvider = iWearableConnectProvider;
    }
}
