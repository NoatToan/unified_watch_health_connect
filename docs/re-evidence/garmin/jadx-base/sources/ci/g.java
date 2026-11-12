package ci;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p13.y;
import vh.e0;
import vh.q;
import vh.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lci/g;", "Lci/e;", "<init>", "()V", "apollo-normalized-cache-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class g implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f27600a = new g();

    private g() {
    }

    @Override // ci.e
    public final Object a(q qVar, e0.b bVar, Map<String, Object> map, String str) {
        str.getClass();
        List<vh.o> list = qVar.f178374e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((vh.o) obj).f178360c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(String.valueOf(s.c(((vh.o) it.next()).f178359b, bVar)));
        }
        return !arrayList2.isEmpty() ? new b(qVar.f178371b.a().f178393a, arrayList2) : f.f27599a.a(qVar, bVar, map, str);
    }
}
