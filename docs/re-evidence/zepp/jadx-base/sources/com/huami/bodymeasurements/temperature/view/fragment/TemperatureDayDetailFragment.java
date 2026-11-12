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
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.common.chart.ChartRefresher;
import com.huami.bodymeasurements.common.chart.vo.ChartDataVo;
import com.huami.bodymeasurements.common.ext.ViewExKt;
import com.huami.bodymeasurements.common.utils.TimeFormatUtils;
import com.huami.bodymeasurements.common.utils.TimeUtils;
import com.huami.bodymeasurements.common.view.ViewSlideWrapper;
import com.huami.bodymeasurements.detailframe.event.EventTargetPage;
import com.huami.bodymeasurements.detailframe.event.EventTargetType;
import com.huami.bodymeasurements.temperature.R;
import com.huami.bodymeasurements.temperature.model.converter.TempUnitConverter;
import com.huami.bodymeasurements.temperature.model.koin.ScopesKt;
import com.huami.bodymeasurements.temperature.model.koin.api.TempExternalApi;
import com.huami.bodymeasurements.temperature.view.TemperatureAddDataActivity;
import com.huami.bodymeasurements.temperature.view.TemperatureDetailActivity;
import com.huami.bodymeasurements.temperature.view.TemperatureHistoryActivity;
import com.huami.bodymeasurements.temperature.view.fragment.TemperatureDayDetailFragment;
import com.huami.bodymeasurements.temperature.view.vo.TempStatisticsInfo;
import com.huami.bodymeasurements.temperature.view.vo.chart.TempMixLineChartBuilder;
import com.huami.bodymeasurements.temperature.viewmodel.detail.TempDayDetailViewModel;
import com.huami.chart.util.Index;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.widget.typeface.TypefaceTextView;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 K2\u00020\u0001:\u0001KB\u0007¢\u0006\u0004\bI\u0010JJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0002J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\f\u001a\u00020\u0005H\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002J+\u0010\u0014\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0016J&\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010*\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0007H\u0016J\u000e\u0010-\u001a\u00020\u00052\u0006\u0010,\u001a\u00020+R\u001d\u00103\u001a\u00020.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001f\u0010\u0019\u001a\u0004\u0018\u00010\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u0010\u0004R\u0018\u00108\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010;\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001f\u0010?\u001a\u0004\u0018\u00010\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00100\u001a\u0004\b=\u0010>R\u001d\u0010B\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u00100\u001a\u0004\b@\u0010AR\u001d\u0010D\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\bC\u0010AR\u001d\u0010H\u001a\u00020E8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\bF\u0010G¨\u0006L"}, d2 = {"Lcom/huami/bodymeasurements/temperature/view/fragment/TemperatureDayDetailFragment;", "Landroidx/fragment/app/Fragment;", "", "h", "()Ljava/lang/Long;", "", "initView", "", com.google.android.exoplayer2.text.ttml.b.r, "loadData", "", "g", DTransferConstants.SEARCH_KEY, "Lcom/huami/bodymeasurements/temperature/view/vo/TempStatisticsInfo;", "statisticsInfo", "w", "", "tempFloat", "selected", "timeStr", "f", "(Ljava/lang/Float;ZLjava/lang/String;)V", "Lcom/huami/bodymeasurements/temperature/view/vo/chart/TempMixLineChartBuilder;", "chartBuilder", "v", "time", "u", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onAttach", "onDetach", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "isVisibleToUser", "setUserVisibleHint", "Lcom/huami/bodymeasurements/detailframe/event/EventTargetPage;", "event", "onEventMainThread", "Lcom/huami/bodymeasurements/temperature/viewmodel/detail/TempDayDetailViewModel;", "a", "Lkotlin/Lazy;", "l", "()Lcom/huami/bodymeasurements/temperature/viewmodel/detail/TempDayDetailViewModel;", "viewModel", "b", hl.k, "c", "Ljava/lang/String;", "defaultTimeStr", GoogleApiAvailabilityLight.a, "Z", "hasObserved", "e", "getUserId", "()Ljava/lang/String;", "userId", "i", "()Z", "showAddEntrance", z.j, "showHistoryEntrance", "Lcom/huami/bodymeasurements/common/view/ViewSlideWrapper;", "m", "()Lcom/huami/bodymeasurements/common/view/ViewSlideWrapper;", "viewSlideHelper", "<init>", "()V", "Companion", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class TemperatureDayDetailFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "TemperatureDayDetailFragment";

    @NotNull
    private static final String i = "time";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy time;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private String defaultTimeStr;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean hasObserved;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy userId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy showAddEntrance;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy showHistoryEntrance;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewSlideHelper;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/bodymeasurements/temperature/view/fragment/TemperatureDayDetailFragment$Companion;", "", "", "time", "Lcom/huami/bodymeasurements/temperature/view/fragment/TemperatureDayDetailFragment;", "getInstance", "", "ARGS_TIME", "Ljava/lang/String;", "TAG", "<init>", "()V", "temperature_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TemperatureDayDetailFragment getInstance(long time) {
            TemperatureDayDetailFragment temperatureDayDetailFragment = new TemperatureDayDetailFragment();
            temperatureDayDetailFragment.u(time);
            return temperatureDayDetailFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "time is null";
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
            return "userId is null";
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
            return "reload data";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Lcom/huami/chart/util/Index;", "index", "Lcom/huami/bodymeasurements/common/chart/vo/ChartDataVo;", "data", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function2<Index, ChartDataVo, Unit> {
        public d() {
            super(2);
        }

        public final void a(@NotNull Index index, @NotNull ChartDataVo chartDataVo) {
            TemperatureDayDetailFragment.this.m().slide(index.getCenterX());
            Context context = TemperatureDayDetailFragment.this.getContext();
            if (context == null) {
                return;
            }
            TemperatureDayDetailFragment.this.f(k.toFloatOrNull(chartDataVo.getValue()), true, TimeFormatUtils.INSTANCE.formatTimeYMDHHmm(context, chartDataVo.getTimeStamp()));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Index index, ChartDataVo chartDataVo) {
            a(index, chartDataVo);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Unit> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            TemperatureDayDetailFragment.this.m().reset();
            ChartDataVo value = TemperatureDayDetailFragment.this.l().getLatestValueLiveData().getValue();
            if (value == null) {
                return;
            }
            TemperatureDayDetailFragment temperatureDayDetailFragment = TemperatureDayDetailFragment.this;
            Float floatOrNull = k.toFloatOrNull(value.getValue());
            if (floatOrNull == null) {
                return;
            }
            float fFloatValue = floatOrNull.floatValue();
            Context context = temperatureDayDetailFragment.getContext();
            if (context == null) {
                return;
            }
            temperatureDayDetailFragment.f(Float.valueOf(fFloatValue), false, TimeFormatUtils.INSTANCE.formatTimeYMDHHmm(context, value.getTimeStamp()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Boolean> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            TempExternalApi tempExternalApi = ScopesKt.tempExternalApi(ComponentCallbackExtKt.getKoin(TemperatureDayDetailFragment.this));
            if (tempExternalApi == null) {
                return false;
            }
            return tempExternalApi.showAddEntrance();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<Boolean> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            TempExternalApi tempExternalApi = ScopesKt.tempExternalApi(ComponentCallbackExtKt.getKoin(TemperatureDayDetailFragment.this));
            if (tempExternalApi == null) {
                return false;
            }
            return tempExternalApi.showHistoryEntrance();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\t\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<Long> {
        public h() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Long invoke() {
            return TemperatureDayDetailFragment.this.h();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return TemperatureDayDetailFragment.this.g();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bodymeasurements/common/view/ViewSlideWrapper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<ViewSlideWrapper> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewSlideWrapper invoke() {
            View view = TemperatureDayDetailFragment.this.getView();
            View viewFindViewById = view == null ? null : view.findViewById(R.id.value_container);
            View view2 = TemperatureDayDetailFragment.this.getView();
            float fDpToPx = view2 == null ? 0.0f : ViewExKt.dpToPx(view2, 8.0f);
            float f = TemperatureDayDetailFragment.this.getResources().getDisplayMetrics().widthPixels;
            View view3 = TemperatureDayDetailFragment.this.getView();
            return new ViewSlideWrapper(viewFindViewById, fDpToPx, f - (view3 != null ? ViewExKt.dpToPx(view3, 8.0f) : 0.0f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TemperatureDayDetailFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.bodymeasurements.temperature.view.fragment.TemperatureDayDetailFragment$special$$inlined$viewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<TempDayDetailViewModel>() { // from class: com.huami.bodymeasurements.temperature.view.fragment.TemperatureDayDetailFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.bodymeasurements.temperature.viewmodel.detail.TempDayDetailViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TempDayDetailViewModel invoke() {
                return org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(TempDayDetailViewModel.class), function0, objArr);
            }
        });
        this.time = LazyKt__LazyJVMKt.lazy(new h());
        this.userId = LazyKt__LazyJVMKt.lazy(new i());
        this.showAddEntrance = LazyKt__LazyJVMKt.lazy(new f());
        this.showHistoryEntrance = LazyKt__LazyJVMKt.lazy(new g());
        this.viewSlideHelper = LazyKt__LazyJVMKt.lazy(new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(Float tempFloat, boolean selected, String timeStr) {
        if ((tempFloat == null || Float.isNaN(tempFloat.floatValue())) ? false : true) {
            View view = getView();
            View viewFindViewById = view == null ? null : view.findViewById(R.id.value);
            TempUnitConverter tempUnitConverter = TempUnitConverter.INSTANCE;
            ((TypefaceTextView) viewFindViewById).setText(tempUnitConverter.getTempString(tempFloat.floatValue()));
            View view2 = getView();
            ViewExKt.setVisible(view2 == null ? null : view2.findViewById(R.id.unit), true);
            View view3 = getView();
            ((TypefaceTextView) (view3 == null ? null : view3.findViewById(R.id.unit))).setText(tempUnitConverter.getTempUnitString());
        } else {
            View view4 = getView();
            ((TypefaceTextView) (view4 == null ? null : view4.findViewById(R.id.value))).setText(getString(R.string.bm_temperature_value_invalid));
            View view5 = getView();
            ViewExKt.setVisible(view5 == null ? null : view5.findViewById(R.id.unit), false);
        }
        View view6 = getView();
        ((TypefaceTextView) (view6 == null ? null : view6.findViewById(R.id.timeTv))).setText(timeStr);
        if (!selected) {
            View view7 = getView();
            ((ConstraintLayout) (view7 != null ? view7.findViewById(R.id.value_container) : null)).setBackgroundColor(0);
        } else {
            View view8 = getView();
            ConstraintLayout constraintLayout = (ConstraintLayout) (view8 != null ? view8.findViewById(R.id.value_container) : null);
            constraintLayout.setBackground(ContextCompat.getDrawable(constraintLayout.getContext(), R.drawable.bm_common_value_container_bg));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String g() {
        if (getActivity() == null || !(getActivity() instanceof TemperatureDetailActivity)) {
            return null;
        }
        FragmentActivity activity = getActivity();
        Objects.requireNonNull(activity, "null cannot be cast to non-null type com.huami.bodymeasurements.temperature.view.TemperatureDetailActivity");
        return ((TemperatureDetailActivity) activity).getUserId();
    }

    private final String getUserId() {
        return (String) this.userId.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Long h() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return null;
        }
        return Long.valueOf(arguments.getLong("time"));
    }

    private final boolean i() {
        return ((Boolean) this.showAddEntrance.getValue()).booleanValue();
    }

    private final void initView() {
        View view = getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.add_data_card), i());
        View view2 = getView();
        ViewExKt.setVisible(view2 == null ? null : view2.findViewById(R.id.history_data_card), j());
        int i2 = ViewExKt.isRtl() ? R.drawable.bm_common_icon_left_arrow_dark : R.drawable.bm_common_icon_right_arrow_dark;
        View view3 = getView();
        TypefaceTextView typefaceTextView = (TypefaceTextView) (view3 == null ? null : view3.findViewById(R.id.add_data));
        typefaceTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, i2, 0);
        typefaceTextView.setOnClickListener(new View.OnClickListener() { // from class: tm7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                TemperatureDayDetailFragment.n(this.a, view4);
            }
        });
        View view4 = getView();
        TypefaceTextView typefaceTextView2 = (TypefaceTextView) (view4 == null ? null : view4.findViewById(R.id.history_data));
        typefaceTextView2.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, i2, 0);
        typefaceTextView2.setOnClickListener(new View.OnClickListener() { // from class: um7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                TemperatureDayDetailFragment.o(this.a, view5);
            }
        });
        View view5 = getView();
        ViewExKt.setVisible(view5 != null ? view5.findViewById(R.id.jp_hint_text) : null, p());
    }

    private final boolean j() {
        return ((Boolean) this.showHistoryEntrance.getValue()).booleanValue();
    }

    private final Long k() {
        return (Long) this.time.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TempDayDetailViewModel l() {
        return (TempDayDetailViewModel) this.viewModel.getValue();
    }

    private final void loadData() {
        if (k() == null) {
            HMLog.info(TAG, a.a);
            return;
        }
        if (getUserId() == null) {
            HMLog.info(TAG, b.a);
            return;
        }
        if (this.defaultTimeStr == null) {
            Context context = getContext();
            String dateStrToUI = context == null ? null : TimeUtils.INSTANCE.getDateStrToUI("day", context, k().longValue());
            this.defaultTimeStr = dateStrToUI;
            f(null, false, dateStrToUI);
        }
        l().loadData(k().longValue(), getUserId());
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewSlideWrapper m() {
        return (ViewSlideWrapper) this.viewSlideHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(TemperatureDayDetailFragment temperatureDayDetailFragment, View view) {
        if (temperatureDayDetailFragment.getUserId() == null) {
            return;
        }
        TemperatureAddDataActivity.INSTANCE.launch(view.getContext(), temperatureDayDetailFragment.getUserId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(TemperatureDayDetailFragment temperatureDayDetailFragment, View view) {
        if (temperatureDayDetailFragment.getUserId() == null) {
            return;
        }
        TemperatureHistoryActivity.INSTANCE.launch(view.getContext(), temperatureDayDetailFragment.getUserId());
    }

    private final boolean p() {
        return Intrinsics.areEqual(Locale.getDefault(), Locale.JAPAN) || Intrinsics.areEqual(Locale.getDefault(), Locale.JAPANESE);
    }

    private final void q() {
        if (this.hasObserved) {
            return;
        }
        this.hasObserved = true;
        TempDayDetailViewModel tempDayDetailViewModelL = l();
        tempDayDetailViewModelL.getStatisticsInfoLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: wm7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TemperatureDayDetailFragment.r(this.a, (TempStatisticsInfo) obj);
            }
        });
        tempDayDetailViewModelL.getLatestValueLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: vm7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TemperatureDayDetailFragment.s(this.a, (ChartDataVo) obj);
            }
        });
        tempDayDetailViewModelL.getChartBuilderLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: xm7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TemperatureDayDetailFragment.t(this.a, (TempMixLineChartBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(TemperatureDayDetailFragment temperatureDayDetailFragment, TempStatisticsInfo tempStatisticsInfo) {
        temperatureDayDetailFragment.w(tempStatisticsInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(TemperatureDayDetailFragment temperatureDayDetailFragment, ChartDataVo chartDataVo) {
        String value;
        Float floatOrNull;
        if (chartDataVo == null || (value = chartDataVo.getValue()) == null || (floatOrNull = k.toFloatOrNull(value)) == null) {
            return;
        }
        float fFloatValue = floatOrNull.floatValue();
        Context context = temperatureDayDetailFragment.getContext();
        if (context == null) {
            return;
        }
        temperatureDayDetailFragment.f(Float.valueOf(fFloatValue), false, TimeFormatUtils.INSTANCE.formatTimeYMDHHmm(context, chartDataVo.getTimeStamp()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(TemperatureDayDetailFragment temperatureDayDetailFragment, TempMixLineChartBuilder tempMixLineChartBuilder) {
        temperatureDayDetailFragment.v(tempMixLineChartBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(long time) {
        Bundle bundle = new Bundle();
        bundle.putLong("time", time);
        Unit unit = Unit.INSTANCE;
        setArguments(bundle);
    }

    private final void v(TempMixLineChartBuilder chartBuilder) {
        ChartRefresher chartRefresher = ChartRefresher.INSTANCE;
        View view = getView();
        chartRefresher.refreshMixLineChart((ViewGroup) (view == null ? null : view.findViewById(R.id.chart_container)), chartBuilder, new d(), new e());
    }

    private final void w(TempStatisticsInfo statisticsInfo) {
        boolean z = !statisticsInfo.isInValid();
        View view = getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.group_statistics_zone), z);
        if (z) {
            View view2 = getView();
            View viewFindViewById = view2 == null ? null : view2.findViewById(R.id.statistics_max);
            TempUnitConverter tempUnitConverter = TempUnitConverter.INSTANCE;
            ((TypefaceTextView) viewFindViewById).setText(tempUnitConverter.getTempWithUnitString(statisticsInfo.getMax()));
            View view3 = getView();
            ((TypefaceTextView) (view3 == null ? null : view3.findViewById(R.id.statistics_min))).setText(tempUnitConverter.getTempWithUnitString(statisticsInfo.getMin()));
            View view4 = getView();
            ((TypefaceTextView) (view4 != null ? view4.findViewById(R.id.statistics_avg) : null)).setText(tempUnitConverter.getTempWithUnitString(statisticsInfo.getAvg()));
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        EventBus.getDefault().register(this);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.bm_temperature_fragment_day_detail, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        EventBus.getDefault().unregister(this);
    }

    public final void onEventMainThread(@NotNull EventTargetPage event) {
        if (event.getType() != EventTargetType.ADD || k() == null) {
            return;
        }
        if (TimeUtils.INSTANCE.isSamePeriod(new Date(event.getTargetTime()), new Date(k().longValue()), "day")) {
            HMLog.info(TAG, c.a);
            loadData();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
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
