package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.observable.ObservableScalarXMap;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class q4h<T, U> extends h10<T, U> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bua<? super T, ? extends o5h<? extends U>> f31081b;
    public final int c;
    public final ErrorMode d;

    public static final class a<T, R> extends AtomicInteger implements z5h<T>, jz6 {
        private static final long serialVersionUID = -6951100001833242599L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z5h<? super R> f31082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final bua<? super T, ? extends o5h<? extends R>> f31083b;
        public final int c;
        public final AtomicThrowable d = new AtomicThrowable();
        public final C1086a<R> e;
        public final boolean f;
        public jdm<T> g;
        public jz6 h;
        public volatile boolean i;
        public volatile boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public volatile boolean f31084k;
        public int l;

        /* JADX INFO: renamed from: q4h$a$a, reason: collision with other inner class name */
        public static final class C1086a<R> extends AtomicReference<jz6> implements z5h<R> {
            private static final long serialVersionUID = 2620149119579502636L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final z5h<? super R> f31085a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final a<?, R> f31086b;

            public C1086a(z5h<? super R> z5hVar, a<?, R> aVar) {
                this.f31085a = z5hVar;
                this.f31086b = aVar;
            }

            public void a() {
                DisposableHelper.dispose(this);
            }

            @Override // defpackage.z5h
            public void onComplete() {
                a<?, R> aVar = this.f31086b;
                aVar.i = false;
                aVar.a();
            }

            @Override // defpackage.z5h
            public void onError(Throwable th) {
                a<?, R> aVar = this.f31086b;
                if (!aVar.d.addThrowable(th)) {
                    t5l.p(th);
                    return;
                }
                if (!aVar.f) {
                    aVar.h.dispose();
                }
                aVar.i = false;
                aVar.a();
            }

            @Override // defpackage.z5h
            public void onNext(R r2) {
                this.f31085a.onNext(r2);
            }

            @Override // defpackage.z5h
            public void onSubscribe(jz6 jz6Var) {
                DisposableHelper.replace(this, jz6Var);
            }
        }

        public a(z5h<? super R> z5hVar, bua<? super T, ? extends o5h<? extends R>> buaVar, int i, boolean z) {
            this.f31082a = z5hVar;
            this.f31083b = buaVar;
            this.c = i;
            this.f = z;
            this.e = new C1086a<>(z5hVar, this);
        }

        public void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            z5h<? super R> z5hVar = this.f31082a;
            jdm<T> jdmVar = this.g;
            AtomicThrowable atomicThrowable = this.d;
            while (true) {
                if (!this.i) {
                    if (this.f31084k) {
                        jdmVar.clear();
                        return;
                    }
                    if (!this.f && atomicThrowable.get() != null) {
                        jdmVar.clear();
                        this.f31084k = true;
                        z5hVar.onError(atomicThrowable.terminate());
                        return;
                    }
                    boolean z = this.j;
                    try {
                        T tPoll = jdmVar.poll();
                        boolean z2 = tPoll == null;
                        if (z && z2) {
                            this.f31084k = true;
                            Throwable thTerminate = atomicThrowable.terminate();
                            if (thTerminate != null) {
                                z5hVar.onError(thTerminate);
                                return;
                            } else {
                                z5hVar.onComplete();
                                return;
                            }
                        }
                        if (!z2) {
                            try {
                                o5h o5hVar = (o5h) x3h.d(this.f31083b.apply(tPoll), "The mapper returned a null ObservableSource");
                                if (o5hVar instanceof Callable) {
                                    try {
                                        a0 a0Var = (Object) ((Callable) o5hVar).call();
                                        if (a0Var != null && !this.f31084k) {
                                            z5hVar.onNext(a0Var);
                                        }
                                    } catch (Throwable th) {
                                        qf8.b(th);
                                        atomicThrowable.addThrowable(th);
                                    }
                                } else {
                                    this.i = true;
                                    o5hVar.a(this.e);
                                }
                            } catch (Throwable th2) {
                                qf8.b(th2);
                                this.f31084k = true;
                                this.h.dispose();
                                jdmVar.clear();
                                atomicThrowable.addThrowable(th2);
                                z5hVar.onError(atomicThrowable.terminate());
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        qf8.b(th3);
                        this.f31084k = true;
                        this.h.dispose();
                        atomicThrowable.addThrowable(th3);
                        z5hVar.onError(atomicThrowable.terminate());
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // defpackage.jz6
        public void dispose() {
            this.f31084k = true;
            this.h.dispose();
            this.e.a();
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return this.f31084k;
        }

        @Override // defpackage.z5h
        public void onComplete() {
            this.j = true;
            a();
        }

        @Override // defpackage.z5h
        public void onError(Throwable th) {
            if (!this.d.addThrowable(th)) {
                t5l.p(th);
            } else {
                this.j = true;
                a();
            }
        }

        @Override // defpackage.z5h
        public void onNext(T t) {
            if (this.l == 0) {
                this.g.offer(t);
            }
            a();
        }

        @Override // defpackage.z5h
        public void onSubscribe(jz6 jz6Var) {
            if (DisposableHelper.validate(this.h, jz6Var)) {
                this.h = jz6Var;
                if (jz6Var instanceof bgi) {
                    bgi bgiVar = (bgi) jz6Var;
                    int iRequestFusion = bgiVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.l = iRequestFusion;
                        this.g = bgiVar;
                        this.j = true;
                        this.f31082a.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.l = iRequestFusion;
                        this.g = bgiVar;
                        this.f31082a.onSubscribe(this);
                        return;
                    }
                }
                this.g = new c8o(this.c);
                this.f31082a.onSubscribe(this);
            }
        }
    }

    public static final class b<T, U> extends AtomicInteger implements z5h<T>, jz6 {
        private static final long serialVersionUID = 8828587559905699186L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z5h<? super U> f31087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final bua<? super T, ? extends o5h<? extends U>> f31088b;
        public final a<U> c;
        public final int d;
        public jdm<T> e;
        public jz6 f;
        public volatile boolean g;
        public volatile boolean h;
        public volatile boolean i;
        public int j;

        public static final class a<U> extends AtomicReference<jz6> implements z5h<U> {
            private static final long serialVersionUID = -7449079488798789337L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final z5h<? super U> f31089a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b<?, ?> f31090b;

            public a(z5h<? super U> z5hVar, b<?, ?> bVar) {
                this.f31089a = z5hVar;
                this.f31090b = bVar;
            }

            public void a() {
                DisposableHelper.dispose(this);
            }

            @Override // defpackage.z5h
            public void onComplete() {
                this.f31090b.b();
            }

            @Override // defpackage.z5h
            public void onError(Throwable th) {
                this.f31090b.dispose();
                this.f31089a.onError(th);
            }

            @Override // defpackage.z5h
            public void onNext(U u) {
                this.f31089a.onNext(u);
            }

            @Override // defpackage.z5h
            public void onSubscribe(jz6 jz6Var) {
                DisposableHelper.replace(this, jz6Var);
            }
        }

        public b(z5h<? super U> z5hVar, bua<? super T, ? extends o5h<? extends U>> buaVar, int i) {
            this.f31087a = z5hVar;
            this.f31088b = buaVar;
            this.d = i;
            this.c = new a<>(z5hVar, this);
        }

        public void a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.h) {
                if (!this.g) {
                    boolean z = this.i;
                    try {
                        T tPoll = this.e.poll();
                        boolean z2 = tPoll == null;
                        if (z && z2) {
                            this.h = true;
                            this.f31087a.onComplete();
                            return;
                        } else if (!z2) {
                            try {
                                o5h o5hVar = (o5h) x3h.d(this.f31088b.apply(tPoll), "The mapper returned a null ObservableSource");
                                this.g = true;
                                o5hVar.a(this.c);
                            } catch (Throwable th) {
                                qf8.b(th);
                                dispose();
                                this.e.clear();
                                this.f31087a.onError(th);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        qf8.b(th2);
                        dispose();
                        this.e.clear();
                        this.f31087a.onError(th2);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.e.clear();
        }

        public void b() {
            this.g = false;
            a();
        }

        @Override // defpackage.jz6
        public void dispose() {
            this.h = true;
            this.c.a();
            this.f.dispose();
            if (getAndIncrement() == 0) {
                this.e.clear();
            }
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return this.h;
        }

        @Override // defpackage.z5h
        public void onComplete() {
            if (this.i) {
                return;
            }
            this.i = true;
            a();
        }

        @Override // defpackage.z5h
        public void onError(Throwable th) {
            if (this.i) {
                t5l.p(th);
                return;
            }
            this.i = true;
            dispose();
            this.f31087a.onError(th);
        }

        @Override // defpackage.z5h
        public void onNext(T t) {
            if (this.i) {
                return;
            }
            if (this.j == 0) {
                this.e.offer(t);
            }
            a();
        }

        @Override // defpackage.z5h
        public void onSubscribe(jz6 jz6Var) {
            if (DisposableHelper.validate(this.f, jz6Var)) {
                this.f = jz6Var;
                if (jz6Var instanceof bgi) {
                    bgi bgiVar = (bgi) jz6Var;
                    int iRequestFusion = bgiVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.j = iRequestFusion;
                        this.e = bgiVar;
                        this.i = true;
                        this.f31087a.onSubscribe(this);
                        a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.j = iRequestFusion;
                        this.e = bgiVar;
                        this.f31087a.onSubscribe(this);
                        return;
                    }
                }
                this.e = new c8o(this.d);
                this.f31087a.onSubscribe(this);
            }
        }
    }

    public q4h(o5h<T> o5hVar, bua<? super T, ? extends o5h<? extends U>> buaVar, int i, ErrorMode errorMode) {
        super(o5hVar);
        this.f31081b = buaVar;
        this.d = errorMode;
        this.c = Math.max(8, i);
    }

    @Override // defpackage.o4h
    public void R(z5h<? super U> z5hVar) {
        if (ObservableScalarXMap.b(this.f19561a, z5hVar, this.f31081b)) {
            return;
        }
        if (this.d == ErrorMode.IMMEDIATE) {
            this.f19561a.a(new b(new swl(z5hVar), this.f31081b, this.c));
        } else {
            this.f19561a.a(new a(z5hVar, this.f31081b, this.c, this.d == ErrorMode.END));
        }
    }
}
