package da0;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import cw1.p0;
import i3.mh;
import o4.m1;
import o4.r1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f58858a;

    static {
        d92.b.f58623a.getClass();
        d92.b.f58625c.getClass();
        f58858a = j92.b.f97899b.f97918c;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0227  */
    /* JADX WARN: Code duplicated, block: B:102:0x023c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0241  */
    /* JADX WARN: Code duplicated, block: B:107:0x024e  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00df  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:78:0x0112  */
    /* JADX WARN: Code duplicated, block: B:79:0x0114  */
    /* JADX WARN: Code duplicated, block: B:82:0x011b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0124  */
    /* JADX WARN: Code duplicated, block: B:87:0x0184  */
    /* JADX WARN: Code duplicated, block: B:89:0x018b  */
    /* JADX WARN: Code duplicated, block: B:90:0x018f  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:98:0x0210  */
    public static final void a(String str, boolean z14, String str2, h4.r rVar, r1 r1Var, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        String str3;
        int i16;
        h4.r rVar2;
        int i17;
        r1 r1Var2;
        int i18;
        boolean z15;
        o0 o0Var;
        String str4;
        h4.r rVar3;
        r1 r1Var3;
        p2 p2VarI0;
        h4.r rVar4;
        r1 r1Var4;
        h4.r.a aVar2;
        long jB;
        boolean z16;
        Object objQ;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar3;
        String str5;
        h5.g.a.b bVar;
        int i19;
        o0 o0VarL = vb.h.l(21171979, aVar, str2, mVar);
        int i24 = i15 & 1;
        if (i24 != 0) {
            i16 = i14 | 6;
            str3 = str;
        } else if ((i14 & 6) == 0) {
            str3 = str;
            i16 = (o0VarL.B(str3) ? 4 : 2) | i14;
        } else {
            str3 = str;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarL.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarL.B(str2) ? 256 : 128;
        }
        int i25 = i15 & 8;
        if (i25 == 0) {
            if ((i14 & 3072) == 0) {
                rVar2 = rVar;
                i16 |= o0VarL.B(rVar2) ? 2048 : 1024;
            }
            i17 = i15 & 16;
            if (i17 != 0) {
                if ((i14 & 24576) == 0) {
                    r1Var2 = r1Var;
                    if (o0VarL.B(r1Var2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i16 |= i18;
                }
                if ((196608 & i14) == 0) {
                    if (o0VarL.r(aVar)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i16 |= i19;
                }
                if ((74899 & i16) != 74898) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (o0VarL.n(i16 & 1, z15)) {
                    if (i24 != 0) {
                        str3 = "not_set";
                    }
                    if (i25 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i17 != 0) {
                        r1Var4 = m1.f128891a;
                    } else {
                        r1Var4 = r1Var2;
                    }
                    x1 x1Var = p3.n.f135158a;
                    aVar2 = h4.r.S;
                    h4.r rVarF = x2.f(wz1.i.e(aVar2, !p005kotlin.jvm.internal.s.g(str3, "not_set"), new as.s(str3, 11), o0VarL, 6), 1.0f);
                    if (z14) {
                        o0VarL.C(-1128548301);
                        d92.b.f58623a.getClass();
                        jB = d92.b.a(o0VarL).c().g();
                        o0VarL.g0(false);
                    } else {
                        o0VarL.C(-1128547117);
                        jB = com.nimbusds.jose.shaded.gson.internal.a.b(d92.b.f58623a, o0VarL, false);
                    }
                    h4.r rVarE = u1.n.e(rVarF, jB, r1Var4);
                    if ((458752 & i16) == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objQ = o0VarL.q();
                    if (z16) {
                        objQ = new p0(aVar, 15);
                        o0VarL.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new p0(aVar, 15);
                            o0VarL.K(objQ);
                        }
                    }
                    h4.r rVarD = u1.w.d(rVarE, false, null, null, (e23.a) objQ, 15);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarThen = c2.l.y(rVarD, j92.b.f97899b.f97920e).then(rVar4);
                    c2.j.f22691a.getClass();
                    c2.j.g gVar = c2.j.f22698h;
                    h4.d.f81522a.getClass();
                    s2VarA = q2.a(gVar, h4.d.a.f81534l, o0VarL, 54);
                    iHashCode = Long.hashCode(o0VarL.U);
                    i2VarA0 = o0VarL.a0();
                    rVarC = h4.k.c(rVarThen, o0VarL);
                    h5.g.V.getClass();
                    aVar3 = h5.g.a.f81805b;
                    str5 = str3;
                    if (o0VarL.f135177b != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarL.z();
                    if (o0VarL.T) {
                        o0VarL.M(aVar3);
                    } else {
                        o0VarL.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, o0VarL);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarL);
                    bVar = h5.g.a.f81813j;
                    if (o0VarL.T || !p005kotlin.jvm.internal.s.g(o0VarL.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarL, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarL);
                    u2 u2Var = u2.f22900a;
                    d92.b.f58624b.getClass();
                    h4.r rVar5 = rVar4;
                    r1 r1Var5 = r1Var4;
                    mh.c(str2, u2Var.a(aVar2, 1.0f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarL), o0VarL, (i16 >> 6) & 14, 0, 131068);
                    o0Var = o0VarL;
                    if (z14) {
                        o0Var.C(1785965552);
                        y.a(x2.z(aVar2, null, 3), 0.0f, o0Var, 6, 2);
                        o0Var.g0(false);
                    } else {
                        o0Var.C(1786068379);
                        o0Var.g0(false);
                    }
                    o0Var.g0(true);
                    r1Var3 = r1Var5;
                    str4 = str5;
                    rVar3 = rVar5;
                } else {
                    o0Var = o0VarL;
                    o0Var.e();
                    str4 = str3;
                    rVar3 = rVar2;
                    r1Var3 = r1Var2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new d62.o(str4, z14, str2, rVar3, r1Var3, aVar, i14, i15);
                }
            }
            i16 |= 24576;
            r1Var2 = r1Var;
            if ((196608 & i14) == 0) {
                if (o0VarL.r(aVar)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i16 |= i19;
            }
            if ((74899 & i16) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarL.n(i16 & 1, z15)) {
                if (i24 != 0) {
                    str3 = "not_set";
                }
                if (i25 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i17 != 0) {
                    r1Var4 = m1.f128891a;
                } else {
                    r1Var4 = r1Var2;
                }
                x1 x1Var2 = p3.n.f135158a;
                aVar2 = h4.r.S;
                h4.r rVarF2 = x2.f(wz1.i.e(aVar2, !p005kotlin.jvm.internal.s.g(str3, "not_set"), new as.s(str3, 11), o0VarL, 6), 1.0f);
                if (z14) {
                    o0VarL.C(-1128548301);
                    d92.b.f58623a.getClass();
                    jB = d92.b.a(o0VarL).c().g();
                    o0VarL.g0(false);
                } else {
                    o0VarL.C(-1128547117);
                    jB = com.nimbusds.jose.shaded.gson.internal.a.b(d92.b.f58623a, o0VarL, false);
                }
                h4.r rVarE2 = u1.n.e(rVarF2, jB, r1Var4);
                if ((458752 & i16) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objQ = o0VarL.q();
                if (z16) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new p0(aVar, 15);
                        o0VarL.K(objQ);
                    }
                } else {
                    objQ = new p0(aVar, 15);
                    o0VarL.K(objQ);
                }
                h4.r rVarD2 = u1.w.d(rVarE2, false, null, null, (e23.a) objQ, 15);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarThen2 = c2.l.y(rVarD2, j92.b.f97899b.f97920e).then(rVar4);
                c2.j.f22691a.getClass();
                c2.j.g gVar2 = c2.j.f22698h;
                h4.d.f81522a.getClass();
                s2VarA = q2.a(gVar2, h4.d.a.f81534l, o0VarL, 54);
                iHashCode = Long.hashCode(o0VarL.U);
                i2VarA0 = o0VarL.a0();
                rVarC = h4.k.c(rVarThen2, o0VarL);
                h5.g.V.getClass();
                aVar3 = h5.g.a.f81805b;
                str5 = str3;
                if (o0VarL.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarL.z();
                if (o0VarL.T) {
                    o0VarL.M(aVar3);
                } else {
                    o0VarL.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA, o0VarL);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarL);
                bVar = h5.g.a.f81813j;
                if (o0VarL.T) {
                    v.h.A(iHashCode, o0VarL, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarL, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarL);
                u2 u2Var2 = u2.f22900a;
                d92.b.f58624b.getClass();
                h4.r rVar6 = rVar4;
                r1 r1Var6 = r1Var4;
                mh.c(str2, u2Var2.a(aVar2, 1.0f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarL), o0VarL, (i16 >> 6) & 14, 0, 131068);
                o0Var = o0VarL;
                if (z14) {
                    o0Var.C(1785965552);
                    y.a(x2.z(aVar2, null, 3), 0.0f, o0Var, 6, 2);
                    o0Var.g0(false);
                } else {
                    o0Var.C(1786068379);
                    o0Var.g0(false);
                }
                o0Var.g0(true);
                r1Var3 = r1Var6;
                str4 = str5;
                rVar3 = rVar6;
            } else {
                o0Var = o0VarL;
                o0Var.e();
                str4 = str3;
                rVar3 = rVar2;
                r1Var3 = r1Var2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new d62.o(str4, z14, str2, rVar3, r1Var3, aVar, i14, i15);
            }
        }
        i16 |= 3072;
        rVar2 = rVar;
        i17 = i15 & 16;
        if (i17 != 0) {
            if ((i14 & 24576) == 0) {
                r1Var2 = r1Var;
                if (o0VarL.B(r1Var2)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i16 |= i18;
            }
            if ((196608 & i14) == 0) {
                if (o0VarL.r(aVar)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i16 |= i19;
            }
            if ((74899 & i16) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarL.n(i16 & 1, z15)) {
                if (i24 != 0) {
                    str3 = "not_set";
                }
                if (i25 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i17 != 0) {
                    r1Var4 = m1.f128891a;
                } else {
                    r1Var4 = r1Var2;
                }
                x1 x1Var3 = p3.n.f135158a;
                aVar2 = h4.r.S;
                h4.r rVarF3 = x2.f(wz1.i.e(aVar2, !p005kotlin.jvm.internal.s.g(str3, "not_set"), new as.s(str3, 11), o0VarL, 6), 1.0f);
                if (z14) {
                    o0VarL.C(-1128548301);
                    d92.b.f58623a.getClass();
                    jB = d92.b.a(o0VarL).c().g();
                    o0VarL.g0(false);
                } else {
                    o0VarL.C(-1128547117);
                    jB = com.nimbusds.jose.shaded.gson.internal.a.b(d92.b.f58623a, o0VarL, false);
                }
                h4.r rVarE3 = u1.n.e(rVarF3, jB, r1Var4);
                if ((458752 & i16) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objQ = o0VarL.q();
                if (z16) {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new p0(aVar, 15);
                        o0VarL.K(objQ);
                    }
                } else {
                    objQ = new p0(aVar, 15);
                    o0VarL.K(objQ);
                }
                h4.r rVarD3 = u1.w.d(rVarE3, false, null, null, (e23.a) objQ, 15);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarThen3 = c2.l.y(rVarD3, j92.b.f97899b.f97920e).then(rVar4);
                c2.j.f22691a.getClass();
                c2.j.g gVar3 = c2.j.f22698h;
                h4.d.f81522a.getClass();
                s2VarA = q2.a(gVar3, h4.d.a.f81534l, o0VarL, 54);
                iHashCode = Long.hashCode(o0VarL.U);
                i2VarA0 = o0VarL.a0();
                rVarC = h4.k.c(rVarThen3, o0VarL);
                h5.g.V.getClass();
                aVar3 = h5.g.a.f81805b;
                str5 = str3;
                if (o0VarL.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarL.z();
                if (o0VarL.T) {
                    o0VarL.M(aVar3);
                } else {
                    o0VarL.c();
                }
                b4.c(h5.g.a.f81810g, s2VarA, o0VarL);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarL);
                bVar = h5.g.a.f81813j;
                if (o0VarL.T) {
                    v.h.A(iHashCode, o0VarL, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarL, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarL);
                u2 u2Var3 = u2.f22900a;
                d92.b.f58624b.getClass();
                h4.r rVar7 = rVar4;
                r1 r1Var7 = r1Var4;
                mh.c(str2, u2Var3.a(aVar2, 1.0f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarL), o0VarL, (i16 >> 6) & 14, 0, 131068);
                o0Var = o0VarL;
                if (z14) {
                    o0Var.C(1785965552);
                    y.a(x2.z(aVar2, null, 3), 0.0f, o0Var, 6, 2);
                    o0Var.g0(false);
                } else {
                    o0Var.C(1786068379);
                    o0Var.g0(false);
                }
                o0Var.g0(true);
                r1Var3 = r1Var7;
                str4 = str5;
                rVar3 = rVar7;
            } else {
                o0Var = o0VarL;
                o0Var.e();
                str4 = str3;
                rVar3 = rVar2;
                r1Var3 = r1Var2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new d62.o(str4, z14, str2, rVar3, r1Var3, aVar, i14, i15);
            }
        }
        i16 |= 24576;
        r1Var2 = r1Var;
        if ((196608 & i14) == 0) {
            if (o0VarL.r(aVar)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i16 |= i19;
        }
        if ((74899 & i16) != 74898) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (o0VarL.n(i16 & 1, z15)) {
            if (i24 != 0) {
                str3 = "not_set";
            }
            if (i25 != 0) {
                rVar4 = h4.r.S;
            } else {
                rVar4 = rVar2;
            }
            if (i17 != 0) {
                r1Var4 = m1.f128891a;
            } else {
                r1Var4 = r1Var2;
            }
            x1 x1Var4 = p3.n.f135158a;
            aVar2 = h4.r.S;
            h4.r rVarF4 = x2.f(wz1.i.e(aVar2, !p005kotlin.jvm.internal.s.g(str3, "not_set"), new as.s(str3, 11), o0VarL, 6), 1.0f);
            if (z14) {
                o0VarL.C(-1128548301);
                d92.b.f58623a.getClass();
                jB = d92.b.a(o0VarL).c().g();
                o0VarL.g0(false);
            } else {
                o0VarL.C(-1128547117);
                jB = com.nimbusds.jose.shaded.gson.internal.a.b(d92.b.f58623a, o0VarL, false);
            }
            h4.r rVarE4 = u1.n.e(rVarF4, jB, r1Var4);
            if ((458752 & i16) == 131072) {
                z16 = true;
            } else {
                z16 = false;
            }
            objQ = o0VarL.q();
            if (z16) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new p0(aVar, 15);
                    o0VarL.K(objQ);
                }
            } else {
                objQ = new p0(aVar, 15);
                o0VarL.K(objQ);
            }
            h4.r rVarD4 = u1.w.d(rVarE4, false, null, null, (e23.a) objQ, 15);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarThen4 = c2.l.y(rVarD4, j92.b.f97899b.f97920e).then(rVar4);
            c2.j.f22691a.getClass();
            c2.j.g gVar4 = c2.j.f22698h;
            h4.d.f81522a.getClass();
            s2VarA = q2.a(gVar4, h4.d.a.f81534l, o0VarL, 54);
            iHashCode = Long.hashCode(o0VarL.U);
            i2VarA0 = o0VarL.a0();
            rVarC = h4.k.c(rVarThen4, o0VarL);
            h5.g.V.getClass();
            aVar3 = h5.g.a.f81805b;
            str5 = str3;
            if (o0VarL.f135177b != null) {
                p3.p0.l();
                throw null;
            }
            o0VarL.z();
            if (o0VarL.T) {
                o0VarL.M(aVar3);
            } else {
                o0VarL.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarL);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarL);
            bVar = h5.g.a.f81813j;
            if (o0VarL.T) {
                v.h.A(iHashCode, o0VarL, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarL, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarL);
            u2 u2Var4 = u2.f22900a;
            d92.b.f58624b.getClass();
            h4.r rVar8 = rVar4;
            r1 r1Var8 = r1Var4;
            mh.c(str2, u2Var4.a(aVar2, 1.0f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarL), o0VarL, (i16 >> 6) & 14, 0, 131068);
            o0Var = o0VarL;
            if (z14) {
                o0Var.C(1785965552);
                y.a(x2.z(aVar2, null, 3), 0.0f, o0Var, 6, 2);
                o0Var.g0(false);
            } else {
                o0Var.C(1786068379);
                o0Var.g0(false);
            }
            o0Var.g0(true);
            r1Var3 = r1Var8;
            str4 = str5;
            rVar3 = rVar8;
        } else {
            o0Var = o0VarL;
            o0Var.e();
            str4 = str3;
            rVar3 = rVar2;
            r1Var3 = r1Var2;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d62.o(str4, z14, str2, rVar3, r1Var3, aVar, i14, i15);
        }
    }
}
