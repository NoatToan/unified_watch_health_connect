package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DispatchedTask;
import kotlinx.coroutines.EventLoop;

/* JADX INFO: renamed from: zhh, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\u0006\u0010\u0010\u001a\u00020\u0001H\u0000\u001a.\u0010\u0011\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00132\u0006\u0010\u0014\u001a\u00020\tH\u0000\u001a\u0010\u0010\u0015\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u000fH\u0002\u001a\u0019\u0010\u0016\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0080\b\u001a'\u0010\u0019\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0018\u0010\b\u001a\u00020\t*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\n\"\u0018\u0010\u000b\u001a\u00020\t*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\n¨\u0006\u001e"}, d2 = {"MODE_ATOMIC", "", "MODE_CANCELLABLE", "getMODE_CANCELLABLE$annotations", "()V", "MODE_CANCELLABLE_REUSABLE", "MODE_UNDISPATCHED", "MODE_UNINITIALIZED", "isCancellableMode", "", "(I)Z", "isReusableMode", "dispatch", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/DispatchedTask;", Wpt.MODE, "resume", "delegate", "Lkotlin/coroutines/Continuation;", "undispatched", "resumeUnconfined", "resumeWithStackTrace", TrackConstants$Events.EXCEPTION, "", "runUnconfinedEventLoop", "eventLoop", "Lkotlinx/coroutines/EventLoop;", "block", "Lkotlin/Function0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MODE_ATOMIC {
    public static final boolean a(int i) {
        return i == 1 || i == 2;
    }

    public static final boolean b(int i) {
        return i == 2;
    }

    public static final <T> void b(DispatchedTask<? super T> dispatchedTask, int i) {
        if (ASSERTIONS_ENABLED.a() && i == -1) {
            throw new AssertionError();
        }
        Continuation<? super T> delegate$kotlinx_coroutines_core = dispatchedTask.getDelegate$kotlinx_coroutines_core();
        boolean z = i == 4;
        if (!z && (delegate$kotlinx_coroutines_core instanceof zlh) && a(i) == a(dispatchedTask.resumeMode)) {
            CoroutineDispatcher coroutineDispatcher = ((zlh) delegate$kotlinx_coroutines_core).f54261a;
            CoroutineContext context = delegate$kotlinx_coroutines_core.getF54257c();
            if (coroutineDispatcher.isDispatchNeeded(context)) {
                coroutineDispatcher.dispatch(context, dispatchedTask);
                return;
            } else {
                c(dispatchedTask);
                return;
            }
        }
        a(dispatchedTask, delegate$kotlinx_coroutines_core, z);
    }

    public static final <T> void a(DispatchedTask<? super T> dispatchedTask, Continuation<? super T> continuation, boolean z) {
        Object successfulResult$kotlinx_coroutines_core;
        boolean zD;
        Object objTakeState$kotlinx_coroutines_core = dispatchedTask.takeState$kotlinx_coroutines_core();
        Throwable exceptionalResult$kotlinx_coroutines_core = dispatchedTask.getExceptionalResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core);
        if (exceptionalResult$kotlinx_coroutines_core != null) {
            yyt.c cVar = yyt.f53903b;
            successfulResult$kotlinx_coroutines_core = createFailure.a(exceptionalResult$kotlinx_coroutines_core);
        } else {
            yyt.c cVar2 = yyt.f53903b;
            successfulResult$kotlinx_coroutines_core = dispatchedTask.getSuccessfulResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core);
        }
        Object objE = yyt.e(successfulResult$kotlinx_coroutines_core);
        if (z) {
            zcp.e(continuation, "");
            zlh zlhVar = (zlh) continuation;
            Continuation<T> continuation2 = zlhVar.f54263c;
            Object obj = zlhVar.d;
            CoroutineContext context = continuation2.getF54257c();
            Object objD = NO_THREAD_ELEMENTS.d(context, obj);
            ziq<?> ziqVarA = objD != NO_THREAD_ELEMENTS.f54302a ? DEBUG_THREAD_NAME_SEPARATOR.a((Continuation<?>) continuation2, context, objD) : null;
            try {
                zlhVar.f54263c.resumeWith(objE);
                yzc yzcVar = yzc.e;
                if (ziqVarA != null) {
                    if (!zD) {
                        return;
                    }
                }
                return;
            } finally {
                if (ziqVarA == null || ziqVarA.d()) {
                    NO_THREAD_ELEMENTS.b(context, objD);
                }
            }
        }
        continuation.resumeWith(objE);
    }

    private static final void c(DispatchedTask<?> dispatchedTask) {
        EventLoop eventLoopE = zih.e.e();
        if (eventLoopE.isUnconfinedLoopActive()) {
            eventLoopE.dispatchUnconfined(dispatchedTask);
            return;
        }
        eventLoopE.incrementUseCount(true);
        try {
            a(dispatchedTask, dispatchedTask.getDelegate$kotlinx_coroutines_core(), true);
            do {
            } while (eventLoopE.processUnconfinedEvent());
        } catch (Throwable th) {
            try {
                dispatchedTask.handleFatalException$kotlinx_coroutines_core(th, null);
            } finally {
                eventLoopE.decrementUseCount(true);
            }
        }
    }
}
