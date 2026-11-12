package ae0;

import am.x0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k1;
import f72.a2;
import f72.j0;
import f72.kb;
import gs1.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m92.h0;
import p13.y;
import p3.m;
import p3.n;
import p3.x1;
import u4.p;
import v62.l1;
import yz1.s;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f2798a;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f2798a = 14;
    }

    public static final ArrayList a(i53.c cVar, m mVar) {
        x1 x1Var = n.f135158a;
        d92.b.f58623a.getClass();
        long jA = d92.b.a(mVar).c().a();
        long j8 = d92.b.a(mVar).f().f63508c;
        mVar.C(-1265970866);
        ArrayList arrayList = new ArrayList(y.r(cVar, 10));
        Iterator<E> it = cVar.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            o92.e eVar = o92.e.CIRCLE;
            long jA2 = n5.a.a(mVar, hVar.f2800b);
            float f14 = s.f200414a;
            arrayList.add(new h0.e.C2226e(new h0.e.a(hVar.f2799a, 0.0f), new o92.b(eVar, jA2, new o92.a(jA, 5.0f, null), null), p.b(hVar.f2801c, mVar), j8, hVar.f2802d, null));
        }
        mVar.f();
        x1 x1Var2 = n.f135158a;
        return arrayList;
    }

    public static final i53.f<h> b(List<v> list) {
        u4.d dVarS;
        list.getClass();
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        for (v vVar : list) {
            v.a aVar = vVar.f78883a;
            float fH = aVar instanceof v.a.d ? f2798a : s.h();
            int iH = zx0.m.h(vVar);
            aVar.getClass();
            Object obj = aVar.f78887a;
            boolean z14 = aVar instanceof v.a.C1589a;
            int i14 = R.color.gds_data_viz_red_secondary;
            if (z14 || (aVar instanceof v.a.c)) {
                obj.getClass();
                int i15 = zx0.m.a.f207369a[((x0) obj).ordinal()];
                if (i15 != 1 && i15 != 2 && i15 != 3 && i15 != 4) {
                    i14 = z14 ? R.color.gds_data_viz_green_primary : R.color.gds_data_viz_neutral_secondary;
                }
            } else if (!(aVar instanceof v.a.f) && !(aVar instanceof v.a.b)) {
                if (!(aVar instanceof v.a.e.d) && !(aVar instanceof v.a.e.c) && !(aVar instanceof v.a.e.C1590a) && !(aVar instanceof v.a.e.b) && !(aVar instanceof v.a.d)) {
                    u0.r();
                    return null;
                }
                i14 = R.color.gds_data_viz_blue_primary;
            }
            if (z14 || (aVar instanceof v.a.c)) {
                obj.getClass();
                bv.b.f21239a.getClass();
                bv.b.a();
                dVarS = ((x0) obj).s(k1.f37122a.l0());
            } else if (aVar instanceof v.a.f) {
                s62.a.f157643a.getClass();
                dVarS = a2.a(t62.c.f162799a);
            } else if (aVar instanceof v.a.b) {
                s62.a.f157643a.getClass();
                dVarS = j0.a(t62.c.f162799a);
            } else if ((aVar instanceof v.a.e.d) || (aVar instanceof v.a.e.c) || (aVar instanceof v.a.d)) {
                s62.a.f157643a.getClass();
                dVarS = kb.a(t62.c.f162799a);
            } else {
                if (!(aVar instanceof v.a.e.C1590a) && !(aVar instanceof v.a.e.b)) {
                    u0.r();
                    return null;
                }
                s62.a.f157643a.getClass();
                dVarS = l1.a(t62.b.f162798a);
            }
            arrayList.add(new h(iH, i14, dVarS, fH, null));
        }
        return i53.a.j(arrayList);
    }
}
