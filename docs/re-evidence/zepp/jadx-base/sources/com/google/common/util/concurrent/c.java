package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.UnmodifiableIterator;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.OverridingMethodsMustInvokeSuper;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
abstract class c<InputT, OutputT> extends AbstractFuture.j<OutputT> {
    private static final Logger j = Logger.getLogger(c.class.getName());

    @NullableDecl
    private c<InputT, OutputT>.a i;

    public abstract class a extends d implements Runnable {
        private ImmutableCollection<? extends ListenableFuture<? extends InputT>> e;
        private final boolean f;
        private final boolean g;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.c$a$a, reason: collision with other inner class name */
        public class RunnableC0241a implements Runnable {
            public final /* synthetic */ int a;
            public final /* synthetic */ ListenableFuture b;

            public RunnableC0241a(int i, ListenableFuture listenableFuture) {
                this.a = i;
                this.b = listenableFuture;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.p(this.a, this.b);
                } finally {
                    a.this.m();
                }
            }
        }

        public a(ImmutableCollection<? extends ListenableFuture<? extends InputT>> immutableCollection, boolean z, boolean z2) {
            super(immutableCollection.size());
            this.e = (ImmutableCollection) Preconditions.checkNotNull(immutableCollection);
            this.f = z;
            this.g = z2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m() {
            int iF = f();
            Preconditions.checkState(iF >= 0, "Less than 0 remaining futures");
            if (iF == 0) {
                s();
            }
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0029 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:13:0x002b  */
        /* JADX WARN: Code duplicated, block: B:14:0x002e  */
        /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
        private void o(Throwable th) {
            boolean exception;
            boolean z;
            boolean z2;
            String str;
            Preconditions.checkNotNull(th);
            if (this.f) {
                exception = c.this.setException(th);
                if (exception) {
                    t();
                } else {
                    z = c.z(g(), th);
                }
                z2 = th instanceof Error;
                if (((!exception) & this.f & z) || z2) {
                    if (z2) {
                        str = "Input Future failed with Error";
                    } else {
                        str = "Got more than one input Future failure. Logging failures after the first";
                    }
                    c.j.log(Level.SEVERE, str, th);
                }
            }
            exception = false;
            z = true;
            z2 = th instanceof Error;
            if (((!exception) & this.f & z) || z2) {
                if (z2) {
                    str = "Input Future failed with Error";
                } else {
                    str = "Got more than one input Future failure. Logging failures after the first";
                }
                c.j.log(Level.SEVERE, str, th);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void p(int i, Future<? extends InputT> future) {
            Preconditions.checkState(this.f || !c.this.isDone() || c.this.isCancelled(), "Future was done before all dependencies completed");
            try {
                Preconditions.checkState(future.isDone(), "Tried to set value from future which is not done");
                if (this.f) {
                    if (future.isCancelled()) {
                        c.this.i = null;
                        c.this.cancel(false);
                    } else {
                        Object done = Futures.getDone(future);
                        if (this.g) {
                            l(this.f, i, done);
                        }
                    }
                } else if (this.g && !future.isCancelled()) {
                    l(this.f, i, Futures.getDone(future));
                }
            } catch (ExecutionException e) {
                o(e.getCause());
            } catch (Throwable th) {
                o(th);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q() {
            if (this.e.isEmpty()) {
                n();
                return;
            }
            if (!this.f) {
                UnmodifiableIterator<? extends ListenableFuture<? extends InputT>> it2 = this.e.iterator();
                while (it2.hasNext()) {
                    it2.next().addListener(this, MoreExecutors.directExecutor());
                }
                return;
            }
            int i = 0;
            UnmodifiableIterator<? extends ListenableFuture<? extends InputT>> it3 = this.e.iterator();
            while (it3.hasNext()) {
                ListenableFuture<? extends InputT> next = it3.next();
                next.addListener(new RunnableC0241a(i, next), MoreExecutors.directExecutor());
                i++;
            }
        }

        private void s() {
            if (this.g & (!this.f)) {
                int i = 0;
                UnmodifiableIterator<? extends ListenableFuture<? extends InputT>> it2 = this.e.iterator();
                while (it2.hasNext()) {
                    p(i, it2.next());
                    i++;
                }
            }
            n();
        }

        @Override // com.google.common.util.concurrent.d
        public final void e(Set<Throwable> set) {
            if (c.this.isCancelled()) {
                return;
            }
            c.z(set, c.this.tryInternalFastPathGetFailure());
        }

        public abstract void l(boolean z, int i, @NullableDecl InputT inputt);

        public abstract void n();

        public void r() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            m();
        }

        @ForOverride
        @OverridingMethodsMustInvokeSuper
        public void t() {
            this.e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean z(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    public final void A(c<InputT, OutputT>.a aVar) {
        this.i = aVar;
        aVar.q();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
        super.afterDone();
        c<InputT, OutputT>.a aVar = this.i;
        if (aVar != null) {
            this.i = null;
            ImmutableCollection immutableCollection = ((a) aVar).e;
            boolean zWasInterrupted = wasInterrupted();
            if (zWasInterrupted) {
                aVar.r();
            }
            if (isCancelled() && (immutableCollection != null)) {
                UnmodifiableIterator it2 = immutableCollection.iterator();
                while (it2.hasNext()) {
                    ((ListenableFuture) it2.next()).cancel(zWasInterrupted);
                }
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public String pendingToString() {
        ImmutableCollection immutableCollection;
        c<InputT, OutputT>.a aVar = this.i;
        if (aVar == null || (immutableCollection = ((a) aVar).e) == null) {
            return null;
        }
        return "futures=[" + immutableCollection + "]";
    }
}
