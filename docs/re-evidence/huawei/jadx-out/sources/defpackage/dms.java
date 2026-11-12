package defpackage;

import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class dms extends MeasurableDevice {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32022a;
    private String d;
    private String e;

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public boolean connectAsync(IHealthDeviceCallback iHealthDeviceCallback) {
        return false;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public boolean connectSync(int i) {
        return false;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public void disconnect() {
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public boolean doRemoveBond() {
        return false;
    }

    public dms(String str, String str2, String str3) {
        this.d = str;
        this.e = str2;
        this.f32022a = str3;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public boolean doCreateBond(IDeviceEventHandler iDeviceEventHandler) {
        LogUtil.d("DeviceAutoTestDevice", "DeviceAutoTestDevice doCreateBond");
        iDeviceEventHandler.onStateChanged(7);
        return false;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice, com.huawei.health.device.model.HealthDevice
    public String getDeviceName() {
        return this.d;
    }

    @Override // com.huawei.health.device.model.HealthDevice
    public String getAddress() {
        return this.e;
    }

    @Override // com.huawei.health.device.model.HealthDevice
    public String getUniqueId() {
        return this.f32022a;
    }
}
