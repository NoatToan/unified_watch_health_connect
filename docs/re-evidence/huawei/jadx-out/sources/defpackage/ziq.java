package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.openalliance.ad.constant.ParamConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0014J\u0006\u0010\u0011\u001a\u00020\tJ\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\rR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\r0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/UndispatchedCoroutine;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/internal/ScopeCoroutine;", ParamConstants.Param.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "uCont", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "threadLocalIsSet", "", "threadStateToRecover", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", "", "afterResume", "", "state", "clearThreadContext", "saveThreadContext", "oldValue", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ziq<T> extends zmc<T> {
    private final ThreadLocal<yyu<CoroutineContext, Object>> e;
    private volatile boolean threadLocalIsSet;

    public ziq(CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        super(coroutineContext.get(zio.f54139c) == null ? coroutineContext.plus(zio.f54139c) : coroutineContext, continuation);
        this.e = new ThreadLocal<>();
        if (continuation.getF54257c().get(ContinuationInterceptor.INSTANCE) instanceof CoroutineDispatcher) {
            return;
        }
        Object objD = NO_THREAD_ELEMENTS.d(coroutineContext, null);
        NO_THREAD_ELEMENTS.b(coroutineContext, objD);
        b(coroutineContext, objD);
    }

    public final void b(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(yyz.c(coroutineContext, obj));
    }

    public final boolean d() {
        boolean z = this.threadLocalIsSet && this.e.get() == null;
        this.e.remove();
        return !z;
    }

    @Override // defpackage.zmc, kotlinx.coroutines.AbstractCoroutine
    public void afterResume(Object state) {
        if (this.threadLocalIsSet) {
            yyu<CoroutineContext, Object> yyuVar = this.e.get();
            if (yyuVar != null) {
                NO_THREAD_ELEMENTS.b(yyuVar.a(), yyuVar.e());
            }
            this.e.remove();
        }
        Object objA = recoverResult.a(state, this.d);
        Continuation<T> continuation = this.d;
        CoroutineContext f54257c = continuation.getF54257c();
        Object objD = NO_THREAD_ELEMENTS.d(f54257c, null);
        ziq<?> ziqVarA = objD != NO_THREAD_ELEMENTS.f54302a ? DEBUG_THREAD_NAME_SEPARATOR.a((Continuation<?>) continuation, f54257c, objD) : null;
        try {
            this.d.resumeWith(objA);
            yzc yzcVar = yzc.e;
        } finally {
            if (ziqVarA == null || ziqVarA.d()) {
                NO_THREAD_ELEMENTS.b(f54257c, objD);
            }
        }
    }
}
