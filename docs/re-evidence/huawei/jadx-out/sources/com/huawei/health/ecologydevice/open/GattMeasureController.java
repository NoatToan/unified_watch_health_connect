package com.huawei.health.ecologydevice.open;

import android.bluetooth.BluetoothGattCallback;
import android.os.Bundle;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.BleMeasureController;
import defpackage.efx;
import defpackage.efy;

/* JADX INFO: loaded from: classes7.dex */
public abstract class GattMeasureController extends BleMeasureController {
    public efx mDevice;

    protected abstract BluetoothGattCallback getGattCallbackImpl();

    @Override // com.huawei.health.device.open.MeasureController
    public boolean prepare(HealthDevice healthDevice, IHealthDeviceCallback iHealthDeviceCallback, Bundle bundle) {
        if (!(healthDevice instanceof efx) || iHealthDeviceCallback == null) {
            return false;
        }
        efx efxVar = (efx) healthDevice;
        this.mDevice = efxVar;
        efxVar.e(getGattCallbackImpl());
        return true;
    }

    @Override // com.huawei.health.device.open.MeasureController
    public void ending() {
        efx efxVar = this.mDevice;
        if (efxVar != null) {
            efxVar.disconnect();
            this.mDevice.e(null);
            efy.c().b(this.mDevice.getAddress());
        }
    }
}
