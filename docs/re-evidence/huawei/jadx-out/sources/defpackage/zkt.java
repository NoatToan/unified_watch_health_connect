package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Opers;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u00032\u00020\u0004B\u001b\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ'\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ%\u0010\u001a\u001a\u0004\u0018\u00010\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!2\b\u0010\u0018\u001a\u0004\u0018\u00010\u001cH\u0002J\n\u0010\"\u001a\u0004\u0018\u00010#H\u0016J \u0010$\u001a\u00020\u001c2\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0&H\u0016ø\u0001\u0000¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u0010H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u0006\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "collector", "collectContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "collectContextSize", "", "completion", "Lkotlin/coroutines/Continuation;", "", ParamConstants.Param.CONTEXT, "getContext", "()Lkotlin/coroutines/CoroutineContext;", "lastEmissionContext", "checkContext", "currentContext", "previousContext", "value", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "uCont", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)Ljava/lang/Object;", "exceptionTransparencyViolated", TrackConstants$Events.EXCEPTION, "Lkotlinx/coroutines/flow/internal/DownstreamExceptionContext;", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "invokeSuspend", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class zkt<T> extends ContinuationImpl implements FlowCollector<T>, CoroutineStackFrame {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CoroutineContext f54248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Continuation<? super yzc> f54249c;
    public final FlowCollector<T> d;
    public final CoroutineContext e;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zkt(FlowCollector<? super T> flowCollector, CoroutineContext coroutineContext) {
        super(zko.d, zbf.f53962b);
        this.d = flowCollector;
        this.e = coroutineContext;
        this.f54247a = ((Number) coroutineContext.fold(0, a.d)).intValue();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation<? super yzc> continuation = this.f54249c;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "count", "<anonymous parameter 1>", "Lkotlin/coroutines/CoroutineContext$Element;", TrackConstants$Opers.INVOKE, "(ILkotlin/coroutines/CoroutineContext$Element;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends Lambda implements Function2<Integer, CoroutineContext.Element, Integer> {
        public static final a d = new a();

        public final Integer c(int i, CoroutineContext.Element element) {
            return Integer.valueOf(i + 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Integer invoke(Integer num, CoroutineContext.Element element) {
            return c(num.intValue(), element);
        }

        a() {
            super(2);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext */
    public CoroutineContext getD() {
        CoroutineContext coroutineContext = this.f54248b;
        return coroutineContext == null ? zbf.f53962b : coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public Object invokeSuspend(Object result) {
        Throwable thA = yyt.a(result);
        if (thA != null) {
            this.f54248b = new zkk(thA, getD());
        }
        Continuation<? super yzc> continuation = this.f54249c;
        if (continuation != null) {
            continuation.resumeWith(result);
        }
        return zbg.a();
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, Continuation<? super yzc> continuation) {
        try {
            Object objC = c(continuation, t);
            if (objC == zbg.a()) {
                probeCoroutineCreated.e(continuation);
            }
            return objC == zbg.a() ? objC : yzc.e;
        } catch (Throwable th) {
            this.f54248b = new zkk(th, continuation.getD());
            throw th;
        }
    }

    private final Object c(Continuation<? super yzc> continuation, T t) {
        CoroutineContext d = continuation.getD();
        zhs.e(d);
        CoroutineContext coroutineContext = this.f54248b;
        if (coroutineContext != d) {
            b(d, coroutineContext, t);
            this.f54248b = d;
        }
        this.f54249c = continuation;
        Function3 function3 = emitFun.d;
        FlowCollector<T> flowCollector = this.d;
        zcp.e(flowCollector, "");
        zcp.e(this, "");
        Object objInvoke = function3.invoke(flowCollector, t, this);
        if (!zcp.b(objInvoke, zbg.a())) {
            this.f54249c = null;
        }
        return objInvoke;
    }

    private final void b(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, T t) {
        if (coroutineContext2 instanceof zkk) {
            d((zkk) coroutineContext2, t);
        }
        unsafeFlow.c(this, coroutineContext);
    }

    private final void d(zkk zkkVar, Object obj) {
        throw new IllegalStateException(zes.d("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + zkkVar.f54231a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }
}
