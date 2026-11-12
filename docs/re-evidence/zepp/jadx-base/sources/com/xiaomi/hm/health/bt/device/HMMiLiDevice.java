package com.xiaomi.hm.health.bt.device;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.huami.bluetooth.device.RealtimeHeartRateDevice;
import com.huami.bluetooth.profile.channel.module.blood_pressure.BloodPressureApi;
import com.huami.bluetooth.profile.channel.module.blood_pressure.BloodPressureModule;
import com.huami.bluetooth.profile.channel.module.blood_pressure.impl.BloodPressureApiImpl;
import com.huami.bluetooth.profile.channel.module.find.FindDeviceApi;
import com.huami.bluetooth.profile.channel.module.find.FindPhoneListener;
import com.huami.bluetooth.profile.channel.module.health.HealthModule;
import com.huami.bluetooth.profile.channel.module.health.HeartHealthApi;
import com.huami.bluetooth.profile.channel.module.health.impl.HeartHealthImpl;
import com.huami.bluetooth.profile.channel.module.health.impl.IdleImpl;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.bt.HMBleConfig;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.model.HMColorTheme;
import com.xiaomi.hm.health.bt.model.HMStatisticInfo;
import com.xiaomi.hm.health.bt.model.HMVibrateType;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertController;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertMode;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertModeExt;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.OldProtocolSuccess;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.LEParams;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMMiLiFwUpgradeNewTask;
import com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMMiLiSyncDataNewTask;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMMiLiSyncDataTask;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback;
import com.xiaomi.hm.health.bt.profile.grsp.HMMiLiSensorDataController;
import com.xiaomi.hm.health.bt.profile.grsp.IHMSensorDataCallback;
import com.xiaomi.hm.health.bt.profile.hr.HMHeartRateController;
import com.xiaomi.hm.health.bt.profile.hr.HMHeartRateProfile;
import com.xiaomi.hm.health.bt.profile.hr.HeartRateConfig;
import com.xiaomi.hm.health.bt.profile.mili.MiLiProfile;
import com.xiaomi.hm.health.bt.profile.mili.model.MiLiHwConfig;
import com.xiaomi.hm.health.bt.profile.mili.model.UserInfo;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import com.xiaomi.hm.health.bt.profile.user.LocationExt;
import com.xiaomi.hm.health.bt.proxy.ProxyContainer;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Future;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public class HMMiLiDevice extends HMBaseBleDevice implements MiLiProfile.IVibrateNotifyListener, RealtimeHeartRateDevice, FindDeviceApi {
    private static final HashMap<String, HMDeviceSource> C = new a();
    private HMCallback<HMVibrateType> A;
    private final Object B;
    public HMAlertController alertController;
    public HMHeartRateController mHrController;
    public MiLiProfile y;
    public HMMiLiSensorDataController z;

    public class a extends HashMap<String, HMDeviceSource> {
        public a() {
            putAll(ProxyContainer.getProxy().getMiliNames());
        }
    }

    public HMMiLiDevice(Context context, BluetoothDevice device) {
        super(context, new HMBaseBleDevice.e(device, HMBleConfig.SUPPORT_KNOWN_DEVICE_SCAN));
        this.y = null;
        this.mHrController = null;
        this.z = null;
        this.alertController = null;
        this.A = null;
        this.B = new Object();
        Debug.fi(HMBaseBleDevice.q, "support known device scan: " + HMBleConfig.SUPPORT_KNOWN_DEVICE_SCAN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        HeartRateConfig heartRateConfig = getHeartHealthApi().getHeartRateConfig();
        hMCallback.sendOnDataMessage(heartRateConfig);
        hMCallback.sendOnFinishMessage(heartRateConfig != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0(HMCallback hMCallback, MiLiHwConfig miLiHwConfig) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(initSync(miLiHwConfig));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C0(HMCallback hMCallback, AlarmClockExt alarmClockExt) {
        hMCallback.sendOnStartMessage();
        ArrayList arrayList = new ArrayList();
        if (alarmClockExt != null) {
            arrayList.add(alarmClockExt);
        }
        hMCallback.sendOnFinishMessage(setAlarmSync(arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D0(HMCallback hMCallback, List list) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setAlarmSync(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E0(HMCallback hMCallback, HMColorTheme hMColorTheme) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.y.setColorTheme(hMColorTheme.getR(), hMColorTheme.getG(), hMColorTheme.getB(), hMColorTheme.slash()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F0(HMCallback hMCallback, int i) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setGoalSync(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G0(HMCallback hMCallback, int i) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getHeartHealthApi().setHrInterval(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H0(HMCallback hMCallback, UserInfoExt userInfoExt) {
        boolean userInfo;
        hMCallback.sendOnStartMessage();
        try {
            userInfo = this.y.setUserInfo(new UserInfo((int) userInfoExt.getUid(), userInfoExt.getGender().getValue(), (byte) userInfoExt.getAge(), (byte) userInfoExt.getHeight(), (byte) userInfoExt.getWeight(), userInfoExt.getAlias().getBytes(Charset.defaultCharset())));
        } catch (Exception e) {
            Debug.fi(HMBaseBleDevice.q, "setUserInfo e: " + e);
            userInfo = false;
        }
        hMCallback.sendOnFinishMessage(userInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0(HMCallback hMCallback, LocationExt locationExt) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.y.setWearLocation(q0(locationExt)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0(HMHeartRateController.IHeartRateCallback iHeartRateCallback) {
        getHeartRateController().startManualMeasure(iHeartRateCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0(IHMSensorDataCallback iHMSensorDataCallback) {
        this.z.start(iHMSensorDataCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0() {
        this.z.stop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.y.pair());
    }

    private void N0(byte[] fwData, IHMFirmwareUpgradeCallback callback) {
        setLatency(39, 49, new HMCallback());
        if (isConnected()) {
            runOnDeviceOnlyThread(new HMMiLiFwUpgradeNewTask(this.y, this.b.a(), fwData, callback));
        } else {
            callback.onFwStop(false);
        }
    }

    public static List<String> getSupportDeviceNames() {
        return new ArrayList(C.keySet());
    }

    public static boolean isSupportDeviceName(String deviceName) {
        return (TextUtils.isEmpty(deviceName) || C.get(deviceName) == null) ? false : true;
    }

    public static HMDeviceSource nameToSource(String deviceName) {
        return C.get(deviceName);
    }

    private byte q0(LocationExt location) {
        LocationExt.Way way = location.getWay();
        LocationExt.Wear wear = location.getWear();
        if (way != LocationExt.Way.OTHER) {
            return way == LocationExt.Way.LEFT ? (byte) 0 : (byte) 1;
        }
        return (wear == LocationExt.Wear.OTHER || wear != LocationExt.Wear.CHEST) ? (byte) 0 : (byte) 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(HMCallback hMCallback, HMAlertModeExt hMAlertModeExt) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(alertSync(hMAlertModeExt));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s0(HMCallback hMCallback, short s, short s2, byte b) {
        hMCallback.sendOnStartMessage();
        HMAlertController hMAlertController = this.alertController;
        hMCallback.sendOnFinishMessage(hMAlertController != null && hMAlertController.alert(s, s2, b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        DeviceInfo deviceInfo = this.y.getDeviceInfo();
        hMCallback.sendOnFinishMessage(deviceInfo != null ? this.y.wirteMD5(getWeixinId(null, deviceInfo.getDeviceID())) : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0(HMCallback hMCallback, String str) {
        hMCallback.sendOnStartMessage();
        DeviceInfo deviceInfo = this.y.getDeviceInfo();
        hMCallback.sendOnFinishMessage(deviceInfo != null ? this.y.wirteMD5(getWeixinId(str, deviceInfo.getDeviceID())) : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getHeartHealthApi().setAtrialFibEnable(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w0(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.y.enableConnectedBroadcast(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x0(HMCallback hMCallback, boolean z, int i) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getHeartHealthApi().enableFull(z, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0(HMCallback hMCallback, boolean z, int i) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getHeartHealthApi().setHeartRate(z, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getHeartHealthApi().setSleepAssistantEnable(z));
    }

    public void alert(final HMAlertModeExt mode, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: v13
            @Override // java.lang.Runnable
            public final void run() {
                this.a.r0(callback, mode);
            }
        });
    }

    public boolean alertSync(final HMAlertModeExt mode) {
        if (!isConnected()) {
            Debug.fi(HMBaseBleDevice.q, "alertSync return as no connection!!!");
            return false;
        }
        if (mode.getMode() == HMAlertMode.ALERT_LOVE) {
            mode.setMode(HMAlertMode.ALERT_FIND);
        } else if (mode.getMode() == HMAlertMode.ALERT_EMAIL) {
            mode.setMode(HMAlertMode.ALERT_THIRD_APP);
        }
        HMAlertController hMAlertController = this.alertController;
        if (hMAlertController != null) {
            return hMAlertController.alert(mode.getType() == 1 ? mode.getMode() : HMAlertMode.ALERT_STOP);
        }
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public AuthResult auth(AuthInfo info, IHMAuthCallback callback) {
        if (info.needAuth()) {
            return this.y.auth(info.getUserInfo(), callback) ? new AuthResult(0, OldProtocolSuccess.INSTANCE) : new AuthResult(7, OldProtocolSuccess.INSTANCE);
        }
        return new AuthResult(0, OldProtocolSuccess.INSTANCE);
    }

    public void bindWeixin(final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: m13
            @Override // java.lang.Runnable
            public final void run() {
                this.a.t0(callback);
            }
        });
    }

    @Override // com.huami.bluetooth.profile.channel.module.find.FindDeviceApi
    public void confirmFindPhone(@NotNull HMCallback<?> callback) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    @Nullable
    public <T> T createModule(Class<T> cls) {
        if (cls != HealthModule.class) {
            return (T) super.createModule(cls);
        }
        DeviceInfo deviceInfo = getDeviceInfo();
        return (T) new HealthModule(new HeartHealthImpl(null, getHeartRateController(), deviceInfo != null ? deviceInfo.getDeviceFeature() : new Feature()));
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    BaseProfile createProfile(Context context, BluetoothDevice device) {
        MiLiProfile miLiProfile = new MiLiProfile(context, device, this);
        this.y = miLiProfile;
        miLiProfile.setVibrateNotifyListener(this);
        this.z = new HMMiLiSensorDataController(this.y);
        this.alertController = new HMAlertController(this.y);
        Debug.i(HMBaseBleDevice.q, "createProfile:" + this.y);
        return this.y;
    }

    @Deprecated
    public void enableAtrialFib(final boolean enable, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: i13
            @Override // java.lang.Runnable
            public final void run() {
                this.a.v0(callback, enable);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.IBleInterface
    public void enableConnectedAdv(final boolean enable, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: h13
            @Override // java.lang.Runnable
            public final void run() {
                this.a.w0(callback, enable);
            }
        });
    }

    @Deprecated
    public void enableFullHeartRate(final boolean enable, final int interval, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: k13
            @Override // java.lang.Runnable
            public final void run() {
                this.a.x0(callback, enable, interval);
            }
        });
    }

    @Deprecated
    public void enableHeartRate(final boolean enable, final int interval, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: l13
            @Override // java.lang.Runnable
            public final void run() {
                this.a.y0(callback, enable, interval);
            }
        });
    }

    @Deprecated
    public void enableSleepAssistHr(final boolean enable, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: j13
            @Override // java.lang.Runnable
            public final void run() {
                this.a.z0(callback, enable);
            }
        });
    }

    @Override // com.huami.bluetooth.profile.channel.module.find.FindDeviceApi
    public void findDevice(@NotNull HMCallback<?> callback) {
        alert(new HMAlertModeExt(HMAlertMode.ALERT_FIND), callback);
    }

    @Override // com.huami.bluetooth.profile.channel.module.find.FindDeviceApi
    public boolean findDeviceSync() {
        return alertSync(new HMAlertModeExt(HMAlertMode.ALERT_FIND));
    }

    @Nullable
    public BloodPressureApi getBloodPressureApi() {
        BloodPressureModule bloodPressureModule;
        if (supportModule(52) && (bloodPressureModule = (BloodPressureModule) getChannelModule(BloodPressureModule.class)) != null) {
            return new BloodPressureApiImpl(bloodPressureModule);
        }
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public HMDeviceType getDeviceType() {
        return HMDeviceType.MILI;
    }

    public HeartHealthApi getHeartHealthApi() {
        HealthModule healthModule = (HealthModule) createModule(HealthModule.class);
        return healthModule == null ? new IdleImpl() : healthModule.getHeartHealth();
    }

    public void getHeartRateConfig(final HMCallback<HeartRateConfig> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: q13
            @Override // java.lang.Runnable
            public final void run() {
                this.a.A0(callback);
            }
        });
    }

    public HMHeartRateController getHeartRateController() {
        if (this.mHrController == null) {
            Debug.i(HMBaseBleDevice.q, "Create HeartRateController!");
            this.mHrController = newHeartRateController();
        }
        return this.mHrController;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public HMStatisticInfo getStatisticInfoInternal() {
        return this.y.getStatisticInfo();
    }

    public void getUserInfo(final HMCallback<UserInfoExt> callback) {
        callback.sendOnStartMessage();
        callback.sendOnFinishMessage(false);
    }

    public byte[] getWeixinId(String deviceId) {
        return getWeixinId(null, deviceId);
    }

    public void init(final MiLiHwConfig config, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: w13
            @Override // java.lang.Runnable
            public final void run() {
                this.a.B0(callback, config);
            }
        });
    }

    public boolean initSync(MiLiHwConfig miLiHwConfig) {
        Debug.fi(HMBaseBleDevice.q, "setGoal goals=" + miLiHwConfig.goals + ",ret=" + this.y.setGoal((byte) 0, miLiHwConfig.goals));
        List<AlarmClockExt> list = miLiHwConfig.alarms;
        for (int i = 0; i < list.size(); i++) {
            AlarmClockExt alarmClockExt = list.get(i);
            Debug.fi(HMBaseBleDevice.q, "setTimer=" + alarmClockExt + ",ret=" + this.y.setTimer((byte) alarmClockExt.getIndex(), alarmClockExt.isEnable() ? (byte) 1 : (byte) 0, alarmClockExt.getCalendar(), alarmClockExt.getSmartWakeTime(), (byte) alarmClockExt.getRepeat()));
        }
        DeviceInfo deviceInfo = this.y.getDeviceInfo();
        if (deviceInfo == null || !(deviceInfo.isMiLi1A() || deviceInfo.isMiLi1S())) {
            int i2 = miLiHwConfig.color;
            byte b = (byte) ((i2 >> 16) & 255);
            byte b2 = (byte) ((i2 >> 8) & 255);
            byte b3 = (byte) (i2 & 255);
            Debug.fi(HMBaseBleDevice.q, "setColorTheme getR=" + ((int) b) + ",getG=" + ((int) b2) + ",getB=" + ((int) b3) + ",ret=" + this.y.setColorTheme(b, b2, b3, (byte) 0));
        } else {
            Debug.fi(HMBaseBleDevice.q, "1A or 1S not set color theme!!!");
        }
        if (deviceInfo != null && deviceInfo.isMiLi1S()) {
            Debug.fi(HMBaseBleDevice.q, "set sleep assist " + miLiHwConfig.assistSleep + ",ret=" + getHeartHealthApi().setSleepAssistantEnable(miLiHwConfig.assistSleep));
        }
        Debug.fi(HMBaseBleDevice.q, "enableConnectedBroadcast enableAdv=" + miLiHwConfig.enableConnectedBtAdv + ",ret=" + this.y.enableConnectedBroadcast(miLiHwConfig.enableConnectedBtAdv));
        boolean wearLocation = this.y.setWearLocation(q0(miLiHwConfig.location));
        Debug.fi(HMBaseBleDevice.q, "setWearLocation location=" + miLiHwConfig.location + ",ret=" + wearLocation);
        if (this.y.isSupportWeixin()) {
            DeviceInfo deviceInfo2 = getDeviceInfo();
            if (deviceInfo2 != null) {
                wearLocation = this.y.wirteMD5(getWeixinId(null, deviceInfo2.getDeviceID()));
                Debug.fi(HMBaseBleDevice.q, "setWeixinId ret=" + wearLocation);
            } else {
                Debug.fi(HMBaseBleDevice.q, "setWeixinId failed as device info is null!!!");
            }
        } else {
            Debug.fi(HMBaseBleDevice.q, "NOT SUPPORT WEIXIN!!!");
        }
        int i3 = miLiHwConfig.baseStep;
        if (i3 <= 0) {
            Debug.fi(HMBaseBleDevice.q, "writeBaseSteps : no basesteps!");
            return wearLocation;
        }
        boolean zWriteBaseSteps = this.y.writeBaseSteps(i3);
        Debug.fi(HMBaseBleDevice.q, "writeBaseSteps steps=" + miLiHwConfig.baseStep + ",ret=" + zWriteBaseSteps);
        return zWriteBaseSteps;
    }

    public synchronized HMHeartRateController newHeartRateController() {
        return new HMHeartRateController(this.y);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public void onDeviceConnected() {
        super.onDeviceConnected();
        HMHeartRateController hMHeartRateController = this.mHrController;
        if (hMHeartRateController != null) {
            hMHeartRateController.disconnect();
            this.mHrController = null;
        }
        RealtimeStep realtimeStepSync = getRealtimeStepSync();
        Debug.fi(HMBaseBleDevice.q, "connected step:" + realtimeStepSync);
        if (realtimeStepSync != null) {
            onStepChanged(realtimeStepSync);
        }
        setLatency(39, 49, new HMCallback());
    }

    @Override // com.xiaomi.hm.health.bt.profile.mili.MiLiProfile.IVibrateNotifyListener
    public void onVibrate(HMVibrateType type) {
        Debug.i(HMBaseBleDevice.q, "onVibrate:" + type);
        HMCallback<HMVibrateType> hMCallback = this.A;
        if (hMCallback != null) {
            hMCallback.sendOnDataMessage(type);
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.find.FindDeviceApi
    public int queryFindDeviceProtocolVersion() {
        return 0;
    }

    @Override // com.huami.bluetooth.profile.channel.module.find.FindDeviceApi
    public void registerListener(@NotNull FindPhoneListener listener) {
    }

    public void setAlarmClock(final AlarmClockExt clockExt, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: c13
            @Override // java.lang.Runnable
            public final void run() {
                this.a.C0(callback, clockExt);
            }
        });
    }

    public boolean setAlarmSync(final List<AlarmClockExt> clocks) {
        synchronized (this.B) {
            if (clocks != null) {
                if (clocks.size() != 0) {
                    boolean timer = true;
                    for (int i = 0; i < clocks.size(); i++) {
                        AlarmClockExt alarmClockExt = clocks.get(i);
                        Debug.fi(HMBaseBleDevice.q, "setAlarmSync:" + alarmClockExt);
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(11, alarmClockExt.getHour());
                        calendar.set(12, alarmClockExt.getMinutes());
                        timer &= this.y.setTimer((byte) alarmClockExt.getIndex(), (byte) (alarmClockExt.isEnable() ? 1 : 0), calendar, alarmClockExt.getSmartWakeTime(), (byte) alarmClockExt.getRepeat());
                    }
                    return timer;
                }
            }
            return false;
        }
    }

    public void setColorTheme(final HMColorTheme colorTheme, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: t13
            @Override // java.lang.Runnable
            public final void run() {
                this.a.E0(callback, colorTheme);
            }
        });
    }

    public void setGoal(final int goal, final HMCallback callBack) {
        if (callNonConnected(callBack)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: r13
            @Override // java.lang.Runnable
            public final void run() {
                this.a.F0(callBack, goal);
            }
        });
    }

    public boolean setGoalSync(int goal) {
        return isConnected() && this.y.setGoal((byte) 0, goal);
    }

    @Deprecated
    public void setHeartRateInterval(final int interval, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: s13
            @Override // java.lang.Runnable
            public final void run() {
                this.a.G0(callback, interval);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public boolean setLatency(int minLatency, int maxLatency) {
        LEParams lEParams = this.y.getLEParams();
        if (lEParams != null && ((minLatency == 39 && lEParams.getConnInt() <= 60) || (minLatency == 460 && lEParams.getConnInt() >= 460))) {
            Debug.fi(HMBaseBleDevice.q, "same latency,return now!!!");
            return true;
        }
        Debug.fi(HMBaseBleDevice.q, "set latency:" + minLatency + "," + maxLatency + "\ncurrent latency:\n" + lEParams);
        Debug.fi(HMBaseBleDevice.q, "======================do set latency  in======================");
        boolean lEParams2 = this.y.setLEParams(minLatency, maxLatency, 0, 500, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("======================do set latency out======================");
        sb.append(lEParams2);
        Debug.fi(HMBaseBleDevice.q, sb.toString());
        return lEParams2;
    }

    public void setUserInfo(final UserInfoExt infoExt, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: u13
            @Override // java.lang.Runnable
            public final void run() {
                this.a.H0(callback, infoExt);
            }
        });
    }

    public void setVibrateNotifyCallback(HMCallback<HMVibrateType> callback) {
        this.A = callback;
    }

    public void setWearLocation(final LocationExt location, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: d13
            @Override // java.lang.Runnable
            public final void run() {
                this.a.I0(callback, location);
            }
        });
    }

    public void startManualMeasureHr(final HMHeartRateController.IHeartRateCallback callback) {
        if (isConnected()) {
            runOnDeviceMultiThread(new Runnable() { // from class: o13
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.J0(callback);
                }
            });
        } else {
            callback.onOpen(false);
        }
    }

    public void startRealtimeMeasureHr(final HMHeartRateController.IHeartRateCallback callback) {
        if (isConnected()) {
            getHeartRateController().startRealtimeMeasureAsync(callback);
        } else {
            callback.onOpen(false);
        }
    }

    public boolean startRealtimeMeasureHrSync(HMHeartRateProfile.IHeartRateChangedCallback callback) {
        if (isConnected()) {
            return getHeartRateController().startRealtimeMeasureSync(callback);
        }
        return false;
    }

    public void startSensorData(final int type, final IHMSensorDataCallback callback) {
        HMMiLiSensorDataController hMMiLiSensorDataController;
        if (isConnected() && (hMMiLiSensorDataController = this.z) != null && !hMMiLiSensorDataController.isRunning()) {
            runOnDeviceMultiThread(new Runnable() { // from class: n13
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.K0(callback);
                }
            });
        } else {
            callback.onSensorStart();
            callback.onSensorStop(false);
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.find.FindDeviceApi
    public void stopFindPhone(@NotNull HMCallback<?> callback) {
    }

    public void stopManualMeasureHr() {
        getHeartRateController().stopManualMeasure();
    }

    public void stopRealtimeMeasureHr() {
        if (isConnected()) {
            getHeartRateController().stopRealtimeMeasureAsync();
        }
    }

    public void stopSensorData() {
        if (isConnected()) {
            runOnDeviceMultiThread(new Runnable() { // from class: b13
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.L0();
                }
            });
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public Future syncData(Calendar calendar, IHMActivityDataCallback callback) {
        DeviceInfo deviceInfo = getDeviceInfo();
        if (deviceInfo == null) {
            Debug.fi(HMBaseBleDevice.q, "getDeviceInfo return null!!!");
            return null;
        }
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        return submitOnDeviceOnlyThread(deviceInfo.getProfileVersion() > 33555968 ? new HMMiLiSyncDataNewTask(this.y, deviceSource, calendar, callback) : new HMMiLiSyncDataTask(this.y, deviceSource, calendar, callback));
    }

    public void triggerPair(final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: p13
            @Override // java.lang.Runnable
            public final void run() {
                this.a.M0(callback);
            }
        });
    }

    @Override // com.huami.bluetooth.profile.channel.module.find.FindDeviceApi
    public void unregisterListener(@NotNull FindPhoneListener listener) {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void updateFwUpgrade(final HMFirmwareInfo info, IHMFirmwareUpgradeCallback callback) throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(info.getFwPath());
                    try {
                        byte[] bArr = new byte[fileInputStream2.available()];
                        fileInputStream2.read(bArr);
                        N0(bArr, callback);
                        fileInputStream2.close();
                    } catch (Exception unused) {
                        fileInputStream = fileInputStream2;
                        callback.onFwStart(0);
                        callback.onFwStop(false);
                        if (fileInputStream == null) {
                        } else {
                            fileInputStream.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception unused3) {
                }
            } catch (Exception unused4) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public byte[] getWeixinId(String weixinId, String deviceId) {
        if (weixinId == null || weixinId.trim().isEmpty()) {
            weixinId = Constant.WEIXIN_TO_USER_NAME;
        }
        String str = weixinId + deviceId;
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes(Charset.defaultCharset()));
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b : bArrDigest) {
                int i = b & 255;
                if (i < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i));
            }
            Debug.i(HMBaseBleDevice.q, "string:" + str + ",md5:" + sb.toString());
            return bArrDigest;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void alert(final short time, final short offsetTime, final byte num, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: g13
            @Override // java.lang.Runnable
            public final void run() {
                this.a.s0(callback, time, offsetTime, num);
            }
        });
    }

    public void bindWeixin(final String wexinId, final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: e13
            @Override // java.lang.Runnable
            public final void run() {
                this.a.u0(callback, wexinId);
            }
        });
    }

    public void setAlarmClock(final List<AlarmClockExt> clocks, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: f13
            @Override // java.lang.Runnable
            public final void run() {
                this.a.D0(callback, clocks);
            }
        });
    }

    public HMMiLiDevice(Context context, String address) {
        this(context, GattUtils.getRemoteDevice(address));
    }
}
