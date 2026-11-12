package com.huawei.health.marketing.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.datatype.CycleRuleBase;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.datatype.TimePeriod;
import com.huawei.health.marketing.datatype.templates.BaseTemplate;
import com.huawei.health.marketing.datatype.templates.HomePageRecommendTemplate;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.servicesui.R;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.activetips.ActiveTipsTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import defpackage.fxk;
import defpackage.fxl;
import defpackage.lsl;
import defpackage.lua;
import defpackage.qqf;
import defpackage.qqz;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LogUtil;
import health.compact.a.Services;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class HomePageRecommendLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SingleGridContent f8342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f8343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ResourceBriefInfo f8344c;
    private int d;
    private IBaseResponseCallback e;
    private long f;
    private HealthImageView g;
    private HealthImageView h;
    private HomePageRecommendTemplate i;
    private int j;
    private ActiveTipsTextView n;

    public HomePageRecommendLayout(Context context) {
        super(context);
        this.j = 0;
        this.f8343b = BaseApplication.getContext();
    }

    public String getRecommendCard() {
        SingleGridContent singleGridContent = this.f8342a;
        if (singleGridContent != null && !TextUtils.isEmpty(singleGridContent.getRecommendCard())) {
            return this.f8342a.getRecommendCard();
        }
        HomePageRecommendTemplate homePageRecommendTemplate = this.i;
        if (homePageRecommendTemplate != null) {
            return homePageRecommendTemplate.getRecommendCard();
        }
        LogUtil.e("HomePageRecommendLayout", "getRecommendCard, recommendCard is empty");
        return "";
    }

    public void setCardPosition(int i) {
        this.d = i;
    }

    public SingleGridContent getGridContent() {
        return this.f8342a;
    }

    public void setOnDismissListener(IBaseResponseCallback iBaseResponseCallback) {
        this.e = iBaseResponseCallback;
    }

    public void d(int i, ResourceBriefInfo resourceBriefInfo, BaseTemplate baseTemplate) {
        if (!(baseTemplate instanceof HomePageRecommendTemplate)) {
            LogUtil.d("HomePageRecommendLayout", "initData failed, template is not HomePageRecommendTemplate");
            setVisibility(8);
            return;
        }
        LogUtil.b("HomePageRecommendLayout", "initData, template name:" + getRecommendCard());
        this.f8344c = resourceBriefInfo;
        this.j = i;
        HomePageRecommendTemplate homePageRecommendTemplate = (HomePageRecommendTemplate) baseTemplate;
        this.i = homePageRecommendTemplate;
        if (homePageRecommendTemplate.getGridContents() == null || this.i.getGridContents().get(0) == null) {
            LogUtil.e("HomePageRecommendLayout", "gridContent is null, make banner invisible");
            setVisibility(8);
        } else {
            SingleGridContent singleGridContent = this.i.getGridContents().get(0);
            this.f8342a = singleGridContent;
            b(i, resourceBriefInfo, baseTemplate, singleGridContent);
        }
    }

    public void b(int i, ResourceBriefInfo resourceBriefInfo, BaseTemplate baseTemplate, SingleGridContent singleGridContent) {
        this.f8344c = resourceBriefInfo;
        this.j = i;
        this.i = (HomePageRecommendTemplate) baseTemplate;
        this.f8342a = singleGridContent;
        long jD = lua.d(Integer.toString(PrebakedEffectId.RT_ICE), Integer.toString(i).concat(getRecommendCard()), 0L);
        if (System.currentTimeMillis() < jD) {
            LogUtil.b("HomePageRecommendLayout", "still in bannerExpireTime: " + jD);
            setVisibility(8);
            return;
        }
        e();
    }

    private void e() {
        final View viewInflate = LayoutInflater.from(this.f8343b).inflate(R.layout.layout_home_page_recommend, this);
        this.g = (HealthImageView) viewInflate.findViewById(R.id.theme_icon);
        this.h = (HealthImageView) viewInflate.findViewById(R.id.right_arrow);
        ActiveTipsTextView activeTipsTextView = (ActiveTipsTextView) viewInflate.findViewById(R.id.theme);
        this.n = activeTipsTextView;
        activeTipsTextView.setText(this.f8342a.getTheme());
        qqf.e(this.g, this.f8342a.getPicture(), this.f8343b.getResources().getDimensionPixelOffset(R.dimen.health_common_2dp), 0, R.drawable.default_blank);
        String backgroundColor = this.f8342a.getBackgroundColor();
        int color = TextUtils.isEmpty(backgroundColor) ? ContextCompat.getColor(this.f8343b, R.color.emui_accent_translucent) : Color.parseColor(backgroundColor);
        this.n.setTextColor(color);
        d(viewInflate.findViewById(R.id.bg_layout), color);
        d(color);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: fzm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34794c.a(viewInflate, view);
            }
        });
        this.n.setAutoFocus(this.i.isWalkingLanternSwitch());
        e(viewInflate, this.f8342a);
    }

    public /* synthetic */ void a(final View view, View view2) {
        if (TextUtils.isEmpty(this.f8342a.getLinkValue())) {
            LogUtil.e("HomePageRecommendLayout", "home page recommend item have no linkValue");
            return;
        }
        if (qrs.e(view2)) {
            LogUtil.e("HomePageRecommendLayout", "click too fast");
        } else if (!fxk.b(this.f8342a.getLinkValue())) {
            a(view, this.f8342a);
        } else {
            LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: fzn
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f34795a.b(view, i, obj);
                }
            }, AnalyticsValue.MARKETING_RESOURCE.value());
        }
    }

    public /* synthetic */ void b(View view, int i, Object obj) {
        if (i == 0) {
            a(view, this.f8342a);
        } else {
            LogUtil.e("HomePageRecommendLayout", "onClick errorCode = ", Integer.valueOf(i));
        }
    }

    private void d(int i) {
        Drawable drawableC = qqf.c(ContextCompat.getDrawable(this.f8343b, R.drawable.ic_arrows_right_black), i);
        drawableC.setAlpha(102);
        if (LanguageUtil.ba(this.f8343b)) {
            BitmapDrawable bitmapDrawableE = qqz.e(this.f8343b, drawableC);
            if (bitmapDrawableE != null) {
                this.h.setImageDrawable(bitmapDrawableE);
                return;
            }
            return;
        }
        this.h.setImageDrawable(drawableC);
    }

    private void d(View view, int i) {
        try {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i});
            gradientDrawable.setGradientType(0);
            gradientDrawable.setShape(0);
            float dimensionPixelOffset = this.f8343b.getResources().getDimensionPixelOffset(R.dimen.smallButtonCornerRadius);
            gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset});
            gradientDrawable.setAlpha(25);
            view.setBackground(gradientDrawable);
        } catch (IllegalArgumentException unused) {
            LogUtil.d("HomePageRecommendLayout", "IllegalArgumentException");
        }
    }

    private void a(View view, SingleGridContent singleGridContent) {
        String linkValue = singleGridContent.getLinkValue();
        ((MarketRouterApi) Services.b("FeatureMarketing", MarketRouterApi.class)).router(fxl.c(linkValue, this.j, 1, singleGridContent, this.f8344c));
        LogUtil.b("HomePageRecommendLayout", "jumping from function card banner, target:" + linkValue);
        c(2, singleGridContent);
        view.setVisibility(8);
        IBaseResponseCallback iBaseResponseCallback = this.e;
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(0, Integer.valueOf(this.d));
        }
        String strConcat = Integer.toString(this.j).concat(getRecommendCard());
        long jB = b(singleGridContent);
        if (jB == 0) {
            jB = lsl.c(System.currentTimeMillis());
        }
        lua.a(Integer.toString(PrebakedEffectId.RT_ICE), strConcat, jB);
        LogUtil.b("HomePageRecommendLayout", getRecommendCard() + " clicked, banner will stay expired until " + jB);
        a();
    }

    private void a() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: fzq
            @Override // java.lang.Runnable
            public final void run() {
                this.e.c();
            }
        });
    }

    public /* synthetic */ void c() {
        ResourceBriefInfo resourceBriefInfo = this.f8344c;
        if (resourceBriefInfo == null || resourceBriefInfo.getMarketingRule() == null) {
            LogUtil.e("HomePageRecommendLayout", "mBriefInfo is null or no rule");
            return;
        }
        CycleRuleBase triggerCycle = this.f8344c.getMarketingRule().getTriggerCycle();
        if (triggerCycle == null || triggerCycle.getCycleType() != 1) {
            return;
        }
        LogUtil.b("HomePageRecommendLayout", "ResourceName :", this.f8344c.getResourceName(), " cycleRuleBase CYCLE_TYPE_SINGLE");
        fxl.b(this.j, 1, this.f8344c);
    }

    private long b(SingleGridContent singleGridContent) {
        List<TimePeriod> timePeriodList = singleGridContent.getTimePeriodList();
        long j = 0;
        if (timePeriodList == null) {
            LogUtil.b("HomePageRecommendLayout", "no time period received from cloud");
            return 0L;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (TimePeriod timePeriod : timePeriodList) {
            long jB = b(timePeriod.getBeginTime());
            long jB2 = b(timePeriod.getEndTime());
            if (jB < jCurrentTimeMillis && jB2 > jCurrentTimeMillis) {
                return jB2;
            }
            if (jB2 < jCurrentTimeMillis) {
                j = jB2;
            }
        }
        LogUtil.e("HomePageRecommendLayout", "no matched timePeriod, this should NOT happen..." + timePeriodList);
        return j;
    }

    private static long b(String str) {
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length < 2) {
            LogUtil.d("HomePageRecommendLayout", "time format error, time: " + str);
            return 0L;
        }
        return lsl.a(System.currentTimeMillis(), CommonUtil.n(BaseApplication.getContext(), strArrSplit[0]), CommonUtil.n(BaseApplication.getContext(), strArrSplit[1]));
    }

    private void e(final View view, final SingleGridContent singleGridContent) {
        qsp.a(view, new ViewTreeObserver.OnScrollChangedListener() { // from class: com.huawei.health.marketing.views.HomePageRecommendLayout.2
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                if (HomePageRecommendLayout.this.j != 4161 || fxk.a()) {
                    if (view.getTag() != null) {
                        qsp.c(view, this);
                        return;
                    }
                    if (MarketingBiUtils.c(view)) {
                        HomePageRecommendLayout.this.f = System.currentTimeMillis();
                        HomePageRecommendLayout.this.c(1, singleGridContent);
                        view.setTag("showed");
                        qsp.c(view, this);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, SingleGridContent singleGridContent) {
        if (this.f8344c == null) {
            LogUtil.e("HomePageRecommendLayout", "biEvent mBriefInfo is null. return.");
            return;
        }
        HashMap map = new HashMap(10);
        if (!TextUtils.isEmpty(singleGridContent.getDynamicDataId())) {
            map.put("itemId", singleGridContent.getDynamicDataId());
        }
        map.put("itemCardName", singleGridContent.getTheme());
        if (i == 2) {
            map.put("durationTime", Integer.valueOf((int) (System.currentTimeMillis() - this.f)));
        }
        if (singleGridContent.isSmartRecommend()) {
            map.put("itemId", singleGridContent.getItemId());
        }
        map.put("smartRecommend", Boolean.valueOf(singleGridContent.isSmartRecommend()));
        map.put("algId", singleGridContent.getAlgId());
        map.put("pullOrder", Integer.valueOf(this.d + 1));
        map.put("cardPackageName", getRecommendCard());
        MarketingBiUtils.a(i, this.j, this.f8344c, map);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HomePageRecommendLayout)) {
            return false;
        }
        HomePageRecommendLayout homePageRecommendLayout = (HomePageRecommendLayout) obj;
        if (getGridContent() == null) {
            LogUtil.e("HomePageRecommendLayout", "singleGridContent is null when equals.");
            return false;
        }
        return getGridContent().equals(homePageRecommendLayout.getGridContent());
    }
}
