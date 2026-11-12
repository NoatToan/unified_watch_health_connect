package com.xiaomi.hm.health.bodyfat.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelProvider;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.xiaomi.hm.health.bodyfat.activity.MeasureFailureActivity;
import com.xiaomi.hm.health.bodyfat.callback.WeightingState;
import com.xiaomi.hm.health.bodyfat.databinding.FragmentMeasureBodyFailureBinding;
import com.xiaomi.hm.health.bodyfat.databinding.LayoutWeightTitleAndViewBinding;
import com.xiaomi.hm.health.bodyfat.fragment.MeasureBodyFailureFragment;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.StatEvent;
import com.xiaomi.hm.health.bodyfat.viewmodel.MainWeightingViewModel;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001f\u0010\u001b\u001a\u0004\u0018\u00010\u00168F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/MeasureBodyFailureFragment;", "Landroidx/fragment/app/Fragment;", "", "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentMeasureBodyFailureBinding;", "a", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentMeasureBodyFailureBinding;", "binding", "Lcom/xiaomi/hm/health/bodyfat/databinding/LayoutWeightTitleAndViewBinding;", "b", "Lcom/xiaomi/hm/health/bodyfat/databinding/LayoutWeightTitleAndViewBinding;", "includeBinding", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/MainWeightingViewModel;", "c", "Lkotlin/Lazy;", "getViewModel", "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/MainWeightingViewModel;", "viewModel", "<init>", "()V", "Companion", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class MeasureBodyFailureFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private FragmentMeasureBodyFailureBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private LayoutWeightTitleAndViewBinding includeBinding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/MeasureBodyFailureFragment$Companion;", "", "", "isGuest", "Lcom/xiaomi/hm/health/bodyfat/fragment/MeasureBodyFailureFragment;", "newInstance", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MeasureBodyFailureFragment newInstance(boolean isGuest) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("IS_GUEST", isGuest);
            MeasureBodyFailureFragment measureBodyFailureFragment = new MeasureBodyFailureFragment();
            measureBodyFailureFragment.setArguments(bundle);
            return measureBodyFailureFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/MainWeightingViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<MainWeightingViewModel> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MainWeightingViewModel invoke() {
            FragmentActivity activity = MeasureBodyFailureFragment.this.getActivity();
            if (activity == null) {
                return null;
            }
            return (MainWeightingViewModel) new ViewModelProvider(activity).get(MainWeightingViewModel.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(MeasureBodyFailureFragment measureBodyFailureFragment, View view) {
        measureBodyFailureFragment.startActivity(new Intent(measureBodyFailureFragment.getActivity(), (Class<?>) MeasureFailureActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(MeasureBodyFailureFragment measureBodyFailureFragment, View view) {
        MainWeightingViewModel viewModel = measureBodyFailureFragment.getViewModel();
        if (viewModel == null) {
            return;
        }
        viewModel.switchPage(WeightingState.state_weight_detail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(MeasureBodyFailureFragment measureBodyFailureFragment, View view) {
        MainWeightingViewModel viewModel = measureBodyFailureFragment.getViewModel();
        if (viewModel != null) {
            viewModel.abandonWeight();
        }
        FragmentActivity activity = measureBodyFailureFragment.getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    private final void initView() {
        MutableLiveData<WeightAdvData> weightData;
        WeightAdvData value;
        Analytics.recordEvent(new CountEventBuilder(StatEvent.Measure_BodyFat_Fail).setValue(StatEvent.Measure_Fail));
        MainWeightingViewModel viewModel = getViewModel();
        if (viewModel != null && (weightData = viewModel.getWeightData()) != null && (value = weightData.getValue()) != null) {
            LayoutWeightTitleAndViewBinding layoutWeightTitleAndViewBinding = this.includeBinding;
            Objects.requireNonNull(layoutWeightTitleAndViewBinding);
            layoutWeightTitleAndViewBinding.number.setText(HMWeightUtils.getWeightValueStringForDisplay(value.getValueKg(), value.getType()));
            LayoutWeightTitleAndViewBinding layoutWeightTitleAndViewBinding2 = this.includeBinding;
            Objects.requireNonNull(layoutWeightTitleAndViewBinding2);
            layoutWeightTitleAndViewBinding2.numberUnit.setText(HMWeightUtils.toUnitStr(getActivity(), value.getType()));
            LayoutWeightTitleAndViewBinding layoutWeightTitleAndViewBinding3 = this.includeBinding;
            Objects.requireNonNull(layoutWeightTitleAndViewBinding3);
            layoutWeightTitleAndViewBinding3.weightChart.setMaxValue(HMWeightUtils.getScaleMaxValue());
            LayoutWeightTitleAndViewBinding layoutWeightTitleAndViewBinding4 = this.includeBinding;
            Objects.requireNonNull(layoutWeightTitleAndViewBinding4);
            layoutWeightTitleAndViewBinding4.weightChart.setValue(value.getValueKg());
        }
        MainWeightingViewModel viewModel2 = getViewModel();
        boolean z = false;
        if (viewModel2 != null && viewModel2.getIsGuest()) {
            z = true;
        }
        if (z) {
            FragmentMeasureBodyFailureBinding fragmentMeasureBodyFailureBinding = this.binding;
            Objects.requireNonNull(fragmentMeasureBodyFailureBinding);
            fragmentMeasureBodyFailureBinding.weightingBfSave.setVisibility(8);
        }
        FragmentMeasureBodyFailureBinding fragmentMeasureBodyFailureBinding2 = this.binding;
        Objects.requireNonNull(fragmentMeasureBodyFailureBinding2);
        fragmentMeasureBodyFailureBinding2.weightingBfHelp.getPaint().setFlags(8);
        FragmentMeasureBodyFailureBinding fragmentMeasureBodyFailureBinding3 = this.binding;
        Objects.requireNonNull(fragmentMeasureBodyFailureBinding3);
        fragmentMeasureBodyFailureBinding3.weightingBfHelp.getPaint().setAntiAlias(true);
        FragmentMeasureBodyFailureBinding fragmentMeasureBodyFailureBinding4 = this.binding;
        Objects.requireNonNull(fragmentMeasureBodyFailureBinding4);
        fragmentMeasureBodyFailureBinding4.weightingBfHelp.setOnClickListener(new View.OnClickListener() { // from class: uv4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeasureBodyFailureFragment.d(this.a, view);
            }
        });
        FragmentMeasureBodyFailureBinding fragmentMeasureBodyFailureBinding5 = this.binding;
        Objects.requireNonNull(fragmentMeasureBodyFailureBinding5);
        fragmentMeasureBodyFailureBinding5.weightingBfSave.setOnClickListener(new View.OnClickListener() { // from class: tv4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeasureBodyFailureFragment.e(this.a, view);
            }
        });
        FragmentMeasureBodyFailureBinding fragmentMeasureBodyFailureBinding6 = this.binding;
        Objects.requireNonNull(fragmentMeasureBodyFailureBinding6);
        fragmentMeasureBodyFailureBinding6.weightingBfAbandon.setOnClickListener(new View.OnClickListener() { // from class: sv4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeasureBodyFailureFragment.f(this.a, view);
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final MainWeightingViewModel getViewModel() {
        return (MainWeightingViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentMeasureBodyFailureBinding fragmentMeasureBodyFailureBindingInflate = FragmentMeasureBodyFailureBinding.inflate(inflater);
        this.binding = fragmentMeasureBodyFailureBindingInflate;
        Objects.requireNonNull(fragmentMeasureBodyFailureBindingInflate);
        this.includeBinding = LayoutWeightTitleAndViewBinding.bind(fragmentMeasureBodyFailureBindingInflate.getRoot());
        FragmentMeasureBodyFailureBinding fragmentMeasureBodyFailureBinding = this.binding;
        Objects.requireNonNull(fragmentMeasureBodyFailureBinding);
        return fragmentMeasureBodyFailureBinding.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }
}
