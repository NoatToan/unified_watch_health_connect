package l0;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class b<I, O> extends d<O> implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l0.a<? super I, ? extends O> f107788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedBlockingQueue f107789d = new LinkedBlockingQueue(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CountDownLatch f107790e = new CountDownLatch(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ListenableFuture<? extends I> f107791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile ListenableFuture<? extends O> f107792g;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ListenableFuture f107793a;

        public a(ListenableFuture listenableFuture) {
            this.f107793a = listenableFuture;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public final void run() {
            try {
                try {
                    b bVar = b.this;
                    Object objD = j.d(this.f107793a);
                    androidx.concurrent.futures.b.a<V> aVar = bVar.f107796b;
                    if (aVar != 0) {
                        aVar.b((V) objD);
                    }
                } catch (CancellationException unused) {
                    b.this.cancel(false);
                } catch (ExecutionException e4) {
                    b bVar2 = b.this;
                    Throwable cause = e4.getCause();
                    androidx.concurrent.futures.b.a<V> aVar2 = bVar2.f107796b;
                    if (aVar2 != 0) {
                        aVar2.d(cause);
                    }
                }
            } finally {
                b.this.f107792g = null;
            }
        }
    }

    public b(l0.a<? super I, ? extends O> aVar, ListenableFuture<? extends I> listenableFuture) {
        aVar.getClass();
        this.f107788c = aVar;
        listenableFuture.getClass();
        this.f107791f = listenableFuture;
    }

    public static Object b(LinkedBlockingQueue linkedBlockingQueue) {
        Object objTake;
        boolean z14 = false;
        while (true) {
            try {
                objTake = linkedBlockingQueue.take();
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
        return objTake;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l0.d, java.util.concurrent.Future
    public final boolean cancel(boolean z14) {
        boolean z15 = false;
        if (!this.f107795a.cancel(z14)) {
            return false;
        }
        while (true) {
            try {
                this.f107789d.put(Boolean.valueOf(z14));
                break;
            } catch (InterruptedException unused) {
                z15 = true;
            } catch (Throwable th3) {
                if (z15) {
                    Thread.currentThread().interrupt();
                }
                throw th3;
            }
        }
        if (z15) {
            Thread.currentThread().interrupt();
        }
        ListenableFuture<? extends I> listenableFuture = this.f107791f;
        if (listenableFuture != null) {
            listenableFuture.cancel(z14);
        }
        ListenableFuture<? extends O> listenableFuture2 = this.f107792g;
        if (listenableFuture2 != null) {
            listenableFuture2.cancel(z14);
        }
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // l0.d, java.util.concurrent.Future
    public final O get(long j8, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!this.f107795a.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j8 = timeUnit2.convert(j8, timeUnit);
                timeUnit = timeUnit2;
            }
            ListenableFuture<? extends I> listenableFuture = this.f107791f;
            if (listenableFuture != null) {
                long jNanoTime = System.nanoTime();
                listenableFuture.get(j8, timeUnit);
                j8 -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (!this.f107790e.await(j8, timeUnit)) {
                throw new TimeoutException();
            }
            j8 -= Math.max(0L, System.nanoTime() - jNanoTime2);
            ListenableFuture<? extends O> listenableFuture2 = this.f107792g;
            if (listenableFuture2 != null) {
                listenableFuture2.get(j8, timeUnit);
            }
        }
        return (O) this.f107795a.get(j8, timeUnit);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        return;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.util.concurrent.ListenableFuture<? extends I>, l0.a<? super I, ? extends O>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.util.concurrent.ListenableFuture<? extends I>, l0.a<? super I, ? extends O>] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.common.util.concurrent.ListenableFuture<? extends I>, l0.a<? super I, ? extends O>] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.CountDownLatch] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ?? r14;
        ?? r15 = (l0.a<? super I, ? extends O>) null;
        try {
            try {
                ListenableFuture<? extends O> listenableFutureApply = this.f107788c.apply(j.d(this.f107791f));
                this.f107792g = listenableFutureApply;
                if (this.f107795a.isCancelled()) {
                    listenableFutureApply.cancel(((Boolean) b(this.f107789d)).booleanValue());
                    this.f107792g = null;
                } else {
                    listenableFutureApply.addListener(new a(listenableFutureApply), k0.b.a());
                }
            } catch (UndeclaredThrowableException e4) {
                Throwable cause = e4.getCause();
                androidx.concurrent.futures.b.a<V> aVar = this.f107796b;
                r14 = r15;
                if (aVar != 0) {
                    aVar.d(cause);
                    r14 = r15;
                }
            } catch (Exception e14) {
                androidx.concurrent.futures.b.a<V> aVar2 = this.f107796b;
                r14 = r15;
                if (aVar2 != 0) {
                    aVar2.d(e14);
                    r14 = r15;
                }
            } catch (Error e15) {
                androidx.concurrent.futures.b.a<V> aVar3 = this.f107796b;
                r14 = r15;
                if (aVar3 != 0) {
                    aVar3.d(e15);
                    r14 = r15;
                }
            } finally {
                this.f107788c = (l0.a<? super I, ? extends O>) r15;
                this.f107791f = (ListenableFuture<? extends I>) r15;
                this.f107790e.countDown();
            }
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e16) {
            Throwable cause2 = e16.getCause();
            androidx.concurrent.futures.b.a<V> aVar4 = this.f107796b;
            if (aVar4 != 0) {
                aVar4.d(cause2);
            }
        }
    }

    @Override // l0.d, java.util.concurrent.Future
    public final O get() throws ExecutionException, InterruptedException {
        if (!this.f107795a.isDone()) {
            ListenableFuture<? extends I> listenableFuture = this.f107791f;
            if (listenableFuture != null) {
                listenableFuture.get();
            }
            this.f107790e.await();
            ListenableFuture<? extends O> listenableFuture2 = this.f107792g;
            if (listenableFuture2 != null) {
                listenableFuture2.get();
            }
        }
        return (O) this.f107795a.get();
    }
}
