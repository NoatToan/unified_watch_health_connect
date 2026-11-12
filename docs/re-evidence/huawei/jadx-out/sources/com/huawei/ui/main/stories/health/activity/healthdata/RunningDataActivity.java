package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.userprofilemgr.model.UserInformationCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.fragment.RunningDayDetailFragment;
import com.huawei.ui.main.stories.health.fragment.RunningMonthDetailFragment;
import com.huawei.ui.main.stories.health.fragment.RunningWeekDetailFragment;
import com.huawei.ui.main.stories.health.fragment.RunningYearDetailFragment;
import com.huawei.ui.main.stories.health.interactors.healthdata.RunningStateIndexData;
import com.huawei.ui.main.stories.template.BaseActivity;
import com.huawei.up.callback.CommonCallback;
import com.huawei.up.model.UserInfomation;
import defpackage.imz;
import defpackage.lmf;
import defpackage.qpn;
import defpackage.qsp;
import defpackage.wka;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class RunningDataActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private UserInfomation f27596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RunningDayDetailFragment f27597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f27598c;
    private RunningStateIndexData d;
    private Context e;
    private qpn f;
    private CustomTitleBar g;
    private HealthSubTabWidget h;
    private String i;
    private HealthTextView j;
    private int l = 0;
    private HealthViewPager n;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cancelAdaptRingRegion();
        setContentView(R.layout.activity_running_data_layout);
        this.e = this;
        b();
        e();
    }

    private void e() {
        this.f27598c = (RelativeLayout) findViewById(R.id.hw_health_running_tips);
        this.j = (HealthTextView) findViewById(R.id.running_set_gender_text);
        Intent intent = getIntent();
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("running_level_data");
            if (parcelableExtra instanceof RunningStateIndexData) {
                this.d = (RunningStateIndexData) parcelableExtra;
            }
            if (intent.hasExtra("KEY_RUNNING_FLAG")) {
                this.i = intent.getStringExtra("KEY_RUNNING_FLAG");
            }
            this.l = intent.getIntExtra("vo2max_value", 0);
        }
        c();
    }

    private void c() {
        this.h = (HealthSubTabWidget) findViewById(R.id.running_subTabLayout);
        HealthViewPager healthViewPager = (HealthViewPager) qsp.a(this, R.id.running_detail_viewpager);
        this.n = healthViewPager;
        if (healthViewPager == null) {
            LogUtil.j("Track_RunningDataActivity", "initViewPager mViewPager is null");
            return;
        }
        healthViewPager.setScrollHeightArea(200);
        this.n.setOffscreenPageLimit(3);
        this.f = new qpn(this, this.n, this.h);
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        this.f27596a = userInfo;
        if (userInfo == null) {
            LogUtil.j("Track_RunningDataActivity", "initViewPager mLocalUserInfo is null");
            this.f27596a = new UserInfomation(UnitUtil.f() ? 1 : 0);
        }
        int gender = this.f27596a.getGender();
        Bundle bundle = new Bundle();
        bundle.putInt("vo2max_age", this.f27596a.getAgeOrDefaultValue());
        bundle.putInt("vo2max_gender", gender);
        bundle.putParcelable("running_level_data", this.d);
        bundle.putInt("vo2max_value", this.l);
        RunningDayDetailFragment runningDayDetailFragment = new RunningDayDetailFragment();
        this.f27597b = runningDayDetailFragment;
        runningDayDetailFragment.setArguments(bundle);
        RunningWeekDetailFragment runningWeekDetailFragment = new RunningWeekDetailFragment();
        runningWeekDetailFragment.setArguments(bundle);
        RunningMonthDetailFragment runningMonthDetailFragment = new RunningMonthDetailFragment();
        runningMonthDetailFragment.setArguments(bundle);
        RunningYearDetailFragment runningYearDetailFragment = new RunningYearDetailFragment();
        runningYearDetailFragment.setArguments(bundle);
        this.f.b(this.h.b(this.e.getResources().getString(R.string.IDS_fitness_detail_radio_button_tab_day)), this.f27597b, true);
        this.f.b(this.h.b(this.e.getResources().getString(R.string.IDS_fitness_detail_radio_button_tab_week)), runningWeekDetailFragment, false);
        this.f.b(this.h.b(this.e.getResources().getString(R.string.IDS_fitness_detail_radio_button_tab_month)), runningMonthDetailFragment, false);
        this.f.b(this.h.b(this.e.getResources().getString(R.string.IDS_fitness_detail_radio_button_tab_year)), runningYearDetailFragment, false);
    }

    private void b() {
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.running_detail_titlebar);
        this.g = customTitleBar;
        customTitleBar.setHeadTitleAndLeftButton(getString(R.string.IDS_data_running_index_title_outside));
        this.g.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.RunningDataActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if ("RQ_RUNNING".equals(RunningDataActivity.this.i)) {
                    RunningDataActivity.this.a();
                }
                RunningDataActivity.this.finish();
            }
        });
        wka.d(this, this.g, "RUNNING_STATE_INDEX");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Intent intent = new Intent();
        intent.putExtra("KEY_RUNNING_GENDER", this.f27596a.getGender());
        intent.putExtra("KEY_RUNNING_AGE", this.f27596a.getAge());
        setResult(-1, intent);
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if ("RQ_RUNNING".equals(this.i)) {
            a();
        }
        super.onBackPressed();
    }

    private void i() {
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.RunningDataActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_gender_window", true);
                AppRouter.c("/HWUserProfileMgr/UserInfoActivity").d(bundle).b(RunningDataActivity.this.e);
                HashMap map = new HashMap(1);
                map.put("click", 1);
                lmf.d().c(RunningDataActivity.this.e, AnalyticsValue.HEALTH_JUMP_USERINFO_FROM_VO2MAX_2040082.value(), map, 0);
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        g();
    }

    private void g() {
        ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).sync(new CommonCallback() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.RunningDataActivity.3
            @Override // com.huawei.up.callback.CommonCallback
            public void onSuccess(Bundle bundle) {
                LogUtil.a("Track_RunningDataActivity", "refreshUserInfoAfterSync onSuccess");
                RunningDataActivity.this.d();
            }

            @Override // com.huawei.up.callback.CommonCallback
            public void onFail(int i) {
                LogUtil.a("Track_RunningDataActivity", "refreshUserInfoAfterSync onFail");
                if (-1 == i) {
                    RunningDataActivity.this.d();
                }
            }
        });
        imz.b("RunningDataActivity");
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.health.activity.healthdata.RunningDataActivity$2, reason: invalid class name */
    public class AnonymousClass2 extends UserInformationCallback<RunningDataActivity> {
        AnonymousClass2(RunningDataActivity runningDataActivity) {
            super(runningDataActivity);
        }

        @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, final UserInfomation userInfomation) {
            if (userInfomation == null) {
                LogUtil.j("Track_RunningDataActivity", "refreshUserInfo getUserInfo userInfomation is null");
                return;
            }
            if (this.mReference == null) {
                LogUtil.j("Track_RunningDataActivity", "refreshUserInfo getUserInfo mReference is null");
                return;
            }
            final RunningDataActivity runningDataActivity = (RunningDataActivity) this.mReference.get();
            if (runningDataActivity != null) {
                runningDataActivity.runOnUiThread(new Runnable() { // from class: uqu
                    @Override // java.lang.Runnable
                    public final void run() {
                        runningDataActivity.d(userInfomation);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo(new AnonymousClass2(this));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(UserInfomation userInfomation) {
        int gender = userInfomation.getGender();
        if (gender != 0 && gender != 1) {
            this.f27598c.setVisibility(0);
            i();
        } else {
            this.f27598c.setVisibility(8);
        }
        if (this.f27596a.getGender() == userInfomation.getGender() && this.f27596a.getAge() == userInfomation.getAge()) {
            LogUtil.j("Track_RunningDataActivity", "refreshGenderTips gender and age is not change");
        } else {
            this.f27596a = userInfomation;
            this.f27597b.updateGenderView(gender);
        }
    }
}
