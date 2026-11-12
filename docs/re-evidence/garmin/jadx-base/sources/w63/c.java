package w63;

import android.support.v4.media.session.PlaybackStateCompat;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0016\u0018\u0000 &2\u00020\u0001:\u0002'(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001e\u0010\u001dR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006)"}, d2 = {"Lw63/c;", "Lw63/h0;", "<init>", "()V", "", "now", "remainingNanos", "(J)J", "", "enter", "", "exit", "()Z", "cancel", "timedOut", "Lw63/f0;", "sink", "(Lw63/f0;)Lw63/f0;", "Lw63/g0;", "source", "(Lw63/g0;)Lw63/g0;", "T", "Lkotlin/Function0;", "block", "withTimeout", "(Le23/a;)Ljava/lang/Object;", "Ljava/io/IOException;", "cause", "access$newTimeoutException", "(Ljava/io/IOException;)Ljava/io/IOException;", "newTimeoutException", "", RemoteConfigConstants.ResponseFieldKey.STATE, "I", "next", "Lw63/c;", "timeoutAt", "J", "Companion", "b", "a", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class c extends h0 {
    private static final a Companion = new a(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int STATE_CANCELED = 3;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_QUEUE = 1;
    private static final int STATE_TIMED_OUT = 2;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static c head;
    private static final ReentrantLock lock;
    private c next;
    private int state;
    private long timeoutAt;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw63/c$b;", "Ljava/lang/Thread;", "<init>", "()V", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            while (true) {
                try {
                    c.Companion.getClass();
                    ReentrantLock reentrantLock = c.lock;
                    reentrantLock.lock();
                    try {
                        c.Companion.getClass();
                        c cVarC = a.c();
                        if (cVarC == c.head) {
                            a unused = c.Companion;
                            c.head = null;
                            reentrantLock.unlock();
                            return;
                        } else {
                            Unit unit = Unit.INSTANCE;
                            reentrantLock.unlock();
                            if (cVarC != null) {
                                cVarC.timedOut();
                            }
                        }
                    } catch (Throwable th3) {
                        reentrantLock.unlock();
                        throw th3;
                    }
                } catch (InterruptedException unused2) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: w63.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"w63/c$c", "Lw63/f0;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C3395c implements f0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f0 f183333b;

        public C3395c(f0 f0Var) {
            this.f183333b = f0Var;
        }

        @Override // w63.f0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            f0 f0Var = this.f183333b;
            c cVar = c.this;
            cVar.enter();
            try {
                try {
                    f0Var.close();
                    Unit unit = Unit.INSTANCE;
                    if (cVar.exit()) {
                        throw cVar.access$newTimeoutException(null);
                    }
                } catch (IOException e4) {
                    if (!cVar.exit()) {
                        throw e4;
                    }
                    throw cVar.access$newTimeoutException(e4);
                }
            } catch (Throwable th3) {
                cVar.exit();
                throw th3;
            }
        }

        @Override // w63.f0, java.io.Flushable
        public final void flush() throws IOException {
            f0 f0Var = this.f183333b;
            c cVar = c.this;
            cVar.enter();
            try {
                try {
                    f0Var.flush();
                    Unit unit = Unit.INSTANCE;
                    if (cVar.exit()) {
                        throw cVar.access$newTimeoutException(null);
                    }
                } catch (IOException e4) {
                    if (!cVar.exit()) {
                        throw e4;
                    }
                    throw cVar.access$newTimeoutException(e4);
                }
            } catch (Throwable th3) {
                cVar.exit();
                throw th3;
            }
        }

        @Override // w63.f0
        public final h0 timeout() {
            return c.this;
        }

        public final String toString() {
            return "AsyncTimeout.sink(" + this.f183333b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // w63.f0
        public final void write(e eVar, long j8) throws IOException {
            eVar.getClass();
            w63.b.b(eVar.f183349b, 0L, j8);
            while (true) {
                long j14 = 0;
                if (j8 <= 0) {
                    return;
                }
                c0 c0Var = eVar.f183348a;
                c0Var.getClass();
                while (j14 < PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                    j14 += (long) (c0Var.f183338c - c0Var.f183337b);
                    if (j14 >= j8) {
                        j14 = j8;
                        break;
                    } else {
                        c0Var = c0Var.f183341f;
                        c0Var.getClass();
                    }
                }
                f0 f0Var = this.f183333b;
                c cVar = c.this;
                cVar.enter();
                try {
                    try {
                        f0Var.write(eVar, j14);
                        Unit unit = Unit.INSTANCE;
                        if (cVar.exit()) {
                            throw cVar.access$newTimeoutException(null);
                        }
                        j8 -= j14;
                    } catch (IOException e4) {
                        if (!cVar.exit()) {
                            throw e4;
                        }
                        throw cVar.access$newTimeoutException(e4);
                    }
                } catch (Throwable th3) {
                    cVar.exit();
                    throw th3;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"w63/c$d", "Lw63/g0;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g0 f183335b;

        public d(g0 g0Var) {
            this.f183335b = g0Var;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            g0 g0Var = this.f183335b;
            c cVar = c.this;
            cVar.enter();
            try {
                try {
                    g0Var.close();
                    Unit unit = Unit.INSTANCE;
                    if (cVar.exit()) {
                        throw cVar.access$newTimeoutException(null);
                    }
                } catch (IOException e4) {
                    if (!cVar.exit()) {
                        throw e4;
                    }
                    throw cVar.access$newTimeoutException(e4);
                }
            } catch (Throwable th3) {
                cVar.exit();
                throw th3;
            }
        }

        @Override // w63.g0
        public final long read(e eVar, long j8) throws IOException {
            eVar.getClass();
            g0 g0Var = this.f183335b;
            c cVar = c.this;
            cVar.enter();
            try {
                try {
                    long j14 = g0Var.read(eVar, j8);
                    if (cVar.exit()) {
                        throw cVar.access$newTimeoutException(null);
                    }
                    return j14;
                } catch (IOException e4) {
                    if (cVar.exit()) {
                        throw cVar.access$newTimeoutException(e4);
                    }
                    throw e4;
                }
            } catch (Throwable th3) {
                cVar.exit();
                throw th3;
            }
        }

        @Override // w63.g0
        public final h0 timeout() {
            return c.this;
        }

        public final String toString() {
            return "AsyncTimeout.source(" + this.f183335b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        condition = conditionNewCondition;
        IDLE_TIMEOUT_MILLIS = 60000L;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(60000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long now) {
        return this.timeoutAt - now;
    }

    public final IOException access$newTimeoutException(IOException cause) {
        return newTimeoutException(cause);
    }

    @Override // w63.h0
    public void cancel() {
        super.cancel();
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (this.state == 1) {
                a.b(Companion, this);
                this.state = 3;
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void enter() {
        long timeoutNanos = getTimeoutNanos();
        boolean hasDeadline = getHasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            ReentrantLock reentrantLock = lock;
            reentrantLock.lock();
            try {
                if (this.state != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.state = 1;
                a.a(Companion, this, timeoutNanos, hasDeadline);
                Unit unit = Unit.INSTANCE;
                reentrantLock.unlock();
            } catch (Throwable th3) {
                reentrantLock.unlock();
                throw th3;
            }
        }
    }

    public final boolean exit() {
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            int i14 = this.state;
            this.state = 0;
            if (i14 != 1) {
                return i14 == 2;
            }
            a.b(Companion, this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException newTimeoutException(IOException cause) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    public final f0 sink(f0 sink) {
        sink.getClass();
        return new C3395c(sink);
    }

    public final g0 source(g0 source) {
        source.getClass();
        return new d(source);
    }

    public void timedOut() {
    }

    public final <T> T withTimeout(e23.a<? extends T> block) throws IOException {
        block.getClass();
        enter();
        try {
            try {
                T tInvoke = block.invoke();
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                return tInvoke;
            } catch (IOException e4) {
                if (exit()) {
                    throw access$newTimeoutException(e4);
                }
                throw e4;
            }
        } catch (Throwable th3) {
            exit();
            throw th3;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lw63/c$a;", "", "<init>", "()V", "", "TIMEOUT_WRITE_SIZE", "I", "", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "STATE_IDLE", "STATE_IN_QUEUE", "STATE_TIMED_OUT", "STATE_CANCELED", "Lw63/c;", TtmlNode.TAG_HEAD, "Lw63/c;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final void a(a aVar, c cVar, long j8, boolean z14) {
            aVar.getClass();
            if (c.head == null) {
                c.head = new c();
                new b().start();
            }
            long jNanoTime = System.nanoTime();
            if (j8 != 0 && z14) {
                cVar.timeoutAt = Math.min(j8, cVar.deadlineNanoTime() - jNanoTime) + jNanoTime;
            } else if (j8 != 0) {
                cVar.timeoutAt = j8 + jNanoTime;
            } else {
                if (!z14) {
                    v.e0.l();
                    return;
                }
                cVar.timeoutAt = cVar.deadlineNanoTime();
            }
            long jRemainingNanos = cVar.remainingNanos(jNanoTime);
            c cVar2 = c.head;
            cVar2.getClass();
            while (cVar2.next != null) {
                c cVar3 = cVar2.next;
                cVar3.getClass();
                if (jRemainingNanos < cVar3.remainingNanos(jNanoTime)) {
                    break;
                }
                cVar2 = cVar2.next;
                cVar2.getClass();
            }
            cVar.next = cVar2.next;
            cVar2.next = cVar;
            if (cVar2 == c.head) {
                c.condition.signal();
            }
        }

        public static final void b(a aVar, c cVar) {
            aVar.getClass();
            for (c cVar2 = c.head; cVar2 != null; cVar2 = cVar2.next) {
                if (cVar2.next == cVar) {
                    cVar2.next = cVar.next;
                    cVar.next = null;
                    return;
                }
            }
            vb.h.z("node was not found in the queue");
        }

        public static c c() throws InterruptedException {
            c cVar = c.head;
            cVar.getClass();
            c cVar2 = cVar.next;
            if (cVar2 == null) {
                long jNanoTime = System.nanoTime();
                c.condition.await(c.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
                c cVar3 = c.head;
                cVar3.getClass();
                if (cVar3.next != null || System.nanoTime() - jNanoTime < c.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return c.head;
            }
            long jRemainingNanos = cVar2.remainingNanos(System.nanoTime());
            if (jRemainingNanos > 0) {
                c.condition.await(jRemainingNanos, TimeUnit.NANOSECONDS);
                return null;
            }
            c cVar4 = c.head;
            cVar4.getClass();
            cVar4.next = cVar2.next;
            cVar2.next = null;
            cVar2.state = 2;
            return cVar2;
        }

        private a() {
        }
    }
}
