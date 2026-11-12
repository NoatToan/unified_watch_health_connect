package com.xiaomi.hm.health.bodyfat.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.databinding.FragmentWeightExceptionBinding;
import com.xiaomi.hm.health.bodyfat.fragment.WeightingExceptionFragment;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.viewmodel.MainWeightingViewModel;
import com.xiaomi.hm.health.bt.model.MeasureState;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0016\u001a\u0004\u0018\u00010\u00118F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/WeightingExceptionFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "", "onViewCreated", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentWeightExceptionBinding;", "a", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentWeightExceptionBinding;", "binding", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/MainWeightingViewModel;", "b", "Lkotlin/Lazy;", "getViewModel", "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/MainWeightingViewModel;", "viewModel", "<init>", "()V", "Companion", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class WeightingExceptionFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int LOW_POWER = 145;
    public static final int OVER_LOAD = 144;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private FragmentWeightExceptionBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/WeightingExceptionFragment$Companion;", "", "", "type", "Lcom/xiaomi/hm/health/bodyfat/fragment/WeightingExceptionFragment;", "newInstance", "LOW_POWER", LogUtil.I, "OVER_LOAD", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WeightingExceptionFragment newInstance(int type) {
            Bundle bundle = new Bundle();
            bundle.putInt("type", type);
            WeightingExceptionFragment weightingExceptionFragment = new WeightingExceptionFragment();
            weightingExceptionFragment.setArguments(bundle);
            return weightingExceptionFragment;
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
            FragmentActivity activity = WeightingExceptionFragment.this.getActivity();
            if (activity == null) {
                return null;
            }
            return (MainWeightingViewModel) ViewModelProviders.of(activity).get(MainWeightingViewModel.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(WeightingExceptionFragment weightingExceptionFragment, WeightAdvData weightAdvData) {
        FragmentActivity activity;
        if (weightAdvData.getMeasureState() != MeasureState.MEASURING_FINISHED || (activity = weightingExceptionFragment.getActivity()) == null) {
            return;
        }
        activity.finish();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final MainWeightingViewModel getViewModel() {
        return (MainWeightingViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentWeightExceptionBinding fragmentWeightExceptionBindingInflate = FragmentWeightExceptionBinding.inflate(inflater);
        this.binding = fragmentWeightExceptionBindingInflate;
        Objects.requireNonNull(fragmentWeightExceptionBindingInflate);
        return fragmentWeightExceptionBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        MutableLiveData<WeightAdvData> weightData;
        MutableLiveData<WeightAdvData> weightData2;
        WeightAdvData value;
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        Integer numValueOf = arguments == null ? null : Integer.valueOf(arguments.getInt("type"));
        if (numValueOf != null && numValueOf.intValue() == 144) {
            Analytics.recordEvent(new CountEventBuilder(HMWeightUtils.getScaleAnalyticsType()).setValue("OL"));
            FragmentWeightExceptionBinding fragmentWeightExceptionBinding = this.binding;
            Objects.requireNonNull(fragmentWeightExceptionBinding);
            fragmentWeightExceptionBinding.imgFlag.setVisibility(8);
            FragmentWeightExceptionBinding fragmentWeightExceptionBinding2 = this.binding;
            Objects.requireNonNull(fragmentWeightExceptionBinding2);
            fragmentWeightExceptionBinding2.weightTitle.setText(R.string.weight_overload_title);
            FragmentWeightExceptionBinding fragmentWeightExceptionBinding3 = this.binding;
            Objects.requireNonNull(fragmentWeightExceptionBinding3);
            fragmentWeightExceptionBinding3.number.setText(getString(R.string.text_weight_overload_value));
            int scaleMaxValue = HMWeightUtils.getScaleMaxValue();
            MainWeightingViewModel viewModel = getViewModel();
            int type = (viewModel == null || (weightData2 = viewModel.getWeightData()) == null || (value = weightData2.getValue()) == null) ? 0 : value.getType();
            FragmentWeightExceptionBinding fragmentWeightExceptionBinding4 = this.binding;
            Objects.requireNonNull(fragmentWeightExceptionBinding4);
            fragmentWeightExceptionBinding4.tips.setText(getString(R.string.over_max_range_weight, HMWeightUtils.getWeightMaxWithUnitText(type)));
            FragmentWeightExceptionBinding fragmentWeightExceptionBinding5 = this.binding;
            Objects.requireNonNull(fragmentWeightExceptionBinding5);
            float f = scaleMaxValue;
            fragmentWeightExceptionBinding5.weightChart.setMaxValue(f);
            FragmentWeightExceptionBinding fragmentWeightExceptionBinding6 = this.binding;
            Objects.requireNonNull(fragmentWeightExceptionBinding6);
            fragmentWeightExceptionBinding6.weightChart.setValue(f);
        } else if (numValueOf != null && numValueOf.intValue() == 145) {
            Analytics.recordEvent(new CountEventBuilder(HMWeightUtils.getScaleAnalyticsType()).setValue("Low"));
            FragmentWeightExceptionBinding fragmentWeightExceptionBinding7 = this.binding;
            Objects.requireNonNull(fragmentWeightExceptionBinding7);
            fragmentWeightExceptionBinding7.number.setVisibility(8);
            FragmentWeightExceptionBinding fragmentWeightExceptionBinding8 = this.binding;
            Objects.requireNonNull(fragmentWeightExceptionBinding8);
            fragmentWeightExceptionBinding8.weightTitle.setText(getString(R.string.battery_low));
            FragmentWeightExceptionBinding fragmentWeightExceptionBinding9 = this.binding;
            Objects.requireNonNull(fragmentWeightExceptionBinding9);
            fragmentWeightExceptionBinding9.imgFlag.setImageResource(R.drawable.weight_low_power);
            FragmentWeightExceptionBinding fragmentWeightExceptionBinding10 = this.binding;
            Objects.requireNonNull(fragmentWeightExceptionBinding10);
            fragmentWeightExceptionBinding10.tips.setText(getString(R.string.please_replace_battery));
        }
        MainWeightingViewModel viewModel2 = getViewModel();
        if (viewModel2 == null || (weightData = viewModel2.getWeightData()) == null) {
            return;
        }
        weightData.observe(getViewLifecycleOwner(), new Observer() { // from class: xt8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeightingExceptionFragment.b(this.a, (WeightAdvData) obj);
            }
        });
    }
}
