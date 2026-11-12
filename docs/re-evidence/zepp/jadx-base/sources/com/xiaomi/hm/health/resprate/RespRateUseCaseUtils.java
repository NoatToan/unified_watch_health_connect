package com.xiaomi.hm.health.resprate;

import androidx.annotation.WorkerThread;
import com.huami.respiratoryrate.core.RespRateCoroutineScope;
import com.huami.respiratoryrate.core.koin.RespRateKoinScopeKt;
import com.huami.respiratoryrate.core.usecase.ClearDataUseCase;
import com.huami.respiratoryrate.core.usecase.PostDataUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/resprate/RespRateUseCaseUtils;", "", "", "uploadRepRateData", "", "clearRespRateData", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class RespRateUseCaseUtils {

    @NotNull
    public static final RespRateUseCaseUtils INSTANCE = new RespRateUseCaseUtils();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.resprate.RespRateUseCaseUtils$clearRespRateData$1", f = "RespRateUseCaseUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(continuation);
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
            ((ClearDataUseCase) RespRateKoinScopeKt.getRespRateKoinScope().get(Reflection.getOrCreateKotlinClass(ClearDataUseCase.class), null, null)).execute();
            return Unit.INSTANCE;
        }
    }

    private RespRateUseCaseUtils() {
    }

    public final void clearRespRateData() {
        e.f((CoroutineScope) RespRateKoinScopeKt.getRespRateKoinScope().get(Reflection.getOrCreateKotlinClass(RespRateCoroutineScope.class), null, null), null, null, new a(null), 3, null);
    }

    @WorkerThread
    public final boolean uploadRepRateData() {
        return ((PostDataUseCase) RespRateKoinScopeKt.getRespRateKoinScope().get(Reflection.getOrCreateKotlinClass(PostDataUseCase.class), null, null)).execute();
    }
}
