package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.huawei.health.suggestion.R;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.uikit.hwviewpager.widget.HwViewPager;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Utils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class huw {
    private a d;

    private huw() {
    }

    static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final huw f37181b = new huw();
    }

    public static final huw e() {
        return b.f37181b;
    }

    public void b(Context context, IBaseResponseCallback iBaseResponseCallback) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.layout_plan_fragment_guide, (ViewGroup) null, false);
        if (viewInflate == null) {
            LogUtil.j("PlanGuideViewManager", "rootView is null");
            return;
        }
        LogUtil.a("PlanGuideViewManager", "showGuideView");
        this.d = new a(viewInflate.getContext(), viewInflate);
        final HealthViewPager healthViewPager = (HealthViewPager) viewInflate.findViewById(R.id.guide_view_pager);
        ArrayList<View> arrayList = new ArrayList<>();
        arrayList.add(LayoutInflater.from(context).inflate(R.layout.plan_guide_page_item_1, (ViewGroup) null));
        arrayList.add(LayoutInflater.from(context).inflate(R.layout.plan_guide_page_item_2, (ViewGroup) null));
        arrayList.add(LayoutInflater.from(context).inflate(R.layout.plan_guide_page_item_3, (ViewGroup) null));
        healthViewPager.setAdapter(new qto(arrayList));
        healthViewPager.setTag(0);
        HealthDotsPageIndicator healthDotsPageIndicator = (HealthDotsPageIndicator) viewInflate.findViewById(R.id.guide_dots_page_indicator);
        healthDotsPageIndicator.setOnPageChangeListener(new HwViewPager.OnPageChangeListener() { // from class: huw.4
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                healthViewPager.setTag(Integer.valueOf(i));
            }
        });
        healthDotsPageIndicator.setViewPager(healthViewPager);
        e(healthViewPager, arrayList, iBaseResponseCallback);
        this.d.show();
    }

    public boolean a() {
        a aVar = this.d;
        return aVar != null && aVar.isShowing();
    }

    public boolean c() {
        return (!LanguageUtil.l(BaseApplication.getContext()) || Utils.o() || CommonUtil.ca() || "true".equals(buh.e("PLAN_GUIDE_FLAG"))) ? false : true;
    }

    private void e(final HealthViewPager healthViewPager, final ArrayList<View> arrayList, final IBaseResponseCallback iBaseResponseCallback) {
        int dimensionPixelSize = BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_28dp);
        final int i = 0;
        int i2 = 0;
        for (View view : arrayList) {
            i++;
            HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.text);
            final HealthButton healthButton = (HealthButton) view.findViewById(R.id.button);
            healthButton.setTag(Integer.valueOf(i2));
            healthButton.setOnClickListener(new View.OnClickListener() { // from class: huz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f37188a.c(healthViewPager, i, healthButton, arrayList, iBaseResponseCallback, view2);
                }
            });
            ((ImageView) view.findViewById(R.id.close_img)).setOnClickListener(new View.OnClickListener() { // from class: huv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f37179c.c(view2);
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

    /* synthetic */ void c(HealthViewPager healthViewPager, int i, HealthButton healthButton, ArrayList arrayList, IBaseResponseCallback iBaseResponseCallback, View view) {
        buh.d("PLAN_GUIDE_FLAG", "true");
        int iIntValue = healthViewPager.getTag() instanceof Integer ? ((Integer) healthViewPager.getTag()).intValue() : i - 1;
        int iIntValue2 = healthButton.getTag() instanceof Integer ? ((Integer) healthButton.getTag()).intValue() : i - 1;
        if (iIntValue != iIntValue2) {
            LogUtil.e("PlanGuideViewManager", "error state happened here! curIndex = ", Integer.valueOf(iIntValue), ", go back to btnIndex = ", Integer.valueOf(iIntValue2));
            healthViewPager.setCurrentItem(iIntValue2);
        } else if (i == arrayList.size()) {
            d();
            iBaseResponseCallback.a(0, Integer.valueOf(i));
        } else {
            healthViewPager.setCurrentItem(i);
        }
    }

    /* synthetic */ void c(View view) {
        LogUtil.a("PlanGuideViewManager", "close btn clicked");
        buh.d("PLAN_GUIDE_FLAG", "true");
        d();
    }

    private void d() {
        a aVar = this.d;
        if (aVar != null) {
            aVar.dismiss();
            this.d = null;
        }
    }

    static class a extends BaseDialog {
        private final Context d;
        private final View e;

        a(Context context, View view) {
            super(context, com.huawei.health.servicesui.R.style.DialogFullScreen, 0);
            this.e = view;
            this.d = context;
            c();
        }

        private void c() {
            Window window = getWindow();
            if (window == null) {
                return;
            }
            setContentView(this.e);
            a(this.e);
            window.setType(1000);
            window.setBackgroundDrawableResource(R.color.common_black_70alpha);
        }

        private void a(View view) {
            if (view.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
                layoutParams.bottomMargin = (qrs.ad(getContext()) ? qrs.q(getContext()) : 0) + this.d.getResources().getDimensionPixelOffset(d());
                view.setLayoutParams(layoutParams);
            }
        }

        private int d() {
            if (qrs.aa(this.d)) {
                return com.huawei.ui.commonui.R.dimen.health_common_12dp;
            }
            return com.huawei.ui.commonui.R.dimen.health_common_48dp;
        }
    }
}
