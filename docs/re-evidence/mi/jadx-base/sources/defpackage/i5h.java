package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

/* JADX INFO: loaded from: classes2.dex */
public final class i5h<T> extends h10<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hfl f20807b;
    public final boolean c;
    public final int d;

    public static final class a<T> extends BasicIntQueueDisposable<T> implements z5h<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z5h<? super T> f20808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hfl.c f20809b;
        public final boolean c;
        public final int d;
        public jdm<T> e;
        public jz6 f;
        public Throwable g;
        public volatile boolean h;
        public volatile boolean i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f20810k;

        public a(z5h<? super T> z5hVar, hfl.c cVar, boolean z, int i) {
            this.f20808a = z5hVar;
            this.f20809b = cVar;
            this.c = z;
            this.d = i;
        }

        public boolean a(boolean z, boolean z2, z5h<? super T> z5hVar) {
            if (this.i) {
                this.e.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.g;
            if (this.c) {
                if (!z2) {
                    return false;
                }
                this.i = true;
                if (th != null) {
                    z5hVar.onError(th);
                } else {
                    z5hVar.onComplete();
                }
                this.f20809b.dispose();
                return true;
            }
            if (th != null) {
                this.i = true;
                this.e.clear();
                z5hVar.onError(th);
                this.f20809b.dispose();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.i = true;
            z5hVar.onComplete();
            this.f20809b.dispose();
            return true;
        }

        public void b() {
            int iAddAndGet = 1;
            while (!this.i) {
                boolean z = this.h;
                Throwable th = this.g;
                if (!this.c && z && th != null) {
                    this.i = true;
                    this.f20808a.onError(this.g);
                    this.f20809b.dispose();
                    return;
                }
                this.f20808a.onNext(null);
                if (z) {
                    this.i = true;
                    Throwable th2 = this.g;
                    if (th2 != null) {
                        this.f20808a.onError(th2);
                    } else {
                        this.f20808a.onComplete();
                    }
                    this.f20809b.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        public void c() {
            jdm<T> jdmVar = this.e;
            z5h<? super T> z5hVar = this.f20808a;
            int iAddAndGet = 1;
            while (!a(this.h, jdmVar.isEmpty(), z5hVar)) {
                while (true) {
                    boolean z = this.h;
                    try {
                        T tPoll = jdmVar.poll();
                        boolean z2 = tPoll == null;
                        if (a(z, z2, z5hVar)) {
                            return;
                        }
                        if (z2) {
                            break;
                        } else {
                            z5hVar.onNext(tPoll);
                        }
                    } catch (Throwable th) {
                        qf8.b(th);
                        this.i = true;
                        this.f.dispose();
                        jdmVar.clear();
                        z5hVar.onError(th);
                        this.f20809b.dispose();
                        return;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, defpackage.jdm
        public void clear() {
            this.e.clear();
        }

        public void d() {
            if (getAndIncrement() == 0) {
                this.f20809b.b(this);
            }
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, defpackage.jz6
        public void dispose() {
            if (this.i) {
                return;
            }
            this.i = true;
            this.f.dispose();
            this.f20809b.dispose();
            if (this.f20810k || getAndIncrement() != 0) {
                return;
            }
            this.e.clear();
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, defpackage.jz6
        public boolean isDisposed() {
            return this.i;
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, defpackage.jdm
        public boolean isEmpty() {
            return this.e.isEmpty();
        }

        @Override // defpackage.z5h
        public void onComplete() {
            if (this.h) {
                return;
            }
            this.h = true;
            d();
        }

        @Override // defpackage.z5h
        public void onError(Throwable th) {
            if (this.h) {
                t5l.p(th);
                return;
            }
            this.g = th;
            this.h = true;
            d();
        }

        @Override // defpackage.z5h
        public void onNext(T t) {
            if (this.h) {
                return;
            }
            if (this.j != 2) {
                this.e.offer(t);
            }
            d();
        }

        @Override // defpackage.z5h
        public void onSubscribe(jz6 jz6Var) {
            if (DisposableHelper.validate(this.f, jz6Var)) {
                this.f = jz6Var;
                if (jz6Var instanceof bgi) {
                    bgi bgiVar = (bgi) jz6Var;
                    int iRequestFusion = bgiVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.j = iRequestFusion;
                        this.e = bgiVar;
                        this.h = true;
                        this.f20808a.onSubscribe(this);
                        d();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.j = iRequestFusion;
                        this.e = bgiVar;
                        this.f20808a.onSubscribe(this);
                        return;
                    }
                }
                this.e = new c8o(this.d);
                this.f20808a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, defpackage.jdm
        public T poll() throws Exception {
            return this.e.poll();
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, defpackage.dgi
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f20810k = true;
            return 2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f20810k) {
                b();
            } else {
                c();
            }
        }
    }

    public i5h(o5h<T> o5hVar, hfl hflVar, boolean z, int i) {
        super(o5hVar);
        this.f20807b = hflVar;
        this.c = z;
        this.d = i;
    }

    @Override // defpackage.o4h
    public void R(z5h<? super T> z5hVar) {
        hfl hflVar = this.f20807b;
        if (hflVar instanceof nwp) {
            this.f19561a.a(z5hVar);
        } else {
            this.f19561a.a(new a(z5hVar, hflVar.b(), this.c, this.d));
        }
    }
}
