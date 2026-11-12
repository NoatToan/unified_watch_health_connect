package com.google.zxing.client.result;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class CalendarParsedResult extends ParsedResult {
    private static final Pattern m = Pattern.compile("P(?:(\\d+)W)?(?:(\\d+)D)?(?:T(?:(\\d+)H)?(?:(\\d+)M)?(?:(\\d+)S)?)?");
    private static final long[] n = {604800000, 86400000, 3600000, 60000, 1000};
    private static final Pattern o = Pattern.compile("[0-9]{8}(T[0-9]{6}Z?)?");
    private final String b;
    private final long c;
    private final boolean d;
    private final long e;
    private final boolean f;
    private final String g;
    private final String h;
    private final String[] i;
    private final String j;
    private final double k;
    private final double l;

    public CalendarParsedResult(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, String str7, double d, double d2) {
        super(ParsedResultType.CALENDAR);
        this.b = str;
        try {
            long jB = b(str2);
            this.c = jB;
            if (str3 == null) {
                long jD = d(str4);
                this.e = jD < 0 ? -1L : jB + jD;
            } else {
                try {
                    this.e = b(str3);
                } catch (ParseException e) {
                    throw new IllegalArgumentException(e.toString());
                }
            }
            this.d = str2.length() == 8;
            this.f = str3 != null && str3.length() == 8;
            this.g = str5;
            this.h = str6;
            this.i = strArr;
            this.j = str7;
            this.k = d;
            this.l = d2;
        } catch (ParseException e2) {
            throw new IllegalArgumentException(e2.toString());
        }
    }

    private static String a(boolean z, long j) {
        if (j < 0) {
            return null;
        }
        return (z ? DateFormat.getDateInstance(2) : DateFormat.getDateTimeInstance(2, 2)).format(Long.valueOf(j));
    }

    private static long b(String str) throws ParseException {
        if (!o.matcher(str).matches()) {
            throw new ParseException(str, 0);
        }
        if (str.length() == 8) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        }
        if (str.length() != 16 || str.charAt(15) != 'Z') {
            return c(str);
        }
        long jC = c(str.substring(0, 15));
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        long j = jC + ((long) gregorianCalendar.get(15));
        gregorianCalendar.setTime(new Date(j));
        return j + ((long) gregorianCalendar.get(16));
    }

    private static long c(String str) throws ParseException {
        return new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.ENGLISH).parse(str).getTime();
    }

    private static long d(CharSequence charSequence) {
        if (charSequence == null) {
            return -1L;
        }
        Matcher matcher = m.matcher(charSequence);
        if (!matcher.matches()) {
            return -1L;
        }
        long j = 0;
        int i = 0;
        while (true) {
            long[] jArr = n;
            if (i >= jArr.length) {
                return j;
            }
            int i2 = i + 1;
            String strGroup = matcher.group(i2);
            if (strGroup != null) {
                j += jArr[i] * ((long) Integer.parseInt(strGroup));
            }
            i = i2;
        }
    }

    public String[] getAttendees() {
        return this.i;
    }

    public String getDescription() {
        return this.j;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb = new StringBuilder(100);
        ParsedResult.maybeAppend(this.b, sb);
        ParsedResult.maybeAppend(a(this.d, this.c), sb);
        ParsedResult.maybeAppend(a(this.f, this.e), sb);
        ParsedResult.maybeAppend(this.g, sb);
        ParsedResult.maybeAppend(this.h, sb);
        ParsedResult.maybeAppend(this.i, sb);
        ParsedResult.maybeAppend(this.j, sb);
        return sb.toString();
    }

    @Deprecated
    public Date getEnd() {
        if (this.e < 0) {
            return null;
        }
        return new Date(this.e);
    }

    public long getEndTimestamp() {
        return this.e;
    }

    public double getLatitude() {
        return this.k;
    }

    public String getLocation() {
        return this.g;
    }

    public double getLongitude() {
        return this.l;
    }

    public String getOrganizer() {
        return this.h;
    }

    @Deprecated
    public Date getStart() {
        return new Date(this.c);
    }

    public long getStartTimestamp() {
        return this.c;
    }

    public String getSummary() {
        return this.b;
    }

    public boolean isEndAllDay() {
        return this.f;
    }

    public boolean isStartAllDay() {
        return this.d;
    }
}
