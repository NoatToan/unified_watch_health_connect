package com.huawei.ui.main.stories.settings.activity.heartrate;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouter;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.settings.fragment.BaseHeartRateZoneFragment;
import com.huawei.up.model.UserInfomation;
import defpackage.nkb;
import defpackage.nkd;
import defpackage.qpn;
import defpackage.qsp;

/* JADX INFO: loaded from: classes19.dex */
public class HeartRateZoneSettingActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28815a;
    private Context d;
    private BaseHeartRateZoneFragment f;
    private View g;
    private BaseHeartRateZoneFragment h;
    private BaseHeartRateZoneFragment i;
    private BaseHeartRateZoneFragment j;
    private qpn k;
    private UserInfomation l;
    private HealthSubTabWidget m;
    private HealthViewPager n;
    private boolean e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28817c = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBaseResponseCallback f28816b = new IBaseResponseCallback() { // from class: wlz
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public final void a(int i, Object obj) {
            this.e.c(i, obj);
        }
    };

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    public /* synthetic */ void c(int i, Object obj) {
        if (obj instanceof Boolean) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            this.f28817c = zBooleanValue;
            LogUtil.a("HeartRateZoneSettingActivity", "onResponse objData ", Boolean.valueOf(zBooleanValue));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LogUtil.a("HeartRateZoneSettingActivity", "Enter onCreate()");
        super.onCreate(bundle);
        a(bundle);
        this.d = getApplicationContext();
        e();
        c();
    }

    private void a(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("currentActivityHashCode", "");
            if (TextUtils.isEmpty(string) || string.equals(toString())) {
                return;
            }
            Intent intent = new Intent();
            intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.health.MainActivity");
            intent.setFlags(268468224);
            startActivity(intent);
            finish();
        }
    }

    private void c() {
        UserInfomation userInfomationL = nkb.d().l();
        this.l = userInfomationL;
        this.f28815a = userInfomationL.getAgeOrDefaultValue();
        a(this.l.isBirthdayValid() ? 8 : 0);
    }

    private void b() {
        UserInfomation userInfomationL = nkb.d().l();
        this.l = userInfomationL;
        LogUtil.j("HeartRateZoneSettingActivity", "getUserInfo userInformation.isBirthdayValid() ", Boolean.valueOf(userInfomationL.isBirthdayValid()));
        a(this.l.isBirthdayValid() ? 8 : 0);
        if (this.f28815a != this.l.getAgeOrDefaultValue()) {
            this.f28815a = this.l.getAgeOrDefaultValue();
            this.i.i();
            this.h.i();
            this.f.i();
            this.j.i();
        }
    }

    private void a(int i) {
        View view = this.g;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        if (this.e) {
            b();
            this.e = false;
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("currentActivityHashCode", toString());
    }

    private void e() {
        d();
        a();
    }

    private void a() {
        if (this.n == null) {
            return;
        }
        this.k = new qpn(this, this.n, this.m);
        this.i = new BaseHeartRateZoneFragment(1, this.f28816b);
        this.h = new BaseHeartRateZoneFragment(2, this.f28816b);
        this.f = new BaseHeartRateZoneFragment(3, this.f28816b);
        this.j = new BaseHeartRateZoneFragment(4, this.f28816b);
        this.k.b(this.m.b(this.d.getResources().getString(R.string.IDS_heart_raet_standing)), this.i, true);
        this.k.b(this.m.b(this.d.getResources().getString(R.string.IDS_heart_raet_riding)), this.h, false);
        this.k.b(this.m.b(this.d.getResources().getString(R.string.IDS_heart_raet_strokes)), this.f, false);
        this.k.b(this.m.b(this.d.getResources().getString(R.string.IDS_device_setting_other)), this.j, false);
    }

    private void d() {
        setContentView(R.layout.activity_heart_rate_zone_setting_gestures);
        this.g = findViewById(R.id.hw_health_rate_zone_tips);
        ((HealthTextView) findViewById(R.id.notice_message)).setText(this.d.getResources().getString(R.string.IDS_rate_zone_notice_set_msg, Integer.valueOf(HeartRateThresholdConfig.HEART_RATE_LIMIT)));
        this.m = (HealthSubTabWidget) qsp.a(this, R.id.heart_rate_subTabLayout);
        this.n = (HealthViewPager) qsp.a(this, R.id.heart_rate_detail_viewpager);
        findViewById(R.id.rate_zone_set_age_text).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.settings.activity.heartrate.HeartRateZoneSettingActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HeartRateZoneSettingActivity.this.e = true;
                AppRouter.c("/HWUserProfileMgr/UserInfoActivity").b(HeartRateZoneSettingActivity.this.d);
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        LogUtil.a("HeartRateZoneSettingActivity", "onStop", Boolean.valueOf(this.f28817c));
        if (this.f28817c) {
            nkd.c().g();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
