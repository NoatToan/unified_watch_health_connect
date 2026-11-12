package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.impl.a;
import com.fasterxml.jackson.databind.util.EnumValues;
import defpackage.eud;
import defpackage.h04;
import defpackage.ksd;
import defpackage.wwl;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public abstract class StdKeySerializers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eud<Object> f7714a = new StdKeySerializer();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final eud<Object> f7715b = new StringKeySerializer();

    public static class Default extends StdSerializer<Object> {
        static final int TYPE_BYTE_ARRAY = 7;
        static final int TYPE_CALENDAR = 2;
        static final int TYPE_CLASS = 3;
        static final int TYPE_DATE = 1;
        static final int TYPE_ENUM = 4;
        static final int TYPE_INTEGER = 5;
        static final int TYPE_LONG = 6;
        static final int TYPE_TO_STRING = 8;
        protected final int _typeId;

        public Default(int i, Class<?> cls) {
            super(cls, false);
            this._typeId = i;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public void serialize(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
            String strValueOf;
            switch (this._typeId) {
                case 1:
                    wwlVar.defaultSerializeDateKey((Date) obj, jsonGenerator);
                    break;
                case 2:
                    wwlVar.defaultSerializeDateKey(((Calendar) obj).getTimeInMillis(), jsonGenerator);
                    break;
                case 3:
                    jsonGenerator.r0(((Class) obj).getName());
                    break;
                case 4:
                    if (wwlVar.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
                        strValueOf = obj.toString();
                    } else {
                        Enum r3 = (Enum) obj;
                        strValueOf = wwlVar.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX) ? String.valueOf(r3.ordinal()) : r3.name();
                    }
                    jsonGenerator.r0(strValueOf);
                    break;
                case 5:
                case 6:
                    jsonGenerator.n0(((Number) obj).longValue());
                    break;
                case 7:
                    jsonGenerator.r0(wwlVar.getConfig().getBase64Variant().encode((byte[]) obj));
                    break;
                default:
                    jsonGenerator.r0(obj.toString());
                    break;
            }
        }
    }

    public static class Dynamic extends StdSerializer<Object> {
        protected transient a _dynamicSerializers;

        public Dynamic() {
            super(String.class, false);
            this._dynamicSerializers = a.a();
        }

        public eud<Object> _findAndAddDynamic(a aVar, Class<?> cls, wwl wwlVar) throws JsonMappingException {
            if (cls == Object.class) {
                Default r4 = new Default(8, cls);
                this._dynamicSerializers = aVar.h(cls, r4);
                return r4;
            }
            a.d dVarC = aVar.c(cls, wwlVar, null);
            a aVar2 = dVarC.f7701b;
            if (aVar != aVar2) {
                this._dynamicSerializers = aVar2;
            }
            return dVarC.f7700a;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
            visitStringFormat(ksdVar, javaType);
        }

        public Object readResolve() {
            this._dynamicSerializers = a.a();
            return this;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public void serialize(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
            Class<?> cls = obj.getClass();
            a aVar = this._dynamicSerializers;
            eud<Object> eudVarI = aVar.i(cls);
            if (eudVarI == null) {
                eudVarI = _findAndAddDynamic(aVar, cls, wwlVar);
            }
            eudVarI.serialize(obj, jsonGenerator, wwlVar);
        }
    }

    public static class EnumKeySerializer extends StdSerializer<Object> {
        protected final EnumValues _values;

        public EnumKeySerializer(Class<?> cls, EnumValues enumValues) {
            super(cls, false);
            this._values = enumValues;
        }

        public static EnumKeySerializer construct(Class<?> cls, EnumValues enumValues) {
            return new EnumKeySerializer(cls, enumValues);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public void serialize(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
            if (wwlVar.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
                jsonGenerator.r0(obj.toString());
                return;
            }
            Enum<?> r2 = (Enum) obj;
            if (wwlVar.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX)) {
                jsonGenerator.r0(String.valueOf(r2.ordinal()));
            } else {
                jsonGenerator.o0(this._values.serializedValueFor(r2));
            }
        }
    }

    public static class StringKeySerializer extends StdSerializer<Object> {
        public StringKeySerializer() {
            super(String.class, false);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public void serialize(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
            jsonGenerator.r0((String) obj);
        }
    }

    public static eud<Object> a(SerializationConfig serializationConfig, Class<?> cls) {
        if (cls != null) {
            if (cls == Enum.class) {
                return new Dynamic();
            }
            if (cls.isEnum()) {
                return EnumKeySerializer.construct(cls, EnumValues.constructFromName(serializationConfig, cls));
            }
        }
        return new Default(8, cls);
    }

    public static eud<Object> b(SerializationConfig serializationConfig, Class<?> cls, boolean z) {
        if (cls == null || cls == Object.class) {
            return new Dynamic();
        }
        if (cls == String.class) {
            return f7715b;
        }
        if (cls.isPrimitive()) {
            cls = h04.k0(cls);
        }
        if (cls == Integer.class) {
            return new Default(5, cls);
        }
        if (cls == Long.class) {
            return new Default(6, cls);
        }
        if (cls.isPrimitive() || Number.class.isAssignableFrom(cls)) {
            return new Default(8, cls);
        }
        if (cls == Class.class) {
            return new Default(3, cls);
        }
        if (Date.class.isAssignableFrom(cls)) {
            return new Default(1, cls);
        }
        if (Calendar.class.isAssignableFrom(cls)) {
            return new Default(2, cls);
        }
        if (cls == UUID.class) {
            return new Default(8, cls);
        }
        if (cls == byte[].class) {
            return new Default(7, cls);
        }
        if (z) {
            return new Default(8, cls);
        }
        return null;
    }
}
