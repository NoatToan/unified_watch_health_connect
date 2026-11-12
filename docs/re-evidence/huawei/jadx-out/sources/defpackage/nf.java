package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class nf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f43051a = Pattern.compile("([\t\r\n])+");

    public static boolean b(String str) {
        return str == null || str.length() <= 0;
    }

    public static int c(String str) {
        if (str.length() <= 0) {
            return 0;
        }
        int i = 0;
        for (char c2 : str.toCharArray()) {
            i = (i * 31) + c2;
        }
        return i;
    }
}
