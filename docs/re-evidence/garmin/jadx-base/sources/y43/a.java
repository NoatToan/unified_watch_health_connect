package y43;

import i43.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import z43.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Collection<T> a(Collection<? extends T> collection, Collection<? extends T> collection2) {
        collection2.getClass();
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == 0) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final i b(ArrayList arrayList) {
        i iVar = new i();
        for (Object obj : arrayList) {
            l lVar = (l) obj;
            if (lVar != null && lVar != l.b.f91061b) {
                iVar.add(obj);
            }
        }
        return iVar;
    }
}
