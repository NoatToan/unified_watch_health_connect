package com.fasterxml.jackson.databind.ser.std;

import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import defpackage.aif;
import defpackage.ym;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes21.dex */
public abstract class DateTimeSerializerBase<T> extends StdScalarSerializer<T> implements ContextualSerializer {
    protected final DateFormat _customFormat;
    protected final AtomicReference<DateFormat> _reusedCustomFormat;
    protected final Boolean _useTimestamp;

    protected abstract long _timestamp(T t);

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public boolean isEmpty(SerializerProvider serializerProvider, T t) {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
    public abstract void serialize(T t, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException;

    public abstract DateTimeSerializerBase<T> withFormat(Boolean bool, DateFormat dateFormat);

    public DateTimeSerializerBase(Class<T> cls, Boolean bool, DateFormat dateFormat) {
        super(cls);
        this._useTimestamp = bool;
        this._customFormat = dateFormat;
        this._reusedCustomFormat = dateFormat == null ? null : new AtomicReference<>();
    }

    @Override // com.fasterxml.jackson.databind.ser.ContextualSerializer
    public JsonSerializer<?> createContextual(SerializerProvider serializerProvider, BeanProperty beanProperty) throws ym {
        SimpleDateFormat simpleDateFormat;
        Locale locale;
        JsonFormat.c cVarFindFormatOverrides = findFormatOverrides(serializerProvider, beanProperty, handledType());
        if (cVarFindFormatOverrides != null) {
            JsonFormat.Shape shapeB = cVarFindFormatOverrides.b();
            if (shapeB.isNumeric()) {
                return withFormat(Boolean.TRUE, null);
            }
            if (cVarFindFormatOverrides.j()) {
                if (cVarFindFormatOverrides.i()) {
                    locale = cVarFindFormatOverrides.a();
                } else {
                    locale = serializerProvider.getLocale();
                }
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(cVarFindFormatOverrides.c(), locale);
                simpleDateFormat2.setTimeZone(cVarFindFormatOverrides.l() ? cVarFindFormatOverrides.f() : serializerProvider.getTimeZone());
                return withFormat(Boolean.FALSE, simpleDateFormat2);
            }
            boolean zI = cVarFindFormatOverrides.i();
            boolean zL = cVarFindFormatOverrides.l();
            boolean z = shapeB == JsonFormat.Shape.STRING;
            if (zI || zL || z) {
                DateFormat dateFormat = serializerProvider.getConfig().getDateFormat();
                if (dateFormat instanceof aif) {
                    aif aifVarA = (aif) dateFormat;
                    if (cVarFindFormatOverrides.i()) {
                        aifVarA = aifVarA.d(cVarFindFormatOverrides.a());
                    }
                    if (cVarFindFormatOverrides.l()) {
                        aifVarA = aifVarA.a(cVarFindFormatOverrides.f());
                    }
                    return withFormat(Boolean.FALSE, aifVarA);
                }
                if (!(dateFormat instanceof SimpleDateFormat)) {
                    serializerProvider.reportBadDefinition((Class<?>) handledType(), String.format("Configured `DateFormat` (%s) not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`", dateFormat.getClass().getName()));
                }
                SimpleDateFormat simpleDateFormat3 = (SimpleDateFormat) dateFormat;
                if (zI) {
                    simpleDateFormat = new SimpleDateFormat(simpleDateFormat3.toPattern(), cVarFindFormatOverrides.a());
                } else {
                    simpleDateFormat = (SimpleDateFormat) simpleDateFormat3.clone();
                }
                TimeZone timeZoneF = cVarFindFormatOverrides.f();
                if (timeZoneF != null && !timeZoneF.equals(simpleDateFormat.getTimeZone())) {
                    simpleDateFormat.setTimeZone(timeZoneF);
                }
                return withFormat(Boolean.FALSE, simpleDateFormat);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.jsonschema.SchemaAware
    public JsonNode getSchema(SerializerProvider serializerProvider, Type type) {
        return createSchemaNode(_asTimestamp(serializerProvider) ? "number" : "string", true);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
    public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws ym {
        _acceptJsonFormatVisitor(jsonFormatVisitorWrapper, javaType, _asTimestamp(jsonFormatVisitorWrapper.getProvider()));
    }

    protected boolean _asTimestamp(SerializerProvider serializerProvider) {
        Boolean bool = this._useTimestamp;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this._customFormat != null) {
            return false;
        }
        if (serializerProvider != null) {
            return serializerProvider.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        }
        throw new IllegalArgumentException("Null SerializerProvider passed for " + handledType().getName());
    }

    protected void _acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType, boolean z) throws ym {
        if (z) {
            visitIntFormat(jsonFormatVisitorWrapper, javaType, JsonParser.NumberType.LONG, JsonValueFormat.UTC_MILLISEC);
        } else {
            visitStringFormat(jsonFormatVisitorWrapper, javaType, JsonValueFormat.DATE_TIME);
        }
    }

    protected void _serializeAsString(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        if (this._customFormat == null) {
            serializerProvider.defaultSerializeDateValue(date, jsonGenerator);
            return;
        }
        DateFormat andSet = this._reusedCustomFormat.getAndSet(null);
        if (andSet == null) {
            andSet = (DateFormat) this._customFormat.clone();
        }
        jsonGenerator.writeString(andSet.format(date));
        LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(this._reusedCustomFormat, null, andSet);
    }
}
