package androidx.paging;

import com.miui.tsmclient.util.Constants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.selects.SelectClause2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0007J\u001f\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0019H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u000f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0001J.\u0010\u001e\u001a\u00020\u00172#\u0010\u001f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u001d¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170 H\u0097\u0001J\u0016\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0002\u0010%J\u0019\u0010&\u001a\u00020\u00172\u0006\u0010$\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010'R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R$\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0013X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Landroidx/paging/SimpleProducerScopeImpl;", "T", "Landroidx/paging/SimpleProducerScope;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/channels/SendChannel;", "scope", "channel", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/channels/SendChannel;)V", "getChannel", "()Lkotlinx/coroutines/channels/SendChannel;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "isClosedForSend", "", "()Z", "isFull", "onSend", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "awaitClose", "", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Constants.EXTRA_CLOSE_TAI, "cause", "", "invokeOnClose", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "offer", "element", "(Ljava/lang/Object;)Z", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class SimpleProducerScopeImpl<T> implements SimpleProducerScope<T>, CoroutineScope, SendChannel<T> {
    private final /* synthetic */ CoroutineScope $$delegate_0;

    @NotNull
    private final SendChannel<T> channel;

    /* JADX INFO: renamed from: androidx.paging.SimpleProducerScopeImpl$awaitClose$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0096@"}, d2 = {"awaitClose", "", "T", "block", "Lkotlin/Function0;", "", "continuation", "Lkotlin/coroutines/Continuation;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.SimpleProducerScopeImpl", f = "SimpleChannelFlow.kt", i = {0}, l = {97}, m = "awaitClose", n = {"block"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SimpleProducerScopeImpl.this.awaitClose(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleProducerScopeImpl(@NotNull CoroutineScope scope, @NotNull SendChannel<? super T> channel) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.$$delegate_0 = scope;
        this.channel = channel;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.paging.SimpleProducerScope
    @Nullable
    public Object awaitClose(@NotNull Function0<Unit> function0, @NotNull Continuation<? super Unit> continuation) {
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
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineContext.Element element = getCoroutineContext().get(Job.INSTANCE);
                if (element == null) {
                    throw new IllegalStateException("Internal error, context should have a job.".toString());
                }
                Job job = (Job) element;
                anonymousClass1.L$0 = function0;
                anonymousClass1.L$1 = job;
                anonymousClass1.label = 1;
                final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(anonymousClass1), 1);
                cancellableContinuationImpl.initCancellability();
                job.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.paging.SimpleProducerScopeImpl$awaitClose$2$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Unit invoke2(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable Throwable th) {
                        cancellableContinuationImpl.resumeWith(Result.m886constructorimpl(Unit.INSTANCE));
                    }
                });
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(anonymousClass1);
                }
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function0 = (Function0) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            function0.invoke();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(@Nullable Throwable cause) {
        return this.channel.close(cause);
    }

    @Override // androidx.paging.SimpleProducerScope
    @NotNull
    public SendChannel<T> getChannel() {
        return this.channel;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @NotNull
    public SelectClause2<T, SendChannel<T>> getOnSend() {
        return this.channel.getOnSend();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @ExperimentalCoroutinesApi
    public void invokeOnClose(@NotNull Function1<? super Throwable, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.channel.invokeOnClose(handler);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return this.channel.isClosedForSend();
    }

    public boolean isFull() {
        return this.channel.isFull();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean offer(T element) {
        return this.channel.offer(element);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @Nullable
    public Object send(T t, @NotNull Continuation<? super Unit> continuation) {
        return this.channel.send(t, continuation);
    }
}
