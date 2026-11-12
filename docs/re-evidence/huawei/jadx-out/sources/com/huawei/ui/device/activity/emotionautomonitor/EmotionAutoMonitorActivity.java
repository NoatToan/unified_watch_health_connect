package com.huawei.ui.device.activity.emotionautomonitor;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.health.constants.ObserveLabels;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.LifeBaseResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.device.R;
import com.huawei.ui.main.stories.me.activity.PrivacyCenterActivity;
import com.huawei.ui.main.stories.me.views.privacy.ServiceItemActivity;
import defpackage.mbr;
import defpackage.mbt;
import defpackage.mgd;
import defpackage.qqs;
import defpackage.qrs;
import defpackage.rdt;
import defpackage.uis;
import defpackage.wmq;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Utils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class EmotionAutoMonitorActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f24333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthSwitchButton f24334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f24335c;
    private RelativeLayout d;
    private HealthSwitchButton e;
    private HealthTextView f;
    private HealthTextView h;
    private CustomTextAlertDialog i;
    private HealthTextView j;
    private LinearLayout l;
    private wmq g = wmq.a(this);
    private CompoundButton.OnCheckedChangeListener o = new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.emotionautomonitor.EmotionAutoMonitorActivity.1
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            String str;
            LogUtil.a("EmotionAutoMonitorActivity", "mEmotionAutoMonitorListener isChecked: ", Boolean.valueOf(z));
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            mgd.e(str);
            ObserverManagerUtil.e(ObserveLabels.EMOTION_SWITCH_CHANGED, new Object[0]);
        }
    };
    private CompoundButton.OnCheckedChangeListener m = new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.emotionautomonitor.EmotionAutoMonitorActivity.2
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            LogUtil.a("EmotionAutoMonitorActivity", "mEmotionRiskWarningSwitch isChecked: ", Boolean.valueOf(z));
            if (z) {
                if (!EmotionAutoMonitorActivity.this.j().booleanValue()) {
                    EmotionAutoMonitorActivity.this.f();
                    return;
                }
                EmotionAutoMonitorActivity.this.f24333a = "1";
            } else {
                EmotionAutoMonitorActivity.this.f24333a = "0";
            }
            mgd.b(EmotionAutoMonitorActivity.this.f24333a);
            ObserverManagerUtil.e(ObserveLabels.EMOTION_SWITCH_CHANGED, new Object[0]);
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("EmotionAutoMonitorActivity", "onCreate");
        setContentView(R.layout.activity_settings_emotion_auto_monitor);
        clearBackgroundDrawable();
        h();
        e();
        a();
    }

    private void a() {
        HashMap map = new HashMap();
        map.put("event", 0);
        map.put(FunctionSetBeanReader.BI_ELEMENT, "m0");
        map.put("moduleName", "main_page");
        rdt.d(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, String str) {
        HashMap map = new HashMap();
        map.put("event", Integer.valueOf(i));
        map.put(FunctionSetBeanReader.BI_ELEMENT, str);
        map.put("value", "health_data_to_cloud_switchStatus");
        map.put("moduleName", "boot_window");
        map.put("entrance", "e1");
        rdt.d(map);
    }

    public Boolean c() {
        boolean zD = mbt.a().d();
        boolean zK = Utils.k();
        LogUtil.a("EmotionAutoMonitorActivity", "isEnableNMPA = ", Boolean.valueOf(zD), ",isAllowLogin = ", Boolean.valueOf(zK), ",isAnAdult = ", Boolean.valueOf(i()));
        if (zD || zK || i()) {
            return false;
        }
        return true;
    }

    private boolean i() {
        String accountInfo = LoginInit.getInstance(this).getAccountInfo(1006);
        return TextUtils.isEmpty(accountInfo) || CommonUtil.n(this, accountInfo) + 180000 > DateFormatUtil.a(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean j() {
        String strC = this.g.c(7);
        LogUtil.a("EmotionAutoMonitorActivity", ",privacyHealthData= ", strC);
        if (strC.equals("true")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.d.setAlpha(0.38f);
        this.f24334b.setEnabled(false);
        this.f.setEnabled(false);
        this.l.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.d.setAlpha(1.0f);
        this.f24334b.setEnabled(true);
        this.f.setEnabled(true);
        this.l.setVisibility(8);
    }

    private void h() {
        this.e = (HealthSwitchButton) findViewById(R.id.event_emotion_monitor_switch_btn);
        this.f24334b = (HealthSwitchButton) findViewById(R.id.event_emotion_risk_waring_switch_btn);
        this.d = (RelativeLayout) findViewById(R.id.event_emotion_risk_waring_view);
        this.l = (LinearLayout) findViewById(R.id.tip_show_view);
        this.h = (HealthTextView) findViewById(R.id.go_to_open);
        this.f24335c = (ImageView) findViewById(R.id.close_tip);
        this.f = (HealthTextView) findViewById(R.id.learn_more_text);
        this.j = (HealthTextView) findViewById(R.id.learn_more_img);
        this.l.setElevation(40.0f);
        if (c().booleanValue()) {
            this.d.setVisibility(0);
            this.l.setVisibility(0);
        } else {
            this.d.setVisibility(8);
            this.l.setVisibility(8);
        }
        if (qqs.e(this)) {
            if (LanguageUtil.ba(this)) {
                this.l.setBackgroundResource(R.drawable.emotion_risk_tip_window_night_right);
            } else {
                this.l.setBackgroundResource(R.drawable.emotion_risk_tip_night_window);
            }
            this.f24335c.setImageResource(R.mipmap.icon_tip_night_close);
        } else {
            if (LanguageUtil.ba(this)) {
                this.l.setBackgroundResource(R.drawable.emotion_risk_tip_window_right);
            } else {
                this.l.setBackgroundResource(R.drawable.emotion_risk_tip_window);
            }
            this.f24335c.setImageResource(R.mipmap.icon_tip_close);
        }
        this.h.setOnClickListener(new View.OnClickListener() { // from class: qux
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46892b.b(view);
            }
        });
        this.f.setOnClickListener(new View.OnClickListener() { // from class: qut
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.c(view);
            }
        });
        this.j.setOnClickListener(new View.OnClickListener() { // from class: quv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46890c.d(view);
            }
        });
        this.f24335c.setOnClickListener(new View.OnClickListener() { // from class: quw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46891c.a(view);
            }
        });
    }

    public /* synthetic */ void b(View view) {
        g();
    }

    public /* synthetic */ void c(View view) {
        m();
    }

    public /* synthetic */ void d(View view) {
        m();
    }

    public /* synthetic */ void a(View view) {
        this.l.setVisibility(8);
    }

    /* JADX INFO: renamed from: com.huawei.ui.device.activity.emotionautomonitor.EmotionAutoMonitorActivity$5, reason: invalid class name */
    public class AnonymousClass5 implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ HealthSwitchButton f24338a;

        AnonymousClass5(HealthSwitchButton healthSwitchButton) {
            this.f24338a = healthSwitchButton;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (i == 0 && (obj instanceof String)) {
                final String str = (String) obj;
                LogUtil.a("EmotionAutoMonitorActivity", "emotionAutoMonitorSwitch initData status:", str);
                EmotionAutoMonitorActivity emotionAutoMonitorActivity = EmotionAutoMonitorActivity.this;
                final HealthSwitchButton healthSwitchButton = this.f24338a;
                emotionAutoMonitorActivity.runOnUiThread(new Runnable() { // from class: quu
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f46888b.d(str, healthSwitchButton);
                    }
                });
            }
        }

        public /* synthetic */ void d(String str, HealthSwitchButton healthSwitchButton) {
            boolean zEquals = "1".equals(str);
            healthSwitchButton.setChecked(zEquals);
            healthSwitchButton.setOnCheckedChangeListener(EmotionAutoMonitorActivity.this.o);
            EmotionAutoMonitorActivity.this.b(zEquals);
        }
    }

    private void e() {
        mgd.b(new LifeBaseResponseCallback(this, new AnonymousClass5((HealthSwitchButton) findViewById(R.id.event_emotion_monitor_switch_btn))));
        if (c().booleanValue()) {
            mgd.a(new LifeBaseResponseCallback(this, new AnonymousClass3()));
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.device.activity.emotionautomonitor.EmotionAutoMonitorActivity$3, reason: invalid class name */
    public class AnonymousClass3 implements IBaseResponseCallback {
        AnonymousClass3() {
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            final String str;
            LogUtil.a("EmotionAutoMonitorActivity", "emotionRiskWarningSwitch initData errorCode:", Integer.valueOf(i), "objectData:", obj);
            if (i == 0 && (obj instanceof String)) {
                str = (String) obj;
            } else {
                str = "";
            }
            EmotionAutoMonitorActivity.this.runOnUiThread(new Runnable() { // from class: quz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f46893b.d(str);
                }
            });
        }

        public /* synthetic */ void d(String str) {
            if (!"1".equals(str) || EmotionAutoMonitorActivity.this.j().booleanValue()) {
                EmotionAutoMonitorActivity.this.d();
            } else {
                EmotionAutoMonitorActivity.this.b();
            }
            EmotionAutoMonitorActivity.this.f24334b.setChecked("1".equals(str));
            EmotionAutoMonitorActivity.this.f24334b.setOnCheckedChangeListener(EmotionAutoMonitorActivity.this.m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        CustomTextAlertDialog.Builder builderA = new CustomTextAlertDialog.Builder(this).a(R.string.IDS_emotion_sync_title);
        builderA.b(R.string.IDS_emotion_sync_content);
        builderA.a(getResources().getDimensionPixelSize(R.dimen.hw_show_public_size_20), getResources().getDimensionPixelSize(R.dimen.emui_text_size_body2));
        builderA.b((Boolean) false);
        builderA.e((Boolean) true);
        builderA.e(R.string.IDS_motiontrack_show_cancel, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.emotionautomonitor.EmotionAutoMonitorActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (EmotionAutoMonitorActivity.this.i != null) {
                    EmotionAutoMonitorActivity.this.f24334b.setChecked(false);
                    EmotionAutoMonitorActivity.this.f24333a = "0";
                    EmotionAutoMonitorActivity.this.i.dismiss();
                    EmotionAutoMonitorActivity.this.i = null;
                    EmotionAutoMonitorActivity.this.b(1, "r2");
                }
            }
        });
        builderA.a(R.string.IDS_screen_shot_sure, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.emotionautomonitor.EmotionAutoMonitorActivity.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EmotionAutoMonitorActivity.this.f24334b.setChecked(true);
                EmotionAutoMonitorActivity.this.f24333a = "1";
                EmotionAutoMonitorActivity.this.g.a(7, true);
                mgd.b(EmotionAutoMonitorActivity.this.f24333a);
                EmotionAutoMonitorActivity.this.b(1, "r1");
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builderA.b();
        this.i = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        this.i.setWindowGravityParams(17);
        this.i.show();
        b(0, "r0");
    }

    private void g() {
        Intent intent = new Intent();
        intent.setClass(this, PrivacyCenterActivity.class);
        startActivityForResult(intent, 0);
        qrs.ae(this);
    }

    private void m() {
        Intent intent = new Intent(this, (Class<?>) ServiceItemActivity.class);
        intent.putExtra("Agreement_key", "HealthPrivacy");
        intent.putExtra("Is_show_cancel_key", true);
        intent.addFlags(268435456);
        startActivity(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("EmotionAutoMonitorActivity", "resultCode=" + i2);
        if (i == 0 && i2 == 0 && intent != null) {
            String stringExtra = intent.getStringExtra("health_cloud");
            if (TextUtils.isEmpty(stringExtra) || !stringExtra.equals("true")) {
                return;
            }
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final boolean z) {
        new uis().e(new CommonUiBaseResponse() { // from class: com.huawei.ui.device.activity.emotionautomonitor.EmotionAutoMonitorActivity.8
            @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
            public void onResponse(int i, Object obj) {
                boolean zBooleanValue = (i == 0 && (obj instanceof Boolean)) ? ((Boolean) obj).booleanValue() : false;
                LogUtil.a("EmotionAutoMonitorActivity", "isCalibrated is ", Boolean.valueOf(zBooleanValue));
                if (zBooleanValue) {
                    mbr.a().e(z ? 1 : 2);
                }
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
