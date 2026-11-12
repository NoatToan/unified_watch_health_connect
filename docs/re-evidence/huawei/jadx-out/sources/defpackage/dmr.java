package defpackage;

import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;

/* JADX INFO: loaded from: classes7.dex */
public class dmr extends MeasurableDevice {
    private String e;

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public boolean connectAsync(IHealthDeviceCallback iHealthDeviceCallback) {
        return false;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public void disconnect() {
    }

    public String c() {
        return this.e;
    }

    public void a(String str) {
        this.e = str;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public boolean doCreateBond(IDeviceEventHandler iDeviceEventHandler) {
        iDeviceEventHandler.onStateChanged(7);
        updateDeviceUsedTime(1, "DnurseGlucose");
        return false;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public boolean doRemoveBond() {
        updateDeviceUsedTime(2, "DnurseGlucose");
        return false;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public boolean connectSync(int i) {
        updateDeviceUsedTime(3, "DnurseGlucose");
        return true;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice, com.huawei.health.device.model.HealthDevice
    public String getDeviceName() {
        return "DnurseGlucose";
    }

    @Override // com.huawei.health.device.model.HealthDevice
    public String getAddress() {
        return "DnurseGlucose";
    }

    @Override // com.huawei.health.device.model.HealthDevice
    public String getUniqueId() {
        return "DnurseGlucose";
    }
}
