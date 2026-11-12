package oo0;

import am.x0;
import b82.k;
import c2.q;
import c2.u;
import c2.x2;
import com.garmin.android.apps.connectmobile.k1;
import f02.j;
import f5.z0;
import f72.a2;
import f72.j0;
import h4.r;
import h5.e0;
import i3.i7;
import k2.i;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import v62.m7;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f133126a;

        static {
            int[] iArr = new int[x0.values().length];
            try {
                iArr[x0.E.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x0.f4355z1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x0.A1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x0.f4351y1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f133126a = iArr;
        }
    }

    public static final void a(m mVar, int i14) {
        long j8;
        o0 o0VarE = mVar.E(1144032515);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            s62.a.f157643a.getClass();
            u4.d dVarA = j0.a(t62.c.f162799a);
            j.f67738a.getClass();
            d92.b.f58623a.getClass();
            if (d92.b.d(o0VarE)) {
                gl.c.f77766a.getClass();
                j8 = gl.c.f77767b.f77772b0;
            } else {
                gl.c.f77766a.getClass();
                j8 = gl.c.f77767b.f77776d0;
            }
            f(dVarA, j8, o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new om1.c(i14, 4);
        }
    }

    public static final void b(x0 x0Var, String str, Integer num, m mVar, int i14, int i15) {
        int i16;
        String str2;
        o0 o0VarE = mVar.E(-862321784);
        int i17 = i14 | (o0VarE.k(x0Var == null ? -1 : x0Var.ordinal()) ? 4 : 2);
        int i18 = i15 & 2;
        if (i18 != 0) {
            i16 = i17 | 48;
        } else {
            i16 = i17 | (o0VarE.B(str) ? 32 : 16);
        }
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            String str3 = i18 != 0 ? null : str;
            x1 x1Var = n.f135158a;
            int i19 = x0Var != null ? a.f133126a[x0Var.ordinal()] : -1;
            if (i19 == 1) {
                o0VarE.C(237460241);
                s62.a.f157643a.getClass();
                u4.d dVarA = m7.a(t62.b.f162798a);
                gl.c.f77766a.getClass();
                f(dVarA, gl.c.a(o0VarE).l(), o0VarE, 0);
                o0VarE.g0(false);
            } else if (i19 == 2) {
                o0VarE.C(237463953);
                s62.a.f157643a.getClass();
                u4.d dVarA2 = m7.a(t62.b.f162798a);
                gl.c.f77766a.getClass();
                f(dVarA2, gl.c.a(o0VarE).l(), o0VarE, 0);
                o0VarE.g0(false);
            } else if (i19 == 3) {
                o0VarE.C(237467537);
                s62.a.f157643a.getClass();
                u4.d dVarA3 = m7.a(t62.b.f162798a);
                gl.c.f77766a.getClass();
                f(dVarA3, gl.c.a(o0VarE).l(), o0VarE, 0);
                o0VarE.g0(false);
            } else if (i19 != 4) {
                o0VarE.C(-1228220564);
                bv.b.f21239a.getClass();
                bv.b.a();
                boolean zL0 = k1.f37122a.l0();
                if (num.intValue() == 0) {
                    o0VarE.C(-1228051707);
                    if (zx0.m.i(str3)) {
                        o0VarE.C(-1228002820);
                        d(x0.f4290i1.f4362e, o0VarE, 0);
                        o0VarE.g0(false);
                        Unit unit = Unit.INSTANCE;
                    } else {
                        o0VarE.C(-1227868187);
                        if (x0Var == null) {
                            o0VarE.C(-1227868188);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(-1227868187);
                            d(x0Var.s(zL0), o0VarE, 0);
                            o0VarE.g0(false);
                            Unit unit2 = Unit.INSTANCE;
                        }
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1227739413);
                    if (zx0.m.i(str3)) {
                        o0VarE.C(-1227690433);
                        e(x0.f4290i1.f4362e, o0VarE, 0);
                        o0VarE.g0(false);
                        Unit unit3 = Unit.INSTANCE;
                    } else {
                        o0VarE.C(-1227558776);
                        if (x0Var == null) {
                            o0VarE.C(-1227558777);
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(-1227558776);
                            e(x0Var.s(zL0), o0VarE, 0);
                            o0VarE.g0(false);
                            Unit unit4 = Unit.INSTANCE;
                        }
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else {
                o0VarE.C(237471025);
                s62.a.f157643a.getClass();
                u4.d dVarA4 = m7.a(t62.b.f162798a);
                gl.c.f77766a.getClass();
                f(dVarA4, gl.c.a(o0VarE).l(), o0VarE, 0);
                o0VarE.g0(false);
            }
            str2 = str3;
        } else {
            o0VarE.e();
            str2 = str;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mx.h(x0Var, str2, num, i14, i15, 6);
        }
    }

    public static final void c(co0.f fVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-139706391);
        int i15 = (o0VarE.B(fVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            if (fVar instanceof co0.f.a) {
                o0VarE.C(-1113851938);
                b(fs1.b.a(((co0.f.a) fVar).f28142a), null, 0, o0VarE, 384, 2);
                o0VarE.g0(false);
            } else if (fVar instanceof co0.f.b) {
                o0VarE.C(-1113845891);
                gs1.f fVar2 = ((co0.f.b) fVar).f28143a;
                b(fs1.b.b(fVar2), fVar2.getActivitySubType(), 1, o0VarE, 384, 0);
                o0VarE.g0(false);
            } else if (fVar instanceof co0.f.d) {
                o0VarE.C(-1113836513);
                g(o0VarE, 0);
                o0VarE.g0(false);
            } else {
                if (!(fVar instanceof co0.f.c)) {
                    throw kg.f.h(o0VarE, -1113853335, false);
                }
                o0VarE.C(-1113834214);
                a(o0VarE, 0);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(fVar, i14);
        }
    }

    public static final void d(u4.d dVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(359706563);
        int i15 = (o0VarE.B(dVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            f02.a.f67722a.getClass();
            f(dVar, f02.a.a(o0VarE), o0VarE, i15 & 14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(dVar, i14, 8);
        }
    }

    public static final void e(u4.d dVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(1824058336);
        int i15 = (o0VarE.B(dVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            d92.b.f58623a.getClass();
            f(dVar, d92.b.a(o0VarE).f().d(), o0VarE, i15 & 14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(dVar, i14, 9);
        }
    }

    public static final void f(u4.d dVar, long j8, m mVar, int i14) {
        u4.d dVar2;
        o0 o0VarE = mVar.E(-1390100049);
        int i15 = (o0VarE.B(dVar) ? 4 : 2) | i14 | (o0VarE.l(j8) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarB = l4.k.b(aVar, i.f102406a);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.c cVar = j92.b.f97901d;
            r rVarE = u1.n.e(x2.q(rVarB, cVar.f97906e), j8, m1.f128891a);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            long j14 = d92.b.a(o0VarE).f().f63508c;
            bVar.getClass();
            dVar2 = dVar;
            i7.b(dVar2, null, uVar.c(x2.q(aVar, cVar.f97905d), h4.d.a.f81528f), j14, o0VarE, (i15 & 14) | 48, 0);
            o0VarE.g0(true);
        } else {
            dVar2 = dVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j21.r(dVar2, j8, i14);
        }
    }

    public static final void g(m mVar, int i14) {
        o0 o0VarE = mVar.E(711673675);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            s62.a.f157643a.getClass();
            u4.d dVarA = a2.a(t62.c.f162799a);
            f02.n.f67742a.getClass();
            gl.c.f77766a.getClass();
            f(dVarA, gl.c.f77767b.Z, o0VarE, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new om1.c(i14, 3);
        }
    }
}
