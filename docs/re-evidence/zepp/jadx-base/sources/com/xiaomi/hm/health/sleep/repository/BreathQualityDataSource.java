package com.xiaomi.hm.health.sleep.repository;

import com.huami.bloodoxygen.service.odi.SleepBreathScore;
import com.huami.bloodoxygen.service.osaevent.DifficultBreath;
import com.huami.sleep.datasource.IBreathQualityDataSource;
import com.huami.sleep.model.BreathQualityOdInfo;
import com.huami.sleep.model.BreathQualityScoreInfo;
import com.xiaomi.hm.health.di.koin.spo2.Spo2Proxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007JA\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/sleep/repository/BreathQualityDataSource;", "Lcom/huami/sleep/datasource/IBreathQualityDataSource;", "", "userId", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/sleep/model/BreathQualityScoreInfo;", "getLatestScoreInfo", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "from", "to", "interval", "", "Lcom/huami/sleep/model/BreathQualityOdInfo;", "getOdiList", "(Ljava/lang/String;JJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startStamp", "endStamp", "getScoreAndCost", "(Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BreathQualityDataSource implements IBreathQualityDataSource {
    @Override // com.huami.sleep.datasource.IBreathQualityDataSource
    @Nullable
    public Object getLatestScoreInfo(@NotNull String str, @NotNull Continuation<? super Flow<BreathQualityScoreInfo>> continuation) {
        final Flow<SleepBreathScore> latestSleepBreathScoreFlow = Spo2Proxy.INSTANCE.getLatestSleepBreathScoreFlow();
        return new Flow<BreathQualityScoreInfo>() { // from class: com.xiaomi.hm.health.sleep.repository.BreathQualityDataSource$getLatestScoreInfo$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.hm.health.sleep.repository.BreathQualityDataSource$getLatestScoreInfo$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<SleepBreathScore> {
                public final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;

                /* JADX INFO: renamed from: com.xiaomi.hm.health.sleep.repository.BreathQualityDataSource$getLatestScoreInfo$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.xiaomi.hm.health.sleep.repository.BreathQualityDataSource$getLatestScoreInfo$$inlined$map$1$2", f = "BreathQualityDataSource.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public Object L$0;
                    public int label;
                    public /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow$inlined = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(SleepBreathScore sleepBreathScore, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.result;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.$this_unsafeFlow$inlined;
                        SleepBreathScore sleepBreathScore2 = sleepBreathScore;
                        BreathQualityScoreInfo breathQualityScoreInfo = sleepBreathScore2 == null ? null : new BreathQualityScoreInfo(sleepBreathScore2.getTimestamp(), sleepBreathScore2.getScore(), (int) sleepBreathScore2.getWatchTime(), sleepBreathScore2.getWearHintCode());
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(breathQualityScoreInfo, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull FlowCollector<? super BreathQualityScoreInfo> flowCollector, @NotNull Continuation continuation2) {
                Object objCollect = latestSleepBreathScoreFlow.collect(new AnonymousClass2(flowCollector), continuation2);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.huami.sleep.datasource.IBreathQualityDataSource
    @Nullable
    public Object getOdiList(@NotNull String str, long j, long j2, long j3, @NotNull Continuation<? super Flow<? extends List<BreathQualityOdInfo>>> continuation) {
        final Flow<List<DifficultBreath>> difficultBreathListFlow = Spo2Proxy.INSTANCE.getDifficultBreathListFlow(j, j2, j3);
        return new Flow<List<? extends BreathQualityOdInfo>>() { // from class: com.xiaomi.hm.health.sleep.repository.BreathQualityDataSource$getOdiList$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.hm.health.sleep.repository.BreathQualityDataSource$getOdiList$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<List<? extends DifficultBreath>> {
                public final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;

                /* JADX INFO: renamed from: com.xiaomi.hm.health.sleep.repository.BreathQualityDataSource$getOdiList$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.xiaomi.hm.health.sleep.repository.BreathQualityDataSource$getOdiList$$inlined$map$1$2", f = "BreathQualityDataSource.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public Object L$0;
                    public int label;
                    public /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow$inlined = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(List<? extends DifficultBreath> list, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.result;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.$this_unsafeFlow$inlined;
                        List<? extends DifficultBreath> list2 = list;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                        for (DifficultBreath difficultBreath : list2) {
                            arrayList.add(new BreathQualityOdInfo(difficultBreath.getStart(), difficultBreath.getEnd(), difficultBreath.getTimes(), difficultBreath.getVersion()));
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull FlowCollector<? super List<? extends BreathQualityOdInfo>> flowCollector, @NotNull Continuation continuation2) {
                Object objCollect = difficultBreathListFlow.collect(new AnonymousClass2(flowCollector), continuation2);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.huami.sleep.datasource.IBreathQualityDataSource
    @Nullable
    public Object getScoreAndCost(@NotNull String str, long j, long j2, @NotNull Continuation<? super Flow<? extends List<BreathQualityScoreInfo>>> continuation) {
        final Flow<List<SleepBreathScore>> sleepBreathScoreListFlow = Spo2Proxy.INSTANCE.getSleepBreathScoreListFlow(j, j2);
        return new Flow<List<? extends BreathQualityScoreInfo>>() { // from class: com.xiaomi.hm.health.sleep.repository.BreathQualityDataSource$getScoreAndCost$$inlined$map$1

            /* JADX INFO: renamed from: com.xiaomi.hm.health.sleep.repository.BreathQualityDataSource$getScoreAndCost$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<List<? extends SleepBreathScore>> {
                public final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;

                /* JADX INFO: renamed from: com.xiaomi.hm.health.sleep.repository.BreathQualityDataSource$getScoreAndCost$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.xiaomi.hm.health.sleep.repository.BreathQualityDataSource$getScoreAndCost$$inlined$map$1$2", f = "BreathQualityDataSource.kt", i = {}, l = {137}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public Object L$0;
                    public int label;
                    public /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow$inlined = flowCollector;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(List<? extends SleepBreathScore> list, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.result;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.$this_unsafeFlow$inlined;
                        List<? extends SleepBreathScore> list2 = list;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                        for (SleepBreathScore sleepBreathScore : list2) {
                            arrayList.add(new BreathQualityScoreInfo(sleepBreathScore.getTimestamp(), sleepBreathScore.getScore(), (int) sleepBreathScore.getWatchTime(), sleepBreathScore.getWearHintCode()));
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull FlowCollector<? super List<? extends BreathQualityScoreInfo>> flowCollector, @NotNull Continuation continuation2) {
                Object objCollect = sleepBreathScoreListFlow.collect(new AnonymousClass2(flowCollector), continuation2);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
