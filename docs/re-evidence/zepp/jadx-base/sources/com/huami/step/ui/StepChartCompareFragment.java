package com.huami.step.ui;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.health.statisticdata.constants.DistributionTypeEnum;
import com.huami.health.statisticdata.constants.GenderType;
import com.huami.health.statisticdata.model.BasicArgumentsData;
import com.huami.health.statisticdata.view.StatisticDataFragment;
import com.huami.hmchartui.ui.view.CommonCardView;
import com.huami.hmchartui.utils.Constant;
import com.huami.step.R;
import com.huami.step.koin.KoinExtKt;
import com.huami.step.koin.StepHollywoodApi;
import com.huami.step.model.ChildInfo;
import com.huami.step.model.StepsInTime;
import com.huami.step.ui.StepChartCompareFragment;
import com.huami.step.viewmodel.StepInfoViewModel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u0010²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u0084\u0002"}, d2 = {"Lcom/huami/step/ui/StepChartCompareFragment;", "Landroidx/fragment/app/Fragment;", "", "value", "", "b", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "<init>", "()V", "Companion", "Lcom/huami/step/viewmodel/StepInfoViewModel;", "viewmodel", "step_release"}, k = 1, mv = {1, 5, 1})
public final class StepChartCompareFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/huami/step/ui/StepChartCompareFragment$Companion;", "", "", "userId", "", "time", "Lcom/huami/step/ui/StepChartCompareFragment;", "newInstance", "<init>", "()V", "step_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StepChartCompareFragment newInstance(@NotNull String userId, long time) {
            StepChartCompareFragment stepChartCompareFragment = new StepChartCompareFragment();
            Bundle bundle = new Bundle();
            bundle.putString(Constant.USER_ID, userId);
            bundle.putLong(Constant.KEY_TIME, time);
            Unit unit = Unit.INSTANCE;
            stepChartCompareFragment.setArguments(bundle);
            return stepChartCompareFragment;
        }
    }

    public StepChartCompareFragment() {
        super(R.layout.step_fragment_chart_compare);
    }

    private final void b(int value) {
        String string;
        StepHollywoodApi hollywoodApi = KoinExtKt.getHollywoodApi();
        if (getChildFragmentManager().findFragmentByTag(StatisticDataFragment.class.getName()) != null || hollywoodApi == null) {
            return;
        }
        Bundle arguments = getArguments();
        String str = (arguments == null || (string = arguments.getString(Constant.USER_ID)) == null) ? "" : string;
        ChildInfo childInfo = hollywoodApi.getChildInfo(str);
        Integer gender = childInfo.getGender();
        GenderType genderType = (gender != null && gender.intValue() == 1) ? GenderType.MALE : GenderType.FEMALE;
        Integer age = childInfo.getAge();
        int iIntValue = age == null ? 10 : age.intValue();
        StatisticDataFragment.Companion companion = StatisticDataFragment.INSTANCE;
        BasicArgumentsData basicArgumentsData = new BasicArgumentsData(str, DistributionTypeEnum.ACTIVITY_STEP_TTL, genderType, iIntValue, 23, value, getString(R.string.step_format_compare_activity_time_with_other), "", "", R.drawable.step_img_arrow_up_green, null, null, 3072, null);
        Context contextRequireContext = requireContext();
        int i = R.color.step_ColorChartBar;
        getChildFragmentManager().beginTransaction().add(R.id.fragment_container_chart_compare, companion.newInstance(basicArgumentsData, ContextCompat.getColor(contextRequireContext, i), new int[]{ContextCompat.getColor(requireContext(), i), -1}, new int[]{ContextCompat.getColor(requireContext(), i), -1}, null), StatisticDataFragment.class.getName()).commit();
    }

    private static final StepInfoViewModel c(Lazy<StepInfoViewModel> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(StepChartCompareFragment stepChartCompareFragment, StepsInTime stepsInTime) {
        if (stepsInTime.getTotalStep().getSteps() <= 0 || KoinExtKt.getHollywoodApi() == null) {
            View view = stepChartCompareFragment.getView();
            ((CommonCardView) (view != null ? view.findViewById(R.id.layout_compare) : null)).setVisibility(8);
        } else {
            View view2 = stepChartCompareFragment.getView();
            ((CommonCardView) (view2 != null ? view2.findViewById(R.id.layout_compare) : null)).setVisibility(0);
            stepChartCompareFragment.b(stepsInTime.getTotalStep().getSteps());
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String string;
        super.onViewCreated(view, savedInstanceState);
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.step.ui.StepChartCompareFragment$onViewCreated$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Object[] objArr = 0 == true ? 1 : 0;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        Lazy lazy = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<StepInfoViewModel>() { // from class: com.huami.step.ui.StepChartCompareFragment$onViewCreated$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.step.viewmodel.StepInfoViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final StepInfoViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, objArr, Reflection.getOrCreateKotlinClass(StepInfoViewModel.class), function0, objArr2);
            }
        });
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string = arguments.getString(Constant.USER_ID)) != null) {
            str = string;
        }
        Bundle arguments2 = getArguments();
        Long lValueOf = arguments2 != null ? Long.valueOf(arguments2.getLong(Constant.KEY_TIME)) : null;
        LiveData<StepsInTime> stepData = c(lazy).getStepData(str, lValueOf == null ? System.currentTimeMillis() : lValueOf.longValue(), 16);
        if (stepData == null) {
            return;
        }
        stepData.observe(getViewLifecycleOwner(), new Observer() { // from class: dg7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                StepChartCompareFragment.d(this.a, (StepsInTime) obj);
            }
        });
    }
}
