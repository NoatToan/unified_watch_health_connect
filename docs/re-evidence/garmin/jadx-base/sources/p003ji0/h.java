package p003ji0;

import a5.f;
import androidx.room.a0;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import ct1.c;
import e2.i0;
import e23.a;
import e23.l;
import e23.p;
import f5.i2;
import h4.r;
import j21.g;
import l4.k;
import m3.s;
import n23.j;
import p3.l0;
import p3.m;
import p3.m1;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import z3.e;

/* JADX INFO: loaded from: classes8.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:100:0x0191  */
    /* JADX WARN: Code duplicated, block: B:101:0x0194  */
    /* JADX WARN: Code duplicated, block: B:104:0x019b  */
    /* JADX WARN: Code duplicated, block: B:105:0x019e  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:120:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:121:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:95:0x015d  */
    public static final void a(i0 i0Var, boolean z14, boolean z15, a aVar, e eVar, a aVar2, l lVar, m mVar, int i14) {
        int i15;
        m1 m1Var;
        boolean z16;
        Object fVar;
        int i16;
        s sVarE;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        Object objQ;
        int i17;
        o0 o0VarO = a0.o(aVar, lVar, mVar, 1515094664);
        if ((i14 & 6) == 0) {
            i15 = (o0VarO.B(i0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarO.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarO.h(z15) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarO.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarO.r(eVar) ? 16384 : 8192;
        }
        if ((i14 & 196608) == 0) {
            i15 |= o0VarO.B(aVar2) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarO.r(lVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        boolean z28 = true;
        if (o0VarO.n(i15 & 1, (599187 & i15) != 599186)) {
            o0VarO.G0();
            if ((i14 & 1) != 0 && !o0VarO.o0()) {
                o0VarO.e();
            }
            o0VarO.h0();
            x1 x1Var = n.f135158a;
            Object objQ2 = o0VarO.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = p0.f(new c(i0Var, 6));
                o0VarO.K(objQ2);
            }
            x3 x3Var = (x3) objQ2;
            Object objQ3 = o0VarO.q();
            if (objQ3 == c2565a) {
                objQ3 = j.o(0.0f, o0VarO);
            }
            m1 m1Var2 = (m1) objQ3;
            Object objQ4 = o0VarO.q();
            if (objQ4 == c2565a) {
                objQ4 = j.o(aVar2.f98765a.getIntValue(), o0VarO);
            }
            m1 m1Var3 = (m1) objQ4;
            Object objQ5 = o0VarO.q();
            if (objQ5 == c2565a) {
                objQ5 = new g(m1Var3, m1Var2);
                o0VarO.K(objQ5);
            }
            g gVar = (g) objQ5;
            Object objQ6 = o0VarO.q();
            if (objQ6 == c2565a) {
                objQ6 = p0.n(Boolean.TRUE);
                o0VarO.K(objQ6);
            }
            p1 p1Var = (p1) objQ6;
            Integer numValueOf = Integer.valueOf(((Number) x3Var.getF182175a()).intValue());
            Float fValueOf = Float.valueOf(m1Var3.getFloatValue());
            int i18 = (i15 & 458752) ^ 196608;
            if (i18 <= 131072 || !o0VarO.B(aVar2)) {
                m1Var = m1Var2;
                if ((i15 & 196608) != 131072) {
                    z16 = false;
                }
                Object objQ7 = o0VarO.q();
                if (!z16 || objQ7 == c2565a) {
                    i16 = 16384;
                    fVar = new f(aVar2, p1Var, x3Var, m1Var3, null);
                    o0VarO.K(fVar);
                } else {
                    fVar = objQ7;
                    i16 = 16384;
                }
                l0.f(numValueOf, fValueOf, (p) fVar, o0VarO);
                sVarE = m3.l.e(o0VarO);
                r rVarA = f.a(k.b(r.S, o4.m1.f128891a), gVar, null);
                if ((57344 & i15) == i16) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if ((i15 & 896) == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z29 = z17 | z18;
                if ((i15 & 112) == 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z34 = z29 | z19;
                if ((i15 & 7168) == 2048) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean zB = z34 | z24 | o0VarO.B(sVarE);
                if ((i15 & 14) == 4) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z35 = zB | z25;
                if ((3670016 & i15) == 1048576) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z36 = z35 | z26;
                if ((i18 > 131072 || !o0VarO.B(aVar2)) && (i15 & 196608) != 131072) {
                }
                z27 = z36 | z28;
                objQ = o0VarO.q();
                if (!z27 || objQ == c2565a) {
                    i17 = 0;
                    g gVar2 = new g(eVar, m1Var, z15, z14, aVar, sVarE, i0Var, lVar, aVar2);
                    o0VarO.K(gVar2);
                    objQ = gVar2;
                } else {
                    i17 = 0;
                }
                i2.b(rVarA, (p) objQ, o0VarO, i17, i17);
            } else {
                m1Var = m1Var2;
            }
            z16 = true;
            Object objQ8 = o0VarO.q();
            if (z16) {
                i16 = 16384;
                fVar = new f(aVar2, p1Var, x3Var, m1Var3, null);
                o0VarO.K(fVar);
            } else {
                i16 = 16384;
                fVar = new f(aVar2, p1Var, x3Var, m1Var3, null);
                o0VarO.K(fVar);
            }
            l0.f(numValueOf, fValueOf, (p) fVar, o0VarO);
            sVarE = m3.l.e(o0VarO);
            r rVarA2 = f.a(k.b(r.S, o4.m1.f128891a), gVar, null);
            if ((57344 & i15) == i16) {
                z17 = true;
            } else {
                z17 = false;
            }
            if ((i15 & 896) == 256) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z210 = z17 | z18;
            if ((i15 & 112) == 32) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean z37 = z210 | z19;
            if ((i15 & 7168) == 2048) {
                z24 = true;
            } else {
                z24 = false;
            }
            boolean zB2 = z37 | z24 | o0VarO.B(sVarE);
            if ((i15 & 14) == 4) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean z38 = zB2 | z25;
            if ((3670016 & i15) == 1048576) {
                z26 = true;
            } else {
                z26 = false;
            }
            boolean z39 = z38 | z26;
            z28 = i18 > 131072 ? false : false;
            z27 = z39 | z28;
            objQ = o0VarO.q();
            if (z27) {
                i17 = 0;
                g gVar3 = new g(eVar, m1Var, z15, z14, aVar, sVarE, i0Var, lVar, aVar2);
                o0VarO.K(gVar3);
                objQ = gVar3;
            } else {
                i17 = 0;
                g gVar4 = new g(eVar, m1Var, z15, z14, aVar, sVarE, i0Var, lVar, aVar2);
                o0VarO.K(gVar4);
                objQ = gVar4;
            }
            i2.b(rVarA2, (p) objQ, o0VarO, i17, i17);
        } else {
            o0VarO.e();
        }
        p2 p2VarI0 = o0VarO.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c82.c(i0Var, z14, z15, aVar, eVar, aVar2, lVar, i14);
        }
    }
}
