package com.xiaomi.hm.health.bt.device;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.text.TextUtils;
import com.huami.bluetooth.device.RealtimeHeartRateDevice;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.model.HMStatisticInfo;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.profile.auth.HMProAuthController;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.NewProtocolSuccess;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.grsp.HMProSensorDataController;
import com.xiaomi.hm.health.bt.profile.grsp.IHMSensorDataCallback;
import com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController;
import com.xiaomi.hm.health.bt.profile.milipro.MiLiProProfile;
import com.xiaomi.hm.health.bt.proxy.ProxyContainer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class HMBMDevice extends HMBaseBleDevice implements RealtimeHeartRateDevice {
    private static final HashMap<String, HMDeviceSource> A = new a();
    public MiLiProProfile miLiProProfile;
    private HMProSensorDataController y;
    private HMHeartRateController z;

    public class a extends HashMap<String, HMDeviceSource> {
        public a() {
            putAll(ProxyContainer.getProxy().getBMNames());
        }
    }

    public HMBMDevice(Context context, BluetoothDevice device) {
        super(context, new HMBaseBleDevice.e(device, false));
        this.miLiProProfile = null;
        this.y = null;
        this.z = null;
    }

    public static List<String> getSupportDeviceNames() {
        return new ArrayList(A.keySet());
    }

    public static boolean isSupportDeviceName(String deviceName) {
        return (TextUtils.isEmpty(deviceName) || A.get(deviceName) == null) ? false : true;
    }

    public static HMDeviceSource nameToSource(String deviceName) {
        return A.get(deviceName);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public AuthResult auth(AuthInfo info, IHMAuthCallback callback) {
        return info.needAuth() ? new HMProAuthController(this.miLiProProfile).auth(info, callback) : new AuthResult(0, NewProtocolSuccess.INSTANCE);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public BaseProfile createProfile(Context context, BluetoothDevice device) {
        MiLiProProfile miLiProProfileNewProfile = newProfile(context, device);
        this.miLiProProfile = miLiProProfileNewProfile;
        this.y = new HMProSensorDataController(miLiProProfileNewProfile);
        this.z = new HMHeartRateController(this.miLiProProfile);
        return this.miLiProProfile;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public HMDeviceType getDeviceType() {
        return HMDeviceType.OTHER;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public HMStatisticInfo getStatisticInfoInternal() {
        return this.miLiProProfile.getStatisticInfo();
    }

    public MiLiProProfile newProfile(Context context, BluetoothDevice device) {
        return new MiLiProProfile(context, device, this);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public void onDeviceConnected() {
        super.onDeviceConnected();
        this.miLiProProfile.registerRealtimeStepCallback(this);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public void onDeviceConnecting() {
        super.onDeviceConnecting();
        HMHeartRateController hMHeartRateController = this.z;
        if (hMHeartRateController != null) {
            hMHeartRateController.disconnect();
        }
    }

    @Override // com.huami.bluetooth.device.RealtimeHeartRateDevice
    public void startRealtimeMeasureHr(final HMHeartRateController.IHeartRateCallback callback) {
        if (isConnected()) {
            this.z.startRealtimeMeasureAsync(callback);
        } else {
            callback.onOpen(false);
        }
    }

    public void startSensorData(final int type, final IHMSensorDataCallback callback) {
        HMProSensorDataController hMProSensorDataController;
        if (isConnected() && (hMProSensorDataController = this.y) != null) {
            hMProSensorDataController.startAsync(type, callback);
        } else {
            callback.onSensorStart();
            callback.onSensorStop(false);
        }
    }

    @Override // com.huami.bluetooth.device.RealtimeHeartRateDevice
    public void stopRealtimeMeasureHr() {
        if (isConnected()) {
            this.z.stopRealtimeMeasureAsync();
        }
    }

    public void stopSensorData() {
        HMProSensorDataController hMProSensorDataController = this.y;
        if (hMProSensorDataController != null) {
            hMProSensorDataController.stopAsync();
        }
    }

    public HMBMDevice(Context context, String address) {
        this(context, GattUtils.getRemoteDevice(address));
    }
}
