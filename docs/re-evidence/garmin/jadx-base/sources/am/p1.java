package am;

import androidx.lifecycle.ViewModelStoreOwner;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.i7;
import i3.mh;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import p3.p2;
import v62.o7;

/* JADX INFO: loaded from: classes7.dex */
public final class p1 {
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    public static final void a(x0 x0Var, boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        int i16;
        long jE;
        p3.o0 o0VarE = mVar.E(1179589579);
        int i17 = i14 | (o0VarE.k(x0Var.ordinal()) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (z14) {
                i15 = -285775824;
                i16 = R.string.lbl_selected;
            } else {
                i15 = -285774444;
                i16 = R.string.lbl_not_selected;
            }
            String strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, false);
            String strT = gl1.d.T(x0Var.f4360c, o0VarE, 0);
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarF = x2.f(aVar2, 1.0f);
            boolean zB = o0VarE.B(strJ);
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zB) {
                objQ = new defpackage.b(strJ, 10);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new defpackage.b(strJ, 10);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarC = p5.v.c((e23.l) objQ, rVarF, true);
            boolean z15 = (i17 & 896) == 256;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new defpackage.c(aVar, 13);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new defpackage.c(aVar, 13);
                    o0VarE.K(objQ2);
                }
            }
            h4.r rVarE = u1.n.e(u1.w.d(rVarC, false, null, null, (e23.a) objQ2, 15), j.c(d92.b.f58623a, o0VarE), o4.m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(rVarE, f14, eVar.f97920e);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarZ, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            h4.r rVarA = u2.f22900a.a(aVar2, 1.0f, true);
            d92.b.f58624b.getClass();
            mh.c(strT, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97931h, o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            s62.a.f157643a.getClass();
            u4.d dVarA = v62.e1.a(t62.b.f162798a);
            if (z14) {
                o0VarE.C(120840845);
                jE = d92.b.a(o0VarE).f().a();
            } else {
                o0VarE.C(120841967);
                jE = d92.b.a(o0VarE).c().e();
            }
            o0VarE.g0(false);
            i7.b(dVarA, null, null, jE, o0VarE, 48, 4);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i1(x0Var, z14, aVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0146  */
    public static final void b(e2.i0 i0Var, String str, List<? extends x0> list, x0 x0Var, e23.l<? super x0, Unit> lVar, p3.m mVar, int i14, int i15) {
        String str2;
        int i16;
        p3.o0 o0Var;
        String str3;
        boolean z14;
        int i17;
        p3.o0 o0VarE = mVar.E(-743154051);
        int i18 = i14 | (o0VarE.B(i0Var) ? 4 : 2);
        int i19 = i15 & 2;
        if (i19 != 0) {
            i16 = i18 | 48;
            str2 = str;
        } else {
            str2 = str;
            i16 = i18 | (o0VarE.B(str2) ? 32 : 16);
        }
        int i24 = i16 | (o0VarE.r(list) ? 256 : 128) | (o0VarE.k(x0Var == null ? -1 : x0Var.ordinal()) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192);
        if (o0VarE.n(i24 & 1, (i24 & 9363) != 9362)) {
            String upperCase = null;
            String str4 = i19 != 0 ? null : str2;
            p3.x1 x1Var = p3.n.f135158a;
            if (str4 != null) {
                upperCase = str4.toUpperCase(Locale.ROOT);
                upperCase.getClass();
            }
            String str5 = upperCase;
            if (str5 == null) {
                o0VarE.C(1254373590);
                o0VarE.g0(false);
                i17 = 2048;
                z14 = false;
            } else {
                o0VarE.C(1254373591);
                h4.r rVarF = x2.f(h4.r.S, 1.0f);
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97917b;
                float f15 = eVar.f97920e;
                bVar.getClass();
                bVar.getClass();
                bVar.getClass();
                h4.r rVarB = c2.l.B(rVarF, f15, f15, f15, f14);
                d92.b.f58624b.getClass();
                z14 = false;
                i17 = 2048;
                mh.c(str5, rVarB, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
            boolean zR = o0VarE.r(list) | ((i24 & 7168) == i17 ? true : z14) | ((57344 & i24) == 16384 ? true : z14);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new a4.a(list, 3, x0Var, lVar);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a4.a(list, 3, x0Var, lVar);
                    o0VarE.K(objQ);
                }
            }
            e2.c.b(null, i0Var, null, null, null, null, false, null, (e23.l) objQ, o0VarE, (i24 << 3) & 112, 509);
            o0Var = o0VarE;
            str3 = str4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            str3 = str2;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.n(i0Var, str3, list, x0Var, lVar, i14, i15, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ec  */
    public static final void c(String str, gr.a aVar, gr.b bVar, p3.m mVar, int i14) {
        List list;
        e2.i0 i0Var;
        boolean z14;
        List list2;
        int i15;
        boolean z15;
        boolean z16;
        gr.a aVar2 = aVar;
        p3.o0 o0VarE = mVar.E(-2107991909);
        int i16 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(aVar2) ? 32 : 16) | (o0VarE.r(bVar) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            y0 y0Var = (y0) KoinJavaComponent.get$default(y0.class, null, null, 6, null);
            o0VarE.C(1444348207);
            List<x0> list3 = aVar2.f78514a;
            int iA = p13.t0.a(p13.y.r(list3, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA >= 16 ? iA : 16);
            for (Object obj : list3) {
                linkedHashMap.put(obj, gl1.d.T(((x0) obj).f4360c, o0VarE, 0));
            }
            o0VarE.g0(false);
            boolean zJ = d53.w.J(str);
            List<x0> list4 = aVar2.f78514a;
            if (zJ) {
                list = list4;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list4) {
                    String str2 = (String) linkedHashMap.get((x0) obj2);
                    if (str2 != null && d53.w.z(str2, str, true)) {
                        arrayList.add(obj2);
                    }
                }
                list = arrayList;
            }
            e2.i0 i0VarA = e2.k0.a(aVar2.f78518e, 0, 2, o0VarE);
            int i17 = i16 & 14;
            p3.p1 p1VarQ = p3.p0.q(str, o0VarE);
            Unit unit = Unit.INSTANCE;
            boolean zR = o0VarE.r(bVar) | o0VarE.B(p1VarQ) | o0VarE.B(i0VarA);
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zR) {
                objQ = new m1(bVar, i0VarA, p1VarQ, null);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new m1(bVar, i0VarA, p1VarQ, null);
                    o0VarE.K(objQ);
                }
            }
            p3.l0.e((e23.p) objQ, unit, o0VarE);
            Object objQ2 = o0VarE.q();
            aVar3.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(str);
                o0VarE.K(objQ2);
            }
            p3.p1 p1Var = (p3.p1) objQ2;
            boolean zB = (i17 == 4) | o0VarE.B(i0VarA) | o0VarE.r(aVar2);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                n1 n1Var = new n1(str, i0VarA, aVar2, p1Var, null);
                i0Var = i0VarA;
                aVar2 = aVar2;
                o0VarE.K(n1Var);
                objQ3 = n1Var;
            } else {
                i0Var = i0VarA;
            }
            p3.l0.e((e23.p) objQ3, str, o0VarE);
            if (aVar2.f78520g) {
                o0VarE.C(1826176947);
                boolean z17 = aVar2.f78519f;
                boolean zR2 = o0VarE.r(bVar);
                Object objQ4 = o0VarE.q();
                if (zR2 || objQ4 == c2565a) {
                    objQ4 = new d1(bVar, 0);
                    o0VarE.K(objQ4);
                }
                e23.a aVar4 = (e23.a) objQ4;
                boolean zR3 = o0VarE.r(bVar);
                Object objQ5 = o0VarE.q();
                if (zR3 || objQ5 == c2565a) {
                    objQ5 = new d1(bVar, 1);
                    o0VarE.K(objQ5);
                }
                f(z17, aVar4, (e23.a) objQ5, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1826411431);
                o0VarE.g0(false);
            }
            if (!list.isEmpty() || d53.w.J(str)) {
                o0VarE.C(1826773015);
                if (d53.w.J(str)) {
                    z14 = true;
                    list2 = list;
                    i15 = i17;
                    z15 = false;
                    o0VarE.C(1827171303);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1826780827);
                    String strP = gl1.y.P(R.string.lbl_filter_results, new Object[]{Integer.valueOf(list.size())}, o0VarE);
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    j92.b bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97917b;
                    bVar2.getClass();
                    h4.r rVarZ = c2.l.z(rVarF, eVar.f97920e, f14);
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarF = d92.c.f(j92.f.f97935l, o0VarE);
                    d6.h.f57752b.getClass();
                    list2 = list;
                    z14 = true;
                    z15 = false;
                    i15 = i17;
                    mh.c(strP, rVarZ, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 130044);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                }
                boolean zR4 = o0VarE.r(list2) | o0VarE.r(y0Var) | (i15 == 4 ? z14 : z15) | o0VarE.r(aVar2) | o0VarE.r(bVar);
                Object objQ6 = o0VarE.q();
                if (zR4 || objQ6 == c2565a) {
                    z16 = z15;
                    e1 e1Var = new e1(list2, y0Var, str, aVar2, bVar, 0);
                    o0VarE.K(e1Var);
                    objQ6 = e1Var;
                } else {
                    z16 = z15;
                }
                p3.o0 o0Var = o0VarE;
                e2.c.b(null, i0Var, null, null, null, null, false, null, (e23.l) objQ6, o0Var, 0, 509);
                o0VarE = o0Var;
                o0VarE.g0(z16);
            } else {
                o0VarE.C(1826498386);
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_no_results);
                String strQ2 = gl1.y.Q(o0VarE, R.string.no_activities_match_search_try_other);
                s62.a.f157643a.getClass();
                b82.n.c(o7.a(t62.b.f162798a), strQ, strQ2, null, null, o0VarE, 0, 24);
                o0VarE.g0(false);
            }
            p3.x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f1(str, aVar, bVar, i14, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(String str, gr.b bVar, e23.a aVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        gr.b bVar2;
        int i15;
        gr.b bVar3;
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-2049980739);
        int i16 = i14 | (o0VarE.B(str) ? 4 : 2) | 16 | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(gr.b.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
                o0VarE.g0(false);
                i15 = i16 & (-113);
                bVar3 = (gr.b) u1VarResolveViewModel;
            } else {
                o0VarE.e();
                i15 = i16 & (-113);
                bVar3 = bVar;
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            p3.p1 p1VarC = s9.c.c(bVar3.f78525b, o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.TRUE);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            Object[] objArr = new Object[0];
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new ak0.t(5);
                o0VarE.K(objQ2);
            }
            p3.p1 p1Var2 = (p3.p1) d4.a.e(objArr, (e23.a) objQ2, o0VarE, 48);
            Object[] objArr2 = new Object[0];
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new ak0.t(6);
                o0VarE.K(objQ3);
            }
            p3.p1 p1Var3 = (p3.p1) d4.a.e(objArr2, (e23.a) objQ3, o0VarE, 48);
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = kg.f.j(o0VarE);
            }
            m4.b0 b0Var = (m4.b0) objQ4;
            Boolean bool = (Boolean) p1Var2.getF182175a();
            bool.booleanValue();
            boolean zB = o0VarE.B(p1Var2);
            Object objQ5 = o0VarE.q();
            if (zB || objQ5 == c2565a) {
                objQ5 = new o1(b0Var, p1Var2, null);
                o0VarE.K(objQ5);
            }
            p3.l0.e((e23.p) objQ5, bool, o0VarE);
            boolean zB2 = o0VarE.B(p1Var2) | o0VarE.B(p1Var3);
            Object objQ6 = o0VarE.q();
            if (zB2 || objQ6 == c2565a) {
                objQ6 = new j1(p1Var3, p1Var2, 0);
                o0VarE.K(objQ6);
            }
            e23.a aVar2 = (e23.a) objQ6;
            boolean zB3 = ((i15 & 896) == 256) | o0VarE.B(p1Var2) | o0VarE.B(aVar2);
            Object objQ7 = o0VarE.q();
            if (zB3 || objQ7 == c2565a) {
                objQ7 = new k1(aVar2, aVar, p1Var2, 0);
                o0VarE.K(objQ7);
            }
            c.w.a(0, 1, (e23.a) objQ7, o0VarE, false);
            o0Var = o0VarE;
            z02.d.a(false, z3.f.c(-310754238, new a42.c(aVar2, aVar, (Object) str, (Object) p1Var2, (Object) p1VarC, (Object) p1Var, 2), o0VarE), null, null, null, z3.f.c(-1407423418, new a42.c(b0Var, p1Var3, bVar3, p1Var2, p1Var, p1VarC, 3), o0VarE), o0Var, 196656, 29);
            bVar2 = bVar3;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            bVar2 = bVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a3.e(str, bVar2, aVar, i14, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x035e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0071  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0283  */
    /* JADX WARN: Code duplicated, block: B:97:0x0314  */
    public static final void e(String str, gr.a aVar, final gr.b bVar, p3.m mVar, int i14) {
        List list;
        e2.i0 i0Var;
        boolean z14;
        boolean z15;
        p3.o0 o0VarE = mVar.E(-113607177);
        final int i15 = 2;
        int i16 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(bVar) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            int i17 = aVar.f78518e;
            List<x0> list2 = aVar.f78515b;
            List<x0> list3 = aVar.f78523j;
            e2.i0 i0VarA = e2.k0.a(i17, 0, 2, o0VarE);
            boolean z16 = aVar.f78520g;
            p3.m.a aVar2 = p3.m.f135153a;
            if (z16) {
                o0VarE.C(-36868649);
                boolean z17 = aVar.f78519f;
                boolean zR = o0VarE.r(bVar);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new d1(bVar, 2);
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new d1(bVar, 2);
                        o0VarE.K(objQ);
                    }
                }
                e23.a aVar3 = (e23.a) objQ;
                boolean zR2 = o0VarE.r(bVar);
                Object objQ2 = o0VarE.q();
                if (zR2) {
                    objQ2 = new d1(bVar, 3);
                    o0VarE.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new d1(bVar, 3);
                        o0VarE.K(objQ2);
                    }
                }
                f(z17, aVar3, (e23.a) objQ2, o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-36634165);
                o0VarE.g0(false);
            }
            o0VarE.C(-1802295029);
            int iA = p13.t0.a(p13.y.r(list3, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (Object obj : list3) {
                linkedHashMap.put(obj, gl1.d.T(((x0) obj).f4360c, o0VarE, 0));
            }
            o0VarE.g0(false);
            o0VarE.C(-1802291989);
            int iA2 = p13.t0.a(p13.y.r(list2, 10));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
            for (Object obj2 : list2) {
                linkedHashMap2.put(obj2, gl1.d.T(((x0) obj2).f4360c, o0VarE, 0));
            }
            o0VarE.g0(false);
            LinkedHashMap linkedHashMapH = p13.u0.h(linkedHashMap, linkedHashMap2);
            boolean zJ = d53.w.J(str);
            List<x0> list4 = aVar.f78514a;
            if (zJ) {
                list = list4;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list4) {
                    String str2 = (String) linkedHashMapH.get((x0) obj3);
                    if (str2 != null && d53.w.z(str2, str, true)) {
                        arrayList.add(obj3);
                    }
                }
                list = arrayList;
            }
            h4.r.a aVar4 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            p3.x1 x1Var2 = p3.n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar4, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar5);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            if (d53.w.J(str)) {
                o0VarE.C(1758234324);
                if (list3.isEmpty() && list2.isEmpty()) {
                    o0VarE.C(1758314304);
                    String strQ = gl1.y.Q(o0VarE, R.string.lbl_suggested_activities);
                    String strQ2 = gl1.y.Q(o0VarE, R.string.msg_no_suggestions_found);
                    s62.a.f157643a.getClass();
                    b82.n.c(u62.a.a(t62.a.f162797a), strQ, strQ2, null, null, o0VarE, 0, 24);
                    o0VarE.g0(false);
                    z14 = true;
                } else {
                    o0VarE.C(1758614570);
                    if (list3.isEmpty()) {
                        i0Var = i0VarA;
                        z14 = true;
                        o0VarE.C(1759113825);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(1758662155);
                        String strQ3 = gl1.y.Q(o0VarE, R.string.common_suggested);
                        List<x0> list5 = aVar.f78523j;
                        x0 x0Var = aVar.f78516c;
                        boolean zR3 = o0VarE.r(bVar);
                        Object objQ3 = o0VarE.q();
                        if (zR3) {
                            z14 = true;
                            final char c14 = 1 == true ? 1 : 0;
                            objQ3 = new e23.l() { // from class: am.g1
                                @Override // e23.l
                                public final Object invoke(Object obj4) {
                                    x0 x0Var2 = (x0) obj4;
                                    switch (c14) {
                                        case 0:
                                            x0Var2.getClass();
                                            bVar.y4(x0Var2);
                                            break;
                                        case 1:
                                            x0Var2.getClass();
                                            bVar.y4(x0Var2);
                                            break;
                                        default:
                                            x0Var2.getClass();
                                            bVar.y4(x0Var2);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ3);
                        } else {
                            aVar2.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                z14 = true;
                                final int c15 = 1 == true ? 1 : 0;
                                objQ3 = new e23.l() { // from class: am.g1
                                    @Override // e23.l
                                    public final Object invoke(Object obj4) {
                                        x0 x0Var2 = (x0) obj4;
                                        switch (c15) {
                                            case 0:
                                                x0Var2.getClass();
                                                bVar.y4(x0Var2);
                                                break;
                                            case 1:
                                                x0Var2.getClass();
                                                bVar.y4(x0Var2);
                                                break;
                                            default:
                                                x0Var2.getClass();
                                                bVar.y4(x0Var2);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                o0VarE.K(objQ3);
                            } else {
                                z14 = true;
                            }
                        }
                        i0Var = i0VarA;
                        b(i0Var, strQ3, list5, x0Var, (e23.l) objQ3, o0VarE, 0, 0);
                        o0VarE.g0(false);
                    }
                    if (list2.isEmpty()) {
                        o0VarE.C(1759637601);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(1759191697);
                        String strQ4 = gl1.y.Q(o0VarE, R.string.common_recent);
                        List<x0> list6 = aVar.f78515b;
                        x0 x0Var2 = aVar.f78516c;
                        boolean zR4 = o0VarE.r(bVar);
                        Object objQ4 = o0VarE.q();
                        if (zR4) {
                            objQ4 = new e23.l() { // from class: am.g1
                                @Override // e23.l
                                public final Object invoke(Object obj4) {
                                    x0 x0Var3 = (x0) obj4;
                                    switch (i15) {
                                        case 0:
                                            x0Var3.getClass();
                                            bVar.y4(x0Var3);
                                            break;
                                        case 1:
                                            x0Var3.getClass();
                                            bVar.y4(x0Var3);
                                            break;
                                        default:
                                            x0Var3.getClass();
                                            bVar.y4(x0Var3);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ4);
                        } else {
                            aVar2.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new e23.l() { // from class: am.g1
                                    @Override // e23.l
                                    public final Object invoke(Object obj4) {
                                        x0 x0Var3 = (x0) obj4;
                                        switch (i15) {
                                            case 0:
                                                x0Var3.getClass();
                                                bVar.y4(x0Var3);
                                                break;
                                            case 1:
                                                x0Var3.getClass();
                                                bVar.y4(x0Var3);
                                                break;
                                            default:
                                                x0Var3.getClass();
                                                bVar.y4(x0Var3);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                o0VarE.K(objQ4);
                            }
                        }
                        b(i0Var, strQ4, list6, x0Var2, (e23.l) objQ4, o0VarE, 0, 0);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else {
                o0VarE.C(1757099290);
                if (list.isEmpty()) {
                    o0VarE.C(1757140396);
                    String strQ5 = gl1.y.Q(o0VarE, R.string.lbl_no_results);
                    String strQ6 = gl1.y.Q(o0VarE, R.string.no_activities_match_search_try_other);
                    s62.a.f157643a.getClass();
                    b82.n.c(o7.a(t62.b.f162798a), strQ5, strQ6, null, null, o0VarE, 0, 24);
                    o0VarE.g0(false);
                    z15 = false;
                } else {
                    o0VarE.C(1757419954);
                    String strP = gl1.y.P(R.string.lbl_filter_results, new Object[]{Integer.valueOf(list.size())}, o0VarE);
                    h4.r rVarF = x2.f(aVar4, 1.0f);
                    d92.b.f58623a.getClass();
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97917b;
                    bVar3.getClass();
                    h4.r rVarZ = c2.l.z(rVarF, eVar.f97920e, f14);
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarF = d92.c.f(j92.f.f97935l, o0VarE);
                    d6.h.f57752b.getClass();
                    z15 = false;
                    mh.c(strP, rVarZ, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 130044);
                    x0 x0Var3 = aVar.f78516c;
                    boolean zR5 = o0VarE.r(bVar);
                    Object objQ5 = o0VarE.q();
                    if (zR5) {
                        o0VarE = o0VarE;
                        o0VarE = o0VarE;
                        final int i18 = z15 ? 1 : 0;
                        objQ5 = new e23.l() { // from class: am.g1
                            @Override // e23.l
                            public final Object invoke(Object obj4) {
                                x0 x0Var4 = (x0) obj4;
                                switch (i18) {
                                    case 0:
                                        x0Var4.getClass();
                                        bVar.y4(x0Var4);
                                        break;
                                    case 1:
                                        x0Var4.getClass();
                                        bVar.y4(x0Var4);
                                        break;
                                    default:
                                        x0Var4.getClass();
                                        bVar.y4(x0Var4);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ5);
                    } else {
                        aVar2.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            o0VarE = o0VarE;
                            o0VarE = o0VarE;
                            final int i19 = z15 ? 1 : 0;
                            objQ5 = new e23.l() { // from class: am.g1
                                @Override // e23.l
                                public final Object invoke(Object obj4) {
                                    x0 x0Var4 = (x0) obj4;
                                    switch (i19) {
                                        case 0:
                                            x0Var4.getClass();
                                            bVar.y4(x0Var4);
                                            break;
                                        case 1:
                                            x0Var4.getClass();
                                            bVar.y4(x0Var4);
                                            break;
                                        default:
                                            x0Var4.getClass();
                                            bVar.y4(x0Var4);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ5);
                        }
                    }
                    o0VarE = o0VarE;
                    b(i0VarA, null, list, x0Var3, (e23.l) objQ5, o0VarE, 0, 2);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z15);
                z14 = true;
            }
            o0VarE.g0(z14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f1(str, aVar, bVar, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a2  */
    public static final void f(boolean z14, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(629092259);
        int i15 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            int i16 = z14 ? R.string.change_event_type_message : R.string.lbl_change_activity_type_message;
            l72.c1 c1Var = l72.c1.f110940a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_change_activity_type_title);
            String strQ2 = gl1.y.Q(o0VarE, i16);
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_common_continue);
            String strQ4 = gl1.y.Q(o0VarE, R.string.common_cancel);
            boolean z15 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (z15) {
                objQ = new defpackage.c(aVar, 11);
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new defpackage.c(aVar, 11);
                    o0VarE.K(objQ);
                }
            }
            e23.a<Unit> aVar4 = (e23.a) objQ;
            boolean z16 = (i15 & 896) == 256;
            Object objQ2 = o0VarE.q();
            if (z16) {
                objQ2 = new defpackage.c(aVar2, 12);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new defpackage.c(aVar2, 12);
                    o0VarE.K(objQ2);
                }
            }
            o0Var = o0VarE;
            c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar4, strQ4, (e23.a) objQ2, o0Var, 0, 0, 217);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a51.a(z14, aVar, aVar2, i14, 1);
        }
    }
}
