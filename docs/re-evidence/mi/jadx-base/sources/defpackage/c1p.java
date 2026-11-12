package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class c1p {
    public static String[] a(List<String> list, float f, float f2, float f3) {
        while (f <= f2) {
            list.add(String.valueOf(f));
            f = Math.round((f + f3) * 10.0f) / 10.0f;
        }
        return (String[]) list.toArray(new String[list.size()]);
    }

    public static String[] b(List<String> list, int i, int i2, int i3) {
        while (i <= i2) {
            list.add(String.valueOf(i));
            i += i3;
        }
        return (String[]) list.toArray(new String[list.size()]);
    }
}
