package po;

import am.x0;
import am.z0;
import android.content.res.Resources;
import android.util.TypedValue;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import ps.d1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpo/c0;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f138827a = new c0();

    private c0() {
    }

    public static void a(l22.a aVar, uo.a aVar2, com.garmin.android.apps.connectmobile.activities.newmodel.a0 a0Var) {
        com.garmin.android.library.mapsdkadapter.p pVar = new com.garmin.android.library.mapsdkadapter.p();
        pVar.b(2131232001);
        pVar.f50327a.f50313e = aVar.getString(R.string.lbl_stop);
        pVar.a(0.5f, 0.9f);
        pVar.d(new com.garmin.android.library.mapsdkadapter.f(a0Var.D(), com.garmin.android.library.mapsdkadapter.i.b.WGS84));
        pVar.f50327a.f50311c = 2.0f;
        aVar2.a(pVar);
    }

    public static void b(Resources resources, l22.a aVar, uo.a aVar2, x0 x0Var, ArrayList arrayList) {
        if (arrayList.size() > 1) {
            x0 x0VarL = z0.l(x0.f4346x, x0Var.f4358a);
            com.garmin.android.library.mapsdkadapter.q qVar = new com.garmin.android.library.mapsdkadapter.q();
            int i14 = x0VarL.f4359b;
            ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
            int color = resources.getColor(i14, null);
            ie2.p pVar = qVar.f50328a;
            pVar.f93156d = color;
            pVar.f93155c = 5.0f;
            com.garmin.android.library.mapsdkadapter.p pVar2 = new com.garmin.android.library.mapsdkadapter.p();
            String strB = aVar.b(x0Var.f4360c);
            com.garmin.android.library.mapsdkadapter.o oVar = pVar2.f50327a;
            oVar.f50313e = strB;
            pVar2.c(qw0.l.a(resources, x0VarL.f4361d));
            pVar2.d(new com.garmin.android.library.mapsdkadapter.f(((com.garmin.android.apps.connectmobile.activities.newmodel.a0) p13.h0.b0(arrayList)).D(), com.garmin.android.library.mapsdkadapter.i.b.WGS84));
            oVar.f50311c = 5.0f;
            aVar2.a(pVar2);
            ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new com.garmin.android.library.mapsdkadapter.f(((com.garmin.android.apps.connectmobile.activities.newmodel.a0) it.next()).D(), com.garmin.android.library.mapsdkadapter.i.b.WGS84));
            }
            qVar.a(arrayList2);
            aVar2.f172067a.add(qVar);
        }
    }

    public static final uo.a c(Resources resources, l22.a aVar, List list, List list2) {
        double d14;
        com.garmin.android.apps.connectmobile.activities.newmodel.a0 a0Var;
        resources.getClass();
        if (list2 == null || list2.isEmpty() || list == null || list.isEmpty()) {
            return null;
        }
        double d15 = ((d1) p13.h0.b0(list)).f139792h;
        double d16 = ((d1) p13.h0.m0(list)).f139793i;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            d14 = 1000.0d;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            double dG = ((com.garmin.android.apps.connectmobile.activities.newmodel.a0) next).G() / 1000.0d;
            if (d15 <= dG && dG <= d16) {
                arrayList.add(next);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        List list3 = arrayList;
        if (zIsEmpty) {
            list3 = list2;
        }
        uo.a aVar2 = new uo.a();
        Iterator it3 = list.iterator();
        int i14 = 0;
        Object objM0 = null;
        while (true) {
            boolean zHasNext = it3.hasNext();
            c0 c0Var = f138827a;
            if (!zHasNext) {
                uo.a aVar3 = aVar2;
                com.garmin.android.apps.connectmobile.activities.newmodel.a0 a0Var2 = (com.garmin.android.apps.connectmobile.activities.newmodel.a0) objM0;
                if (a0Var2 != null) {
                    c0Var.getClass();
                    a(aVar, aVar3, a0Var2);
                }
                return aVar3;
            }
            Object next2 = it3.next();
            int i15 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            d1 d1Var = (d1) next2;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list3) {
                double d17 = d14;
                uo.a aVar4 = aVar2;
                Iterator it4 = it3;
                if (new j23.p(d1Var.f139792h, d1Var.f139793i).contains(Double.valueOf(((com.garmin.android.apps.connectmobile.activities.newmodel.a0) obj).G() / d17))) {
                    arrayList2.add(obj);
                }
                it3 = it4;
                aVar2 = aVar4;
                d14 = d17;
            }
            uo.a aVar5 = aVar2;
            Iterator it5 = it3;
            double d18 = d14;
            ArrayList arrayList3 = new ArrayList(arrayList2);
            com.garmin.android.apps.connectmobile.activities.newmodel.a0 a0Var3 = (com.garmin.android.apps.connectmobile.activities.newmodel.a0) p13.h0.n0(arrayList3);
            if (a0Var3 != null && (a0Var = (com.garmin.android.apps.connectmobile.activities.newmodel.a0) p13.h0.e0(list3.indexOf(a0Var3) + 1, list3)) != null) {
                arrayList3.add(a0Var);
            }
            x0 x0Var = d1Var.f139790f;
            c0Var.getClass();
            b(resources, aVar, aVar5, x0Var, arrayList3);
            if (i14 == 0 && arrayList3.size() > 1) {
                com.garmin.android.apps.connectmobile.activities.newmodel.a0 a0Var4 = (com.garmin.android.apps.connectmobile.activities.newmodel.a0) p13.h0.b0(arrayList3);
                com.garmin.android.library.mapsdkadapter.p pVar = new com.garmin.android.library.mapsdkadapter.p();
                pVar.b(2131232000);
                pVar.f50327a.f50313e = aVar.getString(R.string.lbl_start);
                pVar.a(0.5f, 0.9f);
                pVar.d(new com.garmin.android.library.mapsdkadapter.f(a0Var4.D(), com.garmin.android.library.mapsdkadapter.i.b.WGS84));
                pVar.f50327a.f50311c = 2.0f;
                aVar5.a(pVar);
            }
            if (arrayList3.size() > 1) {
                objM0 = p13.h0.m0(arrayList3);
            }
            it3 = it5;
            aVar2 = aVar5;
            i14 = i15;
            d14 = d18;
        }
    }
}
