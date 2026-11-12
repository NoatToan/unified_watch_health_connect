package uu1;

import bl2.p;
import c2.b0;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import e23.l;
import h4.k;
import h4.r;
import h5.e0;
import j20.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import wt1.q;

/* JADX INFO: loaded from: classes10.dex */
public final class d {
    public static final void a(ArrayList arrayList, final int i14, final boolean z14, final l lVar, m mVar, int i15) {
        int i16;
        l lVar2;
        String strJ;
        b0 b0Var;
        boolean z15;
        lVar.getClass();
        o0 o0VarE = mVar.E(517876110);
        int i17 = (i15 & 6) == 0 ? (o0VarE.r(arrayList) ? 4 : 2) | i15 : i15;
        if ((i15 & 48) == 0) {
            i16 = i14;
            i17 |= o0VarE.k(i16) ? 32 : 16;
        } else {
            i16 = i14;
        }
        final boolean z16 = z14;
        if ((i15 & 384) == 0) {
            i17 |= o0VarE.h(z16) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            lVar2 = lVar;
            i17 |= o0VarE.r(lVar2) ? 2048 : 1024;
        } else {
            lVar2 = lVar;
        }
        int i18 = 1;
        boolean z17 = false;
        if (o0VarE.n(i17 & 1, (i17 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = p0.n(arrayList);
                o0VarE.K(objQ);
            }
            final p1 p1Var = (p1) objQ;
            r.a aVar = r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            final b0 b0Var2 = b0.f22601a;
            o0VarE.C(-1193030740);
            for (final mv1.f fVar : (List) p1Var.getF182175a()) {
                q qVar = fVar.f121192a;
                String str = fVar.f121193b;
                String strQ = gl1.y.Q(o0VarE, qVar.f187131b);
                if (fVar.f121194c) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 1354165856, R.string.selected, o0VarE, z17);
                } else {
                    o0VarE.C(-970443725);
                    o0VarE.g0(z17);
                    strJ = "";
                }
                b92.a.C0235a c0235a = new b92.a.C0235a(null, i18, null);
                int length = str.length();
                LinkedHashMap linkedHashMap = c0235a.f16962a;
                if (length > 0) {
                    linkedHashMap.put("merge", x.d(strQ, ". ", str, ". ", strJ));
                } else {
                    linkedHashMap.put(Constants.ScionAnalytics.PARAM_LABEL, strQ + ". " + strJ);
                }
                b92.a aVarB = c0235a.b();
                if (str.length() == 0) {
                    o0VarE.C(-970013629);
                    boolean z18 = fVar.f121194c;
                    boolean z19 = fVar.f121195d;
                    boolean zR = ((i17 & 896) == 256) | ((i17 & 112) == 32) | o0VarE.r(fVar) | ((i17 & 7168) == 2048);
                    Object objQ2 = o0VarE.q();
                    if (zR || objQ2 == m.a.f135155b) {
                        final int i19 = i16;
                        final l lVar3 = lVar2;
                        e23.a aVar3 = new e23.a() { // from class: uu1.b
                            @Override // e23.a
                            public final Object invoke() {
                                d.b(z16, i19, fVar, lVar3, p1Var);
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(aVar3);
                        objQ2 = aVar3;
                    }
                    int i24 = b92.a.f16960b;
                    cw1.r.a(null, strQ, aVarB, z18, z19, (e23.a) objQ2, o0VarE, 0, 1);
                    o0VarE.g0(false);
                    z15 = false;
                    b0Var = b0Var2;
                } else {
                    final b0 b0Var3 = b0Var2;
                    o0VarE.C(-969700188);
                    boolean z24 = fVar.f121194c;
                    boolean z25 = fVar.f121195d;
                    boolean zR2 = ((i17 & 896) == 256) | ((i17 & 112) == 32) | o0VarE.r(fVar) | ((i17 & 7168) == 2048);
                    Object objQ3 = o0VarE.q();
                    if (zR2 || objQ3 == m.a.f135155b) {
                        l lVar4 = new l() { // from class: uu1.c
                            @Override // e23.l
                            public final Object invoke(Object obj) {
                                ((Boolean) obj).getClass();
                                d.b(z14, i14, fVar, lVar, p1Var);
                                return Unit.INSTANCE;
                            }
                        };
                        b0Var = b0Var3;
                        o0VarE.K(lVar4);
                        objQ3 = lVar4;
                    } else {
                        b0Var = b0Var3;
                    }
                    int i25 = b92.a.f16960b;
                    o0 o0Var = o0VarE;
                    cw1.r.b(null, strQ, str, aVarB, z24, z25, (l) objQ3, o0Var, 0, 1);
                    o0VarE = o0Var;
                    z15 = false;
                    o0VarE.g0(false);
                }
                i16 = i14;
                z16 = z14;
                lVar2 = lVar;
                z17 = z15;
                b0Var2 = b0Var;
                i18 = 1;
            }
            o0VarE.g0(z17);
            o0VarE.g0(true);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.a(arrayList, i14, z14, lVar, i15, 9);
        }
    }

    public static final void b(boolean z14, int i14, mv1.f fVar, l lVar, p1 p1Var) {
        int i15;
        boolean z15 = fVar.f121194c;
        int i16 = 0;
        if (!z14) {
            List list = (List) p1Var.getF182175a();
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Boolean.valueOf(((mv1.f) it.next()).f121194c));
            }
            if (arrayList.isEmpty()) {
                i15 = 0;
            } else {
                Iterator it3 = arrayList.iterator();
                i15 = 0;
                while (it3.hasNext()) {
                    if (((Boolean) it3.next()).booleanValue() && (i15 = i15 + 1) < 0) {
                        p13.x.p();
                        throw null;
                    }
                }
            }
            if (i15 >= i14 && !z15) {
                return;
            }
        }
        mv1.f fVarA = mv1.f.a(fVar, !z15);
        Iterator it4 = ((List) p1Var.getF182175a()).iterator();
        while (true) {
            if (!it4.hasNext()) {
                i16 = -1;
                break;
            } else if (((mv1.f) it4.next()).f121192a == fVarA.f121192a) {
                break;
            } else {
                i16++;
            }
        }
        ArrayList arrayListD1 = h0.d1((List) p1Var.getF182175a());
        if (z14) {
            arrayListD1.replaceAll(new p(1));
        }
        arrayListD1.set(i16, fVarA);
        p1Var.setValue(arrayListD1);
        lVar.invoke(i53.a.e((List) p1Var.getF182175a()));
    }
}
