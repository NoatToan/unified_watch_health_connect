package b12;

import c2.q;
import c2.u;
import c2.x2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e23.l;
import f5.k0;
import f5.z0;
import h4.r;
import h5.e0;
import i3.i7;
import j23.s;
import kotlin.t1;
import o4.f0;
import p005kotlin.Unit;
import p007l6.p;
import p007l6.z;
import p3.b4;
import p3.c2;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p5.v;
import v62.p9;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j23.i f14420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j23.i f14421b;

    static {
        float f14 = 91;
        f14420a = s.a(g6.f.a(f14), g6.f.a(Integer.MAX_VALUE));
        f14421b = s.a(g6.f.a(40), g6.f.a(f14));
    }

    public static final void a(float f14, m mVar, int i14) {
        o0 o0VarE = mVar.E(1852302836);
        int i15 = (o0VarE.i(f14) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarE = u1.n.e(x2.q(aVar, f14), f0.d(4292401368L), k2.i.f102406a);
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            float f15 = 0.6f * f14;
            g6.f.a aVar3 = g6.f.f75994b;
            float f16 = 1;
            if (f15 < f16) {
                f15 = f16;
            }
            r rVarC2 = uVar.c(x2.q(aVar, f15), h4.d.a.f81528f);
            s62.a.f157643a.getClass();
            i7.b(p9.a(t62.b.f162798a), null, rVarC2, f0.d(4285295724L), o0VarE, 3120, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.o0(f14, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0199  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:112:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:115:0x0201  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x0127  */
    /* JADX WARN: Code duplicated, block: B:88:0x0137  */
    /* JADX WARN: Code duplicated, block: B:91:0x0147  */
    /* JADX WARN: Code duplicated, block: B:94:0x015a  */
    /* JADX WARN: Code duplicated, block: B:97:0x016c  */
    public static final void b(r rVar, String str, float f14, b bVar, m mVar, int i14, int i15) {
        r rVar2;
        int i16;
        String str2;
        float f15;
        int i17;
        boolean z14;
        o0 o0Var;
        String str3;
        p2 p2VarI0;
        r rVar3;
        String str4;
        r rVar4;
        m.a aVar;
        r rVarC;
        g6.c cVar;
        Object objQ;
        m.a.C2565a c2565a;
        z zVar;
        Object objQ2;
        p007l6.m mVar2;
        Object objQ3;
        p1 p1Var;
        Object objQ4;
        p pVar;
        Object objQ5;
        p1 p1Var2;
        boolean zR;
        Object objQ6;
        Object objQ7;
        boolean zR2;
        Object objQ8;
        boolean z15;
        Object objQ9;
        boolean zR3;
        int i18;
        int i19;
        o0 o0VarE = mVar.E(-1045312523);
        int i24 = i15 & 1;
        if (i24 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i16 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        int i25 = i15 & 2;
        int i26 = 16;
        if (i25 == 0) {
            if ((i14 & 48) == 0) {
                str2 = str;
                i16 |= o0VarE.B(str2) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                f15 = f14;
                if (o0VarE.i(f15)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i16 |= i19;
            } else {
                f15 = f14;
            }
            if ((i14 & 3072) == 0) {
                if ((i14 & 4096) == 0) {
                    zR3 = o0VarE.B(bVar);
                } else {
                    zR3 = o0VarE.r(bVar);
                }
                if (zR3) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i16 |= i18;
            }
            if ((i15 & 16) != 0) {
                i16 |= 24576;
            } else if ((i14 & 24576) == 0) {
                if (o0VarE.B(null)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i16 |= i17;
            }
            if ((i16 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    if (i24 != 0) {
                        rVar3 = r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i25 != 0) {
                        str2 = null;
                    }
                    str4 = str2;
                    rVar4 = rVar3;
                } else {
                    o0VarE.e();
                    str4 = str2;
                    rVar4 = rVar2;
                }
                o0VarE.h0();
                x1 x1Var = n.f135158a;
                aVar = m.f135153a;
                if (str4 != null) {
                    o0VarE.C(1902767683);
                    r.a aVar2 = r.S;
                    z15 = (i16 & 112) == 32;
                    objQ9 = o0VarE.q();
                    if (z15) {
                        objQ9 = new defpackage.b(str4, i26);
                        o0VarE.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == m.a.f135155b) {
                            objQ9 = new defpackage.b(str4, i26);
                            o0VarE.K(objQ9);
                        }
                    }
                    rVarC = v.c((l) objQ9, aVar2, false);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1902906997);
                    o0VarE.g0(false);
                    rVarC = r.S;
                }
                r rVarThen = rVar4.then(rVarC);
                o0VarE.C(-1003410150);
                o0VarE.C(212064437);
                o0VarE.g0(false);
                cVar = (g6.c) o0VarE.A(t1.f91490h);
                objQ = o0VarE.q();
                aVar.getClass();
                c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new z(cVar);
                    o0VarE.K(objQ);
                }
                zVar = (z) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new p007l6.m();
                    o0VarE.K(objQ2);
                }
                mVar2 = (p007l6.m) objQ2;
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ3);
                }
                p1Var = (p1) objQ3;
                objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = new p(mVar2);
                    o0VarE.K(objQ4);
                }
                pVar = (p) objQ4;
                objQ5 = o0VarE.q();
                if (objQ5 == c2565a) {
                    Unit unit = Unit.INSTANCE;
                    p3.t1 t1Var = p3.t1.f135313a;
                    t1Var.getClass();
                    c2 c2Var = new c2(unit, t1Var);
                    o0VarE.K(c2Var);
                    objQ5 = c2Var;
                }
                p1Var2 = (p1) objQ5;
                zR = o0VarE.r(zVar) | o0VarE.k(TsExtractor.TS_STREAM_TYPE_AIT);
                objQ6 = o0VarE.q();
                if (zR || objQ6 == c2565a) {
                    g gVar = new g(p1Var2, zVar, pVar, TsExtractor.TS_STREAM_TYPE_AIT, p1Var);
                    o0VarE.K(gVar);
                    objQ6 = gVar;
                }
                z0 z0Var = (z0) objQ6;
                objQ7 = o0VarE.q();
                if (objQ7 == c2565a) {
                    objQ7 = new h(p1Var, pVar);
                    o0VarE.K(objQ7);
                }
                e23.a aVar3 = (e23.a) objQ7;
                zR2 = o0VarE.r(zVar);
                objQ8 = o0VarE.q();
                if (zR2 || objQ8 == c2565a) {
                    objQ8 = new i(zVar);
                    o0VarE.K(objQ8);
                }
                o0Var = o0VarE;
                k0.a(v.c((l) objQ8, rVarThen, false), z3.f.c(1200550679, new j(p1Var2, mVar2, aVar3, bVar, f15, null), o0VarE), z0Var, o0Var, 48, 0);
                o0Var.g0(false);
                rVar2 = rVar4;
                str3 = str4;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                str3 = str2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new c(rVar2, str3, f14, bVar, i14, i15);
            }
        }
        i16 |= 48;
        str2 = str;
        if ((i14 & 384) == 0) {
            f15 = f14;
            if (o0VarE.i(f15)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i16 |= i19;
        } else {
            f15 = f14;
        }
        if ((i14 & 3072) == 0) {
            if ((i14 & 4096) == 0) {
                zR3 = o0VarE.B(bVar);
            } else {
                zR3 = o0VarE.r(bVar);
            }
            if (zR3) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i16 |= i18;
        }
        if ((i15 & 16) != 0) {
            i16 |= 24576;
        } else if ((i14 & 24576) == 0) {
            if (o0VarE.B(null)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i16 |= i17;
        }
        if ((i16 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i24 != 0) {
                    rVar3 = r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i25 != 0) {
                    str2 = null;
                }
                str4 = str2;
                rVar4 = rVar3;
            } else {
                if (i24 != 0) {
                    rVar3 = r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i25 != 0) {
                    str2 = null;
                }
                str4 = str2;
                rVar4 = rVar3;
            }
            o0VarE.h0();
            x1 x1Var2 = n.f135158a;
            aVar = m.f135153a;
            if (str4 != null) {
                o0VarE.C(1902767683);
                r.a aVar4 = r.S;
                if ((i16 & 112) == 32) {
                }
                objQ9 = o0VarE.q();
                if (z15) {
                    aVar.getClass();
                    if (objQ9 == m.a.f135155b) {
                        objQ9 = new defpackage.b(str4, i26);
                        o0VarE.K(objQ9);
                    }
                } else {
                    objQ9 = new defpackage.b(str4, i26);
                    o0VarE.K(objQ9);
                }
                rVarC = v.c((l) objQ9, aVar4, false);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1902906997);
                o0VarE.g0(false);
                rVarC = r.S;
            }
            r rVarThen2 = rVar4.then(rVarC);
            o0VarE.C(-1003410150);
            o0VarE.C(212064437);
            o0VarE.g0(false);
            cVar = (g6.c) o0VarE.A(t1.f91490h);
            objQ = o0VarE.q();
            aVar.getClass();
            c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new z(cVar);
                o0VarE.K(objQ);
            }
            zVar = (z) objQ;
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new p007l6.m();
                o0VarE.K(objQ2);
            }
            mVar2 = (p007l6.m) objQ2;
            objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1Var = (p1) objQ3;
            objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = new p(mVar2);
                o0VarE.K(objQ4);
            }
            pVar = (p) objQ4;
            objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                Unit unit2 = Unit.INSTANCE;
                p3.t1 t1Var2 = p3.t1.f135313a;
                t1Var2.getClass();
                c2 c2Var2 = new c2(unit2, t1Var2);
                o0VarE.K(c2Var2);
                objQ5 = c2Var2;
            }
            p1Var2 = (p1) objQ5;
            zR = o0VarE.r(zVar) | o0VarE.k(TsExtractor.TS_STREAM_TYPE_AIT);
            objQ6 = o0VarE.q();
            if (zR) {
                g gVar2 = new g(p1Var2, zVar, pVar, TsExtractor.TS_STREAM_TYPE_AIT, p1Var);
                o0VarE.K(gVar2);
                objQ6 = gVar2;
            } else {
                g gVar3 = new g(p1Var2, zVar, pVar, TsExtractor.TS_STREAM_TYPE_AIT, p1Var);
                o0VarE.K(gVar3);
                objQ6 = gVar3;
            }
            z0 z0Var2 = (z0) objQ6;
            objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = new h(p1Var, pVar);
                o0VarE.K(objQ7);
            }
            e23.a aVar5 = (e23.a) objQ7;
            zR2 = o0VarE.r(zVar);
            objQ8 = o0VarE.q();
            if (zR2) {
                objQ8 = new i(zVar);
                o0VarE.K(objQ8);
            } else {
                objQ8 = new i(zVar);
                o0VarE.K(objQ8);
            }
            o0Var = o0VarE;
            k0.a(v.c((l) objQ8, rVarThen2, false), z3.f.c(1200550679, new j(p1Var2, mVar2, aVar5, bVar, f15, null), o0VarE), z0Var2, o0Var, 48, 0);
            o0Var.g0(false);
            rVar2 = rVar4;
            str3 = str4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            str3 = str2;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(rVar2, str3, f14, bVar, i14, i15);
        }
    }
}
