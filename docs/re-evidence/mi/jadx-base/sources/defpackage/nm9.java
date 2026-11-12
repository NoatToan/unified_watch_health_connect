package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Stack;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.io.IOCase;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes3.dex */
public class nm9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f28066a = Character.toString('.');

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char f28067b = File.separatorChar;
    public static final char c;

    static {
        if (d()) {
            c = '/';
        } else {
            c = AbstractJsonLexerKt.STRING_ESC;
        }
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        int iB = b(str);
        return iB == -1 ? "" : str.substring(iB + 1);
    }

    public static int b(String str) {
        int iLastIndexOf;
        if (str != null && c(str) <= (iLastIndexOf = str.lastIndexOf(46))) {
            return iLastIndexOf;
        }
        return -1;
    }

    public static int c(String str) {
        if (str == null) {
            return -1;
        }
        return Math.max(str.lastIndexOf(47), str.lastIndexOf(92));
    }

    public static boolean d() {
        return f28067b == '\\';
    }

    public static String[] e(String str) {
        if (str.indexOf(63) == -1 && str.indexOf(42) == -1) {
            return new String[]{str};
        }
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            char c2 = charArray[i];
            if (c2 == '?' || c2 == '*') {
                if (sb.length() != 0) {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                }
                if (charArray[i] == '?') {
                    arrayList.add("?");
                } else if (arrayList.isEmpty() || (i > 0 && !((String) arrayList.get(arrayList.size() - 1)).equals(Marker.ANY_MARKER))) {
                    arrayList.add(Marker.ANY_MARKER);
                }
            } else {
                sb.append(c2);
            }
        }
        if (sb.length() != 0) {
            arrayList.add(sb.toString());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean f(String str, String str2) {
        return g(str, str2, IOCase.SENSITIVE);
    }

    public static boolean g(String str, String str2, IOCase iOCase) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null && str2 != null) {
            if (iOCase == null) {
                iOCase = IOCase.SENSITIVE;
            }
            String[] strArrE = e(str2);
            Stack stack = new Stack();
            boolean z = false;
            int length = 0;
            int i = 0;
            do {
                if (stack.size() > 0) {
                    int[] iArr = (int[]) stack.pop();
                    i = iArr[0];
                    length = iArr[1];
                    z = true;
                }
                while (i < strArrE.length) {
                    if (strArrE[i].equals("?")) {
                        length++;
                        if (length > str.length()) {
                            break;
                        }
                        z = false;
                        i++;
                    } else {
                        if (strArrE[i].equals(Marker.ANY_MARKER)) {
                            if (i == strArrE.length - 1) {
                                length = str.length();
                            }
                            z = true;
                        } else if (z) {
                            length = iOCase.checkIndexOf(str, length, strArrE[i]);
                            if (length == -1) {
                                break;
                            }
                            int iCheckIndexOf = iOCase.checkIndexOf(str, length + 1, strArrE[i]);
                            if (iCheckIndexOf >= 0) {
                                stack.push(new int[]{i, iCheckIndexOf});
                            }
                            length += strArrE[i].length();
                            z = false;
                        } else {
                            if (!iOCase.checkRegionMatches(str, length, strArrE[i])) {
                                break;
                            }
                            length += strArrE[i].length();
                            z = false;
                        }
                        i++;
                    }
                }
                if (i == strArrE.length && length == str.length()) {
                    return true;
                }
            } while (stack.size() > 0);
        }
        return false;
    }
}
