package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public class a68 {
    public static String a(String str, int i) {
        int length = Integer.toString(i).length();
        StringBuilder sb = new StringBuilder();
        if (length < 4) {
            int i2 = 4 - length;
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append("0");
            }
        }
        return str + "." + ((Object) sb) + i;
    }
}
