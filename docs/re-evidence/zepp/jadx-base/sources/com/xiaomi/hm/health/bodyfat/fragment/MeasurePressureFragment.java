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
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.callback.WeightingState;
import com.xiaomi.hm.health.bodyfat.databinding.FragmentOptionParamMeasureBinding;
import com.xiaomi.hm.health.bodyfat.databinding.LayoutWeightTitleAndViewBinding;
import com.xiaomi.hm.health.bodyfat.fragment.MeasurePressureFragment;
import com.xiaomi.hm.health.bodyfat.utils.ExtentionUtilsKt;
import com.xiaomi.hm.health.bodyfat.viewmodel.MainWeightingViewModel;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u001c\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001f\u0010'\u001a\u0004\u0018\u00010\"8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/MeasurePressureFragment;", "Landroidx/fragment/app/Fragment;", "", "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "", "a", "Ljava/lang/String;", "getMTag", "()Ljava/lang/String;", "mTag", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentOptionParamMeasureBinding;", "b", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentOptionParamMeasureBinding;", "binding", "Lcom/xiaomi/hm/health/bodyfat/databinding/LayoutWeightTitleAndViewBinding;", "c", "Lcom/xiaomi/hm/health/bodyfat/databinding/LayoutWeightTitleAndViewBinding;", "includeBinding", GoogleApiAvailabilityLight.a, "prefix", "", "e", "Z", "measurePressureResult", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/MainWeightingViewModel;", "f", "Lkotlin/Lazy;", "getViewModel", "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/MainWeightingViewModel;", "viewModel", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class MeasurePressureFragment extends Fragment {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private FragmentOptionParamMeasureBinding binding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private LayoutWeightTitleAndViewBinding includeBinding;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean measurePressureResult;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String mTag = "WeightingHan";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private String prefix = "measure_pressure--";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MeasureState.values().length];
            iArr[MeasureState.MEASURING_PRESSURE.ordinal()] = 1;
            iArr[MeasureState.MEASURING_FINISHED.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
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
            FragmentActivity activity = MeasurePressureFragment.this.getActivity();
            if (activity == null) {
                return null;
            }
            return (MainWeightingViewModel) new ViewModelProvider(activity).get(MainWeightingViewModel.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(MeasurePressureFragment measurePressureFragment, View view) {
        MainWeightingViewModel viewModel = measurePressureFragment.getViewModel();
        MutableLiveData<Boolean> skipMeasure = viewModel == null ? null : viewModel.getSkipMeasure();
        if (skipMeasure == null) {
            return;
        }
        skipMeasure.setValue(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(MeasurePressureFragment measurePressureFragment, WeightAdvData weightAdvData) {
        MainWeightingViewModel viewModel;
        MainWeightingViewModel viewModel2;
        ExtentionUtilsKt.measureStateLog(measurePressureFragment.prefix, weightAdvData.getMeasureState(), weightAdvData.getMeasureData());
        MeasureState measureState = weightAdvData.getMeasureState();
        int i = measureState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[measureState.ordinal()];
        if (i != 1) {
            if (i == 2 && (viewModel2 = measurePressureFragment.getViewModel()) != null) {
                viewModel2.switchPage(WeightingState.state_bodyfat_detail);
                return;
            }
            return;
        }
        MeasureData measureData = weightAdvData.getMeasureData();
        Integer numValueOf = measureData == null ? null : Integer.valueOf(measureData.measureResult());
        if (numValueOf == null || numValueOf.intValue() != 1) {
            if (numValueOf == null || numValueOf.intValue() != 2 || (viewModel = measurePressureFragment.getViewModel()) == null) {
                return;
            }
            viewModel.switchPage(WeightingState.state_bodyfat_detail);
            return;
        }
        if (measurePressureFragment.measurePressureResult) {
            return;
        }
        measurePressureFragment.measurePressureResult = true;
        MainWeightingViewModel viewModel3 = measurePressureFragment.getViewModel();
        if (viewModel3 != null) {
            viewModel3.savePressure(weightAdvData);
        }
        LayoutWeightTitleAndViewBinding layoutWeightTitleAndViewBinding = measurePressureFragment.includeBinding;
        Objects.requireNonNull(layoutWeightTitleAndViewBinding);
        TypefaceTextView typefaceTextView = layoutWeightTitleAndViewBinding.number;
        MeasureData measureData2 = weightAdvData.getMeasureData();
        typefaceTextView.setText(String.valueOf(measureData2 != null ? Integer.valueOf(measureData2.getPressure()) : null));
        MainWeightingViewModel viewModel4 = measurePressureFragment.getViewModel();
        if (viewModel4 == null) {
            return;
        }
        viewModel4.switchPage(WeightingState.state_bodyfat_detail);
    }

    private final void initView() {
        MutableLiveData<WeightAdvData> weightData;
        LayoutWeightTitleAndViewBinding layoutWeightTitleAndViewBinding = this.includeBinding;
        Objects.requireNonNull(layoutWeightTitleAndViewBinding);
        layoutWeightTitleAndViewBinding.title.setText(getString(R.string.text_measure_pressure));
        LayoutWeightTitleAndViewBinding layoutWeightTitleAndViewBinding2 = this.includeBinding;
        Objects.requireNonNull(layoutWeightTitleAndViewBinding2);
        layoutWeightTitleAndViewBinding2.number.setText(getString(R.string.empty_value));
        LayoutWeightTitleAndViewBinding layoutWeightTitleAndViewBinding3 = this.includeBinding;
        Objects.requireNonNull(layoutWeightTitleAndViewBinding3);
        layoutWeightTitleAndViewBinding3.numberUnit.setVisibility(8);
        LayoutWeightTitleAndViewBinding layoutWeightTitleAndViewBinding4 = this.includeBinding;
        Objects.requireNonNull(layoutWeightTitleAndViewBinding4);
        layoutWeightTitleAndViewBinding4.bodyfatView.show();
        FragmentOptionParamMeasureBinding fragmentOptionParamMeasureBinding = this.binding;
        Objects.requireNonNull(fragmentOptionParamMeasureBinding);
        fragmentOptionParamMeasureBinding.btnSkip.setOnClickListener(new View.OnClickListener() { // from class: yv4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeasurePressureFragment.c(this.a, view);
            }
        });
        MainWeightingViewModel viewModel = getViewModel();
        if (viewModel == null || (weightData = viewModel.getWeightData()) == null) {
            return;
        }
        weightData.observe(getViewLifecycleOwner(), new Observer() { // from class: zv4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MeasurePressureFragment.d(this.a, (WeightAdvData) obj);
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
        FragmentOptionParamMeasureBinding fragmentOptionParamMeasureBindingInflate = FragmentOptionParamMeasureBinding.inflate(inflater);
        this.binding = fragmentOptionParamMeasureBindingInflate;
        Objects.requireNonNull(fragmentOptionParamMeasureBindingInflate);
        this.includeBinding = LayoutWeightTitleAndViewBinding.bind(fragmentOptionParamMeasureBindingInflate.getRoot());
        FragmentOptionParamMeasureBinding fragmentOptionParamMeasureBinding = this.binding;
        Objects.requireNonNull(fragmentOptionParamMeasureBinding);
        return fragmentOptionParamMeasureBinding.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
    }
}
