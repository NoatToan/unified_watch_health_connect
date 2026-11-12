package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class jio {
    public static List<String> a(List<String> list, String str, boolean z, boolean z2) {
        if (z) {
            str = tt3.r0(str);
        }
        if (!z2 || !str.isEmpty()) {
            list.add(str);
        }
        return list;
    }

    public static List<String> b(String str, char c, int i, boolean z, boolean z2) {
        return c(str, c, i, z, z2, false);
    }

    public static List<String> c(String str, char c, int i, boolean z, boolean z2, boolean z3) {
        if (tt3.G(str)) {
            return new ArrayList(0);
        }
        if (i == 1) {
            return a(new ArrayList(1), str, z, z2);
        }
        ArrayList arrayList = new ArrayList(i > 0 ? i : 16);
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (s2h.k(c, str.charAt(i3), z3)) {
                a(arrayList, str.substring(i2, i3), z, z2);
                i2 = i3 + 1;
                if (i > 0 && arrayList.size() > i - 2) {
                    break;
                }
            }
        }
        return a(arrayList, str.substring(i2, length), z, z2);
    }

    public static String[] d(String str, char c, int i, boolean z, boolean z2) {
        return e(b(str, c, i, z, z2));
    }

    public static String[] e(List<String> list) {
        return (String[]) list.toArray(new String[0]);
    }
}
