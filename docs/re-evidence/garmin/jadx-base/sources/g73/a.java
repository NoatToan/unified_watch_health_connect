package g73;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f76209a = Pattern.compile("[\\\\&]");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f76210b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f76211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1529a f76212d;

    /* JADX INFO: renamed from: g73.a$a, reason: collision with other inner class name */
    public static class C1529a {
    }

    public static class b {
    }

    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        f76211c = Pattern.compile("[ \t\r\n]+");
        f76212d = new C1529a();
        new b();
    }

    public static String a(String str) {
        if (!f76209a.matcher(str).find()) {
            return str;
        }
        Matcher matcher = f76210b.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder(str.length() + 16);
        int iEnd = 0;
        do {
            sb3.append((CharSequence) str, iEnd, matcher.start());
            String strGroup = matcher.group();
            f76212d.getClass();
            if (strGroup.charAt(0) == '\\') {
                sb3.append((CharSequence) strGroup, 1, strGroup.length());
            } else {
                sb3.append(g73.b.a(strGroup));
            }
            iEnd = matcher.end();
        } while (matcher.find());
        if (iEnd != str.length()) {
            sb3.append((CharSequence) str, iEnd, str.length());
        }
        return sb3.toString();
    }
}
