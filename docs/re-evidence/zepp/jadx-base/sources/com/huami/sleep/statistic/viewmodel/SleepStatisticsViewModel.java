package com.huami.sleep.statistic.viewmodel;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.CoroutineLiveDataKt;
import androidx.p008lifecycle.FlowLiveDataConversions;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.LiveDataScope;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.util.Index;
import com.huami.sleep.daysleep.quotient.SleepQuotientParam;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.sleephome.vo.ShareSleepVo;
import com.huami.sleep.sleepintrodetail.vo.AvgTipInfoVo;
import com.huami.sleep.statistic.dto.SleepAllInfo;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.statistic.dto.TimeParam;
import com.huami.sleep.statistic.helper.BarChartBuilder;
import com.huami.sleep.statistic.helper.RegularChartBuilder;
import com.huami.sleep.statistic.repo.ISleepStatisticRepo;
import com.huami.sleep.statistic.repo.SleepRegularCharProcessor;
import com.huami.sleep.statistic.repo.StageChartRepo;
import com.huami.sleep.statistic.viewmodel.SleepStatisticsViewModel.d;
import com.huami.sleep.statistic.vo.SleepRegularChartVo;
import com.huami.sleep.util.SleepTimeUtil;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\bS\u0010TJ(\u0010\t\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fJ\u0018\u0010\u0013\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R(\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00070\u00048\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b*\u0010+\u0012\u0004\b,\u0010-R\u001f\u00103\u001a\b\u0012\u0004\u0012\u00020/0\u00048\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u00102R\u001f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00140\u00048\u0006@\u0006¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b5\u00102R\u001f\u0010:\u001a\b\u0012\u0004\u0012\u0002070\u00048\u0006@\u0006¢\u0006\f\n\u0004\b8\u0010+\u001a\u0004\b9\u00102R\u001f\u0010>\u001a\b\u0012\u0004\u0012\u00020;0\u00048\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010+\u001a\u0004\b=\u00102R\u001f\u0010A\u001a\b\u0012\u0004\u0012\u00020/0\u00048\u0006@\u0006¢\u0006\f\n\u0004\b?\u0010+\u001a\u0004\b@\u00102R-\u0010E\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00110\u00050%8\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010'\u001a\u0004\bC\u0010DR*\u0010K\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010F0\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010+\u001a\u0004\bH\u00102\"\u0004\bI\u0010JR#\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001e0%8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010DR#\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00110%8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\bP\u0010M\u001a\u0004\bQ\u0010D¨\u0006U"}, d2 = {"Lcom/huami/sleep/statistic/viewmodel/SleepStatisticsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/sleep/statistic/dto/TimeParam;", "timeParam", "Landroidx/lifecycle/LiveData;", "Lkotlin/Pair;", "", "", "Lcom/huami/sleep/daysleep/quotient/SleepQuotientParam;", "getSleepQuotientInfo", "", "setTimeParam", "Lcom/huami/chart/util/Index;", "index", "setSleepChartIndex", "Lcom/huami/sleep/statistic/vo/SleepRegularChartVo;", "info", "", "centerX", "setSleepRegularChartIndex", "Lcom/huami/sleep/sleepintrodetail/vo/AvgTipInfoVo;", "getTotalAvgInfo", "Lcom/huami/sleep/statistic/repo/ISleepStatisticRepo;", "a", "Lcom/huami/sleep/statistic/repo/ISleepStatisticRepo;", "sleepStatisticRepo", "Lcom/huami/sleep/statistic/repo/StageChartRepo;", "b", "Lcom/huami/sleep/statistic/repo/StageChartRepo;", "chartRepo", "", "userId", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "Landroidx/lifecycle/MutableLiveData;", "c", "Landroidx/lifecycle/MutableLiveData;", "timeParamLiveData", "Lcom/huami/sleep/statistic/dto/SleepAllInfo;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/LiveData;", "getSleepInfoLiveData$annotations", "()V", "sleepInfoLiveData", "", "e", "getShowEmptyLiveData", "()Landroidx/lifecycle/LiveData;", "showEmptyLiveData", "f", "getAvgInfoLiveData", "avgInfoLiveData", "Lcom/huami/sleep/statistic/helper/BarChartBuilder;", "g", "getBarChartLiveData", "barChartLiveData", "Lcom/huami/sleep/statistic/helper/RegularChartBuilder;", "h", "getSleepRegularData", "sleepRegularData", "i", "getShowSlpRegularLiveData", "showSlpRegularLiveData", z.j, "getSelectAvgInfoLiveData", "()Landroidx/lifecycle/MutableLiveData;", "selectAvgInfoLiveData", "Lcom/huami/sleep/sleephome/vo/ShareSleepVo;", hl.k, "getSleepShareInfoLiveData", "setSleepShareInfoLiveData", "(Landroidx/lifecycle/LiveData;)V", "sleepShareInfoLiveData", "l", "Lkotlin/Lazy;", "getSelectRegularLiveData", "selectRegularLiveData", "m", "getRegularTipPosition", "regularTipPosition", "<init>", "(Lcom/huami/sleep/statistic/repo/ISleepStatisticRepo;Lcom/huami/sleep/statistic/repo/StageChartRepo;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public final class SleepStatisticsViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ISleepStatisticRepo sleepStatisticRepo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final StageChartRepo chartRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<TimeParam> timeParamLiveData;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final LiveData<List<SleepAllInfo>> sleepInfoLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> showEmptyLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LiveData<AvgTipInfoVo> avgInfoLiveData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LiveData<BarChartBuilder> barChartLiveData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final LiveData<RegularChartBuilder> sleepRegularData;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> showSlpRegularLiveData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Pair<AvgTipInfoVo, Float>> selectAvgInfoLiveData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private LiveData<ShareSleepVo> sleepShareInfoLiveData;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy selectRegularLiveData;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Lazy regularTipPosition;
    public String userId;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeMode.values().length];
            iArr[TimeMode.WEEK.ordinal()] = 1;
            iArr[TimeMode.MONTH.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Landroidx/lifecycle/LiveDataScope;", "Lkotlin/Pair;", "", "", "Lcom/huami/sleep/daysleep/quotient/SleepQuotientParam;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.statistic.viewmodel.SleepStatisticsViewModel$getSleepQuotientInfo$1", f = "SleepStatisticsViewModel.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<LiveDataScope<Pair<? extends Integer, ? extends List<? extends SleepQuotientParam>>>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ TimeParam d;

        /* JADX INFO: renamed from: com.huami.sleep.statistic.viewmodel.SleepStatisticsViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0000\u0018\u00010\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@"}, d2 = {"", "Lcom/huami/sleep/statistic/dto/SleepAllInfo;", "summaryList", "", "<anonymous parameter 1>", "Lkotlin/Pair;", "", "Lcom/huami/sleep/daysleep/quotient/SleepQuotientParam;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.statistic.viewmodel.SleepStatisticsViewModel$getSleepQuotientInfo$1$1", f = "SleepStatisticsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0587a extends SuspendLambda implements Function3<List<? extends SleepAllInfo>, Boolean, Continuation<? super Pair<? extends Integer, ? extends List<? extends SleepQuotientParam>>>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ SleepStatisticsViewModel c;
            public final /* synthetic */ TimeParam d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0587a(SleepStatisticsViewModel sleepStatisticsViewModel, TimeParam timeParam, Continuation<? super C0587a> continuation) {
                super(3, continuation);
                this.c = sleepStatisticsViewModel;
                this.d = timeParam;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull List<SleepAllInfo> list, @Nullable Boolean bool, @Nullable Continuation<? super Pair<Integer, ? extends List<SleepQuotientParam>>> continuation) {
                C0587a c0587a = new C0587a(this.c, this.d, continuation);
                c0587a.b = list;
                return c0587a.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return this.c.sleepStatisticRepo.getSleepQuotientInfo(this.c.getUserId(), (List) this.b, null, this.d);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0000H\u008a@"}, d2 = {"Lkotlin/Pair;", "", "", "Lcom/huami/sleep/daysleep/quotient/SleepQuotientParam;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.statistic.viewmodel.SleepStatisticsViewModel$getSleepQuotientInfo$1$2", f = "SleepStatisticsViewModel.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<Pair<? extends Integer, ? extends List<? extends SleepQuotientParam>>, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ LiveDataScope<Pair<Integer, List<SleepQuotientParam>>> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(LiveDataScope<Pair<Integer, List<SleepQuotientParam>>> liveDataScope, Continuation<? super b> continuation) {
                super(2, continuation);
                this.c = liveDataScope;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Nullable Pair<Integer, ? extends List<SleepQuotientParam>> pair, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                b bVar = new b(this.c, continuation);
                bVar.b = obj;
                return bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Pair<Integer, List<SleepQuotientParam>> pair = (Pair) this.b;
                    LiveDataScope<Pair<Integer, List<SleepQuotientParam>>> liveDataScope = this.c;
                    this.a = 1;
                    if (liveDataScope.emit(pair, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TimeParam timeParam, Continuation<? super a> continuation) {
            super(2, continuation);
            this.d = timeParam;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull LiveDataScope<Pair<Integer, List<SleepQuotientParam>>> liveDataScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = SleepStatisticsViewModel.this.new a(this.d, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LiveDataScope liveDataScope = (LiveDataScope) this.b;
                Flow flowFlowOn = FlowKt.flowOn(FlowKt.flowCombine(FlowLiveDataConversions.asFlow(SleepStatisticsViewModel.this.sleepInfoLiveData), FlowLiveDataConversions.asFlow(SleepStatisticsViewModel.this.sleepStatisticRepo.checkConfigChanged()), new C0587a(SleepStatisticsViewModel.this, this.d, null)), Dispatchers.getIO());
                b bVar = new b(liveDataScope, null);
                this.a = 1;
                if (FlowKt.collectLatest(flowFlowOn, bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<MutableLiveData<Float>> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<Float> getA() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/MutableLiveData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<MutableLiveData<String>> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableLiveData<String> getA() {
            return new MutableLiveData<>();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Landroidx/lifecycle/LiveDataScope;", "Lcom/huami/sleep/sleephome/vo/ShareSleepVo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.statistic.viewmodel.SleepStatisticsViewModel$sleepShareInfoLiveData$1$1", f = "SleepStatisticsViewModel.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<LiveDataScope<ShareSleepVo>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ List<SleepAllInfo> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<SleepAllInfo> list, Continuation<? super d> continuation) {
            super(2, continuation);
            this.d = list;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull LiveDataScope<ShareSleepVo> liveDataScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            d dVar = SleepStatisticsViewModel.this.new d(this.d, continuation);
            dVar.b = obj;
            return dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LiveDataScope liveDataScope = (LiveDataScope) this.b;
                ShareSleepVo sleepShareInfo = SleepStatisticsViewModel.this.sleepStatisticRepo.getSleepShareInfo(this.d, (TimeParam) SleepStatisticsViewModel.this.timeParamLiveData.getValue());
                this.a = 1;
                if (liveDataScope.emit(sleepShareInfo, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public SleepStatisticsViewModel(@NotNull ISleepStatisticRepo iSleepStatisticRepo, @NotNull StageChartRepo stageChartRepo) {
        this.sleepStatisticRepo = iSleepStatisticRepo;
        this.chartRepo = stageChartRepo;
        MutableLiveData<TimeParam> mutableLiveData = new MutableLiveData<>();
        this.timeParamLiveData = mutableLiveData;
        LiveData<List<SleepAllInfo>> liveDataSwitchMap = Transformations.switchMap(mutableLiveData, new Function<TimeParam, LiveData<List<? extends SleepAllInfo>>>() { // from class: com.huami.sleep.statistic.viewmodel.SleepStatisticsViewModel$special$$inlined$switchMap$1
            @Override // androidx.arch.core.util.Function
            @NotNull
            public final LiveData<List<? extends SleepAllInfo>> apply(TimeParam timeParam) {
                Pair<Long, Long> timeRange = SleepTimeUtil.INSTANCE.getTimeRange(timeParam);
                return this.a.sleepStatisticRepo.getSleepInfo(this.a.getUserId(), timeRange.getFirst().longValue(), timeRange.getSecond().longValue());
            }
        });
        this.sleepInfoLiveData = liveDataSwitchMap;
        this.showEmptyLiveData = Transformations.map(liveDataSwitchMap, new Function<List<? extends SleepAllInfo>, Boolean>() { // from class: com.huami.sleep.statistic.viewmodel.SleepStatisticsViewModel$special$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final Boolean apply(List<? extends SleepAllInfo> list) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    SleepAllInfo sleepAllInfo = (SleepAllInfo) obj;
                    if (!(sleepAllInfo.getMainSleepDetail().getTotalDur() == 0 && sleepAllInfo.getNapSleepDetail().getTotalDur() == 0)) {
                        arrayList.add(obj);
                    }
                }
                return Boolean.valueOf(arrayList.isEmpty());
            }
        });
        this.avgInfoLiveData = Transformations.map(liveDataSwitchMap, new Function<List<? extends SleepAllInfo>, AvgTipInfoVo>() { // from class: com.huami.sleep.statistic.viewmodel.SleepStatisticsViewModel$special$$inlined$map$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.arch.core.util.Function
            public final AvgTipInfoVo apply(List<? extends SleepAllInfo> list) {
                return this.a.sleepStatisticRepo.getAvgTipInfo(this.a.chartRepo.groupSummaryByMode(((TimeParam) this.a.timeParamLiveData.getValue()).getMode(), list), (TimeParam) this.a.timeParamLiveData.getValue());
            }
        });
        this.barChartLiveData = Transformations.map(liveDataSwitchMap, new Function<List<? extends SleepAllInfo>, BarChartBuilder>() { // from class: com.huami.sleep.statistic.viewmodel.SleepStatisticsViewModel$special$$inlined$map$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.arch.core.util.Function
            public final BarChartBuilder apply(List<? extends SleepAllInfo> list) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(((TimeParam) this.a.timeParamLiveData.getValue()).getTime());
                Date time = calendar.getTime();
                return this.a.chartRepo.getBarChartBuilder(time, ((TimeParam) this.a.timeParamLiveData.getValue()).getMode(), list);
            }
        });
        this.sleepRegularData = Transformations.map(liveDataSwitchMap, new Function<List<? extends SleepAllInfo>, RegularChartBuilder>() { // from class: com.huami.sleep.statistic.viewmodel.SleepStatisticsViewModel$special$$inlined$map$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.arch.core.util.Function
            public final RegularChartBuilder apply(List<? extends SleepAllInfo> list) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(((TimeParam) this.a.timeParamLiveData.getValue()).getTime());
                Date time = calendar.getTime();
                SleepRegularCharProcessor sleepRegularCharProcessor = SleepRegularCharProcessor.INSTANCE;
                TimeMode mode = ((TimeParam) this.a.timeParamLiveData.getValue()).getMode();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!(((SleepAllInfo) obj).getMainSleepDetail().getTotalDur() == 0)) {
                        arrayList.add(obj);
                    }
                }
                return sleepRegularCharProcessor.getBarChartBuilder(time, mode, arrayList);
            }
        });
        this.showSlpRegularLiveData = Transformations.map(liveDataSwitchMap, new Function<List<? extends SleepAllInfo>, Boolean>() { // from class: com.huami.sleep.statistic.viewmodel.SleepStatisticsViewModel$special$$inlined$map$5
            @Override // androidx.arch.core.util.Function
            public final Boolean apply(List<? extends SleepAllInfo> list) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        return Boolean.valueOf(!arrayList.isEmpty());
                    }
                    Object next = it2.next();
                    if (!(((SleepAllInfo) next).getMainSleepDetail().getTotalDur() == 0)) {
                        arrayList.add(next);
                    }
                }
            }
        });
        this.selectAvgInfoLiveData = new MutableLiveData<>();
        this.sleepShareInfoLiveData = Transformations.switchMap(liveDataSwitchMap, new Function<List<? extends SleepAllInfo>, LiveData<ShareSleepVo>>() { // from class: com.huami.sleep.statistic.viewmodel.SleepStatisticsViewModel$special$$inlined$switchMap$2
            @Override // androidx.arch.core.util.Function
            @NotNull
            public final LiveData<ShareSleepVo> apply(List<? extends SleepAllInfo> list) {
                return CoroutineLiveDataKt.liveData$default(Dispatchers.getIO(), 0L, this.a.new d(list, null), 2, (Object) null);
            }
        });
        this.selectRegularLiveData = LazyKt__LazyJVMKt.lazy(c.a);
        this.regularTipPosition = LazyKt__LazyJVMKt.lazy(b.a);
    }

    @ExperimentalCoroutinesApi
    private static /* synthetic */ void a() {
    }

    @NotNull
    public final LiveData<AvgTipInfoVo> getAvgInfoLiveData() {
        return this.avgInfoLiveData;
    }

    @NotNull
    public final LiveData<BarChartBuilder> getBarChartLiveData() {
        return this.barChartLiveData;
    }

    @NotNull
    public final MutableLiveData<Float> getRegularTipPosition() {
        return (MutableLiveData) this.regularTipPosition.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<AvgTipInfoVo, Float>> getSelectAvgInfoLiveData() {
        return this.selectAvgInfoLiveData;
    }

    @NotNull
    public final MutableLiveData<String> getSelectRegularLiveData() {
        return (MutableLiveData) this.selectRegularLiveData.getValue();
    }

    @NotNull
    public final LiveData<Boolean> getShowEmptyLiveData() {
        return this.showEmptyLiveData;
    }

    @NotNull
    public final LiveData<Boolean> getShowSlpRegularLiveData() {
        return this.showSlpRegularLiveData;
    }

    @NotNull
    public final LiveData<Pair<Integer, List<SleepQuotientParam>>> getSleepQuotientInfo(@NotNull TimeParam timeParam) {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new a(timeParam, null), 3, (Object) null);
    }

    @NotNull
    public final LiveData<RegularChartBuilder> getSleepRegularData() {
        return this.sleepRegularData;
    }

    @NotNull
    public final LiveData<ShareSleepVo> getSleepShareInfoLiveData() {
        return this.sleepShareInfoLiveData;
    }

    @Nullable
    public final AvgTipInfoVo getTotalAvgInfo() {
        return this.avgInfoLiveData.getValue();
    }

    @NotNull
    public final String getUserId() {
        String str = this.userId;
        Objects.requireNonNull(str);
        return str;
    }

    public final void setSleepChartIndex(@NotNull Index index) {
        if (index.getDataIndex() == -1) {
            return;
        }
        SleepAllInfo sleepAllInfo = (SleepAllInfo) CollectionsKt.getOrNull(this.chartRepo.getSummaryListCache(), index.getDataIndex());
        AvgTipInfoVo avgTipInfoVo = null;
        AvgTipInfoVo selectedAvgInfo = sleepAllInfo == null ? null : this.sleepStatisticRepo.getSelectedAvgInfo(sleepAllInfo, this.timeParamLiveData.getValue());
        if (selectedAvgInfo != null) {
            Integer avgValue = selectedAvgInfo.getAvgValue();
            if ((avgValue == null ? 0 : avgValue.intValue()) > 0) {
                avgTipInfoVo = selectedAvgInfo;
            }
        }
        getSelectAvgInfoLiveData().postValue(new Pair<>(avgTipInfoVo, Float.valueOf(index.getCenterX())));
    }

    public final void setSleepRegularChartIndex(@Nullable SleepRegularChartVo info, float centerX) {
        String str;
        if (info == null) {
            return;
        }
        String str2 = TimeUtils.formatTime(KoinExtKt.getAppContext(), info.getStartIndex()) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + TimeUtils.formatTime(KoinExtKt.getAppContext(), info.getEndIndex());
        int i = WhenMappings.$EnumSwitchMapping$0[this.timeParamLiveData.getValue().getMode().ordinal()];
        if (i == 1 || i == 2) {
            str = SleepTimeUtil.INSTANCE.formatTimeYMD(info.getTimeStamp()) + "\n";
        } else {
            str = "";
        }
        getSelectRegularLiveData().setValue(str + str2);
        getRegularTipPosition().setValue(Float.valueOf(centerX));
    }

    public final void setSleepShareInfoLiveData(@NotNull LiveData<ShareSleepVo> liveData) {
        this.sleepShareInfoLiveData = liveData;
    }

    public final void setTimeParam(@NotNull TimeParam timeParam) {
        this.timeParamLiveData.postValue(timeParam);
    }

    public final void setUserId(@NotNull String str) {
        this.userId = str;
    }
}
