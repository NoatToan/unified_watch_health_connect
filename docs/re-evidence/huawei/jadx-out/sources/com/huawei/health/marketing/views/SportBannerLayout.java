package com.huawei.health.marketing.views;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.datatype.templates.BaseTemplate;
import com.huawei.health.marketing.datatype.templates.GridTemplate;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.servicesui.R;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.utils.ScrollUtil;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.dkf;
import defpackage.fxk;
import defpackage.fxl;
import defpackage.fya;
import defpackage.gah;
import defpackage.lrd;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qqp;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SportBannerLayout extends BaseLifeCycleLinearLayout implements View.OnClickListener, ResourceBriefInfoOwnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected HealthDotsPageIndicator f8414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ResourceBriefInfo f8415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected HealthViewPager f8416c;
    protected HealthViewPager d;
    protected Context e;
    private int f;
    private int[] g;
    protected FrameLayout h;
    private HealthSubHeader i;
    private GridTemplate j;
    private int k;
    private boolean l;
    private boolean m;
    private int n;
    private boolean o;
    private double p;
    private int q;
    private HealthScrollView r;
    private List<SingleGridContent> s;
    private Pair<Integer, Integer> t;
    private gah v;
    private boolean w;
    private long x;
    private gah y;

    protected void d() {
    }

    protected boolean getIsForceWholeScreen() {
        return false;
    }

    @Override // com.huawei.health.marketing.views.BaseLifeCycleLinearLayout, com.huawei.health.knit.data.IKnitLifeCycle
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    public SportBannerLayout(Context context) {
        super(context);
        this.f = 4000;
        this.t = BaseActivity.getSafeRegionWidth();
        this.s = new ArrayList(10);
        this.w = true;
        this.p = 0.786d;
        this.l = false;
        this.k = -1;
        this.e = context;
    }

    public void setParentViewGroup(ViewGroup viewGroup) {
        if (viewGroup == null) {
            LogUtil.j("SportBannerLayout", "parentViewGroup is null");
            return;
        }
        int iA = fxk.a(this.e, this.q) - viewGroup.getMeasuredWidth();
        this.n = iA;
        LogUtil.a("SportBannerLayout", "mLeftMargin =", Integer.valueOf(iA));
        gah gahVar = this.v;
        if (gahVar != null) {
            gahVar.c(this.n);
        }
        gah gahVar2 = this.y;
        if (gahVar2 != null) {
            gahVar2.c(this.n);
        }
        if (this.g != null) {
            c();
        }
    }

    private void i() {
        if (!(getParent() instanceof ViewGroup) || this.r != null) {
            return;
        }
        ViewParent parent = getParent();
        while (true) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup instanceof HealthScrollView) {
                this.r = (HealthScrollView) viewGroup;
                p();
                q();
                return;
            } else if (!(viewGroup.getParent() instanceof ViewGroup)) {
                return;
            } else {
                parent = viewGroup.getParent();
            }
        }
    }

    private void p() {
        HealthScrollView healthScrollView = this.r;
        if (healthScrollView == null) {
            LogUtil.a("SportBannerLayout", "mScrollView is null");
        } else {
            healthScrollView.c(new HealthScrollView.ScrollChangeToBoundaryListener() { // from class: com.huawei.health.marketing.views.SportBannerLayout.2
                @Override // com.huawei.ui.commonui.scrollview.HealthScrollView.ScrollChangeToBoundaryListener
                public void onScrollToChangeAlpha(float f) {
                }

                @Override // com.huawei.ui.commonui.scrollview.HealthScrollView.ScrollChangeToBoundaryListener
                public void onScrolledToBottom() {
                }

                @Override // com.huawei.ui.commonui.scrollview.HealthScrollView.ScrollChangeToBoundaryListener
                public void onScrolledTop() {
                }

                @Override // com.huawei.ui.commonui.scrollview.HealthScrollView.ScrollChangeToBoundaryListener
                public void onScrollStateChange(int i) {
                    if (i == 0) {
                        SportBannerLayout.this.a();
                    } else if ((i == 2 || i == 1) && SportBannerLayout.this.w) {
                        SportBannerLayout.this.t();
                    }
                }
            });
        }
    }

    private void q() {
        HealthScrollView healthScrollView = this.r;
        if (healthScrollView == null) {
            LogUtil.a("SportBannerLayout", "mScrollView is null");
        } else {
            healthScrollView.setScrollChangeOtherListener(new HealthScrollView.ScrollChangeOtherListener() { // from class: com.huawei.health.marketing.views.SportBannerLayout.5
                @Override // com.huawei.ui.commonui.scrollview.HealthScrollView.ScrollChangeOtherListener
                public void scrollChangeOtherListener() {
                    SportBannerLayout sportBannerLayout = SportBannerLayout.this;
                    sportBannerLayout.w = ScrollUtil.b(sportBannerLayout.r, SportBannerLayout.this);
                    LogUtil.a("SportBannerLayout", "registerScrollListener isVisibleArea = ", Boolean.valueOf(SportBannerLayout.this.w));
                    if (SportBannerLayout.this.w && !SportBannerLayout.this.o) {
                        SportBannerLayout.this.t();
                    }
                    if (SportBannerLayout.this.w || !SportBannerLayout.this.o) {
                        return;
                    }
                    SportBannerLayout.this.a();
                }
            });
        }
    }

    @Override // com.huawei.health.marketing.views.BaseLifeCycleLinearLayout, com.huawei.health.knit.data.IKnitLifeCycle
    public void onDestroy() {
        super.onDestroy();
    }

    public void b(int i, ResourceBriefInfo resourceBriefInfo, BaseTemplate baseTemplate) {
        this.q = i;
        this.f8415b = resourceBriefInfo;
        if (baseTemplate instanceof GridTemplate) {
            GridTemplate gridTemplate = (GridTemplate) baseTemplate;
            this.j = gridTemplate;
            this.s = gridTemplate.getGridContents();
        }
        if (njy.e(this.s)) {
            LogUtil.j("SportBannerLayout", "List isEmpty");
        } else {
            LogUtil.a("SportBannerLayout", "List size:", Integer.valueOf(this.s.size()));
            h();
        }
    }

    private void h() {
        View viewInflate = LayoutInflater.from(BaseApplication.getContext()).inflate(R.layout.common_sport_banner_marketing, this);
        this.h = (FrameLayout) viewInflate.findViewById(R.id.view_sport_banner_root);
        this.d = (HealthViewPager) viewInflate.findViewById(R.id.view_pager_sport_banner);
        this.f8416c = (HealthViewPager) viewInflate.findViewById(R.id.view_pager_sport_banner_cant_loop);
        this.f8414a = (HealthDotsPageIndicator) viewInflate.findViewById(R.id.indicator);
        this.i = (HealthSubHeader) viewInflate.findViewById(R.id.marketing_banner_sub_header);
        f();
        if (this.f8415b.getContentType() == 63) {
            ViewGroup.LayoutParams layoutParams = this.f8414a.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.setMarginEnd(getResources().getDimensionPixelSize(R.dimen.cardMarginEnd));
                layoutParams2.gravity = qrs.af(BaseApplication.getActivity()) ? 81 : 8388693;
                this.f8414a.setLayoutParams(layoutParams2);
            }
        }
        if ((this.f8415b.getContentType() == 52 && this.j.getImgShowSize() == 99) || this.f8415b.getContentType() == 98) {
            LogUtil.a("SportBannerLayout", "mResourceBriefInfo.getContentType() is ", Integer.valueOf(this.f8415b.getContentType()), " initBannerImgProportion");
            j();
        }
        c();
        d();
        qsp.a(this.h, new b(this));
    }

    private void f() {
        if (this.f8415b.getContentType() == 98) {
            this.i.setVisibility(8);
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        boolean zIsNameVisibility = this.j.isNameVisibility();
        LogUtil.a("SportBannerLayout", "initHeader isNameVisible:", Boolean.valueOf(zIsNameVisibility));
        if (!zIsNameVisibility) {
            this.i.setVisibility(8);
            l();
            return;
        }
        String name = this.j.getName();
        LogUtil.a("SportBannerLayout", "initHeader subHeaderName:", name);
        if (TextUtils.isEmpty(name) || TextUtils.isEmpty(name.trim())) {
            this.i.setVisibility(4);
            if (layoutParams2 != null) {
                layoutParams2.height = this.e.getResources().getDimensionPixelSize(R.dimen.emui_card_device_12dp);
                return;
            }
            return;
        }
        if (!fxk.a(this.q)) {
            this.i.setPadding(((Integer) this.t.first).intValue(), 0, ((Integer) this.t.second).intValue(), 0);
        }
        this.i.setVisibility(0);
        this.i.setHeadTitleText(name);
        this.i.setSubHeaderBackgroundColor(0);
        r();
    }

    private void r() {
        if (this.i == null) {
            return;
        }
        final String linkValue = this.j.getLinkValue();
        LogUtil.a("SportBannerLayout", "showSubHeaderMore moreUrl:", linkValue);
        if (TextUtils.isEmpty(linkValue)) {
            this.i.setMoreLayoutVisibility(8);
            return;
        }
        this.i.setMoreLayoutVisibility(0);
        this.i.setMoreViewClickListener(new View.OnClickListener() { // from class: gak
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34819b.e(linkValue, view);
            }
        });
        if (!TextUtils.isEmpty(this.j.getMoreMenuTitle())) {
            this.i.setMoreTextVisibility(0);
            this.i.setMoreTextMaxLines(2);
            this.i.setMoreTextAlignment(6);
            this.i.setMoreText(this.j.getMoreMenuTitle());
            return;
        }
        this.i.setMoreTextVisibility(4);
    }

    public /* synthetic */ void e(final String str, View view) {
        if (TextUtils.isEmpty(str) || qrs.r()) {
            return;
        }
        if (!fxk.b(str)) {
            b(str);
        } else {
            LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: gae
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.d.a(str, i, obj);
                }
            }, AnalyticsValue.MARKETING_RESOURCE.value());
        }
    }

    public /* synthetic */ void a(String str, int i, Object obj) {
        if (i == 0) {
            b(str);
        } else {
            LogUtil.j("SportBannerLayout", "onClick errorCode = ", Integer.valueOf(i));
        }
    }

    private void b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SportBannerLayout", "goToDetail linkValue is empty ");
            return;
        }
        HashMap map = new HashMap();
        map.put("moreEntryName", this.j.getMoreMenuTitle());
        MarketingBiUtils.a(3, this.q, this.f8415b, map);
        LogUtil.a("SportBannerLayout", "more linkValue: ", str);
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
        if (marketRouterApi != null) {
            marketRouterApi.router(str);
        }
    }

    private void l() {
        if (fxk.b(this.q)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = this.e.getResources().getDimensionPixelSize(R.dimen.health_common_12dp);
            this.h.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: gab
            @Override // java.lang.Runnable
            public final void run() {
                this.d.b();
            }
        });
    }

    public /* synthetic */ void b() {
        if (!njy.e(this.s) && this.s.get(0) != null && !TextUtils.isEmpty(this.s.get(0).getPicture())) {
            String picture = this.s.get(0).getPicture();
            if (this.f8415b.getContentType() == 98 && qrs.af(BaseApplication.getActivity())) {
                LogUtil.a("SportBannerLayout", "TEMPLATE_MEMBER_TOP_BANNER and isWidescreen, get tahitiPicture");
                picture = this.s.get(0).getTahitiPicture();
            }
            Drawable drawableD = qqf.d(BaseApplication.getContext(), picture, qqf.d);
            if (drawableD != null) {
                this.g = new int[]{drawableD.getIntrinsicWidth(), 0};
                this.g[1] = drawableD.getIntrinsicHeight();
                int[] iArr = this.g;
                int i = iArr[1];
                int i2 = iArr[0];
                this.p = ((double) i) / ((double) i2);
                LogUtil.a("SportBannerLayout", "handleImageView drawable.width=", Integer.valueOf(i2), " height=", Integer.valueOf(i));
            } else {
                LogUtil.a("SportBannerLayout", "handleImageView drawable is null");
            }
        }
        HandlerExecutor.d(new Runnable() { // from class: gaf
            @Override // java.lang.Runnable
            public final void run() {
                this.e.c();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c() {
        HealthViewPager healthViewPager = this.d;
        if (healthViewPager == null || this.f8416c == null) {
            LogUtil.a("SportBannerLayout", "resetLayout mNormalViewPager is ", healthViewPager, " mLoopViewPager is ", this.f8416c, " so return!");
        } else {
            d(this.s.size());
            t();
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(final Configuration configuration) {
        fxk.d(configuration.orientation);
        super.onConfigurationChanged(configuration);
        HandlerExecutor.c(new Runnable() { // from class: com.huawei.health.marketing.views.SportBannerLayout.4
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("SportBannerLayout", "SportBannerLayout,", Integer.valueOf(configuration.orientation));
                ViewGroup.LayoutParams layoutParams = SportBannerLayout.this.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = -1;
                    SportBannerLayout.this.setLayoutParams(layoutParams);
                }
                if (SportBannerLayout.this.f8415b != null && SportBannerLayout.this.f8415b.getContentType() == 98) {
                    SportBannerLayout.this.j();
                } else {
                    SportBannerLayout.this.c();
                }
            }
        }, 200L);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            setLayoutParams(layoutParams);
        }
        i();
    }

    private void o() {
        a(0, 8, 0);
        gah gahVar = new gah(this.d, this.e);
        this.y = gahVar;
        gahVar.a(this.q, this.j, this.f8415b, true);
        this.y.a(this.p);
        this.d.setOffscreenPageLimit(this.s.size());
        this.d.addOnPageChangeListener(new a(this));
        this.y.c(this.n);
        this.y.e(new View.OnClickListener() { // from class: gac
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34804c.e(view);
            }
        });
        this.d.setAdapter(this.y);
        this.f8414a.setViewPager(this.d);
        a(this.d);
        n();
        this.d.setOnTouchListener(new View.OnTouchListener() { // from class: com.huawei.health.marketing.views.SportBannerLayout.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                SportBannerLayout.this.e(motionEvent);
                return false;
            }
        });
    }

    public /* synthetic */ void e(View view) {
        g();
    }

    public void setNeedExtraHeight(boolean z) {
        this.l = z;
    }

    public boolean getNeedExtraHeight() {
        return this.l;
    }

    public void setExtraCardHeight(int i) {
        this.k = i;
    }

    public int getExtraCardHeight() {
        return this.k;
    }

    static class a implements HealthViewPager.OnPageChangeListener {
        private final WeakReference<SportBannerLayout> e;

        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        public a(SportBannerLayout sportBannerLayout) {
            this.e = new WeakReference<>(sportBannerLayout);
        }

        @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            SingleGridContent singleGridContent;
            LogUtil.a("SportBannerLayout", "onPageSelected: ", Integer.valueOf(i));
            SportBannerLayout sportBannerLayout = this.e.get();
            if (sportBannerLayout == null) {
                LogUtil.j("SportBannerLayout", "layout activity is null");
                return;
            }
            boolean zB = fxk.b(sportBannerLayout);
            boolean zE = fxk.e(sportBannerLayout, i);
            LogUtil.a("SportBannerLayout", "isRectVisibleToUser: ", Boolean.valueOf(zB), " isWindowVisibleToUser: ", Boolean.valueOf(zE));
            if (zB && zE && sportBannerLayout.y != null && njy.c(sportBannerLayout.s, i) && (singleGridContent = (SingleGridContent) sportBannerLayout.s.get(i)) != null) {
                sportBannerLayout.y.e(1, singleGridContent, i);
            }
        }
    }

    private void k() {
        a(8, 0, 8);
        gah gahVar = new gah(this.f8416c, this.e);
        this.v = gahVar;
        gahVar.a(this.q, this.j, this.f8415b, false);
        this.v.a(this.p);
        this.v.c(this.n);
        this.v.e(new View.OnClickListener() { // from class: gad
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34805b.a(view);
            }
        });
        this.f8416c.setAdapter(this.v);
        a(this.f8416c);
        n();
        this.f8416c.setOnTouchListener(new View.OnTouchListener() { // from class: com.huawei.health.marketing.views.SportBannerLayout.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                SportBannerLayout.this.e(motionEvent);
                return false;
            }
        });
    }

    public /* synthetic */ void a(View view) {
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.v == null || njy.e(this.s)) {
            return;
        }
        int i = -1;
        for (SingleGridContent singleGridContent : this.s) {
            if (singleGridContent != null) {
                i++;
                this.v.e(1, singleGridContent, i);
            }
        }
    }

    private void a(int i, int i2, int i3) {
        this.d.setVisibility(i);
        this.f8416c.setVisibility(i2);
        this.f8414a.setVisibility(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        List<SingleGridContent> list = this.s;
        if (list == null || this.f8414a == null) {
            return;
        }
        if (list.size() > 1) {
            if (qrs.af(BaseApplication.getActivity()) && this.s.size() <= 2) {
                this.o = false;
                this.f8414a.d();
                return;
            } else {
                s();
                return;
            }
        }
        this.o = false;
        this.f8414a.d();
    }

    private void s() {
        if (lrd.d()) {
            this.o = false;
            this.f8414a.d();
        } else {
            this.o = true;
            this.f8414a.b(this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 3 || action == 4) {
            t();
        } else if (action == 0) {
            a();
        } else {
            LogUtil.a("SportBannerLayout", "not need deal");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        HealthDotsPageIndicator healthDotsPageIndicator = this.f8414a;
        if (healthDotsPageIndicator != null) {
            this.o = false;
            healthDotsPageIndicator.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ce  */
    private void a(HealthViewPager healthViewPager) {
        int dimension;
        int dimension2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (njy.e(this.s)) {
            LogUtil.j("SportBannerLayout", "resizeViewPager() mADImageShowList is empty.");
            return;
        }
        int iA = fxk.a(this.e, this.q) - this.n;
        try {
            dimension = (int) this.e.getResources().getDimension(R.dimen.defaultPaddingStart);
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("SportBannerLayout", "resizeViewPager() dimen id is not found.");
            dimension = 0;
        }
        if (qrs.af(BaseApplication.getActivity())) {
            int iC = fya.c(this.e, this.n);
            dimension2 = qqp.b(this.e);
            int size = this.s.size();
            if (size == 1) {
                i5 = ((iA - (iC * 2)) - dimension2) / 2;
                healthViewPager.setIsScroll(false);
                i6 = (iA - iC) - i5;
                dimension2 = 0;
            } else {
                if (size == 2) {
                    i5 = ((iA - (iC * 2)) - dimension2) / 2;
                    healthViewPager.setIsScroll(false);
                    i6 = (iA - iC) - i5;
                } else if (size >= 3) {
                    dimension = (iA - iC) / 2;
                    healthViewPager.setIsScroll(true);
                } else {
                    LogUtil.j("SportBannerLayout", "resizeViewPager() imageListSize <= 0.");
                    i = 0;
                    dimension = 0;
                    dimension2 = 0;
                }
                LogUtil.a("SportBannerLayout", "resizeViewPager() pageMargin = ", Integer.valueOf(dimension2), ", startPadding = ", Integer.valueOf(dimension), ", endPadding = ", Integer.valueOf(i));
                if (getIsForceWholeScreen()) {
                    i4 = 0;
                    i3 = 0;
                    i2 = 0;
                } else {
                    i2 = i;
                    i3 = dimension;
                    i4 = dimension2;
                }
                dkf.b(healthViewPager, i4, "SportBannerLayout", i3, i2, 0);
            }
            i = i6;
            dimension = i5;
            LogUtil.a("SportBannerLayout", "resizeViewPager() pageMargin = ", Integer.valueOf(dimension2), ", startPadding = ", Integer.valueOf(dimension), ", endPadding = ", Integer.valueOf(i));
            if (getIsForceWholeScreen()) {
                i4 = 0;
                i3 = 0;
                i2 = 0;
            } else {
                i2 = i;
                i3 = dimension;
                i4 = dimension2;
            }
            dkf.b(healthViewPager, i4, "SportBannerLayout", i3, i2, 0);
        }
        dimension2 = (int) this.e.getResources().getDimension(R.dimen.defaultPaddingStart);
        healthViewPager.setIsScroll(this.s.size() > 1);
        i = dimension;
        LogUtil.a("SportBannerLayout", "resizeViewPager() pageMargin = ", Integer.valueOf(dimension2), ", startPadding = ", Integer.valueOf(dimension), ", endPadding = ", Integer.valueOf(i));
        if (getIsForceWholeScreen()) {
            i4 = 0;
            i3 = 0;
            i2 = 0;
        } else {
            i2 = i;
            i3 = dimension;
            i4 = dimension2;
        }
        dkf.b(healthViewPager, i4, "SportBannerLayout", i3, i2, 0);
    }

    private void n() {
        int iC;
        int i;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int contentType = this.f8415b.getContentType();
        if (contentType != 51) {
            if (contentType == 52) {
                int iC2 = fya.c(this.e, this.n);
                if (this.j.getImgShowSize() == 99 && (iArr = this.g) != null && iArr.length == 2 && (i5 = iArr[0]) != 0) {
                    i4 = (iArr[1] * iC2) / i5;
                } else {
                    i4 = (iC2 * 8) / 27;
                }
                LogUtil.a("SportBannerLayout", "resizeRootLayout width:", Integer.valueOf(iC2), "  height:", Integer.valueOf(i4));
                iC = i4;
            } else if (contentType == 98) {
                int i6 = this.e.getResources().getDisplayMetrics().widthPixels;
                int[] iArr2 = this.g;
                if (iArr2 != null && iArr2.length == 2 && (i3 = iArr2[0]) != 0) {
                    i = (i6 * iArr2[1]) / i3;
                } else {
                    i = (i6 * 708) / 1080;
                }
                int i7 = this.k;
                if (i7 == -1) {
                    i2 = 26;
                } else {
                    double d = i;
                    double d2 = ((double) i7) + (0.656d * d);
                    i2 = d2 > d ? ((int) d2) - i : 0;
                }
                iC = i + (this.l ? i2 : 0);
                LogUtil.a("SportBannerLayout", "resizeRootLayout extraHeight:", Integer.valueOf(i2), "  height:", Integer.valueOf(iC));
            } else {
                iC = (fya.c(this.e, this.n) * 9) / 16;
            }
        } else if (this.f8414a.getVisibility() == 0) {
            iC = this.e.getResources().getDimensionPixelSize(R.dimen.health_common_98dp);
        } else {
            iC = this.e.getResources().getDimensionPixelSize(R.dimen.health_common_78dp);
        }
        ViewGroup.LayoutParams layoutParams = this.h.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.height = iC;
            this.h.setLayoutParams(layoutParams2);
        }
    }

    private void d(int i) {
        if (i == 1) {
            k();
            return;
        }
        if (i == 2) {
            if (qrs.af(BaseApplication.getActivity())) {
                k();
                return;
            } else {
                o();
                return;
            }
        }
        if (i >= 3) {
            o();
        } else {
            LogUtil.d("SportBannerLayout", "mAdImageShowList size is illegal");
        }
    }

    private void g() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ReleaseLogUtil.d("R_SportBannerLayout", "setResourceCloseRecord. closeTime = ", Long.valueOf(jCurrentTimeMillis), "; resourceName = ", this.f8415b.getResourceName(), "; contentType = ", Integer.valueOf(this.f8415b.getContentType()));
        fxl.b(this.q, 1, this.f8415b);
        MarketingBiUtils.b(this.q, this.f8415b, this.x);
        setVisibility(8);
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public boolean isOwnedByBriefInfo(ResourceBriefInfo resourceBriefInfo) {
        return (resourceBriefInfo == null || this.f8415b == null || !resourceBriefInfo.getResourceId().equals(this.f8415b.getResourceId())) ? false : true;
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public int getResourceBriefPriority() {
        ResourceBriefInfo resourceBriefInfo = this.f8415b;
        if (resourceBriefInfo != null) {
            return resourceBriefInfo.getPriority();
        }
        return 0;
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public int getResourcePositionId() {
        return this.q;
    }

    @Override // com.huawei.health.marketing.views.BaseLifeCycleLinearLayout, com.huawei.health.knit.data.IKnitLifeCycle
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.m = z;
        LogUtil.a("SportBannerLayout", "setUserVisibleHint: ", Boolean.valueOf(z));
        if (z) {
            t();
        } else {
            a();
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        LogUtil.a("SportBannerLayout", "onWindowVisibilityChanged: ", Integer.valueOf(i));
        if (i == 0) {
            if (this.m) {
                t();
                return;
            }
            return;
        }
        a();
    }

    /* JADX INFO: loaded from: classes29.dex */
    static class b implements ViewTreeObserver.OnGlobalLayoutListener {
        private final WeakReference<SportBannerLayout> e;

        public b(SportBannerLayout sportBannerLayout) {
            this.e = new WeakReference<>(sportBannerLayout);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            SportBannerLayout sportBannerLayout = this.e.get();
            if (sportBannerLayout != null && MarketingBiUtils.c(sportBannerLayout.h)) {
                LogUtil.a("SportBannerLayout", "ViewTreeObserverListener sportBanner visible ");
                if (sportBannerLayout.f8416c.getVisibility() == 0 && sportBannerLayout.v != null) {
                    sportBannerLayout.m();
                } else if (sportBannerLayout.d.getVisibility() == 0 && sportBannerLayout.y != null) {
                    SingleGridContent singleGridContent = (SingleGridContent) sportBannerLayout.s.get(0);
                    if (singleGridContent != null) {
                        sportBannerLayout.y.e(1, singleGridContent, 0);
                    }
                    sportBannerLayout.x = System.currentTimeMillis();
                } else {
                    LogUtil.j("SportBannerLayout", "ViewTreeObserverListener can not report bi");
                }
                qsp.b(sportBannerLayout.h, this);
            }
        }
    }
}
