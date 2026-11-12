package com.huami.heartrate.usecase;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.heartrate.koin.HeartRateScopeKt;
import com.huami.heartrate.repository.IHeartRateRepository;
import com.huami.heartrate.repository.entity.HeartRateEntity;
import com.huami.heartrate.repository.entity.RemoteHeartRateData;
import com.huami.heartrate.viewmodel.MeasureHrViewModelKt;
import com.tekartik.sqflite.Constant;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\u0013\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0016\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u000f\u0010\u0015R\u001d\u0010\u001a\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u000b\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/huami/heartrate/usecase/InitMeasureHrUseCase;", "", "", "dateFrom", "dateEnd", "", "limitCount", "", Constant.METHOD_EXECUTE, "(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/heartrate/repository/IHeartRateRepository;", "a", "Lcom/huami/heartrate/repository/IHeartRateRepository;", "repository", "Lcom/huami/heartrate/usecase/FetchRemoteMeasureHrUseCase;", "b", "Lkotlin/Lazy;", "c", "()Lcom/huami/heartrate/usecase/FetchRemoteMeasureHrUseCase;", "measureHrUseCase", "Lcom/huami/heartrate/usecase/InsertMeasureHrToDbUseCase;", "()Lcom/huami/heartrate/usecase/InsertMeasureHrToDbUseCase;", "insertMeasureHrToDbUseCase", "Lcom/huami/heartrate/usecase/DeleteSyncedMeasureHrUseCase;", GoogleApiAvailabilityLight.a, "()Lcom/huami/heartrate/usecase/DeleteSyncedMeasureHrUseCase;", "deleteSyncedMeasureHrUseCase", "", "userId", "<init>", "(Lcom/huami/heartrate/repository/IHeartRateRepository;Ljava/lang/String;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final class InitMeasureHrUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IHeartRateRepository repository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy measureHrUseCase = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy insertMeasureHrToDbUseCase;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy deleteSyncedMeasureHrUseCase;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/heartrate/usecase/DeleteSyncedMeasureHrUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<DeleteSyncedMeasureHrUseCase> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DeleteSyncedMeasureHrUseCase invoke() {
            return new DeleteSyncedMeasureHrUseCase(InitMeasureHrUseCase.this.repository);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.heartrate.usecase.InitMeasureHrUseCase", f = "InitMeasureHrUseCase.kt", i = {0, 1}, l = {36, 48, 49}, m = Constant.METHOD_EXECUTE, n = {"this", "it"}, s = {"L$0", "L$2"})
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return InitMeasureHrUseCase.this.execute(0L, 0L, 0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/heartrate/usecase/FetchRemoteMeasureHrUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<FetchRemoteMeasureHrUseCase> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FetchRemoteMeasureHrUseCase invoke() {
            return new FetchRemoteMeasureHrUseCase(InitMeasureHrUseCase.this.repository);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InitMeasureHrUseCase(@NotNull IHeartRateRepository iHeartRateRepository, @NotNull String str) {
        this.repository = iHeartRateRepository;
        final Scope hrScopeByUserId = HeartRateScopeKt.getHrScopeByUserId(str);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.insertMeasureHrToDbUseCase = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<InsertMeasureHrToDbUseCase>() { // from class: com.huami.heartrate.usecase.InitMeasureHrUseCase$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [com.huami.heartrate.usecase.InsertMeasureHrToDbUseCase, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final InsertMeasureHrToDbUseCase invoke() {
                return hrScopeByUserId.get(Reflection.getOrCreateKotlinClass(InsertMeasureHrToDbUseCase.class), qualifier, objArr);
            }
        });
        this.deleteSyncedMeasureHrUseCase = LazyKt__LazyJVMKt.lazy(new a());
    }

    private final DeleteSyncedMeasureHrUseCase a() {
        return (DeleteSyncedMeasureHrUseCase) this.deleteSyncedMeasureHrUseCase.getValue();
    }

    private final InsertMeasureHrToDbUseCase b() {
        return (InsertMeasureHrToDbUseCase) this.insertMeasureHrToDbUseCase.getValue();
    }

    private final FetchRemoteMeasureHrUseCase c() {
        return (FetchRemoteMeasureHrUseCase) this.measureHrUseCase.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object execute(long j, long j2, int i, @NotNull Continuation<? super Unit> continuation) {
        b bVar;
        InitMeasureHrUseCase initMeasureHrUseCase;
        List<HeartRateEntity> listSortedDescending;
        List<HeartRateEntity> list;
        InsertMeasureHrToDbUseCase insertMeasureHrToDbUseCaseB;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.f = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objFetchRemoteMeasureHrUseCase = bVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = bVar.f;
        boolean z = true;
        if (i3 != 0) {
            if (i3 == 1) {
                InitMeasureHrUseCase initMeasureHrUseCase2 = (InitMeasureHrUseCase) bVar.a;
                ResultKt.throwOnFailure(objFetchRemoteMeasureHrUseCase);
                initMeasureHrUseCase = initMeasureHrUseCase2;
            } else if (i3 == 2) {
                listSortedDescending = (List) bVar.c;
                list = (List) bVar.b;
                initMeasureHrUseCase = (InitMeasureHrUseCase) bVar.a;
                ResultKt.throwOnFailure(objFetchRemoteMeasureHrUseCase);
                insertMeasureHrToDbUseCaseB = initMeasureHrUseCase.b();
                bVar.a = list;
                bVar.b = null;
                bVar.c = null;
                bVar.f = 3;
                if (insertMeasureHrToDbUseCaseB.insertHeartRateList(listSortedDescending, bVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFetchRemoteMeasureHrUseCase);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objFetchRemoteMeasureHrUseCase);
        FetchRemoteMeasureHrUseCase fetchRemoteMeasureHrUseCaseC = c();
        bVar.a = this;
        bVar.f = 1;
        objFetchRemoteMeasureHrUseCase = fetchRemoteMeasureHrUseCaseC.fetchRemoteMeasureHrUseCase(j, j2, i, bVar);
        if (objFetchRemoteMeasureHrUseCase == coroutine_suspended) {
            return coroutine_suspended;
        }
        initMeasureHrUseCase = this;
        RemoteHeartRateData remoteHeartRateData = (RemoteHeartRateData) objFetchRemoteMeasureHrUseCase;
        List<HeartRateEntity> listConvertHeartRate = MeasureHrViewModelKt.convertHeartRate(remoteHeartRateData == null ? null : remoteHeartRateData.getItems());
        if (listConvertHeartRate != null && !listConvertHeartRate.isEmpty()) {
            z = false;
        }
        if (z) {
            return Unit.INSTANCE;
        }
        listSortedDescending = CollectionsKt___CollectionsKt.sortedDescending(listConvertHeartRate);
        DeleteSyncedMeasureHrUseCase deleteSyncedMeasureHrUseCaseA = initMeasureHrUseCase.a();
        long time = ((HeartRateEntity) CollectionsKt.first((List) listSortedDescending)).getTime();
        long time2 = ((HeartRateEntity) CollectionsKt.last((List) listSortedDescending)).getTime();
        bVar.a = initMeasureHrUseCase;
        bVar.b = listSortedDescending;
        bVar.c = listSortedDescending;
        bVar.f = 2;
        if (deleteSyncedMeasureHrUseCaseA.execute(time, time2, bVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        list = listSortedDescending;
        insertMeasureHrToDbUseCaseB = initMeasureHrUseCase.b();
        bVar.a = list;
        bVar.b = null;
        bVar.c = null;
        bVar.f = 3;
        if (insertMeasureHrToDbUseCaseB.insertHeartRateList(listSortedDescending, bVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
