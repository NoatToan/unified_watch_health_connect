package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002BE\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\u0004\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0019\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u000f\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R:\u0010\u0004\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tX\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/flow/SubscribedFlowCollector;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "action", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "emit", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSubscription", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class zkd<T> implements FlowCollector<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FlowCollector<T> f54224c;
    private final Function2<FlowCollector<? super T>, Continuation<? super yzc>, Object> d;

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (((defpackage.zkd) r7).e(r0) == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Continuation<? super yzc> continuation) throws Throwable {
        b bVar;
        zkt zktVar;
        zkd<T> zkdVar;
        FlowCollector<T> flowCollector;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            if ((bVar.f54225a & Integer.MIN_VALUE) != 0) {
                bVar.f54225a -= Integer.MIN_VALUE;
            } else {
                bVar = new b(this, continuation);
            }
        } else {
            bVar = new b(this, continuation);
        }
        Object obj = bVar.f54226b;
        Object objA = zbg.a();
        int i = bVar.f54225a;
        if (i == 0) {
            createFailure.c(obj);
            zkt zktVar2 = new zkt(this.f54224c, bVar.getD());
            try {
                Function2<FlowCollector<? super T>, Continuation<? super yzc>, Object> function2 = this.d;
                bVar.f54227c = this;
                bVar.e = zktVar2;
                bVar.f54225a = 1;
                if (function2.invoke(zktVar2, bVar) != objA) {
                    zkdVar = this;
                    zktVar = zktVar2;
                    zktVar.releaseIntercepted();
                    flowCollector = zkdVar.f54224c;
                    if (flowCollector instanceof zkd) {
                        return yzc.e;
                    }
                    bVar.f54227c = null;
                    bVar.e = null;
                    bVar.f54225a = 2;
                }
                return objA;
            } catch (Throwable th) {
                th = th;
                zktVar = zktVar2;
                zktVar.releaseIntercepted();
                throw th;
            }
        }
        if (i == 1) {
            zktVar = (zkt) bVar.e;
            zkdVar = (zkd) bVar.f54227c;
            try {
                createFailure.c(obj);
                zktVar.releaseIntercepted();
                flowCollector = zkdVar.f54224c;
                if (flowCollector instanceof zkd) {
                    return yzc.e;
                }
                bVar.f54227c = null;
                bVar.e = null;
                bVar.f54225a = 2;
            } catch (Throwable th2) {
                th = th2;
                zktVar.releaseIntercepted();
                throw th;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            createFailure.c(obj);
        }
        return yzc.e;
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", i = {0, 0}, l = {419, 423}, m = "onSubscription", n = {"this", "safeCollector"}, s = {"L$0", "L$1"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f54225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f54226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f54227c;
        final /* synthetic */ zkd<T> d;
        Object e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f54226b = obj;
            this.f54225a |= Integer.MIN_VALUE;
            return this.d.e(this);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(zkd<T> zkdVar, Continuation<? super b> continuation) {
            super(continuation);
            this.d = zkdVar;
        }
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, Continuation<? super yzc> continuation) {
        return this.f54224c.emit(t, continuation);
    }
}
