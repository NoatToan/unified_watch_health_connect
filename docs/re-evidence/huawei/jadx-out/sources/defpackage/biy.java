package defpackage;

import com.huawei.secure.android.common.util.SafeString;
import java.util.Locale;

/* JADX INFO: loaded from: classes23.dex */
public class biy {
    private static String a(String str, String str2) {
        if (str2.length() == 0) {
            return str;
        }
        if (str.length() == 0) {
            return str2;
        }
        boolean z = false;
        char cCharAt = str2.charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            if (str2.length() > 1 && Character.isUpperCase(str2.charAt(1))) {
                return String.format(Locale.ENGLISH, "%s%s", str, str2);
            }
            if (str2.length() > 2 && (Character.isTitleCase(str2.charAt(1)) || Character.isUpperCase(str2.charAt(1)))) {
                z = true;
            }
            str2 = String.format(Locale.ENGLISH, "%s%s", Character.valueOf(z ? Character.toUpperCase(cCharAt) : Character.toTitleCase(cCharAt)), str2.subSequence(1, str2.length()));
        }
        return String.format(Locale.ENGLISH, "%s%s", str, str2);
    }

    private static String b(CharSequence charSequence, boolean z, String str, String str2) {
        if (charSequence == null || charSequence.length() == 0) {
            return null;
        }
        String string = charSequence.toString();
        if (!z || !string.startsWith("is") || charSequence.length() <= 2 || Character.isLowerCase(charSequence.charAt(2))) {
            if (!z) {
                str = str2;
            }
            return a(str, string);
        }
        return str + SafeString.substring(string, 2);
    }

    public static String b(CharSequence charSequence, boolean z) {
        return b(charSequence, z, "is", "get");
    }
}
