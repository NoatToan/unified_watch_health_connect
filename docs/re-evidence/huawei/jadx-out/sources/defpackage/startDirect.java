package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: zmq, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u001a\u0010\u0005\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0082\b\u001a>\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\t\u001aR\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u0002*\u001e\b\u0001\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b2\u0006\u0010\f\u001a\u0002H\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\r\u001a>\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\t\u001aY\u0010\u000f\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u0002H\u00020\u00102\u0006\u0010\f\u001a\u0002H\n2'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b¢\u0006\u0002\b\u0011H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001aY\u0010\u0013\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u0002H\u00020\u00102\u0006\u0010\f\u001a\u0002H\n2'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b¢\u0006\u0002\b\u0011H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a?\u0010\u0014\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00062\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0019H\u0082\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"startDirect", "", ExifInterface.GPS_DIRECTION_TRUE, "completion", "Lkotlin/coroutines/Continuation;", "block", "Lkotlin/Function1;", "", "startCoroutineUndispatched", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "R", "Lkotlin/Function2;", SocialConstants.PARAM_RECEIVER, "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "startCoroutineUnintercepted", "startUndispatchedOrReturn", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/internal/ScopeCoroutine;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "startUndispatchedOrReturnIgnoreTimeout", "undispatchedResult", "shouldThrow", "", "", "startBlock", "Lkotlin/Function0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class startDirect {
    public static final <T, R> Object d(zmc<? super T> zmcVar, R r, Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        Object zglVar;
        Object objMakeCompletingOnce$kotlinx_coroutines_core;
        try {
            zglVar = ((Function2) zcy.c(function2, 2)).invoke(r, zmcVar);
        } catch (Throwable th) {
            zglVar = new zgl(th, false, 2, null);
        }
        if (zglVar != zbg.a() && (objMakeCompletingOnce$kotlinx_coroutines_core = zmcVar.makeCompletingOnce$kotlinx_coroutines_core(zglVar)) != COMPLETING_ALREADY.f54131c) {
            if (objMakeCompletingOnce$kotlinx_coroutines_core instanceof zgl) {
                zgl zglVar2 = (zgl) objMakeCompletingOnce$kotlinx_coroutines_core;
                Throwable th2 = zglVar2.f54081b;
                Throwable th3 = zglVar2.f54081b;
                Continuation<? super T> continuation = zmcVar.d;
                if (ASSERTIONS_ENABLED.b() && (continuation instanceof CoroutineStackFrame)) {
                    throw ARTIFICIAL_FRAME.d(th3, (CoroutineStackFrame) continuation);
                }
                throw th3;
            }
            return COMPLETING_ALREADY.a(objMakeCompletingOnce$kotlinx_coroutines_core);
        }
        return zbg.a();
    }

    public static final <T> void b(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        Continuation continuationA = probeCoroutineCreated.a(continuation);
        try {
            CoroutineContext context = continuation.getContext();
            Object objD = NO_THREAD_ELEMENTS.d(context, null);
            try {
                Object objInvoke = ((Function1) zcy.c(function1, 1)).invoke(continuationA);
                NO_THREAD_ELEMENTS.b(context, objD);
                if (objInvoke != zbg.a()) {
                    yyt.c cVar = yyt.f53903b;
                    continuationA.resumeWith(yyt.e(objInvoke));
                }
            } catch (Throwable th) {
                NO_THREAD_ELEMENTS.b(context, objD);
                throw th;
            }
        } catch (Throwable th2) {
            yyt.c cVar2 = yyt.f53903b;
            continuationA.resumeWith(yyt.e(createFailure.a(th2)));
        }
    }

    public static final <R, T> void c(Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, Continuation<? super T> continuation) {
        Continuation continuationA = probeCoroutineCreated.a(continuation);
        try {
            CoroutineContext context = continuation.getContext();
            Object objD = NO_THREAD_ELEMENTS.d(context, null);
            try {
                Object objInvoke = ((Function2) zcy.c(function2, 2)).invoke(r, continuationA);
                NO_THREAD_ELEMENTS.b(context, objD);
                if (objInvoke != zbg.a()) {
                    yyt.c cVar = yyt.f53903b;
                    continuationA.resumeWith(yyt.e(objInvoke));
                }
            } catch (Throwable th) {
                NO_THREAD_ELEMENTS.b(context, objD);
                throw th;
            }
        } catch (Throwable th2) {
            yyt.c cVar2 = yyt.f53903b;
            continuationA.resumeWith(yyt.e(createFailure.a(th2)));
        }
    }
}
