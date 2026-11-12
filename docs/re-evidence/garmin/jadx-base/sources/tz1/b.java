package tz1;

import c2.b0;
import c2.l;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import kotlin.t1;
import oz1.u;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:67:0x0121  */
    /* JADX WARN: Code duplicated, block: B:69:0x0125  */
    /* JADX WARN: Code duplicated, block: B:70:0x012a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0150  */
    /* JADX WARN: Code duplicated, block: B:75:0x0158  */
    /* JADX WARN: Code duplicated, block: B:76:0x015b  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01de  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    public static final void a(r rVar, Float f14, u uVar, boolean z14, m mVar, int i14, int i15) {
        int i16;
        boolean z15;
        boolean z16;
        u uVar2;
        boolean z17;
        p2 p2VarI0;
        boolean z18;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar;
        h5.g.a.b bVar;
        b0 b0Var;
        r.a aVar2;
        float f75992b;
        float fG;
        int i17;
        rVar.getClass();
        o0 o0VarE = mVar.E(2062686467);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(f14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.k(uVar == null ? -1 : uVar.ordinal()) ? 256 : 128;
        }
        int i18 = i15 & 8;
        if (i18 == 0) {
            if ((i14 & 3072) == 0) {
                z15 = z14;
                i16 |= o0VarE.h(z15) ? 2048 : 1024;
            }
            if ((i16 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i18 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                x1 x1Var = n.f135158a;
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVar, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
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
                bVar = h5.g.a.f81813j;
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0Var = b0.f22601a;
                aVar2 = r.S;
                r rVarH = x2.h(aVar2, yz1.y.k(o0VarE));
                if (z18) {
                    o0VarE.C(-1760297416);
                    fG = yz1.y.g(o0VarE);
                } else {
                    o0VarE.C(-1760296238);
                    float f15 = yz1.s.f200414a;
                    f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
                    if (f75992b <= 1.0f && f75992b <= 1.5f) {
                        g6.f.a aVar3 = g6.f.f75994b;
                        fG = 6.0f;
                    } else if (f75992b > 1.5f) {
                        g6.f.a aVar4 = g6.f.f75994b;
                        fG = 8.0f;
                    } else {
                        g6.f.a aVar5 = g6.f.f75994b;
                        fG = 4.0f;
                    }
                }
                o0VarE.g0(false);
                int i19 = i16 >> 3;
                int i24 = (i19 & 14) | 199680 | (i19 & 112);
                uVar2 = uVar;
                sz1.e.a(f14, uVar2, fG, 3.0f, rVarH, z3.f.c(-1967226739, new a(0, f14), o0VarE), o0VarE, i24);
                if (z18) {
                    o0VarE.C(1265807213);
                    if (uVar2 != null) {
                        i17 = uVar2.f134640c;
                    } else {
                        i17 = R.string.no_data_label;
                    }
                    String strQ = gl1.y.Q(o0VarE, i17);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarB = b0Var.b(l.C(aVar2, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), h4.d.a.f81537o);
                    d92.b.f58624b.getClass();
                    mh.c(strQ, rVarB, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 131068);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1266203145);
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                z17 = z18;
            } else {
                uVar2 = uVar;
                o0VarE.e();
                z17 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new aa2.g(rVar, f14, uVar2, z17, i14, i15, 18);
            }
        }
        i16 |= 3072;
        z15 = z14;
        if ((i16 & 1171) != 1170) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            if (i18 != 0) {
                z18 = true;
            } else {
                z18 = z15;
            }
            x1 x1Var2 = n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVar, o0VarE);
            h5.g.V.getClass();
            aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
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
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0Var = b0.f22601a;
            aVar2 = r.S;
            r rVarH2 = x2.h(aVar2, yz1.y.k(o0VarE));
            if (z18) {
                o0VarE.C(-1760297416);
                fG = yz1.y.g(o0VarE);
            } else {
                o0VarE.C(-1760296238);
                float f16 = yz1.s.f200414a;
                f75992b = ((g6.c) o0VarE.A(t1.f91490h)).getF75992b();
                if (f75992b <= 1.0f) {
                    if (f75992b > 1.5f) {
                        g6.f.a aVar6 = g6.f.f75994b;
                        fG = 8.0f;
                    } else {
                        g6.f.a aVar7 = g6.f.f75994b;
                        fG = 4.0f;
                    }
                } else if (f75992b > 1.5f) {
                    g6.f.a aVar8 = g6.f.f75994b;
                    fG = 8.0f;
                } else {
                    g6.f.a aVar9 = g6.f.f75994b;
                    fG = 4.0f;
                }
            }
            o0VarE.g0(false);
            int i110 = i16 >> 3;
            int i25 = (i110 & 14) | 199680 | (i110 & 112);
            uVar2 = uVar;
            sz1.e.a(f14, uVar2, fG, 3.0f, rVarH2, z3.f.c(-1967226739, new a(0, f14), o0VarE), o0VarE, i25);
            if (z18) {
                o0VarE.C(1265807213);
                if (uVar2 != null) {
                    i17 = uVar2.f134640c;
                } else {
                    i17 = R.string.no_data_label;
                }
                String strQ2 = gl1.y.Q(o0VarE, i17);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarB2 = b0Var.b(l.C(aVar2, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), h4.d.a.f81537o);
                d92.b.f58624b.getClass();
                mh.c(strQ2, rVarB2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(1266203145);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            z17 = z18;
        } else {
            uVar2 = uVar;
            o0VarE.e();
            z17 = z15;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.g(rVar, f14, uVar2, z17, i14, i15, 18);
        }
    }
}
