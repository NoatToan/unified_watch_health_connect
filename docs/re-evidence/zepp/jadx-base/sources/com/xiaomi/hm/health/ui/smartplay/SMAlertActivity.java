package com.xiaomi.hm.health.ui.smartplay;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.device.feature.unlock.MiuiUnlockAPI;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.view.widget.TipComponent;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.tbruyelle.rxpermissions2.Permission;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.xiaomi.hm.health.baseui.GlobalTitleStyle;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertMode;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeManager;
import com.xiaomi.hm.health.device.service.residentnoti.ResidentNotificationManager;
import com.xiaomi.hm.health.device.service.residentnoti.notify.ResidentNotify;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.receiver.HMPhoneUtil;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.keekalive.KeepAliveTipsActivity;
import com.xiaomi.hm.health.ui.smartplay.SMAlertActivity;
import com.xiaomi.hm.health.utils.TelephonyUtil;
import com.xiaomi.hm.health.utils.Utils;
import com.xiaomi.hm.health.webapi.HMAccountWebExtAPI;
import io.reactivex.functions.Consumer;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes22.dex */
public class SMAlertActivity extends BaseSmartPlayActivity {
    private static final String T = "SMAlertActivity";
    private ListTile F;
    private ListTile G;
    private ListTile H;
    private ListTile I;
    private HMPersonInfo M;
    private HMMiliConfig N;
    private TipComponent O;
    private MiuiAPI J = null;
    private String K = "";
    private boolean L = false;
    private boolean P = false;
    private final Lazy<DeviceManagerApi> Q = KoinJavaComponent.inject(DeviceManagerApi.class);
    private final CompoundButton.OnCheckedChangeListener R = new a();
    private final BLEStatueListenerAdapter S = new b();

    public class a implements CompoundButton.OnCheckedChangeListener {

        /* JADX INFO: renamed from: com.xiaomi.hm.health.ui.smartplay.SMAlertActivity$a$a, reason: collision with other inner class name */
        public class C1027a extends HMCallback {
            public final /* synthetic */ boolean a;

            public C1027a(final boolean val$isChecked) {
                this.a = val$isChecked;
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                super.onFinish(result);
                HMLog.i(SMAlertActivity.T, "sm_contact isChecked : " + this.a + ";result = " + result, new Object[0]);
                if (!result) {
                    Utils.showSetDeviceSettingResult(SMAlertActivity.this, false);
                    return;
                }
                SMAlertActivity.this.N.setSmsNameDisplayEnabled(this.a);
                SMAlertActivity.this.M.saveInfo(2);
                SMAlertActivity.this.m0(this.a);
                if (HMFwOnlineUpgradeManager.SUPPORT_CLOUD_FW_UPGRADE) {
                    HMFwOnlineUpgradeManager hMFwOnlineUpgradeManager = HMFwOnlineUpgradeManager.getInstance();
                    HMDeviceType hMDeviceType = HMDeviceType.MILI;
                    if (hMFwOnlineUpgradeManager.useOnline(hMDeviceType)) {
                        HMFwOnlineUpgradeManager.getInstance().checkFwUpgrade(SMAlertActivity.this, hMDeviceType, false);
                        return;
                    }
                }
                HMFwUpgradeManager.getInstance().checkFwUpgrade(SMAlertActivity.this, HMDeviceType.MILI, false);
            }
        }

        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0073  */
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            int id = buttonView.getId();
            if (id != R.id.sm_enable) {
                if (id == R.id.sm_strange) {
                    SMAlertActivity.this.W(isChecked);
                    SMAlertActivity.this.n0(isChecked);
                    return;
                }
                if (id == R.id.sm_contact) {
                    if (isChecked && !Utils.checkPermission(SMAlertActivity.this, "android.permission.READ_CONTACTS") && Utils.checkPermission(SMAlertActivity.this, "android.permission.RECEIVE_SMS")) {
                        SMAlertActivity.this.i0();
                    } else if (!SMAlertActivity.this.F.isChecked() || Utils.checkPermission(SMAlertActivity.this, "android.permission.RECEIVE_SMS")) {
                        SMAlertActivity.this.R();
                    } else {
                        SMAlertActivity.this.j0();
                    }
                    HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) ((DeviceManagerApi) SMAlertActivity.this.Q.getValue()).getDevice(HMDeviceType.MILI);
                    if (hMMiLiProDevice == null) {
                        return;
                    }
                    hMMiLiProDevice.showContact(HMAlertMode.ALERT_SMS, isChecked, new C1027a(isChecked));
                    return;
                }
                return;
            }
            if (isChecked && !Utils.checkPermission(SMAlertActivity.this, "android.permission.RECEIVE_SMS")) {
                SMAlertActivity.this.j0();
            } else if (isChecked && SMAlertActivity.this.M.getMiliConfig().isSmsContactNotifyEnabled() && !Utils.checkPermission(SMAlertActivity.this, "android.permission.READ_CONTACTS") && SMAlertActivity.this.P) {
                SMAlertActivity.this.i0();
            } else {
                SMAlertActivity.this.R();
            }
            if (isChecked && SMAlertActivity.this.N.isSmsNameDisplayEnabled()) {
                if (HMFwOnlineUpgradeManager.SUPPORT_CLOUD_FW_UPGRADE) {
                    HMFwOnlineUpgradeManager hMFwOnlineUpgradeManager = HMFwOnlineUpgradeManager.getInstance();
                    HMDeviceType hMDeviceType = HMDeviceType.MILI;
                    if (hMFwOnlineUpgradeManager.useOnline(hMDeviceType)) {
                        HMFwOnlineUpgradeManager.getInstance().checkFwUpgrade(SMAlertActivity.this, hMDeviceType, false);
                    } else {
                        HMFwUpgradeManager.getInstance().checkFwUpgrade(SMAlertActivity.this, HMDeviceType.MILI, false);
                    }
                } else {
                    HMFwUpgradeManager.getInstance().checkFwUpgrade(SMAlertActivity.this, HMDeviceType.MILI, false);
                }
            }
            if (!HMKeeper.hasClosedNotificationByUser()) {
                ResidentNotificationManager.showNotification(ResidentNotify.INSTANCE);
                SMAlertActivity.this.N.setNotificationOn(true);
            }
            SMAlertActivity.this.V(isChecked);
            SMAlertActivity.this.S(isChecked);
            if (isChecked) {
                SMAlertActivity.this.startActivity(new Intent(SMAlertActivity.this, (Class<?>) KeepAliveTipsActivity.class));
            }
        }
    }

    public class b extends BLEStatueListenerAdapter {
        public b() {
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public CharSequence getUnbindStr() {
            return SMAlertActivity.this.getString(R.string.sm_alert_not_bound);
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void onEnableChange(boolean enable) {
            if (!enable) {
                SMAlertActivity.this.F.setEnabled(false);
                SMAlertActivity.this.H.setEnabled(false);
                SMAlertActivity.this.I.setEnabled(false);
                SMAlertActivity.this.G.setEnabled(false);
                SMAlertActivity.this.R();
                return;
            }
            SMAlertActivity.this.F.setEnabled(true);
            boolean zIsSmsNotifyEnabled = SMAlertActivity.this.M.getMiliConfig().isSmsNotifyEnabled();
            SMAlertActivity.this.H.setEnabled(zIsSmsNotifyEnabled);
            SMAlertActivity.this.I.setEnabled(zIsSmsNotifyEnabled);
            SMAlertActivity.this.G.setEnabled(zIsSmsNotifyEnabled);
            SMAlertActivity.this.l0();
        }
    }

    private void P(boolean isEnabled) {
        HMLog.i(T, "changeSmsContactNotify setEnable = " + isEnabled, new Object[0]);
        this.N.setSmsContactNotifyEnabled(isEnabled);
        this.M.saveInfo(2);
    }

    private void Q(boolean isEnabled) {
        HMLog.i(T, "changeSmsNotify setEnable = " + isEnabled, new Object[0]);
        this.N.setSmsNotifyEnabled(isEnabled);
        this.M.saveInfo(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        this.O.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(boolean b2) {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.SMS_SWITCH).setValue(b2 ? "On" : "Off"));
    }

    private void T(boolean isEnabled) {
        this.H.setEnabled(isEnabled);
        this.I.setEnabled(isEnabled);
        this.G.setEnabled(isEnabled);
    }

    private void U(boolean enable) {
        this.F.setEnabled(enable);
        this.H.setEnabled(enable);
        this.I.setEnabled(enable);
        this.G.setEnabled(enable && this.M.getMiliConfig().isSmsNotifyEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(boolean checked) {
        if (!this.L) {
            Q(checked);
            T(checked);
        } else if (this.J.setMiuiSupportAlertSms(this.K, checked, this.N.isSmsContactNotifyEnabled())) {
            Q(checked);
            T(checked);
        } else {
            this.F.setEnabled(!checked);
            T(!checked);
            Utils.showSetFailedToast(this, checked);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(boolean checked) {
        if (!X()) {
            if (this.N.isIncallContactNotifyEnabled()) {
                this.H.setChecked(true);
            } else {
                this.H.setChecked(false);
            }
            k0();
            return;
        }
        if (this.J.setMiuiSupportAlertSms(this.K, this.N.isSmsNotifyEnabled(), checked)) {
            P(checked);
        } else {
            this.F.setEnabled(!checked);
            Utils.showSetFailedToast(this, checked);
        }
    }

    private boolean X() {
        return MiuiUnlockAPI.isUnlockEnabled(this, this.K);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(View view) {
        if (this.O.getTitle().equals(getString(R.string.app_notify_sms_access_title))) {
            h0();
        } else {
            g0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(Permission permission) throws Exception {
        if (permission.granted) {
            HMLog.i(T, "needReceiceSms: READ_CONTACTS haved ", new Object[0]);
            R();
            if (this.Q.getValue().isConnected(HMDeviceType.MILI)) {
                this.I.setEnabled(true);
                TelephonyUtil.INSTANCE.preReadContacts(this, T);
                return;
            }
            return;
        }
        if (permission.shouldShowRequestPermissionRationale) {
            HMLog.i(T, "readContactPerDeny: READ_CONTACTS ", new Object[0]);
            this.I.setEnabled(false);
        } else {
            HMLog.i(T, "ReceiceSmsPerNeverAskAgain: READ_CONTACTS ", new Object[0]);
            this.I.setEnabled(false);
            Utils.showPermissionDenieDialog(this, getString(R.string.permission_contact));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a0() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b0(Throwable th) throws Exception {
        HMLog.warn(T, th, new Function0() { // from class: ug6
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return SMAlertActivity.a0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c0(Permission permission) throws Exception {
        if (!permission.granted) {
            if (permission.shouldShowRequestPermissionRationale) {
                HMLog.i(T, "ReceiceSmsPerDeny: RECEIVE_SMS ", new Object[0]);
                U(false);
                return;
            } else {
                HMLog.i(T, "ReceiceSmsPerNeverAskAgain: RECEIVE_SMS ", new Object[0]);
                U(false);
                Utils.showPermissionDenieDialog(this, getString(R.string.permission_sms));
                return;
            }
        }
        HMLog.i(T, "needReceiceSms: needReceiceSms haved ", new Object[0]);
        if (!this.N.isSmsNameDisplayEnabled() || Utils.checkPermission(this, "android.permission.READ_CONTACTS")) {
            R();
        } else {
            i0();
        }
        if (this.Q.getValue().isConnected(HMDeviceType.MILI)) {
            U(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d0() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e0(Throwable th) throws Exception {
        HMLog.warn(T, th, new Function0() { // from class: vg6
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return SMAlertActivity.d0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f0(DialogInterface dialogInterface, int i) {
        startActivity(new Intent(this, (Class<?>) ScreenUnlockActivity.class));
    }

    private void g0() {
        new RxPermissions(this).requestEach("android.permission.READ_CONTACTS").subscribe(new Consumer() { // from class: rg6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.Z((Permission) obj);
            }
        }, new Consumer() { // from class: tg6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                SMAlertActivity.b0((Throwable) obj);
            }
        });
    }

    private void h0() {
        new RxPermissions(this).requestEach("android.permission.RECEIVE_SMS").subscribe(new Consumer() { // from class: qg6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.c0((Permission) obj);
            }
        }, new Consumer() { // from class: sg6
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                SMAlertActivity.e0((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0() {
        if (!this.P) {
            this.O.setVisibility(8);
            return;
        }
        this.O.setTitle(R.string.tips_contact_permission);
        this.O.setSubTitle(getString(HMDeviceConfig.isWatch() ? R.string.tips_contact_permission_sub_watch : R.string.tips_contact_permission_sub));
        this.O.setVisibility(0);
    }

    private void initView() {
        setStatusListener(this.S);
        boolean zIsSmsNotifyEnabled = this.M.getMiliConfig().isSmsNotifyEnabled();
        boolean zIsSmsContactNotifyEnabled = this.M.getMiliConfig().isSmsContactNotifyEnabled();
        if (this.L && this.J.isSetAlertSms(this.K) != zIsSmsNotifyEnabled) {
            this.J.setMiuiSupportAlertSms(this.K, zIsSmsNotifyEnabled, zIsSmsContactNotifyEnabled);
        }
        ListTile listTile = (ListTile) findViewById(R.id.sm_enable);
        this.F = listTile;
        listTile.setChecked(zIsSmsNotifyEnabled);
        this.F.setOnCheckedChangeListener(this.R);
        ListTile listTile2 = (ListTile) findViewById(R.id.vibrate_mode_iv);
        this.G = listTile2;
        listTile2.setEnabled(zIsSmsNotifyEnabled);
        this.H = (ListTile) findViewById(R.id.sm_strange);
        if (!this.J.isSupportMiuiNotifyInternal() || HMPhoneUtil.isUseMifitSmsNotify()) {
            this.H.setVisibility(8);
        } else {
            this.H.setChecked(zIsSmsContactNotifyEnabled);
            this.H.setOnCheckedChangeListener(this.R);
        }
        this.H.setEnabled(zIsSmsNotifyEnabled);
        TipComponent tipComponent = (TipComponent) findViewById(R.id.tip_sms_per);
        this.O = tipComponent;
        tipComponent.showWarningIcon();
        this.O.setActionGoto(new View.OnClickListener() { // from class: pg6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.Y(view);
            }
        });
        this.I = (ListTile) findViewById(R.id.sm_contact);
        if (this.P) {
            HMLog.d(T, "isSmsNotifyEnabled : " + zIsSmsNotifyEnabled, new Object[0]);
            this.I.setEnabled(zIsSmsNotifyEnabled);
            this.I.setChecked(this.M.getMiliConfig().isSmsNameDisplayEnabled());
            this.I.setOnCheckedChangeListener(this.R);
            this.I.setVisibility(0);
        }
        HMDeviceSource boundDeviceSource = this.Q.getValue().getBoundDeviceSource(HMDeviceType.MILI);
        if (!HMDeviceConfig.hasBoundWatch()) {
            setSmartTip(getString(R.string.incoming_call_alert_logo_tips));
            setSmartImageView(R.drawable.img_remind_phone_band_enable, R.drawable.img_remind_sms_enable);
            return;
        }
        setSmartTip(getString(R.string.incoming_call_alert_logo_watch_tips));
        if (boundDeviceSource == HMDeviceSource.MILI_TOKYO) {
            setSmartImageView(R.drawable.tokyo_img_remind_phone_and_watch_tokyo, R.drawable.img_remind_sms_enable);
        } else if (boundDeviceSource == HMDeviceSource.MILI_VENICE || boundDeviceSource == HMDeviceSource.MILI_VENICE_W) {
            setSmartImageView(R.drawable.img_remind_phone_and_watch_venice, R.drawable.img_remind_sms_enable);
        } else if (ConfigHelperKt.hasFeature(boundDeviceSource, Feature.ROUND_WATCH_S)) {
            setSmartImageView(R.drawable.img_remind_phone_and_watch_pyh, R.drawable.img_remind_sms_enable);
        } else {
            setSmartImageView(R.drawable.img_remind_phone_and_watch, R.drawable.img_remind_sms_enable);
        }
        this.F.setSubtitle(R.string.enable_sm_alert_tips_watch);
        this.I.setSubtitle(R.string.show_sms_info_summary_watch);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0() {
        this.O.setTitle(R.string.app_notify_sms_access_title);
        this.O.setSubTitle(getString(R.string.app_notify_sms_access_subtitle));
        this.O.setVisibility(0);
    }

    private void k0() {
        new AlertDialogFragment.Builder(this).setCancelable(true).setMessage(R.string.phone_alarm_remind_message).setNegativeButton(R.string.phone_alarm_remind_cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.phone_alarm_remind_confirm, new DialogInterface.OnClickListener() { // from class: og6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.f0(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0() {
        boolean zCheckPermission = Utils.checkPermission(this, "android.permission.RECEIVE_SMS");
        boolean zCheckPermission2 = Utils.checkPermission(this, "android.permission.READ_CONTACTS");
        HMLog.i(T, "isHaveSmsPer :  " + zCheckPermission + "; isHavReadContactPer = " + zCheckPermission2, new Object[0]);
        if (!this.P) {
            if (zCheckPermission) {
                R();
                U(true);
                return;
            } else {
                U(false);
                j0();
                return;
            }
        }
        if (zCheckPermission && zCheckPermission2) {
            R();
            this.I.setEnabled(this.M.getMiliConfig().isSmsNotifyEnabled());
        } else if (!zCheckPermission) {
            U(false);
            j0();
        } else if (this.N.isSmsNameDisplayEnabled() && this.N.isSmsNotifyEnabled()) {
            i0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(boolean b2) {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.SMS_SHOW_SMS_NAME_SWITCH).setValue(b2 ? "On" : "Off"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(boolean b2) {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.SMS_STRANGE_NUM_SWITCH).setValue(b2 ? "On" : "Off"));
    }

    private void o0() {
        if (!X()) {
            P(false);
        }
        this.H.setChecked(this.M.getMiliConfig().isSmsContactNotifyEnabled());
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.BaseSmartPlayActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        setTheme(2132017904);
        super.onCreate(savedInstanceState);
        setSmartContent(R.layout.activity_sm_alert);
        GlobalTitleStyle.setUnifyTitleStyle(this, getString(R.string.sm_alert));
        this.J = MiuiAPI.getInstance();
        this.L = MiuiAPI.getInstance().isSupportMiuiNotify() && !HMPhoneUtil.isUseMifitSmsNotify();
        this.K = this.Q.getValue().getBoundDeviceAddress(HMDeviceType.MILI);
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        this.M = hMPersonInfo;
        this.N = hMPersonInfo.getMiliConfig();
        this.P = HMDeviceConfig.hasFeatureFontResDevice() && HMDeviceUtils.isSupportContactNameForSystemLanguage() && !HMPhoneUtil.isUseMifitSmsNotify();
        HMLog.i(T, "isSupportMiuiNotify:" + this.L + ";mIsNeedShowContact = " + this.P, new Object[0]);
        initView();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        HMAccountWebExtAPI.updateProfile();
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.BaseSmartPlayActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.Q.getValue().isConnected(HMDeviceType.MILI)) {
            l0();
        }
        this.G.setVisibility(8);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.SMS_VIEW_NUM));
        o0();
    }
}
