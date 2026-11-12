package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: zjp, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a/\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a9\u0010\u000b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a$\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"asFlow", "Lkotlinx/coroutines/flow/Flow;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/channels/BroadcastChannel;", "consumeAsFlow", "Lkotlinx/coroutines/channels/ReceiveChannel;", "emitAll", "", "Lkotlinx/coroutines/flow/FlowCollector;", "channel", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitAllImpl", "consume", "", "emitAllImpl$FlowKt__ChannelsKt", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "produceIn", "scope", "Lkotlinx/coroutines/CoroutineScope;", "receiveAsFlow", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class asFlow {
    public static final <T> Object e(FlowCollector<? super T> flowCollector, ReceiveChannel<? extends T> receiveChannel, Continuation<? super yzc> continuation) throws Throwable {
        Object objE = e(flowCollector, receiveChannel, true, continuation);
        return objE == zbg.a() ? objE : yzc.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:28:0x007e A[Catch: all -> 0x009c, TRY_LEAVE, TryCatch #0 {all -> 0x009c, blocks: (B:13:0x0037, B:22:0x0061, B:26:0x0076, B:28:0x007e, B:18:0x0053, B:21:0x005d), top: B:41:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L30;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0090 -> B:14:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object e(FlowCollector<? super T> flowCollector, ReceiveChannel<? extends T> receiveChannel, boolean z, Continuation<? super yzc> continuation) throws Throwable {
        e eVar;
        ChannelIterator<? extends T> it;
        ChannelIterator<? extends T> channelIterator;
        FlowCollector<? super T> flowCollector2;
        Object objHasNext;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            if ((eVar.f54195b & Integer.MIN_VALUE) != 0) {
                eVar.f54195b -= Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.f;
        Object objA = zbg.a();
        int i = eVar.f54195b;
        try {
            if (i == 0) {
                createFailure.c(obj);
                zjn.b(flowCollector);
                it = receiveChannel.iterator();
                eVar.f54194a = flowCollector;
                eVar.f54196c = receiveChannel;
                eVar.d = it;
                eVar.e = z;
                eVar.f54195b = 1;
                objHasNext = it.hasNext(eVar);
                if (objHasNext == objA) {
                    flowCollector2 = flowCollector;
                    channelIterator = it;
                    obj = objHasNext;
                    if (((Boolean) obj).booleanValue()) {
                        T next = channelIterator.next();
                        eVar.f54194a = flowCollector2;
                        eVar.f54196c = receiveChannel;
                        eVar.d = channelIterator;
                        eVar.e = z;
                        eVar.f54195b = 2;
                    } else {
                        if (z) {
                            zjf.c(receiveChannel, null);
                        }
                        return yzc.e;
                    }
                }
                return objA;
            }
            if (i == 1) {
                z = eVar.e;
                channelIterator = (ChannelIterator) eVar.d;
                receiveChannel = (ReceiveChannel) eVar.f54196c;
                flowCollector2 = (FlowCollector) eVar.f54194a;
                createFailure.c(obj);
                if (((Boolean) obj).booleanValue()) {
                    T next2 = channelIterator.next();
                    eVar.f54194a = flowCollector2;
                    eVar.f54196c = receiveChannel;
                    eVar.d = channelIterator;
                    eVar.e = z;
                    eVar.f54195b = 2;
                } else {
                    if (z) {
                        zjf.c(receiveChannel, null);
                    }
                    return yzc.e;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = eVar.e;
                channelIterator = (ChannelIterator) eVar.d;
                receiveChannel = (ReceiveChannel) eVar.f54196c;
                flowCollector2 = (FlowCollector) eVar.f54194a;
                createFailure.c(obj);
            }
            it = channelIterator;
            flowCollector = flowCollector2;
            eVar.f54194a = flowCollector;
            eVar.f54196c = receiveChannel;
            eVar.d = it;
            eVar.e = z;
            eVar.f54195b = 1;
            objHasNext = it.hasNext(eVar);
            if (objHasNext == objA) {
                flowCollector2 = flowCollector;
                channelIterator = it;
                obj = objHasNext;
                if (((Boolean) obj).booleanValue()) {
                    T next3 = channelIterator.next();
                    eVar.f54194a = flowCollector2;
                    eVar.f54196c = receiveChannel;
                    eVar.d = channelIterator;
                    eVar.e = z;
                    eVar.f54195b = 2;
                } else {
                    if (z) {
                        zjf.c(receiveChannel, null);
                    }
                    return yzc.e;
                }
            }
            return objA;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z) {
                    zjf.c(receiveChannel, th);
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: zjp$e */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", i = {0, 0, 0, 1, 1, 1}, l = {36, 37}, m = "emitAllImpl$FlowKt__ChannelsKt", n = {"$this$emitAllImpl", "channel", "consume", "$this$emitAllImpl", "channel", "consume"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
    static final class e<T> extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f54194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f54195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f54196c;
        Object d;
        boolean e;
        /* synthetic */ Object f;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.f54195b |= Integer.MIN_VALUE;
            return asFlow.e(null, null, false, this);
        }

        e(Continuation<? super e> continuation) {
            super(continuation);
        }
    }
}
