package me1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import fe1.o;
import h4.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o13.p;
import o4.m1;
import o53.f0;
import org.joda.time.DateTime;
import p13.h0;
import p13.j0;
import p13.y;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class f {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(be1.a aVar, fe1.n nVar, r rVar, p3.m mVar, int i14) {
        r rVar2;
        double d14;
        List list;
        List list2;
        List list3;
        CustomCombinedChart customCombinedChart;
        nVar.getClass();
        o0 o0VarE = mVar.E(-1047519218);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(nVar) ? 32 : 16) | 384;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            r.a aVar2 = r.S;
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(nVar.f70561e, o0VarE);
            hz.b bVarA = ge1.b.A(aVar);
            hz.d dVar = (hz.d) h0.d0(ge1.b.K(aVar));
            hz.b bVarC = nz.a.c(bVarA, nz.a.a(dVar != null ? dVar.f86388a : null, bVarA.f86379b, bVarA.f86381d, 60));
            DateTime dateTimeNow = bVarC.f86378a;
            if (dateTimeNow == null) {
                dateTimeNow = DateTime.now();
                dateTimeNow.getClass();
            }
            DateTime dateTimePlusDays = bVarC.f86379b;
            if (dateTimePlusDays == null) {
                dateTimePlusDays = DateTime.now().plusDays(1);
                dateTimePlusDays.getClass();
            }
            p pVar = new p(dateTimeNow, dateTimePlusDays);
            List listK = ge1.b.K(aVar);
            Collection collectionB = aVar != null ? aVar.b() : null;
            if (collectionB == null) {
                collectionB = j0.f134944a;
            }
            List list4 = j0.f134944a;
            if (collectionB != null && collectionB.isEmpty()) {
                d14 = 0.0d;
                break;
            }
            Iterator it = collectionB.iterator();
            while (true) {
                if (!it.hasNext()) {
                    d14 = 0.0d;
                    break;
                }
                d14 = 0.0d;
                if (((be1.c) it.next()).f17744c > 0.0d) {
                    ArrayList<be1.c> arrayList = new ArrayList();
                    for (Object obj : collectionB) {
                        if (((be1.c) obj).f17744c > 0.0d) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
                    for (be1.c cVar : arrayList) {
                        arrayList2.add(new hz.d(new DateTime(f0.y(cVar), ge1.b.A(aVar).f86381d), (float) cVar.f17744c));
                    }
                    list4 = arrayList2;
                    break;
                }
            }
            Collection collectionB2 = aVar != null ? aVar.b() : null;
            if (collectionB2 == null) {
                collectionB2 = j0.f134944a;
            }
            j0 j0Var = j0.f134944a;
            if (collectionB2 != null && collectionB2.isEmpty()) {
                list = j0Var;
                break;
            }
            Iterator it3 = collectionB2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    list = j0Var;
                    break;
                }
                if (((be1.c) it3.next()).f17745d > d14) {
                    ArrayList<be1.c> arrayList3 = new ArrayList();
                    for (Object obj2 : collectionB2) {
                        if (((be1.c) obj2).f17745d > d14) {
                            arrayList3.add(obj2);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(y.r(arrayList3, 10));
                    for (be1.c cVar2 : arrayList3) {
                        arrayList4.add(new hz.d(new DateTime(f0.y(cVar2), ge1.b.A(aVar).f86381d), (float) cVar2.f17745d));
                    }
                    list = arrayList4;
                    break;
                }
            }
            Collection collectionB3 = aVar != null ? aVar.b() : null;
            if (collectionB3 == null) {
                collectionB3 = j0.f134944a;
            }
            j0 j0Var2 = j0.f134944a;
            if (collectionB3 != null && collectionB3.isEmpty()) {
                list2 = j0Var2;
                break;
            }
            Iterator it4 = collectionB3.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    list2 = j0Var2;
                    break;
                }
                if (((be1.c) it4.next()).f17743b == -1.0d) {
                    ArrayList<be1.c> arrayList5 = new ArrayList();
                    for (Object obj3 : collectionB3) {
                        if (((be1.c) obj3).f17743b == -1.0d) {
                            arrayList5.add(obj3);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList(y.r(arrayList5, 10));
                    for (be1.c cVar3 : arrayList5) {
                        arrayList6.add(new hz.d(new DateTime(f0.y(cVar3), ge1.b.A(aVar).f86381d), (float) cVar3.f17743b));
                    }
                    list2 = arrayList6;
                    break;
                }
            }
            Collection collectionB4 = aVar != null ? aVar.b() : null;
            if (collectionB4 == null) {
                collectionB4 = j0.f134944a;
            }
            j0 j0Var3 = j0.f134944a;
            if (collectionB4 != null && collectionB4.isEmpty()) {
                list3 = j0Var3;
                break;
            }
            Iterator it5 = collectionB4.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    list3 = j0Var3;
                    break;
                }
                if (((be1.c) it5.next()).f17743b == -2.0d) {
                    ArrayList<be1.c> arrayList7 = new ArrayList();
                    for (Object obj4 : collectionB4) {
                        if (((be1.c) obj4).f17743b == -2.0d) {
                            arrayList7.add(obj4);
                        }
                    }
                    ArrayList arrayList8 = new ArrayList(y.r(arrayList7, 10));
                    for (be1.c cVar4 : arrayList7) {
                        arrayList8.add(new hz.d(new DateTime(f0.y(cVar4), ge1.b.A(aVar).f86381d), (float) cVar4.f17743b));
                    }
                    list3 = arrayList8;
                    break;
                }
            }
            ge1.a aVar3 = new ge1.a(listK, list4, list, list2, list3, aVar != null ? aVar.f17736y : null, (DateTime) pVar.f128594a, (DateTime) pVar.f128595b);
            boolean zG = gl1.d.G(aVar3);
            boolean zF = gl1.d.F(aVar3);
            ArrayList<ge1.c> arrayListD1 = h0.d1(ge1.c.f77004f);
            if (!zG) {
                arrayListD1.remove(ge1.c.HIGH_LOW_RATES);
            }
            if (!zF) {
                arrayListD1.remove(ge1.c.ACTIVE);
            }
            o0VarE.C(-1643580974);
            ArrayList arrayList9 = new ArrayList(y.r(arrayListD1, 10));
            for (ge1.c cVar5 : arrayListD1) {
                arrayList9.add(new l72.j0(gl1.y.Q(o0VarE, cVar5.f77006b), null, null, false, ((o) p1VarC.getF182175a()).f70582d.contains(cVar5), 14, null));
            }
            o0VarE.g0(false);
            i53.c cVarE = i53.a.e(arrayList9);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new CustomCombinedChart(context);
                o0VarE.K(objQ);
            }
            CustomCombinedChart customCombinedChart2 = (CustomCombinedChart) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                customCombinedChart = customCombinedChart2;
                objQ2 = new sz.a(customCombinedChart, new ie1.a(context), new ie1.b(customCombinedChart2), new k00.k(customCombinedChart2, true), new k00.g(customCombinedChart2), null, 32, null);
                o0VarE.K(objQ2);
            } else {
                customCombinedChart = customCombinedChart2;
            }
            m92.o.a(u1.n.e(aVar2, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a), gl1.y.Q(o0VarE, R.string.common_lbl_daily_timeline), null, null, z3.f.c(-914314354, new hl1.j(aVar2, customCombinedChart, (sz.a) objQ2, p1VarC, aVar3, context, 23), o0VarE), z3.f.c(-1472298417, new lb0.a(cVarE, 20, nVar, arrayListD1), o0VarE), null, o0VarE, 221184, 76);
            x1 x1Var2 = p3.n.f135158a;
            rVar2 = aVar2;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lb0.a(aVar, nVar, rVar2, i14, 21);
        }
    }
}
