package p33;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Integer, j> f135512a;

    public r1(Map<Integer, j> map) {
        map.getClass();
        this.f135512a = map;
    }

    public final r1 a() {
        Map<Integer, j> map = this.f135512a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(p13.t0.a(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            j jVar = (j) entry.getValue();
            linkedHashMap.put(key, new j(jVar.f135460a, jVar.f135461b, jVar.f135462c, true));
        }
        return new r1(linkedHashMap);
    }
}
