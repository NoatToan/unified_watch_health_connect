package com.nimbusds.jose.shaded.gson.internal.bind.util;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import o2.c;
import org.apache.commons.lang3.time.TimeZones;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes3.dex */
public class ISO8601Utils {
    private static final String UTC_ID = "UTC";
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone(UTC_ID);

    private ISO8601Utils() {
    }

    private static boolean checkOffset(String str, int i14, char c14) {
        return i14 < str.length() && str.charAt(i14) == c14;
    }

    public static String format(Date date, boolean z14, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb3 = new StringBuilder(19 + (z14 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        padInt(sb3, gregorianCalendar.get(1), 4);
        sb3.append('-');
        padInt(sb3, gregorianCalendar.get(2) + 1, 2);
        sb3.append('-');
        padInt(sb3, gregorianCalendar.get(5), 2);
        sb3.append('T');
        padInt(sb3, gregorianCalendar.get(11), 2);
        sb3.append(CoreConstants.COLON_CHAR);
        padInt(sb3, gregorianCalendar.get(12), 2);
        sb3.append(CoreConstants.COLON_CHAR);
        padInt(sb3, gregorianCalendar.get(13), 2);
        if (z14) {
            sb3.append('.');
            padInt(sb3, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i14 = offset / DateTimeConstants.MILLIS_PER_MINUTE;
            int iAbs = Math.abs(i14 / 60);
            int iAbs2 = Math.abs(i14 % 60);
            sb3.append(offset >= 0 ? '+' : '-');
            padInt(sb3, iAbs, 2);
            sb3.append(CoreConstants.COLON_CHAR);
            padInt(sb3, iAbs2, 2);
        } else {
            sb3.append('Z');
        }
        return sb3.toString();
    }

    private static int indexOfNonDigit(String str, int i14) {
        while (i14 < str.length()) {
            char cCharAt = str.charAt(i14);
            if (cCharAt < '0' || cCharAt > '9') {
                return i14;
            }
            i14++;
        }
        return str.length();
    }

    private static void padInt(StringBuilder sb3, int i14, int i15) {
        String string = Integer.toString(i14);
        for (int length = i15 - string.length(); length > 0; length--) {
            sb3.append('0');
        }
        sb3.append(string);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e8 A[Catch: IllegalArgumentException -> 0x0056, IndexOutOfBoundsException -> 0x0059, TryCatch #2 {IllegalArgumentException -> 0x0056, IndexOutOfBoundsException -> 0x0059, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003f, B:13:0x0045, B:21:0x0062, B:23:0x0072, B:24:0x0074, B:26:0x0080, B:27:0x0083, B:29:0x0089, B:33:0x0093, B:38:0x00a3, B:40:0x00ab, B:52:0x00e2, B:54:0x00e8, B:56:0x00ee, B:82:0x017f, B:62:0x00ff, B:63:0x0115, B:64:0x0116, B:68:0x0126, B:70:0x0133, B:73:0x013c, B:75:0x014e, B:78:0x015d, B:79:0x017a, B:81:0x017d, B:67:0x0122, B:84:0x01b1, B:85:0x01b8, B:45:0x00c5, B:46:0x00c8), top: B:96:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ee A[Catch: IllegalArgumentException -> 0x0056, IndexOutOfBoundsException -> 0x0059, TryCatch #2 {IllegalArgumentException -> 0x0056, IndexOutOfBoundsException -> 0x0059, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003f, B:13:0x0045, B:21:0x0062, B:23:0x0072, B:24:0x0074, B:26:0x0080, B:27:0x0083, B:29:0x0089, B:33:0x0093, B:38:0x00a3, B:40:0x00ab, B:52:0x00e2, B:54:0x00e8, B:56:0x00ee, B:82:0x017f, B:62:0x00ff, B:63:0x0115, B:64:0x0116, B:68:0x0126, B:70:0x0133, B:73:0x013c, B:75:0x014e, B:78:0x015d, B:79:0x017a, B:81:0x017d, B:67:0x0122, B:84:0x01b1, B:85:0x01b8, B:45:0x00c5, B:46:0x00c8), top: B:96:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:66:0x0121  */
    /* JADX WARN: Code duplicated, block: B:67:0x0122 A[Catch: IllegalArgumentException -> 0x0056, IndexOutOfBoundsException -> 0x0059, TryCatch #2 {IllegalArgumentException -> 0x0056, IndexOutOfBoundsException -> 0x0059, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003f, B:13:0x0045, B:21:0x0062, B:23:0x0072, B:24:0x0074, B:26:0x0080, B:27:0x0083, B:29:0x0089, B:33:0x0093, B:38:0x00a3, B:40:0x00ab, B:52:0x00e2, B:54:0x00e8, B:56:0x00ee, B:82:0x017f, B:62:0x00ff, B:63:0x0115, B:64:0x0116, B:68:0x0126, B:70:0x0133, B:73:0x013c, B:75:0x014e, B:78:0x015d, B:79:0x017a, B:81:0x017d, B:67:0x0122, B:84:0x01b1, B:85:0x01b8, B:45:0x00c5, B:46:0x00c8), top: B:96:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:81:0x017d A[Catch: IllegalArgumentException -> 0x0056, IndexOutOfBoundsException -> 0x0059, TryCatch #2 {IllegalArgumentException -> 0x0056, IndexOutOfBoundsException -> 0x0059, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003f, B:13:0x0045, B:21:0x0062, B:23:0x0072, B:24:0x0074, B:26:0x0080, B:27:0x0083, B:29:0x0089, B:33:0x0093, B:38:0x00a3, B:40:0x00ab, B:52:0x00e2, B:54:0x00e8, B:56:0x00ee, B:82:0x017f, B:62:0x00ff, B:63:0x0115, B:64:0x0116, B:68:0x0126, B:70:0x0133, B:73:0x013c, B:75:0x014e, B:78:0x015d, B:79:0x017a, B:81:0x017d, B:67:0x0122, B:84:0x01b1, B:85:0x01b8, B:45:0x00c5, B:46:0x00c8), top: B:96:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b1 A[Catch: IllegalArgumentException -> 0x0056, IndexOutOfBoundsException -> 0x0059, TryCatch #2 {IllegalArgumentException -> 0x0056, IndexOutOfBoundsException -> 0x0059, blocks: (B:3:0x000c, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003f, B:13:0x0045, B:21:0x0062, B:23:0x0072, B:24:0x0074, B:26:0x0080, B:27:0x0083, B:29:0x0089, B:33:0x0093, B:38:0x00a3, B:40:0x00ab, B:52:0x00e2, B:54:0x00e8, B:56:0x00ee, B:82:0x017f, B:62:0x00ff, B:63:0x0115, B:64:0x0116, B:68:0x0126, B:70:0x0133, B:73:0x013c, B:75:0x014e, B:78:0x015d, B:79:0x017a, B:81:0x017d, B:67:0x0122, B:84:0x01b1, B:85:0x01b8, B:45:0x00c5, B:46:0x00c8), top: B:96:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:88:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d1  */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x01d1, please report this as an issue */
    public static Date parse(String str, ParsePosition parsePosition) throws ParseException {
        String strC;
        String message;
        int i14;
        int i15;
        int i16;
        int i17;
        char cCharAt;
        String strSubstring;
        int length;
        TimeZone timeZone;
        char cCharAt2;
        try {
            int index = parsePosition.getIndex();
            int i18 = index + 4;
            int i19 = parseInt(str, index, i18);
            if (checkOffset(str, i18, '-')) {
                i18 = index + 5;
            }
            int i24 = i18 + 2;
            int i25 = parseInt(str, i18, i24);
            if (checkOffset(str, i24, '-')) {
                i24 = i18 + 3;
            }
            int i26 = i24 + 2;
            int i27 = parseInt(str, i24, i26);
            boolean zCheckOffset = checkOffset(str, i26, 'T');
            if (!zCheckOffset && str.length() <= i26) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(i19, i25 - 1, i27);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i26);
                return gregorianCalendar.getTime();
            }
            if (zCheckOffset) {
                int i28 = i24 + 5;
                int i29 = parseInt(str, i24 + 3, i28);
                if (checkOffset(str, i28, CoreConstants.COLON_CHAR)) {
                    i28 = i24 + 6;
                }
                int i30 = i28 + 2;
                int i34 = parseInt(str, i28, i30);
                if (checkOffset(str, i30, CoreConstants.COLON_CHAR)) {
                    i30 = i28 + 3;
                }
                if (str.length() <= i30 || (cCharAt2 = str.charAt(i30)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i26 = i30;
                    i14 = i29;
                    i15 = i34;
                } else {
                    int i35 = i30 + 2;
                    i17 = parseInt(str, i30, i35);
                    if (i17 > 59 && i17 < 63) {
                        i17 = 59;
                    }
                    if (checkOffset(str, i35, '.')) {
                        int i36 = i30 + 3;
                        int iIndexOfNonDigit = indexOfNonDigit(str, i30 + 4);
                        int iMin = Math.min(iIndexOfNonDigit, i30 + 6);
                        int i37 = parseInt(str, i36, iMin);
                        int i38 = iMin - i36;
                        if (i38 == 1) {
                            i37 *= 100;
                        } else if (i38 == 2) {
                            i37 *= 10;
                        }
                        i14 = i29;
                        i26 = iIndexOfNonDigit;
                        i15 = i34;
                        i16 = i37;
                    } else {
                        i14 = i29;
                        i26 = i35;
                        i15 = i34;
                        i16 = 0;
                    }
                }
                if (str.length() > i26) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i26);
                if (cCharAt == 'Z') {
                    timeZone = TIMEZONE_UTC;
                    length = i26 + 1;
                } else {
                    if (cCharAt != '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i26);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring.concat("00");
                    }
                    length = i26 + strSubstring.length();
                    if (!strSubstring.equals("+0000") || strSubstring.equals("+00:00")) {
                        timeZone = TIMEZONE_UTC;
                    } else {
                        String strConcat = TimeZones.GMT_ID.concat(strSubstring);
                        TimeZone timeZone2 = TimeZone.getTimeZone(strConcat);
                        String id3 = timeZone2.getID();
                        if (!id3.equals(strConcat) && !id3.replace(":", "").equals(strConcat)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + strConcat + " given, resolves to " + timeZone2.getID());
                        }
                        timeZone = timeZone2;
                    }
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, i19);
                gregorianCalendar2.set(2, i25 - 1);
                gregorianCalendar2.set(5, i27);
                gregorianCalendar2.set(11, i14);
                gregorianCalendar2.set(12, i15);
                gregorianCalendar2.set(13, i17);
                gregorianCalendar2.set(14, i16);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i14 = 0;
            i15 = 0;
            i16 = 0;
            i17 = 0;
            if (str.length() > i26) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i26);
            if (cCharAt == 'Z') {
                timeZone = TIMEZONE_UTC;
                length = i26 + 1;
            } else {
                if (cCharAt != '+') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                }
                strSubstring = str.substring(i26);
                if (strSubstring.length() >= 5) {
                    strSubstring = strSubstring.concat("00");
                }
                length = i26 + strSubstring.length();
                if (strSubstring.equals("+0000")) {
                    timeZone = TIMEZONE_UTC;
                } else {
                    timeZone = TIMEZONE_UTC;
                }
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, i19);
            gregorianCalendar3.set(2, i25 - 1);
            gregorianCalendar3.set(5, i27);
            gregorianCalendar3.set(11, i14);
            gregorianCalendar3.set(12, i15);
            gregorianCalendar3.set(13, i17);
            gregorianCalendar3.set(14, i16);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (IllegalArgumentException e4) {
            e = e4;
            if (str == null) {
                strC = null;
            } else {
                strC = c.c(CoreConstants.DOUBLE_QUOTE_CHAR, "\"", str);
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException(a0.j("Failed to parse date [", strC, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e14) {
            e = e14;
            if (str == null) {
                strC = null;
            } else {
                strC = c.c(CoreConstants.DOUBLE_QUOTE_CHAR, "\"", str);
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException(a0.j("Failed to parse date [", strC, "]: ", message), parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        }
    }

    private static int parseInt(String str, int i14, int i15) {
        int i16;
        int i17;
        if (i14 < 0 || i15 > str.length() || i14 > i15) {
            throw new NumberFormatException(str);
        }
        if (i14 < i15) {
            i17 = i14 + 1;
            int iDigit = Character.digit(str.charAt(i14), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: ".concat(str.substring(i14, i15)));
            }
            i16 = -iDigit;
        } else {
            i16 = 0;
            i17 = i14;
        }
        while (i17 < i15) {
            int i18 = i17 + 1;
            int iDigit2 = Character.digit(str.charAt(i17), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: ".concat(str.substring(i14, i15)));
            }
            i16 = (i16 * 10) - iDigit2;
            i17 = i18;
        }
        return -i16;
    }

    public static String format(Date date, boolean z14) {
        return format(date, z14, TIMEZONE_UTC);
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_UTC);
    }
}
