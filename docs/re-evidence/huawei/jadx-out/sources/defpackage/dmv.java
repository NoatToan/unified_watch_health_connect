package defpackage;

import android.text.TextUtils;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class dmv extends MeasurableDevice {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32029c;
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

    public dmv() {
        this("", "", "", "");
    }

    public dmv(String str, String str2, String str3, String str4) {
        this.d = "";
        this.f32027a = str;
        this.f32029c = str2;
        this.f32028b = str3;
        this.e = str4;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public boolean doCreateBond(IDeviceEventHandler iDeviceEventHandler) {
        LogUtil.d("ManualBleDevice", "ManualBleDevice doCreateBond");
        if (iDeviceEventHandler == null) {
            return false;
        }
        iDeviceEventHandler.onStateChanged(7);
        return false;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice, com.huawei.health.device.model.HealthDevice
    public String getDeviceName() {
        return this.f32027a;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public void setDeviceName(String str) {
        this.f32027a = str;
    }

    @Override // com.huawei.health.device.model.HealthDevice
    public String getAddress() {
        return !TextUtils.isEmpty(this.d) ? this.d : this.f32028b;
    }

    @Override // com.huawei.health.device.model.HealthDevice
    public String getUniqueId() {
        return this.f32028b;
    }

    public void d(String str) {
        this.f32028b = str;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public String getProductId() {
        return this.f32029c;
    }

    @Override // com.huawei.health.device.connectivity.comm.MeasurableDevice
    public String getSerialNumber() {
        return this.e;
    }
}
