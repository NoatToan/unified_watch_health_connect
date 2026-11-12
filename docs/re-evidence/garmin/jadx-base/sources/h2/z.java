package h2;

import f5.y0;
import g2.s0;
import java.util.ArrayList;
import java.util.List;
import p008y1.b2;

/* JADX INFO: loaded from: classes.dex */
public final class z {
    public static final h a(s0 s0Var, int i14, long j8, x xVar, long j14, b2 b2Var, h4.d.b bVar, h4.d.c cVar, g6.o oVar, boolean z14, int i15, p1.i0 i0Var) {
        List list;
        Object key = xVar.getKey(i14);
        List list2 = (List) i0Var.b(i14);
        if (list2 != null) {
            list = list2;
        } else {
            List<y0> listX0 = s0Var.x0(i14);
            int size = listX0.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i16 = 0; i16 < size; i16++) {
                arrayList.add(listX0.get(i16).Q(j8));
            }
            i0Var.i(i14, arrayList);
            list = arrayList;
        }
        return new h(i14, i15, list, j14, key, b2Var, bVar, cVar, oVar, z14, null);
    }
}
