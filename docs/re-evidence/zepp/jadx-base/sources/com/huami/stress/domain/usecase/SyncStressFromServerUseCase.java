package com.huami.stress.domain.usecase;

import com.huami.stress.domain.repository.AllDayStressRepository;
import com.huami.stress.domain.repository.SingleStressRepository;
import com.huami.stress.domain.utils.LogTagUtilsKt;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.HMIntentHandler;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/huami/stress/domain/usecase/SyncStressFromServerUseCase;", "", "", "userId", "", HMIntentHandler.NAP_TYPE_LATEST, "", Constant.METHOD_EXECUTE, "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/stress/domain/repository/SingleStressRepository;", "a", "Lcom/huami/stress/domain/repository/SingleStressRepository;", "singleStressRepository", "Lcom/huami/stress/domain/repository/AllDayStressRepository;", "b", "Lcom/huami/stress/domain/repository/AllDayStressRepository;", "allDayStressRepository", "<init>", "(Lcom/huami/stress/domain/repository/SingleStressRepository;Lcom/huami/stress/domain/repository/AllDayStressRepository;)V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final class SyncStressFromServerUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SingleStressRepository singleStressRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AllDayStressRepository allDayStressRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.usecase.SyncStressFromServerUseCase$execute$2", f = "SyncStressFromServerUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ String d;
        public final /* synthetic */ boolean e;

        /* JADX INFO: renamed from: com.huami.stress.domain.usecase.SyncStressFromServerUseCase$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.stress.domain.usecase.SyncStressFromServerUseCase$execute$2$1", f = "SyncStressFromServerUseCase.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0608a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SyncStressFromServerUseCase b;
            public final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0608a(SyncStressFromServerUseCase syncStressFromServerUseCase, String str, Continuation<? super C0608a> continuation) {
                super(2, continuation);
                this.b = syncStressFromServerUseCase;
                this.c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0608a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0608a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SingleStressRepository singleStressRepository = this.b.singleStressRepository;
                    String str = this.c;
                    this.a = 1;
                    if (singleStressRepository.saveSingleStressFromServer(str, this) == coroutine_suspended) {
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

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.stress.domain.usecase.SyncStressFromServerUseCase$execute$2$2", f = "SyncStressFromServerUseCase.kt", i = {}, l = {23, 24}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ boolean b;
            public final /* synthetic */ SyncStressFromServerUseCase c;
            public final /* synthetic */ String d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z, SyncStressFromServerUseCase syncStressFromServerUseCase, String str, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = z;
                this.c = syncStressFromServerUseCase;
                this.d = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.b) {
                        AllDayStressRepository allDayStressRepository = this.c.allDayStressRepository;
                        String str = this.d;
                        this.a = 1;
                        if (allDayStressRepository.saveLatestAllDayStressFromServer(str, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        AllDayStressRepository allDayStressRepository2 = this.c.allDayStressRepository;
                        String str2 = this.d;
                        this.a = 2;
                        if (allDayStressRepository2.saveAllDayStressFromServer(str2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z, Continuation<? super a> continuation) {
            super(2, continuation);
            this.d = str;
            this.e = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = SyncStressFromServerUseCase.this.new a(this.d, this.e, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Job> continuation) {
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
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            e.f(coroutineScope, null, null, new C0608a(SyncStressFromServerUseCase.this, this.d, null), 3, null);
            return e.f(coroutineScope, null, null, new b(this.e, SyncStressFromServerUseCase.this, this.d, null), 3, null);
        }
    }

    public SyncStressFromServerUseCase(@NotNull SingleStressRepository singleStressRepository, @NotNull AllDayStressRepository allDayStressRepository) {
        this.singleStressRepository = singleStressRepository;
        this.allDayStressRepository = allDayStressRepository;
    }

    public static /* synthetic */ Object execute$default(SyncStressFromServerUseCase syncStressFromServerUseCase, String str, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return syncStressFromServerUseCase.execute(str, z, continuation);
    }

    @Nullable
    public final Object execute(@NotNull String str, boolean z, @NotNull Continuation<? super Unit> continuation) {
        HMLog.i(LogTagUtilsKt.getTAG(this), "SyncStressFromServerUseCase execute " + str + "，latest:" + z, new Object[0]);
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new a(str, z, null), continuation);
        return objCoroutineScope == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }
}
