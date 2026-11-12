package com.huawei.pluginsocialshare.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.material.tabs.TabLayout;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.pluginsocialshare.R;
import com.huawei.pluginsocialshare.shareconfig.bean.PageViewModel;
import com.huawei.pluginsocialshare.shareconfig.bean.ShareViewModel;
import com.huawei.pluginsocialshare.view.BaseShareBottomView;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.bubblelayout.HealthBubbleLayout;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import defpackage.lrd;
import defpackage.pke;
import defpackage.pnd;
import defpackage.qre;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes42.dex */
public class ShareBottomSheetFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BaseShareBottomView f22601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BaseShareBottomView f22602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BaseShareBottomView f22603c;
    private HealthBubbleLayout d;
    private HealthBubbleLayout e;
    private ShareViewModel f;
    private Context g;
    private ShareTabLayout h;
    private PageViewModel i;
    private pke j;
    private List<View> l = new ArrayList();
    private HealthViewPager n;

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_bottom_sheet_layout, viewGroup, false);
        this.g = getContext();
        this.h = (ShareTabLayout) viewInflate.findViewById(R.id.share_bottom_tab_switch_layout);
        this.n = (HealthViewPager) viewInflate.findViewById(R.id.bottom_sheet_view_pager);
        this.f = (ShareViewModel) new ViewModelProvider(requireActivity()).get(ShareViewModel.class);
        PageViewModel pageViewModel = (PageViewModel) new ViewModelProvider(requireActivity()).get(PageViewModel.class);
        this.i = pageViewModel;
        pageViewModel.b().observe(getViewLifecycleOwner(), new Observer() { // from class: com.huawei.pluginsocialshare.view.ShareBottomSheetFragment$$ExternalSyntheticLambda3
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.d.e((Integer) obj);
            }
        });
        this.i.c().observe(getViewLifecycleOwner(), new Observer<Integer>() { // from class: com.huawei.pluginsocialshare.view.ShareBottomSheetFragment.5
            @Override // androidx.lifecycle.Observer
            public void b(Integer num) {
                ShareBottomSheetFragment.this.f22601a.onDeleteSticker(num.intValue());
            }
        });
        b();
        e();
        this.f.c().observe(getViewLifecycleOwner(), new Observer() { // from class: com.huawei.pluginsocialshare.view.ShareBottomSheetFragment$$ExternalSyntheticLambda4
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.e.a((pnd) obj);
            }
        });
        return viewInflate;
    }

    /* synthetic */ void e(final Integer num) {
        Arrays.asList(this.f22602b, this.f22603c, this.f22601a).stream().filter(new Predicate() { // from class: pox
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.nonNull((BaseShareBottomView) obj);
            }
        }).forEach(new Consumer() { // from class: poy
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((BaseShareBottomView) obj).onTemplateSelected(num.intValue());
            }
        });
    }

    /* synthetic */ void a(pnd pndVar) {
        this.n.setAlpha(Math.min(Math.max(pndVar.b() - pndVar.e(), 0.0f) / 40.0f, 1.0f));
    }

    private void b() {
        pke pkeVar = new pke(this.g, a());
        this.j = pkeVar;
        this.n.setAdapter(pkeVar);
        this.n.setIsScroll(false);
        this.n.setCurrentItem(1);
        this.n.setOffscreenPageLimit(2);
        this.n.addOnPageChangeListener(new HealthViewPager.OnPageChangeListener() { // from class: com.huawei.pluginsocialshare.view.ShareBottomSheetFragment.4
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                TabLayout.Tab tabAt;
                if (ShareBottomSheetFragment.this.h == null || (tabAt = ShareBottomSheetFragment.this.h.getTabAt(i)) == null) {
                    return;
                }
                tabAt.select();
            }
        });
    }

    private List<View> a() {
        ShareBottomDataView shareBottomDataView = new ShareBottomDataView(this.g);
        this.f22602b = shareBottomDataView;
        b(shareBottomDataView.getRootView());
        ShareBottomBgView shareBottomBgView = new ShareBottomBgView(this.g);
        this.f22603c = shareBottomBgView;
        shareBottomBgView.d(this.e);
        b(this.f22603c.getRootView());
        ShareBottomStickerView shareBottomStickerView = new ShareBottomStickerView(this.g);
        this.f22601a = shareBottomStickerView;
        b(shareBottomStickerView.getRootView());
        return this.l;
    }

    private void e() {
        if (BaseActivity.isMiui()) {
            this.h.setLayerType(1, null);
        }
        String[] strArr = {qre.f(R.string.IDS_hwh_motiontrack_indoor_running_develop_data), qre.f(R.string.IDS_hwh_edit_share_background), qre.f(R.string.IDS_hwh_edit_share_style)};
        for (int i = 0; i < 3; i++) {
            TabLayout.Tab tabNewTab = this.h.newTab();
            tabNewTab.setCustomView(R.layout.bottom_tab_custom_layout);
            View customView = tabNewTab.getCustomView();
            if (customView != null) {
                HealthCardView healthCardView = (HealthCardView) customView.findViewById(R.id.tab_item_card);
                TextView textView = (TextView) customView.findViewById(R.id.tab_text);
                textView.setText(strArr[i]);
                if (i == 1) {
                    tabNewTab.select();
                    healthCardView.setCardBackgroundColor(qre.e(R.color.share_color_bottom_sheet_tab_select_bg));
                    healthCardView.setElevation(3.0f);
                    textView.setTextColor(qre.e(R.color.share_color_bottom_sheet_tab_select_text));
                }
                this.h.addTab(tabNewTab);
            }
        }
        g();
    }

    private void g() {
        this.h.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: com.huawei.pluginsocialshare.view.ShareBottomSheetFragment.1
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabSelected(TabLayout.Tab tab) {
                View customView = tab.getCustomView();
                if (customView != null) {
                    HealthCardView healthCardView = (HealthCardView) customView.findViewById(R.id.tab_item_card);
                    healthCardView.setCardBackgroundColor(qre.e(R.color.share_color_bottom_sheet_tab_select_bg));
                    healthCardView.setElevation(3.0f);
                    TextView textView = (TextView) customView.findViewById(R.id.tab_text);
                    textView.setTextColor(qre.e(R.color.share_color_bottom_sheet_tab_select_text));
                    lrd.b(customView, TextUtils.isEmpty(textView.getText()) ? "" : textView.getText().toString());
                    ShareBottomSheetFragment.this.n.setCurrentItem(ShareBottomSheetFragment.this.h.getSelectedTabPosition());
                }
                ShareBottomSheetFragment.this.d();
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabUnselected(TabLayout.Tab tab) {
                View customView = tab.getCustomView();
                if (customView != null) {
                    HealthCardView healthCardView = (HealthCardView) customView.findViewById(R.id.tab_item_card);
                    healthCardView.setCardBackgroundColor(qre.e(R.color.share_color_bottom_sheet_tab_unselect_bg));
                    healthCardView.setElevation(0.0f);
                    TextView textView = (TextView) customView.findViewById(R.id.tab_text);
                    textView.setTextColor(qre.e(R.color.share_tab_background_unselected_text_color));
                    lrd.a(customView, (CharSequence) (TextUtils.isEmpty(textView.getText()) ? "" : textView.getText().toString()), false);
                }
                ShareBottomSheetFragment.this.d();
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabReselected(TabLayout.Tab tab) {
                ShareBottomSheetFragment.this.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        HealthBubbleLayout healthBubbleLayout = this.e;
        if (healthBubbleLayout != null) {
            healthBubbleLayout.setVisibility(8);
        }
        HealthBubbleLayout healthBubbleLayout2 = this.d;
        if (healthBubbleLayout2 != null) {
            healthBubbleLayout2.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        ThreadPoolManager.c().execute(new Runnable() { // from class: pow
            @Override // java.lang.Runnable
            public final void run() {
                pmn.e().h();
            }
        });
    }

    public void b(int i, Intent intent) {
        BaseShareBottomView baseShareBottomView = this.f22603c;
        if (baseShareBottomView == null) {
            return;
        }
        baseShareBottomView.onActivityResult(i, intent);
    }

    private void b(View view) {
        if (view == null) {
            return;
        }
        if (this.l == null) {
            this.l = new ArrayList();
        }
        this.l.add(view);
    }

    public void c(HealthBubbleLayout healthBubbleLayout, HealthBubbleLayout healthBubbleLayout2) {
        this.e = healthBubbleLayout;
        this.d = healthBubbleLayout2;
    }
}
