package et1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.slf4j.Marker;
import p3.y3;

/* JADX INFO: loaded from: classes10.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:30:0x0090  */
    /* JADX WARN: Code duplicated, block: B:47:0x010e  */
    /* JADX WARN: Code duplicated, block: B:52:0x013e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0169  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [kotlin.jvm.internal.t0] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v45, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r3v46, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v47, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v49, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r3v50, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v15, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.ArrayList] */
    public static final void a(us1.n nVar, boolean z14, e23.a aVar, e23.l lVar, p3.m mVar, int i14) {
        boolean z15;
        final boolean zY;
        Object obj;
        float f14;
        final Context context;
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        bt1.j jVar;
        bt1.j jVar2;
        nVar.getClass();
        aVar.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(236546120);
        int i15 = i14 | (o0VarE.B(nVar) ? 4 : 2) | 16 | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            o0VarE.G0();
            int i16 = i14 & 1;
            p3.m.a aVar2 = p3.m.f135153a;
            if (i16 == 0 || o0VarE.o0()) {
                o0VarE.L(414512006);
                Scope scopeCurrentKoinScope = KoinApplicationKt.currentKoinScope(o0VarE, 0);
                p3.p1 p1VarQ = p3.p0.q(null, o0VarE);
                o0VarE.L(855641119);
                boolean zB = o0VarE.B(null) | o0VarE.B(scopeCurrentKoinScope);
                Object objQ = o0VarE.q();
                if (zB) {
                    objQ = scopeCurrentKoinScope.get(p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, new g(p1VarQ));
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = scopeCurrentKoinScope.get(p005kotlin.jvm.internal.s0.f105811a.b(f12.l.class), (Qualifier) null, new g(p1VarQ));
                        o0VarE.K(objQ);
                    }
                }
                o0VarE.g0(false);
                o0VarE.g0(false);
                zY = ((f12.l) objQ).y();
            } else {
                o0VarE.e();
                zY = z14;
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            Context context2 = (Context) o0VarE.A(y3Var);
            qs1.n nVar2 = zY ? us1.a.f172361b : us1.a.f172362c;
            qs1.n nVar3 = zY ? us1.a.f172363d : us1.a.f172364e;
            u1.d2 d2VarA = u1.a2.a(o0VarE);
            qs1.n nVar4 = nVar3;
            final j23.e eVarD = nVar2.d(null);
            float f15 = eVarD.f96789a;
            float f16 = eVarD.f96790b;
            qs1.n nVar5 = nVar.f172448f;
            j23.e eVarD2 = nVar5 != null ? nVar5.a(zY).d(nVar2) : null;
            Context context3 = (Context) o0VarE.A(y3Var);
            l3.f23124b.getClass();
            final String strE1 = l3.a.E1(context3, zY, true);
            boolean zR = o0VarE.r(context3) | o0VarE.h(zY);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new as2.d(context3, zY, 1);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new as2.d(context3, zY, 1);
                    o0VarE.K(objQ2);
                }
            }
            final e23.l lVar2 = (e23.l) objQ2;
            boolean zB2 = o0VarE.B(eVarD) | o0VarE.r(context3) | o0VarE.h(zY) | o0VarE.B(strE1);
            Object objQ3 = o0VarE.q();
            if (zB2) {
                final int i17 = 0;
                f14 = f15;
                context = context3;
                obj = new e23.l() { // from class: bt1.b
                    @Override // e23.l
                    public final Object invoke(Object obj2) {
                        int i18 = i17;
                        float fFloatValue = ((Float) obj2).floatValue();
                        switch (i18) {
                            case 0:
                                float fFloatValue2 = Float.valueOf(eVarD.f96790b).floatValue();
                                Context context4 = context;
                                boolean z16 = zY;
                                String str = strE1;
                                if (fFloatValue == fFloatValue2) {
                                    String string = context4.getString(R.string.string_space_string_pattern, g.b(fFloatValue, context4, z16).concat(Marker.ANY_NON_NULL_MARKER), str);
                                    string.getClass();
                                    return string;
                                }
                                String string2 = context4.getString(R.string.string_space_string_pattern, g.b(fFloatValue, context4, z16), str);
                                string2.getClass();
                                return string2;
                            default:
                                float fFloatValue3 = Float.valueOf(eVarD.f96790b).floatValue();
                                Context context5 = context;
                                boolean z17 = zY;
                                String str2 = strE1;
                                if (fFloatValue == fFloatValue3) {
                                    String string3 = context5.getString(R.string.string_space_string_pattern, i.b(fFloatValue, z17).concat(Marker.ANY_NON_NULL_MARKER), str2);
                                    string3.getClass();
                                    return string3;
                                }
                                String string4 = context5.getString(R.string.string_space_string_pattern, i.b(fFloatValue, z17), str2);
                                string4.getClass();
                                return string4;
                        }
                    }
                };
                o0VarE.K(obj);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    final int i18 = 0;
                    f14 = f15;
                    context = context3;
                    obj = new e23.l() { // from class: bt1.b
                        @Override // e23.l
                        public final Object invoke(Object obj2) {
                            int i19 = i18;
                            float fFloatValue = ((Float) obj2).floatValue();
                            switch (i19) {
                                case 0:
                                    float fFloatValue2 = Float.valueOf(eVarD.f96790b).floatValue();
                                    Context context4 = context;
                                    boolean z16 = zY;
                                    String str = strE1;
                                    if (fFloatValue == fFloatValue2) {
                                        String string = context4.getString(R.string.string_space_string_pattern, g.b(fFloatValue, context4, z16).concat(Marker.ANY_NON_NULL_MARKER), str);
                                        string.getClass();
                                        return string;
                                    }
                                    String string2 = context4.getString(R.string.string_space_string_pattern, g.b(fFloatValue, context4, z16), str);
                                    string2.getClass();
                                    return string2;
                                default:
                                    float fFloatValue3 = Float.valueOf(eVarD.f96790b).floatValue();
                                    Context context5 = context;
                                    boolean z17 = zY;
                                    String str2 = strE1;
                                    if (fFloatValue == fFloatValue3) {
                                        String string3 = context5.getString(R.string.string_space_string_pattern, i.b(fFloatValue, z17).concat(Marker.ANY_NON_NULL_MARKER), str2);
                                        string3.getClass();
                                        return string3;
                                    }
                                    String string4 = context5.getString(R.string.string_space_string_pattern, i.b(fFloatValue, z17), str2);
                                    string4.getClass();
                                    return string4;
                            }
                        }
                    };
                    o0VarE.K(obj);
                } else {
                    f14 = f15;
                    obj = objQ3;
                    context = context3;
                }
            }
            final e23.l lVar3 = (e23.l) obj;
            boolean zR2 = o0VarE.r(context);
            Object objQ4 = o0VarE.q();
            if (zR2) {
                objQ4 = new a51.m(context, 2);
                o0VarE.K(objQ4);
            } else {
                aVar2.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new a51.m(context, 2);
                    o0VarE.K(objQ4);
                }
            }
            final e23.l lVar4 = (e23.l) objQ4;
            Object objQ5 = o0VarE.q();
            aVar2.getClass();
            if (objQ5 == p3.m.a.f135155b) {
                objQ5 = bt1.f.f21110a;
                o0VarE.K(objQ5);
            }
            final k23.g gVar = (k23.g) objQ5;
            int iFloatValue = ((int) (Float.valueOf(f16).floatValue() - Float.valueOf(f14).floatValue())) + 1;
            ArrayList arrayList5 = new ArrayList(iFloatValue);
            int i19 = 0;
            while (i19 < iFloatValue) {
                int i24 = iFloatValue;
                float f17 = f16;
                float fFloatValue = (i19 * 1) + Float.valueOf(f14).floatValue();
                float f18 = f14;
                if (((int) fFloatValue) == ((int) Float.valueOf(f17).floatValue())) {
                    jVar2 = new bt1.j(fFloatValue, lVar2.invoke(Float.valueOf(fFloatValue)) + Marker.ANY_NON_NULL_MARKER);
                } else {
                    jVar2 = new bt1.j(fFloatValue, (String) lVar2.invoke(Float.valueOf(fFloatValue)));
                }
                arrayList5.add(jVar2);
                i19++;
                iFloatValue = i24;
                f14 = f18;
                f16 = f17;
            }
            final i53.c cVarE = i53.a.e(arrayList5);
            Object[] objArr = {eVarD, cVarE, Boolean.valueOf(zY)};
            d4.l lVarA = bt1.u.a.a(bt1.u.f21147q, eVarD, cVarE, 0, lVar2, lVar3, (e23.l) gVar);
            boolean zB3 = o0VarE.B(eVarD) | o0VarE.B(cVarE) | o0VarE.k(0) | o0VarE.B(lVar2) | o0VarE.B(lVar3) | o0VarE.B(lVar4) | o0VarE.B(eVarD2);
            Object objQ6 = o0VarE.q();
            if (zB3 || objQ6 == p3.m.a.f135155b) {
                final int i25 = 0;
                final j23.e eVar = eVarD2;
                final int i26 = 0;
                objQ6 = new e23.a() { // from class: bt1.c
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i25) {
                            case 0:
                                return new u(eVarD, cVarE, i26, lVar2, lVar3, lVar4, (e23.l) gVar, eVar);
                            default:
                                return new u(eVarD, cVarE, i26, lVar2, lVar3, lVar4, (e23.l) gVar, eVar);
                        }
                    }
                };
                o0VarE.K(objQ6);
            }
            bt1.u uVar = (bt1.u) d4.a.c(objArr, lVarA, (e23.a) objQ6, o0VarE, 0);
            p3.x1 x1Var2 = p3.n.f135158a;
            final j23.e eVarD3 = nVar4.d(null);
            float f19 = eVarD3.f96789a;
            float f22 = eVarD3.f96790b;
            qs1.n nVar6 = nVar.f172449g;
            j23.e eVarD4 = nVar6 != null ? nVar6.a(zY).d(nVar4) : null;
            final Context context4 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            l3.f23124b.getClass();
            final String strH1 = l3.a.H1(context4, zY);
            boolean zH = o0VarE.h(zY);
            Object objQ7 = o0VarE.q();
            if (zH || objQ7 == p3.m.a.f135155b) {
                objQ7 = new a81.j(zY, 6);
                o0VarE.K(objQ7);
            }
            final e23.l lVar5 = (e23.l) objQ7;
            boolean zB4 = o0VarE.B(eVarD3) | o0VarE.r(context4) | o0VarE.h(zY) | o0VarE.B(strH1);
            Object objQ8 = o0VarE.q();
            if (zB4 || objQ8 == p3.m.a.f135155b) {
                final int i27 = 1;
                objQ8 = new e23.l() { // from class: bt1.b
                    @Override // e23.l
                    public final Object invoke(Object obj2) {
                        int i110 = i27;
                        float fFloatValue2 = ((Float) obj2).floatValue();
                        switch (i110) {
                            case 0:
                                float fFloatValue3 = Float.valueOf(eVarD3.f96790b).floatValue();
                                Context context5 = context4;
                                boolean z16 = zY;
                                String str = strH1;
                                if (fFloatValue2 == fFloatValue3) {
                                    String string = context5.getString(R.string.string_space_string_pattern, g.b(fFloatValue2, context5, z16).concat(Marker.ANY_NON_NULL_MARKER), str);
                                    string.getClass();
                                    return string;
                                }
                                String string2 = context5.getString(R.string.string_space_string_pattern, g.b(fFloatValue2, context5, z16), str);
                                string2.getClass();
                                return string2;
                            default:
                                float fFloatValue4 = Float.valueOf(eVarD3.f96790b).floatValue();
                                Context context6 = context4;
                                boolean z17 = zY;
                                String str2 = strH1;
                                if (fFloatValue2 == fFloatValue4) {
                                    String string3 = context6.getString(R.string.string_space_string_pattern, i.b(fFloatValue2, z17).concat(Marker.ANY_NON_NULL_MARKER), str2);
                                    string3.getClass();
                                    return string3;
                                }
                                String string4 = context6.getString(R.string.string_space_string_pattern, i.b(fFloatValue2, z17), str2);
                                string4.getClass();
                                return string4;
                        }
                    }
                };
                o0VarE.K(objQ8);
            }
            final e23.l lVar6 = (e23.l) objQ8;
            boolean zR3 = o0VarE.r(context4);
            Object objQ9 = o0VarE.q();
            if (zR3 || objQ9 == p3.m.a.f135155b) {
                objQ9 = new a51.m(context4, 3);
                o0VarE.K(objQ9);
            }
            final e23.l lVar7 = (e23.l) objQ9;
            Object objQ10 = o0VarE.q();
            if (objQ10 == p3.m.a.f135155b) {
                objQ10 = bt1.h.f21111a;
                o0VarE.K(objQ10);
            }
            final k23.g gVar2 = (k23.g) objQ10;
            int i28 = 100;
            int iFloatValue2 = (((int) (Float.valueOf(f22).floatValue() - Float.valueOf(f19).floatValue())) / 100) + 1;
            ArrayList arrayList6 = new ArrayList(iFloatValue2);
            int i29 = 0;
            while (i29 < iFloatValue2) {
                bt1.u uVar2 = uVar;
                float fFloatValue2 = (i28 * i29) + Float.valueOf(f19).floatValue();
                int i30 = i28;
                int i34 = i29;
                if (((int) fFloatValue2) == ((int) Float.valueOf(f22).floatValue())) {
                    jVar = new bt1.j(fFloatValue2, lVar5.invoke(Float.valueOf(fFloatValue2)) + Marker.ANY_NON_NULL_MARKER);
                } else {
                    jVar = new bt1.j(fFloatValue2, (String) lVar5.invoke(Float.valueOf(fFloatValue2)));
                }
                arrayList6.add(jVar);
                i29 = i34 + 1;
                uVar = uVar2;
                i28 = i30;
                f19 = f19;
            }
            bt1.u uVar3 = uVar;
            final i53.c cVarE2 = i53.a.e(arrayList6);
            final int iFloatValue3 = (((int) (Float.valueOf(f22).floatValue() - Float.valueOf(f19).floatValue())) / 100) - 1;
            Object[] objArr2 = {eVarD3, Boolean.valueOf(zY)};
            d4.l lVarA2 = bt1.u.a.a(bt1.u.f21147q, eVarD3, cVarE2, iFloatValue3, lVar5, lVar6, (e23.l) gVar2);
            boolean zB5 = o0VarE.B(eVarD3) | o0VarE.B(cVarE2) | o0VarE.k(iFloatValue3) | o0VarE.B(lVar5) | o0VarE.B(lVar6) | o0VarE.B(lVar7) | o0VarE.B(eVarD4);
            Object objQ11 = o0VarE.q();
            if (zB5 || objQ11 == p3.m.a.f135155b) {
                final int i35 = 1;
                final j23.e eVar2 = eVarD4;
                objQ11 = new e23.a() { // from class: bt1.c
                    @Override // e23.a
                    public final Object invoke() {
                        switch (i35) {
                            case 0:
                                return new u(eVarD3, cVarE2, iFloatValue3, lVar5, lVar6, lVar7, (e23.l) gVar2, eVar2);
                            default:
                                return new u(eVarD3, cVarE2, iFloatValue3, lVar5, lVar6, lVar7, (e23.l) gVar2, eVar2);
                        }
                    }
                };
                o0VarE.K(objQ11);
            }
            bt1.u uVar4 = (bt1.u) d4.a.c(objArr2, lVarA2, (e23.a) objQ11, o0VarE, 0);
            p3.x1 x1Var3 = p3.n.f135158a;
            i53.c<us1.j> cVar = nVar.f172446d;
            if (cVar != null) {
                arrayList = new ArrayList(p13.y.r(cVar, 10));
                Iterator<us1.j> it = cVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().f172424b);
                }
            } else {
                arrayList = 0;
            }
            if (arrayList == 0) {
                arrayList = p13.j0.f134944a;
            }
            Object[] array = ((Collection) arrayList).toArray(new String[0]);
            f4.s sVarH = gl1.y.H(Arrays.copyOf(array, array.length), o0VarE);
            Object objQ12 = o0VarE.q();
            if (objQ12 == p3.m.a.f135155b) {
                objQ12 = hb.a.n(nVar.f172445c, o0VarE);
            }
            p3.p1 p1Var = (p3.p1) objQ12;
            i53.c<us1.h> cVar2 = nVar.f172447e;
            if (cVar2 != null) {
                arrayList2 = new ArrayList(p13.y.r(cVar2, 10));
                Iterator<us1.h> it3 = cVar2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(context2.getString(it3.next().f172408b));
                }
            } else {
                arrayList2 = 0;
            }
            if (arrayList2 == 0) {
                arrayList2 = p13.j0.f134944a;
            }
            Object[] array2 = ((Collection) arrayList2).toArray(new String[0]);
            f4.s sVarH2 = gl1.y.H(Arrays.copyOf(array2, array2.length), o0VarE);
            i53.c<us1.m> cVar3 = nVar.f172444b;
            if (cVar3 != null) {
                arrayList3 = new ArrayList(p13.y.r(cVar3, 10));
                Iterator<us1.m> it4 = cVar3.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(context2.getString(it4.next().f172442b));
                }
            } else {
                arrayList3 = 0;
            }
            if (arrayList3 == 0) {
                arrayList3 = p13.j0.f134944a;
            }
            Object[] array3 = ((Collection) arrayList3).toArray(new String[0]);
            f4.s sVarH3 = gl1.y.H(Arrays.copyOf(array3, array3.length), o0VarE);
            i53.c<us1.i> cVar4 = nVar.f172443a;
            if (cVar4 != null) {
                arrayList4 = new ArrayList(p13.y.r(cVar4, 10));
                Iterator<us1.i> it5 = cVar4.iterator();
                while (it5.hasNext()) {
                    arrayList4.add(context2.getString(it5.next().f172418b));
                }
            } else {
                arrayList4 = 0;
            }
            if (arrayList4 == 0) {
                arrayList4 = p13.j0.f134944a;
            }
            Object[] array4 = ((Collection) arrayList4).toArray(new String[0]);
            f4.s sVarH4 = gl1.y.H(Arrays.copyOf(array4, array4.length), o0VarE);
            boolean z16 = zY;
            z02.d.a(false, z3.f.c(1813205091, new dd1.d(aVar, uVar3, uVar4, sVarH, sVarH2, sVarH3, sVarH4, p1Var, 3), o0VarE), null, null, null, z3.f.c(1317268703, new e(d2VarA, lVar, sVarH4, context2, sVarH2, sVarH3, sVarH, uVar3, z16, uVar4, p1Var), o0VarE), o0VarE, 196656, 29);
            p3.x1 x1Var4 = p3.n.f135158a;
            z15 = z16;
        } else {
            o0VarE.e();
            z15 = z14;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.g(nVar, z15, aVar, lVar, i14);
        }
    }
}
