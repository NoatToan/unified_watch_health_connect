package p3;

import androidx.compose.runtime.ComposeRuntimeError;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x1 f135158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x1 f135159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x1 f135160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x1 f135161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x1 f135162e;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"p3/n$a", "Lp3/q2;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements q2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c0 f135163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j1 f135164b;

        public a(c0 c0Var, j1 j1Var) {
            this.f135163a = c0Var;
            this.f135164b = j1Var;
        }

        @Override // p3.q2
        public final void a(Object obj) {
        }

        @Override // p3.q2
        public final void e() {
        }

        @Override // p3.q2
        public final x0 s(p2 p2Var, Object obj) {
            x0 x0VarS;
            c0 c0Var = this.f135163a;
            q2 q2Var = c0Var instanceof q2 ? (q2) c0Var : null;
            if (q2Var == null || (x0VarS = q2Var.s(p2Var, obj)) == null) {
                x0VarS = x0.IGNORED;
            }
            if (x0VarS != x0.IGNORED) {
                return x0VarS;
            }
            j1 j1Var = this.f135164b;
            j1Var.f135128f = p13.h0.D0(j1Var.f135128f, new o13.p(p2Var, obj));
            return x0.SCHEDULED;
        }
    }

    static {
        g4.e.f75736b.getClass();
        f135158a = new x1("provider");
        f135159b = new x1("provider");
        f135160c = new x1("compositionLocalMap");
        new x1("providerValues");
        f135161d = new x1("providers");
        f135162e = new x1("reference");
    }

    public static final void a(String str) {
        throw new ComposeRuntimeError(am.j.m("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void b(String str) {
        throw new ComposeRuntimeError(am.j.m("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* JADX WARN: Code duplicated, block: B:82:0x01ce  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.ArrayList] */
    public static final i1 c(c0 c0Var, j1 j1Var, s3.l lVar, c<?> cVar) {
        s3.i iVar;
        boolean z14;
        Object obj;
        ?? arrayList;
        b bVar;
        long[] jArr;
        b bVar2;
        s3.i iVar2;
        long[] jArr2;
        int i14;
        long j8;
        int i15;
        boolean zB;
        Object obj2;
        int i16;
        s3.i iVar3;
        int i17;
        long j14;
        Object obj3;
        j1 j1Var2 = j1Var;
        s3.i iVar4 = new s3.i();
        if (lVar.f156367e != null) {
            iVar4.d();
        }
        int i18 = 0;
        if (lVar.f156368f != null) {
            iVar4.f156358k = new p1.i0<>(0, 1, null);
        }
        int i19 = lVar.f156382t;
        if (cVar != null && lVar.F(i19) > 0) {
            int iG = lVar.f156384v;
            while (iG > 0 && !lVar.y(iG)) {
                iG = lVar.G(iG, lVar.f156364b);
            }
            if (iG >= 0 && lVar.y(iG)) {
                Object objE = lVar.E(iG);
                int i24 = iG + 1;
                int iU = lVar.u(iG) + iG;
                int iF = 0;
                while (i24 < iU) {
                    int iU2 = lVar.u(i24) + i24;
                    if (iU2 > i19) {
                        break;
                    }
                    iF += lVar.y(i24) ? 1 : lVar.F(i24);
                    i24 = iU2;
                }
                int iF2 = lVar.y(i19) ? 1 : lVar.F(i19);
                cVar.down(objE);
                cVar.remove(iF, iF2);
                cVar.up();
            }
        }
        b bVar3 = j1Var2.f135127e;
        if (bVar3.getValid()) {
            c0Var.getClass();
            r rVar = (r) c0Var;
            if (rVar.f135242n.f134724e > 0) {
                arrayList = new ArrayList();
                p1.t0<Object, Object> t0Var = rVar.f135242n;
                long[] jArr3 = t0Var.f134720a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int i25 = 0;
                    while (true) {
                        long j15 = jArr3[i25];
                        if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i26 = 8;
                            int i27 = 8 - ((~(i25 - length)) >>> 31);
                            while (i18 < i27) {
                                if ((j15 & 255) < 128) {
                                    int i28 = (i25 << 3) + i18;
                                    int i29 = i26;
                                    Object obj4 = t0Var.f134721b[i28];
                                    bVar2 = bVar3;
                                    Object obj5 = t0Var.f134722c[i28];
                                    obj4.getClass();
                                    if (obj5 instanceof p1.u0) {
                                        p1.u0 u0Var = (p1.u0) obj5;
                                        Object[] objArr = u0Var.f134733b;
                                        long[] jArr4 = u0Var.f134732a;
                                        jArr2 = jArr3;
                                        int length2 = jArr4.length - 2;
                                        if (length2 >= 0) {
                                            j8 = j15;
                                            int i30 = 0;
                                            while (true) {
                                                long j16 = jArr4[i30];
                                                if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i34 = 8 - ((~(i30 - length2)) >>> 31);
                                                    int i35 = 0;
                                                    while (i35 < i34) {
                                                        if ((j16 & 255) < 128) {
                                                            i16 = i35;
                                                            int i36 = (i30 << 3) + i16;
                                                            j14 = j16;
                                                            Object obj6 = objArr[i36];
                                                            p2 p2Var = (p2) obj4;
                                                            obj3 = obj4;
                                                            s3.b bVar4 = p2Var.f135218c;
                                                            if (bVar4 != null) {
                                                                s3.b bVarF = oc.b.f(bVar2);
                                                                iVar3 = iVar4;
                                                                s3.b bVarF2 = oc.b.f(bVar4);
                                                                int iC = lVar.c(bVarF);
                                                                i17 = length;
                                                                int iA = s3.k.a(iC, lVar.f156364b) + iC;
                                                                int i37 = bVarF2.f156318a;
                                                                if (iC <= i37 && i37 < iA) {
                                                                    arrayList.add(new o13.p(p2Var, obj6));
                                                                    u0Var.m(i36);
                                                                }
                                                            } else {
                                                                iVar3 = iVar4;
                                                                i17 = length;
                                                            }
                                                        } else {
                                                            i16 = i35;
                                                            iVar3 = iVar4;
                                                            i17 = length;
                                                            j14 = j16;
                                                            obj3 = obj4;
                                                        }
                                                        j16 = j14 >> i29;
                                                        i35 = i16 + 1;
                                                        obj4 = obj3;
                                                        length = i17;
                                                        iVar4 = iVar3;
                                                    }
                                                    iVar2 = iVar4;
                                                    i14 = length;
                                                    obj2 = obj4;
                                                    if (i34 != i29) {
                                                        break;
                                                    }
                                                } else {
                                                    iVar2 = iVar4;
                                                    i14 = length;
                                                    obj2 = obj4;
                                                }
                                                if (i30 == length2) {
                                                    break;
                                                }
                                                i30++;
                                                obj4 = obj2;
                                                length = i14;
                                                iVar4 = iVar2;
                                                i29 = 8;
                                            }
                                        } else {
                                            iVar2 = iVar4;
                                            i14 = length;
                                            j8 = j15;
                                        }
                                        zB = u0Var.b();
                                    } else {
                                        iVar2 = iVar4;
                                        jArr2 = jArr3;
                                        i14 = length;
                                        j8 = j15;
                                        obj5.getClass();
                                        p2 p2Var2 = (p2) obj4;
                                        s3.b bVar5 = p2Var2.f135218c;
                                        if (bVar5 != null) {
                                            s3.b bVarF3 = oc.b.f(bVar2);
                                            s3.b bVarF4 = oc.b.f(bVar5);
                                            int iC2 = lVar.c(bVarF3);
                                            int iA2 = s3.k.a(iC2, lVar.f156364b) + iC2;
                                            int i38 = bVarF4.f156318a;
                                            if (iC2 > i38 || i38 >= iA2) {
                                                zB = false;
                                            } else {
                                                arrayList.add(new o13.p(p2Var2, obj5));
                                                zB = true;
                                            }
                                        } else {
                                            zB = false;
                                        }
                                    }
                                    if (zB) {
                                        t0Var.l(i28);
                                    }
                                    i15 = 8;
                                } else {
                                    bVar2 = bVar3;
                                    iVar2 = iVar4;
                                    jArr2 = jArr3;
                                    i14 = length;
                                    j8 = j15;
                                    i15 = i26;
                                }
                                j15 = j8 >> i15;
                                i18++;
                                i26 = i15;
                                bVar3 = bVar2;
                                jArr3 = jArr2;
                                length = i14;
                                iVar4 = iVar2;
                            }
                            bVar = bVar3;
                            iVar = iVar4;
                            jArr = jArr3;
                            int i39 = length;
                            if (i27 != i26) {
                                break;
                            }
                            length = i39;
                        } else {
                            bVar = bVar3;
                            iVar = iVar4;
                            jArr = jArr3;
                        }
                        if (i25 == length) {
                            break;
                        }
                        i25++;
                        bVar3 = bVar;
                        jArr3 = jArr;
                        iVar4 = iVar;
                        i18 = 0;
                    }
                } else {
                    iVar = iVar4;
                }
            } else {
                iVar = iVar4;
                arrayList = p13.j0.f134944a;
            }
            j1Var2 = j1Var;
            j1Var2.f135128f = p13.h0.C0(j1Var2.f135128f, (Iterable) arrayList);
        } else {
            iVar = iVar4;
        }
        s3.l lVarH = iVar.h();
        try {
            lVarH.d();
            lVarH.S(126665345, j1Var2.f135123a);
            s3.l.z(lVarH);
            lVarH.V(j1Var2.f135124b);
            List listD = lVar.D(oc.b.f(j1Var2.f135127e), lVarH);
            lVarH.N();
            lVarH.j();
            lVarH.k();
            lVarH.e(true);
            s3.i iVar5 = iVar;
            i1 i1Var = new i1(iVar5);
            p2.f135215h.getClass();
            if (!listD.isEmpty()) {
                int size = listD.size();
                int i44 = 0;
                while (true) {
                    if (i44 >= size) {
                        z14 = false;
                        break;
                    }
                    s3.b bVar6 = (s3.b) listD.get(i44);
                    if (iVar5.i(bVar6)) {
                        int iC3 = iVar5.c(bVar6);
                        int iC4 = s3.k.c(iC3, iVar5.f156348a);
                        int i45 = iC3 + 1;
                        if ((i45 < iVar5.f156349b ? iVar5.f156348a[(i45 * 5) + 4] : iVar5.f156350c.length) - iC4 > 0) {
                            obj = iVar5.f156350c[iC4];
                        } else {
                            m.f135153a.getClass();
                            obj = m.a.f135155b;
                        }
                        if (obj instanceof p2) {
                            z14 = true;
                            break;
                        }
                    }
                    i44++;
                }
            } else {
                z14 = false;
                break;
            }
            if (!z14) {
                return i1Var;
            }
            a aVar = new a(c0Var, j1Var2);
            s3.l lVarH2 = iVar5.h();
            try {
                p2.f135215h.getClass();
                p2.a.a(lVarH2, listD, aVar);
                Unit unit = Unit.INSTANCE;
                boolean z15 = true;
                return i1Var;
            } finally {
                lVarH2.e(false);
            }
        } catch (Throwable th3) {
            lVarH.e(false);
            throw th3;
        }
    }
}
