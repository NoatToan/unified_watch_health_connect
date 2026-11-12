package s5;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f157158a = new c("", null, 2, null);

    public static final List a(c cVar, int i14, int i15, d dVar) {
        List<c.d<? extends c.a>> list;
        if (i14 == i15 || (list = cVar.f157137a) == null) {
            return null;
        }
        if (i14 != 0 || i15 < cVar.f157138b.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i16 = 0; i16 < size; i16++) {
                c.d<? extends c.a> dVar2 = list.get(i16);
                if ((dVar != null ? ((Boolean) dVar.invoke(dVar2.f157149a)).booleanValue() : true) && b(i14, i15, dVar2.f157150b, dVar2.f157151c)) {
                    arrayList.add(new c.d((c.a) dVar2.f157149a, j23.t.e(dVar2.f157150b, i14, i15) - i14, j23.t.e(dVar2.f157151c, i14, i15) - i14, dVar2.f157152d));
                }
            }
            return arrayList;
        }
        if (dVar == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i17 = 0; i17 < size2; i17++) {
            c.d<? extends c.a> dVar3 = list.get(i17);
            if (((Boolean) dVar.invoke(dVar3.f157149a)).booleanValue()) {
                arrayList2.add(dVar3);
            }
        }
        return arrayList2;
    }

    public static final boolean b(int i14, int i15, int i16, int i17) {
        return ((i14 < i17) & (i16 < i15)) | (((i14 == i15) | (i16 == i17)) & (i14 == i16));
    }
}
