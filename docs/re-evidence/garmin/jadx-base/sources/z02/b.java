package z02;

import a11.u;
import a6.g;
import c22.l;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiControllerKt;
import e23.p;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.l0;
import p3.m;
import p3.n2;
import p3.o0;
import p3.p2;
import p3.v;
import p3.x1;
import r22.z1;
import u1.n;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f200732a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f200732a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x007c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:41:0x0089  */
    /* JADX WARN: Code duplicated, block: B:44:0x008e  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:74:0x010b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0149  */
    /* JADX WARN: Code duplicated, block: B:80:0x0158  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    public static final void a(boolean z14, d92.a aVar, d92.a aVar2, l lVar, boolean z15, p<? super m, ? super Integer, Unit> pVar, m mVar, int i14, int i15) {
        d92.a aVarB;
        int i16;
        int i17;
        int i18;
        boolean z16;
        int i19;
        boolean z17;
        p<? super m, ? super Integer, Unit> pVar2;
        d92.a aVarA;
        l lVarA;
        boolean z18;
        boolean z19;
        p2 p2VarI0;
        int i24;
        d92.a aVar3;
        int i25;
        gl.a aVarB2;
        Object objQ;
        m.a.C2565a c2565a;
        Object objQ2;
        pVar.getClass();
        o0 o0VarE = mVar.E(686244074);
        int i26 = i14 | 2 | (((i15 & 2) == 0 && o0VarE.B(aVar)) ? 32 : 16);
        if ((i15 & 4) == 0) {
            aVarB = aVar2;
            int i27 = o0VarE.B(aVarB) ? 256 : 128;
            i16 = i26 | i27;
            i17 = i16 | 1024;
            i18 = i15 & 16;
            if (i18 != 0) {
                if ((i14 & 24576) == 0) {
                    z16 = z15;
                    if (o0VarE.h(z16)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i17 |= i19;
                }
                if ((74899 & i17) != 74898) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (o0VarE.n(i17 & 1, z17)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0 || o0VarE.o0()) {
                        z14 = n.h(o0VarE);
                        if ((i15 & 2) != 0) {
                            aVarA = j92.a.a();
                        } else {
                            aVarA = aVar;
                        }
                        if ((i15 & 4) != 0) {
                            aVarB = j92.a.b();
                        }
                        lVarA = ((z1) KoinJavaComponent.get$default(z1.class, null, null, 6, null)).a();
                        if (i18 != 0) {
                            z16 = false;
                        }
                    } else {
                        o0VarE.e();
                        aVarA = aVar;
                        lVarA = lVar;
                    }
                    o0VarE.h0();
                    x1 x1Var = p3.n.f135158a;
                    int[] iArr = a.f200732a;
                    i24 = iArr[lVarA.ordinal()];
                    if (i24 == 1) {
                        aVar3 = aVarB;
                    } else {
                        if (i24 != 2) {
                            if (i24 == 3) {
                                u0.r();
                                return;
                            } else if (z14) {
                                aVar3 = aVarB;
                            }
                        }
                        aVar3 = aVarA;
                    }
                    boolean zG = s.g(aVar3, aVarA);
                    i25 = iArr[lVarA.ordinal()];
                    if (i25 != 1) {
                        aVarB2 = gl.d.b();
                    } else if (i25 != 2) {
                        aVarB2 = gl.d.a();
                    } else if (i25 == 3) {
                        u0.r();
                        return;
                    } else if (z14) {
                        aVarB2 = gl.d.a();
                    } else {
                        aVarB2 = gl.d.b();
                    }
                    objQ = o0VarE.q();
                    m.f135153a.getClass();
                    c2565a = m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = d92.a.a(aVar3, null, 2047);
                        o0VarE.K(objQ);
                    }
                    d92.a aVar4 = (d92.a) objQ;
                    jg.b.S(aVar4, aVar3);
                    objQ2 = o0VarE.q();
                    if (objQ2 == c2565a) {
                        objQ2 = gl.a.a(aVarB2);
                        o0VarE.K(objQ2);
                    }
                    gl.a aVar5 = (gl.a) objQ2;
                    gl.b.T(aVar5, aVarB2);
                    n2[] n2VarArr = {gl.d.f77768a.c(aVar5), d92.c.f58627a.c(aVar4), d92.c.f58628b.c(Boolean.valueOf(zG))};
                    pVar2 = pVar;
                    v.b(n2VarArr, z3.f.c(-1290865622, new u(z14, z16, pVar2, 8), o0VarE), o0VarE, 56);
                } else {
                    pVar2 = pVar;
                    o0VarE.e();
                    aVarA = aVar;
                    lVarA = lVar;
                }
                z18 = z16;
                z19 = z14;
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new at.a(z19, aVarA, aVarB, lVarA, z18, pVar2, i14, i15);
                }
            }
            i17 = i16 | 25600;
            z16 = z15;
            if ((74899 & i17) != 74898) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i17 & 1, z17)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    z14 = n.h(o0VarE);
                    if ((i15 & 2) != 0) {
                        aVarA = j92.a.a();
                    } else {
                        aVarA = aVar;
                    }
                    if ((i15 & 4) != 0) {
                        aVarB = j92.a.b();
                    }
                    lVarA = ((z1) KoinJavaComponent.get$default(z1.class, null, null, 6, null)).a();
                    if (i18 != 0) {
                        z16 = false;
                    }
                } else {
                    z14 = n.h(o0VarE);
                    if ((i15 & 2) != 0) {
                        aVarA = j92.a.a();
                    } else {
                        aVarA = aVar;
                    }
                    if ((i15 & 4) != 0) {
                        aVarB = j92.a.b();
                    }
                    lVarA = ((z1) KoinJavaComponent.get$default(z1.class, null, null, 6, null)).a();
                    if (i18 != 0) {
                        z16 = false;
                    }
                }
                o0VarE.h0();
                x1 x1Var2 = p3.n.f135158a;
                int[] iArr2 = a.f200732a;
                i24 = iArr2[lVarA.ordinal()];
                if (i24 == 1) {
                    aVar3 = aVarB;
                } else {
                    if (i24 != 2) {
                        if (i24 == 3) {
                            u0.r();
                            return;
                        } else if (z14) {
                            aVar3 = aVarB;
                        }
                    }
                    aVar3 = aVarA;
                }
                boolean zG2 = s.g(aVar3, aVarA);
                i25 = iArr2[lVarA.ordinal()];
                if (i25 != 1) {
                    aVarB2 = gl.d.b();
                } else if (i25 != 2) {
                    aVarB2 = gl.d.a();
                } else if (i25 == 3) {
                    u0.r();
                    return;
                } else if (z14) {
                    aVarB2 = gl.d.a();
                } else {
                    aVarB2 = gl.d.b();
                }
                objQ = o0VarE.q();
                m.f135153a.getClass();
                c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = d92.a.a(aVar3, null, 2047);
                    o0VarE.K(objQ);
                }
                d92.a aVar6 = (d92.a) objQ;
                jg.b.S(aVar6, aVar3);
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = gl.a.a(aVarB2);
                    o0VarE.K(objQ2);
                }
                gl.a aVar7 = (gl.a) objQ2;
                gl.b.T(aVar7, aVarB2);
                n2[] n2VarArr2 = {gl.d.f77768a.c(aVar7), d92.c.f58627a.c(aVar6), d92.c.f58628b.c(Boolean.valueOf(zG2))};
                pVar2 = pVar;
                v.b(n2VarArr2, z3.f.c(-1290865622, new u(z14, z16, pVar2, 8), o0VarE), o0VarE, 56);
            } else {
                pVar2 = pVar;
                o0VarE.e();
                aVarA = aVar;
                lVarA = lVar;
            }
            z18 = z16;
            z19 = z14;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new at.a(z19, aVarA, aVarB, lVarA, z18, pVar2, i14, i15);
            }
        }
        aVarB = aVar2;
        i16 = i26 | i27;
        i17 = i16 | 1024;
        i18 = i15 & 16;
        if (i18 != 0) {
            if ((i14 & 24576) == 0) {
                z16 = z15;
                if (o0VarE.h(z16)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i17 |= i19;
            }
            if ((74899 & i17) != 74898) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i17 & 1, z17)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    z14 = n.h(o0VarE);
                    if ((i15 & 2) != 0) {
                        aVarA = j92.a.a();
                    } else {
                        aVarA = aVar;
                    }
                    if ((i15 & 4) != 0) {
                        aVarB = j92.a.b();
                    }
                    lVarA = ((z1) KoinJavaComponent.get$default(z1.class, null, null, 6, null)).a();
                    if (i18 != 0) {
                        z16 = false;
                    }
                } else {
                    z14 = n.h(o0VarE);
                    if ((i15 & 2) != 0) {
                        aVarA = j92.a.a();
                    } else {
                        aVarA = aVar;
                    }
                    if ((i15 & 4) != 0) {
                        aVarB = j92.a.b();
                    }
                    lVarA = ((z1) KoinJavaComponent.get$default(z1.class, null, null, 6, null)).a();
                    if (i18 != 0) {
                        z16 = false;
                    }
                }
                o0VarE.h0();
                x1 x1Var3 = p3.n.f135158a;
                int[] iArr3 = a.f200732a;
                i24 = iArr3[lVarA.ordinal()];
                if (i24 == 1) {
                    aVar3 = aVarB;
                } else {
                    if (i24 != 2) {
                        if (i24 == 3) {
                            u0.r();
                            return;
                        } else if (z14) {
                            aVar3 = aVarB;
                        }
                    }
                    aVar3 = aVarA;
                }
                boolean zG3 = s.g(aVar3, aVarA);
                i25 = iArr3[lVarA.ordinal()];
                if (i25 != 1) {
                    aVarB2 = gl.d.b();
                } else if (i25 != 2) {
                    aVarB2 = gl.d.a();
                } else if (i25 == 3) {
                    u0.r();
                    return;
                } else if (z14) {
                    aVarB2 = gl.d.a();
                } else {
                    aVarB2 = gl.d.b();
                }
                objQ = o0VarE.q();
                m.f135153a.getClass();
                c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = d92.a.a(aVar3, null, 2047);
                    o0VarE.K(objQ);
                }
                d92.a aVar8 = (d92.a) objQ;
                jg.b.S(aVar8, aVar3);
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = gl.a.a(aVarB2);
                    o0VarE.K(objQ2);
                }
                gl.a aVar9 = (gl.a) objQ2;
                gl.b.T(aVar9, aVarB2);
                n2[] n2VarArr3 = {gl.d.f77768a.c(aVar9), d92.c.f58627a.c(aVar8), d92.c.f58628b.c(Boolean.valueOf(zG3))};
                pVar2 = pVar;
                v.b(n2VarArr3, z3.f.c(-1290865622, new u(z14, z16, pVar2, 8), o0VarE), o0VarE, 56);
            } else {
                pVar2 = pVar;
                o0VarE.e();
                aVarA = aVar;
                lVarA = lVar;
            }
            z18 = z16;
            z19 = z14;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new at.a(z19, aVarA, aVarB, lVarA, z18, pVar2, i14, i15);
            }
        }
        i17 = i16 | 25600;
        z16 = z15;
        if ((74899 & i17) != 74898) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (o0VarE.n(i17 & 1, z17)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                z14 = n.h(o0VarE);
                if ((i15 & 2) != 0) {
                    aVarA = j92.a.a();
                } else {
                    aVarA = aVar;
                }
                if ((i15 & 4) != 0) {
                    aVarB = j92.a.b();
                }
                lVarA = ((z1) KoinJavaComponent.get$default(z1.class, null, null, 6, null)).a();
                if (i18 != 0) {
                    z16 = false;
                }
            } else {
                z14 = n.h(o0VarE);
                if ((i15 & 2) != 0) {
                    aVarA = j92.a.a();
                } else {
                    aVarA = aVar;
                }
                if ((i15 & 4) != 0) {
                    aVarB = j92.a.b();
                }
                lVarA = ((z1) KoinJavaComponent.get$default(z1.class, null, null, 6, null)).a();
                if (i18 != 0) {
                    z16 = false;
                }
            }
            o0VarE.h0();
            x1 x1Var4 = p3.n.f135158a;
            int[] iArr4 = a.f200732a;
            i24 = iArr4[lVarA.ordinal()];
            if (i24 == 1) {
                aVar3 = aVarB;
            } else {
                if (i24 != 2) {
                    if (i24 == 3) {
                        u0.r();
                        return;
                    } else if (z14) {
                        aVar3 = aVarB;
                    }
                }
                aVar3 = aVarA;
            }
            boolean zG4 = s.g(aVar3, aVarA);
            i25 = iArr4[lVarA.ordinal()];
            if (i25 != 1) {
                aVarB2 = gl.d.b();
            } else if (i25 != 2) {
                aVarB2 = gl.d.a();
            } else if (i25 == 3) {
                u0.r();
                return;
            } else if (z14) {
                aVarB2 = gl.d.a();
            } else {
                aVarB2 = gl.d.b();
            }
            objQ = o0VarE.q();
            m.f135153a.getClass();
            c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = d92.a.a(aVar3, null, 2047);
                o0VarE.K(objQ);
            }
            d92.a aVar10 = (d92.a) objQ;
            jg.b.S(aVar10, aVar3);
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = gl.a.a(aVarB2);
                o0VarE.K(objQ2);
            }
            gl.a aVar11 = (gl.a) objQ2;
            gl.b.T(aVar11, aVarB2);
            n2[] n2VarArr4 = {gl.d.f77768a.c(aVar11), d92.c.f58627a.c(aVar10), d92.c.f58628b.c(Boolean.valueOf(zG4))};
            pVar2 = pVar;
            v.b(n2VarArr4, z3.f.c(-1290865622, new u(z14, z16, pVar2, 8), o0VarE), o0VarE, 56);
        } else {
            pVar2 = pVar;
            o0VarE.e();
            aVarA = aVar;
            lVarA = lVar;
        }
        z18 = z16;
        z19 = z14;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at.a(z19, aVarA, aVarB, lVarA, z18, pVar2, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    public static final void b(long j8, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1916484638);
        int i15 = (o0VarE.l(j8) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            SystemUiController systemUiControllerRememberSystemUiController = SystemUiControllerKt.rememberSystemUiController(null, o0VarE, 0, 1);
            boolean zB = o0VarE.B(systemUiControllerRememberSystemUiController) | ((i15 & 14) == 4);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new g(systemUiControllerRememberSystemUiController, j8, 10);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new g(systemUiControllerRememberSystemUiController, j8, 10);
                    o0VarE.K(objQ);
                }
            }
            l0.i((e23.a) objQ, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d70.n(j8, i14, 7);
        }
    }
}
