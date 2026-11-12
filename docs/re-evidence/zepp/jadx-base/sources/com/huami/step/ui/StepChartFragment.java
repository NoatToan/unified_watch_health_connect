package com.huami.step.ui;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.util.ChartGradientColor;
import com.huami.chart.util.HMColor;
import com.huami.hmchartui.model.ChartConfig;
import com.huami.hmchartui.model.ConvertChartData;
import com.huami.hmchartui.ui.CommonChartFragment;
import com.huami.hmchartui.utils.Constant;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.module.ktx.I18nKt;
import com.huami.step.R;
import com.huami.step.koin.IStepShare;
import com.huami.step.koin.KoinExtKt;
import com.huami.step.model.StepInfo;
import com.huami.step.model.StepsInTime;
import com.huami.step.model.TimeIndex;
import com.huami.step.ui.StepChartFragment;
import com.huami.step.utils.ConstantValue;
import com.huami.step.utils.ExtensionUtilsKt;
import com.huami.step.viewmodel.ShareStepViewModel;
import com.huami.step.viewmodel.StepInfoViewModel;
import com.huami.step.viewmodel.StepStageViewModel;
import com.loc.z;
import com.xiaomi.hm.health.watermarkcamera.web.GetWatermarkAPI;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0006\b\u0016\u0018\u0000 C2\u00020\u0001:\u0001CB\u0007¢\u0006\u0004\bA\u0010BJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0002J\u001c\u0010\u000f\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002J\u001a\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0017H\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000bH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\u0018\u0010\"\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001aH\u0016J\u0018\u0010%\u001a\u00020$2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u001aH\u0016R\u001d\u0010*\u001a\u00020$8D@\u0004X\u0084\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010/\u001a\u00020+8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010.R\u001d\u00104\u001a\u0002008B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b2\u00103R\u001d\u00109\u001a\u0002058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010'\u001a\u0004\b7\u00108R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010:R\u001d\u0010=\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010'\u001a\u0004\b;\u0010<R\u001c\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00070>8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010?¨\u0006D"}, d2 = {"Lcom/huami/step/ui/StepChartFragment;", "Lcom/huami/hmchartui/ui/CommonChartFragment;", "Lcom/huami/step/model/TimeIndex;", "timeIndex", "", com.google.android.exoplayer2.text.ttml.b.r, DTransferConstants.SEARCH_KEY, "Lcom/huami/step/model/StepInfo;", "stepInfo", "", GetWatermarkAPI.KEY_NAME_STEPS, "Lcom/huami/hmchartui/model/ConvertChartData;", "g", "", "isTouchValue", "r", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "data", "setViewData", "Lcom/huami/step/model/StepsInTime;", "afterLoadData", "touchBarDown", "", "getTimeType", "", "getTime", "Lcom/huami/hmchartui/model/ChartConfig;", "getChartConfig", "size", "", "getUnitString", "value", "", "getValueString", "c", "Lkotlin/Lazy;", "getUserId", "()Ljava/lang/String;", "userId", "Lcom/huami/step/viewmodel/ShareStepViewModel;", GoogleApiAvailabilityLight.a, "i", "()Lcom/huami/step/viewmodel/ShareStepViewModel;", "shareStepViewModel", "Lcom/huami/step/viewmodel/StepInfoViewModel;", "e", hl.k, "()Lcom/huami/step/viewmodel/StepInfoViewModel;", "viewModel", "Lcom/huami/step/viewmodel/StepStageViewModel;", "f", z.j, "()Lcom/huami/step/viewmodel/StepStageViewModel;", "stageViewModel", "Lcom/huami/step/model/StepInfo;", "h", "()I", "pos", "", "Ljava/util/List;", "stepInfos", "<init>", "()V", "Companion", "step_release"}, k = 1, mv = {1, 5, 1})
public class StepChartFragment extends CommonChartFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy userId = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy shareStepViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy stageViewModel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private StepInfo stepInfo;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy pos;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final List<StepInfo> stepInfos;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\r"}, d2 = {"Lcom/huami/step/ui/StepChartFragment$Companion;", "", "", "userId", "", "time", "", "timeType", "pos", "Lcom/huami/step/ui/StepChartFragment;", "newInstance", "<init>", "()V", "step_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StepChartFragment newInstance(@NotNull String userId, long time, int timeType, int pos) {
            Bundle bundle = new Bundle();
            bundle.putLong(Constant.KEY_TIME, time);
            bundle.putInt(Constant.KEY_TIME_TYPE, timeType);
            bundle.putInt(ConstantValue.KEY_POS, pos);
            bundle.putString(Constant.USER_ID, userId);
            if (timeType == 16) {
                StepDayChartFragment stepDayChartFragment = new StepDayChartFragment();
                stepDayChartFragment.setArguments(bundle);
                return stepDayChartFragment;
            }
            StepChartFragment stepChartFragment = new StepChartFragment();
            stepChartFragment.setArguments(bundle);
            return stepChartFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/hmchartui/model/ConvertChartData;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<ConvertChartData, Boolean> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final boolean a(@NotNull ConvertChartData convertChartData) {
            return convertChartData.getValue() == 0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(ConvertChartData convertChartData) {
            return Boolean.valueOf(a(convertChartData));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Integer> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer getA() {
            return Integer.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final int invoke2() {
            Bundle arguments = StepChartFragment.this.getArguments();
            if (arguments == null) {
                return 0;
            }
            return arguments.getInt(ConstantValue.KEY_POS, 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            String string;
            Bundle arguments = StepChartFragment.this.getArguments();
            return (arguments == null || (string = arguments.getString(Constant.USER_ID)) == null) ? "" : string;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StepChartFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.step.ui.StepChartFragment$special$$inlined$sharedViewModel$default$1
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
        this.shareStepViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ShareStepViewModel>() { // from class: com.huami.step.ui.StepChartFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.step.viewmodel.ShareStepViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ShareStepViewModel getA() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(ShareStepViewModel.class), function0, objArr);
            }
        });
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.huami.step.ui.StepChartFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<StepInfoViewModel>() { // from class: com.huami.step.ui.StepChartFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.step.viewmodel.StepInfoViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final StepInfoViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(StepInfoViewModel.class), function1, objArr3);
            }
        });
        final Function0<ViewModelOwner> function2 = new Function0<ViewModelOwner>() { // from class: com.huami.step.ui.StepChartFragment$special$$inlined$sharedViewModel$default$3
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
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.stageViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<StepStageViewModel>() { // from class: com.huami.step.ui.StepChartFragment$special$$inlined$sharedViewModel$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.step.viewmodel.StepStageViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final StepStageViewModel getA() {
                return FragmentExtKt.getSharedViewModel(this, objArr4, Reflection.getOrCreateKotlinClass(StepStageViewModel.class), function2, objArr5);
            }
        });
        this.pos = LazyKt__LazyJVMKt.lazy(new b());
        this.stepInfos = new ArrayList();
    }

    private final ConvertChartData g(StepInfo stepInfo, List<StepInfo> steps) {
        int i;
        int steps2 = stepInfo.getSteps();
        switch (getTimeType()) {
            case 17:
            case 18:
                if ((steps instanceof Collection) && steps.isEmpty()) {
                    i = 0;
                } else {
                    Iterator<T> it2 = steps.iterator();
                    i = 0;
                    while (it2.hasNext()) {
                        if ((((StepInfo) it2.next()).getSteps() > 0) && (i = i + 1) < 0) {
                            CollectionsKt__CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                steps2 /= i > 0 ? i : 1;
                break;
            case 19:
                Iterator<T> it3 = steps.iterator();
                int daysHasData = 0;
                while (it3.hasNext()) {
                    daysHasData += ((StepInfo) it3.next()).getDaysHasData();
                }
                steps2 /= daysHasData > 0 ? daysHasData : 1;
                break;
        }
        return new ConvertChartData(0, stepInfo.getTime(), steps2);
    }

    private final int h() {
        return ((Number) this.pos.getValue()).intValue();
    }

    private final ShareStepViewModel i() {
        return (ShareStepViewModel) this.shareStepViewModel.getValue();
    }

    private final StepStageViewModel j() {
        return (StepStageViewModel) this.stageViewModel.getValue();
    }

    private final StepInfoViewModel k() {
        return (StepInfoViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(final StepChartFragment stepChartFragment, StepsInTime stepsInTime) {
        if (stepsInTime == null) {
            return;
        }
        ConvertChartData totalValue = stepChartFragment.getTotalValue();
        int i = 0;
        if (!(totalValue != null && totalValue.getValue() == 0)) {
            int steps = stepsInTime.getTotalStep().getSteps();
            ConvertChartData totalValue2 = stepChartFragment.getTotalValue();
            if (totalValue2 != null && steps == totalValue2.getValue()) {
                return;
            }
        }
        stepChartFragment.stepInfos.clear();
        stepChartFragment.stepInfos.addAll(stepsInTime.getSteps());
        StepInfo totalStep = stepsInTime.getTotalStep();
        stepChartFragment.stepInfo = totalStep;
        s(stepChartFragment, totalStep, false, 2, null);
        stepChartFragment.setTotalValue(stepChartFragment.g(stepsInTime.getTotalStep(), stepsInTime.getSteps()));
        stepChartFragment.p(stepChartFragment.i().getGetShareIconStatus().getValue());
        ArrayList arrayList = new ArrayList();
        for (Object obj : stepsInTime.getSteps()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            StepInfo stepInfo = (StepInfo) obj;
            arrayList.add(new ConvertChartData(i, stepInfo.getTime(), stepInfo.getSteps()));
            i = i2;
        }
        h.removeAll((List) arrayList, (Function1) a.a);
        stepChartFragment.refreshChart(arrayList);
        stepChartFragment.afterLoadData(stepsInTime);
        stepChartFragment.j().getStageStatus().observe(stepChartFragment.getViewLifecycleOwner(), new Observer() { // from class: hg7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj2) {
                StepChartFragment.m(this.a, (TimeIndex) obj2);
            }
        });
        stepChartFragment.i().getGetShareIconStatus().observe(stepChartFragment.getViewLifecycleOwner(), new Observer() { // from class: gg7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj2) {
                StepChartFragment.n(this.a, (TimeIndex) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(StepChartFragment stepChartFragment, TimeIndex timeIndex) {
        stepChartFragment.q(timeIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(StepChartFragment stepChartFragment, TimeIndex timeIndex) {
        stepChartFragment.p(timeIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(StepChartFragment stepChartFragment, TimeIndex timeIndex) {
        IStepShare stepShare;
        StepInfo stepInfo = stepChartFragment.stepInfo;
        if (stepInfo != null && stepChartFragment.getTimeType() == timeIndex.getTimeType() && timeIndex.getPos() == stepChartFragment.h() && (stepShare = KoinExtKt.getStepShare()) != null) {
            stepShare.shareStep(stepChartFragment.requireContext(), stepInfo, stepChartFragment.getTimeType());
        }
    }

    private final void p(TimeIndex timeIndex) {
        if ((timeIndex != null && getTimeType() == timeIndex.getTimeType()) && h() == timeIndex.getPos() && getTotalValue() != null) {
            if (getTotalValue().getValue() > 0) {
                i().getShareIconVisible().setValue(0);
            } else {
                i().getShareIconVisible().setValue(8);
            }
        }
    }

    private final void q(TimeIndex timeIndex) {
        if (!(timeIndex != null && getTimeType() == timeIndex.getTimeType()) || h() != timeIndex.getPos()) {
            if (timeIndex != null && 16 == timeIndex.getTimeType()) {
                return;
            }
            j().getStageVisible().setValue(8);
            return;
        }
        if (!(timeIndex.getTimeType() == 16) || getTotalValue() == null || getTotalValue().getValue() <= 0) {
            j().getStageVisible().setValue(8);
        } else {
            j().getStageVisible().setValue(0);
            j().getDate().setValue(Long.valueOf(getTime()));
        }
    }

    private final void r(StepInfo stepInfo, boolean isTouchValue) {
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag(StepFragmentChartInfo.class.getName());
        if (fragmentFindFragmentByTag instanceof StepFragmentChartInfo) {
            ((StepFragmentChartInfo) fragmentFindFragmentByTag).updateView(stepInfo, isTouchValue);
        }
    }

    public static /* synthetic */ void s(StepChartFragment stepChartFragment, StepInfo stepInfo, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateTotalView");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        stepChartFragment.r(stepInfo, z);
    }

    @Override // com.huami.hmchartui.ui.CommonChartFragment
    public void _$_clearFindViewByIdCache() {
    }

    public void afterLoadData(@NotNull StepsInTime stepInfo) {
    }

    @Override // com.huami.hmchartui.ui.CommonChartFragment
    @NotNull
    public ChartConfig getChartConfig() {
        ChartConfig.Builder builder = new ChartConfig.Builder();
        builder.setLabelColor(ContextCompat.getColor(requireContext(), R.color.s2)).setEmptyTextColor(ContextCompat.getColor(requireContext(), R.color.s1)).setEmptyText(getString(R.string.step_text_no_data));
        if (KoinExtKt.getHollywoodApi() == null) {
            builder.setBarColor(ContextCompat.getColor(requireContext(), R.color.s30));
        } else {
            builder.setSupportRadian(true);
            builder.setGradientColors(new ChartGradientColor[]{new ChartGradientColor(new HMColor(ContextCompat.getColor(requireContext(), R.color.step_ColorChartBar_gradient_start)), new HMColor(ContextCompat.getColor(requireContext(), R.color.step_ColorChartBar_gradient_end)))});
        }
        return builder.build();
    }

    @Override // com.huami.hmchartui.ui.CommonChartFragment
    public long getTime() {
        Bundle arguments = getArguments();
        Long lValueOf = arguments == null ? null : Long.valueOf(arguments.getLong(Constant.KEY_TIME));
        return lValueOf == null ? System.currentTimeMillis() : lValueOf.longValue();
    }

    @Override // com.huami.hmchartui.ui.CommonChartFragment
    public int getTimeType() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return 16;
        }
        return arguments.getInt(Constant.KEY_TIME_TYPE);
    }

    @Override // com.huami.hmchartui.ui.CommonChartFragment
    @NotNull
    public CharSequence getUnitString(boolean isTouchValue, int size) {
        return isTouchValue ? getResources().getQuantityText(R.plurals.step_text_unit_step, size) : getResources().getQuantityText(R.plurals.step_text_unit_step_day, size);
    }

    @NotNull
    public final String getUserId() {
        return (String) this.userId.getValue();
    }

    @Override // com.huami.hmchartui.ui.CommonChartFragment
    @NotNull
    public String getValueString(boolean isTouchValue, int value) {
        return I18nKt.i18n(value);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LiveData<StepsInTime> stepData = k().getStepData(getUserId(), getTime(), getTimeType());
        if (stepData != null) {
            stepData.observe(getViewLifecycleOwner(), new Observer() { // from class: eg7
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    StepChartFragment.l(this.a, (StepsInTime) obj);
                }
            });
        }
        i().getShareClick().observe(getViewLifecycleOwner(), new Observer() { // from class: fg7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                StepChartFragment.o(this.a, (TimeIndex) obj);
            }
        });
        if (getChildFragmentManager().findFragmentByTag(StepFragmentChartInfo.class.getName()) == null) {
            getChildFragmentManager().beginTransaction().add(getOtherFragmentContainer(), StepFragmentChartInfo.INSTANCE.newInstance(getTimeType(), getTime()), StepFragmentChartInfo.class.getName()).commit();
        }
    }

    @Override // com.huami.hmchartui.ui.CommonChartFragment
    public void setViewData(@Nullable ConvertChartData data, boolean isTouchValue) {
        super.setViewData(data, isTouchValue);
        if (!isTouchValue) {
            r(this.stepInfo, false);
            return;
        }
        for (Object obj : this.stepInfos) {
            if (data != null && ((StepInfo) obj).getTime() == data.getTime()) {
                r((StepInfo) obj, true);
            }
        }
        obj = null;
        r((StepInfo) obj, true);
    }

    @Override // com.huami.hmchartui.ui.CommonChartFragment
    public void touchBarDown(@NotNull ConvertChartData data) {
        switch (getTimeType()) {
            case 16:
                ExtensionUtilsKt.identifiedEvent(new CountEventBuilder("HEALTH_STEP_DAY_DIVISION_C"));
                break;
            case 17:
                ExtensionUtilsKt.identifiedEvent(new CountEventBuilder("HEALTH_STEP_WEEK_DIVISION_C"));
                break;
            case 18:
                ExtensionUtilsKt.identifiedEvent(new CountEventBuilder("HEALTH_STEP_MONTH_DIVISION_C"));
                break;
            case 19:
                ExtensionUtilsKt.identifiedEvent(new CountEventBuilder("HEALTH_STEP_YEAR_DIVISION_C"));
                break;
        }
    }
}
