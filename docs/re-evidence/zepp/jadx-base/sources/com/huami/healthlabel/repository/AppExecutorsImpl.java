package com.huami.healthlabel.repository;

import com.huami.healthlabel.repository.AppExecutorsImpl;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/huami/healthlabel/repository/AppExecutorsImpl;", "Lcom/huami/healthlabel/repository/AppExecutors;", "Ljava/util/concurrent/Executor;", "diskIO", "networkIO", "Lcom/huami/healthlabel/repository/HandlerExceptionScope;", "a", "Lcom/huami/healthlabel/repository/HandlerExceptionScope;", "scope", "<init>", "()V", "healthLabel_release"}, k = 1, mv = {1, 5, 1})
public final class AppExecutorsImpl implements AppExecutors {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HandlerExceptionScope scope = new HandlerExceptionScope();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.healthlabel.repository.AppExecutorsImpl$diskIO$1$1", f = "AppExecutors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Runnable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Runnable runnable, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = runnable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, continuation);
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
            this.b.run();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.healthlabel.repository.AppExecutorsImpl$networkIO$1$1", f = "AppExecutors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Runnable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Runnable runnable, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = runnable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.b.run();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(AppExecutorsImpl appExecutorsImpl, Runnable runnable) {
        e.f(appExecutorsImpl.scope, null, null, new a(runnable, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AppExecutorsImpl appExecutorsImpl, Runnable runnable) {
        e.f(appExecutorsImpl.scope, null, null, new b(runnable, null), 3, null);
    }

    @Override // com.huami.healthlabel.repository.AppExecutors
    @NotNull
    public Executor diskIO() {
        return new Executor() { // from class: ng
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                AppExecutorsImpl.c(this.a, runnable);
            }
        };
    }

    @Override // com.huami.healthlabel.repository.AppExecutors
    @NotNull
    public Executor mainThread() {
        return AppExecutors.DefaultImpls.mainThread(this);
    }

    @Override // com.huami.healthlabel.repository.AppExecutors
    @NotNull
    public Executor networkIO() {
        return new Executor() { // from class: og
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                AppExecutorsImpl.d(this.a, runnable);
            }
        };
    }
}
