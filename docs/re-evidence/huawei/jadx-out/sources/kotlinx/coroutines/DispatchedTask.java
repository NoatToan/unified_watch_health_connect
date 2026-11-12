package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import defpackage.ARTIFICIAL_FRAME;
import defpackage.ASSERTIONS_ENABLED;
import defpackage.DEBUG_THREAD_NAME_SEPARATOR;
import defpackage.MODE_ATOMIC;
import defpackage.NO_THREAD_ELEMENTS;
import defpackage.createFailure;
import defpackage.yyl;
import defpackage.yyt;
import defpackage.yzc;
import defpackage.zcp;
import defpackage.zgl;
import defpackage.zgt;
import defpackage.ziq;
import defpackage.zlh;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlinx.coroutines.scheduling.Task;
import kotlinx.coroutines.scheduling.TaskContext;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000f\b!\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0002\b\u0014J\u001f\u0010\u0015\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0002\b\u001bJ\u0006\u0010\u001c\u001a\u00020\fJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u000eH ¢\u0006\u0002\b\u001eR\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX \u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/DispatchedTask;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/scheduling/Task;", "Lkotlinx/coroutines/SchedulerTask;", "resumeMode", "", "(I)V", "delegate", "Lkotlin/coroutines/Continuation;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "cancelCompletedResult", "", "takenState", "", "cause", "", "cancelCompletedResult$kotlinx_coroutines_core", "getExceptionalResult", "state", "getExceptionalResult$kotlinx_coroutines_core", "getSuccessfulResult", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "handleFatalException", TrackConstants$Events.EXCEPTION, "finallyException", "handleFatalException$kotlinx_coroutines_core", "run", "takeState", "takeState$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class DispatchedTask<T> extends Task {
    public int resumeMode;

    public void cancelCompletedResult$kotlinx_coroutines_core(Object takenState, Throwable cause) {
    }

    public abstract Continuation<T> getDelegate$kotlinx_coroutines_core();

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(Object state) {
        return state;
    }

    public abstract Object takeState$kotlinx_coroutines_core();

    public DispatchedTask(int i) {
        this.resumeMode = i;
    }

    public Throwable getExceptionalResult$kotlinx_coroutines_core(Object state) {
        zgl zglVar = state instanceof zgl ? (zgl) state : null;
        if (zglVar != null) {
            return zglVar.f54081b;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objE;
        Object objE2;
        CancellationException cancellationExceptionD;
        if (ASSERTIONS_ENABLED.a() && this.resumeMode == -1) {
            throw new AssertionError();
        }
        TaskContext taskContext = this.taskContext;
        try {
            Continuation<T> delegate$kotlinx_coroutines_core = getDelegate$kotlinx_coroutines_core();
            zcp.e(delegate$kotlinx_coroutines_core, "");
            zlh zlhVar = (zlh) delegate$kotlinx_coroutines_core;
            Continuation<T> continuation = zlhVar.f54263c;
            Object obj = zlhVar.d;
            CoroutineContext context = continuation.getF54257c();
            Object objD = NO_THREAD_ELEMENTS.d(context, obj);
            ziq<?> ziqVarA = objD != NO_THREAD_ELEMENTS.f54302a ? DEBUG_THREAD_NAME_SEPARATOR.a((Continuation<?>) continuation, context, objD) : null;
            try {
                CoroutineContext context2 = continuation.getF54257c();
                Object objTakeState$kotlinx_coroutines_core = takeState$kotlinx_coroutines_core();
                Throwable exceptionalResult$kotlinx_coroutines_core = getExceptionalResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core);
                Job job = (exceptionalResult$kotlinx_coroutines_core == null && MODE_ATOMIC.a(this.resumeMode)) ? (Job) context2.get(Job.INSTANCE) : null;
                if (job != null && !job.isActive()) {
                    CancellationException cancellationException = job.getCancellationException();
                    cancelCompletedResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core, cancellationException);
                    yyt.c cVar = yyt.f53903b;
                    if (ASSERTIONS_ENABLED.b() && (continuation instanceof CoroutineStackFrame)) {
                        cancellationExceptionD = ARTIFICIAL_FRAME.d(cancellationException, (CoroutineStackFrame) continuation);
                    } else {
                        cancellationExceptionD = cancellationException;
                    }
                    continuation.resumeWith(yyt.e(createFailure.a(cancellationExceptionD)));
                } else if (exceptionalResult$kotlinx_coroutines_core != null) {
                    yyt.c cVar2 = yyt.f53903b;
                    continuation.resumeWith(yyt.e(createFailure.a(exceptionalResult$kotlinx_coroutines_core)));
                } else {
                    yyt.c cVar3 = yyt.f53903b;
                    continuation.resumeWith(yyt.e(getSuccessfulResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core)));
                }
                yzc yzcVar = yzc.e;
                if (ziqVarA == null || ziqVarA.d()) {
                    NO_THREAD_ELEMENTS.b(context, objD);
                }
                try {
                    yyt.c cVar4 = yyt.f53903b;
                    DispatchedTask<T> dispatchedTask = this;
                    taskContext.afterTask();
                    objE2 = yyt.e(yzc.e);
                } catch (Throwable th) {
                    yyt.c cVar5 = yyt.f53903b;
                    objE2 = yyt.e(createFailure.a(th));
                }
                handleFatalException$kotlinx_coroutines_core(null, yyt.a(objE2));
            } catch (Throwable th2) {
                if (ziqVarA == null || ziqVarA.d()) {
                    NO_THREAD_ELEMENTS.b(context, objD);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                yyt.c cVar6 = yyt.f53903b;
                taskContext.afterTask();
                objE = yyt.e(yzc.e);
            } catch (Throwable th4) {
                yyt.c cVar7 = yyt.f53903b;
                objE = yyt.e(createFailure.a(th4));
            }
            handleFatalException$kotlinx_coroutines_core(th3, yyt.a(objE));
        }
    }

    public final void handleFatalException$kotlinx_coroutines_core(Throwable exception, Throwable finallyException) {
        if (exception == null && finallyException == null) {
            return;
        }
        if (exception != null && finallyException != null) {
            yyl.d(exception, finallyException);
        }
        if (exception == null) {
            exception = finallyException;
        }
        zcp.e(exception);
        defpackage.CoroutineExceptionHandler.b(getDelegate$kotlinx_coroutines_core().getF54257c(), new zgt("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", exception));
    }
}
