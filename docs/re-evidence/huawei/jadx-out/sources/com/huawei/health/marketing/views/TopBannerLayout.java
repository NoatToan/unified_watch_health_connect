package com.huawei.health.marketing.views;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.fxb;
import defpackage.fxk;
import defpackage.fya;
import defpackage.gal;
import defpackage.lrd;
import defpackage.njy;
import defpackage.qqp;
import defpackage.qrs;
import defpackage.qsp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class TopBannerLayout extends BaseLifeCycleLinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthViewPager f8436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f8437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8438c;
    protected FrameLayout d;
    private HealthDotsPageIndicator e;
    private Pair<Integer, Integer> f;
    private List<ResourceBriefInfo> g;
    private HealthViewPager h;
    private final HealthViewPager.OnPageChangeListener i;
    private gal j;
    private a m;
    private gal n;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    public TopBannerLayout(Context context) {
        super(context);
        this.f8438c = 4000;
        this.g = new ArrayList();
        this.f = BaseActivity.getSafeRegionWidth();
        this.i = new HealthViewPager.OnPageChangeListener() { // from class: com.huawei.health.marketing.views.TopBannerLayout.2
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                ResourceBriefInfo resourceBriefInfo;
                LogUtil.a("TopBannerLayout", "onPageSelected: ", Integer.valueOf(i));
                boolean zB = fxk.b(TopBannerLayout.this);
                boolean zE = fxk.e(TopBannerLayout.this, i);
                LogUtil.a("TopBannerLayout", "isRectVisibleToUser: ", Boolean.valueOf(zB), " isWindowVisibleToUser: ", Boolean.valueOf(zE));
                if (zB && zE && TopBannerLayout.this.j != null && njy.c(TopBannerLayout.this.g, i) && (resourceBriefInfo = (ResourceBriefInfo) TopBannerLayout.this.g.get(i)) != null) {
                    TopBannerLayout.this.j.a(1, resourceBriefInfo, i);
                }
            }
        };
        this.f8437b = context;
    }

    public void a(List<ResourceBriefInfo> list) {
        if (njy.e(list)) {
            LogUtil.j("TopBannerLayout", "resourceBriefInfoList isEmpty");
            return;
        }
        this.g = list;
        LogUtil.a("TopBannerLayout", "mResourceBriefInfoList size:", Integer.valueOf(list.size()));
        Collections.sort(this.g, new fxb());
        if (this.g.size() > 3) {
            this.g = this.g.subList(0, 3);
        }
        b();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(final Configuration configuration) {
        fxk.d(configuration.orientation);
        super.onConfigurationChanged(configuration);
        HandlerExecutor.c(new Runnable() { // from class: com.huawei.health.marketing.views.TopBannerLayout.4
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("TopBannerLayout", "onConfigurationChanged,", Integer.valueOf(configuration.orientation));
                TopBannerLayout.this.h();
            }
        }, 200L);
    }

    private void b() {
        View viewInflate = LayoutInflater.from(BaseApplication.getContext()).inflate(R.layout.common_top_banner_marketing, this);
        this.d = (FrameLayout) viewInflate.findViewById(R.id.view_top_banner_root);
        HealthViewPager healthViewPager = (HealthViewPager) viewInflate.findViewById(R.id.view_pager_common_top_banner);
        this.h = healthViewPager;
        healthViewPager.addOnPageChangeListener(this.i);
        this.f8436a = (HealthViewPager) viewInflate.findViewById(R.id.view_pager_common_top_banner_cant_loop);
        this.j = new gal(this.g, this.h, this.f8437b);
        this.n = new gal(this.g, this.f8436a, this.f8437b);
        this.h.setAdapter(this.j);
        this.f8436a.setAdapter(this.n);
        HealthDotsPageIndicator healthDotsPageIndicator = (HealthDotsPageIndicator) viewInflate.findViewById(R.id.indicator);
        this.e = healthDotsPageIndicator;
        healthDotsPageIndicator.setViewPager(this.h);
        this.h.setOnTouchListener(new View.OnTouchListener() { // from class: com.huawei.health.marketing.views.TopBannerLayout.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 1 || action == 3 || action == 4) {
                    TopBannerLayout.this.a();
                    return false;
                }
                if (action == 0) {
                    TopBannerLayout.this.d();
                    return false;
                }
                LogUtil.a("TopBannerLayout", "not need deal");
                return false;
            }
        });
        this.f8436a.setOnTouchListener(new View.OnTouchListener() { // from class: com.huawei.health.marketing.views.TopBannerLayout.5
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 1 || action == 3 || action == 4) {
                    TopBannerLayout.this.a();
                    return false;
                }
                if (action == 0) {
                    TopBannerLayout.this.d();
                    return false;
                }
                LogUtil.a("TopBannerLayout", "not need deal");
                return false;
            }
        });
        h();
        if (this.m == null) {
            a aVar = new a(this);
            this.m = aVar;
            qsp.a(this.d, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.h == null || this.f8436a == null) {
            return;
        }
        LogUtil.a("TopBannerLayout", "initData:", Integer.valueOf(this.g.size()));
        this.j.e(this.g);
        this.j.notifyDataSetChanged();
        this.n.e(this.g);
        this.n.notifyDataSetChanged();
        b(this.h);
        b(this.f8436a);
        e();
        b(this.g.size());
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        List<ResourceBriefInfo> list = this.g;
        if (list == null || this.e == null) {
            return;
        }
        if (list.size() > 1) {
            if (qrs.af(this.f8437b) && this.g.size() <= 2) {
                this.e.d();
                return;
            } else if (lrd.d()) {
                this.e.d();
                return;
            } else {
                this.e.b(this.f8438c);
                return;
            }
        }
        this.e.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        HealthDotsPageIndicator healthDotsPageIndicator = this.e;
        if (healthDotsPageIndicator != null) {
            healthDotsPageIndicator.d();
        }
    }

    private void b(HealthViewPager healthViewPager) {
        Context context;
        int dimension;
        int iIntValue;
        int i;
        if (njy.e(this.g) || (context = this.f8437b) == null) {
            LogUtil.j("TopBannerLayout", "resizeViewPager() mADImageShowList is empty or mContext = null");
            return;
        }
        int iA = fxk.a(context, 1003);
        int i2 = 0;
        try {
            dimension = (int) this.f8437b.getResources().getDimension(R.dimen.defaultPaddingStart);
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("TopBannerLayout", "resizeViewPager() dimen id is not found.");
            dimension = 0;
        }
        if (qrs.af(this.f8437b)) {
            int iC = fya.c(this.f8437b, 0);
            int iB = qqp.b(this.f8437b);
            int size = this.g.size();
            if (size == 0) {
                LogUtil.j("TopBannerLayout", "resizeViewPager() imageListSize <= 0.");
                i = 0;
            } else if (size != 1) {
                if (size == 2) {
                    int i3 = ((iA - (iC * 2)) - iB) / 2;
                    healthViewPager.setIsScroll(false);
                    iIntValue = (iA - iC) - i3;
                    i = i3;
                } else {
                    i = (iA - iC) / 2;
                    healthViewPager.setIsScroll(true);
                    iIntValue = i;
                }
                i2 = iB;
            } else {
                i = (iA - iC) / 2;
                healthViewPager.setIsScroll(false);
            }
            iIntValue = i;
        } else {
            int dimension2 = (int) this.f8437b.getResources().getDimension(R.dimen.defaultPaddingStart);
            int iIntValue2 = ((Integer) this.f.first).intValue();
            int iIntValue3 = ((Integer) this.f.second).intValue();
            iIntValue = dimension + ((Integer) this.f.first).intValue();
            healthViewPager.setIsScroll(this.g.size() > 1);
            i2 = dimension2 + iIntValue2 + iIntValue3;
            i = iIntValue;
        }
        e(healthViewPager, i2, i, iIntValue);
    }

    private void e() {
        int iC = (fya.c(this.f8437b, 0) * 9) / 16;
        ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.height = iC;
            this.d.setLayoutParams(layoutParams2);
        }
    }

    private void b(int i) {
        if (i == 1) {
            if (qrs.af(this.f8437b)) {
                this.h.setVisibility(8);
                this.f8436a.setVisibility(0);
                this.e.setViewPager(this.f8436a);
                this.e.setVisibility(8);
                return;
            }
            this.h.setVisibility(0);
            this.f8436a.setVisibility(8);
            this.e.setViewPager(this.h);
            this.e.setVisibility(8);
            return;
        }
        if (i != 2) {
            if (i == 3) {
                this.h.setVisibility(0);
                this.f8436a.setVisibility(8);
                this.e.setViewPager(this.h);
                this.e.setVisibility(0);
                return;
            }
            LogUtil.d("TopBannerLayout", "mAdImageShowList size is illegal");
            return;
        }
        if (qrs.af(this.f8437b)) {
            this.h.setVisibility(8);
            this.f8436a.setVisibility(0);
            this.e.setViewPager(this.f8436a);
            this.e.setVisibility(8);
            return;
        }
        this.h.setVisibility(0);
        this.f8436a.setVisibility(8);
        this.e.setViewPager(this.h);
        this.e.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.n == null || njy.e(this.g)) {
            return;
        }
        LogUtil.a("TopBannerLayout", "setCantLoopBiEvent");
        int i = -1;
        for (ResourceBriefInfo resourceBriefInfo : this.g) {
            if (resourceBriefInfo != null) {
                i++;
                this.n.a(1, resourceBriefInfo, i);
            }
        }
    }

    private void e(HealthViewPager healthViewPager, int i, int i2, int i3) {
        LogUtil.a("TopBannerLayout", "resizeViewPager() pageMargin = ", Integer.valueOf(i), ", startPadding = ", Integer.valueOf(i2), ", endPadding = ", Integer.valueOf(i3));
        try {
            healthViewPager.setPageMargin(i);
            healthViewPager.setPadding(i2, 0, i3, 0);
        } catch (IllegalStateException unused) {
            LogUtil.e("TopBannerLayout", "AdViewPager setPageMargin llegalStateException.");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.m != null) {
            LogUtil.a("TopBannerLayout", "onDetachedFromWindow removeOnGlobalLayoutListener");
            qsp.b(this.d, this.m);
        }
    }

    static class a implements ViewTreeObserver.OnGlobalLayoutListener {
        private final WeakReference<TopBannerLayout> d;

        public a(TopBannerLayout topBannerLayout) {
            this.d = new WeakReference<>(topBannerLayout);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            TopBannerLayout topBannerLayout = this.d.get();
            if (topBannerLayout != null && MarketingBiUtils.c(topBannerLayout.d)) {
                LogUtil.a("TopBannerLayout", "ViewTreeObserverListener sportBanner visible ");
                if (topBannerLayout.f8436a.getVisibility() != 0 || topBannerLayout.n == null) {
                    if (topBannerLayout.h.getVisibility() == 0 && topBannerLayout.j != null) {
                        ResourceBriefInfo resourceBriefInfo = (ResourceBriefInfo) topBannerLayout.g.get(0);
                        if (resourceBriefInfo != null) {
                            topBannerLayout.j.a(1, resourceBriefInfo, 0);
                        }
                    } else {
                        LogUtil.j("TopBannerLayout", "ViewTreeObserverListener can not report bi");
                    }
                } else {
                    topBannerLayout.c();
                }
                qsp.b(topBannerLayout.d, this);
            }
        }
    }
}
