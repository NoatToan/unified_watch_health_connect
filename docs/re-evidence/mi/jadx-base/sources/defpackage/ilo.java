package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class ilo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f21280a = Pattern.compile("^\\d+(\\.)?(\\d+)?(年|月|日|号|点)?");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f21281b = Pattern.compile("^[a-zA-Z]+(_|-)?([a-zA-Z]+)?");

    public static String a(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c >= 65281 && c <= 65374) {
                charArray[i] = (char) (c - 65248);
            } else if (c == 12288) {
                charArray[i] = ' ';
            }
            if (c >= 'A' && c <= 'Z') {
                charArray[i] = (char) (c + ' ');
            }
        }
        return new String(charArray);
    }

    public static int b(String str, int i) {
        char cCharAt = str.charAt(i);
        if (cCharAt < '0' || cCharAt > '9') {
            return 0;
        }
        Matcher matcher = f21280a.matcher(str.substring(i));
        if (matcher.find()) {
            return matcher.group().length();
        }
        return 0;
    }

    public static int c(String str, int i) {
        char cCharAt = str.charAt(i);
        if (cCharAt < 'a' || cCharAt > 'z') {
            return 0;
        }
        Matcher matcher = f21281b.matcher(str.substring(i));
        if (matcher.find()) {
            return matcher.group().length();
        }
        return 0;
    }
}
