package com.huami.sleep.ui.breathquality;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.chart.util.Index;
import com.huami.sleep.R;
import com.huami.sleep.daysleep.sleepstagechart.vo.Resource;
import com.huami.sleep.daysleep.sleepstagechart.vo.Status;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.ext.ViewExKt;
import com.huami.sleep.helper.BreathQualityOdChartHelper;
import com.huami.sleep.ui.breathquality.BreathQualityDayOdChartFragment;
import com.huami.sleep.util.SleepTimeUtil;
import com.huami.sleep.util.TimeShowUtilsKt;
import com.huami.sleep.util.ViewSlideWrapper;
import com.huami.sleep.util.ViewUtils;
import com.huami.sleep.viewmodel.breathquality.BreathQualityDayOdViewModel;
import com.huami.sleep.vo.BreathQualityDayOdVo;
import com.loc.z;
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
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0003J\u001c\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u0016\u0010\u0011\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010 \u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010%\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/huami/sleep/ui/breathquality/BreathQualityDayOdChartFragment;", "Landroidx/fragment/app/Fragment;", "", GoogleApiAvailabilityLight.a, "loadData", "", "timeStamp", "", "appendText", "l", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "a", "J", "time", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "b", "Lkotlin/Lazy;", z.j, "()Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mDialog", "Lcom/huami/sleep/helper/BreathQualityOdChartHelper;", "c", "i", "()Lcom/huami/sleep/helper/BreathQualityOdChartHelper;", "mChartHelper", "Lcom/huami/sleep/util/ViewSlideWrapper;", "h", "()Lcom/huami/sleep/util/ViewSlideWrapper;", "chartSlideHelper", "Lcom/huami/sleep/viewmodel/breathquality/BreathQualityDayOdViewModel;", "e", hl.k, "()Lcom/huami/sleep/viewmodel/breathquality/BreathQualityDayOdViewModel;", "mViewModel", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class BreathQualityDayOdChartFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String f = "user_id";

    @NotNull
    private static final String g = "time";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private long time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDialog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mChartHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy chartSlideHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/sleep/ui/breathquality/BreathQualityDayOdChartFragment$Companion;", "", "", "userId", "", "time", "Lcom/huami/sleep/ui/breathquality/BreathQualityDayOdChartFragment;", "newInstance", "ARGS_TIME", "Ljava/lang/String;", "ARGS_USER_ID", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BreathQualityDayOdChartFragment newInstance(@NotNull String userId, long time) {
            BreathQualityDayOdChartFragment breathQualityDayOdChartFragment = new BreathQualityDayOdChartFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("time", time);
            bundle.putString("user_id", userId);
            Unit unit = Unit.INSTANCE;
            breathQualityDayOdChartFragment.setArguments(bundle);
            return breathQualityDayOdChartFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.SUCCESS.ordinal()] = 1;
            iArr[Status.LOADING.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/chart/util/Index;", "index", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Index, Unit> {
        public final /* synthetic */ BreathQualityDayOdVo b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BreathQualityDayOdVo breathQualityDayOdVo) {
            super(1);
            this.b = breathQualityDayOdVo;
        }

        public final void a(@NotNull Index index) {
            View view = BreathQualityDayOdChartFragment.this.getView();
            if ((view == null ? null : view.findViewById(R.id.tipTv)) == null) {
                return;
            }
            if (!(this.b.getSelectInfoList().indexOfKey(index.getDataIndex()) >= 0)) {
                View view2 = BreathQualityDayOdChartFragment.this.getView();
                ViewExKt.setInVisible(view2 != null ? view2.findViewById(R.id.tipTv) : null, true);
                BreathQualityDayOdChartFragment.this.h().reset();
            } else {
                View view3 = BreathQualityDayOdChartFragment.this.getView();
                ViewExKt.setVisible(view3 == null ? null : view3.findViewById(R.id.tipTv), true);
                View view4 = BreathQualityDayOdChartFragment.this.getView();
                ((TextView) (view4 != null ? view4.findViewById(R.id.tipTv) : null)).setText(this.b.getSelectInfoList().get(index.getDataIndex()));
                BreathQualityDayOdChartFragment.this.h().slide(index.getCenterX() - ViewUtils.dp2px(BreathQualityDayOdChartFragment.this.requireContext(), 15.0f));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Index index) {
            a(index);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public static final b a = new b();

        public b() {
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
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleep/util/ViewSlideWrapper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<ViewSlideWrapper> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewSlideWrapper getA() {
            View view = BreathQualityDayOdChartFragment.this.getView();
            return new ViewSlideWrapper(view == null ? null : view.findViewById(R.id.tipTv), ViewUtils.dp2px(BreathQualityDayOdChartFragment.this.getContext(), 15.0f), BreathQualityDayOdChartFragment.this.getResources().getDisplayMetrics().widthPixels - ViewUtils.dp2px(BreathQualityDayOdChartFragment.this.getContext(), 45.0f));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleep/helper/BreathQualityOdChartHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<BreathQualityOdChartHelper> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BreathQualityOdChartHelper getA() {
            return new BreathQualityOdChartHelper(BreathQualityDayOdChartFragment.this.requireContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/android/design/dialog/loading/LoadingDialog;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<LoadingDialog> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialog getA() {
            return new LoadingDialog(BreathQualityDayOdChartFragment.this.requireContext());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BreathQualityDayOdChartFragment() {
        super(R.layout.fragment_breath_quality_od_day);
        this.mDialog = LazyKt__LazyJVMKt.lazy(new e());
        this.mChartHelper = LazyKt__LazyJVMKt.lazy(new d());
        this.chartSlideHelper = LazyKt__LazyJVMKt.lazy(new c());
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sleep.ui.breathquality.BreathQualityDayOdChartFragment$special$$inlined$viewModel$default$1
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
        this.mViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<BreathQualityDayOdViewModel>() { // from class: com.huami.sleep.ui.breathquality.BreathQualityDayOdChartFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sleep.viewmodel.breathquality.BreathQualityDayOdViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final BreathQualityDayOdViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(BreathQualityDayOdViewModel.class), function0, objArr);
            }
        });
    }

    private final void d() {
        BreathQualityDayOdViewModel breathQualityDayOdViewModelK = k();
        breathQualityDayOdViewModelK.getScoreShowLifeData().observe(getViewLifecycleOwner(), new Observer() { // from class: d70
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BreathQualityDayOdChartFragment.e(this.a, (BreathQualityDayOdVo) obj);
            }
        });
        breathQualityDayOdViewModelK.getEmptyLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: e70
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BreathQualityDayOdChartFragment.f(this.a, (Boolean) obj);
            }
        });
        breathQualityDayOdViewModelK.getDataLoadingResult().observe(getViewLifecycleOwner(), new Observer() { // from class: c70
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BreathQualityDayOdChartFragment.g(this.a, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(BreathQualityDayOdChartFragment breathQualityDayOdChartFragment, BreathQualityDayOdVo breathQualityDayOdVo) {
        if (breathQualityDayOdVo.getSelectInfoList().size() != 0) {
            breathQualityDayOdChartFragment.l(breathQualityDayOdChartFragment.time, breathQualityDayOdChartFragment.getString(R.string.suspected_od));
        } else {
            m(breathQualityDayOdChartFragment, breathQualityDayOdChartFragment.time, null, 2, null);
        }
        View view = breathQualityDayOdChartFragment.getView();
        breathQualityDayOdChartFragment.i().refreshBarChart((FrameLayout) (view == null ? null : view.findViewById(R.id.chartContentFL)), breathQualityDayOdVo, breathQualityDayOdChartFragment.new a(breathQualityDayOdVo), b.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(BreathQualityDayOdChartFragment breathQualityDayOdChartFragment, Boolean bool) {
        View view = breathQualityDayOdChartFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.legendLL), !bool.booleanValue());
        View view2 = breathQualityDayOdChartFragment.getView();
        ViewExKt.setVisible(view2 == null ? null : view2.findViewById(R.id.chartContentFL), !bool.booleanValue());
        View view3 = breathQualityDayOdChartFragment.getView();
        ViewExKt.setVisible(view3 != null ? view3.findViewById(R.id.emptyTv) : null, bool.booleanValue());
        if (bool.booleanValue()) {
            m(breathQualityDayOdChartFragment, breathQualityDayOdChartFragment.time, null, 2, null);
        } else {
            breathQualityDayOdChartFragment.l(breathQualityDayOdChartFragment.time, breathQualityDayOdChartFragment.getString(R.string.suspected_od));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(BreathQualityDayOdChartFragment breathQualityDayOdChartFragment, Resource resource) {
        int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
        if (i == 1) {
            breathQualityDayOdChartFragment.j().dismiss();
        } else if (i != 2) {
            breathQualityDayOdChartFragment.j().setFailed("");
        } else {
            breathQualityDayOdChartFragment.j().setMessage(breathQualityDayOdChartFragment.getString(R.string.loading));
            breathQualityDayOdChartFragment.j().show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewSlideWrapper h() {
        return (ViewSlideWrapper) this.chartSlideHelper.getValue();
    }

    private final BreathQualityOdChartHelper i() {
        return (BreathQualityOdChartHelper) this.mChartHelper.getValue();
    }

    private final LoadingDialog j() {
        return (LoadingDialog) this.mDialog.getValue();
    }

    private final BreathQualityDayOdViewModel k() {
        return (BreathQualityDayOdViewModel) this.mViewModel.getValue();
    }

    private final void l(long timeStamp, String appendText) {
        View view = getView();
        TextView textView = (TextView) (view == null ? null : view.findViewById(R.id.chartTitleTv));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(SleepTimeUtil.INSTANCE.formatTimeYMD(timeStamp));
        if (appendText != null) {
            stringBuffer.append(" ");
            stringBuffer.append(appendText);
        }
        Unit unit = Unit.INSTANCE;
        textView.setText(stringBuffer.toString());
    }

    @ExperimentalCoroutinesApi
    private final void loadData() {
        String string;
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string = arguments.getString("user_id")) != null) {
            str = string;
        }
        Bundle arguments2 = getArguments();
        Long lValueOf = arguments2 == null ? null : Long.valueOf(arguments2.getLong("time"));
        long jCurrentTimeMillis = lValueOf == null ? System.currentTimeMillis() : lValueOf.longValue();
        this.time = jCurrentTimeMillis;
        m(this, jCurrentTimeMillis, null, 2, null);
        k().getOdShowData(str, this.time);
        KoinExtKt.getSleepDataManager().startAnalysis(str, TimeShowUtilsKt.toDateString(this.time));
    }

    public static /* synthetic */ void m(BreathQualityDayOdChartFragment breathQualityDayOdChartFragment, long j, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        breathQualityDayOdChartFragment.l(j, str);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        d();
        loadData();
    }
}
