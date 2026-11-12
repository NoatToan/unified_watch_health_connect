package defpackage;

import com.huawei.openalliance.ad.constant.ParamConstants;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.scheduling.CoroutineScheduler;
import kotlinx.coroutines.scheduling.TaskContext;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0010\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0002J\u001c\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0017j\u0002`\u0018H\u0016J)\u0010\u0019\u001a\u00020\u00112\n\u0010\u0016\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\u001dJ\u001c\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0017j\u0002`\u0018H\u0016J\r\u0010\u001f\u001a\u00020\u0011H\u0000¢\u0006\u0002\b J\u0015\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0006H\u0000¢\u0006\u0002\b#J\r\u0010$\u001a\u00020\u0011H\u0000¢\u0006\u0002\b%R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lkotlinx/coroutines/scheduling/SchedulerCoroutineDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "corePoolSize", "", "maxPoolSize", "idleWorkerKeepAliveNs", "", "schedulerName", "", "(IIJLjava/lang/String;)V", "coroutineScheduler", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "close", "", "createScheduler", "dispatch", ParamConstants.Param.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatchWithContext", "Lkotlinx/coroutines/scheduling/TaskContext;", "tailDispatch", "", "dispatchWithContext$kotlinx_coroutines_core", "dispatchYield", "restore", "restore$kotlinx_coroutines_core", "shutdown", "timeout", "shutdown$kotlinx_coroutines_core", "usePrivateScheduler", "usePrivateScheduler$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class zmt extends ExecutorCoroutineDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f54314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f54315c;
    private CoroutineScheduler d;
    private final String e;

    public /* synthetic */ zmt(int i, int i2, long j, String str, int i3, zcm zcmVar) {
        this((i3 & 1) != 0 ? BlockingContext.f54320c : i, (i3 & 2) != 0 ? BlockingContext.e : i2, (i3 & 4) != 0 ? BlockingContext.f54319b : j, (i3 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public zmt(int i, int i2, long j, String str) {
        this.f54314b = i;
        this.f54313a = i2;
        this.f54315c = j;
        this.e = str;
        this.d = e();
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    /* JADX INFO: renamed from: getExecutor */
    public Executor getF54104b() {
        return this.d;
    }

    private final CoroutineScheduler e() {
        return new CoroutineScheduler(this.f54314b, this.f54313a, this.f54315c, this.e);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(CoroutineContext context, Runnable block) {
        CoroutineScheduler.e(this.d, block, null, false, 6, null);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(CoroutineContext context, Runnable block) {
        CoroutineScheduler.e(this.d, block, null, true, 2, null);
    }

    public final void b(Runnable runnable, TaskContext taskContext, boolean z) {
        this.d.a(runnable, taskContext, z);
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.d.close();
    }

    public zmt() {
        this(0, 0, 0L, null, 15, null);
    }
}
