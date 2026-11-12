package fe2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class q1 {
    public static final com.garmin.android.library.livetrack.c a(ae2.o oVar) {
        oVar.getClass();
        if (oVar.equals(ae2.o.b.m.f2965d)) {
            return com.garmin.android.library.livetrack.c.g.f50192a;
        }
        if (oVar.equals(ae2.o.b.j.f2962d)) {
            return com.garmin.android.library.livetrack.c.d.f50189a;
        }
        if (oVar.equals(ae2.o.b.k.f2963d)) {
            return com.garmin.android.library.livetrack.c.e.f50190a;
        }
        if (oVar.equals(ae2.o.b.p.f2968d)) {
            return com.garmin.android.library.livetrack.c.j.f50195a;
        }
        if (oVar.equals(ae2.o.b.l.f2964d)) {
            return com.garmin.android.library.livetrack.c.f.f50191a;
        }
        if (oVar.equals(ae2.o.a.C0046a.f2950c)) {
            return com.garmin.android.library.livetrack.c.b.f50187a;
        }
        if (oVar.equals(ae2.o.a.b.f2951c)) {
            return com.garmin.android.library.livetrack.c.a.f50186a;
        }
        return oVar.equals(ae2.o.a.c.f2952c) ? com.garmin.android.library.livetrack.c.j.f50195a : com.garmin.android.library.livetrack.c.j.f50195a;
    }

    public static final LinkedHashMap b(List list) {
        wd2.e2 e2Var;
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                t1 t1Var = (t1) it.next();
                ae2.o oVar = t1Var.f70934a;
                String str2 = t1Var.f70935b;
                oVar.getClass();
                if (oVar.equals(ae2.o.b.i.f2961d)) {
                    e2Var = wd2.e2.g.f184451a;
                } else if (oVar.equals(ae2.o.b.d.f2956d) || oVar.equals(ae2.o.b.e.f2957d)) {
                    e2Var = wd2.e2.c.f184447a;
                } else if (oVar.equals(ae2.o.b.h.f2960d)) {
                    e2Var = wd2.e2.f.f184450a;
                } else if (oVar.equals(ae2.o.b.f.f2958d)) {
                    e2Var = wd2.e2.e.f184449a;
                } else if (oVar.equals(ae2.o.b.g.f2959d)) {
                    e2Var = wd2.e2.d.f184448a;
                } else if (oVar.equals(ae2.o.b.a.f2954d)) {
                    e2Var = wd2.e2.a.f184445a;
                } else if (oVar.equals(ae2.o.b.C0047b.f2955d)) {
                    e2Var = wd2.e2.b.f184446a;
                } else if (oVar.equals(ae2.o.b.C0048o.f2967d)) {
                    e2Var = wd2.e2.i.f184453a;
                } else {
                    e2Var = oVar.equals(ae2.o.b.n.f2966d) ? wd2.e2.h.f184452a : wd2.e2.j.f184454a;
                }
                String str3 = t1Var.f70934a.f2948a;
                if (str3 != null) {
                    if (d53.w.z(str3, wd2.f2.a.f184464c.f184462a, false)) {
                        arrayList.add(new wd2.d2(e2Var, str2));
                    } else {
                        wd2.f2.c cVar = wd2.f2.c.f184465c;
                        if (d53.w.z(str3, cVar.f184462a, false) || ((str = cVar.f184463b) != null && d53.w.z(str3, str, false))) {
                            arrayList2.add(new wd2.d2(e2Var, str2));
                        } else if (d53.w.z(str3, wd2.f2.e.f184467c.f184462a, false)) {
                            arrayList3.add(new wd2.d2(e2Var, str2));
                        } else if (d53.w.z(str3, wd2.f2.d.f184466c.f184462a, false)) {
                            arrayList4.add(new wd2.d2(e2Var, str2));
                        }
                    }
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!arrayList.isEmpty()) {
            linkedHashMap.put(wd2.f2.a.f184464c, arrayList);
        }
        if (!arrayList2.isEmpty()) {
            linkedHashMap.put(wd2.f2.c.f184465c, arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            linkedHashMap.put(wd2.f2.e.f184467c, arrayList3);
        }
        if (!arrayList4.isEmpty()) {
            linkedHashMap.put(wd2.f2.d.f184466c, arrayList4);
        }
        return linkedHashMap;
    }
}
