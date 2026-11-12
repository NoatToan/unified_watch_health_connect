package com.huami.heartrate.usecase;

import com.huami.bigdata.statistics.common.CommonSingleData;
import com.huami.bigdata.statistics.core.api.IBigDataExportedApi;
import com.huami.bigdata.statistics.core.resource.Failure;
import com.huami.bigdata.statistics.core.resource.Resource;
import com.huami.bigdata.statistics.core.resource.ResourceKt;
import com.huami.bigdata.statistics.core.resource.Success;
import com.huami.bigdata.statistics.core.utils.TimeUtils;
import com.huami.bigdata.statistics.heartrate.HeartRateStatistics;
import com.huami.heartrate.chart.HandleDataKt;
import com.huami.heartrate.repository.entity.HeartRateEntity;
import com.huami.heartrate.utils.ExtensionUtilsKt;
import com.huami.heartrate.utils.HeartRateTimeUtils;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001!B\u001f\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010 JV\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\"\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\t2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0002J)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/huami/heartrate/usecase/HeartRateBigDataUseCase;", "Lcom/huami/bigdata/statistics/heartrate/HeartRateBigDataUseCase;", "", "", "", "wholeDayHrData", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "measureHrMap", "from", "to", "", "Lcom/huami/bigdata/statistics/common/CommonSingleData;", "e", "getLocalDataList", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "time", "getLatestTimeInYear", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/heartrate/usecase/GetLocalMeasureHRDataUseCase;", "f", "Lcom/huami/heartrate/usecase/GetLocalMeasureHRDataUseCase;", "measureHRDataUseCase", "Lcom/huami/heartrate/usecase/GetLocalWholeDayHRDataUseCase;", "g", "Lcom/huami/heartrate/usecase/GetLocalWholeDayHRDataUseCase;", "wholeDayHRDataUseCase", "Lcom/huami/bigdata/statistics/core/api/IBigDataExportedApi;", "iBigDataExportedApi", "<init>", "(Lcom/huami/bigdata/statistics/core/api/IBigDataExportedApi;Lcom/huami/heartrate/usecase/GetLocalMeasureHRDataUseCase;Lcom/huami/heartrate/usecase/GetLocalWholeDayHRDataUseCase;)V", "Companion", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class HeartRateBigDataUseCase extends com.huami.bigdata.statistics.heartrate.HeartRateBigDataUseCase {

    @NotNull
    private static final String h = "HeartRateBigDataUseCase";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final GetLocalMeasureHRDataUseCase measureHRDataUseCase;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final GetLocalWholeDayHRDataUseCase wholeDayHRDataUseCase;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.usecase.HeartRateBigDataUseCase", f = "HeartRateBigDataUseCase.kt", i = {}, l = {131}, m = "getLatestTimeInYear", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return HeartRateBigDataUseCase.this.getLatestTimeInYear(0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "big data component callback latest time is " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Resource<HeartRateStatistics> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Resource<HeartRateStatistics> resource) {
            super(0);
            this.a = resource;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return ((Failure) this.a).getError();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j, long j2) {
            super(0);
            this.a = j;
            this.b = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "need merge time from-->:" + this.a + "，to-->" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/bigdata/statistics/common/CommonSingleData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.usecase.HeartRateBigDataUseCase$getLocalDataList$3", f = "HeartRateBigDataUseCase.kt", i = {0, 1}, l = {63, 64}, m = "invokeSuspend", n = {"getMeasureHrData", "wholeDayHrData"}, s = {"L$0", "L$0"})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<CommonSingleData>>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ long d;
        public final /* synthetic */ long e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ List<CommonSingleData> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<CommonSingleData> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "returnList--->:" + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/heartrate/repository/entity/HeartRateEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.heartrate.usecase.HeartRateBigDataUseCase$getLocalDataList$3$getMeasureHrData$1", f = "HeartRateBigDataUseCase.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends HeartRateEntity>>, Object> {
            public int a;
            public final /* synthetic */ HeartRateBigDataUseCase b;
            public final /* synthetic */ long c;
            public final /* synthetic */ long d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(HeartRateBigDataUseCase heartRateBigDataUseCase, long j, long j2, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = heartRateBigDataUseCase;
                this.c = j;
                this.d = j2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends HeartRateEntity>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super List<HeartRateEntity>>) continuation);
            }

            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<HeartRateEntity>> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    GetLocalMeasureHRDataUseCase getLocalMeasureHRDataUseCase = this.b.measureHRDataUseCase;
                    long jMillsToSecond = ExtensionUtilsKt.millsToSecond(this.c);
                    long jMillsToSecond2 = ExtensionUtilsKt.millsToSecond(this.d);
                    this.a = 1;
                    obj = getLocalMeasureHRDataUseCase.getLocalMeasureHRData(jMillsToSecond, jMillsToSecond2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.heartrate.usecase.HeartRateBigDataUseCase$getLocalDataList$3$getWholeDayHrData$1", f = "HeartRateBigDataUseCase.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, ? extends byte[]>>, Object> {
            public int a;
            public final /* synthetic */ HeartRateBigDataUseCase b;
            public final /* synthetic */ long c;
            public final /* synthetic */ long d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(HeartRateBigDataUseCase heartRateBigDataUseCase, long j, long j2, Continuation<? super c> continuation) {
                super(2, continuation);
                this.b = heartRateBigDataUseCase;
                this.c = j;
                this.d = j2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new c(this.b, this.c, this.d, continuation);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, ? extends byte[]>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super Map<String, byte[]>>) continuation);
            }

            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Map<String, byte[]>> continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    GetLocalWholeDayHRDataUseCase getLocalWholeDayHRDataUseCase = this.b.wholeDayHRDataUseCase;
                    long j = this.c;
                    long j2 = this.d;
                    this.a = 1;
                    obj = getLocalWholeDayHRDataUseCase.getLocalWholeDayHRData(j, j2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j, long j2, Continuation<? super e> continuation) {
            super(2, continuation);
            this.d = j;
            this.e = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            e eVar = HeartRateBigDataUseCase.this.new e(this.d, this.e, continuation);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<CommonSingleData>> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0087 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:20:0x008a  */
        /* JADX WARN: Code duplicated, block: B:23:0x0094  */
        /* JADX WARN: Code duplicated, block: B:25:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:26:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:29:0x00c0 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:31:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:34:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:36:0x00e5  */
        /* JADX WARN: Code duplicated, block: B:37:0x00e7  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Deferred deferredB;
            Object objAwait;
            Map map;
            Object objAwait2;
            List<HeartRateEntity> list;
            HashMap map2;
            ArrayList arrayList;
            Integer hr;
            int iIntValue;
            Integer hr2;
            int iIntValue2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    deferredB = (Deferred) this.b;
                    ResultKt.throwOnFailure(obj);
                    objAwait = obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Map map3 = (Map) this.b;
                    ResultKt.throwOnFailure(obj);
                    objAwait2 = obj;
                    map = map3;
                }
                list = (List) objAwait2;
                map2 = new HashMap();
                arrayList = new ArrayList();
                if (map == null) {
                    if (list != null) {
                        for (HeartRateEntity heartRateEntity : list) {
                            long jSecondToMills = ExtensionUtilsKt.secondToMills(heartRateEntity.getTime());
                            String id = TimeZone.getDefault().getID();
                            hr2 = heartRateEntity.getHr();
                            if (hr2 == null) {
                                iIntValue2 = 0;
                            } else {
                                iIntValue2 = hr2.intValue();
                            }
                            arrayList.add(new CommonSingleData(jSecondToMills, id, iIntValue2));
                        }
                    }
                    return arrayList;
                }
                if (list != null) {
                    for (HeartRateEntity heartRateEntity2 : list) {
                        Long lBoxLong = Boxing.boxLong(ExtensionUtilsKt.secondToMills(heartRateEntity2.getTime()));
                        hr = heartRateEntity2.getHr();
                        if (hr == null) {
                            iIntValue = 0;
                        } else {
                            iIntValue = hr.intValue();
                        }
                        map2.put(lBoxLong, Boxing.boxInt(iIntValue));
                    }
                }
                arrayList.addAll(HeartRateBigDataUseCase.this.e(map, map2, this.d, this.e));
                HMLog.debug(HeartRateBigDataUseCase.h, new a(arrayList));
                return arrayList;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            Deferred deferredB2 = kotlinx.coroutines.e.b(coroutineScope, null, null, new c(HeartRateBigDataUseCase.this, this.d, this.e, null), 3, null);
            deferredB = kotlinx.coroutines.e.b(coroutineScope, null, null, new b(HeartRateBigDataUseCase.this, this.d, this.e, null), 3, null);
            this.b = deferredB;
            this.a = 1;
            objAwait = deferredB2.await(this);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
            map = (Map) objAwait;
            this.b = map;
            this.a = 2;
            objAwait2 = deferredB.await(this);
            if (objAwait2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = (List) objAwait2;
            map2 = new HashMap();
            arrayList = new ArrayList();
            if (map == null) {
                if (list != null) {
                    while (r2.hasNext()) {
                        long jSecondToMills2 = ExtensionUtilsKt.secondToMills(heartRateEntity.getTime());
                        String id2 = TimeZone.getDefault().getID();
                        hr2 = heartRateEntity.getHr();
                        if (hr2 == null) {
                            iIntValue2 = 0;
                        } else {
                            iIntValue2 = hr2.intValue();
                        }
                        arrayList.add(new CommonSingleData(jSecondToMills2, id2, iIntValue2));
                    }
                }
                return arrayList;
            }
            if (list != null) {
                while (r2.hasNext()) {
                    Long lBoxLong2 = Boxing.boxLong(ExtensionUtilsKt.secondToMills(heartRateEntity2.getTime()));
                    hr = heartRateEntity2.getHr();
                    if (hr == null) {
                        iIntValue = 0;
                    } else {
                        iIntValue = hr.intValue();
                    }
                    map2.put(lBoxLong2, Boxing.boxInt(iIntValue));
                }
            }
            arrayList.addAll(HeartRateBigDataUseCase.this.e(map, map2, this.d, this.e));
            HMLog.debug(HeartRateBigDataUseCase.h, new a(arrayList));
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ byte[] b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, byte[] bArr) {
            super(0);
            this.a = str;
            this.b = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "whole day data: date-->" + this.a + " , byte array size--->:" + this.b.length;
        }
    }

    public HeartRateBigDataUseCase(@NotNull IBigDataExportedApi iBigDataExportedApi, @NotNull GetLocalMeasureHRDataUseCase getLocalMeasureHRDataUseCase, @NotNull GetLocalWholeDayHRDataUseCase getLocalWholeDayHRDataUseCase) {
        super(iBigDataExportedApi);
        this.measureHRDataUseCase = getLocalMeasureHRDataUseCase;
        this.wholeDayHRDataUseCase = getLocalWholeDayHRDataUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CommonSingleData> e(Map<String, byte[]> wholeDayHrData, HashMap<Long, Integer> measureHrMap, long from, long to) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, byte[]> entry : wholeDayHrData.entrySet()) {
            String key = entry.getKey();
            byte[] value = entry.getValue();
            HMLog.debug(h, new f(key, value));
            HeartRateTimeUtils heartRateTimeUtils = HeartRateTimeUtils.INSTANCE;
            Date date = heartRateTimeUtils.parseDate(key);
            long dayStartTime = heartRateTimeUtils.getDayStartTime(date == null ? 0L : date.getTime());
            int i = 0;
            int length = value.length - 1;
            if (length >= 0) {
                while (true) {
                    int i2 = i + 1;
                    int iIntValue = value[i] & 255;
                    long timeByPosition = HeartRateTimeUtils.INSTANCE.getTimeByPosition(dayStartTime, i);
                    if (HandleDataKt.isValidHeartRate().invoke(Integer.valueOf(iIntValue)).booleanValue() && timeByPosition >= from && timeByPosition <= to) {
                        Integer num = measureHrMap.get(Long.valueOf(timeByPosition));
                        if (num != null) {
                            iIntValue = num.intValue();
                        }
                        arrayList.add(new CommonSingleData(timeByPosition, TimeZone.getDefault().getID(), iIntValue));
                    }
                    if (i2 > length) {
                        break;
                    }
                    i = i2;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getLatestTimeInYear(long j, @NotNull Continuation<? super Long> continuation) {
        a aVar;
        Long lBoxLong;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object year = aVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(year);
            String strTimestampToYMD$default = TimeUtils.timestampToYMD$default(TimeUtils.INSTANCE, HeartRateTimeUtils.INSTANCE.getStartTime(j, 19), null, 2, null);
            aVar.c = 1;
            year = getYear(strTimestampToYMD$default, aVar);
            if (year == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(year);
        }
        Resource resource = (Resource) year;
        if (!(resource instanceof Success)) {
            if (!(resource instanceof Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            HMLog.error$default(h, null, null, new c(resource), 6, null);
            return null;
        }
        HeartRateStatistics heartRateStatistics = (HeartRateStatistics) ResourceKt.getOrNull(resource);
        long jLongValue = (heartRateStatistics == null || (lBoxLong = Boxing.boxLong(heartRateStatistics.getMaxTime())) == null) ? 0L : lBoxLong.longValue();
        if (jLongValue <= 0) {
            return null;
        }
        HMLog.info(h, new b(jLongValue));
        return Boxing.boxLong(jLongValue);
    }

    @Override // com.huami.bigdata.statistics.core.usecase.DefaultMapSingleDataUseCase
    @Nullable
    public Object getLocalDataList(long j, long j2, @NotNull Continuation<? super List<CommonSingleData>> continuation) {
        HMLog.debug(h, new d(j, j2));
        return CoroutineScopeKt.coroutineScope(new e(j, j2, null), continuation);
    }
}
