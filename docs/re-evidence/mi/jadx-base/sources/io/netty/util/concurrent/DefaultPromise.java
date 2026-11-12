package io.netty.util.concurrent;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.q10;
import io.netty.util.internal.InternalThreadLocalMap;
import io.netty.util.internal.ObjectUtil;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.StringUtil;
import io.netty.util.internal.SystemPropertyUtil;
import io.netty.util.internal.ThrowableUtil;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultPromise<V> extends AbstractFuture<V> implements Promise<V> {
    private static final CauseHolder CANCELLATION_CAUSE_HOLDER;
    private static final StackTraceElement[] CANCELLATION_STACK;
    private final EventExecutor executor;
    private Object listeners;
    private boolean notifyingListeners;
    private volatile Object result;
    private short waiters;
    private static final InternalLogger logger = InternalLoggerFactory.getInstance((Class<?>) DefaultPromise.class);
    private static final InternalLogger rejectedExecutionLogger = InternalLoggerFactory.getInstance(DefaultPromise.class.getName() + ".rejectedExecution");
    private static final int MAX_LISTENER_STACK_DEPTH = Math.min(8, SystemPropertyUtil.getInt("io.netty.defaultPromise.maxListenerStackDepth", 8));
    private static final AtomicReferenceFieldUpdater<DefaultPromise, Object> RESULT_UPDATER = AtomicReferenceFieldUpdater.newUpdater(DefaultPromise.class, Object.class, "result");
    private static final Object SUCCESS = new Object();
    private static final Object UNCANCELLABLE = new Object();

    public static final class CauseHolder {
        final Throwable cause;

        public CauseHolder(Throwable th) {
            this.cause = th;
        }
    }

    public static final class LeanCancellationException extends CancellationException {
        private static final long serialVersionUID = 2794674970981187807L;

        private LeanCancellationException() {
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            setStackTrace(DefaultPromise.CANCELLATION_STACK);
            return this;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return CancellationException.class.getName();
        }
    }

    static {
        CauseHolder causeHolder = new CauseHolder(ThrowableUtil.unknownStackTrace(new CancellationException(), DefaultPromise.class, "cancel(...)"));
        CANCELLATION_CAUSE_HOLDER = causeHolder;
        CANCELLATION_STACK = causeHolder.cause.getStackTrace();
    }

    public DefaultPromise(EventExecutor eventExecutor) {
        this.executor = (EventExecutor) ObjectUtil.checkNotNull(eventExecutor, "executor");
    }

    private void addListener0(GenericFutureListener<? extends Future<? super V>> genericFutureListener) {
        Object obj = this.listeners;
        if (obj == null) {
            this.listeners = genericFutureListener;
        } else if (obj instanceof DefaultFutureListeners) {
            ((DefaultFutureListeners) obj).add(genericFutureListener);
        } else {
            this.listeners = new DefaultFutureListeners((GenericFutureListener) obj, genericFutureListener);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x008a */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0091, code lost:
    
        r13 = th;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean await0(long r13, boolean r15) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r12.isDone()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            r2 = 0
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 > 0) goto L13
            boolean r13 = r12.isDone()
            return r13
        L13:
            if (r15 == 0) goto L26
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L1c
            goto L26
        L1c:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException
            java.lang.String r14 = r12.toString()
            r13.<init>(r14)
            throw r13
        L26:
            r12.checkDeadLock()
            long r4 = java.lang.System.nanoTime()
            r0 = 0
            r6 = r13
        L2f:
            monitor-enter(r12)     // Catch: java.lang.Throwable -> L88
            boolean r8 = r12.isDone()     // Catch: java.lang.Throwable -> L41
            if (r8 == 0) goto L44
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L40
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            r13.interrupt()
        L40:
            return r1
        L41:
            r13 = move-exception
            r1 = r0
            goto L91
        L44:
            r12.incWaiters()     // Catch: java.lang.Throwable -> L41
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r6 / r8
            long r6 = r6 % r8
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L55 java.lang.InterruptedException -> L57
            r12.wait(r10, r6)     // Catch: java.lang.Throwable -> L55 java.lang.InterruptedException -> L57
            r12.decWaiters()     // Catch: java.lang.Throwable -> L41
            goto L5e
        L55:
            r13 = move-exception
            goto L8d
        L57:
            r6 = move-exception
            if (r15 != 0) goto L8c
            r12.decWaiters()     // Catch: java.lang.Throwable -> L8a
            r0 = r1
        L5e:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L41
            boolean r6 = r12.isDone()     // Catch: java.lang.Throwable -> L88
            if (r6 == 0) goto L6f
            if (r0 == 0) goto L6e
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            r13.interrupt()
        L6e:
            return r1
        L6f:
            long r6 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L88
            long r6 = r6 - r4
            long r6 = r13 - r6
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 > 0) goto L2f
            boolean r13 = r12.isDone()     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L87
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            r14.interrupt()
        L87:
            return r13
        L88:
            r13 = move-exception
            goto L95
        L8a:
            r13 = move-exception
            goto L91
        L8c:
            throw r6     // Catch: java.lang.Throwable -> L55
        L8d:
            r12.decWaiters()     // Catch: java.lang.Throwable -> L41
            throw r13     // Catch: java.lang.Throwable -> L41
        L91:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L8a
            throw r13     // Catch: java.lang.Throwable -> L93
        L93:
            r13 = move-exception
            r0 = r1
        L95:
            if (r0 == 0) goto L9e
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            r14.interrupt()
        L9e:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.concurrent.DefaultPromise.await0(long, boolean):boolean");
    }

    private Throwable cause0(Object obj) {
        if (!(obj instanceof CauseHolder)) {
            return null;
        }
        CauseHolder causeHolder = CANCELLATION_CAUSE_HOLDER;
        if (obj == causeHolder) {
            LeanCancellationException leanCancellationException = new LeanCancellationException();
            if (q10.a(RESULT_UPDATER, this, causeHolder, new CauseHolder(leanCancellationException))) {
                return leanCancellationException;
            }
            obj = this.result;
        }
        return ((CauseHolder) obj).cause;
    }

    private synchronized boolean checkNotifyWaiters() {
        try {
            if (this.waiters > 0) {
                notifyAll();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.listeners != null;
    }

    private void decWaiters() {
        this.waiters = (short) (this.waiters - 1);
    }

    private void incWaiters() {
        short s = this.waiters;
        if (s != Short.MAX_VALUE) {
            this.waiters = (short) (s + 1);
            return;
        }
        throw new IllegalStateException("too many waiters: " + this);
    }

    private static boolean isCancelled0(Object obj) {
        return (obj instanceof CauseHolder) && (((CauseHolder) obj).cause instanceof CancellationException);
    }

    private static boolean isDone0(Object obj) {
        return (obj == null || obj == UNCANCELLABLE) ? false : true;
    }

    public static void notifyListener(EventExecutor eventExecutor, Future<?> future, GenericFutureListener<?> genericFutureListener) {
        notifyListenerWithStackOverFlowProtection((EventExecutor) ObjectUtil.checkNotNull(eventExecutor, "eventExecutor"), (Future) ObjectUtil.checkNotNull(future, "future"), (GenericFutureListener) ObjectUtil.checkNotNull(genericFutureListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void notifyListener0(Future future, GenericFutureListener genericFutureListener) {
        try {
            genericFutureListener.operationComplete(future);
        } catch (Throwable th) {
            if (logger.isWarnEnabled()) {
                logger.warn("An exception was thrown by " + genericFutureListener.getClass().getName() + ".operationComplete()", th);
            }
        }
    }

    private static void notifyListenerWithStackOverFlowProtection(EventExecutor eventExecutor, final Future<?> future, final GenericFutureListener<?> genericFutureListener) {
        InternalThreadLocalMap internalThreadLocalMap;
        int iFutureListenerStackDepth;
        if (!eventExecutor.inEventLoop() || (iFutureListenerStackDepth = (internalThreadLocalMap = InternalThreadLocalMap.get()).futureListenerStackDepth()) >= MAX_LISTENER_STACK_DEPTH) {
            safeExecute(eventExecutor, new Runnable() { // from class: io.netty.util.concurrent.DefaultPromise.2
                @Override // java.lang.Runnable
                public void run() {
                    DefaultPromise.notifyListener0(future, genericFutureListener);
                }
            });
            return;
        }
        internalThreadLocalMap.setFutureListenerStackDepth(iFutureListenerStackDepth + 1);
        try {
            notifyListener0(future, genericFutureListener);
        } finally {
            internalThreadLocalMap.setFutureListenerStackDepth(iFutureListenerStackDepth);
        }
    }

    private void notifyListeners() {
        InternalThreadLocalMap internalThreadLocalMap;
        int iFutureListenerStackDepth;
        EventExecutor eventExecutorExecutor = executor();
        if (!eventExecutorExecutor.inEventLoop() || (iFutureListenerStackDepth = (internalThreadLocalMap = InternalThreadLocalMap.get()).futureListenerStackDepth()) >= MAX_LISTENER_STACK_DEPTH) {
            safeExecute(eventExecutorExecutor, new Runnable() { // from class: io.netty.util.concurrent.DefaultPromise.1
                @Override // java.lang.Runnable
                public void run() {
                    DefaultPromise.this.notifyListenersNow();
                }
            });
            return;
        }
        internalThreadLocalMap.setFutureListenerStackDepth(iFutureListenerStackDepth + 1);
        try {
            notifyListenersNow();
        } finally {
            internalThreadLocalMap.setFutureListenerStackDepth(iFutureListenerStackDepth);
        }
    }

    private void notifyListeners0(DefaultFutureListeners defaultFutureListeners) {
        GenericFutureListener<? extends Future<?>>[] genericFutureListenerArrListeners = defaultFutureListeners.listeners();
        int size = defaultFutureListeners.size();
        for (int i = 0; i < size; i++) {
            notifyListener0(this, genericFutureListenerArrListeners[i]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyListenersNow() {
        Object obj;
        synchronized (this) {
            if (!this.notifyingListeners && (obj = this.listeners) != null) {
                this.notifyingListeners = true;
                this.listeners = null;
                while (true) {
                    if (obj instanceof DefaultFutureListeners) {
                        notifyListeners0((DefaultFutureListeners) obj);
                    } else {
                        notifyListener0(this, (GenericFutureListener) obj);
                    }
                    synchronized (this) {
                        try {
                            obj = this.listeners;
                            if (obj == null) {
                                this.notifyingListeners = false;
                                return;
                            }
                            this.listeners = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void notifyProgressiveListener0(ProgressiveFuture progressiveFuture, GenericProgressiveFutureListener genericProgressiveFutureListener, long j, long j2) {
        try {
            genericProgressiveFutureListener.operationProgressed(progressiveFuture, j, j2);
        } catch (Throwable th) {
            if (logger.isWarnEnabled()) {
                logger.warn("An exception was thrown by " + genericProgressiveFutureListener.getClass().getName() + ".operationProgressed()", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void notifyProgressiveListeners0(ProgressiveFuture<?> progressiveFuture, GenericProgressiveFutureListener<?>[] genericProgressiveFutureListenerArr, long j, long j2) {
        for (GenericProgressiveFutureListener<?> genericProgressiveFutureListener : genericProgressiveFutureListenerArr) {
            if (genericProgressiveFutureListener == null) {
                return;
            }
            notifyProgressiveListener0(progressiveFuture, genericProgressiveFutureListener, j, j2);
        }
    }

    private synchronized Object progressiveListeners() {
        Object obj = this.listeners;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof DefaultFutureListeners)) {
            if (obj instanceof GenericProgressiveFutureListener) {
                return obj;
            }
            return null;
        }
        DefaultFutureListeners defaultFutureListeners = (DefaultFutureListeners) obj;
        int iProgressiveSize = defaultFutureListeners.progressiveSize();
        if (iProgressiveSize == 0) {
            return null;
        }
        int i = 0;
        if (iProgressiveSize == 1) {
            GenericFutureListener<? extends Future<?>>[] genericFutureListenerArrListeners = defaultFutureListeners.listeners();
            int length = genericFutureListenerArrListeners.length;
            while (i < length) {
                GenericFutureListener<? extends Future<?>> genericFutureListener = genericFutureListenerArrListeners[i];
                if (genericFutureListener instanceof GenericProgressiveFutureListener) {
                    return genericFutureListener;
                }
                i++;
            }
            return null;
        }
        GenericFutureListener<? extends Future<?>>[] genericFutureListenerArrListeners2 = defaultFutureListeners.listeners();
        GenericProgressiveFutureListener[] genericProgressiveFutureListenerArr = new GenericProgressiveFutureListener[iProgressiveSize];
        int i2 = 0;
        while (i < iProgressiveSize) {
            GenericFutureListener<? extends Future<?>> genericFutureListener2 = genericFutureListenerArrListeners2[i2];
            if (genericFutureListener2 instanceof GenericProgressiveFutureListener) {
                int i3 = i + 1;
                genericProgressiveFutureListenerArr[i] = (GenericProgressiveFutureListener) genericFutureListener2;
                i = i3;
            }
            i2++;
        }
        return genericProgressiveFutureListenerArr;
    }

    private void removeListener0(GenericFutureListener<? extends Future<? super V>> genericFutureListener) {
        Object obj = this.listeners;
        if (obj instanceof DefaultFutureListeners) {
            ((DefaultFutureListeners) obj).remove(genericFutureListener);
        } else if (obj == genericFutureListener) {
            this.listeners = null;
        }
    }

    private void rethrowIfFailed() throws Throwable {
        Throwable thCause = cause();
        if (thCause == null) {
            return;
        }
        PlatformDependent.throwException(thCause);
    }

    private static void safeExecute(EventExecutor eventExecutor, Runnable runnable) {
        try {
            eventExecutor.execute(runnable);
        } catch (Throwable th) {
            rejectedExecutionLogger.error("Failed to submit a listener notification task. Event loop shut down?", th);
        }
    }

    private boolean setFailure0(Throwable th) {
        return setValue0(new CauseHolder((Throwable) ObjectUtil.checkNotNull(th, "cause")));
    }

    private boolean setSuccess0(V v) {
        if (v == null) {
            v = (V) SUCCESS;
        }
        return setValue0(v);
    }

    private boolean setValue0(Object obj) {
        AtomicReferenceFieldUpdater<DefaultPromise, Object> atomicReferenceFieldUpdater = RESULT_UPDATER;
        if (!q10.a(atomicReferenceFieldUpdater, this, null, obj) && !q10.a(atomicReferenceFieldUpdater, this, UNCANCELLABLE, obj)) {
            return false;
        }
        if (!checkNotifyWaiters()) {
            return true;
        }
        notifyListeners();
        return true;
    }

    @Override // io.netty.util.concurrent.Future, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (!q10.a(RESULT_UPDATER, this, null, CANCELLATION_CAUSE_HOLDER)) {
            return false;
        }
        if (!checkNotifyWaiters()) {
            return true;
        }
        notifyListeners();
        return true;
    }

    @Override // io.netty.util.concurrent.Future
    public Throwable cause() {
        return cause0(this.result);
    }

    public void checkDeadLock() {
        EventExecutor eventExecutorExecutor = executor();
        if (eventExecutorExecutor != null && eventExecutorExecutor.inEventLoop()) {
            throw new BlockingOperationException(toString());
        }
    }

    public EventExecutor executor() {
        return this.executor;
    }

    @Override // io.netty.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        V v = (V) this.result;
        if (!isDone0(v)) {
            await();
            v = (V) this.result;
        }
        if (v == SUCCESS || v == UNCANCELLABLE) {
            return null;
        }
        Throwable thCause0 = cause0(v);
        if (thCause0 == null) {
            return v;
        }
        if (thCause0 instanceof CancellationException) {
            throw ((CancellationException) thCause0);
        }
        throw new ExecutionException(thCause0);
    }

    @Override // io.netty.util.concurrent.Future
    public V getNow() {
        V v = (V) this.result;
        if ((v instanceof CauseHolder) || v == SUCCESS || v == UNCANCELLABLE) {
            return null;
        }
        return v;
    }

    @Override // io.netty.util.concurrent.Future
    public boolean isCancellable() {
        return this.result == null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return isCancelled0(this.result);
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return isDone0(this.result);
    }

    @Override // io.netty.util.concurrent.Future
    public boolean isSuccess() {
        Object obj = this.result;
        return (obj == null || obj == UNCANCELLABLE || (obj instanceof CauseHolder)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void notifyProgressiveListeners(final long j, final long j2) {
        Object objProgressiveListeners = progressiveListeners();
        if (objProgressiveListeners == null) {
            return;
        }
        final ProgressiveFuture progressiveFuture = (ProgressiveFuture) this;
        EventExecutor eventExecutorExecutor = executor();
        if (eventExecutorExecutor.inEventLoop()) {
            if (objProgressiveListeners instanceof GenericProgressiveFutureListener[]) {
                notifyProgressiveListeners0(progressiveFuture, (GenericProgressiveFutureListener[]) objProgressiveListeners, j, j2);
                return;
            } else {
                notifyProgressiveListener0(progressiveFuture, (GenericProgressiveFutureListener) objProgressiveListeners, j, j2);
                return;
            }
        }
        if (objProgressiveListeners instanceof GenericProgressiveFutureListener[]) {
            final GenericProgressiveFutureListener[] genericProgressiveFutureListenerArr = (GenericProgressiveFutureListener[]) objProgressiveListeners;
            safeExecute(eventExecutorExecutor, new Runnable() { // from class: io.netty.util.concurrent.DefaultPromise.3
                @Override // java.lang.Runnable
                public void run() {
                    DefaultPromise.notifyProgressiveListeners0(progressiveFuture, genericProgressiveFutureListenerArr, j, j2);
                }
            });
        } else {
            final GenericProgressiveFutureListener genericProgressiveFutureListener = (GenericProgressiveFutureListener) objProgressiveListeners;
            safeExecute(eventExecutorExecutor, new Runnable() { // from class: io.netty.util.concurrent.DefaultPromise.4
                @Override // java.lang.Runnable
                public void run() {
                    DefaultPromise.notifyProgressiveListener0(progressiveFuture, genericProgressiveFutureListener, j, j2);
                }
            });
        }
    }

    public Promise<V> setFailure(Throwable th) {
        if (setFailure0(th)) {
            return this;
        }
        throw new IllegalStateException("complete already: " + this, th);
    }

    public Promise<V> setSuccess(V v) {
        if (setSuccess0(v)) {
            return this;
        }
        throw new IllegalStateException("complete already: " + this);
    }

    @Override // io.netty.util.concurrent.Promise
    public boolean setUncancellable() {
        if (q10.a(RESULT_UPDATER, this, null, UNCANCELLABLE)) {
            return true;
        }
        Object obj = this.result;
        return (isDone0(obj) && isCancelled0(obj)) ? false : true;
    }

    public String toString() {
        return toStringBuilder().toString();
    }

    public StringBuilder toStringBuilder() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(StringUtil.simpleClassName(this));
        sb.append('@');
        sb.append(Integer.toHexString(hashCode()));
        Object obj = this.result;
        if (obj == SUCCESS) {
            sb.append("(success)");
        } else if (obj == UNCANCELLABLE) {
            sb.append("(uncancellable)");
        } else if (obj instanceof CauseHolder) {
            sb.append("(failure: ");
            sb.append(((CauseHolder) obj).cause);
            sb.append(')');
        } else if (obj != null) {
            sb.append("(success: ");
            sb.append(obj);
            sb.append(')');
        } else {
            sb.append("(incomplete)");
        }
        return sb;
    }

    @Override // io.netty.util.concurrent.Promise
    public boolean tryFailure(Throwable th) {
        return setFailure0(th);
    }

    @Override // io.netty.util.concurrent.Promise
    public boolean trySuccess(V v) {
        return setSuccess0(v);
    }

    @Override // io.netty.util.concurrent.Future
    public Promise<V> addListener(GenericFutureListener<? extends Future<? super V>> genericFutureListener) {
        ObjectUtil.checkNotNull(genericFutureListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this) {
            addListener0(genericFutureListener);
        }
        if (isDone()) {
            notifyListeners();
        }
        return this;
    }

    @Override // io.netty.util.concurrent.Future
    public Promise<V> addListeners(GenericFutureListener<? extends Future<? super V>>... genericFutureListenerArr) {
        ObjectUtil.checkNotNull(genericFutureListenerArr, "listeners");
        synchronized (this) {
            try {
                for (GenericFutureListener<? extends Future<? super V>> genericFutureListener : genericFutureListenerArr) {
                    if (genericFutureListener == null) {
                        break;
                    }
                    addListener0(genericFutureListener);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (isDone()) {
            notifyListeners();
        }
        return this;
    }

    @Override // io.netty.util.concurrent.Future
    public Promise<V> await() throws InterruptedException {
        if (isDone()) {
            return this;
        }
        if (Thread.interrupted()) {
            throw new InterruptedException(toString());
        }
        checkDeadLock();
        synchronized (this) {
            while (!isDone()) {
                try {
                    incWaiters();
                    try {
                        wait();
                        decWaiters();
                    } catch (Throwable th) {
                        decWaiters();
                        throw th;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this;
    }

    @Override // io.netty.util.concurrent.Future
    public Promise<V> awaitUninterruptibly() {
        boolean z;
        if (isDone()) {
            return this;
        }
        checkDeadLock();
        synchronized (this) {
            z = false;
            while (!isDone()) {
                try {
                    incWaiters();
                    try {
                        wait();
                        decWaiters();
                    } catch (InterruptedException unused) {
                        decWaiters();
                        z = true;
                    } catch (Throwable th) {
                        decWaiters();
                        throw th;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return this;
    }

    @Override // io.netty.util.concurrent.Future
    public Promise<V> removeListener(GenericFutureListener<? extends Future<? super V>> genericFutureListener) {
        ObjectUtil.checkNotNull(genericFutureListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        synchronized (this) {
            removeListener0(genericFutureListener);
        }
        return this;
    }

    @Override // io.netty.util.concurrent.Future
    public Promise<V> removeListeners(GenericFutureListener<? extends Future<? super V>>... genericFutureListenerArr) {
        ObjectUtil.checkNotNull(genericFutureListenerArr, "listeners");
        synchronized (this) {
            try {
                for (GenericFutureListener<? extends Future<? super V>> genericFutureListener : genericFutureListenerArr) {
                    if (genericFutureListener == null) {
                        break;
                    }
                    removeListener0(genericFutureListener);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @Override // io.netty.util.concurrent.Future
    public Promise<V> sync() throws Throwable {
        await();
        rethrowIfFailed();
        return this;
    }

    @Override // io.netty.util.concurrent.Future
    public Promise<V> syncUninterruptibly() throws Throwable {
        awaitUninterruptibly();
        rethrowIfFailed();
        return this;
    }

    public DefaultPromise() {
        this.executor = null;
    }

    @Override // io.netty.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        V v = (V) this.result;
        if (!isDone0(v)) {
            if (await(j, timeUnit)) {
                v = (V) this.result;
            } else {
                throw new TimeoutException();
            }
        }
        if (v == SUCCESS || v == UNCANCELLABLE) {
            return null;
        }
        Throwable thCause0 = cause0(v);
        if (thCause0 == null) {
            return v;
        }
        if (thCause0 instanceof CancellationException) {
            throw ((CancellationException) thCause0);
        }
        throw new ExecutionException(thCause0);
    }

    @Override // io.netty.util.concurrent.Future
    public boolean await(long j, TimeUnit timeUnit) throws InterruptedException {
        return await0(timeUnit.toNanos(j), true);
    }

    @Override // io.netty.util.concurrent.Future
    public boolean await(long j) throws InterruptedException {
        return await0(TimeUnit.MILLISECONDS.toNanos(j), true);
    }

    @Override // io.netty.util.concurrent.Future
    public boolean awaitUninterruptibly(long j, TimeUnit timeUnit) {
        try {
            return await0(timeUnit.toNanos(j), false);
        } catch (InterruptedException unused) {
            throw new InternalError();
        }
    }

    @Override // io.netty.util.concurrent.Future
    public boolean awaitUninterruptibly(long j) {
        try {
            return await0(TimeUnit.MILLISECONDS.toNanos(j), false);
        } catch (InterruptedException unused) {
            throw new InternalError();
        }
    }
}
