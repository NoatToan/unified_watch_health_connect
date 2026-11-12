package ae2;

import fe2.v1;
import fe2.w1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class i0 {
    public static final ArrayList a(b bVar) {
        ArrayList arrayList;
        bVar.getClass();
        List<h0> listE = bVar.e();
        if (listE != null) {
            arrayList = new ArrayList();
            Iterator<T> it = listE.iterator();
            while (it.hasNext()) {
                arrayList.add(w1.b((h0) it.next()));
            }
        } else {
            arrayList = new ArrayList();
        }
        String str = !arrayList.isEmpty() ? ((v1) arrayList.get(0)).f70966b : null;
        String groupTrackSessionId = bVar.getGroupTrackSessionId();
        if (groupTrackSessionId != null) {
            arrayList.add(new v1(groupTrackSessionId, str, null, v1.b.C1451b.f70976a, null, null, null, 116, null));
        }
        return arrayList;
    }
}
