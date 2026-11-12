package f5;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface z0 {
    default int c(x xVar, List<? extends w> list, int i14) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            arrayList.add(new l(list.get(i15), y.Min, z.Width));
        }
        return f(new a0(xVar, xVar.getF68887b()), arrayList, g6.b.b(0, i14, 7)).getF81878a();
    }

    a1 f(b1 b1Var, List<? extends y0> list, long j8);

    default int g(x xVar, List<? extends w> list, int i14) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            arrayList.add(new l(list.get(i15), y.Min, z.Height));
        }
        return f(new a0(xVar, xVar.getF68887b()), arrayList, g6.b.b(i14, 0, 13)).getF81879b();
    }

    default int h(x xVar, List<? extends w> list, int i14) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            arrayList.add(new l(list.get(i15), y.Max, z.Height));
        }
        return f(new a0(xVar, xVar.getF68887b()), arrayList, g6.b.b(i14, 0, 13)).getF81879b();
    }

    default int i(x xVar, List<? extends w> list, int i14) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            arrayList.add(new l(list.get(i15), y.Max, z.Width));
        }
        return f(new a0(xVar, xVar.getF68887b()), arrayList, g6.b.b(0, i14, 7)).getF68888a();
    }
}
