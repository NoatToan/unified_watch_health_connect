package cn.hutool.core.date;

import cn.hutool.core.date.format.FastDateFormat;
import com.miui.tsmclient.util.StringUtils;
import defpackage.aq5;
import defpackage.g4h;
import defpackage.m0b;
import defpackage.qk1;
import defpackage.tt3;
import defpackage.vp5;
import defpackage.wp5;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public class DateTime extends Date {
    private static final long serialVersionUID = -5395712593979185936L;
    private Week firstDayOfWeek;
    private boolean mutable;
    private TimeZone timeZone;

    public DateTime() {
        this(TimeZone.getDefault());
    }

    public static DateTime now() {
        return new DateTime();
    }

    public static DateTime of(long j) {
        return new DateTime(j);
    }

    private static Date parse(CharSequence charSequence, vp5 vp5Var) {
        qk1.u(vp5Var, "Parser or DateFromat must be not null !", new Object[0]);
        qk1.p(charSequence, "Date String must be not blank !", new Object[0]);
        try {
            return vp5Var.parse(charSequence.toString());
        } catch (Exception e) {
            throw new DateException("Parse [{}] with format [{}] error!", charSequence, vp5Var.getPattern(), e);
        }
    }

    private DateTime setTimeInternal(long j) {
        super.setTime(j);
        return this;
    }

    public DateBetween between(Date date) {
        return new DateBetween(this, date);
    }

    public int dayOfMonth() {
        return getField(DateField.DAY_OF_MONTH);
    }

    public int dayOfWeek() {
        return getField(DateField.DAY_OF_WEEK);
    }

    public Week dayOfWeekEnum() {
        return Week.of(dayOfWeek());
    }

    public int dayOfWeekInMonth() {
        return getField(DateField.DAY_OF_WEEK_IN_MONTH);
    }

    public int dayOfYear() {
        return getField(DateField.DAY_OF_YEAR);
    }

    public int getField(DateField dateField) {
        return getField(dateField.getValue());
    }

    public Week getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    public TimeZone getTimeZone() {
        return this.timeZone;
    }

    public ZoneId getZoneId() {
        return this.timeZone.toZoneId();
    }

    public int hour(boolean z) {
        return getField(z ? DateField.HOUR_OF_DAY : DateField.HOUR);
    }

    public boolean isAM() {
        return getField(DateField.AM_PM) == 0;
    }

    public boolean isAfter(Date date) {
        if (date != null) {
            return compareTo(date) > 0;
        }
        throw new NullPointerException("Date to compare is null !");
    }

    public boolean isAfterOrEquals(Date date) {
        if (date != null) {
            return compareTo(date) >= 0;
        }
        throw new NullPointerException("Date to compare is null !");
    }

    public boolean isBefore(Date date) {
        if (date != null) {
            return compareTo(date) < 0;
        }
        throw new NullPointerException("Date to compare is null !");
    }

    public boolean isBeforeOrEquals(Date date) {
        if (date != null) {
            return compareTo(date) <= 0;
        }
        throw new NullPointerException("Date to compare is null !");
    }

    public boolean isIn(Date date, Date date2) {
        long time = date.getTime();
        long time2 = date2.getTime();
        long time3 = getTime();
        return time3 >= Math.min(time, time2) && time3 <= Math.max(time, time2);
    }

    public boolean isLeapYear() {
        return a.n(year());
    }

    public boolean isMutable() {
        return this.mutable;
    }

    public boolean isPM() {
        return 1 == getField(DateField.AM_PM);
    }

    public boolean isWeekend() {
        int iDayOfWeek = dayOfWeek();
        return 7 == iDayOfWeek || 1 == iDayOfWeek;
    }

    public int millisecond() {
        return getField(DateField.MILLISECOND);
    }

    public int minute() {
        return getField(DateField.MINUTE);
    }

    public int month() {
        return getField(DateField.MONTH);
    }

    public int monthBaseOne() {
        return month() + 1;
    }

    public Month monthEnum() {
        return Month.of(month());
    }

    public int monthStartFromOne() {
        return month() + 1;
    }

    public DateTime offset(DateField dateField, int i) {
        if (DateField.ERA == dateField) {
            throw new IllegalArgumentException("ERA is not support offset!");
        }
        Calendar calendar = toCalendar();
        calendar.add(dateField.getValue(), i);
        return (this.mutable ? this : (DateTime) g4h.a(this)).setTimeInternal(calendar.getTimeInMillis());
    }

    public DateTime offsetNew(DateField dateField, int i) {
        Calendar calendar = toCalendar();
        calendar.add(dateField.getValue(), i);
        return ((DateTime) g4h.a(this)).setTimeInternal(calendar.getTimeInMillis());
    }

    public int quarter() {
        return (month() / 3) + 1;
    }

    public Quarter quarterEnum() {
        return Quarter.of(quarter());
    }

    public int second() {
        return getField(DateField.SECOND);
    }

    public DateTime setField(DateField dateField, int i) {
        return setField(dateField.getValue(), i);
    }

    public DateTime setFirstDayOfWeek(Week week) {
        this.firstDayOfWeek = week;
        return this;
    }

    public DateTime setMutable(boolean z) {
        this.mutable = z;
        return this;
    }

    @Override // java.util.Date
    public void setTime(long j) {
        if (!this.mutable) {
            throw new DateException("This is not a mutable object !");
        }
        super.setTime(j);
    }

    public DateTime setTimeZone(TimeZone timeZone) {
        this.timeZone = (TimeZone) g4h.e(timeZone, TimeZone.getDefault());
        return this;
    }

    public Calendar toCalendar() {
        return toCalendar(Locale.getDefault(Locale.Category.FORMAT));
    }

    public String toDateStr() {
        TimeZone timeZone = this.timeZone;
        return timeZone != null ? toString(a.p("yyyy-MM-dd", null, timeZone)) : toString(wp5.f);
    }

    public Date toJdkDate() {
        return new Date(getTime());
    }

    public String toMsStr() {
        return toString(wp5.n);
    }

    public java.sql.Date toSqlDate() {
        return new java.sql.Date(getTime());
    }

    @Override // java.util.Date
    public String toString() {
        return toString(this.timeZone);
    }

    public String toStringDefaultTimeZone() {
        return toString(TimeZone.getDefault());
    }

    public String toTimeStr() {
        TimeZone timeZone = this.timeZone;
        return timeZone != null ? toString(a.p(StringUtils.EXPECT_TIME_FORMAT, null, timeZone)) : toString(wp5.h);
    }

    public Timestamp toTimestamp() {
        return new Timestamp(getTime());
    }

    public int weekOfMonth() {
        return getField(DateField.WEEK_OF_MONTH);
    }

    public int weekOfYear() {
        return getField(DateField.WEEK_OF_YEAR);
    }

    public int year() {
        return getField(DateField.YEAR);
    }

    public DateTime(TimeZone timeZone) {
        this(System.currentTimeMillis(), timeZone);
    }

    public static DateTime of(Date date) {
        return date instanceof DateTime ? (DateTime) date : new DateTime(date);
    }

    public long between(Date date, DateUnit dateUnit) {
        return new DateBetween(this, date).between(dateUnit);
    }

    public int getField(int i) {
        return toCalendar().get(i);
    }

    public DateTime setField(int i, int i2) {
        Calendar calendar = toCalendar();
        calendar.set(i, i2);
        return (!this.mutable ? (DateTime) g4h.a(this) : this).setTimeInternal(calendar.getTimeInMillis());
    }

    public Calendar toCalendar(Locale locale) {
        return toCalendar(this.timeZone, locale);
    }

    public String toString(TimeZone timeZone) {
        return timeZone != null ? toString(a.p("yyyy-MM-dd HH:mm:ss", null, timeZone)) : toString(wp5.l);
    }

    public DateTime(Date date) {
        this(date, date instanceof DateTime ? ((DateTime) date).timeZone : TimeZone.getDefault());
    }

    public String between(Date date, DateUnit dateUnit, BetweenFormatter.Level level) {
        return new DateBetween(this, date).toString(level);
    }

    public Calendar toCalendar(TimeZone timeZone) {
        return toCalendar(timeZone, Locale.getDefault(Locale.Category.FORMAT));
    }

    public Calendar toCalendar(TimeZone timeZone, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault(Locale.Category.FORMAT);
        }
        Calendar calendar = timeZone != null ? Calendar.getInstance(timeZone, locale) : Calendar.getInstance(locale);
        calendar.setFirstDayOfWeek(this.firstDayOfWeek.getValue());
        calendar.setTime(this);
        return calendar;
    }

    public String toString(String str) {
        TimeZone timeZone = this.timeZone;
        if (timeZone != null) {
            return toString(a.p(str, null, timeZone));
        }
        return toString(FastDateFormat.getInstance(str));
    }

    public static DateTime of(Calendar calendar) {
        return new DateTime(calendar);
    }

    public DateTime(Date date, TimeZone timeZone) {
        this(((Date) g4h.e(date, new Date())).getTime(), timeZone);
    }

    public static DateTime of(String str, String str2) {
        return new DateTime(str, str2);
    }

    private static Date parse(CharSequence charSequence, DateFormat dateFormat) {
        String string;
        qk1.p(charSequence, "Date String must be not blank !", new Object[0]);
        try {
            return dateFormat.parse(charSequence.toString());
        } catch (Exception e) {
            if (dateFormat instanceof SimpleDateFormat) {
                string = ((SimpleDateFormat) dateFormat).toPattern();
            } else {
                string = dateFormat.toString();
            }
            throw new DateException(tt3.y("Parse [{}] with format [{}] error!", charSequence, string), e);
        }
    }

    public DateTime(Calendar calendar) {
        this(calendar.getTime(), calendar.getTimeZone());
        setFirstDayOfWeek(Week.of(calendar.getFirstDayOfWeek()));
    }

    public String toString(aq5 aq5Var) {
        return aq5Var.format(this);
    }

    public String toString(DateFormat dateFormat) {
        return dateFormat.format((Date) this);
    }

    public DateTime(Instant instant) {
        this(instant.toEpochMilli());
    }

    public DateTime(Instant instant, ZoneId zoneId) {
        this(instant.toEpochMilli(), TimeZone.getTimeZone((ZoneId) g4h.e(zoneId, ZoneId.systemDefault())));
    }

    public DateTime(TemporalAccessor temporalAccessor) {
        this(a.x(temporalAccessor));
    }

    public DateTime(ZonedDateTime zonedDateTime) {
        this(zonedDateTime.toInstant(), zonedDateTime.getZone());
    }

    public DateTime(long j) {
        this(j, TimeZone.getDefault());
    }

    public DateTime(long j, TimeZone timeZone) {
        super(j);
        this.mutable = true;
        this.firstDayOfWeek = Week.MONDAY;
        this.timeZone = (TimeZone) g4h.e(timeZone, TimeZone.getDefault());
    }

    public DateTime(CharSequence charSequence) {
        this(a.r(charSequence));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DateTime(CharSequence charSequence, String str) {
        Date dateJ;
        if (m0b.e(str)) {
            dateJ = m0b.j(charSequence, str);
        } else {
            dateJ = parse(charSequence, a.o(str));
        }
        this(dateJ);
    }

    public DateTime(CharSequence charSequence, DateFormat dateFormat) {
        this(parse(charSequence, dateFormat), dateFormat.getTimeZone());
    }

    public DateTime(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        this(Instant.from(dateTimeFormatter.parse(charSequence)), dateTimeFormatter.getZone());
    }

    public DateTime(CharSequence charSequence, vp5 vp5Var) {
        this(parse(charSequence, vp5Var), vp5Var.getTimeZone());
    }
}
