package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.v;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface p91 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f30137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v f30138b;
        public final int c;
        public final k.a d;
        public final long e;
        public final v f;
        public final int g;
        public final k.a h;
        public final long i;
        public final long j;

        public a(long j, v vVar, int i, k.a aVar, long j2, v vVar2, int i2, k.a aVar2, long j3, long j4) {
            this.f30137a = j;
            this.f30138b = vVar;
            this.c = i;
            this.d = aVar;
            this.e = j2;
            this.f = vVar2;
            this.g = i2;
            this.h = aVar2;
            this.i = j3;
            this.j = j4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f30137a == aVar.f30137a && this.c == aVar.c && this.e == aVar.e && this.g == aVar.g && this.i == aVar.i && this.j == aVar.j && j4h.a(this.f30138b, aVar.f30138b) && j4h.a(this.d, aVar.d) && j4h.a(this.f, aVar.f) && j4h.a(this.h, aVar.h);
        }

        public int hashCode() {
            return j4h.b(Long.valueOf(this.f30137a), this.f30138b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nh8 f30139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseArray<a> f30140b;

        public b(nh8 nh8Var, SparseArray<a> sparseArray) {
            this.f30139a = nh8Var;
            SparseArray<a> sparseArray2 = new SparseArray<>(nh8Var.d());
            for (int i = 0; i < nh8Var.d(); i++) {
                int iC = nh8Var.c(i);
                sparseArray2.append(iC, (a) rk1.e(sparseArray.get(iC)));
            }
            this.f30140b = sparseArray2;
        }
    }

    default void A(a aVar, m mVar, int i) {
    }

    default void B(a aVar, ss5 ss5Var) {
    }

    @Deprecated
    default void C(a aVar, boolean z) {
    }

    default void D(a aVar, int i) {
    }

    default void E(q qVar, b bVar) {
    }

    default void F(a aVar, TrackGroupArray trackGroupArray, aop aopVar) {
    }

    default void G(a aVar) {
    }

    default void H(a aVar, Exception exc) {
    }

    @Deprecated
    default void I(a aVar, int i, ss5 ss5Var) {
    }

    default void J(a aVar, boolean z) {
    }

    default void K(a aVar, n0i n0iVar) {
    }

    default void L(a aVar, mie mieVar, ljf ljfVar, IOException iOException, boolean z) {
    }

    default void M(a aVar, long j, int i) {
    }

    default void N(a aVar, long j) {
    }

    default void O(a aVar, ljf ljfVar) {
    }

    @Deprecated
    default void P(a aVar, int i, int i2, int i3, float f) {
    }

    @Deprecated
    default void Q(a aVar, int i, String str, long j) {
    }

    default void R(a aVar, Format format, us5 us5Var) {
    }

    default void S(a aVar, Object obj, long j) {
    }

    default void T(a aVar, ss5 ss5Var) {
    }

    default void U(a aVar, mie mieVar, ljf ljfVar) {
    }

    @Deprecated
    default void V(a aVar, String str, long j) {
    }

    default void W(a aVar, q.f fVar, q.f fVar2, int i) {
    }

    default void X(a aVar, String str) {
    }

    @Deprecated
    default void Y(a aVar, Format format) {
    }

    default void Z(a aVar, String str, long j, long j2) {
    }

    default void a(a aVar, boolean z) {
    }

    default void a0(a aVar, int i) {
    }

    default void b(a aVar, Exception exc) {
    }

    default void b0(a aVar, List<Metadata> list) {
    }

    default void c(a aVar, mie mieVar, ljf ljfVar) {
    }

    default void c0(a aVar, Exception exc) {
    }

    default void d(a aVar) {
    }

    default void d0(a aVar, String str, long j, long j2) {
    }

    default void e(a aVar, int i, int i2) {
    }

    default void e0(a aVar, String str) {
    }

    default void f(a aVar, wrq wrqVar) {
    }

    default void f0(a aVar, Metadata metadata) {
    }

    default void g(a aVar, ExoPlaybackException exoPlaybackException) {
    }

    default void g0(a aVar, mie mieVar, ljf ljfVar) {
    }

    @Deprecated
    default void h(a aVar, int i, ss5 ss5Var) {
    }

    default void h0(a aVar, float f) {
    }

    @Deprecated
    default void i(a aVar, int i) {
    }

    default void i0(a aVar, int i, long j, long j2) {
    }

    default void j(a aVar, n nVar) {
    }

    default void j0(a aVar, int i, long j, long j2) {
    }

    default void k(a aVar, boolean z) {
    }

    default void k0(a aVar, ljf ljfVar) {
    }

    default void l(a aVar) {
    }

    default void l0(a aVar, int i, long j) {
    }

    default void m(a aVar, int i) {
    }

    default void m0(a aVar, boolean z) {
    }

    @Deprecated
    default void n(a aVar) {
    }

    default void n0(a aVar, boolean z, int i) {
    }

    @Deprecated
    default void o(a aVar) {
    }

    default void o0(a aVar, Exception exc) {
    }

    @Deprecated
    default void p(a aVar, Format format) {
    }

    default void p0(a aVar) {
    }

    default void q(a aVar, int i) {
    }

    default void r(a aVar, ss5 ss5Var) {
    }

    @Deprecated
    default void s(a aVar, boolean z, int i) {
    }

    @Deprecated
    default void t(a aVar) {
    }

    @Deprecated
    default void u(a aVar, String str, long j) {
    }

    default void v(a aVar, ss5 ss5Var) {
    }

    default void w(a aVar, int i) {
    }

    default void x(a aVar) {
    }

    default void y(a aVar, Format format, us5 us5Var) {
    }

    @Deprecated
    default void z(a aVar, int i, Format format) {
    }
}
