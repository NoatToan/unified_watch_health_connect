package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public class ahy {
    public static boolean b(Object obj, Collection<String> collection, Collection<String> collection2) {
        if (collection == null && collection2 == null) {
            return false;
        }
        if (collection2 == null) {
            return collection.contains(obj);
        }
        if (collection == null) {
            return !collection2.contains(obj);
        }
        return !collection2.contains(obj) || collection.contains(obj);
    }

    public static d a(Set<String> set, Set<String> set2) {
        if (set2 == null && (set == null || set.isEmpty())) {
            return null;
        }
        return d.b(set, set2);
    }

    public static Set<String> e(Set<String> set, Set<String> set2) {
        if (set == null) {
            return set2;
        }
        if (set2 == null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        for (String str : set2) {
            if (set.contains(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public static final class d implements Serializable {
        private static final long serialVersionUID = 1;
        private final Set<String> d;
        private final Set<String> e;

        private d(Set<String> set, Set<String> set2) {
            this.d = set == null ? Collections.EMPTY_SET : set;
            this.e = set2;
        }

        public static d b(Set<String> set, Set<String> set2) {
            return new d(set, set2);
        }

        public boolean d(Object obj) {
            Set<String> set = this.e;
            return !(set == null || set.contains(obj)) || this.d.contains(obj);
        }
    }
}
