package com.huami.phn.coach.ui.fragment;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.phn.coach.R;
import com.huami.phn.coach.ui.fragment.PHNTrainingStatusFragment;
import com.huami.phn.coach.ui.view.PHNTrainingStatusChart;
import com.huami.phn.coach.usecase.PlanDetail;
import com.huami.phn.coach.viewmodel.DailyAnalysisViewModel;
import com.huami.phn.coach.viewmodel.PHNDetailPageViewModel;
import com.huami.tools.log.HMLog;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001f\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/huami/phn/coach/ui/fragment/PHNTrainingStatusFragment;", "Landroidx/fragment/app/Fragment;", "Ljava/util/Calendar;", "calendarOrigin", "", "f", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "", "a", LogUtil.I, "position", "b", "fragmentsCount", "Lcom/huami/phn/coach/viewmodel/PHNDetailPageViewModel;", "c", "Lkotlin/Lazy;", "e", "()Lcom/huami/phn/coach/viewmodel/PHNDetailPageViewModel;", "viewModel", "Lcom/huami/phn/coach/viewmodel/DailyAnalysisViewModel;", GoogleApiAvailabilityLight.a, "()Lcom/huami/phn/coach/viewmodel/DailyAnalysisViewModel;", "analysisViewModel", "<init>", "(II)V", "Companion", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class PHNTrainingStatusFragment extends Fragment {

    @NotNull
    private static final String e = "object";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int position;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int fragmentsCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy analysisViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "loadDailyAnalysisLiveData error! " + this.a.getMessage();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PHNTrainingStatusFragment(int i, int i2) {
        this.position = i;
        this.fragmentsCount = i2;
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.phn.coach.ui.fragment.PHNTrainingStatusFragment$special$$inlined$sharedViewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<PHNDetailPageViewModel>() { // from class: com.huami.phn.coach.ui.fragment.PHNTrainingStatusFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.phn.coach.viewmodel.PHNDetailPageViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PHNDetailPageViewModel invoke() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(PHNDetailPageViewModel.class), function0, objArr);
            }
        });
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.huami.phn.coach.ui.fragment.PHNTrainingStatusFragment$special$$inlined$viewModel$default$1
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
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.analysisViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DailyAnalysisViewModel>() { // from class: com.huami.phn.coach.ui.fragment.PHNTrainingStatusFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.phn.coach.viewmodel.DailyAnalysisViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DailyAnalysisViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(DailyAnalysisViewModel.class), function1, objArr3);
            }
        });
    }

    private final DailyAnalysisViewModel d() {
        return (DailyAnalysisViewModel) this.analysisViewModel.getValue();
    }

    private final PHNDetailPageViewModel e() {
        return (PHNDetailPageViewModel) this.viewModel.getValue();
    }

    private final void f(Calendar calendarOrigin) {
        Object objM3845constructorimpl;
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, calendarOrigin.get(1));
        calendar.set(2, calendarOrigin.get(2));
        calendar.set(5, calendarOrigin.get(5));
        calendar.add(5, (-1) - (((this.fragmentsCount - this.position) - 1) * 42));
        try {
            Result.Companion companion = Result.Companion;
            d().loadDailyAnalysisLiveData(calendar.get(1), calendar.get(2) + 1, calendar.get(5), 42);
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.warn("PHNTrainingStatusFragment", thM3848exceptionOrNullimpl, new a(thM3848exceptionOrNullimpl));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(PHNTrainingStatusFragment pHNTrainingStatusFragment, PlanDetail planDetail) {
        Calendar update = planDetail.getUpdate();
        if (update == null) {
            return;
        }
        pHNTrainingStatusFragment.f(update);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(PHNTrainingStatusChart pHNTrainingStatusChart, Boolean bool) {
        if (pHNTrainingStatusChart == null) {
            return;
        }
        pHNTrainingStatusChart.showTrainingStatus(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(PHNTrainingStatusChart pHNTrainingStatusChart, List list) {
        if (pHNTrainingStatusChart == null) {
            return;
        }
        pHNTrainingStatusChart.fillingDailyAnalysis(list);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.phn_fragment_training_status, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        e().getPlanDetailLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: ip5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PHNTrainingStatusFragment.g(this.a, (PlanDetail) obj);
            }
        });
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.ll_training_status_chart);
        Context context = getContext();
        final PHNTrainingStatusChart pHNTrainingStatusChart = context == null ? null : new PHNTrainingStatusChart(context);
        e().getShowTrainingStatusLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: jp5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PHNTrainingStatusFragment.h(pHNTrainingStatusChart, (Boolean) obj);
            }
        });
        d().getDailyAnalysisLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: kp5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                PHNTrainingStatusFragment.i(pHNTrainingStatusChart, (List) obj);
            }
        });
        linearLayout.addView(pHNTrainingStatusChart);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        arguments.containsKey(e);
    }
}
