package u6;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b.a f168825a = new b.a();

    public static boolean a(t6.e eVar) {
        t6.e.b bVar;
        t6.e.b bVar2;
        t6.e.b[] bVarArr = eVar.W;
        t6.e.b bVar3 = bVarArr[0];
        t6.e.b bVar4 = bVarArr[1];
        t6.e eVar2 = eVar.X;
        t6.f fVar = eVar2 != null ? (t6.f) eVar2 : null;
        if (fVar != null) {
            t6.e.b bVar5 = fVar.W[0];
            t6.e.b bVar6 = t6.e.b.FIXED;
        }
        if (fVar != null) {
            t6.e.b bVar7 = fVar.W[1];
            t6.e.b bVar8 = t6.e.b.FIXED;
        }
        t6.e.b bVar9 = t6.e.b.FIXED;
        boolean z14 = bVar3 == bVar9 || eVar.C() || bVar3 == t6.e.b.WRAP_CONTENT || (bVar3 == (bVar2 = t6.e.b.MATCH_CONSTRAINT) && eVar.f162640t == 0 && eVar.f162603a0 == 0.0f && eVar.v(0)) || (bVar3 == bVar2 && eVar.f162640t == 1 && eVar.w(0, eVar.s()));
        boolean z15 = bVar4 == bVar9 || eVar.D() || bVar4 == t6.e.b.WRAP_CONTENT || (bVar4 == (bVar = t6.e.b.MATCH_CONSTRAINT) && eVar.f162642u == 0 && eVar.f162603a0 == 0.0f && eVar.v(1)) || (bVar4 == bVar && eVar.f162642u == 1 && eVar.w(1, eVar.m()));
        return (eVar.f162603a0 > 0.0f && (z14 || z15)) || (z14 && z15);
    }

    public static void b(int i14, t6.e eVar, b.InterfaceC3163b interfaceC3163b, boolean z14) {
        t6.d dVar;
        t6.d dVar2;
        char c14;
        t6.d dVar3;
        t6.d dVar4;
        if (eVar.f162630o) {
            return;
        }
        if (!(eVar instanceof t6.f) && eVar.B() && a(eVar)) {
            t6.f.c0(eVar, interfaceC3163b, new b.a());
        }
        t6.d dVarK = eVar.k(t6.d.a.LEFT);
        t6.d dVarK2 = eVar.k(t6.d.a.RIGHT);
        int iD = dVarK.d();
        int iD2 = dVarK2.d();
        HashSet<t6.d> hashSet = dVarK.f162583a;
        if (hashSet != null && dVarK.f162585c) {
            Iterator<t6.d> it = hashSet.iterator();
            while (it.hasNext()) {
                t6.d next = it.next();
                t6.e eVar2 = next.f162586d;
                int i15 = i14 + 1;
                boolean zA = a(eVar2);
                t6.d dVar5 = eVar2.L;
                t6.d dVar6 = eVar2.N;
                if (eVar2.B() && zA) {
                    c14 = 0;
                    t6.f.c0(eVar2, interfaceC3163b, new b.a());
                } else {
                    c14 = 0;
                }
                char c15 = ((next == dVar5 && (dVar4 = dVar6.f162588f) != null && dVar4.f162585c) || (next == dVar6 && (dVar3 = dVar5.f162588f) != null && dVar3.f162585c)) ? (char) 1 : c14;
                t6.e.b bVar = eVar2.W[c14];
                t6.e.b bVar2 = t6.e.b.MATCH_CONSTRAINT;
                if (bVar != bVar2 || zA) {
                    if (!eVar2.B()) {
                        if (next == dVar5 && dVar6.f162588f == null) {
                            int iE = dVar5.e() + iD;
                            eVar2.M(iE, eVar2.s() + iE);
                            b(i15, eVar2, interfaceC3163b, z14);
                        } else if (next == dVar6 && dVar5.f162588f == null) {
                            int iE2 = iD - dVar6.e();
                            eVar2.M(iE2 - eVar2.s(), iE2);
                            b(i15, eVar2, interfaceC3163b, z14);
                        } else if (c15 != 0 && !eVar2.z()) {
                            c(i15, eVar2, interfaceC3163b, z14);
                        }
                    }
                } else if (bVar == bVar2 && eVar2.f162647x >= 0 && eVar2.f162646w >= 0 && (eVar2.f162623k0 == 8 || (eVar2.f162640t == 0 && eVar2.f162603a0 == 0.0f))) {
                    if (!eVar2.z() && !eVar2.I && c15 != 0 && !eVar2.z()) {
                        d(i15, eVar, interfaceC3163b, eVar2, z14);
                    }
                }
            }
        }
        if (eVar instanceof t6.h) {
            return;
        }
        HashSet<t6.d> hashSet2 = dVarK2.f162583a;
        if (hashSet2 != null && dVarK2.f162585c) {
            Iterator<t6.d> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                t6.d next2 = it3.next();
                t6.e eVar3 = next2.f162586d;
                int i16 = i14 + 1;
                boolean zA2 = a(eVar3);
                t6.d dVar7 = eVar3.L;
                t6.d dVar8 = eVar3.N;
                if (eVar3.B() && zA2) {
                    t6.f.c0(eVar3, interfaceC3163b, new b.a());
                }
                boolean z15 = (next2 == dVar7 && (dVar2 = dVar8.f162588f) != null && dVar2.f162585c) || (next2 == dVar8 && (dVar = dVar7.f162588f) != null && dVar.f162585c);
                t6.e.b bVar3 = eVar3.W[0];
                t6.e.b bVar4 = t6.e.b.MATCH_CONSTRAINT;
                if (bVar3 != bVar4 || zA2) {
                    if (!eVar3.B()) {
                        if (next2 == dVar7 && dVar8.f162588f == null) {
                            int iE3 = dVar7.e() + iD2;
                            eVar3.M(iE3, eVar3.s() + iE3);
                            b(i16, eVar3, interfaceC3163b, z14);
                        } else if (next2 == dVar8 && dVar7.f162588f == null) {
                            int iE4 = iD2 - dVar8.e();
                            eVar3.M(iE4 - eVar3.s(), iE4);
                            b(i16, eVar3, interfaceC3163b, z14);
                        } else if (z15 && !eVar3.z()) {
                            c(i16, eVar3, interfaceC3163b, z14);
                        }
                    }
                } else if (bVar3 == bVar4 && eVar3.f162647x >= 0 && eVar3.f162646w >= 0) {
                    if (eVar3.f162623k0 == 8 || (eVar3.f162640t == 0 && eVar3.f162603a0 == 0.0f)) {
                        if (!eVar3.z() && !eVar3.I && z15 && !eVar3.z()) {
                            d(i16, eVar, interfaceC3163b, eVar3, z14);
                        }
                    }
                }
            }
        }
        eVar.f162630o = true;
    }

    public static void c(int i14, t6.e eVar, b.InterfaceC3163b interfaceC3163b, boolean z14) {
        float f14 = eVar.f162617h0;
        t6.d dVar = eVar.L;
        int iD = dVar.f162588f.d();
        t6.d dVar2 = eVar.N;
        int iD2 = dVar2.f162588f.d();
        int iE = dVar.e() + iD;
        int iE2 = iD2 - dVar2.e();
        if (iD == iD2) {
            f14 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iS = eVar.s();
        int i15 = (iD2 - iD) - iS;
        if (iD > iD2) {
            i15 = (iD - iD2) - iS;
        }
        int i16 = ((int) (i15 > 0 ? (f14 * i15) + 0.5f : f14 * i15)) + iD;
        int i17 = i16 + iS;
        if (iD > iD2) {
            i17 = i16 - iS;
        }
        eVar.M(i16, i17);
        b(i14 + 1, eVar, interfaceC3163b, z14);
    }

    public static void d(int i14, t6.e eVar, b.InterfaceC3163b interfaceC3163b, t6.e eVar2, boolean z14) {
        float f14 = eVar2.f162617h0;
        t6.d dVar = eVar2.L;
        int iE = dVar.e() + dVar.f162588f.d();
        t6.d dVar2 = eVar2.N;
        int iD = dVar2.f162588f.d() - dVar2.e();
        if (iD >= iE) {
            int iS = eVar2.s();
            if (eVar2.f162623k0 != 8) {
                int i15 = eVar2.f162640t;
                if (i15 == 2) {
                    iS = (int) (eVar2.f162617h0 * 0.5f * (eVar instanceof t6.f ? eVar.s() : eVar.X.s()));
                } else if (i15 == 0) {
                    iS = iD - iE;
                }
                iS = Math.max(eVar2.f162646w, iS);
                int i16 = eVar2.f162647x;
                if (i16 > 0) {
                    iS = Math.min(i16, iS);
                }
            }
            int i17 = iE + ((int) ((f14 * ((iD - iE) - iS)) + 0.5f));
            eVar2.M(i17, iS + i17);
            b(i14 + 1, eVar2, interfaceC3163b, z14);
        }
    }

    public static void e(int i14, t6.e eVar, b.InterfaceC3163b interfaceC3163b) {
        float f14 = eVar.f162619i0;
        t6.d dVar = eVar.M;
        int iD = dVar.f162588f.d();
        t6.d dVar2 = eVar.O;
        int iD2 = dVar2.f162588f.d();
        int iE = dVar.e() + iD;
        int iE2 = iD2 - dVar2.e();
        if (iD == iD2) {
            f14 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iM = eVar.m();
        int i15 = (iD2 - iD) - iM;
        if (iD > iD2) {
            i15 = (iD - iD2) - iM;
        }
        int i16 = (int) (i15 > 0 ? (f14 * i15) + 0.5f : f14 * i15);
        int i17 = iD + i16;
        int i18 = i17 + iM;
        if (iD > iD2) {
            i17 = iD - i16;
            i18 = i17 - iM;
        }
        eVar.N(i17, i18);
        g(i14 + 1, eVar, interfaceC3163b);
    }

    public static void f(int i14, t6.e eVar, b.InterfaceC3163b interfaceC3163b, t6.e eVar2) {
        float f14 = eVar2.f162619i0;
        t6.d dVar = eVar2.M;
        int iE = dVar.e() + dVar.f162588f.d();
        t6.d dVar2 = eVar2.O;
        int iD = dVar2.f162588f.d() - dVar2.e();
        if (iD >= iE) {
            int iM = eVar2.m();
            if (eVar2.f162623k0 != 8) {
                int i15 = eVar2.f162642u;
                if (i15 == 2) {
                    iM = (int) (f14 * 0.5f * (eVar instanceof t6.f ? eVar.m() : eVar.X.m()));
                } else if (i15 == 0) {
                    iM = iD - iE;
                }
                iM = Math.max(eVar2.f162649z, iM);
                int i16 = eVar2.A;
                if (i16 > 0) {
                    iM = Math.min(i16, iM);
                }
            }
            int i17 = iE + ((int) ((f14 * ((iD - iE) - iM)) + 0.5f));
            eVar2.N(i17, iM + i17);
            g(i14 + 1, eVar2, interfaceC3163b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    public static void g(int i14, t6.e eVar, b.InterfaceC3163b interfaceC3163b) {
        boolean z14;
        t6.d dVar;
        t6.d dVar2;
        float f14;
        t6.d dVar3;
        t6.d dVar4;
        if (eVar.f162632p) {
            return;
        }
        if (!(eVar instanceof t6.f) && eVar.B() && a(eVar)) {
            t6.f.c0(eVar, interfaceC3163b, new b.a());
        }
        t6.d dVarK = eVar.k(t6.d.a.TOP);
        t6.d dVarK2 = eVar.k(t6.d.a.BOTTOM);
        int iD = dVarK.d();
        int iD2 = dVarK2.d();
        HashSet<t6.d> hashSet = dVarK.f162583a;
        char c14 = 1;
        if (hashSet != null && dVarK.f162585c) {
            Iterator<t6.d> it = hashSet.iterator();
            while (it.hasNext()) {
                t6.d next = it.next();
                t6.e eVar2 = next.f162586d;
                int i15 = i14 + 1;
                boolean zA = a(eVar2);
                t6.d dVar5 = eVar2.M;
                t6.d dVar6 = eVar2.O;
                if (eVar2.B() && zA) {
                    f14 = 0.0f;
                    t6.f.c0(eVar2, interfaceC3163b, new b.a());
                } else {
                    f14 = 0.0f;
                }
                char c15 = ((next == dVar5 && (dVar4 = dVar6.f162588f) != null && dVar4.f162585c) || (next == dVar6 && (dVar3 = dVar5.f162588f) != null && dVar3.f162585c)) ? c14 : (char) 0;
                t6.e.b bVar = eVar2.W[c14];
                char c16 = c14;
                t6.e.b bVar2 = t6.e.b.MATCH_CONSTRAINT;
                if (bVar != bVar2 || zA) {
                    if (!eVar2.B()) {
                        if (next == dVar5 && dVar6.f162588f == null) {
                            int iE = dVar5.e() + iD;
                            eVar2.N(iE, eVar2.m() + iE);
                            g(i15, eVar2, interfaceC3163b);
                        } else if (next == dVar6 && dVar5.f162588f == null) {
                            int iE2 = iD - dVar6.e();
                            eVar2.N(iE2 - eVar2.m(), iE2);
                            g(i15, eVar2, interfaceC3163b);
                        } else if (c15 != 0 && !eVar2.A()) {
                            e(i15, eVar2, interfaceC3163b);
                        }
                    }
                } else if (bVar == bVar2 && eVar2.A >= 0 && eVar2.f162649z >= 0 && ((eVar2.f162623k0 == 8 || (eVar2.f162642u == 0 && eVar2.f162603a0 == f14)) && !eVar2.A() && !eVar2.I && c15 != 0 && !eVar2.A())) {
                    f(i15, eVar, interfaceC3163b, eVar2);
                }
                c14 = c16;
            }
        }
        ?? r17 = c14;
        if (eVar instanceof t6.h) {
            return;
        }
        HashSet<t6.d> hashSet2 = dVarK2.f162583a;
        if (hashSet2 != null && dVarK2.f162585c) {
            Iterator<t6.d> it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                t6.d next2 = it3.next();
                t6.e eVar3 = next2.f162586d;
                int i16 = i14 + 1;
                boolean zA2 = a(eVar3);
                t6.d dVar7 = eVar3.M;
                t6.d dVar8 = eVar3.O;
                if (eVar3.B() && zA2) {
                    t6.f.c0(eVar3, interfaceC3163b, new b.a());
                }
                ?? r14 = ((next2 == dVar7 && (dVar2 = dVar8.f162588f) != null && dVar2.f162585c) || (next2 == dVar8 && (dVar = dVar7.f162588f) != null && dVar.f162585c)) ? r17 == true ? 1 : 0 : 0;
                t6.e.b bVar3 = eVar3.W[r17 == true ? 1 : 0];
                t6.e.b bVar4 = t6.e.b.MATCH_CONSTRAINT;
                if (bVar3 != bVar4 || zA2) {
                    if (!eVar3.B()) {
                        if (next2 == dVar7 && dVar8.f162588f == null) {
                            int iE3 = dVar7.e() + iD2;
                            eVar3.N(iE3, eVar3.m() + iE3);
                            g(i16, eVar3, interfaceC3163b);
                        } else if (next2 == dVar8 && dVar7.f162588f == null) {
                            int iE4 = iD2 - dVar8.e();
                            eVar3.N(iE4 - eVar3.m(), iE4);
                            g(i16, eVar3, interfaceC3163b);
                        } else if (r14 != 0 && !eVar3.A()) {
                            e(i16, eVar3, interfaceC3163b);
                        }
                    }
                } else if (bVar3 == bVar4 && eVar3.A >= 0 && eVar3.f162649z >= 0 && (eVar3.f162623k0 == 8 || (eVar3.f162642u == 0 && eVar3.f162603a0 == 0.0f))) {
                    if (!eVar3.A() && !eVar3.I && r14 != 0 && !eVar3.A()) {
                        f(i16, eVar, interfaceC3163b, eVar3);
                    }
                }
            }
        }
        t6.d dVarK3 = eVar.k(t6.d.a.BASELINE);
        if (dVarK3.f162583a != null && dVarK3.f162585c) {
            int iD3 = dVarK3.d();
            for (t6.d dVar9 : dVarK3.f162583a) {
                t6.e eVar4 = dVar9.f162586d;
                int i17 = i14 + 1;
                boolean zA3 = a(eVar4);
                t6.d dVar10 = eVar4.P;
                if (eVar4.B() && zA3) {
                    t6.f.c0(eVar4, interfaceC3163b, new b.a());
                }
                if (eVar4.W[r17 == true ? 1 : 0] != t6.e.b.MATCH_CONSTRAINT || zA3) {
                    if (!eVar4.B()) {
                        if (dVar9 == dVar10) {
                            int iE5 = dVar9.e() + iD3;
                            if (eVar4.G) {
                                int i18 = iE5 - eVar4.f162611e0;
                                int i19 = eVar4.Z + i18;
                                eVar4.f162609d0 = i18;
                                eVar4.M.l(i18);
                                eVar4.O.l(i19);
                                dVar10.l(iE5);
                                z14 = r17 == true ? 1 : 0;
                                eVar4.f162628n = z14;
                            } else {
                                z14 = r17 == true ? 1 : 0;
                            }
                            g(i17, eVar4, interfaceC3163b);
                        }
                        r17 = z14;
                    }
                }
                z14 = r17 == true ? 1 : 0;
                r17 = z14;
            }
        }
        eVar.f162632p = r17;
    }
}
