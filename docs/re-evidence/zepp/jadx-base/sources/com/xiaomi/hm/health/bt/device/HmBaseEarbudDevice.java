package com.xiaomi.hm.health.bt.device;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huami.bluetooth.device.function.sensor.SensorSyncEnable;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.model.HMStatisticInfo;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertController;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertMode;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertModeExt;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.profile.auth.HMAuthState;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.OldProtocolSuccess;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HmEarbudDfuTask;
import com.xiaomi.hm.health.bt.profile.dfu.HmVoiceType;
import com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.earbud.EarbudProfile;
import com.xiaomi.hm.health.bt.profile.earbud.model.CurrentMusicState;
import com.xiaomi.hm.health.bt.profile.earbud.model.EarbudRebootInfo;
import com.xiaomi.hm.health.bt.profile.earbud.model.MusicControlCmd;
import com.xiaomi.hm.health.bt.profile.earbud.model.MusicInfo;
import com.xiaomi.hm.health.bt.profile.earbud.model.MusicPlayInfo;
import com.xiaomi.hm.health.bt.profile.earbud.model.RestModeInfo;
import com.xiaomi.hm.health.bt.profile.earbud.model.TomatoModeInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataTask;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback;
import com.xiaomi.hm.health.bt.profile.grsp.HMProSensorDataController;
import com.xiaomi.hm.health.bt.profile.grsp.IHMSensorDataCallback;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import com.xiaomi.hm.health.bt.profile.slre.HMLFEvent;
import com.xiaomi.hm.health.bt.profile.slre.HMLFProfile;
import com.xiaomi.hm.health.bt.profile.slre.ILFEventListener;
import com.xiaomi.hm.health.bt.profile.user.HMUserProfile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes19.dex */
public class HmBaseEarbudDevice extends HMBaseBleDevice implements ILFEventListener, SensorSyncEnable {
    private static final String G = "HmBaseEarbudDevice";
    public static final String LEFT_ADDRESS_SUFFIX = "01";
    public static final String RIGHT_ADDRESS_SUFFIX = "02";
    private HMUserProfile A;
    private HMAlertController B;
    private HMProSensorDataController C;
    private HMProSyncDataTask D;
    private c E;
    private Handler F;
    public EarbudProfile y;
    public HMCallback<HMLFEvent> z;

    public interface a<T> {
        void a(b<T> resultCallback);
    }

    public interface b<T> {
        void onResult(T t);
    }

    public interface c {
        void onEvent(HMLFEvent event);
    }

    public HmBaseEarbudDevice(Context context, BluetoothDevice device) {
        this(context, new HMBaseBleDevice.e(device, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G0(HMCallback hMCallback, HMAlertModeExt hMAlertModeExt) {
        hMCallback.sendOnStartMessage();
        if (hMAlertModeExt.getMode() == HMAlertMode.ALERT_LOVE) {
            hMAlertModeExt.setMode(HMAlertMode.ALERT_FIND);
        } else if (hMAlertModeExt.getMode() == HMAlertMode.ALERT_EMAIL) {
            hMAlertModeExt.setMode(HMAlertMode.ALERT_THIRD_APP);
        }
        hMCallback.sendOnFinishMessage(isConnected() && alertSync(hMAlertModeExt));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H0(HMCallback hMCallback, int i) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(deleteMusicSync(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0(Callable callable, b bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(isLeft() ? "left" : "right");
        sb.append(" device start execute");
        Debug.fi(G, sb.toString());
        Object objCall = null;
        try {
            objCall = callable.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(isLeft() ? "left" : "right");
        sb2.append(" device execute result:");
        sb2.append(objCall);
        Debug.fi(G, sb2.toString());
        bVar.onResult(objCall);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0(final Callable callable, final b bVar) {
        this.F.post(new Runnable() { // from class: com.xiaomi.hm.health.bt.device.b
            @Override // java.lang.Runnable
            public final void run() {
                this.a.I0(callable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getAlarmsSync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0(HMCallback hMCallback, HmVoiceType hmVoiceType) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getCurrentMusicStateSync(hmVoiceType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getDeviceRebootTimesSync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N0(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getDeviceSettingSync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O0(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getIsNoPhoneModeSync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P0(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getIsSleepNotDisturbSync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q0(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getEarbudsLeftSizeSync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R0(HMCallback hMCallback, HmVoiceType hmVoiceType) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getMusicListSync(hmVoiceType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S0(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(Integer.valueOf(getMusicPlayTimeSync()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T0(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getRestInfoSync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U0(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getSmartPlaySync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V0(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getTomatoInfoSync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W0(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(Short.valueOf(getVolumeSync()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X0(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(F0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y0(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(o1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z0(HMCallback hMCallback, MusicControlCmd musicControlCmd) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(musicControlSync(musicControlCmd));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a1(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(selfTestSync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b1(HMCallback hMCallback, AlarmClockExt alarmClockExt) {
        hMCallback.sendOnStartMessage();
        ArrayList arrayList = new ArrayList();
        if (alarmClockExt != null) {
            arrayList.add(alarmClockExt);
        }
        hMCallback.sendOnFinishMessage(setAlarmSync(arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c1(HMCallback hMCallback, List list) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setAlarmSync(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d1(HMCallback hMCallback, byte[] bArr) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setDeviceClickSettingSync(bArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e1(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setIsNoPhoneModeSync(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f1(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setIsSleepNotDisturbSync(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g1(HMCallback hMCallback, int i) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setMusicPlayTimeSync(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h1(HMCallback hMCallback, int i, int i2) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setRestModeSync(i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i1(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setSmartPlaySync(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j1(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.y.setTestSleep(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k1(HMCallback hMCallback, int i, int i2, int i3) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setTomatoModeSync(i, i2, i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l1(HMCallback hMCallback, UserInfoExt userInfoExt) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setUserInfoSync(userInfoExt));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m1(HMCallback hMCallback, short s) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setVolumeSync(s));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n1(HMCallback hMCallback, HmVoiceType hmVoiceType, int i) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(switchMusicSync(hmVoiceType, i));
    }

    public boolean C0(short time, short offsetTime, byte num) {
        HMAlertController hMAlertController = this.B;
        return hMAlertController != null && hMAlertController.alert(time, offsetTime, num);
    }

    public boolean D0(int musicId, boolean isForce) {
        return isConnected() && this.y.deleteMusic(musicId, isForce);
    }

    public EarbudProfile E0() {
        return this.y;
    }

    public boolean F0() {
        return isConnected() && this.y.isEarbudsConnect();
    }

    public void alert(final HMAlertModeExt mode, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: n24
            @Override // java.lang.Runnable
            public final void run() {
                this.a.G0(callback, mode);
            }
        });
    }

    public boolean alertSync(HMAlertModeExt mode) {
        HMAlertController hMAlertController = this.B;
        if (hMAlertController != null) {
            if (hMAlertController.alert(mode.getType() == 1 ? mode.getMode() : HMAlertMode.ALERT_STOP)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public AuthResult auth(AuthInfo info, IHMAuthCallback callback) {
        callback.onAuthentication(new HMAuthState(0));
        return new AuthResult(0, OldProtocolSuccess.INSTANCE);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public BaseProfile createProfile(Context context, BluetoothDevice device) {
        this.y = new EarbudProfile(context, device, this);
        this.A = new HMUserProfile(this.y);
        this.B = new HMAlertController(this.y);
        this.C = new HMProSensorDataController(this.y);
        return this.y;
    }

    public void deleteMusic(final int musicId, final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: j24
            @Override // java.lang.Runnable
            public final void run() {
                this.a.H0(callback, musicId);
            }
        });
    }

    public boolean deleteMusicSync(int musicId) {
        return D0(musicId, true);
    }

    public <T> a<T> generateDeviceCallable(final Callable<T> callable) {
        return new a() { // from class: com.xiaomi.hm.health.bt.device.a
            @Override // com.xiaomi.hm.health.bt.device.HmBaseEarbudDevice.a
            public final void a(HmBaseEarbudDevice.b bVar) {
                this.a.J0(callable, bVar);
            }
        };
    }

    public void getAlarms(final HMCallback<ArrayList<AlarmClockExt>> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: e24
            @Override // java.lang.Runnable
            public final void run() {
                this.a.K0(callback);
            }
        });
    }

    public ArrayList<AlarmClockExt> getAlarmsSync() {
        if (isConnected()) {
            return this.y.getAlarms();
        }
        return null;
    }

    public void getCurrentMusicState(final HmVoiceType voiceType, final HMCallback<CurrentMusicState> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: q24
            @Override // java.lang.Runnable
            public final void run() {
                this.a.L0(callback, voiceType);
            }
        });
    }

    public CurrentMusicState getCurrentMusicStateSync(@NonNull HmVoiceType voiceType) {
        if (isConnected()) {
            return this.y.getCurrentMusicState(voiceType);
        }
        return null;
    }

    public void getDeviceRebootTimes(final HMCallback<EarbudRebootInfo> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: f34
            @Override // java.lang.Runnable
            public final void run() {
                this.a.M0(callback);
            }
        });
    }

    public EarbudRebootInfo getDeviceRebootTimesSync() {
        if (isConnected()) {
            return this.y.getDeviceRebootTimes();
        }
        return null;
    }

    public void getDeviceSetting(final HMCallback<List<Byte>> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: g34
            @Override // java.lang.Runnable
            public final void run() {
                this.a.N0(callback);
            }
        });
    }

    public List<Byte> getDeviceSettingSync() {
        byte[] deviceClickSetting;
        if (isConnected() && (deviceClickSetting = this.y.getDeviceClickSetting()) != null) {
            return Arrays.asList(Byte.valueOf(deviceClickSetting[!isLeft() ? 1 : 0]), Byte.valueOf(deviceClickSetting[isLeft() ? (char) 2 : (char) 3]));
        }
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public HMDeviceType getDeviceType() {
        return HMDeviceType.EARBUD;
    }

    public Integer getEarbudsLeftSizeSync() {
        if (isConnected()) {
            return this.y.getEarbudsLeftSize();
        }
        return null;
    }

    public void getIsNoPhoneMode(final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: d34
            @Override // java.lang.Runnable
            public final void run() {
                this.a.O0(callback);
            }
        });
    }

    public boolean getIsNoPhoneModeSync() {
        return isConnected() && this.y.getIsNoPhoneMode();
    }

    public void getIsSleepNotDisturb(final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: z24
            @Override // java.lang.Runnable
            public final void run() {
                this.a.P0(callback);
            }
        });
    }

    public boolean getIsSleepNotDisturbSync() {
        return isConnected() && this.y.getIsSleepNotDisturb();
    }

    public void getLeftSize(final HMCallback<Integer> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: g24
            @Override // java.lang.Runnable
            public final void run() {
                this.a.Q0(callback);
            }
        });
    }

    public void getMusicList(@NonNull final HmVoiceType voiceType, final HMCallback<List<MusicInfo>> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: p24
            @Override // java.lang.Runnable
            public final void run() {
                this.a.R0(callback, voiceType);
            }
        });
    }

    @Nullable
    public List<MusicInfo> getMusicListSync(@NonNull HmVoiceType voiceType) {
        if (isConnected()) {
            return this.y.getMusicList(voiceType);
        }
        return null;
    }

    public MusicPlayInfo getMusicPlayInfoSync() {
        if (isConnected()) {
            return this.y.getMusicPlayInf();
        }
        return null;
    }

    public void getMusicPlayTime(final HMCallback<Integer> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: o24
            @Override // java.lang.Runnable
            public final void run() {
                this.a.S0(callback);
            }
        });
    }

    public int getMusicPlayTimeSync() {
        if (isConnected()) {
            return this.y.getMusicPlayTime();
        }
        return 0;
    }

    public void getRestInfo(final HMCallback<RestModeInfo> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: d24
            @Override // java.lang.Runnable
            public final void run() {
                this.a.T0(callback);
            }
        });
    }

    public RestModeInfo getRestInfoSync() {
        if (isConnected()) {
            return this.y.getRestInfo();
        }
        return null;
    }

    public void getSmartPlay(final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: e34
            @Override // java.lang.Runnable
            public final void run() {
                this.a.U0(callback);
            }
        });
    }

    public boolean getSmartPlaySync() {
        return isConnected() && this.y.getSmartPlay();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public HMStatisticInfo getStatisticInfoInternal() {
        return null;
    }

    public void getTomatoInfo(final HMCallback<TomatoModeInfo> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: h24
            @Override // java.lang.Runnable
            public final void run() {
                this.a.V0(callback);
            }
        });
    }

    public TomatoModeInfo getTomatoInfoSync() {
        if (isConnected()) {
            return this.y.getTomatoInfo();
        }
        return null;
    }

    public void getVolume(final HMCallback<Short> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: i34
            @Override // java.lang.Runnable
            public final void run() {
                this.a.W0(callback);
            }
        });
    }

    public short getVolumeSync() {
        if (isConnected()) {
            return this.y.getVolume();
        }
        return (short) 0;
    }

    public void isEarbudsConnect(final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: c34
            @Override // java.lang.Runnable
            public final void run() {
                this.a.X0(callback);
            }
        });
    }

    public boolean isLeft() {
        return this.b.a().endsWith("01");
    }

    public void linkLeftToRight(final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: f24
            @Override // java.lang.Runnable
            public final void run() {
                this.a.Y0(callback);
            }
        });
    }

    public void musicControl(final MusicControlCmd cmd, final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: s24
            @Override // java.lang.Runnable
            public final void run() {
                this.a.Z0(callback, cmd);
            }
        });
    }

    public boolean musicControlSync(MusicControlCmd musicCmd) {
        return p1(musicCmd, true);
    }

    public boolean o1() {
        return isConnected() && isLeft() && this.y.leftLinkToRight();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public void onDeviceConnected() {
        if (getDeviceInfo() != null && HMLFProfile.isSupport(this.y)) {
            HMLFProfile hMLFProfile = new HMLFProfile(this.y, getDeviceType());
            hMLFProfile.setListener(this);
            hMLFProfile.init();
        }
        super.onDeviceConnected();
    }

    @Override // com.xiaomi.hm.health.bt.profile.slre.ILFEventListener
    public void onLFEvent(HMLFEvent event) {
        c cVar = this.E;
        if (cVar != null) {
            cVar.onEvent(event);
        }
    }

    public boolean p1(MusicControlCmd musicCmd, boolean isForce) {
        return isConnected() && this.y.musicControl(musicCmd, isForce);
    }

    public void q1(c mEarbudLfCallback) {
        this.E = mEarbudLfCallback;
    }

    public boolean r1(int minute, boolean isForce) {
        return isConnected() && this.y.setMusicPlayTime(minute, isForce);
    }

    public int readEarbudRssi() {
        if (isConnected()) {
            return this.y.getEarbudRssi();
        }
        return 0;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public int readRemoteRssi() {
        if (isConnected()) {
            return this.y.getDeviceRssi();
        }
        return 0;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean reset() {
        return reset(true);
    }

    public boolean s1(int minute, int status, boolean isForce) {
        return isConnected() && this.y.setRestMode(minute, status, isForce);
    }

    public void selfTest(final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: h34
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a1(callback);
            }
        });
    }

    public boolean selfTestSync() {
        return isConnected() && this.y.selfTest();
    }

    public void setAlarmClock(final AlarmClockExt clockExt, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: t24
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b1(callback, clockExt);
            }
        });
    }

    public boolean setAlarmSync(final List<AlarmClockExt> clocks) {
        if (clocks == null || clocks.size() == 0) {
            return false;
        }
        boolean z = true;
        for (AlarmClockExt alarmClockExt : clocks) {
            boolean alarm = this.y.setAlarm(alarmClockExt);
            Debug.fi(G, "setAlarmSync alarm:" + alarmClockExt + ",ret:" + alarm);
            z = alarm;
        }
        return z;
    }

    public void setDeviceClickSetting(final byte[] settings, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: b34
            @Override // java.lang.Runnable
            public final void run() {
                this.a.d1(callback, settings);
            }
        });
    }

    public boolean setDeviceClickSettingSync(byte[] settings) {
        return isConnected() && this.y.setDeviceClickSetting(settings);
    }

    public void setIsNoPhoneMode(final boolean isNoPhoneMode, final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: x24
            @Override // java.lang.Runnable
            public final void run() {
                this.a.e1(callback, isNoPhoneMode);
            }
        });
    }

    public boolean setIsNoPhoneModeSync(boolean isNoPhoneMode) {
        return isConnected() && this.y.setIsNoPhoneMode(isNoPhoneMode);
    }

    public void setIsSleepNotDisturb(final boolean isSleepNotDisturb, final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: w24
            @Override // java.lang.Runnable
            public final void run() {
                this.a.f1(callback, isSleepNotDisturb);
            }
        });
    }

    public boolean setIsSleepNotDisturbSync(boolean isSleepNotDisturb) {
        return isConnected() && this.y.setIsSleepNotDisturb(isSleepNotDisturb);
    }

    public void setLfCallback(HMCallback<HMLFEvent> mLfCallback) {
        this.z = mLfCallback;
    }

    public void setMusicPlayTime(final int minute, final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: i24
            @Override // java.lang.Runnable
            public final void run() {
                this.a.g1(callback, minute);
            }
        });
    }

    public boolean setMusicPlayTimeSync(int minute) {
        return r1(minute, true);
    }

    public void setRestMode(final int minute, final int status, final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: k24
            @Override // java.lang.Runnable
            public final void run() {
                this.a.h1(callback, minute, status);
            }
        });
    }

    public boolean setRestModeSync(int minute, int status) {
        return s1(minute, status, true);
    }

    public void setSmartPlay(final boolean isSmartPlay, final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: y24
            @Override // java.lang.Runnable
            public final void run() {
                this.a.i1(callback, isSmartPlay);
            }
        });
    }

    public boolean setSmartPlaySync(boolean isSmartPlay) {
        return t1(isSmartPlay, true);
    }

    public void setTestSleep(final boolean isSleep, final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: a34
            @Override // java.lang.Runnable
            public final void run() {
                this.a.j1(callback, isSleep);
            }
        });
    }

    public void setTomatoMode(final int totalMinute, final int restMinute, final int status, final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: l24
            @Override // java.lang.Runnable
            public final void run() {
                this.a.k1(callback, totalMinute, restMinute, status);
            }
        });
    }

    public boolean setTomatoModeSync(int totalMinute, int restMinute, int status) {
        return u1(totalMinute, restMinute, status, true);
    }

    public void setUserInfo(final UserInfoExt infoExt, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: m24
            @Override // java.lang.Runnable
            public final void run() {
                this.a.l1(callback, infoExt);
            }
        });
    }

    public boolean setUserInfoSync(UserInfoExt infoExt) {
        if (isConnected()) {
            return this.A.setUserInfo(infoExt);
        }
        return false;
    }

    public void setVolume(final short volume, final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: v24
            @Override // java.lang.Runnable
            public final void run() {
                this.a.m1(callback, volume);
            }
        });
    }

    public boolean setVolumeSync(short volume) {
        return v1(volume, true);
    }

    @Override // com.huami.bluetooth.device.function.sensor.SensorSyncEnable
    public void startSensorData(final int type, final IHMSensorDataCallback callback) {
        HMProSensorDataController hMProSensorDataController;
        if (isConnected() && (hMProSensorDataController = this.C) != null) {
            hMProSensorDataController.startAsync(type, callback);
        } else {
            callback.onSensorStart();
            callback.onSensorStop(false);
        }
    }

    @Override // com.huami.bluetooth.device.function.sensor.SensorSyncEnable
    public void stopSensorData() {
        HMProSensorDataController hMProSensorDataController = this.C;
        if (hMProSensorDataController != null) {
            hMProSensorDataController.stopAsync();
        }
    }

    public void stopSyncData() {
        synchronized (this.mSyncObj) {
            HMProSyncDataTask hMProSyncDataTask = this.D;
            if (hMProSyncDataTask != null) {
                hMProSyncDataTask.stop();
                this.D = null;
            }
        }
    }

    public void switchMusic(final HmVoiceType voiceType, final int musicId, final HMCallback<Boolean> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: r24
            @Override // java.lang.Runnable
            public final void run() {
                this.a.n1(callback, voiceType, musicId);
            }
        });
    }

    public boolean switchMusicSync(HmVoiceType voiceType, int musicId) {
        return w1(voiceType, musicId, true);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public Future syncData(Calendar calendar, IHMActivityDataCallback callback) {
        synchronized (this.mSyncObj) {
            DeviceInfo deviceInfo = getDeviceInfo();
            if (deviceInfo == null) {
                return null;
            }
            HMProSyncDataTask hMProSyncDataTask = new HMProSyncDataTask(this.y, deviceInfo, calendar, callback);
            this.D = hMProSyncDataTask;
            return submitOnDeviceOnlyThread(hMProSyncDataTask);
        }
    }

    public boolean t1(boolean isSmartPlay, boolean isForce) {
        return isConnected() && this.y.setSmartPlay(isSmartPlay, isForce);
    }

    public boolean u1(int totalMinute, int restMinute, int status, boolean isForce) {
        return isConnected() && this.y.setTomatoMode(totalMinute, restMinute, status, isForce);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void updateFwUpgrade(HMFirmwareInfo firmwareInfo, IHMFirmwareUpgradeCallback callback) {
        if (!isConnected()) {
            Debug.fi(G, "device is not connected");
            callback.onFwStart(0);
            callback.onFwStop(false);
        } else if (getDeviceInfo() == null) {
            Debug.fi(G, "device info is null!!!");
            callback.onFwStart(0);
            callback.onFwStop(false);
        } else if (isLeft()) {
            runOnDeviceOnlyThread(new HmEarbudDfuTask(this.y, null, firmwareInfo, callback));
        } else {
            runOnDeviceOnlyThread(new HmEarbudDfuTask(null, this.y, firmwareInfo, callback));
        }
    }

    public boolean v1(short volume, boolean isForce) {
        return isConnected() && this.y.setVolume(volume, isForce);
    }

    public boolean w1(HmVoiceType voiceType, int musicId, boolean isForce) {
        return isConnected() && this.y.switchMusic(voiceType, musicId, isForce);
    }

    public HmBaseEarbudDevice(Context context, HMBaseBleDevice.e device) {
        super(context, device);
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        StringBuilder sb = new StringBuilder();
        sb.append(isLeft() ? "left" : "right");
        sb.append("HandlerThread");
        HandlerThread handlerThread = new HandlerThread(sb.toString());
        handlerThread.start();
        this.F = new Handler(handlerThread.getLooper());
    }

    public boolean reset(boolean isForce) {
        return isConnected() && this.y.reset(isForce);
    }

    public void setAlarmClock(final List<AlarmClockExt> clocks, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: u24
            @Override // java.lang.Runnable
            public final void run() {
                this.a.c1(callback, clocks);
            }
        });
    }
}
