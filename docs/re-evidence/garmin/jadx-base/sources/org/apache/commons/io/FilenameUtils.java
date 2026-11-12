package org.apache.commons.io;

import ch.qos.logback.classic.spi.CallerData;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Marker;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class FilenameUtils {
    private static final int BASE_16 = 16;
    private static final String EMPTY_STRING = "";
    public static final char EXTENSION_SEPARATOR = '.';
    private static final int IPV4_MAX_OCTET_VALUE = 255;
    private static final Pattern IPV4_PATTERN;
    private static final int IPV6_MAX_HEX_DIGITS_PER_GROUP = 4;
    private static final int IPV6_MAX_HEX_GROUPS = 8;
    private static final int MAX_UNSIGNED_SHORT = 65535;
    private static final int NOT_FOUND = -1;
    private static final char OTHER_SEPARATOR;
    private static final Pattern REG_NAME_PART_PATTERN;
    private static final char UNIX_SEPARATOR = '/';
    private static final char WINDOWS_SEPARATOR = '\\';
    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final String EXTENSION_SEPARATOR_STR = Character.toString('.');
    private static final char SYSTEM_SEPARATOR = File.separatorChar;

    static {
        if (isSystemWindows()) {
            OTHER_SEPARATOR = '/';
        } else {
            OTHER_SEPARATOR = '\\';
        }
        IPV4_PATTERN = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
        REG_NAME_PART_PATTERN = Pattern.compile("^[a-zA-Z0-9][a-zA-Z0-9-]*$");
    }

    public static String concat(String str, String str2) {
        int prefixLength = getPrefixLength(str2);
        if (prefixLength < 0) {
            return null;
        }
        if (prefixLength > 0) {
            return normalize(str2);
        }
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return normalize(str2);
        }
        if (isSeparator(str.charAt(length - 1))) {
            return normalize(str + str2);
        }
        return normalize(str + '/' + str2);
    }

    public static boolean directoryContains(String str, String str2) {
        if (str == null) {
            h.s("Directory must not be null");
            return false;
        }
        if (str2 == null) {
            return false;
        }
        IOCase iOCase = IOCase.SYSTEM;
        if (iOCase.checkEquals(str, str2)) {
            return false;
        }
        return iOCase.checkStartsWith(str2, str);
    }

    private static String doGetFullPath(String str, boolean z14) {
        int prefixLength;
        if (str == null || (prefixLength = getPrefixLength(str)) < 0) {
            return null;
        }
        if (prefixLength >= str.length()) {
            return z14 ? getPrefix(str) : str;
        }
        int iIndexOfLastSeparator = indexOfLastSeparator(str);
        if (iIndexOfLastSeparator < 0) {
            return str.substring(0, prefixLength);
        }
        int i14 = iIndexOfLastSeparator + (z14 ? 1 : 0);
        if (i14 == 0) {
            i14++;
        }
        return str.substring(0, i14);
    }

    private static String doGetPath(String str, int i14) {
        int prefixLength;
        if (str == null || (prefixLength = getPrefixLength(str)) < 0) {
            return null;
        }
        int iIndexOfLastSeparator = indexOfLastSeparator(str);
        int i15 = i14 + iIndexOfLastSeparator;
        if (prefixLength >= str.length() || iIndexOfLastSeparator < 0 || prefixLength >= i15) {
            return "";
        }
        String strSubstring = str.substring(prefixLength, i15);
        failIfNullBytePresent(strSubstring);
        return strSubstring;
    }

    private static String doNormalize(String str, char c14, boolean z14) {
        boolean z15;
        if (str == null) {
            return null;
        }
        failIfNullBytePresent(str);
        int length = str.length();
        if (length == 0) {
            return str;
        }
        int prefixLength = getPrefixLength(str);
        if (prefixLength < 0) {
            return null;
        }
        int i14 = length + 2;
        char[] cArr = new char[i14];
        str.getChars(0, str.length(), cArr, 0);
        char c15 = SYSTEM_SEPARATOR;
        if (c14 == c15) {
            c15 = OTHER_SEPARATOR;
        }
        for (int i15 = 0; i15 < i14; i15++) {
            if (cArr[i15] == c15) {
                cArr[i15] = c14;
            }
        }
        if (cArr[length - 1] != c14) {
            cArr[length] = c14;
            length++;
            z15 = false;
        } else {
            z15 = true;
        }
        int i16 = prefixLength + 1;
        int i17 = i16;
        while (i17 < length) {
            if (cArr[i17] == c14) {
                int i18 = i17 - 1;
                if (cArr[i18] == c14) {
                    System.arraycopy(cArr, i17, cArr, i18, length - i17);
                    length--;
                    i17--;
                }
            }
            i17++;
        }
        int i19 = i16;
        while (i19 < length) {
            if (cArr[i19] == c14) {
                int i24 = i19 - 1;
                if (cArr[i24] == '.' && (i19 == i16 || cArr[i19 - 2] == c14)) {
                    if (i19 == length - 1) {
                        z15 = true;
                    }
                    System.arraycopy(cArr, i19 + 1, cArr, i24, length - i19);
                    length -= 2;
                    i19--;
                }
            }
            i19++;
        }
        int i25 = prefixLength + 2;
        int i26 = i25;
        while (i26 < length) {
            if (cArr[i26] == c14 && cArr[i26 - 1] == '.' && cArr[i26 - 2] == '.' && (i26 == i25 || cArr[i26 - 3] == c14)) {
                if (i26 == i25) {
                    return null;
                }
                if (i26 == length - 1) {
                    z15 = true;
                }
                int i27 = i26 - 4;
                while (true) {
                    if (i27 < prefixLength) {
                        int i28 = i26 + 1;
                        System.arraycopy(cArr, i28, cArr, prefixLength, length - i26);
                        length -= i28 - prefixLength;
                        i26 = i16;
                        break;
                    }
                    if (cArr[i27] == c14) {
                        int i29 = i27 + 1;
                        System.arraycopy(cArr, i26 + 1, cArr, i29, length - i26);
                        length -= i26 - i27;
                        i26 = i29;
                        break;
                    }
                    i27--;
                }
            }
            i26++;
        }
        if (length <= 0) {
            return "";
        }
        if (length <= prefixLength) {
            return new String(cArr, 0, length);
        }
        return (z15 && z14) ? new String(cArr, 0, length) : new String(cArr, 0, length - 1);
    }

    public static boolean equals(String str, String str2, boolean z14, IOCase iOCase) {
        if (str == null || str2 == null) {
            return str == null && str2 == null;
        }
        if (z14) {
            str = normalize(str);
            str2 = normalize(str2);
            Objects.requireNonNull(str, "Error normalizing one or both of the file names");
            Objects.requireNonNull(str2, "Error normalizing one or both of the file names");
        }
        if (iOCase == null) {
            iOCase = IOCase.SENSITIVE;
        }
        return iOCase.checkEquals(str, str2);
    }

    public static boolean equalsNormalized(String str, String str2) {
        return equals(str, str2, true, IOCase.SENSITIVE);
    }

    public static boolean equalsNormalizedOnSystem(String str, String str2) {
        return equals(str, str2, true, IOCase.SYSTEM);
    }

    public static boolean equalsOnSystem(String str, String str2) {
        return equals(str, str2, false, IOCase.SYSTEM);
    }

    private static void failIfNullBytePresent(String str) {
        int length = str.length();
        for (int i14 = 0; i14 < length; i14++) {
            if (str.charAt(i14) == 0) {
                h.s("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it");
                return;
            }
        }
    }

    private static int getAdsCriticalOffset(String str) {
        int iLastIndexOf = str.lastIndexOf(SYSTEM_SEPARATOR);
        int iLastIndexOf2 = str.lastIndexOf(OTHER_SEPARATOR);
        if (iLastIndexOf != -1) {
            return iLastIndexOf2 == -1 ? iLastIndexOf + 1 : Math.max(iLastIndexOf, iLastIndexOf2) + 1;
        }
        if (iLastIndexOf2 == -1) {
            return 0;
        }
        return iLastIndexOf2 + 1;
    }

    public static String getBaseName(String str) {
        return removeExtension(getName(str));
    }

    public static String getExtension(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOfExtension = indexOfExtension(str);
        return iIndexOfExtension == -1 ? "" : str.substring(iIndexOfExtension + 1);
    }

    public static String getFullPath(String str) {
        return doGetFullPath(str, true);
    }

    public static String getFullPathNoEndSeparator(String str) {
        return doGetFullPath(str, false);
    }

    public static String getName(String str) {
        if (str == null) {
            return null;
        }
        failIfNullBytePresent(str);
        return str.substring(indexOfLastSeparator(str) + 1);
    }

    public static String getPath(String str) {
        return doGetPath(str, 1);
    }

    public static String getPathNoEndSeparator(String str) {
        return doGetPath(str, 0);
    }

    public static String getPrefix(String str) {
        int prefixLength;
        if (str == null || (prefixLength = getPrefixLength(str)) < 0) {
            return null;
        }
        if (prefixLength > str.length()) {
            failIfNullBytePresent(str.concat("/"));
            return str.concat("/");
        }
        String strSubstring = str.substring(0, prefixLength);
        failIfNullBytePresent(strSubstring);
        return strSubstring;
    }

    public static int getPrefixLength(String str) {
        if (str == null) {
            return -1;
        }
        int length = str.length();
        if (length == 0) {
            return 0;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == ':') {
            return -1;
        }
        if (length == 1) {
            if (cCharAt == '~') {
                return 2;
            }
            return isSeparator(cCharAt) ? 1 : 0;
        }
        if (cCharAt == '~') {
            int iIndexOf = str.indexOf(47, 1);
            int iIndexOf2 = str.indexOf(92, 1);
            if (iIndexOf == -1 && iIndexOf2 == -1) {
                return length + 1;
            }
            if (iIndexOf == -1) {
                iIndexOf = iIndexOf2;
            }
            if (iIndexOf2 == -1) {
                iIndexOf2 = iIndexOf;
            }
            return Math.min(iIndexOf, iIndexOf2) + 1;
        }
        char cCharAt2 = str.charAt(1);
        if (cCharAt2 == ':') {
            char upperCase = Character.toUpperCase(cCharAt);
            if (upperCase < 'A' || upperCase > 'Z') {
                return upperCase == '/' ? 1 : -1;
            }
            return (length == 2 || !isSeparator(str.charAt(2))) ? 2 : 3;
        }
        if (!isSeparator(cCharAt) || !isSeparator(cCharAt2)) {
            return isSeparator(cCharAt) ? 1 : 0;
        }
        int iIndexOf3 = str.indexOf(47, 2);
        int iIndexOf4 = str.indexOf(92, 2);
        if ((iIndexOf3 != -1 || iIndexOf4 != -1) && iIndexOf3 != 2 && iIndexOf4 != 2) {
            if (iIndexOf3 == -1) {
                iIndexOf3 = iIndexOf4;
            }
            if (iIndexOf4 == -1) {
                iIndexOf4 = iIndexOf3;
            }
            int iMin = Math.min(iIndexOf3, iIndexOf4);
            int i14 = iMin + 1;
            if (isValidHostName(str.substring(2, iMin))) {
                return i14;
            }
        }
        return -1;
    }

    public static int indexOfExtension(String str) {
        if (str == null) {
            return -1;
        }
        if (isSystemWindows() && str.indexOf(58, getAdsCriticalOffset(str)) != -1) {
            h.s("NTFS ADS separator (':') in file name is forbidden.");
            return 0;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (indexOfLastSeparator(str) > iLastIndexOf) {
            return -1;
        }
        return iLastIndexOf;
    }

    public static int indexOfLastSeparator(String str) {
        if (str == null) {
            return -1;
        }
        return Math.max(str.lastIndexOf(47), str.lastIndexOf(92));
    }

    public static boolean isExtension(String str, Collection<String> collection) {
        if (str == null) {
            return false;
        }
        failIfNullBytePresent(str);
        if (collection == null || collection.isEmpty()) {
            return indexOfExtension(str) == -1;
        }
        String extension = getExtension(str);
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            if (extension.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean isIPv4Address(String str) {
        Matcher matcher = IPV4_PATTERN.matcher(str);
        if (!matcher.matches() || matcher.groupCount() != 4) {
            return false;
        }
        for (int i14 = 1; i14 <= 4; i14++) {
            String strGroup = matcher.group(i14);
            if (Integer.parseInt(strGroup) > 255) {
                return false;
            }
            if (strGroup.length() > 1 && strGroup.startsWith("0")) {
                return false;
            }
        }
        return true;
    }

    private static boolean isIPv6Address(String str) {
        boolean zContains = str.contains("::");
        if (zContains && str.indexOf("::") != str.lastIndexOf("::")) {
            return false;
        }
        if ((str.startsWith(":") && !str.startsWith("::")) || (str.endsWith(":") && !str.endsWith("::"))) {
            return false;
        }
        String[] strArrSplit = str.split(":");
        if (zContains) {
            ArrayList arrayList = new ArrayList(Arrays.asList(strArrSplit));
            if (str.endsWith("::")) {
                arrayList.add("");
            } else if (str.startsWith("::") && !arrayList.isEmpty()) {
                arrayList.remove(0);
            }
            strArrSplit = (String[]) arrayList.toArray(EMPTY_STRING_ARRAY);
        }
        if (strArrSplit.length > 8) {
            return false;
        }
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < strArrSplit.length; i16++) {
            String str2 = strArrSplit[i16];
            if (str2.length() == 0) {
                i15++;
                if (i15 > 1) {
                    return false;
                }
            } else {
                if (i16 == strArrSplit.length - 1 && str2.contains(".")) {
                    if (!isIPv4Address(str2)) {
                        return false;
                    }
                    i14 += 2;
                    i15 = 0;
                } else {
                    if (str2.length() > 4) {
                        return false;
                    }
                    try {
                        int i17 = Integer.parseInt(str2, 16);
                        if (i17 < 0 || i17 > 65535) {
                            return false;
                        }
                        i15 = 0;
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            i14++;
        }
        return i14 <= 8 && (i14 >= 8 || zContains);
    }

    private static boolean isRFC3986HostName(String str) {
        String[] strArrSplit = str.split("\\.", -1);
        int i14 = 0;
        while (i14 < strArrSplit.length) {
            if (strArrSplit[i14].length() == 0) {
                return i14 == strArrSplit.length - 1;
            }
            if (!REG_NAME_PART_PATTERN.matcher(strArrSplit[i14]).matches()) {
                return false;
            }
            i14++;
        }
        return true;
    }

    private static boolean isSeparator(char c14) {
        return c14 == '/' || c14 == '\\';
    }

    public static boolean isSystemWindows() {
        return SYSTEM_SEPARATOR == '\\';
    }

    private static boolean isValidHostName(String str) {
        return isIPv6Address(str) || isRFC3986HostName(str);
    }

    public static String normalize(String str, boolean z14) {
        return doNormalize(str, z14 ? '/' : '\\', true);
    }

    public static String normalizeNoEndSeparator(String str, boolean z14) {
        return doNormalize(str, z14 ? '/' : '\\', false);
    }

    public static String removeExtension(String str) {
        if (str == null) {
            return null;
        }
        failIfNullBytePresent(str);
        int iIndexOfExtension = indexOfExtension(str);
        return iIndexOfExtension == -1 ? str : str.substring(0, iIndexOfExtension);
    }

    public static String separatorsToSystem(String str) {
        if (str == null) {
            return null;
        }
        return isSystemWindows() ? separatorsToWindows(str) : separatorsToUnix(str);
    }

    public static String separatorsToUnix(String str) {
        return (str == null || str.indexOf(92) == -1) ? str : str.replace('\\', '/');
    }

    public static String separatorsToWindows(String str) {
        return (str == null || str.indexOf(47) == -1) ? str : str.replace('/', '\\');
    }

    public static String[] splitOnTokens(String str) {
        if (str.indexOf(63) == -1 && str.indexOf(42) == -1) {
            return new String[]{str};
        }
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb3 = new StringBuilder();
        int length = charArray.length;
        int i14 = 0;
        char c14 = 0;
        while (i14 < length) {
            char c15 = charArray[i14];
            if (c15 == '?' || c15 == '*') {
                if (sb3.length() != 0) {
                    arrayList.add(sb3.toString());
                    sb3.setLength(0);
                }
                if (c15 == '?') {
                    arrayList.add(CallerData.NA);
                } else if (c14 != '*') {
                    arrayList.add(Marker.ANY_MARKER);
                }
            } else {
                sb3.append(c15);
            }
            i14++;
            c14 = c15;
        }
        if (sb3.length() != 0) {
            arrayList.add(sb3.toString());
        }
        return (String[]) arrayList.toArray(EMPTY_STRING_ARRAY);
    }

    public static boolean wildcardMatch(String str, String str2, IOCase iOCase) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null && str2 != null) {
            if (iOCase == null) {
                iOCase = IOCase.SENSITIVE;
            }
            String[] strArrSplitOnTokens = splitOnTokens(str2);
            ArrayDeque arrayDeque = new ArrayDeque(strArrSplitOnTokens.length);
            boolean z14 = false;
            int length = 0;
            int i14 = 0;
            do {
                if (!arrayDeque.isEmpty()) {
                    int[] iArr = (int[]) arrayDeque.pop();
                    i14 = iArr[0];
                    length = iArr[1];
                    z14 = true;
                }
                while (i14 < strArrSplitOnTokens.length) {
                    if (strArrSplitOnTokens[i14].equals(CallerData.NA)) {
                        length++;
                        if (length > str.length()) {
                            break;
                        }
                        z14 = false;
                        i14++;
                    } else {
                        if (strArrSplitOnTokens[i14].equals(Marker.ANY_MARKER)) {
                            if (i14 == strArrSplitOnTokens.length - 1) {
                                length = str.length();
                            }
                            z14 = true;
                        } else if (z14) {
                            length = iOCase.checkIndexOf(str, length, strArrSplitOnTokens[i14]);
                            if (length == -1) {
                                break;
                            }
                            int iCheckIndexOf = iOCase.checkIndexOf(str, length + 1, strArrSplitOnTokens[i14]);
                            if (iCheckIndexOf >= 0) {
                                arrayDeque.push(new int[]{i14, iCheckIndexOf});
                            }
                            length = strArrSplitOnTokens[i14].length() + length;
                            z14 = false;
                        } else {
                            if (!iOCase.checkRegionMatches(str, length, strArrSplitOnTokens[i14])) {
                                break;
                            }
                            length = strArrSplitOnTokens[i14].length() + length;
                            z14 = false;
                        }
                        i14++;
                    }
                }
                if (i14 == strArrSplitOnTokens.length && length == str.length()) {
                    return true;
                }
            } while (!arrayDeque.isEmpty());
        }
        return false;
    }

    public static boolean wildcardMatchOnSystem(String str, String str2) {
        return wildcardMatch(str, str2, IOCase.SYSTEM);
    }

    public static String normalize(String str) {
        return doNormalize(str, SYSTEM_SEPARATOR, true);
    }

    public static String normalizeNoEndSeparator(String str) {
        return doNormalize(str, SYSTEM_SEPARATOR, false);
    }

    public static boolean equals(String str, String str2) {
        return equals(str, str2, false, IOCase.SENSITIVE);
    }

    public static boolean isExtension(String str, String... strArr) {
        if (str == null) {
            return false;
        }
        failIfNullBytePresent(str);
        if (strArr == null || strArr.length == 0) {
            return indexOfExtension(str) == -1;
        }
        String extension = getExtension(str);
        for (String str2 : strArr) {
            if (extension.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isExtension(String str, String str2) {
        if (str == null) {
            return false;
        }
        failIfNullBytePresent(str);
        if (str2 == null || str2.isEmpty()) {
            return indexOfExtension(str) == -1;
        }
        return getExtension(str).equals(str2);
    }

    public static boolean wildcardMatch(String str, String str2) {
        return wildcardMatch(str, str2, IOCase.SENSITIVE);
    }
}
