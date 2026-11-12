package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class coq {
    public static boolean d(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean e(Object obj, Class cls) {
        if (cls == null || obj == null || !(obj instanceof List)) {
            return false;
        }
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            if (!cls.isInstance(it.next())) {
                return false;
            }
        }
        return true;
    }
}
