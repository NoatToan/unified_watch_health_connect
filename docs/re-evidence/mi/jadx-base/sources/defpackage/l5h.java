package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class l5h<T> extends h10<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bua<? super o4h<Throwable>, ? extends o5h<?>> f24687b;

    public static final class a<T> extends AtomicInteger implements z5h<T>, jz6 {
        private static final long serialVersionUID = 802743776666017014L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z5h<? super T> f24688a;
        public final qno<Throwable> d;
        public final o5h<T> g;
        public volatile boolean h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicInteger f24689b = new AtomicInteger();
        public final AtomicThrowable c = new AtomicThrowable();
        public final a<T>.C1006a e = new C1006a();
        public final AtomicReference<jz6> f = new AtomicReference<>();

        /* JADX INFO: renamed from: l5h$a$a, reason: collision with other inner class name */
        public final class C1006a extends AtomicReference<jz6> implements z5h<Object> {
            private static final long serialVersionUID = 3254781284376480842L;

            public C1006a() {
            }

            @Override // defpackage.z5h
            public void onComplete() {
                a.this.a();
            }

            @Override // defpackage.z5h
            public void onError(Throwable th) {
                a.this.b(th);
            }

            @Override // defpackage.z5h
            public void onNext(Object obj) {
                a.this.c();
            }

            @Override // defpackage.z5h
            public void onSubscribe(jz6 jz6Var) {
                DisposableHelper.setOnce(this, jz6Var);
            }
        }

        public a(z5h<? super T> z5hVar, qno<Throwable> qnoVar, o5h<T> o5hVar) {
            this.f24688a = z5hVar;
            this.d = qnoVar;
            this.g = o5hVar;
        }

        public void a() {
            DisposableHelper.dispose(this.f);
            fkb.a(this.f24688a, this, this.c);
        }

        public void b(Throwable th) {
            DisposableHelper.dispose(this.f);
            fkb.c(this.f24688a, th, this, this.c);
        }

        public void c() {
            d();
        }

        public void d() {
            if (this.f24689b.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.h) {
                        this.h = true;
                        this.g.a(this);
                    }
                    if (this.f24689b.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // defpackage.jz6
        public void dispose() {
            DisposableHelper.dispose(this.f);
            DisposableHelper.dispose(this.e);
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f.get());
        }

        @Override // defpackage.z5h
        public void onComplete() {
            DisposableHelper.dispose(this.e);
            fkb.a(this.f24688a, this, this.c);
        }

        @Override // defpackage.z5h
        public void onError(Throwable th) {
            DisposableHelper.replace(this.f, null);
            this.h = false;
            this.d.onNext(th);
        }

        @Override // defpackage.z5h
        public void onNext(T t) {
            fkb.e(this.f24688a, t, this, this.c);
        }

        @Override // defpackage.z5h
        public void onSubscribe(jz6 jz6Var) {
            DisposableHelper.replace(this.f, jz6Var);
        }
    }

    public l5h(o5h<T> o5hVar, bua<? super o4h<Throwable>, ? extends o5h<?>> buaVar) {
        super(o5hVar);
        this.f24687b = buaVar;
    }

    @Override // defpackage.o4h
    public void R(z5h<? super T> z5hVar) {
        qno<T> qnoVarJ0 = oei.l0().j0();
        try {
            o5h o5hVar = (o5h) x3h.d(this.f24687b.apply(qnoVarJ0), "The handler returned a null ObservableSource");
            a aVar = new a(z5hVar, qnoVarJ0, this.f19561a);
            z5hVar.onSubscribe(aVar);
            o5hVar.a(aVar.e);
            aVar.d();
        } catch (Throwable th) {
            qf8.b(th);
            EmptyDisposable.error(th, z5hVar);
        }
    }
}
