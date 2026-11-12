package androidx.paging.multicast;

import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BH\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012(\u0010\u0007\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0006\u0010\u0010\u001a\u00020\u000bJ\u0011\u0010\u0011\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u000bR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R5\u0010\u0007\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bX\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/paging/multicast/SharedFlowProducer;", "T", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "src", "Lkotlinx/coroutines/flow/Flow;", "sendUpsteamMessage", "Lkotlin/Function2;", "Landroidx/paging/multicast/ChannelManager$Message$Dispatch;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)V", "collectionJob", "Lkotlinx/coroutines/Job;", "Lkotlin/jvm/functions/Function2;", BroadcastsKt.SILENT_PUSHING_CANCEL, "cancelAndJoin", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", StatConstants.PARAM_START, "paging-common"}, k = 1, mv = {1, 4, 2})
public final class SharedFlowProducer<T> {
    private final Job collectionJob;
    private final CoroutineScope scope;
    private final Function2<ChannelManager.Message.Dispatch<T>, Continuation<? super Unit>, Object> sendUpsteamMessage;
    private final Flow<T> src;

    /* JADX INFO: renamed from: androidx.paging.multicast.SharedFlowProducer$start$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "androidx.paging.multicast.SharedFlowProducer$start$1", f = "SharedFlowProducer.kt", i = {}, l = {75, 80, 80}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            return new AnonymousClass1(completion);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v2, types: [androidx.paging.multicast.SharedFlowProducer] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            int i2 = 3;
            try {
                try {
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Throwable th = (Throwable) this.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    throw th;
                                } catch (ClosedSendChannelException unused) {
                                    throw th;
                                }
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    Job job = SharedFlowProducer.this.collectionJob;
                    this.label = 1;
                    if (job.join(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Function2 function2 = SharedFlowProducer.this.sendUpsteamMessage;
                    i2 = SharedFlowProducer.this;
                    ChannelManager.Message.Dispatch.UpstreamFinished upstreamFinished = new ChannelManager.Message.Dispatch.UpstreamFinished(i2);
                    this.label = 2;
                    if (function2.invoke(upstreamFinished, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (ClosedSendChannelException unused2) {
                }
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                try {
                    Function2 function3 = SharedFlowProducer.this.sendUpsteamMessage;
                    ChannelManager.Message.Dispatch.UpstreamFinished upstreamFinished2 = new ChannelManager.Message.Dispatch.UpstreamFinished(SharedFlowProducer.this);
                    this.L$0 = th2;
                    this.label = i2;
                    if (function3.invoke(upstreamFinished2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (ClosedSendChannelException unused3) {
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SharedFlowProducer(@NotNull CoroutineScope scope, @NotNull Flow<? extends T> src, @NotNull Function2<? super ChannelManager.Message.Dispatch<T>, ? super Continuation<? super Unit>, ? extends Object> sendUpsteamMessage) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(sendUpsteamMessage, "sendUpsteamMessage");
        this.scope = scope;
        this.src = src;
        this.sendUpsteamMessage = sendUpsteamMessage;
        this.collectionJob = BuildersKt__Builders_commonKt.launch$default(scope, null, CoroutineStart.LAZY, new SharedFlowProducer$collectionJob$1(this, null), 1, null);
    }

    public final void cancel() {
        Job.DefaultImpls.cancel$default(this.collectionJob, (CancellationException) null, 1, (Object) null);
    }

    @Nullable
    public final Object cancelAndJoin(@NotNull Continuation<? super Unit> continuation) {
        Object objCancelAndJoin = JobKt.cancelAndJoin(this.collectionJob, continuation);
        return objCancelAndJoin == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCancelAndJoin : Unit.INSTANCE;
    }

    public final void start() {
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AnonymousClass1(null), 3, null);
    }
}
