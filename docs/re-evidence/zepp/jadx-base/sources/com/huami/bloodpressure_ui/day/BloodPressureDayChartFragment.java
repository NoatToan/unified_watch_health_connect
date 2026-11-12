package com.huami.bloodpressure_ui.day;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodpressure_core.dc.local.BloodPressureDbVo;
import com.huami.bloodpressure_core.di.KoinExKt;
import com.huami.bloodpressure_core.ext.TimeFormatEx;
import com.huami.bloodpressure_core.url.IBPResearchConfig;
import com.huami.bloodpressure_ui.BloodPressureViewModel;
import com.huami.bloodpressure_ui.R;
import com.huami.bloodpressure_ui.analytics.BloodPressureAnalyticsExKt;
import com.huami.bloodpressure_ui.analytics.BloodPressureStatEvent;
import com.huami.bloodpressure_ui.chart.BloodPressureChartBuilder;
import com.huami.bloodpressure_ui.chart.BloodPressureChartHelper;
import com.huami.bloodpressure_ui.chart.BloodPressureChartIntroManager;
import com.huami.bloodpressure_ui.chart.BloodPressureChartTextSizeStyle;
import com.huami.bloodpressure_ui.chart.BloodPressureChartTextSizeStyleKt;
import com.huami.bloodpressure_ui.chart.BloodPressureDataStyleStatus;
import com.huami.bloodpressure_ui.chart.BloodPressureEmptyStyleStatus;
import com.huami.bloodpressure_ui.chart.BloodPressureStatus;
import com.huami.bloodpressure_ui.chart.BloodPressureValueStyleVo;
import com.huami.bloodpressure_ui.databinding.BloodPressureDayChartFragmentBinding;
import com.huami.bloodpressure_ui.databinding.ChartEmptyStatuFragmentBinding;
import com.huami.bloodpressure_ui.day.BloodPressureDayChartFragment;
import com.huami.bloodpressure_ui.ext.BloodPressureWrap;
import com.huami.bloodpressure_ui.ext.TimeEx;
import com.huami.bloodpressure_ui.ext.ViewExKt;
import com.huami.chart.util.Index;
import com.huami.heartrate.constant.ConstantKt;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.widget.toast.CustomToast;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 K2\u00020\u0001:\u0001KB\u0007¢\u0006\u0004\bI\u0010JJ\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J*\u0010\r\u001a\u00020\f2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\bH\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000fH\u0002J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\bH\u0002J!\u0010\u0019\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010!\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\u0016\u0010%\u001a\u00020\u00022\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"J\u0010\u0010(\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010&R\u001f\u0010.\u001a\u0004\u0018\u00010)8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0016\u00101\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001d\u00106\u001a\u0002028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u00105R\u001d\u0010<\u001a\u0002078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001d\u0010@\u001a\u00020=8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b>\u0010?R\u001d\u0010E\u001a\u00020A8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010+\u001a\u0004\bC\u0010DR\u0016\u0010G\u001a\u00020\b8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010FR\u0016\u0010H\u001a\u00020\b8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b:\u0010F¨\u0006L"}, d2 = {"Lcom/huami/bloodpressure_ui/day/BloodPressureDayChartFragment;", "Landroidx/fragment/app/Fragment;", "", "o", "Lcom/huami/bloodpressure_ui/chart/BloodPressureChartBuilder;", "bloodPressureChartBuilder", "t", "", "", "indexList", "timeIndex", "gap", "", "e", "timeInterval", "", hl.k, "showTime", "", "g", "yPosition", "v", "key", "Lcom/huami/chart/util/Index;", "index", "u", "(Ljava/lang/Long;Lcom/huami/chart/util/Index;)V", "l", "(Ljava/lang/Long;)Lcom/huami/chart/util/Index;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureDbVo;", "it", "refreshChartData", "Lcom/huami/bloodpressure_ui/chart/BloodPressureStatus;", "dayStatus", "refreshChartHeadData", "Lcom/huami/bloodpressure_ui/chart/BloodPressureChartHelper;", "a", "Lkotlin/Lazy;", "i", "()Lcom/huami/bloodpressure_ui/chart/BloodPressureChartHelper;", "chartHelper", "b", "J", "currentTimeStamp", "Lcom/huami/bloodpressure_ui/day/BloodPressureDayChartViewModel;", "c", GoogleApiAvailabilityLight.b, "()Lcom/huami/bloodpressure_ui/day/BloodPressureDayChartViewModel;", "viewModel", "Lcom/huami/bloodpressure_ui/databinding/BloodPressureDayChartFragmentBinding;", GoogleApiAvailabilityLight.a, "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "h", "()Lcom/huami/bloodpressure_ui/databinding/BloodPressureDayChartFragmentBinding;", "binding", "Lcom/huami/bloodpressure_ui/BloodPressureViewModel;", z.j, "()Lcom/huami/bloodpressure_ui/BloodPressureViewModel;", "dataViewModel", "Lcom/huami/bloodpressure_core/url/IBPResearchConfig;", "f", "m", "()Lcom/huami/bloodpressure_core/url/IBPResearchConfig;", "mResearchConfig", LogUtil.I, "SIZE_DAY_LIMIT", "dayLastTimeIndex", "<init>", "()V", "Companion", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureDayChartFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] i;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy chartHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long currentTimeStamp;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy dataViewModel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy mResearchConfig;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int SIZE_DAY_LIMIT;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int dayLastTimeIndex;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/bloodpressure_ui/day/BloodPressureDayChartFragment$Companion;", "", "", "timeStamp", "Lcom/huami/bloodpressure_ui/day/BloodPressureDayChartFragment;", "newInstance", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BloodPressureDayChartFragment newInstance(long timeStamp) {
            BloodPressureDayChartFragment bloodPressureDayChartFragment = new BloodPressureDayChartFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("ARG_TIME", timeStamp);
            Unit unit = Unit.INSTANCE;
            bloodPressureDayChartFragment.setArguments(bundle);
            return bloodPressureDayChartFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/bloodpressure_ui/chart/BloodPressureChartHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<BloodPressureChartHelper> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BloodPressureChartHelper getA() {
            Context context = BloodPressureDayChartFragment.this.getContext();
            if (context == null) {
                return null;
            }
            return new BloodPressureChartHelper(context, ViewExKt.dp2px(context, 6.0f), null, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n"}, d2 = {"Lcom/huami/chart/util/Index;", "index", "Lkotlin/Pair;", "", "highValue", "lowValue", "", "date", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function4<Index, Pair<? extends Float, ? extends Float>, Pair<? extends Float, ? extends Float>, String, Unit> {
        public b() {
            super(4);
        }

        public final void a(@NotNull Index index, @Nullable Pair<Float, Float> pair, @Nullable Pair<Float, Float> pair2, @Nullable String str) {
            BloodPressureDayChartFragment bloodPressureDayChartFragment = BloodPressureDayChartFragment.this;
            bloodPressureDayChartFragment.u(Long.valueOf(bloodPressureDayChartFragment.currentTimeStamp), index);
            BloodPressureValueStyleVo bpStyleValueString = BloodPressureChartTextSizeStyleKt.getBpStyleValueString(pair, BloodPressureDayChartFragment.this.requireContext());
            BloodPressureValueStyleVo bpStyleValueString2 = BloodPressureChartTextSizeStyleKt.getBpStyleValueString(pair2, BloodPressureDayChartFragment.this.requireContext());
            if (str == null) {
                return;
            }
            BloodPressureDayChartFragment bloodPressureDayChartFragment2 = BloodPressureDayChartFragment.this;
            BloodPressureAnalyticsExKt.record(new CountEventBuilder(BloodPressureStatEvent.INSTANCE.getHEALTH_BLOODPRESSURE_DAY_DIVISION_C()));
            bloodPressureDayChartFragment2.n().setStatus(new BloodPressureDataStyleStatus(str, bpStyleValueString, bpStyleValueString2, false, null, 16, null));
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Index index, Pair<? extends Float, ? extends Float> pair, Pair<? extends Float, ? extends Float> pair2, String str) {
            a(index, pair, pair2, str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<Unit> {
        public static final c a = new c();

        public c() {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/chart/util/Index;", "emptyIndex", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Index, Unit> {
        public d() {
            super(1);
        }

        public final void a(@Nullable Index index) {
            if (index == null) {
                return;
            }
            BloodPressureDayChartFragment bloodPressureDayChartFragment = BloodPressureDayChartFragment.this;
            TimeEx timeEx = TimeEx.INSTANCE;
            long dayStartTime = timeEx.getDayStartTime(bloodPressureDayChartFragment.currentTimeStamp);
            int index2 = index.getPosiIndex().getIndex();
            int index3 = index.getPosiIndex().getIndex() + 1;
            boolean z = index3 == bloodPressureDayChartFragment.SIZE_DAY_LIMIT;
            long jNextHour = timeEx.nextHour(dayStartTime, index2);
            long jNextHour2 = timeEx.nextHour(dayStartTime, index3);
            String date = z ? TimeUtils.formatDate("HH:mm", jNextHour2 - TimeUnit.SECONDS.toMillis(1L)) : TimeUtils.formatDate("HH:00", jNextHour2);
            bloodPressureDayChartFragment.n().setStatus(new BloodPressureEmptyStyleStatus(TimeFormatEx.INSTANCE.formatTimeYMDHH(jNextHour) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + date, false, BloodPressureChartTextSizeStyleKt.getNUM2_CHART_STYLE()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Index index) {
            a(index);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bloodpressure_core/url/IBPResearchConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<IBPResearchConfig> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IBPResearchConfig getA() {
            return (IBPResearchConfig) KoinExKt.bloodPressureScope(KoinExKt.bloodPressureScope().getKoin()).get(Reflection.getOrCreateKotlinClass(IBPResearchConfig.class), null, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/chart/util/Index;", "index", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<Index, Unit> {
        public final /* synthetic */ BloodPressureChartBuilder a;
        public final /* synthetic */ BloodPressureDayChartFragment b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<Unit> {
            public final /* synthetic */ Index a;

            /* JADX INFO: renamed from: com.huami.bloodpressure_ui.day.BloodPressureDayChartFragment$f$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0307a extends Lambda implements Function0<String> {
                public final /* synthetic */ Index a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0307a(Index index) {
                    super(0);
                    this.a = index;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "get error chart index " + this.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Index index) {
                super(0);
                this.a = index;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                HMLog.info$default(null, new C0307a(this.a), 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(BloodPressureChartBuilder bloodPressureChartBuilder, BloodPressureDayChartFragment bloodPressureDayChartFragment) {
            super(1);
            this.a = bloodPressureChartBuilder;
            this.b = bloodPressureDayChartFragment;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v13 */
        /* JADX WARN: Type inference failed for: r4v14, types: [java.util.Set] */
        /* JADX WARN: Type inference failed for: r4v17 */
        public final void a(@Nullable Index index) {
            if (index == null) {
                return;
            }
            BloodPressureChartBuilder bloodPressureChartBuilder = this.a;
            BloodPressureDayChartFragment bloodPressureDayChartFragment = this.b;
            Object aVar = null;
            if (index.getDataIndex() == -1) {
                int index2 = index.getPosiIndex().getIndex();
                Map<Integer, BloodPressureWrap> dataListMap = bloodPressureChartBuilder.getDataListMap();
                aVar = dataListMap != null ? dataListMap.keySet() : null;
                if (BloodPressureDayChartFragment.f(bloodPressureDayChartFragment, aVar == null ? y.emptySet() : aVar, index2, 0, 4, null)) {
                    String strG = bloodPressureDayChartFragment.g(index2 == bloodPressureDayChartFragment.dayLastTimeIndex ? bloodPressureDayChartFragment.k(index2 + 1) : bloodPressureDayChartFragment.k(index2));
                    BloodPressureDayChartViewModel bloodPressureDayChartViewModelN = bloodPressureDayChartFragment.n();
                    int i = R.string.blood_pressure_empty;
                    bloodPressureDayChartViewModelN.setStatus(new BloodPressureDataStyleStatus(strG, new BloodPressureValueStyleVo(bloodPressureDayChartFragment.getString(i), BloodPressureChartTextSizeStyleKt.getNUM2_CHART_STYLE()), new BloodPressureValueStyleVo(bloodPressureDayChartFragment.getString(i), BloodPressureChartTextSizeStyleKt.getNUM2_CHART_STYLE()), false, null, 16, null));
                    return;
                }
                return;
            }
            bloodPressureDayChartFragment.u(Long.valueOf(bloodPressureDayChartFragment.currentTimeStamp), index);
            try {
                Result.Companion companion = Result.Companion;
                Map<Integer, BloodPressureWrap> dataListMap2 = bloodPressureChartBuilder.getDataListMap();
                BloodPressureWrap bloodPressureWrap = dataListMap2 == null ? null : dataListMap2.get(Integer.valueOf(index.getPosiIndex().getIndex()));
                if (bloodPressureWrap != null) {
                    BloodPressureAnalyticsExKt.record(new CountEventBuilder(BloodPressureStatEvent.INSTANCE.getHEALTH_BLOODPRESSURE_DAY_DIVISION_C()));
                    int minute = bloodPressureWrap.getMinute();
                    long jK = minute == bloodPressureDayChartFragment.dayLastTimeIndex ? bloodPressureDayChartFragment.k(minute + 1) : bloodPressureDayChartFragment.k(minute);
                    Long lastTimeStamp = bloodPressureChartBuilder.getLastTimeStamp();
                    if (lastTimeStamp != null) {
                        long jLongValue = lastTimeStamp.longValue();
                        if (jK > jLongValue) {
                            jK = jLongValue;
                        }
                    }
                    bloodPressureDayChartFragment.n().setStatus(new BloodPressureDataStyleStatus(bloodPressureDayChartFragment.g(jK), new BloodPressureValueStyleVo(String.valueOf(bloodPressureWrap.getBp().getSbp()), BloodPressureChartTextSizeStyleKt.getNUM2_CHART_STYLE()), new BloodPressureValueStyleVo(String.valueOf(bloodPressureWrap.getBp().getDbp()), BloodPressureChartTextSizeStyleKt.getNUM2_CHART_STYLE()), false, null, 16, null));
                    aVar = Unit.INSTANCE;
                }
                if (aVar == null) {
                    aVar = new a(index);
                }
                Result.m3845constructorimpl(aVar);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Index index) {
            a(index);
            return Unit.INSTANCE;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[5];
        kPropertyArr[2] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BloodPressureDayChartFragment.class), "binding", "getBinding()Lcom/huami/bloodpressure_ui/databinding/BloodPressureDayChartFragmentBinding;"));
        i = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BloodPressureDayChartFragment() {
        super(R.layout.blood_pressure_day_chart_fragment);
        this.chartHelper = LazyKt__LazyJVMKt.lazy(new a());
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.bloodpressure_ui.day.BloodPressureDayChartFragment$special$$inlined$viewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<BloodPressureDayChartViewModel>() { // from class: com.huami.bloodpressure_ui.day.BloodPressureDayChartFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.bloodpressure_ui.day.BloodPressureDayChartViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final BloodPressureDayChartViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(BloodPressureDayChartViewModel.class), function0, objArr);
            }
        });
        this.binding = FragmentViewBindingKt.viewBinding(new BloodPressureDayChartFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(BloodPressureDayChartFragmentBinding.class)));
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.huami.bloodpressure_ui.day.BloodPressureDayChartFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.dataViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<BloodPressureViewModel>() { // from class: com.huami.bloodpressure_ui.day.BloodPressureDayChartFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.bloodpressure_ui.BloodPressureViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final BloodPressureViewModel getA() {
                return FragmentExtKt.getSharedViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(BloodPressureViewModel.class), function1, objArr3);
            }
        });
        this.mResearchConfig = LazyKt__LazyJVMKt.lazy(e.a);
        this.SIZE_DAY_LIMIT = 24;
        this.dayLastTimeIndex = ConstantKt.DRAW_END_INDEX;
    }

    private final boolean e(Set<Integer> indexList, int timeIndex, int gap) {
        try {
            Result.Companion companion = Result.Companion;
            if (indexList == null || indexList.isEmpty()) {
                return false;
            }
            List listSorted = CollectionsKt___CollectionsKt.sorted(indexList);
            int iIntValue = ((Number) CollectionsKt.first(listSorted)).intValue();
            int iIntValue2 = ((Number) CollectionsKt.last(listSorted)).intValue();
            if (timeIndex > iIntValue && timeIndex < iIntValue2) {
                for (Object obj : CollectionsKt___CollectionsKt.asSequence(listSorted)) {
                    int iIntValue3 = ((Number) obj).intValue();
                    boolean z = iIntValue3 >= timeIndex;
                    if (!z) {
                        iIntValue = iIntValue3;
                    }
                    if (z) {
                        return Math.abs(((Number) obj).intValue() - iIntValue) > gap;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
            return true;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            Boolean bool = Boolean.TRUE;
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                objM3845constructorimpl = bool;
            }
            return ((Boolean) objM3845constructorimpl).booleanValue();
        }
    }

    public static /* synthetic */ boolean f(BloodPressureDayChartFragment bloodPressureDayChartFragment, Set set, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = 6;
        }
        return bloodPressureDayChartFragment.e(set, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String g(long showTime) {
        TimeEx timeEx = TimeEx.INSTANCE;
        if (showTime > timeEx.getDayEndTime(this.currentTimeStamp)) {
            showTime = timeEx.getDayEndTime(this.currentTimeStamp);
        }
        return TimeFormatEx.INSTANCE.formatTimeYMDHHmm(showTime);
    }

    private final BloodPressureDayChartFragmentBinding h() {
        return (BloodPressureDayChartFragmentBinding) this.binding.getValue(this, i[2]);
    }

    private final BloodPressureChartHelper i() {
        return (BloodPressureChartHelper) this.chartHelper.getValue();
    }

    private final BloodPressureViewModel j() {
        return (BloodPressureViewModel) this.dataViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long k(int timeInterval) {
        return TimeEx.INSTANCE.getDayStartTime(this.currentTimeStamp) + TimeUnit.MINUTES.toMillis(((long) timeInterval) * ((long) 5));
    }

    private final Index l(Long key) {
        if (key == null) {
            return null;
        }
        return j().getDayIndex(key.longValue());
    }

    private final IBPResearchConfig m() {
        return (IBPResearchConfig) this.mResearchConfig.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BloodPressureDayChartViewModel n() {
        return (BloodPressureDayChartViewModel) this.viewModel.getValue();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void o() {
        n().getCurrentStatus().observe(getViewLifecycleOwner(), new Observer() { // from class: p00
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureDayChartFragment.p(this.a, (BloodPressureStatus) obj);
            }
        });
        n().getCurrentChartData().observe(getViewLifecycleOwner(), new Observer() { // from class: o00
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BloodPressureDayChartFragment.s(this.a, (BloodPressureChartBuilder) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(final BloodPressureDayChartFragment bloodPressureDayChartFragment, BloodPressureStatus bloodPressureStatus) {
        if (bloodPressureStatus instanceof BloodPressureDataStyleStatus) {
            ChartEmptyStatuFragmentBinding chartEmptyStatuFragmentBinding = bloodPressureDayChartFragment.h().containerStatus;
            BloodPressureDataStyleStatus bloodPressureDataStyleStatus = (BloodPressureDataStyleStatus) bloodPressureStatus;
            chartEmptyStatuFragmentBinding.tvSbpValue.setText(bloodPressureDataStyleStatus.getFirstValue().getValue());
            chartEmptyStatuFragmentBinding.tvDbpValue.setText(bloodPressureDataStyleStatus.getSecondValue().getValue());
            BloodPressureChartTextSizeStyle num2_chart_style = BloodPressureChartTextSizeStyleKt.checkStyleEnable(bloodPressureDataStyleStatus.getFirstValue().getTextStyle(), bloodPressureDataStyleStatus.getSecondValue().getTextStyle(), BloodPressureChartTextSizeStyleKt.getNUM2_CHART_STYLE()) ? BloodPressureChartTextSizeStyleKt.getNUM2_CHART_STYLE() : BloodPressureChartTextSizeStyleKt.getNUM4_CHART_STYLE();
            ViewExKt.setStyle(chartEmptyStatuFragmentBinding.tvSbpValue, num2_chart_style.getTextSizeStyle());
            ViewExKt.setStyle(chartEmptyStatuFragmentBinding.tvDbpValue, num2_chart_style.getTextSizeStyle());
            ViewExKt.setGone(chartEmptyStatuFragmentBinding.tvStatusDetail, !bloodPressureDataStyleStatus.getShowDetail());
            chartEmptyStatuFragmentBinding.tvStatusTime.setText(bloodPressureDataStyleStatus.getDateString());
            ViewExKt.setGone(chartEmptyStatuFragmentBinding.ivResearchDetail, !bloodPressureDayChartFragment.m().researchEnable());
            chartEmptyStatuFragmentBinding.ivResearchDetail.setOnTouchListener(new View.OnTouchListener() { // from class: n00
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return BloodPressureDayChartFragment.q(this.a, view, motionEvent);
                }
            });
            return;
        }
        if (bloodPressureStatus instanceof BloodPressureEmptyStyleStatus) {
            ChartEmptyStatuFragmentBinding chartEmptyStatuFragmentBinding2 = bloodPressureDayChartFragment.h().containerStatus;
            AppCompatTextView appCompatTextView = chartEmptyStatuFragmentBinding2.tvSbpValue;
            int i2 = R.string.blood_pressure_empty;
            appCompatTextView.setText(bloodPressureDayChartFragment.getString(i2));
            chartEmptyStatuFragmentBinding2.tvDbpValue.setText(bloodPressureDayChartFragment.getString(i2));
            BloodPressureEmptyStyleStatus bloodPressureEmptyStyleStatus = (BloodPressureEmptyStyleStatus) bloodPressureStatus;
            ViewExKt.setStyle(chartEmptyStatuFragmentBinding2.tvSbpValue, bloodPressureEmptyStyleStatus.getTextSizeStyle().getTextSizeStyle());
            ViewExKt.setStyle(chartEmptyStatuFragmentBinding2.tvDbpValue, bloodPressureEmptyStyleStatus.getTextSizeStyle().getTextSizeStyle());
            chartEmptyStatuFragmentBinding2.tvStatusTime.setText(bloodPressureEmptyStyleStatus.getDateString());
            ViewExKt.setGone(chartEmptyStatuFragmentBinding2.tvStatusDetail, !bloodPressureEmptyStyleStatus.getShowDetail());
            ViewExKt.setGone(chartEmptyStatuFragmentBinding2.ivResearchDetail, !bloodPressureDayChartFragment.m().researchEnable());
            chartEmptyStatuFragmentBinding2.ivResearchDetail.setOnTouchListener(new View.OnTouchListener() { // from class: m00
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return BloodPressureDayChartFragment.r(this.a, view, motionEvent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(BloodPressureDayChartFragment bloodPressureDayChartFragment, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            bloodPressureDayChartFragment.v((int) motionEvent.getRawY());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(BloodPressureDayChartFragment bloodPressureDayChartFragment, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            bloodPressureDayChartFragment.v((int) motionEvent.getRawY());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(BloodPressureDayChartFragment bloodPressureDayChartFragment, BloodPressureChartBuilder bloodPressureChartBuilder) {
        if (bloodPressureDayChartFragment.m().researchEnable()) {
            bloodPressureDayChartFragment.t(bloodPressureChartBuilder);
            return;
        }
        BloodPressureChartHelper bloodPressureChartHelperI = bloodPressureDayChartFragment.i();
        if (bloodPressureChartHelperI == null) {
            return;
        }
        bloodPressureChartHelperI.refreshAnimationBarChart(bloodPressureDayChartFragment.h().containerChart, bloodPressureChartBuilder, bloodPressureDayChartFragment.new b(), c.a, bloodPressureDayChartFragment.new d(), (192 & 32) != 0 ? null : bloodPressureDayChartFragment.l(Long.valueOf(bloodPressureDayChartFragment.currentTimeStamp)), (192 & 64) != 0 ? false : false, (192 & 128) != 0 ? null : null);
    }

    private final void t(BloodPressureChartBuilder bloodPressureChartBuilder) {
        BloodPressureChartHelper bloodPressureChartHelperI = i();
        if (bloodPressureChartHelperI == null) {
            return;
        }
        bloodPressureChartHelperI.refreshMultiConfig(h().containerChart, bloodPressureChartBuilder, new f(bloodPressureChartBuilder, this), l(Long.valueOf(this.currentTimeStamp)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(Long key, Index index) {
        if (key == null) {
            return;
        }
        j().saveDayIndex(key.longValue(), index);
    }

    private final void v(int yPosition) {
        CustomToast.showToastAtY(requireContext(), getString(R.string.blood_pressure_research_detail), 0, yPosition);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        Long lValueOf = arguments == null ? null : Long.valueOf(arguments.getLong("ARG_TIME"));
        this.currentTimeStamp = lValueOf == null ? System.currentTimeMillis() : lValueOf.longValue();
        n().setOffset(ViewExKt.dp2px(requireContext(), 1.0f));
        com.huami.bloodpressure_ui.ext.FragmentExtKt.replaceFragmentInTransaction(this, R.id.container_chart_info, BloodPressureChartIntroManager.INSTANCE.getChartIntroFragment(requireActivity(), false));
        o();
        n().setTimeStamp(this.currentTimeStamp);
    }

    public final void refreshChartData(@Nullable List<BloodPressureDbVo> it2) {
        n().setChartList(it2);
    }

    public final void refreshChartHeadData(@Nullable BloodPressureStatus dayStatus) {
        if (dayStatus == null) {
            return;
        }
        n().setStatus(dayStatus);
    }
}
