package com.facebook.internal;

import com.alipay.sdk.m.l.c;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.twitter.sdk.android.tweetcomposer.g;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \"2\u00020\u0001:\u0003\"#\bB\u001d\b\u0007\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0006\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0018\u00010\u0004R\u00020\u0000H\u0002J\u0014\u0010\b\u001a\u00020\u00022\n\u0010\u0007\u001a\u00060\u0004R\u00020\u0000H\u0002J\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007J\u0006\u0010\u000f\u001a\u00020\u0002R\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u001c\u0010\u0014\u001a\b\u0018\u00010\u0004R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u001c\u0010\u0015\u001a\b\u0018\u00010\u0004R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006$"}, d2 = {"Lcom/facebook/internal/WorkQueue;", "", "", "c", "Lcom/facebook/internal/WorkQueue$a;", "finished", "b", "node", "a", "Ljava/lang/Runnable;", "callback", "", "addToFront", "Lcom/facebook/internal/WorkQueue$WorkItem;", "addActiveWorkItem", c.j, "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "workLock", "Lcom/facebook/internal/WorkQueue$a;", "pendingJobs", "runningJobs", "", GoogleApiAvailabilityLight.a, LogUtil.I, "runningCount", "e", "maxConcurrent", "Ljava/util/concurrent/Executor;", "f", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(ILjava/util/concurrent/Executor;)V", "Companion", "WorkItem", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class WorkQueue {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int DEFAULT_MAX_CONCURRENT = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ReentrantLock workLock;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private a pendingJobs;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private a runningJobs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int runningCount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int maxConcurrent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Executor executor;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/facebook/internal/WorkQueue$Companion;", "", "", "condition", "", "a", "", "DEFAULT_MAX_CONCURRENT", LogUtil.I, "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(boolean condition) {
            if (!condition) {
                throw new FacebookException("Validation failed");
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&R\u0016\u0010\u0006\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/internal/WorkQueue$WorkItem;", "", "", g.g, "", "moveToFront", "isRunning", "()Z", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface WorkItem {
        boolean cancel();

        /* JADX INFO: renamed from: isRunning */
        boolean getIsRunning();

        void moveToFront();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\n\u001a\u00060\u0006R\u00020\u00072\f\u0010\b\u001a\b\u0018\u00010\u0006R\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002J\u001a\u0010\u000b\u001a\b\u0018\u00010\u0006R\u00020\u00072\f\u0010\b\u001a\b\u0018\u00010\u0006R\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002R0\u0010\u0012\u001a\b\u0018\u00010\u0006R\u00020\u00072\f\u0010\u000e\u001a\b\u0018\u00010\u0006R\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\b\u0018\u00010\u0006R\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001d\u001a\u00020\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u0013\u0010\u001c¨\u0006 "}, d2 = {"com/facebook/internal/WorkQueue$a", "Lcom/facebook/internal/WorkQueue$WorkItem;", "", g.g, "", "moveToFront", "Lcom/facebook/internal/WorkQueue$a;", "Lcom/facebook/internal/WorkQueue;", "list", "addToFront", "a", GoogleApiAvailabilityLight.a, "shouldBeRunning", "f", "<set-?>", "Lcom/facebook/internal/WorkQueue$a;", "c", "()Lcom/facebook/internal/WorkQueue$a;", "next", "b", "prev", "Z", "isRunning", "()Z", "e", "(Z)V", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "()Ljava/lang/Runnable;", "callback", "<init>", "(Lcom/facebook/internal/WorkQueue;Ljava/lang/Runnable;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public final class a implements WorkItem {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private a next;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private a prev;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private boolean isRunning;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final Runnable callback;

        public a(Runnable runnable) {
            this.callback = runnable;
        }

        @NotNull
        public final a a(@Nullable a list, boolean addToFront) {
            Companion companion = WorkQueue.INSTANCE;
            companion.a(this.next == null);
            companion.a(this.prev == null);
            if (list == null) {
                this.prev = this;
                this.next = this;
                list = this;
            } else {
                this.next = list;
                a aVar = list.prev;
                this.prev = aVar;
                if (aVar != null) {
                    aVar.next = this;
                }
                a aVar2 = this.next;
                if (aVar2 != null) {
                    aVar2.prev = aVar != null ? aVar.next : null;
                }
            }
            return addToFront ? this : list;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Runnable getCallback() {
            return this.callback;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final a getNext() {
            return this.next;
        }

        @Override // com.facebook.internal.WorkQueue.WorkItem
        public boolean cancel() {
            ReentrantLock reentrantLock = WorkQueue.this.workLock;
            reentrantLock.lock();
            try {
                if (getIsRunning()) {
                    Unit unit = Unit.INSTANCE;
                    return false;
                }
                WorkQueue workQueue = WorkQueue.this;
                workQueue.pendingJobs = d(workQueue.pendingJobs);
                return true;
            } finally {
                reentrantLock.unlock();
            }
        }

        @Nullable
        public final a d(@Nullable a list) {
            Companion companion = WorkQueue.INSTANCE;
            companion.a(this.next != null);
            companion.a(this.prev != null);
            if (list == this && (list = this.next) == this) {
                list = null;
            }
            a aVar = this.next;
            if (aVar != null) {
                aVar.prev = this.prev;
            }
            a aVar2 = this.prev;
            if (aVar2 != null) {
                aVar2.next = aVar;
            }
            this.prev = null;
            this.next = null;
            return list;
        }

        public void e(boolean z) {
            this.isRunning = z;
        }

        public final void f(boolean shouldBeRunning) {
            a aVar;
            a aVar2;
            Companion companion = WorkQueue.INSTANCE;
            a aVar3 = this.prev;
            if (aVar3 == null || (aVar = aVar3.next) == null) {
                aVar = this;
            }
            companion.a(aVar == this);
            a aVar4 = this.next;
            if (aVar4 == null || (aVar2 = aVar4.prev) == null) {
                aVar2 = this;
            }
            companion.a(aVar2 == this);
            companion.a(getIsRunning() == shouldBeRunning);
        }

        @Override // com.facebook.internal.WorkQueue.WorkItem
        /* JADX INFO: renamed from: isRunning, reason: from getter */
        public boolean getIsRunning() {
            return this.isRunning;
        }

        @Override // com.facebook.internal.WorkQueue.WorkItem
        public void moveToFront() {
            ReentrantLock reentrantLock = WorkQueue.this.workLock;
            reentrantLock.lock();
            try {
                if (!getIsRunning()) {
                    WorkQueue workQueue = WorkQueue.this;
                    workQueue.pendingJobs = d(workQueue.pendingJobs);
                    WorkQueue workQueue2 = WorkQueue.this;
                    workQueue2.pendingJobs = a(workQueue2.pendingJobs, true);
                }
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b implements Runnable {
        public final /* synthetic */ a b;

        public b(a aVar) {
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    this.b.getCallback().run();
                } finally {
                    WorkQueue.this.b(this.b);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public WorkQueue() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public WorkQueue(int i) {
        this(i, null, 2, 0 == true ? 1 : 0);
    }

    @JvmOverloads
    public WorkQueue(int i, @NotNull Executor executor) {
        this.maxConcurrent = i;
        this.executor = executor;
        this.workLock = new ReentrantLock();
    }

    private final void a(a node) {
        this.executor.execute(new b(node));
    }

    public static /* synthetic */ WorkItem addActiveWorkItem$default(WorkQueue workQueue, Runnable runnable, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return workQueue.addActiveWorkItem(runnable, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(a finished) {
        a aVar;
        this.workLock.lock();
        if (finished != null) {
            this.runningJobs = finished.d(this.runningJobs);
            this.runningCount--;
        }
        if (this.runningCount < this.maxConcurrent) {
            aVar = this.pendingJobs;
            if (aVar != null) {
                this.pendingJobs = aVar.d(aVar);
                this.runningJobs = aVar.a(this.runningJobs, false);
                this.runningCount++;
                aVar.e(true);
            }
        } else {
            aVar = null;
        }
        this.workLock.unlock();
        if (aVar != null) {
            a(aVar);
        }
    }

    private final void c() {
        b(null);
    }

    @JvmOverloads
    @NotNull
    public final WorkItem addActiveWorkItem(@NotNull Runnable runnable) {
        return addActiveWorkItem$default(this, runnable, false, 2, null);
    }

    @JvmOverloads
    @NotNull
    public final WorkItem addActiveWorkItem(@NotNull Runnable callback, boolean addToFront) {
        a aVar = new a(callback);
        ReentrantLock reentrantLock = this.workLock;
        reentrantLock.lock();
        try {
            this.pendingJobs = aVar.a(this.pendingJobs, addToFront);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            c();
            return aVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void validate() {
        ReentrantLock reentrantLock = this.workLock;
        reentrantLock.lock();
        try {
            a next = this.runningJobs;
            int i = 0;
            if (next != null) {
                do {
                    if (next == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    next.f(true);
                    i++;
                    next = next.getNext();
                } while (next != this.runningJobs);
            }
            INSTANCE.a(this.runningCount == i);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public /* synthetic */ WorkQueue(int i, Executor executor, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 8 : i, (i2 & 2) != 0 ? FacebookSdk.getExecutor() : executor);
    }
}
