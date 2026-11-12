package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8330c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8333c;

        public b(int i14) {
            this.f8331a = i14;
        }
    }

    static {
        b bVar = new b(0);
        fa.a.a(bVar.f8332b <= bVar.f8333c);
        new k(bVar);
        fa.z.H(0);
        fa.z.H(1);
        fa.z.H(2);
        fa.z.H(3);
    }

    private k(b bVar) {
        this.f8328a = bVar.f8331a;
        this.f8329b = bVar.f8332b;
        this.f8330c = bVar.f8333c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f8328a == kVar.f8328a && this.f8329b == kVar.f8329b && this.f8330c == kVar.f8330c;
    }

    public final int hashCode() {
        return (((((527 + this.f8328a) * 31) + this.f8329b) * 31) + this.f8330c) * 31;
    }

    @Deprecated
    public k(int i14, int i15, int i16) {
        b bVar = new b(i14);
        bVar.f8332b = i15;
        bVar.f8333c = i16;
        this(bVar);
    }
}
