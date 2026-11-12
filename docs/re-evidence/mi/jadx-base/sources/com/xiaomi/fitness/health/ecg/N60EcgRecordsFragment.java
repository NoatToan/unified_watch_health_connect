package com.xiaomi.fitness.health.ecg;

import android.os.Bundle;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.b;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.health.ecg.N60EcgRecordsFragment;
import com.xiaomi.fitness.health.hrm.HrmViewModel;
import com.xiaomi.fitness.util.AllRecordsPageUtilKt;
import defpackage.c0j;
import defpackage.jui;
import defpackage.qub;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/N60EcgRecordsFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/hrm/HrmViewModel;", "Lqub;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/google/android/material/tabs/TabLayout;", "tabLayout", "Lcom/google/android/material/tabs/TabLayout;", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "Lcom/xiaomi/fitness/health/ecg/N60EcgRecordsAdapter;", "adapter", "Lcom/xiaomi/fitness/health/ecg/N60EcgRecordsAdapter;", "", "getLayoutId", "()I", "layoutId", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class N60EcgRecordsFragment extends BaseBindingFragment<HrmViewModel, qub> {

    @Nullable
    private N60EcgRecordsAdapter adapter;

    @Nullable
    private TabLayout tabLayout;

    @Nullable
    private ViewPager2 viewPager;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(TabLayout.g tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        if (i == 0) {
            tab.u(c0j.ka);
        } else if (i == 1) {
            tab.u(c0j.Ja);
        } else {
            if (i != 2) {
                return;
            }
            tab.u(c0j.Ma);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.z3;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        AllRecordsPageUtilKt.setUpAllRecordsPageBasicUi$default(this, false, 2, null);
        this.tabLayout = getMBinding().A;
        this.viewPager = getMBinding().B;
        N60EcgRecordsAdapter n60EcgRecordsAdapter = new N60EcgRecordsAdapter(this);
        this.adapter = n60EcgRecordsAdapter;
        ViewPager2 viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            viewPager2.setAdapter(n60EcgRecordsAdapter);
        }
        ViewPager2 viewPager3 = this.viewPager;
        if (viewPager3 != null) {
            viewPager3.setUserInputEnabled(false);
        }
        TabLayout tabLayout = this.tabLayout;
        Intrinsics.checkNotNull(tabLayout);
        tabLayout.setTabMode(0);
        TabLayout tabLayout2 = this.tabLayout;
        Intrinsics.checkNotNull(tabLayout2);
        ViewPager2 viewPager4 = this.viewPager;
        Intrinsics.checkNotNull(viewPager4);
        new b(tabLayout2, viewPager4, new b.InterfaceC0219b() { // from class: zfg
            @Override // com.google.android.material.tabs.b.InterfaceC0219b
            public final void a(TabLayout.g gVar, int i) {
                N60EcgRecordsFragment.onViewCreated$lambda$0(gVar, i);
            }
        }).a();
    }
}
