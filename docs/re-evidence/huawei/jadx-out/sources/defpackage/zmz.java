package defpackage;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.scheduling.Task;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007J\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001aH\u0002J\u0012\u0010!\u001a\u0004\u0018\u00010\u00072\u0006\u0010\"\u001a\u00020\u0015H\u0002J\u0016\u0010#\u001a\u0004\u0018\u00010\u00072\n\u0010$\u001a\u00060\tj\u0002`%H\u0002J\u001a\u0010&\u001a\u0004\u0018\u00010\u00072\u0006\u0010'\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0015H\u0002J\"\u0010(\u001a\u00020)2\n\u0010$\u001a\u00060\tj\u0002`%2\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070+J$\u0010,\u001a\u00020)2\n\u0010$\u001a\u00060\tj\u0002`%2\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070+H\u0002J\u000e\u0010-\u001a\u00020\u0018*\u0004\u0018\u00010\u0007H\u0002R\t\u0010\u0003\u001a\u00020\u0004X\u0082\u0004R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\t\u0010\f\u001a\u00020\u0004X\u0082\u0004R\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000eX\u0082\u0004R\t\u0010\u000f\u001a\u00020\u0004X\u0082\u0004R\u0014\u0010\u0010\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b¨\u0006."}, d2 = {"Lkotlinx/coroutines/scheduling/WorkQueue;", "", "()V", "blockingTasksInBuffer", "Lkotlinx/atomicfu/AtomicInt;", "buffer", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Lkotlinx/coroutines/scheduling/Task;", "bufferSize", "", "getBufferSize", "()I", "consumerIndex", "lastScheduledTask", "Lkotlinx/atomicfu/AtomicRef;", "producerIndex", "size", "getSize$kotlinx_coroutines_core", "add", "task", "fair", "", "addLast", "offloadAllWorkTo", "", "globalQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "poll", "pollBlocking", "pollBuffer", "pollCpu", "pollTo", "queue", "pollWithExclusiveMode", "onlyBlocking", "stealWithExclusiveMode", "stealingMode", "Lkotlinx/coroutines/scheduling/StealingMode;", "tryExtractFromTheMiddle", "index", "trySteal", "", "stolenTaskRef", "Lkotlin/jvm/internal/Ref$ObjectRef;", "tryStealLastScheduled", "decrementIfBlocking", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class zmz {

    @Volatile
    private volatile int blockingTasksInBuffer;

    @Volatile
    private volatile int consumerIndex;
    private final AtomicReferenceArray<Task> d = new AtomicReferenceArray<>(128);

    @Volatile
    private volatile Object lastScheduledTask;

    @Volatile
    private volatile int producerIndex;
    private static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(zmz.class, Object.class, "lastScheduledTask");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f54323b = AtomicIntegerFieldUpdater.newUpdater(zmz.class, "producerIndex");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f54322a = AtomicIntegerFieldUpdater.newUpdater(zmz.class, "consumerIndex");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f54324c = AtomicIntegerFieldUpdater.newUpdater(zmz.class, "blockingTasksInBuffer");

    private final int c() {
        return f54323b.get(this) - f54322a.get(this);
    }

    public final int b() {
        return e.get(this) != null ? c() + 1 : c();
    }

    public final Task a() {
        Task task = (Task) e.getAndSet(this, null);
        return task == null ? e() : task;
    }

    public final Task b(Task task, boolean z) {
        if (z) {
            return c(task);
        }
        Task task2 = (Task) e.getAndSet(this, task);
        if (task2 == null) {
            return null;
        }
        return c(task2);
    }

    private final Task c(Task task) {
        if (c() == 127) {
            return task;
        }
        if (task.taskContext.getD() == 1) {
            f54324c.incrementAndGet(this);
        }
        int i = f54323b.get(this) & 127;
        while (this.d.get(i) != null) {
            Thread.yield();
        }
        this.d.lazySet(i, task);
        f54323b.incrementAndGet(this);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d(int i, zcw.e<Task> eVar) {
        Task taskE;
        T t;
        Task taskE2;
        if (i == 3) {
            taskE2 = e();
        } else {
            taskE = e(i);
        }
        if (t != 0) {
            t = taskE;
            t = taskE2;
            eVar.f53983c = t;
            return -1L;
        }
        t = taskE;
        t = taskE2;
        return e(i, eVar);
    }

    private final Task e(int i) {
        Task taskA;
        int i2 = f54322a.get(this);
        int i3 = f54323b.get(this);
        boolean z = i == 1;
        while (true) {
            taskA = null;
            if (i2 == i3) {
                break;
            }
            if (!z || f54324c.get(this) != 0) {
                taskA = a(i2, z);
                if (taskA != null) {
                    break;
                }
                i2++;
            } else {
                return null;
            }
        }
        return taskA;
    }

    public final Task d() {
        return e(true);
    }

    private final Task e(boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Task task;
        do {
            atomicReferenceFieldUpdater = e;
            task = (Task) atomicReferenceFieldUpdater.get(this);
            if (task != null) {
                if ((task.taskContext.getD() == 1) == z) {
                }
            }
            int i = f54322a.get(this);
            int i2 = f54323b.get(this);
            while (i != i2) {
                if (z && f54324c.get(this) == 0) {
                    return null;
                }
                i2--;
                Task taskA = a(i2, z);
                if (taskA != null) {
                    return taskA;
                }
            }
            return null;
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, task, null));
        return task;
    }

    private final Task a(int i, boolean z) {
        int i2 = i & 127;
        Task task = this.d.get(i2);
        if (task != null) {
            if ((task.taskContext.getD() == 1) == z && arj.b(this.d, i2, task, null)) {
                if (z) {
                    f54324c.decrementAndGet(this);
                }
                return task;
            }
        }
        return null;
    }

    public final void d(zms zmsVar) {
        Task task = (Task) e.getAndSet(this, null);
        if (task != null) {
            zmsVar.b(task);
        }
        while (c(zmsVar)) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object, kotlinx.coroutines.scheduling.Task] */
    private final long e(int i, zcw.e<Task> eVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? r1;
        do {
            atomicReferenceFieldUpdater = e;
            r1 = (Task) atomicReferenceFieldUpdater.get(this);
            if (r1 == 0) {
                return -2L;
            }
            if (((r1.taskContext.getD() != 1 ? 2 : 1) & i) == 0) {
                return -2L;
            }
            long jNanoTime = BlockingContext.j.nanoTime() - r1.submissionTime;
            if (jNanoTime < BlockingContext.i) {
                return BlockingContext.i - jNanoTime;
            }
        } while (!AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, r1, null));
        eVar.f53983c = r1;
        return -1L;
    }

    private final boolean c(zms zmsVar) {
        Task taskE = e();
        if (taskE == null) {
            return false;
        }
        zmsVar.b(taskE);
        return true;
    }

    private final Task e() {
        Task andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f54322a;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f54323b.get(this) == 0) {
                return null;
            }
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (andSet = this.d.getAndSet(i & 127, null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    private final void d(Task task) {
        if (task == null || task.taskContext.getD() != 1) {
            return;
        }
        int iDecrementAndGet = f54324c.decrementAndGet(this);
        if (ASSERTIONS_ENABLED.a() && iDecrementAndGet < 0) {
            throw new AssertionError();
        }
    }
}
