package com.huawei.health.marketing.views;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.datatype.templates.BaseTemplate;
import com.huawei.health.marketing.datatype.templates.GridTemplate;
import com.huawei.health.marketing.request.ColumnProvider;
import com.huawei.health.marketing.request.ColumnRequestUtils;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.fxk;
import defpackage.fya;
import defpackage.fyf;
import defpackage.njy;
import defpackage.qrs;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class AppTurnPageLayout extends BaseLifeCycleLinearLayout implements View.OnClickListener, ResourceBriefInfoOwnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthDotsPageIndicator f8191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthViewPager f8192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8193c;
    private HealthViewPager d;
    private Context e;
    private List<List<SingleGridContent>> f;
    private int g;
    private ResourceBriefInfo h;
    private FrameLayout i;
    private List<SingleGridContent> j;
    private int k;
    private int m;
    private fyf n;
    private fyf o;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    public AppTurnPageLayout(Context context) {
        super(context);
        this.j = new ArrayList(10);
        this.f = new ArrayList(10);
        this.e = context;
    }

    public void e(int i, ResourceBriefInfo resourceBriefInfo, BaseTemplate baseTemplate) {
        if (resourceBriefInfo == null) {
            LogUtil.j("AppTurnPageLayout", "resourceBriefInfo is null");
            return;
        }
        this.g = i;
        this.h = resourceBriefInfo;
        if (baseTemplate instanceof GridTemplate) {
            this.j = ((GridTemplate) baseTemplate).getGridContents();
        }
        if (njy.e(this.j)) {
            LogUtil.j("AppTurnPageLayout", "mSingleGridContentList is null.");
            return;
        }
        LogUtil.a("AppTurnPageLayout", "initData size:", Integer.valueOf(this.j.size()));
        a();
        c();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        fxk.d(configuration.orientation);
        super.onConfigurationChanged(configuration);
        b();
    }

    private void c() {
        View viewInflate = LayoutInflater.from(BaseApplication.getContext()).inflate(R.layout.common_app_turn_page, this);
        this.i = (FrameLayout) viewInflate.findViewById(R.id.view_pager_function_menu_root);
        this.d = (HealthViewPager) viewInflate.findViewById(R.id.view_pager_app_turn_page);
        this.f8192b = (HealthViewPager) viewInflate.findViewById(R.id.view_pager_app_turn_page_cant_loop);
        this.f8191a = (HealthDotsPageIndicator) viewInflate.findViewById(R.id.indicator_app_turn_page);
        fyf fyfVar = new fyf(this.f, this.f8192b, this.e, this.g);
        this.n = fyfVar;
        this.f8192b.setAdapter(fyfVar);
        fyf fyfVar2 = new fyf(this.f, this.d, this.e, this.g);
        this.o = fyfVar2;
        this.d.setAdapter(fyfVar2);
        b();
    }

    private void b() {
        if (this.i == null) {
            return;
        }
        if (this.f.size() <= 1) {
            d(this.f8192b, this.i);
            this.n.d(this.f, this.h);
            this.n.notifyDataSetChanged();
            this.f8192b.setIsScroll(false);
            this.d.setVisibility(8);
            this.f8192b.setVisibility(0);
            this.f8191a.setVisibility(8);
        } else {
            d(this.d, this.i);
            this.o.d(this.f, this.h);
            this.o.notifyDataSetChanged();
            this.d.setIsScroll(true);
            this.d.setVisibility(0);
            this.f8192b.setVisibility(8);
            this.f8191a.setViewPager(this.d);
            this.f8191a.setVisibility(0);
        }
        this.f8191a.d();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    private void d(HealthViewPager healthViewPager, FrameLayout frameLayout) {
        boolean z;
        boolean zAf = qrs.af(BaseApplication.getActivity());
        List<List<SingleGridContent>> list = this.f;
        int dimensionPixelSize = 0;
        if (list != null && list.size() == 1 && njy.c(this.f, 0)) {
            int size = this.f.get(0).size();
            if (!zAf ? size <= 5 : size <= 8) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (healthViewPager.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            Resources resources = this.e.getResources();
            e(healthViewPager, resources, z);
            if (frameLayout.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.hw_show_size_30_dp);
                if (this.f.size() <= 1) {
                    dimensionPixelSize2 = 0;
                }
                if (fya.d()) {
                    int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.textSizeBody3);
                    if (qrs.ac()) {
                        dimensionPixelSize3 = qrs.d(this.e, (dimensionPixelSize3 / resources.getDisplayMetrics().scaledDensity) * 2.0f);
                    }
                    dimensionPixelSize = (this.m - resources.getDimensionPixelSize(R.dimen.hw_show_size_18_dp)) + (dimensionPixelSize3 * 2);
                    if (!z) {
                        dimensionPixelSize = (dimensionPixelSize * 2) + this.f8193c;
                    }
                }
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
                if (!fya.d()) {
                    dimensionPixelSize = this.k;
                }
                layoutParams.height = dimensionPixelSize + dimensionPixelSize2;
                frameLayout.setLayoutParams(layoutParams);
            }
        }
    }

    private void e(HealthViewPager healthViewPager, Resources resources, boolean z) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) healthViewPager.getLayoutParams();
        Context activity = BaseApplication.getActivity();
        if (activity == null) {
            LogUtil.j("AppTurnPageLayout", "getActivity = null");
            activity = BaseApplication.getContext();
        }
        layoutParams.width = qrs.i(activity);
        this.f8193c = fxk.c(this.h.getContentType());
        int dimensionPixelSize = (resources.getDimensionPixelSize(R.dimen.elementsMarginVerticalM) * 2) + resources.getDimensionPixelSize(R.dimen.hw_group_image_40dp) + resources.getDimensionPixelSize(R.dimen.hw_show_size_18_dp);
        this.m = dimensionPixelSize;
        if (!z) {
            dimensionPixelSize = (dimensionPixelSize * 2) + this.f8193c;
        }
        this.k = dimensionPixelSize;
        layoutParams.height = fya.d() ? -2 : this.k;
        healthViewPager.setLayoutParams(layoutParams);
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public boolean isOwnedByBriefInfo(ResourceBriefInfo resourceBriefInfo) {
        return (resourceBriefInfo == null || this.h == null || !resourceBriefInfo.getResourceId().equals(this.h.getResourceId())) ? false : true;
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public int getResourceBriefPriority() {
        ResourceBriefInfo resourceBriefInfo = this.h;
        if (resourceBriefInfo != null) {
            return resourceBriefInfo.getPriority();
        }
        return 0;
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public int getResourcePositionId() {
        return this.g;
    }

    private void a() {
        List<SingleGridContent> functionMenuFinallyData = ColumnRequestUtils.getFunctionMenuFinallyData(this.j, ColumnProvider.getInstance(BaseApplication.getContext()).getFavoriteList());
        int i = qrs.af(BaseApplication.getActivity()) ? 16 : 10;
        this.f.clear();
        int i2 = 0;
        while (i2 < ((functionMenuFinallyData.size() - 1) / i) + 1) {
            int i3 = i2 + 1;
            int i4 = i3 * i;
            if (i4 >= functionMenuFinallyData.size()) {
                this.f.add(functionMenuFinallyData.subList(i2 * i, functionMenuFinallyData.size()));
            } else {
                this.f.add(functionMenuFinallyData.subList(i2 * i, i4));
            }
            i2 = i3;
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        LogUtil.a("AppTurnPageLayout", "onWindowVisibilityChanged visibility=", Integer.valueOf(i), "mPageSizeList size=", Integer.valueOf(this.f.size()));
        if (i != 0 || njy.e(this.f)) {
            return;
        }
        a();
        this.o.notifyDataSetChanged();
    }
}
