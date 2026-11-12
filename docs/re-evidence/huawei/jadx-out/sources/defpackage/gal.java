package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.gson.Gson;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.templates.TopBannerTemplate;
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
import health.compact.a.Services;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class gal extends HealthPagerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<ResourceBriefInfo> f34820a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f34822c;
    private long e;
    private HealthViewPager f;
    private Set<String> h = new HashSet();
    private WeakHashMap<Integer, Drawable> d = new WeakHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f34821b = new Handler(Looper.getMainLooper());

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public gal(List<ResourceBriefInfo> list, HealthViewPager healthViewPager, Context context) {
        this.f34820a = list;
        LogUtil.a("TopBannerLayoutAdapter", "enter TopBannerLayoutAdapter:", Integer.valueOf(list.size()));
        this.f = healthViewPager;
        this.f34822c = context;
        this.e = System.currentTimeMillis();
    }

    public void e(List<ResourceBriefInfo> list) {
        if (njy.e(list)) {
            LogUtil.j("TopBannerLayoutAdapter", "list is empty");
        } else {
            LogUtil.a("TopBannerLayoutAdapter", "setList", Integer.valueOf(list.size()));
            this.f34820a = list;
        }
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public int getCount() {
        List<ResourceBriefInfo> list = this.f34820a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof View) {
            viewGroup.removeView((View) obj);
        }
    }

    @Override // com.huawei.uikit.hwviewpager.widget.HwPagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (njy.e(this.f34820a, i)) {
            LogUtil.j("TopBannerLayoutAdapter", "isOutOfBounds");
            return LayoutInflater.from(this.f34822c).inflate(R.layout.layout_ad_cardview, (ViewGroup) null);
        }
        TopBannerTemplate topBannerTemplate = (TopBannerTemplate) new Gson().fromJson(this.f34820a.get(i).getContent().getContent(), TopBannerTemplate.class);
        View viewE = e(topBannerTemplate, this.f, i);
        if (viewGroup instanceof HealthViewPager) {
            ((HealthViewPager) viewGroup).addView(viewE);
        }
        Activity activity = BaseApplication.getActivity();
        if (activity instanceof BaseActivity) {
            viewE.setOnClickListener(qji.b(b(topBannerTemplate, this.f34820a.get(i), i), (BaseActivity) activity, LoginInit.getInstance(this.f34822c).isBrowseMode() && fxk.b(topBannerTemplate.getLinkValue()), AnalyticsValue.SOCIAL_1070004.value()));
            return viewE;
        }
        viewE.setOnClickListener(b(topBannerTemplate, this.f34820a.get(i), i));
        return viewE;
    }

    private View.OnClickListener b(final TopBannerTemplate topBannerTemplate, final ResourceBriefInfo resourceBriefInfo, final int i) {
        return new View.OnClickListener() { // from class: gal.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.e(view)) {
                    LogUtil.j("TopBannerLayoutAdapter", "click too fast");
                    return;
                }
                gal.this.a(2, resourceBriefInfo, i);
                MarketRouterApi marketRouterApi = (MarketRouterApi) Services.d("FeatureMarketing", MarketRouterApi.class);
                if (marketRouterApi != null) {
                    String strD = fxl.d(topBannerTemplate.getLinkValue(), resourceBriefInfo.getCategory());
                    if (!TextUtils.isEmpty(strD)) {
                        marketRouterApi.router(gal.this.d(strD, 1003, resourceBriefInfo, i + 1));
                    } else {
                        LogUtil.j("TopBannerLayoutAdapter", "detailUri is null");
                    }
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str, int i, ResourceBriefInfo resourceBriefInfo, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str.contains("?") ? "&pullfrom=" : "?pullfrom=");
        return sb.toString() + i + "&resourceName=" + resourceBriefInfo.getResourceName() + "&resourceId=" + resourceBriefInfo.getResourceId() + "&pullOrder=" + i2;
    }

    private void d(TopBannerTemplate topBannerTemplate, int i, ImageView imageView, WeakHashMap<Integer, Drawable> weakHashMap, int i2) {
        Drawable drawable = this.d.get(Integer.valueOf(i));
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setImageResource(R.drawable.shape_device_banner_bg);
            ThreadPoolManager.c().execute(new AnonymousClass5(i2, topBannerTemplate, weakHashMap, i, imageView));
        }
    }

    /* JADX INFO: renamed from: gal$5, reason: invalid class name */
    class AnonymousClass5 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f34826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f34827b;
        final /* synthetic */ WeakHashMap d;
        final /* synthetic */ ImageView e;
        final /* synthetic */ TopBannerTemplate g;

        AnonymousClass5(int i, TopBannerTemplate topBannerTemplate, WeakHashMap weakHashMap, int i2, ImageView imageView) {
            this.f34826a = i;
            this.g = topBannerTemplate;
            this.d = weakHashMap;
            this.f34827b = i2;
            this.e = imageView;
        }

        @Override // java.lang.Runnable
        public void run() {
            final Drawable drawableD;
            if (this.f34826a <= 0) {
                drawableD = qqf.b(BaseApplication.getContext(), this.g.getPicture());
            } else {
                drawableD = qqf.d(BaseApplication.getContext(), this.g.getPicture(), this.f34826a);
            }
            Handler handler = gal.this.f34821b;
            final WeakHashMap weakHashMap = this.d;
            final int i = this.f34827b;
            final ImageView imageView = this.e;
            handler.post(new Runnable() { // from class: gap
                @Override // java.lang.Runnable
                public final void run() {
                    gal.AnonymousClass5.d(weakHashMap, i, drawableD, imageView);
                }
            });
        }

        static /* synthetic */ void d(WeakHashMap weakHashMap, int i, Drawable drawable, ImageView imageView) {
            weakHashMap.put(Integer.valueOf(i), drawable);
            imageView.setImageDrawable(drawable);
        }
    }

    private View e(TopBannerTemplate topBannerTemplate, HealthViewPager healthViewPager, int i) {
        View viewInflate = LayoutInflater.from(this.f34822c).inflate(R.layout.layout_ad_cardview, (ViewGroup) null);
        if (!(healthViewPager.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            return viewInflate;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) healthViewPager.getLayoutParams();
        layoutParams.width = fxk.a(this.f34822c, 1003);
        LogUtil.a("TopBannerLayoutAdapter", "buildCardViewLayout width:", Integer.valueOf(layoutParams.width));
        int iC = fya.c(this.f34822c, 0);
        int i2 = (iC * 9) / 16;
        layoutParams.height = i2;
        healthViewPager.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.banner);
        if (relativeLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams2.width = iC;
            relativeLayout.setLayoutParams(layoutParams2);
        }
        HealthCardView healthCardView = (HealthCardView) viewInflate.findViewById(R.id.card_view);
        if (healthCardView.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) healthCardView.getLayoutParams();
            layoutParams3.width = iC;
            layoutParams3.height = i2;
            healthCardView.setLayoutParams(layoutParams3);
        }
        healthCardView.setForceClipRoundCorner(true);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.item_one_landscape_corner);
        if (topBannerTemplate.isCornerVisibility()) {
            a(healthTextView, topBannerTemplate);
        }
        d(topBannerTemplate, i, (ImageView) viewInflate.findViewById(R.id.card_image), this.d, qqf.d);
        return viewInflate;
    }

    public static void a(HealthTextView healthTextView, TopBannerTemplate topBannerTemplate) {
        if (topBannerTemplate == null) {
            LogUtil.j("TopBannerLayoutAdapter", "content = null");
            return;
        }
        if (!d(healthTextView, topBannerTemplate)) {
            LogUtil.j("TopBannerLayoutAdapter", "setCornerShow can not show");
            return;
        }
        try {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, fya.a(12.0f), fya.a(12.0f)});
            gradientDrawable.setColor(Color.parseColor(topBannerTemplate.getCornerColor()));
            healthTextView.setBackground(gradientDrawable);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("TopBannerLayoutAdapter", "IllegalArgumentException");
        }
        healthTextView.setGravity(17);
        healthTextView.setText(topBannerTemplate.getCorner());
        healthTextView.setVisibility(0);
    }

    private static boolean d(HealthTextView healthTextView, TopBannerTemplate topBannerTemplate) {
        if (healthTextView == null) {
            LogUtil.j("TopBannerLayoutAdapter", "textView is null");
            return false;
        }
        if (topBannerTemplate.isCornerVisibility() && !TextUtils.isEmpty(topBannerTemplate.getCorner()) && !TextUtils.isEmpty(topBannerTemplate.getCornerColor())) {
            return true;
        }
        healthTextView.setVisibility(8);
        return false;
    }

    public void a(int i, ResourceBriefInfo resourceBriefInfo, int i2) {
        if (resourceBriefInfo == null) {
            LogUtil.e("TopBannerLayoutAdapter", "biEvent resourceBriefInfo is null");
            return;
        }
        String resourceId = resourceBriefInfo.getResourceId();
        if (i != 1 || !this.h.contains(resourceId)) {
            LogUtil.a("TopBannerLayoutAdapter", "biEvent event: ", Integer.valueOf(i), " resourceId: ", resourceId);
            HashMap map = new HashMap();
            map.put("resourcePositionId", 1003);
            map.put("resourceName", resourceBriefInfo.getResourceName());
            map.put("resourceId", resourceBriefInfo.getResourceId());
            map.put("event", Integer.valueOf(i));
            if (i == 2) {
                map.put("durationTime", Long.valueOf(System.currentTimeMillis() - this.e));
                this.e = System.currentTimeMillis();
            }
            if (i == 1) {
                this.h.add(resourceId);
            }
            map.put("algId", "");
            map.put("pullOrder", Integer.valueOf(i2 + 1));
            map.put("smartRecommend", Boolean.valueOf(resourceBriefInfo.getSmartRecommend()));
            lmf.d().c(this.f34822c, AnalyticsValue.MARKETING_RESOURCE.value(), map, 0);
            return;
        }
        LogUtil.a("TopBannerLayoutAdapter", "has shown id: ", resourceId);
    }
}
