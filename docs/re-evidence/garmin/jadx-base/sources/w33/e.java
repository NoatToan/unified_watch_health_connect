package w33;

import androidx.core.view.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p13.h0;
import p13.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends f {
    /* JADX WARN: Illegal instructions before constructor call */
    public e(v33.a.e eVar, String[] strArr) {
        eVar.getClass();
        strArr.getClass();
        List<Integer> list = eVar.f175477c;
        Set setG1 = list.isEmpty() ? l0.f134950a : h0.g1(list);
        List<v33.a.e.c> list2 = eVar.f175476b;
        ArrayList arrayListL = j.l(list2);
        arrayListL.ensureCapacity(list2.size());
        for (v33.a.e.c cVar : list2) {
            int i14 = cVar.f175488c;
            for (int i15 = 0; i15 < i14; i15++) {
                arrayListL.add(cVar);
            }
        }
        arrayListL.trimToSize();
        super(strArr, setG1, arrayListL);
    }
}
