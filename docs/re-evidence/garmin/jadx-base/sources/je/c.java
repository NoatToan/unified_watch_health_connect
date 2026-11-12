package je;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import ke.g;
import kg.f;

/* JADX INFO: loaded from: classes7.dex */
public class c {
    private c() {
    }

    public static boolean a(String str) {
        g.a aVar = g.f104531a;
        Set<ke.b> setUnmodifiableSet = Collections.unmodifiableSet(ke.a.f104524c);
        HashSet hashSet = new HashSet();
        for (ke.b bVar : setUnmodifiableSet) {
            if (bVar.a().equals(str)) {
                hashSet.add(bVar);
            }
        }
        if (hashSet.isEmpty()) {
            f.n("Unknown feature ".concat(str));
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((ke.b) it.next()).isSupported()) {
                return true;
            }
        }
        return false;
    }
}
