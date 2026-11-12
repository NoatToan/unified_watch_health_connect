package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public class non {
    public static Boolean c(Collection collection) {
        if (collection == null || collection.size() == 0) {
            return true;
        }
        return false;
    }

    public static Boolean e(Collection collection) {
        return Boolean.valueOf(!c(collection).booleanValue());
    }
}
