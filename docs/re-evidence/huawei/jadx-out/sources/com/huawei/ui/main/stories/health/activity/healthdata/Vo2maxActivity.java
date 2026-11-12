package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.userprofilemgr.model.UserInformationCallback;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.fragment.Vo2maxDayDetailFragment;
import com.huawei.ui.main.stories.health.fragment.Vo2maxMonthDetailFragment;
import com.huawei.ui.main.stories.health.fragment.Vo2maxWeekDetailFragment;
import com.huawei.ui.main.stories.health.fragment.Vo2maxYearDetailFragment;
import com.huawei.up.callback.CommonCallback;
import com.huawei.up.model.UserInfomation;
import defpackage.imz;
import defpackage.lmf;
import defpackage.qpn;
import defpackage.qsp;
import defpackage.wka;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class Vo2maxActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f27621a;
    private RelativeLayout d;
    private Vo2maxDayDetailFragment e;
    private Vo2maxMonthDetailFragment f;
    private HealthSubTabWidget g;
    private UserInfomation h;
    private HealthTextView i;
    private qpn j;
    private Vo2maxYearDetailFragment k;
    private HealthViewPager l;
    private CustomTitleBar m;
    private Vo2maxWeekDetailFragment o;
    private int n = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27623c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f27622b = false;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cancelAdaptRingRegion();
        setContentView(R.layout.activity_vo2max);
        this.f27621a = this;
        d();
    }

    private void d() {
        clearBackgroundDrawable();
        b();
        c();
    }

    private void c() {
        e();
        HealthViewPager healthViewPager = this.l;
        if (healthViewPager == null) {
            LogUtil.j("Vo2maxActivity", "initViewPager mViewPager is null");
            return;
        }
        healthViewPager.setScrollHeightArea(200);
        this.j = new qpn(this, this.l, this.g);
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        this.h = userInfo;
        if (userInfo == null) {
            LogUtil.j("Vo2maxActivity", "initViewPager mLocalUserInfo is null");
            this.h = new UserInfomation(UnitUtil.f() ? 1 : 0);
        }
        int iE = CommonUtil.e(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1005), 0);
        Bundle bundle = new Bundle();
        bundle.putInt("vo2max_age", this.h.getAgeOrDefaultValue());
        bundle.putInt("vo2max_gender", iE);
        b(bundle);
        Vo2maxDayDetailFragment vo2maxDayDetailFragment = new Vo2maxDayDetailFragment();
        this.e = vo2maxDayDetailFragment;
        vo2maxDayDetailFragment.setArguments(bundle);
        Vo2maxWeekDetailFragment vo2maxWeekDetailFragment = new Vo2maxWeekDetailFragment();
        this.o = vo2maxWeekDetailFragment;
        vo2maxWeekDetailFragment.setArguments(bundle);
        this.j.b(this.g.b(getString(R.string.IDS_fitness_detail_radio_button_tab_day)), this.e, true);
        this.j.b(this.g.b(getString(R.string.IDS_fitness_detail_radio_button_tab_week)), this.o, false);
        Vo2maxMonthDetailFragment vo2maxMonthDetailFragment = new Vo2maxMonthDetailFragment();
        this.f = vo2maxMonthDetailFragment;
        vo2maxMonthDetailFragment.setArguments(bundle);
        Vo2maxYearDetailFragment vo2maxYearDetailFragment = new Vo2maxYearDetailFragment();
        this.k = vo2maxYearDetailFragment;
        vo2maxYearDetailFragment.setArguments(bundle);
        this.j.b(this.g.b(this.f27621a.getResources().getString(R.string.IDS_fitness_detail_radio_button_tab_month)), this.f, false);
        this.j.b(this.g.b(this.f27621a.getResources().getString(R.string.IDS_fitness_detail_radio_button_tab_year)), this.k, false);
    }

    private void b(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            int intExtra = intent.getIntExtra("vo2max_value", 0);
            this.n = intExtra;
            if (intExtra != 0) {
                bundle.putInt("vo2max_value", intExtra);
                bundle.putLong("vo2max_time", intent.getLongExtra("vo2max_time", 0L));
            }
            this.f27623c = intent.getBooleanExtra("fromDetailFrag", false);
            this.f27622b = intent.getBooleanExtra("from_sport_list_fragment", false);
        }
    }

    private void e() {
        this.g = (HealthSubTabWidget) findViewById(R.id.vo2max_subTabLayout);
        this.d = (RelativeLayout) findViewById(R.id.hw_health_vo2max_tips);
        this.i = (HealthTextView) findViewById(R.id.vo2max_set_gender_text);
        this.l = (HealthViewPager) qsp.a(this, R.id.vo2max_detail_viewpager);
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.health.activity.healthdata.Vo2maxActivity$1, reason: invalid class name */
    public class AnonymousClass1 extends UserInformationCallback<Vo2maxActivity> {
        AnonymousClass1(Vo2maxActivity vo2maxActivity) {
            super(vo2maxActivity);
        }

        @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, final UserInfomation userInfomation) {
            if (userInfomation == null) {
                LogUtil.j("Vo2maxActivity", "refreshUserInfo getUserInfo userInfomation is null");
                return;
            }
            if (this.mReference == null) {
                LogUtil.j("Vo2maxActivity", "refreshUserInfo getUserInfo mReference is null");
                return;
            }
            final Vo2maxActivity vo2maxActivity = (Vo2maxActivity) this.mReference.get();
            if (vo2maxActivity != null) {
                vo2maxActivity.runOnUiThread(new Runnable() { // from class: ura
                    @Override // java.lang.Runnable
                    public final void run() {
                        vo2maxActivity.d(userInfomation);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo(new AnonymousClass1(this));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    private void b() {
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.vo2max_detail_titlebar);
        this.m = customTitleBar;
        customTitleBar.setHeadTitleAndLeftButton(this.f27621a.getString(R.string.IDS_hwh_health_vo2max));
        this.m.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.Vo2maxActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Vo2maxActivity.this.a();
            }
        });
        wka.d(this, this.m, "VO2_MAX");
    }

    private void i() {
        this.i.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.Vo2maxActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AppRouter.c("/HWUserProfileMgr/UserInfoActivity").b(Vo2maxActivity.this.f27621a);
                HashMap map = new HashMap(1);
                map.put("click", 1);
                lmf.d().c(Vo2maxActivity.this.f27621a, AnalyticsValue.HEALTH_JUMP_USERINFO_FROM_VO2MAX_2040082.value(), map, 0);
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        j();
    }

    private void j() {
        ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).sync(new CommonCallback() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.Vo2maxActivity.3
            @Override // com.huawei.up.callback.CommonCallback
            public void onSuccess(Bundle bundle) {
                LogUtil.a("Vo2maxActivity", "refreshUserInfoAfterSync onSuccess");
                Vo2maxActivity.this.g();
            }

            @Override // com.huawei.up.callback.CommonCallback
            public void onFail(int i) {
                LogUtil.a("Vo2maxActivity", "refreshUserInfoAfterSync onFail");
                if (i == -1) {
                    Vo2maxActivity.this.g();
                }
            }
        });
        imz.b("Vo2maxActivity");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Intent intent = new Intent();
        if (this.f27623c) {
            LogUtil.a("Vo2maxActivity", "enter backTrackDetail");
            intent.putExtra(CommonConstant.KEY_GENDER, this.h.getGenderOrDefaultValue());
            intent.putExtra("birthday", this.h.getAgeOrDefaultValue());
            setResult(100, intent);
        } else if (this.f27622b) {
            LogUtil.a("Vo2maxActivity", "enter backSportListFragment");
            intent.putExtra("KEY_RUNNING_GENDER", this.h.getGender());
            intent.putExtra("KEY_RUNNING_AGE", this.h.getAge());
            setResult(-1, intent);
        } else {
            LogUtil.a("Vo2maxActivity", "not from trackDetail and sportList");
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        a();
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(UserInfomation userInfomation) {
        int gender = userInfomation.getGender();
        if (gender != 0 && gender != 1) {
            this.d.setVisibility(0);
            i();
        } else {
            this.d.setVisibility(8);
        }
        if (this.h.getGender() == userInfomation.getGender() && this.h.getAge() == userInfomation.getAge()) {
            LogUtil.j("Vo2maxActivity", "refreshGenderTips gender and age is not change");
        } else {
            this.h = userInfomation;
            this.e.e(gender);
        }
    }
}
