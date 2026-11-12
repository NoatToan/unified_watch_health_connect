package com.google.gson.internal.bind.util;

import com.huawei.operation.utils.Constants;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: loaded from: classes3.dex */
public class ISO8601Utils {
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone("UTC");
    private static final String UTC_ID = "UTC";

    private ISO8601Utils() {
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z) {
        return format(date, z, TIMEZONE_UTC);
    }

    public static String format(Date date, boolean z, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder((z ? 4 : 0) + 19 + (timeZone.getRawOffset() == 0 ? 1 : 6));
        padInt(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        padInt(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        padInt(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        padInt(sb, gregorianCalendar.get(13), 2);
        if (z) {
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
            padInt(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int iAbs = Math.abs(i / 60);
            int iAbs2 = Math.abs(i % 60);
            sb.append(offset >= 0 ? '+' : '-');
            padInt(sb, iAbs, 2);
            sb.append(':');
            padInt(sb, iAbs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    public static Date parse(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        int length;
        TimeZone timeZone;
        int i5;
        char cCharAt;
        try {
            int index = parsePosition.getIndex();
            int i6 = index + 4;
            int i7 = parseInt(str, index, i6);
            if (checkOffset(str, i6, '-')) {
                i6 = index + 5;
            }
            int i8 = i6 + 2;
            int i9 = parseInt(str, i6, i8);
            if (checkOffset(str, i8, '-')) {
                i8 = i6 + 3;
            }
            int i10 = i8 + 2;
            int i11 = parseInt(str, i8, i10);
            boolean zCheckOffset = checkOffset(str, i10, 'T');
            if (!zCheckOffset && str.length() <= i10) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(i7, i9 - 1, i11);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i10);
                return gregorianCalendar.getTime();
            }
            if (zCheckOffset) {
                int i12 = i8 + 5;
                i2 = parseInt(str, i8 + 3, i12);
                if (checkOffset(str, i12, ':')) {
                    i12 = i8 + 6;
                }
                int i13 = i12 + 2;
                int i14 = parseInt(str, i12, i13);
                if (checkOffset(str, i13, ':')) {
                    i13 = i12 + 3;
                }
                if (str.length() <= i13 || (cCharAt = str.charAt(i13)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
                    i10 = i13;
                    i4 = 0;
                } else {
                    i10 = i13 + 2;
                    i4 = parseInt(str, i13, i10);
                    if (i4 > 59 && i4 < 63) {
                        i4 = 59;
                    }
                    if (checkOffset(str, i10, FilenameUtils.EXTENSION_SEPARATOR)) {
                        int i15 = i13 + 3;
                        int iIndexOfNonDigit = indexOfNonDigit(str, i13 + 4);
                        int iMin = Math.min(iIndexOfNonDigit, i13 + 6);
                        i5 = parseInt(str, i15, iMin);
                        int i16 = iMin - i15;
                        if (i16 == 1) {
                            i5 *= 100;
                        } else if (i16 == 2) {
                            i5 *= 10;
                        }
                        i10 = iIndexOfNonDigit;
                    }
                    i = i14;
                    i3 = i5;
                }
                i5 = 0;
                i = i14;
                i3 = i5;
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
            }
            if (str.length() <= i10) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 == 'Z') {
                timeZone = TIMEZONE_UTC;
                length = i10 + 1;
            } else {
                if (cCharAt2 != '+' && cCharAt2 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt2 + "'");
                }
                String strSubstring = str.substring(i10);
                if (strSubstring.length() < 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i10 + strSubstring.length();
                if (strSubstring.equals("+0000") || strSubstring.equals("+00:00")) {
                    timeZone = TIMEZONE_UTC;
                } else {
                    String str3 = "GMT" + strSubstring;
                    TimeZone timeZone2 = TimeZone.getTimeZone(str3);
                    String id = timeZone2.getID();
                    if (!id.equals(str3) && !id.replace(":", "").equals(str3)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                    }
                    timeZone = timeZone2;
                }
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, i7);
            gregorianCalendar2.set(2, i9 - 1);
            gregorianCalendar2.set(5, i11);
            gregorianCalendar2.set(11, i2);
            gregorianCalendar2.set(12, i);
            gregorianCalendar2.set(13, i4);
            gregorianCalendar2.set(14, i3);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            if (str == null) {
                str2 = null;
            } else {
                str2 = "\"" + str + '\"';
            }
            String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                message = Constants.LEFT_BRACKET_ONLY + e.getClass().getName() + Constants.RIGHT_BRACKET_ONLY;
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        }
    }

    private static boolean checkOffset(String str, int i, char c2) {
        return i < str.length() && str.charAt(i) == c2;
    }

    private static int parseInt(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = -iDigit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int iDigit2 = Character.digit(str.charAt(i4), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = (i3 * 10) - iDigit2;
            i4++;
        }
        return -i3;
    }

    private static void padInt(StringBuilder sb, int i, int i2) {
        String string = Integer.toString(i);
        for (int length = i2 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    private static int indexOfNonDigit(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }
}
