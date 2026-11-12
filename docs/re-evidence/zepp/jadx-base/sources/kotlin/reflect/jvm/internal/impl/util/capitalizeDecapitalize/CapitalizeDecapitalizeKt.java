package kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize;

import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class CapitalizeDecapitalizeKt {
    private static final boolean a(String str, int i, boolean z) {
        char cCharAt = str.charAt(i);
        if (z) {
            return 'A' <= cCharAt && cCharAt <= 'Z';
        }
        return Character.isUpperCase(cCharAt);
    }

    private static final String b(String str, boolean z) {
        if (z) {
            return toLowerCaseAsciiOnly(str);
        }
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        return str.toLowerCase(Locale.ROOT);
    }

    @NotNull
    public static final String capitalizeAsciiOnly(@NotNull String str) {
        boolean z = false;
        if (str.length() == 0) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if ('a' <= cCharAt && cCharAt <= 'z') {
            z = true;
        }
        if (!z) {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        return String.valueOf(upperCase) + str.substring(1);
    }

    @NotNull
    public static final String decapitalizeAsciiOnly(@NotNull String str) {
        boolean z = false;
        if (str.length() == 0) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if ('A' <= cCharAt && cCharAt <= 'Z') {
            z = true;
        }
        if (!z) {
            return str;
        }
        char lowerCase = Character.toLowerCase(cCharAt);
        return String.valueOf(lowerCase) + str.substring(1);
    }

    @NotNull
    public static final String decapitalizeSmartForCompiler(@NotNull String str, boolean z) {
        Integer next;
        if ((str.length() == 0) || !a(str, 0, z)) {
            return str;
        }
        if (str.length() == 1 || !a(str, 1, z)) {
            if (z) {
                return decapitalizeAsciiOnly(str);
            }
            if (!(str.length() > 0)) {
                return str;
            }
            char lowerCase = Character.toLowerCase(str.charAt(0));
            return String.valueOf(lowerCase) + str.substring(1);
        }
        Iterator<Integer> it2 = StringsKt__StringsKt.getIndices(str).iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!(!a(str, next.intValue(), z)));
        Integer num = next;
        if (num == null) {
            return b(str, z);
        }
        int iIntValue = num.intValue() - 1;
        return Intrinsics.stringPlus(b(str.substring(0, iIntValue), z), str.substring(iIntValue));
    }

    @NotNull
    public static final String toLowerCaseAsciiOnly(@NotNull String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            i++;
            if ('A' <= cCharAt && cCharAt <= 'Z') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }
}
