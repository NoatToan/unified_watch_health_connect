package c12;

import a42.z;
import b.w;
import bt1.s;
import c2.m0;
import c2.n3;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import e23.p;
import e23.q;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class g {
    /* JADX WARN: Code duplicated, block: B:100:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x0109  */
    /* JADX WARN: Code duplicated, block: B:88:0x016f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0171  */
    /* JADX WARN: Code duplicated, block: B:92:0x0179  */
    /* JADX WARN: Code duplicated, block: B:94:0x0182  */
    /* JADX WARN: Code duplicated, block: B:97:0x0195  */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x00c1, please report this as an issue */
    public static final void a(h hVar, e23.a aVar, l lVar, q qVar, q qVar2, p pVar, q qVar3, q qVar4, boolean z14, z3.e eVar, m mVar, int i14, int i15) {
        int i16;
        q qVar5;
        int i17;
        boolean z15;
        int i18;
        boolean z16;
        o0 o0Var;
        q qVar6;
        l lVar2;
        boolean z17;
        p2 p2VarI0;
        int i19;
        boolean z18;
        l lVar3;
        p1 p1VarC;
        boolean z19;
        boolean z24;
        Object objQ;
        h hVar2 = hVar;
        hVar2.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1418236347);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.r(hVar2) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(qVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(qVar2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.r(pVar) ? 131072 : 65536;
        }
        int i24 = i15 & 64;
        if (i24 == 0) {
            if ((1572864 & i14) == 0) {
                qVar5 = qVar3;
                i16 |= o0VarE.r(qVar5) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
            i17 = i15 & 256;
            if (i17 != 0) {
                if ((100663296 & i14) == 0) {
                    z15 = z14;
                    if (o0VarE.h(z15)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                    i16 |= i18;
                }
                if ((306783379 & i16) != 306783378) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i16 & 1, z16)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0 || o0VarE.o0()) {
                        s sVar = new s(22);
                        int i25 = i16 & (-897);
                        if (i24 != 0) {
                            qVar5 = null;
                        }
                        i19 = i25;
                        if (i17 != 0) {
                            z18 = false;
                        } else {
                            z18 = z15;
                        }
                        lVar3 = sVar;
                    } else {
                        o0VarE.e();
                        i19 = i16 & (-897);
                        z18 = z15;
                        lVar3 = lVar;
                    }
                    o0VarE.h0();
                    x1 x1Var = n.f135158a;
                    p1VarC = s9.c.c(hVar2.f22558b, o0VarE);
                    c.p.f22335a.getClass();
                    w wVarA = c.p.a(o0VarE);
                    z3.e eVarC = z3.f.c(1347110272, new z(qVar, wVarA != null ? wVarA.getOnBackPressedDispatcher() : null, qVar2, pVar, p1VarC, 10), o0VarE);
                    g6.f.a aVar2 = g6.f.f75994b;
                    m0 m0VarB = n3.b(0.0f, 0.0f, 0.0f, 0, 7);
                    l lVar4 = lVar3;
                    q qVar7 = qVar5;
                    a42.c cVar = new a42.c((Object) qVar7, (Object) hVar2, (Object) qVar4, (Object) lVar4, (o13.h) eVar, (Object) p1VarC, 9);
                    hVar2 = hVar2;
                    z15 = z18;
                    z02.d.a(z15, eVarC, null, null, m0VarB, z3.f.c(1312535172, cVar, o0VarE), o0VarE, ((i19 >> 24) & 14) | 196656, 12);
                    o0Var = o0VarE;
                    boolean zB = o0Var.B(p1VarC) | o0Var.r(hVar2);
                    if ((i19 & 112) == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z24 = zB | z19;
                    objQ = o0Var.q();
                    if (z24) {
                        objQ = new ak0.m(hVar2, 19, aVar, p1VarC);
                        o0Var.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new ak0.m(hVar2, 19, aVar, p1VarC);
                            o0Var.K(objQ);
                        }
                    }
                    c.w.a(0, 1, (e23.a) objQ, o0Var, false);
                    qVar6 = qVar7;
                    lVar2 = lVar4;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    qVar6 = qVar5;
                    lVar2 = lVar;
                }
                z17 = z15;
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new f(hVar2, aVar, lVar2, qVar, qVar2, pVar, qVar6, qVar4, z17, eVar, i14, i15);
                }
            }
            i16 |= 100663296;
            z15 = z14;
            if ((306783379 & i16) != 306783378) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    s sVar2 = new s(22);
                    int i26 = i16 & (-897);
                    if (i24 != 0) {
                        qVar5 = null;
                    }
                    i19 = i26;
                    if (i17 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    lVar3 = sVar2;
                } else {
                    s sVar3 = new s(22);
                    int i27 = i16 & (-897);
                    if (i24 != 0) {
                        qVar5 = null;
                    }
                    i19 = i27;
                    if (i17 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    lVar3 = sVar3;
                }
                o0VarE.h0();
                x1 x1Var2 = n.f135158a;
                p1VarC = s9.c.c(hVar2.f22558b, o0VarE);
                c.p.f22335a.getClass();
                w wVarA2 = c.p.a(o0VarE);
                z3.e eVarC2 = z3.f.c(1347110272, new z(qVar, wVarA2 != null ? wVarA2.getOnBackPressedDispatcher() : null, qVar2, pVar, p1VarC, 10), o0VarE);
                g6.f.a aVar3 = g6.f.f75994b;
                m0 m0VarB2 = n3.b(0.0f, 0.0f, 0.0f, 0, 7);
                l lVar5 = lVar3;
                q qVar8 = qVar5;
                a42.c cVar2 = new a42.c((Object) qVar8, (Object) hVar2, (Object) qVar4, (Object) lVar5, (o13.h) eVar, (Object) p1VarC, 9);
                hVar2 = hVar2;
                z15 = z18;
                z02.d.a(z15, eVarC2, null, null, m0VarB2, z3.f.c(1312535172, cVar2, o0VarE), o0VarE, ((i19 >> 24) & 14) | 196656, 12);
                o0Var = o0VarE;
                boolean zB2 = o0Var.B(p1VarC) | o0Var.r(hVar2);
                if ((i19 & 112) == 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = zB2 | z19;
                objQ = o0Var.q();
                if (z24) {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new ak0.m(hVar2, 19, aVar, p1VarC);
                        o0Var.K(objQ);
                    }
                } else {
                    objQ = new ak0.m(hVar2, 19, aVar, p1VarC);
                    o0Var.K(objQ);
                }
                c.w.a(0, 1, (e23.a) objQ, o0Var, false);
                qVar6 = qVar8;
                lVar2 = lVar5;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                qVar6 = qVar5;
                lVar2 = lVar;
            }
            z17 = z15;
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new f(hVar2, aVar, lVar2, qVar, qVar2, pVar, qVar6, qVar4, z17, eVar, i14, i15);
            }
        }
        i16 |= 1572864;
        qVar5 = qVar3;
        i17 = i15 & 256;
        if (i17 != 0) {
            if ((100663296 & i14) == 0) {
                z15 = z14;
                if (o0VarE.h(z15)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
                i16 |= i18;
            }
            if ((306783379 & i16) != 306783378) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    s sVar4 = new s(22);
                    int i28 = i16 & (-897);
                    if (i24 != 0) {
                        qVar5 = null;
                    }
                    i19 = i28;
                    if (i17 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    lVar3 = sVar4;
                } else {
                    s sVar5 = new s(22);
                    int i29 = i16 & (-897);
                    if (i24 != 0) {
                        qVar5 = null;
                    }
                    i19 = i29;
                    if (i17 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    lVar3 = sVar5;
                }
                o0VarE.h0();
                x1 x1Var3 = n.f135158a;
                p1VarC = s9.c.c(hVar2.f22558b, o0VarE);
                c.p.f22335a.getClass();
                w wVarA3 = c.p.a(o0VarE);
                z3.e eVarC3 = z3.f.c(1347110272, new z(qVar, wVarA3 != null ? wVarA3.getOnBackPressedDispatcher() : null, qVar2, pVar, p1VarC, 10), o0VarE);
                g6.f.a aVar4 = g6.f.f75994b;
                m0 m0VarB3 = n3.b(0.0f, 0.0f, 0.0f, 0, 7);
                l lVar6 = lVar3;
                q qVar9 = qVar5;
                a42.c cVar3 = new a42.c((Object) qVar9, (Object) hVar2, (Object) qVar4, (Object) lVar6, (o13.h) eVar, (Object) p1VarC, 9);
                hVar2 = hVar2;
                z15 = z18;
                z02.d.a(z15, eVarC3, null, null, m0VarB3, z3.f.c(1312535172, cVar3, o0VarE), o0VarE, ((i19 >> 24) & 14) | 196656, 12);
                o0Var = o0VarE;
                boolean zB3 = o0Var.B(p1VarC) | o0Var.r(hVar2);
                if ((i19 & 112) == 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = zB3 | z19;
                objQ = o0Var.q();
                if (z24) {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new ak0.m(hVar2, 19, aVar, p1VarC);
                        o0Var.K(objQ);
                    }
                } else {
                    objQ = new ak0.m(hVar2, 19, aVar, p1VarC);
                    o0Var.K(objQ);
                }
                c.w.a(0, 1, (e23.a) objQ, o0Var, false);
                qVar6 = qVar9;
                lVar2 = lVar6;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                qVar6 = qVar5;
                lVar2 = lVar;
            }
            z17 = z15;
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new f(hVar2, aVar, lVar2, qVar, qVar2, pVar, qVar6, qVar4, z17, eVar, i14, i15);
            }
        }
        i16 |= 100663296;
        z15 = z14;
        if ((306783379 & i16) != 306783378) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                s sVar6 = new s(22);
                int i210 = i16 & (-897);
                if (i24 != 0) {
                    qVar5 = null;
                }
                i19 = i210;
                if (i17 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                lVar3 = sVar6;
            } else {
                s sVar7 = new s(22);
                int i211 = i16 & (-897);
                if (i24 != 0) {
                    qVar5 = null;
                }
                i19 = i211;
                if (i17 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                lVar3 = sVar7;
            }
            o0VarE.h0();
            x1 x1Var4 = n.f135158a;
            p1VarC = s9.c.c(hVar2.f22558b, o0VarE);
            c.p.f22335a.getClass();
            w wVarA4 = c.p.a(o0VarE);
            z3.e eVarC4 = z3.f.c(1347110272, new z(qVar, wVarA4 != null ? wVarA4.getOnBackPressedDispatcher() : null, qVar2, pVar, p1VarC, 10), o0VarE);
            g6.f.a aVar5 = g6.f.f75994b;
            m0 m0VarB4 = n3.b(0.0f, 0.0f, 0.0f, 0, 7);
            l lVar7 = lVar3;
            q qVar10 = qVar5;
            a42.c cVar4 = new a42.c((Object) qVar10, (Object) hVar2, (Object) qVar4, (Object) lVar7, (o13.h) eVar, (Object) p1VarC, 9);
            hVar2 = hVar2;
            z15 = z18;
            z02.d.a(z15, eVarC4, null, null, m0VarB4, z3.f.c(1312535172, cVar4, o0VarE), o0VarE, ((i19 >> 24) & 14) | 196656, 12);
            o0Var = o0VarE;
            boolean zB4 = o0Var.B(p1VarC) | o0Var.r(hVar2);
            if ((i19 & 112) == 32) {
                z19 = true;
            } else {
                z19 = false;
            }
            z24 = zB4 | z19;
            objQ = o0Var.q();
            if (z24) {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new ak0.m(hVar2, 19, aVar, p1VarC);
                    o0Var.K(objQ);
                }
            } else {
                objQ = new ak0.m(hVar2, 19, aVar, p1VarC);
                o0Var.K(objQ);
            }
            c.w.a(0, 1, (e23.a) objQ, o0Var, false);
            qVar6 = qVar10;
            lVar2 = lVar7;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            qVar6 = qVar5;
            lVar2 = lVar;
        }
        z17 = z15;
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(hVar2, aVar, lVar2, qVar, qVar2, pVar, qVar6, qVar4, z17, eVar, i14, i15);
        }
    }
}
