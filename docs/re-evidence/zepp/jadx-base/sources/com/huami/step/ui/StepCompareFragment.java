package com.huami.step.ui;

import android.content.ComponentCallbacks;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.hmchartui.model.CommonCompareData;
import com.huami.hmchartui.ui.CommonCompareFragment;
import com.huami.hmchartui.utils.Constant;
import com.huami.step.R;
import com.huami.step.viewmodel.StepCompareViewModel;
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
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/huami/step/ui/StepCompareFragment;", "Lcom/huami/hmchartui/ui/CommonCompareFragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "", "getTimeType", "getUnitStringId", "", "getCompareTitle", "current", "last", "getCompareDesc", "Landroid/graphics/drawable/Drawable;", "getProgressDrawable", "Lcom/huami/step/viewmodel/StepCompareViewModel;", "a", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/huami/step/viewmodel/StepCompareViewModel;", "mCompareViewModel", "<init>", "()V", "Companion", "step_release"}, k = 1, mv = {1, 5, 1})
public final class StepCompareFragment extends CommonCompareFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mCompareViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/huami/step/ui/StepCompareFragment$Companion;", "", "", "userId", "", "timeType", "Lcom/huami/step/ui/StepCompareFragment;", "newInstance", "<init>", "()V", "step_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StepCompareFragment newInstance(@NotNull String userId, int timeType) {
            StepCompareFragment stepCompareFragment = new StepCompareFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(Constant.KEY_TIME_TYPE, timeType);
            bundle.putString(Constant.USER_ID, userId);
            Unit unit = Unit.INSTANCE;
            stepCompareFragment.setArguments(bundle);
            return stepCompareFragment;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StepCompareFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.step.ui.StepCompareFragment$special$$inlined$viewModel$default$1
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
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.mCompareViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<StepCompareViewModel>() { // from class: com.huami.step.ui.StepCompareFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.step.viewmodel.StepCompareViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final StepCompareViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(StepCompareViewModel.class), function0, objArr);
            }
        });
    }

    private final StepCompareViewModel d() {
        return (StepCompareViewModel) this.mCompareViewModel.getValue();
    }

    @Override // com.huami.hmchartui.ui.CommonCompareFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.hmchartui.ui.CommonCompareFragment
    @NotNull
    public String getCompareDesc(int current, int last) {
        if (current < last) {
            return getTimeType() == 17 ? getString(R.string.step_comp_week_desc_less) : getString(R.string.step_comp_month_desc_less);
        }
        if (current == last) {
            return getTimeType() == 17 ? getString(R.string.step_comp_week_desc_keep) : getString(R.string.step_comp_month_desc_keep);
        }
        return getTimeType() == 17 ? getString(R.string.step_comp_week_desc_more) : getString(R.string.step_comp_month_desc_more);
    }

    @Override // com.huami.hmchartui.ui.CommonCompareFragment
    @NotNull
    public String getCompareTitle() {
        return getTimeType() == 17 ? getString(R.string.step_comp_week_title) : getString(R.string.step_comp_month_title);
    }

    @Override // com.huami.hmchartui.ui.CommonCompareFragment
    @Nullable
    public Drawable getProgressDrawable() {
        return ContextCompat.getDrawable(requireContext(), R.drawable.step_comp_bg_pb);
    }

    @Override // com.huami.hmchartui.ui.CommonCompareFragment
    public int getTimeType() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return 17;
        }
        return arguments.getInt(Constant.KEY_TIME_TYPE);
    }

    @Override // com.huami.hmchartui.ui.CommonCompareFragment
    public int getUnitStringId() {
        return R.plurals.step_text_unit_step_day;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String string;
        super.onViewCreated(view, savedInstanceState);
        StepCompareViewModel stepCompareViewModelD = d();
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string = arguments.getString(Constant.USER_ID)) != null) {
            str = string;
        }
        Bundle arguments2 = getArguments();
        stepCompareViewModelD.getPeriodTimeLiveData(str, arguments2 == null ? 17 : arguments2.getInt(Constant.KEY_TIME_TYPE)).observe(getViewLifecycleOwner(), new Observer<T>() { // from class: com.huami.step.ui.StepCompareFragment$onViewCreated$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                this.a.setViewData((CommonCompareData) t);
            }
        });
    }
}
