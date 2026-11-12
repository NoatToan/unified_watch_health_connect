package org.apache.commons.lang3.time;

import defpackage.v0a;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class FastDateFormat extends Format {
    public static final int FULL = 0;
    public static final int LONG = 1;
    public static final int MEDIUM = 2;
    public static final int SHORT = 3;
    private static final v0a<FastDateFormat> cache = new a();
    private static final long serialVersionUID = 2;
    private final FastDateParser parser;
    private final FastDatePrinter printer;

    public static class a extends v0a<FastDateFormat> {
        @Override // defpackage.v0a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public FastDateFormat a(String str, TimeZone timeZone, Locale locale) {
            return new FastDateFormat(str, timeZone, locale);
        }
    }

    public FastDateFormat(String str, TimeZone timeZone, Locale locale) {
        this(str, timeZone, locale, null);
    }

    public static FastDateFormat getDateInstance(int i) {
        return (FastDateFormat) cache.b(i, null, null);
    }

    public static FastDateFormat getDateTimeInstance(int i, int i2) {
        return (FastDateFormat) cache.c(i, i2, null, null);
    }

    public static FastDateFormat getInstance() {
        return (FastDateFormat) cache.e();
    }

    public static FastDateFormat getTimeInstance(int i) {
        return (FastDateFormat) cache.h(i, null, null);
    }

    public StringBuffer applyRules(Calendar calendar, StringBuffer stringBuffer) {
        return this.printer.applyRules(calendar, stringBuffer);
    }

    public boolean equals(Object obj) {
        if (obj instanceof FastDateFormat) {
            return this.printer.equals(((FastDateFormat) obj).printer);
        }
        return false;
    }

    @Override // java.text.Format
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return this.printer.format(obj, stringBuffer, fieldPosition);
    }

    public Locale getLocale() {
        return this.printer.getLocale();
    }

    public int getMaxLengthEstimate() {
        return this.printer.getMaxLengthEstimate();
    }

    public String getPattern() {
        return this.printer.getPattern();
    }

    public TimeZone getTimeZone() {
        return this.printer.getTimeZone();
    }

    public int hashCode() {
        return this.printer.hashCode();
    }

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
        return (FastDateFormat) cache.b(i, null, locale);
    }

    public static FastDateFormat getDateTimeInstance(int i, int i2, Locale locale) {
        return (FastDateFormat) cache.c(i, i2, null, locale);
    }

    public static FastDateFormat getInstance(String str) {
        return (FastDateFormat) cache.f(str, null, null);
    }

    public static FastDateFormat getTimeInstance(int i, Locale locale) {
        return (FastDateFormat) cache.h(i, null, locale);
    }

    public String format(long j) {
        return this.printer.format(j);
    }

    public Date parse(String str, ParsePosition parsePosition) {
        return this.parser.parse(str, parsePosition);
    }

    public static FastDateFormat getDateInstance(int i, TimeZone timeZone) {
        return (FastDateFormat) cache.b(i, timeZone, null);
    }

    public static FastDateFormat getDateTimeInstance(int i, int i2, TimeZone timeZone) {
        return getDateTimeInstance(i, i2, timeZone, null);
    }

    public static FastDateFormat getInstance(String str, TimeZone timeZone) {
        return (FastDateFormat) cache.f(str, timeZone, null);
    }

    public static FastDateFormat getTimeInstance(int i, TimeZone timeZone) {
        return (FastDateFormat) cache.h(i, timeZone, null);
    }

    public String format(Date date) {
        return this.printer.format(date);
    }

    public static FastDateFormat getDateInstance(int i, TimeZone timeZone, Locale locale) {
        return (FastDateFormat) cache.b(i, timeZone, locale);
    }

    public static FastDateFormat getDateTimeInstance(int i, int i2, TimeZone timeZone, Locale locale) {
        return (FastDateFormat) cache.c(i, i2, timeZone, locale);
    }

    public static FastDateFormat getInstance(String str, Locale locale) {
        return (FastDateFormat) cache.f(str, null, locale);
    }

    public static FastDateFormat getTimeInstance(int i, TimeZone timeZone, Locale locale) {
        return (FastDateFormat) cache.h(i, timeZone, locale);
    }

    public String format(Calendar calendar) {
        return this.printer.format(calendar);
    }

    public static FastDateFormat getInstance(String str, TimeZone timeZone, Locale locale) {
        return (FastDateFormat) cache.f(str, timeZone, locale);
    }

    public StringBuffer format(long j, StringBuffer stringBuffer) {
        return this.printer.format(j, stringBuffer);
    }

    public StringBuffer format(Date date, StringBuffer stringBuffer) {
        return this.printer.format(date, stringBuffer);
    }

    public StringBuffer format(Calendar calendar, StringBuffer stringBuffer) {
        return this.printer.format(calendar, stringBuffer);
    }
}
