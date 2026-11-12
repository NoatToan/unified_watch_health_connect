package h51;

import b82.f0;
import c2.x2;
import e23.l;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:101:0x0179  */
    /* JADX WARN: Code duplicated, block: B:104:0x0186  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00be  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:73:0x0104  */
    /* JADX WARN: Code duplicated, block: B:76:0x010c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0114  */
    /* JADX WARN: Code duplicated, block: B:80:0x0116  */
    /* JADX WARN: Code duplicated, block: B:84:0x012a  */
    /* JADX WARN: Code duplicated, block: B:85:0x012c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0134  */
    /* JADX WARN: Code duplicated, block: B:94:0x0141  */
    /* JADX WARN: Code duplicated, block: B:97:0x014a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0151  */
    public static final void a(o51.c cVar, l<? super Long, Unit> lVar, l<? super Long, Unit> lVar2, l<? super Long, Unit> lVar3, m mVar, int i14, int i15) {
        int i16;
        l<? super Long, Unit> lVar4;
        int i17;
        Object obj;
        int i18;
        boolean z14;
        o0 o0Var;
        l<? super Long, Unit> lVar5;
        Object obj2;
        p2 p2VarI0;
        Object obj3;
        z3.e eVarC;
        m.a aVar;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objQ;
        boolean z18;
        e23.a<Unit> aVar2;
        boolean z19;
        boolean z24;
        boolean z25;
        Object objQ2;
        int i19;
        cVar.getClass();
        lVar3.getClass();
        o0 o0VarE = mVar.E(-1086453631);
        if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i24 = i15 & 2;
        if (i24 == 0) {
            if ((i14 & 48) == 0) {
                lVar4 = lVar;
                i16 |= o0VarE.r(lVar4) ? 32 : 16;
            }
            i17 = i15 & 4;
            if (i17 != 0) {
                if ((i14 & 384) == 0) {
                    obj = lVar2;
                    if (o0VarE.r(obj)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i16 |= i18;
                }
                if ((i14 & 3072) == 0) {
                    if (o0VarE.r(lVar3)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i16 |= i19;
                }
                if ((i16 & 1171) != 1170) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i24 != 0) {
                        lVar5 = null;
                    } else {
                        lVar5 = lVar4;
                    }
                    if (i17 != 0) {
                        obj3 = null;
                    } else {
                        obj3 = obj;
                    }
                    x1 x1Var = n.f135158a;
                    l72.p2 p2Var = l72.p2.f111205a;
                    String str = cVar.f129219a;
                    String str2 = cVar.f129220b;
                    r rVarF = x2.f(r.S, 1.0f);
                    z3.e eVarC2 = z3.f.c(1668018191, new fp0.l(cVar, 9), o0VarE);
                    if (obj3 == null) {
                        o0VarE.C(334074923);
                        o0VarE.g0(false);
                        eVarC = null;
                    } else {
                        o0VarE.C(334074924);
                        eVarC = z3.f.c(56804657, new g80.e(13, obj3, cVar), o0VarE);
                        o0VarE.g0(false);
                    }
                    aVar = m.f135153a;
                    if (lVar5 == null) {
                        o0VarE.C(334542527);
                        o0VarE.g0(false);
                        aVar2 = null;
                    } else {
                        o0VarE.C(334542528);
                        if ((i16 & 112) == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if ((i16 & 14) != 4 || ((i16 & 8) != 0 && o0VarE.r(cVar))) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | z15;
                        objQ = o0VarE.q();
                        if (z17) {
                            z18 = false;
                            objQ = new e(lVar5, cVar, 0);
                            o0VarE.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                z18 = false;
                                objQ = new e(lVar5, cVar, 0);
                                o0VarE.K(objQ);
                            } else {
                                z18 = false;
                            }
                        }
                        aVar2 = (e23.a) objQ;
                        o0VarE.g0(z18);
                    }
                    if ((i16 & 7168) == 2048) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean z26 = z19;
                    if ((i16 & 14) != 4 || ((i16 & 8) != 0 && o0VarE.r(cVar))) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = z26 | z24;
                    objQ2 = o0VarE.q();
                    if (z25) {
                        objQ2 = new e(lVar3, cVar, 1);
                        o0VarE.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new e(lVar3, cVar, 1);
                            o0VarE.K(objQ2);
                        }
                    }
                    o0Var = o0VarE;
                    p2Var.h(str, str2, null, rVarF, null, false, false, eVarC2, eVarC, aVar2, (e23.a) objQ2, o0Var, 12585984, 0, 116);
                    obj2 = obj3;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    lVar5 = lVar4;
                    obj2 = obj;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new f0(i14, i15, 11, cVar, lVar5, obj2, lVar3);
                }
            }
            i16 |= 384;
            obj = lVar2;
            if ((i14 & 3072) == 0) {
                if (o0VarE.r(lVar3)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i16 |= i19;
            }
            if ((i16 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i24 != 0) {
                    lVar5 = null;
                } else {
                    lVar5 = lVar4;
                }
                if (i17 != 0) {
                    obj3 = null;
                } else {
                    obj3 = obj;
                }
                x1 x1Var2 = n.f135158a;
                l72.p2 p2Var2 = l72.p2.f111205a;
                String str3 = cVar.f129219a;
                String str4 = cVar.f129220b;
                r rVarF2 = x2.f(r.S, 1.0f);
                z3.e eVarC3 = z3.f.c(1668018191, new fp0.l(cVar, 9), o0VarE);
                if (obj3 == null) {
                    o0VarE.C(334074923);
                    o0VarE.g0(false);
                    eVarC = null;
                } else {
                    o0VarE.C(334074924);
                    eVarC = z3.f.c(56804657, new g80.e(13, obj3, cVar), o0VarE);
                    o0VarE.g0(false);
                }
                aVar = m.f135153a;
                if (lVar5 == null) {
                    o0VarE.C(334542527);
                    o0VarE.g0(false);
                    aVar2 = null;
                } else {
                    o0VarE.C(334542528);
                    if ((i16 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if ((i16 & 14) != 4) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    z17 = z16 | z15;
                    objQ = o0VarE.q();
                    if (z17) {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            z18 = false;
                            objQ = new e(lVar5, cVar, 0);
                            o0VarE.K(objQ);
                        } else {
                            z18 = false;
                        }
                    } else {
                        z18 = false;
                        objQ = new e(lVar5, cVar, 0);
                        o0VarE.K(objQ);
                    }
                    aVar2 = (e23.a) objQ;
                    o0VarE.g0(z18);
                }
                if ((i16 & 7168) == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z27 = z19;
                if ((i16 & 14) != 4) {
                    z24 = true;
                } else {
                    z24 = true;
                }
                z25 = z27 | z24;
                objQ2 = o0VarE.q();
                if (z25) {
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new e(lVar3, cVar, 1);
                        o0VarE.K(objQ2);
                    }
                } else {
                    objQ2 = new e(lVar3, cVar, 1);
                    o0VarE.K(objQ2);
                }
                o0Var = o0VarE;
                p2Var2.h(str3, str4, null, rVarF2, null, false, false, eVarC3, eVarC, aVar2, (e23.a) objQ2, o0Var, 12585984, 0, 116);
                obj2 = obj3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                lVar5 = lVar4;
                obj2 = obj;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new f0(i14, i15, 11, cVar, lVar5, obj2, lVar3);
            }
        }
        i16 |= 48;
        lVar4 = lVar;
        i17 = i15 & 4;
        if (i17 != 0) {
            if ((i14 & 384) == 0) {
                obj = lVar2;
                if (o0VarE.r(obj)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i16 |= i18;
            }
            if ((i14 & 3072) == 0) {
                if (o0VarE.r(lVar3)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i16 |= i19;
            }
            if ((i16 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i24 != 0) {
                    lVar5 = null;
                } else {
                    lVar5 = lVar4;
                }
                if (i17 != 0) {
                    obj3 = null;
                } else {
                    obj3 = obj;
                }
                x1 x1Var3 = n.f135158a;
                l72.p2 p2Var3 = l72.p2.f111205a;
                String str5 = cVar.f129219a;
                String str6 = cVar.f129220b;
                r rVarF3 = x2.f(r.S, 1.0f);
                z3.e eVarC4 = z3.f.c(1668018191, new fp0.l(cVar, 9), o0VarE);
                if (obj3 == null) {
                    o0VarE.C(334074923);
                    o0VarE.g0(false);
                    eVarC = null;
                } else {
                    o0VarE.C(334074924);
                    eVarC = z3.f.c(56804657, new g80.e(13, obj3, cVar), o0VarE);
                    o0VarE.g0(false);
                }
                aVar = m.f135153a;
                if (lVar5 == null) {
                    o0VarE.C(334542527);
                    o0VarE.g0(false);
                    aVar2 = null;
                } else {
                    o0VarE.C(334542528);
                    if ((i16 & 112) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if ((i16 & 14) != 4) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    z17 = z16 | z15;
                    objQ = o0VarE.q();
                    if (z17) {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            z18 = false;
                            objQ = new e(lVar5, cVar, 0);
                            o0VarE.K(objQ);
                        } else {
                            z18 = false;
                        }
                    } else {
                        z18 = false;
                        objQ = new e(lVar5, cVar, 0);
                        o0VarE.K(objQ);
                    }
                    aVar2 = (e23.a) objQ;
                    o0VarE.g0(z18);
                }
                if ((i16 & 7168) == 2048) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean z28 = z19;
                if ((i16 & 14) != 4) {
                    z24 = true;
                } else {
                    z24 = true;
                }
                z25 = z28 | z24;
                objQ2 = o0VarE.q();
                if (z25) {
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new e(lVar3, cVar, 1);
                        o0VarE.K(objQ2);
                    }
                } else {
                    objQ2 = new e(lVar3, cVar, 1);
                    o0VarE.K(objQ2);
                }
                o0Var = o0VarE;
                p2Var3.h(str5, str6, null, rVarF3, null, false, false, eVarC4, eVarC, aVar2, (e23.a) objQ2, o0Var, 12585984, 0, 116);
                obj2 = obj3;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                lVar5 = lVar4;
                obj2 = obj;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new f0(i14, i15, 11, cVar, lVar5, obj2, lVar3);
            }
        }
        i16 |= 384;
        obj = lVar2;
        if ((i14 & 3072) == 0) {
            if (o0VarE.r(lVar3)) {
                i19 = 2048;
            } else {
                i19 = 1024;
            }
            i16 |= i19;
        }
        if ((i16 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i24 != 0) {
                lVar5 = null;
            } else {
                lVar5 = lVar4;
            }
            if (i17 != 0) {
                obj3 = null;
            } else {
                obj3 = obj;
            }
            x1 x1Var4 = n.f135158a;
            l72.p2 p2Var4 = l72.p2.f111205a;
            String str7 = cVar.f129219a;
            String str8 = cVar.f129220b;
            r rVarF4 = x2.f(r.S, 1.0f);
            z3.e eVarC5 = z3.f.c(1668018191, new fp0.l(cVar, 9), o0VarE);
            if (obj3 == null) {
                o0VarE.C(334074923);
                o0VarE.g0(false);
                eVarC = null;
            } else {
                o0VarE.C(334074924);
                eVarC = z3.f.c(56804657, new g80.e(13, obj3, cVar), o0VarE);
                o0VarE.g0(false);
            }
            aVar = m.f135153a;
            if (lVar5 == null) {
                o0VarE.C(334542527);
                o0VarE.g0(false);
                aVar2 = null;
            } else {
                o0VarE.C(334542528);
                if ((i16 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((i16 & 14) != 4) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                z17 = z16 | z15;
                objQ = o0VarE.q();
                if (z17) {
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        z18 = false;
                        objQ = new e(lVar5, cVar, 0);
                        o0VarE.K(objQ);
                    } else {
                        z18 = false;
                    }
                } else {
                    z18 = false;
                    objQ = new e(lVar5, cVar, 0);
                    o0VarE.K(objQ);
                }
                aVar2 = (e23.a) objQ;
                o0VarE.g0(z18);
            }
            if ((i16 & 7168) == 2048) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean z29 = z19;
            if ((i16 & 14) != 4) {
                z24 = true;
            } else {
                z24 = true;
            }
            z25 = z29 | z24;
            objQ2 = o0VarE.q();
            if (z25) {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new e(lVar3, cVar, 1);
                    o0VarE.K(objQ2);
                }
            } else {
                objQ2 = new e(lVar3, cVar, 1);
                o0VarE.K(objQ2);
            }
            o0Var = o0VarE;
            p2Var4.h(str7, str8, null, rVarF4, null, false, false, eVarC5, eVarC, aVar2, (e23.a) objQ2, o0Var, 12585984, 0, 116);
            obj2 = obj3;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            lVar5 = lVar4;
            obj2 = obj;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(i14, i15, 11, cVar, lVar5, obj2, lVar3);
        }
    }
}
