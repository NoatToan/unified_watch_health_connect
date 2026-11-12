package com.google.common.util.concurrent;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import com.huawei.operation.utils.Constants;
import defpackage.aqy;
import defpackage.aqz;
import defpackage.ara;
import defpackage.arj;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
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
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractFuture<V> extends InternalFutureFailureAccess implements ListenableFuture<V> {
    private static final AtomicHelper ATOMIC_HELPER;
    public static final boolean GENERATE_CANCELLATION_CAUSES;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    static final aqy log;

    @CheckForNull
    volatile b listeners;

    @CheckForNull
    volatile Object value;

    @CheckForNull
    volatile i waiters;

    interface Trusted<V> extends ListenableFuture<V> {
    }

    public void afterDone() {
    }

    protected void interruptTask() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.common.util.concurrent.AbstractFuture$1] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.logging.Logger] */
    static {
        boolean z;
        AtomicHelper jVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        GENERATE_CANCELLATION_CAUSES = z;
        log = new aqy(AbstractFuture.class);
        ?? r0 = 0;
        r0 = 0;
        try {
            jVar = new g();
            e = null;
        } catch (Error | Exception e2) {
            e = e2;
            try {
                jVar = new d(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, FitRunPlayAudio.OPPORTUNITY_E), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, i.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, b.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "value"));
            } catch (Error | Exception e3) {
                jVar = new j();
                r0 = e3;
            }
        }
        ATOMIC_HELPER = jVar;
        if (r0 != 0) {
            aqy aqyVar = log;
            aqyVar.b().log(Level.SEVERE, "UnsafeAtomicHelper is broken!", e);
            aqyVar.b().log(Level.SEVERE, "SafeAtomicHelper is broken!", r0);
        }
        NULL = new Object();
    }

    public static abstract class TrustedFuture<V> extends AbstractFuture<V> implements Trusted<V> {
        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @ParametricNullness
        public final V get() throws ExecutionException, InterruptedException {
            return (V) super.get();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        @ParametricNullness
        public final V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return (V) super.get(j, timeUnit);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.ListenableFuture
        public final void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            return super.cancel(z);
        }
    }

    static final class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final i f4661c = new i(false);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        volatile Thread f4662b;

        @CheckForNull
        volatile i e;

        i(boolean z) {
        }

        i() {
            AbstractFuture.ATOMIC_HELPER.putThread(this, Thread.currentThread());
        }

        void d(@CheckForNull i iVar) {
            AbstractFuture.ATOMIC_HELPER.putNext(this, iVar);
        }

        void b() {
            Thread thread = this.f4662b;
            if (thread != null) {
                this.f4662b = null;
                LockSupport.unpark(thread);
            }
        }
    }

    private void removeWaiter(i iVar) {
        iVar.f4662b = null;
        while (true) {
            i iVar2 = this.waiters;
            if (iVar2 == i.f4661c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.e;
                if (iVar2.f4662b != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.e = iVar4;
                    if (iVar3.f4662b == null) {
                    }
                } else if (!ATOMIC_HELPER.casWaiters(this, iVar2, iVar4)) {
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final b f4648b = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @CheckForNull
        final Runnable f4649a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        final Executor f4650c;

        @CheckForNull
        b e;

        b(Runnable runnable, Executor executor) {
            this.f4649a = runnable;
            this.f4650c = executor;
        }

        b() {
            this.f4649a = null;
            this.f4650c = null;
        }
    }

    static final class e {
        static final e e = new e(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.common.util.concurrent.AbstractFuture.e.2
            @Override // java.lang.Throwable
            public Throwable fillInStackTrace() {
                synchronized (this) {
                }
                return this;
            }
        });

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Throwable f4657a;

        e(Throwable th) {
            this.f4657a = (Throwable) Preconditions.checkNotNull(th);
        }
    }

    static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        static final c f4651b;

        @CheckForNull
        static final c d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f4652a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        final Throwable f4653c;

        static {
            if (AbstractFuture.GENERATE_CANCELLATION_CAUSES) {
                f4651b = null;
                d = null;
            } else {
                f4651b = new c(false, null);
                d = new c(true, null);
            }
        }

        c(boolean z, @CheckForNull Throwable th) {
            this.f4652a = z;
            this.f4653c = th;
        }
    }

    static final class a<V> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ListenableFuture<? extends V> f4647b;
        final AbstractFuture<V> d;

        a(AbstractFuture<V> abstractFuture, ListenableFuture<? extends V> listenableFuture) {
            this.d = abstractFuture;
            this.f4647b = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.d.value != this) {
                return;
            }
            if (AbstractFuture.ATOMIC_HELPER.casValue(this.d, this, AbstractFuture.getFutureValue(this.f4647b))) {
                AbstractFuture.complete(this.d, false);
            }
        }
    }

    protected AbstractFuture() {
    }

    @ParametricNullness
    public V get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) & (!(obj instanceof a))) {
            return getDoneValue(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.waiters;
            if (iVar != i.f4661c) {
                i iVar2 = new i();
                while (true) {
                    iVar2.d(iVar);
                    if (ATOMIC_HELPER.casWaiters(this, iVar, iVar2)) {
                        do {
                            ara.c(this, nanos);
                            if (Thread.interrupted()) {
                                removeWaiter(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) & (!(obj2 instanceof a))) {
                                return getDoneValue(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        removeWaiter(iVar2);
                        break;
                    }
                    iVar = this.waiters;
                    if (iVar == i.f4661c) {
                    }
                }
            }
            return getDoneValue(Objects.requireNonNull(this.value));
        }
        while (nanos > 0) {
            Object obj3 = this.value;
            if ((obj3 != null) & (!(obj3 instanceof a))) {
                return getDoneValue(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(Locale.ROOT);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @ParametricNullness
    public V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) & (!(obj2 instanceof a))) {
            return getDoneValue(obj2);
        }
        i iVar = this.waiters;
        if (iVar != i.f4661c) {
            i iVar2 = new i();
            do {
                iVar2.d(iVar);
                if (ATOMIC_HELPER.casWaiters(this, iVar, iVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            removeWaiter(iVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof a))));
                    return getDoneValue(obj);
                }
                iVar = this.waiters;
            } while (iVar != i.f4661c);
        }
        return getDoneValue(Objects.requireNonNull(this.value));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ParametricNullness
    private V getDoneValue(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw cancellationExceptionWithCause("Task was cancelled.", ((c) obj).f4653c);
        }
        if (obj instanceof e) {
            throw new ExecutionException(((e) obj).f4657a);
        }
        return obj == NULL ? (V) aqz.a() : obj;
    }

    public boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof a)) & (obj != null);
    }

    public boolean isCancelled() {
        return this.value instanceof c;
    }

    public boolean cancel(boolean z) {
        c cVar;
        Object objRequireNonNull;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof a)) {
            return false;
        }
        if (GENERATE_CANCELLATION_CAUSES) {
            objRequireNonNull = new c(z, new CancellationException("Future.cancel() was called."));
        } else {
            if (z) {
                cVar = c.d;
            } else {
                cVar = c.f4651b;
            }
            objRequireNonNull = Objects.requireNonNull(cVar);
        }
        AbstractFuture<V> abstractFuture = this;
        boolean z2 = false;
        while (true) {
            if (ATOMIC_HELPER.casValue(abstractFuture, obj, objRequireNonNull)) {
                complete(abstractFuture, z);
                if (obj instanceof a) {
                    ListenableFuture<? extends V> listenableFuture = ((a) obj).f4647b;
                    if (listenableFuture instanceof Trusted) {
                        abstractFuture = (AbstractFuture) listenableFuture;
                        obj = abstractFuture.value;
                        if ((obj == null) | (obj instanceof a)) {
                            z2 = true;
                        }
                    } else {
                        listenableFuture.cancel(z);
                    }
                }
                return true;
            }
            obj = abstractFuture.value;
            if (!(obj instanceof a)) {
                return z2;
            }
        }
    }

    protected final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof c) && ((c) obj).f4652a;
    }

    public void addListener(Runnable runnable, Executor executor) {
        b bVar;
        Preconditions.checkNotNull(runnable, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        if (!isDone() && (bVar = this.listeners) != b.f4648b) {
            b bVar2 = new b(runnable, executor);
            do {
                bVar2.e = bVar;
                if (ATOMIC_HELPER.casListeners(this, bVar, bVar2)) {
                    return;
                } else {
                    bVar = this.listeners;
                }
            } while (bVar != b.f4648b);
        }
        executeListener(runnable, executor);
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
    public boolean set(@ParametricNullness V v) {
        if (v == null) {
            v = (V) NULL;
        }
        if (!ATOMIC_HELPER.casValue(this, null, v)) {
            return false;
        }
        complete(this, false);
        return true;
    }

    public boolean setException(Throwable th) {
        if (!ATOMIC_HELPER.casValue(this, null, new e((Throwable) Preconditions.checkNotNull(th)))) {
            return false;
        }
        complete(this, false);
        return true;
    }

    public boolean setFuture(ListenableFuture<? extends V> listenableFuture) {
        e eVar;
        Preconditions.checkNotNull(listenableFuture);
        Object obj = this.value;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!ATOMIC_HELPER.casValue(this, null, getFutureValue(listenableFuture))) {
                    return false;
                }
                complete(this, false);
                return true;
            }
            a aVar = new a(this, listenableFuture);
            if (ATOMIC_HELPER.casValue(this, null, aVar)) {
                try {
                    listenableFuture.addListener(aVar, DirectExecutor.INSTANCE);
                } catch (Throwable th) {
                    try {
                        eVar = new e(th);
                    } catch (Error | Exception unused) {
                        eVar = e.e;
                    }
                    ATOMIC_HELPER.casValue(this, aVar, eVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof c) {
            listenableFuture.cancel(((c) obj).f4652a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getFutureValue(ListenableFuture<?> listenableFuture) {
        Throwable thA;
        if (listenableFuture instanceof Trusted) {
            Object cVar = ((AbstractFuture) listenableFuture).value;
            if (cVar instanceof c) {
                c cVar2 = (c) cVar;
                if (cVar2.f4652a) {
                    cVar = cVar2.f4653c != null ? new c(false, cVar2.f4653c) : c.f4651b;
                }
            }
            return Objects.requireNonNull(cVar);
        }
        if ((listenableFuture instanceof InternalFutureFailureAccess) && (thA = arq.a((InternalFutureFailureAccess) listenableFuture)) != null) {
            return new e(thA);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) & zIsCancelled) {
            return Objects.requireNonNull(c.f4651b);
        }
        try {
            Object uninterruptibly = getUninterruptibly(listenableFuture);
            if (!zIsCancelled) {
                return uninterruptibly == null ? NULL : uninterruptibly;
            }
            return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture));
        } catch (Error e2) {
            e = e2;
            return new e(e);
        } catch (CancellationException e3) {
            if (!zIsCancelled) {
                return new e(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e3));
            }
            return new c(false, e3);
        } catch (ExecutionException e4) {
            if (zIsCancelled) {
                return new c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture, e4));
            }
            return new e(e4.getCause());
        } catch (Exception e5) {
            e = e5;
            return new e(e);
        }
    }

    @ParametricNullness
    private static <V> V getUninterruptibly(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    public static void complete(AbstractFuture<?> abstractFuture, boolean z) {
        b bVar = null;
        while (true) {
            abstractFuture.releaseWaiters();
            if (z) {
                abstractFuture.interruptTask();
                z = false;
            }
            abstractFuture.afterDone();
            b bVarClearListeners = abstractFuture.clearListeners(bVar);
            while (bVarClearListeners != null) {
                bVar = bVarClearListeners.e;
                Runnable runnable = (Runnable) Objects.requireNonNull(bVarClearListeners.f4649a);
                if (runnable instanceof a) {
                    a aVar = (a) runnable;
                    abstractFuture = aVar.d;
                    if (abstractFuture.value == aVar) {
                        if (ATOMIC_HELPER.casValue(abstractFuture, aVar, getFutureValue(aVar.f4647b))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    executeListener(runnable, (Executor) Objects.requireNonNull(bVarClearListeners.f4650c));
                }
                bVarClearListeners = bVar;
            }
            return;
        }
    }

    @CheckForNull
    public final Throwable tryInternalFastPathGetFailure() {
        if (!(this instanceof Trusted)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof e) {
            return ((e) obj).f4657a;
        }
        return null;
    }

    protected final void maybePropagateCancellationTo(@CheckForNull Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    private void releaseWaiters() {
        for (i iVarGasWaiters = ATOMIC_HELPER.gasWaiters(this, i.f4661c); iVarGasWaiters != null; iVarGasWaiters = iVarGasWaiters.e) {
            iVarGasWaiters.b();
        }
    }

    @CheckForNull
    private b clearListeners(@CheckForNull b bVar) {
        b bVar2 = bVar;
        b bVarGasListeners = ATOMIC_HELPER.gasListeners(this, b.f4648b);
        while (bVarGasListeners != null) {
            b bVar3 = bVarGasListeners.e;
            bVarGasListeners.e = bVar2;
            bVar2 = bVarGasListeners;
            bVarGasListeners = bVar3;
        }
        return bVar2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            addDoneString(sb);
        } else {
            addPendingString(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckForNull
    public String pendingToString() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    private void addPendingString(StringBuilder sb) {
        String strEmptyToNull;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof a) {
            sb.append(", setFuture=[");
            appendUserObject(sb, ((a) obj).f4647b);
            sb.append("]");
        } else {
            try {
                strEmptyToNull = Strings.emptyToNull(pendingToString());
            } catch (Exception | StackOverflowError e2) {
                strEmptyToNull = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strEmptyToNull != null) {
                sb.append(", info=[");
                sb.append(strEmptyToNull);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            addDoneString(sb);
        }
    }

    private void addDoneString(StringBuilder sb) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            appendResultObject(sb, uninterruptibly);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        } catch (Exception e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private void appendResultObject(StringBuilder sb, @CheckForNull Object obj) {
        if (obj == null) {
            sb.append(Constants.NULL);
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    private void appendUserObject(StringBuilder sb, @CheckForNull Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (Exception | StackOverflowError e2) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e2.getClass());
        }
    }

    private static void executeListener(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            log.b().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    static abstract class AtomicHelper {
        abstract boolean casListeners(AbstractFuture<?> abstractFuture, @CheckForNull b bVar, b bVar2);

        abstract boolean casValue(AbstractFuture<?> abstractFuture, @CheckForNull Object obj, Object obj2);

        abstract boolean casWaiters(AbstractFuture<?> abstractFuture, @CheckForNull i iVar, @CheckForNull i iVar2);

        abstract b gasListeners(AbstractFuture<?> abstractFuture, b bVar);

        abstract i gasWaiters(AbstractFuture<?> abstractFuture, i iVar);

        abstract void putNext(i iVar, @CheckForNull i iVar2);

        abstract void putThread(i iVar, Thread thread);

        private AtomicHelper() {
        }
    }

    static final class g extends AtomicHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final long f4658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final long f4659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final long f4660c;
        static final long d;
        static final Unsafe e;
        static final long f;

        private g() {
            super();
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.util.concurrent.AbstractFuture.g.3
                        @Override // java.security.PrivilegedExceptionAction
                        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                        public Unsafe run() throws Exception {
                            for (Field field : Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get(null);
                                if (Unsafe.class.isInstance(obj)) {
                                    return (Unsafe) Unsafe.class.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }
                    });
                }
                try {
                    f4660c = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("waiters"));
                    d = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("listeners"));
                    f4658a = unsafe.objectFieldOffset(AbstractFuture.class.getDeclaredField("value"));
                    f = unsafe.objectFieldOffset(i.class.getDeclaredField("b"));
                    f4659b = unsafe.objectFieldOffset(i.class.getDeclaredField(FitRunPlayAudio.OPPORTUNITY_E));
                    e = unsafe;
                } catch (NoSuchFieldException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void putThread(i iVar, Thread thread) {
            e.putObject(iVar, f, thread);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void putNext(i iVar, @CheckForNull i iVar2) {
            e.putObject(iVar, f4659b, iVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casWaiters(AbstractFuture<?> abstractFuture, @CheckForNull i iVar, @CheckForNull i iVar2) {
            return arj.c(e, abstractFuture, f4660c, iVar, iVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casListeners(AbstractFuture<?> abstractFuture, @CheckForNull b bVar, b bVar2) {
            return arj.c(e, abstractFuture, d, bVar, bVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        b gasListeners(AbstractFuture<?> abstractFuture, b bVar) {
            b bVar2;
            do {
                bVar2 = abstractFuture.listeners;
                if (bVar == bVar2) {
                    break;
                }
            } while (!casListeners(abstractFuture, bVar2, bVar));
            return bVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        i gasWaiters(AbstractFuture<?> abstractFuture, i iVar) {
            i iVar2;
            do {
                iVar2 = abstractFuture.waiters;
                if (iVar == iVar2) {
                    break;
                }
            } while (!casWaiters(abstractFuture, iVar2, iVar));
            return iVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casValue(AbstractFuture<?> abstractFuture, @CheckForNull Object obj, Object obj2) {
            return arj.c(e, abstractFuture, f4658a, obj, obj2);
        }
    }

    static final class d extends AtomicHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<AbstractFuture, Object> f4654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<AbstractFuture, i> f4655b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f4656c;
        final AtomicReferenceFieldUpdater<i, Thread> d;
        final AtomicReferenceFieldUpdater<AbstractFuture, b> e;

        d(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, b> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
            super();
            this.d = atomicReferenceFieldUpdater;
            this.f4656c = atomicReferenceFieldUpdater2;
            this.f4655b = atomicReferenceFieldUpdater3;
            this.e = atomicReferenceFieldUpdater4;
            this.f4654a = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void putThread(i iVar, Thread thread) {
            this.d.lazySet(iVar, thread);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void putNext(i iVar, @CheckForNull i iVar2) {
            this.f4656c.lazySet(iVar, iVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casWaiters(AbstractFuture<?> abstractFuture, @CheckForNull i iVar, @CheckForNull i iVar2) {
            return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(this.f4655b, abstractFuture, iVar, iVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casListeners(AbstractFuture<?> abstractFuture, @CheckForNull b bVar, b bVar2) {
            return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(this.e, abstractFuture, bVar, bVar2);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        b gasListeners(AbstractFuture<?> abstractFuture, b bVar) {
            return this.e.getAndSet(abstractFuture, bVar);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        i gasWaiters(AbstractFuture<?> abstractFuture, i iVar) {
            return this.f4655b.getAndSet(abstractFuture, iVar);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casValue(AbstractFuture<?> abstractFuture, @CheckForNull Object obj, Object obj2) {
            return AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(this.f4654a, abstractFuture, obj, obj2);
        }
    }

    static final class j extends AtomicHelper {
        private j() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void putThread(i iVar, Thread thread) {
            iVar.f4662b = thread;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        void putNext(i iVar, @CheckForNull i iVar2) {
            iVar.e = iVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casWaiters(AbstractFuture<?> abstractFuture, @CheckForNull i iVar, @CheckForNull i iVar2) {
            synchronized (abstractFuture) {
                if (abstractFuture.waiters != iVar) {
                    return false;
                }
                abstractFuture.waiters = iVar2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casListeners(AbstractFuture<?> abstractFuture, @CheckForNull b bVar, b bVar2) {
            synchronized (abstractFuture) {
                if (abstractFuture.listeners != bVar) {
                    return false;
                }
                abstractFuture.listeners = bVar2;
                return true;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        b gasListeners(AbstractFuture<?> abstractFuture, b bVar) {
            b bVar2;
            synchronized (abstractFuture) {
                bVar2 = abstractFuture.listeners;
                if (bVar2 != bVar) {
                    abstractFuture.listeners = bVar;
                }
            }
            return bVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        i gasWaiters(AbstractFuture<?> abstractFuture, i iVar) {
            i iVar2;
            synchronized (abstractFuture) {
                iVar2 = abstractFuture.waiters;
                if (iVar2 != iVar) {
                    abstractFuture.waiters = iVar;
                }
            }
            return iVar2;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture.AtomicHelper
        boolean casValue(AbstractFuture<?> abstractFuture, @CheckForNull Object obj, Object obj2) {
            synchronized (abstractFuture) {
                if (abstractFuture.value != obj) {
                    return false;
                }
                abstractFuture.value = obj2;
                return true;
            }
        }
    }

    private static CancellationException cancellationExceptionWithCause(String str, @CheckForNull Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
