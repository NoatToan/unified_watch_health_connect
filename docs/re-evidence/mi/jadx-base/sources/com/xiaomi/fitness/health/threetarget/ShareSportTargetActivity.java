package com.xiaomi.fitness.health.threetarget;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.xiaomi.fitness.health.threetarget.ShareSportTargetActivity;
import com.xiaomi.fitness.health.threetarget.adpter.ShareSportTargetTabAdapter;
import com.xiaomi.fitness.health.threetarget.viewmodel.ShareSportTagetViewModel;
import defpackage.c0j;
import defpackage.jui;
import defpackage.znb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import miuix.miuixbasewidget.widget.FilterSortView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/ShareSportTargetActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/health/threetarget/viewmodel/ShareSportTagetViewModel;", "Lznb;", "", "bindView", "(Lznb;)V", "Lcom/xiaomi/fitness/health/threetarget/adpter/ShareSportTargetTabAdapter;", "pagerAdapter", "Lcom/xiaomi/fitness/health/threetarget/adpter/ShareSportTargetTabAdapter;", "", "Landroidx/fragment/app/Fragment;", "fragmentList", "Ljava/util/List;", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "()V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class ShareSportTargetActivity extends Hilt_ShareSportTargetActivity<ShareSportTagetViewModel, znb> {

    @NotNull
    public static final String sDate = "sDate";

    @NotNull
    private List<Fragment> fragmentList = new ArrayList();

    @Nullable
    private ShareSportTargetTabAdapter pagerAdapter;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(znb this_bindView, View view) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        ViewPager viewPager = this_bindView.B;
        Object tag = view.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
        viewPager.setCurrentItem(((Integer) tag).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(znb this_bindView, View view) {
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        ViewPager viewPager = this_bindView.B;
        Object tag = view.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
        viewPager.setCurrentItem(((Integer) tag).intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, android.view.View, miuix.miuixbasewidget.widget.FilterSortView$TabView] */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final znb znbVar) {
        Intrinsics.checkNotNullParameter(znbVar, "<this>");
        setTitle(c0j.ar);
        this.fragmentList.add(new ShareSportTagetDayFragment());
        this.fragmentList.add(new ShareSportTagetMonthFragment());
        Iterator<Fragment> it = this.fragmentList.iterator();
        while (it.hasNext()) {
            it.next().setArguments(getIntent().getExtras());
        }
        ShareSportTargetTabAdapter shareSportTargetTabAdapter = new ShareSportTargetTabAdapter(getSupportFragmentManager(), this.fragmentList);
        this.pagerAdapter = shareSportTargetTabAdapter;
        znbVar.B.setAdapter(shareSportTargetTabAdapter);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? K = znbVar.A.k(getString(c0j.Rc));
        objectRef.element = K;
        K.setTag(0);
        ((FilterSortView.TabView) objectRef.element).setOnClickListener(new View.OnClickListener() { // from class: u9m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShareSportTargetActivity.bindView$lambda$0(znbVar, view);
            }
        });
        final FilterSortView.TabView tabViewK = znbVar.A.k(getString(c0j.common_month));
        tabViewK.setTag(1);
        tabViewK.setOnClickListener(new View.OnClickListener() { // from class: v9m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShareSportTargetActivity.bindView$lambda$1(znbVar, view);
            }
        });
        znbVar.A.setFilteredTab((FilterSortView.TabView) objectRef.element);
        znbVar.B.addOnPageChangeListener(new ViewPager.i() { // from class: com.xiaomi.fitness.health.threetarget.ShareSportTargetActivity.bindView.3
            @Override // androidx.viewpager.widget.ViewPager.i
            public void onPageScrollStateChanged(int state) {
            }

            @Override // androidx.viewpager.widget.ViewPager.i
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override // androidx.viewpager.widget.ViewPager.i
            public void onPageSelected(int position) {
                if (position == 0) {
                    znbVar.A.setFilteredTab(objectRef.element);
                } else {
                    znbVar.A.setFilteredTab(tabViewK);
                }
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.E2;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }
}
