package v21;

import b11.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.u;
import p005kotlin.Metadata;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv21/c;", "", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f175296a = new c();

    private c() {
    }

    public static List a(ArrayList arrayList, Integer num, j jVar, s21.e eVar) {
        double d14;
        double dDoubleValue;
        Double d15;
        Double d16;
        Double d17;
        jVar.getClass();
        f.f175333a.getClass();
        if (!f.s(num)) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            d14 = 100.0d;
            if (!it.hasNext()) {
                break;
            }
            arrayList2.add(Double.valueOf((((double) ((s21.j) it.next()).f156132d) / 100.0d) * ((double) num.intValue())));
        }
        f fVar = f.f175333a;
        int iIntValue = num.intValue();
        fVar.getClass();
        ArrayList arrayListH = f.h(iIntValue, arrayList2);
        ArrayList arrayList3 = new ArrayList(y.r(arrayList, 10));
        int i14 = 0;
        for (Object obj : arrayList) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            arrayList3.add(s21.j.a((s21.j) obj, 0, (Integer) arrayListH.get(i14), null, null, null, 239));
            i14 = i15;
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (true) {
            dDoubleValue = 0.0d;
            if (!it3.hasNext()) {
                break;
            }
            Integer num2 = ((s21.j) it3.next()).f156133e;
            if (num2 != null) {
                dDoubleValue = num2.intValue();
            }
            double d18 = d14;
            arrayList4.add(Double.valueOf(((((double) jVar.f14323b) / d18) * dDoubleValue) / 4.0d));
            arrayList5.add(Double.valueOf(((((double) jVar.f14324c) / d18) * dDoubleValue) / 9.0d));
            arrayList6.add(Double.valueOf(((((double) jVar.f14322a) / d18) * dDoubleValue) / 4.0d));
            d14 = d18;
        }
        u uVar = new u(arrayList4, arrayList5, arrayList6);
        List list = (List) uVar.f128605a;
        List list2 = (List) uVar.f128606b;
        List list3 = (List) uVar.f128607c;
        f fVar2 = f.f175333a;
        double dDoubleValue2 = (eVar == null || (d17 = eVar.f156099c) == null) ? 0.0d : d17.doubleValue();
        fVar2.getClass();
        ArrayList arrayListF = f.f(list, dDoubleValue2);
        ArrayList arrayListF2 = f.f(list2, (eVar == null || (d16 = eVar.f156098b) == null) ? 0.0d : d16.doubleValue());
        if (eVar != null && (d15 = eVar.f156097a) != null) {
            dDoubleValue = d15.doubleValue();
        }
        ArrayList arrayListF3 = f.f(list3, dDoubleValue);
        ArrayList arrayList7 = new ArrayList(y.r(arrayList3, 10));
        int i16 = 0;
        for (Object obj2 : arrayList3) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                x.q();
                throw null;
            }
            arrayList7.add(s21.j.a((s21.j) obj2, 0, null, (Double) arrayListF.get(i16), (Double) arrayListF2.get(i16), (Double) arrayListF3.get(i16), 31));
            i16 = i17;
        }
        return arrayList7;
    }

    public static j b(s21.e eVar) {
        Double d14;
        Double d15;
        Double d16;
        double dDoubleValue = (eVar == null || (d16 = eVar.f156099c) == null) ? 0.0d : d16.doubleValue();
        double dDoubleValue2 = (eVar == null || (d15 = eVar.f156098b) == null) ? 0.0d : d15.doubleValue();
        double dDoubleValue3 = (eVar == null || (d14 = eVar.f156097a) == null) ? 0.0d : d14.doubleValue();
        f.f175333a.getClass();
        double d17 = dDoubleValue * 4.0d;
        double d18 = dDoubleValue2 * 9.0d;
        double d19 = dDoubleValue3 * 4.0d;
        double d24 = d18 + d17 + d19;
        if (d24 == 0.0d) {
            return new j(0, 0, 0, 7, null);
        }
        ArrayList arrayListG = f.g(x.k(Double.valueOf((d17 / d24) * 100.0d), Double.valueOf((d18 / d24) * 100.0d), Double.valueOf((d19 / d24) * 100.0d)));
        return new j(((Number) arrayListG.get(2)).intValue(), ((Number) arrayListG.get(0)).intValue(), ((Number) arrayListG.get(1)).intValue());
    }
}
