package com.huawei.ui.main.stories.template.health.module.hasdata;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.scrollview.ScrollViewListener;
import com.huawei.ui.commonui.utils.ScrollUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.temperature.view.OnActivityResultInterface;
import com.huawei.ui.main.stories.template.BaseComponent;
import com.huawei.ui.main.stories.template.BaseView;
import com.huawei.ui.main.stories.template.Constants;
import com.huawei.ui.main.stories.template.health.HealthMvpFragment;
import com.huawei.ui.main.stories.template.health.config.HealthCommonExpandViewConfig;
import com.huawei.ui.main.stories.template.health.config.HealthDateFragmentConfig;
import com.huawei.ui.main.stories.template.health.contract.DataDetailFragmentContract;
import com.huawei.ui.main.stories.template.health.view.NoDataNewsView;
import com.huawei.ui.main.stories.template.health.view.RecommendActivityView;
import defpackage.dlo;
import defpackage.qrs;
import defpackage.uyc;
import defpackage.wpt;
import defpackage.wqn;
import defpackage.wqo;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class HealthDataDetailBaseFragment extends HealthMvpFragment<wpt> implements BaseView, DataDetailFragmentContract.DetailFragmentView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<BaseComponent> f29014a = new ArrayList(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f29015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f29016c;
    private boolean d;
    protected HealthDateFragmentConfig e;
    private HealthScrollView f;
    private LinearLayout.LayoutParams g;
    private LinearLayout h;
    private Constants.PageType i;
    private List<dlo> j;
    private String n;

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpFragment
    public void initData() {
    }

    public void e(String str, HealthDateFragmentConfig healthDateFragmentConfig, Constants.PageType pageType) {
        this.n = str;
        this.e = healthDateFragmentConfig;
        this.i = pageType;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.d = qrs.af(getContext());
        e();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Iterator<BaseComponent> it = this.f29014a.iterator();
        while (it.hasNext()) {
            it.next().onCreate();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Iterator<BaseComponent> it = this.f29014a.iterator();
        while (it.hasNext()) {
            it.next().onResume();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Iterator<BaseComponent> it = this.f29014a.iterator();
        while (it.hasNext()) {
            it.next().onPause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Iterator<BaseComponent> it = this.f29014a.iterator();
        while (it.hasNext()) {
            it.next().onStop();
        }
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        Iterator<BaseComponent> it = this.f29014a.iterator();
        while (it.hasNext()) {
            it.next().onDestory();
        }
        super.onDestroy();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean zAf = qrs.af(getContext());
        boolean z = this.d;
        if (zAf != z) {
            this.d = !z;
            Iterator<BaseComponent> it = this.f29014a.iterator();
            while (it.hasNext()) {
                it.next().refreshView(this.d);
            }
        }
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpFragment
    public View getContentView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_common_health, viewGroup, false);
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpFragment
    public void initViews(View view) {
        this.f29015b = (LinearLayout) view.findViewById(R.id.health_common_container);
        this.h = (LinearLayout) view.findViewById(R.id.marketing_resource_layout);
        this.f = (HealthScrollView) view.findViewById(R.id.health_common_scroll_view);
        this.f29014a = new ArrayList();
        this.d = qrs.af(getContext());
        a(this.f29015b);
        this.f.setScrollViewListener(new ScrollViewListener() { // from class: wpz
            @Override // com.huawei.ui.commonui.scrollview.ScrollViewListener
            public final void onScrollChanged(HealthScrollView healthScrollView, int i, int i2, int i3, int i4) {
                this.d.d(healthScrollView, i, i2, i3, i4);
            }
        });
    }

    public /* synthetic */ void d(HealthScrollView healthScrollView, int i, int i2, int i3, int i4) {
        wpt presenter = getPresenter();
        if (presenter instanceof uyc) {
            if (this.i == Constants.PageType.WEEK || this.i == Constants.PageType.MONTH) {
                ((uyc) presenter).e();
            }
        }
    }

    public void a(LinearLayout linearLayout) {
        HealthDateFragmentConfig healthDateFragmentConfig = this.e;
        if (healthDateFragmentConfig == null) {
            return;
        }
        a(healthDateFragmentConfig.getLayoutConfig().getChartView(), linearLayout);
        a(this.e.getLayoutConfig().getStatisticsViewConfig(), linearLayout);
        a(this.e.getLayoutConfig().getAnalysisViewConfig(), linearLayout);
        a(this.e.getLayoutConfig().getHealthRecommendServiceViewConfig(), linearLayout);
        a(this.e.getLayoutConfig().getHealthServicesDisplayViewConfig(), linearLayout);
        a(this.e.getLayoutConfig().getRecommendActivityViewConfig(), linearLayout);
        a(this.e.getLayoutConfig().getRecipeCardViewConfig(), linearLayout);
        a(this.e.getLayoutConfig().getInformationViewConfig(), linearLayout);
        getPresenter().setComponents(this.f29014a);
    }

    private void a(HealthCommonExpandViewConfig healthCommonExpandViewConfig, LinearLayout linearLayout) {
        BaseComponent baseComponentD;
        if (healthCommonExpandViewConfig == null) {
            return;
        }
        String newComponent = healthCommonExpandViewConfig.getNewComponent();
        if (TextUtils.isEmpty(newComponent) || (baseComponentD = wqo.d(newComponent, getContext())) == null) {
            return;
        }
        if (this.g == null) {
            this.g = new LinearLayout.LayoutParams(-1, -2);
        }
        baseComponentD.initComponent(healthCommonExpandViewConfig.getParams());
        baseComponentD.setPageType(this.i);
        baseComponentD.refreshView(this.d);
        baseComponentD.setPresenter(getPresenter());
        baseComponentD.setDateStamp(this.f29016c);
        linearLayout.addView(baseComponentD.getView(getContext()), this.g);
        this.f29014a.add(baseComponentD);
    }

    protected View b(HealthCommonExpandViewConfig healthCommonExpandViewConfig) {
        BaseComponent baseComponentD;
        if (healthCommonExpandViewConfig == null) {
            return null;
        }
        String newComponent = healthCommonExpandViewConfig.getNewComponent();
        if (TextUtils.isEmpty(newComponent) || (baseComponentD = wqo.d(newComponent, getContext())) == null) {
            return null;
        }
        if (this.g == null) {
            this.g = new LinearLayout.LayoutParams(-1, -2);
        }
        baseComponentD.initComponent(healthCommonExpandViewConfig.getParams());
        baseComponentD.setPageType(this.i);
        baseComponentD.refreshView(this.d);
        baseComponentD.setPresenter(getPresenter());
        baseComponentD.setDateStamp(this.f29016c);
        View view = baseComponentD.getView(getContext());
        this.f29014a.add(baseComponentD);
        return view;
    }

    public void a(long j) {
        this.f29016c = j;
        List<BaseComponent> list = this.f29014a;
        if (list != null) {
            Iterator<BaseComponent> it = list.iterator();
            while (it.hasNext()) {
                it.next().setDateStamp(j);
            }
        }
    }

    public void c(int i) {
        Iterator<BaseComponent> it = this.f29014a.iterator();
        while (it.hasNext()) {
            it.next().onDayWeekYear(i);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment
    public void initViewTahiti() {
        super.initViewTahiti();
        b(this.j);
    }

    private void e() {
        Iterator<BaseComponent> it = this.f29014a.iterator();
        while (it.hasNext()) {
            KeyEvent.Callback view = it.next().getView(getContext());
            if (view instanceof OnActivityResultInterface) {
                ((OnActivityResultInterface) view).setFragment(this);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator<BaseComponent> it = this.f29014a.iterator();
        while (it.hasNext()) {
            KeyEvent.Callback view = it.next().getView(getContext());
            if (view instanceof OnActivityResultInterface) {
                ((OnActivityResultInterface) view).onActivityResult(i, i2, intent);
            }
        }
    }

    public void e(Map<Integer, ResourceResultInfo> map, int i) {
        if (getActivity() == null || getActivity().getWindow() == null) {
            LogUtil.j(this.n, "activity is null.");
            return;
        }
        ScrollUtil.a(this.f, getActivity().getWindow().getDecorView(), i);
        if (map == null) {
            return;
        }
        Iterator<View> it = a(map).iterator();
        while (it.hasNext()) {
            this.h.addView(it.next());
        }
    }

    private List<View> a(Map<Integer, ResourceResultInfo> map) {
        ArrayList arrayList = new ArrayList();
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        return marketingApi != null ? marketingApi.getMarketingViewList(getActivity(), map) : arrayList;
    }

    public void b(List<dlo> list) {
        this.j = list;
        if (this.e == null || list == null) {
            LogUtil.j(this.n, "setOperationInfo mHealthDateFragmentConfig or moduleObjectList is null");
            return;
        }
        LogUtil.a(this.n, "setOperationInfo moduleObjectList size is ", Integer.valueOf(list.size()));
        for (dlo dloVar : list) {
            if (dloVar != null) {
                int iA = dloVar.a();
                if (iA == 3) {
                    d(dloVar);
                } else if (iA == 4) {
                    a(dloVar);
                } else {
                    LogUtil.j(this.n, "setOperationInfo unSupport moduleType", Integer.valueOf(iA));
                }
            }
        }
    }

    private void d(dlo dloVar) {
        RecommendActivityView recommendActivityView;
        if (dloVar == null) {
            LogUtil.j(this.n, "setActivityInfo activityInfo is null");
            return;
        }
        Iterator<BaseComponent> it = this.f29014a.iterator();
        while (true) {
            if (!it.hasNext()) {
                recommendActivityView = null;
                break;
            }
            BaseComponent next = it.next();
            if (next instanceof RecommendActivityView) {
                recommendActivityView = (RecommendActivityView) next;
                break;
            }
        }
        if (recommendActivityView == null) {
            LogUtil.j(this.n, "setNewsUiData recommendActivityView is null");
            return;
        }
        this.f29014a.remove(recommendActivityView);
        this.f29015b.removeView(recommendActivityView);
        View viewB = b(this.e.getLayoutConfig().getRecommendActivityViewConfig());
        if (viewB instanceof RecommendActivityView) {
            RecommendActivityView recommendActivityView2 = (RecommendActivityView) viewB;
            recommendActivityView2.setUiData(dloVar);
            this.f29015b.addView(recommendActivityView2);
        }
    }

    private void a(dlo dloVar) {
        NoDataNewsView noDataNewsView;
        if (dloVar == null) {
            LogUtil.j(this.n, "setNewsUiData newsUiData is null");
            return;
        }
        Iterator<BaseComponent> it = this.f29014a.iterator();
        while (true) {
            if (!it.hasNext()) {
                noDataNewsView = null;
                break;
            }
            BaseComponent next = it.next();
            if (next instanceof NoDataNewsView) {
                noDataNewsView = (NoDataNewsView) next;
                break;
            }
        }
        if (noDataNewsView == null) {
            LogUtil.j(this.n, "setNewsUiData noDataNewsView is null");
            return;
        }
        this.f29014a.remove(noDataNewsView);
        this.f29015b.removeView(noDataNewsView);
        View viewB = b(this.e.getLayoutConfig().getInformationViewConfig());
        if (viewB instanceof NoDataNewsView) {
            NoDataNewsView noDataNewsView2 = (NoDataNewsView) viewB;
            noDataNewsView2.setUiData(dloVar);
            this.f29015b.addView(noDataNewsView2);
        }
    }

    @Override // com.huawei.ui.main.stories.template.BaseView
    public Context getViewContext() {
        return getContext();
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpFragment
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public wpt onCreatePresenter() {
        HealthDateFragmentConfig healthDateFragmentConfig = this.e;
        if (healthDateFragmentConfig == null) {
            return null;
        }
        return (wpt) wqn.e(healthDateFragmentConfig.getFragmentPresenter(), this);
    }
}
