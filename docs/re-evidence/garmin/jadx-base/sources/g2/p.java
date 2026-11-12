package g2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;
import p3.p2;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v[] f75195a = new v[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final androidx.browser.trusted.c f75196b = new androidx.browser.trusted.c(11);

    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e4  */
    public static final void a(Object obj, int i14, y0 y0Var, z3.e eVar, p3.m mVar, int i15) {
        int i16;
        p3.o0 o0VarE = mVar.E(872548579);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.r(obj) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.k(i14) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.r(y0Var) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= o0VarE.r(eVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            boolean zB = o0VarE.B(obj) | o0VarE.B(y0Var);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zB) {
                objQ = new w0(obj, y0Var);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new w0(obj, y0Var);
                    o0VarE.K(objQ);
                }
            }
            w0 w0Var = (w0) objQ;
            w0Var.f75293c = i14;
            p3.c2 c2Var = w0Var.f75297g;
            p3.j0 j0Var = f5.u1.f69122a;
            f5.t1 t1Var = (f5.t1) o0VarE.A(j0Var);
            f4.f.f68735e.getClass();
            f4.f fVarA = f4.f.a.a();
            e23.l<Object, Unit> lVarE = fVarA != null ? fVarA.getF68799i() : null;
            f4.f fVarB = f4.f.a.b(fVarA);
            try {
                if (t1Var != ((f5.t1) c2Var.getF182175a())) {
                    c2Var.setValue(t1Var);
                    if (w0Var.f75294d > 0) {
                        f5.t1.a aVar2 = w0Var.f75295e;
                        if (aVar2 != null) {
                            aVar2.release();
                        }
                        w0Var.f75295e = t1Var != null ? t1Var.a() : null;
                    }
                }
                Unit unit = Unit.INSTANCE;
                f4.f.a.e(fVarA, fVarB, lVarE);
                boolean zB2 = o0VarE.B(w0Var);
                Object objQ2 = o0VarE.q();
                if (zB2) {
                    objQ2 = new g12.f(w0Var, 2);
                    o0VarE.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new g12.f(w0Var, 2);
                        o0VarE.K(objQ2);
                    }
                }
                p3.l0.a(w0Var, (e23.l) objQ2, o0VarE);
                p3.v.a(j0Var.c(w0Var), eVar, o0VarE, ((i16 >> 6) & 112) | 8);
            } catch (Throwable th3) {
                f4.f.a.e(fVarA, fVarB, lVarE);
                throw th3;
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.d(obj, i14, y0Var, eVar, i15, 5);
        }
    }

    public static final void b(i0 i0Var, Object obj, int i14, Object obj2, p3.m mVar, int i15) {
        p3.o0 o0VarE = mVar.E(1439843069);
        int i16 = (o0VarE.B(i0Var) ? 4 : 2) | i15 | (o0VarE.B(obj) ? 32 : 16) | (o0VarE.k(i14) ? 256 : 128) | (o0VarE.B(obj2) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            ((d4.c) obj).d(obj2, z3.f.c(980966366, new f2.o(i14, i0Var, obj2), o0VarE), o0VarE, 48);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f21.a0(i0Var, obj, i14, obj2, i15);
        }
    }

    public static final int c(int i14, q3.c cVar) {
        int i15 = cVar.f142358c - 1;
        int i16 = 0;
        while (i16 < i15) {
            int iA = am.j.a(i15, i16, 2, i16);
            Object[] objArr = cVar.f142356a;
            int i17 = ((j) objArr[iA]).f75138a;
            if (i17 != i14) {
                if (i17 < i14) {
                    i16 = iA + 1;
                    if (i14 < ((j) objArr[i16]).f75138a) {
                    }
                } else {
                    i15 = iA - 1;
                }
            }
            return iA;
        }
        return i16;
    }

    public static final List d(b2 b2Var, int i14, int i15, ArrayList arrayList, p1.l lVar, int i16, int i17, int i18, int i19, e23.l lVar2) {
        long j8;
        int i24;
        b2 b2Var2 = b2Var;
        if (b2Var2 == null || arrayList.isEmpty() || lVar.f134763b == 0) {
            return p13.j0.f134944a;
        }
        p1.h0 h0VarB = b2Var2.b(i14, i15, lVar);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i25 = 0; i25 < size; i25++) {
            Object obj = arrayList.get(i25);
            int index = ((t0) obj).getF62559a();
            int[] iArr = lVar.f134762a;
            int i26 = lVar.f134763b;
            for (int i27 = 0; i27 < i26; i27++) {
                if (iArr[i27] == index) {
                    arrayList3.add(obj);
                    break;
                }
            }
        }
        int[] iArr2 = h0VarB.f134762a;
        int i28 = h0VarB.f134763b;
        int i29 = 0;
        while (i29 < i28) {
            int i30 = iArr2[i29];
            Iterator it = arrayList.iterator();
            int i34 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i34 = -1;
                    break;
                }
                if (((t0) it.next()).getF62559a() == i30) {
                    break;
                }
                i34++;
            }
            t0 t0Var = i34 == -1 ? (t0) lVar2.invoke(Integer.valueOf(i30)) : (t0) arrayList.remove(i34);
            ArrayList arrayList4 = arrayList3;
            int i35 = t0Var.getF62577s();
            if (i34 == -1) {
                i24 = Integer.MIN_VALUE;
            } else {
                long jO = t0Var.o(0);
                if (t0Var.getF62561c()) {
                    g6.k.a aVar = g6.k.f76003b;
                    j8 = jO & 4294967295L;
                } else {
                    g6.k.a aVar2 = g6.k.f76003b;
                    j8 = jO >> 32;
                }
                i24 = (int) j8;
            }
            int iA = b2Var2.a(arrayList4, i30, i35, i24, i16);
            t0Var.k();
            t0Var.c(iA, 0, i18, i19);
            arrayList2.add(t0Var);
            i29++;
            b2Var2 = b2Var;
            arrayList3 = arrayList4;
        }
        return arrayList2;
    }

    public static final int e(int i14, i0 i0Var, Object obj) {
        int iA;
        return (obj == null || i0Var.getItemCount() == 0 || (i14 < i0Var.getItemCount() && obj.equals(i0Var.getKey(i14))) || (iA = i0Var.a(obj)) == -1) ? i14 : iA;
    }

    public static final h4.r f(h4.r rVar, r rVar2, n nVar, p008y1.b2 b2Var) {
        return rVar.then(new o(rVar2, nVar, false, b2Var));
    }

    public static final h4.r g(h4.r rVar, k23.m mVar, h1 h1Var, p008y1.b2 b2Var, boolean z14) {
        p3.x1 x1Var = p3.n.f135158a;
        return rVar.then(new i1(mVar, h1Var, b2Var, z14, false));
    }

    public static final List h(int i14, int i15, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return p13.j0.f134944a;
        }
        ArrayList arrayListD1 = p13.h0.d1(list);
        int size = arrayList.size();
        for (int i16 = 0; i16 < size; i16++) {
            t0 t0Var = (t0) arrayList.get(i16);
            int index = t0Var.getF62559a();
            if (i14 <= index && index <= i15) {
                arrayListD1.add(t0Var);
            }
        }
        p13.c0.u(arrayListD1, f75196b);
        return arrayListD1;
    }
}
