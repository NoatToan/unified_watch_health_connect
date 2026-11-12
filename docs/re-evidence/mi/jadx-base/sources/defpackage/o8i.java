package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o8i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f28856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a<T> f28857b;
    public a<T> c;
    public int d;

    public static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f28858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f28859b;
        public a<T> c;

        public a(T t, int i) {
            this.f28858a = t;
            this.f28859b = i;
        }

        public int a(T t, int i) {
            System.arraycopy(this.f28858a, 0, t, i, this.f28859b);
            return i + this.f28859b;
        }

        public T b() {
            return this.f28858a;
        }

        public void c(a<T> aVar) {
            if (this.c != null) {
                throw new IllegalStateException();
            }
            this.c = aVar;
        }

        public a<T> d() {
            return this.c;
        }
    }

    public abstract T a(int i);

    public void b() {
        a<T> aVar = this.c;
        if (aVar != null) {
            this.f28856a = aVar.b();
        }
        this.c = null;
        this.f28857b = null;
        this.d = 0;
    }

    public final T c(T t, int i) {
        a<T> aVar = new a<>(t, i);
        if (this.f28857b == null) {
            this.c = aVar;
            this.f28857b = aVar;
        } else {
            this.c.c(aVar);
            this.c = aVar;
        }
        this.d += i;
        return a(i < 16384 ? i + i : i + (i >> 2));
    }

    public int d() {
        return this.d;
    }

    public T e(T t, int i) {
        int i2 = this.d + i;
        T tA = a(i2);
        int iA = 0;
        for (a<T> aVarD = this.f28857b; aVarD != null; aVarD = aVarD.d()) {
            iA = aVarD.a(tA, iA);
        }
        System.arraycopy(t, 0, tA, iA, i);
        int i3 = iA + i;
        if (i3 == i2) {
            return tA;
        }
        throw new IllegalStateException("Should have gotten " + i2 + " entries, got " + i3);
    }

    public T f() {
        b();
        T t = this.f28856a;
        return t == null ? a(12) : t;
    }
}
