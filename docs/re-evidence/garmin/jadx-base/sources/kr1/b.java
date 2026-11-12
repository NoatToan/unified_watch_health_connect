package kr1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static final Integer a(List<a> list) {
        Integer overallStressLevel;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            a aVar = (a) obj;
            a.b values = aVar.getValues();
            if ((values != null ? values.getOverallStressLevel() : null) != null && ((overallStressLevel = aVar.getValues().getOverallStressLevel()) == null || overallStressLevel.intValue() != -1)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a.b values2 = ((a) it.next()).getValues();
            values2.getClass();
            Integer overallStressLevel2 = values2.getOverallStressLevel();
            overallStressLevel2.getClass();
            arrayList2.add(overallStressLevel2);
        }
        return Integer.valueOf((int) h0.P(arrayList2));
    }
}
