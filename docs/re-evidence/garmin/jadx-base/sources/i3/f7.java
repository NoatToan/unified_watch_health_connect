package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Li3/f7;", "", "<init>", "()V", "a", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f7 f88085a = new f7();

    private f7() {
    }

    public static e7 a(p3.m mVar) {
        long j8;
        e7 e7Var;
        p3.x1 x1Var = p3.n.f135158a;
        long j14 = ((o4.d0) mVar.A(s2.f89590a)).f128833a;
        s7.f89624a.getClass();
        j2 j2VarA = s7.a(mVar);
        e7 e7Var2 = j2VarA.f88482f0;
        if (e7Var2 == null) {
            o4.d0.f128823b.getClass();
            j8 = j14;
            long j15 = o4.d0.f128831j;
            n3.a1.f122687a.getClass();
            e7Var = new e7(j15, j8, j15, o4.d0.c(n3.a1.f122688b, j8, 14), null);
            j2VarA.f88482f0 = e7Var;
        } else {
            j8 = j14;
            e7Var = e7Var2;
        }
        if (o4.d0.d(e7Var.f87960b, j8)) {
            return e7Var;
        }
        n3.a1.f122687a.getClass();
        return e7.a(e7Var, j8, o4.d0.c(n3.a1.f122688b, j8, 14), 5);
    }

    public static long b(f7 f7Var) {
        float f14;
        a.C1734a c1734a = a.f88086b;
        c1734a.getClass();
        int i14 = a.f88087c;
        f7Var.getClass();
        c1734a.getClass();
        if (i14 == 0) {
            n3.y0.f123325a.getClass();
            f14 = n3.y0.f123330f + n3.y0.f123331g;
            g6.f.a aVar = g6.f.f75994b;
        } else {
            n3.y0.f123325a.getClass();
            float f15 = n3.y0.f123328d;
            f14 = f15 + f15;
            g6.f.a aVar2 = g6.f.f75994b;
        }
        n3.y0.f123325a.getClass();
        return dh.b.e(n3.y0.f123329e + f14, n3.y0.f123326b);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Li3/f7$a;", "", "a", "value", "", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @d23.a
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C1734a f88086b = new C1734a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f88087c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f88088d = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f88089a;

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.f88089a == ((a) obj).f88089a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f88089a);
        }

        public final String toString() {
            int i14 = this.f88089a;
            if (i14 == 0) {
                return "Narrow";
            }
            if (i14 == f88087c) {
                return "Uniform";
            }
            return i14 == f88088d ? "Wide" : "Unknown";
        }

        /* JADX INFO: renamed from: i3.f7$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li3/f7$a$a;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C1734a {
            public /* synthetic */ C1734a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C1734a() {
            }
        }
    }
}
