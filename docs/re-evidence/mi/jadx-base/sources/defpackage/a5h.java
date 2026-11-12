package defpackage;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class a5h<T> extends o4h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterable<? extends T> f641a;

    public static final class a<T> extends og2<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z5h<? super T> f642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<? extends T> f643b;
        public volatile boolean c;
        public boolean d;
        public boolean e;
        public boolean f;

        public a(z5h<? super T> z5hVar, Iterator<? extends T> it) {
            this.f642a = z5hVar;
            this.f643b = it;
        }

        public void a() {
            while (!isDisposed()) {
                try {
                    this.f642a.onNext(x3h.d(this.f643b.next(), "The iterator returned a null value"));
                    if (isDisposed()) {
                        return;
                    }
                    try {
                        if (!this.f643b.hasNext()) {
                            if (isDisposed()) {
                                return;
                            }
                            this.f642a.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        qf8.b(th);
                        this.f642a.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    qf8.b(th2);
                    this.f642a.onError(th2);
                    return;
                }
            }
        }

        @Override // defpackage.jdm
        public void clear() {
            this.e = true;
        }

        @Override // defpackage.jz6
        public void dispose() {
            this.c = true;
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return this.c;
        }

        @Override // defpackage.jdm
        public boolean isEmpty() {
            return this.e;
        }

        @Override // defpackage.jdm
        public T poll() {
            if (this.e) {
                return null;
            }
            if (!this.f) {
                this.f = true;
            } else if (!this.f643b.hasNext()) {
                this.e = true;
                return null;
            }
            return (T) x3h.d(this.f643b.next(), "The iterator returned a null value");
        }

        @Override // defpackage.dgi
        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.d = true;
            return 1;
        }
    }

    public a5h(Iterable<? extends T> iterable) {
        this.f641a = iterable;
    }

    @Override // defpackage.o4h
    public void R(z5h<? super T> z5hVar) {
        try {
            Iterator<? extends T> it = this.f641a.iterator();
            try {
                if (!it.hasNext()) {
                    EmptyDisposable.complete(z5hVar);
                    return;
                }
                a aVar = new a(z5hVar, it);
                z5hVar.onSubscribe(aVar);
                if (aVar.d) {
                    return;
                }
                aVar.a();
            } catch (Throwable th) {
                qf8.b(th);
                EmptyDisposable.error(th, z5hVar);
            }
        } catch (Throwable th2) {
            qf8.b(th2);
            EmptyDisposable.error(th2, z5hVar);
        }
    }
}
