package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class y5h<T, R> extends o4h<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o5h<? extends T>[] f39810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterable<? extends o5h<? extends T>> f39811b;
    public final bua<? super Object[], ? extends R> c;
    public final int d;
    public final boolean e;

    public static final class a<T, R> extends AtomicInteger implements jz6 {
        private static final long serialVersionUID = 2983708048395377667L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z5h<? super R> f39812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final bua<? super Object[], ? extends R> f39813b;
        public final b<T, R>[] c;
        public final T[] d;
        public final boolean e;
        public volatile boolean f;

        public a(z5h<? super R> z5hVar, bua<? super Object[], ? extends R> buaVar, int i, boolean z) {
            this.f39812a = z5hVar;
            this.f39813b = buaVar;
            this.c = new b[i];
            this.d = (T[]) new Object[i];
            this.e = z;
        }

        public void a() {
            d();
            b();
        }

        public void b() {
            for (b<T, R> bVar : this.c) {
                bVar.a();
            }
        }

        public boolean c(boolean z, boolean z2, z5h<? super R> z5hVar, boolean z3, b<?, ?> bVar) {
            if (this.f) {
                a();
                return true;
            }
            if (!z) {
                return false;
            }
            if (z3) {
                if (!z2) {
                    return false;
                }
                Throwable th = bVar.d;
                this.f = true;
                a();
                if (th != null) {
                    z5hVar.onError(th);
                } else {
                    z5hVar.onComplete();
                }
                return true;
            }
            Throwable th2 = bVar.d;
            if (th2 != null) {
                this.f = true;
                a();
                z5hVar.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            this.f = true;
            a();
            z5hVar.onComplete();
            return true;
        }

        public void d() {
            for (b<T, R> bVar : this.c) {
                bVar.f39815b.clear();
            }
        }

        @Override // defpackage.jz6
        public void dispose() {
            if (this.f) {
                return;
            }
            this.f = true;
            b();
            if (getAndIncrement() == 0) {
                d();
            }
        }

        public void e() {
            Throwable th;
            if (getAndIncrement() != 0) {
                return;
            }
            b<T, R>[] bVarArr = this.c;
            z5h<? super R> z5hVar = this.f39812a;
            T[] tArr = this.d;
            boolean z = this.e;
            int iAddAndGet = 1;
            while (true) {
                int i = 0;
                int i2 = 0;
                for (b<T, R> bVar : bVarArr) {
                    if (tArr[i2] == null) {
                        boolean z2 = bVar.c;
                        T tPoll = bVar.f39815b.poll();
                        boolean z3 = tPoll == null;
                        if (c(z2, z3, z5hVar, z, bVar)) {
                            return;
                        }
                        if (z3) {
                            i++;
                        } else {
                            tArr[i2] = tPoll;
                        }
                    } else if (bVar.c && !z && (th = bVar.d) != null) {
                        this.f = true;
                        a();
                        z5hVar.onError(th);
                        return;
                    }
                    i2++;
                }
                if (i != 0) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        z5hVar.onNext((Object) x3h.d(this.f39813b.apply(tArr.clone()), "The zipper returned a null value"));
                        Arrays.fill(tArr, (Object) null);
                    } catch (Throwable th2) {
                        qf8.b(th2);
                        a();
                        z5hVar.onError(th2);
                        return;
                    }
                }
            }
        }

        public void f(o5h<? extends T>[] o5hVarArr, int i) {
            b<T, R>[] bVarArr = this.c;
            int length = bVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                bVarArr[i2] = new b<>(this, i);
            }
            lazySet(0);
            this.f39812a.onSubscribe(this);
            for (int i3 = 0; i3 < length && !this.f; i3++) {
                o5hVarArr[i3].a(bVarArr[i3]);
            }
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return this.f;
        }
    }

    public static final class b<T, R> implements z5h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a<T, R> f39814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c8o<T> f39815b;
        public volatile boolean c;
        public Throwable d;
        public final AtomicReference<jz6> e = new AtomicReference<>();

        public b(a<T, R> aVar, int i) {
            this.f39814a = aVar;
            this.f39815b = new c8o<>(i);
        }

        public void a() {
            DisposableHelper.dispose(this.e);
        }

        @Override // defpackage.z5h
        public void onComplete() {
            this.c = true;
            this.f39814a.e();
        }

        @Override // defpackage.z5h
        public void onError(Throwable th) {
            this.d = th;
            this.c = true;
            this.f39814a.e();
        }

        @Override // defpackage.z5h
        public void onNext(T t) {
            this.f39815b.offer(t);
            this.f39814a.e();
        }

        @Override // defpackage.z5h
        public void onSubscribe(jz6 jz6Var) {
            DisposableHelper.setOnce(this.e, jz6Var);
        }
    }

    public y5h(o5h<? extends T>[] o5hVarArr, Iterable<? extends o5h<? extends T>> iterable, bua<? super Object[], ? extends R> buaVar, int i, boolean z) {
        this.f39810a = o5hVarArr;
        this.f39811b = iterable;
        this.c = buaVar;
        this.d = i;
        this.e = z;
    }

    @Override // defpackage.o4h
    public void R(z5h<? super R> z5hVar) {
        int length;
        o5h<? extends T>[] o5hVarArr = this.f39810a;
        if (o5hVarArr == null) {
            o5hVarArr = new o5h[8];
            length = 0;
            for (o5h<? extends T> o5hVar : this.f39811b) {
                if (length == o5hVarArr.length) {
                    o5h<? extends T>[] o5hVarArr2 = new o5h[(length >> 2) + length];
                    System.arraycopy(o5hVarArr, 0, o5hVarArr2, 0, length);
                    o5hVarArr = o5hVarArr2;
                }
                o5hVarArr[length] = o5hVar;
                length++;
            }
        } else {
            length = o5hVarArr.length;
        }
        if (length == 0) {
            EmptyDisposable.complete(z5hVar);
        } else {
            new a(z5hVar, this.c, length, this.e).f(o5hVarArr, this.d);
        }
    }
}
