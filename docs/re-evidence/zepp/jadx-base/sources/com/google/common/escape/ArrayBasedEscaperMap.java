package com.google.common.escape;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtCompatible
public final class ArrayBasedEscaperMap {
    private static final char[][] b = (char[][]) Array.newInstance((Class<?>) char.class, 0, 0);
    private final char[][] a;

    private ArrayBasedEscaperMap(char[][] cArr) {
        this.a = cArr;
    }

    @VisibleForTesting
    public static char[][] a(Map<Character, String> map) {
        Preconditions.checkNotNull(map);
        if (map.isEmpty()) {
            return b;
        }
        char[][] cArr = new char[((Character) Collections.max(map.keySet())).charValue() + 1][];
        Iterator<Character> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            char cCharValue = it2.next().charValue();
            cArr[cCharValue] = map.get(Character.valueOf(cCharValue)).toCharArray();
        }
        return cArr;
    }

    public static ArrayBasedEscaperMap create(Map<Character, String> map) {
        return new ArrayBasedEscaperMap(a(map));
    }

    public char[][] b() {
        return this.a;
    }
}
