package com.huami.sleep.statistic.ui;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentTransaction;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.util.Index;
import com.huami.sleep.R;
import com.huami.sleep.baseui.LazyFragment;
import com.huami.sleep.daysleep.quotient.view.SleepQuotientView;
import com.huami.sleep.ext.ViewExKt;
import com.huami.sleep.sleephome.vo.ShareSleepVo;
import com.huami.sleep.sleepintrodetail.vo.AvgTipInfoVo;
import com.huami.sleep.sleepstatefeel.ui.MYSleepStateFeelFragment;
import com.huami.sleep.sleepstatefeel.ui.WeekSleepStateFeelFragment;
import com.huami.sleep.statistic.breath.BreathQualityViewForYMW;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.statistic.dto.TimeParam;
import com.huami.sleep.statistic.helper.BarChartBuilder;
import com.huami.sleep.statistic.helper.ChartHelper;
import com.huami.sleep.statistic.helper.RegularChartBuilder;
import com.huami.sleep.statistic.helper.SleepRegularChartHelper;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.sleep.statistic.ui.SleepStatisticsFragment;
import com.huami.sleep.statistic.viewmodel.SleepStatisticsViewModel;
import com.huami.sleep.statistic.vo.SleepRegularChartVo;
import com.huami.sleep.util.SleepTimeUtil;
import com.huami.sleep.util.TimeShowUtilsKt;
import com.huami.sleep.util.ViewSlideWrapper;
import com.huami.sleep.util.ViewUtils;
import com.huami.sleep.view.UnitTextView;
import com.huami.widget.typeface.TypefaceTextView;
import com.loc.z;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Arrays;
import java.util.Date;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 C2\u00020\u0001:\u0001CB\u0007¢\u0006\u0004\bA\u0010BJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001a\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0002J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0012\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u001a\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u0002H\u0016J\b\u0010\u001e\u001a\u00020\u0002H\u0016R\u001d\u0010$\u001a\u00020\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010)\u001a\u00020%8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010(R\u001d\u0010.\u001a\u00020*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010-R+\u0010\u000e\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001d\u0010>\u001a\u00020:8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010!\u001a\u0004\b<\u0010=R\u001d\u0010@\u001a\u00020:8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b?\u0010=¨\u0006D"}, d2 = {"Lcom/huami/sleep/statistic/ui/SleepStatisticsFragment;", "Lcom/huami/sleep/baseui/LazyFragment;", "", "initView", "loadData", "t", "", "isEmpty", "m", "Lcom/huami/sleep/sleepintrodetail/vo/AvgTipInfoVo;", "avgTipInfoVo", "selected", "G", "", "time", "Lcom/huami/sleep/statistic/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "l", hl.k, "Lcom/huami/sleep/sleephome/vo/ShareSleepVo;", "shareSleepVo", "E", "", "r", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "lazyInit", "visibleAfterLoaded", "Lcom/huami/sleep/statistic/viewmodel/SleepStatisticsViewModel;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", DTransferConstants.SEARCH_KEY, "()Lcom/huami/sleep/statistic/viewmodel/SleepStatisticsViewModel;", "sleepStatisticsViewModel", "Lcom/huami/sleep/statistic/helper/ChartHelper;", "e", GoogleApiAvailabilityLight.b, "()Lcom/huami/sleep/statistic/helper/ChartHelper;", "chartHelper", "Lcom/huami/sleep/statistic/helper/SleepRegularChartHelper;", "f", "o", "()Lcom/huami/sleep/statistic/helper/SleepRegularChartHelper;", "regularChartHelper", "<set-?>", "g", "Lkotlin/properties/ReadWriteProperty;", "getTime", "()J", "F", "(J)V", "h", "Lcom/huami/sleep/statistic/dto/TimeMode;", "i", "Lcom/huami/sleep/sleephome/vo/ShareSleepVo;", "Lcom/huami/sleep/util/ViewSlideWrapper;", z.j, SOAP.XMLNS, "()Lcom/huami/sleep/util/ViewSlideWrapper;", "viewSlideHelper", com.google.android.exoplayer2.text.ttml.b.r, "sleRegularSlideHelper", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class SleepStatisticsFragment extends LazyFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] l;

    @NotNull
    private static final String m = "time_mode";

    @NotNull
    private static final String n = "time";

    @NotNull
    private static final String o = "user_id";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy sleepStatisticsViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy chartHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy regularChartHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty time;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private TimeMode timeMode;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private ShareSleepVo shareSleepVo;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewSlideHelper;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy sleRegularSlideHelper;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/huami/sleep/statistic/ui/SleepStatisticsFragment$Companion;", "", "", "userId", "Lcom/huami/sleep/statistic/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "", "time", "Lcom/huami/sleep/statistic/ui/SleepStatisticsFragment;", "getInstance", "ARGS_TIME", "Ljava/lang/String;", "ARGS_TIME_MODE", "ARGS_USER_ID", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SleepStatisticsFragment getInstance(@NotNull String userId, @NotNull TimeMode timeMode, long time) {
            SleepStatisticsFragment sleepStatisticsFragment = new SleepStatisticsFragment();
            Bundle bundle = new Bundle();
            bundle.putString("time_mode", timeMode.name());
            bundle.putLong("time", time);
            bundle.putString("user_id", userId);
            Unit unit = Unit.INSTANCE;
            sleepStatisticsFragment.setArguments(bundle);
            return sleepStatisticsFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeMode.values().length];
            iArr[TimeMode.DAY.ordinal()] = 1;
            iArr[TimeMode.WEEK.ordinal()] = 2;
            iArr[TimeMode.MONTH.ordinal()] = 3;
            iArr[TimeMode.YEAR.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleep/statistic/helper/ChartHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ChartHelper> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChartHelper invoke() {
            return new ChartHelper(SleepStatisticsFragment.this.requireContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/chart/util/Index;", "index", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Index, Unit> {
        public final /* synthetic */ SleepStatisticsViewModel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SleepStatisticsViewModel sleepStatisticsViewModel) {
            super(1);
            this.a = sleepStatisticsViewModel;
        }

        public final void a(@NotNull Index index) {
            this.a.setSleepChartIndex(index);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Index index) {
            a(index);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public final /* synthetic */ SleepStatisticsViewModel b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SleepStatisticsViewModel sleepStatisticsViewModel) {
            super(0);
            this.b = sleepStatisticsViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SleepStatisticsFragment.this.s().reset();
            AvgTipInfoVo totalAvgInfo = this.b.getTotalAvgInfo();
            if (totalAvgInfo == null) {
                return;
            }
            SleepStatisticsFragment.this.G(totalAvgInfo, false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Lcom/huami/sleep/statistic/vo/SleepRegularChartVo;", "time", "", "centerX", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function2<SleepRegularChartVo, Float, Unit> {
        public final /* synthetic */ SleepStatisticsViewModel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SleepStatisticsViewModel sleepStatisticsViewModel) {
            super(2);
            this.a = sleepStatisticsViewModel;
        }

        public final void a(@NotNull SleepRegularChartVo sleepRegularChartVo, float f) {
            this.a.setSleepRegularChartIndex(sleepRegularChartVo, f);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(SleepRegularChartVo sleepRegularChartVo, Float f) {
            a(sleepRegularChartVo, f.floatValue());
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
            SleepStatisticsFragment.this.p().reset();
            View view = SleepStatisticsFragment.this.getView();
            ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.regularTipTv), false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleep/statistic/helper/SleepRegularChartHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<SleepRegularChartHelper> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SleepRegularChartHelper invoke() {
            return new SleepRegularChartHelper(SleepStatisticsFragment.this.requireContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleep/util/ViewSlideWrapper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<ViewSlideWrapper> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewSlideWrapper invoke() {
            View view = SleepStatisticsFragment.this.getView();
            return new ViewSlideWrapper(view == null ? null : view.findViewById(R.id.regularTipTv), ViewUtils.dp2px(SleepStatisticsFragment.this.getContext(), 30.0f), SleepStatisticsFragment.this.getResources().getDisplayMetrics().widthPixels - ViewUtils.dp2px(SleepStatisticsFragment.this.getContext(), 45.0f));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleep/util/ViewSlideWrapper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<ViewSlideWrapper> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewSlideWrapper invoke() {
            View view = SleepStatisticsFragment.this.getView();
            return new ViewSlideWrapper(view == null ? null : view.findViewById(R.id.tipLayout), ViewUtils.dp2px(SleepStatisticsFragment.this.getContext(), 8.0f), SleepStatisticsFragment.this.getResources().getDisplayMetrics().widthPixels - ViewUtils.dp2px(SleepStatisticsFragment.this.getContext(), 15.0f));
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[6];
        kPropertyArr[3] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(SleepStatisticsFragment.class), "time", "getTime()J"));
        l = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SleepStatisticsFragment() {
        super(R.layout.fragment_sleep_statistics);
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sleep.statistic.ui.SleepStatisticsFragment$special$$inlined$viewModel$default$1
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
        this.sleepStatisticsViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SleepStatisticsViewModel>() { // from class: com.huami.sleep.statistic.ui.SleepStatisticsFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sleep.statistic.viewmodel.SleepStatisticsViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SleepStatisticsViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SleepStatisticsViewModel.class), function0, objArr);
            }
        });
        this.chartHelper = LazyKt__LazyJVMKt.lazy(new a());
        this.regularChartHelper = LazyKt__LazyJVMKt.lazy(new f());
        this.time = Delegates.INSTANCE.notNull();
        this.timeMode = TimeMode.WEEK;
        this.viewSlideHelper = LazyKt__LazyJVMKt.lazy(new h());
        this.sleRegularSlideHelper = LazyKt__LazyJVMKt.lazy(new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(SleepStatisticsFragment sleepStatisticsFragment, SleepStatisticsViewModel sleepStatisticsViewModel, RegularChartBuilder regularChartBuilder) {
        SleepRegularChartHelper sleepRegularChartHelperO = sleepStatisticsFragment.o();
        View view = sleepStatisticsFragment.getView();
        sleepRegularChartHelperO.refreshBarChart((ViewGroup) (view == null ? null : view.findViewById(R.id.sleepRegular)), regularChartBuilder, new d(sleepStatisticsViewModel), sleepStatisticsFragment.new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(SleepStatisticsFragment sleepStatisticsFragment, Boolean bool) {
        View view = sleepStatisticsFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.slpRegularLayout), bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(SleepStatisticsFragment sleepStatisticsFragment, String str) {
        View view = sleepStatisticsFragment.getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.regularTipTv))).setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(SleepStatisticsFragment sleepStatisticsFragment, Float f2) {
        sleepStatisticsFragment.p().slide(f2.floatValue() - ViewUtils.dp2px(sleepStatisticsFragment.requireContext(), 15.0f));
        View view = sleepStatisticsFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.regularTipTv), true);
    }

    private final void E(ShareSleepVo shareSleepVo) {
        if (getMSleepHomeViewModel().getCurrentTab() == r()) {
            getMSleepHomeViewModel().setShareSleepVo(shareSleepVo);
        }
    }

    private final void F(long j) {
        this.time.setValue(this, l[3], Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(AvgTipInfoVo avgTipInfoVo, boolean selected) {
        Unit unit;
        View view = getView();
        ((LinearLayout) (view == null ? null : view.findViewById(R.id.tipLayout))).setBackgroundResource(selected ? R.drawable.slp_info_rect_tip_bg : 0);
        Integer avgValue = avgTipInfoVo.getAvgValue();
        if (avgValue == null) {
            unit = null;
        } else {
            int iIntValue = avgValue.intValue();
            View view2 = getView();
            View viewFindViewById = view2 == null ? null : view2.findViewById(R.id.active_daily_average);
            String[] durationStr$default = TimeShowUtilsKt.getDurationStr$default(iIntValue, requireContext(), false, false, 6, null);
            ((UnitTextView) viewFindViewById).setValues((String[]) Arrays.copyOf(durationStr$default, durationStr$default.length));
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            View view3 = getView();
            ((UnitTextView) (view3 == null ? null : view3.findViewById(R.id.active_daily_average))).setValues(getResources().getString(R.string.sleep_no_data_text), "");
        }
        View view4 = getView();
        ((TypefaceTextView) (view4 == null ? null : view4.findViewById(R.id.sleep_time_lable))).setText(avgTipInfoVo.getTitle());
        View view5 = getView();
        ((TypefaceTextView) (view5 != null ? view5.findViewById(R.id.sleep_time) : null)).setText(avgTipInfoVo.getDate());
    }

    public static /* synthetic */ void H(SleepStatisticsFragment sleepStatisticsFragment, AvgTipInfoVo avgTipInfoVo, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        sleepStatisticsFragment.G(avgTipInfoVo, z);
    }

    private final long getTime() {
        return ((Number) this.time.getValue(this, l[3])).longValue();
    }

    private final void initView() {
        getMSleepHomeViewModel().changeSourceName("");
        View view = getView();
        ((SleepQuotientView) (view == null ? null : view.findViewById(R.id.sleep_quotient_info))).setSleepScoreTitle(R.string.sleep_avg_night_score);
    }

    private final void k(long time, TimeMode timeMode) {
        String string;
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        int i = R.id.slpAnalysisContent;
        SleepAnalysisFragment.Companion companion = SleepAnalysisFragment.INSTANCE;
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string = arguments.getString("user_id")) != null) {
            str = string;
        }
        fragmentTransactionBeginTransaction.add(i, companion.newInstance(time, timeMode, str));
        fragmentTransactionBeginTransaction.commit();
    }

    private final void l(long time, TimeMode timeMode) {
        String string;
        String string2;
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        String str = "";
        if (timeMode == TimeMode.WEEK) {
            int i = R.id.contentLayout;
            WeekSleepStateFeelFragment.Companion companion = WeekSleepStateFeelFragment.INSTANCE;
            Bundle arguments = getArguments();
            if (arguments != null && (string2 = arguments.getString("user_id")) != null) {
                str = string2;
            }
            fragmentTransactionBeginTransaction.add(i, companion.getInstance(str, time));
        } else {
            Pair<Date, Date> dateRangeByTimeModeAndRegister = SleepTimeUtil.INSTANCE.getDateRangeByTimeModeAndRegister(time, timeMode);
            int i2 = R.id.contentLayout;
            MYSleepStateFeelFragment.Companion companion2 = MYSleepStateFeelFragment.INSTANCE;
            Bundle arguments2 = getArguments();
            fragmentTransactionBeginTransaction.add(i2, companion2.getInstance((arguments2 == null || (string = arguments2.getString("user_id")) == null) ? "" : string, dateRangeByTimeModeAndRegister.getFirst().getTime(), dateRangeByTimeModeAndRegister.getSecond().getTime()));
        }
        fragmentTransactionBeginTransaction.commit();
    }

    private final void loadData() {
        q().setTimeParam(new TimeParam(this.timeMode, getTime()));
    }

    private final void m(boolean isEmpty) {
        View view = getView();
        ViewExKt.setInVisible(view == null ? null : view.findViewById(R.id.sleep_time_lable), isEmpty);
        View view2 = getView();
        ViewExKt.setVisible(view2 == null ? null : view2.findViewById(R.id.noDataView), false);
        View view3 = getView();
        ViewExKt.setVisible(view3 == null ? null : view3.findViewById(R.id.sleep_quotient_info), !isEmpty);
        View view4 = getView();
        ViewExKt.setVisible(view4 == null ? null : view4.findViewById(R.id.sleep_quotient_info), !isEmpty);
        View view5 = getView();
        ViewExKt.setVisible(view5 == null ? null : view5.findViewById(R.id.sleep_statistics_chart_intro), !isEmpty);
        View view6 = getView();
        ViewExKt.setVisible(view6 != null ? view6.findViewById(R.id.sleepBreathYMW) : null, !isEmpty);
    }

    private final ChartHelper n() {
        return (ChartHelper) this.chartHelper.getValue();
    }

    private final SleepRegularChartHelper o() {
        return (SleepRegularChartHelper) this.regularChartHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewSlideWrapper p() {
        return (ViewSlideWrapper) this.sleRegularSlideHelper.getValue();
    }

    private final SleepStatisticsViewModel q() {
        return (SleepStatisticsViewModel) this.sleepStatisticsViewModel.getValue();
    }

    private final int r() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.timeMode.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewSlideWrapper s() {
        return (ViewSlideWrapper) this.viewSlideHelper.getValue();
    }

    private final void t() {
        String string;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string2 = arguments.getString("time_mode");
            if (string2 != null) {
                this.timeMode = TimeMode.valueOf(string2);
            }
            F(arguments.getLong("time"));
            l(getTime(), this.timeMode);
            View view = getView();
            ((BreathQualityViewForYMW) (view == null ? null : view.findViewById(R.id.sleepBreathYMW))).initParams(this.timeMode, getTime());
        }
        final SleepStatisticsViewModel sleepStatisticsViewModelQ = q();
        Bundle arguments2 = getArguments();
        String str = "";
        if (arguments2 != null && (string = arguments2.getString("user_id")) != null) {
            str = string;
        }
        sleepStatisticsViewModelQ.setUserId(str);
        sleepStatisticsViewModelQ.getShowEmptyLiveData().observe(viewLifecycleOwner, new Observer() { // from class: q27
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStatisticsFragment.x(this.a, (Boolean) obj);
            }
        });
        sleepStatisticsViewModelQ.getAvgInfoLiveData().observe(viewLifecycleOwner, new Observer() { // from class: p27
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStatisticsFragment.y(this.a, (AvgTipInfoVo) obj);
            }
        });
        sleepStatisticsViewModelQ.getBarChartLiveData().observe(viewLifecycleOwner, new Observer() { // from class: w27
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStatisticsFragment.z(this.a, sleepStatisticsViewModelQ, (BarChartBuilder) obj);
            }
        });
        sleepStatisticsViewModelQ.getSleepRegularData().observe(viewLifecycleOwner, new Observer() { // from class: x27
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStatisticsFragment.A(this.a, sleepStatisticsViewModelQ, (RegularChartBuilder) obj);
            }
        });
        sleepStatisticsViewModelQ.getShowSlpRegularLiveData().observe(viewLifecycleOwner, new Observer() { // from class: r27
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStatisticsFragment.B(this.a, (Boolean) obj);
            }
        });
        sleepStatisticsViewModelQ.getSelectRegularLiveData().observe(viewLifecycleOwner, new Observer() { // from class: t27
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStatisticsFragment.C(this.a, (String) obj);
            }
        });
        sleepStatisticsViewModelQ.getRegularTipPosition().observe(viewLifecycleOwner, new Observer() { // from class: s27
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStatisticsFragment.D(this.a, (Float) obj);
            }
        });
        sleepStatisticsViewModelQ.getSelectAvgInfoLiveData().observe(viewLifecycleOwner, new Observer() { // from class: v27
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStatisticsFragment.u(this.a, (Pair) obj);
            }
        });
        sleepStatisticsViewModelQ.getSleepQuotientInfo(new TimeParam(this.timeMode, getTime())).observe(viewLifecycleOwner, new Observer() { // from class: u27
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStatisticsFragment.v(this.a, (Pair) obj);
            }
        });
        sleepStatisticsViewModelQ.getSleepShareInfoLiveData().observe(viewLifecycleOwner, new Observer() { // from class: o27
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SleepStatisticsFragment.w(this.a, (ShareSleepVo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(SleepStatisticsFragment sleepStatisticsFragment, Pair pair) {
        AvgTipInfoVo avgTipInfoVo = (AvgTipInfoVo) pair.getFirst();
        if (avgTipInfoVo == null) {
            return;
        }
        sleepStatisticsFragment.G(avgTipInfoVo, true);
        sleepStatisticsFragment.s().slide(((Number) pair.getSecond()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(SleepStatisticsFragment sleepStatisticsFragment, Pair pair) {
        if (pair == null) {
            return;
        }
        View view = sleepStatisticsFragment.getView();
        ((SleepQuotientView) (view == null ? null : view.findViewById(R.id.sleep_quotient_info))).setValue(pair);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(SleepStatisticsFragment sleepStatisticsFragment, ShareSleepVo shareSleepVo) {
        sleepStatisticsFragment.shareSleepVo = shareSleepVo;
        sleepStatisticsFragment.E(shareSleepVo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(SleepStatisticsFragment sleepStatisticsFragment, Boolean bool) {
        sleepStatisticsFragment.m(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(SleepStatisticsFragment sleepStatisticsFragment, AvgTipInfoVo avgTipInfoVo) {
        H(sleepStatisticsFragment, avgTipInfoVo, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(SleepStatisticsFragment sleepStatisticsFragment, SleepStatisticsViewModel sleepStatisticsViewModel, BarChartBuilder barChartBuilder) {
        ChartHelper chartHelperN = sleepStatisticsFragment.n();
        View view = sleepStatisticsFragment.getView();
        chartHelperN.refreshBarChart((ViewGroup) (view == null ? null : view.findViewById(R.id.chart_container)), barChartBuilder, new b(sleepStatisticsViewModel), sleepStatisticsFragment.new c(sleepStatisticsViewModel));
    }

    @Override // com.huami.sleep.baseui.LazyFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.sleep.baseui.LazyFragment
    public void lazyInit() {
        loadData();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        t();
        k(getTime(), this.timeMode);
    }

    @Override // com.huami.sleep.baseui.LazyFragment
    public void visibleAfterLoaded() {
        getMSleepHomeViewModel().changeSourceName("");
        E(this.shareSleepVo);
    }
}
