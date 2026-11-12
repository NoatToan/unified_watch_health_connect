package com.xiaomi.hm.health.temperature.usecase;

import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import com.xiaomi.hm.health.temperature.model.Temperature;
import com.xiaomi.hm.health.temperature.repository.AllDayTempRepository;
import com.xiaomi.hm.health.temperature.repository.ManualTempRepository;
import com.xiaomi.hm.health.temperature.repository.SingleTempRepository;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/temperature/usecase/GetAllTypeTempBetweenTimeStampUseCase;", "", "", "start", "end", "", "Lcom/xiaomi/hm/health/temperature/model/Temperature;", Constant.METHOD_EXECUTE, "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/temperature/repository/SingleTempRepository;", "a", "Lcom/xiaomi/hm/health/temperature/repository/SingleTempRepository;", "singleTempRepository", "Lcom/xiaomi/hm/health/temperature/repository/AllDayTempRepository;", "b", "Lcom/xiaomi/hm/health/temperature/repository/AllDayTempRepository;", "allDayTempRepository", "Lcom/xiaomi/hm/health/temperature/repository/ManualTempRepository;", "c", "Lcom/xiaomi/hm/health/temperature/repository/ManualTempRepository;", "manualTempRepository", "<init>", "(Lcom/xiaomi/hm/health/temperature/repository/SingleTempRepository;Lcom/xiaomi/hm/health/temperature/repository/AllDayTempRepository;Lcom/xiaomi/hm/health/temperature/repository/ManualTempRepository;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class GetAllTypeTempBetweenTimeStampUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SingleTempRepository singleTempRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AllDayTempRepository allDayTempRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ManualTempRepository manualTempRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.temperature.usecase.GetAllTypeTempBetweenTimeStampUseCase", f = "GetAllTypeTempBetweenTimeStampUseCase.kt", i = {0}, l = {31}, m = Constant.METHOD_EXECUTE, n = {"result"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return GetAllTypeTempBetweenTimeStampUseCase.this.execute(0L, 0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, long j2) {
            super(0);
            this.a = j;
            this.b = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "GetAllTypeTempBetweenTimeStampUseCase execute start:" + this.a + ",end:" + this.b;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.temperature.usecase.GetAllTypeTempBetweenTimeStampUseCase$execute$3, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/xiaomi/hm/health/temperature/model/Temperature;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.temperature.usecase.GetAllTypeTempBetweenTimeStampUseCase$execute$3", f = "GetAllTypeTempBetweenTimeStampUseCase.kt", i = {1, 2, 2}, l = {32, 35, 38}, m = "invokeSuspend", n = {"singleTemp", "singleTemp", "allDayTemp"}, s = {"L$0", "L$0", "L$1"})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Temperature>>, Object> {
        public Object a;
        public Object b;
        public int c;
        public final /* synthetic */ ArrayList<Temperature> d;
        public final /* synthetic */ GetAllTypeTempBetweenTimeStampUseCase e;
        public final /* synthetic */ long f;
        public final /* synthetic */ long g;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.temperature.usecase.GetAllTypeTempBetweenTimeStampUseCase$execute$3$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/xiaomi/hm/health/temperature/model/Temperature;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.temperature.usecase.GetAllTypeTempBetweenTimeStampUseCase$execute$3$allDayTemp$1", f = "GetAllTypeTempBetweenTimeStampUseCase.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Temperature>>, Object> {
            public int a;
            public final /* synthetic */ GetAllTypeTempBetweenTimeStampUseCase b;
            public final /* synthetic */ long c;
            public final /* synthetic */ long d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(GetAllTypeTempBetweenTimeStampUseCase getAllTypeTempBetweenTimeStampUseCase, long j, long j2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = getAllTypeTempBetweenTimeStampUseCase;
                this.c = j;
                this.d = j2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Temperature>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super List<Temperature>>) continuation);
            }

            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<Temperature>> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AllDayTempRepository allDayTempRepository = this.b.allDayTempRepository;
                    long j = this.c;
                    long j2 = this.d;
                    this.a = 1;
                    obj = allDayTempRepository.getAllDayTempBetweenTime(j, j2, this);
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

        /* JADX INFO: renamed from: com.xiaomi.hm.health.temperature.usecase.GetAllTypeTempBetweenTimeStampUseCase$execute$3$b */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/xiaomi/hm/health/temperature/model/Temperature;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.temperature.usecase.GetAllTypeTempBetweenTimeStampUseCase$execute$3$manualTemp$1", f = "GetAllTypeTempBetweenTimeStampUseCase.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Temperature>>, Object> {
            public int a;
            public final /* synthetic */ GetAllTypeTempBetweenTimeStampUseCase b;
            public final /* synthetic */ long c;
            public final /* synthetic */ long d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(GetAllTypeTempBetweenTimeStampUseCase getAllTypeTempBetweenTimeStampUseCase, long j, long j2, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = getAllTypeTempBetweenTimeStampUseCase;
                this.c = j;
                this.d = j2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Temperature>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super List<Temperature>>) continuation);
            }

            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<Temperature>> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ManualTempRepository manualTempRepository = this.b.manualTempRepository;
                    long j = this.c;
                    long j2 = this.d;
                    this.a = 1;
                    obj = manualTempRepository.getManualTempBetweenTime(j, j2, this);
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

        /* JADX INFO: renamed from: com.xiaomi.hm.health.temperature.usecase.GetAllTypeTempBetweenTimeStampUseCase$execute$3$c */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/xiaomi/hm/health/temperature/model/Temperature;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.temperature.usecase.GetAllTypeTempBetweenTimeStampUseCase$execute$3$singleTemp$1", f = "GetAllTypeTempBetweenTimeStampUseCase.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Temperature>>, Object> {
            public int a;
            public final /* synthetic */ GetAllTypeTempBetweenTimeStampUseCase b;
            public final /* synthetic */ long c;
            public final /* synthetic */ long d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(GetAllTypeTempBetweenTimeStampUseCase getAllTypeTempBetweenTimeStampUseCase, long j, long j2, Continuation<? super c> continuation) {
                super(2, continuation);
                this.b = getAllTypeTempBetweenTimeStampUseCase;
                this.c = j;
                this.d = j2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new c(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Temperature>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super List<Temperature>>) continuation);
            }

            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<Temperature>> continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SingleTempRepository singleTempRepository = this.b.singleTempRepository;
                    long j = this.c;
                    long j2 = this.d;
                    this.a = 1;
                    obj = singleTempRepository.getSingleTempBetweenTime(j, j2, this);
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
        public AnonymousClass3(ArrayList<Temperature> arrayList, GetAllTypeTempBetweenTimeStampUseCase getAllTypeTempBetweenTimeStampUseCase, long j, long j2, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.d = arrayList;
            this.e = getAllTypeTempBetweenTimeStampUseCase;
            this.f = j;
            this.g = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass3(this.d, this.e, this.f, this.g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Temperature>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<Temperature>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<Temperature>> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x008f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:22:0x0090  */
        /* JADX WARN: Code duplicated, block: B:26:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:28:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:29:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:36:0x00d6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:38:0x00ae A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            List list;
            List list2;
            Object objWithContext;
            List list3;
            ArrayList arrayList;
            boolean z;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    list = (List) this.a;
                    ResultKt.throwOnFailure(obj);
                    list2 = (List) obj;
                    CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                    b bVar = new b(this.e, this.f, this.g, null);
                    this.a = list;
                    this.b = list2;
                    this.c = 3;
                    objWithContext = BuildersKt.withContext(coroutineDispatcher, bVar, this);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list3 = list2;
                    obj = objWithContext;
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list3 = (List) this.b;
                    list = (List) this.a;
                    ResultKt.throwOnFailure(obj);
                }
                this.d.addAll(list);
                this.d.addAll(list3);
                this.d.addAll((List) obj);
                ArrayList<Temperature> arrayList2 = this.d;
                arrayList = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (((Temperature) obj2).getTimestamp() < HealthDataTimeUtils.INSTANCE.getUserCreateTimeStamp()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!Boxing.boxBoolean(z).booleanValue()) {
                        arrayList.add(obj2);
                    }
                }
                return CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.xiaomi.hm.health.temperature.usecase.GetAllTypeTempBetweenTimeStampUseCase$execute$3$invokeSuspend$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((Temperature) t).getTimestamp()), Long.valueOf(((Temperature) t2).getTimestamp()));
                    }
                });
            }
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher coroutineDispatcher2 = Dispatchers.getDefault();
            c cVar = new c(this.e, this.f, this.g, null);
            this.c = 1;
            obj = BuildersKt.withContext(coroutineDispatcher2, cVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            List list4 = (List) obj;
            CoroutineDispatcher coroutineDispatcher3 = Dispatchers.getDefault();
            a aVar = new a(this.e, this.f, this.g, null);
            this.a = list4;
            this.c = 2;
            Object objWithContext2 = BuildersKt.withContext(coroutineDispatcher3, aVar, this);
            if (objWithContext2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = list4;
            obj = objWithContext2;
            list2 = (List) obj;
            CoroutineDispatcher coroutineDispatcher4 = Dispatchers.getDefault();
            b bVar2 = new b(this.e, this.f, this.g, null);
            this.a = list;
            this.b = list2;
            this.c = 3;
            objWithContext = BuildersKt.withContext(coroutineDispatcher4, bVar2, this);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            list3 = list2;
            obj = objWithContext;
            this.d.addAll(list);
            this.d.addAll(list3);
            this.d.addAll((List) obj);
            ArrayList<Temperature> arrayList3 = this.d;
            arrayList = new ArrayList();
            while (r15.hasNext()) {
                if (((Temperature) obj2).getTimestamp() < HealthDataTimeUtils.INSTANCE.getUserCreateTimeStamp()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!Boxing.boxBoolean(z).booleanValue()) {
                    arrayList.add(obj2);
                }
            }
            return CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.xiaomi.hm.health.temperature.usecase.GetAllTypeTempBetweenTimeStampUseCase$execute$3$invokeSuspend$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((Temperature) t).getTimestamp()), Long.valueOf(((Temperature) t2).getTimestamp()));
                }
            });
        }
    }

    public GetAllTypeTempBetweenTimeStampUseCase(@NotNull SingleTempRepository singleTempRepository, @NotNull AllDayTempRepository allDayTempRepository, @NotNull ManualTempRepository manualTempRepository) {
        this.singleTempRepository = singleTempRepository;
        this.allDayTempRepository = allDayTempRepository;
        this.manualTempRepository = manualTempRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object execute(long j, long j2, @NotNull Continuation<? super List<Temperature>> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ArrayList arrayList = (ArrayList) aVar.a;
            ResultKt.throwOnFailure(obj);
            return arrayList;
        }
        ResultKt.throwOnFailure(obj);
        HMLog.info("GetAllTypeTempBetweenTimeStampUseCase", new b(j, j2));
        ArrayList arrayList2 = new ArrayList();
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(arrayList2, this, j, j2, null);
        aVar.a = arrayList2;
        aVar.d = 1;
        return CoroutineScopeKt.coroutineScope(anonymousClass3, aVar) == coroutine_suspended ? coroutine_suspended : arrayList2;
    }
}
