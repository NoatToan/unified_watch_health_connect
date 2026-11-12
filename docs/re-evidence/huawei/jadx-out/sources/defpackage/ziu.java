package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Opers;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.android.HandlerDispatcher;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002J\u001c\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0016J\u0013\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010 \u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u0010!\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100#H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u0000X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lkotlinx/coroutines/android/HandlerContext;", "Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/Delay;", "handler", "Landroid/os/Handler;", "name", "", "(Landroid/os/Handler;Ljava/lang/String;)V", "invokeImmediately", "", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "_immediate", "immediate", "getImmediate", "()Lkotlinx/coroutines/android/HandlerContext;", "cancelOnRejection", "", ParamConstants.Param.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatch", "equals", "other", "", WatchFaceConstant.HASHCODE, "", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "", "isDispatchNeeded", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "toString", "kotlinx-coroutines-android"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ziu extends HandlerDispatcher implements Delay {
    private volatile ziu _immediate;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f54160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ziu f54161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f54162c;
    private final Handler d;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "kotlinx/coroutines/RunnableKt$Runnable$1"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ziu f54163b;
        final /* synthetic */ CancellableContinuation d;

        @Override // java.lang.Runnable
        public final void run() {
            this.d.resumeUndispatched(this.f54163b, yzc.e);
        }

        public d(CancellableContinuation cancellableContinuation, ziu ziuVar) {
            this.d = cancellableContinuation;
            this.f54163b = ziuVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ziu(Handler handler, String str, boolean z) {
        super(0 == true ? 1 : 0);
        this.d = handler;
        this.f54160a = str;
        this.f54162c = z;
        this._immediate = z ? this : null;
        ziu ziuVar = this._immediate;
        if (ziuVar == null) {
            ziuVar = new ziu(handler, str, true);
            this._immediate = ziuVar;
        }
        this.f54161b = ziuVar;
    }

    public /* synthetic */ ziu(Handler handler, String str, int i, zcm zcmVar) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public ziu(Handler handler, String str) {
        this(handler, str, false);
    }

    @Override // kotlinx.coroutines.android.HandlerDispatcher, kotlinx.coroutines.MainCoroutineDispatcher
    /* JADX INFO: renamed from: a, reason: from getter and merged with bridge method [inline-methods] */
    public ziu getImmediate() {
        return this.f54161b;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(CoroutineContext context) {
        return (this.f54162c && zcp.b(Looper.myLooper(), this.d.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(CoroutineContext context, Runnable block) {
        if (this.d.post(block)) {
            return;
        }
        d(context, block);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", TrackConstants$Opers.INVOKE}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends Lambda implements Function1<Throwable, yzc> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f54164a;

        public final void a(Throwable th) {
            ziu.this.d.removeCallbacks(this.f54164a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ yzc invoke(Throwable th) {
            a(th);
            return yzc.e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Runnable runnable) {
            super(1);
            this.f54164a = runnable;
        }
    }

    @Override // kotlinx.coroutines.android.HandlerDispatcher, kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long timeMillis, final Runnable block, CoroutineContext context) {
        if (this.d.postDelayed(block, zdm.d(timeMillis, 4611686018427387903L))) {
            return new DisposableHandle() { // from class: ziv
                @Override // kotlinx.coroutines.DisposableHandle
                public final void dispose() {
                    ziu.a(this.e, block);
                }
            };
        }
        d(context, block);
        return zif.f54134b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ziu ziuVar, Runnable runnable) {
        ziuVar.d.removeCallbacks(runnable);
    }

    private final void d(CoroutineContext coroutineContext, Runnable runnable) {
        zhs.a(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        zhf.c().dispatch(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String stringInternalImpl = toStringInternalImpl();
        if (stringInternalImpl != null) {
            return stringInternalImpl;
        }
        String string = this.f54160a;
        if (string == null) {
            string = this.d.toString();
        }
        if (!this.f54162c) {
            return string;
        }
        return string + ".immediate";
    }

    public boolean equals(Object other) {
        return (other instanceof ziu) && ((ziu) other).d == this.d;
    }

    public int hashCode() {
        return System.identityHashCode(this.d);
    }

    @Override // kotlinx.coroutines.Delay
    public void scheduleResumeAfterDelay(long timeMillis, CancellableContinuation<? super yzc> continuation) {
        d dVar = new d(continuation, this);
        if (this.d.postDelayed(dVar, zdm.d(timeMillis, 4611686018427387903L))) {
            continuation.invokeOnCancellation(new e(dVar));
        } else {
            d(continuation.getContext(), dVar);
        }
    }
}
