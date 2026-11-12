package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\b0\nX\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/flow/internal/UndispatchedContextCollector;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "downstream", "emitContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;)V", "countOrElement", "", "emitRef", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/jvm/functions/Function2;", "emit", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class zkx<T> implements FlowCollector<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f54252a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoroutineContext f54253c;
    private final Function2<T, Continuation<? super yzc>, Object> e;

    public zkx(FlowCollector<? super T> flowCollector, CoroutineContext coroutineContext) {
        this.f54253c = coroutineContext;
        this.f54252a = NO_THREAD_ELEMENTS.c(coroutineContext);
        this.e = new a(flowCollector, null);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", i = {}, l = {com.huawei.hms.kit.awareness.barrier.internal.e.a.K}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements Function2<T, Continuation<? super yzc>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ FlowCollector<T> f54254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f54255b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f54256c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA = zbg.a();
            int i = this.f54256c;
            if (i == 0) {
                createFailure.c(obj);
                Object obj2 = this.f54255b;
                FlowCollector<T> flowCollector = this.f54254a;
                this.f54256c = 1;
                if (flowCollector.emit((T) obj2, this) == objA) {
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
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T t, Continuation<? super yzc> continuation) {
            return ((a) create(t, continuation)).invokeSuspend(yzc.e);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<yzc> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f54254a, continuation);
            aVar.f54255b = obj;
            return aVar;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(FlowCollector<? super T> flowCollector, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f54254a = flowCollector;
        }
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, Continuation<? super yzc> continuation) {
        Object objB = withContextUndispatched.b(this.f54253c, t, this.f54252a, this.e, continuation);
        return objB == zbg.a() ? objB : yzc.e;
    }
}
