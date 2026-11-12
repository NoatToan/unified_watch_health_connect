package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.openalliance.ad.constant.ParamConstants;
import defpackage.DEBUG_THREAD_NAME_SEPARATOR;
import defpackage.createFailure;
import defpackage.withContextUndispatched;
import defpackage.yzc;
import defpackage.zbg;
import defpackage.zcp;
import defpackage.zkv;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0094@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J'\u0010\u0016\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H¤@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0085\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "flow", "Lkotlinx/coroutines/flow/Flow;", ParamConstants.Param.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectTo", "scope", "Lkotlinx/coroutines/channels/ProducerScope;", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectWithContextUndispatched", "newContext", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flowCollect", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ChannelFlowOperator<S, T> extends ChannelFlow<T> {
    protected final Flow<S> flow;

    protected abstract Object flowCollect(FlowCollector<? super T> flowCollector, Continuation<? super yzc> continuation);

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowOperator(Flow<? extends S> flow, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.flow = flow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object collectWithContextUndispatched(FlowCollector<? super T> flowCollector, CoroutineContext coroutineContext, Continuation<? super yzc> continuation) {
        Object objA = withContextUndispatched.a(coroutineContext, withContextUndispatched.a(flowCollector, continuation.getF54257c()), null, new b(this, null), continuation, 4, null);
        return objA == zbg.a() ? objA : yzc.e;
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u008a@"}, d2 = {"<anonymous>", "", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "it", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super yzc>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ChannelFlowOperator<S, T> f39357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f39358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f39359c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA = zbg.a();
            int i = this.f39358b;
            if (i == 0) {
                createFailure.c(obj);
                FlowCollector<? super T> flowCollector = (FlowCollector) this.f39359c;
                this.f39358b = 1;
                if (this.f39357a.flowCollect(flowCollector, this) == objA) {
                    return objA;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                createFailure.c(obj);
            }
            return yzc.e;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super yzc> continuation) {
            return ((b) create(flowCollector, continuation)).invokeSuspend(yzc.e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<yzc> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f39357a, continuation);
            bVar.f39359c = obj;
            return bVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ChannelFlowOperator<S, T> channelFlowOperator, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f39357a = channelFlowOperator;
        }
    }

    static /* synthetic */ <S, T> Object collectTo$suspendImpl(ChannelFlowOperator<S, T> channelFlowOperator, ProducerScope<? super T> producerScope, Continuation<? super yzc> continuation) {
        Object objFlowCollect = channelFlowOperator.flowCollect(new zkv(producerScope), continuation);
        return objFlowCollect == zbg.a() ? objFlowCollect : yzc.e;
    }

    static /* synthetic */ <S, T> Object collect$suspendImpl(ChannelFlowOperator<S, T> channelFlowOperator, FlowCollector<? super T> flowCollector, Continuation<? super yzc> continuation) {
        if (channelFlowOperator.capacity == -3) {
            CoroutineContext context = continuation.getF54257c();
            CoroutineContext coroutineContextE = DEBUG_THREAD_NAME_SEPARATOR.e(context, channelFlowOperator.context);
            if (zcp.b(coroutineContextE, context)) {
                Object objFlowCollect = channelFlowOperator.flowCollect(flowCollector, continuation);
                return objFlowCollect == zbg.a() ? objFlowCollect : yzc.e;
            }
            if (zcp.b(coroutineContextE.get(ContinuationInterceptor.INSTANCE), context.get(ContinuationInterceptor.INSTANCE))) {
                Object objCollectWithContextUndispatched = channelFlowOperator.collectWithContextUndispatched(flowCollector, coroutineContextE, continuation);
                return objCollectWithContextUndispatched == zbg.a() ? objCollectWithContextUndispatched : yzc.e;
            }
        }
        Object objCollect = super.collect(flowCollector, continuation);
        return objCollect == zbg.a() ? objCollect : yzc.e;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String toString() {
        return this.flow + " -> " + super.toString();
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected Object collectTo(ProducerScope<? super T> producerScope, Continuation<? super yzc> continuation) {
        return collectTo$suspendImpl(this, producerScope, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<? super yzc> continuation) {
        return collect$suspendImpl((ChannelFlowOperator) this, (FlowCollector) flowCollector, continuation);
    }
}
