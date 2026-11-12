package com.huawei.health.knit.section.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.model.KnitPageConfig;
import com.huawei.health.knit.model.KnitPageGroupConfig;
import com.huawei.health.knit.model.KnitSubPageConfig;
import com.huawei.health.knit.section.listener.BasePageResTrigger;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.tablayout.HealthTabLayout;
import com.huawei.ui.commonui.viewpager.HealthNativeViewPager;
import defpackage.foc;
import defpackage.lmf;
import defpackage.njy;
import defpackage.peh;
import defpackage.qqf;
import defpackage.qqw;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class SectionTabSwitch extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Integer> f7957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f7958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f7959c;
    private boolean d;
    private List<Integer> e;
    private HealthTabLayout f;
    private HealthCardView g;
    private HealthImageView h;
    private HealthImageView i;
    private int j;
    private Drawable k;
    private View l;
    private e m;
    private HealthNativeViewPager n;

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected boolean isSupportSafeRegion() {
        return false;
    }

    public SectionTabSwitch(Context context) {
        this(context, null);
    }

    public SectionTabSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionTabSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        d();
        return this.l;
    }

    private void d() {
        if (this.l == null) {
            try {
                LogUtil.j("SectionTabSwitch", "initView mainView is null, start to inflate");
                View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.section_tab_switch, (ViewGroup) this, false);
                this.l = viewInflate;
                this.f = (HealthTabLayout) viewInflate.findViewById(R.id.section_tab_switch_tablayout);
                HealthCardView healthCardView = (HealthCardView) this.l.findViewById(R.id.tab_card_view);
                this.g = healthCardView;
                if (healthCardView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
                    int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.defaultPaddingStart);
                    int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.defaultPaddingEnd);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.g.getLayoutParams();
                    marginLayoutParams.setMarginStart(dimensionPixelSize + ((Integer) safeRegionWidth.first).intValue());
                    marginLayoutParams.setMarginEnd(dimensionPixelSize2 + ((Integer) safeRegionWidth.second).intValue());
                    this.g.setLayoutParams(marginLayoutParams);
                }
                HealthNativeViewPager healthNativeViewPager = (HealthNativeViewPager) this.l.findViewById(R.id.section_tab_switch_view_pager);
                this.n = healthNativeViewPager;
                healthNativeViewPager.setOffscreenPageLimit(1);
                this.n.setIsAutoAdjustItemHeight(true);
                LogUtil.j("SectionTabSwitch", "initView mainView is null, end to inflate");
            } catch (IllegalArgumentException e2) {
                LogUtil.e("SectionTabSwitch", "initSectionWebView exception. msg = ", e2.getMessage());
            } catch (NullPointerException e3) {
                LogUtil.e("SectionTabSwitch", "NullPointerException occurs. msg = ", e3.getMessage());
            }
        }
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "SectionTabSwitch";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public void bindParamsToView(HashMap<String, Object> map) {
        LogUtil.a("SectionTabSwitch", "start to bindViewParams, ", this);
        if (map == null || map.size() == 0) {
            LogUtil.a("SectionTabSwitch", "no need to bind");
            return;
        }
        d(map);
        if (!this.d) {
            this.d = true;
            b();
        } else {
            f();
        }
        h();
        i();
        LogUtil.a("SectionTabSwitch", "end to bind");
    }

    private void d(HashMap<String, Object> map) {
        this.f7959c = qqw.d((Map) map, "LEFT_ICON_TEXT", "");
        this.f7957a = qqw.a((Map) map, "RIGHT_ICON_IMAGE", Integer.class, (List) new ArrayList());
        this.f7958b = qqw.d((Map) map, "RIGHT_ICON_TEXT", "");
        this.e = qqw.a((Map) map, "ITEM_STATUS_BACKGROUND", Integer.class, (List) new ArrayList());
        this.k = qqw.c(map, "ITEM_TAG", (Drawable) null);
        this.j = qqw.c(map, "ITEM_RIGHT_BTN", 3);
    }

    private void b() {
        FragmentActivity activity = getKnitFragment().getActivity();
        if (activity == null || activity.isDestroyed()) {
            return;
        }
        e eVar = new e(getKnitFragment().getChildFragmentManager(), getKnitFragmentList());
        this.m = eVar;
        this.n.setAdapter(eVar);
        this.f.setupWithViewPager(this.n, true);
        a();
    }

    private void a() {
        if (this.f == null) {
            LogUtil.e("SectionTabSwitch", "mTabLayout is null");
            return;
        }
        View analysisRecView = getAnalysisRecView();
        View musicTabView = getMusicTabView();
        ArrayList arrayList = new ArrayList();
        arrayList.add(analysisRecView);
        arrayList.add(musicTabView);
        this.f.setCustomTabs(arrayList);
        e();
    }

    private View getAnalysisRecView() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.sleep_tab_layout, (ViewGroup) null);
        HealthCardView healthCardView = (HealthCardView) viewInflate.findViewById(R.id.tab_layout);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.sleep_tab_title);
        if (qrs.y()) {
            qrs.a(healthTextView);
        }
        if (this.e.size() == 2) {
            healthCardView.setCardBackgroundColor(ContextCompat.getColor(getContext(), this.e.get(0).intValue()));
            healthTextView.setTextColor(ContextCompat.getColor(getContext(), this.e.get(1).intValue()));
        }
        c(healthTextView);
        healthTextView.setText(this.f7959c);
        HealthImageView healthImageView = (HealthImageView) viewInflate.findViewById(R.id.sleep_tab_icon);
        Drawable drawable = this.k;
        if (drawable != null) {
            healthImageView.setImageDrawable(drawable);
            qsp.c((View) healthImageView, 0);
            return viewInflate;
        }
        qsp.c((View) healthImageView, 8);
        return viewInflate;
    }

    private View getMusicTabView() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.sleep_tab_layout, (ViewGroup) null);
        ((HealthCardView) viewInflate.findViewById(R.id.tab_layout)).setCardBackgroundColor((ColorStateList) null);
        this.i = (HealthImageView) viewInflate.findViewById(R.id.sleep_tab_icon_gif);
        this.h = (HealthImageView) viewInflate.findViewById(R.id.sleep_tab_icon);
        if (this.f7957a.size() == 2) {
            this.h.setImageDrawable(ContextCompat.getDrawable(getContext(), this.f7957a.get(1).intValue()));
            qqf.e(this.f7957a.get(0).intValue(), this.i);
            this.i.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = this.i.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                if (LanguageUtil.ba(BaseApplication.getContext())) {
                    layoutParams2.setMarginStart(0);
                    layoutParams2.setMarginEnd(0);
                } else {
                    layoutParams2.setMarginStart(0);
                    layoutParams2.setMarginEnd(BaseApplication.getContext().getResources().getDimensionPixelOffset(R.dimen.health_common_min_16dp));
                }
            }
        }
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.sleep_tab_title);
        if (qrs.y()) {
            qrs.a(healthTextView);
        }
        c(healthTextView);
        healthTextView.setText(this.f7958b);
        return viewInflate;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public List<Bitmap> getShareBitmap() {
        KnitFragment knitFragmentB = b(0);
        if (knitFragmentB != null) {
            return knitFragmentB.getShareBitmap();
        }
        return Collections.EMPTY_LIST;
    }

    public KnitFragment b(int i) {
        e eVar = this.m;
        if (eVar != null) {
            return (KnitFragment) eVar.getItem(i);
        }
        return null;
    }

    private void f() {
        HealthTabLayout healthTabLayout = this.f;
        if (healthTabLayout == null || healthTabLayout.getTabCount() < 2) {
            return;
        }
        TabLayout.Tab tabAt = this.f.getTabAt(0);
        TabLayout.Tab tabAt2 = this.f.getTabAt(1);
        if (this.j == 2 && tabAt2 != null) {
            tabAt2.select();
        }
        if (this.j != 1 || tabAt == null) {
            return;
        }
        tabAt.select();
    }

    private void h() {
        TabLayout.Tab tabAt;
        View customView;
        if (this.f.getTabAt(0) == null || (tabAt = this.f.getTabAt(0)) == null || (customView = tabAt.getCustomView()) == null) {
            return;
        }
        HealthImageView healthImageView = (HealthImageView) customView.findViewById(R.id.sleep_tab_icon);
        Drawable drawable = this.k;
        if (drawable == null) {
            qsp.c((View) healthImageView, 8);
        } else {
            qsp.a(healthImageView, drawable);
            qsp.c((View) healthImageView, 0);
        }
    }

    private void c(final HealthTextView healthTextView) {
        if (healthTextView == null || this.f == null) {
            return;
        }
        healthTextView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.knit.section.view.SectionTabSwitch.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (SectionTabSwitch.this.f == null) {
                    return;
                }
                if (qsp.e(healthTextView) && (SectionTabSwitch.this.f.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) SectionTabSwitch.this.f.getLayoutParams();
                    layoutParams.topMargin = qrs.d(SectionTabSwitch.this.getContext(), 0.0f);
                    layoutParams.bottomMargin = qrs.d(SectionTabSwitch.this.getContext(), 0.0f);
                    SectionTabSwitch.this.f.setLayoutParams(layoutParams);
                }
                healthTextView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }

    private List<Fragment> getKnitFragmentList() {
        ArrayList arrayList = new ArrayList();
        KnitPageGroupConfig knitPageGroupConfigC = foc.c(getContext(), KnitFragment.HEALTH_DETAIL_CONFIG_NAME);
        if (knitPageGroupConfigC == null) {
            return new ArrayList();
        }
        ArrayList<KnitPageConfig> pagesConfig = knitPageGroupConfigC.getPagesConfig();
        if (njy.e(pagesConfig)) {
            return new ArrayList();
        }
        for (int i = 0; i < pagesConfig.size(); i++) {
            KnitPageConfig knitPageConfig = pagesConfig.get(i);
            if (knitPageConfig != null) {
                int pageType = knitPageConfig.getPageType();
                ArrayList<KnitSubPageConfig> subPagesConfig = knitPageConfig.getSubPagesConfig();
                if (njy.e(subPagesConfig)) {
                    continue;
                } else {
                    KnitSubPageConfig knitSubPageConfig = subPagesConfig.get(0);
                    if (knitSubPageConfig == null) {
                        LogUtil.a("SectionTabSwitch", "config is null");
                        return new ArrayList();
                    }
                    if (pageType == 107) {
                        KnitFragment knitFragmentNewInstance = KnitFragment.newInstance(peh.c(knitSubPageConfig), new BasePageResTrigger(getContext(), knitSubPageConfig.getResPosId(), null), pageType);
                        knitFragmentNewInstance.registerMajorKnitFragment(getKnitFragment());
                        knitFragmentNewInstance.setIsRegisterForeverObserver(true);
                        arrayList.add(knitFragmentNewInstance);
                    }
                    if (pageType == 108) {
                        KnitFragment knitFragmentNewInstance2 = KnitFragment.newInstance(peh.c(knitSubPageConfig), new BasePageResTrigger(getContext(), knitSubPageConfig.getResPosId(), null), pageType);
                        knitFragmentNewInstance2.registerMajorKnitFragment(getKnitFragment());
                        knitFragmentNewInstance2.setIsRegisterForeverObserver(true);
                        arrayList.add(knitFragmentNewInstance2);
                    }
                }
            }
        }
        return arrayList;
    }

    private void e() {
        this.f.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: com.huawei.health.knit.section.view.SectionTabSwitch.1
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabReselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabSelected(TabLayout.Tab tab) {
                SectionTabSwitch.this.i();
                if (b(tab)) {
                    ObserverManagerUtil.e("BUBBLE_DISMISS", "BUBBLE_ON_MUSIC");
                    qsp.c((View) SectionTabSwitch.this.h, 0);
                    qsp.c((View) SectionTabSwitch.this.i, 8);
                    SectionTabSwitch.this.c();
                    return;
                }
                ObserverManagerUtil.e("BUBBLE_DISMISS", "SLEEP_RECOMMEND");
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabUnselected(TabLayout.Tab tab) {
                SectionTabSwitch.this.i();
            }

            private boolean b(TabLayout.Tab tab) {
                if (SectionTabSwitch.this.f.getTabCount() != 2) {
                    return false;
                }
                return Objects.equals(SectionTabSwitch.this.f.getTabAt(1), tab);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f.getTabAt(0) == null || this.f.getTabAt(1) == null) {
            return;
        }
        TabLayout.Tab tabAt = this.f.getTabAt(0);
        TabLayout.Tab tabAt2 = this.f.getTabAt(1);
        if (tabAt == null || tabAt2 == null) {
            return;
        }
        View customView = tabAt.getCustomView();
        View customView2 = tabAt2.getCustomView();
        if (customView == null || customView2 == null) {
            return;
        }
        e(tabAt, customView, customView2);
    }

    private void e(TabLayout.Tab tab, View view, View view2) {
        Typeface typefaceCreate = Typeface.create(BaseApplication.getContext().getString(R.string.textFontFamilyRegular), 0);
        Typeface typefaceCreate2 = Typeface.create(BaseApplication.getContext().getString(R.string.textFontFamilyMedium), 0);
        HealthCardView healthCardView = (HealthCardView) view.findViewById(R.id.tab_layout);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.sleep_tab_title);
        HealthCardView healthCardView2 = (HealthCardView) view2.findViewById(R.id.tab_layout);
        HealthTextView healthTextView2 = (HealthTextView) view2.findViewById(R.id.sleep_tab_title);
        if (healthCardView == null || healthTextView == null || healthTextView2 == null || healthCardView2 == null) {
            LogUtil.e("SectionTabSwitch", "view is null");
            return;
        }
        if (tab.isSelected()) {
            if (this.e.size() == 2) {
                healthCardView.setCardBackgroundColor(ContextCompat.getColor(getContext(), this.e.get(0).intValue()));
                healthTextView.setTextColor(ContextCompat.getColor(getContext(), this.e.get(1).intValue()));
                healthTextView.setTypeface(typefaceCreate2);
                healthTextView2.setTypeface(typefaceCreate);
            }
            healthCardView2.setCardBackgroundColor((ColorStateList) null);
            healthTextView2.setTextColor(ContextCompat.getColor(getContext(), R.color.sleep_tab_title_unSelected_color));
            qsp.c((View) this.h, 8);
            qsp.c((View) this.i, 0);
        } else {
            if (this.e.size() == 2) {
                healthCardView2.setCardBackgroundColor(ContextCompat.getColor(getContext(), this.e.get(0).intValue()));
                healthTextView2.setTextColor(ContextCompat.getColor(getContext(), this.e.get(1).intValue()));
                healthTextView2.setTypeface(typefaceCreate2);
                healthTextView.setTypeface(typefaceCreate);
            }
            healthCardView.setCardBackgroundColor((ColorStateList) null);
            healthTextView.setTextColor(ContextCompat.getColor(getContext(), R.color.sleep_tab_title_unSelected_color));
        }
        if (this.f7957a.size() == 2) {
            this.h.setImageDrawable(ContextCompat.getDrawable(getContext(), this.f7957a.get(1).intValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        HashMap map = new HashMap();
        map.put("click", "1");
        lmf.d().c(getContextRef(), AnalyticsValue.SLEEP_MUSIC_TAB_2030113.value(), map, 0);
    }

    static class e extends FragmentStatePagerAdapter {
        private List<Fragment> e;

        e(FragmentManager fragmentManager, List<Fragment> list) {
            super(fragmentManager);
            this.e = list;
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        public Fragment getItem(int i) {
            if (njy.e(this.e, i)) {
                return null;
            }
            Fragment fragment = njy.e(this.e) ? null : this.e.get(i);
            LogUtil.a("SectionTabSwitch", "getItem() position : ", Integer.valueOf(i), "    fragment : ", fragment);
            return fragment;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            List<Fragment> list = this.e;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }
}
