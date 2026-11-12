package com.huawei.ui.main.stories.me.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hmf.tasks.OnCompleteListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.push.HmsMessaging;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import defpackage.fga;
import defpackage.gdn;
import defpackage.jdi;
import defpackage.lmf;
import defpackage.lsk;
import defpackage.ltb;
import defpackage.lvb;
import defpackage.mga;
import defpackage.mhs;
import defpackage.nzz;
import defpackage.qhp;
import defpackage.ujq;
import defpackage.uub;
import defpackage.vym;
import defpackage.wvl;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.LanguageUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StepNotificationByHardWareUtils;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class NotificationMessageSettingActivity extends BaseActivity implements CompoundButton.OnCheckedChangeListener {
    private LinearLayout aa;
    private HealthSwitchButton ab;
    private HealthSwitchButton ac;
    private HealthTextView ad;
    private HealthTextView ae;
    private LinearLayout af;
    private HealthTextView ag;
    private HealthSwitchButton ah;
    private gdn ai;
    private HealthSwitchButton aj;
    private HealthSwitchButton ak;
    private HealthTextView al;
    private HealthTextView am;
    private HealthTextView an;
    private HealthTextView ao;
    private HealthDivider ap;
    private HealthSwitchButton aq;
    private HealthSwitchButton ar;
    private LinearLayout as;
    private HealthTextView at;
    private LinearLayout au;
    private HealthTextView av;
    private HealthTextView aw;
    private LinearLayout ax;
    private LinearLayout az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f28428b;
    private HealthSwitchButton bb;
    private HealthTextView f;
    private HealthTextView h;
    private HealthSwitchButton i;
    private LinearLayout j;
    private HealthTextView k;
    private HealthSwitchButton l;
    private HealthTextView m;
    private HealthSwitchButton n;
    private LinearLayout o;
    private HealthDivider t;
    private LinearLayout w;
    private LinearLayout x;
    private LinearLayout y;
    private HealthTextView z;
    private boolean e = false;
    private boolean g = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f28427a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28429c = true;
    private boolean d = true;
    private boolean p = true;
    private boolean v = true;
    private boolean u = false;
    private boolean q = false;
    private HealthOpenSDK s = null;
    private Handler r = new Handler() { // from class: com.huawei.ui.main.stories.me.activity.NotificationMessageSettingActivity.4
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("NotificationMessageSettingActivity", "handleMessage message is null");
            }
            super.handleMessage(message);
            switch (message.what) {
                case 100:
                    LogUtil.a("NotificationMessageSettingActivity", "handleMessage coreSleep switchStatus:", Boolean.valueOf(NotificationMessageSettingActivity.this.p));
                    NotificationMessageSettingActivity.this.n.setChecked(NotificationMessageSettingActivity.this.p);
                    break;
                case 101:
                    LogUtil.a("NotificationMessageSettingActivity", "handleMessage motionPath switchStatus:", Boolean.valueOf(NotificationMessageSettingActivity.this.v));
                    NotificationMessageSettingActivity.this.ac.setChecked(NotificationMessageSettingActivity.this.v);
                    break;
                case 102:
                    if (message.getData() != null) {
                        NotificationMessageSettingActivity.this.ah.setChecked(Boolean.parseBoolean(message.getData().getString("status")));
                    } else {
                        LogUtil.j("NotificationMessageSettingActivity", "data = null");
                    }
                    break;
                case 103:
                    Object obj = message.obj;
                    if (obj instanceof HashMap) {
                        NotificationMessageSettingActivity.this.a((HashMap<String, String>) obj);
                    }
                    break;
                case 104:
                    if (NotificationMessageSettingActivity.this.ai != null) {
                        NotificationMessageSettingActivity.this.as.setVisibility(0);
                        NotificationMessageSettingActivity.this.ap.setVisibility(0);
                        NotificationMessageSettingActivity.this.aq.setChecked("1".equals(NotificationMessageSettingActivity.this.ai.a()));
                        if (NotificationMessageSettingActivity.this.f28428b instanceof CompoundButton.OnCheckedChangeListener) {
                            NotificationMessageSettingActivity.this.aq.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) NotificationMessageSettingActivity.this.f28428b);
                        }
                    } else {
                        LogUtil.j("NotificationMessageSettingActivity", "mPathAutoSwitchInfo == null");
                    }
                    break;
                default:
                    LogUtil.j("NotificationMessageSettingActivity", "handleMessage");
                    break;
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle extras;
        LogUtil.a("NotificationMessageSettingActivity", "onCreate");
        super.onCreate(bundle);
        setContentView(R.layout.hw_show_settings_notification_message);
        this.f28428b = this;
        this.s = fga.d(this).e();
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            this.g = extras.getBoolean("isOpenRealTimeStep");
            this.e = extras.getBoolean("isOpenCompleteGoal");
            this.f28427a = extras.getBoolean("isOpenNotification");
        }
        g();
        e();
        b();
        d();
        l();
        c();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.q = true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ujq.a(3, "900200011", this.i.isChecked());
        ujq.a(3, "900200010", this.aj.isChecked());
        ujq.a(3, "900200004", this.ab.isChecked());
        Handler handler = this.r;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.r = null;
        }
    }

    private void e() {
        mhs.a().getSwitchSetting("core_sleep_switch_status", new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.me.activity.NotificationMessageSettingActivity.6
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("NotificationMessageSettingActivity", "getCoreSleepSwitchStatus errorCode:", Integer.valueOf(i));
                if (i != 0 || !(obj instanceof String)) {
                    NotificationMessageSettingActivity.this.p = true;
                } else {
                    String strValueOf = String.valueOf(obj);
                    LogUtil.a("NotificationMessageSettingActivity", "getCoreSleepSwitchStatus switchStatus:", strValueOf);
                    if (lsk.a(strValueOf, 10) == 1) {
                        NotificationMessageSettingActivity.this.p = true;
                    } else {
                        NotificationMessageSettingActivity.this.p = false;
                    }
                }
                if (NotificationMessageSettingActivity.this.r != null) {
                    NotificationMessageSettingActivity.this.r.sendEmptyMessage(100);
                } else {
                    LogUtil.j("NotificationMessageSettingActivity", "getCoreSleepSwitchStatus, mHandler is null");
                }
            }
        });
    }

    private void b() {
        mhs.a().getSwitchSetting("motion_path_switch_status", new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.me.activity.NotificationMessageSettingActivity.9
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("NotificationMessageSettingActivity", "getMotionPathSwitchStatus errorCode:", Integer.valueOf(i));
                if (i != 0 || !(obj instanceof String)) {
                    NotificationMessageSettingActivity.this.v = true;
                } else {
                    String strValueOf = String.valueOf(obj);
                    LogUtil.a("NotificationMessageSettingActivity", "getMotionPathSwitchStatus switchStatus:", strValueOf);
                    if (lsk.a(strValueOf, 10) == 1) {
                        NotificationMessageSettingActivity.this.v = true;
                    } else {
                        NotificationMessageSettingActivity.this.v = false;
                    }
                }
                if (NotificationMessageSettingActivity.this.r != null) {
                    NotificationMessageSettingActivity.this.r.sendEmptyMessage(101);
                } else {
                    LogUtil.j("NotificationMessageSettingActivity", "getMotionPathSwitchStatus, mHandler is null");
                }
            }
        });
    }

    private void d() {
        if (!wvl.a() && Utils.o()) {
            LogUtil.a("NotificationMessageSettingActivity", "is not support notify reminder");
            this.x.setVisibility(8);
            findViewById(R.id.divider4).setVisibility(8);
            this.w.setVisibility(8);
            findViewById(R.id.divider5).setVisibility(8);
        }
        ArrayList arrayList = new ArrayList(3);
        arrayList.add("900200004");
        arrayList.add("900200010");
        arrayList.add("900200011");
        qhp.c(arrayList, new c());
    }

    private void c() {
        LogUtil.a("NotificationMessageSettingActivity", "enter getRouteAutoSwitch");
        if (Utils.o()) {
            return;
        }
        jdi.b(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(HashMap<String, String> map) {
        if (map == null) {
            LogUtil.a("NotificationMessageSettingActivity", "setSwitchButton, switchStatusMap is null");
            return;
        }
        LogUtil.a("NotificationMessageSettingActivity", "setSwitchButton, switchStatusMap is ", map);
        if (map.containsKey("900200004")) {
            this.ab.setChecked("1".equals(map.get("900200004")));
        }
        if (map.containsKey("900200010")) {
            this.aj.setChecked("1".equals(map.get("900200010")));
        }
        if (map.containsKey("900200011")) {
            this.i.setChecked("1".equals(map.get("900200011")));
        }
    }

    private void g() {
        ((CustomTitleBar) findViewById(R.id.message_notification_title)).setTitleBarBackgroundColor(ContextCompat.getColor(this, R.color.common_transparent));
        ((HealthSubHeader) findViewById(R.id.sport_sub_header)).setSubHeaderBackgroundColor(ContextCompat.getColor(this, R.color.common_transparent));
        ((HealthSubHeader) findViewById(R.id.health_sub_header)).setSubHeaderBackgroundColor(ContextCompat.getColor(this, R.color.common_transparent));
        this.aa = (LinearLayout) findViewById(R.id.layout_system_notification);
        this.af = (LinearLayout) findViewById(R.id.layout_popup_message);
        this.ax = (LinearLayout) findViewById(R.id.layout_step_notification);
        this.az = (LinearLayout) findViewById(R.id.layout_step_gaol_success);
        this.j = (LinearLayout) findViewById(R.id.layout_core_sleep_report);
        this.au = (LinearLayout) findViewById(R.id.layout_sport_track);
        this.ae = (HealthTextView) this.aa.findViewById(R.id.reminder_switch_title);
        this.ag = (HealthTextView) this.aa.findViewById(R.id.reminder_switch_description);
        this.ah = (HealthSwitchButton) this.aa.findViewById(R.id.reminder_switch_btn);
        this.an = (HealthTextView) this.af.findViewById(R.id.notification_switch_title);
        this.ak = (HealthSwitchButton) this.af.findViewById(R.id.notification_switch_btn);
        this.av = (HealthTextView) this.ax.findViewById(R.id.notification_switch_title);
        this.ar = (HealthSwitchButton) this.ax.findViewById(R.id.notification_switch_btn);
        this.at = (HealthTextView) this.az.findViewById(R.id.notification_switch_title);
        this.bb = (HealthSwitchButton) this.az.findViewById(R.id.notification_switch_btn);
        this.k = (HealthTextView) this.j.findViewById(R.id.notification_switch_title);
        this.n = (HealthSwitchButton) this.j.findViewById(R.id.notification_switch_btn);
        this.aw = (HealthTextView) this.au.findViewById(R.id.notification_switch_title);
        this.ac = (HealthSwitchButton) this.au.findViewById(R.id.notification_switch_btn);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout_moving_remind);
        this.y = linearLayout;
        this.ad = (HealthTextView) linearLayout.findViewById(R.id.reminder_switch_title);
        this.z = (HealthTextView) this.y.findViewById(R.id.reminder_switch_description);
        HealthSwitchButton healthSwitchButton = (HealthSwitchButton) this.y.findViewById(R.id.reminder_switch_btn);
        this.ab = healthSwitchButton;
        healthSwitchButton.setChecked(true);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.layout_progress_remind);
        this.x = linearLayout2;
        this.al = (HealthTextView) linearLayout2.findViewById(R.id.reminder_switch_title);
        this.am = (HealthTextView) this.x.findViewById(R.id.reminder_switch_description);
        HealthSwitchButton healthSwitchButton2 = (HealthSwitchButton) this.x.findViewById(R.id.reminder_switch_btn);
        this.aj = healthSwitchButton2;
        healthSwitchButton2.setChecked(true);
        LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.layout_achieve_remind);
        this.w = linearLayout3;
        this.f = (HealthTextView) linearLayout3.findViewById(R.id.reminder_switch_title);
        this.h = (HealthTextView) this.w.findViewById(R.id.reminder_switch_description);
        HealthSwitchButton healthSwitchButton3 = (HealthSwitchButton) this.w.findViewById(R.id.reminder_switch_btn);
        this.i = healthSwitchButton3;
        healthSwitchButton3.setChecked(true);
        this.ar.setOnCheckedChangeListener(this);
        this.bb.setOnCheckedChangeListener(this);
        this.n.setOnCheckedChangeListener(this);
        this.ac.setOnCheckedChangeListener(this);
        this.ab.setOnCheckedChangeListener(this);
        this.aj.setOnCheckedChangeListener(this);
        this.i.setOnCheckedChangeListener(this);
        LinearLayout linearLayout4 = (LinearLayout) findViewById(R.id.layout_route_auto_punch_remind);
        this.as = linearLayout4;
        this.ao = (HealthTextView) linearLayout4.findViewById(R.id.notification_switch_title);
        this.aq = (HealthSwitchButton) this.as.findViewById(R.id.notification_switch_btn);
        this.ap = (HealthDivider) findViewById(R.id.divider6);
        f();
        j();
    }

    private void f() {
        this.ae.setText(getString(R.string.IDS_hw_me_settings_message_noticebar));
        this.ag.setText(getString(R.string.IDS_hw_me_settings_message_noticebar_description));
        this.an.setText(getString(R.string.IDS_hw_me_settings_message_promotion));
        this.av.setText(getString(R.string.IDS_hw_show_setting_real_time_push_steps));
        this.at.setText(getString(R.string.IDS_hw_show_setting_steps_target_complete_remind));
        this.k.setText(getString(R.string.IDS_hw_me_settings_message_sleep_notify));
        this.aw.setText(getString(R.string.IDS_hw_me_settings_message_track_notify));
        this.ao.setText(getString(R.string.IDS_hw_routes_auto_punch_route_remind));
        this.ad.setText(getString(R.string.IDS_settings_moving_remind));
        this.z.setText(getString(R.string.IDS_stood_up_remind_description, new Object[]{UnitUtil.e(1.0d, 1, 0)}));
        this.al.setText(getString(R.string.IDS_progress_remind));
        this.am.setText(getString(R.string.IDS_progress_remind_description));
        this.f.setText(getString(R.string.IDS_achieve_remind));
        this.h.setText(getString(R.string.IDS_achieve_remind_description));
    }

    private void j() {
        if ("com.huawei.bone".equals(BaseApplication.getAppPackage())) {
            this.aa.setVisibility(8);
            cancelLayoutById(findViewById(R.id.divider));
        }
        this.ar.setChecked(this.g);
        this.bb.setChecked(this.e);
        if (!this.g) {
            this.f28429c = false;
        }
        if (!this.e) {
            this.d = false;
        }
        HealthDivider healthDivider = (HealthDivider) findViewById(R.id.divider2);
        HealthDivider healthDivider2 = (HealthDivider) findViewById(R.id.divider3);
        if (!this.f28427a) {
            this.ax.setVisibility(8);
            this.az.setVisibility(8);
            healthDivider.setVisibility(8);
            healthDivider2.setVisibility(8);
        }
        if (!StepNotificationByHardWareUtils.d()) {
            this.ax.setVisibility(8);
            healthDivider.setVisibility(8);
        }
        this.ak.setChecked(!"0".equals(SharedPreferenceManager.e(this.f28428b, Integer.toString(10000), "health_msg_switch_promotion")));
        this.ah.setChecked(!"0".equals(SharedPreferenceManager.e(this.f28428b, Integer.toString(10000), "health_msg_switch_noticebar")));
        this.ak.setOnCheckedChangeListener(this);
        this.ah.setOnCheckedChangeListener(this);
        o();
        a();
        this.as.setVisibility(8);
        this.ap.setVisibility(8);
    }

    private void a(boolean z) {
        if (z) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 20);
            calendar.set(12, 0);
            calendar.set(13, 0);
            long timeInMillis = calendar.getTimeInMillis();
            if (System.currentTimeMillis() > timeInMillis) {
                calendar.add(5, 1);
                timeInMillis = calendar.getTimeInMillis();
            }
            LogUtil.a("NotificationMessageSettingActivity", "setting time ", ltb.e(timeInMillis));
            vym.a(1000, timeInMillis, 86400000L);
            return;
        }
        vym.c(1000);
    }

    private void o() {
        this.n.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.NotificationMessageSettingActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String str;
                if (view != null) {
                    if (NotificationMessageSettingActivity.this.p) {
                        NotificationMessageSettingActivity.this.n.setChecked(false);
                        NotificationMessageSettingActivity.this.p = false;
                        str = "0";
                    } else {
                        NotificationMessageSettingActivity.this.n.setChecked(true);
                        NotificationMessageSettingActivity.this.p = true;
                        str = "1";
                    }
                    LogUtil.a("NotificationMessageSettingActivity", "coreSleep click switchStatus:", Boolean.valueOf(NotificationMessageSettingActivity.this.p));
                    mhs.a().setSwitchSetting("core_sleep_switch_status", str, null);
                    return;
                }
                LogUtil.j("NotificationMessageSettingActivity", "mCoreSleepSyncCompleteRemindSwitch view is null");
            }
        });
        this.ac.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.NotificationMessageSettingActivity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String str;
                if (view != null) {
                    if (NotificationMessageSettingActivity.this.v) {
                        NotificationMessageSettingActivity.this.ac.setChecked(false);
                        NotificationMessageSettingActivity.this.v = false;
                        str = "0";
                    } else {
                        NotificationMessageSettingActivity.this.ac.setChecked(true);
                        NotificationMessageSettingActivity.this.v = true;
                        str = "1";
                    }
                    LogUtil.a("NotificationMessageSettingActivity", "motionPath click switchStatus:", Boolean.valueOf(NotificationMessageSettingActivity.this.v));
                    mhs.a().setSwitchSetting("motion_path_switch_status", str, null);
                    return;
                }
                LogUtil.j("NotificationMessageSettingActivity", "mMotionPathSyncCompleteRemindSwitch view is null");
            }
        });
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        HealthSwitchButton healthSwitchButton;
        HealthSwitchButton healthSwitchButton2;
        HealthSwitchButton healthSwitchButton3;
        if (compoundButton == this.ar) {
            d(z);
            return;
        }
        if (compoundButton == this.bb) {
            e(z);
            return;
        }
        if (compoundButton == this.ak) {
            a(AnalyticsValue.HEALTH_MINE_SETTINGS_PROMOTION_2040046.value(), z ? "1" : "0");
            this.ak.setChecked(z);
            SharedPreferenceManager.e(this.f28428b, Integer.toString(10000), "health_msg_switch_promotion", z ? "1" : "0", new StorageParams());
            return;
        }
        if (compoundButton == this.ah) {
            f(z);
            return;
        }
        boolean z2 = this.q;
        if (z2 && compoundButton == (healthSwitchButton3 = this.ab)) {
            a(healthSwitchButton3, "900200004", z);
            return;
        }
        if (z2 && compoundButton == (healthSwitchButton2 = this.aj)) {
            a(healthSwitchButton2, "900200010", z);
            return;
        }
        if (z2 && compoundButton == (healthSwitchButton = this.i)) {
            a(healthSwitchButton, "900200011", z);
            return;
        }
        if (compoundButton == this.aq) {
            LogUtil.a("NotificationMessageSettingActivity", "mRouteAutoPunchRemindSwitch isChecked is ", Boolean.valueOf(z));
            gdn gdnVar = this.ai;
            if (gdnVar == null) {
                LogUtil.j("NotificationMessageSettingActivity", "mPathAutoSwitchInfo == null");
                return;
            }
            if (TextUtils.isEmpty(gdnVar.c())) {
                LogUtil.a("NotificationMessageSettingActivity", "mPathAutoSwitchInfo.getParticipatePushSwitch() isEmpty");
                this.ai.e("1");
            }
            this.ai.d(z);
            jdi.c(this.ai);
            return;
        }
        LogUtil.j("NotificationMessageSettingActivity", "no this button");
    }

    private void a(HealthSwitchButton healthSwitchButton, String str, boolean z) {
        LogUtil.a("NotificationMessageSettingActivity", "changeSwitchAndSend, configId is ", str, ", isChecked is ", Boolean.valueOf(z));
        healthSwitchButton.setChecked(z);
        qhp.b(str, z);
    }

    private void f(boolean z) {
        LogUtil.a("NotificationMessageSettingActivity", "updateNoticeBarSwitch", Boolean.valueOf(z));
        if (this.u) {
            this.u = false;
            LogUtil.a("NotificationMessageSettingActivity", "trigger by fallback");
            return;
        }
        if (CommonUtil.cn() && !CommonUtil.cl() && !Utils.k()) {
            LogUtil.a("NotificationMessageSettingActivity", "switchPushWithHms");
            d(z, new e(this, z, true));
        } else {
            c(z);
        }
        uub.d(z);
    }

    static class e implements OnCompleteListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f28441b;
        private WeakReference<NotificationMessageSettingActivity> d;
        private boolean e;

        e(NotificationMessageSettingActivity notificationMessageSettingActivity, boolean z, boolean z2) {
            this.d = new WeakReference<>(notificationMessageSettingActivity);
            this.e = z;
            this.f28441b = z2;
        }

        @Override // com.huawei.hmf.tasks.OnCompleteListener
        public void onComplete(Task task) {
            NotificationMessageSettingActivity notificationMessageSettingActivity = this.d.get();
            if (notificationMessageSettingActivity == null || task == null) {
                LogUtil.j("NotificationMessageSettingActivity", "notificationMessageSettingActivity = null or task = null");
                return;
            }
            if (task.isSuccessful()) {
                LogUtil.a("NotificationMessageSettingActivity", "switchPushWithHms success");
                if (this.f28441b) {
                    notificationMessageSettingActivity.c(this.e);
                    return;
                }
                return;
            }
            LogUtil.e("NotificationMessageSettingActivity", "switchPushWithHms fail:", task.getException().getMessage());
            if (this.f28441b) {
                Toast.makeText(notificationMessageSettingActivity, com.huawei.ui.commonui.R.string.IDS_notification_set_fail_text, 0).show();
                notificationMessageSettingActivity.u = true;
                notificationMessageSettingActivity.c(!this.e);
                if (notificationMessageSettingActivity.r != null) {
                    Message messageObtainMessage = notificationMessageSettingActivity.r.obtainMessage();
                    messageObtainMessage.what = 102;
                    Bundle bundle = new Bundle();
                    bundle.putString("status", String.valueOf(true ^ this.e));
                    messageObtainMessage.setData(bundle);
                    notificationMessageSettingActivity.r.sendMessage(messageObtainMessage);
                    return;
                }
                LogUtil.j("NotificationMessageSettingActivity", "MyCompleteListener, mHandler is null");
            }
        }
    }

    private void l() {
        if (!CommonUtil.cn() || CommonUtil.cl()) {
            return;
        }
        LogUtil.a("NotificationMessageSettingActivity", "updatePushWithHmsIfDeeded");
        boolean zIsChecked = this.ah.isChecked();
        d(zIsChecked, new e(this, zIsChecked, false));
    }

    private void d(boolean z, OnCompleteListener<Void> onCompleteListener) {
        if (z) {
            HmsMessaging.getInstance(BaseApplication.getContext()).turnOnPush().addOnCompleteListener(onCompleteListener);
        } else {
            HmsMessaging.getInstance(BaseApplication.getContext()).turnOffPush().addOnCompleteListener(onCompleteListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        LogUtil.a("NotificationMessageSettingActivity", "saveNoticeBarSwitch");
        String str = z ? "1" : "0";
        a(AnalyticsValue.HEALTH_MINE_SETTINGS_PHONE_NOTIFICATION_2040050.value(), str);
        SharedPreferenceManager.e(this.f28428b, Integer.toString(10000), "health_msg_switch_noticebar", str, new StorageParams());
        KeyValDbManager.d(BaseApplication.getContext()).b("health_msg_switch_noticebar", str);
        LogUtil.a("NotificationMessageSettingActivity", "saveNoticeBarSwitch recommendStatus set finish");
    }

    private void d(boolean z) {
        if (this.f28429c) {
            this.f28429c = false;
            return;
        }
        d(AnalyticsValue.HEALTH_MINE_SETTINGS_REAL_PUSH_STEP_040018.value(), z);
        if (this.s != null) {
            LogUtil.a("NotificationMessageSettingActivity", "isChecked : ", Boolean.valueOf(z));
            if (!z) {
                if (CommonUtil.bg()) {
                    this.s.b(z, null);
                    return;
                }
                if (LanguageUtil.o(this.f28428b) && i()) {
                    n();
                }
                if (mga.c()) {
                    h();
                    return;
                } else {
                    sendBroadcast(new Intent("com.huawei.health.action.unbindNotification"), LocalBroadcast.f36595c);
                    this.s.b(z, null);
                    return;
                }
            }
            this.s.b(z, null);
        }
    }

    private boolean i() {
        return Build.VERSION.SDK_INT >= 28 && this.s.d() != 3;
    }

    private void n() {
        Context context = this.f28428b;
        if (context != null) {
            CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this).a(R.string.IDS_step_note_settings_dialog_title).a(context.getString(R.string.IDS_step_note_keep_alive)).a(R.string.IDS_settings_close, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.NotificationMessageSettingActivity.11
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    NotificationMessageSettingActivity.this.s.b(false, null);
                }
            }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.NotificationMessageSettingActivity.13
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    NotificationMessageSettingActivity.this.ar.setChecked(true);
                }
            }).b();
            customTextAlertDialogB.setCancelable(false);
            customTextAlertDialogB.show();
        }
    }

    private void h() {
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this).a(R.string.IDS_settings_restore_factory_settings_dialog_title).a(this.f28428b.getString(R.string.IDS_wear_note_keep_alive)).a(R.string.IDS_settings_close, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.NotificationMessageSettingActivity.15
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NotificationMessageSettingActivity.this.sendBroadcast(new Intent("com.huawei.health.action.unbindNotification"), LocalBroadcast.f36595c);
                if (NotificationMessageSettingActivity.this.s != null) {
                    NotificationMessageSettingActivity.this.s.b(false, null);
                }
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.NotificationMessageSettingActivity.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NotificationMessageSettingActivity.this.ar.setChecked(true);
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    private void e(boolean z) {
        if (!this.d) {
            d(AnalyticsValue.HEALTH_MINE_STEP_COMPLETE_REMIND_2040019.value(), z);
            if (this.s != null) {
                LogUtil.a("NotificationMessageSettingActivity", "isChecked : " + z);
                this.s.c(z, (IExecuteResult) null);
            }
        } else {
            this.d = false;
        }
        LogUtil.a("NotificationMessageSettingActivity", "doStepsTargetCompleteRemindSwitch isChecked ", Boolean.valueOf(z));
        a(z);
    }

    private void a(String str, String str2) {
        HashMap map = new HashMap();
        map.put("click", 1);
        if (str2 != null) {
            map.put("type", str2);
        }
        lmf.d().c(BaseApplication.getContext(), str, map, 0);
    }

    private void d(String str, boolean z) {
        HashMap map = new HashMap();
        map.put("click", "1");
        if (!z) {
            map.put("type", "2");
        } else {
            map.put("type", "1");
        }
        lmf.d().c(BaseApplication.getContext(), str, map, 0);
    }

    private void a() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout_device_band_status);
        this.o = linearLayout;
        HealthTextView healthTextView = (HealthTextView) linearLayout.findViewById(R.id.notification_switch_title);
        this.m = healthTextView;
        healthTextView.setText(getString(R.string.IDS_notification_switch));
        this.l = (HealthSwitchButton) this.o.findViewById(R.id.notification_switch_btn);
        this.t = (HealthDivider) findViewById(R.id.divider1);
        if (!nzz.c() || !mga.c()) {
            LogUtil.j("NotificationMessageSettingActivity", "app has not device");
            this.o.setVisibility(8);
            this.t.setVisibility(8);
        } else {
            this.o.setVisibility(0);
            this.t.setVisibility(0);
            mhs.a().getSwitchSetting("device_notification_key", new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.me.activity.NotificationMessageSettingActivity.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    final boolean zEquals = true;
                    if (i == 0 && (obj instanceof String)) {
                        zEquals = true ^ "0".equals((String) obj);
                    }
                    NotificationMessageSettingActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.main.stories.me.activity.NotificationMessageSettingActivity.1.3
                        @Override // java.lang.Runnable
                        public void run() {
                            NotificationMessageSettingActivity.this.l.setChecked(zEquals);
                        }
                    });
                }
            });
            this.l.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.NotificationMessageSettingActivity.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    NotificationMessageSettingActivity.this.l.setClickable(false);
                    boolean zIsChecked = NotificationMessageSettingActivity.this.l.isChecked();
                    if (!zIsChecked) {
                        NotificationMessageSettingActivity.this.k();
                    } else {
                        NotificationMessageSettingActivity.this.b(zIsChecked);
                        NotificationMessageSettingActivity.this.h(true);
                    }
                    NotificationMessageSettingActivity.this.l.setClickable(true);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this).a(R.string.IDS_settings_restore_factory_settings_dialog_title).a(this.f28428b.getString(R.string.IDS_wear_keep_alive_tips)).a(R.string.IDS_settings_close, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.NotificationMessageSettingActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NotificationMessageSettingActivity.this.h(false);
                NotificationMessageSettingActivity.this.b(false);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.NotificationMessageSettingActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NotificationMessageSettingActivity.this.l.setChecked(true);
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        mhs.a().setSwitchSetting("device_notification_key", z ? "1" : "0", new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.me.activity.NotificationMessageSettingActivity.7
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("NotificationMessageSettingActivity", "saveDeviceSwitchStatus: ", Integer.valueOf(i), "  ", (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(boolean z) {
        lvb.e().b("deleteDevice", new DeviceInfo(), 0, z ? "1" : "0");
    }

    static class c implements IBaseResponseCallback {
        private final WeakReference<NotificationMessageSettingActivity> d;

        private c(NotificationMessageSettingActivity notificationMessageSettingActivity) {
            this.d = new WeakReference<>(notificationMessageSettingActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("NotificationMessageSettingActivity", "onResponse: ", obj == null ? null : obj.toString());
            NotificationMessageSettingActivity notificationMessageSettingActivity = this.d.get();
            if (notificationMessageSettingActivity == null) {
                LogUtil.j("NotificationMessageSettingActivity", "onResponse: activity is null");
                return;
            }
            if (obj instanceof HashMap) {
                if (notificationMessageSettingActivity.r == null) {
                    LogUtil.j("NotificationMessageSettingActivity", "ActiveRingsSwitchStatusDataCallback, mHandler is null");
                    return;
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = 103;
                messageObtain.obj = (HashMap) obj;
                notificationMessageSettingActivity.r.sendMessage(messageObtain);
                return;
            }
            LogUtil.j("NotificationMessageSettingActivity", "onResponse: objData is not instanceof HashMap");
        }
    }

    static class b implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<NotificationMessageSettingActivity> f28440b;

        private b(NotificationMessageSettingActivity notificationMessageSettingActivity) {
            LogUtil.a("NotificationMessageSettingActivity", "create RouteAutoSwitchStatusDataCallback");
            this.f28440b = new WeakReference<>(notificationMessageSettingActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("NotificationMessageSettingActivity", "RouteAutoSwitchStatusDataCallback onResponse: ", obj == null ? null : obj.toString());
            NotificationMessageSettingActivity notificationMessageSettingActivity = this.f28440b.get();
            if (notificationMessageSettingActivity == null) {
                LogUtil.j("NotificationMessageSettingActivity", "RouteAutoSwitchStatusDataCallback onResponse: activity is null");
                return;
            }
            if (obj instanceof gdn) {
                if (notificationMessageSettingActivity.r != null) {
                    notificationMessageSettingActivity.ai = (gdn) obj;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 104;
                    notificationMessageSettingActivity.r.sendMessage(messageObtain);
                    return;
                }
                LogUtil.j("NotificationMessageSettingActivity", "RouteAutoSwitchStatusDataCallback, mHandler is null");
                return;
            }
            LogUtil.j("NotificationMessageSettingActivity", "RouteAutoSwitchStatusDataCallback onResponse: objData is not instanceof PathAutoSwitchInfo");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
