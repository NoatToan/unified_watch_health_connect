package com.xiaomi.hm.health.bt.device;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import androidx.annotation.NonNull;
import com.huami.bluetooth.profile.base.ClassicDeviceInfoController;
import com.huami.bluetooth.profile.base.CurrentTimeController;
import com.huami.bluetooth.profile.base.CurrentTimeControllerImpl;
import com.huami.bluetooth.profile.base.DeviceInfoController;
import com.xiaomi.hm.health.bt.classic.BoltClassicProfile;
import com.xiaomi.hm.health.bt.classic.BoltSportStateHolder;
import com.xiaomi.hm.health.bt.classic.EqEntity;
import com.xiaomi.hm.health.bt.classic.HMDfuTask;
import com.xiaomi.hm.health.bt.classic.HMFTMSProfile;
import com.xiaomi.hm.health.bt.classic.HMProAuthController;
import com.xiaomi.hm.health.bt.classic.HMSportController;
import com.xiaomi.hm.health.bt.classic.HMSyncGpsDataTask;
import com.xiaomi.hm.health.bt.classic.HMSyncLogTask;
import com.xiaomi.hm.health.bt.classic.ITransport;
import com.xiaomi.hm.health.bt.classic.Protocol;
import com.xiaomi.hm.health.bt.device.smartwatch.FTMSFeature;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.model.HMStatisticInfo;
import com.xiaomi.hm.health.bt.model.SyncStatus;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.ftms.FTMSCommand;
import com.xiaomi.hm.health.bt.profile.ftms.IFTMSListener;
import com.xiaomi.hm.health.bt.profile.ftms.MachineStatus;
import com.xiaomi.hm.health.bt.profile.ftms.TreadmillData;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.UserInfo;
import com.xiaomi.hm.health.bt.profile.sport.IHMSportListener;
import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import com.xiaomi.hm.health.bt.profile.sport.SportConfig;
import com.xiaomi.hm.health.bt.profile.sport.SportInfo;
import java.io.File;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes19.dex */
public class HMBoltClassicDevice extends HMBaseClassicDevice implements IFTMSListener {
    public static final String NAME_BOLT = "bolt";
    private static final int s = 512;
    private HMProAuthController j;
    private BoltClassicProfile k;
    private HMFTMSProfile l;
    private CopyOnWriteArraySet<IFTMSListener> m;
    private HMSportController n;
    private ITransport o;
    private DeviceInfoController p;
    private CurrentTimeController q;
    private volatile boolean r;

    public HMBoltClassicDevice(Context context, BluetoothDevice device) {
        super(context, device);
        this.m = new CopyOnWriteArraySet<>();
        this.r = false;
        ITransport transport = getTransport();
        this.o = transport;
        this.k = new BoltClassicProfile(transport);
        this.j = new HMProAuthController(this.o);
        HMFTMSProfile hMFTMSProfile = new HMFTMSProfile(this.o);
        this.l = hMFTMSProfile;
        hMFTMSProfile.setListener(this);
        this.n = new HMSportController(this.o);
        this.p = new ClassicDeviceInfoController(createBluetoothCharacteristic(Protocol.VERSION));
        this.q = new CurrentTimeControllerImpl(createBluetoothCharacteristic(Protocol.CTS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.k.disableNotify());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnDataMessage(this.k.getEQ());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.k.getFtmsFeature());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(HMCallback hMCallback, FTMSCommand fTMSCommand) {
        hMCallback.sendOnStartMessage();
        HMFTMSProfile hMFTMSProfile = this.l;
        hMCallback.sendOnFinishMessage(hMFTMSProfile != null && hMFTMSProfile.sendFTMSCommand(fTMSCommand));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(HMCallback hMCallback, EqEntity eqEntity) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.k.setEq(eqEntity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(HMCallback hMCallback, int i) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.k.syncHr(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(HMCallback hMCallback, String str, int i) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.k.syncMacAddress(str, i));
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseClassicDevice
    public boolean d(AuthInfo info, IHMAuthCallback callback) {
        if (info == null || !info.needAuth()) {
            return false;
        }
        return this.j.auth(info, callback);
    }

    public void disableNotify(final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: yo2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.r(callback);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void enableRealtimeStep(boolean enable) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public BatteryInfo getBatteryInfo() {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void getDateTime(HMCallback<Calendar> callBack) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseClassicDevice
    public DeviceInfo getDeviceInfoSync() {
        return this.p.getDeviceInfo();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseClassicDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void getDeviceLog(File file, IHMDataCallback<File> callback) {
        if (isConnected()) {
            runOnDeviceOnlyThread(new HMSyncLogTask(this.o, file, callback));
        } else {
            callback.onStart();
            callback.onStop(file, new HMDeviceError(3));
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseClassicDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public HMDeviceType getDeviceType() {
        return HMDeviceType.TREADMILL;
    }

    public void getEq(final HMCallback<EqEntity> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: xo2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.s(callback);
            }
        });
    }

    public void getFtmsFeature(final HMCallback<FTMSFeature> callback) {
        if (isConnected() && this.k != null) {
            runOnDeviceMultiThread(new Runnable() { // from class: zo2
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.t(callback);
                }
            });
        } else {
            callback.sendOnStartMessage();
            callback.sendOnFinishMessage((FTMSFeature) null);
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    /* JADX INFO: renamed from: getRealtimeStep */
    public RealtimeStep getStep() {
        return null;
    }

    public HMSportController.TreadmillSportState getSportState() {
        return BoltSportStateHolder.getSportState();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void getStatisticInfo(HMCallback<HMStatisticInfo> callback) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public SyncStatus getSyncStatus() {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseClassicDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean isConnected() {
        return this.r;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean isSyncingData() {
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void onConnectionStatusChangedInternal(BluetoothDevice device, HMDeviceType type, Status status) {
        this.r = status == Status.AUTH_SUCCESS;
        super.onConnectionStatusChangedInternal(device, type, status);
    }

    @Override // com.xiaomi.hm.health.bt.profile.ftms.IFTMSListener
    public void onMachineStatus(MachineStatus status) {
        for (IFTMSListener iFTMSListener : this.m) {
            if (iFTMSListener != null) {
                iFTMSListener.onMachineStatus(status);
            }
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.ftms.IFTMSListener
    public void onTreadmillData(TreadmillData data) {
        for (IFTMSListener iFTMSListener : this.m) {
            if (iFTMSListener != null) {
                iFTMSListener.onTreadmillData(data);
            }
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public int readRemoteRssi() {
        return 0;
    }

    public void removeListener(@NonNull IFTMSListener listener) {
        this.m.remove(listener);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean reset() {
        return isConnected() && this.k.reset();
    }

    public void sendFTMSCommand(final FTMSCommand command, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: cp2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.u(callback, command);
            }
        });
    }

    public void sendSportCommand(final SportCommand command, final SportInfo info, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        this.n.sendCommand(command, info);
    }

    public void sendSportConfig(final SportConfig config, final IHMSportListener listener, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        this.n.sendConfig(config, listener);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseClassicDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean setDateTimeSync(Calendar calendar) {
        return this.q.setTime(calendar);
    }

    public void setEq(final EqEntity eqEntity, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: bp2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.v(callback, eqEntity);
            }
        });
    }

    public void setFTMSListener(@NonNull IFTMSListener listener) {
        this.m.add(listener);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void setRealtimeStepCallback(HMCallback<RealtimeStep> callback) {
    }

    public void setSportListener(IHMSportListener listener) {
        BoltSportStateHolder.setSportInnerListener(listener);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseClassicDevice
    public boolean setUserInfoSync(UserInfo userInfo) {
        return this.k.setUserInfo(userInfo);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void startSyncData(Calendar calendar, IHMActivityDataCallback callback) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void startSyncGpsData(Calendar calendar, final SyncDataCallback<List<GpsRecord>> callback) {
        if (isConnected()) {
            runOnDeviceOnlyThread(new HMSyncGpsDataTask(this.o, calendar, callback));
        } else {
            callback.onStart();
            callback.onFinish(new HMDeviceError(3));
        }
    }

    public void syncHr(final int hr, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: ap2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.w(callback, hr);
            }
        });
    }

    public void syncMacAddress(final String mac, final int source, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: dp2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.x(callback, mac, source);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean unbindSync(AuthInfo info) {
        HMProAuthController hMProAuthController;
        return isConnected() && (hMProAuthController = this.j) != null && hMProAuthController.unbind(info);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void updateFwUpgrade(HMFirmwareInfo firmwareInfo, IHMFirmwareUpgradeCallback callback) {
        firmwareInfo.setSyncSize(512);
        runOnDeviceOnlyThread(new HMDfuTask(this.o, firmwareInfo, callback));
    }
}
