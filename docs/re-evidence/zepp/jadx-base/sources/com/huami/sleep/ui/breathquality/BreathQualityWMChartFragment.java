package com.huami.sleep.ui.breathquality;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.util.Index;
import com.huami.sleep.R;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.ext.ViewExKt;
import com.huami.sleep.helper.BreathQualityScoreChartHelper;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.sleep.ui.breathquality.BreathQualityWMChartFragment;
import com.huami.sleep.util.ViewSlideWrapper;
import com.huami.sleep.util.ViewUtils;
import com.huami.sleep.viewmodel.breathquality.BreathQualityWMScoreViewModel;
import com.huami.sleep.vo.BreathQualityWMScoreVo;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017R\u001d\u0010\u0013\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001c\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/huami/sleep/ui/breathquality/BreathQualityWMChartFragment;", "Landroidx/fragment/app/Fragment;", "", "date", "riskDesc", "", "topRiskDay", "c", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "Lcom/huami/sleep/helper/BreathQualityScoreChartHelper;", "a", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/huami/sleep/helper/BreathQualityScoreChartHelper;", "chartHelper", "Lcom/huami/sleep/util/ViewSlideWrapper;", "b", "e", "()Lcom/huami/sleep/util/ViewSlideWrapper;", "chartSlideHelper", "Lcom/huami/sleep/viewmodel/breathquality/BreathQualityWMScoreViewModel;", "f", "()Lcom/huami/sleep/viewmodel/breathquality/BreathQualityWMScoreViewModel;", "mViewModel", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class BreathQualityWMChartFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String d = "time_mode";

    @NotNull
    private static final String e = "time";

    @NotNull
    private static final String f = "user_id";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy chartHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy chartSlideHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/huami/sleep/ui/breathquality/BreathQualityWMChartFragment$Companion;", "", "", "userId", "Lcom/huami/sleep/statistic/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "", "time", "Lcom/huami/sleep/ui/breathquality/BreathQualityWMChartFragment;", "getInstance", "ARGS_TIME", "Ljava/lang/String;", "ARGS_TIME_MODE", "ARGS_USER_ID", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BreathQualityWMChartFragment getInstance(@NotNull String userId, @NotNull TimeMode timeMode, long time) {
            BreathQualityWMChartFragment breathQualityWMChartFragment = new BreathQualityWMChartFragment();
            Bundle bundle = new Bundle();
            bundle.putString("time_mode", timeMode.name());
            bundle.putLong("time", time);
            bundle.putString("user_id", userId);
            Unit unit = Unit.INSTANCE;
            breathQualityWMChartFragment.setArguments(bundle);
            return breathQualityWMChartFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleep/helper/BreathQualityScoreChartHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<BreathQualityScoreChartHelper> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BreathQualityScoreChartHelper getA() {
            return new BreathQualityScoreChartHelper(BreathQualityWMChartFragment.this.requireContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleep/util/ViewSlideWrapper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<ViewSlideWrapper> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewSlideWrapper getA() {
            View view = BreathQualityWMChartFragment.this.getView();
            return new ViewSlideWrapper(view == null ? null : view.findViewById(R.id.tipTv), ViewUtils.dp2px(BreathQualityWMChartFragment.this.getContext(), 10.0f), BreathQualityWMChartFragment.this.getResources().getDisplayMetrics().widthPixels - ViewUtils.dp2px(BreathQualityWMChartFragment.this.getContext(), 45.0f));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/chart/util/Index;", "index", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Index, Unit> {
        public final /* synthetic */ BreathQualityWMScoreVo a;
        public final /* synthetic */ BreathQualityWMChartFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BreathQualityWMScoreVo breathQualityWMScoreVo, BreathQualityWMChartFragment breathQualityWMChartFragment) {
            super(1);
            this.a = breathQualityWMScoreVo;
            this.b = breathQualityWMChartFragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(BreathQualityWMChartFragment breathQualityWMChartFragment) {
            View view = breathQualityWMChartFragment.getView();
            ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.tipTv), true);
        }

        public final void b(@NotNull Index index) {
            if (this.a.getSelectInfoList().indexOfKey(index.getDataIndex()) >= 0) {
                this.b.e().slide(index.getCenterX() - ViewUtils.dp2px(this.b.requireContext(), 15.0f));
                View view = this.b.getView();
                ((TextView) (view == null ? null : view.findViewById(R.id.tipTv))).setText(this.a.getSelectInfoList().get(index.getDataIndex()).getRiskLevelStr());
                View view2 = this.b.getView();
                View viewFindViewById = view2 != null ? view2.findViewById(R.id.tipTv) : null;
                final BreathQualityWMChartFragment breathQualityWMChartFragment = this.b;
                ((TextView) viewFindViewById).postDelayed(new Runnable() { // from class: com.huami.sleep.ui.breathquality.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        BreathQualityWMChartFragment.c.c(breathQualityWMChartFragment);
                    }
                }, 32L);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Index index) {
            b(index);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            View view = BreathQualityWMChartFragment.this.getView();
            ViewExKt.setInVisible(view == null ? null : view.findViewById(R.id.tipTv), true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BreathQualityWMChartFragment() {
        super(R.layout.fragment_breath_quality_score_wm);
        this.chartHelper = LazyKt__LazyJVMKt.lazy(new a());
        this.chartSlideHelper = LazyKt__LazyJVMKt.lazy(new b());
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sleep.ui.breathquality.BreathQualityWMChartFragment$special$$inlined$viewModel$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.mViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<BreathQualityWMScoreViewModel>() { // from class: com.huami.sleep.ui.breathquality.BreathQualityWMChartFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sleep.viewmodel.breathquality.BreathQualityWMScoreViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final BreathQualityWMScoreViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(BreathQualityWMScoreViewModel.class), function0, objArr);
            }
        });
    }

    private final String c(String date, String riskDesc, int topRiskDay) {
        String quantityString = KoinExtKt.getAppContext().getResources().getQuantityString(R.plurals.sleep_record_unit, topRiskDay);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("%1$s %2$s %3$s " + quantityString, Arrays.copyOf(new Object[]{date, riskDesc, Integer.valueOf(topRiskDay)}, 3));
    }

    private final BreathQualityScoreChartHelper d() {
        return (BreathQualityScoreChartHelper) this.chartHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewSlideWrapper e() {
        return (ViewSlideWrapper) this.chartSlideHelper.getValue();
    }

    private final BreathQualityWMScoreViewModel f() {
        return (BreathQualityWMScoreViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(BreathQualityWMChartFragment breathQualityWMChartFragment, TimeMode timeMode, BreathQualityWMScoreVo breathQualityWMScoreVo) {
        View view = breathQualityWMChartFragment.getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.chartTitleTv))).setText(breathQualityWMChartFragment.c(breathQualityWMScoreVo.getTimeStr(), breathQualityWMScoreVo.getTopRiskDesc(), breathQualityWMScoreVo.getTopRiskDay()));
        BreathQualityScoreChartHelper breathQualityScoreChartHelperD = breathQualityWMChartFragment.d();
        View view2 = breathQualityWMChartFragment.getView();
        breathQualityScoreChartHelperD.refreshBarChart((ViewGroup) (view2 != null ? view2.findViewById(R.id.chartContentFL) : null), timeMode, breathQualityWMScoreVo, new c(breathQualityWMScoreVo, breathQualityWMChartFragment), breathQualityWMChartFragment.new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(BreathQualityWMChartFragment breathQualityWMChartFragment, Boolean bool) {
        View view = breathQualityWMChartFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.legendLL), !bool.booleanValue());
        View view2 = breathQualityWMChartFragment.getView();
        ViewExKt.setVisible(view2 == null ? null : view2.findViewById(R.id.chartContentFL), !bool.booleanValue());
        View view3 = breathQualityWMChartFragment.getView();
        ViewExKt.setVisible(view3 != null ? view3.findViewById(R.id.emptyTv) : null, bool.booleanValue());
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @ExperimentalCoroutinesApi
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String string;
        String string2;
        super.onViewCreated(view, savedInstanceState);
        BreathQualityWMScoreViewModel breathQualityWMScoreViewModelF = f();
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string2 = arguments.getString("user_id")) != null) {
            str = string2;
        }
        Bundle arguments2 = getArguments();
        final TimeMode timeModeValueOf = null;
        if (arguments2 != null && (string = arguments2.getString("time_mode")) != null) {
            timeModeValueOf = TimeMode.valueOf(string);
        }
        if (timeModeValueOf == null) {
            timeModeValueOf = TimeMode.WEEK;
        }
        Bundle arguments3 = getArguments();
        long j = arguments3 == null ? 0L : arguments3.getLong("time");
        breathQualityWMScoreViewModelF.getScoreAndCostLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: k70
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BreathQualityWMChartFragment.g(this.a, timeModeValueOf, (BreathQualityWMScoreVo) obj);
            }
        });
        breathQualityWMScoreViewModelF.getEmptyDataLive().observe(getViewLifecycleOwner(), new Observer() { // from class: j70
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BreathQualityWMChartFragment.h(this.a, (Boolean) obj);
            }
        });
        breathQualityWMScoreViewModelF.getScoreAndCostLiveData(str, timeModeValueOf, j);
    }
}
