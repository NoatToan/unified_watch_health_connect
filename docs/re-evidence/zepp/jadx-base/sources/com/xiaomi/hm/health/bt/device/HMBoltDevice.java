package com.xiaomi.hm.health.bt.device;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.model.HMStatisticInfo;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.profile.auth.HMProAuthController;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.NewProtocolSuccess;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.bolt.BoltProfile;
import com.xiaomi.hm.health.bt.profile.dfu.HMDfuTask;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.ftms.FTMSCommand;
import com.xiaomi.hm.health.bt.profile.ftms.HMFTMSProfile;
import com.xiaomi.hm.health.bt.profile.ftms.IFTMSListener;
import com.xiaomi.hm.health.bt.profile.ftms.MachineStatus;
import com.xiaomi.hm.health.bt.profile.ftms.TreadmillData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataTask;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.UserInfo;
import com.xiaomi.hm.health.bt.profile.sport.HMSportController;
import com.xiaomi.hm.health.bt.profile.sport.IHMSportListener;
import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import com.xiaomi.hm.health.bt.profile.sport.SportConfig;
import com.xiaomi.hm.health.bt.profile.sport.SportInfo;
import com.xiaomi.hm.health.bt.profile.user.BirthDateExt;
import com.xiaomi.hm.health.bt.profile.user.GenderExt;
import com.xiaomi.hm.health.bt.profile.user.HMUserProfile;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes19.dex */
public class HMBoltDevice extends HMBaseBleDevice implements IFTMSListener {
    private static final List<String> E = new a();
    private HMUserProfile A;
    private HMSportController B;
    private HMFTMSProfile C;
    private IFTMSListener D;
    private HMProAuthController y;
    private BoltProfile z;

    public class a extends ArrayList<String> {
        public a() {
            add("Bolt");
        }
    }

    public HMBoltDevice(Context context, BluetoothDevice device) {
        super(context, new HMBaseBleDevice.e(device, true));
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.z.disableNotify());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(HMCallback hMCallback, FTMSCommand fTMSCommand) {
        hMCallback.sendOnStartMessage();
        HMFTMSProfile hMFTMSProfile = this.C;
        hMCallback.sendOnFinishMessage(hMFTMSProfile != null && hMFTMSProfile.sendFTMSCommand(fTMSCommand));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a0(HMCallback hMCallback, int i) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.z.syncHr(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0(HMCallback hMCallback, String str) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.z.syncMacAddress(str));
    }

    public static List<String> getSupportDeviceNames() {
        return E;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public AuthResult auth(AuthInfo info, IHMAuthCallback callback) {
        UserInfo userInfo = info.getUserInfo();
        if (userInfo == null) {
            Debug.fi(HMBaseBleDevice.q, "user info is null!!!");
            return new AuthResult(0, NewProtocolSuccess.INSTANCE);
        }
        Debug.fi(HMBaseBleDevice.q, "setUserInfo:" + this.A.setUserInfo(new UserInfoExt(userInfo.uid, userInfo.height, userInfo.weight, GenderExt.fromValue(userInfo.gender), new BirthDateExt((short) (Calendar.getInstance().get(1) - userInfo.age), (byte) 1, (byte) 1))));
        boolean dateTime = this.z.setDateTime(Calendar.getInstance());
        Debug.fi(HMBaseBleDevice.q, "setDateTime:" + dateTime);
        if (!info.needAuth()) {
            return new AuthResult(0, NewProtocolSuccess.INSTANCE);
        }
        HMProAuthController hMProAuthController = new HMProAuthController(this.z);
        this.y = hMProAuthController;
        AuthResult authResultAuth = hMProAuthController.auth(info, callback);
        Debug.fi(HMBaseBleDevice.q, "auth:" + dateTime);
        return authResultAuth;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public BaseProfile createProfile(Context context, BluetoothDevice device) {
        this.z = new BoltProfile(context, device, this);
        this.A = new HMUserProfile(this.z);
        this.B = new HMSportController(this.z);
        this.C = new HMFTMSProfile(this.z);
        return this.z;
    }

    public void disableNotify(final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: ep2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.Y(callback);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public HMDeviceType getDeviceType() {
        return HMDeviceType.TREADMILL;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public HMStatisticInfo getStatisticInfoInternal() {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.gatt.IGattCallback.IConnectionStateChangeCallback
    public void onDeviceConnected(BluetoothDevice device) {
        HMFTMSProfile hMFTMSProfile = this.C;
        if (hMFTMSProfile != null) {
            hMFTMSProfile.setListener(this);
            this.C.init();
        }
        super.onDeviceConnected(device);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public void onDeviceConnecting() {
        HMSportController hMSportController = this.B;
        if (hMSportController != null) {
            hMSportController.disconnect();
        }
        super.onDeviceConnecting();
    }

    @Override // com.xiaomi.hm.health.bt.profile.ftms.IFTMSListener
    public void onMachineStatus(MachineStatus status) {
        IFTMSListener iFTMSListener = this.D;
        if (iFTMSListener != null) {
            iFTMSListener.onMachineStatus(status);
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.ftms.IFTMSListener
    public void onTreadmillData(TreadmillData data) {
        IFTMSListener iFTMSListener = this.D;
        if (iFTMSListener != null) {
            iFTMSListener.onTreadmillData(data);
        }
    }

    public void sendFTMSCommand(final FTMSCommand command, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: gp2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.Z(callback, command);
            }
        });
    }

    public void sendSportCommand(final SportCommand command, final SportInfo info, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        this.B.sendCommand(command, info);
    }

    public void sendSportConfig(final SportConfig config, final IHMSportListener listener, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        this.B.sendConfig(config, listener);
    }

    public void setFTMSListener(IFTMSListener listener) {
        this.D = listener;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public Future syncData(Calendar calendar, IHMActivityDataCallback callback) {
        DeviceInfo deviceInfo = getDeviceInfo();
        if (deviceInfo == null) {
            return null;
        }
        return submitOnDeviceOnlyThread(new HMProSyncDataTask(this.z, deviceInfo, calendar, callback));
    }

    public void syncHr(final int hr, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: fp2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a0(callback, hr);
            }
        });
    }

    public void syncMacAddress(final String mac, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: hp2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b0(callback, mac);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean unbindSync(AuthInfo info) {
        HMProAuthController hMProAuthController;
        return isConnected() && (hMProAuthController = this.y) != null && hMProAuthController.unbind(info);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void updateFwUpgrade(HMFirmwareInfo firmwareInfo, IHMFirmwareUpgradeCallback callback) {
        runOnDeviceOnlyThread(new HMDfuTask(this.mProfile, firmwareInfo, callback));
    }
}
