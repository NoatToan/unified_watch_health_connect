package i43;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p13.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class n {
    public static final HashSet a(Iterable iterable) {
        iterable.getClass();
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set<x33.f> setE = ((l) it.next()).e();
            if (setE == null) {
                return null;
            }
            d0.v(hashSet, setE);
        }
        return hashSet;
    }
}
