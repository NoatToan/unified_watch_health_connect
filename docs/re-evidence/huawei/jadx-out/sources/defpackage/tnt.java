package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationManagerCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.model.ecgservice.EcgServiceActivationData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.activity.notification.NotificationSettingActivity;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.device.utlis.clouddevice.DevicePopTipBiUtil;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.homewear21.home.WearHomeOldActivity;
import com.huawei.ui.homewear21.home.card.WearHomeBaseCard;
import com.huawei.ui.homewear21.home.card.WechatDeviceProviderHelper;
import com.huawei.ui.homewear21.home.holder.WearHomeTipHolder;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public class tnt extends WearHomeBaseCard {
    private NoTitleCustomAlertDialog f;
    private NoTitleCustomAlertDialog i;
    private WearHomeTipHolder j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f49398b = 2;
    private DeviceCapability e = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f49399c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f49397a = true;
    private IBaseResponseCallback d = new IBaseResponseCallback() { // from class: tnt.1
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("WearHomeTipCard", "EcgServiceActiveCallback onResponse errCode:", Integer.valueOf(i));
            if (i == 0) {
                tnt.this.f49399c = true;
                tnt.this.x();
            }
            tnt.this.e();
        }
    };

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public void onDestroy() {
    }

    public tnt(Context context, WearHomeOldActivity wearHomeOldActivity) {
        this.mContext = context;
        this.mActivity = wearHomeOldActivity;
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public RecyclerView.ViewHolder getCardViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.j = new WearHomeTipHolder(layoutInflater.inflate(R.layout.wear_home_tip_layout, viewGroup, false));
        LogUtil.a("WearHomeTipCard", "getCardViewHolder onUiCreate");
        v();
        return this.j;
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public void deviceConnectionChange(int i) {
        LogUtil.a("WearHomeTipCard", "deviceConnectionChange:", Integer.valueOf(i));
        this.f49398b = i;
        aa();
        LogUtil.a("WearHomeTipCard", "deviceConnectionChange mSensitiveUnbind is " + this.mActivity.t, ",isBRDevice is " + this.f49397a);
        if (this.mActivity.t && !this.f49397a && i == 3) {
            LogUtil.a("WearHomeTipCard", "ble device unpair requestPermissions");
            this.mActivity.t = false;
            if (this.mActivity.b("deviceConnectionChange")) {
                return;
            }
            rdp.a(this.mActivity.f26233a, this.mActivity, this.mActivity.d.getDeviceBluetoothType());
        }
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public void onResume() {
        aa();
    }

    private void v() {
        aa();
    }

    private void n() {
        if (!CommonUtil.bg() && this.mActivity.h) {
            boolean zAreNotificationsEnabled = NotificationManagerCompat.from(this.mContext).areNotificationsEnabled();
            LogUtil.a("WearHomeTipCard", "notification switch status:", Boolean.valueOf(zAreNotificationsEnabled));
            if (!zAreNotificationsEnabled) {
                t();
                return;
            } else {
                j();
                return;
            }
        }
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        LogUtil.a("WearHomeTipCard", "dealOtherNotificationDialog in. ");
        if (this.mActivity == null) {
            return;
        }
        if (this.f49398b != 2) {
            this.j.e().setVisibility(8);
            return;
        }
        if (this.mContext == null) {
            return;
        }
        if (nzz.c() && ((!nzz.c(this.mContext) || mir.c()) && tqp.a("wear_keep_app_alive_tip_time", 7))) {
            s();
        } else {
            c(new WechatDeviceProviderHelper.CheckResultListener() { // from class: tnt.3
                @Override // com.huawei.ui.homewear21.home.card.WechatDeviceProviderHelper.CheckResultListener
                public void onResult(boolean z) {
                    if (z) {
                        tnt.this.k();
                    } else {
                        tnt.this.h();
                    }
                }
            });
        }
    }

    private void s() {
        LogUtil.a("WearHomeTipCard", "initKeepAppAliveTip");
        this.j.d().setText(this.mContext.getResources().getString(R.string.IDS_go_setting).toUpperCase(Locale.ENGLISH));
        this.j.c().setText(this.mContext.getResources().getString(R.string.IDS_main_btn_state_ignore).toUpperCase(Locale.ENGLISH));
        String string = this.mContext.getResources().getString(R.string.IDS_keep_app_alive_tip_title);
        String string2 = this.mContext.getResources().getString(R.string.IDS_keep_app_alive_tip_content);
        e(DevicePopTipBiUtil.Content.THIRD_PARTY_KEEP_ALIVE, DevicePopTipBiUtil.Action.NONE, DevicePopTipBiUtil.Event.SHOW);
        qjy.d(new IBaseResponseCallback() { // from class: tnt.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("WearHomeTipCard", "initKeepAppAliveTip onResponse errCode:", Integer.valueOf(i));
                if (tnt.this.mActivity == null) {
                    LogUtil.j("WearHomeTipCard", "initKeepAppAliveTip onResponse mActivity == null");
                    return;
                }
                if (i == 0) {
                    mir.d(false);
                    tnt.this.e(DevicePopTipBiUtil.Content.THIRD_PARTY_KEEP_ALIVE, DevicePopTipBiUtil.Action.DETERMINED, DevicePopTipBiUtil.Event.CLICK);
                    tnt.this.mActivity.u.execute(new Runnable() { // from class: tnt.2.2
                        @Override // java.lang.Runnable
                        public void run() {
                            OpAnalyticsUtil.getInstance().setRiskWarningEvent("gotoKeepAliveSetting", "TipKeepAppAlive");
                            rdp.d(tnt.this.mActivity, "11073");
                        }
                    });
                } else {
                    if (i == 100000) {
                        mir.d(false);
                        tqp.d("wear_keep_app_alive_tip_time");
                        tnt.this.e(DevicePopTipBiUtil.Content.THIRD_PARTY_KEEP_ALIVE, DevicePopTipBiUtil.Action.CANCEL, DevicePopTipBiUtil.Event.CLICK);
                        return;
                    }
                    LogUtil.j("WearHomeTipCard", "initKeepAppAliveTip onResponse nothing");
                }
            }
        }, this.j.e(), string, string2, (String) null);
    }

    private void i() {
        if (this.f49398b != 2) {
            LogUtil.j("WearHomeTipCard", "dealMissSensitiveNotificationDialog device disconnect.");
            this.j.e().setVisibility(8);
        } else if (tqp.b(this.mContext, this.mActivity.f, false)) {
            q();
        } else {
            p();
        }
    }

    private void m() {
        if (tqp.f(this.mContext) && this.mActivity.f != 75) {
            w();
        } else {
            n();
        }
    }

    private void w() {
        ReleaseLogUtil.d("R_WearHomeTipCard", "reopenNotificationTip");
        this.j.d().setText(this.mContext.getResources().getString(R.string.IDS_hwh_motiontrack_permission_guide_go_set).toUpperCase(Locale.ENGLISH));
        this.j.c().setText(this.mContext.getResources().getString(R.string.IDS_main_btn_state_ignore).toUpperCase(Locale.ENGLISH));
        String string = this.mContext.getResources().getString(R.string.IDS_reopen_notification_title);
        String string2 = this.mContext.getResources().getString(R.string.IDS_reopen_notification_content);
        String string3 = this.mContext.getResources().getString(R.string.IDS_reopen_notification_close);
        String string4 = this.mContext.getResources().getString(R.string.IDS_reopen_notification_reopen);
        e(DevicePopTipBiUtil.Content.REOPEN_NOTIFICATION, DevicePopTipBiUtil.Action.NONE, DevicePopTipBiUtil.Event.SHOW);
        qjy.d(new IBaseResponseCallback() { // from class: tnt.7
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("WearHomeTipCard", "initMissSensitiveNotificationTip onResponse errCode:", Integer.valueOf(i));
                if (tnt.this.mActivity == null) {
                    LogUtil.j("WearHomeTipCard", "initMissSensitiveNotificationTip onResponse mActivity == null");
                    return;
                }
                if (i == 0) {
                    tnt.this.e(DevicePopTipBiUtil.Content.REOPEN_NOTIFICATION, DevicePopTipBiUtil.Action.DETERMINED, DevicePopTipBiUtil.Event.CLICK);
                    tnt.this.mActivity.startActivity(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"));
                    tqp.d("reopen_notifications_by_service_exe_time");
                    return;
                }
                if (i == 100000) {
                    tnt.this.e(DevicePopTipBiUtil.Content.REOPEN_NOTIFICATION, DevicePopTipBiUtil.Action.CANCEL, DevicePopTipBiUtil.Event.CLICK);
                    tqp.d("wear_reopen_notification_time");
                    tqp.d("reopen_notifications_by_service_exe_time");
                    return;
                }
                LogUtil.j("WearHomeTipCard", "initMissSensitiveNotificationTip onResponse nothing");
            }
        }, this.j.e(), string, string2, null, string3, string4);
    }

    public void g() {
        boolean zA;
        if (this.mActivity.q != null) {
            String strB = rdi.c().b();
            LogUtil.a("WearHomeTipCard", "isShowMissSensitiveNotificationDialog wearOsPkg:", strB);
            if (this.mActivity.f == 32) {
                zA = this.mActivity.q.a(strB);
            } else {
                zA = this.mActivity.q.b() && this.mActivity.q.e();
            }
            ReleaseLogUtil.d("R_WearHomeTipCard", "isShowMissSensitiveNotificationDialog isOpened:", Boolean.valueOf(zA));
            if (zA) {
                a();
            }
        }
    }

    public void a() {
        e(DevicePopTipBiUtil.Content.REOPEN_NOTIFICATION_DIALOG, DevicePopTipBiUtil.Action.NONE, DevicePopTipBiUtil.Event.SHOW);
        String string = this.mContext.getResources().getString(R.string.IDS_reopen_notification_content);
        String string2 = this.mContext.getResources().getString(R.string.IDS_reopen_notification_close);
        String string3 = this.mContext.getResources().getString(R.string.IDS_reopen_notification_reopen);
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.mContext).b(b(String.format(string, string2, string3), string2, string3)).c(R.string.IDS_hwh_motiontrack_permission_guide_go_set, new View.OnClickListener() { // from class: toa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.c(view);
            }
        }).a(R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: tnx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49414b.e(view);
            }
        }).c();
        this.i = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.i.show();
    }

    /* synthetic */ void c(View view) {
        LogUtil.a("WearHomeTipCard", "showSwitchNotifactionDialog setting");
        e(DevicePopTipBiUtil.Content.REOPEN_NOTIFICATION_DIALOG, DevicePopTipBiUtil.Action.DETERMINED, DevicePopTipBiUtil.Event.CLICK);
        this.mActivity.startActivity(new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS"));
    }

    /* synthetic */ void e(View view) {
        e(DevicePopTipBiUtil.Content.REOPEN_NOTIFICATION_DIALOG, DevicePopTipBiUtil.Action.CANCEL, DevicePopTipBiUtil.Event.CLICK);
    }

    private SpannableString b(String str, String str2, String str3) {
        SpannableString spannableString = new SpannableString(str);
        qri.a(spannableString, str2, new StyleSpan(1));
        qri.a(spannableString, str3, new StyleSpan(1));
        return spannableString;
    }

    private void q() {
        ReleaseLogUtil.d("R_WearHomeTipCard", "initMissSensitiveNotificationTip");
        this.j.d().setText(this.mContext.getResources().getString(R.string.IDS_hw_health_user_profile_go_setting).toUpperCase(Locale.ENGLISH));
        this.j.c().setText(this.mContext.getResources().getString(R.string.IDS_main_btn_state_ignore).toUpperCase(Locale.ENGLISH));
        String string = this.mContext.getResources().getString(R.string.IDS_miss_sensitive_notification_title_new);
        String string2 = this.mContext.getResources().getString(R.string.IDS_miss_sensitive_notification_message_new);
        e(DevicePopTipBiUtil.Content.SENSITIVE_NOTIFICATION, DevicePopTipBiUtil.Action.NONE, DevicePopTipBiUtil.Event.SHOW);
        qjy.d(new IBaseResponseCallback() { // from class: tnt.8
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("WearHomeTipCard", "initMissSensitiveNotificationTip onResponse errCode:", Integer.valueOf(i));
                if (tnt.this.mActivity == null) {
                    LogUtil.j("WearHomeTipCard", "initMissSensitiveNotificationTip onResponse mActivity == null");
                    return;
                }
                if (i != 0) {
                    if (i == 100000) {
                        tnt.this.e(DevicePopTipBiUtil.Content.SENSITIVE_NOTIFICATION, DevicePopTipBiUtil.Action.CANCEL, DevicePopTipBiUtil.Event.CLICK);
                        tqp.d("wear_sensitive_notification_time");
                        return;
                    } else {
                        LogUtil.j("WearHomeTipCard", "initMissSensitiveNotificationTip onResponse nothing");
                        return;
                    }
                }
                tnt.this.e(DevicePopTipBiUtil.Content.SENSITIVE_NOTIFICATION, DevicePopTipBiUtil.Action.DETERMINED, DevicePopTipBiUtil.Event.CLICK);
                if (lwg.d().e(tnt.this.mActivity.f26233a)) {
                    tnt.this.u();
                } else {
                    if (tnt.this.mActivity.b("initMissSensitiveNotificationTip")) {
                        return;
                    }
                    rdp.a(tnt.this.mActivity.f26233a, tnt.this.mActivity, tnt.this.mActivity.d.getDeviceBluetoothType());
                }
            }
        }, this.j.e(), string, string2, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.mContext).a(this.mContext.getResources().getString(R.string.IDS_device_ota_later_note)).c(R.string.IDS_user_permission_know, new View.OnClickListener() { // from class: tny
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("WearHomeTipCard", "showTipDialog，click known button");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public void c() {
        e(DevicePopTipBiUtil.Content.SENSITIVE_NOTIFICATION_SECONDARY, DevicePopTipBiUtil.Action.NONE, DevicePopTipBiUtil.Event.SHOW);
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.mContext).a(this.mContext.getResources().getString(R.string.IDS_miss_sensitive_notification_content)).c(R.string.IDS_go_setting, new View.OnClickListener() { // from class: tnz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(view);
            }
        }).a(R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: tob
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49416c.b(view);
            }
        }).c();
        this.f = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.f.show();
    }

    /* synthetic */ void d(View view) {
        LogUtil.a("WearHomeTipCard", "requestPermissions try again");
        e(DevicePopTipBiUtil.Content.SENSITIVE_NOTIFICATION_SECONDARY, DevicePopTipBiUtil.Action.DETERMINED, DevicePopTipBiUtil.Event.CLICK);
        if (this.mActivity.b("showMissSensitiveNotificationDialog")) {
            return;
        }
        rdp.a(this.mActivity.f26233a, this.mActivity, this.mActivity.d.getDeviceBluetoothType());
    }

    /* synthetic */ void b(View view) {
        e(DevicePopTipBiUtil.Content.SENSITIVE_NOTIFICATION_SECONDARY, DevicePopTipBiUtil.Action.CANCEL, DevicePopTipBiUtil.Event.CLICK);
        if (this.mActivity != null) {
            this.mActivity.k();
        }
    }

    private void c(WechatDeviceProviderHelper.CheckResultListener checkResultListener) {
        if (this.mActivity.d == null) {
            ReleaseLogUtil.e("R_WearHomeTipCard", "checkNeedShowWechatCard mCurrentDeviceInfo is null");
            checkResultListener.onResult(false);
            return;
        }
        boolean zB = SharedPreferenceManager.b(Integer.toString(10006), "banner_do_not_ask_again_tag_wechat_device" + this.mActivity.d.getDeviceUdid(), false);
        LogUtil.a("WearHomeTipCard", "tag_wechat_device", "isNotAskAgain: ", Boolean.valueOf(zB));
        if (zB) {
            checkResultListener.onResult(false);
        } else if (this.mActivity.c() == null) {
            checkResultListener.onResult(false);
        } else {
            this.mActivity.c().a(checkResultListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (f()) {
            y();
        }
    }

    private void y() {
        LogUtil.a("WearHomeTipCard", "showEarphonePairToastView");
        if (this.mActivity.p.b()) {
            LogUtil.a("WearHomeTipCard", "earphone pair dialog is showing. ");
        } else {
            lxb.c().e(this.mActivity.d, new EarPhoneResponseCallback() { // from class: tnt.6
                @Override // com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback
                public void onResponse(int i, final edj edjVar) {
                    tnt.this.mActivity.runOnUiThread(new Runnable() { // from class: tnt.6.2
                        @Override // java.lang.Runnable
                        public void run() {
                            edj edjVar2 = edjVar;
                            if (edjVar2 == null || TextUtils.isEmpty(edjVar2.d())) {
                                tnt.this.l();
                            } else {
                                if (lxb.c().b(edjVar.d())) {
                                    return;
                                }
                                tnt.this.l();
                            }
                        }
                    });
                }
            });
        }
    }

    private boolean f() {
        LogUtil.a("WearHomeTipCard", "checkNeedShowEarphonePair in.");
        if (!eey.d(this.mActivity.d, 112)) {
            LogUtil.j("WearHomeTipCard", "showEarphonePairToastView not support. ");
            return false;
        }
        String strE = SharedPreferenceManager.e(this.mContext, Integer.toString(10006), "banner_do_not_ask_again_tag_earphone_pair");
        LogUtil.a("WearHomeTipCard", "tag_earphone_pair", "isNotAskAgain: ", strE);
        return !"true".equals(strE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        LogUtil.a("WearHomeTipCard", "initEarphonePairToastView in. ");
        if (this.mContext == null || this.mActivity == null) {
            return;
        }
        this.j.d().setText(this.mContext.getResources().getString(R.string.IDS_earphone_banner_pair_button_continue).toUpperCase(Locale.ENGLISH));
        this.j.a().setText(this.mContext.getResources().getString(R.string.IDS_press_never_show_again).toUpperCase(Locale.ENGLISH));
        this.j.c().setText(this.mContext.getResources().getString(R.string.IDS_main_btn_state_ignore).toUpperCase(Locale.ENGLISH));
        final DeviceInfo deviceInfoE = DeviceSettingsInteractors.e(this.mContext).e();
        if (deviceInfoE == null) {
            LogUtil.j("WearHomeTipCard", "initEarphonePairToastView refresh dialog Support deviceInfo is null");
            return;
        }
        qjy.d(new IBaseResponseCallback() { // from class: tnt.9
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("WearHomeTipCard", "initEarphonePairToastView onResponse errCode:", Integer.valueOf(i));
                if (i == 0) {
                    tnt.this.mActivity.p.e(deviceInfoE, 104, true);
                } else if (i == 100000) {
                    LogUtil.a("WearHomeTipCard", "initEarphonePairToastView click ignore or never mind. ");
                } else {
                    LogUtil.j("WearHomeTipCard", "initEarphonePairToastView onResponse nothing");
                }
            }
        }, this.j.e(), this.mContext.getResources().getString(R.string.IDS_earphone_banner_pair_title), this.mContext.getResources().getString(R.string.IDS_earphone_banner_pair_content), "tag_earphone_pair");
    }

    private void t() {
        if (this.mContext == null) {
            return;
        }
        this.j.d().setText(this.mContext.getResources().getString(R.string.IDS_device_notification_open).toUpperCase(Locale.ENGLISH));
        this.j.a().setText(this.mContext.getResources().getString(R.string.IDS_press_never_show_again).toUpperCase(Locale.ENGLISH));
        this.j.c().setText(this.mContext.getResources().getString(R.string.IDS_main_btn_state_ignore).toUpperCase(Locale.ENGLISH));
        String string = this.mContext.getResources().getString(R.string.IDS_wear_note_open_notification_switch);
        final RelativeLayout relativeLayoutE = this.j.e();
        if (!qjy.a(BaseApplication.getContext(), relativeLayoutE, "wear_activity_note_permission_no_agin_tip")) {
            LogUtil.a("WearHomeTipCard", "not need remind");
            return;
        }
        HealthTextView healthTextView = (HealthTextView) qsp.a(relativeLayoutE, com.huawei.ui.commonui.R.id.toast_title_tv_bold);
        HealthTextView healthTextView2 = (HealthTextView) qsp.a(relativeLayoutE, com.huawei.ui.commonui.R.id.toast_title_tv);
        healthTextView.setVisibility(8);
        healthTextView2.setText(string);
        final IBaseResponseCallback iBaseResponseCallbackO = o();
        final int iE = qjy.e(BaseApplication.getContext(), relativeLayoutE, "wear_activity_note_permission_count", 1, iBaseResponseCallbackO);
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10006), "wear_activity_note_permission_is_show", "true", new StorageParams());
        ((LinearLayout) qsp.a(relativeLayoutE, com.huawei.ui.commonui.R.id.toast_no_notice_layout)).setOnClickListener(new View.OnClickListener() { // from class: tns
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                tnt.e(relativeLayoutE, iBaseResponseCallbackO, iE, view);
            }
        });
        qjy.a(BaseApplication.getContext(), iBaseResponseCallbackO, relativeLayoutE, "wear_activity_note_permission_dialog_time", "wear_activity_note_permission_count", "wear_activity_note_permission_is_show", iE);
    }

    static /* synthetic */ void e(RelativeLayout relativeLayout, IBaseResponseCallback iBaseResponseCallback, int i, View view) {
        qjy.e(relativeLayout, iBaseResponseCallback, BaseApplication.getContext(), "wear_activity_note_permission_no_agin_tip", "wear_activity_note_permission_is_show");
        qjy.c(BaseApplication.getContext(), "wear_activity_note_permission_dialog_time", "wear_activity_note_permission_count", i);
    }

    private IBaseResponseCallback o() {
        return new IBaseResponseCallback() { // from class: tnt.10
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ResolveInfo resolveInfoResolveActivity;
                LogUtil.a("WearHomeTipCard", "onResponse errorCode:", Integer.valueOf(i));
                if (i == 0) {
                    Intent intent = new Intent();
                    intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                    intent.putExtra("android.provider.extra.APP_PACKAGE", tnt.this.mActivity.getPackageName());
                    LogUtil.a("WearHomeTipCard", "CommonAutoTestToast onResponse.");
                    PackageManager packageManager = tnt.this.mActivity.getPackageManager();
                    if (packageManager == null || (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536)) == null) {
                        return;
                    }
                    intent.setComponent(new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name));
                    tnt.this.mActivity.startActivity(intent);
                }
            }
        };
    }

    private void r() {
        if (this.mContext == null) {
            return;
        }
        this.j.d().setText(this.mContext.getResources().getString(R.string.IDS_hw_open_pressure_auto_detection).toUpperCase(Locale.ENGLISH));
        this.j.a().setText(this.mContext.getResources().getString(R.string.IDS_press_never_show_again).toUpperCase(Locale.ENGLISH));
        this.j.c().setText(this.mContext.getResources().getString(R.string.IDS_main_btn_state_ignore).toUpperCase(Locale.ENGLISH));
        DeviceInfo deviceInfoE = DeviceSettingsInteractors.e(this.mContext).e();
        if (deviceInfoE == null) {
            LogUtil.j("WearHomeTipCard", "refresh dialog Support deviceInfo is null");
            return;
        }
        String string = this.mContext.getResources().getString(R.string.IDS_device_notification_watch);
        String string2 = this.mContext.getResources().getString(R.string.IDS_device_notification_watch_lower_case);
        if (lvi.f(deviceInfoE.getProductType())) {
            string = this.mContext.getResources().getString(R.string.IDS_device_notification_band);
            string2 = this.mContext.getResources().getString(R.string.IDS_device_notification_band_lower_case);
        }
        qjy.a(BaseApplication.getContext(), "notification_open_tip", new IBaseResponseCallback() { // from class: tnt.12
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("WearHomeTipCard", "onResponse errCode:", Integer.valueOf(i));
                if (i != 0) {
                    if (i == 100000) {
                        tnt.this.j();
                        return;
                    } else {
                        LogUtil.j("WearHomeTipCard", "onResponse nothing");
                        return;
                    }
                }
                try {
                    Intent intent = new Intent(tnt.this.mContext, (Class<?>) NotificationSettingActivity.class);
                    intent.putExtra("device_id", tnt.this.mActivity.f26233a);
                    tnt.this.mContext.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    LogUtil.e("WearHomeTipCard", "initNotificationOpenToastView ActivityNotFoundException");
                }
            }
        }, this.j.e(), String.format(Locale.ENGLISH, this.mContext.getResources().getString(R.string.IDS_device_notification_switch_closed_remind_text), string), String.format(Locale.ENGLISH, this.mContext.getResources().getString(R.string.IDS_device_notification_open_help_remind_text), string2));
    }

    private void aa() {
        if (this.j == null) {
            return;
        }
        b();
        i();
    }

    public void b() {
        this.mActivity.d = tfn.a().a(this.mActivity.f26233a);
        if (this.mActivity.d != null) {
            this.f49398b = this.mActivity.d.getDeviceConnectState();
        } else {
            this.f49398b = 3;
            LogUtil.a("WearHomeTipCard", "deviceInfo is null");
        }
    }

    public void e() {
        LogUtil.a("WearHomeTipCard", "enter showNotificationView");
        DeviceCapability deviceCapabilityE = DeviceSettingsInteractors.e(this.mContext).e(this.mActivity.f26233a);
        this.e = deviceCapabilityE;
        boolean z = deviceCapabilityE != null && deviceCapabilityE.isMessageAlert();
        this.j.e().setVisibility(8);
        if (mgb.d(this.mActivity.f26233a) == 2) {
            LogUtil.j("WearHomeTipCard", "updateHealthData is family_pair_mode");
            return;
        }
        if (this.mActivity.k) {
            return;
        }
        String strE = SharedPreferenceManager.e(this.mContext, Integer.toString(10006), "wear_activity_tip_no_againnotification_open_tip");
        LogUtil.a("WearHomeTipCard", "notRemind:", strE, "isSupportMessage:", Boolean.valueOf(z));
        if (!"true".equals(strE) && !lzi.a().d() && z) {
            r();
        } else {
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        boolean z = false;
        boolean zIsSupportEcgAuth = this.mActivity.e != null ? this.mActivity.e.isSupportEcgAuth() : false;
        if (eey.d(this.mActivity.d, 106) && fej.a("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.h5.ecgce")) {
            z = true;
        }
        boolean zO = Utils.o();
        LogUtil.a("WearHomeTipCard", "startEcgForParamsByCapability isSupportEcgAuth:", Boolean.valueOf(zIsSupportEcgAuth), ", isSupportEcgAnalysis:", Boolean.valueOf(z), ", isOversea:", Boolean.valueOf(zO));
        if (z) {
            LogUtil.a("WearHomeTipCard", "startEcgForParamsByCapability start ecg analysis");
            prf.d(BaseApplication.getContext(), "com.huawei.health.h5.ecgce", 2, "interpretation");
        } else {
            if (!zIsSupportEcgAuth || zO) {
                return;
            }
            prf.d(BaseApplication.getContext(), "com.huawei.health.ecg.collection", 2, "interpretation");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        LogUtil.a("WearHomeTipCard", "initBindWechatCardView");
        this.j.d().setText(this.mContext.getResources().getString(R.string.IDS_bind_wechat_card_goto_set).toUpperCase(Locale.ENGLISH));
        this.j.a().setText(this.mContext.getResources().getString(R.string.IDS_press_never_show_again).toUpperCase(Locale.ENGLISH));
        String string = this.mContext.getResources().getString(R.string.IDS_bind_wechat_card_title);
        String string2 = this.mContext.getResources().getString(R.string.IDS_bind_wechat_card_message);
        final RelativeLayout relativeLayoutE = this.j.e();
        e(DevicePopTipBiUtil.Content.WECHAT_DEVICE_BINDING, DevicePopTipBiUtil.Action.NONE, DevicePopTipBiUtil.Event.SHOW);
        qjy.a(BaseApplication.getContext(), new IBaseResponseCallback() { // from class: tnt.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (qrs.r()) {
                    return;
                }
                if (tnt.this.mActivity.d == null) {
                    ReleaseLogUtil.e("R_WearHomeTipCard", "initBindWechatCardView onResponse mCurrentDeviceInfo is null");
                    return;
                }
                LogUtil.a("WearHomeTipCard", "onResponse errCode:", Integer.valueOf(i));
                if (i == 0) {
                    LogUtil.a("WearHomeTipCard", "showBindWechatLayout bindWechat");
                    tnt.this.mActivity.c().b(tnt.this.mActivity);
                    tnt.this.e(DevicePopTipBiUtil.Content.WECHAT_DEVICE_BINDING, DevicePopTipBiUtil.Action.DETERMINED, DevicePopTipBiUtil.Event.CLICK);
                    relativeLayoutE.setVisibility(8);
                    return;
                }
                if (i == 100000) {
                    SharedPreferenceManager.a(Integer.toString(10006), "banner_do_not_ask_again_tag_wechat_device" + tnt.this.mActivity.d.getDeviceUdid(), true);
                    tnt.this.e(DevicePopTipBiUtil.Content.WECHAT_DEVICE_BINDING, DevicePopTipBiUtil.Action.NOT_PROMPT_AGAIN, DevicePopTipBiUtil.Event.CLICK);
                    return;
                }
                LogUtil.j("WearHomeTipCard", "click nothing");
            }
        }, relativeLayoutE, string, string2);
    }

    private void p() {
        if (this.f49398b != 2) {
            LogUtil.j("WearHomeTipCard", "initEcgServiceActiveCardView device disconnect.");
            this.j.e().setVisibility(8);
            return;
        }
        if (this.mContext == null || Utils.o()) {
            LogUtil.j("WearHomeTipCard", "initEcgServiceActiveCardView mContext is null");
            e();
            return;
        }
        if (this.f49399c) {
            LogUtil.j("WearHomeTipCard", "initEcgServiceActiveCardView has show EcgServiceView");
            e();
            return;
        }
        boolean zD = this.mActivity.d != null ? eey.d(this.mActivity.d, 45) : false;
        LogUtil.a("WearHomeTipCard", "isSupportEcgParsingService:", Boolean.valueOf(zD));
        if (!zD) {
            LogUtil.j("WearHomeTipCard", "not support EcgServiceIV");
            e();
        } else {
            lvr.a().c(new IBaseResponseCallback() { // from class: tnt.5
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (!(obj instanceof EcgServiceActivationData)) {
                        LogUtil.j("WearHomeTipCard", "objData not instanceof EcgServiceActivationData");
                        tnt.this.b(1037);
                        return;
                    }
                    EcgServiceActivationData ecgServiceActivationData = (EcgServiceActivationData) obj;
                    LogUtil.a("WearHomeTipCard", "WearHomeTipCard data is ok.");
                    if (ecgServiceActivationData.getStatus() != 0 && (ecgServiceActivationData.getStatus() != 1 || ecgServiceActivationData.getProbationUser() != 0)) {
                        tnt.this.b(1037);
                    } else {
                        LogUtil.a("WearHomeTipCard", "Need show EcgServiceActiveCardView.");
                        tnt.this.b(1035);
                    }
                }
            }, this.mActivity.d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        if (this.mActivity == null || this.mActivity.d() == null) {
            return;
        }
        this.mActivity.d().sendEmptyMessage(i);
    }

    public void d() {
        this.j.d().setText(this.mContext.getResources().getString(R.string.IDS_hw_common_ui_dialog_active).toUpperCase(Locale.ENGLISH));
        this.j.c().setText(this.mContext.getResources().getString(R.string.IDS_hw_common_active_later).toUpperCase(Locale.ENGLISH));
        qjy.e(BaseApplication.getContext(), this.d, this.j.e(), this.mContext.getResources().getString(R.string.IDS_ecg_service_tip_title), this.mContext.getResources().getString(R.string.IDS_ecg_service_tip_msg, "599"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(DevicePopTipBiUtil.Content content, DevicePopTipBiUtil.Action action, DevicePopTipBiUtil.Event event) {
        if (this.mActivity.d == null) {
            ReleaseLogUtil.e("R_WearHomeTipCard", "reportWechatTipBiEvent mCurrentDeviceInfo is null");
            return;
        }
        DevicePopTipBiUtil.TipType tipType = DevicePopTipBiUtil.TipType.TIP;
        String deviceName = this.mActivity.d.getDeviceName();
        int productType = this.mActivity.d.getProductType();
        DevicePopTipBiUtil.a(tipType, content, action, deviceName, String.valueOf(productType), this.mActivity.d.getHiLinkDeviceId(), DevicePopTipBiUtil.Page.DEVICE_DETAIL, event);
    }
}
