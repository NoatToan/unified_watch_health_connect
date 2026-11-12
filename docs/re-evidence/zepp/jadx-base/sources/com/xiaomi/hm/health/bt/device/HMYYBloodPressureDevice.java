package com.xiaomi.hm.health.bt.device;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.model.HMStatisticInfo;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.bloodpressure.YYBloodPressureProfile;
import com.xiaomi.hm.health.bt.profile.gdsp.yuyuedevice.BPData;
import com.xiaomi.hm.health.bt.profile.gdsp.yuyuedevice.HMSyncYYPressureDataTask;
import com.xiaomi.hm.health.bt.profile.gdsp.yuyuedevice.IBPSyncCallback;
import java.util.Calendar;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public class HMYYBloodPressureDevice extends HMBaseBleDevice implements IBPSyncCallback {
    private static final String z = "HMYYBloodPressureDevice";
    private IBPSyncCallback y;

    public HMYYBloodPressureDevice(Context context, BluetoothDevice device) {
        super(context, new HMBaseBleDevice.e(device, false));
    }

    private YYBloodPressureProfile U() {
        return (YYBloodPressureProfile) this.mProfile;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public AuthResult auth(AuthInfo info, IHMAuthCallback callback) {
        if (!info.needAuth()) {
            return super.auth(info, callback);
        }
        if (!U().setDateTime(Calendar.getInstance())) {
            Debug.fi(z, "auth failed");
        }
        return super.auth(info, callback);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public BaseProfile createProfile(Context context, BluetoothDevice device) {
        YYBloodPressureProfile yYBloodPressureProfile = new YYBloodPressureProfile(context, device, this);
        yYBloodPressureProfile.setSyncDataCallback(this);
        yYBloodPressureProfile.setAutoReconnect(false);
        return yYBloodPressureProfile;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public HMDeviceType getDeviceType() {
        return HMDeviceType.BLOOD_PRESSURE;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public HMStatisticInfo getStatisticInfoInternal() {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.yuyuedevice.IBPSyncCallback
    public void onBPData(@NotNull BPData bpData) {
        IBPSyncCallback iBPSyncCallback = this.y;
        if (iBPSyncCallback != null) {
            iBPSyncCallback.onBPData(bpData);
        }
    }

    public void setBpDataCallback(IBPSyncCallback bpDataCallback) {
        this.y = bpDataCallback;
    }

    public void startSyncData(Calendar time, HMCallback<BPData> callback, HMDeviceSource source) {
        if (isConnected()) {
            runOnDeviceOnlyThread(new HMSyncYYPressureDataTask(U(), time, callback, source));
        } else {
            callback.onStart();
            callback.onFinish(false);
        }
    }

    public HMYYBloodPressureDevice(Context context, String address) {
        this(context, GattUtils.getRemoteDevice(address));
    }
}
