package androidx.paging.multicast;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@DebugMetadata(c = "androidx.paging.multicast.Multicaster$flow$1$subFlow$3", f = "Multicaster.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
public final class Multicaster$flow$1$subFlow$3<T> extends SuspendLambda implements Function3<FlowCollector<? super T>, Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ Channel $channel;
    int label;
    final /* synthetic */ Multicaster$flow$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Multicaster$flow$1$subFlow$3(Multicaster$flow$1 multicaster$flow$1, Channel channel, Continuation continuation) {
        super(3, continuation);
        this.this$0 = multicaster$flow$1;
        this.$channel = channel;
    }

    @NotNull
    public final Continuation<Unit> create(@NotNull FlowCollector<? super T> create, @Nullable Throwable th, @NotNull Continuation<? super Unit> continuation) {
        Intrinsics.checkNotNullParameter(create, "$this$create");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return new Multicaster$flow$1$subFlow$3(this.this$0, this.$channel, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Throwable th, Continuation<? super Unit> continuation) {
        return ((Multicaster$flow$1$subFlow$3) create((FlowCollector) obj, th, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ChannelManager channelManager = this.this$0.this$0.getChannelManager();
            Channel channel = this.$channel;
            this.label = 1;
            if (channelManager.removeDownstream(channel, this) == coroutine_suspended) {
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
