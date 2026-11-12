package com.xiaomi.hm.health.ui.smartplay;

import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import cn.com.smartdevices.bracelet.rom.ROM;
import cn.com.smartdevices.bracelet.rom.helper.ColorOSHelper;
import cn.com.smartdevices.bracelet.rom.helper.MIUIHelper;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.huami.devicex.injection.BuildConfigApi;
import com.huami.devicex.injection.basic.AccountWebExtApi;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.basic.MiuiFnApi;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.view.widget.TipComponent;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.phone_call.sms.PhoneCallReplyMsgActivity;
import com.huami.phone_call.sms.PhoneCallSmsReplyFeature;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.huami.tools.log.HMLog;
import com.huami.watch.util.DeviceCompatibility;
import com.huami.widget.toast.IconToast;
import com.huami.widget.wheelview.OnWheelScrollListener;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.PickAdapter;
import com.tbruyelle.rxpermissions2.Permission;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertMode;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeManager;
import com.xiaomi.hm.health.device.service.residentnoti.ResidentNotificationManager;
import com.xiaomi.hm.health.device.service.residentnoti.notify.ResidentNotify;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.ui.smartplay.IncomingCallAlertActivity;
import com.xiaomi.hm.health.ui.smartplay.appnotify.view.NotificationFaqView;
import com.xiaomi.hm.health.utils.DeviceIncomingCallUtil;
import com.xiaomi.hm.health.utils.TelephonyUtil;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.reactivex.functions.Consumer;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.Dispatchers;
import org.cybergarage.soap.SOAP;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes22.dex */
public class IncomingCallAlertActivity extends BaseSmartPlayActivity implements View.OnClickListener {
    private static final String s0 = "IncomingCallAlertActivity";
    private ListTile F;
    private ListTile G;
    private ListTile H;
    private ListTile I;
    private ListTile J;
    private ListTile K;
    private ListTile L;
    private ListTile M;
    private TipComponent N;
    private HMPersonInfo O;
    private HMMiliConfig P;
    private WheelView T;
    private boolean Q = false;
    private MiuiFnApi R = null;
    private String S = "";
    private boolean U = false;
    private boolean V = false;
    private final Lazy<DeviceManagerApi> W = KoinJavaComponent.inject(DeviceManagerApi.class);
    private final Lazy<DeviceUtilsApi> X = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private final Lazy<DeviceXNavigator> Y = KoinJavaComponent.inject(DeviceXNavigator.class);
    private final Lazy<BuildConfigApi> Z = KoinJavaComponent.inject(BuildConfigApi.class);
    private final Lazy<MiuiFnApi> m0 = KoinJavaComponent.inject(MiuiFnApi.class);
    private final Lazy<AccountWebExtApi> n0 = KoinJavaComponent.inject(AccountWebExtApi.class);
    private final Lazy<KeeperProxyApi> o0 = KoinJavaComponent.inject(KeeperProxyApi.class);
    private Lazy<PhoneCallSmsReplyFeature> p0 = KoinJavaComponent.inject(PhoneCallSmsReplyFeature.class);
    private DialogInterface.OnClickListener q0 = new c();
    private BLEStatueListenerAdapter r0 = new e();

    public class a implements Continuation<Integer> {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(Object obj) {
            IncomingCallAlertActivity.this.H.setTips(String.format(IncomingCallAlertActivity.this.getString(R.string.incoming_call_delay_alert_tips), obj + ""));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String d() {
            return "not an integer";
        }

        @Override // kotlin.coroutines.Continuation
        @NonNull
        public CoroutineContext getContext() {
            return Dispatchers.getIO();
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(@NonNull final Object obj) {
            if (obj instanceof Integer) {
                IncomingCallAlertActivity.this.runOnUiThread(new Runnable() { // from class: com.xiaomi.hm.health.ui.smartplay.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.c(obj);
                    }
                });
            } else {
                HMLog.info(IncomingCallAlertActivity.s0, new Function0() { // from class: com.xiaomi.hm.health.ui.smartplay.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return IncomingCallAlertActivity.a.d();
                    }
                });
            }
        }
    }

    public class b implements OnWheelScrollListener {
        public final /* synthetic */ TextView a;

        public b(TextView textView) {
            this.a = textView;
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheelView) {
            this.a.setText(IncomingCallAlertActivity.this.getResources().getQuantityString(R.plurals.incoming_call_delay_dialog_alert_tips, wheelView.getCurrentItem() + 3, Integer.valueOf(wheelView.getCurrentItem() + 3)));
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheelView) {
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == -1) {
                int currentItem = IncomingCallAlertActivity.this.T.getCurrentItem() + 3;
                IncomingCallAlertActivity.this.H.setTips(String.format(IncomingCallAlertActivity.this.getString(R.string.incoming_call_delay_alert_tips), currentItem + ""));
                IncomingCallAlertActivity.this.n1(currentItem);
                if (IncomingCallAlertActivity.this.Q) {
                    IncomingCallAlertActivity.this.R.setAlertIncallDelay(IncomingCallAlertActivity.this.S, currentItem);
                }
                Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.CALL_OUT_DELAY_SETTING).setValue(currentItem + SOAP.XMLNS));
            }
        }
    }

    public class d extends HMCallback {
        public final /* synthetic */ boolean a;

        public d(boolean z) {
            this.a = z;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            HMLog.i(IncomingCallAlertActivity.s0, "show_contact_info_alert isChecked : " + this.a + ";result = " + z, new Object[0]);
            if (!z) {
                ((DeviceUtilsApi) IncomingCallAlertActivity.this.X.getValue()).showSetDeviceSettingResult(IncomingCallAlertActivity.this, false);
                return;
            }
            IncomingCallAlertActivity.this.P.setIncallNameDisplayEnabled(this.a);
            IncomingCallAlertActivity.this.O.saveInfo(2);
            IncomingCallAlertActivity.this.g1(this.a);
            if (((BuildConfigApi) IncomingCallAlertActivity.this.Z.getValue()).isSupportCloudFwUpgrade()) {
                HMFwOnlineUpgradeManager hMFwOnlineUpgradeManager = HMFwOnlineUpgradeManager.getInstance();
                HMDeviceType hMDeviceType = HMDeviceType.MILI;
                if (hMFwOnlineUpgradeManager.useOnline(hMDeviceType)) {
                    HMFwOnlineUpgradeManager.getInstance().checkFwUpgrade(IncomingCallAlertActivity.this, hMDeviceType, false);
                    return;
                }
            }
            HMFwUpgradeManager.getInstance().checkFwUpgrade(IncomingCallAlertActivity.this, HMDeviceType.MILI, false);
        }
    }

    public class e extends BLEStatueListenerAdapter {
        public e() {
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public CharSequence getUnbindStr() {
            return IncomingCallAlertActivity.this.getString(R.string.incoming_call_not_bound);
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void onEnableChange(boolean z) {
            IncomingCallAlertActivity.this.i0(z);
            if (z) {
                IncomingCallAlertActivity.this.o1();
            } else {
                IncomingCallAlertActivity.this.h0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0(CompoundButton compoundButton, boolean z) {
        this.P.setPhoneNotifyDelayEnable(z);
        this.O.saveInfo(2);
        this.H.setEnabled(z);
        if (q0()) {
            this.R.setMiuiSupportAlertIncall(this.S, this.P.isInComingCallEnabled(), this.P.isIncallContactNotifyEnabled(), z ? this.P.getInComingCallNotifyTime() : 0);
        }
        if (z) {
            DeviceIncomingCallUtil.INSTANCE.setDelayTime(this.P.getInComingCallNotifyTime());
        } else {
            DeviceIncomingCallUtil.INSTANCE.setDelayTime(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0(CompoundButton compoundButton, boolean z) {
        n0(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C0(Permission permission) throws Exception {
        BTStatusFragment bTStatusFragment;
        if (permission.name.equals("android.permission.READ_CALL_LOG")) {
            if (!permission.granted) {
                if (permission.shouldShowRequestPermissionRationale) {
                    HMLog.i(s0, "readContactPerDeny: WRITE_CALL_LOG ", new Object[0]);
                    return;
                } else {
                    HMLog.i(s0, "ReceiceSmsPerNeverAskAgain: WRITE_CALL_LOG ", new Object[0]);
                    e1();
                    return;
                }
            }
            HMLog.i(s0, "needReadContactPer: WRITE_CALL_LOG haved ", new Object[0]);
            o1();
            if (this.W.getValue().isConnected(HMDeviceType.MILI) && (bTStatusFragment = this.mFragment) != null && bTStatusFragment.getLastEnableState()) {
                this.J.setEnabled(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String D0() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E0(Throwable th) throws Exception {
        HMLog.warn(s0, th, new Function0() { // from class: ne4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IncomingCallAlertActivity.D0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F0(Permission permission) throws Exception {
        BTStatusFragment bTStatusFragment;
        if (permission.name.equals("android.permission.READ_CONTACTS")) {
            if (!permission.granted) {
                if (permission.shouldShowRequestPermissionRationale) {
                    HMLog.i(s0, "readContactPerDeny: READ_CONTACTS ", new Object[0]);
                    this.J.setEnabled(false);
                    return;
                } else {
                    this.J.setEnabled(false);
                    this.X.getValue().showPermissionDenieDialog(this, getString(R.string.permission_contact));
                    HMLog.i(s0, "ReceiceSmsPerNeverAskAgain: READ_CONTACTS ", new Object[0]);
                    return;
                }
            }
            HMLog.i(s0, "needReadContactPer: READ_CONTACTS haved ", new Object[0]);
            o1();
            if (this.W.getValue().isConnected(HMDeviceType.MILI) && (bTStatusFragment = this.mFragment) != null && bTStatusFragment.getLastEnableState()) {
                this.J.setEnabled(true);
                TelephonyUtil.INSTANCE.preReadContacts(this, s0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String G0() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void H0(Throwable th) throws Exception {
        HMLog.warn(s0, th, new Function0() { // from class: le4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IncomingCallAlertActivity.G0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0(Permission permission) throws Exception {
        BTStatusFragment bTStatusFragment;
        if (permission.name.equals("android.permission.READ_PHONE_STATE")) {
            if (permission.granted) {
                HMLog.i(s0, "needReceiceSms: READ_PHONE_STATE haved ", new Object[0]);
                o1();
                if (this.W.getValue().isConnected(HMDeviceType.MILI) && (bTStatusFragment = this.mFragment) != null && bTStatusFragment.getLastEnableState()) {
                    i0(true);
                    return;
                }
                return;
            }
            if (permission.shouldShowRequestPermissionRationale) {
                HMLog.i(s0, "phoneStatePerDeny: READ_PHONE_STATE ", new Object[0]);
                i0(false);
            } else {
                HMLog.i(s0, "phoneStatePerNeverAskAgain: READ_PHONE_STATE ", new Object[0]);
                i0(false);
                this.X.getValue().showPermissionDenieDialog(this, getString(R.string.permission_phone));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String J0() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K0(Throwable th) throws Exception {
        HMLog.warn(s0, th, new Function0() { // from class: oe4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IncomingCallAlertActivity.J0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0(Permission permission) throws Exception {
        if (permission.name.equals("android.permission.SEND_SMS")) {
            HMLog.i(s0, "SEND_SMS: " + permission.granted + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + permission.shouldShowRequestPermissionRationale, new Object[0]);
            if (permission.granted) {
                o1();
            } else if (permission.shouldShowRequestPermissionRationale) {
                HMLog.i(s0, "readContactPerDeny: WRITE_CALL_LOG ", new Object[0]);
            } else {
                HMLog.i(s0, "ReceiceSmsPerNeverAskAgain: WRITE_CALL_LOG ", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String M0() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void N0(Throwable th) throws Exception {
        HMLog.warn(s0, th, new Function0() { // from class: me4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IncomingCallAlertActivity.M0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O0(DialogInterface dialogInterface, int i) {
        this.J.setChecked(false);
        g0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P0(DialogInterface dialogInterface, int i) {
        this.Y.getValue().startAppSettings(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q0(DialogInterface dialogInterface, int i) {
        this.Y.getValue().startScreenUnlockActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S0(DialogInterface dialogInterface, int i) {
        startActivity(new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"));
    }

    private boolean T0() {
        return !this.m0.getValue().isMiui(this) || (this.m0.getValue().isMiui(this) && !q0());
    }

    private boolean U0() {
        return this.W.getValue().hasBound(HMDeviceType.MILI) && this.m0.getValue().isMiui(this) && q0() && !GlobalConfig.get().isBuildMidong();
    }

    private void V0() {
        new RxPermissions(this).requestEach("android.permission.READ_CALL_LOG").subscribe(new Consumer() { // from class: fe4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.C0((Permission) obj);
            }
        }, new Consumer() { // from class: ke4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                IncomingCallAlertActivity.E0((Throwable) obj);
            }
        });
    }

    private void W0() {
        new RxPermissions(this).requestEach("android.permission.READ_CONTACTS").subscribe(new Consumer() { // from class: de4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.F0((Permission) obj);
            }
        }, new Consumer() { // from class: je4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                IncomingCallAlertActivity.H0((Throwable) obj);
            }
        });
    }

    private void X0() {
        RxPermissions rxPermissions = new RxPermissions(this);
        String[] strArr = {"android.permission.READ_PHONE_STATE", "android.permission.CALL_PHONE"};
        if (Build.VERSION.SDK_INT >= 26) {
            strArr = new String[]{"android.permission.READ_PHONE_STATE", "android.permission.CALL_PHONE", "android.permission.ANSWER_PHONE_CALLS"};
        }
        rxPermissions.requestEach(strArr).subscribe(new Consumer() { // from class: ee4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.I0((Permission) obj);
            }
        }, new Consumer() { // from class: ge4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                IncomingCallAlertActivity.K0((Throwable) obj);
            }
        });
    }

    private void Y0() {
        if (this.m0.getValue().isMiui(this)) {
            this.Y.getValue().startAppSettings(this);
        } else {
            new RxPermissions(this).requestEach("android.permission.SEND_SMS").subscribe(new Consumer() { // from class: ce4
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.L0((Permission) obj);
                }
            }, new Consumer() { // from class: ie4
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    IncomingCallAlertActivity.N0((Throwable) obj);
                }
            });
        }
    }

    private void Z0() {
        if (!this.U) {
            this.N.setVisibility(8);
            return;
        }
        this.N.setTitle(R.string.title_call_log_per_s);
        this.N.setSubTitle(getString(R.string.tips_call_log_per));
        this.N.setVisibility(0);
    }

    private void a1() {
        if (!this.U) {
            this.N.setVisibility(8);
            return;
        }
        this.N.setTitle(R.string.tips_contact_permission);
        this.N.setSubTitle(getString(HMDeviceConfig.isWatch() ? R.string.tips_contact_permission_sub_watch : R.string.tips_contact_permission_sub));
        this.N.setVisibility(0);
    }

    private void b1() {
        this.N.setTitle(R.string.permission_disturb_title_sub);
        this.N.setSubTitle(HMDeviceConfig.hasBoundWatch() ? getString(R.string.permission_disturb_call_watch) : getString(R.string.permission_disturb_call));
        this.N.setVisibility(0);
    }

    private void c1(boolean z) {
        this.H.setEnabled(z && this.P.isPhoneNotifyDelayEnable());
        this.I.setEnabled(z);
        this.J.setEnabled(z);
        this.K.setEnabled(z);
        this.G.setEnabled(z);
        m1();
    }

    private void d1() {
        this.N.setTitle(R.string.tips_call_permission);
        this.N.setSubTitle(getString(R.string.tips_call_permission_sub));
        this.N.setVisibility(0);
    }

    private void e1() {
        new AlertDialogFragment.Builder(this).setCancelable(true).setTitle(R.string.title_call_log_per).setMessage(R.string.tips_call_log_per).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: re4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.O0(dialogInterface, i);
            }
        }).setPositiveButton(R.string.open, new DialogInterface.OnClickListener() { // from class: se4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.P0(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    private void f0(boolean z) {
        this.P.setIncallContactNotifyEnabled(z);
        this.O.saveInfo(2);
    }

    private void f1() {
        new AlertDialogFragment.Builder(this).setCancelable(true).setMessage(R.string.phone_alarm_remind_message).setNegativeButton(R.string.phone_alarm_remind_cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.phone_alarm_remind_confirm, new DialogInterface.OnClickListener() { // from class: wd4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.Q0(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    private void g0(boolean z) {
        o1();
        ((HMMiLiProDevice) this.W.getValue().getDevice(HMDeviceType.MILI)).showContact(HMAlertMode.ALERT_INCALL, z, new d(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g1(boolean z) {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.CALL_SHOW_CONTACT_NAME_SWITCH).setValue(z ? "On" : "Off"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        this.N.setVisibility(8);
    }

    private void h1() {
        int i;
        if (Build.VERSION.SDK_INT >= 24) {
            AlertDialogFragment.Builder title = new AlertDialogFragment.Builder(this).setCancelable(false).setTitle(R.string.permission_disturb_title);
            if (HMDeviceConfig.hasBoundBand3()) {
                i = R.string.permission_disturb_msg_device;
            } else {
                i = HMDeviceConfig.hasBoundWatch() ? R.string.permission_disturb_msg_watch : R.string.permission_disturb_msg;
            }
            title.setMessage(i).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: te4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    dialogInterface.dismiss();
                }
            }).setPositiveButton(R.string.per_go_setting, new DialogInterface.OnClickListener() { // from class: he4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.a.S0(dialogInterface, i2);
                }
            }).show(getSupportFragmentManager());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(boolean z) {
        if (z) {
            this.F.setEnabled(true);
            if (this.F.isChecked()) {
                this.H.setEnabled(this.P.isPhoneNotifyDelayEnable());
                this.I.setEnabled(true);
                this.J.setEnabled(true);
                this.K.setEnabled(true);
                this.G.setEnabled(true);
            } else {
                this.H.setEnabled(false);
                this.I.setEnabled(false);
                this.J.setEnabled(false);
                this.K.setEnabled(false);
                this.G.setEnabled(false);
            }
        } else {
            this.F.setEnabled(false);
            this.H.setEnabled(false);
            this.I.setEnabled(false);
            this.J.setEnabled(false);
            this.K.setEnabled(false);
            this.G.setEnabled(false);
        }
        m1();
    }

    private void i1(Context context, boolean z) {
        IconToast.showError(context, z ? context.getResources().getString(R.string.mili_setting_sleep_assist_open_failed) : context.getResources().getString(R.string.mili_setting_sleep_assist_close_failed));
    }

    private void initData() {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        this.O = hMPersonInfo;
        this.P = hMPersonInfo.getMiliConfig();
    }

    private void initView() {
        this.L = (ListTile) findViewById(R.id.item_sms_call_reply);
        this.M = (ListTile) findViewById(R.id.item_sms_call_reply_management);
        this.K = (ListTile) findViewById(R.id.incoming_call_delay_enable);
        setSmartTip(getString(HMDeviceConfig.hasBoundWatch() ? R.string.incoming_call_alert_logo_watch_tips : R.string.incoming_call_alert_logo_tips));
        setStatusListener(this.r0);
        ListTile listTile = (ListTile) findViewById(R.id.incoming_call_enable);
        this.F = listTile;
        listTile.setChecked(this.P.isInComingCallEnabled());
        this.F.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: zd4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.B0(compoundButton, z);
            }
        });
        this.G = (ListTile) findViewById(R.id.vibrate_mode_iv);
        DeviceIncomingCallUtil.INSTANCE.getDelayTime(this.P, new a());
        ListTile listTile2 = (ListTile) findViewById(R.id.incoming_call_delay);
        this.H = listTile2;
        listTile2.setOnClickListener(this);
        this.I = (ListTile) findViewById(R.id.strange_number_alert);
        if (this.R.isSupportMiuiNotifyInternal()) {
            this.I.setChecked(this.P.isIncallContactNotifyEnabled());
            this.I.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: yd4
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.a.v0(compoundButton, z);
                }
            });
        } else {
            this.I.setVisibility(8);
        }
        TipComponent tipComponent = (TipComponent) findViewById(R.id.call_permission_tips);
        this.N = tipComponent;
        tipComponent.showWarningIcon();
        this.N.setActionGoto(new View.OnClickListener() { // from class: ve4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.y0(view);
            }
        });
        ListTile listTile3 = (ListTile) findViewById(R.id.show_contact_info_alert);
        this.J = listTile3;
        if (this.U) {
            listTile3.setChecked(this.P.isIncallNameDisplayEnabled());
            this.J.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ae4
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.a.z0(compoundButton, z);
                }
            });
            this.J.setVisibility(0);
        }
        DeviceManagerApi value = this.W.getValue();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        HMDeviceSource boundDeviceSource = value.getBoundDeviceSource(hMDeviceType);
        if (HMDeviceConfig.hasBoundWatch()) {
            if (HMDeviceConfig.isPYHSeries() || HMDeviceConfig.isFalconSeries() || HMDeviceConfig.isHawkSeries() || HMDeviceConfig.isKestrelSeries()) {
                setSmartImageView(R.drawable.img_remind_phone_and_watch_pyh, R.drawable.img_remind_calls_enable);
            } else if (boundDeviceSource == HMDeviceSource.MILI_TOKYO) {
                setSmartImageView(R.drawable.tokyo_img_remind_phone_and_watch_tokyo, R.drawable.img_remind_calls_enable);
            } else if (boundDeviceSource == HMDeviceSource.MILI_VENICE || boundDeviceSource == HMDeviceSource.MILI_VENICE_W) {
                setSmartImageView(R.drawable.img_remind_phone_and_watch_venice, R.drawable.img_remind_calls_enable);
            } else {
                setSmartImageView(R.drawable.img_remind_phone_and_watch, R.drawable.img_remind_calls_enable);
            }
            this.F.setSubtitle(R.string.enable_incoming_call_alert_tips_watch);
            this.J.setSubtitle(R.string.show_contact_info_summary_watch);
            if (this.W.getValue().getBoundDeviceSource(hMDeviceType) == HMDeviceSource.MILI_TOKYO) {
                this.F.setSubtitle(R.string.enable_incoming_call_alert_tips_watch_buzz);
            }
        } else {
            setSmartImageView(R.drawable.img_remind_phone_band_enable, R.drawable.img_remind_calls_enable);
        }
        if (!this.P.isInComingCallEnabled()) {
            c1(false);
        }
        m1();
        this.K.setChecked(this.P.isPhoneNotifyDelayEnable());
        this.H.setEnabled(this.P.isPhoneNotifyDelayEnable());
        this.K.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: be4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.A0(compoundButton, z);
            }
        });
    }

    private void j0(boolean z) {
        if (!this.Q) {
            r0(z);
            c1(z);
            return;
        }
        if (this.R.setMiuiSupportAlertIncall(this.S, z, this.P.isIncallContactNotifyEnabled(), this.P.isPhoneNotifyDelayEnable() ? this.P.getInComingCallNotifyTime() : 0)) {
            r0(z);
            c1(z);
        } else {
            i1(this, z);
            this.I.setChecked(!z);
        }
    }

    private void j1() {
        View viewInflate = getLayoutInflater().inflate(R.layout.delay_alert_time_dialog, (ViewGroup) findViewById(R.id.dialog_layout));
        TextView textView = (TextView) viewInflate.findViewById(R.id.time_value);
        WheelView wheelView = (WheelView) viewInflate.findViewById(R.id.delay_time_picker);
        this.T = wheelView;
        int i = R.color.personinfo_color_yellow;
        this.T.setVisibleItems(5).setCenterDrawable(R.drawable.wheel_custom_val_white_1).setCenterStyle(getResources().getString(R.string.unit_sec_short), i, 20.0f).setViewAdapter(new PickAdapter(this, 3, 30, wheelView, ContextCompat.getColor(this, i), ContextCompat.getColor(this, R.color.main_ui_content_color), -2003199591, true, 46, 24, 21, 21, 1));
        int inComingCallNotifyTime = this.P.getInComingCallNotifyTime();
        this.T.setCurrentItem(inComingCallNotifyTime - 3);
        textView.setText(getResources().getQuantityString(R.plurals.incoming_call_delay_dialog_alert_tips, inComingCallNotifyTime, Integer.valueOf(inComingCallNotifyTime)));
        this.T.addScrollingListener(new b(textView));
        new AlertDialogFragment.Builder(this).setContentView(viewInflate).setPositiveButton(getString(R.string.yes), this.q0).setNegativeButton(getString(R.string.cancel), this.q0).setCancelable(true).show(getSupportFragmentManager());
    }

    private void k0(boolean z) {
        if (!q0()) {
            if (this.P.isIncallContactNotifyEnabled()) {
                this.I.setChecked(true);
            } else {
                this.I.setChecked(false);
            }
            f1();
            return;
        }
        if (this.R.setMiuiSupportAlertIncall(this.S, this.P.isInComingCallEnabled(), z, this.P.isPhoneNotifyDelayEnable() ? this.P.getInComingCallNotifyTime() : 0)) {
            f0(z);
        } else {
            i1(this, z);
            this.I.setChecked(!z);
        }
    }

    private boolean k1() {
        if (!this.p0.getValue().isFeatureEnable() || !this.L.isChecked() || this.X.getValue().checkPermission("android.permission.SEND_SMS")) {
            return false;
        }
        this.N.setTitle(R.string.send_sms_permission);
        this.N.setSubTitle(null);
        this.N.setVisibility(0);
        return true;
    }

    private void l0(boolean z) {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.CALL_SWITCH).setValue(z ? "On" : "Off"));
    }

    private void l1(boolean z) {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.CALL_STRANGE_NUM_SWITCH).setValue(z ? "On" : "Off"));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    private void m0(boolean z) {
        o1();
        if (z && this.P.isIncallNameDisplayEnabled()) {
            if (this.Z.getValue().isSupportCloudFwUpgrade()) {
                HMFwOnlineUpgradeManager hMFwOnlineUpgradeManager = HMFwOnlineUpgradeManager.getInstance();
                HMDeviceType hMDeviceType = HMDeviceType.MILI;
                if (hMFwOnlineUpgradeManager.useOnline(hMDeviceType)) {
                    HMFwOnlineUpgradeManager.getInstance().checkFwUpgrade(this, hMDeviceType, false);
                } else {
                    HMFwUpgradeManager.getInstance().checkFwUpgrade(this, HMDeviceType.MILI, false);
                }
            } else {
                HMFwUpgradeManager.getInstance().checkFwUpgrade(this, HMDeviceType.MILI, false);
            }
        }
        if (!this.o0.getValue().hasClosedNotificationByUser()) {
            ResidentNotificationManager.showNotification(ResidentNotify.INSTANCE);
            this.P.setNotificationOn(true);
        }
        j0(z);
        l0(z);
    }

    private void m1() {
        if (this.F.isEnabled() && this.P.isInComingCallEnabled()) {
            this.L.setEnabled(true);
            this.M.setEnabled(this.p0.getValue().isEnable());
        } else {
            this.L.setEnabled(false);
            this.M.setEnabled(false);
        }
    }

    private void n0(boolean z) {
        if (U0() && z) {
            new AlertDialogFragment.Builder(this).setCancelable(false).setMessage(R.string.mili_setting_update_miui).setNeutralButton(R.string.gotit, new DialogInterface.OnClickListener() { // from class: pe4
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.a.s0(dialogInterface, i);
                }
            }).show(getSupportFragmentManager());
        } else if (!T0() || !z) {
            m0(z);
        } else {
            this.Y.getValue().startKeepAliveTipsActivity(this);
            m0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n1(int i) {
        this.P.setInComingCallNotifyTime(i);
        this.O.saveInfo(2);
        DeviceIncomingCallUtil.INSTANCE.setDelayTime(i);
    }

    private void o0() {
        if (this.p0.getValue().isFeatureEnable()) {
            this.L.setVisibility(0);
            this.M.setVisibility(0);
        }
        this.L.setChecked(this.p0.getValue().isEnable());
        this.L.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xd4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.t0(compoundButton, z);
            }
        });
        this.M.setOnClickListener(new View.OnClickListener() { // from class: we4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.u0(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o1() {
        boolean zIsInComingCallEnabled = this.P.isInComingCallEnabled();
        if (zIsInComingCallEnabled && !this.X.getValue().checkPermission("android.permission.READ_PHONE_STATE")) {
            d1();
            return;
        }
        if (zIsInComingCallEnabled && this.J.isChecked() && !this.X.getValue().checkPermission("android.permission.READ_CONTACTS")) {
            a1();
            return;
        }
        if (this.V && zIsInComingCallEnabled && this.J.isChecked() && !this.X.getValue().checkPermission("android.permission.READ_CALL_LOG")) {
            Z0();
            return;
        }
        if (k1()) {
            return;
        }
        if (!zIsInComingCallEnabled || p0()) {
            h0();
        } else {
            b1();
        }
    }

    private boolean p0() {
        NotificationManager notificationManager = (NotificationManager) getSystemService(SleepHomeActivity.FROM_NOTIFICATION);
        return !this.P.isInComingCallEnabled() || Build.VERSION.SDK_INT < 24 || (notificationManager != null && notificationManager.isNotificationPolicyAccessGranted());
    }

    private void p1() {
        if (!q0()) {
            f0(false);
        }
        this.I.setChecked(this.P.isIncallContactNotifyEnabled());
    }

    private boolean q0() {
        return this.m0.getValue().isUnlockEnabled(this, this.S);
    }

    private void r0(boolean z) {
        if (z) {
            this.P.enableInComingCallTime();
        } else {
            this.P.disableInComingCallTime();
        }
        this.O.saveInfo(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s0(DialogInterface dialogInterface, int i) {
        m0(true);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0(CompoundButton compoundButton, boolean z) {
        this.M.setEnabled(z);
        this.p0.getValue().saveEnable(z);
        o1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u0(View view) {
        PhoneCallReplyMsgActivity.start(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v0(CompoundButton compoundButton, boolean z) {
        k0(z);
        l1(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x0(DialogInterface dialogInterface, int i) {
        X0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0(View view) {
        if (this.N.getTitle().equals(getString(R.string.tips_call_permission))) {
            boolean z = DeviceCompatibility.MIUI.isMIUI(this) && ((MIUIHelper) ROM.MIUI.getHelper()).isAtLeastV12();
            boolean z2 = DeviceCompatibility.isOppoPhone() && ((ColorOSHelper) ROM.ColorOS.getHelper()).isAtLeastV6();
            if (z || z2) {
                new AlertDialogFragment.Builder(this).setCancelable(false).setTitle(R.string.xihu_delete_app_dialog_title).setMessage(R.string.desc_private_permission).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: ue4
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }).setPositiveButton(R.string.got_it, new DialogInterface.OnClickListener() { // from class: qe4
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.a.x0(dialogInterface, i);
                    }
                }).show(getSupportFragmentManager());
                return;
            } else {
                X0();
                return;
            }
        }
        if (this.N.getTitle().equals(getString(R.string.tips_contact_permission))) {
            W0();
            return;
        }
        if (this.N.getTitle().equals(getString(R.string.title_call_log_per_s))) {
            V0();
        } else if (this.N.getTitle().equals(getString(R.string.send_sms_permission))) {
            Y0();
        } else {
            h1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z0(CompoundButton compoundButton, boolean z) {
        if (!this.V || !z || this.X.getValue().checkPermission("android.permission.READ_CALL_LOG")) {
            g0(z);
        } else {
            V0();
            g0(true);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.incoming_call_delay) {
            j1();
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.CALL_DELAY_SETTING_VIEW_NUM));
        }
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.BaseSmartPlayActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setSmartContent(R.layout.activity_incoming_call_alert);
        int i = R.string.incoming_call_alert;
        setRainbowTitleText(i);
        initData();
        this.V = Build.VERSION.SDK_INT >= 28;
        MiuiFnApi value = this.m0.getValue();
        this.R = value;
        this.Q = value.isSupportMiuiNotify();
        this.U = HMDeviceConfig.hasFeatureFontResDevice() && this.X.getValue().isSupportContactNameForSystemLanguage() && !this.X.getValue().supprotContactDefault();
        HMLog.i(s0, "isSupportMiuiNotify:" + this.Q + ";" + this.U + ", isDisturbGranted = " + p0(), new Object[0]);
        this.S = this.W.getValue().getBoundDeviceAddress(HMDeviceType.MILI);
        initView();
        o0();
        ((NotificationFaqView) findViewById(R.id.tv_notification_faq)).showFaq(getString(i), NotificationFaqView.FaqType.FAQ_CALL);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.n0.getValue().updateProfile(false);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.BaseSmartPlayActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.W.getValue().isConnected(HMDeviceType.MILI)) {
            o1();
        }
        this.G.setVisibility(8);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.CALL_VIEW_NUM));
        p1();
    }
}
