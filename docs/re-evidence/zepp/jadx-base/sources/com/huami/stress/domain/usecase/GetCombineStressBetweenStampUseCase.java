package com.huami.stress.domain.usecase;

import com.huami.stress.domain.data.converter.AllDayStressExKt;
import com.huami.stress.domain.model.AllDayStress;
import com.huami.stress.domain.model.SingleStress;
import com.huami.stress.domain.repository.AllDayStressRepository;
import com.huami.stress.domain.repository.SingleStressRepository;
import com.huami.stress.domain.utils.LogTagUtilsKt;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.g;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/huami/stress/domain/usecase/GetCombineStressBetweenStampUseCase;", "", "", "startStamp", "endStamp", "", "Lcom/huami/stress/domain/model/SingleStress;", Constant.METHOD_EXECUTE, "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/stress/domain/repository/AllDayStressRepository;", "a", "Lcom/huami/stress/domain/repository/AllDayStressRepository;", "allDayStressRepository", "Lcom/huami/stress/domain/repository/SingleStressRepository;", "b", "Lcom/huami/stress/domain/repository/SingleStressRepository;", "singleStressRepository", "<init>", "(Lcom/huami/stress/domain/repository/AllDayStressRepository;Lcom/huami/stress/domain/repository/SingleStressRepository;)V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final class GetCombineStressBetweenStampUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AllDayStressRepository allDayStressRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SingleStressRepository singleStressRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.usecase.GetCombineStressBetweenStampUseCase", f = "GetCombineStressBetweenStampUseCase.kt", i = {0}, l = {23}, m = Constant.METHOD_EXECUTE, n = {"stressList"}, s = {"L$0"})
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
            return GetCombineStressBetweenStampUseCase.this.execute(0L, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.huami.stress.domain.usecase.GetCombineStressBetweenStampUseCase$execute$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.usecase.GetCombineStressBetweenStampUseCase$execute$2", f = "GetCombineStressBetweenStampUseCase.kt", i = {1}, l = {25, 32}, m = "invokeSuspend", n = {"allDayStress"}, s = {"L$0"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ ArrayList<SingleStress> c;
        public final /* synthetic */ GetCombineStressBetweenStampUseCase d;
        public final /* synthetic */ long e;
        public final /* synthetic */ long f;

        /* JADX INFO: renamed from: com.huami.stress.domain.usecase.GetCombineStressBetweenStampUseCase$execute$2$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/stress/domain/model/AllDayStress;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.stress.domain.usecase.GetCombineStressBetweenStampUseCase$execute$2$allDayStress$1", f = "GetCombineStressBetweenStampUseCase.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends AllDayStress>>, Object> {
            public int a;
            public final /* synthetic */ GetCombineStressBetweenStampUseCase b;
            public final /* synthetic */ long c;
            public final /* synthetic */ long d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(GetCombineStressBetweenStampUseCase getCombineStressBetweenStampUseCase, long j, long j2, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = getCombineStressBetweenStampUseCase;
                this.c = j;
                this.d = j2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends AllDayStress>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super List<AllDayStress>>) continuation);
            }

            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<AllDayStress>> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AllDayStressRepository allDayStressRepository = this.b.allDayStressRepository;
                    long j = this.c;
                    long j2 = this.d;
                    this.a = 1;
                    obj = allDayStressRepository.getAllDayStressFromLocalBetweenStamp(j, j2, this);
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

        /* JADX INFO: renamed from: com.huami.stress.domain.usecase.GetCombineStressBetweenStampUseCase$execute$2$b */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/stress/domain/model/SingleStress;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.stress.domain.usecase.GetCombineStressBetweenStampUseCase$execute$2$singleStressList$1", f = "GetCombineStressBetweenStampUseCase.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SingleStress>>, Object> {
            public int a;
            public final /* synthetic */ GetCombineStressBetweenStampUseCase b;
            public final /* synthetic */ long c;
            public final /* synthetic */ long d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(GetCombineStressBetweenStampUseCase getCombineStressBetweenStampUseCase, long j, long j2, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = getCombineStressBetweenStampUseCase;
                this.c = j;
                this.d = j2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends SingleStress>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super List<SingleStress>>) continuation);
            }

            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<SingleStress>> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SingleStressRepository singleStressRepository = this.b.singleStressRepository;
                    long j = this.c;
                    long j2 = this.d;
                    this.a = 1;
                    obj = singleStressRepository.getSingleStressListFromLocalBetweenStamp(j, j2, this);
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
        public AnonymousClass2(ArrayList<SingleStress> arrayList, GetCombineStressBetweenStampUseCase getCombineStressBetweenStampUseCase, long j, long j2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.c = arrayList;
            this.d = getCombineStressBetweenStampUseCase;
            this.e = j;
            this.f = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.c, this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x006d A[LOOP:0: B:18:0x0067->B:20:0x006d, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:23:0x0084  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            List list;
            ArrayList<SingleStress> arrayList;
            Iterator it2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.a;
                    ResultKt.throwOnFailure(obj);
                }
                List list2 = (List) obj;
                arrayList = this.c;
                it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.addAll(AllDayStressExKt.toSingleStressList((AllDayStress) it2.next()));
                }
                arrayList.addAll(list2);
                if (arrayList.size() > 1) {
                    g.sortWith(arrayList, new Comparator() { // from class: com.huami.stress.domain.usecase.GetCombineStressBetweenStampUseCase$execute$2$invokeSuspend$$inlined$sortBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((SingleStress) t).getTimestamp()), Long.valueOf(((SingleStress) t2).getTimestamp()));
                        }
                    });
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
            a aVar = new a(this.d, this.e, this.f, null);
            this.b = 1;
            obj = BuildersKt.withContext(coroutineDispatcher, aVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            List list3 = (List) obj;
            CoroutineDispatcher coroutineDispatcher2 = Dispatchers.getDefault();
            b bVar = new b(this.d, this.e, this.f, null);
            this.a = list3;
            this.b = 2;
            Object objWithContext = BuildersKt.withContext(coroutineDispatcher2, bVar, this);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = list3;
            obj = objWithContext;
            List list4 = (List) obj;
            arrayList = this.c;
            it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.addAll(AllDayStressExKt.toSingleStressList((AllDayStress) it2.next()));
            }
            arrayList.addAll(list4);
            if (arrayList.size() > 1) {
                g.sortWith(arrayList, new Comparator() { // from class: com.huami.stress.domain.usecase.GetCombineStressBetweenStampUseCase$execute$2$invokeSuspend$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((SingleStress) t).getTimestamp()), Long.valueOf(((SingleStress) t2).getTimestamp()));
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    public GetCombineStressBetweenStampUseCase(@NotNull AllDayStressRepository allDayStressRepository, @NotNull SingleStressRepository singleStressRepository) {
        this.allDayStressRepository = allDayStressRepository;
        this.singleStressRepository = singleStressRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object execute(long j, long j2, @NotNull Continuation<? super List<SingleStress>> continuation) {
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
        HMLog.i(LogTagUtilsKt.getTAG(this), "GetCombineStressBetweenStampUseCase execute", new Object[0]);
        ArrayList arrayList2 = new ArrayList();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(arrayList2, this, j, j2, null);
        aVar.a = arrayList2;
        aVar.d = 1;
        return CoroutineScopeKt.coroutineScope(anonymousClass2, aVar) == coroutine_suspended ? coroutine_suspended : arrayList2;
    }
}
