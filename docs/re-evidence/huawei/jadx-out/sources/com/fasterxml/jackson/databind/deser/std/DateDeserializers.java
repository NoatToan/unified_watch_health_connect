package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import defpackage.ahw;
import defpackage.aif;
import defpackage.ym;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes21.dex */
public class DateDeserializers {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashSet<String> f4126b;

    static {
        HashSet<String> hashSet = new HashSet<>();
        f4126b = hashSet;
        hashSet.add("java.util.Calendar");
        hashSet.add("java.util.GregorianCalendar");
        hashSet.add("java.util.Date");
    }

    public static JsonDeserializer<?> b(Class<?> cls, String str) {
        if (!f4126b.contains(str)) {
            return null;
        }
        if (cls == Calendar.class) {
            return new c();
        }
        if (cls == Date.class) {
            return a.f4128a;
        }
        if (cls == GregorianCalendar.class) {
            return new c(GregorianCalendar.class);
        }
        return null;
    }

    public static boolean a(Class<?> cls) {
        return f4126b.contains(cls.getName());
    }

    protected static abstract class DateBasedDeserializer<T> extends StdScalarDeserializer<T> implements ContextualDeserializer {
        protected final DateFormat _customFormat;
        protected final String _formatString;

        protected abstract DateBasedDeserializer<T> withDateFormat(DateFormat dateFormat, String str);

        protected DateBasedDeserializer(Class<?> cls) {
            super(cls);
            this._customFormat = null;
            this._formatString = null;
        }

        protected DateBasedDeserializer(DateBasedDeserializer<T> dateBasedDeserializer, DateFormat dateFormat, String str) {
            super(dateBasedDeserializer._valueClass);
            this._customFormat = dateFormat;
            this._formatString = str;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public LogicalType logicalType() {
            return LogicalType.DateTime;
        }

        @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
        public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws ym {
            DateFormat dateFormat;
            DateFormat dateFormat2;
            aif aifVarC;
            DateFormat dateFormat3;
            DateFormat dateFormatC;
            JsonFormat.c cVarFindFormatOverrides = findFormatOverrides(deserializationContext, beanProperty, handledType());
            if (cVarFindFormatOverrides != null) {
                TimeZone timeZoneF = cVarFindFormatOverrides.f();
                Boolean boolD = cVarFindFormatOverrides.d();
                if (cVarFindFormatOverrides.j()) {
                    String strC = cVarFindFormatOverrides.c();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(strC, cVarFindFormatOverrides.i() ? cVarFindFormatOverrides.a() : deserializationContext.getLocale());
                    if (timeZoneF == null) {
                        timeZoneF = deserializationContext.getTimeZone();
                    }
                    simpleDateFormat.setTimeZone(timeZoneF);
                    if (boolD != null) {
                        simpleDateFormat.setLenient(boolD.booleanValue());
                    }
                    return withDateFormat(simpleDateFormat, strC);
                }
                if (timeZoneF != null) {
                    DateFormat dateFormat4 = deserializationContext.getConfig().getDateFormat();
                    if (dateFormat4.getClass() == aif.class) {
                        aif aifVarD = ((aif) dateFormat4).a(timeZoneF).d(cVarFindFormatOverrides.i() ? cVarFindFormatOverrides.a() : deserializationContext.getLocale());
                        dateFormatC = aifVarD;
                        if (boolD != null) {
                            dateFormatC = aifVarD.c(boolD);
                        }
                    } else {
                        dateFormat3 = (DateFormat) dateFormat4.clone();
                        dateFormat3.setTimeZone(timeZoneF);
                        if (boolD != null) {
                            dateFormatC = dateFormat3;
                            dateFormat3.setLenient(boolD.booleanValue());
                            dateFormatC = dateFormat3;
                        }
                    }
                    dateFormatC = dateFormat3;
                    return withDateFormat(dateFormatC, this._formatString);
                }
                if (boolD != null) {
                    DateFormat dateFormat5 = deserializationContext.getConfig().getDateFormat();
                    String strB = this._formatString;
                    if (dateFormat5.getClass() == aif.class) {
                        aifVarC = ((aif) dateFormat5).c(boolD);
                        strB = aifVarC.b();
                    } else {
                        dateFormat = (DateFormat) dateFormat5.clone();
                        dateFormat.setLenient(boolD.booleanValue());
                        if (dateFormat instanceof SimpleDateFormat) {
                            dateFormat2 = dateFormat;
                            ((SimpleDateFormat) dateFormat).toPattern();
                            dateFormat2 = dateFormat;
                        }
                    }
                    if (strB == null) {
                        dateFormat2 = aifVarC;
                        strB = "[unknown]";
                    }
                    dateFormat2 = aifVarC;
                    return withDateFormat(dateFormat2, strB);
                }
            }
            return this;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
        protected Date _parseDate(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            Date date;
            if (this._customFormat != null && jsonParser.hasToken(JsonToken.VALUE_STRING)) {
                String strTrim = jsonParser.getText().trim();
                if (strTrim.isEmpty()) {
                    if (AnonymousClass5.f4127a[_checkFromStringCoercion(deserializationContext, strTrim).ordinal()] != 1) {
                        return null;
                    }
                    return new Date(0L);
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
            return super._parseDate(jsonParser, deserializationContext);
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.DateDeserializers$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4127a;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            f4127a = iArr;
            try {
                iArr[CoercionAction.AsEmpty.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4127a[CoercionAction.AsNull.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4127a[CoercionAction.TryConvert.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @JacksonStdImpl
    public static class c extends DateBasedDeserializer<Calendar> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final Constructor<Calendar> f4129c;

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer, com.fasterxml.jackson.databind.deser.ContextualDeserializer
        public /* bridge */ /* synthetic */ JsonDeserializer createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws ym {
            return super.createContextual(deserializationContext, beanProperty);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ LogicalType logicalType() {
            return super.logicalType();
        }

        public c() {
            super(Calendar.class);
            this.f4129c = null;
        }

        public c(Class<? extends Calendar> cls) {
            super(cls);
            this.f4129c = ahw.a((Class) cls, false);
        }

        public c(c cVar, DateFormat dateFormat, String str) {
            super(cVar, dateFormat, str);
            this.f4129c = cVar.f4129c;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c withDateFormat(DateFormat dateFormat, String str) {
            return new c(this, dateFormat, str);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Object getEmptyValue(DeserializationContext deserializationContext) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(0L);
            return gregorianCalendar;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Calendar deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            Date date_parseDate = _parseDate(jsonParser, deserializationContext);
            if (date_parseDate == null) {
                return null;
            }
            Constructor<Calendar> constructor = this.f4129c;
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
    }

    @JacksonStdImpl
    public static class a extends DateBasedDeserializer<Date> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4128a = new a();

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer, com.fasterxml.jackson.databind.deser.ContextualDeserializer
        public /* bridge */ /* synthetic */ JsonDeserializer createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws ym {
            return super.createContextual(deserializationContext, beanProperty);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ LogicalType logicalType() {
            return super.logicalType();
        }

        public a() {
            super(Date.class);
        }

        public a(a aVar, DateFormat dateFormat, String str) {
            super(aVar, dateFormat, str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a withDateFormat(DateFormat dateFormat, String str) {
            return new a(this, dateFormat, str);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return new Date(0L);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return _parseDate(jsonParser, deserializationContext);
        }
    }
}
