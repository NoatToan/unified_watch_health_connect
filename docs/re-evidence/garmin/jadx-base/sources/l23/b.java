package l23;

import java.util.ArrayList;
import java.util.List;
import k23.k;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static final ArrayList a(k23.g gVar) {
        gVar.getClass();
        List<k> parameters = gVar.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((k) obj).getKind() == k.a.VALUE) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
