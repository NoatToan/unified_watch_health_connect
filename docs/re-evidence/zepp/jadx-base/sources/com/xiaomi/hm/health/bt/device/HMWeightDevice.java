package com.xiaomi.hm.health.bt.device;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMWeightDevice;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.model.HMStatisticInfo;
import com.xiaomi.hm.health.bt.model.HMWeightUnit;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.bt.model.WeightSyncResult;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.BleCallBack;
import com.xiaomi.hm.health.bt.profile.base.MKTime;
import com.xiaomi.hm.health.bt.profile.gdsp.weight.HMWeightSyncDataTask;
import com.xiaomi.hm.health.bt.profile.weight.IOFMeasurementCallback;
import com.xiaomi.hm.health.bt.profile.weight.OFMeasurement;
import com.xiaomi.hm.health.bt.profile.weight.WeightBaseProfile;
import com.xiaomi.hm.health.bt.profile.weight.WeightProfile;
import com.xiaomi.hm.health.bt.scan.AdvData;
import com.xiaomi.hm.health.bt.scan.BleScanCenter;
import com.xiaomi.hm.health.bt.scan.BleScanOption;
import com.xiaomi.hm.health.bt.scan.IBleScanCallback;
import java.util.Calendar;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes19.dex */
public class HMWeightDevice extends HMBaseBleDevice implements WeightBaseProfile.IMeasurementChangedCallback {
    private BleScanOption A;
    private IBleScanCallback B;
    private int C;
    private WeightProfile y;
    private HMCallback<WeightAdvData> z;

    public class a extends BleCallBack {
        public final /* synthetic */ HMCallback b;

        public a(final HMCallback val$callback) {
            this.b = val$callback;
        }

        @Override // com.xiaomi.hm.health.bt.profile.base.BleCallBack
        public void onFinish(Object obj) {
            super.onFinish(obj);
            WeightSyncResult weightSyncResult = (WeightSyncResult) obj;
            boolean z = weightSyncResult != null && weightSyncResult.isValid();
            if (z) {
                HMWeightDevice.this.C = weightSyncResult.rebootCount;
                String address = HMWeightDevice.this.getBluetoothDevice() != null ? HMWeightDevice.this.getBluetoothDevice().getAddress() : "";
                if (HMWeightDevice.this.d != null) {
                    weightSyncResult.setDeviceId(HMWeightDevice.this.d.getDeviceID(), address);
                }
            }
            this.b.onData(weightSyncResult);
            this.b.onFinish(z);
        }

        @Override // com.xiaomi.hm.health.bt.profile.base.BleCallBack
        public void onStart() {
            super.onStart();
            this.b.onStart();
        }
    }

    public class b implements IBleScanCallback {
        public b() {
        }

        @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
        public void onScanError(BleScanOption option) {
        }

        @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
        public void onScanStart(BleScanOption option) {
        }

        @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
        public void onScanStop(BleScanOption option) {
        }

        @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
        public void onScanedDevice(AdvData data, BleScanOption option) {
            WeightAdvData weightAdvData = data.weightData;
            if (weightAdvData != null) {
                HMWeightDevice.this.onChanged(weightAdvData);
            }
        }
    }

    public HMWeightDevice(Context context, BluetoothDevice device) {
        super(context, new HMBaseBleDevice.e(device, true));
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = new b();
        this.C = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(enablePartMeasureSync(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c0(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(eraseHistoryRecordSync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d0(HMCallback hMCallback, HMWeightUnit hMWeightUnit) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setUnitSync(hMWeightUnit));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e0(HMCallback hMCallback, OFMeasurement oFMeasurement) {
        hMCallback.sendOnDataMessage(oFMeasurement);
        if (oFMeasurement.isFinish()) {
            hMCallback.sendOnFinishMessage(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f0(IOFMeasurementCallback iOFMeasurementCallback, boolean z, HMCallback hMCallback) {
        if (startOneFootMeasureSync(iOFMeasurementCallback, z)) {
            hMCallback.sendOnStartMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g0(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(stopOneFootMeasureSync());
    }

    private void h0() {
        stopScanWeightValue();
        this.A = new BleScanOption.Builder().scanTimeout(-1).callback(this.B).filterAddress(this.b.a()).build();
        BleScanCenter.getInstance().startScan(this.A);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void create(boolean forceDirectly) {
        super.create(forceDirectly);
        if (forceDirectly) {
            return;
        }
        h0();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public BaseProfile createProfile(Context context, BluetoothDevice device) {
        WeightProfile weightProfile = new WeightProfile(context, device, this);
        this.y = weightProfile;
        weightProfile.addMeasurementChangedCallback(this);
        return this.y;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void destroy() {
        super.destroy();
        stopScanWeightValue();
        setWeightDataCallback(null);
    }

    public void enablePartMeasure(final boolean enable, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: op3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b0(callback, enable);
            }
        });
    }

    public boolean enablePartMeasureSync(boolean enable) {
        return isConnected() && this.y.enablePartMeasure(enable);
    }

    public void eraseHistoryData(final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: lp3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.c0(callback);
            }
        });
    }

    public boolean eraseHistoryRecordSync() {
        return isConnected() && ((WeightBaseProfile) this.mProfile).eraseHistoryRecord();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public HMDeviceType getDeviceType() {
        return HMDeviceType.WEIGHT;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public HMStatisticInfo getStatisticInfoInternal() {
        HMStatisticInfo hMStatisticInfo = new HMStatisticInfo();
        hMStatisticInfo.setRebootCount(this.C);
        return hMStatisticInfo;
    }

    public void i0(BaseProfile profile, long uid, final HMCallback<WeightSyncResult> callback) {
        synchronized (this.mSyncObj) {
            if (callNonConnected(callback)) {
                return;
            }
            Future future = this.mSyncFuture;
            if (future != null && !future.isDone()) {
                Debug.fi(HMBaseBleDevice.q, "startSyncData return as syncing now!!!");
            } else {
                Debug.i(HMBaseBleDevice.q, "start sync data...");
                this.mSyncFuture = submitOnDeviceOnlyThread(new HMWeightSyncDataTask(profile, uid, new a(callback)));
            }
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.weight.WeightBaseProfile.IMeasurementChangedCallback
    public void onChanged(WeightAdvData data) {
        synchronized (this) {
            if (this.z != null) {
                if (this.d != null) {
                    data.setDeviceId(this.d.getDeviceID());
                }
                this.z.sendOnDataMessage(data);
            }
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public void onDeviceConnected() {
        super.onDeviceConnected();
        stopScanWeightValue();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public void onDeviceDisconnected() {
        super.onDeviceDisconnected();
        if (hasDestroy() || !GattUtils.isBluetoothEnable()) {
            return;
        }
        h0();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean setDateTimeSync(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(MKTime.INSTANCE.zoneKeyToTimeZone(0));
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return super.setDateTimeSync(calendar2);
    }

    public void setUnit(final HMWeightUnit unit, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: np3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.d0(callback, unit);
            }
        });
    }

    public boolean setUnitSync(final HMWeightUnit unit) {
        return isConnected() && this.y.setUnit(unit.getValue());
    }

    public void setWeightDataCallback(HMCallback<WeightAdvData> callback) {
        synchronized (this) {
            this.z = callback;
        }
    }

    public void startOneFootMeasure(final HMCallback<OFMeasurement> callback, final boolean forceStart) {
        if (callNonConnected(callback)) {
            return;
        }
        final IOFMeasurementCallback iOFMeasurementCallback = new IOFMeasurementCallback() { // from class: kp3
            @Override // com.xiaomi.hm.health.bt.profile.weight.IOFMeasurementCallback
            public final void onDataChanged(OFMeasurement oFMeasurement) {
                HMWeightDevice.e0(callback, oFMeasurement);
            }
        };
        runOnDeviceMultiThread(new Runnable() { // from class: pp3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.f0(iOFMeasurementCallback, forceStart, callback);
            }
        });
    }

    public boolean startOneFootMeasureSync(IOFMeasurementCallback callback, boolean forceStart) {
        return isConnected() && this.y.startOneFootMeasure(callback, forceStart);
    }

    public void startSyncData(long uid, final HMCallback<WeightSyncResult> callback) {
        i0(getBaseProfile(), uid, callback);
    }

    public void stopOneFootMeasure(final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: mp3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.g0(callback);
            }
        });
    }

    public boolean stopOneFootMeasureSync() {
        return isConnected() && this.y.stopOneFootMeasure();
    }

    public void stopScanWeightValue() {
        if (this.A != null) {
            BleScanCenter.getInstance().stopScan(this.A);
            this.A = null;
        }
    }

    public HMWeightDevice(Context context, String device) {
        this(context, GattUtils.getRemoteDevice(device));
    }
}
