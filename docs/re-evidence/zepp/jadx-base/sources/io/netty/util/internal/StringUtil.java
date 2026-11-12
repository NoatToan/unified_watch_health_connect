package io.netty.util.internal;

import com.facebook.share.internal.MessengerShareContentUtility;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class StringUtil {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final char CARRIAGE_RETURN = '\r';
    public static final char COMMA = ',';
    private static final int CSV_NUMBER_ESCAPE_CHARACTERS = 7;
    public static final char DOUBLE_QUOTE = '\"';
    public static final String EMPTY_STRING = "";
    private static final byte[] HEX2B;
    public static final char LINE_FEED = '\n';
    private static final char PACKAGE_SEPARATOR_CHAR = '.';
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final String NEWLINE = SystemPropertyUtil.get("line.separator", "\n");
    private static final String[] BYTE2HEX_PAD = new String[256];
    private static final String[] BYTE2HEX_NOPAD = new String[256];

    static {
        String str;
        int i = 0;
        while (true) {
            String[] strArr = BYTE2HEX_PAD;
            if (i >= strArr.length) {
                byte[] bArr = new byte[65536];
                HEX2B = bArr;
                Arrays.fill(bArr, (byte) -1);
                bArr[48] = 0;
                bArr[49] = 1;
                bArr[50] = 2;
                bArr[51] = 3;
                bArr[52] = 4;
                bArr[53] = 5;
                bArr[54] = 6;
                bArr[55] = 7;
                bArr[56] = 8;
                bArr[57] = 9;
                bArr[65] = 10;
                bArr[66] = 11;
                bArr[67] = 12;
                bArr[68] = 13;
                bArr[69] = 14;
                bArr[70] = 15;
                bArr[97] = 10;
                bArr[98] = 11;
                bArr[99] = 12;
                bArr[100] = 13;
                bArr[101] = 14;
                bArr[102] = 15;
                return;
            }
            String hexString = Integer.toHexString(i);
            if (i > 15) {
                str = hexString;
            } else {
                str = '0' + hexString;
            }
            strArr[i] = str;
            BYTE2HEX_NOPAD[i] = hexString;
            i++;
        }
    }

    private StringUtil() {
    }

    public static String byteToHexString(int i) {
        return BYTE2HEX_NOPAD[i & 255];
    }

    public static String byteToHexStringPadded(int i) {
        return BYTE2HEX_PAD[i & 255];
    }

    public static boolean commonSuffixOfLength(String str, String str2, int i) {
        return str != null && str2 != null && i >= 0 && str.regionMatches(str.length() - i, str2, str2.length() - i, i);
    }

    public static byte decodeHexByte(CharSequence charSequence, int i) {
        int iDecodeHexNibble = decodeHexNibble(charSequence.charAt(i));
        int iDecodeHexNibble2 = decodeHexNibble(charSequence.charAt(i + 1));
        if (iDecodeHexNibble == -1 || iDecodeHexNibble2 == -1) {
            throw new IllegalArgumentException(String.format("invalid hex byte '%s' at index %d of '%s'", charSequence.subSequence(i, i + 2), Integer.valueOf(i), charSequence));
        }
        return (byte) ((iDecodeHexNibble << 4) + iDecodeHexNibble2);
    }

    public static byte[] decodeHexDump(CharSequence charSequence, int i, int i2) {
        if (i2 < 0 || (i2 & 1) != 0) {
            throw new IllegalArgumentException("length: " + i2);
        }
        if (i2 == 0) {
            return EmptyArrays.EMPTY_BYTES;
        }
        byte[] bArr = new byte[i2 >>> 1];
        for (int i3 = 0; i3 < i2; i3 += 2) {
            bArr[i3 >>> 1] = decodeHexByte(charSequence, i + i3);
        }
        return bArr;
    }

    public static int decodeHexNibble(char c) {
        return HEX2B[c];
    }

    public static boolean endsWith(CharSequence charSequence, char c) {
        int length = charSequence.length();
        return length > 0 && charSequence.charAt(length - 1) == c;
    }

    public static CharSequence escapeCsv(CharSequence charSequence) {
        return escapeCsv(charSequence, false);
    }

    private static int indexOfFirstNonOwsChar(CharSequence charSequence, int i) {
        int i2 = 0;
        while (i2 < i && isOws(charSequence.charAt(i2))) {
            i2++;
        }
        return i2;
    }

    private static int indexOfLastNonOwsChar(CharSequence charSequence, int i, int i2) {
        int i3 = i2 - 1;
        while (i3 > i && isOws(charSequence.charAt(i3))) {
            i3--;
        }
        return i3;
    }

    public static int indexOfNonWhiteSpace(CharSequence charSequence, int i) {
        while (i < charSequence.length()) {
            if (!Character.isWhitespace(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int indexOfWhiteSpace(CharSequence charSequence, int i) {
        while (i < charSequence.length()) {
            if (Character.isWhitespace(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private static boolean isDoubleQuote(char c) {
        return c == '\"';
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private static boolean isOws(char c) {
        return c == ' ' || c == '\t';
    }

    public static boolean isSurrogate(char c) {
        return c >= 55296 && c <= 57343;
    }

    public static CharSequence join(CharSequence charSequence, Iterable<? extends CharSequence> iterable) {
        ObjectUtil.checkNotNull(charSequence, "separator");
        ObjectUtil.checkNotNull(iterable, MessengerShareContentUtility.ELEMENTS);
        Iterator<? extends CharSequence> it2 = iterable.iterator();
        if (!it2.hasNext()) {
            return "";
        }
        CharSequence next = it2.next();
        if (!it2.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder(next);
        do {
            sb.append(charSequence);
            sb.append(it2.next());
        } while (it2.hasNext());
        return sb;
    }

    public static int length(String str) {
        if (str == null) {
            return 0;
        }
        return str.length();
    }

    private static IllegalArgumentException newInvalidEscapedCsvFieldException(CharSequence charSequence, int i) {
        return new IllegalArgumentException("invalid escaped CSV field: " + ((Object) charSequence) + " index: " + i);
    }

    public static String simpleClassName(Object obj) {
        return obj == null ? "null_object" : simpleClassName(obj.getClass());
    }

    public static String substringAfter(String str, char c) {
        int iIndexOf = str.indexOf(c);
        if (iIndexOf >= 0) {
            return str.substring(iIndexOf + 1);
        }
        return null;
    }

    public static String toHexString(byte[] bArr) {
        return toHexString(bArr, 0, bArr.length);
    }

    public static String toHexStringPadded(byte[] bArr) {
        return toHexStringPadded(bArr, 0, bArr.length);
    }

    public static CharSequence trimOws(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return charSequence;
        }
        int iIndexOfFirstNonOwsChar = indexOfFirstNonOwsChar(charSequence, length);
        int iIndexOfLastNonOwsChar = indexOfLastNonOwsChar(charSequence, iIndexOfFirstNonOwsChar, length);
        return (iIndexOfFirstNonOwsChar == 0 && iIndexOfLastNonOwsChar == length + (-1)) ? charSequence : charSequence.subSequence(iIndexOfFirstNonOwsChar, iIndexOfLastNonOwsChar + 1);
    }

    public static CharSequence unescapeCsv(CharSequence charSequence) {
        int length = ((CharSequence) ObjectUtil.checkNotNull(charSequence, "value")).length();
        if (length == 0) {
            return charSequence;
        }
        int i = length - 1;
        boolean z = false;
        if (isDoubleQuote(charSequence.charAt(0)) && isDoubleQuote(charSequence.charAt(i)) && length != 1) {
            z = true;
        }
        if (!z) {
            validateCsvFormat(charSequence);
            return charSequence;
        }
        StringBuilder sbStringBuilder = InternalThreadLocalMap.get().stringBuilder();
        int i2 = 1;
        while (i2 < i) {
            char cCharAt = charSequence.charAt(i2);
            if (cCharAt == '\"') {
                int i3 = i2 + 1;
                if (!isDoubleQuote(charSequence.charAt(i3)) || i3 == i) {
                    throw newInvalidEscapedCsvFieldException(charSequence, i2);
                }
                i2 = i3;
            }
            sbStringBuilder.append(cCharAt);
            i2++;
        }
        return sbStringBuilder.toString();
    }

    public static List<CharSequence> unescapeCsvFields(CharSequence charSequence) {
        ArrayList arrayList = new ArrayList(2);
        StringBuilder sbStringBuilder = InternalThreadLocalMap.get().stringBuilder();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char cCharAt = charSequence.charAt(i);
            if (!z) {
                if (cCharAt != '\n' && cCharAt != '\r') {
                    if (cCharAt != '\"') {
                        if (cCharAt != ',') {
                            sbStringBuilder.append(cCharAt);
                        } else {
                            arrayList.add(sbStringBuilder.toString());
                            sbStringBuilder.setLength(0);
                        }
                    } else if (sbStringBuilder.length() == 0) {
                        z = true;
                    }
                }
                throw newInvalidEscapedCsvFieldException(charSequence, i);
            }
            if (cCharAt != '\"') {
                sbStringBuilder.append(cCharAt);
            } else {
                if (i == length) {
                    arrayList.add(sbStringBuilder.toString());
                    return arrayList;
                }
                i++;
                char cCharAt2 = charSequence.charAt(i);
                if (cCharAt2 == '\"') {
                    sbStringBuilder.append('\"');
                } else {
                    if (cCharAt2 != ',') {
                        throw newInvalidEscapedCsvFieldException(charSequence, i - 1);
                    }
                    arrayList.add(sbStringBuilder.toString());
                    sbStringBuilder.setLength(0);
                    z = false;
                }
            }
            i++;
        }
        if (z) {
            throw newInvalidEscapedCsvFieldException(charSequence, length);
        }
        arrayList.add(sbStringBuilder.toString());
        return arrayList;
    }

    private static void validateCsvFormat(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\"' || cCharAt == ',') {
                throw newInvalidEscapedCsvFieldException(charSequence, i);
            }
        }
    }

    public static <T extends Appendable> T byteToHexString(T t, int i) throws Throwable {
        try {
            t.append(byteToHexString(i));
        } catch (IOException e) {
            PlatformDependent.throwException(e);
        }
        return t;
    }

    public static <T extends Appendable> T byteToHexStringPadded(T t, int i) throws Throwable {
        try {
            t.append(byteToHexStringPadded(i));
        } catch (IOException e) {
            PlatformDependent.throwException(e);
        }
        return t;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:69:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00d7 A[SYNTHETIC] */
    public static CharSequence escapeCsv(CharSequence charSequence, boolean z) {
        int iIndexOfLastNonOwsChar;
        int iIndexOfFirstNonOwsChar;
        int i;
        boolean z2;
        int i2;
        StringBuilder sb;
        char cCharAt;
        int i3;
        int i4;
        char cCharAt2;
        int i5;
        int i6;
        int length = ((CharSequence) ObjectUtil.checkNotNull(charSequence, "value")).length();
        boolean z3 = false;
        if (z) {
            iIndexOfFirstNonOwsChar = indexOfFirstNonOwsChar(charSequence, length);
            iIndexOfLastNonOwsChar = indexOfLastNonOwsChar(charSequence, iIndexOfFirstNonOwsChar, length);
        } else {
            iIndexOfLastNonOwsChar = length - 1;
            iIndexOfFirstNonOwsChar = 0;
        }
        if (iIndexOfFirstNonOwsChar > iIndexOfLastNonOwsChar) {
            return "";
        }
        if (isDoubleQuote(charSequence.charAt(iIndexOfFirstNonOwsChar))) {
            if (isDoubleQuote(charSequence.charAt(iIndexOfLastNonOwsChar)) && iIndexOfLastNonOwsChar > iIndexOfFirstNonOwsChar) {
                z3 = true;
            }
            if (z3) {
                iIndexOfFirstNonOwsChar++;
                z2 = z3;
                i = iIndexOfLastNonOwsChar - 1;
            } else {
                z2 = z3;
                i = iIndexOfLastNonOwsChar;
                i2 = iIndexOfFirstNonOwsChar;
            }
            if (iIndexOfFirstNonOwsChar < 0) {
                if (z2) {
                    i4 = i2;
                    while (i4 <= i) {
                        cCharAt2 = charSequence.charAt(i4);
                        if (cCharAt2 == '\n' && cCharAt2 != '\r' && cCharAt2 != ',') {
                            if (isDoubleQuote(cCharAt2)) {
                                if (i4 != i) {
                                    int i7 = i4 + 1;
                                    if (isDoubleQuote(charSequence.charAt(i7))) {
                                        i4 = i7;
                                    }
                                }
                            }
                            i4++;
                        }
                        iIndexOfFirstNonOwsChar = i4;
                        break;
                    }
                }
                i4 = i2;
                while (i4 <= i) {
                    if (!isDoubleQuote(charSequence.charAt(i4))) {
                        if (i4 != i) {
                            i6 = i4 + 1;
                            if (!isDoubleQuote(charSequence.charAt(i6))) {
                                i4 = i6;
                            }
                        }
                        iIndexOfFirstNonOwsChar = i4;
                        break;
                    }
                    i4++;
                }
                if (iIndexOfFirstNonOwsChar < 0) {
                    if (z2) {
                        i2--;
                        i5 = i + 2;
                    } else {
                        i5 = i + 1;
                    }
                    return charSequence.subSequence(i2, i5);
                }
            }
            sb = new StringBuilder((i - i2) + 1 + 7);
            sb.append('\"');
            sb.append(charSequence, i2, iIndexOfFirstNonOwsChar);
            while (iIndexOfFirstNonOwsChar <= i) {
                cCharAt = charSequence.charAt(iIndexOfFirstNonOwsChar);
                if (isDoubleQuote(cCharAt)) {
                    sb.append('\"');
                    if (iIndexOfFirstNonOwsChar < i) {
                        i3 = iIndexOfFirstNonOwsChar + 1;
                        if (isDoubleQuote(charSequence.charAt(i3))) {
                            iIndexOfFirstNonOwsChar = i3;
                        }
                    }
                }
                sb.append(cCharAt);
                iIndexOfFirstNonOwsChar++;
            }
            sb.append('\"');
            return sb;
        }
        i = iIndexOfLastNonOwsChar;
        z2 = false;
        i2 = iIndexOfFirstNonOwsChar;
        iIndexOfFirstNonOwsChar = -1;
        if (iIndexOfFirstNonOwsChar < 0) {
            if (z2) {
                i4 = i2;
                while (i4 <= i) {
                    cCharAt2 = charSequence.charAt(i4);
                    if (cCharAt2 == '\n') {
                    }
                    iIndexOfFirstNonOwsChar = i4;
                    break;
                }
            }
            i4 = i2;
            while (i4 <= i) {
                if (!isDoubleQuote(charSequence.charAt(i4))) {
                    if (i4 != i) {
                        i6 = i4 + 1;
                        if (!isDoubleQuote(charSequence.charAt(i6))) {
                            i4 = i6;
                        }
                    }
                    iIndexOfFirstNonOwsChar = i4;
                    break;
                }
                i4++;
            }
            if (iIndexOfFirstNonOwsChar < 0) {
                if (z2) {
                    i2--;
                    i5 = i + 2;
                } else {
                    i5 = i + 1;
                }
                return charSequence.subSequence(i2, i5);
            }
        }
        sb = new StringBuilder((i - i2) + 1 + 7);
        sb.append('\"');
        sb.append(charSequence, i2, iIndexOfFirstNonOwsChar);
        while (iIndexOfFirstNonOwsChar <= i) {
            cCharAt = charSequence.charAt(iIndexOfFirstNonOwsChar);
            if (isDoubleQuote(cCharAt)) {
                sb.append('\"');
                if (iIndexOfFirstNonOwsChar < i) {
                    i3 = iIndexOfFirstNonOwsChar + 1;
                    if (isDoubleQuote(charSequence.charAt(i3))) {
                        iIndexOfFirstNonOwsChar = i3;
                    }
                }
            }
            sb.append(cCharAt);
            iIndexOfFirstNonOwsChar++;
        }
        sb.append('\"');
        return sb;
    }

    public static String simpleClassName(Class<?> cls) {
        String name = ((Class) ObjectUtil.checkNotNull(cls, "clazz")).getName();
        int iLastIndexOf = name.lastIndexOf(46);
        return iLastIndexOf > -1 ? name.substring(iLastIndexOf + 1) : name;
    }

    public static String toHexString(byte[] bArr, int i, int i2) {
        return ((StringBuilder) toHexString(new StringBuilder(i2 << 1), bArr, i, i2)).toString();
    }

    public static String toHexStringPadded(byte[] bArr, int i, int i2) {
        return ((StringBuilder) toHexStringPadded(new StringBuilder(i2 << 1), bArr, i, i2)).toString();
    }

    public static <T extends Appendable> T toHexString(T t, byte[] bArr) {
        return (T) toHexString(t, bArr, 0, bArr.length);
    }

    public static <T extends Appendable> T toHexStringPadded(T t, byte[] bArr) {
        return (T) toHexStringPadded(t, bArr, 0, bArr.length);
    }

    public static <T extends Appendable> T toHexString(T t, byte[] bArr, int i, int i2) throws Throwable {
        if (i2 == 0) {
            return t;
        }
        int i3 = i2 + i;
        int i4 = i3 - 1;
        while (i < i4 && bArr[i] == 0) {
            i++;
        }
        int i5 = i + 1;
        byteToHexString(t, bArr[i]);
        toHexStringPadded(t, bArr, i5, i3 - i5);
        return t;
    }

    public static <T extends Appendable> T toHexStringPadded(T t, byte[] bArr, int i, int i2) throws Throwable {
        int i3 = i2 + i;
        while (i < i3) {
            byteToHexStringPadded(t, bArr[i]);
            i++;
        }
        return t;
    }

    public static byte[] decodeHexDump(CharSequence charSequence) {
        return decodeHexDump(charSequence, 0, charSequence.length());
    }
}
