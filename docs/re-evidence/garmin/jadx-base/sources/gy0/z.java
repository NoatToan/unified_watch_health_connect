package gy0;

import java.util.ArrayList;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class z {
    public static final i53.f a(i53.c cVar, DateTime dateTime, DateTime dateTime2) {
        ArrayList<k61.a> arrayList = new ArrayList();
        for (Object obj : cVar) {
            DateTime dateTime3 = ((k61.a) obj).f103161b.toDateTime();
            Boolean boolValueOf = dateTime3 != null ? Boolean.valueOf((dateTime3.isBefore(dateTime) || dateTime3.isAfter(dateTime2)) ? false : true) : null;
            if (boolValueOf != null ? boolValueOf.booleanValue() : false) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        for (k61.a aVar : arrayList) {
            m92.h0.e.a aVar2 = aVar.f103160a;
            DateTime dateTime4 = aVar.f103161b;
            arrayList2.add(new k61.a(m92.h0.e.a.a(aVar2, g22.k.a(dateTime4, dateTime), 0.0f, 2), dateTime4, aVar.f103162c));
        }
        return i53.a.j(arrayList2);
    }
}
