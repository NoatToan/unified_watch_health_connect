package cn.hutool.core.date.format;

import defpackage.aq5;
import defpackage.vp5;
import defpackage.w0a;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public class FastDateFormat extends Format implements vp5, aq5 {
    private static final w0a<FastDateFormat> CACHE = new a();
    public static final int FULL = 0;
    public static final int LONG = 1;
    public static final int MEDIUM = 2;
    public static final int SHORT = 3;
    private static final long serialVersionUID = 8097890768636183236L;
    private final FastDateParser parser;
    private final FastDatePrinter printer;

    public static class a extends w0a<FastDateFormat> {
        @Override // defpackage.w0a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public FastDateFormat a(String str, TimeZone timeZone, Locale locale) {
            return new FastDateFormat(str, timeZone, locale);
        }
    }

    public FastDateFormat(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, null);
    }

    public static FastDateFormat getDateInstance(int i) {
        return (FastDateFormat) CACHE.b(i, null, null);
    }

    public static FastDateFormat getDateTimeInstance(int i, int i2) {
        return (FastDateFormat) CACHE.c(Integer.valueOf(i), Integer.valueOf(i2), null, null);
    }

    public static FastDateFormat getInstance() {
        return (FastDateFormat) CACHE.d();
    }

    public static FastDateFormat getTimeInstance(int i) {
        return (FastDateFormat) CACHE.g(i, null, null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof FastDateFormat) {
            return this.printer.equals(((FastDateFormat) obj).printer);
        }
        return false;
    }

    @Override // java.text.Format
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        stringBuffer.append(this.printer.format(obj));
        return stringBuffer;
    }

    public DateTimeFormatter getDateTimeFormatter() {
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern(getPattern());
        if (getLocale() != null) {
            dateTimeFormatterOfPattern = dateTimeFormatterOfPattern.withLocale(getLocale());
        }
        return getTimeZone() != null ? dateTimeFormatterOfPattern.withZone(getTimeZone().toZoneId()) : dateTimeFormatterOfPattern;
    }

    public Locale getLocale() {
        return this.printer.getLocale();
    }

    public int getMaxLengthEstimate() {
        return this.printer.getMaxLengthEstimate();
    }

    @Override // defpackage.qp5
    public String getPattern() {
        return this.printer.getPattern();
    }

    @Override // defpackage.qp5
    public TimeZone getTimeZone() {
        return this.printer.getTimeZone();
    }

    public int hashCode() {
        return this.printer.hashCode();
    }

    @Override // defpackage.vp5
    public Date parse(String str) throws ParseException {
        return this.parser.parse(str);
    }

    @Override // java.text.Format
    public Object parseObject(String str, ParsePosition parsePosition) {
        return this.parser.parseObject(str, parsePosition);
    }

    public String toString() {
        return "FastDateFormat[" + this.printer.getPattern() + "," + this.printer.getLocale() + "," + this.printer.getTimeZone().getID() + "]";
    }

    public FastDateFormat(String str, TimeZone timeZone, Locale locale, Date date) {
        this.printer = new FastDatePrinter(str, timeZone, locale);
        this.parser = new FastDateParser(str, timeZone, locale, date);
    }

    public static FastDateFormat getDateInstance(int i, Locale locale) {
        return (FastDateFormat) CACHE.b(i, null, locale);
    }

    public static FastDateFormat getDateTimeInstance(int i, int i2, Locale locale) {
        return (FastDateFormat) CACHE.c(Integer.valueOf(i), Integer.valueOf(i2), null, locale);
    }

    public static FastDateFormat getInstance(String str) {
        return (FastDateFormat) CACHE.e(str, null, null);
    }

    public static FastDateFormat getTimeInstance(int i, Locale locale) {
        return (FastDateFormat) CACHE.g(i, null, locale);
    }

    public String format(long j) {
        return this.printer.format(j);
    }

    public Date parse(String str, ParsePosition parsePosition) {
        return this.parser.parse(str, parsePosition);
    }

    public static FastDateFormat getDateInstance(int i, TimeZone timeZone) {
        return (FastDateFormat) CACHE.b(i, timeZone, null);
    }

    public static FastDateFormat getDateTimeInstance(int i, int i2, TimeZone timeZone) {
        return getDateTimeInstance(i, i2, timeZone, null);
    }

    public static FastDateFormat getInstance(String str, TimeZone timeZone) {
        return (FastDateFormat) CACHE.e(str, timeZone, null);
    }

    public static FastDateFormat getTimeInstance(int i, TimeZone timeZone) {
        return (FastDateFormat) CACHE.g(i, timeZone, null);
    }

    @Override // defpackage.aq5
    public String format(Date date) {
        return this.printer.format(date);
    }

    public boolean parse(String str, ParsePosition parsePosition, Calendar calendar) {
        return this.parser.parse(str, parsePosition, calendar);
    }

    public static FastDateFormat getDateInstance(int i, TimeZone timeZone, Locale locale) {
        return (FastDateFormat) CACHE.b(i, timeZone, locale);
    }

    public static FastDateFormat getDateTimeInstance(int i, int i2, TimeZone timeZone, Locale locale) {
        return (FastDateFormat) CACHE.c(Integer.valueOf(i), Integer.valueOf(i2), timeZone, locale);
    }

    public static FastDateFormat getInstance(String str, Locale locale) {
        return (FastDateFormat) CACHE.e(str, null, locale);
    }

    public static FastDateFormat getTimeInstance(int i, TimeZone timeZone, Locale locale) {
        return (FastDateFormat) CACHE.g(i, timeZone, locale);
    }

    public String format(Calendar calendar) {
        return this.printer.format(calendar);
    }

    public static FastDateFormat getInstance(String str, TimeZone timeZone, Locale locale) {
        return (FastDateFormat) CACHE.e(str, timeZone, locale);
    }

    public <B extends Appendable> B format(long j, B b2) {
        return (B) this.printer.format(j, b2);
    }

    public <B extends Appendable> B format(Date date, B b2) {
        return (B) this.printer.format(date, b2);
    }

    public <B extends Appendable> B format(Calendar calendar, B b2) {
        return (B) this.printer.format(calendar, b2);
    }
}
