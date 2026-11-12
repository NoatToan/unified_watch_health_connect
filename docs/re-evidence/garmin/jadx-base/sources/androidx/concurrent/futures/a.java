package androidx.concurrent.futures;

import am.j;
import com.google.common.util.concurrent.ListenableFuture;
import ds.e0;
import i3.e5;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<V> implements ListenableFuture<V> {
    static final b ATOMIC_HELPER;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    volatile e listeners;
    volatile Object value;
    volatile i waiters;
    static final boolean GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", BooleanUtils.FALSE));
    private static final Logger log = Logger.getLogger(a.class.getName());

    public static abstract class b {
        private b() {
        }

        public abstract boolean a(a<?> aVar, e eVar, e eVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, i iVar, i iVar2);

        public abstract void d(i iVar, i iVar2);

        public abstract void e(i iVar, Thread thread);
    }

    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f6059c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f6060d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f6061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f6062b;

        static {
            if (a.GENERATE_CANCELLATION_CAUSES) {
                f6060d = null;
                f6059c = null;
            } else {
                f6060d = new c(false, null);
                f6059c = new c(true, null);
            }
        }

        public c(boolean z14, Throwable th3) {
            this.f6061a = z14;
            this.f6062b = th3;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f6063b = new d(new C0081a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f6064a;

        /* JADX INFO: renamed from: androidx.concurrent.futures.a$d$a, reason: collision with other inner class name */
        public class C0081a extends Throwable {
            public C0081a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th3) {
            this.f6064a = (Throwable) a.checkNotNull(th3);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f6065d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f6066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f6067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e f6068c;

        public e(Runnable runnable, Executor executor) {
            this.f6066a = runnable;
            this.f6067b = executor;
        }
    }

    public static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<i, Thread> f6069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<i, i> f6070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, i> f6071c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, e> f6072d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f6073e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f6069a = atomicReferenceFieldUpdater;
            this.f6070b = atomicReferenceFieldUpdater2;
            this.f6071c = atomicReferenceFieldUpdater3;
            this.f6072d = atomicReferenceFieldUpdater4;
            this.f6073e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.a.b
        public final boolean a(a<?> aVar, e eVar, e eVar2) {
            AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f6072d;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, eVar, eVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == eVar);
            return false;
        }

        @Override // androidx.concurrent.futures.a.b
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f6073e;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == obj);
            return false;
        }

        @Override // androidx.concurrent.futures.a.b
        public final boolean c(a<?> aVar, i iVar, i iVar2) {
            AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f6071c;
                if (atomicReferenceFieldUpdater.compareAndSet(aVar, iVar, iVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(aVar) == iVar);
            return false;
        }

        @Override // androidx.concurrent.futures.a.b
        public final void d(i iVar, i iVar2) {
            this.f6070b.lazySet(iVar, iVar2);
        }

        @Override // androidx.concurrent.futures.a.b
        public final void e(i iVar, Thread thread) {
            this.f6069a.lazySet(iVar, thread);
        }
    }

    public static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a<V> f6074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ListenableFuture<? extends V> f6075b;

        public g(a<V> aVar, ListenableFuture<? extends V> listenableFuture) {
            this.f6074a = aVar;
            this.f6075b = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f6074a.value != this) {
                return;
            }
            if (a.ATOMIC_HELPER.b(this.f6074a, this, a.getFutureValue(this.f6075b))) {
                a.complete(this.f6074a);
            }
        }
    }

    public static final class h extends b {
        public h() {
            super();
        }

        @Override // androidx.concurrent.futures.a.b
        public final boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.listeners != eVar) {
                        return false;
                    }
                    aVar.listeners = eVar2;
                    return true;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.value != obj) {
                        return false;
                    }
                    aVar.value = obj2;
                    return true;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        public final boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.waiters != iVar) {
                        return false;
                    }
                    aVar.waiters = iVar2;
                    return true;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // androidx.concurrent.futures.a.b
        public final void d(i iVar, i iVar2) {
            iVar.f6078b = iVar2;
        }

        @Override // androidx.concurrent.futures.a.b
        public final void e(i iVar, Thread thread) {
            iVar.f6077a = thread;
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "value"));
            th = null;
        } catch (Throwable th3) {
            th = th3;
            hVar = new h();
        }
        ATOMIC_HELPER = hVar;
        if (th != null) {
            log.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        NULL = new Object();
    }

    private void addDoneString(StringBuilder sb3) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb3.append("SUCCESS, result=[");
            sb3.append(userObjectToString(uninterruptibly));
            sb3.append("]");
        } catch (CancellationException unused) {
            sb3.append("CANCELLED");
        } catch (RuntimeException e4) {
            sb3.append("UNKNOWN, cause=[");
            sb3.append(e4.getClass());
            sb3.append(" thrown from get()]");
        } catch (ExecutionException e14) {
            sb3.append("FAILURE, cause=[");
            sb3.append(e14.getCause());
            sb3.append("]");
        }
    }

    private static CancellationException cancellationExceptionWithCause(String str, Throwable th3) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th3);
        return cancellationException;
    }

    public static <T> T checkNotNull(T t7) {
        t7.getClass();
        return t7;
    }

    private e clearListeners(e eVar) {
        e eVar2;
        do {
            eVar2 = this.listeners;
        } while (!ATOMIC_HELPER.a(this, eVar2, e.f6065d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f6068c;
            eVar4.f6068c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void complete(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.releaseWaiters();
            aVar.afterDone();
            e eVarClearListeners = aVar.clearListeners(eVar);
            while (eVarClearListeners != null) {
                eVar = eVarClearListeners.f6068c;
                Runnable runnable = eVarClearListeners.f6066a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.f6074a;
                    if (aVar.value == gVar) {
                        if (ATOMIC_HELPER.b(aVar, gVar, getFutureValue(gVar.f6075b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    executeListener(runnable, eVarClearListeners.f6067b);
                }
                eVarClearListeners = eVar;
            }
            return;
        }
    }

    private static void executeListener(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            log.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V getDoneValue(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((c) obj).f6062b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f6064a);
        }
        if (obj == NULL) {
            return null;
        }
        return obj;
    }

    public static Object getFutureValue(ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof a) {
            Object obj = ((a) listenableFuture).value;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (cVar.f6061a) {
                return cVar.f6062b != null ? new c(false, cVar.f6062b) : c.f6060d;
            }
            return obj;
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) && zIsCancelled) {
            return c.f6060d;
        }
        try {
            Object uninterruptibly = getUninterruptibly(listenableFuture);
            return uninterruptibly == null ? NULL : uninterruptibly;
        } catch (CancellationException e4) {
            if (zIsCancelled) {
                return new c(false, e4);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e4));
        } catch (ExecutionException e14) {
            return new d(e14.getCause());
        } catch (Throwable th3) {
            return new d(th3);
        }
    }

    public static <V> V getUninterruptibly(Future<V> future) {
        V v14;
        boolean z14 = false;
        while (true) {
            try {
                v14 = future.get();
                break;
            } catch (InterruptedException unused) {
                z14 = true;
            } catch (Throwable th3) {
                if (z14) {
                    Thread.currentThread().interrupt();
                }
                throw th3;
            }
        }
        if (z14) {
            Thread.currentThread().interrupt();
        }
        return v14;
    }

    private void releaseWaiters() {
        i iVar;
        do {
            iVar = this.waiters;
        } while (!ATOMIC_HELPER.c(this, iVar, i.f6076c));
        while (iVar != null) {
            Thread thread = iVar.f6077a;
            if (thread != null) {
                iVar.f6077a = null;
                LockSupport.unpark(thread);
            }
            iVar = iVar.f6078b;
        }
    }

    private void removeWaiter(i iVar) {
        iVar.f6077a = null;
        while (true) {
            i iVar2 = this.waiters;
            if (iVar2 == i.f6076c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f6078b;
                if (iVar2.f6077a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f6078b = iVar4;
                    if (iVar3.f6077a == null) {
                    }
                } else if (!ATOMIC_HELPER.c(this, iVar2, iVar4)) {
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String userObjectToString(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        checkNotNull(runnable);
        checkNotNull(executor);
        e eVar = this.listeners;
        if (eVar != e.f6065d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f6068c = eVar;
                if (ATOMIC_HELPER.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.listeners;
                }
            } while (eVar != e.f6065d);
        }
        executeListener(runnable, executor);
    }

    public void afterDone() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z14) {
        c cVar;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (GENERATE_CANCELLATION_CAUSES) {
            cVar = new c(z14, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z14 ? c.f6059c : c.f6060d;
        }
        a<V> aVar = this;
        boolean z15 = false;
        while (true) {
            if (ATOMIC_HELPER.b(aVar, obj, cVar)) {
                if (z14) {
                    aVar.interruptTask();
                }
                complete(aVar);
                if (obj instanceof g) {
                    ListenableFuture<? extends V> listenableFuture = ((g) obj).f6075b;
                    if (listenableFuture instanceof a) {
                        aVar = (a) listenableFuture;
                        obj = aVar.value;
                        if ((obj == null) | (obj instanceof g)) {
                            z15 = true;
                        }
                    } else {
                        listenableFuture.cancel(z14);
                    }
                }
                return true;
            }
            obj = aVar.value;
            if (!(obj instanceof g)) {
                return z15;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j8, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j8);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) && (!(obj instanceof g))) {
            return getDoneValue(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.waiters;
            if (iVar != i.f6076c) {
                i iVar2 = new i();
                while (true) {
                    b bVar = ATOMIC_HELPER;
                    bVar.d(iVar2, iVar);
                    if (bVar.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                removeWaiter(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return getDoneValue(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        removeWaiter(iVar2);
                        break;
                    }
                    iVar = this.waiters;
                    if (iVar == i.f6076c) {
                    }
                }
            }
            return getDoneValue(this.value);
        }
        while (nanos > 0) {
            Object obj3 = this.value;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return getDoneValue(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbK = e0.k(j8, "Waited ", StringUtils.SPACE);
        sbK.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbK.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j14 = -nanos;
            long jConvert = timeUnit.convert(j14, TimeUnit.NANOSECONDS);
            long nanos2 = j14 - timeUnit.toNanos(jConvert);
            boolean z14 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strConcat2 = strConcat + jConvert + StringUtils.SPACE + lowerCase;
                if (z14) {
                    strConcat2 = strConcat2.concat(",");
                }
                strConcat = strConcat2.concat(StringUtils.SPACE);
            }
            if (z14) {
                strConcat = strConcat + nanos2 + " nanoseconds ";
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(e5.g(string3, " for ", string));
    }

    public void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof g)) & (obj != null);
    }

    public final void maybePropagateCancellationTo(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String pendingToString() {
        Object obj = this.value;
        if (obj instanceof g) {
            return j.o(userObjectToString(((g) obj).f6075b), "]", new StringBuilder("setFuture=["));
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean set(V v14) {
        if (v14 == null) {
            v14 = (V) NULL;
        }
        if (!ATOMIC_HELPER.b(this, null, v14)) {
            return false;
        }
        complete(this);
        return true;
    }

    public boolean setException(Throwable th3) {
        if (!ATOMIC_HELPER.b(this, null, new d((Throwable) checkNotNull(th3)))) {
            return false;
        }
        complete(this);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public boolean setFuture(ListenableFuture<? extends V> listenableFuture) {
        d dVar;
        checkNotNull(listenableFuture);
        Object obj = this.value;
        if (obj != null) {
            if (obj instanceof c) {
                listenableFuture.cancel(((c) obj).f6061a);
            }
        } else if (listenableFuture.isDone()) {
            if (ATOMIC_HELPER.b(this, null, getFutureValue(listenableFuture))) {
                complete(this);
                return true;
            }
        } else {
            g gVar = new g(this, listenableFuture);
            if (ATOMIC_HELPER.b(this, null, gVar)) {
                try {
                    listenableFuture.addListener(gVar, androidx.concurrent.futures.c.INSTANCE);
                    return true;
                } catch (Throwable th3) {
                    try {
                        dVar = new d(th3);
                    } catch (Throwable unused) {
                        dVar = d.f6063b;
                    }
                    ATOMIC_HELPER.b(this, gVar, dVar);
                    return true;
                }
            }
            obj = this.value;
            if (obj instanceof c) {
                listenableFuture.cancel(((c) obj).f6061a);
            }
        }
        return false;
    }

    public String toString() {
        String strPendingToString;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.toString());
        sb3.append("[status=");
        if (isCancelled()) {
            sb3.append("CANCELLED");
        } else if (isDone()) {
            addDoneString(sb3);
        } else {
            try {
                strPendingToString = pendingToString();
            } catch (RuntimeException e4) {
                strPendingToString = "Exception thrown from implementation: " + e4.getClass();
            }
            if (strPendingToString != null && !strPendingToString.isEmpty()) {
                j.y(sb3, "PENDING, info=[", strPendingToString, "]");
            } else if (isDone()) {
                addDoneString(sb3);
            } else {
                sb3.append("PENDING");
            }
        }
        sb3.append("]");
        return sb3.toString();
    }

    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof c) && ((c) obj).f6061a;
    }

    public static final class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f6076c = new i(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile Thread f6077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile i f6078b;

        public i() {
            a.ATOMIC_HELPER.e(this, Thread.currentThread());
        }

        public i(boolean z14) {
        }
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return getDoneValue(obj2);
            }
            i iVar = this.waiters;
            if (iVar != i.f6076c) {
                i iVar2 = new i();
                do {
                    b bVar = ATOMIC_HELPER;
                    bVar.d(iVar2, iVar);
                    if (bVar.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                removeWaiter(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return getDoneValue(obj);
                    }
                    iVar = this.waiters;
                } while (iVar != i.f6076c);
            }
            return getDoneValue(this.value);
        }
        throw new InterruptedException();
    }
}
