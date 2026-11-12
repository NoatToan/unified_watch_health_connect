package cw;

import java.util.ArrayList;
import java.util.Iterator;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
public final class e {
    public static final void a(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, iu1.a aVar) {
        bVar.getClass();
        bVar.b(new iu1.b(bVar, aVar));
    }

    public static final void b(com.garmin.android.library.backgroundtaskmanagement.b bVar, ArrayList arrayList) {
        bVar.getClass();
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new iu1.b(bVar, (iu1.a) it.next()));
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        bVar.c(arrayList2);
    }
}
