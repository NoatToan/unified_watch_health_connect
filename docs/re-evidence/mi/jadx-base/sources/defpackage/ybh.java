package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class ybh {
    public static <T extends mqd> boolean a(Set<mqd> set, Class<T> cls) {
        if (set != null && !set.isEmpty()) {
            Iterator<mqd> it = set.iterator();
            while (it.hasNext()) {
                if (it.next().getClass().isAssignableFrom(cls)) {
                    return true;
                }
            }
        }
        return false;
    }
}
