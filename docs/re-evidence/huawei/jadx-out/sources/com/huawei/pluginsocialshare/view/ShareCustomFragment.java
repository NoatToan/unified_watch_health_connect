package com.huawei.pluginsocialshare.view;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProvider;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.R;
import com.huawei.pluginsocialshare.shareconfig.bean.PageViewModel;
import com.huawei.pluginsocialshare.shareconfig.bean.ShareViewModel;
import com.huawei.pluginsocialshare.view.BaseSharePreView;
import com.huawei.pluginsocialshare.view.template.BaseShareTemplate;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.bubblelayout.HealthBubbleLayout;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.uikit.hwviewpager.widget.HwViewPager;
import defpackage.gxy;
import defpackage.jpg;
import defpackage.njy;
import defpackage.pjm;
import defpackage.pnq;
import defpackage.pns;
import defpackage.ppj;
import defpackage.ppk;
import defpackage.ppl;
import defpackage.ppr;
import defpackage.qto;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes42.dex */
public class ShareCustomFragment extends BaseFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ArrayList<BaseSharePreView> f22614b = new ArrayList<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f22615a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthDotsPageIndicator f22616c;
    private boolean d;
    private HealthBubbleLayout e;
    private List<jpg> f;
    private int g;
    private HealthViewPager h;
    private int i;
    private ShareViewModel j;
    private PageViewModel l;

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f22615a = getContext();
        this.j = (ShareViewModel) new ViewModelProvider(requireActivity()).get(ShareViewModel.class);
        this.l = (PageViewModel) new ViewModelProvider(requireActivity()).get(PageViewModel.class);
        gxy gxyVarC = pjm.c();
        if (gxyVarC == null) {
            return;
        }
        if (gxyVarC.k() != null) {
            this.f = gxyVarC.k().b();
        }
        this.i = gxyVarC.h();
        f22614b = new ArrayList<>();
    }

    public void c() {
        int currentItem = this.h.getCurrentItem();
        if (njy.e(f22614b, currentItem)) {
            LogUtil.e("Share_ShareCustomFragment", "onPause: position out of range:", Integer.valueOf(currentItem));
        } else {
            f22614b.get(currentItem).playerPause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        this.d = z;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        int currentItem = this.h.getCurrentItem();
        if (njy.e(f22614b, currentItem)) {
            LogUtil.e("Share_ShareCustomFragment", "onResume: position out of range:", Integer.valueOf(currentItem));
        } else {
            if (this.d) {
                return;
            }
            c(currentItem);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        int currentItem = this.h.getCurrentItem();
        if (njy.e(f22614b, currentItem)) {
            LogUtil.e("Share_ShareCustomFragment", "onDestroy: position out of range:", Integer.valueOf(currentItem));
        } else {
            f22614b.get(currentItem).playerRelease();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_share_custom_layout, viewGroup, false);
        this.h = (HealthViewPager) viewInflate.findViewById(R.id.data_view_pager);
        this.h.setAdapter(new qto(new ArrayList(i())));
        this.h.setTag(0);
        this.h.setOnTouchListener(new View.OnTouchListener() { // from class: ppa
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f45755c.c(view, motionEvent);
            }
        });
        g();
        return viewInflate;
    }

    public /* synthetic */ boolean c(View view, MotionEvent motionEvent) {
        f();
        return false;
    }

    public void d(HealthDotsPageIndicator healthDotsPageIndicator) {
        this.f22616c = healthDotsPageIndicator;
    }

    private void g() {
        if (this.h == null || this.l == null) {
            return;
        }
        this.f22616c.setOnPageChangeListener(new HwViewPager.OnPageChangeListener() { // from class: com.huawei.pluginsocialshare.view.ShareCustomFragment.5
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                ShareCustomFragment.this.h.setTag(Integer.valueOf(i));
                ShareCustomFragment.this.b(i);
                ShareCustomFragment.this.l.e(i);
            }
        });
        this.f22616c.setViewPager(this.h);
    }

    public View d() {
        HealthViewPager healthViewPager = this.h;
        if (healthViewPager == null) {
            ReleaseLogUtil.e("Share_ShareCustomFragment", "getShareContentView mViewPager is null ");
            return null;
        }
        int currentItem = healthViewPager.getCurrentItem();
        if (njy.e(f22614b, currentItem)) {
            ReleaseLogUtil.a("Share_ShareCustomFragment", "getDataContentView: position out of range:", Integer.valueOf(currentItem));
            return null;
        }
        View shareContentView = f22614b.get(currentItem).getShareContentView();
        ReleaseLogUtil.d("Share_ShareCustomFragment", "getShareContentView shareView is null?", Boolean.valueOf(shareContentView == null));
        return shareContentView;
    }

    public BaseShareTemplate.VideoInfoManager a() {
        HealthViewPager healthViewPager = this.h;
        if (healthViewPager == null) {
            return null;
        }
        int currentItem = healthViewPager.getCurrentItem();
        if (njy.e(f22614b, currentItem)) {
            LogUtil.e("Share_ShareCustomFragment", "getShareVideoUri: position out of range:", Integer.valueOf(currentItem));
            return null;
        }
        return f22614b.get(currentItem).getVideoInfoManager();
    }

    public void j() {
        b(this.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        if (njy.e(f22614b, i)) {
            LogUtil.a("Share_ShareCustomFragment", "showTips: position out of range:", Integer.valueOf(i));
            return;
        }
        this.g = i;
        c(i);
        f22614b.get(i).showTipInfo(i);
    }

    private void c(int i) {
        for (int i2 = 0; i2 < f22614b.size(); i2++) {
            if (i2 != i) {
                f22614b.get(i2).hidePage(i2);
            }
        }
        f22614b.get(i).playerStart(i);
    }

    private List<View> i() {
        e(new ppk(this.f22615a, this.e));
        e(new ppj(this.f22615a, this.e));
        e(new ppl(this.f22615a, this.e));
        if (pns.d(this.i, this.f)) {
            e(new ppr(this.f22615a, this.e));
        }
        for (int i = 0; i < f22614b.size(); i++) {
            f22614b.get(i).setPageId(i);
        }
        return (List) f22614b.stream().map(new Function() { // from class: ppc
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((BaseSharePreView) obj).getView();
            }
        }).filter(new Predicate() { // from class: poz
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.nonNull((View) obj);
            }
        }).collect(Collectors.toList());
    }

    private void e(BaseSharePreView baseSharePreView) {
        this.j.a(getViewLifecycleOwner(), baseSharePreView);
        a(baseSharePreView);
        baseSharePreView.setActivity(getActivity());
        baseSharePreView.setPageViewModel(this.l);
        f22614b.add(baseSharePreView);
    }

    private void a(BaseSharePreView baseSharePreView) {
        if (!pnq.j()) {
            baseSharePreView.setUserInfo(null, null);
        } else {
            baseSharePreView.setUserInfo(pnq.d(this.f22615a), pnq.a());
        }
    }

    private void f() {
        HealthBubbleLayout healthBubbleLayout = this.e;
        if (healthBubbleLayout != null) {
            healthBubbleLayout.setVisibility(8);
        }
    }

    public void d(HealthBubbleLayout healthBubbleLayout) {
        this.e = healthBubbleLayout;
    }

    public static ArrayList<BaseSharePreView> b() {
        return f22614b;
    }

    public static void e() {
        f22614b.clear();
    }
}
