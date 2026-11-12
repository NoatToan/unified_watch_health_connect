package defpackage;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.Job;

/* JADX INFO: renamed from: zln, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u0003\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0082\b\u001aU\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u0002H\u000f0\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00122%\b\u0002\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\r\u0018\u00010\u0014H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0019\u001a\u0012\u0010\u001a\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\r0\u0005H\u0000\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"REUSABLE_CLAIMED", "Lkotlinx/coroutines/internal/Symbol;", "UNDEFINED", "executeUnconfined", "", "Lkotlinx/coroutines/internal/DispatchedContinuation;", "contState", "", Wpt.MODE, "", "doYield", "block", "Lkotlin/Function0;", "", "resumeCancellableWith", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/Continuation;", "result", "Lkotlin/Result;", "onCancellation", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "yieldUndispatched", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class REUSABLE_CLAIMED {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final zmh f54273a = new zmh("UNDEFINED");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zmh f54274c = new zmh("REUSABLE_CLAIMED");

    public static /* synthetic */ void d(Continuation continuation, Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        b(continuation, obj, function1);
    }

    public static final <T> void b(Continuation<? super T> continuation, Object obj, Function1<? super Throwable, yzc> function1) {
        if (!(continuation instanceof zlh)) {
            continuation.resumeWith(obj);
            return;
        }
        zlh zlhVar = (zlh) continuation;
        Object objC = recoverResult.c(obj, function1);
        if (zlhVar.f54261a.isDispatchNeeded(zlhVar.getF54257c())) {
            zlhVar.f54262b = objC;
            zlhVar.resumeMode = 1;
            zlhVar.f54261a.dispatch(zlhVar.getF54257c(), zlhVar);
            return;
        }
        ASSERTIONS_ENABLED.a();
        EventLoop eventLoopE = zih.e.e();
        if (eventLoopE.isUnconfinedLoopActive()) {
            zlhVar.f54262b = objC;
            zlhVar.resumeMode = 1;
            eventLoopE.dispatchUnconfined(zlhVar);
            return;
        }
        zlh zlhVar2 = zlhVar;
        eventLoopE.incrementUseCount(true);
        try {
            Job job = (Job) zlhVar.getF54257c().get(Job.INSTANCE);
            if (job != null && !job.isActive()) {
                CancellationException cancellationException = job.getCancellationException();
                zlhVar.cancelCompletedResult$kotlinx_coroutines_core(objC, cancellationException);
                yyt.c cVar = yyt.f53903b;
                zlhVar.resumeWith(yyt.e(createFailure.a(cancellationException)));
            } else {
                Continuation<T> continuation2 = zlhVar.f54263c;
                Object obj2 = zlhVar.d;
                CoroutineContext context = continuation2.getF54257c();
                Object objD = NO_THREAD_ELEMENTS.d(context, obj2);
                ziq<?> ziqVarA = objD != NO_THREAD_ELEMENTS.f54302a ? DEBUG_THREAD_NAME_SEPARATOR.a((Continuation<?>) continuation2, context, objD) : null;
                try {
                    zlhVar.f54263c.resumeWith(obj);
                    yzc yzcVar = yzc.e;
                    if (ziqVarA == null || ziqVarA.d()) {
                        NO_THREAD_ELEMENTS.b(context, objD);
                    }
                } catch (Throwable th) {
                    if (ziqVarA == null || ziqVarA.d()) {
                        NO_THREAD_ELEMENTS.b(context, objD);
                    }
                    throw th;
                }
            }
            while (eventLoopE.processUnconfinedEvent()) {
            }
        } catch (Throwable th2) {
            try {
                zlhVar2.handleFatalException$kotlinx_coroutines_core(th2, null);
            } finally {
                eventLoopE.decrementUseCount(true);
            }
        }
    }

    public static final boolean a(zlh<? super yzc> zlhVar) {
        yzc yzcVar = yzc.e;
        ASSERTIONS_ENABLED.a();
        EventLoop eventLoopE = zih.e.e();
        if (eventLoopE.isUnconfinedQueueEmpty()) {
            return false;
        }
        if (eventLoopE.isUnconfinedLoopActive()) {
            zlhVar.f54262b = yzcVar;
            zlhVar.resumeMode = 1;
            eventLoopE.dispatchUnconfined(zlhVar);
            return true;
        }
        zlh<? super yzc> zlhVar2 = zlhVar;
        eventLoopE.incrementUseCount(true);
        try {
            zlhVar.run();
            do {
            } while (eventLoopE.processUnconfinedEvent());
        } catch (Throwable th) {
            try {
                zlhVar2.handleFatalException$kotlinx_coroutines_core(th, null);
            } finally {
                eventLoopE.decrementUseCount(true);
            }
        }
        return false;
    }
}
