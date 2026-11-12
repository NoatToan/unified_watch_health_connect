package l72;

import i3.e5;
import i3.mh;
import java.util.Locale;
import kd0.h6;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
public final class r1 {
    /* JADX WARN: Code duplicated, block: B:38:0x0097  */
    public static final void a(String str, b92.a aVar, e23.p pVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        str.getClass();
        p3.o0 o0VarE = mVar.E(1334624383);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(pVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarF = d92.c.f(j92.f.f97934k, o0VarE);
            g6.f.a aVar2 = g6.f.f75994b;
            float f14 = 16;
            h4.r rVarB = c2.l.B(h4.r.S, f14, 20, f14, 4);
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new q1(aVar, 0);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new q1(aVar, 0);
                    o0VarE.K(objQ);
                }
            }
            int i16 = i15;
            mh.c(upperCase, p5.v.c((e23.l) objQ, rVarB, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            if (pVar == null) {
                o0Var.C(1283263866);
                o0Var.g0(false);
            } else {
                o0Var.C(-1621172377);
                e5.q((i16 >> 6) & 14, pVar, o0Var, false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h6(str, aVar, pVar, i14, 17);
        }
    }

    public static final void b(String str, e23.p<? super p3.m, ? super Integer, Unit> pVar, p3.m mVar, int i14, int i15) {
        int i16;
        str.getClass();
        p3.o0 o0VarE = mVar.E(-1333302050);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i17 = i15 & 2;
        if (i17 != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(pVar) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            if (i17 != 0) {
                pVar = null;
            }
            p3.x1 x1Var = p3.n.f135158a;
            a(str, null, pVar, o0VarE, ((i16 << 3) & 896) | (i16 & 14) | 48);
        } else {
            o0VarE.e();
        }
        e23.p<? super p3.m, ? super Integer, Unit> pVar2 = pVar;
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.f(str, pVar2, i14, i15, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    public static final void c(String str, String str2, e23.a<Unit> aVar, boolean z14, b92.a aVar2, e23.p<? super p3.m, ? super Integer, Unit> pVar, p3.m mVar, int i14, int i15) {
        int i16;
        b92.a aVar3;
        int i17;
        e23.p<? super p3.m, ? super Integer, Unit> pVar2;
        int i18;
        boolean z15;
        boolean z16;
        b92.a aVar4;
        p3.p2 p2VarI0;
        b92.a aVar5;
        e23.p<? super p3.m, ? super Integer, Unit> pVar3;
        str.getClass();
        str2.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-1723232120);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(aVar) ? 256 : 128;
        }
        int i19 = i16 | 3072;
        int i24 = i15 & 16;
        if (i24 == 0) {
            if ((i14 & 24576) == 0) {
                aVar3 = aVar2;
                i19 |= o0VarE.B(aVar3) ? 16384 : 8192;
            }
            i17 = i15 & 32;
            if (i17 != 0) {
                if ((196608 & i14) == 0) {
                    pVar2 = pVar;
                    if (o0VarE.r(pVar2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i19 |= i18;
                }
                if ((74899 & i19) != 74898) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (o0VarE.n(i19 & 1, z15)) {
                    if (i24 != 0) {
                        aVar5 = null;
                    } else {
                        aVar5 = aVar3;
                    }
                    if (i17 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar2;
                    }
                    p3.x1 x1Var = p3.n.f135158a;
                    int i25 = i19 >> 6;
                    d(str, true, aVar5, z3.f.c(-1757100789, new jt1.m(str2, 26, aVar, aVar5), o0VarE), pVar3, o0VarE, (i19 & 14) | 3072 | (i25 & 112) | (i25 & 896) | ((i19 >> 3) & 57344), 0);
                    z16 = true;
                    aVar4 = aVar5;
                    pVar2 = pVar3;
                } else {
                    o0VarE.e();
                    z16 = z14;
                    aVar4 = aVar3;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new d62.o(str, str2, aVar, z16, aVar4, pVar2, i14, i15);
                }
            }
            i19 |= 196608;
            pVar2 = pVar;
            if ((74899 & i19) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i19 & 1, z15)) {
                if (i24 != 0) {
                    aVar5 = null;
                } else {
                    aVar5 = aVar3;
                }
                if (i17 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar2;
                }
                p3.x1 x1Var2 = p3.n.f135158a;
                int i26 = i19 >> 6;
                d(str, true, aVar5, z3.f.c(-1757100789, new jt1.m(str2, 26, aVar, aVar5), o0VarE), pVar3, o0VarE, (i19 & 14) | 3072 | (i26 & 112) | (i26 & 896) | ((i19 >> 3) & 57344), 0);
                z16 = true;
                aVar4 = aVar5;
                pVar2 = pVar3;
            } else {
                o0VarE.e();
                z16 = z14;
                aVar4 = aVar3;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new d62.o(str, str2, aVar, z16, aVar4, pVar2, i14, i15);
            }
        }
        i19 = i16 | 27648;
        aVar3 = aVar2;
        i17 = i15 & 32;
        if (i17 != 0) {
            if ((196608 & i14) == 0) {
                pVar2 = pVar;
                if (o0VarE.r(pVar2)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i19 |= i18;
            }
            if ((74899 & i19) != 74898) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i19 & 1, z15)) {
                if (i24 != 0) {
                    aVar5 = null;
                } else {
                    aVar5 = aVar3;
                }
                if (i17 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar2;
                }
                p3.x1 x1Var3 = p3.n.f135158a;
                int i27 = i19 >> 6;
                d(str, true, aVar5, z3.f.c(-1757100789, new jt1.m(str2, 26, aVar, aVar5), o0VarE), pVar3, o0VarE, (i19 & 14) | 3072 | (i27 & 112) | (i27 & 896) | ((i19 >> 3) & 57344), 0);
                z16 = true;
                aVar4 = aVar5;
                pVar2 = pVar3;
            } else {
                o0VarE.e();
                z16 = z14;
                aVar4 = aVar3;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new d62.o(str, str2, aVar, z16, aVar4, pVar2, i14, i15);
            }
        }
        i19 |= 196608;
        pVar2 = pVar;
        if ((74899 & i19) != 74898) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (o0VarE.n(i19 & 1, z15)) {
            if (i24 != 0) {
                aVar5 = null;
            } else {
                aVar5 = aVar3;
            }
            if (i17 != 0) {
                pVar3 = null;
            } else {
                pVar3 = pVar2;
            }
            p3.x1 x1Var4 = p3.n.f135158a;
            int i28 = i19 >> 6;
            d(str, true, aVar5, z3.f.c(-1757100789, new jt1.m(str2, 26, aVar, aVar5), o0VarE), pVar3, o0VarE, (i19 & 14) | 3072 | (i28 & 112) | (i28 & 896) | ((i19 >> 3) & 57344), 0);
            z16 = true;
            aVar4 = aVar5;
            pVar2 = pVar3;
        } else {
            o0VarE.e();
            z16 = z14;
            aVar4 = aVar3;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d62.o(str, str2, aVar, z16, aVar4, pVar2, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0246  */
    /* JADX WARN: Code duplicated, block: B:105:0x0255  */
    /* JADX WARN: Code duplicated, block: B:107:0x0263  */
    /* JADX WARN: Code duplicated, block: B:110:0x027e  */
    /* JADX WARN: Code duplicated, block: B:111:0x028a  */
    /* JADX WARN: Code duplicated, block: B:113:0x029e  */
    /* JADX WARN: Code duplicated, block: B:115:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:117:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:120:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:68:0x010e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0117  */
    /* JADX WARN: Code duplicated, block: B:71:0x011b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0130  */
    /* JADX WARN: Code duplicated, block: B:76:0x013e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0176  */
    /* JADX WARN: Code duplicated, block: B:80:0x0178  */
    /* JADX WARN: Code duplicated, block: B:83:0x017d  */
    /* JADX WARN: Code duplicated, block: B:84:0x017f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0187  */
    /* JADX WARN: Code duplicated, block: B:89:0x018e  */
    /* JADX WARN: Code duplicated, block: B:92:0x021e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0225  */
    /* JADX WARN: Code duplicated, block: B:95:0x0229  */
    /* JADX WARN: Code duplicated, block: B:98:0x0238  */
    public static final void d(String str, boolean z14, b92.a aVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, p3.m mVar, int i14, int i15) {
        int i16;
        int i17;
        b92.a aVar2;
        int i18;
        boolean z15;
        p3.o0 o0Var;
        e23.p<? super p3.m, ? super Integer, Unit> pVar3;
        boolean z16;
        b92.a aVar3;
        p3.p2 p2VarI0;
        h4.r.a aVar4;
        float f14;
        int i19;
        boolean z17;
        Object objQ;
        p3.m.a aVar5;
        h4.g.b bVar;
        c2.s2 s2VarA;
        int iHashCode;
        p3.i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar6;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar2;
        int i24;
        h5.g.a.f fVar;
        boolean z18;
        boolean z19;
        boolean z24;
        Object objQ2;
        b92.a aVar7;
        c2.s2 s2VarA2;
        int iHashCode2;
        p3.i2 i2VarA1;
        h4.r rVarC2;
        boolean z25;
        int i25;
        int i26;
        e23.p<? super p3.m, ? super Integer, Unit> pVar4 = pVar2;
        str.getClass();
        p3.o0 o0VarE = mVar.E(427796092);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i27 = i15 & 2;
        if (i27 == 0) {
            if ((i14 & 48) == 0) {
                i16 |= o0VarE.h(z14) ? 32 : 16;
            }
            i17 = i15 & 4;
            if (i17 != 0) {
                if ((i14 & 384) == 0) {
                    aVar2 = aVar;
                    if (o0VarE.B(aVar2)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i16 |= i18;
                }
                if ((i14 & 3072) == 0) {
                    if (o0VarE.r(pVar)) {
                        i26 = 2048;
                    } else {
                        i26 = 1024;
                    }
                    i16 |= i26;
                }
                if ((i14 & 24576) == 0) {
                    if (o0VarE.r(pVar4)) {
                        i25 = 16384;
                    } else {
                        i25 = 8192;
                    }
                    i16 |= i25;
                }
                if ((i16 & 9363) != 9362) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (o0VarE.n(i16 & 1, z15)) {
                    if (i27 != 0) {
                        z16 = true;
                    } else {
                        z16 = z14;
                    }
                    if (i17 != 0) {
                        aVar2 = null;
                    }
                    p3.x1 x1Var = p3.n.f135158a;
                    aVar4 = h4.r.S;
                    f14 = 16;
                    g6.f.a aVar8 = g6.f.f75994b;
                    h4.r rVarF = c2.x2.f(c2.l.C(aVar4, 0.0f, f14, 0.0f, 0.0f, 13), 1.0f);
                    i19 = i16 & 896;
                    if (i19 == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objQ = o0VarE.q();
                    aVar5 = p3.m.f135153a;
                    if (z17) {
                        objQ = new q1(aVar2, 1);
                        o0VarE.K(objQ);
                    } else {
                        aVar5.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new q1(aVar2, 1);
                            o0VarE.K(objQ);
                        }
                    }
                    h4.r rVarC3 = p5.v.c((e23.l) objQ, rVarF, false);
                    c2.j.f22691a.getClass();
                    c2.j.g gVar = c2.j.f22698h;
                    h4.d.f81522a.getClass();
                    bVar = h4.d.a.f81534l;
                    s2VarA = c2.q2.a(gVar, bVar, o0VarE, 54);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarC3, o0VarE);
                    h5.g.V.getClass();
                    aVar6 = h5.g.a.f81805b;
                    if (cVar != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar6);
                    } else {
                        o0VarE.c();
                    }
                    eVar = h5.g.a.f81810g;
                    b4.c(eVar, s2VarA, o0VarE);
                    c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarA0, o0VarE);
                    bVar2 = h5.g.a.f81813j;
                    i24 = i16;
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    c2.u2 u2Var = c2.u2.f22900a;
                    String upperCase = str.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarF = d92.c.f(j92.f.f97934k, o0VarE);
                    float f15 = 4;
                    h4.r rVarB = c2.l.B(u2Var.a(aVar4, 1.0f, true), f14, f15, f14, f15);
                    if (i19 == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if ((i24 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = z18 | z19;
                    objQ2 = o0VarE.q();
                    if (z24) {
                        objQ2 = new i70.a(aVar2, str, 8);
                        o0VarE.K(objQ2);
                    } else {
                        aVar5.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new i70.a(aVar2, str, 8);
                            o0VarE.K(objQ2);
                        }
                    }
                    aVar7 = aVar2;
                    mh.c(upperCase, p5.v.c((e23.l) objQ2, rVarB, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
                    o0Var = o0VarE;
                    h4.r rVarB2 = c2.l.B(c2.x2.z(v2.a(aVar4, !z16, new q(6), o0Var, 6), null, 3), f14, f15, f14, f15);
                    s2VarA2 = c2.q2.a(c2.j.f22692b, bVar, o0Var, 48);
                    iHashCode2 = Long.hashCode(o0Var.U);
                    i2VarA1 = o0Var.a0();
                    rVarC2 = h4.k.c(rVarB2, o0Var);
                    if (cVar != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        o0Var.M(aVar6);
                    } else {
                        o0Var.c();
                    }
                    b4.c(eVar, s2VarA2, o0Var);
                    b4.c(c1623g, i2VarA1, o0Var);
                    if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0Var, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC2, o0Var);
                    if (pVar == null) {
                        o0Var.C(1486426197);
                        z25 = false;
                        o0Var.g0(false);
                        pVar3 = pVar;
                    } else {
                        z25 = false;
                        o0Var.C(-90598100);
                        pVar3 = pVar;
                        e5.q((i24 >> 9) & 14, pVar3, o0Var, false);
                        Unit unit = Unit.INSTANCE;
                    }
                    o0Var.g0(true);
                    o0Var.g0(true);
                    if (pVar2 == null) {
                        o0Var.C(1306786685);
                        o0Var.g0(z25);
                        pVar4 = pVar2;
                    } else {
                        o0Var.C(-1204771580);
                        pVar4 = pVar2;
                        e5.q((i24 >> 12) & 14, pVar4, o0Var, z25);
                        Unit unit2 = Unit.INSTANCE;
                    }
                    aVar3 = aVar7;
                } else {
                    o0Var = o0VarE;
                    pVar3 = pVar;
                    o0Var.e();
                    z16 = z14;
                    aVar3 = aVar2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new a82.a(str, z16, aVar3, pVar3, pVar4, i14, i15);
                }
            }
            i16 |= 384;
            aVar2 = aVar;
            if ((i14 & 3072) == 0) {
                if (o0VarE.r(pVar)) {
                    i26 = 2048;
                } else {
                    i26 = 1024;
                }
                i16 |= i26;
            }
            if ((i14 & 24576) == 0) {
                if (o0VarE.r(pVar4)) {
                    i25 = 16384;
                } else {
                    i25 = 8192;
                }
                i16 |= i25;
            }
            if ((i16 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i16 & 1, z15)) {
                if (i27 != 0) {
                    z16 = true;
                } else {
                    z16 = z14;
                }
                if (i17 != 0) {
                    aVar2 = null;
                }
                p3.x1 x1Var2 = p3.n.f135158a;
                aVar4 = h4.r.S;
                f14 = 16;
                g6.f.a aVar9 = g6.f.f75994b;
                h4.r rVarF2 = c2.x2.f(c2.l.C(aVar4, 0.0f, f14, 0.0f, 0.0f, 13), 1.0f);
                i19 = i16 & 896;
                if (i19 == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objQ = o0VarE.q();
                aVar5 = p3.m.f135153a;
                if (z17) {
                    aVar5.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new q1(aVar2, 1);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new q1(aVar2, 1);
                    o0VarE.K(objQ);
                }
                h4.r rVarC4 = p5.v.c((e23.l) objQ, rVarF2, false);
                c2.j.f22691a.getClass();
                c2.j.g gVar2 = c2.j.f22698h;
                h4.d.f81522a.getClass();
                bVar = h4.d.a.f81534l;
                s2VarA = c2.q2.a(gVar2, bVar, o0VarE, 54);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarC4, o0VarE);
                h5.g.V.getClass();
                aVar6 = h5.g.a.f81805b;
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, s2VarA, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar2 = h5.g.a.f81813j;
                i24 = i16;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                c2.u2 u2Var2 = c2.u2.f22900a;
                String upperCase2 = str.toUpperCase(Locale.ROOT);
                upperCase2.getClass();
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                s5.x0 x0VarF2 = d92.c.f(j92.f.f97934k, o0VarE);
                float f16 = 4;
                h4.r rVarB3 = c2.l.B(u2Var2.a(aVar4, 1.0f, true), f14, f16, f14, f16);
                if (i19 == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if ((i24 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = z18 | z19;
                objQ2 = o0VarE.q();
                if (z24) {
                    aVar5.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new i70.a(aVar2, str, 8);
                        o0VarE.K(objQ2);
                    }
                } else {
                    objQ2 = new i70.a(aVar2, str, 8);
                    o0VarE.K(objQ2);
                }
                aVar7 = aVar2;
                mh.c(upperCase2, p5.v.c((e23.l) objQ2, rVarB3, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF2, o0VarE, 0, 0, 131068);
                o0Var = o0VarE;
                h4.r rVarB4 = c2.l.B(c2.x2.z(v2.a(aVar4, !z16, new q(6), o0Var, 6), null, 3), f14, f16, f14, f16);
                s2VarA2 = c2.q2.a(c2.j.f22692b, bVar, o0Var, 48);
                iHashCode2 = Long.hashCode(o0Var.U);
                i2VarA1 = o0Var.a0();
                rVarC2 = h4.k.c(rVarB4, o0Var);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar6);
                } else {
                    o0Var.c();
                }
                b4.c(eVar, s2VarA2, o0Var);
                b4.c(c1623g, i2VarA1, o0Var);
                if (o0Var.T) {
                    v.h.A(iHashCode2, o0Var, iHashCode2, bVar2);
                } else {
                    v.h.A(iHashCode2, o0Var, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0Var);
                if (pVar == null) {
                    o0Var.C(1486426197);
                    z25 = false;
                    o0Var.g0(false);
                    pVar3 = pVar;
                } else {
                    z25 = false;
                    o0Var.C(-90598100);
                    pVar3 = pVar;
                    e5.q((i24 >> 9) & 14, pVar3, o0Var, false);
                    Unit unit3 = Unit.INSTANCE;
                }
                o0Var.g0(true);
                o0Var.g0(true);
                if (pVar2 == null) {
                    o0Var.C(1306786685);
                    o0Var.g0(z25);
                    pVar4 = pVar2;
                } else {
                    o0Var.C(-1204771580);
                    pVar4 = pVar2;
                    e5.q((i24 >> 12) & 14, pVar4, o0Var, z25);
                    Unit unit4 = Unit.INSTANCE;
                }
                aVar3 = aVar7;
            } else {
                o0Var = o0VarE;
                pVar3 = pVar;
                o0Var.e();
                z16 = z14;
                aVar3 = aVar2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a82.a(str, z16, aVar3, pVar3, pVar4, i14, i15);
            }
        }
        i16 |= 48;
        i17 = i15 & 4;
        if (i17 != 0) {
            if ((i14 & 384) == 0) {
                aVar2 = aVar;
                if (o0VarE.B(aVar2)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i16 |= i18;
            }
            if ((i14 & 3072) == 0) {
                if (o0VarE.r(pVar)) {
                    i26 = 2048;
                } else {
                    i26 = 1024;
                }
                i16 |= i26;
            }
            if ((i14 & 24576) == 0) {
                if (o0VarE.r(pVar4)) {
                    i25 = 16384;
                } else {
                    i25 = 8192;
                }
                i16 |= i25;
            }
            if ((i16 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i16 & 1, z15)) {
                if (i27 != 0) {
                    z16 = true;
                } else {
                    z16 = z14;
                }
                if (i17 != 0) {
                    aVar2 = null;
                }
                p3.x1 x1Var3 = p3.n.f135158a;
                aVar4 = h4.r.S;
                f14 = 16;
                g6.f.a aVar10 = g6.f.f75994b;
                h4.r rVarF3 = c2.x2.f(c2.l.C(aVar4, 0.0f, f14, 0.0f, 0.0f, 13), 1.0f);
                i19 = i16 & 896;
                if (i19 == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objQ = o0VarE.q();
                aVar5 = p3.m.f135153a;
                if (z17) {
                    aVar5.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new q1(aVar2, 1);
                        o0VarE.K(objQ);
                    }
                } else {
                    objQ = new q1(aVar2, 1);
                    o0VarE.K(objQ);
                }
                h4.r rVarC5 = p5.v.c((e23.l) objQ, rVarF3, false);
                c2.j.f22691a.getClass();
                c2.j.g gVar3 = c2.j.f22698h;
                h4.d.f81522a.getClass();
                bVar = h4.d.a.f81534l;
                s2VarA = c2.q2.a(gVar3, bVar, o0VarE, 54);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarC5, o0VarE);
                h5.g.V.getClass();
                aVar6 = h5.g.a.f81805b;
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, s2VarA, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar2 = h5.g.a.f81813j;
                i24 = i16;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                c2.u2 u2Var3 = c2.u2.f22900a;
                String upperCase3 = str.toUpperCase(Locale.ROOT);
                upperCase3.getClass();
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                s5.x0 x0VarF3 = d92.c.f(j92.f.f97934k, o0VarE);
                float f17 = 4;
                h4.r rVarB5 = c2.l.B(u2Var3.a(aVar4, 1.0f, true), f14, f17, f14, f17);
                if (i19 == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if ((i24 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = z18 | z19;
                objQ2 = o0VarE.q();
                if (z24) {
                    aVar5.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new i70.a(aVar2, str, 8);
                        o0VarE.K(objQ2);
                    }
                } else {
                    objQ2 = new i70.a(aVar2, str, 8);
                    o0VarE.K(objQ2);
                }
                aVar7 = aVar2;
                mh.c(upperCase3, p5.v.c((e23.l) objQ2, rVarB5, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF3, o0VarE, 0, 0, 131068);
                o0Var = o0VarE;
                h4.r rVarB6 = c2.l.B(c2.x2.z(v2.a(aVar4, !z16, new q(6), o0Var, 6), null, 3), f14, f17, f14, f17);
                s2VarA2 = c2.q2.a(c2.j.f22692b, bVar, o0Var, 48);
                iHashCode2 = Long.hashCode(o0Var.U);
                i2VarA1 = o0Var.a0();
                rVarC2 = h4.k.c(rVarB6, o0Var);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar6);
                } else {
                    o0Var.c();
                }
                b4.c(eVar, s2VarA2, o0Var);
                b4.c(c1623g, i2VarA1, o0Var);
                if (o0Var.T) {
                    v.h.A(iHashCode2, o0Var, iHashCode2, bVar2);
                } else {
                    v.h.A(iHashCode2, o0Var, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0Var);
                if (pVar == null) {
                    o0Var.C(1486426197);
                    z25 = false;
                    o0Var.g0(false);
                    pVar3 = pVar;
                } else {
                    z25 = false;
                    o0Var.C(-90598100);
                    pVar3 = pVar;
                    e5.q((i24 >> 9) & 14, pVar3, o0Var, false);
                    Unit unit5 = Unit.INSTANCE;
                }
                o0Var.g0(true);
                o0Var.g0(true);
                if (pVar2 == null) {
                    o0Var.C(1306786685);
                    o0Var.g0(z25);
                    pVar4 = pVar2;
                } else {
                    o0Var.C(-1204771580);
                    pVar4 = pVar2;
                    e5.q((i24 >> 12) & 14, pVar4, o0Var, z25);
                    Unit unit6 = Unit.INSTANCE;
                }
                aVar3 = aVar7;
            } else {
                o0Var = o0VarE;
                pVar3 = pVar;
                o0Var.e();
                z16 = z14;
                aVar3 = aVar2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a82.a(str, z16, aVar3, pVar3, pVar4, i14, i15);
            }
        }
        i16 |= 384;
        aVar2 = aVar;
        if ((i14 & 3072) == 0) {
            if (o0VarE.r(pVar)) {
                i26 = 2048;
            } else {
                i26 = 1024;
            }
            i16 |= i26;
        }
        if ((i14 & 24576) == 0) {
            if (o0VarE.r(pVar4)) {
                i25 = 16384;
            } else {
                i25 = 8192;
            }
            i16 |= i25;
        }
        if ((i16 & 9363) != 9362) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (o0VarE.n(i16 & 1, z15)) {
            if (i27 != 0) {
                z16 = true;
            } else {
                z16 = z14;
            }
            if (i17 != 0) {
                aVar2 = null;
            }
            p3.x1 x1Var4 = p3.n.f135158a;
            aVar4 = h4.r.S;
            f14 = 16;
            g6.f.a aVar11 = g6.f.f75994b;
            h4.r rVarF4 = c2.x2.f(c2.l.C(aVar4, 0.0f, f14, 0.0f, 0.0f, 13), 1.0f);
            i19 = i16 & 896;
            if (i19 == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            objQ = o0VarE.q();
            aVar5 = p3.m.f135153a;
            if (z17) {
                aVar5.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new q1(aVar2, 1);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new q1(aVar2, 1);
                o0VarE.K(objQ);
            }
            h4.r rVarC6 = p5.v.c((e23.l) objQ, rVarF4, false);
            c2.j.f22691a.getClass();
            c2.j.g gVar4 = c2.j.f22698h;
            h4.d.f81522a.getClass();
            bVar = h4.d.a.f81534l;
            s2VarA = c2.q2.a(gVar4, bVar, o0VarE, 54);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarC6, o0VarE);
            h5.g.V.getClass();
            aVar6 = h5.g.a.f81805b;
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarA, o0VarE);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            bVar2 = h5.g.a.f81813j;
            i24 = i16;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.u2 u2Var4 = c2.u2.f22900a;
            String upperCase4 = str.toUpperCase(Locale.ROOT);
            upperCase4.getClass();
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarF4 = d92.c.f(j92.f.f97934k, o0VarE);
            float f18 = 4;
            h4.r rVarB7 = c2.l.B(u2Var4.a(aVar4, 1.0f, true), f14, f18, f14, f18);
            if (i19 == 256) {
                z18 = true;
            } else {
                z18 = false;
            }
            if ((i24 & 14) == 4) {
                z19 = true;
            } else {
                z19 = false;
            }
            z24 = z18 | z19;
            objQ2 = o0VarE.q();
            if (z24) {
                aVar5.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new i70.a(aVar2, str, 8);
                    o0VarE.K(objQ2);
                }
            } else {
                objQ2 = new i70.a(aVar2, str, 8);
                o0VarE.K(objQ2);
            }
            aVar7 = aVar2;
            mh.c(upperCase4, p5.v.c((e23.l) objQ2, rVarB7, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF4, o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            h4.r rVarB8 = c2.l.B(c2.x2.z(v2.a(aVar4, !z16, new q(6), o0Var, 6), null, 3), f14, f18, f14, f18);
            s2VarA2 = c2.q2.a(c2.j.f22692b, bVar, o0Var, 48);
            iHashCode2 = Long.hashCode(o0Var.U);
            i2VarA1 = o0Var.a0();
            rVarC2 = h4.k.c(rVarB8, o0Var);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0Var.z();
            if (o0Var.T) {
                o0Var.M(aVar6);
            } else {
                o0Var.c();
            }
            b4.c(eVar, s2VarA2, o0Var);
            b4.c(c1623g, i2VarA1, o0Var);
            if (o0Var.T) {
                v.h.A(iHashCode2, o0Var, iHashCode2, bVar2);
            } else {
                v.h.A(iHashCode2, o0Var, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0Var);
            if (pVar == null) {
                o0Var.C(1486426197);
                z25 = false;
                o0Var.g0(false);
                pVar3 = pVar;
            } else {
                z25 = false;
                o0Var.C(-90598100);
                pVar3 = pVar;
                e5.q((i24 >> 9) & 14, pVar3, o0Var, false);
                Unit unit7 = Unit.INSTANCE;
            }
            o0Var.g0(true);
            o0Var.g0(true);
            if (pVar2 == null) {
                o0Var.C(1306786685);
                o0Var.g0(z25);
                pVar4 = pVar2;
            } else {
                o0Var.C(-1204771580);
                pVar4 = pVar2;
                e5.q((i24 >> 12) & 14, pVar4, o0Var, z25);
                Unit unit8 = Unit.INSTANCE;
            }
            aVar3 = aVar7;
        } else {
            o0Var = o0VarE;
            pVar3 = pVar;
            o0Var.e();
            z16 = z14;
            aVar3 = aVar2;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.a(str, z16, aVar3, pVar3, pVar4, i14, i15);
        }
    }
}
