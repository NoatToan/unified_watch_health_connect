package h7;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f82327b = b(new LocaleList(new Locale[0]));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f82328a;

    private g(h hVar) {
        this.f82328a = hVar;
    }

    public static g a(String str) {
        if (str == null || str.isEmpty()) {
            return f82327b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i14 = 0; i14 < length; i14++) {
            localeArr[i14] = Locale.forLanguageTag(strArrSplit[i14]);
        }
        return b(new LocaleList(localeArr));
    }

    public static g b(LocaleList localeList) {
        return new g(new i(localeList));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f82328a.equals(((g) obj).f82328a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f82328a.hashCode();
    }

    public final String toString() {
        return this.f82328a.toString();
    }
}
