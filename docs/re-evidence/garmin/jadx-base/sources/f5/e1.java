package f5;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface e1 {
    default int c(x xVar, List<? extends List<? extends w>> list, int i14) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            List list2 = (List) arrayList.get(i15);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i16 = 0; i16 < size2; i16++) {
                arrayList3.add(new l((w) list2.get(i16), y.Min, z.Width));
            }
            arrayList2.add(arrayList3);
        }
        return f(new a0(xVar, xVar.getF68887b()), arrayList2, g6.b.b(0, i14, 7)).getF68888a();
    }

    a1 f(b1 b1Var, List<? extends List<? extends y0>> list, long j8);

    default int g(x xVar, List<? extends List<? extends w>> list, int i14) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            List list2 = (List) arrayList.get(i15);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i16 = 0; i16 < size2; i16++) {
                arrayList3.add(new l((w) list2.get(i16), y.Min, z.Height));
            }
            arrayList2.add(arrayList3);
        }
        return f(new a0(xVar, xVar.getF68887b()), arrayList2, g6.b.b(i14, 0, 13)).getF68889b();
    }

    default int h(x xVar, List<? extends List<? extends w>> list, int i14) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            List list2 = (List) arrayList.get(i15);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i16 = 0; i16 < size2; i16++) {
                arrayList3.add(new l((w) list2.get(i16), y.Max, z.Height));
            }
            arrayList2.add(arrayList3);
        }
        return f(new a0(xVar, xVar.getF68887b()), arrayList2, g6.b.b(i14, 0, 13)).getF68889b();
    }

    default int i(x xVar, List<? extends List<? extends w>> list, int i14) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            List list2 = (List) arrayList.get(i15);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i16 = 0; i16 < size2; i16++) {
                arrayList3.add(new l((w) list2.get(i16), y.Max, z.Width));
            }
            arrayList2.add(arrayList3);
        }
        return f(new a0(xVar, xVar.getF68887b()), arrayList2, g6.b.b(0, i14, 7)).getF68888a();
    }
}
