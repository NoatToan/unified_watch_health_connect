package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import defpackage.cj4;
import defpackage.e5q;
import defpackage.eud;
import defpackage.ksd;
import defpackage.qqd;
import defpackage.wwl;
import defpackage.zsd;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class NumberSerializers {

    public static abstract class Base<T> extends StdScalarSerializer<T> implements cj4 {
        protected final boolean _isInt;
        protected final JsonParser.NumberType _numberType;
        protected final String _schemaType;

        public Base(Class<?> cls, JsonParser.NumberType numberType, String str) {
            super(cls, false);
            this._numberType = numberType;
            this._schemaType = str;
            this._isInt = numberType == JsonParser.NumberType.INT || numberType == JsonParser.NumberType.LONG || numberType == JsonParser.NumberType.BIG_INTEGER;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
            if (this._isInt) {
                visitIntFormat(ksdVar, javaType, this._numberType);
            } else {
                visitFloatFormat(ksdVar, javaType, this._numberType);
            }
        }

        @Override // defpackage.cj4
        public eud<?> createContextual(wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
            JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(wwlVar, beanProperty, handledType());
            return (valueFindFormatOverrides == null || a.f7711a[valueFindFormatOverrides.getShape().ordinal()] != 1) ? this : ToStringSerializer.instance;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
        public zsd getSchema(wwl wwlVar, Type type) {
            return createSchemaNode(this._schemaType, true);
        }
    }

    @qqd
    public static final class DoubleSerializer extends Base<Object> {
        public DoubleSerializer(Class<?> cls) {
            super(cls, JsonParser.NumberType.DOUBLE, RealNameWebViewActivity.NUMBER);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.NumberSerializers.Base, com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public /* bridge */ /* synthetic */ void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
            super.acceptJsonFormatVisitor(ksdVar, javaType);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.NumberSerializers.Base, defpackage.cj4
        public /* bridge */ /* synthetic */ eud createContextual(wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
            return super.createContextual(wwlVar, beanProperty);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.NumberSerializers.Base, com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
        public /* bridge */ /* synthetic */ zsd getSchema(wwl wwlVar, Type type) {
            return super.getSchema(wwlVar, type);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public void serialize(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
            jsonGenerator.t0(((Double) obj).doubleValue());
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, defpackage.eud
        public void serializeWithType(Object obj, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
            serialize(obj, jsonGenerator, wwlVar);
        }
    }

    @qqd
    public static final class FloatSerializer extends Base<Object> {
        static final FloatSerializer instance = new FloatSerializer();

        public FloatSerializer() {
            super(Float.class, JsonParser.NumberType.FLOAT, RealNameWebViewActivity.NUMBER);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.NumberSerializers.Base, com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public /* bridge */ /* synthetic */ void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
            super.acceptJsonFormatVisitor(ksdVar, javaType);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.NumberSerializers.Base, defpackage.cj4
        public /* bridge */ /* synthetic */ eud createContextual(wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
            return super.createContextual(wwlVar, beanProperty);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.NumberSerializers.Base, com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
        public /* bridge */ /* synthetic */ zsd getSchema(wwl wwlVar, Type type) {
            return super.getSchema(wwlVar, type);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public void serialize(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
            jsonGenerator.u0(((Float) obj).floatValue());
        }
    }

    @qqd
    public static final class IntLikeSerializer extends Base<Object> {
        static final IntLikeSerializer instance = new IntLikeSerializer();

        public IntLikeSerializer() {
            super(Number.class, JsonParser.NumberType.INT, "integer");
        }

        @Override // com.fasterxml.jackson.databind.ser.std.NumberSerializers.Base, com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public /* bridge */ /* synthetic */ void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
            super.acceptJsonFormatVisitor(ksdVar, javaType);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.NumberSerializers.Base, defpackage.cj4
        public /* bridge */ /* synthetic */ eud createContextual(wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
            return super.createContextual(wwlVar, beanProperty);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.NumberSerializers.Base, com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
        public /* bridge */ /* synthetic */ zsd getSchema(wwl wwlVar, Type type) {
            return super.getSchema(wwlVar, type);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public void serialize(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
            jsonGenerator.v0(((Number) obj).intValue());
        }
    }

    @qqd
    public static final class IntegerSerializer extends Base<Object> {
        public IntegerSerializer(Class<?> cls) {
            super(cls, JsonParser.NumberType.INT, "integer");
        }

        @Override // com.fasterxml.jackson.databind.ser.std.NumberSerializers.Base, com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public /* bridge */ /* synthetic */ void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
            super.acceptJsonFormatVisitor(ksdVar, javaType);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.NumberSerializers.Base, defpackage.cj4
        public /* bridge */ /* synthetic */ eud createContextual(wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
            return super.createContextual(wwlVar, beanProperty);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.NumberSerializers.Base, com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
        public /* bridge */ /* synthetic */ zsd getSchema(wwl wwlVar, Type type) {
            return super.getSchema(wwlVar, type);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public void serialize(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
            jsonGenerator.v0(((Integer) obj).intValue());
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, defpackage.eud
        public void serializeWithType(Object obj, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
            serialize(obj, jsonGenerator, wwlVar);
        }
    }

    @qqd
    public static final class LongSerializer extends Base<Object> {
        public LongSerializer(Class<?> cls) {
            super(cls, JsonParser.NumberType.LONG, RealNameWebViewActivity.NUMBER);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.NumberSerializers.Base, com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public /* bridge */ /* synthetic */ void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
            super.acceptJsonFormatVisitor(ksdVar, javaType);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.NumberSerializers.Base, defpackage.cj4
        public /* bridge */ /* synthetic */ eud createContextual(wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
            return super.createContextual(wwlVar, beanProperty);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.NumberSerializers.Base, com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
        public /* bridge */ /* synthetic */ zsd getSchema(wwl wwlVar, Type type) {
            return super.getSchema(wwlVar, type);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public void serialize(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
            jsonGenerator.w0(((Long) obj).longValue());
        }
    }

    @qqd
    public static final class ShortSerializer extends Base<Object> {
        static final ShortSerializer instance = new ShortSerializer();

        public ShortSerializer() {
            super(Short.class, JsonParser.NumberType.INT, RealNameWebViewActivity.NUMBER);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.NumberSerializers.Base, com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public /* bridge */ /* synthetic */ void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
            super.acceptJsonFormatVisitor(ksdVar, javaType);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.NumberSerializers.Base, defpackage.cj4
        public /* bridge */ /* synthetic */ eud createContextual(wwl wwlVar, BeanProperty beanProperty) throws JsonMappingException {
            return super.createContextual(wwlVar, beanProperty);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.NumberSerializers.Base, com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
        public /* bridge */ /* synthetic */ zsd getSchema(wwl wwlVar, Type type) {
            return super.getSchema(wwlVar, type);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public void serialize(Object obj, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
            jsonGenerator.A0(((Short) obj).shortValue());
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7711a;

        static {
            int[] iArr = new int[JsonFormat.Shape.values().length];
            f7711a = iArr;
            try {
                iArr[JsonFormat.Shape.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static void a(Map<String, eud<?>> map) {
        map.put(Integer.class.getName(), new IntegerSerializer(Integer.class));
        Class cls = Integer.TYPE;
        map.put(cls.getName(), new IntegerSerializer(cls));
        map.put(Long.class.getName(), new LongSerializer(Long.class));
        Class cls2 = Long.TYPE;
        map.put(cls2.getName(), new LongSerializer(cls2));
        String name = Byte.class.getName();
        IntLikeSerializer intLikeSerializer = IntLikeSerializer.instance;
        map.put(name, intLikeSerializer);
        map.put(Byte.TYPE.getName(), intLikeSerializer);
        String name2 = Short.class.getName();
        ShortSerializer shortSerializer = ShortSerializer.instance;
        map.put(name2, shortSerializer);
        map.put(Short.TYPE.getName(), shortSerializer);
        map.put(Double.class.getName(), new DoubleSerializer(Double.class));
        Class cls3 = Double.TYPE;
        map.put(cls3.getName(), new DoubleSerializer(cls3));
        String name3 = Float.class.getName();
        FloatSerializer floatSerializer = FloatSerializer.instance;
        map.put(name3, floatSerializer);
        map.put(Float.TYPE.getName(), floatSerializer);
    }
}
