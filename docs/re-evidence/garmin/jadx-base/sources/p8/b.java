package p8;

import androidx.health.platform.client.proto.q;
import androidx.health.platform.client.proto.y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k23.d;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final ArrayList a(d dVar, List list) {
        dVar.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            y1.a aVarV = y1.v();
            q qVarA = a.a(dVar);
            aVarV.g();
            y1.t((y1) aVarV.f7677b, qVarA);
            aVarV.g();
            y1.u((y1) aVarV.f7677b, str);
            arrayList.add(aVarV.e());
        }
        return arrayList;
    }
}
