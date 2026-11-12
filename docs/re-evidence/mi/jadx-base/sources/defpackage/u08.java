package defpackage;

import com.xiaomi.onetrack.util.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class u08 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f35237a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f35238b = Pattern.compile("OS/((Android)?[0-9.]+)");
    public static final Pattern c = Pattern.compile("Channel/MIUI([^ ]+)");
    public static final Pattern d = Pattern.compile("Device/([a-zA-Z0-9]+)");

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f35239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f35240b;
        public String c;
        public List<String> d;

        public b() {
            this.f35239a = "";
            this.f35240b = "";
            this.c = "";
            this.d = Collections.emptyList();
        }

        public void a(String str) {
            if (str == null) {
                str = "";
            }
            if (str.equals(this.f35239a)) {
                return;
            }
            this.f35240b = u08.e(str);
            this.c = u08.k(str);
            this.d = u08.i(str);
            this.f35239a = str;
        }
    }

    public static String d(String str) {
        f35237a.a(str);
        return f35237a.f35240b;
    }

    public static String e(String str) {
        return m(str);
    }

    public static String f(String str) {
        if (str == null) {
            return "";
        }
        Matcher matcher = c.matcher(str);
        return (matcher.find() ? matcher.group(1) : "").replaceAll("^[A-Za-z]+|[[A-Za-z].-]+$", "");
    }

    public static String g(String str) {
        if (str != null) {
            Matcher matcher = d.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return "";
    }

    public static List<String> h(String str) {
        f35237a.a(str);
        return f35237a.d;
    }

    public static List<String> i(String str) {
        ArrayList arrayList = new ArrayList();
        String strL = l(str);
        if (!q08.a(strL)) {
            arrayList.add(strL);
        }
        String strG = g(str);
        if (!q08.a(strG)) {
            arrayList.add(strG);
        }
        return arrayList;
    }

    public static String j(String str) {
        f35237a.a(str);
        return f35237a.c;
    }

    public static String k(String str) {
        return f(str);
    }

    public static String l(String str) {
        return str != null ? str.split(";")[0] : "";
    }

    public static String m(String str) {
        if (str == null) {
            return "";
        }
        Matcher matcher = f35238b.matcher(str);
        if (!matcher.find()) {
            return "";
        }
        String strReplaceAll = matcher.group(1).replaceAll("^[A-Za-z]+|[[A-Za-z].]+$", "");
        String[] strArrSplit = strReplaceAll.split(z.f14007a);
        if (strArrSplit.length >= 2) {
            return strReplaceAll;
        }
        return strArrSplit[0] + ".0";
    }
}
