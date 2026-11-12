package ci;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p005kotlin.Metadata;
import p13.j0;
import p13.y;
import vh.i0;
import vh.m0;
import vh.s;
import vh.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lci/o;", "Lci/c;", "<init>", "()V", "apollo-normalized-cache-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class o implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f27620a = new o();

    private o() {
    }

    @Override // ci.c
    public final b a(Map<String, ? extends Object> map, d dVar) {
        Collection collection;
        map.getClass();
        u uVarA = dVar.f27598a.f178371b.a();
        int i14 = s.f178391a;
        uVarA.getClass();
        if (uVarA instanceof i0) {
            collection = ((i0) uVarA).f178326b;
        } else {
            collection = uVarA instanceof m0 ? ((m0) uVarA).f178349b : j0.f134944a;
        }
        if (collection.isEmpty()) {
            return null;
        }
        String strValueOf = String.valueOf(map.get("__typename"));
        ArrayList arrayList = new ArrayList(y.r(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(map.get((String) it.next())));
        }
        return new b(strValueOf, arrayList);
    }
}
