package kotlinx.coroutines.scheduling;

import android.support.v4.media.session.PlaybackStateCompat;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import com.huawei.hiai.awareness.client.AwarenessRequest;
import defpackage.ASSERTIONS_ENABLED;
import defpackage.BlockingContext;
import defpackage.classSimpleName;
import defpackage.timeSource;
import defpackage.yzc;
import defpackage.zcm;
import defpackage.zcp;
import defpackage.zcw;
import defpackage.zdm;
import defpackage.zmb;
import defpackage.zmh;
import defpackage.zms;
import defpackage.zmy;
import defpackage.zmz;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.jvm.Volatile;
import kotlin.random.Random;
import kotlinx.coroutines.AbstractTimeSource;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0000\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0003IJKB)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0011\u0010\r\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0007H\u0086\bJ\u0011\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0007H\u0082\bJ\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0004H\u0002J\u001a\u0010&\u001a\u00020 2\n\u0010'\u001a\u00060(j\u0002`)2\u0006\u0010*\u001a\u00020+J\u0011\u0010\u0012\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0007H\u0082\bJ\u000e\u0010,\u001a\b\u0018\u00010\u001dR\u00020\u0000H\u0002J\t\u0010-\u001a\u00020$H\u0082\bJ\t\u0010.\u001a\u00020\u0004H\u0082\bJ&\u0010/\u001a\u00020$2\n\u0010'\u001a\u00060(j\u0002`)2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u00100\u001a\u00020\u0018J\u0014\u00101\u001a\u00020$2\n\u00102\u001a\u00060(j\u0002`)H\u0016J\t\u00103\u001a\u00020\u0007H\u0082\bJ\t\u00104\u001a\u00020\u0004H\u0082\bJ\u0014\u00105\u001a\u00020\u00042\n\u00106\u001a\u00060\u001dR\u00020\u0000H\u0002J\u000e\u00107\u001a\b\u0018\u00010\u001dR\u00020\u0000H\u0002J\u0012\u00108\u001a\u00020\u00182\n\u00106\u001a\u00060\u001dR\u00020\u0000J\"\u00109\u001a\u00020$2\n\u00106\u001a\u00060\u001dR\u00020\u00002\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0004J\t\u0010<\u001a\u00020\u0007H\u0082\bJ\u000e\u0010=\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020\u0007J\u0018\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u0018H\u0002J\u0006\u0010C\u001a\u00020$J\b\u0010D\u001a\u00020\tH\u0016J\t\u0010E\u001a\u00020\u0018H\u0082\bJ\u0012\u0010F\u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\u0007H\u0002J\b\u0010G\u001a\u00020\u0018H\u0002J$\u0010H\u001a\u0004\u0018\u00010 *\b\u0018\u00010\u001dR\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u00100\u001a\u00020\u0018H\u0002R\t\u0010\u000b\u001a\u00020\fX\u0082\u0004R\u0015\u0010\r\u001a\u00020\u00048Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\t\u0010\u0010\u001a\u00020\u0011X\u0082\u0004R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0012\u001a\u00020\u00048Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0010\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\t\u0010\u001a\u001a\u00020\u0011X\u0082\u0004R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\f\u0012\b\u0012\u00060\u001dR\u00020\u00000\u001c8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006L"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "corePoolSize", "", "maxPoolSize", "idleWorkerKeepAliveNs", "", "schedulerName", "", "(IIJLjava/lang/String;)V", "_isTerminated", "Lkotlinx/atomicfu/AtomicBoolean;", "availableCpuPermits", "getAvailableCpuPermits", "()I", "controlState", "Lkotlinx/atomicfu/AtomicLong;", "createdWorkers", "getCreatedWorkers", "globalBlockingQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalCpuQueue", "isTerminated", "", "()Z", "parkedWorkersStack", "workers", "Lkotlinx/coroutines/internal/ResizableAtomicArray;", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "addToGlobalQueue", "task", "Lkotlinx/coroutines/scheduling/Task;", "state", "blockingTasks", "close", "", "createNewWorker", "createTask", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "taskContext", "Lkotlinx/coroutines/scheduling/TaskContext;", "currentWorker", "decrementBlockingTasks", "decrementCreatedWorkers", "dispatch", "tailDispatch", "execute", AwarenessRequest.Field.COMMAND, "incrementBlockingTasks", "incrementCreatedWorkers", "parkedWorkersStackNextIndex", "worker", "parkedWorkersStackPop", "parkedWorkersStackPush", "parkedWorkersStackTopUpdate", "oldIndex", "newIndex", "releaseCpuPermit", "runSafely", "shutdown", "timeout", "signalBlockingWork", "stateSnapshot", "skipUnpark", "signalCpuWork", "toString", "tryAcquireCpuPermit", "tryCreateWorker", "tryUnpark", "submitToLocalQueue", "Companion", "Worker", "WorkerState", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CoroutineScheduler implements Executor, Closeable {

    @Volatile
    private volatile int _isTerminated;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zms f39362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zms f39363c;

    @Volatile
    private volatile long controlState;
    public final zmb<a> f;
    public final int g;
    public final long h;
    public final String j;

    @Volatile
    private volatile long parkedWorkersStack;
    public static final d e = new d(null);
    private static final AtomicLongFieldUpdater l = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");
    private static final AtomicLongFieldUpdater o = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");
    private static final AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");
    public static final zmh d = new zmh("NOT_IN_STACK");

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public CoroutineScheduler(int i2, int i3, long j, String str) {
        this.f39361a = i2;
        this.g = i3;
        this.h = j;
        this.j = str;
        if (i2 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i2 + " should be at least 1").toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should be greater than or equals to core pool size " + i2).toString());
        }
        if (i3 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f39362b = new zms();
        this.f39363c = new zms();
        this.f = new zmb<>((i2 + 1) * 2);
        this.controlState = ((long) i2) << 42;
        this._isTerminated = 0;
    }

    public final void a(a aVar, int i2, int i3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = l;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            int iD = (int) (2097151 & j);
            if (iD == i2) {
                iD = i3 == 0 ? d(aVar) : i3;
            }
            if (iD >= 0 && l.compareAndSet(this, j, ((PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152)) | ((long) iD))) {
                return;
            }
        }
    }

    public final boolean c(a aVar) {
        long j;
        int indexInArray;
        if (aVar.getNextParkedWorker() != d) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = l;
        do {
            j = atomicLongFieldUpdater.get(this);
            int i2 = (int) (2097151 & j);
            indexInArray = aVar.getIndexInArray();
            if (ASSERTIONS_ENABLED.a() && indexInArray == 0) {
                throw new AssertionError();
            }
            aVar.d((Object) this.f.c(i2));
        } while (!l.compareAndSet(this, j, ((PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152)) | ((long) indexInArray)));
        return true;
    }

    private final a g() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = l;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            a aVarC = this.f.c((int) (2097151 & j));
            if (aVarC == null) {
                return null;
            }
            int iD = d(aVarC);
            if (iD >= 0 && l.compareAndSet(this, j, ((long) iD) | ((PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152)))) {
                aVarC.d(d);
                return aVarC;
            }
        }
    }

    private final int d(a aVar) {
        Object nextParkedWorker = aVar.getNextParkedWorker();
        while (nextParkedWorker != d) {
            if (nextParkedWorker == null) {
                return 0;
            }
            a aVar2 = (a) nextParkedWorker;
            int indexInArray = aVar2.getIndexInArray();
            if (indexInArray != 0) {
                return indexInArray;
            }
            nextParkedWorker = aVar2.getNextParkedWorker();
        }
        return -1;
    }

    public final boolean e() {
        return i.get(this) != 0;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Companion;", "", "()V", "BLOCKING_MASK", "", "BLOCKING_SHIFT", "", "CLAIMED", "CPU_PERMITS_MASK", "CPU_PERMITS_SHIFT", "CREATED_MASK", "MAX_SUPPORTED_POOL_SIZE", "MIN_SUPPORTED_POOL_SIZE", "NOT_IN_STACK", "Lkotlinx/coroutines/internal/Symbol;", "PARKED", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(zcm zcmVar) {
            this();
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        e(this, command, null, false, 6, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        e(10000L);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    public final void e(long j) {
        int i2;
        Task taskB;
        if (i.compareAndSet(this, 0, 1)) {
            a aVarD = d();
            synchronized (this.f) {
                i2 = (int) (o.get(this) & 2097151);
            }
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    a aVarC = this.f.c(i3);
                    zcp.e(aVarC);
                    a aVar = aVarC;
                    if (aVar != aVarD) {
                        while (aVar.isAlive()) {
                            LockSupport.unpark(aVar);
                            aVar.join(j);
                        }
                        WorkerState workerState = aVar.f39366c;
                        if (ASSERTIONS_ENABLED.a() && workerState != WorkerState.TERMINATED) {
                            throw new AssertionError();
                        }
                        aVar.e.d(this.f39363c);
                    }
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.f39363c.d();
            this.f39362b.d();
            while (true) {
                if (aVarD != null) {
                    taskB = aVarD.b(true);
                    if (taskB == null) {
                        taskB = this.f39362b.b();
                        if (taskB == null) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    taskB = this.f39362b.b();
                    if (taskB == null && (taskB = this.f39363c.b()) == null) {
                        break;
                    }
                }
                a(taskB);
            }
            if (aVarD != null) {
                aVarD.d(WorkerState.TERMINATED);
            }
            if (ASSERTIONS_ENABLED.a() && ((int) ((o.get(this) & 9223367638808264704L) >> 42)) != this.f39361a) {
                throw new AssertionError();
            }
            l.set(this, 0L);
            o.set(this, 0L);
        }
    }

    public static /* synthetic */ void e(CoroutineScheduler coroutineScheduler, Runnable runnable, TaskContext taskContext, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            taskContext = BlockingContext.h;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        coroutineScheduler.a(runnable, taskContext, z);
    }

    public final void a(Runnable runnable, TaskContext taskContext, boolean z) {
        AbstractTimeSource abstractTimeSourceC = timeSource.c();
        if (abstractTimeSourceC != null) {
            abstractTimeSourceC.trackTask();
        }
        Task taskD = d(runnable, taskContext);
        boolean z2 = false;
        boolean z3 = taskD.taskContext.getD() == 1;
        long jAddAndGet = z3 ? o.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) : 0L;
        a aVarD = d();
        Task taskA = a(aVarD, taskD, z);
        if (taskA != null && !b(taskA)) {
            throw new RejectedExecutionException(this.j + " was terminated");
        }
        if (z && aVarD != null) {
            z2 = true;
        }
        if (z3) {
            e(jAddAndGet, z2);
        } else {
            if (z2) {
                return;
            }
            b();
        }
    }

    public final Task d(Runnable runnable, TaskContext taskContext) {
        long jNanoTime = BlockingContext.j.nanoTime();
        if (runnable instanceof Task) {
            Task task = (Task) runnable;
            task.submissionTime = jNanoTime;
            task.taskContext = taskContext;
            return task;
        }
        return new zmy(runnable, jNanoTime, taskContext);
    }

    private final void e(long j, boolean z) {
        if (z || i() || a(j)) {
            return;
        }
        i();
    }

    public final void b() {
        if (i() || c(this, 0L, 1, null)) {
            return;
        }
        i();
    }

    static /* synthetic */ boolean c(CoroutineScheduler coroutineScheduler, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = o.get(coroutineScheduler);
        }
        return coroutineScheduler.a(j);
    }

    private final boolean a(long j) {
        if (zdm.c(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0) < this.f39361a) {
            int iC = c();
            if (iC == 1 && this.f39361a > 1) {
                c();
            }
            if (iC > 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean i() {
        a aVarG;
        do {
            aVarG = g();
            if (aVarG == null) {
                return false;
            }
        } while (!a.e().compareAndSet(aVarG, -1, 0));
        LockSupport.unpark(aVarG);
        return true;
    }

    private final int c() {
        synchronized (this.f) {
            if (e()) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = o;
            long j = atomicLongFieldUpdater.get(this);
            int i2 = (int) (j & 2097151);
            int iC = zdm.c(i2 - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (iC >= this.f39361a) {
                return 0;
            }
            if (i2 >= this.g) {
                return 0;
            }
            int i3 = ((int) (o.get(this) & 2097151)) + 1;
            if (i3 <= 0 || this.f.c(i3) != null) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            a aVar = new a(this, i3);
            this.f.e(i3, aVar);
            if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            aVar.start();
            return iC + 1;
        }
    }

    private final Task a(a aVar, Task task, boolean z) {
        if (aVar == null || aVar.f39366c == WorkerState.TERMINATED || (task.taskContext.getD() == 0 && aVar.f39366c == WorkerState.BLOCKING)) {
            return task;
        }
        aVar.f39365b = true;
        return aVar.e.b(task, z);
    }

    private final a d() {
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !zcp.b(CoroutineScheduler.this, this)) {
            return null;
        }
        return aVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iB = this.f.b();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < iB; i7++) {
            a aVarC = this.f.c(i7);
            if (aVarC != null) {
                int iB2 = aVarC.e.b();
                int i8 = b.f39367a[aVarC.f39366c.ordinal()];
                if (i8 == 1) {
                    i4++;
                } else if (i8 == 2) {
                    i3++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iB2);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i8 == 3) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iB2);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i8 == 4) {
                    i5++;
                    if (iB2 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iB2);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i8 == 5) {
                    i6++;
                }
            }
        }
        long j = o.get(this);
        return this.j + '@' + classSimpleName.d(this) + "[Pool Size {core = " + this.f39361a + ", max = " + this.g + "}, Worker States {CPU = " + i2 + ", blocking = " + i3 + ", parked = " + i4 + ", dormant = " + i5 + ", terminated = " + i6 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f39362b.c() + ", global blocking queue size = " + this.f39363c.c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.f39361a - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    public final void a(Task task) {
        try {
            task.run();
            AbstractTimeSource abstractTimeSourceC = timeSource.c();
            if (abstractTimeSourceC != null) {
                abstractTimeSourceC.unTrackTask();
            }
        } catch (Throwable th) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
            } finally {
                AbstractTimeSource abstractTimeSourceC2 = timeSource.c();
                if (abstractTimeSourceC2 != null) {
                    abstractTimeSourceC2.unTrackTask();
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0005J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0010\u0010'\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0010\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020 H\u0002J\u0012\u0010*\u001a\u0004\u0018\u00010 2\u0006\u0010+\u001a\u00020\u000eH\u0002J\n\u0010,\u001a\u0004\u0018\u00010 H\u0002J\n\u0010-\u001a\u0004\u0018\u00010 H\u0002J\u0010\u0010.\u001a\u0004\u0018\u00010 2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010/\u001a\u00020%2\u0006\u00100\u001a\u00020\u0003H\u0002J\b\u00101\u001a\u00020\u000eH\u0002J\u0006\u00102\u001a\u00020\u000eJ\u000e\u00103\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u0003J\b\u00105\u001a\u00020%H\u0002J\n\u00106\u001a\u0004\u0018\u00010 H\u0002J\b\u00107\u001a\u00020%H\u0016J\u0006\u00108\u001a\u00020\u0010J\b\u00109\u001a\u00020%H\u0002J\b\u0010:\u001a\u00020\u000eH\u0002J\b\u0010;\u001a\u00020%H\u0002J\u000e\u0010<\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\u001dJ\u0016\u0010>\u001a\u0004\u0018\u00010 2\n\u0010?\u001a\u00060\u0003j\u0002`@H\u0002J\b\u0010A\u001a\u00020%H\u0002R$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00020\u00198Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0006\u0010\"\u001a\u00020#¨\u0006B"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "Ljava/lang/Thread;", "index", "", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V", "indexInArray", "getIndexInArray", "()I", "setIndexInArray", "(I)V", "localQueue", "Lkotlinx/coroutines/scheduling/WorkQueue;", "mayHaveLocalTasks", "", "minDelayUntilStealableTaskNs", "", "nextParkedWorker", "", "getNextParkedWorker", "()Ljava/lang/Object;", "setNextParkedWorker", "(Ljava/lang/Object;)V", "rngState", "scheduler", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "getScheduler", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "state", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "stolenTask", "Lkotlin/jvm/internal/Ref$ObjectRef;", "Lkotlinx/coroutines/scheduling/Task;", "terminationDeadline", "workerCtl", "Lkotlinx/atomicfu/AtomicInt;", "afterTask", "", "taskMode", "beforeTask", "executeTask", "task", "findAnyTask", "scanLocalQueue", "findBlockingTask", "findCpuTask", "findTask", "idleReset", Wpt.MODE, "inStack", "isIo", "nextInt", "upperBound", "park", "pollGlobalQueues", "run", "runSingleTask", "runWorker", "tryAcquireCpuPermit", "tryPark", "tryReleaseCpu", "newState", "trySteal", "stealingMode", "Lkotlinx/coroutines/scheduling/StealingMode;", "tryTerminateWorker", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f39364a = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f39365b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public WorkerState f39366c;
        public final zmz e;
        private long f;
        private long g;
        private final zcw.e<Task> h;
        private volatile int indexInArray;
        private int j;
        private volatile Object nextParkedWorker;

        @Volatile
        private volatile int workerCtl;

        private a() {
            setDaemon(true);
            this.e = new zmz();
            this.h = new zcw.e<>();
            this.f39366c = WorkerState.DORMANT;
            this.nextParkedWorker = CoroutineScheduler.d;
            this.j = Random.INSTANCE.nextInt();
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getIndexInArray() {
            return this.indexInArray;
        }

        public final void c(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.j);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public a(CoroutineScheduler coroutineScheduler, int i) {
            this();
            c(i);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Object getNextParkedWorker() {
            return this.nextParkedWorker;
        }

        public final void d(Object obj) {
            this.nextParkedWorker = obj;
        }

        private final boolean f() {
            long j;
            if (this.f39366c == WorkerState.CPU_ACQUIRED) {
                return true;
            }
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            AtomicLongFieldUpdater atomicLongFieldUpdater = CoroutineScheduler.o;
            do {
                j = atomicLongFieldUpdater.get(coroutineScheduler);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    return false;
                }
            } while (!CoroutineScheduler.o.compareAndSet(coroutineScheduler, j, j - 4398046511104L));
            this.f39366c = WorkerState.CPU_ACQUIRED;
            return true;
        }

        public final boolean d(WorkerState workerState) {
            WorkerState workerState2 = this.f39366c;
            boolean z = workerState2 == WorkerState.CPU_ACQUIRED;
            if (z) {
                CoroutineScheduler.o.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.f39366c = workerState;
            }
            return z;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            i();
        }

        private final void i() {
            loop0: while (true) {
                boolean z = false;
                while (true) {
                    if (CoroutineScheduler.this.e() || this.f39366c == WorkerState.TERMINATED) {
                        break loop0;
                    }
                    Task taskB = b(this.f39365b);
                    if (taskB != null) {
                        this.f = 0L;
                        a(taskB);
                        break;
                    }
                    this.f39365b = false;
                    if (this.f == 0) {
                        h();
                    } else {
                        if (z) {
                            d(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f);
                            this.f = 0L;
                            break;
                        }
                        z = true;
                    }
                }
            }
            d(WorkerState.TERMINATED);
        }

        private final void h() {
            if (!a()) {
                CoroutineScheduler.this.c(this);
                return;
            }
            f39364a.set(this, -1);
            while (a() && f39364a.get(this) == -1 && !CoroutineScheduler.this.e() && this.f39366c != WorkerState.TERMINATED) {
                d(WorkerState.PARKING);
                Thread.interrupted();
                g();
            }
        }

        private final boolean a() {
            return this.nextParkedWorker != CoroutineScheduler.d;
        }

        private final void b(int i) {
            if (i != 0 && d(WorkerState.BLOCKING)) {
                CoroutineScheduler.this.b();
            }
        }

        private final void e(int i) {
            if (i == 0) {
                return;
            }
            CoroutineScheduler.o.addAndGet(CoroutineScheduler.this, -2097152L);
            WorkerState workerState = this.f39366c;
            if (workerState != WorkerState.TERMINATED) {
                if (ASSERTIONS_ENABLED.a() && workerState != WorkerState.BLOCKING) {
                    throw new AssertionError();
                }
                this.f39366c = WorkerState.DORMANT;
            }
        }

        public final int d(int i) {
            int i2 = this.j;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.j = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        private final void g() {
            if (this.g == 0) {
                this.g = System.nanoTime() + CoroutineScheduler.this.h;
            }
            LockSupport.parkNanos(CoroutineScheduler.this.h);
            if (System.nanoTime() - this.g >= 0) {
                this.g = 0L;
                l();
            }
        }

        private final void l() {
            zmb<a> zmbVar = CoroutineScheduler.this.f;
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            synchronized (zmbVar) {
                if (coroutineScheduler.e()) {
                    return;
                }
                if (((int) (CoroutineScheduler.o.get(coroutineScheduler) & 2097151)) <= coroutineScheduler.f39361a) {
                    return;
                }
                if (f39364a.compareAndSet(this, -1, 1)) {
                    int i = this.indexInArray;
                    c(0);
                    coroutineScheduler.a(this, i, 0);
                    int andDecrement = (int) (CoroutineScheduler.o.getAndDecrement(coroutineScheduler) & 2097151);
                    if (andDecrement != i) {
                        a aVarC = coroutineScheduler.f.c(andDecrement);
                        zcp.e(aVarC);
                        a aVar = aVarC;
                        coroutineScheduler.f.e(i, aVar);
                        aVar.c(i);
                        coroutineScheduler.a(aVar, andDecrement, i);
                    }
                    coroutineScheduler.f.e(andDecrement, null);
                    yzc yzcVar = yzc.e;
                    this.f39366c = WorkerState.TERMINATED;
                }
            }
        }

        private final void a(int i) {
            this.g = 0L;
            if (this.f39366c == WorkerState.PARKING) {
                if (ASSERTIONS_ENABLED.a() && i != 1) {
                    throw new AssertionError();
                }
                this.f39366c = WorkerState.BLOCKING;
            }
        }

        public final Task b(boolean z) {
            return f() ? d(z) : c();
        }

        private final Task c() {
            Task taskD = this.e.d();
            if (taskD != null) {
                return taskD;
            }
            Task taskB = CoroutineScheduler.this.f39363c.b();
            return taskB == null ? j(1) : taskB;
        }

        private final Task d(boolean z) {
            Task taskJ;
            Task taskJ2;
            if (z) {
                boolean z2 = d(CoroutineScheduler.this.f39361a * 2) == 0;
                if (z2 && (taskJ2 = j()) != null) {
                    return taskJ2;
                }
                Task taskA = this.e.a();
                if (taskA != null) {
                    return taskA;
                }
                if (!z2 && (taskJ = j()) != null) {
                    return taskJ;
                }
            } else {
                Task taskJ3 = j();
                if (taskJ3 != null) {
                    return taskJ3;
                }
            }
            return j(3);
        }

        private final Task j() {
            if (d(2) == 0) {
                Task taskB = CoroutineScheduler.this.f39362b.b();
                return taskB != null ? taskB : CoroutineScheduler.this.f39363c.b();
            }
            Task taskB2 = CoroutineScheduler.this.f39363c.b();
            return taskB2 != null ? taskB2 : CoroutineScheduler.this.f39362b.b();
        }

        private final Task j(int i) {
            int i2 = (int) (CoroutineScheduler.o.get(CoroutineScheduler.this) & 2097151);
            if (i2 < 2) {
                return null;
            }
            int iD = d(i2);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long jMin = Long.MAX_VALUE;
            for (int i3 = 0; i3 < i2; i3++) {
                iD++;
                if (iD > i2) {
                    iD = 1;
                }
                a aVarC = coroutineScheduler.f.c(iD);
                if (aVarC != null && aVarC != this) {
                    long jD = aVarC.e.d(i, this.h);
                    if (jD == -1) {
                        Task task = this.h.f53983c;
                        this.h.f53983c = null;
                        return task;
                    }
                    if (jD > 0) {
                        jMin = Math.min(jMin, jD);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f = jMin;
            return null;
        }

        private final void a(Task task) {
            int d = task.taskContext.getD();
            a(d);
            b(d);
            CoroutineScheduler.this.a(task);
            e(d);
        }

        public static final AtomicIntegerFieldUpdater e() {
            return f39364a;
        }
    }

    private final boolean b(Task task) {
        if (task.taskContext.getD() == 1) {
            return this.f39363c.b(task);
        }
        return this.f39362b.b(task);
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39367a;

        static {
            int[] iArr = new int[WorkerState.values().length];
            try {
                iArr[WorkerState.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkerState.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkerState.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkerState.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f39367a = iArr;
        }
    }
}
