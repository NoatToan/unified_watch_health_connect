package com.xiaomi.hm.health.bt.device;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.xiaomi.hm.health.bt.model.HMStatisticInfo;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertController;
import com.xiaomi.hm.health.bt.profile.amazfit.AmazfitProfile;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.OldAppAuthError;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.OldProtocolSuccess;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.grsp.HMMiLiSensorDataController;
import com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController;
import com.xiaomi.hm.health.bt.proxy.ProxyContainer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class HMAmazfitDevice extends HMMiLiDevice {
    private static final HashMap<String, HMDeviceSource> F = new a();
    private AmazfitProfile D;
    private Calendar E;

    public class a extends HashMap<String, HMDeviceSource> {
        public a() {
            putAll(ProxyContainer.getProxy().getAmazfitNames());
        }
    }

    public HMAmazfitDevice(Context context, BluetoothDevice device) {
        super(context, device);
        this.D = null;
        this.E = null;
    }

    public static List<String> getSupportDeviceNames() {
        return new ArrayList(F.keySet());
    }

    public static boolean isSupportDeviceName(String deviceName) {
        return (TextUtils.isEmpty(deviceName) || F.get(deviceName) == null) ? false : true;
    }

    public static HMDeviceSource nameToSource(String deviceName) {
        return F.get(deviceName);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public AuthResult auth(AuthInfo info, IHMAuthCallback callback) {
        if (info.needAuth()) {
            return this.D.auth(info.getUserInfo(), callback) ? new AuthResult(0, OldProtocolSuccess.INSTANCE) : new AuthResult(7, OldAppAuthError.AUTH_FAIL);
        }
        return new AuthResult(0, OldProtocolSuccess.INSTANCE);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public BaseProfile createProfile(Context context, BluetoothDevice device) {
        AmazfitProfile amazfitProfile = new AmazfitProfile(context, device, this);
        this.D = amazfitProfile;
        this.y = amazfitProfile;
        this.z = new HMMiLiSensorDataController(amazfitProfile);
        this.alertController = new HMAlertController(this.y);
        return this.D;
    }

    @Nullable
    public Calendar getConnectTime() {
        return this.E;
    }

    public DeviceInfo getDeviceInfoSync() {
        AmazfitProfile amazfitProfile = this.D;
        if (amazfitProfile != null) {
            return amazfitProfile.getDeviceInfo();
        }
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public HMStatisticInfo getStatisticInfoInternal() {
        return this.D.getStatisticInfo();
    }

    public int getUidCrcSync() {
        AmazfitProfile amazfitProfile = this.D;
        if (amazfitProfile != null) {
            return amazfitProfile.getUserId();
        }
        return 65535;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public void initInfoAfterAuthSuccess() {
        this.E = getDateTimeSync();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean reset() {
        return isConnected() && this.D.factoryReset();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.huami.bluetooth.device.RealtimeHeartRateDevice
    public void startRealtimeMeasureHr(HMHeartRateController.IHeartRateCallback callback) {
        if (callback != null) {
            callback.onOpen(false);
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.huami.bluetooth.device.RealtimeHeartRateDevice
    public void stopRealtimeMeasureHr() {
    }

    public HMAmazfitDevice(Context context, String device) {
        super(context, device);
        this.D = null;
        this.E = null;
    }
}
