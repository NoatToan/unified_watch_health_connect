package com.xiaomi.fitness.health.curse;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.k;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.health.curse.CurseHistoryActivity;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.rnb;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import miuix.miuixbasewidget.widget.FilterSortView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b*\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u0019\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\tR\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010!\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030 0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/health/curse/CurseHistoryActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "", "initTabFragment", "()V", "initFilterSortView", "", "index", "addChildTab", "(I)V", "setFilterTab", "switchTab", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "layoutResID", "setContentView", "Lrnb;", "mBinding", "Lrnb;", "Lmiuix/miuixbasewidget/widget/FilterSortView;", "filterSortView", "Lmiuix/miuixbasewidget/widget/FilterSortView;", "", "Lmiuix/miuixbasewidget/widget/FilterSortView$TabView;", "tabViewMap", "Ljava/util/Map;", "", "", "mTabTitleList", "Ljava/util/List;", "Ljava/lang/Class;", "mFragmentClassList", "mPosition", "I", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "currentFragment", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "getLayoutId", "()I", "layoutId", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CurseHistoryActivity extends Hilt_CurseHistoryActivity {

    @Nullable
    private BaseFragment currentFragment;
    private FilterSortView filterSortView;
    private rnb mBinding;
    private int mPosition;

    @NotNull
    private final Map<Integer, FilterSortView.TabView> tabViewMap = new LinkedHashMap();

    @NotNull
    private final List<String> mTabTitleList = new ArrayList();

    @NotNull
    private final List<Class<?>> mFragmentClassList = new ArrayList();

    private final void addChildTab(final int index) {
        FilterSortView filterSortView = this.filterSortView;
        if (filterSortView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterSortView");
            filterSortView = null;
        }
        FilterSortView.TabView tabViewK = filterSortView.k(this.mTabTitleList.get(index));
        this.tabViewMap.put(Integer.valueOf(index), tabViewK);
        tabViewK.setOnClickListener(new View.OnClickListener() { // from class: k65
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws IllegalAccessException, InstantiationException {
                CurseHistoryActivity.addChildTab$lambda$0(this.f23510a, index, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addChildTab$lambda$0(CurseHistoryActivity this$0, int i, View view) throws IllegalAccessException, InstantiationException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mPosition = i;
        this$0.switchTab();
    }

    private final void initFilterSortView() throws IllegalAccessException, InstantiationException {
        if (AppUtil.isRTLDirection()) {
            int size = this.mTabTitleList.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    break;
                } else {
                    addChildTab(size);
                }
            }
        } else {
            int size2 = this.mTabTitleList.size();
            for (int i = 0; i < size2; i++) {
                addChildTab(i);
            }
        }
        FilterSortView filterSortView = this.filterSortView;
        if (filterSortView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterSortView");
            filterSortView = null;
        }
        filterSortView.setTabIncatorVisibility(8);
        setFilterTab();
        switchTab();
    }

    private final void initTabFragment() {
        ListExtKt.add(this.mTabTitleList, getString(c0j.x6));
        ListExtKt.add(this.mTabTitleList, getString(c0j.w6));
        ListExtKt.add(this.mFragmentClassList, CurseListFragment.class);
        ListExtKt.add(this.mFragmentClassList, CurseBarChartFragment.class);
    }

    private final void setFilterTab() {
        FilterSortView.TabView tabView;
        if (this.mPosition >= this.tabViewMap.size() || (tabView = this.tabViewMap.get(Integer.valueOf(this.mPosition))) == null) {
            return;
        }
        FilterSortView filterSortView = this.filterSortView;
        if (filterSortView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterSortView");
            filterSortView = null;
        }
        filterSortView.setFilteredTab(tabView);
    }

    private final void switchTab() throws IllegalAccessException, InstantiationException {
        int size = this.mFragmentClassList.size();
        int i = this.mPosition;
        if (i < 0 || i >= size) {
            Logger.i("CurseHistoryActivity", "switchTab position exception " + i);
            return;
        }
        k kVarO = getSupportFragmentManager().o();
        Intrinsics.checkNotNullExpressionValue(kVarO, "beginTransaction(...)");
        String name = this.mFragmentClassList.get(this.mPosition).getName();
        BaseFragment baseFragment = (BaseFragment) getSupportFragmentManager().l0(name);
        BaseFragment baseFragment2 = this.currentFragment;
        if (baseFragment2 != null) {
            Intrinsics.checkNotNull(baseFragment2);
            kVarO.t(baseFragment2);
        }
        if (baseFragment == null) {
            Object objNewInstance = this.mFragmentClassList.get(this.mPosition).newInstance();
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.view.BaseFragment");
            baseFragment = (BaseFragment) objNewInstance;
            kVarO.c(eri.V1, baseFragment, name);
        } else {
            kVarO.F(baseFragment);
        }
        kVarO.m();
        this.currentFragment = baseFragment;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return jui.B2;
    }

    @Override // com.xiaomi.fitness.health.curse.Hilt_CurseHistoryActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws IllegalAccessException, InstantiationException {
        super.onCreate(savedInstanceState);
        setActionBarExpandState(0);
        setActionBarResizeable(false);
        setTitle(c0j.W5);
        rnb rnbVar = this.mBinding;
        if (rnbVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
            rnbVar = null;
        }
        this.filterSortView = rnbVar.B;
        initTabFragment();
        initFilterSortView();
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void setContentView(int layoutResID) {
        rnb rnbVar = null;
        rnb rnbVarA0 = rnb.A0(getLayoutInflater(), null, false);
        this.mBinding = rnbVarA0;
        if (rnbVarA0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
        } else {
            rnbVar = rnbVarA0;
        }
        super.setContentView(rnbVar.getRoot());
    }
}
