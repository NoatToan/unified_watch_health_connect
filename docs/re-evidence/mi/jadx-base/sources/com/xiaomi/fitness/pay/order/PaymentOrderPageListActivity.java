package com.xiaomi.fitness.pay.order;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.widget.ViewPager2;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.pay.order.PaymentOrderPageListActivity;
import defpackage.kmh;
import defpackage.r0j;
import defpackage.tji;
import defpackage.uui;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import miuix.miuixbasewidget.widget.FilterSortView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b&\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010%\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0014¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/pay/order/PaymentOrderPageListActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/pay/order/PaymentOrderPageListViewModel;", "Lkmh;", "", "initTab", "()V", "initFilterSortView", "setFilterTab", "", "position", "switchTab", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "viewModelId", "I", "getViewModelId", "()I", "layoutId", "getLayoutId", "Lmiuix/miuixbasewidget/widget/FilterSortView;", "filterSortView", "Lmiuix/miuixbasewidget/widget/FilterSortView;", "", "", "mTabTitles", "Ljava/util/List;", "", "Lmiuix/miuixbasewidget/widget/FilterSortView$TabView;", "tabViewMap", "Ljava/util/Map;", "defaultIndex$delegate", "Lkotlin/Lazy;", "getDefaultIndex", "defaultIndex", "<init>", "pay_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class PaymentOrderPageListActivity extends Hilt_PaymentOrderPageListActivity<PaymentOrderPageListViewModel, kmh> {
    private FilterSortView filterSortView;
    private final int viewModelId;
    private final int layoutId = uui.f36155a;

    @NotNull
    private final List<String> mTabTitles = new ArrayList();

    @NotNull
    private final Map<Integer, FilterSortView.TabView> tabViewMap = new LinkedHashMap();

    /* JADX INFO: renamed from: defaultIndex$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy defaultIndex = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: lph
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(PaymentOrderPageListActivity.defaultIndex_delegate$lambda$0(this.f25301a));
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final int defaultIndex_delegate$lambda$0(PaymentOrderPageListActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getIntent().getIntExtra("index", 0);
    }

    private final int getDefaultIndex() {
        return ((Number) this.defaultIndex.getValue()).intValue();
    }

    private final void initFilterSortView() {
        FilterSortView filterSortView = null;
        if (AppUtil.isRTLDirection()) {
            final int size = this.mTabTitles.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    break;
                }
                FilterSortView filterSortView2 = this.filterSortView;
                if (filterSortView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("filterSortView");
                    filterSortView2 = null;
                }
                FilterSortView.TabView tabViewK = filterSortView2.k(this.mTabTitles.get(size));
                this.tabViewMap.put(Integer.valueOf(size), tabViewK);
                tabViewK.setOnClickListener(new View.OnClickListener() { // from class: mph
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PaymentOrderPageListActivity.initFilterSortView$lambda$1(this.f27067a, size, view);
                    }
                });
            }
        } else {
            int size2 = this.mTabTitles.size();
            for (final int i = 0; i < size2; i++) {
                FilterSortView filterSortView3 = this.filterSortView;
                if (filterSortView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("filterSortView");
                    filterSortView3 = null;
                }
                FilterSortView.TabView tabViewK2 = filterSortView3.k(this.mTabTitles.get(i));
                this.tabViewMap.put(Integer.valueOf(i), tabViewK2);
                tabViewK2.setOnClickListener(new View.OnClickListener() { // from class: nph
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PaymentOrderPageListActivity.initFilterSortView$lambda$2(this.f28229a, i, view);
                    }
                });
            }
        }
        FilterSortView filterSortView4 = this.filterSortView;
        if (filterSortView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterSortView");
            filterSortView4 = null;
        }
        filterSortView4.setTabIncatorVisibility(8);
        FilterSortView.TabView tabView = this.tabViewMap.get(0);
        if (tabView != null) {
            FilterSortView filterSortView5 = this.filterSortView;
            if (filterSortView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("filterSortView");
            } else {
                filterSortView = filterSortView5;
            }
            filterSortView.setFilteredTab(tabView);
        }
        setFilterTab();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initFilterSortView$lambda$1(PaymentOrderPageListActivity this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.switchTab(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initFilterSortView$lambda$2(PaymentOrderPageListActivity this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.switchTab(i);
    }

    private final void initTab() {
        ListExtKt.add(this.mTabTitles, getString(r0j.V));
        ListExtKt.add(this.mTabTitles, getString(r0j.s));
        ListExtKt.add(this.mTabTitles, getString(r0j.J));
        initFilterSortView();
        switchTab(getDefaultIndex());
    }

    private final void setFilterTab() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void switchTab(int position) {
        ((kmh) getMBinding()).B.k(position, true);
        FilterSortView.TabView tabView = this.tabViewMap.get(Integer.valueOf(position));
        if (tabView != null) {
            FilterSortView filterSortView = this.filterSortView;
            if (filterSortView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("filterSortView");
                filterSortView = null;
            }
            filterSortView.setFilteredTab(tabView);
        }
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return this.layoutId;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return this.viewModelId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.pay.order.Hilt_PaymentOrderPageListActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitleBackground(tji.c);
        setTitle(r0j.C);
        setActionBarNormalTitleMode();
        FilterSortView tabLayout = ((kmh) getMBinding()).A;
        Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
        ViewPager2 viewPager = ((kmh) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        viewPager.setAdapter(new PaymentOrderFragmentAdapter(supportFragmentManager, lifecycle));
        viewPager.setUserInputEnabled(false);
        this.filterSortView = ((kmh) getMBinding()).A;
        initTab();
    }
}
