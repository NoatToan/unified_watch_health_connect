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
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.xiaomi.hm.health.bodyfat.databinding.FragmentHeartratePressureBinding;
import com.xiaomi.hm.health.bodyfat.fragment.HeartRatePressureFragment;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.ExtentionUtilsKt;
import com.xiaomi.hm.health.bodyfat.viewmodel.BodyFatDetailsViewModel;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.HeartRate;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0016\u001a\u0004\u0018\u00010\u00118F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/HeartRatePressureFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "", "onViewCreated", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentHeartratePressureBinding;", "a", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentHeartratePressureBinding;", "binding", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/BodyFatDetailsViewModel;", "b", "Lkotlin/Lazy;", "getViewModel", "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/BodyFatDetailsViewModel;", "viewModel", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class HeartRatePressureFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private FragmentHeartratePressureBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/BodyFatDetailsViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<BodyFatDetailsViewModel> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BodyFatDetailsViewModel invoke() {
            FragmentActivity activity = HeartRatePressureFragment.this.getActivity();
            if (activity == null) {
                return null;
            }
            return (BodyFatDetailsViewModel) ViewModelProviders.of(activity).get(BodyFatDetailsViewModel.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final HeartRatePressureFragment heartRatePressureFragment, final WeightInfos weightInfos) {
        if (weightInfos == null) {
            FragmentHeartratePressureBinding fragmentHeartratePressureBinding = heartRatePressureFragment.binding;
            Objects.requireNonNull(fragmentHeartratePressureBinding);
            fragmentHeartratePressureBinding.viewHeartRate.setVisibility(8);
            FragmentHeartratePressureBinding fragmentHeartratePressureBinding2 = heartRatePressureFragment.binding;
            Objects.requireNonNull(fragmentHeartratePressureBinding2);
            fragmentHeartratePressureBinding2.viewPressure.setVisibility(8);
            return;
        }
        if (weightInfos.getHeartRate() > 0) {
            FragmentHeartratePressureBinding fragmentHeartratePressureBinding3 = heartRatePressureFragment.binding;
            Objects.requireNonNull(fragmentHeartratePressureBinding3);
            fragmentHeartratePressureBinding3.viewHeartRate.setVisibility(0);
            FragmentHeartratePressureBinding fragmentHeartratePressureBinding4 = heartRatePressureFragment.binding;
            Objects.requireNonNull(fragmentHeartratePressureBinding4);
            fragmentHeartratePressureBinding4.textHeartRate.setText(String.valueOf(weightInfos.getHeartRate()));
            FragmentHeartratePressureBinding fragmentHeartratePressureBinding5 = heartRatePressureFragment.binding;
            Objects.requireNonNull(fragmentHeartratePressureBinding5);
            fragmentHeartratePressureBinding5.viewHeartRate.setOnClickListener(new View.OnClickListener() { // from class: zy3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HeartRatePressureFragment.e(weightInfos, heartRatePressureFragment, view);
                }
            });
            FragmentHeartratePressureBinding fragmentHeartratePressureBinding6 = heartRatePressureFragment.binding;
            Objects.requireNonNull(fragmentHeartratePressureBinding6);
            fragmentHeartratePressureBinding6.viewHeartRate.setClickable(false);
        } else {
            FragmentHeartratePressureBinding fragmentHeartratePressureBinding7 = heartRatePressureFragment.binding;
            Objects.requireNonNull(fragmentHeartratePressureBinding7);
            fragmentHeartratePressureBinding7.viewHeartRate.setVisibility(8);
        }
        if (weightInfos.getPressure() <= 0) {
            FragmentHeartratePressureBinding fragmentHeartratePressureBinding8 = heartRatePressureFragment.binding;
            Objects.requireNonNull(fragmentHeartratePressureBinding8);
            fragmentHeartratePressureBinding8.viewPressure.setVisibility(8);
            return;
        }
        FragmentHeartratePressureBinding fragmentHeartratePressureBinding9 = heartRatePressureFragment.binding;
        Objects.requireNonNull(fragmentHeartratePressureBinding9);
        fragmentHeartratePressureBinding9.viewPressure.setVisibility(0);
        FragmentHeartratePressureBinding fragmentHeartratePressureBinding10 = heartRatePressureFragment.binding;
        Objects.requireNonNull(fragmentHeartratePressureBinding10);
        fragmentHeartratePressureBinding10.textPressure.setText(String.valueOf(weightInfos.getPressure()));
        FragmentHeartratePressureBinding fragmentHeartratePressureBinding11 = heartRatePressureFragment.binding;
        Objects.requireNonNull(fragmentHeartratePressureBinding11);
        fragmentHeartratePressureBinding11.viewPressure.setOnClickListener(new View.OnClickListener() { // from class: yy3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeartRatePressureFragment.f(this.a, weightInfos, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(WeightInfos weightInfos, HeartRatePressureFragment heartRatePressureFragment, View view) {
        HeartRate heartRate = new HeartRate();
        heartRate.setHr(Integer.valueOf(weightInfos.getHeartRate()));
        heartRate.setTime(Long.valueOf(ExtentionUtilsKt.millsToSecond$default(weightInfos.getTimestamp().longValue(), false, 1, null)));
        heartRate.setTime_zone(weightInfos.getTime_zone());
        heartRate.setDevice_id(weightInfos.getDevice_id());
        heartRate.setDevice_type(Integer.valueOf(HMDeviceType.WEIGHT.getValue()));
        heartRate.setDevice_source(Integer.valueOf(HMDeviceSource.WEIGHT_AMAZFIT_SCALE.getValue()));
        BFCallback.getInstance().launchHeartRateDetail(heartRatePressureFragment.getActivity(), heartRate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(HeartRatePressureFragment heartRatePressureFragment, WeightInfos weightInfos, View view) {
        BFCallback.getInstance().launchSingleStressDetail(heartRatePressureFragment.getContext(), weightInfos);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final BodyFatDetailsViewModel getViewModel() {
        return (BodyFatDetailsViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentHeartratePressureBinding fragmentHeartratePressureBindingInflate = FragmentHeartratePressureBinding.inflate(inflater);
        this.binding = fragmentHeartratePressureBindingInflate;
        Objects.requireNonNull(fragmentHeartratePressureBindingInflate);
        return fragmentHeartratePressureBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        MutableLiveData<WeightInfos> selectWeightInfo;
        super.onViewCreated(view, savedInstanceState);
        BodyFatDetailsViewModel viewModel = getViewModel();
        if (viewModel == null || (selectWeightInfo = viewModel.getSelectWeightInfo()) == null) {
            return;
        }
        selectWeightInfo.observe(getViewLifecycleOwner(), new Observer() { // from class: az3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HeartRatePressureFragment.d(this.a, (WeightInfos) obj);
            }
        });
    }
}
