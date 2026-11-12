package g02;

import c2.x2;
import i3.ve;
import l72.v2;
import p005kotlin.Metadata;
import p3.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg02/b0;", "", "<init>", "()V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f74326a = new b0();

    private b0() {
    }

    public final void a(String str, String str2, String str3, h4.r rVar, boolean z14, e23.p pVar, e23.p pVar2, e23.a aVar, p3.m mVar, int i14, int i15) {
        e23.a aVar2;
        int i16;
        h4.r rVar2;
        boolean z15;
        e23.a aVar3;
        e23.a aVar4;
        str.getClass();
        p3.o0 o0VarE = mVar.E(1695419778);
        int i17 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(str3) ? 256 : 128);
        int i18 = 100862976 | i17;
        int i19 = i15 & 512;
        if (i19 != 0) {
            i16 = i17 | 906169344;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i16 = i18 | (o0VarE.r(aVar2) ? 536870912 : 268435456);
        }
        if (o0VarE.n(i16 & 1, (306775187 & i16) != 306775186)) {
            h4.r.a aVar5 = h4.r.S;
            if (i19 != 0) {
                aVar2 = null;
            }
            e23.a aVar6 = aVar2;
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarA = v2.a(x2.f(aVar5, 1.0f), false, new fx0.a(9), o0VarE, 0);
            boolean z16 = aVar6 != null;
            if (aVar6 == null) {
                o0VarE.C(-564011810);
                Object objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new g01.q(26);
                    o0VarE.K(objQ);
                }
                o0VarE.g0(false);
                aVar4 = (e23.a) objQ;
            } else {
                o0VarE.C(1505826383);
                o0VarE.g0(false);
                aVar4 = aVar6;
            }
            ve.a(u1.w.f(238, null, aVar4, rVarA, null, z16), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(1733291037, new et.p(pVar, pVar2, str, str2, str3, 7), o0VarE), o0VarE, 12582912, 122);
            z15 = true;
            aVar3 = aVar6;
            rVar2 = aVar5;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            z15 = z14;
            aVar3 = aVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a11.v(this, str, str2, str3, rVar2, z15, pVar, pVar2, aVar3, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00de A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:83:0x010d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0150  */
    /* JADX WARN: Code duplicated, block: B:89:0x015d  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public final void b(String str, s5.c cVar, h4.r rVar, boolean z14, e23.p pVar, e23.a aVar, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        int i17;
        boolean z15;
        int i18;
        e23.p pVar2;
        int i19;
        int i24;
        e23.a aVar2;
        int i25;
        boolean z16;
        p3.o0 o0Var;
        boolean z17;
        e23.a aVar3;
        p2 p2VarI0;
        h4.r rVar3;
        boolean z18;
        boolean z19;
        e23.a aVar4;
        Object objQ;
        int i26;
        str.getClass();
        p3.o0 o0VarE = mVar.E(730017668);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(cVar) ? 32 : 16;
        }
        int i27 = i15 & 4;
        if (i27 == 0) {
            if ((i14 & 384) == 0) {
                rVar2 = rVar;
                i16 |= o0VarE.B(rVar2) ? 256 : 128;
            }
            i17 = i15 & 16;
            if (i17 != 0) {
                if ((i14 & 24576) == 0) {
                    z15 = z14;
                    if (o0VarE.h(z15)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i16 |= i18;
                }
                if ((196608 & i14) == 0) {
                    pVar2 = pVar;
                    if (o0VarE.r(pVar2)) {
                        i26 = 131072;
                    } else {
                        i26 = 65536;
                    }
                    i16 |= i26;
                } else {
                    pVar2 = pVar;
                }
                i19 = 14155776 | i16;
                i24 = i15 & 256;
                if (i24 != 0) {
                    if ((100663296 & i14) == 0) {
                        aVar2 = aVar;
                        if (o0VarE.r(aVar2)) {
                            i25 = 67108864;
                        } else {
                            i25 = 33554432;
                        }
                        i19 |= i25;
                    }
                    if ((38346899 & i19) != 38346898) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (o0VarE.n(i19 & 1, z16)) {
                        if (i27 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i17 != 0) {
                            z18 = true;
                        } else {
                            z18 = z15;
                        }
                        if (i24 != 0) {
                            aVar2 = null;
                        }
                        p3.x1 x1Var = p3.n.f135158a;
                        h4.r rVarA = v2.a(x2.f(rVar3, 1.0f), !z18, new fx0.a(3), o0VarE, 0);
                        if (z18 || aVar2 == null) {
                            z19 = false;
                        } else {
                            z19 = true;
                        }
                        if (aVar2 == null) {
                            o0VarE.C(-1757243908);
                            objQ = o0VarE.q();
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new g01.q(25);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            aVar4 = (e23.a) objQ;
                        } else {
                            o0VarE.C(1467335025);
                            o0VarE.g0(false);
                            aVar4 = aVar2;
                        }
                        o0Var = o0VarE;
                        ve.a(u1.w.f(238, null, aVar4, rVarA, null, z19), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-965558945, new ad0.g(pVar2, z18, str, cVar, 12), o0VarE), o0Var, 12582912, 122);
                        z17 = z18;
                        rVar2 = rVar3;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        z17 = z15;
                    }
                    aVar3 = aVar2;
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new da0.n(this, str, cVar, rVar2, z17, pVar, aVar3, i14, i15);
                    }
                }
                i19 = 114819072 | i16;
                aVar2 = aVar;
                if ((38346899 & i19) != 38346898) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i19 & 1, z16)) {
                    if (i27 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    if (i24 != 0) {
                        aVar2 = null;
                    }
                    p3.x1 x1Var2 = p3.n.f135158a;
                    h4.r rVarA2 = v2.a(x2.f(rVar3, 1.0f), !z18, new fx0.a(3), o0VarE, 0);
                    if (z18) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    if (aVar2 == null) {
                        o0VarE.C(-1757243908);
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new g01.q(25);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        aVar4 = (e23.a) objQ;
                    } else {
                        o0VarE.C(1467335025);
                        o0VarE.g0(false);
                        aVar4 = aVar2;
                    }
                    o0Var = o0VarE;
                    ve.a(u1.w.f(238, null, aVar4, rVarA2, null, z19), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-965558945, new ad0.g(pVar2, z18, str, cVar, 12), o0VarE), o0Var, 12582912, 122);
                    z17 = z18;
                    rVar2 = rVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    z17 = z15;
                }
                aVar3 = aVar2;
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new da0.n(this, str, cVar, rVar2, z17, pVar, aVar3, i14, i15);
                }
            }
            i16 |= 24576;
            z15 = z14;
            if ((196608 & i14) == 0) {
                pVar2 = pVar;
                if (o0VarE.r(pVar2)) {
                    i26 = 131072;
                } else {
                    i26 = 65536;
                }
                i16 |= i26;
            } else {
                pVar2 = pVar;
            }
            i19 = 14155776 | i16;
            i24 = i15 & 256;
            if (i24 != 0) {
                if ((100663296 & i14) == 0) {
                    aVar2 = aVar;
                    if (o0VarE.r(aVar2)) {
                        i25 = 67108864;
                    } else {
                        i25 = 33554432;
                    }
                    i19 |= i25;
                }
                if ((38346899 & i19) != 38346898) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i19 & 1, z16)) {
                    if (i27 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    if (i24 != 0) {
                        aVar2 = null;
                    }
                    p3.x1 x1Var3 = p3.n.f135158a;
                    h4.r rVarA3 = v2.a(x2.f(rVar3, 1.0f), !z18, new fx0.a(3), o0VarE, 0);
                    if (z18) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    if (aVar2 == null) {
                        o0VarE.C(-1757243908);
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new g01.q(25);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        aVar4 = (e23.a) objQ;
                    } else {
                        o0VarE.C(1467335025);
                        o0VarE.g0(false);
                        aVar4 = aVar2;
                    }
                    o0Var = o0VarE;
                    ve.a(u1.w.f(238, null, aVar4, rVarA3, null, z19), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-965558945, new ad0.g(pVar2, z18, str, cVar, 12), o0VarE), o0Var, 12582912, 122);
                    z17 = z18;
                    rVar2 = rVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    z17 = z15;
                }
                aVar3 = aVar2;
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new da0.n(this, str, cVar, rVar2, z17, pVar, aVar3, i14, i15);
                }
            }
            i19 = 114819072 | i16;
            aVar2 = aVar;
            if ((38346899 & i19) != 38346898) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i19 & 1, z16)) {
                if (i27 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i17 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                if (i24 != 0) {
                    aVar2 = null;
                }
                p3.x1 x1Var4 = p3.n.f135158a;
                h4.r rVarA4 = v2.a(x2.f(rVar3, 1.0f), !z18, new fx0.a(3), o0VarE, 0);
                if (z18) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                if (aVar2 == null) {
                    o0VarE.C(-1757243908);
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new g01.q(25);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    aVar4 = (e23.a) objQ;
                } else {
                    o0VarE.C(1467335025);
                    o0VarE.g0(false);
                    aVar4 = aVar2;
                }
                o0Var = o0VarE;
                ve.a(u1.w.f(238, null, aVar4, rVarA4, null, z19), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-965558945, new ad0.g(pVar2, z18, str, cVar, 12), o0VarE), o0Var, 12582912, 122);
                z17 = z18;
                rVar2 = rVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                z17 = z15;
            }
            aVar3 = aVar2;
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new da0.n(this, str, cVar, rVar2, z17, pVar, aVar3, i14, i15);
            }
        }
        i16 |= 384;
        rVar2 = rVar;
        i17 = i15 & 16;
        if (i17 != 0) {
            if ((i14 & 24576) == 0) {
                z15 = z14;
                if (o0VarE.h(z15)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i16 |= i18;
            }
            if ((196608 & i14) == 0) {
                pVar2 = pVar;
                if (o0VarE.r(pVar2)) {
                    i26 = 131072;
                } else {
                    i26 = 65536;
                }
                i16 |= i26;
            } else {
                pVar2 = pVar;
            }
            i19 = 14155776 | i16;
            i24 = i15 & 256;
            if (i24 != 0) {
                if ((100663296 & i14) == 0) {
                    aVar2 = aVar;
                    if (o0VarE.r(aVar2)) {
                        i25 = 67108864;
                    } else {
                        i25 = 33554432;
                    }
                    i19 |= i25;
                }
                if ((38346899 & i19) != 38346898) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i19 & 1, z16)) {
                    if (i27 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    if (i24 != 0) {
                        aVar2 = null;
                    }
                    p3.x1 x1Var5 = p3.n.f135158a;
                    h4.r rVarA5 = v2.a(x2.f(rVar3, 1.0f), !z18, new fx0.a(3), o0VarE, 0);
                    if (z18) {
                        z19 = false;
                    } else {
                        z19 = false;
                    }
                    if (aVar2 == null) {
                        o0VarE.C(-1757243908);
                        objQ = o0VarE.q();
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new g01.q(25);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        aVar4 = (e23.a) objQ;
                    } else {
                        o0VarE.C(1467335025);
                        o0VarE.g0(false);
                        aVar4 = aVar2;
                    }
                    o0Var = o0VarE;
                    ve.a(u1.w.f(238, null, aVar4, rVarA5, null, z19), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-965558945, new ad0.g(pVar2, z18, str, cVar, 12), o0VarE), o0Var, 12582912, 122);
                    z17 = z18;
                    rVar2 = rVar3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    z17 = z15;
                }
                aVar3 = aVar2;
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new da0.n(this, str, cVar, rVar2, z17, pVar, aVar3, i14, i15);
                }
            }
            i19 = 114819072 | i16;
            aVar2 = aVar;
            if ((38346899 & i19) != 38346898) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i19 & 1, z16)) {
                if (i27 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i17 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                if (i24 != 0) {
                    aVar2 = null;
                }
                p3.x1 x1Var6 = p3.n.f135158a;
                h4.r rVarA6 = v2.a(x2.f(rVar3, 1.0f), !z18, new fx0.a(3), o0VarE, 0);
                if (z18) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                if (aVar2 == null) {
                    o0VarE.C(-1757243908);
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new g01.q(25);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    aVar4 = (e23.a) objQ;
                } else {
                    o0VarE.C(1467335025);
                    o0VarE.g0(false);
                    aVar4 = aVar2;
                }
                o0Var = o0VarE;
                ve.a(u1.w.f(238, null, aVar4, rVarA6, null, z19), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-965558945, new ad0.g(pVar2, z18, str, cVar, 12), o0VarE), o0Var, 12582912, 122);
                z17 = z18;
                rVar2 = rVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                z17 = z15;
            }
            aVar3 = aVar2;
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new da0.n(this, str, cVar, rVar2, z17, pVar, aVar3, i14, i15);
            }
        }
        i16 |= 24576;
        z15 = z14;
        if ((196608 & i14) == 0) {
            pVar2 = pVar;
            if (o0VarE.r(pVar2)) {
                i26 = 131072;
            } else {
                i26 = 65536;
            }
            i16 |= i26;
        } else {
            pVar2 = pVar;
        }
        i19 = 14155776 | i16;
        i24 = i15 & 256;
        if (i24 != 0) {
            if ((100663296 & i14) == 0) {
                aVar2 = aVar;
                if (o0VarE.r(aVar2)) {
                    i25 = 67108864;
                } else {
                    i25 = 33554432;
                }
                i19 |= i25;
            }
            if ((38346899 & i19) != 38346898) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i19 & 1, z16)) {
                if (i27 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i17 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                if (i24 != 0) {
                    aVar2 = null;
                }
                p3.x1 x1Var7 = p3.n.f135158a;
                h4.r rVarA7 = v2.a(x2.f(rVar3, 1.0f), !z18, new fx0.a(3), o0VarE, 0);
                if (z18) {
                    z19 = false;
                } else {
                    z19 = false;
                }
                if (aVar2 == null) {
                    o0VarE.C(-1757243908);
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new g01.q(25);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    aVar4 = (e23.a) objQ;
                } else {
                    o0VarE.C(1467335025);
                    o0VarE.g0(false);
                    aVar4 = aVar2;
                }
                o0Var = o0VarE;
                ve.a(u1.w.f(238, null, aVar4, rVarA7, null, z19), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-965558945, new ad0.g(pVar2, z18, str, cVar, 12), o0VarE), o0Var, 12582912, 122);
                z17 = z18;
                rVar2 = rVar3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                z17 = z15;
            }
            aVar3 = aVar2;
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new da0.n(this, str, cVar, rVar2, z17, pVar, aVar3, i14, i15);
            }
        }
        i19 = 114819072 | i16;
        aVar2 = aVar;
        if ((38346899 & i19) != 38346898) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i19 & 1, z16)) {
            if (i27 != 0) {
                rVar3 = h4.r.S;
            } else {
                rVar3 = rVar2;
            }
            if (i17 != 0) {
                z18 = true;
            } else {
                z18 = z15;
            }
            if (i24 != 0) {
                aVar2 = null;
            }
            p3.x1 x1Var8 = p3.n.f135158a;
            h4.r rVarA8 = v2.a(x2.f(rVar3, 1.0f), !z18, new fx0.a(3), o0VarE, 0);
            if (z18) {
                z19 = false;
            } else {
                z19 = false;
            }
            if (aVar2 == null) {
                o0VarE.C(-1757243908);
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new g01.q(25);
                    o0VarE.K(objQ);
                }
                o0VarE.g0(false);
                aVar4 = (e23.a) objQ;
            } else {
                o0VarE.C(1467335025);
                o0VarE.g0(false);
                aVar4 = aVar2;
            }
            o0Var = o0VarE;
            ve.a(u1.w.f(238, null, aVar4, rVarA8, null, z19), null, am.j.c(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(-965558945, new ad0.g(pVar2, z18, str, cVar, 12), o0VarE), o0Var, 12582912, 122);
            z17 = z18;
            rVar2 = rVar3;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            z17 = z15;
        }
        aVar3 = aVar2;
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new da0.n(this, str, cVar, rVar2, z17, pVar, aVar3, i14, i15);
        }
    }
}
