package cc;

import android.text.TextUtils;
import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26652e;

    private a(int i14, int i15, int i16, int i17, int i18) {
        this.f26648a = i14;
        this.f26649b = i15;
        this.f26650c = i16;
        this.f26651d = i17;
        this.f26652e = i18;
    }

    public static a a(String str) {
        fa.a.a(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        for (int i18 = 0; i18 < strArrSplit.length; i18++) {
            String lowerCase = Ascii.toLowerCase(strArrSplit[i18].trim());
            lowerCase.getClass();
            switch (lowerCase) {
                case "end":
                    i15 = i18;
                    break;
                case "text":
                    i17 = i18;
                    break;
                case "start":
                    i14 = i18;
                    break;
                case "style":
                    i16 = i18;
                    break;
            }
        }
        if (i14 == -1 || i15 == -1 || i17 == -1) {
            return null;
        }
        return new a(i14, i15, i16, i17, strArrSplit.length);
    }
}
