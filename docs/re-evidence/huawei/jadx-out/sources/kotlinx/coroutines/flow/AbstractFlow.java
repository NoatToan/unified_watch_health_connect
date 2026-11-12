package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import defpackage.createFailure;
import defpackage.yzc;
import defpackage.zbg;
import defpackage.zkt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/flow/AbstractFlow;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "()V", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectSafely", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AbstractFlow<T> implements Flow<T>, CancellableFlow<T> {
    public abstract Object collectSafely(FlowCollector<? super T> flowCollector, Continuation<? super yzc> continuation);

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super T> flowCollector, Continuation<? super yzc> continuation) throws Throwable {
        a aVar;
        Throwable th;
        zkt zktVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            if ((aVar.f39350b & Integer.MIN_VALUE) != 0) {
                aVar.f39350b -= Integer.MIN_VALUE;
            } else {
                aVar = new a(this, continuation);
            }
        } else {
            aVar = new a(this, continuation);
        }
        Object obj = aVar.f39349a;
        Object objA = zbg.a();
        int i = aVar.f39350b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zktVar = (zkt) aVar.f39351c;
            try {
                createFailure.c(obj);
                zktVar.releaseIntercepted();
                return yzc.e;
            } catch (Throwable th2) {
                th = th2;
                zktVar.releaseIntercepted();
                throw th;
            }
        }
        createFailure.c(obj);
        zkt zktVar2 = new zkt(flowCollector, aVar.getD());
        try {
            aVar.f39351c = zktVar2;
            aVar.f39350b = 1;
            if (collectSafely(zktVar2, aVar) == objA) {
                return objA;
            }
            zktVar = zktVar2;
            zktVar.releaseIntercepted();
            return yzc.e;
        } catch (Throwable th3) {
            th = th3;
            zktVar = zktVar2;
            zktVar.releaseIntercepted();
            throw th;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", i = {0}, l = {230}, m = "collect", n = {"safeCollector"}, s = {"L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f39349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f39350b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f39351c;
        final /* synthetic */ AbstractFlow<T> e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f39349a = obj;
            this.f39350b |= Integer.MIN_VALUE;
            return this.e.collect(null, this);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractFlow<T> abstractFlow, Continuation<? super a> continuation) {
            super(continuation);
            this.e = abstractFlow;
        }
    }
}
