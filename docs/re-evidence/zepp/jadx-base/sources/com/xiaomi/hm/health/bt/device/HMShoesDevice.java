package com.xiaomi.hm.health.bt.device;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.model.HMStatisticInfo;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.OldProtocolSuccess;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.BleCallBack;
import com.xiaomi.hm.health.bt.profile.base.LEParams;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMRunningSyncDataTask;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback;
import com.xiaomi.hm.health.bt.profile.grsp.HMMiLiSensorDataController;
import com.xiaomi.hm.health.bt.profile.grsp.IHMSensorDataCallback;
import com.xiaomi.hm.health.bt.profile.running.HMRunningCalibrateTask;
import com.xiaomi.hm.health.bt.profile.running.RunningProfile;
import java.util.Calendar;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes19.dex */
public class HMShoesDevice extends HMBaseBleDevice {
    private RunningProfile y;
    private HMMiLiSensorDataController z;

    public class a extends BleCallBack {
        public final /* synthetic */ HMCallback b;

        public a(final HMCallback val$callback) {
            this.b = val$callback;
        }

        @Override // com.xiaomi.hm.health.bt.profile.base.BleCallBack
        public void onFinish(Object obj) {
            super.onFinish(obj);
            this.b.sendOnFinishMessage(obj != null && ((Boolean) obj).booleanValue());
        }

        @Override // com.xiaomi.hm.health.bt.profile.base.BleCallBack
        public void onStart() {
            super.onStart();
            this.b.sendOnStartMessage();
        }
    }

    public HMShoesDevice(Context context, BluetoothDevice device) {
        super(context, new HMBaseBleDevice.e(device, true));
        this.y = null;
        this.z = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        int batteryLevel = this.y.getBatteryLevel();
        hMCallback.sendOnDataMessage(Integer.valueOf(batteryLevel));
        hMCallback.sendOnFinishMessage(batteryLevel >= 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(IHMSensorDataCallback iHMSensorDataCallback) {
        this.z.start(iHMSensorDataCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z() {
        this.z.stop();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public AuthResult auth(AuthInfo info, IHMAuthCallback callback) {
        if (info != null && info.needAuth()) {
            Calendar calendar = Calendar.getInstance();
            calendar.clear();
            calendar.set(1, 1970);
            Debug.fi(HMBaseBleDevice.q, "auth result:" + (this.y.setDateTime(calendar) & this.y.setDateTime(Calendar.getInstance())));
        }
        return new AuthResult(0, OldProtocolSuccess.INSTANCE);
    }

    public void calibrate(final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new HMRunningCalibrateTask(this.y, new a(callback)));
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public BaseProfile createProfile(Context context, BluetoothDevice device) {
        RunningProfile runningProfile = new RunningProfile(context, device, this);
        this.y = runningProfile;
        this.z = new HMMiLiSensorDataController(runningProfile);
        return this.y;
    }

    public void getBatteryLevel(final HMCallback<Integer> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: lg3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.X(callback);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public HMDeviceType getDeviceType() {
        return HMDeviceType.SHOES;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public HMStatisticInfo getStatisticInfoInternal() {
        return this.y.getStatisticInfo();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public void onDeviceConnected() {
        super.onDeviceConnected();
        this.y.registerRealtimeStepCallback(this);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public boolean setLatency(int minLatency, int maxLatency) {
        LEParams lEParams = this.y.getLEParams();
        Debug.fi(HMBaseBleDevice.q, "lep:" + lEParams);
        if (lEParams != null && ((minLatency < 60 && lEParams.getConnInt() < 60) || Math.abs(minLatency - lEParams.getConnInt()) <= ((double) minLatency) * 0.1d)) {
            return true;
        }
        boolean lEParams2 = this.y.setLEParams(minLatency, minLatency, 0, 500, 0);
        Debug.fi(HMBaseBleDevice.q, "lep:" + this.y.getLEParams());
        return lEParams2;
    }

    public void startSensorData(final int type, final IHMSensorDataCallback callback) {
        HMMiLiSensorDataController hMMiLiSensorDataController;
        if (isConnected() && (hMMiLiSensorDataController = this.z) != null && !hMMiLiSensorDataController.isRunning()) {
            runOnDeviceMultiThread(new Runnable() { // from class: mg3
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.Y(callback);
                }
            });
        } else {
            callback.onSensorStart();
            callback.onSensorStop(false);
        }
    }

    public void stopSensorData() {
        if (isConnected()) {
            runOnDeviceMultiThread(new Runnable() { // from class: kg3
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.Z();
                }
            });
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public Future syncData(Calendar calendar, IHMActivityDataCallback callback) {
        return submitOnDeviceOnlyThread(new HMRunningSyncDataTask(this.y, callback));
    }

    public HMShoesDevice(Context context, String device) {
        this(context, GattUtils.getRemoteDevice(device));
    }
}
