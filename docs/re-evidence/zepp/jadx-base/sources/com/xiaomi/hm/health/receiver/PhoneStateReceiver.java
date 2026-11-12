package com.xiaomi.hm.health.receiver;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.huami.bluetooth.profile.channel.module.notification.NotificationModule;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.phone_call.sms.PhoneCallSmsReplyFeature;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertMode;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertModeExt;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.deviceproperty.HMDevicePropertyCache;
import com.xiaomi.hm.health.device.earbud.repo.EarbudConfigDataManager;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.receiver.PhoneStateReceiver;
import com.xiaomi.hm.health.ui.smartplay.AlertDataHelper;
import com.xiaomi.hm.health.ui.smartplay.MiuiAPI;
import com.xiaomi.hm.health.ui.smartplay.btphone.BtPhoneDevice;
import com.xiaomi.hm.health.ui.smartplay.btphone.btphone.BtPhoneSettingRepo;
import com.xiaomi.hm.health.ui.smartplay.btphone.incomingalert.IncomingCallDevice;
import com.xiaomi.hm.health.utils.AudioUtils;
import com.xiaomi.hm.health.utils.TelephonyUtil;
import com.xiaomi.hm.health.utils.Utils;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes21.dex */
public class PhoneStateReceiver extends BroadcastReceiver {
    private static final String a = "PhoneState";
    private static final int b = 1;
    private static final int c = 2;
    private static Lazy<PhoneCallSmsReplyFeature> d = KoinJavaComponent.inject(PhoneCallSmsReplyFeature.class);
    private static final Handler e = new Handler(new Handler.Callback() { // from class: ky5
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            return PhoneStateReceiver.w(message);
        }
    });
    private static HMCallback<Boolean> f = new a();
    private static long g;

    public class a extends HMCallback<Boolean> {
        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean result) {
            super.onFinish(result);
            HMLog.i(PhoneStateReceiver.a, "onFinish:" + result, new Object[0]);
        }
    }

    public class b extends HMCallback<Boolean> {
        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(Boolean bool) {
            return "onFinish: " + bool;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(final Boolean result) {
            HMLog.info(PhoneStateReceiver.a, new Function0() { // from class: com.xiaomi.hm.health.receiver.a
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return PhoneStateReceiver.b.b(result);
                }
            });
        }
    }

    public class c extends HMCallback<Boolean> {
        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b(Boolean bool) {
            return "hangup onFinish: " + bool;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(final Boolean result) {
            HMLog.info(PhoneStateReceiver.a, new Function0() { // from class: com.xiaomi.hm.health.receiver.b
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return PhoneStateReceiver.c.b(result);
                }
            });
        }
    }

    private void A(String phoneNumber, int timeout) {
        Message message = new Message();
        message.what = 1;
        message.obj = phoneNumber;
        e.sendMessageDelayed(message, timeout);
    }

    private static void B() {
        if (n()) {
            HMLog.i(a, "return as earbud device not support call", new Object[0]);
            return;
        }
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.EARBUD);
        if (device == null || !device.isConnected()) {
            return;
        }
        ((HmEarbudDevice) device).alert(new HMAlertModeExt(HMAlertMode.ALERT_INCALL, (String) null, (byte) 0), f);
    }

    private static void C() {
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        if (device != null && device.isConnected()) {
            synchronized (e) {
                if (device.supportModule(NotificationModule.class)) {
                    ((HMMiLiProDevice) device).notify(AlertDataHelper.INSTANCE.getHangupInfo(), new c());
                } else {
                    ((HMMiLiDevice) device).alert(new HMAlertModeExt(HMAlertMode.ALERT_INCALL, (String) null, (byte) 0), f);
                }
            }
        }
        try {
            AudioUtils.getInstance().resumeMode(false);
        } catch (AudioUtils.StateException e2) {
            HMLog.error(a, new Function0() { // from class: ny5
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return e2.getLocalizedMessage();
                }
            });
        }
    }

    private static void D() {
        Handler handler = e;
        handler.removeCallbacksAndMessages(null);
        handler.sendEmptyMessage(2);
    }

    private static boolean E() {
        return HMDevicePropertyCache.getInstance().getMiliFeature().hasSw(20);
    }

    private static boolean F() {
        return HMDevicePropertyCache.getInstance().getMiliFeature().hasSw(44);
    }

    private static void h(HMMiLiDevice device, String display, String phoneNumber) {
        boolean zSupportModule = device.supportModule(NotificationModule.class);
        boolean z = d.getValue().isFeatureEnable() && d.getValue().isEnable();
        synchronized (e) {
            try {
                if (zSupportModule) {
                    HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) device;
                    AlertDataHelper alertDataHelper = AlertDataHelper.INSTANCE;
                    if (!z) {
                        phoneNumber = "";
                    }
                    hMMiLiProDevice.notify(alertDataHelper.getCallInfo(display, phoneNumber), new b());
                } else {
                    HMAlertMode hMAlertMode = HMAlertMode.ALERT_INCALL;
                    if (!z) {
                        phoneNumber = "";
                    }
                    device.alert(new HMAlertModeExt(hMAlertMode, display, phoneNumber), f);
                    Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.CALLS_REMIND_NUM));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private int i(String state) {
        if (TelephonyManager.EXTRA_STATE_RINGING.equals(state)) {
            return 1;
        }
        if (TelephonyManager.EXTRA_STATE_OFFHOOK.equals(state)) {
            return 2;
        }
        return TelephonyManager.EXTRA_STATE_IDLE.equals(state) ? 0 : -1;
    }

    private void j() {
        HMLog.i(a, "STATE_IDLE:", new Object[0]);
        D();
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EVENT_CALL_IDLE));
    }

    private static void k() {
        long jCurrentTimeMillis = System.currentTimeMillis() - g;
        HMLog.i(a, "STATE_OFFHOOK: interval: " + jCurrentTimeMillis, new Object[0]);
        e.postDelayed(new Runnable() { // from class: ly5
            @Override // java.lang.Runnable
            public final void run() {
                PhoneStateReceiver.q();
            }
        }, jCurrentTimeMillis < 1000 ? 1000 - jCurrentTimeMillis : 0L);
    }

    private void l(String incomingNumber) {
        final int inComingCallNotifyTime = 0;
        HMLog.i(a, "STATE_COMING:", new Object[0]);
        AudioUtils.getInstance().initState();
        g = System.currentTimeMillis();
        if (m()) {
            A(incomingNumber, 0);
        } else {
            HMMiliConfig miliConfig = HMPersonInfo.getInstance().getMiliConfig();
            if (miliConfig.isPhoneNotifyDelayEnable() && !IncomingCallDevice.INSTANCE.supportSettingDelayTime()) {
                inComingCallNotifyTime = miliConfig.getInComingCallNotifyTime() * 1000;
            }
            HMLog.info(a, new Function0() { // from class: my5
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return PhoneStateReceiver.r(inComingCallNotifyTime);
                }
            });
            A(incomingNumber, inComingCallNotifyTime);
        }
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EVENT_CALL_NOTIFY));
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EVENT_CALL_RING));
    }

    private static boolean m() {
        if (!E()) {
            HMLog.i(a, "return as device not support bt phone", new Object[0]);
            return false;
        }
        boolean zF = F();
        if (zF && !new BtPhoneSettingRepo().getBtPhoneSetting().getEnable()) {
            HMLog.i(a, "device support bt phone and alert, but user not enable bt phone", new Object[0]);
            return false;
        }
        HMLog.i(a, "bt phone enabled and supportBtPhoneMixAlert: " + zF, new Object[0]);
        return true;
    }

    private static boolean n() {
        return !EarbudConfigDataManager.INSTANCE.getInstance().getConfig().isInComingCallEnabled();
    }

    private static boolean o() {
        return !HMPersonInfo.getInstance().getMiliConfig().isInComingCallEnabled();
    }

    private boolean p() {
        return !Utils.getMiuiWholeVersionInfo().contains("MIUI 12");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q() {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EVENT_CALL_OFFHOOK));
        D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String r(int i) {
        return "timeout:" + i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String s() {
        return "No support device is active.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String t() {
        return "bt device is null or disconnected.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit u(Boolean bool) {
        HMLog.i(a, "get bt phone in use: " + bool, new Object[0]);
        if (bool.booleanValue()) {
            return null;
        }
        k();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String v() {
        return "device is null or disconnected.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean w(Message message) {
        int i = message.what;
        if (i == 1) {
            String str = (String) message.obj;
            if (m()) {
                x(str);
            } else {
                z(str);
            }
            y();
        } else if (i == 2) {
            C();
            B();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    private static void x(String phoneNumber) {
        boolean z;
        String contactName;
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        if (device == null || !device.isConnected()) {
            HMLog.error(new Function0() { // from class: py5
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return PhoneStateReceiver.t();
                }
            });
            return;
        }
        boolean zIsSupportContactNameForSystemLanguage = HMDeviceUtils.isSupportContactNameForSystemLanguage();
        if (TextUtils.isEmpty(phoneNumber) || !zIsSupportContactNameForSystemLanguage) {
            z = false;
            contactName = phoneNumber;
        } else {
            contactName = TelephonyUtil.INSTANCE.getContactName(phoneNumber);
            if (TextUtils.isEmpty(contactName)) {
                z = false;
                contactName = phoneNumber;
            } else {
                z = true;
            }
        }
        HMLog.i(a, "phone num length: " + (TextUtils.isEmpty(phoneNumber) ? 0 : phoneNumber.length()) + "; allowedInLanguage: " + zIsSupportContactNameForSystemLanguage + ", and user language: " + Locale.getDefault() + "; queried user name: " + z + "; and display length: " + (TextUtils.isEmpty(contactName) ? 0 : contactName.length()), new Object[0]);
        h((HMMiLiDevice) device, contactName, phoneNumber);
        BtPhoneDevice.getBtPhoneInUse(new Function1() { // from class: ry5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PhoneStateReceiver.u((Boolean) obj);
            }
        });
    }

    private static void y() {
        if (n()) {
            HMLog.i(a, "return as earbud device not support call", new Object[0]);
            return;
        }
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.EARBUD);
        if (device == null || !device.isConnected()) {
            return;
        }
        HMLog.i(a, "startEarbudRing", new Object[0]);
        ((HmEarbudDevice) device).alert(new HMAlertModeExt(HMAlertMode.ALERT_INCALL), f);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
    private static void z(String phoneNumber) {
        boolean zIsEmpty;
        String contactName;
        Object objValueOf;
        if (o()) {
            HMLog.i(a, "return as mili device not support call", new Object[0]);
            return;
        }
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        if (device == null || !device.isConnected()) {
            HMLog.error(new Function0() { // from class: oy5
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return PhoneStateReceiver.v();
                }
            });
            return;
        }
        HMMiliConfig miliConfig = HMPersonInfo.getInstance().getMiliConfig();
        boolean zIsIncallNameDisplayEnabled = miliConfig.isIncallNameDisplayEnabled();
        boolean zIsSupportContactNameForSystemLanguage = HMDeviceUtils.isSupportContactNameForSystemLanguage();
        boolean z = !miliConfig.isIncallContactNotifyEnabled() || HMDeviceUtils.supprotContactDefault().booleanValue();
        boolean zHasFeatureFontResDevice = HMDeviceConfig.hasFeatureFontResDevice();
        boolean z2 = (zIsIncallNameDisplayEnabled && zIsSupportContactNameForSystemLanguage && zHasFeatureFontResDevice) || HMDeviceUtils.supprotContactDefault().booleanValue();
        if (!TextUtils.isEmpty(phoneNumber) && z2) {
            contactName = TelephonyUtil.INSTANCE.getContactName(phoneNumber);
            zIsEmpty = true ^ TextUtils.isEmpty(contactName);
            if (!zIsEmpty && z) {
            }
            StringBuilder sb = new StringBuilder();
            sb.append("打开显示姓名或号码开关：");
            sb.append(zIsIncallNameDisplayEnabled);
            sb.append(" 手机语言环境支持获取联系人姓名：");
            sb.append(zIsSupportContactNameForSystemLanguage);
            sb.append(" 允许提醒陌生号码来电：");
            sb.append(z);
            sb.append(" 支持中文字体的设备：");
            sb.append(zHasFeatureFontResDevice);
            sb.append(" display size: ");
            if (TextUtils.isEmpty(contactName)) {
                objValueOf = EcgData.DEFAULT_DIGIT_VALUE;
            } else {
                objValueOf = Integer.valueOf(contactName.length());
            }
            sb.append(objValueOf);
            sb.append(" queried display: ");
            sb.append(zIsEmpty);
            HMLog.i(a, sb.toString(), new Object[0]);
            h((HMMiLiDevice) device, contactName, phoneNumber);
        }
        zIsEmpty = false;
        contactName = phoneNumber;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("打开显示姓名或号码开关：");
        sb2.append(zIsIncallNameDisplayEnabled);
        sb2.append(" 手机语言环境支持获取联系人姓名：");
        sb2.append(zIsSupportContactNameForSystemLanguage);
        sb2.append(" 允许提醒陌生号码来电：");
        sb2.append(z);
        sb2.append(" 支持中文字体的设备：");
        sb2.append(zHasFeatureFontResDevice);
        sb2.append(" display size: ");
        if (TextUtils.isEmpty(contactName)) {
            objValueOf = EcgData.DEFAULT_DIGIT_VALUE;
        } else {
            objValueOf = Integer.valueOf(contactName.length());
        }
        sb2.append(objValueOf);
        sb2.append(" queried display: ");
        sb2.append(zIsEmpty);
        HMLog.i(a, sb2.toString(), new Object[0]);
        h((HMMiLiDevice) device, contactName, phoneNumber);
    }

    @Override // android.content.BroadcastReceiver
    @SuppressLint({"UnsafeProtectedBroadcastReceiver"})
    public synchronized void onReceive(Context context, Intent intent) {
        if (MiuiAPI.getInstance().isSupportMiuiNotify() && !HMPhoneUtil.isTwoWayNotify()) {
            HMLog.i(a, "Do nothing in MIUI", new Object[0]);
            return;
        }
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        if (hMDeviceManager == null) {
            return;
        }
        Device bindInfo = hMDeviceManager.getBindInfo(HMDeviceType.MILI);
        Device bindInfo2 = hMDeviceManager.getBindInfo(HMDeviceType.EARBUD);
        if (!hMDeviceManager.isActive(bindInfo) && !hMDeviceManager.isActive(bindInfo2)) {
            HMLog.error(a, new Function0() { // from class: qy5
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return PhoneStateReceiver.s();
                }
            });
            return;
        }
        if (!Utils.checkPermission(context, "android.permission.READ_CALL_LOG")) {
            HMLog.i(a, "The user didn't grant permission READ_CALL_LOG, which is no way to read phone number.", new Object[0]);
        } else if (p() && !intent.hasExtra("incoming_number")) {
            HMLog.i(a, "filter once because intent has no incoming number.", new Object[0]);
            return;
        }
        String stringExtra = intent.getStringExtra("state");
        String strNormalizeNumber = PhoneNumberUtils.normalizeNumber(intent.getStringExtra("incoming_number"));
        int i = i(stringExtra);
        if (i == 0) {
            j();
        } else if (i == 1) {
            l(strNormalizeNumber);
        } else if (i == 2) {
            k();
        }
    }
}
