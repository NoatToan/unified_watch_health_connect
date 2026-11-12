package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import defpackage.c4h;
import defpackage.e5q;
import defpackage.eud;
import defpackage.ksd;
import defpackage.qqd;
import defpackage.wwl;
import defpackage.zsd;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class StdArraySerializers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap<String, eud<?>> f7713a;

    @qqd
    public static class BooleanArraySerializer extends ArraySerializerBase<boolean[]> {
        private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Boolean.class);

        public BooleanArraySerializer() {
            super(boolean[].class);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public eud<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new BooleanArraySerializer(this, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public ContainerSerializer<?> _withValueTypeSerializer(e5q e5qVar) {
            return this;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
            visitArrayFormat(ksdVar, javaType, JsonFormatTypes.BOOLEAN);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public eud<?> getContentSerializer() {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public JavaType getContentType() {
            return VALUE_TYPE;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
        public zsd getSchema(wwl wwlVar, Type type) {
            c4h c4hVarCreateSchemaNode = createSchemaNode("array", true);
            c4hVarCreateSchemaNode.q0("items", createSchemaNode("boolean"));
            return c4hVarCreateSchemaNode;
        }

        public BooleanArraySerializer(BooleanArraySerializer booleanArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(booleanArraySerializer, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public boolean hasSingleElement(boolean[] zArr) {
            return zArr.length == 1;
        }

        @Override // defpackage.eud
        public boolean isEmpty(wwl wwlVar, boolean[] zArr) {
            return zArr.length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public final void serialize(boolean[] zArr, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
            int length = zArr.length;
            if (length == 1 && _shouldUnwrapSingle(wwlVar)) {
                serializeContents(zArr, jsonGenerator, wwlVar);
                return;
            }
            jsonGenerator.M0(length);
            jsonGenerator.M(zArr);
            serializeContents(zArr, jsonGenerator, wwlVar);
            jsonGenerator.i0();
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public void serializeContents(boolean[] zArr, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
            for (boolean z : zArr) {
                jsonGenerator.f0(z);
            }
        }
    }

    @qqd
    public static class CharArraySerializer extends StdSerializer<char[]> {
        public CharArraySerializer() {
            super(char[].class);
        }

        private final void _writeArrayContents(JsonGenerator jsonGenerator, char[] cArr) throws IOException {
            int length = cArr.length;
            for (int i = 0; i < length; i++) {
                jsonGenerator.R0(cArr, i, 1);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
            visitArrayFormat(ksdVar, javaType, JsonFormatTypes.STRING);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
        public zsd getSchema(wwl wwlVar, Type type) {
            c4h c4hVarCreateSchemaNode = createSchemaNode("array", true);
            c4h c4hVarCreateSchemaNode2 = createSchemaNode("string");
            c4hVarCreateSchemaNode2.j0("type", "string");
            return c4hVarCreateSchemaNode.q0("items", c4hVarCreateSchemaNode2);
        }

        @Override // defpackage.eud
        public boolean isEmpty(wwl wwlVar, char[] cArr) {
            return cArr.length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public void serialize(char[] cArr, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
            if (!wwlVar.isEnabled(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                jsonGenerator.R0(cArr, 0, cArr.length);
                return;
            }
            jsonGenerator.M0(cArr.length);
            jsonGenerator.M(cArr);
            _writeArrayContents(jsonGenerator, cArr);
            jsonGenerator.i0();
        }

        @Override // defpackage.eud
        public void serializeWithType(char[] cArr, JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
            WritableTypeId writableTypeIdG;
            if (wwlVar.isEnabled(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                writableTypeIdG = e5qVar.g(jsonGenerator, e5qVar.d(cArr, JsonToken.START_ARRAY));
                _writeArrayContents(jsonGenerator, cArr);
            } else {
                writableTypeIdG = e5qVar.g(jsonGenerator, e5qVar.d(cArr, JsonToken.VALUE_STRING));
                jsonGenerator.R0(cArr, 0, cArr.length);
            }
            e5qVar.h(jsonGenerator, writableTypeIdG);
        }
    }

    @qqd
    public static class DoubleArraySerializer extends ArraySerializerBase<double[]> {
        private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Double.TYPE);

        public DoubleArraySerializer() {
            super(double[].class);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public eud<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new DoubleArraySerializer(this, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public ContainerSerializer<?> _withValueTypeSerializer(e5q e5qVar) {
            return this;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
            visitArrayFormat(ksdVar, javaType, JsonFormatTypes.NUMBER);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public eud<?> getContentSerializer() {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public JavaType getContentType() {
            return VALUE_TYPE;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
        public zsd getSchema(wwl wwlVar, Type type) {
            return createSchemaNode("array", true).q0("items", createSchemaNode(RealNameWebViewActivity.NUMBER));
        }

        public DoubleArraySerializer(DoubleArraySerializer doubleArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(doubleArraySerializer, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public boolean hasSingleElement(double[] dArr) {
            return dArr.length == 1;
        }

        @Override // defpackage.eud
        public boolean isEmpty(wwl wwlVar, double[] dArr) {
            return dArr.length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public final void serialize(double[] dArr, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
            if (dArr.length == 1 && _shouldUnwrapSingle(wwlVar)) {
                serializeContents(dArr, jsonGenerator, wwlVar);
            } else {
                jsonGenerator.M(dArr);
                jsonGenerator.R(dArr, 0, dArr.length);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public void serializeContents(double[] dArr, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
            for (double d : dArr) {
                jsonGenerator.t0(d);
            }
        }
    }

    @qqd
    public static class FloatArraySerializer extends TypedPrimitiveArraySerializer<float[]> {
        private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Float.TYPE);

        public FloatArraySerializer() {
            super(float[].class);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public eud<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new FloatArraySerializer(this, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
            visitArrayFormat(ksdVar, javaType, JsonFormatTypes.NUMBER);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public eud<?> getContentSerializer() {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public JavaType getContentType() {
            return VALUE_TYPE;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
        public zsd getSchema(wwl wwlVar, Type type) {
            return createSchemaNode("array", true).q0("items", createSchemaNode(RealNameWebViewActivity.NUMBER));
        }

        public FloatArraySerializer(FloatArraySerializer floatArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(floatArraySerializer, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public boolean hasSingleElement(float[] fArr) {
            return fArr.length == 1;
        }

        @Override // defpackage.eud
        public boolean isEmpty(wwl wwlVar, float[] fArr) {
            return fArr.length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public final void serialize(float[] fArr, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
            int length = fArr.length;
            if (length == 1 && _shouldUnwrapSingle(wwlVar)) {
                serializeContents(fArr, jsonGenerator, wwlVar);
                return;
            }
            jsonGenerator.M0(length);
            jsonGenerator.M(fArr);
            serializeContents(fArr, jsonGenerator, wwlVar);
            jsonGenerator.i0();
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public void serializeContents(float[] fArr, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
            for (float f : fArr) {
                jsonGenerator.u0(f);
            }
        }
    }

    @qqd
    public static class IntArraySerializer extends ArraySerializerBase<int[]> {
        private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Integer.TYPE);

        public IntArraySerializer() {
            super(int[].class);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public eud<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new IntArraySerializer(this, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public ContainerSerializer<?> _withValueTypeSerializer(e5q e5qVar) {
            return this;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
            visitArrayFormat(ksdVar, javaType, JsonFormatTypes.INTEGER);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public eud<?> getContentSerializer() {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public JavaType getContentType() {
            return VALUE_TYPE;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
        public zsd getSchema(wwl wwlVar, Type type) {
            return createSchemaNode("array", true).q0("items", createSchemaNode("integer"));
        }

        public IntArraySerializer(IntArraySerializer intArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(intArraySerializer, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public boolean hasSingleElement(int[] iArr) {
            return iArr.length == 1;
        }

        @Override // defpackage.eud
        public boolean isEmpty(wwl wwlVar, int[] iArr) {
            return iArr.length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public final void serialize(int[] iArr, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
            if (iArr.length == 1 && _shouldUnwrapSingle(wwlVar)) {
                serializeContents(iArr, jsonGenerator, wwlVar);
            } else {
                jsonGenerator.M(iArr);
                jsonGenerator.S(iArr, 0, iArr.length);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public void serializeContents(int[] iArr, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
            for (int i : iArr) {
                jsonGenerator.v0(i);
            }
        }
    }

    @qqd
    public static class LongArraySerializer extends TypedPrimitiveArraySerializer<long[]> {
        private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Long.TYPE);

        public LongArraySerializer() {
            super(long[].class);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public eud<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new LongArraySerializer(this, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
            visitArrayFormat(ksdVar, javaType, JsonFormatTypes.NUMBER);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public eud<?> getContentSerializer() {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public JavaType getContentType() {
            return VALUE_TYPE;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
        public zsd getSchema(wwl wwlVar, Type type) {
            return createSchemaNode("array", true).q0("items", createSchemaNode(RealNameWebViewActivity.NUMBER, true));
        }

        public LongArraySerializer(LongArraySerializer longArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(longArraySerializer, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public boolean hasSingleElement(long[] jArr) {
            return jArr.length == 1;
        }

        @Override // defpackage.eud
        public boolean isEmpty(wwl wwlVar, long[] jArr) {
            return jArr.length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public final void serialize(long[] jArr, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
            if (jArr.length == 1 && _shouldUnwrapSingle(wwlVar)) {
                serializeContents(jArr, jsonGenerator, wwlVar);
            } else {
                jsonGenerator.M(jArr);
                jsonGenerator.T(jArr, 0, jArr.length);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public void serializeContents(long[] jArr, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
            for (long j : jArr) {
                jsonGenerator.w0(j);
            }
        }
    }

    @qqd
    public static class ShortArraySerializer extends TypedPrimitiveArraySerializer<short[]> {
        private static final JavaType VALUE_TYPE = TypeFactory.defaultInstance().uncheckedSimpleType(Short.TYPE);

        public ShortArraySerializer() {
            super(short[].class);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public eud<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new ShortArraySerializer(this, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public void acceptJsonFormatVisitor(ksd ksdVar, JavaType javaType) throws JsonMappingException {
            visitArrayFormat(ksdVar, javaType, JsonFormatTypes.INTEGER);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public eud<?> getContentSerializer() {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public JavaType getContentType() {
            return VALUE_TYPE;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.rfl
        public zsd getSchema(wwl wwlVar, Type type) {
            return createSchemaNode("array", true).q0("items", createSchemaNode("integer"));
        }

        public ShortArraySerializer(ShortArraySerializer shortArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(shortArraySerializer, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public boolean hasSingleElement(short[] sArr) {
            return sArr.length == 1;
        }

        @Override // defpackage.eud
        public boolean isEmpty(wwl wwlVar, short[] sArr) {
            return sArr.length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, defpackage.eud
        public final void serialize(short[] sArr, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
            int length = sArr.length;
            if (length == 1 && _shouldUnwrapSingle(wwlVar)) {
                serializeContents(sArr, jsonGenerator, wwlVar);
                return;
            }
            jsonGenerator.M0(length);
            jsonGenerator.M(sArr);
            serializeContents(sArr, jsonGenerator, wwlVar);
            jsonGenerator.i0();
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public void serializeContents(short[] sArr, JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
            for (short s : sArr) {
                jsonGenerator.v0(s);
            }
        }
    }

    public static abstract class TypedPrimitiveArraySerializer<T> extends ArraySerializerBase<T> {
        public TypedPrimitiveArraySerializer(Class<T> cls) {
            super(cls);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public final ContainerSerializer<?> _withValueTypeSerializer(e5q e5qVar) {
            return this;
        }

        public TypedPrimitiveArraySerializer(TypedPrimitiveArraySerializer<T> typedPrimitiveArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(typedPrimitiveArraySerializer, beanProperty, bool);
        }
    }

    static {
        HashMap<String, eud<?>> map = new HashMap<>();
        f7713a = map;
        map.put(boolean[].class.getName(), new BooleanArraySerializer());
        map.put(byte[].class.getName(), new ByteArraySerializer());
        map.put(char[].class.getName(), new CharArraySerializer());
        map.put(short[].class.getName(), new ShortArraySerializer());
        map.put(int[].class.getName(), new IntArraySerializer());
        map.put(long[].class.getName(), new LongArraySerializer());
        map.put(float[].class.getName(), new FloatArraySerializer());
        map.put(double[].class.getName(), new DoubleArraySerializer());
    }

    public static eud<?> a(Class<?> cls) {
        return f7713a.get(cls.getName());
    }
}
