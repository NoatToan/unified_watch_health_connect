package defpackage;

import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;

/* JADX INFO: loaded from: classes7.dex */
public class dmt extends MeasurableDevice {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32024b;
    private int d;

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public boolean connectAsync(IHealthDeviceCallback iHealthDeviceCallback) {
        return true;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public boolean connectSync(int i) {
        return true;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public void disconnect() {
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public boolean doCreateBond(IDeviceEventHandler iDeviceEventHandler) {
        return false;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public boolean doRemoveBond() {
        return false;
    }

    public dmt(String str, String str2, int i) {
        this.f32023a = str;
        this.f32024b = str2;
        this.d = i;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice, com.huawei.health.device.model.HealthDevice
    public String getDeviceName() {
        return this.f32023a;
    }

    @Override // com.huawei.health.device.model.HealthDevice
    public String getAddress() {
        return this.f32024b;
    }

    @Override // com.huawei.health.device.model.HealthDevice
    public String getUniqueId() {
        return this.f32024b;
    }

    public int a() {
        return this.d;
    }
}
