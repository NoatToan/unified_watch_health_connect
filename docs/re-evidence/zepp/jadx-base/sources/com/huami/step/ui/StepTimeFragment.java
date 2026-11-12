package com.huami.step.ui;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.huami.hmchartui.ui.CommonTabFragment;
import com.huami.hmchartui.utils.Constant;
import com.huami.step.koin.KoinExtKt;
import com.huami.step.koin.StepHollywoodApi;
import com.huami.step.model.ChildInfo;
import com.huami.step.model.TimeIndex;
import com.huami.step.model.UserOfStep;
import com.huami.step.viewmodel.ShareStepViewModel;
import com.huami.step.viewmodel.StepStageViewModel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016R\u001d\u0010\u0011\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0015\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/huami/step/ui/StepTimeFragment;", "Lcom/huami/hmchartui/ui/CommonTabFragment;", "", "getTimeType", "", "getRegisterDate", "time", "position", "Landroidx/fragment/app/Fragment;", "createContentFragment", "", "onViewPageSelected", "Lcom/huami/step/viewmodel/ShareStepViewModel;", "a", "Lkotlin/Lazy;", "b", "()Lcom/huami/step/viewmodel/ShareStepViewModel;", "shareViewModel", "Lcom/huami/step/viewmodel/StepStageViewModel;", "c", "()Lcom/huami/step/viewmodel/StepStageViewModel;", "stageViewModel", "<init>", "()V", "Companion", "step_release"}, k = 1, mv = {1, 5, 1})
public final class StepTimeFragment extends CommonTabFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String c = "timeType";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy shareViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy stageViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u001c\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/step/ui/StepTimeFragment$Companion;", "", "", "userId", "", "timeType", "Lcom/huami/step/ui/StepTimeFragment;", "newInstance", "keyType", "Ljava/lang/String;", "getKeyType", "()Ljava/lang/String;", "<init>", "()V", "step_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getKeyType() {
            return StepTimeFragment.c;
        }

        @NotNull
        public final StepTimeFragment newInstance(@NotNull String userId, int timeType) {
            StepTimeFragment stepTimeFragment = new StepTimeFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(StepTimeFragment.INSTANCE.getKeyType(), timeType);
            bundle.putString(Constant.USER_ID, userId);
            Unit unit = Unit.INSTANCE;
            stepTimeFragment.setArguments(bundle);
            return stepTimeFragment;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StepTimeFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.step.ui.StepTimeFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.shareViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ShareStepViewModel>() { // from class: com.huami.step.ui.StepTimeFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.step.viewmodel.ShareStepViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ShareStepViewModel invoke() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(ShareStepViewModel.class), function0, objArr);
            }
        });
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.huami.step.ui.StepTimeFragment$special$$inlined$sharedViewModel$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.stageViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<StepStageViewModel>() { // from class: com.huami.step.ui.StepTimeFragment$special$$inlined$sharedViewModel$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.step.viewmodel.StepStageViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final StepStageViewModel invoke() {
                return FragmentExtKt.getSharedViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(StepStageViewModel.class), function1, objArr3);
            }
        });
    }

    private final ShareStepViewModel b() {
        return (ShareStepViewModel) this.shareViewModel.getValue();
    }

    private final StepStageViewModel c() {
        return (StepStageViewModel) this.stageViewModel.getValue();
    }

    @Override // com.huami.hmchartui.ui.CommonTabFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.hmchartui.ui.CommonTabFragment
    @NotNull
    public Fragment createContentFragment(long time, int position) {
        String string;
        if (c().getMaxPagePosition().getValue() == null || c().getMaxPagePosition().getValue().intValue() < position) {
            c().getMaxPagePosition().setValue(Integer.valueOf(position));
            c().getStageStatus().setValue(new TimeIndex(getTimeType(), position));
            b().getGetShareIconStatus().setValue(new TimeIndex(getTimeType(), position));
        }
        StepChartFragmentManager.Companion companion = StepChartFragmentManager.INSTANCE;
        Bundle arguments = getArguments();
        return companion.newInstance((arguments == null || (string = arguments.getString(Constant.USER_ID)) == null) ? "" : string, time, getTimeType(), position);
    }

    @Override // com.huami.hmchartui.ui.CommonTabFragment
    public long getRegisterDate() {
        ChildInfo childInfo;
        String string;
        Long lValueOf = null;
        if (KoinExtKt.getUserOfStep() != null) {
            UserOfStep userOfStep = KoinExtKt.getUserOfStep();
            lValueOf = userOfStep != null ? Long.valueOf(userOfStep.getRegisterTime()) : null;
            return lValueOf == null ? System.currentTimeMillis() : lValueOf.longValue();
        }
        if (KoinExtKt.getHollywoodApi() == null) {
            return System.currentTimeMillis();
        }
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string = arguments.getString(Constant.USER_ID)) != null) {
            str = string;
        }
        StepHollywoodApi hollywoodApi = KoinExtKt.getHollywoodApi();
        if (hollywoodApi != null && (childInfo = hollywoodApi.getChildInfo(str)) != null) {
            lValueOf = Long.valueOf(childInfo.getCreateTime());
        }
        return lValueOf == null ? System.currentTimeMillis() : lValueOf.longValue();
    }

    @Override // com.huami.hmchartui.ui.CommonTabFragment
    public int getTimeType() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return 16;
        }
        return arguments.getInt(c);
    }

    @Override // com.huami.hmchartui.ui.CommonTabFragment
    public void onViewPageSelected(int position) {
        b().getGetShareIconStatus().setValue(new TimeIndex(getTimeType(), position));
        c().getStageStatus().setValue(new TimeIndex(getTimeType(), position));
    }
}
