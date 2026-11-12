package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.escape.ElementTypesAreNonnullByDefault;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class aob {
    private static final char[][] e = (char[][]) Array.newInstance((Class<?>) Character.TYPE, 0, 0);
    private final char[][] d;

    public static aob c(Map<Character, String> map) {
        return new aob(e(map));
    }

    private aob(char[][] cArr) {
        this.d = cArr;
    }

    public char[][] d() {
        return this.d;
    }

    static char[][] e(Map<Character, String> map) {
        Preconditions.checkNotNull(map);
        if (map.isEmpty()) {
            return e;
        }
        char[][] cArr = new char[((Character) Collections.max(map.keySet())).charValue() + 1][];
        for (Character ch : map.keySet()) {
            cArr[ch.charValue()] = map.get(ch).toCharArray();
        }
        return cArr;
    }
}
