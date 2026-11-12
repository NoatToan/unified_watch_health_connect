package com.autonavi.minimap.wearable;

import android.os.RemoteException;
import com.autonavi.minimap.wearable.contract.IConnectCallback;
import com.autonavi.minimap.wearable.contract.IConnectContract;
import com.autonavi.minimap.wearable.contract.ISendCallback;
import com.autonavi.minimap.wearable.inter.IProviderConnectCallback;
import com.autonavi.minimap.wearable.inter.IProviderSendCallback;

/* JADX INFO: loaded from: classes4.dex */
public class AMapConnectBinder extends IConnectContract.Stub {
    @Override // com.autonavi.minimap.wearable.contract.IConnectContract
    public void connect(String str, final IConnectCallback iConnectCallback) {
        AMapWearableConnector.getInstance().connect(str, new IProviderConnectCallback() { // from class: com.autonavi.minimap.wearable.AMapConnectBinder.2
            @Override // com.autonavi.minimap.wearable.inter.IProviderConnectCallback
            public void onConnect(int i, String str2) {
                IConnectCallback iConnectCallback2 = iConnectCallback;
                if (iConnectCallback2 != null) {
                    try {
                        iConnectCallback2.onConnect(i, str2);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override // com.autonavi.minimap.wearable.inter.IProviderConnectCallback
            public void onDisconnect(int i, String str2) {
                IConnectCallback iConnectCallback2 = iConnectCallback;
                if (iConnectCallback2 != null) {
                    try {
                        iConnectCallback2.onDisconnect(i, str2);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override // com.autonavi.minimap.wearable.inter.IProviderConnectCallback
            public void onReceive(String str2) {
                IConnectCallback iConnectCallback2 = iConnectCallback;
                if (iConnectCallback2 != null) {
                    try {
                        iConnectCallback2.onReceive(str2);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    @Override // com.autonavi.minimap.wearable.contract.IConnectContract
    public String getVersion() {
        return com.mipay.sdk.account.BuildConfig.VERSION_NAME;
    }

    @Override // com.autonavi.minimap.wearable.contract.IConnectContract
    public void send(String str, String str2, final ISendCallback iSendCallback) {
        AMapWearableConnector.getInstance().send(str, str2, new IProviderSendCallback() { // from class: com.autonavi.minimap.wearable.AMapConnectBinder.1
            @Override // com.autonavi.minimap.wearable.inter.IProviderSendCallback
            public void onSendCallback(int i, String str3) {
                ISendCallback iSendCallback2 = iSendCallback;
                if (iSendCallback2 != null) {
                    try {
                        iSendCallback2.onSendCallback(i, str3);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    @Override // com.autonavi.minimap.wearable.contract.IConnectContract
    public void sendNotify(String str, String str2) {
        AMapWearableConnector.getInstance().sendNotify(str, str2);
    }
}
