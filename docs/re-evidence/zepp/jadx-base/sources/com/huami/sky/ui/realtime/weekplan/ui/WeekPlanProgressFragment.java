package com.huami.sky.ui.realtime.weekplan.ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.sky.lib.repo.weekplan.WeekPlanHint;
import com.huami.sky.lib.repo.weekplan.WeekPlanIntHint;
import com.huami.sky.lib.repo.weekplan.WeekPlanPluralIntHint;
import com.huami.sky.lib.repo.weekplan.WeekPlanRepoImpl;
import com.huami.sky.lib.repo.weekplan.WeekPlanStr;
import com.huami.sky.lib.repo.weekplan.WeekPlanStrHint;
import com.huami.sky.ui.R;
import com.huami.sky.ui.databinding.FragmentWeekplanProgressBinding;
import com.huami.sky.ui.ext.SkyExtKt;
import com.huami.sky.ui.realtime.weekplan.hint.WeekPlanHintConstant;
import com.huami.sky.ui.realtime.weekplan.ui.WeekPlanProgressFragment;
import com.huami.tools.log.HMLog;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\u001d\u0010\u0011\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanProgressFragment;", "Landroidx/fragment/app/Fragment;", "", "f", "Landroid/view/View$OnClickListener;", "onclick", "setOnCloseListener", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/huami/sky/ui/databinding/FragmentWeekplanProgressBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "l", "()Lcom/huami/sky/ui/databinding/FragmentWeekplanProgressBinding;", "viewBinding", "Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanProgressViewModel;", "b", "Lkotlin/Lazy;", hl.k, "()Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanProgressViewModel;", "model", "c", "Landroid/view/View$OnClickListener;", "onClick", "<init>", "()V", "Companion", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class WeekPlanProgressFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty viewBinding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy model;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private View.OnClickListener onClick;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanProgressFragment$Companion;", "", "Lcom/huami/sky/ui/realtime/weekplan/ui/WeekPlanProgressFragment;", "newInstance", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WeekPlanProgressFragment newInstance() {
            return new WeekPlanProgressFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "livedata boolean " + this.a;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(WeekPlanProgressFragment.class), "viewBinding", "getViewBinding()Lcom/huami/sky/ui/databinding/FragmentWeekplanProgressBinding;"));
        d = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WeekPlanProgressFragment() {
        super(R.layout.fragment_weekplan_progress);
        this.viewBinding = FragmentViewBindingKt.viewBinding(new WeekPlanProgressFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(FragmentWeekplanProgressBinding.class)));
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sky.ui.realtime.weekplan.ui.WeekPlanProgressFragment$special$$inlined$sharedViewModel$default$1
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
        this.model = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<WeekPlanProgressViewModel>() { // from class: com.huami.sky.ui.realtime.weekplan.ui.WeekPlanProgressFragment$special$$inlined$sharedViewModel$default$2
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
        k().getWeekPlanLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: uq8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeekPlanProgressFragment.h(this.a, (boolean[]) obj);
            }
        });
        k().getWeekPlanHintLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: rq8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeekPlanProgressFragment.i(this.a, (WeekPlanHint) obj);
            }
        });
        k().getXPositionLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: sq8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeekPlanProgressFragment.j(this.a, (Float) obj);
            }
        });
        k().getValidProgressLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: tq8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeekPlanProgressFragment.g(this.a, (Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(WeekPlanProgressFragment weekPlanProgressFragment, Integer num) {
        if (num == null) {
            return;
        }
        int iIntValue = num.intValue();
        weekPlanProgressFragment.l().progressWeekplan.setProgress(iIntValue);
        weekPlanProgressFragment.k().loadHintByProgress(iIntValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(WeekPlanProgressFragment weekPlanProgressFragment, boolean[] zArr) {
        for (boolean z : zArr) {
            HMLog.info(WeekPlanRepoImpl.TAG, new a(z));
        }
        weekPlanProgressFragment.l().progressWeekplan.setDoneArray(zArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(WeekPlanProgressFragment weekPlanProgressFragment, WeekPlanHint weekPlanHint) {
        if (weekPlanHint instanceof WeekPlanStr) {
            Integer num = WeekPlanHintConstant.INSTANCE.getWeekPlanHintMap$sky_ui_release().get(Integer.valueOf(((WeekPlanStr) weekPlanHint).getStrId()));
            if (num == null) {
                return;
            }
            weekPlanProgressFragment.l().tvWeekplanHint.setText(num.intValue());
            return;
        }
        if (weekPlanHint instanceof WeekPlanIntHint) {
            WeekPlanIntHint weekPlanIntHint = (WeekPlanIntHint) weekPlanHint;
            Integer num2 = WeekPlanHintConstant.INSTANCE.getWeekPlanHintMap$sky_ui_release().get(Integer.valueOf(weekPlanIntHint.getStrId()));
            if (num2 == null) {
                return;
            }
            weekPlanProgressFragment.l().tvWeekplanHint.setText(weekPlanProgressFragment.getString(num2.intValue(), Integer.valueOf(weekPlanIntHint.getValue())));
            return;
        }
        if (weekPlanHint instanceof WeekPlanStrHint) {
            WeekPlanStrHint weekPlanStrHint = (WeekPlanStrHint) weekPlanHint;
            Integer num3 = WeekPlanHintConstant.INSTANCE.getWeekPlanHintMap$sky_ui_release().get(Integer.valueOf(weekPlanStrHint.getStrId()));
            if (num3 == null) {
                return;
            }
            weekPlanProgressFragment.l().tvWeekplanHint.setText(weekPlanProgressFragment.getString(num3.intValue(), String.valueOf(weekPlanStrHint.getValue())));
            return;
        }
        if (weekPlanHint instanceof WeekPlanPluralIntHint) {
            WeekPlanPluralIntHint weekPlanPluralIntHint = (WeekPlanPluralIntHint) weekPlanHint;
            Integer num4 = WeekPlanHintConstant.INSTANCE.getWeekPlanHintMap$sky_ui_release().get(Integer.valueOf(weekPlanPluralIntHint.getStrId()));
            if (num4 == null) {
                return;
            }
            weekPlanProgressFragment.l().tvWeekplanHint.setText(weekPlanProgressFragment.getResources().getQuantityString(num4.intValue(), weekPlanPluralIntHint.getValue(), Integer.valueOf(weekPlanPluralIntHint.getValue())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(WeekPlanProgressFragment weekPlanProgressFragment, Float f) {
        ViewGroup.LayoutParams layoutParams = weekPlanProgressFragment.l().ivWeekplan.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginStart(Math.abs(((int) f.floatValue()) - (SkyExtKt.getDp(24) / 2)));
        weekPlanProgressFragment.l().ivWeekplan.setLayoutParams(layoutParams2);
    }

    private final WeekPlanProgressViewModel k() {
        return (WeekPlanProgressViewModel) this.model.getValue();
    }

    private final FragmentWeekplanProgressBinding l() {
        return (FragmentWeekplanProgressBinding) this.viewBinding.getValue(this, d[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(WeekPlanProgressFragment weekPlanProgressFragment, View view) {
        View.OnClickListener onClickListener = weekPlanProgressFragment.onClick;
        if (onClickListener == null) {
            return;
        }
        onClickListener.onClick(view);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        f();
        k().loadProgress();
        l().ivWeekplanClose.setOnClickListener(new View.OnClickListener() { // from class: qq8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WeekPlanProgressFragment.m(this.a, view2);
            }
        });
    }

    public final void setOnCloseListener(@NotNull View.OnClickListener onclick) {
        this.onClick = onclick;
    }
}
