package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import defpackage.agz;
import defpackage.ahw;
import defpackage.ahx;
import defpackage.ym;
import defpackage.yt;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/* JADX INFO: loaded from: classes21.dex */
public abstract class StdKeySerializers {
    protected static final JsonSerializer<Object> DEFAULT_KEY_SERIALIZER = new agz();
    protected static final JsonSerializer<Object> DEFAULT_STRING_SERIALIZER = new a();

    public static JsonSerializer<Object> getStdKeySerializer(yt ytVar, Class<?> cls, boolean z) {
        if (cls == null || cls == Object.class) {
            return new d();
        }
        if (cls == String.class) {
            return DEFAULT_STRING_SERIALIZER;
        }
        if (cls.isPrimitive()) {
            cls = ahw.w(cls);
        }
        if (cls == Integer.class) {
            return new b(5, cls);
        }
        if (cls == Long.class) {
            return new b(6, cls);
        }
        if (cls.isPrimitive() || Number.class.isAssignableFrom(cls)) {
            return new b(8, cls);
        }
        if (cls == Class.class) {
            return new b(3, cls);
        }
        if (Date.class.isAssignableFrom(cls)) {
            return new b(1, cls);
        }
        if (Calendar.class.isAssignableFrom(cls)) {
            return new b(2, cls);
        }
        if (cls == UUID.class) {
            return new b(8, cls);
        }
        if (cls == byte[].class) {
            return new b(7, cls);
        }
        if (z) {
            return new b(8, cls);
        }
        return null;
    }

    public static JsonSerializer<Object> getFallbackKeySerializer(yt ytVar, Class<?> cls) {
        if (cls != null) {
            if (cls == Enum.class) {
                return new d();
            }
            if (ahw.m(cls)) {
                return e.a(cls, ahx.b(ytVar, cls));
            }
        }
        return new b(8, cls);
    }

    @Deprecated
    public static JsonSerializer<Object> getDefault() {
        return DEFAULT_KEY_SERIALIZER;
    }

    public static class b extends StdSerializer<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final int f4201a;

        public b(int i, Class<?> cls) {
            super(cls, false);
            this.f4201a = i;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
        public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            String strName;
            switch (this.f4201a) {
                case 1:
                    serializerProvider.defaultSerializeDateKey((Date) obj, jsonGenerator);
                    break;
                case 2:
                    serializerProvider.defaultSerializeDateKey(((Calendar) obj).getTimeInMillis(), jsonGenerator);
                    break;
                case 3:
                    jsonGenerator.writeFieldName(((Class) obj).getName());
                    break;
                case 4:
                    if (serializerProvider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
                        strName = obj.toString();
                    } else {
                        Enum r3 = (Enum) obj;
                        if (serializerProvider.isEnabled(SerializationFeature.WRITE_ENUM_KEYS_USING_INDEX)) {
                            strName = String.valueOf(r3.ordinal());
                        } else {
                            strName = r3.name();
                        }
                    }
                    jsonGenerator.writeFieldName(strName);
                    break;
                case 5:
                case 6:
                    jsonGenerator.writeFieldId(((Number) obj).longValue());
                    break;
                case 7:
                    jsonGenerator.writeFieldName(serializerProvider.getConfig().getBase64Variant().d((byte[]) obj));
                    break;
                default:
                    jsonGenerator.writeFieldName(obj.toString());
                    break;
            }
        }
    }

    public static class d extends StdSerializer<Object> {
        protected transient PropertySerializerMap d;

        public d() {
            super(String.class, false);
            this.d = PropertySerializerMap.emptyForProperties();
        }

        Object readResolve() {
            this.d = PropertySerializerMap.emptyForProperties();
            return this;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
        public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            Class<?> cls = obj.getClass();
            PropertySerializerMap propertySerializerMap = this.d;
            JsonSerializer<Object> jsonSerializerSerializerFor = propertySerializerMap.serializerFor(cls);
            if (jsonSerializerSerializerFor == null) {
                jsonSerializerSerializerFor = e(propertySerializerMap, cls, serializerProvider);
            }
            jsonSerializerSerializerFor.serialize(obj, jsonGenerator, serializerProvider);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer, com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable
        public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonFormatVisitorWrapper, JavaType javaType) throws ym {
            visitStringFormat(jsonFormatVisitorWrapper, javaType);
        }

        protected JsonSerializer<Object> e(PropertySerializerMap propertySerializerMap, Class<?> cls, SerializerProvider serializerProvider) throws ym {
            if (cls == Object.class) {
                b bVar = new b(8, cls);
                this.d = propertySerializerMap.newWith(cls, bVar);
                return bVar;
            }
            PropertySerializerMap.d dVarFindAndAddKeySerializer = propertySerializerMap.findAndAddKeySerializer(cls, serializerProvider, null);
            if (propertySerializerMap != dVarFindAndAddKeySerializer.f4190a) {
                this.d = dVarFindAndAddKeySerializer.f4190a;
            }
            return dVarFindAndAddKeySerializer.f4191b;
        }
    }

    public static class a extends StdSerializer<Object> {
        public a() {
            super(String.class, false);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
        public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeFieldName((String) obj);
        }
    }

    public static class e extends StdSerializer<Object> {
        protected final ahx d;

        protected e(Class<?> cls, ahx ahxVar) {
            super(cls, false);
            this.d = ahxVar;
        }

        public static e a(Class<?> cls, ahx ahxVar) {
            return new e(cls, ahxVar);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.JsonSerializer
        public void serialize(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (serializerProvider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
                jsonGenerator.writeFieldName(obj.toString());
                return;
            }
            Enum<?> r2 = (Enum) obj;
            if (serializerProvider.isEnabled(SerializationFeature.WRITE_ENUM_KEYS_USING_INDEX)) {
                jsonGenerator.writeFieldName(String.valueOf(r2.ordinal()));
            } else {
                jsonGenerator.writeFieldName(this.d.b(r2));
            }
        }
    }
}
