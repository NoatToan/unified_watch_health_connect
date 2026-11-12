package com.huawei.hwversionmgr.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.R;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import defpackage.lmf;
import defpackage.nuq;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.UnitUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes40.dex */
public class AppUpdateDialogActivity extends Activity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private nuq f17745a;
    private HealthTextView aa;
    private HealthTextView ac;
    private HealthTextView ad;
    private HealthTextView ae;
    private HealthTextView af;
    private HealthTextView ag;
    private HealthTextView ah;
    private HealthTextView ai;
    private LinearLayout ak;
    private HealthTextView al;
    private HealthTextView am;
    private ImageView f;
    private HealthButton h;
    private HealthButton i;
    private HealthTextView j;
    private HealthTextView l;
    private HealthTextView m;
    private HealthProgressBar n;
    private LinearLayout o;
    private LinearLayout p;
    private Intent s;
    private HealthProgressBar t;
    private HealthButton v;
    private LinearLayout y;
    private HealthButton z;
    private Context k = null;
    private boolean w = false;
    private boolean q = false;
    private boolean r = false;
    private long ab = 0;
    private boolean x = false;
    private int e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f17747c = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f17746b = null;
    private String g = null;
    private boolean u = false;
    private BroadcastReceiver d = new BroadcastReceiver() { // from class: com.huawei.hwversionmgr.activity.AppUpdateDialogActivity.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.a("AppUpdateDialogActivity", "mBroadcastReceiver intent is null");
                return;
            }
            String action = intent.getAction();
            LogUtil.a("AppUpdateDialogActivity", "onReceive: action = ", action);
            if ("action_app_check_new_version_state".equals(action)) {
                AppUpdateDialogActivity.this.b(intent);
            }
        }
    };

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.k = this;
        LogUtil.a("AppUpdateDialogActivity", "onCreate()");
        this.f17745a = nuq.d();
        setContentView(R.layout.activity_app_update_dialog);
        Window window = getWindow();
        window.setWindowAnimations(R.style.app_update_dialog_anim);
        c(window);
        h();
        Intent intent = getIntent();
        this.s = intent;
        if (intent == null) {
            return;
        }
        boolean z = intent.hasExtra("mChangeLog") || this.s.hasExtra("UpdateMode");
        this.u = z;
        if (z) {
            g();
        } else {
            i();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_app_check_new_version_state");
        BroadcastManagerUtil.d(this.k, this.d, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void c(Window window) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (qrs.af(this.k)) {
            attributes.width = -1;
            window.setGravity(17);
        } else if (qrs.c((Activity) this)) {
            attributes.width = -1;
            window.setGravity(80);
        } else {
            Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
            attributes.width = (qrs.q() - ((Integer) safeRegionWidth.first).intValue()) - ((Integer) safeRegionWidth.second).intValue();
            window.setGravity(80);
        }
        attributes.height = -2;
        onWindowAttributesChanged(attributes);
    }

    private void i() {
        String stringExtra;
        int intExtra = 0;
        String stringExtra2 = null;
        try {
            this.w = this.s.getBooleanExtra("isForced", false);
            stringExtra = this.s.getStringExtra("name");
            try {
                intExtra = this.s.getIntExtra("size", 0);
                stringExtra2 = this.s.getStringExtra("message");
            } catch (Exception unused) {
                LogUtil.e("AppUpdateDialogActivity", "initUpdateMode Exception");
            }
        } catch (Exception unused2) {
            stringExtra = null;
        }
        String str = stringExtra2;
        String str2 = stringExtra;
        long j = intExtra;
        this.ab = j;
        LogUtil.a("AppUpdateDialogActivity", "appname:", str2, "appsize", Integer.valueOf(intExtra), "message", str);
        if (str2 == null || intExtra == 0 || str == null) {
            f();
            c();
            return;
        }
        this.q = true;
        this.f17745a.d(str2);
        this.f17745a.a(qrs.a(this.k, j));
        LogUtil.a("AppUpdateDialogActivity", "initUpdateMode: Utils.formatFileSize = ", qrs.a(this.k, this.ab), ",result = ", Formatter.formatFileSize(this.k, this.ab));
        nuq nuqVar = this.f17745a;
        nuqVar.b(nuqVar.e(str));
        p();
    }

    private void g() {
        try {
            this.w = this.s.getBooleanExtra("isForced", false);
            this.e = this.s.getIntExtra("appNewVersionNumSize", this.e);
            this.f17747c = this.s.getStringExtra("mAppNewVersion");
            this.f17746b = HwVersionManager.b(this.k).t(this.s.getStringExtra("mAppNewFeatureContent"));
            this.g = this.s.getStringExtra("mChangeLog");
        } catch (Exception unused) {
            LogUtil.e("AppUpdateDialogActivity", "initValue Exception");
        }
        this.q = true;
        this.f17745a.b(this.e);
        this.f17745a.a(qrs.a(this.k, this.e));
        this.f17745a.d(this.f17747c);
        this.f17745a.b(this.f17746b);
        LogUtil.a("AppUpdateDialogActivity", "initValue() appContent = ", this.f17745a.f(), ", appVersion = ", this.f17745a.j(), ", mAppNewVersionNumSize = ", qrs.a(this.k, this.e), ", mAppNewVersionNumSize = ", Formatter.formatFileSize(this.k, this.e), "isForced = ", Boolean.valueOf(this.w));
        this.f17745a.c(this.k, true);
        if (ParamConstants.CallbackMethod.ON_FAIL.equals(this.g)) {
            LogUtil.a("AppUpdateDialogActivity", "STATE_FETCH_CHANGELOG_FAILED");
            this.q = false;
            c(this.k.getString(R.string.IDS_update_get_changelog_failed));
            return;
        }
        p();
    }

    @Override // android.app.Activity
    protected void onResume() {
        LogUtil.a("AppUpdateDialogActivity", "onResume()");
        super.onResume();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        LogUtil.a("AppUpdateDialogActivity", "onBackPressed() isForcedUpdate = " + this.w);
        if (this.w) {
            r();
        } else {
            if (this.r) {
                this.z.setText(this.k.getString(R.string.IDS_settings_button_cancal));
                this.v.setText(this.k.getString(R.string.IDS_contact_confirm));
                e(this.k.getString(R.string.IDS_service_area_notice_title), this.k.getString(R.string.IDS_ota_update_app_updating_exit));
                return;
            }
            finish();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        LogUtil.a("AppUpdateDialogActivity", "onConfigurationChanged()");
        super.onConfigurationChanged(configuration);
        c(getWindow());
    }

    private void f() {
        this.o.setVisibility(0);
        this.ak.setVisibility(8);
        this.p.setVisibility(8);
        this.y.setVisibility(8);
        this.j.setText(this.k.getString(R.string.IDS_app_update_check));
        this.t.setVisibility(0);
    }

    private boolean k() {
        return "com.huawei.bone".equals(BaseApplication.getAppPackage());
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        try {
            BroadcastReceiver broadcastReceiver = this.d;
            if (broadcastReceiver != null) {
                unregisterReceiver(broadcastReceiver);
            }
        } catch (Exception unused) {
            LogUtil.e("AppUpdateDialogActivity", "onDestroy Exception");
        }
        this.k = null;
        LogUtil.a("AppUpdateDialogActivity", "onDestroy()");
    }

    private void h() {
        LogUtil.a("AppUpdateDialogActivity", "Enter initView!");
        this.o = (LinearLayout) qsp.a(this, R.id.AppUpdateDialog_check_layout);
        this.j = (HealthTextView) qsp.a(this, R.id.AppUpdateDialog_check_textView);
        this.t = (HealthProgressBar) qsp.a(this, R.id.AppUpdateDialog_check_progressbar);
        this.ak = (LinearLayout) qsp.a(this, R.id.AppUpdateDialog_show_changelog);
        this.ah = (HealthTextView) qsp.a(this, R.id.AppUpdateDialog_changelog_title);
        this.al = (HealthTextView) qsp.a(this, R.id.AppUpdateDialog_changelog_version);
        this.am = (HealthTextView) qsp.a(this, R.id.AppUpdateDialog_changelog_version_value);
        this.ai = (HealthTextView) qsp.a(this, R.id.AppUpdateDialog_changelog_size);
        this.af = (HealthTextView) qsp.a(this, R.id.AppUpdateDialog_changelog_size_value);
        this.ae = (HealthTextView) qsp.a(this, R.id.AppUpdateDialog_changelog_detail);
        this.ac = (HealthTextView) qsp.a(this, R.id.AppUpdateDialog_changelog_context);
        this.ag = (HealthTextView) qsp.a(this, R.id.AppUpdateDialog_update_tip);
        this.i = (HealthButton) qsp.a(this, R.id.AppUpdateDialog_show_left);
        this.h = (HealthButton) qsp.a(this, R.id.AppUpdateDialog_show_right);
        this.p = (LinearLayout) qsp.a(this, R.id.AppUpdateDialog_progress_layout);
        this.l = (HealthTextView) qsp.a(this, R.id.AppUpdateDialog_progress_text);
        this.m = (HealthTextView) qsp.a(this, R.id.AppUpdateDialog_progress);
        this.n = (HealthProgressBar) qsp.a(this, R.id.AppUpdateDialog_progressbar);
        this.f = (ImageView) qsp.a(this, R.id.AppUpdateDialog_cancel);
        this.y = (LinearLayout) qsp.a(this, R.id.AppUpdateDialog_notification);
        this.aa = (HealthTextView) qsp.a(this, R.id.AppUpdateDialog_notification_context);
        this.ad = (HealthTextView) qsp.a(this, R.id.AppUpdateDialog_notification_title);
        this.v = (HealthButton) qsp.a(this, R.id.AppUpdateDialog_notification_left);
        this.z = (HealthButton) qsp.a(this, R.id.AppUpdateDialog_notification_right);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        LogUtil.a("AppUpdateDialogActivity", "mIsForced = ", Boolean.valueOf(this.w));
        if (id == R.id.AppUpdateDialog_show_left) {
            o();
            return;
        }
        if (id == R.id.AppUpdateDialog_show_right) {
            s();
            return;
        }
        if (id == R.id.AppUpdateDialog_cancel) {
            m();
            return;
        }
        if (id == R.id.AppUpdateDialog_notification_left) {
            n();
        } else if (id == R.id.AppUpdateDialog_notification_right) {
            l();
        } else {
            LogUtil.a("AppUpdateDialogActivity", "onClick else branch");
        }
    }

    private void l() {
        LogUtil.a("AppUpdateDialogActivity", "notification user choose continue :", Boolean.valueOf(this.q));
        if (this.q) {
            if (this.x) {
                e();
                return;
            } else {
                d();
                return;
            }
        }
        f();
        c();
    }

    private void n() {
        if (this.w) {
            Intent intent = new Intent();
            intent.setAction("com.huawei.commonui.CLEAN_ACTIVITY");
            LocalBroadcastManager.getInstance().sendBroadcast(intent);
        }
        if (this.r) {
            this.f17745a.b();
        }
        finish();
    }

    private void m() {
        if (this.w) {
            r();
            return;
        }
        this.z.setText(this.k.getString(R.string.IDS_settings_button_cancal));
        this.v.setText(this.k.getString(R.string.IDS_contact_confirm));
        e(this.k.getString(R.string.IDS_service_area_notice_title), this.k.getString(R.string.IDS_ota_update_app_updating_exit));
    }

    private void s() {
        j();
        HashMap map = new HashMap(16);
        map.put("click", "1");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.ABOUT_1150001.value(), map, 0);
    }

    private void o() {
        if (this.w) {
            r();
        } else {
            finish();
        }
    }

    private void a(int i) {
        String string;
        LogUtil.a("AppUpdateDialogActivity", "enter checkVersionFailed()");
        if (i == 0) {
            LogUtil.a("AppUpdateDialogActivity", "No New Version");
            qpx.b(getApplicationContext(), this.k.getString(R.string.IDS_hwh_me_settings_app_update));
            finish();
        } else {
            if (i == 1) {
                c(this.k.getResources().getString(R.string.IDS_update_network_error));
                return;
            }
            if (i == 2) {
                string = this.k.getResources().getString(R.string.IDS_update_server_error);
            } else {
                string = this.k.getResources().getString(R.string.IDS_update_unknown_error);
            }
            c(string);
        }
    }

    private void b(Intent intent, int i, String str) {
        LogUtil.a("AppUpdateDialogActivity", "enter checkVersionSuccess()");
        this.q = true;
        this.f17745a.b(i);
        long j = i;
        this.f17745a.a(qrs.a(this.k, j));
        this.f17745a.d(str);
        LogUtil.a("AppUpdateDialogActivity", "STATE_CHECK_NEW_VERSION_SUCCESS: appVersion = ", this.f17745a.j(), " ,size = ", qrs.a(this.k, j), ", result = ", Formatter.formatFileSize(this.k, j));
        this.f17745a.c(this.k, true);
        try {
            this.w = intent.getBooleanExtra("isForced", false);
        } catch (BadParcelableException unused) {
            LogUtil.e("AppUpdateDialogActivity", "checkVersionSuccess() BadParcelableException");
        }
        LogUtil.a("AppUpdateDialogActivity", "check success!  mIsForced :", Boolean.valueOf(this.w));
    }

    private void a() {
        LogUtil.a("AppUpdateDialogActivity", "enter fetchFailed()");
        this.q = false;
        c(this.k.getString(R.string.IDS_update_get_changelog_failed));
    }

    private void e(int i) {
        LogUtil.a("AppUpdateDialogActivity", "downloadFail()", Integer.valueOf(i));
        this.x = false;
        if (i == 1) {
            c(this.k.getString(R.string.IDS_update_download_check_failed));
        } else if (i == 11) {
            this.v.setText(this.k.getString(R.string.IDS_settings_button_cancal));
            this.z.setText(this.k.getString(R.string.IDS_apphelp_pwindows_continue_button));
            e(this.k.getString(R.string.IDS_service_area_notice_title), this.k.getString(R.string.IDS_ota_update_is_roaming));
            this.x = true;
        } else if (i == 3) {
            c(this.k.getString(R.string.IDS_update_network_error));
        } else if (i == 4) {
            String string = this.k.getString(R.string.IDS_settings_firmware_upgrade_phone_low_battery);
            if (qrs.ah(BaseApplication.getContext())) {
                string = this.k.getString(R.string.IDS_pad_phone_low_battery, UnitUtil.e(10.0d, 2, 0));
            }
            a(string);
        } else {
            c(this.k.getString(R.string.IDS_update_download_failed));
        }
        this.r = false;
    }

    private void b() {
        LogUtil.a("AppUpdateDialogActivity", "enter downloadSuccess()");
        this.x = false;
        this.r = false;
        this.f17745a.k();
    }

    private void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        nuq nuqVar = this.f17745a;
        nuqVar.b(nuqVar.e(str));
        LogUtil.a("AppUpdateDialogActivity", "fetchSuccess() appContent = ", this.f17745a.f());
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Intent intent) {
        int intExtra;
        String stringExtra;
        int intExtra2 = -1;
        try {
            intExtra = intent.getIntExtra("state", -1);
            try {
                intExtra2 = intent.getIntExtra("result", -1);
                stringExtra = intent.getStringExtra("content");
            } catch (BadParcelableException unused) {
                LogUtil.e("AppUpdateDialogActivity", "updateAppState() BadParcelableException");
                stringExtra = "";
            }
        } catch (BadParcelableException unused2) {
            intExtra = -1;
        }
        LogUtil.a("AppUpdateDialogActivity", "updateAppState: state = ", Integer.valueOf(intExtra), ", result = ", Integer.valueOf(intExtra2));
        if (intExtra == 11) {
            a(intExtra2);
        }
        if (intExtra == 12) {
            b(intent, intExtra2, stringExtra);
            return;
        }
        if (intExtra == 27) {
            q();
            return;
        }
        if (intExtra == 40) {
            if (intExtra2 == 47) {
                c(this.k.getString(R.string.IDS_update_install_failed));
                return;
            }
            return;
        }
        if (intExtra == 31) {
            a();
            return;
        }
        if (intExtra == 32) {
            b(stringExtra);
            return;
        }
        switch (intExtra) {
            case 20:
                t();
                break;
            case 21:
                b(intExtra2);
                break;
            case 22:
                e(intExtra2);
                break;
            case 23:
                b();
                break;
            default:
                LogUtil.a("AppUpdateDialogActivity", "updateAppState default = ", Integer.valueOf(intExtra));
                break;
        }
    }

    private void t() {
        LogUtil.a("AppUpdateDialogActivity", "STATE_DOWNLOAD_APP_START");
        b(0);
        this.r = true;
        Context context = this.k;
        qpx.b(context, context.getString(R.string.IDS_app_updating_background));
        finish();
    }

    private void q() {
        this.f17745a.a((Boolean) true);
        finish();
    }

    private void p() {
        LogUtil.a("AppUpdateDialogActivity", "Enter showAppNewVersion");
        this.o.setVisibility(8);
        this.p.setVisibility(8);
        this.ak.setVisibility(0);
        this.y.setVisibility(8);
        this.ag.setVisibility(0);
        this.ah.setText(this.k.getString(R.string.IDS_ota_update_state_check_new_version));
        this.al.setText(this.k.getString(R.string.IDS_app_update_version));
        this.am.setText(this.f17745a.j());
        this.ai.setText(this.k.getString(R.string.IDS_app_update_size));
        this.af.setText(this.f17745a.h());
        this.ae.setText(this.k.getString(R.string.IDS_app_update_detail));
        this.ac.setText(this.f17745a.f());
        this.i.setText(this.k.getString(R.string.IDS_app_update_later));
        this.h.setText(this.k.getString(R.string.IDS_app_update_now));
        this.h.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.hwversionmgr.activity.AppUpdateDialogActivity.5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                AppUpdateDialogActivity.this.h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (AppUpdateDialogActivity.this.h.getLineCount() > 1 || AppUpdateDialogActivity.this.i.getLineCount() > 1) {
                    if (AppUpdateDialogActivity.this.h.getParent() instanceof LinearLayout) {
                        ((LinearLayout) AppUpdateDialogActivity.this.h.getParent()).setOrientation(1);
                    }
                    AppUpdateDialogActivity.this.findViewById(R.id.AppUpdateDialog_show_divider).setVisibility(8);
                }
            }
        });
        this.i.setOnClickListener(this);
        this.h.setOnClickListener(this);
    }

    private void b(int i) {
        LogUtil.a("AppUpdateDialogActivity", "Enter showAppDownloadProgress progress = ", Integer.valueOf(i));
        if (!k()) {
            this.n.setProgressDrawable(getResources().getDrawable(R.drawable.custom_progressbar_color));
        }
        this.m.setText(String.valueOf(i) + "%");
        this.n.setProgress(i);
    }

    private void c(String str) {
        this.v.setText(this.k.getString(R.string.IDS_settings_button_cancal));
        this.z.setText(this.k.getString(R.string.IDS_retry));
        e(this.k.getString(R.string.IDS_settings_firmware_upgrade_talk_band_failed), str);
        this.f17745a.a((Boolean) false);
    }

    private void e(String str, String str2) {
        LogUtil.a("AppUpdateDialogActivity", "showErrorMsg : ", str2);
        this.o.setVisibility(8);
        this.p.setVisibility(8);
        this.ak.setVisibility(8);
        this.y.setVisibility(0);
        this.ad.setText(str);
        this.aa.setText(str2);
        this.v.setOnClickListener(this);
        this.z.setOnClickListener(this);
    }

    private void c() {
        LogUtil.a("AppUpdateDialogActivity", "doCheckAppNewVersion");
        this.f17745a.g();
    }

    private void j() {
        nuq nuqVar = this.f17745a;
        boolean zC = nuqVar.c(nuqVar.i());
        LogUtil.a("AppUpdateDialogActivity", "handleAppNewVersion: mAppNewVersionNumSize = ", Integer.valueOf(this.f17745a.i()), "handleAppNewVersion: isMemoryEnough = ", Boolean.valueOf(zC));
        if (!zC) {
            c(this.k.getString(R.string.IDS_update_low_memory));
        } else {
            d();
        }
    }

    private void d() {
        boolean zN = this.f17745a.n();
        LogUtil.a("AppUpdateDialogActivity", "handleAppNewVersion: isWifiConnected = ", Boolean.valueOf(zN));
        if (!zN) {
            if (CommonUtil.ah(this.k)) {
                this.v.setText(this.k.getString(R.string.IDS_settings_button_cancal));
                this.z.setText(this.k.getString(R.string.IDS_apphelp_pwindows_continue_button));
                e(this.k.getString(R.string.IDS_service_area_notice_title), this.k.getString(R.string.IDS_ota_update_is_roaming));
                this.x = true;
                return;
            }
            e();
            return;
        }
        e();
    }

    private void e() {
        this.f17745a.c();
        LogUtil.a("AppUpdateDialogActivity", "doDownloadAppFile mIsDownloading: ", Boolean.valueOf(this.r));
        this.o.setVisibility(8);
        this.p.setVisibility(8);
        this.ak.setVisibility(8);
        this.y.setVisibility(8);
        this.l.setText(this.k.getString(R.string.IDS_app_update_updating));
        this.f.setOnClickListener(this);
        if (this.r) {
            return;
        }
        this.f17745a.a();
    }

    private void r() {
        this.v.setText(this.k.getString(R.string.IDS_settings_firmware_upgrade_exit));
        this.z.setText(this.k.getString(R.string.IDS_update_new_version_ok));
        e(this.k.getString(R.string.IDS_service_area_notice_title), this.k.getString(R.string.IDS_ota_force_alert_tip_app));
    }

    private void a(String str) {
        this.v.setText(this.k.getString(R.string.IDS_common_notification_know_tips));
        this.z.setVisibility(8);
        e(this.k.getString(R.string.IDS_service_area_notice_title), str);
    }
}
