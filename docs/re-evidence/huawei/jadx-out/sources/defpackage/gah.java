package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.datatype.templates.GridTemplate;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.viewpager.HealthPagerAdapter;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class gah extends HealthPagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View.OnClickListener f34809a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f34811c;
    private GridTemplate d;
    private int e;
    private double f;
    private boolean g;
    private int h;
    private ResourceBriefInfo i;
    private int j;
    private List<SingleGridContent> k;
    private HealthViewPager m;
    private Set<String> n = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f34810b = System.currentTimeMillis();

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public gah(HealthViewPager healthViewPager, Context context) {
        this.m = healthViewPager;
        this.f34811c = context;
    }

    public void a(int i, GridTemplate gridTemplate, ResourceBriefInfo resourceBriefInfo, boolean z) {
        this.h = i;
        this.i = resourceBriefInfo;
        this.e = resourceBriefInfo.getContentType();
        this.g = z;
        this.d = gridTemplate;
        if (njy.e(gridTemplate.getGridContents())) {
            LogUtil.j("SportBannerLayoutAdapter", "list is empty");
        } else {
            LogUtil.a("SportBannerLayoutAdapter", "setList", gridTemplate.getGridContents());
            this.k = gridTemplate.getGridContents();
        }
    }

    public void c(int i) {
        this.j = i;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        if (njy.b(this.k)) {
            return this.k.size();
        }
        return 0;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (!(obj instanceof View) || njy.e(this.k, i)) {
            return;
        }
        ((HealthViewPager) viewGroup).removeView((View) obj);
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View viewC;
        if (njy.e(this.k, i)) {
            LogUtil.j("SportBannerLayoutAdapter", "isOutOfBounds");
            return LayoutInflater.from(this.f34811c).inflate(R.layout.item_sport_banner, (ViewGroup) null);
        }
        SingleGridContent singleGridContent = this.k.get(i);
        LogUtil.a("SportBannerLayoutAdapter", "instantiateItem:", Integer.valueOf(i));
        int i2 = this.e;
        if (i2 == 51) {
            viewC = d(singleGridContent, this.m, i);
        } else if (i2 == 52) {
            viewC = a(singleGridContent, this.m, i);
        } else if (i2 == 98) {
            viewC = a(singleGridContent, this.m, qrs.af(BaseApplication.getActivity()));
        } else {
            viewC = c(singleGridContent, this.m, i);
        }
        if (viewGroup instanceof HealthViewPager) {
            viewGroup.addView(viewC);
        }
        Activity activity = BaseApplication.getActivity();
        if (activity instanceof BaseActivity) {
            viewC.setOnClickListener(qji.b(e(singleGridContent, i), (BaseActivity) activity, LoginInit.getInstance(this.f34811c).isBrowseMode() && fxk.b(singleGridContent.getLinkValue()), ""));
            return viewC;
        }
        viewC.setOnClickListener(e(singleGridContent, i));
        return viewC;
    }

    private View a(SingleGridContent singleGridContent, HealthViewPager healthViewPager, boolean z) {
        View viewInflate = LayoutInflater.from(this.f34811c).inflate(R.layout.layout_member_center_ad, (ViewGroup) null);
        if (!(healthViewPager.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            return viewInflate;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) healthViewPager.getLayoutParams();
        layoutParams.width = this.f34811c.getResources().getDisplayMetrics().widthPixels;
        int i = layoutParams.width;
        int i2 = (int) (((double) i) * this.f);
        ObserverManagerUtil.e("IMMERSION_IMAGE_HEIGHT", Integer.valueOf(i2));
        layoutParams.height = i2;
        healthViewPager.setLayoutParams(layoutParams);
        viewInflate.findViewById(R.id.banner_projection).setVisibility(8);
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.banner);
        if (relativeLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams2.width = i;
            relativeLayout.setLayoutParams(layoutParams2);
        }
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.card_view);
        if (frameLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams3.width = i;
            layoutParams3.height = i2;
            frameLayout.setLayoutParams(layoutParams3);
        }
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.card_image);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setAdjustViewBounds(true);
        a(singleGridContent, imageView, 0, z);
        View viewFindViewById = viewInflate.findViewById(R.id.card_infoLayout);
        ViewGroup.LayoutParams layoutParams4 = viewFindViewById.getLayoutParams();
        layoutParams4.width = (int) (i * 0.618f);
        viewFindViewById.setLayoutParams(layoutParams4);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.card_title);
        healthTextView.setText(String.valueOf(singleGridContent.getTheme()));
        healthTextView.setVisibility(4);
        fya.b(healthTextView, false, true);
        fya.b((HealthTextView) viewInflate.findViewById(R.id.card_content), true, false);
        return viewInflate;
    }

    private View.OnClickListener e(SingleGridContent singleGridContent, int i) {
        return new d(this, singleGridContent, i, this.h, this.i);
    }

    static final class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ResourceBriefInfo f34812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f34813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<SingleGridContent> f34814c;
        private final int d;
        private final WeakReference<gah> e;

        public d(gah gahVar, SingleGridContent singleGridContent, int i, int i2, ResourceBriefInfo resourceBriefInfo) {
            this.e = new WeakReference<>(gahVar);
            this.f34814c = new WeakReference<>(singleGridContent);
            this.d = i;
            this.f34813b = i2;
            this.f34812a = resourceBriefInfo;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SingleGridContent singleGridContent = this.f34814c.get();
            gah gahVar = this.e.get();
            if (singleGridContent == null || gahVar == null || TextUtils.isEmpty(singleGridContent.getLinkValue())) {
                return;
            }
            if (!qrs.e(view)) {
                gahVar.e((ImageView) view.findViewById(R.id.card_image), singleGridContent);
                gahVar.e(2, singleGridContent, this.d);
                MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
                if (marketRouterApi != null) {
                    marketRouterApi.router(fxl.c(singleGridContent.getLinkValue(), this.f34813b, this.d + 1, singleGridContent, this.f34812a));
                    return;
                }
                return;
            }
            LogUtil.j("SportBannerLayoutAdapter", "click too fast");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(ImageView imageView, SingleGridContent singleGridContent) {
        if (imageView == null) {
            LogUtil.j("SportBannerLayoutAdapter", "reloadBgImage bgImage is null");
            return;
        }
        if (!((imageView.getTag() instanceof Boolean) && ((Boolean) imageView.getTag()).booleanValue()) && CommonUtil.ab((Context) null)) {
            LogUtil.a("SportBannerLayoutAdapter", "has no resource, reload");
            if (this.e == 98) {
                a(singleGridContent, imageView, 0, qrs.af(BaseApplication.getActivity()));
            } else {
                a(singleGridContent, imageView, qqf.d, false);
            }
        }
    }

    private void a(final SingleGridContent singleGridContent, final ImageView imageView, final int i, final boolean z) {
        imageView.setImageResource(R.drawable.shape_sport_banner_bg);
        ThreadPoolManager.c().execute(new Runnable() { // from class: gai
            @Override // java.lang.Runnable
            public final void run() {
                gah.a(i, z, singleGridContent, imageView);
            }
        });
    }

    static /* synthetic */ void a(int i, boolean z, final SingleGridContent singleGridContent, final ImageView imageView) {
        final Drawable drawableD;
        if (i <= 0) {
            drawableD = qqf.b(BaseApplication.getContext(), z ? singleGridContent.getTahitiPicture() : singleGridContent.getPicture());
        } else {
            drawableD = qqf.d(BaseApplication.getContext(), z ? singleGridContent.getTahitiPicture() : singleGridContent.getPicture(), i);
        }
        HandlerExecutor.d(new Runnable() { // from class: gag
            @Override // java.lang.Runnable
            public final void run() {
                gah.d(drawableD, imageView, singleGridContent);
            }
        });
    }

    static /* synthetic */ void d(Drawable drawable, ImageView imageView, SingleGridContent singleGridContent) {
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
            imageView.setTag(true);
        } else {
            imageView.setTag(false);
        }
        CharSequence charSequenceD = fya.d(singleGridContent);
        lrd.a(imageView, charSequenceD, (Class<?>) ImageView.class);
        LogUtil.a("SportBannerLayoutAdapter", "handleImageView contentDescription ", charSequenceD);
    }

    public void a(double d2) {
        this.f = d2;
    }

    private View a(SingleGridContent singleGridContent, HealthViewPager healthViewPager, int i) {
        View viewInflate = LayoutInflater.from(this.f34811c).inflate(R.layout.item_sport_banner, (ViewGroup) null);
        if (!(healthViewPager.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            return viewInflate;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) healthViewPager.getLayoutParams();
        layoutParams.width = c() - this.j;
        LogUtil.a("SportBannerLayoutAdapter", "adViewPagerLayoutParams width:", Integer.valueOf(layoutParams.width), "  mOtherMargin:", Integer.valueOf(this.j));
        int iC = fya.c(this.f34811c, this.j);
        LogUtil.a("SportBannerLayoutAdapter", "buildFullImgCardViewLayout width:", Integer.valueOf(iC), "  height:", Integer.valueOf(layoutParams.height));
        healthViewPager.setLayoutParams(layoutParams);
        b((RelativeLayout) viewInflate.findViewById(R.id.banner), iC, viewInflate, layoutParams.height);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.card_image);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.icon_top_corner);
        a(singleGridContent, imageView, qqf.d, false);
        if (singleGridContent.getCornerVisibility()) {
            healthTextView.setVisibility(0);
            fya.c(healthTextView, singleGridContent, 0, 0, 0, 8);
        }
        b(viewInflate);
        return viewInflate;
    }

    private void b(View view) {
        GridTemplate gridTemplate = this.d;
        if (gridTemplate == null) {
            LogUtil.j("SportBannerLayoutAdapter", "initFullImgCloseAndInfoBtn mGridTemplate is null");
            return;
        }
        boolean zIsAdvertiseCloseButtonSwitch = gridTemplate.isAdvertiseCloseButtonSwitch();
        boolean zIsAdvertiseInfoButtonSwitch = this.d.isAdvertiseInfoButtonSwitch();
        LogUtil.a("SportBannerLayoutAdapter", "initFullImgCloseAndInfoBtn closeButton: ", Boolean.valueOf(zIsAdvertiseCloseButtonSwitch), "  InfoButton: ", Boolean.valueOf(zIsAdvertiseInfoButtonSwitch), "  InfoLink: ", this.d.getAdvertiseInfoLink());
        ImageView imageView = (ImageView) view.findViewById(R.id.close_btn);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.info_btn);
        if (this.d.isAdvertiseCloseButtonSwitch()) {
            imageView.setVisibility(0);
            if (lrd.d()) {
                lrd.b(imageView, qre.f(R.string.accessibility_close));
            }
        } else {
            imageView.setVisibility(8);
        }
        if (this.d.isAdvertiseInfoButtonSwitch() && !TextUtils.isEmpty(this.d.getAdvertiseInfoLink())) {
            imageView2.setVisibility(0);
            if (lrd.d()) {
                lrd.b(imageView2, qre.f(R.string.IDS_lactate_tittlebar_top));
            }
        } else {
            imageView2.setVisibility(8);
        }
        imageView.setOnClickListener(this.f34809a);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: gaj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f34818b.e(view2);
            }
        });
    }

    /* synthetic */ void e(View view) {
        ReleaseLogUtil.d("R_SportBannerLayoutAdapter", "infoBtn clicked");
        ((MarketRouterApi) Services.b("FeatureMarketing", MarketRouterApi.class)).router(this.d.getAdvertiseInfoLink());
    }

    private View d(SingleGridContent singleGridContent, HealthViewPager healthViewPager, int i) {
        int dimensionPixelSize;
        View viewInflate = LayoutInflater.from(this.f34811c).inflate(R.layout.item_sport_banner_image_text, (ViewGroup) null);
        if (!(healthViewPager.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            return viewInflate;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) healthViewPager.getLayoutParams();
        layoutParams.width = c() - this.j;
        if (this.g) {
            dimensionPixelSize = this.f34811c.getResources().getDimensionPixelSize(R.dimen.health_common_98dp);
        } else {
            dimensionPixelSize = this.f34811c.getResources().getDimensionPixelSize(R.dimen.health_common_78dp);
        }
        layoutParams.height = dimensionPixelSize;
        healthViewPager.setLayoutParams(layoutParams);
        b((RelativeLayout) viewInflate.findViewById(R.id.banner), e(), viewInflate, dimensionPixelSize);
        a(singleGridContent, (ImageView) viewInflate.findViewById(R.id.card_image), qqf.d, false);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.item_sport_banner_title);
        healthTextView.setText(singleGridContent.getTheme());
        fya.b(healthTextView, false, true);
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.item_sport_banner_description);
        healthTextView2.setText(singleGridContent.getDescription());
        fya.b(healthTextView2, true, false);
        return viewInflate;
    }

    private View c(SingleGridContent singleGridContent, HealthViewPager healthViewPager, int i) {
        View viewInflate = LayoutInflater.from(this.f34811c).inflate(R.layout.layout_ad_cardview_sport, (ViewGroup) null);
        if (healthViewPager.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) healthViewPager.getLayoutParams();
            layoutParams.width = c() - this.j;
            int iE = e();
            LogUtil.a("SportBannerLayoutAdapter", "buildStdCardViewLayout width:", Integer.valueOf(iE));
            int i2 = (iE * 9) / 16;
            layoutParams.height = i2;
            healthViewPager.setLayoutParams(layoutParams);
            viewInflate.findViewById(R.id.banner_projection).setVisibility(8);
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.banner);
            if (relativeLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                layoutParams2.width = iE;
                relativeLayout.setLayoutParams(layoutParams2);
            }
            HealthCardView healthCardView = (HealthCardView) viewInflate.findViewById(R.id.card_view);
            if (healthCardView.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) healthCardView.getLayoutParams();
                layoutParams3.width = iE;
                layoutParams3.height = i2;
                healthCardView.setLayoutParams(layoutParams3);
            }
            a(singleGridContent, (ImageView) viewInflate.findViewById(R.id.card_image), qqf.d, false);
            View viewFindViewById = viewInflate.findViewById(R.id.card_infoLayout);
            ViewGroup.LayoutParams layoutParams4 = viewFindViewById.getLayoutParams();
            layoutParams4.width = (int) (iE * 0.618f);
            viewFindViewById.setLayoutParams(layoutParams4);
            HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.card_title);
            HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.icon_top_corner_mark);
            healthTextView.setText(String.valueOf(singleGridContent.getTheme()));
            healthTextView.setVisibility(singleGridContent.isThemeVisibility() ? 0 : 4);
            fya.b(healthTextView, false, true);
            HealthTextView healthTextView3 = (HealthTextView) viewInflate.findViewById(R.id.card_content);
            healthTextView3.setText(String.valueOf(singleGridContent.getDescription()));
            healthTextView3.setVisibility(TextUtils.isEmpty(singleGridContent.getDescription()) ? 4 : 0);
            fya.b(healthTextView3, true, false);
            if (singleGridContent.getCornerVisibility()) {
                healthTextView2.setVisibility(0);
                fya.c(healthTextView2, singleGridContent, 0, 0, 0, 12);
            }
        }
        return viewInflate;
    }

    public void e(int i, SingleGridContent singleGridContent, int i2) {
        if (1 == i && this.n.contains(singleGridContent.getTheme())) {
            LogUtil.a("SportBannerLayoutAdapter", "has shown name: ", singleGridContent.getTheme());
            return;
        }
        HashMap map = new HashMap();
        map.put("resourcePositionId", Integer.valueOf(this.h));
        map.put("resourceName", this.i.getResourceName());
        map.put("resourceId", this.i.getResourceId());
        map.put("itemCardName", singleGridContent.getTheme());
        map.put("event", Integer.valueOf(i));
        if (i == 2) {
            map.put("durationTime", Long.valueOf(System.currentTimeMillis() - this.f34810b));
            this.f34810b = System.currentTimeMillis();
        }
        map.put("smartRecommend", Boolean.valueOf(singleGridContent.isSmartRecommend()));
        map.put("itemId", this.i.getSmartRecommend() ? singleGridContent.getItemId() : singleGridContent.getDynamicDataId());
        map.put("pullOrder", Integer.valueOf(i2 + 1));
        map.put("algId", singleGridContent.isRecommendInfoGenerated() ? singleGridContent.getAlgId() : fxl.e(this.i.getRecommendList(), singleGridContent.getItemId()));
        LogUtil.a("SportBannerLayoutAdapter", "marketing biEvent SportBannerLayoutAdapter biMap: ", map.toString());
        if (singleGridContent.isRecommendInfoGenerated()) {
            lmf.d().e(BaseApplication.getContext(), AnalyticsValue.MARKETING_RESOURCE.value(), map, singleGridContent.getAbInfo(), 0);
        } else {
            MarketingBiUtils.c(map, this.i);
        }
        if (1 == i) {
            this.n.add(singleGridContent.getTheme());
        }
    }

    public void b(RelativeLayout relativeLayout, int i, View view, int i2) {
        if (relativeLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.width = i;
            relativeLayout.setLayoutParams(layoutParams);
        }
        HealthCardView healthCardView = (HealthCardView) view.findViewById(R.id.card_view);
        if (healthCardView.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) healthCardView.getLayoutParams();
            layoutParams2.width = i;
            layoutParams2.height = i2;
            healthCardView.setLayoutParams(layoutParams2);
        }
    }

    public int c() {
        return fxk.a(this.f34811c, this.h);
    }

    public int e() {
        return fya.c(this.f34811c, this.j);
    }

    public void e(View.OnClickListener onClickListener) {
        this.f34809a = onClickListener;
    }
}
