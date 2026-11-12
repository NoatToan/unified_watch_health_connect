package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ConfigurationHelper;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.uikit.hwviewpager.widget.HwViewPager;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LanguageUtil;
import health.compact.a.Utils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class ire {
    private static ArrayList<View> d = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f37987c = 5;

    public static void b(final ViewGroup viewGroup, int i, Activity activity) {
        if (viewGroup == null || activity == null) {
            LogUtil.j("MainGuideViewManager", "rootView is null or activity is null");
            return;
        }
        f37987c = i;
        ((ImageView) viewGroup.findViewById(R.id.close_img)).setOnClickListener(new View.OnClickListener() { // from class: irm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ire.a(viewGroup, view);
            }
        });
        final HealthViewPager healthViewPager = (HealthViewPager) viewGroup.findViewById(R.id.view_pager);
        d = new ArrayList<>();
        Context context = BaseApplication.getContext();
        d.add(LayoutInflater.from(context).inflate(R.layout.page_item_update_guide_1, (ViewGroup) null));
        d.add(LayoutInflater.from(context).inflate(R.layout.page_item_update_guide_2, (ViewGroup) null));
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.page_item_update_guide_3, (ViewGroup) null);
        b(viewInflate);
        d.add(viewInflate);
        healthViewPager.setAdapter(new qto(d));
        healthViewPager.setTag(0);
        HealthDotsPageIndicator healthDotsPageIndicator = (HealthDotsPageIndicator) viewGroup.findViewById(R.id.dots_page_indicator);
        healthDotsPageIndicator.setOnPageChangeListener(new HwViewPager.OnPageChangeListener() { // from class: ire.3
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i2) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrolled(int i2, float f, int i3) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i2) {
                healthViewPager.setTag(Integer.valueOf(i2));
            }
        });
        healthDotsPageIndicator.setViewPager(healthViewPager);
        b(viewGroup, healthViewPager, d);
        b(activity, d, healthDotsPageIndicator);
        if (njy.c(d, 2)) {
            e(activity);
        }
        buh.d("MAIN_GUIDE_VIEW_FLAG", "true");
        buh.d("MAIN_NEED_NOVA_FLAG", "needNova");
    }

    static /* synthetic */ void a(ViewGroup viewGroup, View view) {
        LogUtil.a("MainGuideViewManager", "close btn clicked");
        viewGroup.setVisibility(8);
        ObserverManagerUtil.e("MAIN_GUIDE_VIEW_COMPLETED", new Object[0]);
    }

    private static void b(View view) {
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.text);
        if (qrs.ah(com.huawei.haf.application.BaseApplication.b())) {
            healthTextView.setText("点击开始健身、跳绳、瑜伽等运动");
        } else {
            healthTextView.setText("点击开始跑步、健身、骑行、跳绳等运动");
        }
    }

    public static void e(final Activity activity) {
        if (njy.e(d, 2)) {
            LogUtil.j("MainGuideViewManager", "index out of mPageViews size");
            return;
        }
        final ImageView imageView = (ImageView) d.get(2).findViewById(R.id.image);
        if (imageView == null) {
            return;
        }
        imageView.post(new Runnable() { // from class: ire.5
            @Override // java.lang.Runnable
            public void run() {
                if (imageView.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) imageView.getLayoutParams();
                    int i = qrs.i(activity) / ire.f37987c;
                    int width = ((i - imageView.getWidth()) / 2) + i;
                    LogUtil.a("MainGuideViewManager", "sport tab icon startMargin:", Integer.valueOf(width), "  spiltWidth:", Integer.valueOf(i));
                    if (width > 0) {
                        i = width;
                    }
                    layoutParams.setMarginStart(i);
                    imageView.setLayoutParams(layoutParams);
                }
            }
        });
    }

    private static void b(final ViewGroup viewGroup, final HealthViewPager healthViewPager, final ArrayList<View> arrayList) {
        int dimensionPixelSize = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_28dp);
        final int i = 0;
        int i2 = 0;
        for (View view : arrayList) {
            i++;
            HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.text);
            final HealthButton healthButton = (HealthButton) view.findViewById(R.id.button);
            healthButton.setTag(Integer.valueOf(i2));
            healthButton.setOnClickListener(new View.OnClickListener() { // from class: irk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ire.d(healthViewPager, i, healthButton, arrayList, viewGroup, view2);
                }
            });
            if (qrs.v()) {
                float f = dimensionPixelSize;
                healthTextView.setTextSize(0, f);
                healthButton.setAutoTextSize(0, f);
                healthButton.setAutoTextInfo(dimensionPixelSize, 1, 0);
            }
            i2++;
        }
    }

    static /* synthetic */ void d(HealthViewPager healthViewPager, int i, HealthButton healthButton, ArrayList arrayList, ViewGroup viewGroup, View view) {
        int iIntValue = healthViewPager.getTag() instanceof Integer ? ((Integer) healthViewPager.getTag()).intValue() : i - 1;
        int iIntValue2 = healthButton.getTag() instanceof Integer ? ((Integer) healthButton.getTag()).intValue() : i - 1;
        if (iIntValue != iIntValue2) {
            LogUtil.e("MainGuideViewManager", "error state happened here! curIndex = ", Integer.valueOf(iIntValue), ", go back to btnIndex = ", Integer.valueOf(iIntValue2));
            healthViewPager.setCurrentItem(iIntValue2);
        } else if (i == arrayList.size()) {
            viewGroup.setVisibility(8);
            ObserverManagerUtil.e("MAIN_GUIDE_VIEW_COMPLETED", new Object[0]);
        } else {
            healthViewPager.setCurrentItem(i);
        }
    }

    private static void b(Activity activity, ArrayList<View> arrayList, HealthDotsPageIndicator healthDotsPageIndicator) {
        if (!qrs.c(activity)) {
            LogUtil.a("MainGuideViewManager", "adaptTahiti is not needChange");
            return;
        }
        boolean z = ConfigurationHelper.getDensityDpi(activity.getResources()) > irz.b();
        int dimensionPixelSize = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_16dp);
        for (int i = 0; i < arrayList.size(); i++) {
            View view = arrayList.get(i);
            HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.text);
            HealthButton healthButton = (HealthButton) view.findViewById(R.id.button);
            if (z) {
                float f = dimensionPixelSize;
                healthTextView.setTextSize(0, f);
                healthButton.setAutoTextSize(0, f);
            }
            if (!(healthTextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                LogUtil.j("MainGuideViewManager", "text.getLayoutParams() is not ViewGroup.MarginLayoutParams");
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) healthTextView.getLayoutParams();
                if (i == 0) {
                    marginLayoutParams.bottomMargin = activity.getResources().getDimensionPixelSize(R.dimen.health_common_80dp);
                    healthTextView.setLayoutParams(marginLayoutParams);
                } else if (z && i == 1) {
                    marginLayoutParams.bottomMargin = activity.getResources().getDimensionPixelSize(R.dimen.health_common_min_10dp);
                    healthTextView.setLayoutParams(marginLayoutParams);
                } else {
                    LogUtil.a("MainGuideViewManager", "loadGuideView index is 3 or densityChange is false");
                }
            }
        }
        if (!(healthDotsPageIndicator.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            LogUtil.j("MainGuideViewManager", "dotsPageIndicator LayoutParams is error");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) healthDotsPageIndicator.getLayoutParams();
        marginLayoutParams2.bottomMargin = activity.getResources().getDimensionPixelSize(R.dimen.health_common_60dp);
        healthDotsPageIndicator.setLayoutParams(marginLayoutParams2);
    }

    public static boolean c() {
        return (!LanguageUtil.f(BaseApplication.getContext()) || Utils.o() || CommonUtil.ca() || EnvironmentInfo.m() || "true".equals(buh.e("MAIN_GUIDE_VIEW_FLAG"))) ? false : true;
    }
}
