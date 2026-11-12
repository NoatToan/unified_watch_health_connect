package zg;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f204673a = 0;

    static {
        Pattern.compile("([\t\r\n])+");
    }

    public static int a(String str) {
        if (str.length() <= 0) {
            return 0;
        }
        int i14 = 0;
        for (char c14 : str.toCharArray()) {
            i14 = (i14 * 31) + c14;
        }
        return i14;
    }

    public static boolean b(String str) {
        return str == null || str.length() <= 0;
    }
}
