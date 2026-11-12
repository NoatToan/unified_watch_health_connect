package lh0;

import c2.b0;
import c2.x2;
import c2.z;
import com.google.android.exoplayer2.audio.WavUtil;
import f5.z0;
import gl1.y;
import h5.e0;
import i3.m8;
import i3.mh;
import kd0.h6;
import l30.y0;
import l72.b1;
import l72.n2;
import o4.m1;
import o4.q1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.i0;
import s5.x0;
import w5.c0;
import w5.f0;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llh0/r;", "", "<init>", "()V", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f112444a = new r();

    private r() {
    }

    public final void a(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(826892856);
        int i15 = i14 & 1;
        if (o0VarE.n(i15, i15 != 0)) {
            x1 x1Var = p3.n.f135158a;
            g6.f.a aVar = g6.f.f75994b;
            c2.l.f(c2.l.C(h4.r.S, 0.0f, 16, 0.0f, 0.0f, 13), o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(this, i14);
        }
    }

    public final void b(int i14, p3.m mVar, int i15) {
        o0 o0VarE = mVar.E(1775826279);
        int i16 = (o0VarE.k(i14) ? 4 : 2) | i15 | 48 | (o0VarE.B(this) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            c(y.Q(o0VarE, i14), o0VarE, i16 & 1008);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(this, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0155  */
    public final void c(String str, p3.m mVar, int i14) {
        int i15;
        str.getClass();
        o0 o0VarE = mVar.E(-782930091);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.B(str) ? 4 : 2);
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(null) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarA = c2.l.A(aVar, 16, 0.0f, 2);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81524b;
            z0 z0VarD = c2.q.d(gVar, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
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
            b4.c(eVar, z0VarD, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            h4.r rVarC2 = c2.l.C(aVar, 0.0f, 8, 0.0f, 0.0f, 13);
            z0 z0VarD2 = c2.q.d(gVar, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarC2, o0VarE);
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
            b4.c(eVar, z0VarD2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC3, o0VarE);
            h4.r rVarB = l4.k.b(x2.q(aVar, 4), k2.i.f102406a);
            d92.b.f58623a.getClass();
            c2.q.a(u1.n.e(rVarB, d92.b.a(o0VarE).k().d(), m1.f128891a), o0VarE, 0);
            o0VarE.g0(true);
            j92.f.f97924a.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarE);
            h4.r rVarC4 = c2.l.C(aVar, 20, 0.0f, 0.0f, 0.0f, 14);
            boolean z14 = (i16 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new b1(25);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new b1(25);
                    o0VarE.K(objQ);
                }
            }
            mh.c(str, p5.v.c((e23.l) objQ, rVarC4, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, i16 & 14, 0, 131068);
            o0VarE = o0VarE;
            i15 = 1;
            o0VarE.g0(true);
        } else {
            i15 = 1;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q(this, str, i14, i15);
        }
    }

    public final void d(z3.e eVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1926117081);
        int i15 = 6;
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            g6.f.a aVar = g6.f.f75994b;
            h4.r rVarC = c2.l.C(h4.r.S, 16, 8, 0.0f, 0.0f, 12);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            b71.i.n(6, eVar, o0VarE, true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new y0(this, eVar, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
    public final void e(int i14, e23.a aVar, String str, p3.m mVar) {
        int i15;
        o0 o0VarL = vb.h.l(-1832721832, aVar, str, mVar);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarL.B(str) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarL.r(aVar) ? 32 : 16;
        }
        if (o0VarL.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            s5.c.b bVarH = l2.h(o0VarL, -309085923, 0, 1, null);
            d92.b.f58623a.getClass();
            int iJ = bVarH.j(new i0(d92.b.a(o0VarL).k().a(), 0L, (f0) null, (w5.b0) null, (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null));
            try {
                bVarH.b(str);
                Unit unit = Unit.INSTANCE;
                bVarH.f(iJ);
                s5.c cVarK = bVarH.k();
                o0VarL.g0(false);
                d92.b.f58624b.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarL);
                h4.r.a aVar2 = h4.r.S;
                float f14 = 16;
                g6.f.a aVar3 = g6.f.f75994b;
                h4.r rVarC = c2.l.C(aVar2, f14, f14, f14, 0.0f, 8);
                boolean z14 = (i15 & 112) == 32;
                Object objQ = o0VarL.q();
                if (z14) {
                    objQ = new m8(aVar, 15);
                    o0VarL.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new m8(aVar, 15);
                        o0VarL.K(objQ);
                    }
                }
                p006l2.c0.a(cVarK, rVarC, x0VarF, false, 0, 0, null, (e23.l) objQ, o0VarL, 48, 120);
            } catch (Throwable th3) {
                bVarH.f(iJ);
                throw th3;
            }
        } else {
            o0VarL.e();
        }
        p2 p2VarI0 = o0VarL.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h6(this, str, aVar, i14, 20);
        }
    }

    public final void f(e23.a aVar, int i14, p3.m mVar, int i15) {
        int i16;
        aVar.getClass();
        o0 o0VarE = mVar.E(687418242);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.k(i14) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.B(this) ? 256 : 128;
        }
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            e(i16 & 1008, aVar, y.Q(o0VarE, i14), o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.f(this, i14, aVar, i15, 11);
        }
    }

    public final void g(z3.e eVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1633417378);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(eVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new b1(26);
                o0VarE.K(objQ);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ, rVarF, true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            b71.i.n(i15 & 14, eVar, o0VarE, true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.a(this, eVar, i14, 24);
        }
    }

    public final void h(String str, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        str.getClass();
        o0 o0VarE = mVar.E(2084164636);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
            g6.f.a aVar = g6.f.f75994b;
            o0Var = o0VarE;
            mh.c(str, c2.l.A(h4.r.S, 16, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0Var, (i15 & 14) | 48, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q(this, str, i14, 3);
        }
    }

    public final void i(int i14, p3.m mVar, int i15) {
        int i16;
        o0 o0VarE = mVar.E(2146429463);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.k(i14) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        int i17 = i16 | 48;
        if ((i15 & 384) == 0) {
            i17 |= o0VarE.B(this) ? 256 : 128;
        }
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            j(y.Q(o0VarE, i14), o0VarE, i17 & 1008);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(this, i14, i15, 1);
        }
    }

    public final void j(String str, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        str.getClass();
        o0 o0VarE = mVar.E(1790573733);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(null) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            o0VarE.C(-511498187);
            o0VarE.g0(false);
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97932i, o0VarE);
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            o0Var = o0VarE;
            mh.c(str, c2.l.C(aVar, f14, f14, f14, 0.0f, 8).then(aVar), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var, i15 & 14, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q(this, str, i14, 0);
        }
    }

    public final void k(int i14, p3.m mVar, int i15) {
        int i16;
        o0 o0VarE = mVar.E(628609674);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.k(i14) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.B(this) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            l(y.Q(o0VarE, i14), o0VarE, (i16 << 3) & 896);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(this, i14, i15, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    public final void l(String str, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        str.getClass();
        o0 o0VarE = mVar.E(-1245131641);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        } else {
            i15 = i14;
        }
        int i16 = i15 | 48;
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), o0VarE);
            h4.r.a aVar = h4.r.S;
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarC = c2.l.C(aVar, f14, f14, f14, 0.0f, 8);
            boolean zB = o0VarE.B(str);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new n2(str, 9);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new n2(str, 9);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            mh.c(str, p5.v.c((e23.l) objQ, rVarC, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0Var, i16 & 14, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q(this, str, i14, 2);
        }
    }
}
