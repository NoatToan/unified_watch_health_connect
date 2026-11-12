package com.huami.sleep.statistic.sleepanalysis.ui;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.hmchartui.utils.Constant;
import com.huami.sleep.R;
import com.huami.sleep.ext.ViewExKt;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.sleep.statistic.sleepanalysis.viewmodel.SleepAnalysisViewModel;
import com.huami.sleep.statistic.sleepanalysis.vo.SleepAnalysisVo;
import java.io.Serializable;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u0016\u0010\u0010\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/huami/sleep/statistic/sleepanalysis/ui/SleepAnalysisFragment;", "Landroidx/fragment/app/Fragment;", "", GoogleApiAvailabilityLight.a, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "a", "Landroid/view/View;", "mRootView", "Lcom/huami/sleep/statistic/sleepanalysis/viewmodel/SleepAnalysisViewModel;", "b", "Lkotlin/Lazy;", "h", "()Lcom/huami/sleep/statistic/sleepanalysis/viewmodel/SleepAnalysisViewModel;", "mViewModel", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepAnalysisFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TIME = "time";

    @NotNull
    public static final String TIME_MODE = "timeMode";

    @NotNull
    public static final String USER_ID = "user_id";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private View mRootView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/huami/sleep/statistic/sleepanalysis/ui/SleepAnalysisFragment$Companion;", "", "", "time", "Lcom/huami/sleep/statistic/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "", "userId", "Landroidx/fragment/app/Fragment;", "newInstance", "TIME", "Ljava/lang/String;", "TIME_MODE", Constant.USER_ID, "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Fragment newInstance(long time, @NotNull TimeMode timeMode, @NotNull String userId) {
            Bundle bundle = new Bundle();
            bundle.putLong("time", time);
            bundle.putSerializable(SleepAnalysisFragment.TIME_MODE, timeMode);
            bundle.putString("user_id", userId);
            SleepAnalysisFragment sleepAnalysisFragment = new SleepAnalysisFragment();
            sleepAnalysisFragment.setArguments(bundle);
            return sleepAnalysisFragment;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SleepAnalysisFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment$special$$inlined$viewModel$default$1
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
        this.mViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SleepAnalysisViewModel>() { // from class: com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sleep.statistic.sleepanalysis.viewmodel.SleepAnalysisViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SleepAnalysisViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SleepAnalysisViewModel.class), function0, objArr);
            }
        });
    }

    private final void d() {
        String string;
        SleepAnalysisViewModel sleepAnalysisViewModelH = h();
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string = arguments.getString("user_id")) != null) {
            str = string;
        }
        sleepAnalysisViewModelH.setUserId(str);
        sleepAnalysisViewModelH.getSlpAnalysisShowLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: lz6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepAnalysisFragment.e(this.a, (Boolean) obj);
            }
        });
        sleepAnalysisViewModelH.getSleepAnalysisVoLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: jz6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepAnalysisFragment.f(this.a, (SleepAnalysisVo) obj);
            }
        });
        sleepAnalysisViewModelH.getSleepBestWorstShowLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: kz6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepAnalysisFragment.g(this.a, (Boolean) obj);
            }
        });
        Bundle arguments2 = getArguments();
        if (arguments2 == null) {
            return;
        }
        long j = arguments2.getLong("time");
        Serializable serializable = arguments2.getSerializable(TIME_MODE);
        Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.huami.sleep.statistic.dto.TimeMode");
        sleepAnalysisViewModelH.setTime(j, (TimeMode) serializable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(SleepAnalysisFragment sleepAnalysisFragment, Boolean bool) {
        View view = sleepAnalysisFragment.mRootView;
        Objects.requireNonNull(view);
        ViewExKt.setVisible(view, bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(SleepAnalysisFragment sleepAnalysisFragment, SleepAnalysisVo sleepAnalysisVo) {
        View view = sleepAnalysisFragment.getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.mainTitleTv))).setText(sleepAnalysisVo.getMainTitle());
        View view2 = sleepAnalysisFragment.getView();
        ((TextView) (view2 == null ? null : view2.findViewById(R.id.subTitleTv))).setText(sleepAnalysisVo.getSubTitle());
        View view3 = sleepAnalysisFragment.getView();
        ((TextView) (view3 == null ? null : view3.findViewById(R.id.bestScoreTv))).setText(sleepAnalysisVo.getBestTipStr());
        View view4 = sleepAnalysisFragment.getView();
        ((TextView) (view4 != null ? view4.findViewById(R.id.worstScoreTv) : null)).setText(sleepAnalysisVo.getWorstTipStr());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(SleepAnalysisFragment sleepAnalysisFragment, Boolean bool) {
        View view = sleepAnalysisFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.lineV), bool.booleanValue());
        View view2 = sleepAnalysisFragment.getView();
        ViewExKt.setVisible(view2 == null ? null : view2.findViewById(R.id.bestScoreTv), bool.booleanValue());
        View view3 = sleepAnalysisFragment.getView();
        ViewExKt.setVisible(view3 != null ? view3.findViewById(R.id.worstScoreTv) : null, bool.booleanValue());
    }

    private final SleepAnalysisViewModel h() {
        return (SleepAnalysisViewModel) this.mViewModel.getValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View viewInflate = inflater.inflate(R.layout.fragment_sleep_analysis_layout, container, false);
        Objects.requireNonNull(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        this.mRootView = viewGroup;
        Objects.requireNonNull(viewGroup);
        return viewGroup;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        d();
    }
}
