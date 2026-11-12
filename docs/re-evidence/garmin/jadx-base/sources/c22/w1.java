package c22;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final class w1 {
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:61:0x010a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0136  */
    /* JADX WARN: Code duplicated, block: B:66:0x014a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0175  */
    /* JADX WARN: Code duplicated, block: B:70:0x0183  */
    /* JADX WARN: Code duplicated, block: B:73:0x018e  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(long j8, String str, String str2, boolean z14, h4.r rVar, p3.m mVar, int i14, int i15) {
        boolean z15;
        int i16;
        h4.r rVar2;
        int i17;
        boolean z16;
        boolean z17;
        h4.r rVar3;
        p3.p2 p2VarI0;
        boolean z18;
        h4.r rVar4;
        Object objQ;
        p3.m.a.C2565a c2565a;
        p3.p1 p1Var;
        Object objQ2;
        p3.p1 p1Var2;
        Object objQ3;
        Object objQ4;
        str.getClass();
        p3.o0 o0VarE = mVar.E(844446091);
        int i18 = (o0VarE.l(j8) ? 4 : 2) | i14 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128);
        int i19 = i15 & 8;
        if (i19 == 0) {
            if ((i14 & 3072) == 0) {
                z15 = z14;
                i18 |= o0VarE.h(z15) ? 2048 : 1024;
            }
            i16 = i15 & 16;
            if (i16 != 0) {
                if ((i14 & 24576) == 0) {
                    rVar2 = rVar;
                    if (o0VarE.B(rVar2)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i18 |= i17;
                }
                if ((i18 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (o0VarE.n(i18 & 1, z16)) {
                    if (i19 != 0) {
                        z18 = true;
                    } else {
                        z18 = z15;
                    }
                    if (i16 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    p3.x1 x1Var = p3.n.f135158a;
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        f12.l.f68084a.getClass();
                        objQ = p3.p0.n(f12.l.a.a());
                        o0VarE.K(objQ);
                    }
                    p1Var = (p3.p1) objQ;
                    objQ2 = o0VarE.q();
                    if (objQ2 == c2565a) {
                        objQ2 = hb.a.n(((f12.l) p1Var.getF182175a()).Y3(j8) && z18, o0VarE);
                    }
                    p1Var2 = (p3.p1) objQ2;
                    l72.p2.f111205a.f(rVar4, z3.f.c(1821046579, new a42.a(str2, 11, str, p1Var2), o0VarE), null, false, false, null, null, o0VarE, ((i18 >> 12) & 14) | 48, 124);
                    h4.r rVar5 = rVar4;
                    if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                        o0VarE.C(1271629744);
                        ((f12.l) p1Var.getF182175a()).g3(j8);
                        l72.c1 c1Var = l72.c1.f110940a;
                        String strQ = gl1.y.Q(o0VarE, R.string.lbl_managing_child);
                        String strQ2 = gl1.y.Q(o0VarE, R.string.msg_managing_child_notice);
                        String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_ok);
                        objQ3 = o0VarE.q();
                        if (objQ3 == c2565a) {
                            objQ3 = new ak0.z(p1Var2, 21);
                            o0VarE.K(objQ3);
                        }
                        e23.a<Unit> aVar = (e23.a) objQ3;
                        objQ4 = o0VarE.q();
                        if (objQ4 == c2565a) {
                            objQ4 = new ak0.z(p1Var2, 22);
                            o0VarE.K(objQ4);
                        }
                        c1Var.a(true, strQ, strQ2, null, null, strQ3, false, false, aVar, null, (e23.a) objQ4, o0VarE, 100663302, 6, 728);
                        o0VarE = o0VarE;
                        o0VarE.g0(false);
                    } else {
                        o0VarE = o0VarE;
                        o0VarE.C(1272066999);
                        o0VarE.g0(false);
                    }
                    z17 = z18;
                    rVar3 = rVar5;
                } else {
                    o0VarE.e();
                    z17 = z15;
                    rVar3 = rVar2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new v1(j8, str, str2, z17, rVar3, i14, i15);
                }
            }
            i18 |= 24576;
            rVar2 = rVar;
            if ((i18 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i18 & 1, z16)) {
                if (i19 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                if (i16 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                p3.x1 x1Var2 = p3.n.f135158a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    f12.l.f68084a.getClass();
                    objQ = p3.p0.n(f12.l.a.a());
                    o0VarE.K(objQ);
                }
                p1Var = (p3.p1) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = hb.a.n(((f12.l) p1Var.getF182175a()).Y3(j8) && z18, o0VarE);
                }
                p1Var2 = (p3.p1) objQ2;
                l72.p2.f111205a.f(rVar4, z3.f.c(1821046579, new a42.a(str2, 11, str, p1Var2), o0VarE), null, false, false, null, null, o0VarE, ((i18 >> 12) & 14) | 48, 124);
                h4.r rVar6 = rVar4;
                if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    o0VarE.C(1271629744);
                    ((f12.l) p1Var.getF182175a()).g3(j8);
                    l72.c1 c1Var2 = l72.c1.f110940a;
                    String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_managing_child);
                    String strQ5 = gl1.y.Q(o0VarE, R.string.msg_managing_child_notice);
                    String strQ6 = gl1.y.Q(o0VarE, R.string.lbl_ok);
                    objQ3 = o0VarE.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new ak0.z(p1Var2, 21);
                        o0VarE.K(objQ3);
                    }
                    e23.a<Unit> aVar2 = (e23.a) objQ3;
                    objQ4 = o0VarE.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new ak0.z(p1Var2, 22);
                        o0VarE.K(objQ4);
                    }
                    c1Var2.a(true, strQ4, strQ5, null, null, strQ6, false, false, aVar2, null, (e23.a) objQ4, o0VarE, 100663302, 6, 728);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    o0VarE = o0VarE;
                    o0VarE.C(1272066999);
                    o0VarE.g0(false);
                }
                z17 = z18;
                rVar3 = rVar6;
            } else {
                o0VarE.e();
                z17 = z15;
                rVar3 = rVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new v1(j8, str, str2, z17, rVar3, i14, i15);
            }
        }
        i18 |= 3072;
        z15 = z14;
        i16 = i15 & 16;
        if (i16 != 0) {
            if ((i14 & 24576) == 0) {
                rVar2 = rVar;
                if (o0VarE.B(rVar2)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i18 |= i17;
            }
            if ((i18 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i18 & 1, z16)) {
                if (i19 != 0) {
                    z18 = true;
                } else {
                    z18 = z15;
                }
                if (i16 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                p3.x1 x1Var3 = p3.n.f135158a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    f12.l.f68084a.getClass();
                    objQ = p3.p0.n(f12.l.a.a());
                    o0VarE.K(objQ);
                }
                p1Var = (p3.p1) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = hb.a.n(((f12.l) p1Var.getF182175a()).Y3(j8) && z18, o0VarE);
                }
                p1Var2 = (p3.p1) objQ2;
                l72.p2.f111205a.f(rVar4, z3.f.c(1821046579, new a42.a(str2, 11, str, p1Var2), o0VarE), null, false, false, null, null, o0VarE, ((i18 >> 12) & 14) | 48, 124);
                h4.r rVar7 = rVar4;
                if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    o0VarE.C(1271629744);
                    ((f12.l) p1Var.getF182175a()).g3(j8);
                    l72.c1 c1Var3 = l72.c1.f110940a;
                    String strQ7 = gl1.y.Q(o0VarE, R.string.lbl_managing_child);
                    String strQ8 = gl1.y.Q(o0VarE, R.string.msg_managing_child_notice);
                    String strQ9 = gl1.y.Q(o0VarE, R.string.lbl_ok);
                    objQ3 = o0VarE.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new ak0.z(p1Var2, 21);
                        o0VarE.K(objQ3);
                    }
                    e23.a<Unit> aVar3 = (e23.a) objQ3;
                    objQ4 = o0VarE.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new ak0.z(p1Var2, 22);
                        o0VarE.K(objQ4);
                    }
                    c1Var3.a(true, strQ7, strQ8, null, null, strQ9, false, false, aVar3, null, (e23.a) objQ4, o0VarE, 100663302, 6, 728);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    o0VarE = o0VarE;
                    o0VarE.C(1272066999);
                    o0VarE.g0(false);
                }
                z17 = z18;
                rVar3 = rVar7;
            } else {
                o0VarE.e();
                z17 = z15;
                rVar3 = rVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new v1(j8, str, str2, z17, rVar3, i14, i15);
            }
        }
        i18 |= 24576;
        rVar2 = rVar;
        if ((i18 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i18 & 1, z16)) {
            if (i19 != 0) {
                z18 = true;
            } else {
                z18 = z15;
            }
            if (i16 != 0) {
                rVar4 = h4.r.S;
            } else {
                rVar4 = rVar2;
            }
            p3.x1 x1Var4 = p3.n.f135158a;
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                f12.l.f68084a.getClass();
                objQ = p3.p0.n(f12.l.a.a());
                o0VarE.K(objQ);
            }
            p1Var = (p3.p1) objQ;
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = hb.a.n(((f12.l) p1Var.getF182175a()).Y3(j8) && z18, o0VarE);
            }
            p1Var2 = (p3.p1) objQ2;
            l72.p2.f111205a.f(rVar4, z3.f.c(1821046579, new a42.a(str2, 11, str, p1Var2), o0VarE), null, false, false, null, null, o0VarE, ((i18 >> 12) & 14) | 48, 124);
            h4.r rVar8 = rVar4;
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(1271629744);
                ((f12.l) p1Var.getF182175a()).g3(j8);
                l72.c1 c1Var4 = l72.c1.f110940a;
                String strQ10 = gl1.y.Q(o0VarE, R.string.lbl_managing_child);
                String strQ11 = gl1.y.Q(o0VarE, R.string.msg_managing_child_notice);
                String strQ12 = gl1.y.Q(o0VarE, R.string.lbl_ok);
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = new ak0.z(p1Var2, 21);
                    o0VarE.K(objQ3);
                }
                e23.a<Unit> aVar4 = (e23.a) objQ3;
                objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = new ak0.z(p1Var2, 22);
                    o0VarE.K(objQ4);
                }
                c1Var4.a(true, strQ10, strQ11, null, null, strQ12, false, false, aVar4, null, (e23.a) objQ4, o0VarE, 100663302, 6, 728);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE = o0VarE;
                o0VarE.C(1272066999);
                o0VarE.g0(false);
            }
            z17 = z18;
            rVar3 = rVar8;
        } else {
            o0VarE.e();
            z17 = z15;
            rVar3 = rVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v1(j8, str, str2, z17, rVar3, i14, i15);
        }
    }
}
