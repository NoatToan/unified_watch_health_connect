package p5;

import android.os.Trace;
import h5.c1;
import h5.y1;
import h5.z1;
import java.util.List;
import p1.t0;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n4.d f135956a = new n4.d(0.0f, 0.0f, 10.0f, 10.0f);

    public static final p1.i0 a(b0 b0Var, e23.l lVar) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            y yVarA = b0Var.a();
            h5.e0 e0Var = yVarA.f136097c;
            if (e0Var.g() && e0Var.isAttached()) {
                n4.d dVarG = yVarA.g();
                p1.i0 i0Var = new p1.i0(48);
                o oVar = new o();
                oVar.d(lg.d.F(dVarG));
                d(lVar, i0Var, new o(), oVar, yVarA, yVarA);
                return i0Var;
            }
            p1.i0 i0Var2 = p1.o.f134780a;
            i0Var2.getClass();
            return i0Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void b(e23.l lVar, p1.i0 i0Var, o oVar, o oVar2, y yVar, y yVar2) {
        h5.e0 e0Var = yVar2.f136097c;
        h5.e0 e0Var2 = yVar2.f136097c;
        if (!e0Var.g() || !e0Var2.isAttached() || oVar2.f136050a.isEmpty()) {
            if (yVar2.p()) {
                c(i0Var, yVar, yVar2);
                return;
            }
            return;
        }
        n4.d dVarN = yVar2.n();
        if (dVarN.l()) {
            y1 y1VarF = yVar2.f();
            if (y1VarF == null) {
                h5.w wVar = e0Var2.P.f81682c;
                dVarN = f5.d0.c(wVar).j0(wVar, false);
            } else {
                h4.r.c node = y1VarF.getNode();
                q qVar = yVar2.f136098d;
                p.f136057a.getClass();
                dVarN = z1.a(node, r.a(qVar, p.f136059c) != null, false);
            }
        }
        g6.l lVarF = lg.d.F(dVarN);
        oVar.d(lVarF);
        if (oVar.c(oVar2)) {
            int i14 = yVar2.f136100f;
            if (i14 == yVar.f136100f) {
                i14 = -1;
            }
            i0Var.i(i14, new a0(yVar2, oVar.b()));
            List listJ = y.j(4, yVar2);
            for (int size = listJ.size() - 1; -1 < size; size--) {
                if (!((Boolean) lVar.invoke(listJ.get(size))).booleanValue()) {
                    b(lVar, i0Var, oVar, oVar2, yVar, (y) listJ.get(size));
                }
            }
            if (f(yVar2)) {
                oVar2.a(lVarF);
            }
        }
    }

    public static final void c(p1.i0 i0Var, y yVar, y yVar2) {
        h5.e0 e0Var;
        y yVarL = yVar2.l();
        n4.d dVarG = (yVarL == null || (e0Var = yVarL.f136097c) == null || !e0Var.g()) ? f135956a : yVarL.g();
        int i14 = yVar2.f136100f;
        if (i14 == yVar.f136100f) {
            i14 = -1;
        }
        i0Var.i(i14, new a0(yVar2, lg.d.F(dVarG)));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:66:0x0105  */
    /* JADX WARN: Code duplicated, block: B:68:0x0117  */
    /* JADX WARN: Code duplicated, block: B:69:0x011a  */
    /* JADX WARN: Code duplicated, block: B:73:0x012f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0140  */
    /* JADX WARN: Code duplicated, block: B:79:0x0158  */
    /* JADX WARN: Code duplicated, block: B:81:0x0161  */
    /* JADX WARN: Code duplicated, block: B:83:0x0171  */
    /* JADX WARN: Code duplicated, block: B:84:0x0177  */
    /* JADX WARN: Code duplicated, block: B:88:0x0195  */
    public static final void d(e23.l lVar, p1.i0 i0Var, o oVar, o oVar2, y yVar, y yVar2) {
        boolean z14;
        boolean z15;
        int size;
        o oVar3;
        o oVar4;
        o oVar5;
        y1 y1VarF;
        boolean z16;
        n4.d dVarA;
        int size2;
        boolean z17;
        c1 c1Var;
        e23.l lVar2 = lVar;
        p1.i0 i0Var2 = i0Var;
        o oVar6 = oVar2;
        y yVar3 = yVar;
        int i14 = yVar3.f136100f;
        h5.e0 e0Var = yVar2.f136097c;
        q qVar = yVar2.f136098d;
        h5.e0 e0Var2 = yVar2.f136097c;
        int i15 = yVar2.f136100f;
        boolean z18 = (e0Var.g() && e0Var2.isAttached()) ? false : true;
        if (!oVar6.f136050a.isEmpty() || i15 == i14) {
            if (!z18 || yVar2.p()) {
                g6.l lVarF = lg.d.F(yVar2.n());
                o oVar7 = oVar;
                oVar7.d(lVarF);
                if (i15 == i14) {
                    i15 = -1;
                }
                if (!oVar.c(oVar2)) {
                    if (yVar2.p()) {
                        c(i0Var2, yVar3, yVar2);
                        return;
                    } else {
                        if (i15 == -1) {
                            i0Var2.i(i15, new a0(yVar2, oVar.b()));
                            return;
                        }
                        return;
                    }
                }
                i0Var2.i(i15, new a0(yVar2, oVar7.b()));
                List listJ = y.j(4, yVar2);
                if (h4.i.f81564f && qVar.f136088d) {
                    y yVarL = yVar2.l();
                    while (true) {
                        if (yVarL == null) {
                            z14 = true;
                            yVarL = null;
                            break;
                        }
                        q qVar2 = yVarL.f136098d;
                        d0.f135959a.getClass();
                        z14 = true;
                        if (qVar2.f136085a.b(d0.f135982x)) {
                            break;
                        }
                        if (qVar2.f136085a.b(d0.f135981w)) {
                            break;
                        } else {
                            yVarL = yVarL.l();
                        }
                    }
                    if (yVarL == null) {
                        z17 = false;
                    } else {
                        c1 c1VarD = yVar2.d();
                        if (c1VarD == null) {
                            c1VarD = null;
                        } else {
                            if (!c1VarD.isAttached()) {
                                c1VarD = null;
                            }
                            if (c1VarD == null) {
                                c1VarD = null;
                            }
                        }
                        c1 c1VarD2 = yVarL.d();
                        if (c1VarD2 == null) {
                            c1Var = null;
                        } else {
                            if (!c1VarD2.isAttached()) {
                                c1VarD2 = null;
                            }
                            if (c1VarD2 != null) {
                                c1Var = c1VarD2;
                            } else {
                                c1Var = null;
                            }
                        }
                        if (c1VarD == null || c1Var == null) {
                            z17 = false;
                        } else {
                            n4.d dVarJ0 = c1Var.j0(c1VarD, false);
                            n4.c.f123541b.getClass();
                            z17 = !dVarJ0.equals(dVarJ0.k(g8.i.g(0L, g6.n.c(c1Var.f69146c))));
                        }
                    }
                    z15 = z17 ? z14 : false;
                    if (z15) {
                        oVar5 = new o();
                        y1VarF = yVar2.f();
                        if (y1VarF == null) {
                            h5.w wVar = e0Var2.P.f81682c;
                            dVarA = f5.d0.c(wVar).j0(wVar, false);
                        } else {
                            h4.r.c node = y1VarF.getNode();
                            p.f136057a.getClass();
                            if (r.a(qVar, p.f136059c) != null) {
                                z16 = z14;
                            } else {
                                z16 = false;
                            }
                            dVarA = z1.a(node, z16, false);
                        }
                        oVar5.d(lg.d.F(dVarA));
                        size2 = listJ.size() - 1;
                        while (-1 < size2) {
                            if (((Boolean) lVar2.invoke(listJ.get(size2))).booleanValue()) {
                                b(lVar2, i0Var2, new o(), oVar5, yVar3, (y) listJ.get(size2));
                            }
                            size2--;
                            i0Var2 = i0Var;
                            yVar3 = yVar;
                        }
                    } else {
                        size = listJ.size() - 1;
                        while (-1 < size) {
                            if (((Boolean) lVar2.invoke(listJ.get(size))).booleanValue()) {
                                oVar3 = oVar6;
                            } else {
                                o oVar8 = oVar7;
                                oVar3 = oVar6;
                                d(lVar2, i0Var, oVar8, oVar3, yVar, (y) listJ.get(size));
                            }
                            size--;
                            lVar2 = lVar;
                            oVar6 = oVar3;
                            oVar7 = oVar;
                        }
                    }
                    oVar4 = oVar6;
                    if (f(yVar2)) {
                        oVar4.a(lVarF);
                    }
                }
                z14 = true;
                if (z15) {
                    oVar5 = new o();
                    y1VarF = yVar2.f();
                    if (y1VarF == null) {
                        h5.w wVar2 = e0Var2.P.f81682c;
                        dVarA = f5.d0.c(wVar2).j0(wVar2, false);
                    } else {
                        h4.r.c node2 = y1VarF.getNode();
                        p.f136057a.getClass();
                        if (r.a(qVar, p.f136059c) != null) {
                            z16 = z14;
                        } else {
                            z16 = false;
                        }
                        dVarA = z1.a(node2, z16, false);
                    }
                    oVar5.d(lg.d.F(dVarA));
                    size2 = listJ.size() - 1;
                    while (-1 < size2) {
                        if (((Boolean) lVar2.invoke(listJ.get(size2))).booleanValue()) {
                            b(lVar2, i0Var2, new o(), oVar5, yVar3, (y) listJ.get(size2));
                        }
                        size2--;
                        i0Var2 = i0Var;
                        yVar3 = yVar;
                    }
                } else {
                    size = listJ.size() - 1;
                    while (-1 < size) {
                        if (((Boolean) lVar2.invoke(listJ.get(size))).booleanValue()) {
                            oVar3 = oVar6;
                        } else {
                            o oVar9 = oVar7;
                            oVar3 = oVar6;
                            d(lVar2, i0Var, oVar9, oVar3, yVar, (y) listJ.get(size));
                        }
                        size--;
                        lVar2 = lVar;
                        oVar6 = oVar3;
                        oVar7 = oVar;
                    }
                }
                oVar4 = oVar6;
                if (f(yVar2)) {
                    oVar4.a(lVarF);
                }
            }
        }
    }

    public static final boolean e(y yVar) {
        c1 c1VarD = yVar.d();
        q qVar = yVar.f136098d;
        if (c1VarD != null ? c1VarD.S1() : false) {
            return true;
        }
        d0 d0Var = d0.f135959a;
        d0Var.getClass();
        if (qVar.f136085a.b(d0.f135976r)) {
            return true;
        }
        d0Var.getClass();
        return qVar.f136085a.b(d0.f135975q);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[LOOP:0: B:9:0x001b->B:21:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x005b A[SYNTHETIC] */
    public static final boolean f(y yVar) {
        if (!e(yVar)) {
            q qVar = yVar.f136098d;
            if (qVar.f136088d) {
                return true;
            }
            t0<j0<?>, Object> t0Var = qVar.f136085a;
            Object[] objArr = t0Var.f134721b;
            Object[] objArr2 = t0Var.f134722c;
            long[] jArr = t0Var.f134720a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i14 = 0;
                while (true) {
                    long j8 = jArr[i14];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i15 = 8 - ((~(i14 - length)) >>> 31);
                        for (int i16 = 0; i16 < i15; i16++) {
                            if ((255 & j8) < 128) {
                                int i17 = (i14 << 3) + i16;
                                Object obj = objArr[i17];
                                Object obj2 = objArr2[i17];
                                if (((j0) obj).f136024c) {
                                    return true;
                                }
                            }
                            j8 >>= 8;
                        }
                        if (i15 == 8) {
                            if (i14 != length) {
                                i14++;
                            }
                        }
                    } else if (i14 != length) {
                        i14++;
                    }
                }
            }
        }
        return false;
    }
}
