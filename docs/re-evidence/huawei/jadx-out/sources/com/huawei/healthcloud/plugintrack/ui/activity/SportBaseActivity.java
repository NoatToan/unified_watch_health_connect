package com.huawei.healthcloud.plugintrack.ui.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.basesport.viewmodel.BaseSportingViewModel;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.AIActionBundle;
import com.huawei.ui.commonui.viewpager.HealthFragmentStatePagerAdapter;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.ive;
import defpackage.jch;
import defpackage.jvz;
import defpackage.qpx;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class SportBaseActivity extends AbstractSportActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SportLaunchParams f10885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f10886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f10887c = 0;
    private int d = 0;
    private long e = 0;
    private BaseSportingViewModel h;
    private HealthViewPager j;

    @Override // com.huawei.healthcloud.plugintrack.ui.activity.AbstractSportActivity
    protected void doAfterPreCheck() {
        c();
        e();
        d();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.activity.AbstractSportActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        h();
        super.onCreate(bundle);
        setContentView(a());
        f();
    }

    private void f() {
        AIActionBundle aIActionBundleB = b();
        if (aIActionBundleB != null) {
            int towards = aIActionBundleB.getTowards();
            ReleaseLogUtil.d("Track_SportBaseActivity", "initAiActionOrientation towards:", Integer.valueOf(towards));
            if (jch.b(towards) == 1) {
                setRequestedOrientation(0);
            }
        }
    }

    public AIActionBundle b() {
        SportLaunchParams sportLaunchParams = this.f10885a;
        if (sportLaunchParams != null) {
            return (AIActionBundle) sportLaunchParams.getExtra("AI_ACTION_BUNDLE", AIActionBundle.class);
        }
        return null;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.activity.AbstractSportActivity
    protected void initPreCheckAction() {
        super.initPreCheckAction();
    }

    private void h() {
        SportLaunchParams sportLaunchParamsJ = j();
        this.f10885a = sportLaunchParamsJ;
        this.f10887c = c(sportLaunchParamsJ);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.activity.AbstractSportActivity
    protected PermissionUtil.PermissionType getPermissionType() {
        return ive.d(this.f10887c);
    }

    protected int a() {
        return R.layout.activity_sportting;
    }

    protected void c() {
        this.j = (HealthViewPager) findViewById(R.id.sporting_view_pager);
    }

    protected void e() {
        LogUtil.a("Track_SportBaseActivity", "initViewModel with sport type: ", Integer.valueOf(this.f10887c));
        Class clsE = jvz.e(this.f10887c);
        if (clsE == null) {
            ReleaseLogUtil.a("Track_SportBaseActivity", "get view model failed, pls check sport type:", Integer.valueOf(this.f10887c));
            finish();
            return;
        }
        this.h = (BaseSportingViewModel) new ViewModelProvider(this).get(clsE);
        this.f10885a.setLaunchActivity(getClass().getName());
        Bundle bundle = new Bundle();
        bundle.putParcelable("bundle_key_sport_launch_paras", this.f10885a);
        this.h.init(bundle);
    }

    protected void d() {
        BaseSportingViewModel baseSportingViewModel = this.h;
        if (baseSportingViewModel == null || this.j == null) {
            ReleaseLogUtil.a("Track_SportBaseActivity", "mViewModel or mViewPager is null");
            return;
        }
        baseSportingViewModel.requestData();
        List<Fragment> fragments = this.h.getFragments();
        this.d = this.h.getDefaultItem();
        boolean zIsCanScroll = this.h.isCanScroll();
        LogUtil.a("Track_SportBaseActivity", "initData with Fragment size:", Integer.valueOf(fragments.size()), " default item:", Integer.valueOf(this.d), " isCanScroll:", Boolean.valueOf(zIsCanScroll));
        a aVar = new a(getSupportFragmentManager(), fragments);
        this.f10886b = aVar;
        this.j.setAdapter(aVar);
        this.j.setCurrentItem(this.d);
        this.j.setIsScroll(zIsCanScroll);
        this.j.addOnPageChangeListener(new HealthViewPager.OnPageChangeListener(this) { // from class: com.huawei.healthcloud.plugintrack.ui.activity.SportBaseActivity.2
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                LogUtil.a("Track_SportBaseActivity", "setOnPageChangeListener position = ", Integer.valueOf(i));
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        LogUtil.a("Track_SportBaseActivity", "onBackPressed()");
        g();
        if (i()) {
            if (this.h.getSportType() == 700001) {
                return;
            }
            l();
            return;
        }
        HealthViewPager healthViewPager = this.j;
        if (healthViewPager != null && healthViewPager.getCurrentItem() != 0 && this.j.getCurrentItem() != this.d) {
            c(0);
        } else {
            super.onBackPressed();
        }
    }

    private void g() {
        BaseSportingViewModel baseSportingViewModel = this.h;
        if (baseSportingViewModel == null) {
            LogUtil.e("Track_SportBaseActivity", "dispatchBackPressedToFragment viewModel is null");
            return;
        }
        for (ActivityResultCaller activityResultCaller : baseSportingViewModel.getFragments()) {
            if (activityResultCaller instanceof IOnBackPressed) {
                ((IOnBackPressed) activityResultCaller).onBackPressed();
            }
        }
    }

    private boolean i() {
        BaseSportingViewModel baseSportingViewModel = this.h;
        return (baseSportingViewModel == null || baseSportingViewModel.getSportStatus() == 0 || this.h.getSportStatus() == 7) ? false : true;
    }

    private void l() {
        if (this.e <= 0 || System.currentTimeMillis() - this.e >= 2000) {
            this.e = System.currentTimeMillis();
            qpx.e(BaseApplication.getContext(), R.string.IDS_motiontrack_show_sport_pause_key_down_back_long_click);
        }
    }

    public void c(int i) {
        LogUtil.a("Track_SportBaseActivity", "mViewPager:", this.j, " item:", Integer.valueOf(i));
        if (this.j == null || i < 0 || i >= this.f10886b.getCount()) {
            return;
        }
        this.j.setCurrentItem(i);
    }

    private int c(SportLaunchParams sportLaunchParams) {
        if (sportLaunchParams == null) {
            return 0;
        }
        return sportLaunchParams.getSportType();
    }

    private SportLaunchParams j() {
        Intent intent = getIntent();
        if (intent != null) {
            return (SportLaunchParams) intent.getParcelableExtra("bundle_key_sport_launch_paras");
        }
        return null;
    }

    public static class a extends HealthFragmentStatePagerAdapter {
        private List<Fragment> e;

        @Override // com.huawei.uikit.hwviewpager.widget.HwFragmentStatePagerAdapter, com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public Parcelable saveState() {
            return null;
        }

        public a(FragmentManager fragmentManager, List<Fragment> list) {
            super(fragmentManager);
            this.e = list;
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwFragmentStatePagerAdapter
        public Fragment getItem(int i) {
            List<Fragment> list = this.e;
            if (list == null || i < 0 || i >= list.size()) {
                return null;
            }
            return this.e.get(i);
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
        public int getCount() {
            return this.e.size();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
