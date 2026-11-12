package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import defpackage.cj4;
import defpackage.d8i;
import defpackage.eud;
import defpackage.ksd;
import defpackage.wwl;
import defpackage.zsd;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DateTimeSerializerBase<T> extends StdScalarSerializer<T> implements cj4 {
    protected final DateFormat _customFormat;
    protected final AtomicReference<DateFormat> _reusedCustomFormat;
    protected final Boolean _useTimestamp;

    public DateTimeSerializerBase(Class<T> cls, Boolean bool, DateFormat dateFormat) {
        super(cls);
        this._useTimestamp = bool;
        this._customFormat = dateFormat;
        this._reusedCustomFormat = dateFormat == null ? null : new AtomicReference<>();
    }

    public void _acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType, boolean z) throws JsonMappingException {
        if (z) {
            visitIntFormat(ksdVar, javaType, JsonParser.NumberType.LONG, JsonValueFormat.UTC_MILLISEC);
        } else {
            visitStringFormat(ksdVar, javaType, JsonValueFormat.DATE_TIME);
        }
    }

    public boolean _asTimestamp(wwl wwlVar) {
        Boolean bool = this._useTimestamp;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this._customFormat != null) {
            return false;
        }
        if (wwlVar != null) {
            return wwlVar.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        }
        throw new IllegalArgumentException("Null SerializerProvider passed for " + handledType().getName());
    }

    public void _serializeAsString(Date date, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        if (this._customFormat == null) {
            wwlVar.defaultSerializeDateValue(date, jsonGenerator);
            return;
        }
        DateFormat andSet = this._reusedCustomFormat.getAndSet(null);
        if (andSet == null) {
            andSet = (DateFormat) this._customFormat.clone();
        }
        jsonGenerator.Q0(andSet.format(date));
        d8i.a(this._reusedCustomFormat, null, andSet);
    }

    public abstract long _timestamp(T t);

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
        _acceptJsonFormatVisitor(ksdVar, javaType, _asTimestamp(ksdVar.a()));
    }

    @Override // defpackage.cj4
    public eud<?> createContextual(wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(wwlVar, beanProperty, handledType());
        if (valueFindFormatOverrides == null) {
            return this;
        }
        JsonFormat.Shape shape = valueFindFormatOverrides.getShape();
        if (shape.isNumeric()) {
            return withFormat(Boolean.TRUE, null);
        }
        if (valueFindFormatOverrides.hasPattern()) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(valueFindFormatOverrides.getPattern(), valueFindFormatOverrides.hasLocale() ? valueFindFormatOverrides.getLocale() : wwlVar.getLocale());
            simpleDateFormat.setTimeZone(valueFindFormatOverrides.hasTimeZone() ? valueFindFormatOverrides.getTimeZone() : wwlVar.getTimeZone());
            return withFormat(Boolean.FALSE, simpleDateFormat);
        }
        boolean zHasLocale = valueFindFormatOverrides.hasLocale();
        boolean zHasTimeZone = valueFindFormatOverrides.hasTimeZone();
        boolean z = shape == JsonFormat.Shape.STRING;
        if (!zHasLocale && !zHasTimeZone && !z) {
            return this;
        }
        DateFormat dateFormat = wwlVar.getConfig().getDateFormat();
        if (dateFormat instanceof StdDateFormat) {
            StdDateFormat stdDateFormatWithTimeZone = (StdDateFormat) dateFormat;
            if (valueFindFormatOverrides.hasLocale()) {
                stdDateFormatWithTimeZone = stdDateFormatWithTimeZone.withLocale(valueFindFormatOverrides.getLocale());
            }
            if (valueFindFormatOverrides.hasTimeZone()) {
                stdDateFormatWithTimeZone = stdDateFormatWithTimeZone.withTimeZone(valueFindFormatOverrides.getTimeZone());
            }
            return withFormat(Boolean.FALSE, stdDateFormatWithTimeZone);
        }
        if (!(dateFormat instanceof SimpleDateFormat)) {
            wwlVar.reportBadDefinition((Class<?>) handledType(), String.format("Configured `DateFormat` (%s) not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`", dateFormat.getClass().getName()));
        }
        SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) dateFormat;
        SimpleDateFormat simpleDateFormat3 = zHasLocale ? new SimpleDateFormat(simpleDateFormat2.toPattern(), valueFindFormatOverrides.getLocale()) : (SimpleDateFormat) simpleDateFormat2.clone();
        TimeZone timeZone = valueFindFormatOverrides.getTimeZone();
        if (timeZone != null && !timeZone.equals(simpleDateFormat3.getTimeZone())) {
            simpleDateFormat3.setTimeZone(timeZone);
        }
        return withFormat(Boolean.FALSE, simpleDateFormat3);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
    public zsd getSchema(wwl wwlVar, Type type) {
        return createSchemaNode(_asTimestamp(wwlVar) ? RealNameWebViewActivity.NUMBER : "string", true);
    }

    @Override // defpackage.eud
    public boolean isEmpty(wwl wwlVar, T t) {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
    public abstract void serialize(T t, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException;

    public abstract DateTimeSerializerBase<T> withFormat(Boolean bool, DateFormat dateFormat);
}
