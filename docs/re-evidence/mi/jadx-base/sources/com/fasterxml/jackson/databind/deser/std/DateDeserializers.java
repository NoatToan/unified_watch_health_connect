package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import defpackage.aj4;
import defpackage.esd;
import defpackage.h04;
import defpackage.qqd;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public class DateDeserializers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet<String> f7649a = new HashSet<>();

    @qqd
    public static class CalendarDeserializer extends DateBasedDeserializer<Calendar> {
        protected final Constructor<Calendar> _defaultCtor;

        public CalendarDeserializer() {
            super(Calendar.class);
            this._defaultCtor = null;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer, defpackage.aj4
        public /* bridge */ /* synthetic */ esd createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
            return super.createContextual(deserializationContext, beanProperty);
        }

        @Override // defpackage.esd
        public Calendar deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            Date date_parseDate = _parseDate(jsonParser, deserializationContext);
            if (date_parseDate == null) {
                return null;
            }
            Constructor<Calendar> constructor = this._defaultCtor;
            if (constructor == null) {
                return deserializationContext.constructCalendar(date_parseDate);
            }
            try {
                Calendar calendarNewInstance = constructor.newInstance(new Object[0]);
                calendarNewInstance.setTimeInMillis(date_parseDate.getTime());
                TimeZone timeZone = deserializationContext.getTimeZone();
                if (timeZone != null) {
                    calendarNewInstance.setTimeZone(timeZone);
                }
                return calendarNewInstance;
            } catch (Exception e) {
                return (Calendar) deserializationContext.handleInstantiationProblem(handledType(), date_parseDate, e);
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer
        /* JADX INFO: renamed from: withDateFormat, reason: merged with bridge method [inline-methods] */
        public DateBasedDeserializer<Calendar> withDateFormat2(DateFormat dateFormat, String str) {
            return new CalendarDeserializer(this, dateFormat, str);
        }

        public CalendarDeserializer(Class<? extends Calendar> cls) {
            super(cls);
            this._defaultCtor = h04.p(cls, false);
        }

        public CalendarDeserializer(CalendarDeserializer calendarDeserializer, DateFormat dateFormat, String str) {
            super(calendarDeserializer, dateFormat, str);
            this._defaultCtor = calendarDeserializer._defaultCtor;
        }
    }

    @qqd
    public static class DateDeserializer extends DateBasedDeserializer<Date> {
        public static final DateDeserializer instance = new DateDeserializer();

        public DateDeserializer() {
            super(Date.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer, defpackage.aj4
        public /* bridge */ /* synthetic */ esd createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
            return super.createContextual(deserializationContext, beanProperty);
        }

        public DateDeserializer(DateDeserializer dateDeserializer, DateFormat dateFormat, String str) {
            super(dateDeserializer, dateFormat, str);
        }

        @Override // defpackage.esd
        public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return _parseDate(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer
        /* JADX INFO: renamed from: withDateFormat, reason: avoid collision after fix types in other method */
        public DateBasedDeserializer<Date> withDateFormat2(DateFormat dateFormat, String str) {
            return new DateDeserializer(this, dateFormat, str);
        }
    }

    public static class SqlDateDeserializer extends DateBasedDeserializer<java.sql.Date> {
        public SqlDateDeserializer() {
            super(java.sql.Date.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer, defpackage.aj4
        public /* bridge */ /* synthetic */ esd createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
            return super.createContextual(deserializationContext, beanProperty);
        }

        public SqlDateDeserializer(SqlDateDeserializer sqlDateDeserializer, DateFormat dateFormat, String str) {
            super(sqlDateDeserializer, dateFormat, str);
        }

        @Override // defpackage.esd
        public java.sql.Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            Date date_parseDate = _parseDate(jsonParser, deserializationContext);
            if (date_parseDate == null) {
                return null;
            }
            return new java.sql.Date(date_parseDate.getTime());
        }

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer
        /* JADX INFO: renamed from: withDateFormat, reason: avoid collision after fix types in other method */
        public DateBasedDeserializer<java.sql.Date> withDateFormat2(DateFormat dateFormat, String str) {
            return new SqlDateDeserializer(this, dateFormat, str);
        }
    }

    public static class TimestampDeserializer extends DateBasedDeserializer<Timestamp> {
        public TimestampDeserializer() {
            super(Timestamp.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer, defpackage.aj4
        public /* bridge */ /* synthetic */ esd createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
            return super.createContextual(deserializationContext, beanProperty);
        }

        public TimestampDeserializer(TimestampDeserializer timestampDeserializer, DateFormat dateFormat, String str) {
            super(timestampDeserializer, dateFormat, str);
        }

        @Override // defpackage.esd
        public Timestamp deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            Date date_parseDate = _parseDate(jsonParser, deserializationContext);
            if (date_parseDate == null) {
                return null;
            }
            return new Timestamp(date_parseDate.getTime());
        }

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer
        /* JADX INFO: renamed from: withDateFormat, reason: avoid collision after fix types in other method */
        public DateBasedDeserializer<Timestamp> withDateFormat2(DateFormat dateFormat, String str) {
            return new TimestampDeserializer(this, dateFormat, str);
        }
    }

    static {
        Class[] clsArr = {Calendar.class, GregorianCalendar.class, java.sql.Date.class, Date.class, Timestamp.class};
        for (int i = 0; i < 5; i++) {
            f7649a.add(clsArr[i].getName());
        }
    }

    public static esd<?> a(Class<?> cls, String str) {
        if (!f7649a.contains(str)) {
            return null;
        }
        if (cls == Calendar.class) {
            return new CalendarDeserializer();
        }
        if (cls == Date.class) {
            return DateDeserializer.instance;
        }
        if (cls == java.sql.Date.class) {
            return new SqlDateDeserializer();
        }
        if (cls == Timestamp.class) {
            return new TimestampDeserializer();
        }
        if (cls == GregorianCalendar.class) {
            return new CalendarDeserializer(GregorianCalendar.class);
        }
        return null;
    }

    public static abstract class DateBasedDeserializer<T> extends StdScalarDeserializer<T> implements aj4 {
        protected final DateFormat _customFormat;
        protected final String _formatString;

        public DateBasedDeserializer(Class<?> cls) {
            super(cls);
            this._customFormat = null;
            this._formatString = null;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
        public Date _parseDate(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            Date date;
            if (this._customFormat == null || !jsonParser.y0(JsonToken.VALUE_STRING)) {
                return super._parseDate(jsonParser, deserializationContext);
            }
            String strTrim = jsonParser.d0().trim();
            if (strTrim.length() == 0) {
                return (Date) getEmptyValue(deserializationContext);
            }
            synchronized (this._customFormat) {
                try {
                    try {
                        date = this._customFormat.parse(strTrim);
                    } catch (ParseException unused) {
                        return (Date) deserializationContext.handleWeirdStringValue(handledType(), strTrim, "expected format \"%s\"", this._formatString);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return date;
        }

        public esd<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
            DateFormat dateFormat;
            DateFormat dateFormat2;
            StdDateFormat stdDateFormatWithLenient;
            DateFormat dateFormat3;
            DateFormat dateFormatWithLenient;
            JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(deserializationContext, beanProperty, handledType());
            if (valueFindFormatOverrides != null) {
                TimeZone timeZone = valueFindFormatOverrides.getTimeZone();
                Boolean lenient = valueFindFormatOverrides.getLenient();
                if (valueFindFormatOverrides.hasPattern()) {
                    String pattern = valueFindFormatOverrides.getPattern();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, valueFindFormatOverrides.hasLocale() ? valueFindFormatOverrides.getLocale() : deserializationContext.getLocale());
                    if (timeZone == null) {
                        timeZone = deserializationContext.getTimeZone();
                    }
                    simpleDateFormat.setTimeZone(timeZone);
                    if (lenient != null) {
                        simpleDateFormat.setLenient(lenient.booleanValue());
                    }
                    return withDateFormat2(simpleDateFormat, pattern);
                }
                if (timeZone != null) {
                    DateFormat dateFormat4 = deserializationContext.getConfig().getDateFormat();
                    if (dateFormat4.getClass() == StdDateFormat.class) {
                        StdDateFormat stdDateFormatWithLocale = ((StdDateFormat) dateFormat4).withTimeZone(timeZone).withLocale(valueFindFormatOverrides.hasLocale() ? valueFindFormatOverrides.getLocale() : deserializationContext.getLocale());
                        dateFormatWithLenient = stdDateFormatWithLocale;
                        if (lenient != null) {
                            dateFormatWithLenient = stdDateFormatWithLocale.withLenient(lenient);
                        }
                    } else {
                        dateFormat3 = (DateFormat) dateFormat4.clone();
                        dateFormat3.setTimeZone(timeZone);
                        if (lenient != null) {
                            dateFormatWithLenient = dateFormat3;
                            dateFormat3.setLenient(lenient.booleanValue());
                            dateFormatWithLenient = dateFormat3;
                        }
                    }
                    dateFormatWithLenient = dateFormat3;
                    return withDateFormat2(dateFormatWithLenient, this._formatString);
                }
                if (lenient != null) {
                    DateFormat dateFormat5 = deserializationContext.getConfig().getDateFormat();
                    String pattern2 = this._formatString;
                    if (dateFormat5.getClass() == StdDateFormat.class) {
                        stdDateFormatWithLenient = ((StdDateFormat) dateFormat5).withLenient(lenient);
                        pattern2 = stdDateFormatWithLenient.toPattern();
                    } else {
                        dateFormat = (DateFormat) dateFormat5.clone();
                        dateFormat.setLenient(lenient.booleanValue());
                        if (dateFormat instanceof SimpleDateFormat) {
                            dateFormat2 = dateFormat;
                            ((SimpleDateFormat) dateFormat).toPattern();
                            dateFormat2 = dateFormat;
                        }
                    }
                    if (pattern2 == null) {
                        dateFormat2 = stdDateFormatWithLenient;
                        pattern2 = "[unknown]";
                    }
                    dateFormat2 = stdDateFormatWithLenient;
                    return withDateFormat2(dateFormat2, pattern2);
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: withDateFormat */
        public abstract DateBasedDeserializer<T> withDateFormat2(DateFormat dateFormat, String str);

        public DateBasedDeserializer(DateBasedDeserializer<T> dateBasedDeserializer, DateFormat dateFormat, String str) {
            super(dateBasedDeserializer._valueClass);
            this._customFormat = dateFormat;
            this._formatString = str;
        }
    }
}
