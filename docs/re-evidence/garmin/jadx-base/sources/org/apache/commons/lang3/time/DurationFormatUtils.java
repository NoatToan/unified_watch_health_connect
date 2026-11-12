package org.apache.commons.lang3.time;

import fb1.c;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class DurationFormatUtils {
    static final String H = "H";
    public static final String ISO_EXTENDED_FORMAT_PATTERN = "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.SSS'S'";
    static final String M = "M";
    static final String S = "S";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f133465d = "d";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final String f133466m = "m";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final String f133467s = "s";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final String f133468y = "y";

    public static String format(Token[] tokenArr, long j8, long j14, long j15, long j16, long j17, long j18, long j19, boolean z14) {
        Token[] tokenArr2 = tokenArr;
        StringBuilder sb3 = new StringBuilder();
        int length = tokenArr2.length;
        int i14 = 0;
        boolean z15 = false;
        while (i14 < length) {
            Token token = tokenArr2[i14];
            Object value = token.getValue();
            int count = token.getCount();
            if (value instanceof StringBuilder) {
                sb3.append(value.toString());
                length = length;
                i14 = i14;
            } else {
                if (value.equals("y")) {
                    sb3.append(paddedValue(j8, z14, count));
                } else {
                    if (value.equals(M)) {
                        sb3.append(paddedValue(j14, z14, count));
                    } else if (value.equals("d")) {
                        sb3.append(paddedValue(j15, z14, count));
                        z15 = false;
                    } else {
                        i14 = i14;
                        if (value.equals(H)) {
                            length = length;
                            sb3.append(paddedValue(j16, z14, count));
                        } else {
                            length = length;
                            if (value.equals(f133466m)) {
                                sb3.append(paddedValue(j17, z14, count));
                            } else if (value.equals(f133467s)) {
                                sb3.append(paddedValue(j18, z14, count));
                                z15 = true;
                            } else if (value.equals(S)) {
                                if (z15) {
                                    sb3.append(paddedValue(j19, true, z14 ? Math.max(3, count) : 3));
                                } else {
                                    sb3.append(paddedValue(j19, z14, count));
                                }
                                z15 = false;
                            }
                        }
                        z15 = false;
                    }
                    i14++;
                    tokenArr2 = tokenArr;
                    length = length;
                }
                z15 = false;
            }
            i14++;
            tokenArr2 = tokenArr;
            length = length;
        }
        return sb3.toString();
    }

    public static String formatDuration(long j8, String str, boolean z14) {
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        Validate.inclusiveBetween(0L, Long.MAX_VALUE, j8, "durationMillis must not be negative");
        Token[] tokenArrLexx = lexx(str);
        if (Token.containsTokenWithValue(tokenArrLexx, "d")) {
            j15 = j8 / 86400000;
            j14 = j8 - (86400000 * j15);
        } else {
            j14 = j8;
            j15 = 0;
        }
        if (Token.containsTokenWithValue(tokenArrLexx, H)) {
            long j19 = j14 / 3600000;
            j14 -= 3600000 * j19;
            j16 = j19;
        } else {
            j16 = 0;
        }
        if (Token.containsTokenWithValue(tokenArrLexx, f133466m)) {
            long j24 = j14 / 60000;
            j14 -= 60000 * j24;
            j17 = j24;
        } else {
            j17 = 0;
        }
        if (Token.containsTokenWithValue(tokenArrLexx, f133467s)) {
            j18 = j14 / 1000;
            j14 -= 1000 * j18;
        } else {
            j18 = 0;
        }
        return format(tokenArrLexx, 0L, 0L, j15, j16, j17, j18, j14, z14);
    }

    public static String formatDurationHMS(long j8) {
        return formatDuration(j8, "HH:mm:ss.SSS");
    }

    public static String formatDurationISO(long j8) {
        return formatDuration(j8, ISO_EXTENDED_FORMAT_PATTERN, false);
    }

    public static String formatDurationWords(long j8, boolean z14, boolean z15) {
        String duration = formatDuration(j8, "d' days 'H' hours 'm' minutes 's' seconds'");
        if (z14) {
            duration = c.n(StringUtils.SPACE, duration);
            String strReplaceOnce = StringUtils.replaceOnce(duration, " 0 days", "");
            if (strReplaceOnce.length() != duration.length()) {
                String strReplaceOnce2 = StringUtils.replaceOnce(strReplaceOnce, " 0 hours", "");
                if (strReplaceOnce2.length() != strReplaceOnce.length()) {
                    duration = StringUtils.replaceOnce(strReplaceOnce2, " 0 minutes", "");
                    if (duration.length() != duration.length()) {
                        duration = StringUtils.replaceOnce(duration, " 0 seconds", "");
                    }
                } else {
                    duration = strReplaceOnce;
                }
            }
            if (!duration.isEmpty()) {
                duration = duration.substring(1);
            }
        }
        if (z15) {
            String strReplaceOnce3 = StringUtils.replaceOnce(duration, " 0 seconds", "");
            if (strReplaceOnce3.length() != duration.length()) {
                duration = StringUtils.replaceOnce(strReplaceOnce3, " 0 minutes", "");
                if (duration.length() != strReplaceOnce3.length()) {
                    String strReplaceOnce4 = StringUtils.replaceOnce(duration, " 0 hours", "");
                    if (strReplaceOnce4.length() != duration.length()) {
                        duration = StringUtils.replaceOnce(strReplaceOnce4, " 0 days", "");
                    }
                } else {
                    duration = strReplaceOnce3;
                }
            }
        }
        return StringUtils.replaceOnce(StringUtils.replaceOnce(StringUtils.replaceOnce(StringUtils.replaceOnce(StringUtils.SPACE + duration, " 1 seconds", " 1 second"), " 1 minutes", " 1 minute"), " 1 hours", " 1 hour"), " 1 days", " 1 day").trim();
    }

    public static String formatPeriod(long j8, long j14, String str, boolean z14, TimeZone timeZone) {
        int i14 = 0;
        Validate.isTrue(j8 <= j14, "startMillis must not be greater than endMillis", new Object[0]);
        Token[] tokenArrLexx = lexx(str);
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTime(new Date(j8));
        Calendar calendar2 = Calendar.getInstance(timeZone);
        calendar2.setTime(new Date(j14));
        int i15 = calendar2.get(14) - calendar.get(14);
        int i16 = calendar2.get(13) - calendar.get(13);
        int i17 = calendar2.get(12) - calendar.get(12);
        int i18 = calendar2.get(11) - calendar.get(11);
        int actualMaximum = calendar2.get(5) - calendar.get(5);
        int i19 = calendar2.get(2) - calendar.get(2);
        int i24 = calendar2.get(1) - calendar.get(1);
        while (i15 < 0) {
            i15 += 1000;
            i16--;
        }
        while (i16 < 0) {
            i16 += 60;
            i17--;
        }
        while (i17 < 0) {
            i17 += 60;
            i18--;
        }
        while (i18 < 0) {
            i18 += 24;
            actualMaximum--;
        }
        if (Token.containsTokenWithValue(tokenArrLexx, M)) {
            while (actualMaximum < 0) {
                actualMaximum += calendar.getActualMaximum(5);
                i19--;
                calendar.add(2, 1);
            }
            while (i19 < 0) {
                i19 += 12;
                i24--;
            }
            if (!Token.containsTokenWithValue(tokenArrLexx, "y") && i24 != 0) {
                while (i24 != 0) {
                    i19 += i24 * 12;
                    i24 = 0;
                }
            }
        } else {
            if (!Token.containsTokenWithValue(tokenArrLexx, "y")) {
                int i25 = calendar2.get(1);
                if (i19 < 0) {
                    i25--;
                }
                while (calendar.get(1) != i25) {
                    int actualMaximum2 = (calendar.getActualMaximum(6) - calendar.get(6)) + actualMaximum;
                    if ((calendar instanceof GregorianCalendar) && calendar.get(2) == 1 && calendar.get(5) == 29) {
                        actualMaximum2++;
                    }
                    calendar.add(1, 1);
                    actualMaximum = calendar.get(6) + actualMaximum2;
                }
                i24 = 0;
            }
            while (calendar.get(2) != calendar2.get(2)) {
                actualMaximum += calendar.getActualMaximum(5);
                calendar.add(2, 1);
            }
            i19 = 0;
            while (actualMaximum < 0) {
                actualMaximum += calendar.getActualMaximum(5);
                i19--;
                calendar.add(2, 1);
            }
        }
        if (!Token.containsTokenWithValue(tokenArrLexx, "d")) {
            i18 += actualMaximum * 24;
            actualMaximum = 0;
        }
        if (!Token.containsTokenWithValue(tokenArrLexx, H)) {
            i17 += i18 * 60;
            i18 = 0;
        }
        if (!Token.containsTokenWithValue(tokenArrLexx, f133466m)) {
            i16 += i17 * 60;
            i17 = 0;
        }
        if (Token.containsTokenWithValue(tokenArrLexx, f133467s)) {
            i14 = i16;
        } else {
            i15 += i16 * 1000;
        }
        return format(tokenArrLexx, i24, i19, actualMaximum, i18, i17, i14, i15, z14);
    }

    public static String formatPeriodISO(long j8, long j14) {
        return formatPeriod(j8, j14, ISO_EXTENDED_FORMAT_PATTERN, false, TimeZone.getDefault());
    }

    public static Token[] lexx(String str) {
        String str2;
        ArrayList arrayList = new ArrayList(str.length());
        boolean z14 = false;
        StringBuilder sb3 = null;
        Token token = null;
        for (int i14 = 0; i14 < str.length(); i14++) {
            char cCharAt = str.charAt(i14);
            if (!z14 || cCharAt == '\'') {
                if (cCharAt != '\'') {
                    if (cCharAt == 'H') {
                        str2 = H;
                    } else if (cCharAt == 'M') {
                        str2 = M;
                    } else if (cCharAt == 'S') {
                        str2 = S;
                    } else if (cCharAt == 'd') {
                        str2 = "d";
                    } else if (cCharAt == 'm') {
                        str2 = f133466m;
                    } else if (cCharAt == 's') {
                        str2 = f133467s;
                    } else if (cCharAt != 'y') {
                        if (sb3 == null) {
                            sb3 = new StringBuilder();
                            arrayList.add(new Token(sb3));
                        }
                        sb3.append(cCharAt);
                        str2 = null;
                    } else {
                        str2 = "y";
                    }
                } else if (z14) {
                    z14 = false;
                    sb3 = null;
                    str2 = null;
                } else {
                    sb3 = new StringBuilder();
                    arrayList.add(new Token(sb3));
                    z14 = true;
                    str2 = null;
                }
                if (str2 != null) {
                    if (token == null || !token.getValue().equals(str2)) {
                        token = new Token(str2);
                        arrayList.add(token);
                    } else {
                        token.increment();
                    }
                    sb3 = null;
                }
            } else {
                sb3.append(cCharAt);
            }
        }
        if (!z14) {
            return (Token[]) arrayList.toArray(Token.EMPTY_ARRAY);
        }
        h.s("Unmatched quote in format: ".concat(str));
        return null;
    }

    private static String paddedValue(long j8, boolean z14, int i14) {
        String string = Long.toString(j8);
        return z14 ? StringUtils.leftPad(string, i14, '0') : string;
    }

    public static class Token {
        private static final Token[] EMPTY_ARRAY = new Token[0];
        private int count;
        private final Object value;

        public Token(Object obj) {
            this.value = obj;
            this.count = 1;
        }

        public static boolean containsTokenWithValue(Token[] tokenArr, Object obj) {
            for (Token token : tokenArr) {
                if (token.getValue() == obj) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Token) {
                Token token = (Token) obj;
                if (this.value.getClass() != token.value.getClass() || this.count != token.count) {
                    return false;
                }
                Object obj2 = this.value;
                if (obj2 instanceof StringBuilder) {
                    return obj2.toString().equals(token.value.toString());
                }
                boolean z14 = obj2 instanceof Number;
                Object obj3 = token.value;
                if (z14) {
                    return obj2.equals(obj3);
                }
                if (obj2 == obj3) {
                    return true;
                }
            }
            return false;
        }

        public int getCount() {
            return this.count;
        }

        public Object getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public void increment() {
            this.count++;
        }

        public String toString() {
            return StringUtils.repeat(this.value.toString(), this.count);
        }

        public Token(Object obj, int i14) {
            this.value = obj;
            this.count = i14;
        }
    }

    public static String formatDuration(long j8, String str) {
        return formatDuration(j8, str, true);
    }

    public static String formatPeriod(long j8, long j14, String str) {
        return formatPeriod(j8, j14, str, true, TimeZone.getDefault());
    }
}
