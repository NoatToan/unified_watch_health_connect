package com.huami.module.homepage.cards.business.sleepbreath;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.module.homepage.cards.helper.CurveChartPoint;
import com.huami.module.homepage.cards.manager.BindingLogic;
import com.huami.module.homepage.cards.service.CardAssistService;
import com.huami.module.homepage.cards.service.ServiceManager;
import com.huami.module.homepage.utils.ExteranelKt;
import com.huami.module.homepage.utils.HomeUtils;
import com.huami.module.ktx.TimeExtKt;
import com.huami.sleep.service.BreathQualityService;
import com.huami.sleep.service.ChartPoint;
import com.huami.sleep.service.ODChartData;
import com.huami.sleep.service.SleepBreathInfo;
import com.huami.sleep.service.SleepData;
import com.huami.sleep.service.SleepService;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Lcom/huami/module/homepage/cards/business/sleepbreath/SleepBreathBindingLogic;", "Lcom/huami/module/homepage/cards/manager/BindingLogic;", "", "time", "", "a", "Lcom/huami/module/homepage/cards/business/sleepbreath/SleepBreathCardView;", "getView", "", "bind", "close", "Lkotlinx/coroutines/CoroutineScope;", "c", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/huami/sleep/service/BreathQualityService;", GoogleApiAvailabilityLight.a, "Lcom/huami/sleep/service/BreathQualityService;", "qualityService", "Lcom/huami/sleep/service/SleepService;", "e", "Lcom/huami/sleep/service/SleepService;", "sleepService", "Lcom/huami/module/homepage/cards/service/CardAssistService;", "f", "Lcom/huami/module/homepage/cards/service/CardAssistService;", "assistService", "Lkotlinx/coroutines/Job;", "g", "Lkotlinx/coroutines/Job;", "job", "h", "Lcom/huami/module/homepage/cards/business/sleepbreath/SleepBreathCardView;", "sleepBreathView", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final class SleepBreathBindingLogic extends BindingLogic {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final CoroutineScope scope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final BreathQualityService qualityService;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final SleepService sleepService;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final CardAssistService assistService;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private Job job;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final SleepBreathCardView sleepBreathView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a \u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@"}, d2 = {"Lcom/huami/sleep/service/SleepBreathInfo;", "breathInfo", "Lcom/huami/sleep/service/SleepData;", "sleepInfo", "Lkotlin/Pair;", "Ljava/util/Date;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.sleepbreath.SleepBreathBindingLogic$bind$1$1", f = "SleepBreathBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function3<SleepBreathInfo, SleepData, Continuation<? super Pair<? extends SleepBreathInfo, ? extends Pair<? extends Date, ? extends Date>>>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public /* synthetic */ Object c;

        public a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable SleepBreathInfo sleepBreathInfo, @Nullable SleepData sleepData, @Nullable Continuation<? super Pair<SleepBreathInfo, ? extends Pair<? extends Date, ? extends Date>>> continuation) {
            a aVar = new a(continuation);
            aVar.b = sleepBreathInfo;
            aVar.c = sleepData;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SleepBreathInfo sleepBreathInfo = (SleepBreathInfo) this.b;
            SleepData sleepData = (SleepData) this.c;
            return new Pair(sleepBreathInfo, new Pair(sleepData == null ? null : sleepData.getSleepStartTime(), sleepData != null ? sleepData.getSleepEndTime() : null));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006*&\u0012\"\u0012 \u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/Pair;", "Lcom/huami/sleep/service/SleepBreathInfo;", "Ljava/util/Date;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.sleepbreath.SleepBreathBindingLogic$bind$3", f = "SleepBreathBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function3<FlowCollector<? super Pair<? extends SleepBreathInfo, ? extends Pair<? extends Date, ? extends Date>>>, Throwable, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "睡眠呼吸质量数据异常。";
            }
        }

        public b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull FlowCollector<? super Pair<SleepBreathInfo, ? extends Pair<? extends Date, ? extends Date>>> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
            b bVar = new b(continuation);
            bVar.b = th;
            return bVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Throwable th = (Throwable) this.b;
            HMLog.error$default("SleepBreathBindingLogic", null, th, a.a, 2, null);
            HomeUtils.recordException(th);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.huami.module.homepage.cards.business.sleepbreath.SleepBreathBindingLogic$bind$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042$\u0010\u0003\u001a \u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00000\u0000H\u008a@"}, d2 = {"Lkotlin/Pair;", "Lcom/huami/sleep/service/SleepBreathInfo;", "Ljava/util/Date;", "data", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.cards.business.sleepbreath.SleepBreathBindingLogic$bind$2", f = "SleepBreathBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Pair<? extends SleepBreathInfo, ? extends Pair<? extends Date, ? extends Date>>, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        /* JADX INFO: renamed from: com.huami.module.homepage.cards.business.sleepbreath.SleepBreathBindingLogic$bind$2$2, reason: invalid class name and collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.module.homepage.cards.business.sleepbreath.SleepBreathBindingLogic$bind$2$2", f = "SleepBreathBindingLogic.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
        public static final class C04842 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SleepBreathBindingLogic b;
            public final /* synthetic */ SleepBreathInfo c;
            public final /* synthetic */ Pair<Date, Date> d;

            /* JADX INFO: renamed from: com.huami.module.homepage.cards.business.sleepbreath.SleepBreathBindingLogic$bind$2$2$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.module.homepage.cards.business.sleepbreath.SleepBreathBindingLogic$bind$2$2$1$1", f = "SleepBreathBindingLogic.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ SleepBreathBindingLogic b;
                public final /* synthetic */ ODChartData c;
                public final /* synthetic */ Pair<Date, Date> d;

                /* JADX INFO: renamed from: com.huami.module.homepage.cards.business.sleepbreath.SleepBreathBindingLogic$bind$2$2$a$a, reason: collision with other inner class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class C0485a extends Lambda implements Function0<String> {
                    public final /* synthetic */ ODChartData a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0485a(ODChartData oDChartData) {
                        super(0);
                        this.a = oDChartData;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return "od:" + this.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public a(SleepBreathBindingLogic sleepBreathBindingLogic, ODChartData oDChartData, Pair<? extends Date, ? extends Date> pair, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.b = sleepBreathBindingLogic;
                    this.c = oDChartData;
                    this.d = pair;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new a(this.b, this.c, this.d, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                    return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Date sleepEndTime;
                    int iA;
                    int iA2;
                    kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    HMLog.info("SleepBreathBindingLogic", new C0485a(this.c));
                    SleepBreathCardView sleepBreathCardView = this.b.sleepBreathView;
                    ODChartData oDChartData = this.c;
                    Long lBoxLong = null;
                    Long lBoxLong2 = (oDChartData == null || (sleepEndTime = oDChartData.getSleepEndTime()) == null) ? null : Boxing.boxLong(sleepEndTime.getTime());
                    if (lBoxLong2 == null) {
                        Date second = this.d.getSecond();
                        if (second != null) {
                            lBoxLong = Boxing.boxLong(second.getTime());
                        }
                    } else {
                        lBoxLong = lBoxLong2;
                    }
                    sleepBreathCardView.updateTime(lBoxLong);
                    ODChartData oDChartData2 = this.c;
                    if (oDChartData2 != null) {
                        long time = oDChartData2.getSleepStartTime().getTime();
                        long time2 = this.c.getSleepEndTime().getTime();
                        if (TimeExtKt.isSameDay(time, Boxing.boxLong(time2))) {
                            iA = this.b.a(time) + 24;
                            iA2 = this.b.a(time2);
                        } else {
                            iA = this.b.a(time);
                            iA2 = this.b.a(time2);
                        }
                        int i = iA2 + 24;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (ChartPoint chartPoint : this.c.getOdChardData()) {
                            linkedHashMap.put(Boxing.boxInt(chartPoint.getIndex() / 60), Boxing.boxFloat(chartPoint.getValue()));
                        }
                        ArrayList arrayList = new ArrayList();
                        int i2 = (i - iA) + 2;
                        for (int i3 = 0; i3 < i2; i3++) {
                            int i4 = i3 + iA;
                            if (linkedHashMap.containsKey(Boxing.boxInt(i4))) {
                                arrayList.add(i3, new CurveChartPoint(i3, ((Number) linkedHashMap.get(Boxing.boxInt(i4))).floatValue()));
                            } else {
                                arrayList.add(i3, new CurveChartPoint(i3, 0.0f));
                            }
                        }
                        this.b.sleepBreathView.updateBreathChartView(this.c.getSleepStartTime(), this.c.getSleepEndTime(), arrayList);
                    } else {
                        SleepBreathCardView.updateBreathChartView$default(this.b.sleepBreathView, this.d.getFirst(), this.d.getSecond(), null, 4, null);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04842(SleepBreathBindingLogic sleepBreathBindingLogic, SleepBreathInfo sleepBreathInfo, Pair<? extends Date, ? extends Date> pair, Continuation<? super C04842> continuation) {
                super(2, continuation);
                this.b = sleepBreathBindingLogic;
                this.c = sleepBreathInfo;
                this.d = pair;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C04842(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C04842) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<ODChartData> oDChartData = this.b.qualityService.getODChartData(new Date(this.c.getTimestamp()));
                    final SleepBreathBindingLogic sleepBreathBindingLogic = this.b;
                    final Pair<Date, Date> pair = this.d;
                    FlowCollector<ODChartData> flowCollector = new FlowCollector<ODChartData>() { // from class: com.huami.module.homepage.cards.business.sleepbreath.SleepBreathBindingLogic$bind$2$2$invokeSuspend$$inlined$collect$1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public Object emit(ODChartData oDChartData2, @NotNull Continuation<? super Unit> continuation) throws Throwable {
                            Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new SleepBreathBindingLogic.AnonymousClass2.C04842.a(sleepBreathBindingLogic, oDChartData2, pair, null), continuation);
                            return objWithContext == a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
                        }
                    };
                    this.a = 1;
                    if (oDChartData.collect(flowCollector, this) == coroutine_suspended) {
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

        /* JADX INFO: renamed from: com.huami.module.homepage.cards.business.sleepbreath.SleepBreathBindingLogic$bind$2$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ SleepBreathInfo a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SleepBreathInfo sleepBreathInfo) {
                super(0);
                this.a = sleepBreathInfo;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "info:" + this.a;
            }
        }

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull Pair<SleepBreathInfo, ? extends Pair<? extends Date, ? extends Date>> pair, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = SleepBreathBindingLogic.this.new AnonymousClass2(continuation);
            anonymousClass2.b = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Pair pair = (Pair) this.b;
            SleepBreathInfo sleepBreathInfo = (SleepBreathInfo) pair.getFirst();
            Pair pair2 = (Pair) pair.getSecond();
            HMLog.info("SleepBreathBindingLogic", new a(sleepBreathInfo));
            SleepBreathBindingLogic.this.sleepBreathView.updateViewShowState(sleepBreathInfo != null);
            if (sleepBreathInfo != null) {
                SleepBreathBindingLogic.this.sleepBreathView.updateState(sleepBreathInfo.getWearHintCode(), Boxing.boxInt(sleepBreathInfo.getScore()));
                e.f(SleepBreathBindingLogic.this.scope, Dispatchers.getIO(), null, new C04842(SleepBreathBindingLogic.this, sleepBreathInfo, pair2, null), 2, null);
            } else {
                SleepBreathCardView sleepBreathCardView = SleepBreathBindingLogic.this.sleepBreathView;
                Date date = (Date) pair2.getSecond();
                sleepBreathCardView.updateTime(date != null ? Boxing.boxLong(date.getTime()) : null);
                SleepBreathCardView.updateBreathChartView$default(SleepBreathBindingLogic.this.sleepBreathView, null, null, null, 7, null);
            }
            return Unit.INSTANCE;
        }
    }

    public SleepBreathBindingLogic(@NotNull Context context, @NotNull CoroutineScope coroutineScope) {
        super(coroutineScope);
        this.scope = coroutineScope;
        ServiceManager serviceManager = ServiceManager.INSTANCE;
        this.qualityService = serviceManager.getBreathEqualityService();
        this.sleepService = serviceManager.getSleepService();
        this.assistService = serviceManager.getAssistService();
        this.sleepBreathView = new SleepBreathCardView(context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int a(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(time));
        return calendar.get(11);
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    public void bind() {
        this.job = FlowKt.launchIn(FlowKt.flowOn(FlowKt.m4456catch(ExteranelKt.onMainEach(FlowKt.transformLatest(this.assistService.timeChangeNotifier(), new SleepBreathBindingLogic$bind$$inlined$flatMapLatest$1(null, this)), new AnonymousClass2(null)), new b(null)), Dispatchers.getIO()), this.scope);
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    public void close() {
        Job job = this.job;
        if (job == null) {
            return;
        }
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
    }

    @Override // com.huami.module.homepage.cards.manager.BindingLogic
    @NotNull
    /* JADX INFO: renamed from: getView, reason: from getter */
    public SleepBreathCardView getStepCardView() {
        return this.sleepBreathView;
    }
}
