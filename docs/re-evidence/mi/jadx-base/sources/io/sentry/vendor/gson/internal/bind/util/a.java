package io.sentry.vendor.gson.internal.bind.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.ApiStatus;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f21912a = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    public static String b(Date date, boolean z) {
        return c(date, z, f21912a);
    }

    public static String c(Date date, boolean z, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(19 + (z ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        e(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        e(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        e(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        e(sb, gregorianCalendar.get(11), 2);
        sb.append(AbstractJsonLexerKt.COLON);
        e(sb, gregorianCalendar.get(12), 2);
        sb.append(AbstractJsonLexerKt.COLON);
        e(sb, gregorianCalendar.get(13), 2);
        if (z) {
            sb.append('.');
            e(sb, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int iAbs = Math.abs(i / 60);
            int iAbs2 = Math.abs(i % 60);
            sb.append(offset >= 0 ? '+' : '-');
            e(sb, iAbs, 2);
            sb.append(AbstractJsonLexerKt.COLON);
            e(sb, iAbs2, 2);
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    public static int d(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static void e(StringBuilder sb, int i, int i2) {
        String string = Integer.toString(i);
        for (int length = i2 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    /* JADX WARN: Code duplicated, block: B:85:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f1  */
    /* JADX WARN: Instruction removed from duplicated block: B:86:0x01d1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:91:0x01f1, please report this as an issue */
    public static Date f(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        String message;
        int i;
        int i2;
        int i3;
        int iG;
        int length;
        TimeZone timeZone;
        char cCharAt;
        try {
            int index = parsePosition.getIndex();
            int i4 = index + 4;
            int iG2 = g(str, index, i4);
            if (a(str, i4, '-')) {
                i4 = index + 5;
            }
            int i5 = i4 + 2;
            int iG3 = g(str, i4, i5);
            if (a(str, i5, '-')) {
                i5 = i4 + 3;
            }
            int i6 = i5 + 2;
            int iG4 = g(str, i5, i6);
            boolean zA = a(str, i6, 'T');
            if (!zA && str.length() <= i6) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iG2, iG3 - 1, iG4);
                parsePosition.setIndex(i6);
                return gregorianCalendar.getTime();
            }
            if (zA) {
                int i7 = i5 + 5;
                int iG5 = g(str, i5 + 3, i7);
                if (a(str, i7, AbstractJsonLexerKt.COLON)) {
                    i7 = i5 + 6;
                }
                int i8 = i7 + 2;
                int iG6 = g(str, i7, i8);
                if (a(str, i8, AbstractJsonLexerKt.COLON)) {
                    i8 = i7 + 3;
                }
                if (str.length() <= i8 || (cCharAt = str.charAt(i8)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
                    i2 = iG6;
                    i3 = 0;
                    iG = 0;
                    i6 = i8;
                    i = iG5;
                } else {
                    int i9 = i8 + 2;
                    iG = g(str, i8, i9);
                    if (iG > 59 && iG < 63) {
                        iG = 59;
                    }
                    if (a(str, i9, '.')) {
                        int i10 = i8 + 3;
                        int iD = d(str, i8 + 4);
                        int iMin = Math.min(iD, i8 + 6);
                        int iG7 = g(str, i10, iMin);
                        int i11 = iMin - i10;
                        if (i11 == 1) {
                            iG7 *= 100;
                        } else if (i11 == 2) {
                            iG7 *= 10;
                        }
                        i = iG5;
                        i6 = iD;
                        i2 = iG6;
                        i3 = iG7;
                    } else {
                        i = iG5;
                        i6 = i9;
                        i2 = iG6;
                        i3 = 0;
                    }
                }
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
                iG = 0;
            }
            if (str.length() <= i6) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char cCharAt2 = str.charAt(i6);
            if (cCharAt2 == 'Z') {
                timeZone = f21912a;
                length = i6 + 1;
            } else {
                if (cCharAt2 != '+' && cCharAt2 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt2 + "'");
                }
                String strSubstring = str.substring(i6);
                if (strSubstring.length() < 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i6 + strSubstring.length();
                if ("+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                    timeZone = f21912a;
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
            gregorianCalendar2.set(1, iG2);
            gregorianCalendar2.set(2, iG3 - 1);
            gregorianCalendar2.set(5, iG4);
            gregorianCalendar2.set(11, i);
            gregorianCalendar2.set(12, i2);
            gregorianCalendar2.set(13, iG);
            gregorianCalendar2.set(14, i3);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (IllegalArgumentException e) {
            e = e;
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e2) {
            e = e2;
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (NumberFormatException e3) {
            e = e3;
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException3 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException3.initCause(e);
            throw parseException3;
        }
    }

    public static int g(String str, int i, int i2) throws NumberFormatException {
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
            int i5 = i4 + 1;
            int iDigit2 = Character.digit(str.charAt(i4), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = (i3 * 10) - iDigit2;
            i4 = i5;
        }
        return -i3;
    }
}
