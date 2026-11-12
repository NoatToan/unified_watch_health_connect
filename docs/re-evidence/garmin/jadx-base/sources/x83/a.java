package x83;

import j83.f;
import j83.g;
import j83.n;
import j83.o;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.lang3.e;
import rx.exceptions.MissingBackpressureException;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public final class a<T> extends x83.b<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b<T> f189579b;

    /* JADX INFO: renamed from: x83.a$a, reason: collision with other inner class name */
    public static final class C3526a<T> extends AtomicLong implements g, o, f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b<T> f189580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n<? super T> f189581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f189582c;

        public C3526a(b<T> bVar, n<? super T> nVar) {
            this.f189580a = bVar;
            this.f189581b = nVar;
        }

        @Override // j83.f
        public final void a() {
            if (get() != Long.MIN_VALUE) {
                this.f189581b.a();
            }
        }

        @Override // j83.g
        public final void b(long j8) {
            long j14;
            long j15;
            if (j8 < 0) {
                h.s(e.e(j8, "n >= 0 required but it was "));
                return;
            }
            if (j8 != 0) {
                do {
                    j14 = get();
                    if (j14 == Long.MIN_VALUE) {
                        return;
                    }
                    j15 = j14 + j8;
                    if (j15 < 0) {
                        j15 = Long.MAX_VALUE;
                    }
                } while (!compareAndSet(j14, j15));
            }
        }

        @Override // j83.f
        public final void c(T t7) {
            long j8 = get();
            if (j8 != Long.MIN_VALUE) {
                long j14 = this.f189582c;
                n<? super T> nVar = this.f189581b;
                if (j8 != j14) {
                    this.f189582c = j14 + 1;
                    nVar.c(t7);
                } else {
                    f();
                    nVar.onError(new MissingBackpressureException("PublishSubject: could not emit value due to lack of requests"));
                }
            }
        }

        @Override // j83.o
        public final boolean e() {
            return get() == Long.MIN_VALUE;
        }

        @Override // j83.o
        public final void f() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f189580a.b(this);
            }
        }

        @Override // j83.f
        public final void onError(Throwable th3) {
            if (get() != Long.MIN_VALUE) {
                this.f189581b.onError(th3);
            }
        }
    }

    public static final class b<T> extends AtomicReference<C3526a<T>[]> implements j83.e.a<T>, f<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C3526a[] f189583b = new C3526a[0];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C3526a[] f189584c = new C3526a[0];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Throwable f189585a;

        public b() {
            lazySet(f189583b);
        }

        @Override // j83.f
        public final void a() {
            for (C3526a<T> c3526a : getAndSet(f189584c)) {
                c3526a.a();
            }
        }

        public final void b(C3526a<T> c3526a) {
            C3526a<T>[] c3526aArr;
            C3526a<T>[] c3526aArr2;
            do {
                c3526aArr = get();
                if (c3526aArr == f189584c || c3526aArr == (c3526aArr2 = f189583b)) {
                    return;
                }
                int length = c3526aArr.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        i14 = -1;
                        break;
                    } else if (c3526aArr[i14] == c3526a) {
                        break;
                    } else {
                        i14++;
                    }
                }
                if (i14 < 0) {
                    return;
                }
                if (length != 1) {
                    c3526aArr2 = new C3526a[length - 1];
                    System.arraycopy(c3526aArr, 0, c3526aArr2, 0, i14);
                    System.arraycopy(c3526aArr, i14 + 1, c3526aArr2, i14, (length - i14) - 1);
                }
            } while (!compareAndSet(c3526aArr, c3526aArr2));
        }

        @Override // j83.f
        public final void c(T t7) {
            for (C3526a<T> c3526a : get()) {
                c3526a.c(t7);
            }
        }

        @Override // n83.b
        public final void call(Object obj) {
            C3526a<T>[] c3526aArr;
            C3526a[] c3526aArr2;
            n nVar = (n) obj;
            C3526a<T> c3526a = new C3526a<>(this, nVar);
            nVar.b(c3526a);
            nVar.i(c3526a);
            do {
                c3526aArr = get();
                if (c3526aArr == f189584c) {
                    Throwable th3 = this.f189585a;
                    if (th3 != null) {
                        nVar.onError(th3);
                        return;
                    } else {
                        nVar.a();
                        return;
                    }
                }
                int length = c3526aArr.length;
                c3526aArr2 = new C3526a[length + 1];
                System.arraycopy(c3526aArr, 0, c3526aArr2, 0, length);
                c3526aArr2[length] = c3526a;
            } while (!compareAndSet(c3526aArr, c3526aArr2));
            if (c3526a.e()) {
                b(c3526a);
            }
        }

        @Override // j83.f
        public final void onError(Throwable th3) {
            this.f189585a = th3;
            ArrayList arrayList = null;
            for (C3526a<T> c3526a : getAndSet(f189584c)) {
                try {
                    c3526a.onError(th3);
                } catch (Throwable th4) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    arrayList.add(th4);
                }
            }
            m83.a.a(arrayList);
        }
    }

    public a(b<T> bVar) {
        super(bVar);
        this.f189579b = bVar;
    }

    @Override // j83.f
    public final void a() {
        this.f189579b.a();
    }

    @Override // j83.f
    public final void c(T t7) {
        this.f189579b.c(t7);
    }

    @Override // j83.f
    public final void onError(Throwable th3) {
        this.f189579b.onError(th3);
    }
}
