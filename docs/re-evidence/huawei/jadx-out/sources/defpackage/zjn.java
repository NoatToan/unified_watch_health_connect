package defpackage;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"kotlinx/coroutines/flow/FlowKt__BuildersKt", "kotlinx/coroutines/flow/FlowKt__ChannelsKt", "kotlinx/coroutines/flow/FlowKt__CollectKt", "kotlinx/coroutines/flow/FlowKt__CollectionKt", "kotlinx/coroutines/flow/FlowKt__ContextKt", "kotlinx/coroutines/flow/FlowKt__CountKt", "kotlinx/coroutines/flow/FlowKt__DelayKt", "kotlinx/coroutines/flow/FlowKt__DistinctKt", "kotlinx/coroutines/flow/FlowKt__EmittersKt", "kotlinx/coroutines/flow/FlowKt__ErrorsKt", "kotlinx/coroutines/flow/FlowKt__LimitKt", "kotlinx/coroutines/flow/FlowKt__MergeKt", "kotlinx/coroutines/flow/FlowKt__MigrationKt", "kotlinx/coroutines/flow/FlowKt__ReduceKt", "kotlinx/coroutines/flow/FlowKt__ShareKt", "kotlinx/coroutines/flow/FlowKt__TransformKt", "kotlinx/coroutines/flow/FlowKt__ZipKt"}, k = 4, mv = {1, 8, 0}, xi = 48)
public final class zjn {
    public static final <T> StateFlow<T> a(MutableStateFlow<T> mutableStateFlow) {
        return asSharedFlow.d(mutableStateFlow);
    }

    public static final <T> Flow<T> b(Function2<? super ProducerScope<? super T>, ? super Continuation<? super yzc>, ? extends Object> function2) {
        return callbackFlow.d(function2);
    }

    public static final void b(FlowCollector<?> flowCollector) throws Throwable {
        ensureActive.b(flowCollector);
    }

    public static final <T> Flow<T> c(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        return checkFlowContext.d(flow, coroutineContext);
    }

    public static final <T> Object d(FlowCollector<? super T> flowCollector, ReceiveChannel<? extends T> receiveChannel, Continuation<? super yzc> continuation) {
        return asFlow.e(flowCollector, receiveChannel, continuation);
    }

    public static final <T> Flow<T> d(T t) {
        return callbackFlow.c(t);
    }

    public static final <T> Flow<T> d(Flow<? extends T> flow) {
        return defaultAreEquivalent.b(flow);
    }

    public static final <T> Flow<T> e(Function2<? super FlowCollector<? super T>, ? super Continuation<? super yzc>, ? extends Object> function2) {
        return callbackFlow.e(function2);
    }
}
