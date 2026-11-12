package lc;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class w {
    public static final <T> T a(v vVar, k23.d<?> dVar) {
        vVar.getClass();
        dVar.getClass();
        Bundle bundleA = vVar.f111888h.a();
        if (bundleA == null) {
            p13.k0.f134949a.getClass();
            bundleA = h7.c.a((o13.p[]) Arrays.copyOf(new o13.p[0], 0));
        }
        Map<String, t> mapE = vVar.f111882b.e();
        LinkedHashMap linkedHashMap = new LinkedHashMap(p13.t0.a(mapE.size()));
        Iterator<T> it = mapE.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((t) entry.getValue()).f111866a);
        }
        return gl1.y.J(dVar).deserialize(new rc.j(bundleA, linkedHashMap));
    }
}
