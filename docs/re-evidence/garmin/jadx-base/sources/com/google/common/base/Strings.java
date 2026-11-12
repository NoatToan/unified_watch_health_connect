package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.maps.android.BuildConfig;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Strings {
    private Strings() {
    }

    public static String commonPrefix(CharSequence charSequence, CharSequence charSequence2) {
        Preconditions.checkNotNull(charSequence);
        Preconditions.checkNotNull(charSequence2);
        int iMin = Math.min(charSequence.length(), charSequence2.length());
        int i14 = 0;
        while (i14 < iMin && charSequence.charAt(i14) == charSequence2.charAt(i14)) {
            i14++;
        }
        int i15 = i14 - 1;
        if (validSurrogatePairAt(charSequence, i15) || validSurrogatePairAt(charSequence2, i15)) {
            i14--;
        }
        return charSequence.subSequence(0, i14).toString();
    }

    public static String commonSuffix(CharSequence charSequence, CharSequence charSequence2) {
        Preconditions.checkNotNull(charSequence);
        Preconditions.checkNotNull(charSequence2);
        int iMin = Math.min(charSequence.length(), charSequence2.length());
        int i14 = 0;
        while (i14 < iMin && charSequence.charAt((charSequence.length() - i14) - 1) == charSequence2.charAt((charSequence2.length() - i14) - 1)) {
            i14++;
        }
        if (validSurrogatePairAt(charSequence, (charSequence.length() - i14) - 1) || validSurrogatePairAt(charSequence2, (charSequence2.length() - i14) - 1)) {
            i14--;
        }
        return charSequence.subSequence(charSequence.length() - i14, charSequence.length()).toString();
    }

    public static String emptyToNull(String str) {
        return Platform.emptyToNull(str);
    }

    public static boolean isNullOrEmpty(String str) {
        return Platform.stringIsNullOrEmpty(str);
    }

    public static String lenientFormat(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        int i14 = 0;
        if (objArr == null) {
            objArr = new Object[]{"(Object[])null"};
        } else {
            for (int i15 = 0; i15 < objArr.length; i15++) {
                objArr[i15] = lenientToString(objArr[i15]);
            }
        }
        StringBuilder sb3 = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i16 = 0;
        while (i14 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i16)) != -1) {
            sb3.append((CharSequence) strValueOf, i16, iIndexOf);
            sb3.append(objArr[i14]);
            i16 = iIndexOf + 2;
            i14++;
        }
        sb3.append((CharSequence) strValueOf, i16, strValueOf.length());
        if (i14 < objArr.length) {
            sb3.append(" [");
            sb3.append(objArr[i14]);
            for (int i17 = i14 + 1; i17 < objArr.length; i17++) {
                sb3.append(", ");
                sb3.append(objArr[i17]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    private static String lenientToString(Object obj) {
        if (obj == null) {
            return BuildConfig.TRAVIS;
        }
        try {
            return obj.toString();
        } catch (Exception e4) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str), (Throwable) e4);
            StringBuilder sbL = hb.a.l("<", str, " threw ");
            sbL.append(e4.getClass().getName());
            sbL.append(">");
            return sbL.toString();
        }
    }

    public static String nullToEmpty(String str) {
        return Platform.nullToEmpty(str);
    }

    public static String padEnd(String str, int i14, char c14) {
        Preconditions.checkNotNull(str);
        if (str.length() >= i14) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder(i14);
        sb3.append(str);
        for (int length = str.length(); length < i14; length++) {
            sb3.append(c14);
        }
        return sb3.toString();
    }

    public static String padStart(String str, int i14, char c14) {
        Preconditions.checkNotNull(str);
        if (str.length() >= i14) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder(i14);
        for (int length = str.length(); length < i14; length++) {
            sb3.append(c14);
        }
        sb3.append(str);
        return sb3.toString();
    }

    public static String repeat(String str, int i14) {
        Preconditions.checkNotNull(str);
        if (i14 <= 1) {
            Preconditions.checkArgument(i14 >= 0, "invalid count: %s", i14);
            return i14 == 0 ? "" : str;
        }
        int length = str.length();
        long j8 = ((long) length) * ((long) i14);
        int i15 = (int) j8;
        if (i15 != j8) {
            throw new ArrayIndexOutOfBoundsException(e.e(j8, "Required array size too large: "));
        }
        char[] cArr = new char[i15];
        str.getChars(0, length, cArr, 0);
        while (true) {
            int i16 = i15 - length;
            if (length >= i16) {
                System.arraycopy(cArr, 0, cArr, length, i16);
                return new String(cArr);
            }
            System.arraycopy(cArr, 0, cArr, length, length);
            length <<= 1;
        }
    }

    @VisibleForTesting
    public static boolean validSurrogatePairAt(CharSequence charSequence, int i14) {
        return i14 >= 0 && i14 <= charSequence.length() + (-2) && Character.isHighSurrogate(charSequence.charAt(i14)) && Character.isLowSurrogate(charSequence.charAt(i14 + 1));
    }
}
