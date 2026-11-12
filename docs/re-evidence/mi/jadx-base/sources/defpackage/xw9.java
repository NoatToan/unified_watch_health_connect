package defpackage;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class xw9 extends fj2 {

    public static final class b implements fj2.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ex9 f39528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f39529b;
        public final ax9.a c;

        @Override // fj2.f
        public fj2.e a(jl8 jl8Var, long j) throws IOException {
            long position = jl8Var.getPosition();
            long jC = c(jl8Var);
            long jN = jl8Var.n();
            jl8Var.o(Math.max(6, this.f39528a.c));
            long jC2 = c(jl8Var);
            long jN2 = jl8Var.n();
            if (jC > j || jC2 <= j) {
                return jC2 <= j ? fj2.e.f(jC2, jN2) : fj2.e.d(jC, position);
            }
            return fj2.e.e(jN);
        }

        public final long c(jl8 jl8Var) throws IOException {
            while (jl8Var.n() < jl8Var.getLength() - 6 && !ax9.h(jl8Var, this.f39528a, this.f39529b, this.c)) {
                jl8Var.o(1);
            }
            if (jl8Var.n() < jl8Var.getLength() - 6) {
                return this.c.f3535a;
            }
            jl8Var.o((int) (jl8Var.getLength() - jl8Var.n()));
            return this.f39528a.j;
        }

        public b(ex9 ex9Var, int i) {
            this.f39528a = ex9Var;
            this.f39529b = i;
            this.c = new ax9.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw9(final ex9 ex9Var, int i, long j, long j2) {
        super(new fj2.d() { // from class: ww9
            @Override // fj2.d
            public final long a(long j3) {
                return ex9Var.j(j3);
            }
        }, new b(ex9Var, i), ex9Var.g(), 0L, ex9Var.j, j, j2, ex9Var.e(), Math.max(6, ex9Var.c));
        Objects.requireNonNull(ex9Var);
    }
}
