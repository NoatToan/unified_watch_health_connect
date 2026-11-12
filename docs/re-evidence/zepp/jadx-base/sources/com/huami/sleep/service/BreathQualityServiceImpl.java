package com.huami.sleep.service;

import androidx.p008lifecycle.FlowLiveDataConversions;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleep.datasource.IBreathQualityDataSource;
import com.huami.sleep.koin.ISleepDataManager;
import com.huami.sleep.model.BreathQualityOdInfo;
import com.huami.sleep.model.BreathQualityScoreInfo;
import com.huami.sleep.repo.IBreathQualityRepo;
import com.huami.sleep.util.SleepTimeUtil;
import com.huami.sleep.util.TimeShowUtilsKt;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002J\u0010\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006H\u0016J\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/huami/sleep/service/BreathQualityServiceImpl;", "Lcom/huami/sleep/service/BreathQualityService;", "", "code", "Lcom/huami/sleep/service/SleepBreathWearHintCode;", "b", "Lkotlinx/coroutines/flow/Flow;", "", "a", "Lcom/huami/sleep/service/SleepBreathInfo;", "getLatestSleepBreathScore", "Ljava/util/Date;", "date", "Lcom/huami/sleep/service/ODChartData;", "getODChartData", "", "Ljava/lang/String;", "userId", "Lcom/huami/sleep/repo/IBreathQualityRepo;", "Lcom/huami/sleep/repo/IBreathQualityRepo;", "breathQualityRepo", "Lcom/huami/sleep/koin/ISleepDataManager;", "c", "Lcom/huami/sleep/koin/ISleepDataManager;", "sleepDataManager", "Lcom/huami/sleep/datasource/IBreathQualityDataSource;", GoogleApiAvailabilityLight.a, "Lcom/huami/sleep/datasource/IBreathQualityDataSource;", "breathQualityDataSource", "<init>", "(Ljava/lang/String;Lcom/huami/sleep/repo/IBreathQualityRepo;Lcom/huami/sleep/koin/ISleepDataManager;Lcom/huami/sleep/datasource/IBreathQualityDataSource;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class BreathQualityServiceImpl implements BreathQualityService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IBreathQualityRepo breathQualityRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ISleepDataManager sleepDataManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final IBreathQualityDataSource breathQualityDataSource;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.service.BreathQualityServiceImpl$flowNull$1", f = "BreathQualityServiceImpl.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<FlowCollector, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.b;
                this.a = 1;
                if (flowCollector.emit(null, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.huami.sleep.service.BreathQualityServiceImpl$getLatestSleepBreathScore$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/sleep/service/SleepBreathInfo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.service.BreathQualityServiceImpl$getLatestSleepBreathScore$1", f = "BreathQualityServiceImpl.kt", i = {0}, l = {26, 96}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FlowCollector<? super SleepBreathInfo>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = BreathQualityServiceImpl.this.new AnonymousClass1(continuation);
            anonymousClass1.b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super SleepBreathInfo> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            final FlowCollector flowCollector;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    flowCollector = (FlowCollector) this.b;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.b;
            IBreathQualityRepo iBreathQualityRepo = BreathQualityServiceImpl.this.breathQualityRepo;
            String str = BreathQualityServiceImpl.this.userId;
            this.b = flowCollector;
            this.a = 1;
            obj = iBreathQualityRepo.getLatestScoreInfo(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            final Flow flow = (Flow) obj;
            final BreathQualityServiceImpl breathQualityServiceImpl = BreathQualityServiceImpl.this;
            Flow<SleepBreathInfo> flow2 = new Flow<SleepBreathInfo>() { // from class: com.huami.sleep.service.BreathQualityServiceImpl$getLatestSleepBreathScore$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: com.huami.sleep.service.BreathQualityServiceImpl$getLatestSleepBreathScore$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
                public static final class AnonymousClass2 implements FlowCollector<BreathQualityScoreInfo> {
                    public final /* synthetic */ FlowCollector a;
                    public final /* synthetic */ BreathQualityServiceImpl b;

                    /* JADX INFO: renamed from: com.huami.sleep.service.BreathQualityServiceImpl$getLatestSleepBreathScore$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                    @DebugMetadata(c = "com.huami.sleep.service.BreathQualityServiceImpl$getLatestSleepBreathScore$1$invokeSuspend$$inlined$map$1$2", f = "BreathQualityServiceImpl.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        public /* synthetic */ Object a;
                        public int b;
                        public Object c;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.a = obj;
                            this.b |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, BreathQualityServiceImpl breathQualityServiceImpl) {
                        this.a = flowCollector;
                        this.b = breathQualityServiceImpl;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(BreathQualityScoreInfo breathQualityScoreInfo, @NotNull Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        SleepBreathWearHintCode sleepBreathWearHintCodeB;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.b;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.b = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj = anonymousClass1.a;
                        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.b;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj);
                            FlowCollector flowCollector = this.a;
                            BreathQualityScoreInfo breathQualityScoreInfo2 = breathQualityScoreInfo;
                            SleepBreathInfo sleepBreathInfo = null;
                            if (breathQualityScoreInfo2 != null && (sleepBreathWearHintCodeB = this.b.b(breathQualityScoreInfo2.getWearHintCode())) != null) {
                                sleepBreathInfo = new SleepBreathInfo(breathQualityScoreInfo2.getScore(), breathQualityScoreInfo2.getTimeStamp(), sleepBreathWearHintCodeB);
                            }
                            anonymousClass1.b = 1;
                            if (flowCollector.emit(sleepBreathInfo, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                @Nullable
                public Object collect(@NotNull FlowCollector<? super SleepBreathInfo> flowCollector2, @NotNull Continuation continuation) {
                    Object objCollect = flow.collect(new AnonymousClass2(flowCollector2, breathQualityServiceImpl), continuation);
                    return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            FlowCollector<SleepBreathInfo> flowCollector2 = new FlowCollector<SleepBreathInfo>() { // from class: com.huami.sleep.service.BreathQualityServiceImpl$getLatestSleepBreathScore$1$invokeSuspend$$inlined$collect$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(SleepBreathInfo sleepBreathInfo, @NotNull Continuation<? super Unit> continuation) {
                    Object objEmit = flowCollector.emit(sleepBreathInfo, continuation);
                    return objEmit == a.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                }
            };
            this.b = null;
            this.a = 2;
            if (flow2.collect(flowCollector2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.huami.sleep.service.BreathQualityServiceImpl$getODChartData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/sleep/service/ODChartData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sleep.service.BreathQualityServiceImpl$getODChartData$1", f = "BreathQualityServiceImpl.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    public static final class C15421 extends SuspendLambda implements Function2<FlowCollector<? super ODChartData>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ Date d;

        /* JADX INFO: renamed from: com.huami.sleep.service.BreathQualityServiceImpl$getODChartData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u008a@"}, d2 = {"Lkotlin/Pair;", "", "it", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/sleep/service/ODChartData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.sleep.service.BreathQualityServiceImpl$getODChartData$1$1", f = "BreathQualityServiceImpl.kt", i = {0}, l = {47}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
        public static final class C05831 extends SuspendLambda implements Function2<Pair<? extends Long, ? extends Long>, Continuation<? super Flow<? extends ODChartData>>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ BreathQualityServiceImpl c;
            public final /* synthetic */ Date d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05831(BreathQualityServiceImpl breathQualityServiceImpl, Date date, Continuation<? super C05831> continuation) {
                super(2, continuation);
                this.c = breathQualityServiceImpl;
                this.d = date;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@Nullable Pair<Long, Long> pair, @Nullable Continuation<? super Flow<ODChartData>> continuation) {
                return ((C05831) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C05831 c05831 = new C05831(this.c, this.d, continuation);
                c05831.b = obj;
                return c05831;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                final Pair pair;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Pair pair2 = (Pair) this.b;
                    if (pair2 == null || ((Number) pair2.getSecond()).longValue() - ((Number) pair2.getFirst()).longValue() <= 0) {
                        return this.c.a();
                    }
                    IBreathQualityDataSource iBreathQualityDataSource = this.c.breathQualityDataSource;
                    String str = this.c.userId;
                    long jLongValue = ((Number) pair2.getFirst()).longValue();
                    long jLongValue2 = ((Number) pair2.getSecond()).longValue();
                    this.b = pair2;
                    this.a = 1;
                    Object odiList = iBreathQualityDataSource.getOdiList(str, jLongValue, jLongValue2, 3600000L, this);
                    if (odiList == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    pair = pair2;
                    obj = odiList;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pair = (Pair) this.b;
                    ResultKt.throwOnFailure(obj);
                }
                final Flow flow = (Flow) obj;
                final Date date = this.d;
                return new Flow<ODChartData>() { // from class: com.huami.sleep.service.BreathQualityServiceImpl$getODChartData$1$1$invokeSuspend$$inlined$map$1

                    /* JADX INFO: renamed from: com.huami.sleep.service.BreathQualityServiceImpl$getODChartData$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
                    public static final class AnonymousClass2 implements FlowCollector<List<? extends BreathQualityOdInfo>> {
                        public final /* synthetic */ FlowCollector a;
                        public final /* synthetic */ Pair b;
                        public final /* synthetic */ Date c;

                        /* JADX INFO: renamed from: com.huami.sleep.service.BreathQualityServiceImpl$getODChartData$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                        @DebugMetadata(c = "com.huami.sleep.service.BreathQualityServiceImpl$getODChartData$1$1$invokeSuspend$$inlined$map$1$2", f = "BreathQualityServiceImpl.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            public /* synthetic */ Object a;
                            public int b;
                            public Object c;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                this.a = obj;
                                this.b |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, Pair pair, Date date) {
                            this.a = flowCollector;
                            this.b = pair;
                            this.c = date;
                        }

                        /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public Object emit(List<? extends BreathQualityOdInfo> list, @NotNull Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            ODChartData oDChartData;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.b;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.b = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                            Object obj = anonymousClass1.a;
                            Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.b;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj);
                                FlowCollector flowCollector = this.a;
                                List<? extends BreathQualityOdInfo> list2 = list;
                                if (list2 != null) {
                                    int i3 = 0;
                                    if (!list2.isEmpty()) {
                                        String version = list2.get(0).getVersion();
                                        if (version == null || version.length() == 0) {
                                            oDChartData = null;
                                        }
                                    }
                                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                    for (Object obj2 : list2) {
                                        int i4 = i3 + 1;
                                        if (i3 < 0) {
                                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                                        }
                                        BreathQualityOdInfo breathQualityOdInfo = (BreathQualityOdInfo) obj2;
                                        Boxing.boxInt(i3).intValue();
                                        arrayList.add(new ChartPoint(SleepTimeUtil.INSTANCE.getTimeMinNum(TimeShowUtilsKt.toDateString(this.c.getTime()), breathQualityOdInfo.getEnd()), breathQualityOdInfo.getTimes()));
                                        i3 = i4;
                                    }
                                    oDChartData = new ODChartData(new Date(((Number) this.b.getFirst()).longValue()), new Date(((Number) this.b.getSecond()).longValue()), arrayList);
                                } else {
                                    oDChartData = null;
                                }
                                anonymousClass1.b = 1;
                                if (flowCollector.emit(oDChartData, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    @Nullable
                    public Object collect(@NotNull FlowCollector<? super ODChartData> flowCollector, @NotNull Continuation continuation) {
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector, pair, date), continuation);
                        return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15421(Date date, Continuation<? super C15421> continuation) {
            super(2, continuation);
            this.d = date;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C15421 c15421 = BreathQualityServiceImpl.this.new C15421(this.d, continuation);
            c15421.b = obj;
            return c15421;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super ODChartData> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((C15421) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final FlowCollector flowCollector = (FlowCollector) this.b;
                Flow flowFlatMapConcat = FlowKt.flatMapConcat(FlowLiveDataConversions.asFlow(BreathQualityServiceImpl.this.sleepDataManager.getBandSleepTime(BreathQualityServiceImpl.this.userId, TimeShowUtilsKt.toDateString(this.d.getTime()))), new C05831(BreathQualityServiceImpl.this, this.d, null));
                FlowCollector<ODChartData> flowCollector2 = new FlowCollector<ODChartData>() { // from class: com.huami.sleep.service.BreathQualityServiceImpl$getODChartData$1$invokeSuspend$$inlined$collect$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(ODChartData oDChartData, @NotNull Continuation<? super Unit> continuation) {
                        Object objEmit = flowCollector.emit(oDChartData, continuation);
                        return objEmit == a.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
                    }
                };
                this.a = 1;
                if (flowFlatMapConcat.collect(flowCollector2, this) == coroutine_suspended) {
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

    public BreathQualityServiceImpl(@NotNull String str, @NotNull IBreathQualityRepo iBreathQualityRepo, @NotNull ISleepDataManager iSleepDataManager, @NotNull IBreathQualityDataSource iBreathQualityDataSource) {
        this.userId = str;
        this.breathQualityRepo = iBreathQualityRepo;
        this.sleepDataManager = iSleepDataManager;
        this.breathQualityDataSource = iBreathQualityDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow a() {
        return FlowKt.flow(new a(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SleepBreathWearHintCode b(int code) {
        for (SleepBreathWearHintCode sleepBreathWearHintCode : SleepBreathWearHintCode.values()) {
            if (code == sleepBreathWearHintCode.getCode()) {
                return sleepBreathWearHintCode;
            }
        }
        return null;
    }

    @Override // com.huami.sleep.service.BreathQualityService
    @NotNull
    public Flow<SleepBreathInfo> getLatestSleepBreathScore() {
        return FlowKt.flow(new AnonymousClass1(null));
    }

    @Override // com.huami.sleep.service.BreathQualityService
    @NotNull
    public Flow<ODChartData> getODChartData(@NotNull Date date) {
        return FlowKt.flow(new C15421(date, null));
    }
}
