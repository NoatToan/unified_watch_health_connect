package com.huami.sky.ui.realtime.weekplan.ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sky.ui.R;
import com.huami.sky.ui.databinding.FragmentWeekPlanEndBinding;
import com.huami.sky.ui.ext.SkyExtKt;
import com.huami.sky.ui.realtime.weekplan.ui.WeekPlanEndFragment;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007J2\u0010\u000e\u001a\u00020\u00022\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\nJ\u001a\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001e\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R$\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R$\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#¨\u0006("}, d2 = {"Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanEndFragment;", "Landroidx/fragment/app/Fragment;", "", "f", "", "xPosition", "m", "Landroid/view/View$OnClickListener;", "onClickListener", "setOnCloseListener", "Lkotlin/Function1;", "Landroid/view/View;", "onStartClickListener", "onEndClickListener", "setOnButtonClickListener", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/huami/sky/ui/databinding/FragmentWeekPlanEndBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "h", "()Lcom/huami/sky/ui/databinding/FragmentWeekPlanEndBinding;", "binding", "Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanProgressViewModel;", "b", "Lkotlin/Lazy;", "i", "()Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanProgressViewModel;", "model", "c", "Landroid/view/View$OnClickListener;", "onCloseClickListener", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function1;", "e", "<init>", "()V", "Companion", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class WeekPlanEndFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy model;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private View.OnClickListener onCloseClickListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Function1<? super View, Unit> onStartClickListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Function1<? super View, Unit> onEndClickListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanEndFragment$Companion;", "", "Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanEndFragment;", "newInstance", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final WeekPlanEndFragment newInstance() {
            return new WeekPlanEndFragment();
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(WeekPlanEndFragment.class), "binding", "getBinding()Lcom/huami/sky/ui/databinding/FragmentWeekPlanEndBinding;"));
        f = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WeekPlanEndFragment() {
        super(R.layout.fragment_week_plan_end);
        this.binding = FragmentViewBindingKt.viewBinding(new WeekPlanEndFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(FragmentWeekPlanEndBinding.class)));
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sky.ui.realtime.weekplan.ui.WeekPlanEndFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.model = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<WeekPlanProgressViewModel>() { // from class: com.huami.sky.ui.realtime.weekplan.ui.WeekPlanEndFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sky.ui.realtime.weekplan.ui.WeekPlanProgressViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final WeekPlanProgressViewModel getA() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(WeekPlanProgressViewModel.class), function0, objArr);
            }
        });
    }

    private final void f() {
        i().getEndXPositionLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: oq8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeekPlanEndFragment.g(this.a, (Float) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(WeekPlanEndFragment weekPlanEndFragment, Float f2) {
        weekPlanEndFragment.m(f2.floatValue());
    }

    private final FragmentWeekPlanEndBinding h() {
        return (FragmentWeekPlanEndBinding) this.binding.getValue(this, f[0]);
    }

    private final WeekPlanProgressViewModel i() {
        return (WeekPlanProgressViewModel) this.model.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(WeekPlanEndFragment weekPlanEndFragment, View view) {
        View.OnClickListener onClickListener = weekPlanEndFragment.onCloseClickListener;
        if (onClickListener == null) {
            return;
        }
        onClickListener.onClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(WeekPlanEndFragment weekPlanEndFragment, View view) {
        Function1<? super View, Unit> function1 = weekPlanEndFragment.onStartClickListener;
        if (function1 == null) {
            return;
        }
        function1.invoke(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(WeekPlanEndFragment weekPlanEndFragment, View view) {
        Function1<? super View, Unit> function1 = weekPlanEndFragment.onEndClickListener;
        if (function1 == null) {
            return;
        }
        function1.invoke(view);
    }

    private final void m(final float xPosition) {
        h().ivWeekplan.post(new Runnable() { // from class: pq8
            @Override // java.lang.Runnable
            public final void run() {
                WeekPlanEndFragment.n(this.a, xPosition);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(WeekPlanEndFragment weekPlanEndFragment, float f2) {
        ViewGroup.LayoutParams layoutParams = weekPlanEndFragment.h().ivWeekplan.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginStart(Math.abs(((int) f2) - (SkyExtKt.getDp(24) / 2)));
        weekPlanEndFragment.h().ivWeekplan.setLayoutParams(layoutParams2);
    }

    @JvmStatic
    @NotNull
    public static final WeekPlanEndFragment newInstance() {
        return INSTANCE.newInstance();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        h().ivWeekplanClose.setOnClickListener(new View.OnClickListener() { // from class: mq8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WeekPlanEndFragment.j(this.a, view2);
            }
        });
        h().btnWeekplanStart.setOnClickListener(new View.OnClickListener() { // from class: lq8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WeekPlanEndFragment.k(this.a, view2);
            }
        });
        h().btnWeekplanEnd.setOnClickListener(new View.OnClickListener() { // from class: nq8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WeekPlanEndFragment.l(this.a, view2);
            }
        });
        f();
    }

    public final void setOnButtonClickListener(@Nullable Function1<? super View, Unit> onStartClickListener, @Nullable Function1<? super View, Unit> onEndClickListener) {
        this.onStartClickListener = onStartClickListener;
        this.onEndClickListener = onEndClickListener;
    }

    public final void setOnCloseListener(@Nullable View.OnClickListener onClickListener) {
        this.onCloseClickListener = onClickListener;
    }
}
