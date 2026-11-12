package defpackage;

import com.huawei.devicesdk.callback.DeviceStatusChangeCallback;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.constant.ConnectState;

/* JADX INFO: loaded from: classes7.dex */
public class dmi implements DeviceStatusChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private doq f32003a;

    public dmi() {
        if (this.f32003a == null) {
            this.f32003a = doq.e();
        }
    }

    @Override // com.huawei.devicesdk.callback.DeviceStatusChangeCallback
    public void onConnectStatusChanged(DeviceInfo deviceInfo, int i, int i2) {
        LogUtil.a("PluginDevice_UdsConnectCallback", "onUdsConnectStatusChanged status:", Integer.valueOf(i), " errCode:", Integer.valueOf(i2));
        if (this.f32003a == null) {
            LogUtil.j("PluginDevice_UdsConnectCallback", "onConnectStatusChanged mHwWspMeasureController is null");
            return;
        }
        if (deviceInfo == null) {
            LogUtil.j("onConnectStatusChanged deviceInfo is null", new Object[0]);
            return;
        }
        if (deviceInfo.getDeviceBtType() > 0) {
            LogUtil.j("onConnectStatusChanged DeviceBtType:", Integer.valueOf(deviceInfo.getDeviceBtType()));
            return;
        }
        ConnectState connectState = ConnectState.getConnectState(i);
        if (connectState == ConnectState.CONNECTED) {
            this.f32003a.d(deviceInfo.getDeviceMac());
            enm.b(deviceInfo.getDeviceMac(), 1);
        } else if (connectState == ConnectState.DISCONNECTED) {
            this.f32003a.d();
            enm.b(deviceInfo.getDeviceMac(), 0);
        } else if (connectState == ConnectState.CONNECTING) {
            this.f32003a.c();
            LogUtil.a("PluginDevice_UdsConnectCallback", "onUdsConnectStatusChanged State == CONNECTING");
        } else {
            LogUtil.j("PluginDevice_UdsConnectCallback", "onUdsConnectStatusChanged State is unknown");
        }
    }
}
