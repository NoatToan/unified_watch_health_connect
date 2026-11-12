package ry0;

import android.content.Context;
import cy0.o;
import cy0.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ly0.r;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public static final i53.f a(c cVar, Context context, r rVar) {
        cVar.getClass();
        context.getClass();
        rVar.getClass();
        ArrayList arrayList = new ArrayList();
        q qVar = cVar.f155064a;
        cy0.r uuid = qVar.getUuid();
        String uuid2 = uuid != null ? uuid.getUuid() : null;
        if (cVar.f155065b != null && uuid2 != null) {
            arrayList.add(new z3.e(62506043, true, new qy0.d(cVar, uuid2, rVar, context, 18)));
        }
        List<o> listD = qVar.d();
        if (listD != null) {
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                arrayList.add(new z3.e(-1567661706, true, new r12.a((o) it.next(), 27)));
            }
        }
        return i53.a.j(arrayList);
    }
}
