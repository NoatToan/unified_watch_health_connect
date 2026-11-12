package com.huawei.ui.main.stories.template.health.module.hasdata;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.huawei.android.airsharing.api.IEventListener;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.MarketingOption;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.subtab.HealthSubTabWidget;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.template.BasePresenter;
import com.huawei.ui.main.stories.template.Constants;
import com.huawei.ui.main.stories.template.data.PageDataObserver;
import com.huawei.ui.main.stories.template.health.HealthMvpActivity;
import com.huawei.ui.main.stories.template.health.HealthMvpFragment;
import com.huawei.ui.main.stories.template.health.config.HealthDateFragmentConfig;
import com.huawei.ui.main.stories.template.health.config.HealthHasDataConfig;
import defpackage.dlo;
import defpackage.qpn;
import defpackage.uxd;
import defpackage.wpp;
import defpackage.wpq;
import defpackage.wqq;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class HealthHasDataFragment extends HealthMvpFragment implements PageDataObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29017a;
    private HealthSubTabWidget d;
    private List<HealthDataDetailBaseFragment> e;
    private qpn f;
    private View h;
    private HealthViewPager i;
    private int j = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f29018b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthHasDataConfig f29019c = null;

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpFragment
    public BasePresenter onCreatePresenter() {
        return null;
    }

    public void a(HealthHasDataConfig healthHasDataConfig, int i, long j) {
        this.f29019c = healthHasDataConfig;
        this.j = i;
        this.f29018b = j;
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpFragment
    public View getContentView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_health_has_data, viewGroup, false);
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpFragment
    public void initViews(View view) {
        this.e = new ArrayList(4);
        this.h = view;
        this.d = (HealthSubTabWidget) view.findViewById(R.id.health_detail_sub_tab_widget);
        HealthViewPager healthViewPager = (HealthViewPager) view.findViewById(R.id.health_detail_viewpager);
        this.i = healthViewPager;
        healthViewPager.setIsScroll(true);
        this.i.addOnPageChangeListener(new HealthViewPager.OnPageChangeListener() { // from class: com.huawei.ui.main.stories.template.health.module.hasdata.HealthHasDataFragment.5
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                HealthHasDataFragment.this.f29017a = i;
                HealthHasDataFragment.this.a(i);
                Iterator it = HealthHasDataFragment.this.e.iterator();
                while (it.hasNext()) {
                    ((HealthDataDetailBaseFragment) it.next()).c(i);
                }
                HealthHasDataFragment.this.e(i);
            }
        });
        a(this.f29017a);
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpFragment
    public void initData() {
        if (this.f29019c != null) {
            b();
            e();
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        uxd uxdVarD = d();
        if (uxdVarD != null) {
            uxdVarD.notifyViewPagerChange(i);
            wqq.d("sub_tab_bottom_index_y", Integer.valueOf(uxdVarD.e((View) this.d, false)));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        uxd uxdVarD = d();
        if (uxdVarD != null) {
            uxdVarD.b(this.h.findViewById(R.id.layout_blood_sugar_remind));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        uxd uxdVarD = d();
        if (uxdVarD != null) {
            uxdVarD.b(i);
        }
    }

    private uxd d() {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof HealthMvpActivity)) {
            return null;
        }
        BasePresenter presenter = ((HealthMvpActivity) activity).getPresenter();
        if (presenter instanceof uxd) {
            return (uxd) presenter;
        }
        return null;
    }

    public void c(long j) {
        Iterator<HealthDataDetailBaseFragment> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().a(j);
        }
    }

    private void b(String str, String str2, HealthDateFragmentConfig healthDateFragmentConfig, Constants.PageType pageType, boolean z) {
        HealthDataDetailBaseFragment healthDataDetailBaseFragment = new HealthDataDetailBaseFragment();
        healthDataDetailBaseFragment.e(str2, healthDateFragmentConfig, pageType);
        this.f.b(this.d.b(str), healthDataDetailBaseFragment, z);
        this.e.add(healthDataDetailBaseFragment);
    }

    private void b() {
        this.f = new qpn(getChildFragmentManager(), this.i, this.d);
        HealthDateFragmentConfig dayFragmentConfig = this.f29019c.getDayFragmentConfig();
        if (dayFragmentConfig != null) {
            b(getResources().getString(R.string.IDS_fitness_detail_radio_button_tab_day), "Main_HealthDayDetailFragment", dayFragmentConfig, Constants.PageType.DAY, true);
        }
        HealthDateFragmentConfig weekFragmentConfig = this.f29019c.getWeekFragmentConfig();
        if (weekFragmentConfig != null) {
            b(getResources().getString(R.string.IDS_fitness_detail_radio_button_tab_week), "Main_HealthWeekDetailFragment", weekFragmentConfig, Constants.PageType.WEEK, false);
        }
        HealthDateFragmentConfig monthFragmentConfig = this.f29019c.getMonthFragmentConfig();
        if (monthFragmentConfig != null) {
            b(getResources().getString(R.string.IDS_fitness_detail_radio_button_tab_month), "Main_HealthMonthDetailFragment", monthFragmentConfig, Constants.PageType.MONTH, false);
        }
        HealthDateFragmentConfig yearFragmentConfig = this.f29019c.getYearFragmentConfig();
        if (yearFragmentConfig != null) {
            b(getResources().getString(R.string.IDS_fitness_detail_radio_button_tab_year), "Main_HealthYearDetailFragment", yearFragmentConfig, Constants.PageType.YEAR, false);
        }
        c(this.f29018b);
        this.i.setOffscreenPageLimit(1);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: wqd
            @Override // java.lang.Runnable
            public final void run() {
                this.d.a();
            }
        }, 600L);
    }

    public /* synthetic */ void a() {
        this.i.setOffscreenPageLimit(4);
    }

    private void e() {
        wpq.a().d(this.j, this);
        wpp.a().c(this.j);
    }

    @Override // com.huawei.ui.main.stories.template.data.PageDataObserver
    public void update(wpq wpqVar, List<dlo> list) {
        Iterator<HealthDataDetailBaseFragment> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().b(list);
        }
    }

    private void c() {
        int i;
        final int i2;
        int i3 = this.j;
        int i4 = 8;
        if (i3 != 8) {
            i4 = 24;
            if (i3 != 24) {
                return;
            }
            i = 4027;
            i2 = 3031;
        } else {
            i = 4010;
            i2 = IEventListener.EVENT_ID_DEVICE_REQUEST_PLAY;
        }
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi != null) {
            marketingApi.requestMarketingResource(new MarketingOption.Builder().setContext(getActivity()).setPageId(i4).build());
            marketingApi.getResourceResultInfo(i).addOnSuccessListener(new OnSuccessListener() { // from class: wqg
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    this.e.d(marketingApi, i2, (Map) obj);
                }
            });
        }
    }

    public /* synthetic */ void d(MarketingApi marketingApi, int i, Map map) {
        Map<Integer, ResourceResultInfo> mapFilterMarketingRules = marketingApi.filterMarketingRules((Map<Integer, ResourceResultInfo>) map);
        d(mapFilterMarketingRules, i);
        LogUtil.a("datafragment", "filterResult size: ", Integer.valueOf(mapFilterMarketingRules.size()));
    }

    private void d(final Map<Integer, ResourceResultInfo> map, final int i) {
        this.e.get(0).e(map, i);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: wqe
            @Override // java.lang.Runnable
            public final void run() {
                this.d.c(map, i);
            }
        }, 600L);
    }

    public /* synthetic */ void c(Map map, int i) {
        for (int i2 = 1; i2 < this.e.size(); i2++) {
            this.e.get(i2).e(map, i);
        }
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        wpq.a().e(this);
        wpp.a().e();
    }
}
