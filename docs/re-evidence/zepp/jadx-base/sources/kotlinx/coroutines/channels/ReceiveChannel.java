package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectInstance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0003\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH¦\u0002J\u001a\u0010\u0011\u001a\u00020\u00102\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eH&J\b\u0010\u0011\u001a\u00020\u0010H\u0017J\u0014\u0010\u0011\u001a\u00020\u00132\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0012H'J\u0011\u0010\u0014\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0004\b\u0014\u0010\tJ\u0015\u0010\u0015\u001a\u0004\u0018\u00018\u0000H\u0097@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0004R\u001c\u0010\u0016\u001a\u00020\u00138&@'X§\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\u00020\u00138&@'X§\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017R\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR%\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u001c8&@&X¦\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b \u0010\u001eR$\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001c8V@\u0017X\u0097\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0019\u001a\u0004\b\"\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Lkotlinx/coroutines/channels/ReceiveChannel;", "E", "", "receive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelResult;", "receiveCatching-JP2dKIU", "receiveCatching", "tryReceive-PtdJZtk", "()Ljava/lang/Object;", "tryReceive", "Lkotlinx/coroutines/channels/ChannelIterator;", "iterator", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", com.twitter.sdk.android.tweetcomposer.g.g, "", "", "poll", "receiveOrNull", "isClosedForReceive", "()Z", "isClosedForReceive$annotations", "()V", "isEmpty", "isEmpty$annotations", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceive", "getOnReceiveCatching", "onReceiveCatching", "getOnReceiveOrNull", "getOnReceiveOrNull$annotations", "onReceiveOrNull", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
public interface ReceiveChannel<E> {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", f = "Channel.kt", i = {}, l = {355}, m = "receiveOrNull", n = {}, s = {})
        public static final class a<E> extends ContinuationImpl {
            public /* synthetic */ Object a;
            public int b;

            public a(Continuation<? super a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return DefaultImpls.receiveOrNull(null, this);
            }
        }

        public static /* synthetic */ void cancel$default(ReceiveChannel receiveChannel, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            receiveChannel.cancel(cancellationException);
        }

        @NotNull
        public static <E> SelectClause1<E> getOnReceiveOrNull(@NotNull final ReceiveChannel<? extends E> receiveChannel) {
            return new SelectClause1<E>() { // from class: kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1

                /* JADX INFO: Add missing generic type declarations: [R] */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001 \u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, d2 = {"R", "E", "Lkotlinx/coroutines/channels/ChannelResult;", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1", f = "Channel.kt", i = {}, l = {376}, m = "invokeSuspend", n = {}, s = {})
                public static final class a<R> extends SuspendLambda implements Function2<ChannelResult<? extends E>, Continuation<? super R>, Object> {
                    public int a;
                    public /* synthetic */ Object b;
                    public final /* synthetic */ Function2<E, Continuation<? super R>, Object> c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public a(Function2<? super E, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super a> continuation) {
                        super(2, continuation);
                        this.c = function2;
                    }

                    @Nullable
                    public final Object a(@NotNull Object obj, @Nullable Continuation<? super R> continuation) {
                        return ((a) create(ChannelResult.m4440boximpl(obj), continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        a aVar = new a(this.c, continuation);
                        aVar.b = obj;
                        return aVar;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return a(((ChannelResult) obj).getHolder(), (Continuation) obj2);
                    }

                    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1$a<R> for r3v1 'this'  java.lang.Object
                        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                        */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @org.jetbrains.annotations.Nullable
                    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
                        /*
                            r3 = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r1 = r3.a
                            r2 = 1
                            if (r1 == 0) goto L17
                            if (r1 != r2) goto Lf
                            kotlin.ResultKt.throwOnFailure(r4)
                            goto L37
                        Lf:
                            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r4.<init>(r0)
                            throw r4
                        L17:
                            kotlin.ResultKt.throwOnFailure(r4)
                            java.lang.Object r4 = r3.b
                            kotlinx.coroutines.channels.ChannelResult r4 = (kotlinx.coroutines.channels.ChannelResult) r4
                            java.lang.Object r4 = r4.getHolder()
                            java.lang.Throwable r1 = kotlinx.coroutines.channels.ChannelResult.m4444exceptionOrNullimpl(r4)
                            if (r1 != 0) goto L38
                            kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r1 = r3.c
                            java.lang.Object r4 = kotlinx.coroutines.channels.ChannelResult.m4445getOrNullimpl(r4)
                            r3.a = r2
                            java.lang.Object r4 = r1.invoke(r4, r3)
                            if (r4 != r0) goto L37
                            return r0
                        L37:
                            return r4
                        L38:
                            throw r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1.a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.selects.SelectClause1
                @InternalCoroutinesApi
                public <R> void registerSelectClause1(@NotNull SelectInstance<? super R> select, @NotNull Function2<? super E, ? super Continuation<? super R>, ? extends Object> block) {
                    receiveChannel.getOnReceiveCatching().registerSelectClause1(select, new a(block, null));
                }
            };
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of onReceiveCatching extension", replaceWith = @ReplaceWith(expression = "onReceiveCatching", imports = {}))
        public static /* synthetic */ void getOnReceiveOrNull$annotations() {
        }

        @ExperimentalCoroutinesApi
        public static /* synthetic */ void isClosedForReceive$annotations() {
        }

        @ExperimentalCoroutinesApi
        public static /* synthetic */ void isEmpty$annotations() {
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
        @Nullable
        public static <E> E poll(@NotNull ReceiveChannel<? extends E> receiveChannel) throws Throwable {
            Object objMo4434tryReceivePtdJZtk = receiveChannel.mo4434tryReceivePtdJZtk();
            if (ChannelResult.m4450isSuccessimpl(objMo4434tryReceivePtdJZtk)) {
                return (E) ChannelResult.m4446getOrThrowimpl(objMo4434tryReceivePtdJZtk);
            }
            Throwable thM4444exceptionOrNullimpl = ChannelResult.m4444exceptionOrNullimpl(objMo4434tryReceivePtdJZtk);
            if (thM4444exceptionOrNullimpl == null) {
                return null;
            }
            throw StackTraceRecoveryKt.recoverStackTrace(thM4444exceptionOrNullimpl);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
        @LowPriorityInOverloadResolution
        @Nullable
        public static <E> Object receiveOrNull(@NotNull ReceiveChannel<? extends E> receiveChannel, @NotNull Continuation<? super E> continuation) {
            a aVar;
            Object objMo4433receiveCatchingJP2dKIU;
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(continuation);
                }
            } else {
                aVar = new a(continuation);
            }
            Object obj = aVar.a;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i2 = aVar.b;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                aVar.b = 1;
                objMo4433receiveCatchingJP2dKIU = receiveChannel.mo4433receiveCatchingJP2dKIU(aVar);
                if (objMo4433receiveCatchingJP2dKIU == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo4433receiveCatchingJP2dKIU = ((ChannelResult) obj).getHolder();
            }
            return ChannelResult.m4445getOrNullimpl(objMo4433receiveCatchingJP2dKIU);
        }

        public static /* synthetic */ boolean cancel$default(ReceiveChannel receiveChannel, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return receiveChannel.cancel(th);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    void cancel(@Nullable CancellationException cause);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean cancel(Throwable cause);

    @NotNull
    SelectClause1<E> getOnReceive();

    @NotNull
    SelectClause1<ChannelResult<E>> getOnReceiveCatching();

    @NotNull
    SelectClause1<E> getOnReceiveOrNull();

    boolean isClosedForReceive();

    boolean isEmpty();

    @NotNull
    ChannelIterator<E> iterator();

    @Deprecated(level = DeprecationLevel.WARNING, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    @Nullable
    E poll();

    @Nullable
    Object receive(@NotNull Continuation<? super E> continuation);

    @Nullable
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU */
    Object mo4433receiveCatchingJP2dKIU(@NotNull Continuation<? super ChannelResult<? extends E>> continuation);

    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @LowPriorityInOverloadResolution
    @Nullable
    Object receiveOrNull(@NotNull Continuation<? super E> continuation);

    @NotNull
    /* JADX INFO: renamed from: tryReceive-PtdJZtk */
    Object mo4434tryReceivePtdJZtk();
}
