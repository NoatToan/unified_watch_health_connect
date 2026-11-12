package l72;

import android.annotation.SuppressLint;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.mh;
import i3.v7;
import i3.w7;
import java.util.List;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
public final class g1 {
    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    public static final void a(String str, String str2, e23.a<Unit> aVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(699656249);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            v7.f89994a.getClass();
            w7 w7VarA = v7.a(o0VarE);
            d92.b.f58623a.getClass();
            w7 w7VarA2 = w7.a(w7VarA, d92.b.a(o0VarE).f().b());
            z3.e eVarC = z3.f.c(-1864653815, new fv1.b(str, 15), o0VarE);
            boolean z14 = (i15 & 896) == 256;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new t(aVar, 7);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new t(aVar, 7);
                    o0VarE.K(objQ);
                }
            }
            i3.u.b(eVarC, (e23.a) objQ, null, null, z3.f.c(-140986611, new b82.o(str, str2, 19), o0VarE), true, w7VarA2, null, o0VarE, 221190, 396);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new af1.a(str, str2, aVar, i14, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012a  */
    /* JADX WARN: Code duplicated, block: B:102:0x012e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0130  */
    /* JADX WARN: Code duplicated, block: B:106:0x0141  */
    /* JADX WARN: Code duplicated, block: B:109:0x0152  */
    /* JADX WARN: Code duplicated, block: B:112:0x0160  */
    /* JADX WARN: Code duplicated, block: B:115:0x016d  */
    /* JADX WARN: Code duplicated, block: B:117:0x018c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0198  */
    /* JADX WARN: Code duplicated, block: B:120:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:123:0x0210  */
    /* JADX WARN: Code duplicated, block: B:124:0x0212  */
    /* JADX WARN: Code duplicated, block: B:127:0x0219 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x021b  */
    /* JADX WARN: Code duplicated, block: B:131:0x025d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0264  */
    /* JADX WARN: Code duplicated, block: B:134:0x0268  */
    /* JADX WARN: Code duplicated, block: B:137:0x027b  */
    /* JADX WARN: Code duplicated, block: B:139:0x0289  */
    /* JADX WARN: Code duplicated, block: B:142:0x0326  */
    /* JADX WARN: Code duplicated, block: B:144:0x032a  */
    /* JADX WARN: Code duplicated, block: B:147:0x033f  */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    /* JADX WARN: Code duplicated, block: B:36:0x0079  */
    /* JADX WARN: Code duplicated, block: B:40:0x0082  */
    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x0094  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:81:0x0102  */
    /* JADX WARN: Code duplicated, block: B:82:0x0104  */
    /* JADX WARN: Code duplicated, block: B:85:0x010d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x010f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0112  */
    /* JADX WARN: Code duplicated, block: B:89:0x0116  */
    /* JADX WARN: Code duplicated, block: B:90:0x0119  */
    /* JADX WARN: Code duplicated, block: B:92:0x011d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0120  */
    /* JADX WARN: Code duplicated, block: B:96:0x0123  */
    /* JADX WARN: Code duplicated, block: B:97:0x0125  */
    /* JADX WARN: Code duplicated, block: B:99:0x0128  */
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"UnusedBoxWithConstraintsScope"})
    public static final void b(h4.r rVar, String str, List list, String str2, String str3, u4.d dVar, String str4, boolean z14, boolean z15, e23.l lVar, e23.l lVar2, p3.m mVar, int i14, int i15) {
        int i16;
        String str5;
        int i17;
        u4.d dVar2;
        int i18;
        int i19;
        int i24;
        String str6;
        int i25;
        int i26;
        boolean z16;
        int i27;
        int i28;
        int i29;
        int i30;
        int i34;
        int i35;
        int i36;
        boolean z17;
        h4.r rVar2;
        e23.l lVar3;
        p3.o0 o0Var;
        String str7;
        u4.d dVar3;
        boolean z18;
        boolean z19;
        String str8;
        p3.p2 p2VarI0;
        h4.r rVar3;
        String str9;
        boolean z24;
        boolean z25;
        Object objQ;
        p3.m.a.C2565a c2565a;
        p3.p1 p1Var;
        Object objQ2;
        m4.b0 b0Var;
        Object objQ3;
        p3.p1 p1Var2;
        long jA;
        long j8;
        h4.r.a aVar;
        long j14;
        j92.b bVar;
        j92.e eVar;
        h4.r rVar4;
        boolean z26;
        Object objQ4;
        c2.z zVarA;
        int iHashCode;
        p3.i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar2;
        h5.g.a.b bVar2;
        list.getClass();
        str2.getClass();
        lVar2.getClass();
        p3.o0 o0VarE = mVar.E(1001033647);
        int i37 = i15 & 1;
        if (i37 != 0) {
            i16 = i14 | 6;
        } else {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        }
        int i38 = i16 | (o0VarE.r(list) ? 256 : 128) | (o0VarE.B(str2) ? 2048 : 1024);
        int i39 = i15 & 16;
        if (i39 == 0) {
            if ((i14 & 24576) == 0) {
                str5 = str3;
                i38 |= o0VarE.B(str5) ? 16384 : 8192;
            }
            i17 = i15 & 32;
            if (i17 != 0) {
                i19 = i38 | 196608;
                dVar2 = dVar;
            } else {
                dVar2 = dVar;
                if (o0VarE.B(dVar2)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i19 = i38 | i18;
            }
            i24 = i15 & 64;
            if (i24 != 0) {
                if ((1572864 & i14) == 0) {
                    str6 = str4;
                    if (o0VarE.B(str6)) {
                        i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i25 = 524288;
                    }
                    i19 |= i25;
                }
                i26 = i15 & 128;
                if (i26 != 0) {
                    i28 = i19 | 12582912;
                    z16 = z14;
                } else {
                    z16 = z14;
                    if (o0VarE.h(z16)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i28 = i19 | i27;
                }
                i29 = i15 & 256;
                if (i29 != 0) {
                    if ((i14 & 100663296) == 0) {
                        if (o0VarE.h(z15)) {
                            i30 = 67108864;
                        } else {
                            i30 = 33554432;
                        }
                        i28 |= i30;
                    }
                    i34 = i15 & 512;
                    if (i34 != 0) {
                        i28 |= C.ENCODING_PCM_32BIT;
                    } else if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(lVar)) {
                            i35 = 536870912;
                        } else {
                            i35 = 268435456;
                        }
                        i28 |= i35;
                    }
                    i36 = i28;
                    if ((i36 & 306783379) == 306783378) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    if (o0VarE.n(i36 & 1, z17)) {
                        if (i37 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i39 != 0) {
                            str9 = null;
                        } else {
                            str9 = str5;
                        }
                        if (i17 != 0) {
                            dVar2 = null;
                        }
                        if (i24 != 0) {
                            str6 = null;
                        }
                        if (i26 != 0) {
                            z24 = true;
                        } else {
                            z24 = z16;
                        }
                        if (i29 != 0) {
                            z25 = true;
                        } else {
                            z25 = z15;
                        }
                        if (i34 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        p3.x1 x1Var = p3.n.f135158a;
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        c2565a = p3.m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = p3.p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        p1Var = (p3.p1) objQ;
                        objQ2 = o0VarE.q();
                        if (objQ2 == c2565a) {
                            objQ2 = kg.f.j(o0VarE);
                        }
                        b0Var = (m4.b0) objQ2;
                        objQ3 = o0VarE.q();
                        if (objQ3 == c2565a) {
                            objQ3 = p3.p0.n(Boolean.FALSE);
                            o0VarE.K(objQ3);
                        }
                        p1Var2 = (p3.p1) objQ3;
                        if (z24) {
                            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                                o0VarE.C(-79317996);
                                d92.b.f58623a.getClass();
                                p1Var2 = p1Var2;
                                j8 = ((o4.d0) d92.b.a(o0VarE).g().b().f82540c.getF182175a()).f128833a;
                                o0VarE.g0(false);
                            } else {
                                o0VarE.C(-79316522);
                                d92.b.f58623a.getClass();
                                jA = d92.b.a(o0VarE).g().b().a();
                                o0VarE.g0(false);
                            }
                            aVar = h4.r.S;
                            j14 = j8;
                            h4.r rVarF = c2.x2.f(aVar, 1.0f);
                            d92.b.f58623a.getClass();
                            bVar = d92.b.f58625c;
                            bVar.getClass();
                            eVar = j92.b.f97899b;
                            h4.r rVarA = m4.e.a(c2.l.y(rVarF, eVar.f97920e).then(rVar3), b0Var);
                            rVar4 = rVar3;
                            if ((i36 & 1879048192) == 536870912) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            objQ4 = o0VarE.q();
                            if (z26 || objQ4 == c2565a) {
                                objQ4 = new a11.b0(lVar3, p1Var, 19);
                                o0VarE.K(objQ4);
                            }
                            h4.r rVarThen = m4.e.b(rVarA, (e23.l) objQ4).then(m4.j0.a.f116489a);
                            c2.j.f22691a.getClass();
                            c2.j.k kVar = c2.j.f22694d;
                            h4.d.f81522a.getClass();
                            zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                            iHashCode = Long.hashCode(o0VarE.U);
                            i2VarA0 = o0VarE.a0();
                            rVarC = h4.k.c(rVarThen, o0VarE);
                            h5.g.V.getClass();
                            aVar2 = h5.g.a.f81805b;
                            if (o0VarE.f135177b != null) {
                                p3.p0.l();
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
                            bVar2 = h5.g.a.f81813j;
                            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                            }
                            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                            c2.b0 b0Var2 = c2.b0.f22601a;
                            d92.b.f58624b.getClass();
                            s5.x0 x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
                            bVar.getClass();
                            o0Var = o0VarE;
                            mh.c(str, c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0Var, 6, 0, 131068);
                            boolean z27 = z25;
                            c2.v.a(c2.x2.f(aVar, 1.0f), null, false, z3.f.c(961877115, new ho.e(z27, j14, str2, b0Var, p1Var2, list, lVar2), o0VarE), o0VarE, 3078, 6);
                            boolean z28 = z24;
                            String str10 = str9;
                            c(str10, dVar2, str6, z28, o0VarE, (i36 >> 12) & 8190);
                            o0VarE.g0(true);
                            z18 = z28;
                            dVar3 = dVar2;
                            z19 = z27;
                            rVar2 = rVar4;
                            str7 = str10;
                        } else {
                            o0VarE.C(-79319690);
                            d92.b.f58623a.getClass();
                            jA = d92.b.a(o0VarE).j().g();
                            o0VarE.g0(false);
                        }
                        j8 = jA;
                        aVar = h4.r.S;
                        j14 = j8;
                        h4.r rVarF2 = c2.x2.f(aVar, 1.0f);
                        d92.b.f58623a.getClass();
                        bVar = d92.b.f58625c;
                        bVar.getClass();
                        eVar = j92.b.f97899b;
                        h4.r rVarA2 = m4.e.a(c2.l.y(rVarF2, eVar.f97920e).then(rVar3), b0Var);
                        rVar4 = rVar3;
                        if ((i36 & 1879048192) == 536870912) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        objQ4 = o0VarE.q();
                        if (z26) {
                            objQ4 = new a11.b0(lVar3, p1Var, 19);
                            o0VarE.K(objQ4);
                        } else {
                            objQ4 = new a11.b0(lVar3, p1Var, 19);
                            o0VarE.K(objQ4);
                        }
                        h4.r rVarThen2 = m4.e.b(rVarA2, (e23.l) objQ4).then(m4.j0.a.f116489a);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar2 = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        zVarA = c2.y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
                        iHashCode = Long.hashCode(o0VarE.U);
                        i2VarA0 = o0VarE.a0();
                        rVarC = h4.k.c(rVarThen2, o0VarE);
                        h5.g.V.getClass();
                        aVar2 = h5.g.a.f81805b;
                        if (o0VarE.f135177b != null) {
                            p3.p0.l();
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
                        bVar2 = h5.g.a.f81813j;
                        if (o0VarE.T) {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                        } else {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                        c2.b0 b0Var3 = c2.b0.f22601a;
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarB2 = d92.c.b(j92.f.f97932i, o0VarE);
                        bVar.getClass();
                        o0Var = o0VarE;
                        mh.c(str, c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, o0Var, 6, 0, 131068);
                        boolean z29 = z25;
                        c2.v.a(c2.x2.f(aVar, 1.0f), null, false, z3.f.c(961877115, new ho.e(z29, j14, str2, b0Var, p1Var2, list, lVar2), o0VarE), o0VarE, 3078, 6);
                        boolean z210 = z24;
                        String str11 = str9;
                        c(str11, dVar2, str6, z210, o0VarE, (i36 >> 12) & 8190);
                        o0VarE.g0(true);
                        z18 = z210;
                        dVar3 = dVar2;
                        z19 = z29;
                        rVar2 = rVar4;
                        str7 = str11;
                    } else {
                        o0VarE.e();
                        rVar2 = rVar;
                        lVar3 = lVar;
                        o0Var = o0VarE;
                        str7 = str5;
                        dVar3 = dVar2;
                        z18 = z16;
                        z19 = z15;
                    }
                    str8 = str6;
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new i3.t1(rVar2, str, list, str2, str7, dVar3, str8, z18, z19, lVar3, lVar2, i14, i15);
                    }
                }
                i28 |= 100663296;
                i34 = i15 & 512;
                if (i34 != 0) {
                    i28 |= C.ENCODING_PCM_32BIT;
                } else if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(lVar)) {
                        i35 = 536870912;
                    } else {
                        i35 = 268435456;
                    }
                    i28 |= i35;
                }
                i36 = i28;
                if ((i36 & 306783379) == 306783378) {
                    z17 = false;
                } else {
                    z17 = true;
                }
                if (o0VarE.n(i36 & 1, z17)) {
                    if (i37 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i39 != 0) {
                        str9 = null;
                    } else {
                        str9 = str5;
                    }
                    if (i17 != 0) {
                        dVar2 = null;
                    }
                    if (i24 != 0) {
                        str6 = null;
                    }
                    if (i26 != 0) {
                        z24 = true;
                    } else {
                        z24 = z16;
                    }
                    if (i29 != 0) {
                        z25 = true;
                    } else {
                        z25 = z15;
                    }
                    if (i34 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    p3.x1 x1Var2 = p3.n.f135158a;
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = p3.p0.n(Boolean.FALSE);
                        o0VarE.K(objQ);
                    }
                    p1Var = (p3.p1) objQ;
                    objQ2 = o0VarE.q();
                    if (objQ2 == c2565a) {
                        objQ2 = kg.f.j(o0VarE);
                    }
                    b0Var = (m4.b0) objQ2;
                    objQ3 = o0VarE.q();
                    if (objQ3 == c2565a) {
                        objQ3 = p3.p0.n(Boolean.FALSE);
                        o0VarE.K(objQ3);
                    }
                    p1Var2 = (p3.p1) objQ3;
                    if (z24) {
                        o0VarE.C(-79319690);
                        d92.b.f58623a.getClass();
                        jA = d92.b.a(o0VarE).j().g();
                        o0VarE.g0(false);
                    } else {
                        if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                            o0VarE.C(-79317996);
                            d92.b.f58623a.getClass();
                            p1Var2 = p1Var2;
                            j8 = ((o4.d0) d92.b.a(o0VarE).g().b().f82540c.getF182175a()).f128833a;
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(-79316522);
                            d92.b.f58623a.getClass();
                            jA = d92.b.a(o0VarE).g().b().a();
                            o0VarE.g0(false);
                        }
                        aVar = h4.r.S;
                        j14 = j8;
                        h4.r rVarF3 = c2.x2.f(aVar, 1.0f);
                        d92.b.f58623a.getClass();
                        bVar = d92.b.f58625c;
                        bVar.getClass();
                        eVar = j92.b.f97899b;
                        h4.r rVarA3 = m4.e.a(c2.l.y(rVarF3, eVar.f97920e).then(rVar3), b0Var);
                        rVar4 = rVar3;
                        if ((i36 & 1879048192) == 536870912) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        objQ4 = o0VarE.q();
                        if (z26) {
                            objQ4 = new a11.b0(lVar3, p1Var, 19);
                            o0VarE.K(objQ4);
                        } else {
                            objQ4 = new a11.b0(lVar3, p1Var, 19);
                            o0VarE.K(objQ4);
                        }
                        h4.r rVarThen3 = m4.e.b(rVarA3, (e23.l) objQ4).then(m4.j0.a.f116489a);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar3 = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        zVarA = c2.y.a(kVar3, h4.d.a.f81536n, o0VarE, 0);
                        iHashCode = Long.hashCode(o0VarE.U);
                        i2VarA0 = o0VarE.a0();
                        rVarC = h4.k.c(rVarThen3, o0VarE);
                        h5.g.V.getClass();
                        aVar2 = h5.g.a.f81805b;
                        if (o0VarE.f135177b != null) {
                            p3.p0.l();
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
                        bVar2 = h5.g.a.f81813j;
                        if (o0VarE.T) {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                        } else {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                        c2.b0 b0Var4 = c2.b0.f22601a;
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarB3 = d92.c.b(j92.f.f97932i, o0VarE);
                        bVar.getClass();
                        o0Var = o0VarE;
                        mh.c(str, c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB3, o0Var, 6, 0, 131068);
                        boolean z211 = z25;
                        c2.v.a(c2.x2.f(aVar, 1.0f), null, false, z3.f.c(961877115, new ho.e(z211, j14, str2, b0Var, p1Var2, list, lVar2), o0VarE), o0VarE, 3078, 6);
                        boolean z212 = z24;
                        String str12 = str9;
                        c(str12, dVar2, str6, z212, o0VarE, (i36 >> 12) & 8190);
                        o0VarE.g0(true);
                        z18 = z212;
                        dVar3 = dVar2;
                        z19 = z211;
                        rVar2 = rVar4;
                        str7 = str12;
                    }
                    j8 = jA;
                    aVar = h4.r.S;
                    j14 = j8;
                    h4.r rVarF4 = c2.x2.f(aVar, 1.0f);
                    d92.b.f58623a.getClass();
                    bVar = d92.b.f58625c;
                    bVar.getClass();
                    eVar = j92.b.f97899b;
                    h4.r rVarA4 = m4.e.a(c2.l.y(rVarF4, eVar.f97920e).then(rVar3), b0Var);
                    rVar4 = rVar3;
                    if ((i36 & 1879048192) == 536870912) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    objQ4 = o0VarE.q();
                    if (z26) {
                        objQ4 = new a11.b0(lVar3, p1Var, 19);
                        o0VarE.K(objQ4);
                    } else {
                        objQ4 = new a11.b0(lVar3, p1Var, 19);
                        o0VarE.K(objQ4);
                    }
                    h4.r rVarThen4 = m4.e.b(rVarA4, (e23.l) objQ4).then(m4.j0.a.f116489a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar4 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = c2.y.a(kVar4, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarThen4, o0VarE);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
                        p3.p0.l();
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
                    bVar2 = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var5 = c2.b0.f22601a;
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB4 = d92.c.b(j92.f.f97932i, o0VarE);
                    bVar.getClass();
                    o0Var = o0VarE;
                    mh.c(str, c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB4, o0Var, 6, 0, 131068);
                    boolean z213 = z25;
                    c2.v.a(c2.x2.f(aVar, 1.0f), null, false, z3.f.c(961877115, new ho.e(z213, j14, str2, b0Var, p1Var2, list, lVar2), o0VarE), o0VarE, 3078, 6);
                    boolean z214 = z24;
                    String str13 = str9;
                    c(str13, dVar2, str6, z214, o0VarE, (i36 >> 12) & 8190);
                    o0VarE.g0(true);
                    z18 = z214;
                    dVar3 = dVar2;
                    z19 = z213;
                    rVar2 = rVar4;
                    str7 = str13;
                } else {
                    o0VarE.e();
                    rVar2 = rVar;
                    lVar3 = lVar;
                    o0Var = o0VarE;
                    str7 = str5;
                    dVar3 = dVar2;
                    z18 = z16;
                    z19 = z15;
                }
                str8 = str6;
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new i3.t1(rVar2, str, list, str2, str7, dVar3, str8, z18, z19, lVar3, lVar2, i14, i15);
                }
            }
            i19 |= 1572864;
            str6 = str4;
            i26 = i15 & 128;
            if (i26 != 0) {
                i28 = i19 | 12582912;
                z16 = z14;
            } else {
                z16 = z14;
                if (o0VarE.h(z16)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i28 = i19 | i27;
            }
            i29 = i15 & 256;
            if (i29 != 0) {
                if ((i14 & 100663296) == 0) {
                    if (o0VarE.h(z15)) {
                        i30 = 67108864;
                    } else {
                        i30 = 33554432;
                    }
                    i28 |= i30;
                }
                i34 = i15 & 512;
                if (i34 != 0) {
                    i28 |= C.ENCODING_PCM_32BIT;
                } else if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(lVar)) {
                        i35 = 536870912;
                    } else {
                        i35 = 268435456;
                    }
                    i28 |= i35;
                }
                i36 = i28;
                if ((i36 & 306783379) == 306783378) {
                    z17 = false;
                } else {
                    z17 = true;
                }
                if (o0VarE.n(i36 & 1, z17)) {
                    if (i37 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i39 != 0) {
                        str9 = null;
                    } else {
                        str9 = str5;
                    }
                    if (i17 != 0) {
                        dVar2 = null;
                    }
                    if (i24 != 0) {
                        str6 = null;
                    }
                    if (i26 != 0) {
                        z24 = true;
                    } else {
                        z24 = z16;
                    }
                    if (i29 != 0) {
                        z25 = true;
                    } else {
                        z25 = z15;
                    }
                    if (i34 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    p3.x1 x1Var3 = p3.n.f135158a;
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = p3.p0.n(Boolean.FALSE);
                        o0VarE.K(objQ);
                    }
                    p1Var = (p3.p1) objQ;
                    objQ2 = o0VarE.q();
                    if (objQ2 == c2565a) {
                        objQ2 = kg.f.j(o0VarE);
                    }
                    b0Var = (m4.b0) objQ2;
                    objQ3 = o0VarE.q();
                    if (objQ3 == c2565a) {
                        objQ3 = p3.p0.n(Boolean.FALSE);
                        o0VarE.K(objQ3);
                    }
                    p1Var2 = (p3.p1) objQ3;
                    if (z24) {
                        o0VarE.C(-79319690);
                        d92.b.f58623a.getClass();
                        jA = d92.b.a(o0VarE).j().g();
                        o0VarE.g0(false);
                    } else {
                        if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                            o0VarE.C(-79317996);
                            d92.b.f58623a.getClass();
                            p1Var2 = p1Var2;
                            j8 = ((o4.d0) d92.b.a(o0VarE).g().b().f82540c.getF182175a()).f128833a;
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(-79316522);
                            d92.b.f58623a.getClass();
                            jA = d92.b.a(o0VarE).g().b().a();
                            o0VarE.g0(false);
                        }
                        aVar = h4.r.S;
                        j14 = j8;
                        h4.r rVarF5 = c2.x2.f(aVar, 1.0f);
                        d92.b.f58623a.getClass();
                        bVar = d92.b.f58625c;
                        bVar.getClass();
                        eVar = j92.b.f97899b;
                        h4.r rVarA5 = m4.e.a(c2.l.y(rVarF5, eVar.f97920e).then(rVar3), b0Var);
                        rVar4 = rVar3;
                        if ((i36 & 1879048192) == 536870912) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        objQ4 = o0VarE.q();
                        if (z26) {
                            objQ4 = new a11.b0(lVar3, p1Var, 19);
                            o0VarE.K(objQ4);
                        } else {
                            objQ4 = new a11.b0(lVar3, p1Var, 19);
                            o0VarE.K(objQ4);
                        }
                        h4.r rVarThen5 = m4.e.b(rVarA5, (e23.l) objQ4).then(m4.j0.a.f116489a);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar5 = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        zVarA = c2.y.a(kVar5, h4.d.a.f81536n, o0VarE, 0);
                        iHashCode = Long.hashCode(o0VarE.U);
                        i2VarA0 = o0VarE.a0();
                        rVarC = h4.k.c(rVarThen5, o0VarE);
                        h5.g.V.getClass();
                        aVar2 = h5.g.a.f81805b;
                        if (o0VarE.f135177b != null) {
                            p3.p0.l();
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
                        bVar2 = h5.g.a.f81813j;
                        if (o0VarE.T) {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                        } else {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                        c2.b0 b0Var6 = c2.b0.f22601a;
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarB5 = d92.c.b(j92.f.f97932i, o0VarE);
                        bVar.getClass();
                        o0Var = o0VarE;
                        mh.c(str, c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB5, o0Var, 6, 0, 131068);
                        boolean z215 = z25;
                        c2.v.a(c2.x2.f(aVar, 1.0f), null, false, z3.f.c(961877115, new ho.e(z215, j14, str2, b0Var, p1Var2, list, lVar2), o0VarE), o0VarE, 3078, 6);
                        boolean z216 = z24;
                        String str14 = str9;
                        c(str14, dVar2, str6, z216, o0VarE, (i36 >> 12) & 8190);
                        o0VarE.g0(true);
                        z18 = z216;
                        dVar3 = dVar2;
                        z19 = z215;
                        rVar2 = rVar4;
                        str7 = str14;
                    }
                    j8 = jA;
                    aVar = h4.r.S;
                    j14 = j8;
                    h4.r rVarF6 = c2.x2.f(aVar, 1.0f);
                    d92.b.f58623a.getClass();
                    bVar = d92.b.f58625c;
                    bVar.getClass();
                    eVar = j92.b.f97899b;
                    h4.r rVarA6 = m4.e.a(c2.l.y(rVarF6, eVar.f97920e).then(rVar3), b0Var);
                    rVar4 = rVar3;
                    if ((i36 & 1879048192) == 536870912) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    objQ4 = o0VarE.q();
                    if (z26) {
                        objQ4 = new a11.b0(lVar3, p1Var, 19);
                        o0VarE.K(objQ4);
                    } else {
                        objQ4 = new a11.b0(lVar3, p1Var, 19);
                        o0VarE.K(objQ4);
                    }
                    h4.r rVarThen6 = m4.e.b(rVarA6, (e23.l) objQ4).then(m4.j0.a.f116489a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar6 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = c2.y.a(kVar6, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarThen6, o0VarE);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
                        p3.p0.l();
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
                    bVar2 = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var7 = c2.b0.f22601a;
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB6 = d92.c.b(j92.f.f97932i, o0VarE);
                    bVar.getClass();
                    o0Var = o0VarE;
                    mh.c(str, c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB6, o0Var, 6, 0, 131068);
                    boolean z217 = z25;
                    c2.v.a(c2.x2.f(aVar, 1.0f), null, false, z3.f.c(961877115, new ho.e(z217, j14, str2, b0Var, p1Var2, list, lVar2), o0VarE), o0VarE, 3078, 6);
                    boolean z218 = z24;
                    String str15 = str9;
                    c(str15, dVar2, str6, z218, o0VarE, (i36 >> 12) & 8190);
                    o0VarE.g0(true);
                    z18 = z218;
                    dVar3 = dVar2;
                    z19 = z217;
                    rVar2 = rVar4;
                    str7 = str15;
                } else {
                    o0VarE.e();
                    rVar2 = rVar;
                    lVar3 = lVar;
                    o0Var = o0VarE;
                    str7 = str5;
                    dVar3 = dVar2;
                    z18 = z16;
                    z19 = z15;
                }
                str8 = str6;
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new i3.t1(rVar2, str, list, str2, str7, dVar3, str8, z18, z19, lVar3, lVar2, i14, i15);
                }
            }
            i28 |= 100663296;
            i34 = i15 & 512;
            if (i34 != 0) {
                i28 |= C.ENCODING_PCM_32BIT;
            } else if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(lVar)) {
                    i35 = 536870912;
                } else {
                    i35 = 268435456;
                }
                i28 |= i35;
            }
            i36 = i28;
            if ((i36 & 306783379) == 306783378) {
                z17 = false;
            } else {
                z17 = true;
            }
            if (o0VarE.n(i36 & 1, z17)) {
                if (i37 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar;
                }
                if (i39 != 0) {
                    str9 = null;
                } else {
                    str9 = str5;
                }
                if (i17 != 0) {
                    dVar2 = null;
                }
                if (i24 != 0) {
                    str6 = null;
                }
                if (i26 != 0) {
                    z24 = true;
                } else {
                    z24 = z16;
                }
                if (i29 != 0) {
                    z25 = true;
                } else {
                    z25 = z15;
                }
                if (i34 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar;
                }
                p3.x1 x1Var4 = p3.n.f135158a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p3.p0.n(Boolean.FALSE);
                    o0VarE.K(objQ);
                }
                p1Var = (p3.p1) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = kg.f.j(o0VarE);
                }
                b0Var = (m4.b0) objQ2;
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = p3.p0.n(Boolean.FALSE);
                    o0VarE.K(objQ3);
                }
                p1Var2 = (p3.p1) objQ3;
                if (z24) {
                    o0VarE.C(-79319690);
                    d92.b.f58623a.getClass();
                    jA = d92.b.a(o0VarE).j().g();
                    o0VarE.g0(false);
                } else {
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        o0VarE.C(-79317996);
                        d92.b.f58623a.getClass();
                        p1Var2 = p1Var2;
                        j8 = ((o4.d0) d92.b.a(o0VarE).g().b().f82540c.getF182175a()).f128833a;
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-79316522);
                        d92.b.f58623a.getClass();
                        jA = d92.b.a(o0VarE).g().b().a();
                        o0VarE.g0(false);
                    }
                    aVar = h4.r.S;
                    j14 = j8;
                    h4.r rVarF7 = c2.x2.f(aVar, 1.0f);
                    d92.b.f58623a.getClass();
                    bVar = d92.b.f58625c;
                    bVar.getClass();
                    eVar = j92.b.f97899b;
                    h4.r rVarA7 = m4.e.a(c2.l.y(rVarF7, eVar.f97920e).then(rVar3), b0Var);
                    rVar4 = rVar3;
                    if ((i36 & 1879048192) == 536870912) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    objQ4 = o0VarE.q();
                    if (z26) {
                        objQ4 = new a11.b0(lVar3, p1Var, 19);
                        o0VarE.K(objQ4);
                    } else {
                        objQ4 = new a11.b0(lVar3, p1Var, 19);
                        o0VarE.K(objQ4);
                    }
                    h4.r rVarThen7 = m4.e.b(rVarA7, (e23.l) objQ4).then(m4.j0.a.f116489a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar7 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = c2.y.a(kVar7, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarThen7, o0VarE);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
                        p3.p0.l();
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
                    bVar2 = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var8 = c2.b0.f22601a;
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB7 = d92.c.b(j92.f.f97932i, o0VarE);
                    bVar.getClass();
                    o0Var = o0VarE;
                    mh.c(str, c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB7, o0Var, 6, 0, 131068);
                    boolean z219 = z25;
                    c2.v.a(c2.x2.f(aVar, 1.0f), null, false, z3.f.c(961877115, new ho.e(z219, j14, str2, b0Var, p1Var2, list, lVar2), o0VarE), o0VarE, 3078, 6);
                    boolean z2110 = z24;
                    String str16 = str9;
                    c(str16, dVar2, str6, z2110, o0VarE, (i36 >> 12) & 8190);
                    o0VarE.g0(true);
                    z18 = z2110;
                    dVar3 = dVar2;
                    z19 = z219;
                    rVar2 = rVar4;
                    str7 = str16;
                }
                j8 = jA;
                aVar = h4.r.S;
                j14 = j8;
                h4.r rVarF8 = c2.x2.f(aVar, 1.0f);
                d92.b.f58623a.getClass();
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar = j92.b.f97899b;
                h4.r rVarA8 = m4.e.a(c2.l.y(rVarF8, eVar.f97920e).then(rVar3), b0Var);
                rVar4 = rVar3;
                if ((i36 & 1879048192) == 536870912) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                objQ4 = o0VarE.q();
                if (z26) {
                    objQ4 = new a11.b0(lVar3, p1Var, 19);
                    o0VarE.K(objQ4);
                } else {
                    objQ4 = new a11.b0(lVar3, p1Var, 19);
                    o0VarE.K(objQ4);
                }
                h4.r rVarThen8 = m4.e.b(rVarA8, (e23.l) objQ4).then(m4.j0.a.f116489a);
                c2.j.f22691a.getClass();
                c2.j.k kVar8 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar8, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarThen8, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
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
                bVar2 = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var9 = c2.b0.f22601a;
                d92.b.f58624b.getClass();
                s5.x0 x0VarB8 = d92.c.b(j92.f.f97932i, o0VarE);
                bVar.getClass();
                o0Var = o0VarE;
                mh.c(str, c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB8, o0Var, 6, 0, 131068);
                boolean z2111 = z25;
                c2.v.a(c2.x2.f(aVar, 1.0f), null, false, z3.f.c(961877115, new ho.e(z2111, j14, str2, b0Var, p1Var2, list, lVar2), o0VarE), o0VarE, 3078, 6);
                boolean z2112 = z24;
                String str17 = str9;
                c(str17, dVar2, str6, z2112, o0VarE, (i36 >> 12) & 8190);
                o0VarE.g0(true);
                z18 = z2112;
                dVar3 = dVar2;
                z19 = z2111;
                rVar2 = rVar4;
                str7 = str17;
            } else {
                o0VarE.e();
                rVar2 = rVar;
                lVar3 = lVar;
                o0Var = o0VarE;
                str7 = str5;
                dVar3 = dVar2;
                z18 = z16;
                z19 = z15;
            }
            str8 = str6;
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new i3.t1(rVar2, str, list, str2, str7, dVar3, str8, z18, z19, lVar3, lVar2, i14, i15);
            }
        }
        i38 |= 24576;
        str5 = str3;
        i17 = i15 & 32;
        if (i17 != 0) {
            i19 = i38 | 196608;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            if (o0VarE.B(dVar2)) {
                i18 = 131072;
            } else {
                i18 = 65536;
            }
            i19 = i38 | i18;
        }
        i24 = i15 & 64;
        if (i24 != 0) {
            if ((1572864 & i14) == 0) {
                str6 = str4;
                if (o0VarE.B(str6)) {
                    i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i25 = 524288;
                }
                i19 |= i25;
            }
            i26 = i15 & 128;
            if (i26 != 0) {
                i28 = i19 | 12582912;
                z16 = z14;
            } else {
                z16 = z14;
                if (o0VarE.h(z16)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i28 = i19 | i27;
            }
            i29 = i15 & 256;
            if (i29 != 0) {
                if ((i14 & 100663296) == 0) {
                    if (o0VarE.h(z15)) {
                        i30 = 67108864;
                    } else {
                        i30 = 33554432;
                    }
                    i28 |= i30;
                }
                i34 = i15 & 512;
                if (i34 != 0) {
                    i28 |= C.ENCODING_PCM_32BIT;
                } else if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(lVar)) {
                        i35 = 536870912;
                    } else {
                        i35 = 268435456;
                    }
                    i28 |= i35;
                }
                i36 = i28;
                if ((i36 & 306783379) == 306783378) {
                    z17 = false;
                } else {
                    z17 = true;
                }
                if (o0VarE.n(i36 & 1, z17)) {
                    if (i37 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i39 != 0) {
                        str9 = null;
                    } else {
                        str9 = str5;
                    }
                    if (i17 != 0) {
                        dVar2 = null;
                    }
                    if (i24 != 0) {
                        str6 = null;
                    }
                    if (i26 != 0) {
                        z24 = true;
                    } else {
                        z24 = z16;
                    }
                    if (i29 != 0) {
                        z25 = true;
                    } else {
                        z25 = z15;
                    }
                    if (i34 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    p3.x1 x1Var5 = p3.n.f135158a;
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = p3.p0.n(Boolean.FALSE);
                        o0VarE.K(objQ);
                    }
                    p1Var = (p3.p1) objQ;
                    objQ2 = o0VarE.q();
                    if (objQ2 == c2565a) {
                        objQ2 = kg.f.j(o0VarE);
                    }
                    b0Var = (m4.b0) objQ2;
                    objQ3 = o0VarE.q();
                    if (objQ3 == c2565a) {
                        objQ3 = p3.p0.n(Boolean.FALSE);
                        o0VarE.K(objQ3);
                    }
                    p1Var2 = (p3.p1) objQ3;
                    if (z24) {
                        o0VarE.C(-79319690);
                        d92.b.f58623a.getClass();
                        jA = d92.b.a(o0VarE).j().g();
                        o0VarE.g0(false);
                    } else {
                        if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                            o0VarE.C(-79317996);
                            d92.b.f58623a.getClass();
                            p1Var2 = p1Var2;
                            j8 = ((o4.d0) d92.b.a(o0VarE).g().b().f82540c.getF182175a()).f128833a;
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(-79316522);
                            d92.b.f58623a.getClass();
                            jA = d92.b.a(o0VarE).g().b().a();
                            o0VarE.g0(false);
                        }
                        aVar = h4.r.S;
                        j14 = j8;
                        h4.r rVarF9 = c2.x2.f(aVar, 1.0f);
                        d92.b.f58623a.getClass();
                        bVar = d92.b.f58625c;
                        bVar.getClass();
                        eVar = j92.b.f97899b;
                        h4.r rVarA9 = m4.e.a(c2.l.y(rVarF9, eVar.f97920e).then(rVar3), b0Var);
                        rVar4 = rVar3;
                        if ((i36 & 1879048192) == 536870912) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        objQ4 = o0VarE.q();
                        if (z26) {
                            objQ4 = new a11.b0(lVar3, p1Var, 19);
                            o0VarE.K(objQ4);
                        } else {
                            objQ4 = new a11.b0(lVar3, p1Var, 19);
                            o0VarE.K(objQ4);
                        }
                        h4.r rVarThen9 = m4.e.b(rVarA9, (e23.l) objQ4).then(m4.j0.a.f116489a);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar9 = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        zVarA = c2.y.a(kVar9, h4.d.a.f81536n, o0VarE, 0);
                        iHashCode = Long.hashCode(o0VarE.U);
                        i2VarA0 = o0VarE.a0();
                        rVarC = h4.k.c(rVarThen9, o0VarE);
                        h5.g.V.getClass();
                        aVar2 = h5.g.a.f81805b;
                        if (o0VarE.f135177b != null) {
                            p3.p0.l();
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
                        bVar2 = h5.g.a.f81813j;
                        if (o0VarE.T) {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                        } else {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                        c2.b0 b0Var10 = c2.b0.f22601a;
                        d92.b.f58624b.getClass();
                        s5.x0 x0VarB9 = d92.c.b(j92.f.f97932i, o0VarE);
                        bVar.getClass();
                        o0Var = o0VarE;
                        mh.c(str, c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB9, o0Var, 6, 0, 131068);
                        boolean z2113 = z25;
                        c2.v.a(c2.x2.f(aVar, 1.0f), null, false, z3.f.c(961877115, new ho.e(z2113, j14, str2, b0Var, p1Var2, list, lVar2), o0VarE), o0VarE, 3078, 6);
                        boolean z2114 = z24;
                        String str18 = str9;
                        c(str18, dVar2, str6, z2114, o0VarE, (i36 >> 12) & 8190);
                        o0VarE.g0(true);
                        z18 = z2114;
                        dVar3 = dVar2;
                        z19 = z2113;
                        rVar2 = rVar4;
                        str7 = str18;
                    }
                    j8 = jA;
                    aVar = h4.r.S;
                    j14 = j8;
                    h4.r rVarF10 = c2.x2.f(aVar, 1.0f);
                    d92.b.f58623a.getClass();
                    bVar = d92.b.f58625c;
                    bVar.getClass();
                    eVar = j92.b.f97899b;
                    h4.r rVarA10 = m4.e.a(c2.l.y(rVarF10, eVar.f97920e).then(rVar3), b0Var);
                    rVar4 = rVar3;
                    if ((i36 & 1879048192) == 536870912) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    objQ4 = o0VarE.q();
                    if (z26) {
                        objQ4 = new a11.b0(lVar3, p1Var, 19);
                        o0VarE.K(objQ4);
                    } else {
                        objQ4 = new a11.b0(lVar3, p1Var, 19);
                        o0VarE.K(objQ4);
                    }
                    h4.r rVarThen10 = m4.e.b(rVarA10, (e23.l) objQ4).then(m4.j0.a.f116489a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar10 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = c2.y.a(kVar10, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarThen10, o0VarE);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
                        p3.p0.l();
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
                    bVar2 = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var11 = c2.b0.f22601a;
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB10 = d92.c.b(j92.f.f97932i, o0VarE);
                    bVar.getClass();
                    o0Var = o0VarE;
                    mh.c(str, c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB10, o0Var, 6, 0, 131068);
                    boolean z2115 = z25;
                    c2.v.a(c2.x2.f(aVar, 1.0f), null, false, z3.f.c(961877115, new ho.e(z2115, j14, str2, b0Var, p1Var2, list, lVar2), o0VarE), o0VarE, 3078, 6);
                    boolean z2116 = z24;
                    String str19 = str9;
                    c(str19, dVar2, str6, z2116, o0VarE, (i36 >> 12) & 8190);
                    o0VarE.g0(true);
                    z18 = z2116;
                    dVar3 = dVar2;
                    z19 = z2115;
                    rVar2 = rVar4;
                    str7 = str19;
                } else {
                    o0VarE.e();
                    rVar2 = rVar;
                    lVar3 = lVar;
                    o0Var = o0VarE;
                    str7 = str5;
                    dVar3 = dVar2;
                    z18 = z16;
                    z19 = z15;
                }
                str8 = str6;
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new i3.t1(rVar2, str, list, str2, str7, dVar3, str8, z18, z19, lVar3, lVar2, i14, i15);
                }
            }
            i28 |= 100663296;
            i34 = i15 & 512;
            if (i34 != 0) {
                i28 |= C.ENCODING_PCM_32BIT;
            } else if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(lVar)) {
                    i35 = 536870912;
                } else {
                    i35 = 268435456;
                }
                i28 |= i35;
            }
            i36 = i28;
            if ((i36 & 306783379) == 306783378) {
                z17 = false;
            } else {
                z17 = true;
            }
            if (o0VarE.n(i36 & 1, z17)) {
                if (i37 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar;
                }
                if (i39 != 0) {
                    str9 = null;
                } else {
                    str9 = str5;
                }
                if (i17 != 0) {
                    dVar2 = null;
                }
                if (i24 != 0) {
                    str6 = null;
                }
                if (i26 != 0) {
                    z24 = true;
                } else {
                    z24 = z16;
                }
                if (i29 != 0) {
                    z25 = true;
                } else {
                    z25 = z15;
                }
                if (i34 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar;
                }
                p3.x1 x1Var6 = p3.n.f135158a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p3.p0.n(Boolean.FALSE);
                    o0VarE.K(objQ);
                }
                p1Var = (p3.p1) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = kg.f.j(o0VarE);
                }
                b0Var = (m4.b0) objQ2;
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = p3.p0.n(Boolean.FALSE);
                    o0VarE.K(objQ3);
                }
                p1Var2 = (p3.p1) objQ3;
                if (z24) {
                    o0VarE.C(-79319690);
                    d92.b.f58623a.getClass();
                    jA = d92.b.a(o0VarE).j().g();
                    o0VarE.g0(false);
                } else {
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        o0VarE.C(-79317996);
                        d92.b.f58623a.getClass();
                        p1Var2 = p1Var2;
                        j8 = ((o4.d0) d92.b.a(o0VarE).g().b().f82540c.getF182175a()).f128833a;
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-79316522);
                        d92.b.f58623a.getClass();
                        jA = d92.b.a(o0VarE).g().b().a();
                        o0VarE.g0(false);
                    }
                    aVar = h4.r.S;
                    j14 = j8;
                    h4.r rVarF11 = c2.x2.f(aVar, 1.0f);
                    d92.b.f58623a.getClass();
                    bVar = d92.b.f58625c;
                    bVar.getClass();
                    eVar = j92.b.f97899b;
                    h4.r rVarA11 = m4.e.a(c2.l.y(rVarF11, eVar.f97920e).then(rVar3), b0Var);
                    rVar4 = rVar3;
                    if ((i36 & 1879048192) == 536870912) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    objQ4 = o0VarE.q();
                    if (z26) {
                        objQ4 = new a11.b0(lVar3, p1Var, 19);
                        o0VarE.K(objQ4);
                    } else {
                        objQ4 = new a11.b0(lVar3, p1Var, 19);
                        o0VarE.K(objQ4);
                    }
                    h4.r rVarThen11 = m4.e.b(rVarA11, (e23.l) objQ4).then(m4.j0.a.f116489a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar11 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = c2.y.a(kVar11, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarThen11, o0VarE);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
                        p3.p0.l();
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
                    bVar2 = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var12 = c2.b0.f22601a;
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB11 = d92.c.b(j92.f.f97932i, o0VarE);
                    bVar.getClass();
                    o0Var = o0VarE;
                    mh.c(str, c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB11, o0Var, 6, 0, 131068);
                    boolean z2117 = z25;
                    c2.v.a(c2.x2.f(aVar, 1.0f), null, false, z3.f.c(961877115, new ho.e(z2117, j14, str2, b0Var, p1Var2, list, lVar2), o0VarE), o0VarE, 3078, 6);
                    boolean z2118 = z24;
                    String str110 = str9;
                    c(str110, dVar2, str6, z2118, o0VarE, (i36 >> 12) & 8190);
                    o0VarE.g0(true);
                    z18 = z2118;
                    dVar3 = dVar2;
                    z19 = z2117;
                    rVar2 = rVar4;
                    str7 = str110;
                }
                j8 = jA;
                aVar = h4.r.S;
                j14 = j8;
                h4.r rVarF12 = c2.x2.f(aVar, 1.0f);
                d92.b.f58623a.getClass();
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar = j92.b.f97899b;
                h4.r rVarA12 = m4.e.a(c2.l.y(rVarF12, eVar.f97920e).then(rVar3), b0Var);
                rVar4 = rVar3;
                if ((i36 & 1879048192) == 536870912) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                objQ4 = o0VarE.q();
                if (z26) {
                    objQ4 = new a11.b0(lVar3, p1Var, 19);
                    o0VarE.K(objQ4);
                } else {
                    objQ4 = new a11.b0(lVar3, p1Var, 19);
                    o0VarE.K(objQ4);
                }
                h4.r rVarThen12 = m4.e.b(rVarA12, (e23.l) objQ4).then(m4.j0.a.f116489a);
                c2.j.f22691a.getClass();
                c2.j.k kVar12 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar12, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarThen12, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
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
                bVar2 = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var13 = c2.b0.f22601a;
                d92.b.f58624b.getClass();
                s5.x0 x0VarB12 = d92.c.b(j92.f.f97932i, o0VarE);
                bVar.getClass();
                o0Var = o0VarE;
                mh.c(str, c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB12, o0Var, 6, 0, 131068);
                boolean z2119 = z25;
                c2.v.a(c2.x2.f(aVar, 1.0f), null, false, z3.f.c(961877115, new ho.e(z2119, j14, str2, b0Var, p1Var2, list, lVar2), o0VarE), o0VarE, 3078, 6);
                boolean z21110 = z24;
                String str111 = str9;
                c(str111, dVar2, str6, z21110, o0VarE, (i36 >> 12) & 8190);
                o0VarE.g0(true);
                z18 = z21110;
                dVar3 = dVar2;
                z19 = z2119;
                rVar2 = rVar4;
                str7 = str111;
            } else {
                o0VarE.e();
                rVar2 = rVar;
                lVar3 = lVar;
                o0Var = o0VarE;
                str7 = str5;
                dVar3 = dVar2;
                z18 = z16;
                z19 = z15;
            }
            str8 = str6;
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new i3.t1(rVar2, str, list, str2, str7, dVar3, str8, z18, z19, lVar3, lVar2, i14, i15);
            }
        }
        i19 |= 1572864;
        str6 = str4;
        i26 = i15 & 128;
        if (i26 != 0) {
            i28 = i19 | 12582912;
            z16 = z14;
        } else {
            z16 = z14;
            if (o0VarE.h(z16)) {
                i27 = 8388608;
            } else {
                i27 = 4194304;
            }
            i28 = i19 | i27;
        }
        i29 = i15 & 256;
        if (i29 != 0) {
            if ((i14 & 100663296) == 0) {
                if (o0VarE.h(z15)) {
                    i30 = 67108864;
                } else {
                    i30 = 33554432;
                }
                i28 |= i30;
            }
            i34 = i15 & 512;
            if (i34 != 0) {
                i28 |= C.ENCODING_PCM_32BIT;
            } else if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(lVar)) {
                    i35 = 536870912;
                } else {
                    i35 = 268435456;
                }
                i28 |= i35;
            }
            i36 = i28;
            if ((i36 & 306783379) == 306783378) {
                z17 = false;
            } else {
                z17 = true;
            }
            if (o0VarE.n(i36 & 1, z17)) {
                if (i37 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar;
                }
                if (i39 != 0) {
                    str9 = null;
                } else {
                    str9 = str5;
                }
                if (i17 != 0) {
                    dVar2 = null;
                }
                if (i24 != 0) {
                    str6 = null;
                }
                if (i26 != 0) {
                    z24 = true;
                } else {
                    z24 = z16;
                }
                if (i29 != 0) {
                    z25 = true;
                } else {
                    z25 = z15;
                }
                if (i34 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar;
                }
                p3.x1 x1Var7 = p3.n.f135158a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p3.p0.n(Boolean.FALSE);
                    o0VarE.K(objQ);
                }
                p1Var = (p3.p1) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = kg.f.j(o0VarE);
                }
                b0Var = (m4.b0) objQ2;
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = p3.p0.n(Boolean.FALSE);
                    o0VarE.K(objQ3);
                }
                p1Var2 = (p3.p1) objQ3;
                if (z24) {
                    o0VarE.C(-79319690);
                    d92.b.f58623a.getClass();
                    jA = d92.b.a(o0VarE).j().g();
                    o0VarE.g0(false);
                } else {
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        o0VarE.C(-79317996);
                        d92.b.f58623a.getClass();
                        p1Var2 = p1Var2;
                        j8 = ((o4.d0) d92.b.a(o0VarE).g().b().f82540c.getF182175a()).f128833a;
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-79316522);
                        d92.b.f58623a.getClass();
                        jA = d92.b.a(o0VarE).g().b().a();
                        o0VarE.g0(false);
                    }
                    aVar = h4.r.S;
                    j14 = j8;
                    h4.r rVarF13 = c2.x2.f(aVar, 1.0f);
                    d92.b.f58623a.getClass();
                    bVar = d92.b.f58625c;
                    bVar.getClass();
                    eVar = j92.b.f97899b;
                    h4.r rVarA13 = m4.e.a(c2.l.y(rVarF13, eVar.f97920e).then(rVar3), b0Var);
                    rVar4 = rVar3;
                    if ((i36 & 1879048192) == 536870912) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    objQ4 = o0VarE.q();
                    if (z26) {
                        objQ4 = new a11.b0(lVar3, p1Var, 19);
                        o0VarE.K(objQ4);
                    } else {
                        objQ4 = new a11.b0(lVar3, p1Var, 19);
                        o0VarE.K(objQ4);
                    }
                    h4.r rVarThen13 = m4.e.b(rVarA13, (e23.l) objQ4).then(m4.j0.a.f116489a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar13 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = c2.y.a(kVar13, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarThen13, o0VarE);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
                        p3.p0.l();
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
                    bVar2 = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var14 = c2.b0.f22601a;
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarB13 = d92.c.b(j92.f.f97932i, o0VarE);
                    bVar.getClass();
                    o0Var = o0VarE;
                    mh.c(str, c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB13, o0Var, 6, 0, 131068);
                    boolean z21111 = z25;
                    c2.v.a(c2.x2.f(aVar, 1.0f), null, false, z3.f.c(961877115, new ho.e(z21111, j14, str2, b0Var, p1Var2, list, lVar2), o0VarE), o0VarE, 3078, 6);
                    boolean z21112 = z24;
                    String str112 = str9;
                    c(str112, dVar2, str6, z21112, o0VarE, (i36 >> 12) & 8190);
                    o0VarE.g0(true);
                    z18 = z21112;
                    dVar3 = dVar2;
                    z19 = z21111;
                    rVar2 = rVar4;
                    str7 = str112;
                }
                j8 = jA;
                aVar = h4.r.S;
                j14 = j8;
                h4.r rVarF14 = c2.x2.f(aVar, 1.0f);
                d92.b.f58623a.getClass();
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar = j92.b.f97899b;
                h4.r rVarA14 = m4.e.a(c2.l.y(rVarF14, eVar.f97920e).then(rVar3), b0Var);
                rVar4 = rVar3;
                if ((i36 & 1879048192) == 536870912) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                objQ4 = o0VarE.q();
                if (z26) {
                    objQ4 = new a11.b0(lVar3, p1Var, 19);
                    o0VarE.K(objQ4);
                } else {
                    objQ4 = new a11.b0(lVar3, p1Var, 19);
                    o0VarE.K(objQ4);
                }
                h4.r rVarThen14 = m4.e.b(rVarA14, (e23.l) objQ4).then(m4.j0.a.f116489a);
                c2.j.f22691a.getClass();
                c2.j.k kVar14 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar14, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarThen14, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
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
                bVar2 = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var15 = c2.b0.f22601a;
                d92.b.f58624b.getClass();
                s5.x0 x0VarB14 = d92.c.b(j92.f.f97932i, o0VarE);
                bVar.getClass();
                o0Var = o0VarE;
                mh.c(str, c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB14, o0Var, 6, 0, 131068);
                boolean z21113 = z25;
                c2.v.a(c2.x2.f(aVar, 1.0f), null, false, z3.f.c(961877115, new ho.e(z21113, j14, str2, b0Var, p1Var2, list, lVar2), o0VarE), o0VarE, 3078, 6);
                boolean z21114 = z24;
                String str113 = str9;
                c(str113, dVar2, str6, z21114, o0VarE, (i36 >> 12) & 8190);
                o0VarE.g0(true);
                z18 = z21114;
                dVar3 = dVar2;
                z19 = z21113;
                rVar2 = rVar4;
                str7 = str113;
            } else {
                o0VarE.e();
                rVar2 = rVar;
                lVar3 = lVar;
                o0Var = o0VarE;
                str7 = str5;
                dVar3 = dVar2;
                z18 = z16;
                z19 = z15;
            }
            str8 = str6;
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new i3.t1(rVar2, str, list, str2, str7, dVar3, str8, z18, z19, lVar3, lVar2, i14, i15);
            }
        }
        i28 |= 100663296;
        i34 = i15 & 512;
        if (i34 != 0) {
            i28 |= C.ENCODING_PCM_32BIT;
        } else if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            if (o0VarE.r(lVar)) {
                i35 = 536870912;
            } else {
                i35 = 268435456;
            }
            i28 |= i35;
        }
        i36 = i28;
        if ((i36 & 306783379) == 306783378) {
            z17 = false;
        } else {
            z17 = true;
        }
        if (o0VarE.n(i36 & 1, z17)) {
            if (i37 != 0) {
                rVar3 = h4.r.S;
            } else {
                rVar3 = rVar;
            }
            if (i39 != 0) {
                str9 = null;
            } else {
                str9 = str5;
            }
            if (i17 != 0) {
                dVar2 = null;
            }
            if (i24 != 0) {
                str6 = null;
            }
            if (i26 != 0) {
                z24 = true;
            } else {
                z24 = z16;
            }
            if (i29 != 0) {
                z25 = true;
            } else {
                z25 = z15;
            }
            if (i34 != 0) {
                lVar3 = null;
            } else {
                lVar3 = lVar;
            }
            p3.x1 x1Var8 = p3.n.f135158a;
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1Var = (p3.p1) objQ;
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = kg.f.j(o0VarE);
            }
            b0Var = (m4.b0) objQ2;
            objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1Var2 = (p3.p1) objQ3;
            if (z24) {
                o0VarE.C(-79319690);
                d92.b.f58623a.getClass();
                jA = d92.b.a(o0VarE).j().g();
                o0VarE.g0(false);
            } else {
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    o0VarE.C(-79317996);
                    d92.b.f58623a.getClass();
                    p1Var2 = p1Var2;
                    j8 = ((o4.d0) d92.b.a(o0VarE).g().b().f82540c.getF182175a()).f128833a;
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-79316522);
                    d92.b.f58623a.getClass();
                    jA = d92.b.a(o0VarE).g().b().a();
                    o0VarE.g0(false);
                }
                aVar = h4.r.S;
                j14 = j8;
                h4.r rVarF15 = c2.x2.f(aVar, 1.0f);
                d92.b.f58623a.getClass();
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar = j92.b.f97899b;
                h4.r rVarA15 = m4.e.a(c2.l.y(rVarF15, eVar.f97920e).then(rVar3), b0Var);
                rVar4 = rVar3;
                if ((i36 & 1879048192) == 536870912) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                objQ4 = o0VarE.q();
                if (z26) {
                    objQ4 = new a11.b0(lVar3, p1Var, 19);
                    o0VarE.K(objQ4);
                } else {
                    objQ4 = new a11.b0(lVar3, p1Var, 19);
                    o0VarE.K(objQ4);
                }
                h4.r rVarThen15 = m4.e.b(rVarA15, (e23.l) objQ4).then(m4.j0.a.f116489a);
                c2.j.f22691a.getClass();
                c2.j.k kVar15 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar15, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarThen15, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
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
                bVar2 = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var16 = c2.b0.f22601a;
                d92.b.f58624b.getClass();
                s5.x0 x0VarB15 = d92.c.b(j92.f.f97932i, o0VarE);
                bVar.getClass();
                o0Var = o0VarE;
                mh.c(str, c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB15, o0Var, 6, 0, 131068);
                boolean z21115 = z25;
                c2.v.a(c2.x2.f(aVar, 1.0f), null, false, z3.f.c(961877115, new ho.e(z21115, j14, str2, b0Var, p1Var2, list, lVar2), o0VarE), o0VarE, 3078, 6);
                boolean z21116 = z24;
                String str114 = str9;
                c(str114, dVar2, str6, z21116, o0VarE, (i36 >> 12) & 8190);
                o0VarE.g0(true);
                z18 = z21116;
                dVar3 = dVar2;
                z19 = z21115;
                rVar2 = rVar4;
                str7 = str114;
            }
            j8 = jA;
            aVar = h4.r.S;
            j14 = j8;
            h4.r rVarF16 = c2.x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            bVar = d92.b.f58625c;
            bVar.getClass();
            eVar = j92.b.f97899b;
            h4.r rVarA16 = m4.e.a(c2.l.y(rVarF16, eVar.f97920e).then(rVar3), b0Var);
            rVar4 = rVar3;
            if ((i36 & 1879048192) == 536870912) {
                z26 = true;
            } else {
                z26 = false;
            }
            objQ4 = o0VarE.q();
            if (z26) {
                objQ4 = new a11.b0(lVar3, p1Var, 19);
                o0VarE.K(objQ4);
            } else {
                objQ4 = new a11.b0(lVar3, p1Var, 19);
                o0VarE.K(objQ4);
            }
            h4.r rVarThen16 = m4.e.b(rVarA16, (e23.l) objQ4).then(m4.j0.a.f116489a);
            c2.j.f22691a.getClass();
            c2.j.k kVar16 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = c2.y.a(kVar16, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarThen16, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p3.p0.l();
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
            bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var17 = c2.b0.f22601a;
            d92.b.f58624b.getClass();
            s5.x0 x0VarB16 = d92.c.b(j92.f.f97932i, o0VarE);
            bVar.getClass();
            o0Var = o0VarE;
            mh.c(str, c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB16, o0Var, 6, 0, 131068);
            boolean z21117 = z25;
            c2.v.a(c2.x2.f(aVar, 1.0f), null, false, z3.f.c(961877115, new ho.e(z21117, j14, str2, b0Var, p1Var2, list, lVar2), o0VarE), o0VarE, 3078, 6);
            boolean z21118 = z24;
            String str115 = str9;
            c(str115, dVar2, str6, z21118, o0VarE, (i36 >> 12) & 8190);
            o0VarE.g0(true);
            z18 = z21118;
            dVar3 = dVar2;
            z19 = z21117;
            rVar2 = rVar4;
            str7 = str115;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            lVar3 = lVar;
            o0Var = o0VarE;
            str7 = str5;
            dVar3 = dVar2;
            z18 = z16;
            z19 = z15;
        }
        str8 = str6;
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i3.t1(rVar2, str, list, str2, str7, dVar3, str8, z18, z19, lVar3, lVar2, i14, i15);
        }
    }

    public static final void c(final String str, final u4.d dVar, final String str2, final boolean z14, p3.m mVar, final int i14) {
        int i15;
        p3.o0 o0Var;
        p3.p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        p3.o0 o0Var2;
        p3.o0 o0VarE = mVar.E(-659053662);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (str == null && str2 == null) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i16 = 0;
                pVar = new e23.p() { // from class: l72.f1
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i16) {
                            case 0:
                                ((Integer) obj2).getClass();
                                g1.c(str, dVar, str2, z14, (p3.m) obj, p3.p0.t(i14 | 1));
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                g1.c(str, dVar, str2, z14, (p3.m) obj, p3.p0.t(i14 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                String str3 = z14 ? str : str2;
                if (str3 == null) {
                    o0VarE.C(-1571795175);
                    o0VarE.g0(false);
                    o0Var = o0VarE;
                } else {
                    o0VarE.C(-1571795174);
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58623a.getClass();
                    j92.b bVar = d92.b.f58625c;
                    bVar.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarO = c2.l.o(c2.l.C(aVar, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), c2.q1.Min);
                    c2.j.f22691a.getClass();
                    c2.j.C0343j c0343j = c2.j.f22692b;
                    h4.d.f81522a.getClass();
                    c2.s2 s2VarA = c2.q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
                    int iHashCode = Long.hashCode(o0VarE.U);
                    p3.i2 i2VarA0 = o0VarE.a0();
                    h4.r rVarC = h4.k.c(rVarO, o0VarE);
                    h5.g.V.getClass();
                    h5.e0.a aVar2 = h5.g.a.f81805b;
                    if (o0VarE.f135177b == null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.u2 u2Var = c2.u2.f22900a;
                    if (dVar == null || z14) {
                        o0Var2 = o0VarE;
                        o0Var2.C(-513919138);
                        o0Var2.g0(false);
                    } else {
                        o0VarE.C(-514300655);
                        bVar.getClass();
                        h4.r rVarQ = c2.x2.q(aVar, j92.b.f97901d.f97903b);
                        bVar.getClass();
                        o0Var2 = o0VarE;
                        u1.y0.b(dVar, null, c2.l.C(rVarQ, 0.0f, 0.0f, eVar.f97917b, 0.0f, 11), o4.e0.a.a(o4.e0.f128843b, d92.b.a(o0VarE).f().f()), o0Var2, ((i15 >> 3) & 14) | 48, 56);
                        o0Var2.g0(false);
                    }
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarF = d92.c.f(j92.f.f97933j, o0Var2);
                    h4.r rVarF = c2.x2.f(c2.x2.c(aVar, 1.0f), 1.0f);
                    d6.h.f57752b.getClass();
                    p3.o0 o0Var3 = o0Var2;
                    mh.c(str3, rVarF, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57757g), 0L, 0, false, 0, 0, null, x0VarF, o0Var3, 48, 0, 130044);
                    o0Var = o0Var3;
                    o0Var.g0(true);
                    o0Var.g0(false);
                }
            }
            p2VarI0.f135219d = pVar;
        }
        o0Var = o0VarE;
        o0Var.e();
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final int i17 = 1;
            pVar = new e23.p() { // from class: l72.f1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (i17) {
                        case 0:
                            ((Integer) obj2).getClass();
                            g1.c(str, dVar, str2, z14, (p3.m) obj, p3.p0.t(i14 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            g1.c(str, dVar, str2, z14, (p3.m) obj, p3.p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
