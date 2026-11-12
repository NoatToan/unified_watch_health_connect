package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class dfe {
    public static List<Integer> b(String str) {
        if (str == null) {
            return Collections.EMPTY_LIST;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        ArrayList arrayList = new ArrayList(bytes.length);
        for (byte b2 : bytes) {
            arrayList.add(Integer.valueOf(b2 & 255));
        }
        return arrayList;
    }
}
