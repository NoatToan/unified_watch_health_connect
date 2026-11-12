package i3;

import android.content.res.Configuration;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
public final class h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f88295a = 0;

    static {
        g6.f.a aVar = g6.f.f75994b;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0259  */
    /* JADX WARN: Code duplicated, block: B:104:0x0278  */
    /* JADX WARN: Code duplicated, block: B:106:0x0285  */
    /* JADX WARN: Code duplicated, block: B:107:0x0287  */
    /* JADX WARN: Code duplicated, block: B:111:0x0290  */
    /* JADX WARN: Code duplicated, block: B:114:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:115:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:119:0x02af  */
    /* JADX WARN: Code duplicated, block: B:122:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:124:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:127:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:46:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x009e  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:63:0x011c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0138  */
    /* JADX WARN: Code duplicated, block: B:69:0x014a  */
    /* JADX WARN: Code duplicated, block: B:70:0x014c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0157  */
    /* JADX WARN: Code duplicated, block: B:74:0x015a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0182  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:89:0x0200  */
    /* JADX WARN: Code duplicated, block: B:90:0x0204  */
    /* JADX WARN: Code duplicated, block: B:95:0x0225  */
    /* JADX WARN: Code duplicated, block: B:98:0x0242  */
    public static final void a(boolean z14, e23.l lVar, h4.r rVar, z3.e eVar, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        boolean z15;
        z3.e eVar2;
        h4.r rVar3;
        p3.p2 p2VarI0;
        h4.r rVar4;
        View view2;
        boolean zB;
        Object objQ;
        p3.m.a aVar;
        uj ujVar;
        int iF0;
        Object objQ2;
        p3.m.a.C2565a c2565a;
        p3.p1 p1Var;
        Object objQ3;
        p3.n1 n1Var;
        Object objQ4;
        p3.n1 n1Var2;
        Object objQ5;
        m4.b0 b0Var;
        kotlin.m3 m3Var;
        String strH;
        String strH2;
        String strH3;
        Object objQ6;
        p3.p1 p1Var2;
        int i17;
        Object objQ7;
        p3.p1 p1Var3;
        int i18;
        boolean z16;
        int i19;
        boolean z17;
        boolean zB2;
        Object objQ8;
        p3.n1 n1Var3;
        p3.n1 n1Var4;
        e6 e6Var;
        boolean zR;
        Object objQ9;
        f5.z0 z0VarD;
        int iP;
        p3.i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar2;
        h5.g.a.b bVar;
        boolean z18;
        boolean z19;
        Object objQ10;
        boolean z24;
        Object objQ11;
        boolean zR2;
        Object objQ12;
        int i24;
        boolean z25 = z14;
        p3.o0 o0VarE = mVar.E(1597265892);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.h(z25) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(lVar) ? 32 : 16;
        }
        int i25 = i15 & 4;
        if (i25 == 0) {
            if ((i14 & 384) == 0) {
                rVar2 = rVar;
                i16 |= o0VarE.B(rVar2) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                if (o0VarE.r(eVar)) {
                    i24 = 2048;
                } else {
                    i24 = 1024;
                }
                i16 |= i24;
            }
            if ((i16 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i16 & 1, z15)) {
                if (i25 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                p3.x1 x1Var = p3.n.f135158a;
                Configuration configuration = (Configuration) o0VarE.A(AndroidCompositionLocals_androidKt.f6041a);
                view2 = (View) o0VarE.A(AndroidCompositionLocals_androidKt.f6046f);
                zB = o0VarE.B(configuration) | o0VarE.B(view2);
                objQ = o0VarE.q();
                aVar = p3.m.f135153a;
                if (zB) {
                    objQ = new uj(view2);
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new uj(view2);
                        o0VarE.K(objQ);
                    }
                }
                ujVar = (uj) objQ;
                g6.c cVar = (g6.c) o0VarE.A(kotlin.t1.f91490h);
                iF0 = cVar.f0(y7.f90417a);
                objQ2 = o0VarE.q();
                aVar.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ2 == c2565a) {
                    objQ2 = p3.p0.n(null);
                    o0VarE.K(objQ2);
                }
                p1Var = (p3.p1) objQ2;
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = e5.o(0, o0VarE);
                }
                n1Var = (p3.n1) objQ3;
                objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = e5.o(0, o0VarE);
                }
                n1Var2 = (p3.n1) objQ4;
                objQ5 = o0VarE.q();
                if (objQ5 == c2565a) {
                    objQ5 = kg.f.j(o0VarE);
                }
                b0Var = (m4.b0) objQ5;
                m3Var = (kotlin.m3) o0VarE.A(kotlin.t1.f91499q);
                int i26 = l3.n1.f109367b;
                strH = l3.k.h(o0VarE, R.string.m3c_dropdown_menu_expanded);
                strH2 = l3.k.h(o0VarE, R.string.m3c_dropdown_menu_collapsed);
                strH3 = l3.k.h(o0VarE, R.string.m3c_dropdown_menu_toggle);
                objQ6 = o0VarE.q();
                if (objQ6 == c2565a) {
                    y5.f90403b.getClass();
                    objQ6 = p3.p0.n(y5.a(y5.f90404c));
                    o0VarE.K(objQ6);
                }
                p1Var2 = (p3.p1) objQ6;
                i17 = i16;
                objQ7 = o0VarE.q();
                if (objQ7 == c2565a) {
                    objQ7 = p3.p0.n(Boolean.FALSE);
                    o0VarE.K(objQ7);
                }
                p1Var3 = (p3.p1) objQ7;
                i18 = i17 & 14;
                if (i18 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                i19 = i17 & 112;
                boolean z26 = z16;
                if (i19 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zB2 = z26 | z17 | o0VarE.B(ujVar) | o0VarE.B(cVar);
                objQ8 = o0VarE.q();
                if (!zB2 || objQ8 == c2565a) {
                    n1Var3 = n1Var2;
                    n1Var4 = n1Var;
                    objQ8 = new e6(b0Var, z25, p1Var3, strH, strH2, strH3, m3Var, p1Var2, lVar, n1Var4, n1Var3);
                    b0Var = b0Var;
                    z25 = z25;
                    o0VarE.K(objQ8);
                } else {
                    n1Var4 = n1Var;
                    n1Var3 = n1Var2;
                }
                e6Var = (e6) objQ8;
                zR = o0VarE.r(ujVar) | o0VarE.k(iF0);
                objQ9 = o0VarE.q();
                if (zR || objQ9 == c2565a) {
                    objQ9 = new b81.b(ujVar, iF0, p1Var, n1Var4, n1Var3, 3);
                    o0VarE.K(objQ9);
                }
                rVar2 = rVar4;
                h4.r rVarF = f5.g0.f(rVar2, (e23.l) objQ9);
                h4.d.f81522a.getClass();
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iP = o0VarE.P();
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarF, o0VarE);
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
                p3.b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                p3.b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                    v.h.A(iP, o0VarE, iP, bVar);
                }
                p3.b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.u uVar = c2.u.f22885a;
                eVar2 = eVar;
                eVar2.invoke(e6Var, o0VarE, Integer.valueOf((i17 >> 6) & 112));
                o0VarE.g0(true);
                if (z25) {
                    o0VarE.C(209894723);
                    zR2 = o0VarE.r(ujVar) | o0VarE.k(iF0);
                    objQ12 = o0VarE.q();
                    if (zR2 || objQ12 == c2565a) {
                        objQ12 = new b21.k((Object) ujVar, iF0, p1Var, (p3.p1) n1Var3, 4);
                        o0VarE.K(objQ12);
                    }
                    z18 = false;
                    j6.a((e23.a) objQ12, o0VarE, 0);
                    o0VarE.g0(false);
                } else {
                    z18 = false;
                    o0VarE.C(210228190);
                    o0VarE.g0(false);
                }
                if (i18 == 4) {
                    z19 = true;
                } else {
                    z19 = z18;
                }
                objQ10 = o0VarE.q();
                if (z19 || objQ10 == c2565a) {
                    objQ10 = new b50.o(z25, b0Var, 2);
                    o0VarE.K(objQ10);
                }
                p3.l0.i((e23.a) objQ10, o0VarE);
                if (i19 == 32) {
                    z24 = true;
                } else {
                    z24 = z18;
                }
                objQ11 = o0VarE.q();
                if (z24 || objQ11 == c2565a) {
                    objQ11 = new gt1.k(lVar, 8);
                    o0VarE.K(objQ11);
                }
                l3.k.a(z25, (e23.a) objQ11, o0VarE, i18);
            } else {
                eVar2 = eVar;
                o0VarE.e();
            }
            rVar3 = rVar2;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new aa2.g(z25, lVar, rVar3, eVar2, i14, i15, 8);
            }
        }
        i16 |= 384;
        rVar2 = rVar;
        if ((i14 & 3072) == 0) {
            if (o0VarE.r(eVar)) {
                i24 = 2048;
            } else {
                i24 = 1024;
            }
            i16 |= i24;
        }
        if ((i16 & 1171) != 1170) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (o0VarE.n(i16 & 1, z15)) {
            if (i25 != 0) {
                rVar4 = h4.r.S;
            } else {
                rVar4 = rVar2;
            }
            p3.x1 x1Var2 = p3.n.f135158a;
            Configuration configuration2 = (Configuration) o0VarE.A(AndroidCompositionLocals_androidKt.f6041a);
            view2 = (View) o0VarE.A(AndroidCompositionLocals_androidKt.f6046f);
            zB = o0VarE.B(configuration2) | o0VarE.B(view2);
            objQ = o0VarE.q();
            aVar = p3.m.f135153a;
            if (zB) {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new uj(view2);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new uj(view2);
                o0VarE.K(objQ);
            }
            ujVar = (uj) objQ;
            g6.c cVar2 = (g6.c) o0VarE.A(kotlin.t1.f91490h);
            iF0 = cVar2.f0(y7.f90417a);
            objQ2 = o0VarE.q();
            aVar.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(null);
                o0VarE.K(objQ2);
            }
            p1Var = (p3.p1) objQ2;
            objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = e5.o(0, o0VarE);
            }
            n1Var = (p3.n1) objQ3;
            objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = e5.o(0, o0VarE);
            }
            n1Var2 = (p3.n1) objQ4;
            objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = kg.f.j(o0VarE);
            }
            b0Var = (m4.b0) objQ5;
            m3Var = (kotlin.m3) o0VarE.A(kotlin.t1.f91499q);
            int i27 = l3.n1.f109367b;
            strH = l3.k.h(o0VarE, R.string.m3c_dropdown_menu_expanded);
            strH2 = l3.k.h(o0VarE, R.string.m3c_dropdown_menu_collapsed);
            strH3 = l3.k.h(o0VarE, R.string.m3c_dropdown_menu_toggle);
            objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                y5.f90403b.getClass();
                objQ6 = p3.p0.n(y5.a(y5.f90404c));
                o0VarE.K(objQ6);
            }
            p1Var2 = (p3.p1) objQ6;
            i17 = i16;
            objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ7);
            }
            p1Var3 = (p3.p1) objQ7;
            i18 = i17 & 14;
            if (i18 == 4) {
                z16 = true;
            } else {
                z16 = false;
            }
            i19 = i17 & 112;
            boolean z27 = z16;
            if (i19 == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            zB2 = z27 | z17 | o0VarE.B(ujVar) | o0VarE.B(cVar2);
            objQ8 = o0VarE.q();
            if (zB2) {
                n1Var3 = n1Var2;
                n1Var4 = n1Var;
                objQ8 = new e6(b0Var, z25, p1Var3, strH, strH2, strH3, m3Var, p1Var2, lVar, n1Var4, n1Var3);
                b0Var = b0Var;
                z25 = z25;
                o0VarE.K(objQ8);
            } else {
                n1Var3 = n1Var2;
                n1Var4 = n1Var;
                objQ8 = new e6(b0Var, z25, p1Var3, strH, strH2, strH3, m3Var, p1Var2, lVar, n1Var4, n1Var3);
                b0Var = b0Var;
                z25 = z25;
                o0VarE.K(objQ8);
            }
            e6Var = (e6) objQ8;
            zR = o0VarE.r(ujVar) | o0VarE.k(iF0);
            objQ9 = o0VarE.q();
            if (zR) {
                objQ9 = new b81.b(ujVar, iF0, p1Var, n1Var4, n1Var3, 3);
                o0VarE.K(objQ9);
            } else {
                objQ9 = new b81.b(ujVar, iF0, p1Var, n1Var4, n1Var3, 3);
                o0VarE.K(objQ9);
            }
            rVar2 = rVar4;
            h4.r rVarF2 = f5.g0.f(rVar2, (e23.l) objQ9);
            h4.d.f81522a.getClass();
            z0VarD = c2.q.d(h4.d.a.f81524b, false);
            iP = o0VarE.P();
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarF2, o0VarE);
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
            p3.b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            p3.b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iP, o0VarE, iP, bVar);
            } else {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            p3.b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar2 = c2.u.f22885a;
            eVar2 = eVar;
            eVar2.invoke(e6Var, o0VarE, Integer.valueOf((i17 >> 6) & 112));
            o0VarE.g0(true);
            if (z25) {
                o0VarE.C(209894723);
                zR2 = o0VarE.r(ujVar) | o0VarE.k(iF0);
                objQ12 = o0VarE.q();
                if (zR2) {
                    objQ12 = new b21.k((Object) ujVar, iF0, p1Var, (p3.p1) n1Var3, 4);
                    o0VarE.K(objQ12);
                } else {
                    objQ12 = new b21.k((Object) ujVar, iF0, p1Var, (p3.p1) n1Var3, 4);
                    o0VarE.K(objQ12);
                }
                z18 = false;
                j6.a((e23.a) objQ12, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                z18 = false;
                o0VarE.C(210228190);
                o0VarE.g0(false);
            }
            if (i18 == 4) {
                z19 = true;
            } else {
                z19 = z18;
            }
            objQ10 = o0VarE.q();
            if (z19) {
                objQ10 = new b50.o(z25, b0Var, 2);
                o0VarE.K(objQ10);
            } else {
                objQ10 = new b50.o(z25, b0Var, 2);
                o0VarE.K(objQ10);
            }
            p3.l0.i((e23.a) objQ10, o0VarE);
            if (i19 == 32) {
                z24 = true;
            } else {
                z24 = z18;
            }
            objQ11 = o0VarE.q();
            if (z24) {
                objQ11 = new gt1.k(lVar, 8);
                o0VarE.K(objQ11);
            } else {
                objQ11 = new gt1.k(lVar, 8);
                o0VarE.K(objQ11);
            }
            l3.k.a(z25, (e23.a) objQ11, o0VarE, i18);
        } else {
            eVar2 = eVar;
            o0VarE.e();
        }
        rVar3 = rVar2;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.g(z25, lVar, rVar3, eVar2, i14, i15, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    public static final int b(g6.l lVar, n4.d dVar, int i14) {
        int iC;
        if (dVar == null) {
            return 0;
        }
        int i15 = lVar.f76009b;
        int i16 = i15 + i14;
        int i17 = lVar.f76011d;
        int i18 = i17 - i14;
        float f14 = dVar.f123548b;
        if (f14 <= i17) {
            float f15 = dVar.f123550d;
            if (f15 < i15) {
                iC = i18 - i16;
            } else {
                iC = MathKt.c(Math.max(f14 - i16, i18 - f15));
            }
        } else {
            iC = i18 - i16;
        }
        return Math.max(iC, 0);
    }

    public static final boolean c(KeyEvent keyEvent) {
        long jA = z4.f.a(keyEvent.getKeyCode());
        z4.a.f202280b.getClass();
        return z4.a.a(jA, z4.a.f202288j) || z4.a.a(jA, z4.a.f202298t) || z4.a.a(jA, z4.a.G);
    }
}
