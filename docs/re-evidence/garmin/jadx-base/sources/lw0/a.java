package lw0;

import androidx.core.view.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kw0.d;
import p005kotlin.jvm.internal.s;
import p13.j0;
import pv0.y;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    public static final ArrayList a(List list, List list2) {
        boolean z14;
        ArrayList arrayListL = j.l(list2);
        for (Object obj : list) {
            y yVar = (y) obj;
            boolean z15 = false;
            if (!list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (s.g(dVar.f106916c, yVar)) {
                        Integer num = dVar.f106915b;
                        if ((num != null ? num.intValue() : 0) > 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        z15 = true;
                        break;
                    }
                }
            }
            if (z15) {
                arrayListL.add(obj);
            }
        }
        return arrayListL;
    }

    public static final List<d> b(List<d> list) {
        ArrayList arrayList;
        Integer num;
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                d dVar = (d) obj;
                if (dVar.f106914a != null && (num = dVar.f106915b) != null && num.intValue() > 0) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? j0.f134944a : arrayList;
    }
}
