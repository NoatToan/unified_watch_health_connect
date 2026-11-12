package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class dmy extends efx {
    @Override // defpackage.efx, com.huawei.health.device.connectivity.comm.MeasurableDevice
    public boolean connectAsync(IHealthDeviceCallback iHealthDeviceCallback) {
        return false;
    }

    private dmy(BluetoothDevice bluetoothDevice) {
        try {
            LogUtil.a("PartnerBleDevice", bluetoothDevice.getName(), " PartnerBleDevice is constructed");
            this.e = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(bluetoothDevice.getAddress());
            super.setDeviceName(this.e.getName());
        } catch (SecurityException e) {
            LogUtil.e("PartnerBleDevice", "PartnerBleDevice SecurityException:", ExceptionUtils.c(e));
        }
    }

    private dmy() {
    }

    @Override // defpackage.efx, com.huawei.health.device.model.HealthDevice
    public String getUniqueId() {
        return getAddress();
    }

    @Override // defpackage.efx, com.huawei.health.device.connectivity.comm.MeasurableDevice, com.huawei.health.device.model.HealthDevice
    public String getDeviceName() {
        if (this.e == null) {
            return "";
        }
        String name = this.e.getName();
        if (name != null) {
            LogUtil.d("PartnerBleDevice", "PartnerBleDevice name : ", name);
            return name;
        }
        return super.getDeviceName();
    }

    @Override // defpackage.efx, com.huawei.health.device.model.HealthDevice
    public String getAddress() {
        if (this.e != null) {
            return this.e.getAddress();
        }
        return "";
    }

    public static dmy e(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice != null) {
            return new dmy(bluetoothDevice);
        }
        return new dmy();
    }

    @Override // defpackage.efx, com.huawei.health.device.connectivity.comm.MeasurableDevice
    public boolean doRemoveBond() {
        if (this.e == null) {
            return false;
        }
        updateDeviceUsedTime(2, this.e.getAddress());
        return false;
    }

    @Override // defpackage.efx, com.huawei.health.device.connectivity.comm.MeasurableDevice
    public boolean connectSync(int i) {
        updateDeviceUsedTime(3, this.e.getAddress());
        return true;
    }
}
