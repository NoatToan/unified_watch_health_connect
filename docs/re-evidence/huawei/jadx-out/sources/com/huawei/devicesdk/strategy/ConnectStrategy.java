package com.huawei.devicesdk.strategy;

import com.huawei.devicesdk.callback.ConnectFilter;
import com.huawei.devicesdk.callback.ConnectStatusInterface;
import com.huawei.devicesdk.entity.ConnectMode;
import com.huawei.devicesdk.entity.DeviceInfo;
import defpackage.cll;
import defpackage.cmh;
import defpackage.cmm;
import defpackage.cpi;
import defpackage.cpl;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ConnectStrategy {
    private static final String TAG = "ConnectStrategy";
    public cmh mConnectStatusMsg = new cmh();
    protected ConnectStatusInterface mHandshakeStatusReporter;

    public abstract void destroy(String str);

    public abstract void getConnectStatus(String str);

    public abstract void onChannelEnable(DeviceInfo deviceInfo, int i);

    public abstract void onDataReceived(DeviceInfo deviceInfo, cmm cmmVar, int i);

    public void registerHandshakeFilter(DeviceInfo deviceInfo, ConnectFilter connectFilter) {
    }

    public abstract void startHandshake(DeviceInfo deviceInfo);

    public abstract void unPairDevice(DeviceInfo deviceInfo, ConnectMode connectMode, boolean z);

    public void connect(ConnectMode connectMode, DeviceInfo deviceInfo) {
        if (deviceInfo == null || deviceInfo.getDeviceMac() == null || connectMode == null) {
            LogUtil.e(TAG, "connect error, device is null");
            ConnectStatusInterface connectStatusInterface = this.mHandshakeStatusReporter;
            if (connectStatusInterface != null) {
                connectStatusInterface.onHandshakeFailed(deviceInfo, cpi.c(7, 303));
                return;
            }
            return;
        }
        LogUtil.b(TAG, "connect start.", cpl.a(deviceInfo));
        cll.c().d(connectMode, deviceInfo);
    }

    public void registerHandshakeStatusReporter(ConnectStatusInterface connectStatusInterface) {
        this.mHandshakeStatusReporter = connectStatusInterface;
    }

    public void disconnect(DeviceInfo deviceInfo) {
        cll.c().d(deviceInfo);
    }

    public void pairDevice(DeviceInfo deviceInfo, ConnectMode connectMode) {
        if (deviceInfo == null || deviceInfo.getDeviceMac() == null || connectMode == null) {
            LogUtil.d(TAG, "pair device error. device or connect mode is invalid.");
        } else {
            LogUtil.b(TAG, "pair device.", cpl.a(deviceInfo));
            cll.c().c(deviceInfo, connectMode);
        }
    }
}
