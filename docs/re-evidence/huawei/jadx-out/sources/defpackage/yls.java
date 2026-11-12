package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes20.dex */
public class yls {
    public static boolean e(Collection<?> collection, int i) {
        return c(collection) || i < 0 || i >= collection.size();
    }

    public static boolean c(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }
}
