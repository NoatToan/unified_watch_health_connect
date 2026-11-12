package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class j8o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22534b;
    public final int c;
    public final int d;
    public final int e;

    public j8o(int i, int i2, int i3, int i4, int i5) {
        this.f22533a = i;
        this.f22534b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public static j8o a(String str) {
        rk1.a(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < strArrSplit.length; i5++) {
            String strE = fk1.e(strArrSplit[i5].trim());
            strE.hashCode();
            switch (strE) {
                case "end":
                    i2 = i5;
                    break;
                case "text":
                    i4 = i5;
                    break;
                case "start":
                    i = i5;
                    break;
                case "style":
                    i3 = i5;
                    break;
            }
        }
        if (i == -1 || i2 == -1 || i4 == -1) {
            return null;
        }
        return new j8o(i, i2, i3, i4, strArrSplit.length);
    }
}
