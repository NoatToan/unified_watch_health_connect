package com.huawei.health.marketing.views;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.templates.BaseTemplate;
import com.huawei.health.marketing.datatype.templates.MultiFunctionTemplate;
import com.huawei.health.marketing.datatype.templates.SingleFunctionGridContent;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.fxk;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qqp;
import defpackage.qqs;
import defpackage.qrs;
import health.compact.a.Services;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class MultiFunctionLayout extends BaseLifeCycleLinearLayout implements ResourceBriefInfoOwnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthSubHeader f8370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ResourceBriefInfo f8371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8372c;
    private Context d;
    private List<SingleFunctionGridContent> e;
    private HealthDotsPageIndicator f;
    private LinearLayout g;
    private boolean h;
    private RelativeLayout i;
    private MultiFunctionPagerAdapter j;
    private HealthViewPager k;
    private long l;
    private final Pair<Integer, Integer> m;
    private MultiFunctionTemplate n;
    private int o;

    public MultiFunctionLayout(Context context) {
        super(context);
        this.o = 0;
        this.h = false;
        this.m = BaseActivity.getSafeRegionWidth();
        this.d = context;
    }

    public void d(int i, ResourceBriefInfo resourceBriefInfo, BaseTemplate baseTemplate) {
        LogUtil.a("MultiFunctionLayout", "initData");
        this.f8371b = resourceBriefInfo;
        this.o = i;
        this.n = (MultiFunctionTemplate) baseTemplate;
        LogUtil.a("MultiFunctionLayout", "template:", baseTemplate.toString());
        if (resourceBriefInfo != null) {
            this.f8372c = resourceBriefInfo.getContentType();
        }
        e();
    }

    private void e() {
        List<SingleFunctionGridContent> gridContents = this.n.getGridContents();
        this.e = gridContents;
        if (njy.e(gridContents)) {
            setVisibility(8);
            LogUtil.j("MultiFunctionLayout", "dataShow() entryContentList is empty.");
            return;
        }
        this.l = System.currentTimeMillis();
        View viewInflate = LayoutInflater.from(BaseApplication.getContext()).inflate(R.layout.layout_multi_function_with_slider, this);
        this.g = (LinearLayout) viewInflate.findViewById(R.id.multi_function_linear_layout);
        this.k = (HealthViewPager) viewInflate.findViewById(R.id.multi_function_view_pager);
        this.f = (HealthDotsPageIndicator) viewInflate.findViewById(R.id.multi_function_indicator);
        this.i = (RelativeLayout) viewInflate.findViewById(R.id.multi_function_relative_layout);
        this.f8370a = (HealthSubHeader) viewInflate.findViewById(R.id.multi_function_sub_header);
        MultiFunctionPagerAdapter multiFunctionPagerAdapter = new MultiFunctionPagerAdapter(this.d);
        this.j = multiFunctionPagerAdapter;
        multiFunctionPagerAdapter.a(this.e, this.f8371b, this.o, this.f8372c);
        this.k.setAdapter(this.j);
        this.f.setViewPager(this.k);
        this.f.setOnPageChangeListener(new HealthViewPager.OnPageChangeListener() { // from class: com.huawei.health.marketing.views.MultiFunctionLayout.2
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                LogUtil.a("MultiFunctionLayout", "onPageSelected() position = ", Integer.valueOf(i));
            }
        });
        if (this.e.size() <= 8) {
            ((LinearLayout) viewInflate.findViewById(R.id.multi_function_indicator_layout)).setVisibility(8);
            this.k.setIsScroll(false);
        }
        this.h = qrs.af(BaseApplication.getContext());
        this.f8370a.setVisibility(4);
        LinearLayout.LayoutParams subHeaderParams = getSubHeaderParams();
        if (subHeaderParams != null) {
            subHeaderParams.height = this.d.getResources().getDimensionPixelSize(R.dimen.emui_card_device_12dp);
        }
        b();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        fxk.d(configuration.orientation);
        this.h = qrs.af(BaseApplication.getContext());
        super.onConfigurationChanged(configuration);
        this.j.b(this.h);
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public boolean isOwnedByBriefInfo(ResourceBriefInfo resourceBriefInfo) {
        return (resourceBriefInfo == null || this.f8371b == null || !resourceBriefInfo.getResourceId().equals(this.f8371b.getResourceId())) ? false : true;
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public int getResourceBriefPriority() {
        ResourceBriefInfo resourceBriefInfo = this.f8371b;
        if (resourceBriefInfo != null) {
            return resourceBriefInfo.getPriority();
        }
        return 0;
    }

    @Override // com.huawei.health.marketing.views.ResourceBriefInfoOwnable
    public int getResourcePositionId() {
        return this.o;
    }

    private LinearLayout.LayoutParams getSubHeaderParams() {
        ViewGroup.LayoutParams layoutParams = this.f8370a.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            int i = layoutParams2.leftMargin;
            int i2 = layoutParams2.rightMargin;
            if (fxk.a(this.o)) {
                layoutParams2.leftMargin = i;
                layoutParams2.rightMargin = i2;
                return layoutParams2;
            }
            layoutParams2.leftMargin = i + ((Integer) this.m.first).intValue();
            layoutParams2.rightMargin = i2 + ((Integer) this.m.second).intValue();
        }
        return layoutParams2;
    }

    private void b() {
        d();
        c();
        this.k.setIsAutoWidthAndHeight(true);
        setRecycleViewClickListener(this.n.getLinkValue());
        setLayoutParam();
        RequestOptions requestOptionsCenterCrop = RequestOptions.bitmapTransform(new RoundedCorners((int) this.d.getResources().getDimension(R.dimen.defaultCornerRadiusL))).centerCrop();
        CustomTarget<Drawable> customTarget = new CustomTarget<Drawable>() { // from class: com.huawei.health.marketing.views.MultiFunctionLayout.5
            @Override // com.bumptech.glide.request.target.Target
            public void onLoadCleared(Drawable drawable) {
            }

            @Override // com.bumptech.glide.request.target.Target
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onResourceReady(Drawable drawable, Transition<? super Drawable> transition) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) MultiFunctionLayout.this.i.getLayoutParams();
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                layoutParams.height = (layoutParams.width * bitmapDrawable.getBitmap().getHeight()) / bitmapDrawable.getBitmap().getWidth();
                MultiFunctionLayout.this.i.setLayoutParams(layoutParams);
                MultiFunctionLayout.this.i.setBackground(drawable);
            }
        };
        if (qqs.e(this.d)) {
            qqf.a(this.n.getDarkBackgroundPicture(), requestOptionsCenterCrop, customTarget);
        } else {
            qqf.a(this.n.getPicture(), requestOptionsCenterCrop, customTarget);
        }
    }

    private void d() {
        ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int dimensionPixelSize = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_12dp);
            int dimensionPixelSize2 = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_12dp);
            int iIntValue = fxk.a(this.o) ? 0 : ((Integer) this.m.first).intValue();
            int iIntValue2 = fxk.a(this.o) ? 0 : ((Integer) this.m.second).intValue();
            layoutParams2.setMarginStart(dimensionPixelSize + iIntValue);
            layoutParams2.setMarginEnd(dimensionPixelSize2 + iIntValue2);
            this.i.setLayoutParams(layoutParams2);
        }
    }

    private void c() {
        int iA;
        ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            int dimensionPixelSize = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
            int dimensionPixelSize2 = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd);
            if (!fxk.a(this.o)) {
                dimensionPixelSize += ((Integer) this.m.first).intValue();
                dimensionPixelSize2 += ((Integer) this.m.second).intValue();
            }
            layoutParams2.addRule(14);
            if (this.e.size() <= 8) {
                iA = qqp.a(this.d, 16.0f);
            } else {
                iA = qqp.a(this.d, 8.0f);
            }
            layoutParams2.setMargins(dimensionPixelSize, qqp.a(this.d, 50.0f), dimensionPixelSize2, iA);
            this.k.setLayoutParams(layoutParams2);
        }
    }

    private void setRecycleViewClickListener(final String str) {
        this.i.setOnClickListener(new View.OnClickListener() { // from class: fzu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.e(str, view);
            }
        });
    }

    public /* synthetic */ void e(String str, View view) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("MultiFunctionLayout", "goToDetail linkValue is empty ");
            return;
        }
        a();
        LogUtil.a("MultiFunctionLayout", "more linkValue: ", str);
        MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("OperationBundle", MarketRouterApi.class);
        if (marketRouterApi == null || str == null) {
            return;
        }
        marketRouterApi.router(str);
    }

    private void a() {
        HashMap map = new HashMap(16);
        map.put("resourcePositionId", Integer.valueOf(this.o));
        map.put("resourceId", this.f8371b.getResourceId());
        map.put("resourceName", this.f8371b.getResourceName());
        map.put("event", 3);
        map.put("pullOrder", 1);
        map.put("algId", "");
        map.put("moreEntryName", "");
        map.put("smartRecommend", Boolean.valueOf(this.f8371b.getSmartRecommend()));
        map.put("durationTime", Long.valueOf(System.currentTimeMillis() - this.l));
        this.l = System.currentTimeMillis();
        lmf.d().c(this.d, AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
    }

    public void setLayoutParam() {
        LogUtil.a("MultiFunctionLayout", "setLayoutParam");
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.g.getLayoutParams();
        layoutParams.width = -2;
        this.g.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.k.getLayoutParams();
        layoutParams2.width = -2;
        this.k.setLayoutParams(layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.i.getLayoutParams();
        layoutParams3.width = -2;
        this.i.setLayoutParams(layoutParams3);
    }

    @Override // com.huawei.health.marketing.views.BaseLifeCycleLinearLayout, com.huawei.health.knit.data.IKnitLifeCycle
    public void onResume() {
        super.onResume();
        LogUtil.a("MultiFunctionLayout", BaseDialog.LIFE_CYCLE_ON_RESUME);
    }
}
