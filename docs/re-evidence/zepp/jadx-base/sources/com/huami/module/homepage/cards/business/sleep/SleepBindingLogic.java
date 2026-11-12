package com.huami.module.homepage.cards.business.sleep;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.BaseIndex;
import com.huami.chart.data.ChartData;
import com.huami.chart.data.ChartDataList;
import com.huami.chart.listener.IDataExtendListener;
import com.huami.chart.util.HMColor;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.business.sleep.SleepBindingLogic;
import com.huami.module.homepage.cards.manager.BindingLogic;
import com.huami.module.homepage.cards.service.CardAssistService;
import com.huami.module.homepage.cards.service.ServiceManager;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.ContextExtKt;
import com.huami.sleep.service.ChartPoint;
import com.huami.sleep.service.ServiceSleepInfo;
import com.huami.sleep.service.SleepChanges;
import com.huami.sleep.service.SleepChartSection;
import com.huami.sleep.service.SleepData;
import com.huami.sleep.service.SleepDurationInLast7Days;
import com.huami.sleep.service.SleepMode;
import com.huami.sleep.service.SleepService;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.tools.log.StackTraceHelperKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b#\u0010$J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/huami/module/homepage/cards/business/sleep/SleepBindingLogic;", "Lcom/huami/module/homepage/cards/manager/BindingLogic;", "Lcom/huami/sleep/service/ServiceSleepInfo;", "sleepInfo", "", "b", "", "Lcom/huami/sleep/service/SleepChartSection;", GoogleApiAvailabilityLight.a, "Lcom/huami/module/homepage/cards/business/sleep/SleepCardView;", "getView", "bind", "close", "Landroid/content/Context;", "c", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/huami/sleep/service/SleepService;", "e", "Lcom/huami/sleep/service/SleepService;", "sleepService", "Lcom/huami/module/homepage/cards/service/CardAssistService;", "f", "Lcom/huami/module/homepage/cards/service/CardAssistService;", "assistService", "Lkotlinx/coroutines/Job;", "g", "Lkotlinx/coroutines/Job;", "sleepInfoJob", "h", "Lcom/huami/module/homepage/cards/business/sleep/SleepCardView;", "sleepView", "<init>", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class SleepBindingLogic extends BindingLogic {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final SleepService sleepService;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final CardAssistService assistService;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private Job sleepInfoJob;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final SleepCardView sleepView;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SleepMode.values().length];
            iArr[SleepMode.DEEP.ordinal()] = 1;
            iArr[SleepMode.REM.ordinal()] = 2;
            iArr[SleepMode.AWAKE.ordinal()] = 3;
            iArr[SleepMode.SLEEP_BLANK.ordinal()] = 4;
            iArr[SleepMode.LIGHT.ordinal()] = 5;
            iArr[SleepMode.EDIT.ordinal()] = 6;
            iArr[SleepMode.NO_WEAR.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.sleep.SleepBindingLogic$1", f = "SleepBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SleepBindingLogic.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SleepBindingLogic.this.sleepView.initView();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/sleep/service/ServiceSleepInfo;", "sleepInfo", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.sleep.SleepBindingLogic$bind$2", f = "SleepBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<ServiceSleepInfo, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ ServiceSleepInfo a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ServiceSleepInfo serviceSleepInfo) {
                super(0);
                this.a = serviceSleepInfo;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "sleepInfo:" + this.a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable ServiceSleepInfo serviceSleepInfo, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(serviceSleepInfo, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = SleepBindingLogic.this.new b(continuation);
            bVar.b = obj;
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:33:0x0099  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean z;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ServiceSleepInfo serviceSleepInfo = (ServiceSleepInfo) this.b;
            HMLog.info("SleepBindingLogic", new a(serviceSleepInfo));
            if (serviceSleepInfo == null || serviceSleepInfo.getToBeMainSleep()) {
                SleepBindingLogic.this.sleepView.updateCurrentSleepDataView(serviceSleepInfo == null ? null : new SleepData(serviceSleepInfo.getSleepStartTime(), serviceSleepInfo.getSleepEndTime(), serviceSleepInfo.getSleepScore(), serviceSleepInfo.getSleepDuration(), serviceSleepInfo.getDeepSleepDuration(), serviceSleepInfo.getToBeSleepTimeCount()), serviceSleepInfo == null ? null : serviceSleepInfo.getSleepChanges());
            } else {
                SleepCardView sleepCardView = SleepBindingLogic.this.sleepView;
                int sleepDuration = serviceSleepInfo.getSleepDuration();
                SleepChanges sleepChanges = serviceSleepInfo.getSleepChanges();
                sleepCardView.updateNapSleepDataView(sleepDuration, sleepChanges == null ? null : Boxing.boxBoolean(sleepChanges.getNapSleepRose()));
            }
            SleepBindingLogic.this.b(serviceSleepInfo);
            if (serviceSleepInfo == null) {
                z = false;
            } else {
                ChartPoint chartPoint = (ChartPoint) CollectionsKt.lastOrNull((List) serviceSleepInfo.getChartDataForSeven());
                if ((chartPoint == null ? 0.0f : chartPoint.getValue()) <= 0.0f || !serviceSleepInfo.getToBeMainSleep()) {
                    z = false;
                } else {
                    z = true;
                }
            }
            SleepBindingLogic.this.sleepView.updateCurrentSevenDayView(serviceSleepInfo != null ? new SleepDurationInLast7Days(serviceSleepInfo.getAverageSleepDuration(), serviceSleepInfo.getChartDataForSeven()) : null, z);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/sleep/service/ServiceSleepInfo;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.sleep.SleepBindingLogic$bind$3", f = "SleepBindingLogic.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function3<FlowCollector<? super ServiceSleepInfo>, Throwable, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

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
                return "睡眠数据获取异常：" + StackTraceHelperKt.getStackTraceString(this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.module.homepage.cards.business.sleep.SleepBindingLogic$bind$3$2", f = "SleepBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SleepBindingLogic b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SleepBindingLogic sleepBindingLogic, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = sleepBindingLogic;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.sleepView.updateCurrentSleepDataView(null, null);
                return Unit.INSTANCE;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FlowCollector<? super ServiceSleepInfo> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
            c cVar = SleepBindingLogic.this.new c(continuation);
            cVar.b = th;
            return cVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.b;
                HMLog.error$default("SleepBindingLogic", null, null, new a(th), 6, null);
                HomeUtils.recordException(th);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                b bVar = new b(SleepBindingLogic.this, null);
                this.a = 1;
                if (BuildersKt.withContext(main, bVar, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.IntRef a;
        public final /* synthetic */ Ref.IntRef b;
        public final /* synthetic */ Ref.FloatRef c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Ref.IntRef intRef, Ref.IntRef intRef2, Ref.FloatRef floatRef) {
            super(0);
            this.a = intRef;
            this.b = intRef2;
            this.c = floatRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "minStart = " + this.a.element + " - maxEnd = " + this.b.element + " - maxValue = " + this.c.element;
        }
    }

    public SleepBindingLogic(@NotNull Context context, @NotNull CoroutineScope coroutineScope) {
        super(coroutineScope);
        this.context = context;
        this.scope = coroutineScope;
        ServiceManager serviceManager = ServiceManager.INSTANCE;
        this.sleepService = serviceManager.getSleepService();
        this.assistService = serviceManager.getAssistService();
        this.sleepView = new SleepCardView(context, null, 0, 6, null);
        e.f(coroutineScope, Dispatchers.getMain(), null, new a(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(ServiceSleepInfo sleepInfo) {
        if (sleepInfo == null) {
            SleepCardView.updateCurrentSleepChartView$default(this.sleepView, null, null, null, null, 15, null);
            return;
        }
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        for (Object obj : d(sleepInfo.getChartData())) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            final SleepChartSection sleepChartSection = (SleepChartSection) obj;
            ChartData chartData = new ChartData(new BaseIndex(sleepChartSection.getStartIndex(), sleepChartSection.getEndIndex()), sleepChartSection.getValue());
            chartData.addExtends(new IDataExtendListener() { // from class: nz6
                @Override // com.huami.chart.listener.IDataExtendListener
                public final Object get(BaseIndex baseIndex) {
                    return SleepBindingLogic.c(sleepChartSection, baseIndex);
                }
            });
            Unit unit = Unit.INSTANCE;
            sparseArray.put(i, chartData);
            i = i2;
        }
        Unit unit2 = Unit.INSTANCE;
        ChartDataList chartDataList = new ChartDataList(sparseArray);
        List<SleepChartSection> chartData2 = sleepInfo.getChartData();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(chartData2, 10));
        Iterator<T> it2 = chartData2.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((SleepChartSection) it2.next()).getStartIndex()));
        }
        Integer num = (Integer) CollectionsKt.minOrNull((Iterable) arrayList);
        chartDataList.setStart(num == null ? 0 : num.intValue());
        List<SleepChartSection> chartData3 = sleepInfo.getChartData();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(chartData3, 10));
        Iterator<T> it3 = chartData3.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Integer.valueOf(((SleepChartSection) it3.next()).getEndIndex()));
        }
        Integer num2 = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList2);
        chartDataList.setEnd(num2 == null ? 0 : num2.intValue());
        chartDataList.setMinValue(0.0f);
        List<SleepChartSection> chartData4 = sleepInfo.getChartData();
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(chartData4, 10));
        Iterator<T> it4 = chartData4.iterator();
        while (it4.hasNext()) {
            arrayList3.add(Integer.valueOf(((SleepChartSection) it4.next()).getValue()));
        }
        Integer num3 = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList3);
        chartDataList.setMaxValue(num3 == null ? 0.0f : num3.intValue());
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = -1;
        Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = -1.0f;
        SparseArray sparseArray2 = new SparseArray();
        SparseArray<ChartPoint> heartData = sleepInfo.getHeartData();
        if (heartData != null) {
            int size = heartData.size();
            for (int i3 = 0; i3 < size; i3++) {
                int iKeyAt = heartData.keyAt(i3);
                ChartPoint chartPointValueAt = heartData.valueAt(i3);
                int i4 = intRef.element;
                if (i4 == -1 || i4 > iKeyAt) {
                    intRef.element = iKeyAt;
                }
                int i5 = intRef2.element;
                if (i5 == -1 || i5 < iKeyAt) {
                    intRef2.element = iKeyAt;
                }
                float f = floatRef.element;
                if (f == -1.0f) {
                    floatRef.element = chartPointValueAt.getValue();
                } else if (f < chartPointValueAt.getValue()) {
                    floatRef.element = chartPointValueAt.getValue();
                }
                sparseArray2.put(iKeyAt, new ChartData(iKeyAt, chartPointValueAt.getValue()));
            }
        }
        Unit unit3 = Unit.INSTANCE;
        ChartDataList chartDataList2 = new ChartDataList(sparseArray2);
        HMLog.info("SleepBindingLogic", new d(intRef, intRef2, floatRef));
        int i6 = intRef.element;
        if (i6 == -1) {
            i6 = 0;
        }
        chartDataList2.setStart(i6);
        int i7 = intRef2.element;
        if (i7 == -1) {
            i7 = 0;
        }
        chartDataList2.setEnd(i7);
        chartDataList2.setMinValue(0.0f);
        float f2 = floatRef.element;
        floatRef.element = (f2 > (-1.0f) ? 1 : (f2 == (-1.0f) ? 0 : -1)) == 0 ? 0.0f : f2;
        this.sleepView.updateCurrentSleepChartView(chartDataList, chartDataList2, sleepInfo.getSleepStartTime(), sleepInfo.getSleepEndTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(SleepChartSection sleepChartSection, BaseIndex baseIndex) {
        return new HMColor(sleepChartSection.getColor());
    }

    private final List<SleepChartSection> d(List<SleepChartSection> list) {
        int iLoadColor;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((SleepChartSection) it2.next()).getValue()));
        }
        Integer num = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList);
        int iIntValue = ((num == null ? 0 : num.intValue()) * 5) / 7;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (SleepChartSection sleepChartSection : list) {
            int startIndex = sleepChartSection.getStartIndex();
            int endIndex = sleepChartSection.getEndIndex();
            SleepMode mode = sleepChartSection.getMode();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i = iArr[mode.ordinal()];
            int value = (i == 1 || i == 2 || i == 3 || i == 4) ? sleepChartSection.getValue() : iIntValue;
            switch (iArr[sleepChartSection.getMode().ordinal()]) {
                case 1:
                    iLoadColor = ContextExtKt.loadColor(this.context, R.color.s25);
                    break;
                case 2:
                    iLoadColor = ContextExtKt.loadColor(this.context, R.color.s19);
                    break;
                case 3:
                    iLoadColor = ContextExtKt.loadColor(this.context, R.color.s34);
                    break;
                case 4:
                    iLoadColor = ContextExtKt.loadColor(this.context, R.color.s4);
                    break;
                case 5:
                    iLoadColor = ContextExtKt.loadColor(this.context, R.color.s16);
                    break;
                case 6:
                    iLoadColor = ContextExtKt.loadColor(this.context, R.color.s17);
                    break;
                case 7:
                    iLoadColor = ContextExtKt.loadColor(this.context, R.color.s10);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList2.add(new SleepChartSection(startIndex, endIndex, value, iLoadColor, sleepChartSection.getMode()));
        }
        return arrayList2;
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    public void bind() {
        this.sleepInfoJob = FlowKt.launchIn(FlowKt.flowOn(FlowKt.m4456catch(ExteranelKt.onMainEach(FlowKt.transformLatest(this.assistService.timeChangeNotifier(), new SleepBindingLogic$bind$$inlined$flatMapLatest$1(null, this)), new b(null)), new c(null)), Dispatchers.getIO()), this.scope);
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    public void close() {
        Job job = this.sleepInfoJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.sleepInfoJob = null;
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    @NotNull
    /* JADX INFO: renamed from: getView, reason: from getter */
    public SleepCardView getSleepBreathView() {
        return this.sleepView;
    }
}
