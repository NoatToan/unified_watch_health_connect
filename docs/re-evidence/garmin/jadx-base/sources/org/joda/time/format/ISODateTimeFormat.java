package org.joda.time.format;

import ch.qos.logback.core.CoreConstants;
import com.google.firebase.messaging.l;
import java.util.Collection;
import java.util.HashSet;
import org.joda.time.DateTimeFieldType;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class ISODateTimeFormat {

    public static final class Constants {

        /* JADX INFO: renamed from: ye, reason: collision with root package name */
        private static final DateTimeFormatter f133506ye = yearElement();
        private static final DateTimeFormatter mye = monthElement();
        private static final DateTimeFormatter dme = dayOfMonthElement();

        /* JADX INFO: renamed from: we, reason: collision with root package name */
        private static final DateTimeFormatter f133504we = weekyearElement();
        private static final DateTimeFormatter wwe = weekElement();
        private static final DateTimeFormatter dwe = dayOfWeekElement();
        private static final DateTimeFormatter dye = dayOfYearElement();
        private static final DateTimeFormatter hde = hourElement();
        private static final DateTimeFormatter mhe = minuteElement();
        private static final DateTimeFormatter sme = secondElement();
        private static final DateTimeFormatter fse = fractionElement();

        /* JADX INFO: renamed from: ze, reason: collision with root package name */
        private static final DateTimeFormatter f133508ze = offsetElement();
        private static final DateTimeFormatter lte = literalTElement();

        /* JADX INFO: renamed from: ym, reason: collision with root package name */
        private static final DateTimeFormatter f133507ym = yearMonth();
        private static final DateTimeFormatter ymd = yearMonthDay();

        /* JADX INFO: renamed from: ww, reason: collision with root package name */
        private static final DateTimeFormatter f133505ww = weekyearWeek();
        private static final DateTimeFormatter wwd = weekyearWeekDay();

        /* JADX INFO: renamed from: hm, reason: collision with root package name */
        private static final DateTimeFormatter f133498hm = hourMinute();
        private static final DateTimeFormatter hms = hourMinuteSecond();
        private static final DateTimeFormatter hmsl = hourMinuteSecondMillis();
        private static final DateTimeFormatter hmsf = hourMinuteSecondFraction();

        /* JADX INFO: renamed from: dh, reason: collision with root package name */
        private static final DateTimeFormatter f133495dh = dateHour();
        private static final DateTimeFormatter dhm = dateHourMinute();
        private static final DateTimeFormatter dhms = dateHourMinuteSecond();
        private static final DateTimeFormatter dhmsl = dateHourMinuteSecondMillis();
        private static final DateTimeFormatter dhmsf = dateHourMinuteSecondFraction();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final DateTimeFormatter f133500t = time();

        /* JADX INFO: renamed from: tx, reason: collision with root package name */
        private static final DateTimeFormatter f133503tx = timeNoMillis();

        /* JADX INFO: renamed from: tt, reason: collision with root package name */
        private static final DateTimeFormatter f133502tt = tTime();
        private static final DateTimeFormatter ttx = tTimeNoMillis();

        /* JADX INFO: renamed from: dt, reason: collision with root package name */
        private static final DateTimeFormatter f133497dt = dateTime();
        private static final DateTimeFormatter dtx = dateTimeNoMillis();
        private static final DateTimeFormatter wdt = weekDateTime();
        private static final DateTimeFormatter wdtx = weekDateTimeNoMillis();

        /* JADX INFO: renamed from: od, reason: collision with root package name */
        private static final DateTimeFormatter f133499od = ordinalDate();
        private static final DateTimeFormatter odt = ordinalDateTime();
        private static final DateTimeFormatter odtx = ordinalDateTimeNoMillis();

        /* JADX INFO: renamed from: bd, reason: collision with root package name */
        private static final DateTimeFormatter f133493bd = basicDate();

        /* JADX INFO: renamed from: bt, reason: collision with root package name */
        private static final DateTimeFormatter f133494bt = basicTime();
        private static final DateTimeFormatter btx = basicTimeNoMillis();
        private static final DateTimeFormatter btt = basicTTime();
        private static final DateTimeFormatter bttx = basicTTimeNoMillis();
        private static final DateTimeFormatter bdt = basicDateTime();
        private static final DateTimeFormatter bdtx = basicDateTimeNoMillis();
        private static final DateTimeFormatter bod = basicOrdinalDate();
        private static final DateTimeFormatter bodt = basicOrdinalDateTime();
        private static final DateTimeFormatter bodtx = basicOrdinalDateTimeNoMillis();
        private static final DateTimeFormatter bwd = basicWeekDate();
        private static final DateTimeFormatter bwdt = basicWeekDateTime();
        private static final DateTimeFormatter bwdtx = basicWeekDateTimeNoMillis();
        private static final DateTimeFormatter dpe = dateElementParser();
        private static final DateTimeFormatter tpe = timeElementParser();

        /* JADX INFO: renamed from: dp, reason: collision with root package name */
        private static final DateTimeFormatter f133496dp = dateParser();
        private static final DateTimeFormatter ldp = localDateParser();

        /* JADX INFO: renamed from: tp, reason: collision with root package name */
        private static final DateTimeFormatter f133501tp = timeParser();
        private static final DateTimeFormatter ltp = localTimeParser();
        private static final DateTimeFormatter dtp = dateTimeParser();
        private static final DateTimeFormatter dotp = dateOptionalTimeParser();
        private static final DateTimeFormatter ldotp = localDateOptionalTimeParser();

        private static DateTimeFormatter basicDate() {
            DateTimeFormatter dateTimeFormatter = f133493bd;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendYear(4, 4).appendFixedDecimal(DateTimeFieldType.monthOfYear(), 2).appendFixedDecimal(DateTimeFieldType.dayOfMonth(), 2).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicDateTime() {
            DateTimeFormatter dateTimeFormatter = bdt;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(basicDate()).append(basicTTime()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = bdtx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(basicDate()).append(basicTTimeNoMillis()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicOrdinalDate() {
            DateTimeFormatter dateTimeFormatter = bod;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendYear(4, 4).appendFixedDecimal(DateTimeFieldType.dayOfYear(), 3).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicOrdinalDateTime() {
            DateTimeFormatter dateTimeFormatter = bodt;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(basicOrdinalDate()).append(basicTTime()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicOrdinalDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = bodtx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(basicOrdinalDate()).append(basicTTimeNoMillis()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicTTime() {
            DateTimeFormatter dateTimeFormatter = btt;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(literalTElement()).append(basicTime()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicTTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = bttx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(literalTElement()).append(basicTimeNoMillis()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicTime() {
            DateTimeFormatter dateTimeFormatter = f133494bt;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2).appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2).appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2).appendLiteral('.').appendFractionOfSecond(3, 9).appendTimeZoneOffset("Z", false, 2, 2).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = btx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2).appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2).appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2).appendTimeZoneOffset("Z", false, 2, 2).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicWeekDate() {
            DateTimeFormatter dateTimeFormatter = bwd;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendWeekyear(4, 4).appendLiteral('W').appendFixedDecimal(DateTimeFieldType.weekOfWeekyear(), 2).appendFixedDecimal(DateTimeFieldType.dayOfWeek(), 1).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicWeekDateTime() {
            DateTimeFormatter dateTimeFormatter = bwdt;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(basicWeekDate()).append(basicTTime()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter basicWeekDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = bwdtx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(basicWeekDate()).append(basicTTimeNoMillis()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dateElementParser() {
            DateTimeFormatter dateTimeFormatter = dpe;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().append(yearElement()).appendOptional(new DateTimeFormatterBuilder().append(monthElement()).appendOptional(dayOfMonthElement().getParser()).toParser()).toParser(), new DateTimeFormatterBuilder().append(weekyearElement()).append(weekElement()).appendOptional(dayOfWeekElement().getParser()).toParser(), new DateTimeFormatterBuilder().append(yearElement()).append(dayOfYearElement()).toParser()}).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dateHour() {
            DateTimeFormatter dateTimeFormatter = f133495dh;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(ISODateTimeFormat.hour()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dateHourMinute() {
            DateTimeFormatter dateTimeFormatter = dhm;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(hourMinute()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dateHourMinuteSecond() {
            DateTimeFormatter dateTimeFormatter = dhms;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(hourMinuteSecond()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dateHourMinuteSecondFraction() {
            DateTimeFormatter dateTimeFormatter = dhmsf;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(hourMinuteSecondFraction()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dateHourMinuteSecondMillis() {
            DateTimeFormatter dateTimeFormatter = dhmsl;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(literalTElement()).append(hourMinuteSecondMillis()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dateOptionalTimeParser() {
            DateTimeFormatter dateTimeFormatter = dotp;
            if (dateTimeFormatter != null) {
                return dateTimeFormatter;
            }
            return new DateTimeFormatterBuilder().append(dateElementParser()).appendOptional(new DateTimeFormatterBuilder().appendLiteral('T').appendOptional(timeElementParser().getParser()).appendOptional(offsetElement().getParser()).toParser()).toFormatter();
        }

        private static DateTimeFormatter dateParser() {
            DateTimeFormatter dateTimeFormatter = f133496dp;
            if (dateTimeFormatter != null) {
                return dateTimeFormatter;
            }
            return new DateTimeFormatterBuilder().append(dateElementParser()).appendOptional(new DateTimeFormatterBuilder().appendLiteral('T').append(offsetElement()).toParser()).toFormatter();
        }

        private static DateTimeFormatter dateTime() {
            DateTimeFormatter dateTimeFormatter = f133497dt;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(tTime()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = dtx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ISODateTimeFormat.date()).append(tTimeNoMillis()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dateTimeParser() {
            DateTimeFormatter dateTimeFormatter = dtp;
            if (dateTimeFormatter != null) {
                return dateTimeFormatter;
            }
            return new DateTimeFormatterBuilder().append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().appendLiteral('T').append(timeElementParser()).appendOptional(offsetElement().getParser()).toParser(), dateOptionalTimeParser().getParser()}).toFormatter();
        }

        private static DateTimeFormatter dayOfMonthElement() {
            DateTimeFormatter dateTimeFormatter = dme;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendLiteral('-').appendDayOfMonth(2).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dayOfWeekElement() {
            DateTimeFormatter dateTimeFormatter = dwe;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendLiteral('-').appendDayOfWeek(1).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter dayOfYearElement() {
            DateTimeFormatter dateTimeFormatter = dye;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendLiteral('-').appendDayOfYear(3).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter fractionElement() {
            DateTimeFormatter dateTimeFormatter = fse;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendLiteral('.').appendFractionOfSecond(3, 9).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter hourElement() {
            DateTimeFormatter dateTimeFormatter = hde;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendHourOfDay(2).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter hourMinute() {
            DateTimeFormatter dateTimeFormatter = f133498hm;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter hourMinuteSecond() {
            DateTimeFormatter dateTimeFormatter = hms;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).append(secondElement()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter hourMinuteSecondFraction() {
            DateTimeFormatter dateTimeFormatter = hmsf;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).append(secondElement()).append(fractionElement()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter hourMinuteSecondMillis() {
            DateTimeFormatter dateTimeFormatter = hmsl;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).append(secondElement()).appendLiteral('.').appendFractionOfSecond(3, 3).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter literalTElement() {
            DateTimeFormatter dateTimeFormatter = lte;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendLiteral('T').toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter localDateOptionalTimeParser() {
            DateTimeFormatter dateTimeFormatter = ldotp;
            if (dateTimeFormatter != null) {
                return dateTimeFormatter;
            }
            return new DateTimeFormatterBuilder().append(dateElementParser()).appendOptional(new DateTimeFormatterBuilder().appendLiteral('T').append(timeElementParser()).toParser()).toFormatter().withZoneUTC();
        }

        private static DateTimeFormatter localDateParser() {
            DateTimeFormatter dateTimeFormatter = ldp;
            return dateTimeFormatter == null ? dateElementParser().withZoneUTC() : dateTimeFormatter;
        }

        private static DateTimeFormatter localTimeParser() {
            DateTimeFormatter dateTimeFormatter = ltp;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendOptional(literalTElement().getParser()).append(timeElementParser()).toFormatter().withZoneUTC() : dateTimeFormatter;
        }

        private static DateTimeFormatter minuteElement() {
            DateTimeFormatter dateTimeFormatter = mhe;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendLiteral(CoreConstants.COLON_CHAR).appendMinuteOfHour(2).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter monthElement() {
            DateTimeFormatter dateTimeFormatter = mye;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendLiteral('-').appendMonthOfYear(2).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter offsetElement() {
            DateTimeFormatter dateTimeFormatter = f133508ze;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendTimeZoneOffset("Z", true, 2, 4).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter ordinalDate() {
            DateTimeFormatter dateTimeFormatter = f133499od;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(yearElement()).append(dayOfYearElement()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter ordinalDateTime() {
            DateTimeFormatter dateTimeFormatter = odt;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ordinalDate()).append(tTime()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter ordinalDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = odtx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ordinalDate()).append(tTimeNoMillis()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter secondElement() {
            DateTimeFormatter dateTimeFormatter = sme;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendLiteral(CoreConstants.COLON_CHAR).appendSecondOfMinute(2).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter tTime() {
            DateTimeFormatter dateTimeFormatter = f133502tt;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(literalTElement()).append(time()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter tTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = ttx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(literalTElement()).append(timeNoMillis()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter time() {
            DateTimeFormatter dateTimeFormatter = f133500t;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(hourMinuteSecondFraction()).append(offsetElement()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter timeElementParser() {
            DateTimeFormatter dateTimeFormatter = tpe;
            if (dateTimeFormatter != null) {
                return dateTimeFormatter;
            }
            DateTimeParser parser = new DateTimeFormatterBuilder().append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().appendLiteral('.').toParser(), new DateTimeFormatterBuilder().appendLiteral(CoreConstants.COMMA_CHAR).toParser()}).toParser();
            return new DateTimeFormatterBuilder().append(hourElement()).append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().append(minuteElement()).append((DateTimePrinter) null, new DateTimeParser[]{new DateTimeFormatterBuilder().append(secondElement()).appendOptional(new DateTimeFormatterBuilder().append(parser).appendFractionOfSecond(1, 9).toParser()).toParser(), new DateTimeFormatterBuilder().append(parser).appendFractionOfMinute(1, 9).toParser(), null}).toParser(), new DateTimeFormatterBuilder().append(parser).appendFractionOfHour(1, 9).toParser(), null}).toFormatter();
        }

        private static DateTimeFormatter timeNoMillis() {
            DateTimeFormatter dateTimeFormatter = f133503tx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(hourMinuteSecond()).append(offsetElement()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter timeParser() {
            DateTimeFormatter dateTimeFormatter = f133501tp;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendOptional(literalTElement().getParser()).append(timeElementParser()).appendOptional(offsetElement().getParser()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter weekDateTime() {
            DateTimeFormatter dateTimeFormatter = wdt;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ISODateTimeFormat.weekDate()).append(tTime()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter weekDateTimeNoMillis() {
            DateTimeFormatter dateTimeFormatter = wdtx;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(ISODateTimeFormat.weekDate()).append(tTimeNoMillis()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter weekElement() {
            DateTimeFormatter dateTimeFormatter = wwe;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendLiteral("-W").appendWeekOfWeekyear(2).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter weekyearElement() {
            DateTimeFormatter dateTimeFormatter = f133504we;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendWeekyear(4, 9).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter weekyearWeek() {
            DateTimeFormatter dateTimeFormatter = f133505ww;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(weekyearElement()).append(weekElement()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter weekyearWeekDay() {
            DateTimeFormatter dateTimeFormatter = wwd;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(weekyearElement()).append(weekElement()).append(dayOfWeekElement()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter yearElement() {
            DateTimeFormatter dateTimeFormatter = f133506ye;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().appendYear(4, 9).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter yearMonth() {
            DateTimeFormatter dateTimeFormatter = f133507ym;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(yearElement()).append(monthElement()).toFormatter() : dateTimeFormatter;
        }

        private static DateTimeFormatter yearMonthDay() {
            DateTimeFormatter dateTimeFormatter = ymd;
            return dateTimeFormatter == null ? new DateTimeFormatterBuilder().append(yearElement()).append(monthElement()).append(dayOfMonthElement()).toFormatter() : dateTimeFormatter;
        }
    }

    private static void appendSeparator(DateTimeFormatterBuilder dateTimeFormatterBuilder, boolean z14) {
        if (z14) {
            dateTimeFormatterBuilder.appendLiteral('-');
        }
    }

    public static DateTimeFormatter basicDate() {
        return Constants.f133493bd;
    }

    public static DateTimeFormatter basicDateTime() {
        return Constants.bdt;
    }

    public static DateTimeFormatter basicDateTimeNoMillis() {
        return Constants.bdtx;
    }

    public static DateTimeFormatter basicOrdinalDate() {
        return Constants.bod;
    }

    public static DateTimeFormatter basicOrdinalDateTime() {
        return Constants.bodt;
    }

    public static DateTimeFormatter basicOrdinalDateTimeNoMillis() {
        return Constants.bodtx;
    }

    public static DateTimeFormatter basicTTime() {
        return Constants.btt;
    }

    public static DateTimeFormatter basicTTimeNoMillis() {
        return Constants.bttx;
    }

    public static DateTimeFormatter basicTime() {
        return Constants.f133494bt;
    }

    public static DateTimeFormatter basicTimeNoMillis() {
        return Constants.btx;
    }

    public static DateTimeFormatter basicWeekDate() {
        return Constants.bwd;
    }

    public static DateTimeFormatter basicWeekDateTime() {
        return Constants.bwdt;
    }

    public static DateTimeFormatter basicWeekDateTimeNoMillis() {
        return Constants.bwdtx;
    }

    private static void checkNotStrictISO(Collection<DateTimeFieldType> collection, boolean z14) {
        if (z14) {
            l.j(collection, "No valid ISO8601 format for fields: ");
        }
    }

    public static DateTimeFormatter date() {
        return yearMonthDay();
    }

    private static boolean dateByMonth(DateTimeFormatterBuilder dateTimeFormatterBuilder, Collection<DateTimeFieldType> collection, boolean z14, boolean z15) {
        if (!collection.remove(DateTimeFieldType.year())) {
            if (!collection.remove(DateTimeFieldType.monthOfYear())) {
                if (collection.remove(DateTimeFieldType.dayOfMonth())) {
                    dateTimeFormatterBuilder.appendLiteral('-');
                    dateTimeFormatterBuilder.appendLiteral('-');
                    dateTimeFormatterBuilder.appendLiteral('-');
                    dateTimeFormatterBuilder.appendDayOfMonth(2);
                }
                return false;
            }
            dateTimeFormatterBuilder.appendLiteral('-');
            dateTimeFormatterBuilder.appendLiteral('-');
            dateTimeFormatterBuilder.appendMonthOfYear(2);
            if (!collection.remove(DateTimeFieldType.dayOfMonth())) {
                return true;
            }
            appendSeparator(dateTimeFormatterBuilder, z14);
            dateTimeFormatterBuilder.appendDayOfMonth(2);
            return false;
        }
        dateTimeFormatterBuilder.append(Constants.f133506ye);
        if (!collection.remove(DateTimeFieldType.monthOfYear())) {
            if (!collection.remove(DateTimeFieldType.dayOfMonth())) {
                return true;
            }
            checkNotStrictISO(collection, z15);
            dateTimeFormatterBuilder.appendLiteral('-');
            dateTimeFormatterBuilder.appendLiteral('-');
            dateTimeFormatterBuilder.appendDayOfMonth(2);
            return false;
        }
        if (!collection.remove(DateTimeFieldType.dayOfMonth())) {
            dateTimeFormatterBuilder.appendLiteral('-');
            dateTimeFormatterBuilder.appendMonthOfYear(2);
            return true;
        }
        appendSeparator(dateTimeFormatterBuilder, z14);
        dateTimeFormatterBuilder.appendMonthOfYear(2);
        appendSeparator(dateTimeFormatterBuilder, z14);
        dateTimeFormatterBuilder.appendDayOfMonth(2);
        return false;
    }

    private static boolean dateByOrdinal(DateTimeFormatterBuilder dateTimeFormatterBuilder, Collection<DateTimeFieldType> collection, boolean z14, boolean z15) {
        if (!collection.remove(DateTimeFieldType.year())) {
            if (collection.remove(DateTimeFieldType.dayOfYear())) {
                dateTimeFormatterBuilder.appendLiteral('-');
                dateTimeFormatterBuilder.appendDayOfYear(3);
            }
            return false;
        }
        dateTimeFormatterBuilder.append(Constants.f133506ye);
        if (!collection.remove(DateTimeFieldType.dayOfYear())) {
            return true;
        }
        appendSeparator(dateTimeFormatterBuilder, z14);
        dateTimeFormatterBuilder.appendDayOfYear(3);
        return false;
    }

    private static boolean dateByWeek(DateTimeFormatterBuilder dateTimeFormatterBuilder, Collection<DateTimeFieldType> collection, boolean z14, boolean z15) {
        if (!collection.remove(DateTimeFieldType.weekyear())) {
            if (!collection.remove(DateTimeFieldType.weekOfWeekyear())) {
                if (collection.remove(DateTimeFieldType.dayOfWeek())) {
                    dateTimeFormatterBuilder.appendLiteral('-');
                    dateTimeFormatterBuilder.appendLiteral('W');
                    dateTimeFormatterBuilder.appendLiteral('-');
                    dateTimeFormatterBuilder.appendDayOfWeek(1);
                }
                return false;
            }
            dateTimeFormatterBuilder.appendLiteral('-');
            dateTimeFormatterBuilder.appendLiteral('W');
            dateTimeFormatterBuilder.appendWeekOfWeekyear(2);
            if (!collection.remove(DateTimeFieldType.dayOfWeek())) {
                return true;
            }
            appendSeparator(dateTimeFormatterBuilder, z14);
            dateTimeFormatterBuilder.appendDayOfWeek(1);
            return false;
        }
        dateTimeFormatterBuilder.append(Constants.f133504we);
        if (collection.remove(DateTimeFieldType.weekOfWeekyear())) {
            appendSeparator(dateTimeFormatterBuilder, z14);
            dateTimeFormatterBuilder.appendLiteral('W');
            dateTimeFormatterBuilder.appendWeekOfWeekyear(2);
            if (!collection.remove(DateTimeFieldType.dayOfWeek())) {
                return true;
            }
            appendSeparator(dateTimeFormatterBuilder, z14);
            dateTimeFormatterBuilder.appendDayOfWeek(1);
            return false;
        }
        if (!collection.remove(DateTimeFieldType.dayOfWeek())) {
            return true;
        }
        checkNotStrictISO(collection, z15);
        appendSeparator(dateTimeFormatterBuilder, z14);
        dateTimeFormatterBuilder.appendLiteral('W');
        dateTimeFormatterBuilder.appendLiteral('-');
        dateTimeFormatterBuilder.appendDayOfWeek(1);
        return false;
    }

    public static DateTimeFormatter dateElementParser() {
        return Constants.dpe;
    }

    public static DateTimeFormatter dateHour() {
        return Constants.f133495dh;
    }

    public static DateTimeFormatter dateHourMinute() {
        return Constants.dhm;
    }

    public static DateTimeFormatter dateHourMinuteSecond() {
        return Constants.dhms;
    }

    public static DateTimeFormatter dateHourMinuteSecondFraction() {
        return Constants.dhmsf;
    }

    public static DateTimeFormatter dateHourMinuteSecondMillis() {
        return Constants.dhmsl;
    }

    public static DateTimeFormatter dateOptionalTimeParser() {
        return Constants.dotp;
    }

    public static DateTimeFormatter dateParser() {
        return Constants.f133496dp;
    }

    public static DateTimeFormatter dateTime() {
        return Constants.f133497dt;
    }

    public static DateTimeFormatter dateTimeNoMillis() {
        return Constants.dtx;
    }

    public static DateTimeFormatter dateTimeParser() {
        return Constants.dtp;
    }

    public static DateTimeFormatter forFields(Collection<DateTimeFieldType> collection, boolean z14, boolean z15) {
        boolean zDateByWeek;
        if (collection == null || collection.size() == 0) {
            h.s("The fields must not be null or empty");
            return null;
        }
        HashSet hashSet = new HashSet(collection);
        int size = hashSet.size();
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        if (hashSet.contains(DateTimeFieldType.monthOfYear())) {
            zDateByWeek = dateByMonth(dateTimeFormatterBuilder, hashSet, z14, z15);
        } else if (hashSet.contains(DateTimeFieldType.dayOfYear())) {
            zDateByWeek = dateByOrdinal(dateTimeFormatterBuilder, hashSet, z14, z15);
        } else if (hashSet.contains(DateTimeFieldType.weekOfWeekyear())) {
            zDateByWeek = dateByWeek(dateTimeFormatterBuilder, hashSet, z14, z15);
        } else if (hashSet.contains(DateTimeFieldType.dayOfMonth())) {
            zDateByWeek = dateByMonth(dateTimeFormatterBuilder, hashSet, z14, z15);
        } else if (hashSet.contains(DateTimeFieldType.dayOfWeek())) {
            zDateByWeek = dateByWeek(dateTimeFormatterBuilder, hashSet, z14, z15);
        } else {
            if (hashSet.remove(DateTimeFieldType.year())) {
                dateTimeFormatterBuilder.append(Constants.f133506ye);
            } else if (hashSet.remove(DateTimeFieldType.weekyear())) {
                dateTimeFormatterBuilder.append(Constants.f133504we);
            } else {
                zDateByWeek = false;
            }
            zDateByWeek = true;
        }
        time(dateTimeFormatterBuilder, hashSet, z14, z15, zDateByWeek, hashSet.size() < size);
        if (dateTimeFormatterBuilder.canBuildFormatter()) {
            try {
                collection.retainAll(hashSet);
            } catch (UnsupportedOperationException unused) {
            }
            return dateTimeFormatterBuilder.toFormatter();
        }
        l.j(collection, "No valid format for fields: ");
        return null;
    }

    public static DateTimeFormatter hour() {
        return Constants.hde;
    }

    public static DateTimeFormatter hourMinute() {
        return Constants.f133498hm;
    }

    public static DateTimeFormatter hourMinuteSecond() {
        return Constants.hms;
    }

    public static DateTimeFormatter hourMinuteSecondFraction() {
        return Constants.hmsf;
    }

    public static DateTimeFormatter hourMinuteSecondMillis() {
        return Constants.hmsl;
    }

    public static DateTimeFormatter localDateOptionalTimeParser() {
        return Constants.ldotp;
    }

    public static DateTimeFormatter localDateParser() {
        return Constants.ldp;
    }

    public static DateTimeFormatter localTimeParser() {
        return Constants.ltp;
    }

    public static DateTimeFormatter ordinalDate() {
        return Constants.f133499od;
    }

    public static DateTimeFormatter ordinalDateTime() {
        return Constants.odt;
    }

    public static DateTimeFormatter ordinalDateTimeNoMillis() {
        return Constants.odtx;
    }

    public static DateTimeFormatter tTime() {
        return Constants.f133502tt;
    }

    public static DateTimeFormatter tTimeNoMillis() {
        return Constants.ttx;
    }

    private static void time(DateTimeFormatterBuilder dateTimeFormatterBuilder, Collection<DateTimeFieldType> collection, boolean z14, boolean z15, boolean z16, boolean z17) {
        boolean zRemove = collection.remove(DateTimeFieldType.hourOfDay());
        boolean zRemove2 = collection.remove(DateTimeFieldType.minuteOfHour());
        boolean zRemove3 = collection.remove(DateTimeFieldType.secondOfMinute());
        boolean zRemove4 = collection.remove(DateTimeFieldType.millisOfSecond());
        if (zRemove || zRemove2 || zRemove3 || zRemove4) {
            if (zRemove || zRemove2 || zRemove3 || zRemove4) {
                if (z15 && z16) {
                    l.j(collection, "No valid ISO8601 format for fields because Date was reduced precision: ");
                    return;
                } else if (z17) {
                    dateTimeFormatterBuilder.appendLiteral('T');
                }
            }
            if ((!zRemove || !zRemove2 || !zRemove3) && (!zRemove || zRemove3 || zRemove4)) {
                if (z15 && z17) {
                    l.j(collection, "No valid ISO8601 format for fields because Time was truncated: ");
                    return;
                }
                if ((zRemove || ((!zRemove2 || !zRemove3) && ((!zRemove2 || zRemove4) && !zRemove3))) && z15) {
                    l.j(collection, "No valid ISO8601 format for fields: ");
                    return;
                }
            }
            if (zRemove) {
                dateTimeFormatterBuilder.appendHourOfDay(2);
            } else if (zRemove2 || zRemove3 || zRemove4) {
                dateTimeFormatterBuilder.appendLiteral('-');
            }
            if (z14 && zRemove && zRemove2) {
                dateTimeFormatterBuilder.appendLiteral(CoreConstants.COLON_CHAR);
            }
            if (zRemove2) {
                dateTimeFormatterBuilder.appendMinuteOfHour(2);
            } else if (zRemove3 || zRemove4) {
                dateTimeFormatterBuilder.appendLiteral('-');
            }
            if (z14 && zRemove2 && zRemove3) {
                dateTimeFormatterBuilder.appendLiteral(CoreConstants.COLON_CHAR);
            }
            if (zRemove3) {
                dateTimeFormatterBuilder.appendSecondOfMinute(2);
            } else if (zRemove4) {
                dateTimeFormatterBuilder.appendLiteral('-');
            }
            if (zRemove4) {
                dateTimeFormatterBuilder.appendLiteral('.');
                dateTimeFormatterBuilder.appendMillisOfSecond(3);
            }
        }
    }

    public static DateTimeFormatter timeElementParser() {
        return Constants.tpe;
    }

    public static DateTimeFormatter timeNoMillis() {
        return Constants.f133503tx;
    }

    public static DateTimeFormatter timeParser() {
        return Constants.f133501tp;
    }

    public static DateTimeFormatter weekDate() {
        return Constants.wwd;
    }

    public static DateTimeFormatter weekDateTime() {
        return Constants.wdt;
    }

    public static DateTimeFormatter weekDateTimeNoMillis() {
        return Constants.wdtx;
    }

    public static DateTimeFormatter weekyear() {
        return Constants.f133504we;
    }

    public static DateTimeFormatter weekyearWeek() {
        return Constants.f133505ww;
    }

    public static DateTimeFormatter weekyearWeekDay() {
        return Constants.wwd;
    }

    public static DateTimeFormatter year() {
        return Constants.f133506ye;
    }

    public static DateTimeFormatter yearMonth() {
        return Constants.f133507ym;
    }

    public static DateTimeFormatter yearMonthDay() {
        return Constants.ymd;
    }

    public static DateTimeFormatter time() {
        return Constants.f133500t;
    }
}
