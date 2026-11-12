package com.xiaomi.hm.health.bodyfat.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.callback.WeightingState;
import com.xiaomi.hm.health.bodyfat.databinding.FragmentMeasureBodyBinding;
import com.xiaomi.hm.health.bodyfat.databinding.LayoutWeightTitleAndViewBinding;
import com.xiaomi.hm.health.bodyfat.fragment.MeasureBodyFragment;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.ExtentionUtilsKt;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.viewmodel.MainWeightingViewModel;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.MeasureData;
import com.xiaomi.hm.health.bt.model.MeasureState;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u001c\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u000e8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001f\u0010+\u001a\u0004\u0018\u00010&8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/MeasureBodyFragment;", "Landroidx/fragment/app/Fragment;", "", "initViewModel", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "", "a", "Ljava/lang/String;", "getMTag", "()Ljava/lang/String;", "mTag", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentMeasureBodyBinding;", "b", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentMeasureBodyBinding;", "binding", "Lcom/xiaomi/hm/health/bodyfat/databinding/LayoutWeightTitleAndViewBinding;", "c", "Lcom/xiaomi/hm/health/bodyfat/databinding/LayoutWeightTitleAndViewBinding;", "includeBinding", GoogleApiAvailabilityLight.a, "prefix", "", "e", "Z", "measureBodyFatSuccess", "Lcom/xiaomi/hm/health/bt/model/MeasureState;", "f", "Lcom/xiaomi/hm/health/bt/model/MeasureState;", EcgData.MEASURE_STATE, "Lcom/xiaomi/hm/health/bodyfat/viewmodel/MainWeightingViewModel;", "g", "Lkotlin/Lazy;", "getViewModel", "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/MainWeightingViewModel;", "viewModel", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class MeasureBodyFragment extends Fragment {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private FragmentMeasureBodyBinding binding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private LayoutWeightTitleAndViewBinding includeBinding;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean measureBodyFatSuccess;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private MeasureState measureState;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String mTag = "WeightingHan";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String prefix = "MeasureBodyFragment";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new b());

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MeasureState.values().length];
            iArr[MeasureState.MEASURING_IMPEDANCE.ordinal()] = 1;
            iArr[MeasureState.MEASURING_HR.ordinal()] = 2;
            iArr[MeasureState.MEASURING_PRESSURE.ordinal()] = 3;
            iArr[MeasureState.MEASURING_FINISHED.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "测脂成功去匹配用户进入身体指数页面";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/MainWeightingViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<MainWeightingViewModel> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MainWeightingViewModel getA() {
            FragmentActivity activity = MeasureBodyFragment.this.getActivity();
            if (activity == null) {
                return null;
            }
            return (MainWeightingViewModel) new ViewModelProvider(activity).get(MainWeightingViewModel.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(MeasureBodyFragment measureBodyFragment, WeightAdvData weightAdvData) {
        MainWeightingViewModel viewModel;
        ExtentionUtilsKt.measureStateLog(measureBodyFragment.prefix, weightAdvData.getMeasureState(), weightAdvData.getMeasureData());
        MeasureState measureState = weightAdvData.getMeasureState();
        int i = measureState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[measureState.ordinal()];
        if (i == 1) {
            MeasureData measureData = weightAdvData.getMeasureData();
            Integer numValueOf = measureData == null ? null : Integer.valueOf(measureData.measureResult());
            if (numValueOf != null && numValueOf.intValue() == 2) {
                MainWeightingViewModel viewModel2 = measureBodyFragment.getViewModel();
                if (viewModel2 != null) {
                    viewModel2.switchPage(259);
                }
            } else if (numValueOf != null && numValueOf.intValue() == 1) {
                if (measureBodyFragment.measureBodyFatSuccess) {
                    return;
                }
                if (BFCallback.getHMDeviceManager().getBoundWeightDeviceSourceValue() == HMDeviceSource.WEIGHT_AMAZFIT_SCALE.getValue() && (viewModel = measureBodyFragment.getViewModel()) != null) {
                    viewModel.saveWeightData(weightAdvData);
                }
                if (HMWeightUtils.isFinishAfterMeasureBody()) {
                    HMLog.info(measureBodyFragment.getMTag(), a.a);
                    MainWeightingViewModel viewModel3 = measureBodyFragment.getViewModel();
                    if (viewModel3 != null) {
                        viewModel3.switchPage(WeightingState.state_bodyfat_detail);
                    }
                }
                measureBodyFragment.measureBodyFatSuccess = true;
            }
        } else if (i == 2) {
            MainWeightingViewModel viewModel4 = measureBodyFragment.getViewModel();
            if (viewModel4 != null) {
                viewModel4.switchPage(260);
            }
        } else if (i == 3) {
            MainWeightingViewModel viewModel5 = measureBodyFragment.getViewModel();
            if (viewModel5 != null) {
                viewModel5.switchPage(261);
            }
        } else if (i == 4) {
            if (measureBodyFragment.measureState == MeasureState.MEASURING_FINISHED) {
                return;
            }
            if (measureBodyFragment.measureBodyFatSuccess) {
                MainWeightingViewModel viewModel6 = measureBodyFragment.getViewModel();
                if (viewModel6 != null) {
                    viewModel6.switchPage(WeightingState.state_bodyfat_detail);
                }
            } else {
                MainWeightingViewModel viewModel7 = measureBodyFragment.getViewModel();
                if (viewModel7 != null && viewModel7.getIsGuest()) {
                    MainWeightingViewModel viewModel8 = measureBodyFragment.getViewModel();
                    if (viewModel8 != null) {
                        viewModel8.switchPage(259);
                    }
                } else {
                    MainWeightingViewModel viewModel9 = measureBodyFragment.getViewModel();
                    if (viewModel9 != null) {
                        viewModel9.switchPage(WeightingState.state_weight_detail);
                    }
                }
            }
        }
        measureBodyFragment.measureState = weightAdvData.getMeasureState();
    }

    private final void initViewModel() {
        MutableLiveData<WeightAdvData> weightData;
        MutableLiveData<WeightAdvData> weightData2;
        WeightAdvData value;
        LayoutWeightTitleAndViewBinding layoutWeightTitleAndViewBinding = this.includeBinding;
        Objects.requireNonNull(layoutWeightTitleAndViewBinding);
        layoutWeightTitleAndViewBinding.title.setText(getString(R.string.weight_babyfat_measuring));
        LayoutWeightTitleAndViewBinding layoutWeightTitleAndViewBinding2 = this.includeBinding;
        Objects.requireNonNull(layoutWeightTitleAndViewBinding2);
        layoutWeightTitleAndViewBinding2.bodyfatView.show();
        MainWeightingViewModel viewModel = getViewModel();
        if (viewModel != null && (weightData2 = viewModel.getWeightData()) != null && (value = weightData2.getValue()) != null) {
            LayoutWeightTitleAndViewBinding layoutWeightTitleAndViewBinding3 = this.includeBinding;
            Objects.requireNonNull(layoutWeightTitleAndViewBinding3);
            layoutWeightTitleAndViewBinding3.number.setText(HMWeightUtils.getWeightValueStringForDisplay(value.getValueKg(), value.getType()));
            LayoutWeightTitleAndViewBinding layoutWeightTitleAndViewBinding4 = this.includeBinding;
            Objects.requireNonNull(layoutWeightTitleAndViewBinding4);
            layoutWeightTitleAndViewBinding4.numberUnit.setText(HMWeightUtils.toUnitStr(getActivity(), value.getType()));
            LayoutWeightTitleAndViewBinding layoutWeightTitleAndViewBinding5 = this.includeBinding;
            Objects.requireNonNull(layoutWeightTitleAndViewBinding5);
            layoutWeightTitleAndViewBinding5.weightChart.setMaxValue(HMWeightUtils.getScaleMaxValue());
            LayoutWeightTitleAndViewBinding layoutWeightTitleAndViewBinding6 = this.includeBinding;
            Objects.requireNonNull(layoutWeightTitleAndViewBinding6);
            layoutWeightTitleAndViewBinding6.weightChart.setValue(value.getValueKg());
        }
        MainWeightingViewModel viewModel2 = getViewModel();
        if (viewModel2 == null || (weightData = viewModel2.getWeightData()) == null) {
            return;
        }
        weightData.observe(getViewLifecycleOwner(), new Observer() { // from class: vv4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MeasureBodyFragment.b(this.a, (WeightAdvData) obj);
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @NotNull
    public final String getMTag() {
        return this.mTag;
    }

    @Nullable
    public final MainWeightingViewModel getViewModel() {
        return (MainWeightingViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentMeasureBodyBinding fragmentMeasureBodyBindingInflate = FragmentMeasureBodyBinding.inflate(inflater);
        this.binding = fragmentMeasureBodyBindingInflate;
        Objects.requireNonNull(fragmentMeasureBodyBindingInflate);
        this.includeBinding = LayoutWeightTitleAndViewBinding.bind(fragmentMeasureBodyBindingInflate.getRoot());
        FragmentMeasureBodyBinding fragmentMeasureBodyBinding = this.binding;
        Objects.requireNonNull(fragmentMeasureBodyBinding);
        return fragmentMeasureBodyBinding.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViewModel();
    }
}
