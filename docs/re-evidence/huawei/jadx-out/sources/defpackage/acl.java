package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class acl implements Iterable<aco> {
    protected Map<acz, aco> e;

    public acl() {
    }

    public acl(Map<acz, aco> map) {
        this.e = map;
    }

    public aco c(String str, Class<?>[] clsArr) {
        Map<acz, aco> map = this.e;
        if (map == null) {
            return null;
        }
        return map.get(new acz(str, clsArr));
    }

    @Override // java.lang.Iterable
    public Iterator<aco> iterator() {
        Map<acz, aco> map = this.e;
        if (map == null) {
            return Collections.emptyIterator();
        }
        return map.values().iterator();
    }
}
