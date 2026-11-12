package org.apache.commons.io;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import org.apache.commons.lang3.CharUtils;

/* JADX INFO: loaded from: classes3.dex */
public enum FileSystem {
    GENERIC(false, false, Integer.MAX_VALUE, Integer.MAX_VALUE, new char[]{0}, new String[0]),
    LINUX(true, true, 255, 4096, new char[]{0, IOUtils.DIR_SEPARATOR_UNIX}, new String[0]),
    MAC_OSX(true, true, 255, 1024, new char[]{0, IOUtils.DIR_SEPARATOR_UNIX, CoreConstants.COLON_CHAR}, new String[0]),
    WINDOWS(false, true, 255, 32000, new char[]{0, 1, 2, 3, 4, 5, 6, 7, '\b', '\t', '\n', 11, '\f', CharUtils.CR, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, CoreConstants.DOUBLE_QUOTE_CHAR, '*', IOUtils.DIR_SEPARATOR_UNIX, CoreConstants.COLON_CHAR, '<', '>', '?', '\\', '|'}, new String[]{DateTokenConverter.AUXILIARY_TOKEN, "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "CON", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9", "NUL", "PRN"});

    private final boolean casePreserving;
    private final boolean caseSensitive;
    private final char[] illegalFileNameChars;
    private final int maxFileNameLength;
    private final int maxPathLength;
    private final String[] reservedFileNames;
    private static final boolean IS_OS_LINUX = getOsMatchesName("Linux");
    private static final boolean IS_OS_MAC = getOsMatchesName("Mac");
    private static final String OS_NAME_WINDOWS_PREFIX = "Windows";
    private static final boolean IS_OS_WINDOWS = getOsMatchesName(OS_NAME_WINDOWS_PREFIX);

    FileSystem(boolean z14, boolean z15, int i14, int i15, char[] cArr, String[] strArr) {
        this.maxFileNameLength = i14;
        this.maxPathLength = i15;
        Objects.requireNonNull(cArr, "illegalFileNameChars");
        this.illegalFileNameChars = cArr;
        Objects.requireNonNull(strArr, "reservedFileNames");
        this.reservedFileNames = strArr;
        this.caseSensitive = z14;
        this.casePreserving = z15;
    }

    public static FileSystem getCurrent() {
        if (IS_OS_LINUX) {
            return LINUX;
        }
        if (IS_OS_MAC) {
            return MAC_OSX;
        }
        return IS_OS_WINDOWS ? WINDOWS : GENERIC;
    }

    private static boolean getOsMatchesName(String str) {
        return isOsNameMatch(getSystemProperty("os.name"), str);
    }

    private static String getSystemProperty(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            System.err.println("Caught a SecurityException reading the system property '" + str + "'; the SystemUtils property value will default to null.");
            return null;
        }
    }

    private boolean isIllegalFileNameChar(char c14) {
        return Arrays.binarySearch(this.illegalFileNameChars, c14) >= 0;
    }

    private static boolean isOsNameMatch(String str, String str2) {
        if (str == null) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str.toUpperCase(locale).startsWith(str2.toUpperCase(locale));
    }

    public char[] getIllegalFileNameChars() {
        return (char[]) this.illegalFileNameChars.clone();
    }

    public int getMaxFileNameLength() {
        return this.maxFileNameLength;
    }

    public int getMaxPathLength() {
        return this.maxPathLength;
    }

    public String[] getReservedFileNames() {
        return (String[]) this.reservedFileNames.clone();
    }

    public boolean isCasePreserving() {
        return this.casePreserving;
    }

    public boolean isCaseSensitive() {
        return this.caseSensitive;
    }

    public boolean isLegalFileName(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0 || charSequence.length() > this.maxFileNameLength || isReservedFileName(charSequence)) {
            return false;
        }
        for (int i14 = 0; i14 < charSequence.length(); i14++) {
            if (isIllegalFileNameChar(charSequence.charAt(i14))) {
                return false;
            }
        }
        return true;
    }

    public boolean isReservedFileName(CharSequence charSequence) {
        return Arrays.binarySearch(this.reservedFileNames, charSequence) >= 0;
    }

    public String toLegalFileName(String str, char c14) {
        if (isIllegalFileNameChar(c14)) {
            throw new IllegalArgumentException(String.format("The replacement character '%s' cannot be one of the %s illegal characters: %s", c14 == 0 ? "\\0" : Character.valueOf(c14), name(), Arrays.toString(this.illegalFileNameChars)));
        }
        int length = str.length();
        int i14 = this.maxFileNameLength;
        if (length > i14) {
            str = str.substring(0, i14);
        }
        char[] charArray = str.toCharArray();
        boolean z14 = false;
        for (int i15 = 0; i15 < charArray.length; i15++) {
            if (isIllegalFileNameChar(charArray[i15])) {
                charArray[i15] = c14;
                z14 = true;
            }
        }
        return z14 ? String.valueOf(charArray) : str;
    }
}
