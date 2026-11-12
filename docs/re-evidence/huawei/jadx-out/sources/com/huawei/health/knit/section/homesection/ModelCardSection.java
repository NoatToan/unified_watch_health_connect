package com.huawei.health.knit.section.homesection;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.knit.section.view.BaseSection;
import com.huawei.health.servicesui.R;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.base.BaseActivity;
import defpackage.fsb;
import defpackage.fsd;
import defpackage.lmf;
import defpackage.qgr;
import defpackage.qqw;
import health.compact.a.util.LogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class ModelCardSection extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ThreeCircleCardSection f7499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f7500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f7501c;
    private String d;
    private RelativeLayout e;
    private LinearLayout f;
    private LinearLayout h;
    private RelativeLayout i;
    private ThreeLeafCardSection j;

    public void b() {
        c(this.e);
        c(this.i);
        c();
    }

    public void e(String str) {
        View overlayView;
        ThreeCircleCardSection threeCircleCardSection = this.f7499a;
        if (threeCircleCardSection == null || this.j == null) {
            ReleaseLogUtil.b("R_SectionTwoModelCard", "changeOverlayView holder is null");
            return;
        }
        if (threeCircleCardSection.getOverlayView() != null) {
            overlayView = this.f7499a.getOverlayView();
        } else {
            overlayView = this.j.getOverlayView();
        }
        b(overlayView, str);
    }

    public void b(String str) {
        if ("threeCircleCard".equals(str)) {
            this.h.setVisibility(0);
            this.f.setVisibility(8);
        } else if ("threeLeafCard".equals(str)) {
            this.h.setVisibility(8);
            this.f.setVisibility(0);
        } else {
            LogUtil.c("SectionTwoModelCard", "card type error");
        }
    }

    private void c() {
        ThreeCircleCardSection threeCircleCardSection = this.f7499a;
        if (threeCircleCardSection != null) {
            this.e = threeCircleCardSection.getThreeCircleCardLayout();
        }
        ThreeLeafCardSection threeLeafCardSection = this.j;
        if (threeLeafCardSection != null) {
            this.i = threeLeafCardSection.getThreeCircleCardLayout();
        }
    }

    private void c(RelativeLayout relativeLayout) {
        if (relativeLayout == null || !(relativeLayout.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams.height = -2;
        relativeLayout.setLayoutParams(layoutParams);
    }

    private void d() {
        if ("threeCircleCard".equals(this.d)) {
            this.h.setVisibility(0);
            this.f.setVisibility(4);
        } else if ("threeLeafCard".equals(this.d)) {
            this.h.setVisibility(4);
            this.f.setVisibility(0);
        } else {
            LogUtil.c("SectionTwoModelCard", "card type error");
        }
    }

    public void b(View view, String str) {
        ReleaseLogUtil.c("R_SectionTwoModelCard", "setOverlayAnimateBg overlayLayout is null:", Boolean.valueOf(view == null));
        if ("threeCircleCard".equals(str)) {
            ThreeCircleCardSection threeCircleCardSection = this.f7499a;
            if (threeCircleCardSection != null) {
                threeCircleCardSection.showMarketingLayout(view);
            }
            ThreeLeafCardSection threeLeafCardSection = this.j;
            if (threeLeafCardSection != null) {
                threeLeafCardSection.setOverlayView(view);
                return;
            }
            return;
        }
        ThreeLeafCardSection threeLeafCardSection2 = this.j;
        if (threeLeafCardSection2 != null) {
            threeLeafCardSection2.showMarketingLayout(view);
        }
        ThreeCircleCardSection threeCircleCardSection2 = this.f7499a;
        if (threeCircleCardSection2 != null) {
            threeCircleCardSection2.setOverlayView(view);
        }
    }

    public void c(final String str, final boolean z) {
        if (!HandlerExecutor.d()) {
            LogUtil.a("SectionTwoModelCard", "notifyModelChanged, not in ui thread");
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.health.knit.section.homesection.ModelCardSection.2
                @Override // java.lang.Runnable
                public void run() {
                    ModelCardSection.this.c(str, z);
                }
            });
            return;
        }
        LogUtil.a("SectionTwoModelCard", "notifyModelChanged, targetType: ", str);
        this.d = str;
        if (z) {
            e();
        }
        d();
        if ("threeLeafCard".equals(str)) {
            fsb.e("threeLeafCard");
        } else {
            fsb.e("threeCircleCard");
        }
        a();
    }

    public void c(boolean z) {
        String strB = fsb.b();
        LogUtil.a("SectionTwoModelCard", "notifyCardChanged: currentType: ", strB, ", switchWithAnimation: ", Boolean.valueOf(z));
        if (z) {
            return;
        }
        LogUtil.a("SectionTwoModelCard", "switch without Animation");
        if ("threeCircleCard".equals(strB)) {
            e("threeLeafCard");
            c("threeLeafCard", false);
        } else {
            e("threeCircleCard");
            c("threeCircleCard", false);
        }
        d(strB, false);
    }

    private void d(final String str, boolean z) {
        if ("threeLeafCard".equals(str)) {
            fsb.b("threeCircleCard");
        } else {
            fsb.b("threeLeafCard");
        }
        fsb.c(str);
        lmf.d().c(LoginInit.getInstance(this.f7500b).getAccountInfo(1011));
        HandlerExecutor.c(new Runnable() { // from class: fsc
            @Override // java.lang.Runnable
            public final void run() {
                ObserverManagerUtil.e("NOTIFY_STEP_CARD_CHANGED", str);
            }
        }, z ? 1700L : 0L);
    }

    private void e() {
        if ("threeCircleCard".equals(this.d)) {
            this.f7499a.c();
        } else {
            this.j.getClover().setCloverCutValuesWithAnim(0.0f, 0.0f, 0.0f);
        }
    }

    private void a() {
        LogUtil.a("SectionTwoModelCard", "refreshUiForVisible");
        if ("threeCircleCard".equals(this.d)) {
            this.f7499a.refreshUiForVisible();
        } else {
            this.j.refreshUiForVisible();
            LogUtil.a("SectionTwoModelCard", "refreshUiForVisible end");
        }
    }

    public ModelCardSection(Context context) {
        super(context);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        this.f7500b = context;
        this.f7501c = LayoutInflater.from(context).inflate(R.layout.layout_two_model_card_container, (ViewGroup) this, false);
        LogUtil.a("SectionTwoModelCard", "TwoModelCardViewHolder start");
        boolean zA = qgr.a(this.f7500b);
        this.d = fsb.b();
        this.h = (LinearLayout) this.f7501c.findViewById(R.id.three_circle);
        this.f = (LinearLayout) this.f7501c.findViewById(R.id.three_leaf);
        fsd.e = false;
        if (zA) {
            this.f7499a = new ThreeCircleCardSection(context);
            this.h.removeAllViews();
            this.h.addView(this.f7499a.onCreateView(this.f7500b));
            this.j = new ThreeLeafCardSection(context);
            this.f.removeAllViews();
            this.f.addView(this.j.onCreateView(this.f7500b));
            this.h.setVisibility(0);
            this.f.setVisibility(8);
            this.i = this.j.getThreeCircleCardLayout();
        } else {
            this.j = new ThreeLeafCardSection(context);
            this.f.removeAllViews();
            this.f.addView(this.j.onCreateView(this.f7500b));
            this.f7499a = new ThreeCircleCardSection(context);
            this.h.removeAllViews();
            this.h.addView(this.f7499a.onCreateView(this.f7500b));
            this.h.setVisibility(8);
            this.f.setVisibility(0);
            this.e = this.f7499a.getThreeCircleCardLayout();
        }
        setViewRegion(this.h);
        setViewRegion(this.f);
        fsd.e = true;
        c();
        b(this.d);
        LogUtil.a("SectionTwoModelCard", "TwoModelCardViewHolder end");
        return this.f7501c;
    }

    private void setViewRegion(LinearLayout linearLayout) {
        if (linearLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
            Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
            marginLayoutParams.setMarginStart(this.f7500b.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart) + ((Integer) safeRegionWidth.first).intValue());
            marginLayoutParams.setMarginEnd(this.f7500b.getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd) + ((Integer) safeRegionWidth.second).intValue());
            linearLayout.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionTwoModelCard";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void bindParamsToView(HashMap<String, Object> map) {
        ThreeCircleCardSection threeCircleCardSection = this.f7499a;
        if (threeCircleCardSection != null) {
            threeCircleCardSection.bindParamsToView(map);
        }
        ThreeLeafCardSection threeLeafCardSection = this.j;
        if (threeLeafCardSection != null) {
            threeLeafCardSection.bindParamsToView(map);
        }
        View view = (View) qqw.a(map, "SHOW_MARKETING_LAYOUT", (Class<Object>) View.class, (Object) null);
        if (view != null) {
            b(view, this.d);
        }
        if (qqw.a(map, "REMOVE_MARKETING_LAYOUT", false)) {
            b(null, this.d);
        }
        if (map.containsKey("NOTIFY_MODEL_CHANGED")) {
            c(qqw.a(map, "NOTIFY_MODEL_CHANGED", false));
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
        this.f7499a.onConfigurationChanged(configuration);
        this.j.onConfigurationChanged(configuration);
    }
}
