package ic1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bv1.v;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import h4.r;
import h5.e0;
import i3.gf;
import i3.mh;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f92605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f92606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f92607c;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f92605a = 3;
        f92606b = 36;
        f92607c = 50;
    }

    public static final void a(r rVar, DateTime dateTime, Double d14, boolean z14, boolean z15, e23.l<? super DateTime, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        String strA;
        Double d15 = d14;
        rVar.getClass();
        dateTime.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1552970520);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(dateTime) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(d15) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.h(z15) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new gc1.a(context);
                o0VarE.K(objQ);
            }
            gc1.a aVar = (gc1.a) objQ;
            aVar.getClass();
            pi0.e eVar = aVar.f76927c;
            String strA2 = eVar.a(dateTime, qi0.a.WEEKDAY);
            z3.e eVarC = null;
            if (z14) {
                strA = eVar.a(dateTime, qi0.a.RELATIVE_YEAR_MONTH_DAY);
            } else {
                strA = gc1.a.a(aVar, d15 != null ? Float.valueOf((float) d15.doubleValue()) : null);
            }
            if (z15) {
                o0VarE.C(843455657);
                d15 = d14;
                z3.e eVarC2 = z3.f.c(-1772754821, new d62.f(aVar, strA2, strA, d14, z14), o0VarE);
                boolean zR = o0VarE.r(dateTime) | ((i16 & 458752) == 131072);
                Object objQ2 = o0VarE.q();
                if (zR || objQ2 == c2565a) {
                    objQ2 = new ci0.e(lVar, dateTime, 3);
                    o0VarE.K(objQ2);
                }
                l72.l.c(eVarC2, null, rVar, null, false, (e23.a) objQ2, o0VarE, ((i16 << 6) & 896) | 6, 26);
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                String str = strA;
                o0Var.C(843892230);
                if (z14) {
                    o0Var.C(843972272);
                    eVarC = z3.f.c(-246460812, new a(aVar, d15, 0), o0Var);
                    o0Var.g0(false);
                } else {
                    o0Var.C(844081206);
                    o0Var.g0(false);
                }
                z3.e eVar2 = eVarC;
                boolean zR2 = ((i16 & 458752) == 131072) | o0Var.r(dateTime);
                Object objQ3 = o0Var.q();
                if (zR2 || objQ3 == c2565a) {
                    objQ3 = new ci0.e(lVar, dateTime, 4);
                    o0Var.K(objQ3);
                }
                l72.l.d(strA2, str, eVar2, rVar, null, false, (e23.a) objQ3, o0Var, (i16 << 9) & 7168, 48);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gf(rVar, dateTime, d15, z14, z15, lVar, i14);
        }
    }

    public static final void b(gc1.a aVar, Double d14, p3.m mVar, int i14) {
        o0 o0Var;
        boolean z14;
        o0 o0VarE = mVar.E(357556438);
        int i15 = (o0VarE.r(aVar) ? 4 : 2) | i14 | (o0VarE.B(d14) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar2 = r.S;
            r rVarF = x2.f(aVar2, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.d dVar = c2.j.f22693c;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(dVar, h4.d.a.f81534l, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            if (d14 == null) {
                o0VarE.C(297919212);
                o0VarE.g0(false);
                o0Var = o0VarE;
                z14 = false;
            } else {
                o0VarE.C(297919213);
                String strA = gc1.a.a(aVar, Float.valueOf((float) d14.doubleValue()));
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
                d92.b.f58625c.getClass();
                z14 = false;
                mh.c(strA, c2.l.C(aVar2, 0.0f, 0.0f, j92.b.f97899b.f97920e, 0.0f, 11), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 131068);
                o0Var = o0VarE;
                o0Var.g0(false);
            }
            c(d14, z14, o0Var, ((i15 >> 3) & 14) | 48);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i20.b(aVar, d14, i14, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    public static final void c(Double d14, boolean z14, p3.m mVar, int i14) {
        int i15;
        float f14;
        o0 o0VarE = mVar.E(1389811971);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(d14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z14) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            boolean z15 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z15) {
                if (z14) {
                    f14 = f92607c;
                } else {
                    f14 = f92606b;
                }
                objQ = g6.f.a(f14);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    if (z14) {
                        f14 = f92607c;
                    } else {
                        f14 = f92606b;
                    }
                    objQ = g6.f.a(f14);
                    o0VarE.K(objQ);
                }
            }
            float f15 = ((g6.f) objQ).f75997a;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            z72.k.a(x2.q(c2.l.C(aVar, 0.0f, 0.0f, j92.b.f97899b.f97920e, 0.0f, 11), f15), g8.i.F(d14 != null ? Integer.valueOf((int) d14.doubleValue()) : null, o0VarE), g8.i.E(d14 != null ? Integer.valueOf((int) d14.doubleValue()) : null), null, null, f92605a, 1.5f, false, false, null, o0VarE, 1769472, 920);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v(d14, z14, i14, 3);
        }
    }

    public static final void d(gc1.a aVar, String str, String str2, Double d14, boolean z14, p3.m mVar, int i14) {
        o0 o0Var;
        Double d15;
        boolean z15;
        o0 o0VarE = mVar.E(-418099042);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128) | (o0VarE.B(d14) ? 2048 : 1024) | (o0VarE.h(z14) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar2 = r.S;
            r rVarF = x2.f(aVar2, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.g gVar = c2.j.f22698h;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(gVar, h4.d.a.f81534l, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            r rVarY = c2.l.y(aVar2, eVar2.f97920e);
            bVar2.getClass();
            z zVarA = y.a(c2.j.i(eVar2.f97920e), h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarY, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, (i15 >> 3) & 14, 0, 131070);
            o0Var = o0VarE;
            if (str2 == null) {
                o0Var.C(-1943161025);
                o0Var.g0(false);
                z15 = false;
            } else {
                o0Var.C(-1943161024);
                fVar2.getClass();
                z15 = false;
                mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0Var), o0Var, (i15 >> 6) & 14, 0, 131070);
                o0Var.g0(false);
            }
            if (!z14 || d14 == null) {
                o0Var = o0Var;
                o0Var.C(-1942876630);
                o0Var.g0(z15);
            } else {
                o0Var.C(-1943002521);
                String strA = gc1.a.a(aVar, Float.valueOf((float) d14.doubleValue()));
                fVar2.getClass();
                o0 o0Var2 = o0Var;
                mh.c(strA, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0Var), o0Var2, 0, 0, 131070);
                o0Var = o0Var2;
                o0Var.g0(z15);
            }
            o0Var.g0(true);
            if (z14) {
                o0Var.C(-1812374651);
                d15 = d14;
                c(d15, true, o0Var, ((i15 >> 9) & 14) | 48);
                o0Var.g0(z15);
            } else {
                d15 = d14;
                o0Var.C(-1812317952);
                o0Var.g0(z15);
            }
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            d15 = d14;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bt1.m(aVar, str, str2, d15, z14, i14);
        }
    }
}
