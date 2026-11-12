package com.xiaomi.fitness.health.todayhealth.ui;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.base.EmptyBasicDataViewModel;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.sleep.utils.SleepInterpretationExtKt;
import com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel;
import com.xiaomi.fitness.health.todayhealth.ui.TodayHealthDayFragment;
import com.xiaomi.fitness.health.todayhealth.ui.items.TodayHealthItemAdapter;
import com.xiaomi.fitness.health.todayhealth.ui.items.VerticalItemDecoration;
import defpackage.c7a;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 ,2\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001,B\u0007¢\u0006\u0004\b+\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\u0006J!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0006J-\u0010\u0017\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/TodayHealthDayFragment;", "Lcom/xiaomi/fitness/base/BaseDataFragment;", "Lcom/xiaomi/fitness/base/EmptyBasicDataViewModel;", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "", "getBundle", "()V", "getDateIfBundleNull", "refreshDataBySelectedDate", "displayData", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onVisible", LifecycleConstantKt.ON_RESUME, "scrollToCurrentCycle", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lc7a;", "_binding", "Lc7a;", "Landroidx/recyclerview/widget/RecyclerView;", "detailItems", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter;", "adapter", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/TodayHealthItemAdapter;", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "sharedViewModel$delegate", "Lkotlin/Lazy;", "getSharedViewModel", "()Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "sharedViewModel", "getBinding", "()Lc7a;", "binding", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nTodayHealthDayFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodayHealthDayFragment.kt\ncom/xiaomi/fitness/health/todayhealth/ui/TodayHealthDayFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,143:1\n106#2,15:144\n*S KotlinDebug\n*F\n+ 1 TodayHealthDayFragment.kt\ncom/xiaomi/fitness/health/todayhealth/ui/TodayHealthDayFragment\n*L\n37#1:144,15\n*E\n"})
public final class TodayHealthDayFragment extends Hilt_TodayHealthDayFragment<EmptyBasicDataViewModel, RecyclerBarEntry> {

    @NotNull
    private static final String TAG = "HealthCheckItemsFragment";
    private c7a _binding;
    private TodayHealthItemAdapter adapter;
    private RecyclerView detailItems;

    /* JADX INFO: renamed from: sharedViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sharedViewModel;

    public TodayHealthDayFragment() {
        final Function0 function0 = new Function0() { // from class: tgp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TodayHealthDayFragment.sharedViewModel_delegate$lambda$0(this.f34684a);
            }
        };
        final Lazy lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.xiaomi.fitness.health.todayhealth.ui.TodayHealthDayFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function1 = null;
        this.sharedViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(HealthCheckViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.fitness.health.todayhealth.ui.TodayHealthDayFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m39viewModels$lambda1(lazy).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "owner.viewModelStore");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.xiaomi.fitness.health.todayhealth.ui.TodayHealthDayFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM39viewModels$lambda1 = FragmentViewModelLazyKt.m39viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM39viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM39viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.fitness.health.todayhealth.ui.TodayHealthDayFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM39viewModels$lambda1 = FragmentViewModelLazyKt.m39viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM39viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM39viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
    }

    private final c7a getBinding() {
        c7a c7aVar = this._binding;
        if (c7aVar != null) {
            return c7aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("_binding");
        return null;
    }

    private final void getBundle() {
        LocalDate localDate;
        Bundle arguments = getArguments();
        Logger.d(TAG, "getBundle bundle=" + arguments);
        if (arguments != null) {
            if (!arguments.getBoolean("calendar", false)) {
                localDate = null;
            } else if (Build.VERSION.SDK_INT >= 33) {
                localDate = (LocalDate) arguments.getSerializable("local_date", LocalDate.class);
            } else {
                Serializable serializable = arguments.getSerializable("local_date");
                Intrinsics.checkNotNull(serializable, "null cannot be cast to non-null type org.joda.time.LocalDate");
                localDate = (LocalDate) serializable;
            }
            this.mSelectDate = localDate;
            if (localDate == null) {
                getDateIfBundleNull();
            } else {
                Logger.d(TAG, "getBundle now mSelectDate=" + localDate + " date=" + localDate.toDate());
            }
        } else {
            getDateIfBundleNull();
        }
        setArguments(null);
    }

    private final void getDateIfBundleNull() {
        LocalDate value = getSharedViewModel().getLocalSelectDay().getValue() != null ? getSharedViewModel().getLocalSelectDay().getValue() : LocalDate.now();
        this.mSelectDate = value;
        Logger.d(TAG, "getBundle now mSelectDate=" + value + " date=" + value.toDate());
    }

    private final HealthCheckViewModel getSharedViewModel() {
        return (HealthCheckViewModel) this.sharedViewModel.getValue();
    }

    private final void refreshDataBySelectedDate() {
        if (Intrinsics.areEqual(getSharedViewModel().getLocalSelectDay().getValue(), this.mSelectDate) && Intrinsics.areEqual(getSharedViewModel().getIsRedraw(), Boolean.FALSE)) {
            Logger.i(TAG, "refreshDataBySelectedDate sharedViewModel.localSelectDay.value=" + getSharedViewModel().getLocalSelectDay().getValue() + " mSelectDate=" + this.mSelectDate + " sharedViewModel.isRedraw=" + getSharedViewModel().getIsRedraw());
            return;
        }
        if (Intrinsics.areEqual(getSharedViewModel().getIsRedraw(), Boolean.TRUE)) {
            getSharedViewModel().setRedraw(Boolean.FALSE);
        }
        Logger.d(TAG, "refreshDataBySelectedDate running");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.adapter = new TodayHealthItemAdapter(viewLifecycleOwner, getSharedViewModel());
        RecyclerView recyclerView = this.detailItems;
        TodayHealthItemAdapter todayHealthItemAdapter = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("detailItems");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView2 = this.detailItems;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("detailItems");
            recyclerView2 = null;
        }
        SleepInterpretationExtKt.clearAllItemDecorations(recyclerView2);
        RecyclerView recyclerView3 = this.detailItems;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("detailItems");
            recyclerView3 = null;
        }
        recyclerView3.addItemDecoration(new VerticalItemDecoration());
        RecyclerView recyclerView4 = this.detailItems;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("detailItems");
            recyclerView4 = null;
        }
        TodayHealthItemAdapter todayHealthItemAdapter2 = this.adapter;
        if (todayHealthItemAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            todayHealthItemAdapter2 = null;
        }
        recyclerView4.setAdapter(todayHealthItemAdapter2);
        TodayHealthItemAdapter todayHealthItemAdapter3 = this.adapter;
        if (todayHealthItemAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            todayHealthItemAdapter = todayHealthItemAdapter3;
        }
        LocalDate mSelectDate = this.mSelectDate;
        Intrinsics.checkNotNullExpressionValue(mSelectDate, "mSelectDate");
        todayHealthItemAdapter.refreshDate(mSelectDate);
        getSharedViewModel().getLocalSelectDay().setValue(this.mSelectDate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelStoreOwner sharedViewModel_delegate$lambda$0(TodayHealthDayFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Fragment fragmentRequireParentFragment = this$0.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    @Override // com.xiaomi.fitness.base.BaseDataFragment
    public void displayData() {
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = c7a.A0(inflater, container, false);
        this.detailItems = getBinding().A;
        View root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getBundle();
        refreshDataBySelectedDate();
        Logger.d(TAG, LifecycleConstantKt.ON_RESUME);
    }

    @Override // com.xiaomi.fitness.base.BaseDataFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        getSharedViewModel().setRedraw(Boolean.TRUE);
        super.onViewCreated(view, savedInstanceState);
    }

    @Override // com.xiaomi.fitness.base.BaseDataFragment, com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
    }

    @Override // com.xiaomi.fitness.base.BaseDataFragment
    public void scrollToCurrentCycle() {
    }
}
