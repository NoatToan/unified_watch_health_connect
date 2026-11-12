package com.xiaomi.fitness.rn.share.ui;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.ViewPager;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.rn.share.adapter.DeviceShareAdapter;
import com.xiaomi.fitness.rn.share.ui.DeviceShareActivity;
import com.xiaomi.fitness.rn.share.viewmodel.DeviceShareViewModel;
import defpackage.avi;
import defpackage.coi;
import defpackage.qvk;
import defpackage.w0j;
import defpackage.wc0;
import defpackage.xji;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import miuix.miuixbasewidget.widget.FilterSortView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001e\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/rn/share/ui/DeviceShareActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/rn/share/viewmodel/DeviceShareViewModel;", "Lqvk;", "", "updateFilterSortView", "()V", "bindView", "(Lqvk;)V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "", "isAcceptListEmpty", "setIsAcceptListEmpty", "(Z)V", "", "", "titles", "Ljava/util/List;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "fragments", "Z", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceShareActivity extends BaseBindingActivity<DeviceShareViewModel, qvk> {

    @NotNull
    public static final String sPageAcceptList = "acceptList";

    @NotNull
    public static final String sPageShareList = "shareList";

    @NotNull
    public static final String sSonPage = "sSonPage";

    @NotNull
    private List<String> titles = new ArrayList();

    @NotNull
    private List<BaseFragment> fragments = new ArrayList();
    private boolean isAcceptListEmpty = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$1(DeviceShareActivity this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$2(AcceptListFragment acceptListFragment, DeviceShareActivity this$0, View it) {
        View endView;
        View endView2;
        Intrinsics.checkNotNullParameter(acceptListFragment, "$acceptListFragment");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        acceptListFragment.changeMode();
        if (acceptListFragment.isDeleteMode()) {
            wc0 miuiActionBar = this$0.getMiuiActionBar();
            if (miuiActionBar != null && (endView2 = miuiActionBar.getEndView()) != null) {
                endView2.setBackgroundResource(coi.c);
            }
        } else {
            wc0 miuiActionBar2 = this$0.getMiuiActionBar();
            if (miuiActionBar2 != null && (endView = miuiActionBar2.getEndView()) != null) {
                endView.setBackgroundResource(coi.f5600a);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$3(qvk this_bindView, View view) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        ViewPager viewPager = this_bindView.B;
        Object tag = view.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
        viewPager.setCurrentItem(((Integer) tag).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$4(qvk this_bindView, View view) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        ViewPager viewPager = this_bindView.B;
        Object tag = view.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
        viewPager.setCurrentItem(((Integer) tag).intValue());
    }

    private final void updateFilterSortView() {
        ViewGroup.LayoutParams layoutParams = getMBinding().A.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.width = UIUtils.INSTANCE.isTabletAndLandscape(this) ? ExtUtilsKt.getDp(420) : -1;
        getMBinding().A.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, android.view.View, miuix.miuixbasewidget.widget.FilterSortView$TabView] */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final qvk qvkVar) {
        View endView;
        Intrinsics.checkNotNullParameter(qvkVar, "<this>");
        setTitle(w0j.q);
        setTitleBackground(xji.f39189a);
        String stringExtra = getIntent().getStringExtra(sSonPage);
        this.titles.clear();
        this.fragments.clear();
        this.fragments.add(new DeviceListFragment());
        final AcceptListFragment acceptListFragment = new AcceptListFragment();
        this.fragments.add(acceptListFragment);
        Bundle bundle = new Bundle();
        bundle.putInt("cancel_btn_res_id", coi.f5601b);
        bundle.putInt("save_btn_res_id", coi.f5600a);
        IActionBar.DefaultImpls.applyEditModeActionBar$default(this, bundle, new Function1() { // from class: qn6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceShareActivity.bindView$lambda$1(this.f31674a, (View) obj);
            }
        }, new Function1() { // from class: sn6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceShareActivity.bindView$lambda$2(acceptListFragment, this, (View) obj);
            }
        }, null, null, 24, null);
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null && (endView = miuiActionBar.getEndView()) != null) {
            endView.setVisibility(8);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? K = qvkVar.A.k(getString(w0j.y));
        objectRef.element = K;
        K.setTag(0);
        ((FilterSortView.TabView) objectRef.element).setOnClickListener(new View.OnClickListener() { // from class: un6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceShareActivity.bindView$lambda$3(qvkVar, view);
            }
        });
        final FilterSortView.TabView tabViewK = qvkVar.A.k(getString(w0j.e));
        tabViewK.setTag(1);
        tabViewK.setOnClickListener(new View.OnClickListener() { // from class: vn6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceShareActivity.bindView$lambda$4(qvkVar, view);
            }
        });
        updateFilterSortView();
        qvkVar.B.setOffscreenPageLimit(this.fragments.size());
        ViewPager viewPager = qvkVar.B;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        viewPager.setAdapter(new DeviceShareAdapter(supportFragmentManager, lifecycle, this.fragments, this.titles));
        qvkVar.B.addOnPageChangeListener(new ViewPager.i() { // from class: com.xiaomi.fitness.rn.share.ui.DeviceShareActivity.bindView.5
            @Override // androidx.viewpager.widget.ViewPager.i
            public void onPageScrollStateChanged(int state) {
            }

            @Override // androidx.viewpager.widget.ViewPager.i
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override // androidx.viewpager.widget.ViewPager.i
            public void onPageSelected(int position) {
                View endView2;
                View endView3;
                if (position == 0) {
                    qvkVar.A.setFilteredTab(objectRef.element);
                    wc0 miuiActionBar2 = this.getMiuiActionBar();
                    if (miuiActionBar2 == null || (endView3 = miuiActionBar2.getEndView()) == null) {
                        return;
                    }
                    endView3.setVisibility(8);
                    return;
                }
                qvkVar.A.setFilteredTab(tabViewK);
                wc0 miuiActionBar3 = this.getMiuiActionBar();
                if (miuiActionBar3 == null || (endView2 = miuiActionBar3.getEndView()) == null) {
                    return;
                }
                endView2.setVisibility(this.isAcceptListEmpty ? 8 : 0);
            }
        });
        if (Intrinsics.areEqual(stringExtra, sPageAcceptList)) {
            qvkVar.B.setCurrentItem(1);
            qvkVar.A.setFilteredTab(tabViewK);
        } else {
            qvkVar.B.setCurrentItem(0);
            qvkVar.A.setFilteredTab((FilterSortView.TabView) objectRef.element);
        }
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return avi.f3488a;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        updateFilterSortView();
    }

    public final void setIsAcceptListEmpty(boolean isAcceptListEmpty) {
        wc0 miuiActionBar;
        View endView;
        this.isAcceptListEmpty = isAcceptListEmpty;
        if (getMBinding().B.getCurrentItem() != 1 || (miuiActionBar = getMiuiActionBar()) == null || (endView = miuiActionBar.getEndView()) == null) {
            return;
        }
        endView.setVisibility(isAcceptListEmpty ? 8 : 0);
    }
}
