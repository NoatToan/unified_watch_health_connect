package kotlinx.coroutines.flow.internal;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.openalliance.ad.constant.ParamConstants;
import defpackage.ASSERTIONS_ENABLED;
import defpackage.awaitClose;
import defpackage.classSimpleName;
import defpackage.createFailure;
import defpackage.isActive;
import defpackage.yzc;
import defpackage.yzp;
import defpackage.zbf;
import defpackage.zbg;
import defpackage.zcp;
import defpackage.zjn;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u001f\u0010\u0017\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\fH¤@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH$J\u0010\u0010\u001f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010 H\u0016J&\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\u001c\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0016H\u0016R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R9\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlow;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/internal/FusibleFlow;", ParamConstants.Param.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "collectToFun", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/Continuation;", "", "", "getCollectToFun$kotlinx_coroutines_core", "()Lkotlin/jvm/functions/Function2;", "produceCapacity", "getProduceCapacity$kotlinx_coroutines_core", "()I", "additionalToStringProps", "", "collect", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectTo", "scope", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "create", "dropChannelOperators", "Lkotlinx/coroutines/flow/Flow;", "fuse", "produceImpl", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/CoroutineScope;", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ChannelFlow<T> implements FusibleFlow<T> {
    public final int capacity;
    public final CoroutineContext context;
    public final BufferOverflow onBufferOverflow;

    protected String additionalToStringProps() {
        return null;
    }

    protected abstract Object collectTo(ProducerScope<? super T> producerScope, Continuation<? super yzc> continuation);

    protected abstract ChannelFlow<T> create(CoroutineContext context, int capacity, BufferOverflow onBufferOverflow);

    public Flow<T> dropChannelOperators() {
        return null;
    }

    public ChannelFlow(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        this.context = coroutineContext;
        this.capacity = i;
        this.onBufferOverflow = bufferOverflow;
        if (ASSERTIONS_ENABLED.a() && i == -1) {
            throw new AssertionError();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements Function2<ProducerScope<? super T>, Continuation<? super yzc>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f39355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ChannelFlow<T> f39356b;
        int d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA = zbg.a();
            int i = this.d;
            if (i == 0) {
                createFailure.c(obj);
                ProducerScope<? super T> producerScope = (ProducerScope) this.f39355a;
                this.d = 1;
                if (this.f39356b.collectTo(producerScope, this) == objA) {
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
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ProducerScope<? super T> producerScope, Continuation<? super yzc> continuation) {
            return ((e) create(producerScope, continuation)).invokeSuspend(yzc.e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<yzc> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(this.f39356b, continuation);
            eVar.f39355a = obj;
            return eVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ChannelFlow<T> channelFlow, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f39356b = channelFlow;
        }
    }

    public final Function2<ProducerScope<? super T>, Continuation<? super yzc>, Object> getCollectToFun$kotlinx_coroutines_core() {
        return new e(this, null);
    }

    public final int getProduceCapacity$kotlinx_coroutines_core() {
        int i = this.capacity;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0050 A[PHI: r4
      0x0050: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v8 int) binds: [B:15:0x0021, B:20:0x0028, B:36:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public Flow<T> fuse(CoroutineContext context, int capacity, BufferOverflow onBufferOverflow) {
        if (ASSERTIONS_ENABLED.a() && capacity == -1) {
            throw new AssertionError();
        }
        CoroutineContext coroutineContextPlus = context.plus(this.context);
        if (onBufferOverflow == BufferOverflow.SUSPEND) {
            int i = this.capacity;
            if (i != -3) {
                if (capacity == -3) {
                    capacity = i;
                } else if (i != -2) {
                    if (capacity == -2) {
                        capacity = i;
                    } else {
                        if (ASSERTIONS_ENABLED.a() && this.capacity < 0) {
                            throw new AssertionError();
                        }
                        if (ASSERTIONS_ENABLED.a() && capacity < 0) {
                            throw new AssertionError();
                        }
                        i = this.capacity + capacity;
                        if (i >= 0) {
                            capacity = i;
                        } else {
                            capacity = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            onBufferOverflow = this.onBufferOverflow;
        }
        if (zcp.b(coroutineContextPlus, this.context) && capacity == this.capacity && onBufferOverflow == this.onBufferOverflow) {
            return this;
        }
        return create(coroutineContextPlus, capacity, onBufferOverflow);
    }

    public ReceiveChannel<T> produceImpl(CoroutineScope scope) {
        return awaitClose.e(scope, this.context, getProduceCapacity$kotlinx_coroutines_core(), this.onBufferOverflow, CoroutineStart.ATOMIC, null, getCollectToFun$kotlinx_coroutines_core(), 16, null);
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super yzc>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FlowCollector<T> f39353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ChannelFlow<T> f39354b;
        int d;
        private /* synthetic */ Object e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA = zbg.a();
            int i = this.d;
            if (i == 0) {
                createFailure.c(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.e;
                this.d = 1;
                if (zjn.d(this.f39353a, this.f39354b.produceImpl(coroutineScope), this) == objA) {
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
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super yzc> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(yzc.e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<yzc> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.f39353a, this.f39354b, continuation);
            cVar.e = obj;
            return cVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(FlowCollector<? super T> flowCollector, ChannelFlow<T> channelFlow, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f39353a = flowCollector;
            this.f39354b = channelFlow;
        }
    }

    static /* synthetic */ <T> Object collect$suspendImpl(ChannelFlow<T> channelFlow, FlowCollector<? super T> flowCollector, Continuation<? super yzc> continuation) {
        Object objE = isActive.e(new c(flowCollector, channelFlow, null), continuation);
        return objE == zbg.a() ? objE : yzc.e;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strAdditionalToStringProps = additionalToStringProps();
        if (strAdditionalToStringProps != null) {
            arrayList.add(strAdditionalToStringProps);
        }
        if (this.context != zbf.f53962b) {
            arrayList.add("context=" + this.context);
        }
        if (this.capacity != -3) {
            arrayList.add("capacity=" + this.capacity);
        }
        if (this.onBufferOverflow != BufferOverflow.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.onBufferOverflow);
        }
        return classSimpleName.a(this) + '[' + yzp.c(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<? super yzc> continuation) {
        return collect$suspendImpl(this, flowCollector, continuation);
    }
}
