package io.reactivex.internal.operators.observable;

import defpackage.a0;
import defpackage.bgi;
import defpackage.bua;
import defpackage.o4h;
import defpackage.o5h;
import defpackage.qf8;
import defpackage.t5l;
import defpackage.x3h;
import defpackage.z5h;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservableScalarXMap {

    public static final class ScalarDisposable<T> extends AtomicInteger implements bgi<T>, Runnable {
        static final int FUSED = 1;
        static final int ON_COMPLETE = 3;
        static final int ON_NEXT = 2;
        static final int START = 0;
        private static final long serialVersionUID = 3880992722410194083L;
        final z5h<? super T> observer;
        final T value;

        public ScalarDisposable(z5h<? super T> z5hVar, T t) {
            this.observer = z5hVar;
            this.value = t;
        }

        @Override // defpackage.jdm
        public void clear() {
            lazySet(3);
        }

        @Override // defpackage.jz6
        public void dispose() {
            set(3);
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return get() == 3;
        }

        @Override // defpackage.jdm
        public boolean isEmpty() {
            return get() != 1;
        }

        @Override // defpackage.jdm
        public boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // defpackage.jdm
        public T poll() throws Exception {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.value;
        }

        @Override // defpackage.dgi
        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.observer.onNext(this.value);
                if (get() == 2) {
                    lazySet(3);
                    this.observer.onComplete();
                }
            }
        }

        public boolean offer(T t, T t2) {
            throw new UnsupportedOperationException("Should not be called!");
        }
    }

    public static final class a<T, R> extends o4h<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f21342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final bua<? super T, ? extends o5h<? extends R>> f21343b;

        public a(T t, bua<? super T, ? extends o5h<? extends R>> buaVar) {
            this.f21342a = t;
            this.f21343b = buaVar;
        }

        @Override // defpackage.o4h
        public void R(z5h<? super R> z5hVar) {
            try {
                o5h o5hVar = (o5h) x3h.d(this.f21343b.apply(this.f21342a), "The mapper returned a null ObservableSource");
                if (!(o5hVar instanceof Callable)) {
                    o5hVar.a(z5hVar);
                    return;
                }
                try {
                    Object objCall = ((Callable) o5hVar).call();
                    if (objCall == null) {
                        EmptyDisposable.complete(z5hVar);
                        return;
                    }
                    ScalarDisposable scalarDisposable = new ScalarDisposable(z5hVar, objCall);
                    z5hVar.onSubscribe(scalarDisposable);
                    scalarDisposable.run();
                } catch (Throwable th) {
                    qf8.b(th);
                    EmptyDisposable.error(th, z5hVar);
                }
            } catch (Throwable th2) {
                EmptyDisposable.error(th2, z5hVar);
            }
        }
    }

    public static <T, U> o4h<U> a(T t, bua<? super T, ? extends o5h<? extends U>> buaVar) {
        return t5l.m(new a(t, buaVar));
    }

    public static <T, R> boolean b(o5h<T> o5hVar, z5h<? super R> z5hVar, bua<? super T, ? extends o5h<? extends R>> buaVar) {
        if (!(o5hVar instanceof Callable)) {
            return false;
        }
        try {
            a0 a0Var = (Object) ((Callable) o5hVar).call();
            if (a0Var == null) {
                EmptyDisposable.complete(z5hVar);
                return true;
            }
            try {
                o5h o5hVar2 = (o5h) x3h.d(buaVar.apply(a0Var), "The mapper returned a null ObservableSource");
                if (o5hVar2 instanceof Callable) {
                    try {
                        Object objCall = ((Callable) o5hVar2).call();
                        if (objCall == null) {
                            EmptyDisposable.complete(z5hVar);
                            return true;
                        }
                        ScalarDisposable scalarDisposable = new ScalarDisposable(z5hVar, objCall);
                        z5hVar.onSubscribe(scalarDisposable);
                        scalarDisposable.run();
                    } catch (Throwable th) {
                        qf8.b(th);
                        EmptyDisposable.error(th, z5hVar);
                        return true;
                    }
                } else {
                    o5hVar2.a(z5hVar);
                }
                return true;
            } catch (Throwable th2) {
                qf8.b(th2);
                EmptyDisposable.error(th2, z5hVar);
                return true;
            }
        } catch (Throwable th3) {
            qf8.b(th3);
            EmptyDisposable.error(th3, z5hVar);
            return true;
        }
    }
}
