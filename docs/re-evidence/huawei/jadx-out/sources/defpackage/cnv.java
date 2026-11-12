package defpackage;

import android.text.TextUtils;
import com.huawei.devicesdk.entity.ConnectMode;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.strategy.ConnectStrategy;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class cnv extends ConnectStrategy {
    @Override // com.huawei.devicesdk.strategy.ConnectStrategy
    public void destroy(String str) {
    }

    @Override // com.huawei.devicesdk.strategy.ConnectStrategy
    public void onChannelEnable(DeviceInfo deviceInfo, int i) {
    }

    @Override // com.huawei.devicesdk.strategy.ConnectStrategy
    public void onDataReceived(DeviceInfo deviceInfo, cmm cmmVar, int i) {
    }

    @Override // com.huawei.devicesdk.strategy.ConnectStrategy
    public void connect(ConnectMode connectMode, DeviceInfo deviceInfo) {
        super.connect(connectMode, deviceInfo);
    }

    @Override // com.huawei.devicesdk.strategy.ConnectStrategy
    public void getConnectStatus(String str) {
        LogUtil.b("ConnectStrategyTransparent", "getConnectStatus start");
    }

    @Override // com.huawei.devicesdk.strategy.ConnectStrategy
    public void startHandshake(DeviceInfo deviceInfo) {
        if (this.mHandshakeStatusReporter == null) {
            LogUtil.e("ConnectStrategyTransparent", "handshake status callback is null", cpl.a(deviceInfo));
        } else {
            this.mHandshakeStatusReporter.onHandshakeFinish(deviceInfo);
        }
    }

    @Override // com.huawei.devicesdk.strategy.ConnectStrategy
    public void disconnect(DeviceInfo deviceInfo) {
        if (deviceInfo == null || TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
            LogUtil.e("ConnectStrategyTransparent", "disconnect error. device info is invalid.");
        } else {
            super.disconnect(deviceInfo);
        }
    }

    @Override // com.huawei.devicesdk.strategy.ConnectStrategy
    public void unPairDevice(DeviceInfo deviceInfo, ConnectMode connectMode, boolean z) {
        if (deviceInfo == null) {
            LogUtil.e("ConnectStrategyTransparent", "ConnectStrategySimple unPairDevice device null");
        } else {
            cll.c().d(deviceInfo, connectMode);
        }
    }
}
