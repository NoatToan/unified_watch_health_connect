package com.xiaomi.hm.health.healthdata.ui.detail.healthdata;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.chart.util.Index;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.sleep.util.ViewSlideWrapper;
import com.huami.sleep.util.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.R;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoManager;
import com.xiaomi.hm.health.bodyfat.utils.BodyParamsUtils;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import com.xiaomi.hm.health.healthdata.dto.TimeMode;
import com.xiaomi.hm.health.healthdata.ext.DataExKt;
import com.xiaomi.hm.health.healthdata.ext.ViewExKt;
import com.xiaomi.hm.health.healthdata.ui.base.DataDetailBaseNewActivity;
import com.xiaomi.hm.health.healthdata.ui.detail.healthdata.HealthDataDetailFragment;
import com.xiaomi.hm.health.healthdata.ui.view.BarChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.ColoredProgressBar;
import com.xiaomi.hm.health.healthdata.ui.view.ColoredProgressBarBuilder;
import com.xiaomi.hm.health.healthdata.ui.view.HealthChartBuilderKt;
import com.xiaomi.hm.health.healthdata.ui.view.LineChartBuilder;
import com.xiaomi.hm.health.healthdata.ui.viewmodel.ChartDataViewModel;
import com.xiaomi.hm.health.healthdata.ui.viewmodel.HealthDataDetailViewModel;
import com.xiaomi.hm.health.healthdata.ui.vo.BarChartVo;
import com.xiaomi.hm.health.healthdata.ui.vo.HealthChartDataVo;
import com.xiaomi.hm.health.healthdata.ui.vo.TimeParam;
import com.xiaomi.hm.health.healthdata.ui.vo.converter.DataConverterKt;
import com.xiaomi.hm.health.healthdata.ui.vo.eventbus.EventAddDataSuccess;
import com.xiaomi.hm.health.healthdata.utils.BodyCompositionUtilsKt;
import com.xiaomi.hm.health.healthdata.utils.ChartHelper;
import com.xiaomi.hm.health.healthdata.utils.HealthDataNavigator;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import com.xiaomi.hm.health.healthdata.utils.HealthDataUtils;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import de.greenrobot.event.EventBus;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 d2\u00020\u0001:\u0001dB\u0007¢\u0006\u0004\bb\u0010cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\b\u0010\f\u001a\u00020\u0006H\u0002J\b\u0010\r\u001a\u00020\u0006H\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0002J\b\u0010\u000f\u001a\u00020\u0006H\u0002J\b\u0010\u0010\u001a\u00020\u0006H\u0002J\b\u0010\u0011\u001a\u00020\u0006H\u0002J$\u0010\u0016\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0006H\u0002J\u001e\u0010\u001b\u001a\u00020\u00122\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0002J.\u0010\u001f\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010 \u001a\u00020\u0006H\u0002J\b\u0010!\u001a\u00020\tH\u0002J\n\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010$\u001a\u00020#H\u0002J\b\u0010&\u001a\u00020%H\u0002J&\u0010-\u001a\u0004\u0018\u00010%2\u0006\u0010(\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016J\u0010\u00100\u001a\u00020\u00062\u0006\u0010/\u001a\u00020.H\u0016J\b\u00101\u001a\u00020\u0006H\u0016J\u001a\u00103\u001a\u00020\u00062\u0006\u00102\u001a\u00020%2\b\u0010,\u001a\u0004\u0018\u00010+H\u0016J\u0010\u00105\u001a\u00020\u00062\u0006\u00104\u001a\u00020\tH\u0016J\u0010\u00108\u001a\u0004\u0018\u0001072\u0006\u00106\u001a\u00020\u0012J\u000e\u0010;\u001a\u00020\u00062\u0006\u0010:\u001a\u000209R\u001f\u0010A\u001a\u0004\u0018\u00010<8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0018\u0010D\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010O\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u001d\u0010T\u001a\u00020P8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010>\u001a\u0004\bR\u0010SR\u001d\u0010Y\u001a\u00020U8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010>\u001a\u0004\bW\u0010XR\u0016\u0010\\\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u001d\u0010a\u001a\u00020]8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010>\u001a\u0004\b_\u0010`¨\u0006e"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/detail/healthdata/HealthDataDetailFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/xiaomi/hm/health/healthdata/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "", "time", "", "X", "initView", "", "E", LogUtil.D, "C", "loadData", "O", LogUtil.I, "N", ExifInterface.GPS_DIRECTION_TRUE, "", "valueStr", "selected", "timeStr", DTransferConstants.SEARCH_KEY, "F", "Lkotlin/Pair;", "", "valuePair", "t", "dbpValueStr", "sbpValueStr", "dateStr", com.google.android.exoplayer2.text.ttml.b.r, "z", "r", "w", "", SOAP.XMLNS, "Landroid/view/View;", "Y", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onAttach", "onDetach", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "isVisibleToUser", "setUserVisibleHint", "source", "Landroid/text/Spanned;", "fromHtml", "Lcom/xiaomi/hm/health/healthdata/ui/vo/eventbus/EventAddDataSuccess;", "event", "onEventMainThread", "Lcom/xiaomi/hm/health/healthdata/utils/ChartHelper;", "a", "Lkotlin/Lazy;", "u", "()Lcom/xiaomi/hm/health/healthdata/utils/ChartHelper;", "chartHelper", "b", "Ljava/lang/String;", "defaultTimeStr", "Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;", "c", "Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;", "healthDataType", "Lcom/xiaomi/hm/health/healthdata/ui/vo/TimeParam;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/healthdata/ui/vo/TimeParam;", "timeParam", "e", "Ljava/lang/Long;", "currentSelectDateTimeMillis", "Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/HealthDataDetailViewModel;", "f", "x", "()Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/HealthDataDetailViewModel;", "viewModel", "Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/ChartDataViewModel;", "g", "v", "()Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/ChartDataViewModel;", "chartViewModel", "h", "Z", "hasObserved", "Lcom/huami/sleep/util/ViewSlideWrapper;", "i", "y", "()Lcom/huami/sleep/util/ViewSlideWrapper;", "viewSlideHelper", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthDataDetailFragment extends Fragment {

    @NotNull
    public static final String ARGS_TIME = "time";

    @NotNull
    public static final String ARGS_TIME_MODE = "time_mode";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int RESULT_CODE_SUCCESS = 1;

    @NotNull
    private static final String j = "HealthData-HealthDataDetailFragment";
    private static final int k = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy chartHelper = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private String defaultTimeStr;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private HealthDataType healthDataType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private TimeParam timeParam;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Long currentSelectDateTimeMillis;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy chartViewModel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean hasObserved;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewSlideHelper;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/detail/healthdata/HealthDataDetailFragment$Companion;", "", "Lcom/xiaomi/hm/health/healthdata/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "", "time", "Lcom/xiaomi/hm/health/healthdata/ui/detail/healthdata/HealthDataDetailFragment;", "getInstance", "", "ARGS_TIME", "Ljava/lang/String;", "ARGS_TIME_MODE", "", "REQUEST_CODE", LogUtil.I, "RESULT_CODE_SUCCESS", "TAG", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HealthDataDetailFragment getInstance(@NotNull TimeMode timeMode, long time) {
            HealthDataDetailFragment healthDataDetailFragment = new HealthDataDetailFragment();
            healthDataDetailFragment.X(timeMode, time);
            return healthDataDetailFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/utils/ChartHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ChartHelper> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ChartHelper invoke() {
            Context context = HealthDataDetailFragment.this.getContext();
            if (context == null) {
                return null;
            }
            return new ChartHelper(context);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "initLoadParamData timeParam:" + HealthDataDetailFragment.this.timeParam;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "initLoadParamData healthDataType:" + HealthDataDetailFragment.this.healthDataType;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n"}, d2 = {"Lcom/huami/chart/util/Index;", "index", "Lkotlin/Pair;", "", "highValue", "lowValue", "", "date", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function4<Index, Pair<? extends Float, ? extends Float>, Pair<? extends Float, ? extends Float>, String, Unit> {
        public d() {
            super(4);
        }

        public final void a(@NotNull Index index, @Nullable Pair<Float, Float> pair, @Nullable Pair<Float, Float> pair2, @Nullable String str) {
            HealthDataDetailFragment.this.y().slide(index.getCenterX());
            HealthDataDetailFragment.this.p(HealthDataDetailFragment.this.t(pair), HealthDataDetailFragment.this.t(pair2), true, str);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Index index, Pair<? extends Float, ? extends Float> pair, Pair<? extends Float, ? extends Float> pair2, String str) {
            a(index, pair, pair2, str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Unit> {
        public final /* synthetic */ ChartDataViewModel b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ChartDataViewModel chartDataViewModel) {
            super(0);
            this.b = chartDataViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            BarChartVo<Float> rawBarChartVo;
            HealthDataDetailFragment.this.y().reset();
            BarChartVo<Number> value = this.b.getLatestBpValue().getValue();
            if (value == null || (rawBarChartVo = DataConverterKt.toRawBarChartVo(value)) == null) {
                return;
            }
            HealthDataDetailFragment healthDataDetailFragment = HealthDataDetailFragment.this;
            healthDataDetailFragment.p(healthDataDetailFragment.t(rawBarChartVo.getHighValue()), healthDataDetailFragment.t(rawBarChartVo.getLowValue()), false, rawBarChartVo.getExtra());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Unit> {
        public final /* synthetic */ ChartDataViewModel b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ChartDataViewModel chartDataViewModel) {
            super(0);
            this.b = chartDataViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            BarChartVo<Float> rawBarChartVo;
            HealthDataDetailFragment.this.y().reset();
            BarChartVo<Number> value = this.b.getLatestBpValue().getValue();
            if (value == null || (rawBarChartVo = DataConverterKt.toRawBarChartVo(value)) == null) {
                return;
            }
            HealthDataDetailFragment healthDataDetailFragment = HealthDataDetailFragment.this;
            healthDataDetailFragment.p(healthDataDetailFragment.t(rawBarChartVo.getHighValue()), healthDataDetailFragment.t(rawBarChartVo.getLowValue()), false, rawBarChartVo.getExtra());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"", "color", "", FirebaseAnalytics.Param.LEVEL, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function2<Integer, String, Unit> {
        public final /* synthetic */ Float a;
        public final /* synthetic */ HealthDataDetailViewModel b;
        public final /* synthetic */ HealthDataDetailFragment c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Float f, HealthDataDetailViewModel healthDataDetailViewModel, HealthDataDetailFragment healthDataDetailFragment) {
            super(2);
            this.a = f;
            this.b = healthDataDetailViewModel;
            this.c = healthDataDetailFragment;
        }

        public final void a(int i, @NotNull String str) {
            String value;
            if (this.a.floatValue() < 0.0f || (value = this.b.getDataName().getValue()) == null) {
                return;
            }
            HealthDataDetailFragment healthDataDetailFragment = this.c;
            View view = healthDataDetailFragment.getView();
            ((TypefaceTextView) (view == null ? null : view.findViewById(R.id.data_name))).setText(healthDataDetailFragment.fromHtml(value + " <font color=\"" + i + "\">" + str + "</font> "));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str) {
            a(num.intValue(), str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Lcom/huami/chart/util/Index;", "index", "Lcom/xiaomi/hm/health/healthdata/ui/vo/HealthChartDataVo;", "data", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function2<Index, HealthChartDataVo, Unit> {
        public h() {
            super(2);
        }

        public final void a(@NotNull Index index, @NotNull HealthChartDataVo healthChartDataVo) {
            String withDecimal;
            HealthDataDetailFragment.this.y().slide(index.getCenterX());
            Float floatOrNull = kotlin.text.k.toFloatOrNull(healthChartDataVo.getValue());
            if (floatOrNull == null) {
                return;
            }
            HealthDataDetailFragment healthDataDetailFragment = HealthDataDetailFragment.this;
            float fFloatValue = floatOrNull.floatValue();
            healthDataDetailFragment.x().setDataValue(Float.valueOf(fFloatValue));
            if (CollectionsKt___CollectionsKt.contains(HealthChartBuilderKt.getWeightList(), healthDataDetailFragment.healthDataType)) {
                withDecimal = healthDataDetailFragment.healthDataType == HealthDataType.SKELETAL_MUSCLE ? BodyCompositionUtilsKt.getWeightInKgText1Format(fFloatValue) : BodyCompositionUtilsKt.getWeightInKgText(fFloatValue);
            } else {
                withDecimal = DataExKt.formatWithDecimal(Float.valueOf(fFloatValue), healthDataDetailFragment.s());
            }
            healthDataDetailFragment.q(withDecimal, true, healthChartDataVo.getExtra());
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Index index, HealthChartDataVo healthChartDataVo) {
            a(index, healthChartDataVo);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<Unit> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            String string;
            HealthDataDetailFragment.this.y().reset();
            HealthChartDataVo value = HealthDataDetailFragment.this.v().getLatestValue().getValue();
            if (value == null) {
                return;
            }
            HealthDataDetailFragment healthDataDetailFragment = HealthDataDetailFragment.this;
            Float floatOrNull = kotlin.text.k.toFloatOrNull(value.getValue());
            if (floatOrNull == null) {
                return;
            }
            float fFloatValue = floatOrNull.floatValue();
            float f = Float.isNaN(fFloatValue) ? -1.0f : fFloatValue;
            healthDataDetailFragment.x().setDataValue(Float.valueOf(f));
            if (Float.isNaN(fFloatValue)) {
                string = healthDataDetailFragment.getString(com.huami.watch.hmwatchmanager.R.string.value_invalid);
            } else if (CollectionsKt___CollectionsKt.contains(HealthChartBuilderKt.getWeightList(), healthDataDetailFragment.healthDataType)) {
                string = healthDataDetailFragment.healthDataType == HealthDataType.SKELETAL_MUSCLE ? BodyCompositionUtilsKt.getWeightInKgText1Format(f) : BodyCompositionUtilsKt.getWeightInKgText(f);
            } else {
                string = DataExKt.formatWithDecimal(Float.valueOf(fFloatValue), healthDataDetailFragment.s());
            }
            healthDataDetailFragment.q(string, false, value.getExtra());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ EventAddDataSuccess a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(EventAddDataSuccess eventAddDataSuccess) {
            super(0);
            this.a = eventAddDataSuccess;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Add data success time:" + this.a.getTime();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleep/util/ViewSlideWrapper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<ViewSlideWrapper> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ViewSlideWrapper invoke() {
            return new ViewSlideWrapper(HealthDataDetailFragment.this.Y(), ViewUtils.dp2px(HealthDataDetailFragment.this.getContext(), 8.0f), HealthDataDetailFragment.this.getResources().getDisplayMetrics().widthPixels - ViewUtils.dp2px(HealthDataDetailFragment.this.getContext(), 15.0f));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HealthDataDetailFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.healthdata.ui.detail.healthdata.HealthDataDetailFragment$special$$inlined$viewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<HealthDataDetailViewModel>() { // from class: com.xiaomi.hm.health.healthdata.ui.detail.healthdata.HealthDataDetailFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.healthdata.ui.viewmodel.HealthDataDetailViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final HealthDataDetailViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(HealthDataDetailViewModel.class), function0, objArr);
            }
        });
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.healthdata.ui.detail.healthdata.HealthDataDetailFragment$special$$inlined$viewModel$default$3
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
        this.chartViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ChartDataViewModel>() { // from class: com.xiaomi.hm.health.healthdata.ui.detail.healthdata.HealthDataDetailFragment$special$$inlined$viewModel$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.healthdata.ui.viewmodel.ChartDataViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ChartDataViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(ChartDataViewModel.class), function1, objArr3);
            }
        });
        this.viewSlideHelper = LazyKt__LazyJVMKt.lazy(new k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(HealthDataDetailFragment healthDataDetailFragment, HealthDataType healthDataType, View view) {
        HealthDataNavigator.INSTANCE.navigateToAddHealthData(healthDataDetailFragment, healthDataType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(HealthDataType healthDataType, View view) {
        HealthDataNavigator.INSTANCE.navigateToHealthDataHistory(view.getContext(), healthDataType);
    }

    private final void C() {
        HealthDataType healthDataType = this.healthDataType;
        if (healthDataType == null) {
            return;
        }
        boolean z = healthDataType == HealthDataType.BLOOD_PRESSURE;
        View view = getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.avg_area), !z);
        View view2 = getView();
        ViewExKt.setVisible(view2 == null ? null : view2.findViewById(R.id.blood_pressure_area), z);
        View view3 = getView();
        ViewExKt.setVisible(view3 == null ? null : view3.findViewById(R.id.bp_sign_divider), z);
        View view4 = getView();
        ViewExKt.setVisible(view4 == null ? null : view4.findViewById(R.id.bp_sign), z);
        if (z) {
            View view5 = getView();
            ((TypefaceTextView) (view5 != null ? view5.findViewById(R.id.bp_time) : null)).setText(this.defaultTimeStr);
        } else {
            View view6 = getView();
            ((TypefaceTextView) (view6 != null ? view6.findViewById(R.id.time) : null)).setText(this.defaultTimeStr);
        }
    }

    private final void D() {
        String stringExtra;
        Bundle arguments = getArguments();
        this.timeParam = arguments == null ? null : new TimeParam(TimeMode.valueOf(arguments.getString(ARGS_TIME_MODE)), arguments.getLong("time"));
        HMLog.info(j, new b());
        TimeParam timeParam = this.timeParam;
        this.defaultTimeStr = timeParam != null ? HealthDataTimeUtils.INSTANCE.getTimeToUi(timeParam) : null;
        FragmentActivity activity = getActivity();
        if (activity != null && (activity instanceof DataDetailBaseNewActivity) && (stringExtra = ((DataDetailBaseNewActivity) activity).getIntent().getStringExtra("data_type")) != null) {
            this.healthDataType = HealthDataType.INSTANCE.find(stringExtra);
        }
        HMLog.info(j, new c());
    }

    private final boolean E() {
        return Intrinsics.areEqual(Locale.getDefault(), Locale.JAPAN) || Intrinsics.areEqual(Locale.getDefault(), Locale.JAPANESE) || Intrinsics.areEqual(Locale.getDefault().getLanguage(), Locale.JAPANESE.getLanguage());
    }

    private final void F() {
        final ChartDataViewModel chartDataViewModelV = v();
        chartDataViewModelV.getBpChartData().observe(getViewLifecycleOwner(), new Observer() { // from class: av3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthDataDetailFragment.G(this.a, chartDataViewModelV, (BarChartBuilder) obj);
            }
        });
        chartDataViewModelV.getLatestBpValue().observe(getViewLifecycleOwner(), new Observer() { // from class: gv3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthDataDetailFragment.H(this.a, (BarChartVo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(HealthDataDetailFragment healthDataDetailFragment, ChartDataViewModel chartDataViewModel, BarChartBuilder barChartBuilder) {
        ChartHelper chartHelperU = healthDataDetailFragment.u();
        if (chartHelperU == null) {
            return;
        }
        View view = healthDataDetailFragment.getView();
        chartHelperU.refreshBarChart((ViewGroup) (view == null ? null : view.findViewById(R.id.chart_container)), barChartBuilder, healthDataDetailFragment.new d(), healthDataDetailFragment.new e(chartDataViewModel), healthDataDetailFragment.new f(chartDataViewModel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(HealthDataDetailFragment healthDataDetailFragment, BarChartVo barChartVo) {
        healthDataDetailFragment.y().reset();
        BarChartVo<Float> rawBarChartVo = barChartVo == null ? null : DataConverterKt.toRawBarChartVo(barChartVo);
        healthDataDetailFragment.p(healthDataDetailFragment.t(rawBarChartVo == null ? null : rawBarChartVo.getHighValue()), healthDataDetailFragment.t(rawBarChartVo == null ? null : rawBarChartVo.getLowValue()), false, rawBarChartVo != null ? rawBarChartVo.getExtra() : null);
    }

    private final void I() {
        HealthDataType healthDataType = this.healthDataType;
        if (healthDataType == null || !HealthDataUtils.INSTANCE.isBodyCompositionType(healthDataType)) {
            return;
        }
        final HealthDataDetailViewModel healthDataDetailViewModelX = x();
        healthDataDetailViewModelX.getLevelIntro().observe(getViewLifecycleOwner(), new Observer() { // from class: kv3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthDataDetailFragment.J(this.a, (String) obj);
            }
        });
        healthDataDetailViewModelX.getBarBuilder().observe(getViewLifecycleOwner(), new Observer() { // from class: ev3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthDataDetailFragment.K(this.a, (ColoredProgressBarBuilder) obj);
            }
        });
        if (this.healthDataType == HealthDataType.BMI) {
            healthDataDetailViewModelX.getDataValue().observe(getViewLifecycleOwner(), new Observer() { // from class: cv3
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    HealthDataDetailFragment.L(healthDataDetailViewModelX, this, (Float) obj);
                }
            });
        }
        healthDataDetailViewModelX.getBarProgress().observe(getViewLifecycleOwner(), new Observer() { // from class: bv3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthDataDetailFragment.M(this.a, healthDataDetailViewModelX, (Float) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(HealthDataDetailFragment healthDataDetailFragment, String str) {
        if (str == null) {
            View view = healthDataDetailFragment.getView();
            ((TypefaceTextView) (view != null ? view.findViewById(R.id.intro_text) : null)).setVisibility(8);
            return;
        }
        View view2 = healthDataDetailFragment.getView();
        if (Intrinsics.areEqual(str, ((TypefaceTextView) (view2 == null ? null : view2.findViewById(R.id.desc_text))).getText().toString())) {
            View view3 = healthDataDetailFragment.getView();
            ((TypefaceTextView) (view3 != null ? view3.findViewById(R.id.intro_text) : null)).setVisibility(8);
        } else {
            View view4 = healthDataDetailFragment.getView();
            ((TypefaceTextView) (view4 == null ? null : view4.findViewById(R.id.intro_text))).setVisibility(0);
            View view5 = healthDataDetailFragment.getView();
            ((TypefaceTextView) (view5 != null ? view5.findViewById(R.id.intro_text) : null)).setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(HealthDataDetailFragment healthDataDetailFragment, ColoredProgressBarBuilder coloredProgressBarBuilder) {
        boolean z = coloredProgressBarBuilder != null;
        View view = healthDataDetailFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.coloredProgressBar), z);
        if (coloredProgressBarBuilder == null) {
            return;
        }
        if (healthDataDetailFragment.healthDataType != HealthDataType.BMI) {
            View view2 = healthDataDetailFragment.getView();
            ((ColoredProgressBar) (view2 != null ? view2.findViewById(R.id.coloredProgressBar) : null)).setValues(coloredProgressBarBuilder.getColors(), coloredProgressBarBuilder.getLevelHints(), coloredProgressBarBuilder.getSectionValues());
            return;
        }
        if (healthDataDetailFragment.r()) {
            View view3 = healthDataDetailFragment.getView();
            ((ColoredProgressBar) (view3 == null ? null : view3.findViewById(R.id.coloredProgressBar))).setVisibility(0);
            View view4 = healthDataDetailFragment.getView();
            ((ColoredProgressBar) (view4 == null ? null : view4.findViewById(R.id.coloredProgressBar))).setValues(coloredProgressBarBuilder.getColors(), coloredProgressBarBuilder.getLevelHints(), coloredProgressBarBuilder.getSectionValues());
            View view5 = healthDataDetailFragment.getView();
            ((TypefaceTextView) (view5 != null ? view5.findViewById(R.id.error_tips) : null)).setVisibility(8);
            return;
        }
        View view6 = healthDataDetailFragment.getView();
        ((ColoredProgressBar) (view6 == null ? null : view6.findViewById(R.id.coloredProgressBar))).setVisibility(8);
        View view7 = healthDataDetailFragment.getView();
        ((TypefaceTextView) (view7 == null ? null : view7.findViewById(R.id.error_tips))).setVisibility(0);
        String strW = healthDataDetailFragment.w();
        View view8 = healthDataDetailFragment.getView();
        TypefaceTextView typefaceTextView = (TypefaceTextView) (view8 != null ? view8.findViewById(R.id.error_tips) : null);
        if (strW == null) {
            strW = "";
        }
        typefaceTextView.setText(strW);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(HealthDataDetailViewModel healthDataDetailViewModel, HealthDataDetailFragment healthDataDetailFragment, Float f2) {
        ColoredProgressBarBuilder value = healthDataDetailViewModel.getBarBuilder().getValue();
        if (value == null) {
            return;
        }
        boolean z = f2 != null;
        View view = healthDataDetailFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.coloredProgressBar), z);
        if (f2 == null) {
            return;
        }
        f2.floatValue();
        if (healthDataDetailFragment.r()) {
            View view2 = healthDataDetailFragment.getView();
            ((ColoredProgressBar) (view2 == null ? null : view2.findViewById(R.id.coloredProgressBar))).setVisibility(0);
            View view3 = healthDataDetailFragment.getView();
            ((ColoredProgressBar) (view3 == null ? null : view3.findViewById(R.id.coloredProgressBar))).setValues(value.getColors(), value.getLevelHints(), value.getSectionValues());
            View view4 = healthDataDetailFragment.getView();
            ((TypefaceTextView) (view4 != null ? view4.findViewById(R.id.error_tips) : null)).setVisibility(8);
            return;
        }
        View view5 = healthDataDetailFragment.getView();
        ((ColoredProgressBar) (view5 == null ? null : view5.findViewById(R.id.coloredProgressBar))).setVisibility(8);
        View view6 = healthDataDetailFragment.getView();
        ((TypefaceTextView) (view6 == null ? null : view6.findViewById(R.id.error_tips))).setVisibility(0);
        String strW = healthDataDetailFragment.w();
        View view7 = healthDataDetailFragment.getView();
        TypefaceTextView typefaceTextView = (TypefaceTextView) (view7 != null ? view7.findViewById(R.id.error_tips) : null);
        if (strW == null) {
            strW = "";
        }
        typefaceTextView.setText(strW);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(HealthDataDetailFragment healthDataDetailFragment, HealthDataDetailViewModel healthDataDetailViewModel, Float f2) {
        if (f2 == null) {
            return;
        }
        f2.floatValue();
        View view = healthDataDetailFragment.getView();
        ((ColoredProgressBar) (view == null ? null : view.findViewById(R.id.coloredProgressBar))).setProgress(f2.floatValue(), new g(f2, healthDataDetailViewModel, healthDataDetailFragment));
    }

    private final void N() {
        HealthDataType healthDataType = this.healthDataType;
        if (healthDataType == null) {
            return;
        }
        if (healthDataType == HealthDataType.BLOOD_PRESSURE) {
            F();
        } else {
            T();
        }
    }

    private final void O() {
        if (this.hasObserved) {
            return;
        }
        this.hasObserved = true;
        HealthDataDetailViewModel healthDataDetailViewModelX = x();
        healthDataDetailViewModelX.getDataName().observe(getViewLifecycleOwner(), new Observer() { // from class: yu3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthDataDetailFragment.R(this.a, (String) obj);
            }
        });
        healthDataDetailViewModelX.getDataUnit().observe(getViewLifecycleOwner(), new Observer() { // from class: lv3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthDataDetailFragment.S(this.a, (String) obj);
            }
        });
        healthDataDetailViewModelX.getDataIntro().observe(getViewLifecycleOwner(), new Observer() { // from class: zu3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthDataDetailFragment.P(this.a, (String) obj);
            }
        });
        healthDataDetailViewModelX.getShowAddData().observe(getViewLifecycleOwner(), new Observer() { // from class: jv3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthDataDetailFragment.Q(this.a, (Boolean) obj);
            }
        });
        I();
        N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(HealthDataDetailFragment healthDataDetailFragment, String str) {
        View view = healthDataDetailFragment.getView();
        ((TypefaceTextView) (view == null ? null : view.findViewById(R.id.desc_text))).setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(HealthDataDetailFragment healthDataDetailFragment, Boolean bool) {
        View view = healthDataDetailFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.add_data), bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(HealthDataDetailFragment healthDataDetailFragment, String str) {
        View view = healthDataDetailFragment.getView();
        ((TypefaceTextView) (view == null ? null : view.findViewById(R.id.data_name))).setText(str);
        View view2 = healthDataDetailFragment.getView();
        ((TypefaceTextView) (view2 != null ? view2.findViewById(R.id.desc_name) : null)).setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(HealthDataDetailFragment healthDataDetailFragment, String str) {
        View view = healthDataDetailFragment.getView();
        ((TypefaceTextView) (view == null ? null : view.findViewById(R.id.unit))).setText(str);
    }

    private final void T() {
        ChartDataViewModel chartDataViewModelV = v();
        chartDataViewModelV.getChartData().observe(getViewLifecycleOwner(), new Observer() { // from class: fv3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthDataDetailFragment.U(this.a, (LineChartBuilder) obj);
            }
        });
        chartDataViewModelV.getLatestValue().observe(getViewLifecycleOwner(), new Observer() { // from class: hv3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthDataDetailFragment.V(this.a, (HealthChartDataVo) obj);
            }
        });
        chartDataViewModelV.getLatestValueValid().observe(getViewLifecycleOwner(), new Observer() { // from class: iv3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HealthDataDetailFragment.W(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(HealthDataDetailFragment healthDataDetailFragment, LineChartBuilder lineChartBuilder) {
        ChartHelper chartHelperU = healthDataDetailFragment.u();
        if (chartHelperU == null) {
            return;
        }
        View view = healthDataDetailFragment.getView();
        chartHelperU.refreshChart((ViewGroup) (view == null ? null : view.findViewById(R.id.chart_container)), lineChartBuilder, healthDataDetailFragment.new h(), healthDataDetailFragment.new i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(HealthDataDetailFragment healthDataDetailFragment, HealthChartDataVo healthChartDataVo) {
        String value;
        Float floatOrNull;
        String string;
        if (healthChartDataVo == null || (value = healthChartDataVo.getValue()) == null || (floatOrNull = kotlin.text.k.toFloatOrNull(value)) == null) {
            return;
        }
        float fFloatValue = floatOrNull.floatValue();
        if (healthDataDetailFragment.healthDataType == HealthDataType.BMI) {
            Long lValueOf = null;
            try {
                if (!Float.isNaN(fFloatValue) && healthChartDataVo.getUploadTime() != null) {
                    lValueOf = Long.valueOf(healthChartDataVo.getUploadTime().getTime());
                }
            } catch (Exception unused) {
            }
            healthDataDetailFragment.currentSelectDateTimeMillis = lValueOf;
        }
        healthDataDetailFragment.x().setDataValue(Float.valueOf(fFloatValue));
        if (Float.isNaN(fFloatValue)) {
            string = healthDataDetailFragment.getString(com.huami.watch.hmwatchmanager.R.string.value_invalid);
        } else if (CollectionsKt___CollectionsKt.contains(HealthChartBuilderKt.getWeightList(), healthDataDetailFragment.healthDataType)) {
            string = healthDataDetailFragment.healthDataType == HealthDataType.SKELETAL_MUSCLE ? BodyCompositionUtilsKt.getWeightInKgText1Format(fFloatValue) : BodyCompositionUtilsKt.getWeightInKgText(fFloatValue);
        } else {
            string = DataExKt.formatWithDecimal(Float.valueOf(fFloatValue), healthDataDetailFragment.s());
        }
        healthDataDetailFragment.q(string, false, healthChartDataVo.getExtra());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(HealthDataDetailFragment healthDataDetailFragment, Boolean bool) {
        View view = healthDataDetailFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.unit), bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X(TimeMode timeMode, long time) {
        Bundle bundle = new Bundle();
        bundle.putString(ARGS_TIME_MODE, timeMode.name());
        bundle.putLong("time", time);
        Unit unit = Unit.INSTANCE;
        setArguments(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View Y() {
        if (this.healthDataType == HealthDataType.BLOOD_PRESSURE) {
            View view = getView();
            if (view == null) {
                return null;
            }
            return view.findViewById(R.id.blood_pressure_area);
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        return view2.findViewById(R.id.avg_area);
    }

    private final void initView() {
        C();
        View view = getView();
        ((TypefaceTextView) (view == null ? null : view.findViewById(R.id.add_data))).setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, com.huami.watch.hmwatchmanager.R.drawable.ic_arrow_forward_16, 0);
        View view2 = getView();
        ((TypefaceTextView) (view2 == null ? null : view2.findViewById(R.id.history_data))).setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, com.huami.watch.hmwatchmanager.R.drawable.ic_arrow_forward_16, 0);
        Context context = getContext();
        if (context != null) {
            View view3 = getView();
            ((FrameLayout) (view3 == null ? null : view3.findViewById(R.id.intro_container))).addView(LayoutInflater.from(context).inflate(com.huami.watch.hmwatchmanager.R.layout.layout_health_data_intro_with_pic, (ViewGroup) null));
            if (HealthDataUtils.INSTANCE.isBodyCompositionType(this.healthDataType)) {
                View view4 = getView();
                ((FrameLayout) (view4 == null ? null : view4.findViewById(R.id.intro_container))).setVisibility(0);
            } else {
                View view5 = getView();
                ((FrameLayout) (view5 == null ? null : view5.findViewById(R.id.intro_container))).setVisibility(8);
            }
            View view6 = getView();
            ((FrameLayout) (view6 == null ? null : view6.findViewById(R.id.extra_container))).addView(LayoutInflater.from(context).inflate(com.huami.watch.hmwatchmanager.R.layout.layout_health_data_desc, (ViewGroup) null));
        }
        View view7 = getView();
        ViewExKt.setVisible(view7 != null ? view7.findViewById(R.id.jp_hint_text) : null, E());
    }

    private final void loadData() {
        if (this.timeParam == null || this.healthDataType == null) {
            return;
        }
        x().setHealthDataType(this.healthDataType);
        if (this.healthDataType == HealthDataType.BLOOD_PRESSURE) {
            x().loadBpRange(this.timeParam);
            v().refreshBpChart(this.timeParam.getTime(), this.timeParam.getMode());
        } else {
            v().refreshChart(this.timeParam.getTime(), this.timeParam.getMode(), this.healthDataType);
        }
        O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(String dbpValueStr, String sbpValueStr, boolean selected, String dateStr) {
        View view = getView();
        ((TypefaceTextView) (view == null ? null : view.findViewById(R.id.dbp_value))).setText(dbpValueStr);
        View view2 = getView();
        ((TypefaceTextView) (view2 == null ? null : view2.findViewById(R.id.sbp_value))).setText(sbpValueStr);
        View view3 = getView();
        TypefaceTextView typefaceTextView = (TypefaceTextView) (view3 == null ? null : view3.findViewById(R.id.bp_time));
        if (dateStr == null) {
            dateStr = this.defaultTimeStr;
        }
        typefaceTextView.setText(dateStr);
        if (!selected) {
            View view4 = getView();
            ViewExKt.setVisible(view4 == null ? null : view4.findViewById(R.id.dbp_unit), true);
            View view5 = getView();
            ViewExKt.setVisible(view5 == null ? null : view5.findViewById(R.id.sbp_unit), true);
            View view6 = getView();
            ((ConstraintLayout) (view6 != null ? view6.findViewById(R.id.blood_pressure_area) : null)).setBackgroundColor(0);
            return;
        }
        View view7 = getView();
        ViewExKt.setVisible(view7 == null ? null : view7.findViewById(R.id.dbp_unit), false);
        View view8 = getView();
        ViewExKt.setVisible(view8 == null ? null : view8.findViewById(R.id.sbp_unit), false);
        View view9 = getView();
        ConstraintLayout constraintLayout = (ConstraintLayout) (view9 != null ? view9.findViewById(R.id.blood_pressure_area) : null);
        constraintLayout.setBackground(ContextCompat.getDrawable(constraintLayout.getContext(), com.huami.watch.hmwatchmanager.R.drawable.slp_info_rect_tip_bg));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(String valueStr, boolean selected, String timeStr) {
        View view = getView();
        ((TypefaceTextView) (view == null ? null : view.findViewById(R.id.chart_value))).setText(valueStr);
        View view2 = getView();
        TypefaceTextView typefaceTextView = (TypefaceTextView) (view2 == null ? null : view2.findViewById(R.id.time));
        if (timeStr == null) {
            timeStr = this.defaultTimeStr;
        }
        typefaceTextView.setText(timeStr);
        if (!selected) {
            View view3 = getView();
            ((ConstraintLayout) (view3 != null ? view3.findViewById(R.id.avg_area) : null)).setBackgroundColor(0);
        } else {
            View view4 = getView();
            ConstraintLayout constraintLayout = (ConstraintLayout) (view4 != null ? view4.findViewById(R.id.avg_area) : null);
            constraintLayout.setBackground(ContextCompat.getDrawable(constraintLayout.getContext(), com.huami.watch.hmwatchmanager.R.drawable.slp_info_rect_tip_bg));
        }
    }

    private final boolean r() {
        WeightInfos info;
        HMUserInfo userInfo = HMPersonInfo.getInstance().getUserInfo();
        int age = userInfo.getAge();
        int height = userInfo.getHeight();
        if (this.currentSelectDateTimeMillis != null && (info = WeightInfoManager.getManager().getInfo(this.currentSelectDateTimeMillis.longValue())) != null) {
            age = BodyParamsUtils.getWeightAge(this.currentSelectDateTimeMillis.longValue(), userInfo.getBirthday());
            if (info.getHeight() != null && info.getHeight().intValue() > 0) {
                height = info.getHeight().intValue();
            }
        }
        return BodyParamsUtils.canAnalyzeBmi(age, height);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int s() {
        HealthDataType healthDataType = this.healthDataType;
        if (healthDataType == null) {
            return 0;
        }
        return HealthDataUtils.INSTANCE.getHealthDataDigits(healthDataType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String t(Pair<? extends Number, ? extends Number> valuePair) {
        if (valuePair == null) {
            return getString(com.huami.watch.hmwatchmanager.R.string.value_invalid);
        }
        return Intrinsics.areEqual(valuePair.getFirst(), valuePair.getSecond()) ? DataExKt.formatWithDecimal((Float) valuePair.getFirst(), s()) : getString(com.huami.watch.hmwatchmanager.R.string.value_range, DataExKt.formatWithDecimal((Float) valuePair.getFirst(), s()), DataExKt.formatWithDecimal((Float) valuePair.getSecond(), s()));
    }

    private final ChartHelper u() {
        return (ChartHelper) this.chartHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChartDataViewModel v() {
        return (ChartDataViewModel) this.chartViewModel.getValue();
    }

    private final String w() {
        HMUserInfo userInfo = HMPersonInfo.getInstance().getUserInfo();
        return BodyParamsUtils.cannotAnalyzeBmiString(requireContext(), userInfo.getAge(), userInfo.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HealthDataDetailViewModel x() {
        return (HealthDataDetailViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewSlideWrapper y() {
        return (ViewSlideWrapper) this.viewSlideHelper.getValue();
    }

    private final void z() {
        final HealthDataType healthDataType = this.healthDataType;
        if (healthDataType == null) {
            return;
        }
        View view = getView();
        ((TypefaceTextView) (view == null ? null : view.findViewById(R.id.add_data))).setOnClickListener(new View.OnClickListener() { // from class: dv3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HealthDataDetailFragment.A(this.a, healthDataType, view2);
            }
        });
        View view2 = getView();
        ((TypefaceTextView) (view2 != null ? view2.findViewById(R.id.history_data) : null)).setOnClickListener(new View.OnClickListener() { // from class: xu3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                HealthDataDetailFragment.B(healthDataType, view3);
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final Spanned fromHtml(@NotNull String source) {
        return Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(source, 0) : Html.fromHtml(source);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        EventBus.getDefault().register(this);
        D();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(com.huami.watch.hmwatchmanager.R.layout.layout_health_data_detail_base_fragment, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        EventBus.getDefault().unregister(this);
    }

    public final void onEventMainThread(@NotNull EventAddDataSuccess event) {
        HMLog.info(j, new j(event));
        loadData();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        z();
        if (getUserVisibleHint()) {
            loadData();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (!isVisibleToUser || getView() == null) {
            return;
        }
        loadData();
    }
}
