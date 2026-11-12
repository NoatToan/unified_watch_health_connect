package com.huami.bodymeasurements.temperature.view.fragment;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.common.chart.BarChartBuilder;
import com.huami.bodymeasurements.common.chart.ChartDataConverterKt;
import com.huami.bodymeasurements.common.chart.ChartRefresher;
import com.huami.bodymeasurements.common.chart.vo.BarChartVo;
import com.huami.bodymeasurements.common.ext.ViewExKt;
import com.huami.bodymeasurements.common.utils.TimeFormatUtils;
import com.huami.bodymeasurements.common.utils.TimeUtils;
import com.huami.bodymeasurements.common.view.ViewSlideWrapper;
import com.huami.bodymeasurements.detailframe.event.EventTargetPage;
import com.huami.bodymeasurements.detailframe.event.EventTargetType;
import com.huami.bodymeasurements.temperature.R;
import com.huami.bodymeasurements.temperature.model.converter.TempUnitConverter;
import com.huami.bodymeasurements.temperature.view.TemperatureDetailActivity;
import com.huami.bodymeasurements.temperature.view.fragment.TemperatureStatisticsDetailFragment;
import com.huami.bodymeasurements.temperature.view.vo.TempStatisticsInfo;
import com.huami.bodymeasurements.temperature.viewmodel.detail.TempStatisticsDetailViewModel;
import com.huami.chart.util.Index;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.widget.typeface.TypefaceTextView;
import com.loc.z;
import com.xiaomi.mipush.sdk.Constants;
import de.greenrobot.event.EventBus;
import java.util.Date;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 E2\u00020\u0001:\u0001EB\u0007¢\u0006\u0004\bC\u0010DJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002JF\u0010\u0012\u001a\u00020\u00022\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u0002H\u0016J&\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010*\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u000fH\u0016J\u000e\u0010-\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+R\u001d\u00103\u001a\u00020.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00105R\u0018\u00109\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u00105R\u0016\u0010;\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010:R\u001f\u0010>\u001a\u0004\u0018\u00010\u00058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u00100\u001a\u0004\b<\u0010=R\u001d\u0010B\u001a\u00020?8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00100\u001a\u0004\b@\u0010A¨\u0006F"}, d2 = {"Lcom/huami/bodymeasurements/temperature/view/fragment/TemperatureStatisticsDetailFragment;", "Landroidx/fragment/app/Fragment;", "", "f", "loadData", "", "e", z.j, "Lcom/huami/bodymeasurements/temperature/view/vo/TempStatisticsInfo;", "statisticsInfo", com.google.android.exoplayer2.text.ttml.b.r, "Lkotlin/Pair;", "", "abnormalPair", "normalPair", "", "selected", "dateStr", GoogleApiAvailabilityLight.a, "Lcom/huami/bodymeasurements/common/chart/BarChartBuilder;", "barChartBuilder", "o", "dateMode", "g", "", "time", GoogleApiAvailabilityLight.b, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onAttach", "onDetach", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "isVisibleToUser", "setUserVisibleHint", "Lcom/huami/bodymeasurements/detailframe/event/EventTargetPage;", "event", "onEventMainThread", "Lcom/huami/bodymeasurements/temperature/viewmodel/detail/TempStatisticsDetailViewModel;", "a", "Lkotlin/Lazy;", "h", "()Lcom/huami/bodymeasurements/temperature/viewmodel/detail/TempStatisticsDetailViewModel;", "viewModel", "b", "Ljava/lang/String;", "c", "Ljava/lang/Long;", "defaultDate", "defaultStatisticsTitle", "Z", "hasObserved", "getUserId", "()Ljava/lang/String;", "userId", "Lcom/huami/bodymeasurements/common/view/ViewSlideWrapper;", "i", "()Lcom/huami/bodymeasurements/common/view/ViewSlideWrapper;", "viewSlideHelper", "<init>", "()V", "Companion", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class TemperatureStatisticsDetailFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "TemperatureStatisticsDetailFragment";

    @NotNull
    private static final String i = "date_mode";

    @NotNull
    private static final String j = "time";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private String dateMode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Long time;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private String defaultDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private String defaultStatisticsTitle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean hasObserved;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy userId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewSlideHelper;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/huami/bodymeasurements/temperature/view/fragment/TemperatureStatisticsDetailFragment$Companion;", "", "", "dateMode", "", "time", "Lcom/huami/bodymeasurements/temperature/view/fragment/TemperatureStatisticsDetailFragment;", "getInstance", "ARGS_DATE_MODE", "Ljava/lang/String;", "ARGS_TIME", "TAG", "<init>", "()V", "temperature_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TemperatureStatisticsDetailFragment getInstance(@NotNull String dateMode, long time) {
            TemperatureStatisticsDetailFragment temperatureStatisticsDetailFragment = new TemperatureStatisticsDetailFragment();
            temperatureStatisticsDetailFragment.n(dateMode, time);
            return temperatureStatisticsDetailFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "getParamData dateMode:" + ((Object) TemperatureStatisticsDetailFragment.this.dateMode) + ",time:" + TemperatureStatisticsDetailFragment.this.time;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "dateMode or time is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "userId is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "reload data";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\n"}, d2 = {"Lcom/huami/chart/util/Index;", "index", "Lkotlin/Pair;", "", "high", "low", "", "time", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function4<Index, Pair<? extends Float, ? extends Float>, Pair<? extends Float, ? extends Float>, Long, Unit> {
        public e() {
            super(4);
        }

        public final void a(@NotNull Index index, @Nullable Pair<Float, Float> pair, @Nullable Pair<Float, Float> pair2, long j) {
            TemperatureStatisticsDetailFragment.this.i().slide(index.getCenterX());
            Context context = TemperatureStatisticsDetailFragment.this.getContext();
            TemperatureStatisticsDetailFragment.this.d(pair, pair2, true, context == null ? null : TimeFormatUtils.INSTANCE.formatTimeYMD(context, j));
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Index index, Pair<? extends Float, ? extends Float> pair, Pair<? extends Float, ? extends Float> pair2, Long l) {
            a(index, pair, pair2, l.longValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Unit> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            TemperatureStatisticsDetailFragment.this.i().reset();
            BarChartVo value = TemperatureStatisticsDetailFragment.this.h().getLatestValueLiveData().getValue();
            if (value == null) {
                return;
            }
            TemperatureStatisticsDetailFragment temperatureStatisticsDetailFragment = TemperatureStatisticsDetailFragment.this;
            BarChartVo rawBarChartVo = ChartDataConverterKt.toRawBarChartVo(value);
            Context context = temperatureStatisticsDetailFragment.getContext();
            temperatureStatisticsDetailFragment.d(rawBarChartVo.getHighValue(), rawBarChartVo.getLowValue(), false, context == null ? null : TimeFormatUtils.INSTANCE.formatTimeYMD(context, value.getTimeStamp()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return TemperatureStatisticsDetailFragment.this.e();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bodymeasurements/common/view/ViewSlideWrapper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<ViewSlideWrapper> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewSlideWrapper invoke() {
            View view = TemperatureStatisticsDetailFragment.this.getView();
            View viewFindViewById = view == null ? null : view.findViewById(R.id.value_container);
            View view2 = TemperatureStatisticsDetailFragment.this.getView();
            float fDpToPx = view2 == null ? 0.0f : ViewExKt.dpToPx(view2, 8.0f);
            float f = TemperatureStatisticsDetailFragment.this.getResources().getDisplayMetrics().widthPixels;
            View view3 = TemperatureStatisticsDetailFragment.this.getView();
            return new ViewSlideWrapper(viewFindViewById, fDpToPx, f - (view3 != null ? ViewExKt.dpToPx(view3, 8.0f) : 0.0f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TemperatureStatisticsDetailFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.bodymeasurements.temperature.view.fragment.TemperatureStatisticsDetailFragment$special$$inlined$viewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<TempStatisticsDetailViewModel>() { // from class: com.huami.bodymeasurements.temperature.view.fragment.TemperatureStatisticsDetailFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.bodymeasurements.temperature.viewmodel.detail.TempStatisticsDetailViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TempStatisticsDetailViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(TempStatisticsDetailViewModel.class), function0, objArr);
            }
        });
        this.userId = LazyKt__LazyJVMKt.lazy(new g());
        this.viewSlideHelper = LazyKt__LazyJVMKt.lazy(new h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Pair<Float, Float> abnormalPair, Pair<Float, Float> normalPair, boolean selected, String dateStr) {
        Float first = normalPair == null ? null : normalPair.getFirst();
        if (first == null) {
            first = abnormalPair == null ? null : abnormalPair.getFirst();
        }
        Float second = abnormalPair == null ? null : abnormalPair.getSecond();
        if (second == null) {
            second = normalPair == null ? null : normalPair.getSecond();
        }
        if ((first == null && second == null) ? false : true) {
            if (Intrinsics.areEqual(first, second)) {
                View view = getView();
                ((TypefaceTextView) (view == null ? null : view.findViewById(R.id.value))).setText(TempUnitConverter.INSTANCE.getTempString(first.floatValue()));
            } else {
                View view2 = getView();
                View viewFindViewById = view2 == null ? null : view2.findViewById(R.id.value);
                StringBuilder sb = new StringBuilder();
                TempUnitConverter tempUnitConverter = TempUnitConverter.INSTANCE;
                sb.append(tempUnitConverter.getTempString(first.floatValue()));
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                sb.append(tempUnitConverter.getTempString(second.floatValue()));
                ((TypefaceTextView) viewFindViewById).setText(sb.toString());
            }
            View view3 = getView();
            ViewExKt.setVisible(view3 == null ? null : view3.findViewById(R.id.unit), true);
            View view4 = getView();
            ((TypefaceTextView) (view4 == null ? null : view4.findViewById(R.id.unit))).setText(TempUnitConverter.INSTANCE.getTempUnitString());
        } else {
            View view5 = getView();
            ((TypefaceTextView) (view5 == null ? null : view5.findViewById(R.id.value))).setText(getString(R.string.bm_temperature_value_invalid));
            View view6 = getView();
            ViewExKt.setVisible(view6 == null ? null : view6.findViewById(R.id.unit), false);
        }
        View view7 = getView();
        ((TypefaceTextView) (view7 == null ? null : view7.findViewById(R.id.timeTv))).setText(dateStr);
        if (!selected) {
            View view8 = getView();
            ((ConstraintLayout) (view8 != null ? view8.findViewById(R.id.value_container) : null)).setBackgroundColor(0);
        } else {
            View view9 = getView();
            ConstraintLayout constraintLayout = (ConstraintLayout) (view9 != null ? view9.findViewById(R.id.value_container) : null);
            constraintLayout.setBackground(ContextCompat.getDrawable(constraintLayout.getContext(), R.drawable.bm_common_value_container_bg));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String e() {
        if (getActivity() == null || !(getActivity() instanceof TemperatureDetailActivity)) {
            return null;
        }
        FragmentActivity activity = getActivity();
        Objects.requireNonNull(activity, "null cannot be cast to non-null type com.huami.bodymeasurements.temperature.view.TemperatureDetailActivity");
        return ((TemperatureDetailActivity) activity).getUserId();
    }

    private final void f() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.dateMode = arguments.getString(i);
            this.time = Long.valueOf(arguments.getLong("time"));
        }
        HMLog.info(TAG, new a());
    }

    private final String g(String dateMode) {
        int iHashCode = dateMode.hashCode();
        if (iHashCode != 3645428) {
            if (iHashCode != 3704893) {
                if (iHashCode == 104080000 && dateMode.equals("month")) {
                    return getString(R.string.bm_temperature_statistics_month);
                }
            } else if (dateMode.equals("year")) {
                return getString(R.string.bm_temperature_statistics_year);
            }
        } else if (dateMode.equals("week")) {
            return getString(R.string.bm_temperature_statistics_week);
        }
        return "";
    }

    private final String getUserId() {
        return (String) this.userId.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TempStatisticsDetailViewModel h() {
        return (TempStatisticsDetailViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewSlideWrapper i() {
        return (ViewSlideWrapper) this.viewSlideHelper.getValue();
    }

    private final void j() {
        if (this.hasObserved) {
            return;
        }
        this.hasObserved = true;
        TempStatisticsDetailViewModel tempStatisticsDetailViewModelH = h();
        tempStatisticsDetailViewModelH.getStatisticsInfoLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: dn7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TemperatureStatisticsDetailFragment.k(this.a, (TempStatisticsInfo) obj);
            }
        });
        tempStatisticsDetailViewModelH.getLatestValueLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: cn7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TemperatureStatisticsDetailFragment.l(this.a, (BarChartVo) obj);
            }
        });
        tempStatisticsDetailViewModelH.getChartBuilderLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: bn7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TemperatureStatisticsDetailFragment.m(this.a, (BarChartBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(TemperatureStatisticsDetailFragment temperatureStatisticsDetailFragment, TempStatisticsInfo tempStatisticsInfo) {
        temperatureStatisticsDetailFragment.p(tempStatisticsInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(TemperatureStatisticsDetailFragment temperatureStatisticsDetailFragment, BarChartVo barChartVo) {
        if (barChartVo == null) {
            return;
        }
        BarChartVo rawBarChartVo = ChartDataConverterKt.toRawBarChartVo(barChartVo);
        Context context = temperatureStatisticsDetailFragment.getContext();
        temperatureStatisticsDetailFragment.d(rawBarChartVo.getHighValue(), rawBarChartVo.getLowValue(), false, context == null ? null : TimeFormatUtils.INSTANCE.formatTimeYMD(context, barChartVo.getTimeStamp()));
    }

    private final void loadData() {
        if (this.dateMode == null || this.time == null) {
            HMLog.info(TAG, b.a);
            return;
        }
        if (getUserId() == null) {
            HMLog.info(TAG, c.a);
            return;
        }
        if (this.defaultDate == null || this.defaultStatisticsTitle == null) {
            Context context = getContext();
            this.defaultDate = context == null ? null : TimeUtils.INSTANCE.getDateStrToUI(this.dateMode, context, this.time.longValue());
            this.defaultStatisticsTitle = g(this.dateMode);
            d(null, null, false, this.defaultDate);
        }
        h().loadData(this.dateMode, this.time.longValue(), getUserId());
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(TemperatureStatisticsDetailFragment temperatureStatisticsDetailFragment, BarChartBuilder barChartBuilder) {
        temperatureStatisticsDetailFragment.o(barChartBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(String dateMode, long time) {
        Bundle bundle = new Bundle();
        bundle.putString(i, dateMode);
        bundle.putLong("time", time);
        Unit unit = Unit.INSTANCE;
        setArguments(bundle);
    }

    private final void o(BarChartBuilder barChartBuilder) {
        if (barChartBuilder == null) {
            return;
        }
        ChartRefresher chartRefresher = ChartRefresher.INSTANCE;
        View view = getView();
        chartRefresher.refreshBarChart((ViewGroup) (view == null ? null : view.findViewById(R.id.chart_container)), barChartBuilder, new e(), new f());
    }

    private final void p(TempStatisticsInfo statisticsInfo) {
        boolean z = !statisticsInfo.isInValid();
        View view = getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.statistics_container_card), z);
        if (z) {
            View view2 = getView();
            ((TypefaceTextView) (view2 == null ? null : view2.findViewById(R.id.statistics_title))).setText(this.defaultStatisticsTitle);
            View view3 = getView();
            View viewFindViewById = view3 == null ? null : view3.findViewById(R.id.statistics_max);
            TempUnitConverter tempUnitConverter = TempUnitConverter.INSTANCE;
            ((TypefaceTextView) viewFindViewById).setText(tempUnitConverter.getTempWithUnitString(statisticsInfo.getMax()));
            View view4 = getView();
            ((TypefaceTextView) (view4 == null ? null : view4.findViewById(R.id.statistics_min))).setText(tempUnitConverter.getTempWithUnitString(statisticsInfo.getMin()));
            View view5 = getView();
            ((TypefaceTextView) (view5 != null ? view5.findViewById(R.id.statistics_avg) : null)).setText(tempUnitConverter.getTempWithUnitString(statisticsInfo.getAvg()));
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        f();
        EventBus.getDefault().register(this);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.bm_temperature_fragment_statistics_detail, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        EventBus.getDefault().unregister(this);
    }

    public final void onEventMainThread(@NotNull EventTargetPage event) {
        if (event.getType() != EventTargetType.ADD || this.time == null || this.dateMode == null) {
            return;
        }
        if (TimeUtils.INSTANCE.isSamePeriod(new Date(event.getTargetTime()), new Date(this.time.longValue()), this.dateMode)) {
            HMLog.info(TAG, d.a);
            loadData();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getUserVisibleHint()) {
            loadData();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean isVisibleToUser) {
        if (!isVisibleToUser || getView() == null) {
            return;
        }
        loadData();
    }
}
