package yz1;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.z0;
import h5.e0;
import i3.i7;
import kotlin.t1;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class k {
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    public static final void a(d dVar, u4.d dVar2, String str, e23.a aVar, p3.m mVar, int i14) {
        int i15;
        boolean z14;
        boolean z15;
        String strJ;
        o0 o0VarE = mVar.E(266906069);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(dVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(dVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarD = x2.d(aVar2, 1.0f);
            boolean z16 = aVar != null;
            boolean z17 = (i15 & 7168) == 2048;
            Object objQ = o0VarE.q();
            if (z17) {
                objQ = new xx1.d(aVar, 3);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new xx1.d(aVar, 3);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarA = wz1.i.a((e23.l) objQ, rVarD, z16);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97917b;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(rVarA, f14, eVar.f97919d);
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            float f15 = eVar.f97918c;
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81533k;
            jVar.getClass();
            c2.j.i iVarK = c2.j.k(f15, bVar2);
            h4.g.a aVar3 = h4.d.a.f81537o;
            c2.z zVarA = c2.y.a(iVarK, aVar3, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarZ, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            if (dVar == null || dVar.f200298a == u.LOADING) {
                z14 = true;
                o0VarE.C(-2106786269);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2107458008);
                if (dVar2 != null) {
                    o0VarE.C(-2107418793);
                    i7.b(dVar2, null, x2.q(aVar2, e(o0VarE)), d92.b.a(o0VarE).f().d(), o0VarE, ((i15 >> 3) & 14) | 48, 0);
                    z15 = false;
                    o0VarE.g0(false);
                } else {
                    z15 = false;
                    o0VarE.C(-2107178109);
                    o0VarE.g0(false);
                }
                if (str == null) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1730539323, R.string.no_data_label, o0VarE, z15);
                } else {
                    o0VarE.C(-1730539819);
                    o0VarE.g0(z15);
                    strJ = str;
                }
                h4.r rVarX = x2.x(b0Var.b(aVar2, aVar3), null, 3);
                d6.h.f57752b.getClass();
                d6.h hVarA = d6.h.a(d6.h.f57755e);
                d92.b.f58624b.getClass();
                String str2 = strJ;
                boolean z18 = z15;
                z14 = true;
                g02.c.a(str2, rVarX, 0L, hVarA, 0, false, 0, d92.c.f(j92.f.f97935l, o0VarE), 0.0d, o0VarE, 0, 372);
                o0VarE.g0(z18);
            }
            o0VarE.g0(z14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug0.c(dVar, dVar2, str, aVar, i14);
        }
    }

    public static final void b(h4.r rVar, d dVar, u4.d dVar2, z3.e eVar, e23.a aVar, String str, i iVar, p3.m mVar, int i14) {
        int i15;
        u4.d dVar3;
        z3.e eVar2;
        e23.a aVar2;
        String str2;
        u uVar;
        String strJ;
        o0 o0VarE = mVar.E(-227065516);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            dVar3 = dVar2;
            i15 |= o0VarE.B(dVar3) ? 256 : 128;
        } else {
            dVar3 = dVar2;
        }
        if ((i14 & 3072) == 0) {
            eVar2 = eVar;
            i15 |= o0VarE.r(eVar2) ? 2048 : 1024;
        } else {
            eVar2 = eVar;
        }
        if ((i14 & 24576) == 0) {
            aVar2 = aVar;
            i15 |= o0VarE.r(aVar2) ? 16384 : 8192;
        } else {
            aVar2 = aVar;
        }
        if ((196608 & i14) == 0) {
            str2 = str;
            i15 |= o0VarE.B(str2) ? 131072 : 65536;
        } else {
            str2 = str;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.k(iVar == null ? -1 : iVar.ordinal()) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            if (dVar == null || (uVar = dVar.f200298a) == null) {
                uVar = u.LOADING;
            }
            boolean z14 = uVar == u.ERROR;
            long jB = am.j.B(d92.b.f58623a, o0VarE);
            d92.b.f58625c.getClass();
            h4.r rVarE = u1.n.e(rVar, jB, k2.i.a(j92.b.f97899b.f97918c));
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar2 = c2.u.f22885a;
            if (z14 || iVar == i.EMPTY) {
                o0VarE.C(-721162000);
                if (z14) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 392379917, R.string.loading_error_message, o0VarE, false);
                } else {
                    o0VarE.C(392381702);
                    o0VarE.g0(false);
                    strJ = str2;
                }
                a(dVar, dVar2, strJ, aVar, o0VarE, (i15 >> 3) & 7294);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-720818613);
                c(dVar, dVar3, eVar2, aVar2, o0VarE, (i15 >> 3) & 8190);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.o((Object) rVar, (Object) dVar, (Object) dVar2, (Object) eVar, (Object) aVar, str, (Object) iVar, i14, 29);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    public static final void c(d dVar, u4.d dVar2, z3.e eVar, e23.a aVar, p3.m mVar, int i14) {
        int i15;
        boolean z14;
        o0 o0VarE = mVar.E(964804779);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(dVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(dVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(eVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarD = x2.d(aVar2, 1.0f);
            boolean z15 = aVar != null;
            boolean z16 = (i15 & 7168) == 2048;
            Object objQ = o0VarE.q();
            if (z16) {
                objQ = new xx1.d(aVar, 4);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new xx1.d(aVar, 4);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarA = wz1.i.a((e23.l) objQ, rVarD, z15);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97917b;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(rVarA, f14, eVar2.f97919d);
            c2.j jVar = c2.j.f22691a;
            bVar.getClass();
            float f15 = eVar2.f97918c;
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81533k;
            jVar.getClass();
            c2.z zVarA = c2.y.a(c2.j.k(f15, bVar2), h4.d.a.f81537o, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarZ, o0VarE);
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            if (dVar == null || dVar.f200298a == u.LOADING) {
                z14 = true;
                o0VarE.C(-2074907795);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-2075472863);
                if (dVar2 != null) {
                    o0VarE.C(-2075430207);
                    i7.b(dVar2, null, x2.q(aVar2, e(o0VarE)), d92.b.a(o0VarE).f().d(), o0VarE, ((i15 >> 3) & 14) | 48, 0);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-2075189523);
                    o0VarE.g0(false);
                }
                z14 = true;
                c2.v.a(x2.d(aVar2, 1.0f), h4.d.a.f81528f, false, z3.f.c(-1242556124, new aa2.k(eVar, 18), o0VarE), o0VarE, 3126, 4);
                o0VarE.g0(false);
            }
            o0VarE.g0(z14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j(dVar, dVar2, eVar, aVar, i14);
        }
    }

    public static final float d(p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        float f75992b = ((g6.c) mVar.A(t1.f91490h)).getF75992b();
        if (f75992b > 1.5f) {
            g6.f.a aVar = g6.f.f75994b;
            return 8.0f;
        }
        if (f75992b <= 1.0f || f75992b > 1.5f) {
            g6.f.a aVar2 = g6.f.f75994b;
            return 4.0f;
        }
        g6.f.a aVar3 = g6.f.f75994b;
        return 5.0f;
    }

    public static final float e(p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        float f75992b = ((g6.c) mVar.A(t1.f91490h)).getF75992b();
        if (f75992b > 1.5f) {
            g6.f.a aVar = g6.f.f75994b;
            return 48.0f;
        }
        if (f75992b > 1.0f && f75992b <= 1.5f) {
            g6.f.a aVar2 = g6.f.f75994b;
            return 32.0f;
        }
        d92.b.f58623a.getClass();
        d92.b.f58625c.getClass();
        return j92.b.f97901d.f97904c;
    }
}
