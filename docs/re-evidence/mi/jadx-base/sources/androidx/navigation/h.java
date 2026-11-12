package androidx.navigation;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2696b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2697a;
        public boolean c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2698b = -1;
        public int d = -1;
        public int e = -1;
        public int f = -1;
        public int g = -1;

        public h a() {
            return new h(this.f2697a, this.f2698b, this.c, this.d, this.e, this.f, this.g);
        }

        public a b(int i) {
            this.d = i;
            return this;
        }

        public a c(int i) {
            this.e = i;
            return this;
        }

        public a d(boolean z) {
            this.f2697a = z;
            return this;
        }

        public a e(int i) {
            this.f = i;
            return this;
        }

        public a f(int i) {
            this.g = i;
            return this;
        }

        public a g(int i, boolean z) {
            this.f2698b = i;
            this.c = z;
            return this;
        }
    }

    public h(boolean z, int i, boolean z2, int i2, int i3, int i4, int i5) {
        this.f2695a = z;
        this.f2696b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.g;
    }

    public int e() {
        return this.f2696b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f2695a == hVar.f2695a && this.f2696b == hVar.f2696b && this.c == hVar.c && this.d == hVar.d && this.e == hVar.e && this.f == hVar.f && this.g == hVar.g;
    }

    public boolean f() {
        return this.c;
    }

    public boolean g() {
        return this.f2695a;
    }

    public int hashCode() {
        return ((((((((((((g() ? 1 : 0) * 31) + e()) * 31) + (f() ? 1 : 0)) * 31) + a()) * 31) + b()) * 31) + c()) * 31) + d();
    }
}
