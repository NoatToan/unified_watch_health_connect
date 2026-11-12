package md;

import d53.w;
import java.util.Collection;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static final boolean a(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (i14 < str.length()) {
                char cCharAt = str.charAt(i14);
                int i17 = i16 + 1;
                if (i16 != 0 || cCharAt == '(') {
                    if (cCharAt == '(') {
                        i15++;
                    } else if (cCharAt == ')' && (i15 = i15 - 1) == 0 && i16 != str.length() - 1) {
                    }
                    i14++;
                    i16 = i17;
                }
            }
            if (i15 == 0) {
                return s.g(w.i0(str.substring(1, str.length() - 1)).toString(), str2);
            }
        }
        return false;
    }

    public static final String b(Collection<?> collection) {
        collection.getClass();
        return !collection.isEmpty() ? d53.n.b(h0.k0(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }

    public static final String c(Collection<?> collection) {
        return d53.n.b(h0.k0(collection, ",", null, null, null, 62)).concat(d53.n.b(" }"));
    }

    public static final String d(Collection<?> collection) {
        return d53.n.b(h0.k0(collection, ",", null, null, null, 62)).concat(d53.n.b("},"));
    }
}
