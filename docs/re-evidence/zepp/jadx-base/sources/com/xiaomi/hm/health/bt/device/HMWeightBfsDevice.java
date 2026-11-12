package com.xiaomi.hm.health.bt.device;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.xiaomi.hm.health.bt.model.HMWeightUnit;
import com.xiaomi.hm.health.bt.model.WeightSyncResult;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.weight.IOFMeasurementCallback;
import com.xiaomi.hm.health.bt.profile.weight.WeightBfsProfile;

/* JADX INFO: loaded from: classes19.dex */
public class HMWeightBfsDevice extends HMWeightDevice {
    private WeightBfsProfile D;

    public HMWeightBfsDevice(Context context, BluetoothDevice device) {
        super(context, device);
        this.D = null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMWeightDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public BaseProfile createProfile(Context context, BluetoothDevice device) {
        WeightBfsProfile weightBfsProfile = new WeightBfsProfile(context, device, this);
        this.D = weightBfsProfile;
        weightBfsProfile.addMeasurementChangedCallback(this);
        return this.D;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMWeightDevice
    public boolean enablePartMeasureSync(boolean enable) {
        return isConnected() && this.D.enablePartMeasure(enable);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMWeightDevice
    public boolean setUnitSync(HMWeightUnit unit) {
        return isConnected() && this.D.setUnit(unit.getValue());
    }

    @Override // com.xiaomi.hm.health.bt.device.HMWeightDevice
    public boolean startOneFootMeasureSync(IOFMeasurementCallback callback, boolean forceStart) {
        return isConnected() && this.D.startOneFootMeasure(callback, forceStart);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMWeightDevice
    public void startSyncData(long uid, final HMCallback<WeightSyncResult> callback) {
        i0(this.D, uid, callback);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMWeightDevice
    public boolean stopOneFootMeasureSync() {
        return isConnected() && this.D.stopOneFootMeasure();
    }

    public HMWeightBfsDevice(Context context, String device) {
        super(context, device);
        this.D = null;
    }
}
