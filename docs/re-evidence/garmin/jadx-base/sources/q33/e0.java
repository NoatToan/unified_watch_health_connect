package q33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f142457a = new e0();

    private e0() {
    }

    public static String[] a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static LinkedHashSet b(String str, String... strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet c(String str, String... strArr) {
        return b("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static LinkedHashSet d(String str, String... strArr) {
        return b("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static String e(String str, String str2) {
        str2.getClass();
        return str + '.' + str2;
    }
}
