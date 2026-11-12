package com.xiaomi.hm.health.bt.device;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.model.HMStatisticInfo;
import com.xiaomi.hm.health.bt.model.selftest.HMNormandyTestInfo;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.profile.auth.HMProAuthController;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.NewProtocolSuccess;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataTask;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.discrete.HMProSyncDiscreteDataTask;
import com.xiaomi.hm.health.bt.profile.grsp.HMProSensorDataController;
import com.xiaomi.hm.health.bt.profile.grsp.IHMSensorDataCallback;
import com.xiaomi.hm.health.bt.profile.normandy.HMCalibrateConfig;
import com.xiaomi.hm.health.bt.profile.normandy.HMCalibrateResult;
import com.xiaomi.hm.health.bt.profile.normandy.NormandyProfile;
import com.xiaomi.hm.health.bt.proxy.ProxyContainer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes19.dex */
public class HMNormandyDevice extends HMBaseBleDevice {
    private static final List<String> A = new a();
    private NormandyProfile y;
    private HMProSensorDataController z;

    public class a extends ArrayList<String> {
        public a() {
            addAll(ProxyContainer.getProxy().getNormandyNames());
        }
    }

    public HMNormandyDevice(Context context, BluetoothDevice device) {
        super(context, new HMBaseBleDevice.e(device, true));
        this.y = null;
        this.z = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(HMCallback hMCallback, HMCalibrateConfig hMCalibrateConfig) {
        hMCallback.sendOnStartMessage();
        HMCalibrateResult hMCalibrateResultCalibrate = this.y.calibrate(hMCalibrateConfig);
        hMCallback.sendOnDataMessage(hMCalibrateResultCalibrate);
        hMCallback.sendOnFinishMessage(hMCalibrateResultCalibrate != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.y.enableConnectedAdv(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a0(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.y.enableSixAxis(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        HMNormandyTestInfo hMNormandyTestInfoSelfTest = this.y.selfTest();
        hMCallback.sendOnDataMessage(hMNormandyTestInfoSelfTest);
        hMCallback.sendOnFinishMessage(hMNormandyTestInfoSelfTest != null);
    }

    public static List<String> getSupportDeviceNames() {
        return A;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public AuthResult auth(AuthInfo info, IHMAuthCallback callback) {
        Debug.i(HMBaseBleDevice.q, "auth:" + info);
        return info.needAuth() ? new HMProAuthController(this.y).auth(info, callback) : new AuthResult(0, NewProtocolSuccess.INSTANCE);
    }

    public void calibrate(final HMCalibrateConfig config, final HMCallback<HMCalibrateResult> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: ob3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.Y(callback, config);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public BaseProfile createProfile(Context context, BluetoothDevice device) {
        NormandyProfile normandyProfile = new NormandyProfile(context, device, this);
        this.y = normandyProfile;
        this.z = new HMProSensorDataController(normandyProfile);
        return this.y;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.IBleInterface
    public void enableConnectedAdv(final boolean enable, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: qb3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.Z(callback, enable);
            }
        });
    }

    public void enableSixAxis(final boolean enable, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: pb3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a0(callback, enable);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public HMDeviceType getDeviceType() {
        return HMDeviceType.SHOES;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public HMStatisticInfo getStatisticInfoInternal() {
        int versionCodeFromVersionName = ProfileUtils.getVersionCodeFromVersionName("V6.0.0");
        DeviceInfo deviceInfo = getDeviceInfo();
        return (deviceInfo == null || deviceInfo.getFirmwareVersion() < versionCodeFromVersionName) ? this.y.getStatisticInfo() : this.y.getStatisticInfoNew();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public void onDeviceConnected() {
        super.onDeviceConnected();
        this.y.registerRealtimeStepCallback(this);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean reset() {
        return isConnected() && this.y.reset();
    }

    public void selfTest(final HMCallback<HMNormandyTestInfo> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: nb3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b0(callback);
            }
        });
    }

    public void startSensorData(final int type, final IHMSensorDataCallback callback) {
        HMProSensorDataController hMProSensorDataController;
        if (isConnected() && (hMProSensorDataController = this.z) != null) {
            hMProSensorDataController.startAsync(type, callback);
        } else {
            callback.onSensorStart();
            callback.onSensorStop(false);
        }
    }

    public void stopSensorData() {
        HMProSensorDataController hMProSensorDataController = this.z;
        if (hMProSensorDataController != null) {
            hMProSensorDataController.stopAsync();
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public Future syncData(Calendar calendar, IHMActivityDataCallback callback) {
        DeviceInfo deviceInfo = getDeviceInfo();
        if (deviceInfo == null) {
            Debug.fi(HMBaseBleDevice.q, "getDeviceInfo return null!!!");
            return null;
        }
        int firmwareVersion = deviceInfo.getFirmwareVersion();
        return (firmwareVersion >= ProfileUtils.getVersionCodeFromVersionName("V6.0.0") || firmwareVersion <= 196638) ? submitOnDeviceOnlyThread(new HMProSyncDataTask(this.y, deviceInfo, calendar, callback)) : submitOnDeviceOnlyThread(new HMProSyncDiscreteDataTask(this.y, deviceInfo.getDeviceSource(), calendar, callback));
    }

    public HMNormandyDevice(Context context, String device) {
        this(context, GattUtils.getRemoteDevice(device));
    }
}
