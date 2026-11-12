package com.huawei.ui.main.stories.soical;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.health.utils.vippage.MemberCenterBootPagerHelper;
import com.huawei.health.knit.model.mainpage.MainPageConfig;
import com.huawei.health.knit.model.mainpage.MainPageGroupConfig;
import com.huawei.health.knit.section.listener.BasePageResTrigger;
import com.huawei.health.knit.section.listener.MemberCenterPageResTrigger;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.health.marketing.views.IViewVisibilityChange;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.health.operationbundle.R;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitnessPackageInfo;
import com.huawei.trade.datatype.DeviceBenefits;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.scrollview.ScrollViewListener;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.stories.member.MemberTypeSelectActivity;
import defpackage.fca;
import defpackage.fcn;
import defpackage.foc;
import defpackage.fxk;
import defpackage.fxr;
import defpackage.irz;
import defpackage.lmf;
import defpackage.lsy;
import defpackage.njy;
import defpackage.qqt;
import defpackage.qqv;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class MemberCenterFragment extends BaseFragment implements View.OnClickListener, ScrollViewListener, IViewVisibilityChange {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f28842a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f28844c;
    private RelativeLayout d;
    private LinearLayout f;
    private RelativeLayout g;
    private long h;
    private KnitFragment i;
    private View j;
    private LinearLayout k;
    private BasePageResTrigger l;
    private CustomTitleBar o;
    private boolean e = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f28843b = false;
    private String m = "";
    private int n = 1;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.huawei.ui.commonui.scrollview.ScrollViewListener
    public void onScrollChanged(HealthScrollView healthScrollView, int i, int i2, int i3, int i4) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_member_center, viewGroup, false);
        this.j = viewInflate;
        this.k = (LinearLayout) viewInflate.findViewById(R.id.social_root_lyt);
        this.o = (CustomTitleBar) this.j.findViewById(R.id.member_title_bar);
        RelativeLayout relativeLayout = (RelativeLayout) this.j.findViewById(R.id.loading_layout);
        this.g = relativeLayout;
        relativeLayout.setVisibility(0);
        this.d = (RelativeLayout) this.j.findViewById(R.id.member_center_error_layout);
        this.f28842a = getActivity();
        this.f28844c = System.currentTimeMillis();
        c();
        g();
        i();
        f();
        o();
        e();
        return this.j;
    }

    public void d(int i) {
        this.n = i;
    }

    public void c(boolean z) {
        this.f28843b = z;
    }

    public void d(String str) {
        this.m = str;
    }

    private void c() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.e = arguments.getBoolean("IS_SHOW_TITLE_RETURN_BUTTOM", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (HandlerExecutor.c()) {
            lsy.a(new Runnable() { // from class: com.huawei.ui.main.stories.soical.MemberCenterFragment.3
                @Override // java.lang.Runnable
                public void run() {
                    MemberCenterFragment.this.e();
                }
            });
            return;
        }
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("MemberCenterFragment", "refreshFitnessPlan, getRecommendPlans : planApi is null.");
        } else {
            planApi.getAllFitnessPackage(-1, new UiCallback<List<FitnessPackageInfo>>() { // from class: com.huawei.ui.main.stories.soical.MemberCenterFragment.4
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.j("MemberCenterFragment", "onFailure errorCode = ", Integer.valueOf(i), " errorInfo = ", str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<FitnessPackageInfo> list) {
                    LogUtil.a("MemberCenterFragment", "onSuccess invoke");
                }
            });
        }
    }

    private void o() {
        this.o.setLeftButtonVisibility(this.e ? 0 : 8);
        this.o.setTitleText(this.f28842a.getString(R.string.IDS_member_tab_title));
        if (qqv.a(this.f28842a)) {
            this.o.setTitleSize(this.f28842a.getResources().getDimension(com.huawei.health.servicesui.R.dimen.textSizeHeadline7));
        } else {
            this.o.setTitleSize(this.f28842a.getResources().getDimension(com.huawei.health.servicesui.R.dimen.textSizeHeadline8));
        }
        this.o.setTitleTextColor(this.f28842a.getResources().getColor(R.color.common_dialog_title_text_color));
        this.o.setTitleBarBackgroundColor(ContextCompat.getColor(this.f28842a, R.color.common_white_0alpha));
        this.o.setRightButtonVisibility(8);
        this.o.setVisibility(0);
        if (this.e) {
            this.o.setTitleMarginStart(this.f28842a.getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.health_common_0dp));
        } else {
            this.o.setTitleMarginStart(this.f28842a.getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.emui_dimens_max_start));
        }
        this.o.setClickable(true);
        this.o.bringToFront();
        this.i.setScrollViewListener(d());
    }

    private ScrollViewListener d() {
        return new ScrollViewListener() { // from class: com.huawei.ui.main.stories.soical.MemberCenterFragment.2
            @Override // com.huawei.ui.commonui.scrollview.ScrollViewListener
            public void onScrollChanged(HealthScrollView healthScrollView, int i, int i2, int i3, int i4) {
                if (!healthScrollView.canScrollVertically(1) && System.currentTimeMillis() - MemberCenterFragment.this.h > 2000) {
                    MemberCenterFragment.this.h = SystemClock.elapsedRealtime();
                }
                if (i2 <= 0) {
                    MemberCenterFragment.this.o.setTitleTextColor(ContextCompat.getColor(MemberCenterFragment.this.f28842a, R.color.common_dialog_title_text_color));
                    MemberCenterFragment.this.o.setTitleBarBackgroundColor(ContextCompat.getColor(MemberCenterFragment.this.f28842a, R.color.common_white_0alpha));
                } else {
                    MemberCenterFragment.this.o.setTitleTextColor(ContextCompat.getColor(MemberCenterFragment.this.f28842a, R.color.textColorPrimary));
                    MemberCenterFragment.this.o.setTitleBarBackgroundColor(ContextCompat.getColor(MemberCenterFragment.this.f28842a, R.color.colorSubBackground));
                }
                if (MemberCenterFragment.this.getUserVisibleHint()) {
                    MemberCenterFragment.this.d(healthScrollView);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(HealthScrollView healthScrollView) {
        int scrollY = healthScrollView.getScrollY();
        int height = healthScrollView.getHeight();
        int paddingTop = healthScrollView.getPaddingTop();
        if (healthScrollView.getChildAt(0).getHeight() != ((scrollY + height) - paddingTop) - healthScrollView.getPaddingBottom() || System.currentTimeMillis() - this.h <= 1000) {
            return;
        }
        LogUtil.a("MemberCenterFragment", "scrolled to bottom");
        HashMap map = new HashMap();
        map.put("scroll", "1");
        map.put(CommonUtil.PAGE_TYPE, 2);
        lmf.d().c(BaseApplication.b(), AnalyticsValue.HEALTH_DISCOVER_SCROLL_TO_BOTTOM_2020014.value(), map, 0);
        lmf.d().b(BaseApplication.b());
        this.h = System.currentTimeMillis();
    }

    private void f() {
        LogUtil.a("MemberCenterFragment", "initKnitFragment");
        this.f = (LinearLayout) this.j.findViewById(R.id.knit_fragment_container);
        if (this.i != null) {
            return;
        }
        KnitFragment knitFragmentA = a();
        this.i = knitFragmentA;
        if (knitFragmentA == null) {
            LogUtil.e("MemberCenterFragment", "knitFragment is null");
            return;
        }
        knitFragmentA.setIsHideLoadingOnTimeout(false);
        this.i.setLoadingCallback(new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.soical.MemberCenterFragment.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("MemberCenterFragment", "loading callback: ", Integer.valueOf(i));
                MemberCenterFragment.this.b(i);
            }
        });
        getChildFragmentManager().beginTransaction().add(R.id.knit_fragment_container, this.i).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        HandlerExecutor.b(new Runnable() { // from class: com.huawei.ui.main.stories.soical.MemberCenterFragment.5
            @Override // java.lang.Runnable
            public void run() {
                if (!health.compact.a.CommonUtil.ab(MemberCenterFragment.this.f28842a)) {
                    MemberCenterFragment.this.m();
                } else {
                    MemberCenterFragment.this.n();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        qsp.c((View) this.k, 0);
        qsp.c((View) this.d, 8);
        qsp.c((View) this.g, 8);
        if (this.f28843b) {
            HandlerExecutor.c(new Runnable() { // from class: wnj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f52232c.b();
                }
            });
            this.f28843b = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void b() {
        LogUtil.a("MemberCenterFragment", "jumpTypeSelectActivity: ");
        Intent intent = new Intent(this.f28842a, (Class<?>) MemberTypeSelectActivity.class);
        intent.putExtra("memberTypeSelectUri", this.m);
        if (!isAdded()) {
            LogUtil.e("MemberCenterFragment", "jumpTypeSelectActivity mHost is null");
        } else {
            startActivity(intent);
            fca.b(this.f28842a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        qsp.c((View) this.k, 4);
        qsp.c((View) this.g, 8);
        qsp.c((View) this.d, 0);
    }

    private void g() {
        final MemberCenterBootPagerHelper memberCenterBootPagerHelper = new MemberCenterBootPagerHelper(this.f28842a);
        this.k.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.huawei.ui.main.stories.soical.MemberCenterFragment.8
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(final View view) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.ui.main.stories.soical.MemberCenterFragment.8.2
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        if (fxk.c(MemberCenterFragment.this.k)) {
                            LogUtil.a("MemberCenterFragment", "showBootPage enter.");
                            memberCenterBootPagerHelper.showBootPage();
                        }
                        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    }
                });
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                LogUtil.a("MemberCenterFragment", "layout detached from window");
                MemberCenterFragment.this.k.removeOnAttachStateChangeListener(this);
            }
        });
    }

    private void i() {
        qsp.b(this.d, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.soical.MemberCenterFragment.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.r()) {
                    return;
                }
                LogUtil.a("MemberCenterFragment", "click error layout");
                ObserverManagerUtil.e("REFRESH_DISCOVER_FRAGMENT", new Object[0]);
            }
        });
    }

    private KnitFragment a() {
        MainPageGroupConfig mainPageGroupConfigD = foc.d(getContext(), "MainPageSectionsConfig.json");
        if (mainPageGroupConfigD == null) {
            LogUtil.e("MemberCenterFragment", "addSubTagFragments cause pageGroupConfig is null!");
            return null;
        }
        ArrayList<MainPageConfig> pagesConfig = mainPageGroupConfigD.getPagesConfig();
        if (njy.e(pagesConfig)) {
            LogUtil.e("MemberCenterFragment", "addSubTagFragments cause pageConfigs is empty!");
            return null;
        }
        for (int i = 0; i < pagesConfig.size(); i++) {
            MainPageConfig mainPageConfig = pagesConfig.get(i);
            if (mainPageConfig == null) {
                LogUtil.e("MemberCenterFragment", "addSubTagFragments cause pageConfig1 is null!");
            } else {
                int pageType = mainPageConfig.getPageType();
                int resPosId = mainPageConfig.getResPosId();
                String strB = qqt.b(mainPageConfig);
                if (pageType == 31) {
                    MemberCenterPageResTrigger memberCenterPageResTrigger = new MemberCenterPageResTrigger(getContext(), resPosId, null);
                    this.l = memberCenterPageResTrigger;
                    return KnitFragment.newInstance(strB, memberCenterPageResTrigger);
                }
            }
        }
        return null;
    }

    @Override // com.huawei.health.marketing.views.IViewVisibilityChange
    public void onVisibilityChange(boolean z) {
        LogUtil.a("MemberCenterFragment", "onVisibilityChange: ", Boolean.valueOf(z));
        if (z) {
            fxr.b(new a(this));
            this.f28844c = System.currentTimeMillis();
        }
        if (z || this.f28844c == 0) {
            return;
        }
        h();
    }

    static class a implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<MemberCenterFragment> f28853a;

        public a(MemberCenterFragment memberCenterFragment) {
            this.f28853a = new WeakReference<>(memberCenterFragment);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            MemberCenterFragment memberCenterFragment = this.f28853a.get();
            if (memberCenterFragment == null) {
                LogUtil.j("MemberCenterFragment", "MemberOuterCallback is null");
                return;
            }
            boolean zB = (i == 0 && njy.b(obj, DeviceBenefits.class)) ? irz.b((List<DeviceBenefits>) obj) : false;
            LogUtil.a("MemberCenterFragment", "onVisibilityChange hasMemberEquity", Boolean.valueOf(zB));
            fcn.e(zB);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
                LogUtil.e("MemberCenterFragment", "InterruptedException");
            }
            fcn.b(memberCenterFragment.f28842a, memberCenterFragment.n);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getUserVisibleHint()) {
            this.f28844c = System.currentTimeMillis();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (getUserVisibleHint()) {
            h();
        }
    }

    private void h() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a("MemberCenterFragment", "setStayEvent: ", Long.valueOf(this.f28844c), " ", Long.valueOf(jCurrentTimeMillis));
        fcn.c(this.f28844c, jCurrentTimeMillis);
    }
}
