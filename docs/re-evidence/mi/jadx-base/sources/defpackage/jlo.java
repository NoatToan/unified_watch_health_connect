package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class jlo {
    public static boolean a(String str) {
        return !b(str);
    }

    public static boolean b(String str) {
        return str == null || str.isEmpty();
    }

    public static String c(Collection<String> collection, String str) {
        StringBuilder sb = new StringBuilder();
        int size = collection.size();
        Iterator<String> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            i++;
            sb.append(it.next());
            if (i < size) {
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
