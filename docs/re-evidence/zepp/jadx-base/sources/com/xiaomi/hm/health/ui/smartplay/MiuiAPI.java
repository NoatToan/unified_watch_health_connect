package com.xiaomi.hm.health.ui.smartplay;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.UserManager;
import android.text.TextUtils;
import com.huami.device.feature.unlock.MiuiUnlockAPI;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.receiver.HMPhoneUtil;
import com.xiaomi.hm.health.utils.ScreenUnlockEventRecorder;
import com.xiaomi.hm.health.utils.Utils;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.lang.ref.WeakReference;
import java.util.List;
import miui.bluetooth.ble.MiBleDeviceManager;

/* JADX INFO: loaded from: classes22.dex */
public class MiuiAPI implements MiBleDeviceManager.MiBleDeviceManagerListener {
    private static final String e = "MiuiAPI";
    private static final int f = 1;
    private static final int g = 500;
    private static final int h = 2;
    private static final int i = 15;
    private static MiuiAPI j = null;
    private static final boolean k;
    private static final boolean l;
    private static final boolean m;
    private static final String n = "com.xiaomi.xmsf";
    private MiBleDeviceManager a = null;
    private boolean b = false;
    private boolean c = false;
    private final a d;

    public static class a extends Handler {
        private final WeakReference<MiuiAPI> a;

        public a(Looper looper, MiuiAPI instance) {
            super(looper);
            this.a = new WeakReference<>(instance);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            MiuiAPI miuiAPI = this.a.get();
            if (miuiAPI == null || msg.what != 1) {
                return;
            }
            miuiAPI.b();
        }
    }

    static {
        boolean zE = e("IS_ALPHA_BUILD");
        k = zE;
        boolean z = !zE && e("IS_DEVELOPMENT_VERSION");
        l = z;
        m = !z && e("IS_STABLE_VERSION");
    }

    private MiuiAPI() {
        HandlerThread handlerThread = new HandlerThread("miui");
        handlerThread.start();
        this.d = new a(handlerThread.getLooper(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        HMLog.d(e, "MSG_CREATE_MIUI_MANAGER", new Object[0]);
        MiBleDeviceManager.createManager(DeviceXFunctionsKt.getContext(), this);
    }

    private int c() {
        MiBleDeviceManager miBleDeviceManager = this.a;
        if (miBleDeviceManager == null) {
            HMLog.i(e, "mManager is null!!!", new Object[0]);
            return -1;
        }
        try {
            int serviceVersion = miBleDeviceManager.getServiceVersion();
            HMLog.i(e, "isSupportMiuiNotify version:" + serviceVersion, new Object[0]);
            return serviceVersion;
        } catch (Throwable th) {
            HMLog.i(e, th.getMessage(), new Object[0]);
            return -1;
        }
    }

    public static void checkMiuiNotify(Context context) {
        HMLog.i(e, "checkMiuiNotify", new Object[0]);
        if (isMiui(context)) {
            MiuiAPI miuiAPI = getInstance();
            if (miuiAPI.isSupportMiuiNotifyInternal()) {
                String boundDeviceAddress = HMDeviceManager.getInstance().getBoundDeviceAddress(HMDeviceType.MILI);
                HMLog.i(e, "before isSetIncall:" + miuiAPI.isSetAlertIncall(boundDeviceAddress) + ",isSetSms:" + miuiAPI.isSetAlertSms(boundDeviceAddress) + ",isSetAlarm:" + miuiAPI.isSetAlarm(boundDeviceAddress), new Object[0]);
                miuiAPI.unbindInvalidNotifyDevices(boundDeviceAddress);
                HMMiliConfig miliConfig = HMPersonInfo.getInstance().getMiliConfig();
                if (miuiAPI.d() || !(miliConfig.isAlarmNotifyEnabled() || miliConfig.isSmsNotifyEnabled() || miliConfig.isInComingCallEnabled())) {
                    miuiAPI.unbindDevice(boundDeviceAddress);
                    ScreenUnlockEventRecorder.recordUnbindDeviceReason("NoAlarm sms and alert");
                    HMLog.i(e, "unbind isSetIncall:" + miuiAPI.isSetAlertIncall(boundDeviceAddress) + ",isSetSms:" + miuiAPI.isSetAlertSms(boundDeviceAddress) + ",isSetAlarm:" + miuiAPI.isSetAlarm(boundDeviceAddress), new Object[0]);
                    return;
                }
                miuiAPI.setMiuiSupportAlertIncall(boundDeviceAddress, miliConfig.isInComingCallEnabled(), miliConfig.isIncallContactNotifyEnabled(), miliConfig.isPhoneNotifyDelayEnable() ? miliConfig.getInComingCallNotifyTime() : 0);
                if (HMPhoneUtil.isUseMifitSmsNotify()) {
                    miuiAPI.setMiuiSupportAlertSms(boundDeviceAddress, false, true);
                } else {
                    miuiAPI.setMiuiSupportAlertSms(boundDeviceAddress, miliConfig.isSmsNotifyEnabled(), miliConfig.isSmsContactNotifyEnabled());
                }
                miuiAPI.setAlertAlarm(boundDeviceAddress, miliConfig.isAlarmNotifyEnabled());
                HMLog.i(e, "after isSetIncall:" + miuiAPI.isSetAlertIncall(boundDeviceAddress) + ",isSetSms:" + miuiAPI.isSetAlertSms(boundDeviceAddress) + ",isSetAlarm:" + miuiAPI.isSetAlarm(boundDeviceAddress), new Object[0]);
            }
        }
    }

    private boolean d() {
        return !MiuiUnlockAPI.hasSetUnlockByDevice(DeviceXFunctionsKt.getContext(), HMDeviceManager.getInstance().getBoundDeviceAddress(HMDeviceType.MILI));
    }

    private static boolean e(String fieldName) {
        try {
            Class<?> cls = Class.forName("miui.os.Build");
            return cls.getField(fieldName).getBoolean(cls);
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean f(Context context) {
        UserManager userManager = (UserManager) context.getSystemService("user");
        if (userManager == null) {
            return false;
        }
        long serialNumberForUser = userManager.getSerialNumberForUser(Process.myUserHandle());
        HMLog.i(e, "getSerialNumberForUser:" + serialNumberForUser, new Object[0]);
        return serialNumberForUser == 0;
    }

    public static boolean getFeatureParser(Context context, String key) {
        try {
            Class<?> cls = Class.forName("miui.util.FeatureParser");
            return ((Boolean) cls.getMethod("getBoolean", String.class, Boolean.TYPE).invoke(cls, key, Boolean.FALSE)).booleanValue();
        } catch (IllegalArgumentException e2) {
            HMLog.i(e, "iAE:" + e2.getMessage(), new Object[0]);
            return false;
        } catch (Exception e3) {
            HMLog.i(e, "exception:" + e3.getMessage(), new Object[0]);
            return false;
        }
    }

    public static MiuiAPI getInstance() {
        if (j == null) {
            j = new MiuiAPI();
        }
        return j;
    }

    public static String getXiaomiServiceFrameworkPackageName() {
        return "com.xiaomi.xmsf";
    }

    public static boolean isMiui(Context context) {
        return !TextUtils.isEmpty(Utils.getMiuiVersionName(context));
    }

    public static boolean isMiuiAlphaVersion(Context c) {
        return k;
    }

    public static boolean isMiuiBasedAndroid11(Context context) {
        return isMiui(context) && Build.VERSION.SDK_INT > 29;
    }

    public static boolean isMiuiDevelopmentVersion() {
        return l;
    }

    public static boolean isMiuiMemberSpace(Context context) {
        return isMiui(context) && !f(context);
    }

    public static boolean isMiuiStableVersion() {
        return m;
    }

    public void init() {
        HMLog.i(e, PointCategory.INIT, new Object[0]);
        this.d.sendEmptyMessage(1);
    }

    public synchronized boolean isSetAlarm(String device) {
        MiBleDeviceManager miBleDeviceManager = this.a;
        if (miBleDeviceManager == null) {
            HMLog.i(e, "mManager is null!!!", new Object[0]);
            return false;
        }
        try {
            return miBleDeviceManager.getSettingsBoolean(device, MiBleDeviceManager.SETTING_IMMEDIATE_ALERT_ALARM_ENABLED);
        } catch (Throwable th) {
            HMLog.i(e, th.getMessage(), new Object[0]);
            return false;
        }
    }

    public synchronized boolean isSetAlertIncall(String device) {
        MiBleDeviceManager miBleDeviceManager = this.a;
        if (miBleDeviceManager == null) {
            HMLog.i(e, "mManager is null!!!", new Object[0]);
            return false;
        }
        try {
            return miBleDeviceManager.getSettingsBoolean(device, MiBleDeviceManager.SETTING_IMMEDIATE_ALERT_INCALL_ENABLED);
        } catch (Throwable th) {
            HMLog.i(e, th.getMessage(), new Object[0]);
            return false;
        }
    }

    public synchronized boolean isSetAlertSms(String device) {
        MiBleDeviceManager miBleDeviceManager = this.a;
        if (miBleDeviceManager == null) {
            HMLog.i(e, "mManager is null!!!", new Object[0]);
            return false;
        }
        try {
            return miBleDeviceManager.getSettingsBoolean(device, MiBleDeviceManager.SETTING_IMMEDIATE_ALERT_SMS_ENABLED);
        } catch (Throwable th) {
            HMLog.i(e, th.getMessage(), new Object[0]);
            return false;
        }
    }

    public boolean isSupportMiuiNotify() {
        boolean z = isSupportMiuiNotifyInternal() && !d();
        HMLog.i(e, "isSupportMiuiNotify:" + z, new Object[0]);
        return z;
    }

    public synchronized boolean isSupportMiuiNotifyInternal() {
        boolean z;
        z = false;
        HMLog.i(e, "isSupportMiuiNotifyInternal:" + this.b, new Object[0]);
        if (this.b && !GlobalConfig.get().isBuildMidong()) {
            z = true;
        }
        return z;
    }

    public synchronized boolean isSupportShowContactName() {
        HMLog.i(e, "isSupportShowContactName:" + this.c, new Object[0]);
        return this.c;
    }

    @Override // miui.bluetooth.ble.MiBleDeviceManager.MiBleDeviceManagerListener
    public synchronized void onDestroy() {
        HMLog.i(e, "MiBleDeviceManager onDestroy!", new Object[0]);
        this.a = null;
        if (this.b) {
            this.d.removeMessages(1);
            this.d.sendEmptyMessageDelayed(1, 500L);
        }
        this.b = false;
    }

    @Override // miui.bluetooth.ble.MiBleDeviceManager.MiBleDeviceManagerListener
    public synchronized void onInit(MiBleDeviceManager manager) {
        HMLog.i(e, "MiBleDeviceManager onInit!", new Object[0]);
        this.a = manager;
        int iC = c();
        boolean z = iC >= 2;
        this.b = z;
        this.c = iC >= 15;
        if (z) {
            this.d.removeMessages(1);
        }
    }

    public synchronized boolean setAlertAlarm(String device, boolean enable) {
        HMLog.i(e, "setAlertAlarm:" + enable, new Object[0]);
        if (this.a == null) {
            HMLog.i(e, "mManager is null!!!", new Object[0]);
            return false;
        }
        if (d()) {
            HMLog.i(e, "ignoreMiuiNotify!!!", new Object[0]);
            return false;
        }
        try {
            return this.a.setSettings(device, MiBleDeviceManager.SETTING_IMMEDIATE_ALERT_ALARM_ENABLED, enable);
        } catch (Throwable th) {
            HMLog.i(e, th.getMessage(), new Object[0]);
            return false;
        }
    }

    public synchronized boolean setAlertIncallDelay(String device, int delay) {
        HMLog.i(e, "setAlertIncallDelay:" + delay, new Object[0]);
        if (this.a == null) {
            HMLog.i(e, "mManager is null!!!", new Object[0]);
            return false;
        }
        if (d()) {
            HMLog.i(e, "ignoreMiuiNotify!!!", new Object[0]);
            return false;
        }
        try {
            return this.a.setSettings(device, MiBleDeviceManager.SETTING_IMMEDIATE_ALERT_INCALL_DELAYED, delay * 1000);
        } catch (Throwable th) {
            HMLog.i(e, th.getMessage(), new Object[0]);
            return false;
        }
    }

    public synchronized boolean setMiuiSupportAlertIncall(String device, boolean enable, boolean noContactEnable, int delay) {
        HMLog.i(e, "setSupportMiuiAlertIncall:" + enable + ",noContactEnable:" + noContactEnable + ",delay:" + delay, new Object[0]);
        if (this.a == null) {
            HMLog.i(e, "mManager is null!!!", new Object[0]);
            return false;
        }
        if (d()) {
            HMLog.i(e, "ignoreMiuiNotify!!!", new Object[0]);
            return false;
        }
        try {
            return this.a.setSettings(device, MiBleDeviceManager.SETTING_IMMEDIATE_ALERT_INCALL_DELAYED, delay * 1000) & this.a.setSettings(device, MiBleDeviceManager.SETTING_IMMEDIATE_ALERT_INCALL_NO_CONTACTS_ENABLED, enable && !noContactEnable) & this.a.setSettings(device, MiBleDeviceManager.SETTING_IMMEDIATE_ALERT_INCALL_ENABLED, enable) & this.a.setSettings(device, MiBleDeviceManager.SETTING_IMMEDIATE_ALERT_INCALL_IN_CONTACTS_ENABLED, enable);
        } catch (Throwable th) {
            HMLog.i(e, "setSupportMiuiAlertIncall :" + th.getMessage(), new Object[0]);
            return false;
        }
    }

    public synchronized boolean setMiuiSupportAlertSms(String device, boolean enable, boolean noContactEnable) {
        HMLog.i(e, "setAlertSms:" + enable + ",noContactEnable:" + noContactEnable, new Object[0]);
        if (this.a == null) {
            HMLog.i(e, "mManager is null!!!", new Object[0]);
            return false;
        }
        if (d()) {
            HMLog.i(e, "ignoreMiuiNotify!!!", new Object[0]);
            return false;
        }
        try {
            return this.a.setSettings(device, MiBleDeviceManager.SETTING_IMMEDIATE_ALERT_SMS_NO_CONTACTS_ENABLED, enable && !noContactEnable) & this.a.setSettings(device, MiBleDeviceManager.SETTING_IMMEDIATE_ALERT_SMS_ENABLED, enable) & this.a.setSettings(device, MiBleDeviceManager.SETTING_IMMEDIATE_ALERT_SMS_IN_CONTACTS_ENABLED, enable);
        } catch (Throwable th) {
            HMLog.i(e, "setMiuiSupportAlertSms :" + th.getMessage(), new Object[0]);
            return false;
        }
    }

    public synchronized boolean unbindDevice(String device) {
        HMLog.i(e, "unbindDevice:" + device, new Object[0]);
        MiBleDeviceManager miBleDeviceManager = this.a;
        if (miBleDeviceManager == null) {
            HMLog.i(e, "mManager is null!!!", new Object[0]);
            return false;
        }
        try {
            return miBleDeviceManager.unbindDevice(device);
        } catch (Throwable th) {
            HMLog.i(e, th.getMessage(), new Object[0]);
            return false;
        }
    }

    public synchronized void unbindInvalidNotifyDevices(String myDevice) {
        try {
            MiBleDeviceManager miBleDeviceManager = this.a;
            if (miBleDeviceManager == null) {
                HMLog.i(e, "mManager is null!!!", new Object[0]);
                return;
            }
            try {
                List<String> boundDevices = miBleDeviceManager.getBoundDevices();
                ScreenUnlockEventRecorder.recordMiUIBindDevices(myDevice, boundDevices);
                if (boundDevices != null && boundDevices.size() != 0) {
                    for (String str : boundDevices) {
                        int deviceType = this.a.getDeviceType(str);
                        HMLog.i(e, "bound device:" + str + ",type:" + deviceType, new Object[0]);
                        if (deviceType == 1 && (TextUtils.isEmpty(myDevice) || !str.equalsIgnoreCase(myDevice))) {
                            this.a.unbindDevice(str);
                            ScreenUnlockEventRecorder.recordUnbindDeviceReason("unbindInvalidNotifyDevices");
                        }
                    }
                }
            } catch (Throwable th) {
                HMLog.i(e, "e:" + th.getMessage(), new Object[0]);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
