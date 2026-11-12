package defpackage;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes7.dex */
public class l45 {
    public int[][] c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f24625a = new String();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f24626b = new String();

    public l45(String str) {
        a(str);
    }

    public final void a(String str) {
        this.f24625a = str;
        String[] strArrSplit = str.split(":", 2);
        if (strArrSplit.length <= 1) {
            this.f24626b = str;
            return;
        }
        this.f24626b = strArrSplit[0];
        String[] strArrSplit2 = strArrSplit[1].split("/");
        this.c = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit2.length, 2);
        for (int i = 0; i < strArrSplit2.length; i++) {
            d(strArrSplit2[i], this.c[i]);
        }
    }

    public int[][] b() {
        return this.c;
    }

    public String c() {
        return this.f24626b;
    }

    public final void d(String str, int[] iArr) {
        if (!str.startsWith("%x[") || !str.endsWith("]")) {
            throw new IllegalArgumentException("gram not startsWith('%x[') or not endsWith(']'), gram: " + str + ", offset.length:" + iArr.length);
        }
        String strReplace = str.replace("%x[", "").replace("]", "");
        String[] strArrSplit = strReplace.split(",");
        if (strArrSplit.length != iArr.length) {
            throw new IllegalArgumentException("gram number length error, gram: " + strReplace + ", offset.length:" + iArr.length);
        }
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                iArr[i] = Integer.parseInt(strArrSplit[i].trim());
            } catch (NumberFormatException unused) {
                throw new NumberFormatException("gram number is not int: " + strReplace);
            }
        }
    }
}
