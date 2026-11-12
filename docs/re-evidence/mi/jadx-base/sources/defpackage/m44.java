package defpackage;

import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.util.Collection;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class m44 {
    public static boolean a(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static StringBuilder b(int i) {
        d44.b(i, MediaStoreUtil.MediaInfo.SIZE);
        return new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
    }

    public static boolean c(Collection<?> collection, Object obj) {
        c6i.o(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static boolean d(Collection<?> collection, Object obj) {
        c6i.o(collection);
        try {
            return collection.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static String e(Collection<?> collection) {
        StringBuilder sbB = b(collection.size());
        sbB.append(AbstractJsonLexerKt.BEGIN_LIST);
        boolean z = true;
        for (Object obj : collection) {
            if (!z) {
                sbB.append(", ");
            }
            if (obj == collection) {
                sbB.append("(this Collection)");
            } else {
                sbB.append(obj);
            }
            z = false;
        }
        sbB.append(AbstractJsonLexerKt.END_LIST);
        return sbB.toString();
    }
}
