package o83;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public final class o<T> implements j83.l.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83.e.a<T> f130941a;

    public static final class a<T> extends j83.n<T> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final j83.m<? super T> f130942e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public T f130943f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f130944g;

        public a(j83.m<? super T> mVar) {
            this.f130942e = mVar;
        }

        @Override // j83.f
        public final void a() {
            int i14 = this.f130944g;
            j83.m<? super T> mVar = this.f130942e;
            if (i14 == 0) {
                mVar.b(new NoSuchElementException());
            } else if (i14 == 1) {
                this.f130944g = 2;
                T t7 = this.f130943f;
                this.f130943f = null;
                mVar.c(t7);
            }
        }

        @Override // j83.f
        public final void c(T t7) {
            int i14 = this.f130944g;
            if (i14 == 0) {
                this.f130944g = 1;
                this.f130943f = t7;
            } else if (i14 == 1) {
                this.f130944g = 2;
                this.f130942e.b(new IndexOutOfBoundsException("The upstream produced more than one value"));
            }
        }

        @Override // j83.f
        public final void onError(Throwable th3) {
            if (this.f130944g == 2) {
                v83.s.a(th3);
            } else {
                this.f130943f = null;
                this.f130942e.b(th3);
            }
        }
    }

    public o(j83.e.a<T> aVar) {
        this.f130941a = aVar;
    }

    @Override // n83.b
    public final void call(Object obj) {
        j83.m mVar = (j83.m) obj;
        a aVar = new a(mVar);
        mVar.a(aVar);
        this.f130941a.call(aVar);
    }
}
