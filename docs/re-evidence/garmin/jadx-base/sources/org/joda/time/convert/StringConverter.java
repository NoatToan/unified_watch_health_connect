package org.joda.time.convert;

import ch.qos.logback.core.CoreConstants;
import o2.c;
import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadablePartial;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.format.ISOPeriodFormat;
import org.joda.time.format.PeriodFormatter;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
class StringConverter extends AbstractConverter implements InstantConverter, PartialConverter, DurationConverter, PeriodConverter, IntervalConverter {
    static final StringConverter INSTANCE = new StringConverter();

    @Override // org.joda.time.convert.DurationConverter
    public long getDurationMillis(Object obj) {
        long j8;
        long j14;
        String str = (String) obj;
        int length = str.length();
        if (length >= 4 && ((str.charAt(0) == 'P' || str.charAt(0) == 'p') && (str.charAt(1) == 'T' || str.charAt(1) == 't'))) {
            int i14 = length - 1;
            if (str.charAt(i14) == 'S' || str.charAt(i14) == 's') {
                String strSubstring = str.substring(2, i14);
                int i15 = 0;
                int i16 = -1;
                for (int i17 = 0; i17 < strSubstring.length(); i17++) {
                    if (strSubstring.charAt(i17) < '0' || strSubstring.charAt(i17) > '9') {
                        if (i17 == 0 && strSubstring.charAt(0) == '-') {
                            i15 = 1;
                        } else {
                            if (i17 <= i15 || strSubstring.charAt(i17) != '.' || i16 != -1) {
                                h.s(c.c(CoreConstants.DOUBLE_QUOTE_CHAR, "Invalid format: \"", str));
                                return 0L;
                            }
                            i16 = i17;
                        }
                    }
                }
                if (i16 > 0) {
                    j14 = Long.parseLong(strSubstring.substring(i15, i16));
                    String strSubstring2 = strSubstring.substring(i16 + 1);
                    if (strSubstring2.length() != 3) {
                        strSubstring2 = strSubstring2.concat("000").substring(0, 3);
                    }
                    j8 = Integer.parseInt(strSubstring2);
                } else {
                    long j15 = i15 != 0 ? Long.parseLong(strSubstring.substring(i15, strSubstring.length())) : Long.parseLong(strSubstring);
                    j8 = 0;
                    j14 = j15;
                }
                return i15 != 0 ? FieldUtils.safeAdd(FieldUtils.safeMultiply(-j14, 1000), -j8) : FieldUtils.safeAdd(FieldUtils.safeMultiply(j14, 1000), j8);
            }
        }
        h.s(c.c(CoreConstants.DOUBLE_QUOTE_CHAR, "Invalid format: \"", str));
        return 0L;
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter
    public long getInstantMillis(Object obj, Chronology chronology) {
        return ISODateTimeFormat.dateTimeParser().withChronology(chronology).parseMillis((String) obj);
    }

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.PartialConverter
    public int[] getPartialValues(ReadablePartial readablePartial, Object obj, Chronology chronology, DateTimeFormatter dateTimeFormatter) {
        if (dateTimeFormatter.getZone() != null) {
            chronology = chronology.withZone(dateTimeFormatter.getZone());
        }
        return chronology.get(readablePartial, dateTimeFormatter.withChronology(chronology).parseMillis((String) obj));
    }

    @Override // org.joda.time.convert.Converter
    public Class<?> getSupportedType() {
        return String.class;
    }

    @Override // org.joda.time.convert.IntervalConverter
    public void setInto(ReadWritableInterval readWritableInterval, Object obj, Chronology chronology) {
        Period period;
        long jAdd;
        long jAdd2;
        String str = (String) obj;
        int iIndexOf = str.indexOf(47);
        if (iIndexOf < 0) {
            h.s("Format requires a '/' separator: ".concat(str));
            return;
        }
        String strSubstring = str.substring(0, iIndexOf);
        if (strSubstring.length() <= 0) {
            h.s("Format invalid: ".concat(str));
            return;
        }
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() <= 0) {
            h.s("Format invalid: ".concat(str));
            return;
        }
        DateTimeFormatter dateTimeFormatterWithChronology = ISODateTimeFormat.dateTimeParser().withChronology(chronology);
        PeriodFormatter periodFormatterStandard = ISOPeriodFormat.standard();
        char cCharAt = strSubstring.charAt(0);
        Chronology chronology2 = null;
        if (cCharAt == 'P' || cCharAt == 'p') {
            period = periodFormatterStandard.withParseType(getPeriodType(strSubstring)).parsePeriod(strSubstring);
            jAdd = 0;
        } else {
            DateTime dateTime = dateTimeFormatterWithChronology.parseDateTime(strSubstring);
            jAdd = dateTime.getMillis();
            chronology2 = dateTime.getChronology();
            period = null;
        }
        char cCharAt2 = strSubstring2.charAt(0);
        if (cCharAt2 != 'P' && cCharAt2 != 'p') {
            DateTime dateTime2 = dateTimeFormatterWithChronology.parseDateTime(strSubstring2);
            jAdd2 = dateTime2.getMillis();
            if (chronology2 == null) {
                chronology2 = dateTime2.getChronology();
            }
            if (chronology != null) {
                chronology2 = chronology;
            }
            if (period != null) {
                jAdd = chronology2.add(period, jAdd2, -1);
            }
        } else {
            if (period != null) {
                h.s("Interval composed of two durations: ".concat(str));
                return;
            }
            Period period2 = periodFormatterStandard.withParseType(getPeriodType(strSubstring2)).parsePeriod(strSubstring2);
            if (chronology != null) {
                chronology2 = chronology;
            }
            jAdd2 = chronology2.add(period2, jAdd, 1);
        }
        readWritableInterval.setInterval(jAdd, jAdd2);
        readWritableInterval.setChronology(chronology2);
    }

    @Override // org.joda.time.convert.PeriodConverter
    public void setInto(ReadWritablePeriod readWritablePeriod, Object obj, Chronology chronology) {
        String str = (String) obj;
        PeriodFormatter periodFormatterStandard = ISOPeriodFormat.standard();
        readWritablePeriod.clear();
        int into = periodFormatterStandard.parseInto(readWritablePeriod, str, 0);
        if (into < str.length()) {
            if (into < 0) {
                periodFormatterStandard.withParseType(readWritablePeriod.getPeriodType()).parseMutablePeriod(str);
            }
            h.s(c.c(CoreConstants.DOUBLE_QUOTE_CHAR, "Invalid format: \"", str));
        }
    }
}
