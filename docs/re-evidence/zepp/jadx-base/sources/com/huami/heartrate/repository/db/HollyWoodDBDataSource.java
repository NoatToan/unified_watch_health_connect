package com.huami.heartrate.repository.db;

import com.facebook.appevents.UserDataStore;
import com.huami.heartrate.repository.entity.HeartRateEntity;
import com.huami.watch.companion.dataflow.Constant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010+\u001a\u00020%¢\u0006\u0004\b5\u00106J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J!\u0010\t\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J!\u0010\f\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ\u0016\u0010\r\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0016J+\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0012J\u0010\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001dH\u0016J \u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0016J&\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00070\u001d2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J,\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$0\u001d2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0016J&\u0010(\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0018\u00010$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0016R\u0016\u0010+\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u00100\u001a\u00020,8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R\u001d\u00104\u001a\u0002018B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b)\u00103\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"Lcom/huami/heartrate/repository/db/HollyWoodDBDataSource;", "Lcom/huami/heartrate/repository/db/IDataBaseDataSource;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/heartrate/repository/entity/HeartRateEntity;", Constant.KEY_HR_VALUE, "", "insertHeartRate", "", "heartRateList", "insertHeartRateList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateHeartRate", "updateHeartRateList", "deleteHeartRateList", "", "from", "to", "queryHeartRateListByDayRange", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "end", "", "limit", "queryHeartRateListByLimit", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryEarliestSyncedHeartRate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "earliestTime", "latestTime", "deleteSyncedHeartRate", "Lkotlinx/coroutines/flow/Flow;", "observeLatestHeartRate", "toSecond", "observeHeartRateLiveDataList", "Ljava/util/Date;", "dayFrom", "dayEnd", "", "", "", "observeWholeDayHeartRate", "queryWholeDayHeartRate", "a", "Ljava/lang/String;", "currentUserId", "Lcom/huami/heartrate/repository/db/HeartRateDb;", "b", "Lkotlin/Lazy;", "()Lcom/huami/heartrate/repository/db/HeartRateDb;", UserDataStore.DATE_OF_BIRTH, "Lcom/huami/heartrate/repository/db/HeartRateDao;", "c", "()Lcom/huami/heartrate/repository/db/HeartRateDao;", "dao", "<init>", "(Ljava/lang/String;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class HollyWoodDBDataSource implements IDataBaseDataSource, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String currentUserId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy db;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy dao;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/heartrate/repository/db/HeartRateDao;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<HeartRateDao> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HeartRateDao invoke() {
            return HollyWoodDBDataSource.this.b().manualHeartRateDao();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.repository.db.HollyWoodDBDataSource$observeHeartRateLiveDataList$1", f = "HollyWoodDBDataSource.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<FlowCollector, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.repository.db.HollyWoodDBDataSource$observeLatestHeartRate$1", f = "HollyWoodDBDataSource.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<FlowCollector, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = new c(continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.repository.db.HollyWoodDBDataSource$observeLatestHeartRate$2", f = "HollyWoodDBDataSource.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<FlowCollector, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            d dVar = new d(continuation);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.repository.db.HollyWoodDBDataSource$observeWholeDayHeartRate$1", f = "HollyWoodDBDataSource.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<FlowCollector, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            e eVar = new e(continuation);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
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

    /* JADX WARN: Multi-variable type inference failed */
    public HollyWoodDBDataSource(@NotNull String str) {
        this.currentUserId = str;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.db = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<HeartRateDb>() { // from class: com.huami.heartrate.repository.db.HollyWoodDBDataSource$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.heartrate.repository.db.HeartRateDb, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final HeartRateDb invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(HeartRateDb.class), qualifier, objArr);
            }
        });
        this.dao = LazyKt__LazyJVMKt.lazy(new a());
    }

    private final HeartRateDao a() {
        return (HeartRateDao) this.dao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HeartRateDb b() {
        return (HeartRateDb) this.db.getValue();
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    public void deleteHeartRateList(@NotNull List<HeartRateEntity> heartRateList) {
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @Nullable
    public Object deleteSyncedHeartRate(long j, long j2, @NotNull Continuation<? super Unit> continuation) {
        a().deleteHeartRateByUserId(this.currentUserId, 2, 1, j, j2);
        return Unit.INSTANCE;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    public void insertHeartRate(@NotNull HeartRateEntity heartRate) {
        a().insertManualHeartRate(heartRate);
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @Nullable
    public Object insertHeartRateList(@NotNull List<HeartRateEntity> list, @NotNull Continuation<? super Unit> continuation) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (HeartRateEntity heartRateEntity : list) {
            heartRateEntity.setUserId(this.currentUserId);
            arrayList.add(heartRateEntity);
        }
        HeartRateDao heartRateDaoA = a();
        Object[] array = arrayList.toArray(new HeartRateEntity[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        HeartRateEntity[] heartRateEntityArr = (HeartRateEntity[]) array;
        heartRateDaoA.insertManualHeartRate((HeartRateEntity[]) Arrays.copyOf(heartRateEntityArr, heartRateEntityArr.length));
        return Unit.INSTANCE;
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @NotNull
    public Flow<List<HeartRateEntity>> observeHeartRateLiveDataList(long from, long to) {
        return FlowKt.flow(new b(null));
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @NotNull
    public Flow<HeartRateEntity> observeLatestHeartRate() {
        return FlowKt.flow(new c(null));
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @NotNull
    public Flow<Map<String, byte[]>> observeWholeDayHeartRate(@NotNull Date dayFrom, @NotNull Date dayEnd) {
        return FlowKt.flow(new e(null));
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @Nullable
    public Object queryEarliestSyncedHeartRate(@NotNull Continuation<? super HeartRateEntity> continuation) {
        return a().queryEarliestHeartRateByUserId(this.currentUserId, 2, 2);
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @Nullable
    public Object queryHeartRateListByDayRange(long j, long j2, @NotNull Continuation<? super List<HeartRateEntity>> continuation) {
        return a().getHeartRateByUserId(this.currentUserId, 2, 2, j, j2);
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @Nullable
    public Object queryHeartRateListByLimit(long j, int i, @NotNull Continuation<? super List<HeartRateEntity>> continuation) {
        return null;
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @Nullable
    public Map<String, byte[]> queryWholeDayHeartRate(@NotNull Date dayFrom, @NotNull Date dayEnd) {
        return null;
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    public void updateHeartRate(@NotNull HeartRateEntity heartRate) {
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @Nullable
    public Object updateHeartRateList(@NotNull List<HeartRateEntity> list, @NotNull Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }

    @Override // com.huami.heartrate.repository.db.IDataBaseDataSource
    @NotNull
    public Flow<HeartRateEntity> observeLatestHeartRate(long from, long toSecond) {
        return FlowKt.flow(new d(null));
    }
}
