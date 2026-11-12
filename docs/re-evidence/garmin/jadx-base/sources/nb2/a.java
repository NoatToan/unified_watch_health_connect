package nb2;

import am.j;
import android.text.TextUtils;
import android.text.util.Rfc822Token;
import android.text.util.Rfc822Tokenizer;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f125253c = Pattern.compile("^<?([^>]+)>?$");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a[] f125254d = new a[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125256b;

    public a(String str, String str2) {
        this.f125255a = f125253c.matcher(str).replaceAll("$1");
        this.f125256b = str2;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(64);
        int iLastIndexOf = str.lastIndexOf(64);
        int i14 = iLastIndexOf + 1;
        int iIndexOf2 = str.indexOf(46, i14);
        int iLastIndexOf2 = str.lastIndexOf(46);
        return iIndexOf > 0 && iIndexOf == iLastIndexOf && i14 < iIndexOf2 && iIndexOf2 <= iLastIndexOf2 && iLastIndexOf2 < length - 1;
    }

    public static a[] b(String str) {
        if (str == null || str.length() == 0) {
            return f125254d;
        }
        Rfc822Token[] rfc822TokenArr = Rfc822Tokenizer.tokenize(str);
        ArrayList arrayList = new ArrayList();
        for (Rfc822Token rfc822Token : rfc822TokenArr) {
            String address = rfc822Token.getAddress();
            if (!TextUtils.isEmpty(address) && a(address)) {
                String name = rfc822Token.getName();
                if (TextUtils.isEmpty(name)) {
                    name = null;
                }
                arrayList.add(new a(address, name));
            }
        }
        return (a[]) arrayList.toArray(new a[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return super.equals(obj);
        }
        return this.f125255a.equals(((a) obj).f125255a);
    }

    public final int hashCode() {
        return Objects.hash(this.f125255a);
    }

    public final String toString() {
        String str = this.f125256b;
        if (str == null || str.equals(this.f125255a)) {
            return this.f125255a;
        }
        boolean zMatches = this.f125256b.matches(".*[\\(\\)<>@,;:\\\\\".\\[\\]].*");
        String strM = this.f125256b;
        if (!zMatches) {
            return j.o(this.f125255a, ">", sn.a.i(strM, " <"));
        }
        StringBuilder sb3 = new StringBuilder();
        if (strM == null) {
            strM = null;
        } else if (!strM.matches("^\".*\"$")) {
            strM = j.m("\"", strM, "\"");
        }
        sb3.append(strM);
        sb3.append(" <");
        return j.o(this.f125255a, ">", sb3);
    }

    public a(String str) {
        this.f125255a = f125253c.matcher(str).replaceAll("$1");
    }
}
