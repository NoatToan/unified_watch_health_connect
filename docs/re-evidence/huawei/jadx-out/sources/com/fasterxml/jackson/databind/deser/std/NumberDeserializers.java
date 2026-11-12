package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.huawei.operation.utils.Constants;
import defpackage.abf;
import defpackage.ahw;
import defpackage.xd;
import defpackage.ym;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;

/* JADX INFO: loaded from: classes21.dex */
public class NumberDeserializers {
    private static final HashSet<String> d = new HashSet<>();

    static {
        Class[] clsArr = {Boolean.class, Byte.class, Short.class, Character.class, Integer.class, Long.class, Float.class, Double.class, Number.class, BigDecimal.class, BigInteger.class};
        for (int i2 = 0; i2 < 11; i2++) {
            d.add(clsArr[i2].getName());
        }
    }

    public static JsonDeserializer<?> e(Class<?> cls, String str) {
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return h.e;
            }
            if (cls == Boolean.TYPE) {
                return a.f4132c;
            }
            if (cls == Long.TYPE) {
                return g.f4137b;
            }
            if (cls == Double.TYPE) {
                return f.f4136a;
            }
            if (cls == Character.TYPE) {
                return b.f4133a;
            }
            if (cls == Byte.TYPE) {
                return c.e;
            }
            if (cls == Short.TYPE) {
                return n.d;
            }
            if (cls == Float.TYPE) {
                return j.e;
            }
            if (cls == Void.TYPE) {
                return abf.d;
            }
        } else {
            if (!d.contains(str)) {
                return null;
            }
            if (cls == Integer.class) {
                return h.f4139a;
            }
            if (cls == Boolean.class) {
                return a.d;
            }
            if (cls == Long.class) {
                return g.f4138c;
            }
            if (cls == Double.class) {
                return f.d;
            }
            if (cls == Character.class) {
                return b.e;
            }
            if (cls == Byte.class) {
                return c.f4134a;
            }
            if (cls == Short.class) {
                return n.f4141b;
            }
            if (cls == Float.class) {
                return j.d;
            }
            if (cls == Number.class) {
                return i.f4140b;
            }
            if (cls == BigDecimal.class) {
                return d.d;
            }
            if (cls == BigInteger.class) {
                return e.f4135b;
            }
        }
        throw new IllegalArgumentException("Internal error: can't find deserializer for " + cls.getName());
    }

    protected static abstract class PrimitiveOrWrapperDeserializer<T> extends StdScalarDeserializer<T> {
        private static final long serialVersionUID = 1;
        protected final T _emptyValue;
        protected final LogicalType _logicalType;
        protected final T _nullValue;
        protected final boolean _primitive;

        protected PrimitiveOrWrapperDeserializer(Class<T> cls, LogicalType logicalType, T t, T t2) {
            super((Class<?>) cls);
            this._logicalType = logicalType;
            this._nullValue = t;
            this._emptyValue = t2;
            this._primitive = cls.isPrimitive();
        }

        @Deprecated
        protected PrimitiveOrWrapperDeserializer(Class<T> cls, T t, T t2) {
            this(cls, LogicalType.OtherScalar, t, t2);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public AccessPattern getNullAccessPattern() {
            if (this._primitive) {
                return AccessPattern.DYNAMIC;
            }
            if (this._nullValue == null) {
                return AccessPattern.ALWAYS_NULL;
            }
            return AccessPattern.CONSTANT;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public final T getNullValue(DeserializationContext deserializationContext) throws ym {
            if (this._primitive && deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
                deserializationContext.reportInputMismatch(this, "Cannot map `null` into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", ahw.b((Object) handledType()));
            }
            return this._nullValue;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Object getEmptyValue(DeserializationContext deserializationContext) throws ym {
            return this._emptyValue;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final LogicalType logicalType() {
            return this._logicalType;
        }
    }

    @JacksonStdImpl
    public static final class a extends PrimitiveOrWrapperDeserializer<Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final a f4132c = new a(Boolean.TYPE, Boolean.FALSE);
        static final a d = new a(Boolean.class, null);
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws ym {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public a(Class<Boolean> cls, Boolean bool) {
            super(cls, LogicalType.Boolean, bool, Boolean.FALSE);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
            if (jsonTokenCurrentToken == JsonToken.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (jsonTokenCurrentToken == JsonToken.VALUE_FALSE) {
                return Boolean.FALSE;
            }
            if (this._primitive) {
                return Boolean.valueOf(_parseBooleanPrimitive(jsonParser, deserializationContext));
            }
            return _parseBoolean(jsonParser, deserializationContext, this._valueClass);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
            JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
            if (jsonTokenCurrentToken == JsonToken.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (jsonTokenCurrentToken == JsonToken.VALUE_FALSE) {
                return Boolean.FALSE;
            }
            if (this._primitive) {
                return Boolean.valueOf(_parseBooleanPrimitive(jsonParser, deserializationContext));
            }
            return _parseBoolean(jsonParser, deserializationContext, this._valueClass);
        }
    }

    @JacksonStdImpl
    public static class c extends PrimitiveOrWrapperDeserializer<Byte> {
        private static final long serialVersionUID = 1;
        static final c e = new c(Byte.TYPE, (byte) 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f4134a = new c(Byte.class, null);

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws ym {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public c(Class<Byte> cls, Byte b2) {
            super(cls, LogicalType.Integer, b2, (byte) 0);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Byte deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.isExpectedNumberIntToken()) {
                return Byte.valueOf(jsonParser.getByteValue());
            }
            if (this._primitive) {
                return Byte.valueOf(_parseBytePrimitive(jsonParser, deserializationContext));
            }
            return a(jsonParser, deserializationContext);
        }

        protected Byte a(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            int iCurrentTokenId = jsonParser.currentTokenId();
            if (iCurrentTokenId == 1) {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (iCurrentTokenId == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (iCurrentTokenId == 11) {
                    return getNullValue(deserializationContext);
                }
                if (iCurrentTokenId != 6) {
                    if (iCurrentTokenId == 7) {
                        return Byte.valueOf(jsonParser.getByteValue());
                    }
                    if (iCurrentTokenId == 8) {
                        CoercionAction coercionAction_checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, this._valueClass);
                        if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsNull) {
                            return getNullValue(deserializationContext);
                        }
                        if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                            return (Byte) getEmptyValue(deserializationContext);
                        }
                        return Byte.valueOf(jsonParser.getByteValue());
                    }
                    return (Byte) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                strExtractScalarFromObject = jsonParser.getText();
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Byte) getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_checkTextualNull(deserializationContext, strTrim)) {
                return getNullValue(deserializationContext);
            }
            try {
                int iB = xd.b(strTrim);
                if (_byteOverflow(iB)) {
                    return (Byte) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "overflow, value cannot be represented as 8-bit value", new Object[0]);
                }
                return Byte.valueOf((byte) iB);
            } catch (IllegalArgumentException unused) {
                return (Byte) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid Byte value", new Object[0]);
            }
        }
    }

    @JacksonStdImpl
    public static class n extends PrimitiveOrWrapperDeserializer<Short> {
        private static final long serialVersionUID = 1;
        static final n d = new n(Short.TYPE, 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final n f4141b = new n(Short.class, null);

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws ym {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public n(Class<Short> cls, Short sh) {
            super(cls, LogicalType.Integer, sh, (short) 0);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Short deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.isExpectedNumberIntToken()) {
                return Short.valueOf(jsonParser.getShortValue());
            }
            if (this._primitive) {
                return Short.valueOf(_parseShortPrimitive(jsonParser, deserializationContext));
            }
            return e(jsonParser, deserializationContext);
        }

        protected Short e(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            int iCurrentTokenId = jsonParser.currentTokenId();
            if (iCurrentTokenId == 1) {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (iCurrentTokenId == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (iCurrentTokenId == 11) {
                    return getNullValue(deserializationContext);
                }
                if (iCurrentTokenId != 6) {
                    if (iCurrentTokenId == 7) {
                        return Short.valueOf(jsonParser.getShortValue());
                    }
                    if (iCurrentTokenId == 8) {
                        CoercionAction coercionAction_checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, this._valueClass);
                        if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsNull) {
                            return getNullValue(deserializationContext);
                        }
                        if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                            return (Short) getEmptyValue(deserializationContext);
                        }
                        return Short.valueOf(jsonParser.getShortValue());
                    }
                    return (Short) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                strExtractScalarFromObject = jsonParser.getText();
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Short) getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_checkTextualNull(deserializationContext, strTrim)) {
                return getNullValue(deserializationContext);
            }
            try {
                int iB = xd.b(strTrim);
                if (_shortOverflow(iB)) {
                    return (Short) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "overflow, value cannot be represented as 16-bit value", new Object[0]);
                }
                return Short.valueOf((short) iB);
            } catch (IllegalArgumentException unused) {
                return (Short) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid Short value", new Object[0]);
            }
        }
    }

    @JacksonStdImpl
    public static class b extends PrimitiveOrWrapperDeserializer<Character> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f4133a = new b(Character.TYPE, 0);
        static final b e = new b(Character.class, null);
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws ym {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public b(Class<Character> cls, Character ch) {
            super(cls, LogicalType.Integer, ch, (char) 0);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Character deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            int iCurrentTokenId = jsonParser.currentTokenId();
            if (iCurrentTokenId == 1) {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (iCurrentTokenId == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (iCurrentTokenId == 11) {
                    if (this._primitive) {
                        _verifyNullForPrimitive(deserializationContext);
                    }
                    return getNullValue(deserializationContext);
                }
                if (iCurrentTokenId != 6) {
                    if (iCurrentTokenId == 7) {
                        CoercionAction coercionActionFindCoercionAction = deserializationContext.findCoercionAction(logicalType(), this._valueClass, CoercionInputShape.Integer);
                        int i = AnonymousClass1.f4131c[coercionActionFindCoercionAction.ordinal()];
                        if (i == 1) {
                            _checkCoercionFail(deserializationContext, coercionActionFindCoercionAction, this._valueClass, jsonParser.getNumberValue(), "Integer value (" + jsonParser.getText() + Constants.RIGHT_BRACKET_ONLY);
                        } else if (i != 2) {
                            if (i == 3) {
                                return (Character) getEmptyValue(deserializationContext);
                            }
                            int intValue = jsonParser.getIntValue();
                            if (intValue >= 0 && intValue <= 65535) {
                                return Character.valueOf((char) intValue);
                            }
                            return (Character) deserializationContext.handleWeirdNumberValue(handledType(), Integer.valueOf(intValue), "value outside valid Character range (0x0000 - 0xFFFF)", new Object[0]);
                        }
                        return getNullValue(deserializationContext);
                    }
                    return (Character) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                strExtractScalarFromObject = jsonParser.getText();
            }
            if (strExtractScalarFromObject.length() == 1) {
                return Character.valueOf(strExtractScalarFromObject.charAt(0));
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Character) getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_checkTextualNull(deserializationContext, strTrim)) {
                return getNullValue(deserializationContext);
            }
            return (Character) deserializationContext.handleWeirdStringValue(handledType(), strTrim, "Expected either Integer value code or 1-character String", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f4131c;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            f4131c = iArr;
            try {
                iArr[CoercionAction.Fail.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4131c[CoercionAction.AsNull.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4131c[CoercionAction.AsEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @JacksonStdImpl
    public static final class h extends PrimitiveOrWrapperDeserializer<Integer> {
        private static final long serialVersionUID = 1;
        static final h e = new h(Integer.TYPE, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final h f4139a = new h(Integer.class, null);

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public boolean isCachable() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws ym {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public h(Class<Integer> cls, Integer num) {
            super(cls, LogicalType.Integer, num, 0);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.isExpectedNumberIntToken()) {
                return Integer.valueOf(jsonParser.getIntValue());
            }
            if (this._primitive) {
                return Integer.valueOf(_parseIntPrimitive(jsonParser, deserializationContext));
            }
            return _parseInteger(jsonParser, deserializationContext, Integer.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
            if (jsonParser.isExpectedNumberIntToken()) {
                return Integer.valueOf(jsonParser.getIntValue());
            }
            if (this._primitive) {
                return Integer.valueOf(_parseIntPrimitive(jsonParser, deserializationContext));
            }
            return _parseInteger(jsonParser, deserializationContext, Integer.class);
        }
    }

    @JacksonStdImpl
    public static final class g extends PrimitiveOrWrapperDeserializer<Long> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final g f4137b = new g(Long.TYPE, 0L);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final g f4138c = new g(Long.class, null);
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public boolean isCachable() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws ym {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public g(Class<Long> cls, Long l) {
            super(cls, LogicalType.Integer, l, 0L);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Long deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.isExpectedNumberIntToken()) {
                return Long.valueOf(jsonParser.getLongValue());
            }
            if (this._primitive) {
                return Long.valueOf(_parseLongPrimitive(jsonParser, deserializationContext));
            }
            return _parseLong(jsonParser, deserializationContext, Long.class);
        }
    }

    @JacksonStdImpl
    public static class j extends PrimitiveOrWrapperDeserializer<Float> {
        private static final long serialVersionUID = 1;
        static final j e = new j(Float.TYPE, Float.valueOf(0.0f));
        static final j d = new j(Float.class, null);

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws ym {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public j(Class<Float> cls, Float f) {
            super(cls, LogicalType.Float, f, Float.valueOf(0.0f));
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Float deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.hasToken(JsonToken.VALUE_NUMBER_FLOAT)) {
                return Float.valueOf(jsonParser.getFloatValue());
            }
            if (this._primitive) {
                return Float.valueOf(_parseFloatPrimitive(jsonParser, deserializationContext));
            }
            return a(jsonParser, deserializationContext);
        }

        protected final Float a(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            int iCurrentTokenId = jsonParser.currentTokenId();
            if (iCurrentTokenId == 1) {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (iCurrentTokenId == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (iCurrentTokenId == 11) {
                    return getNullValue(deserializationContext);
                }
                if (iCurrentTokenId != 6) {
                    if (iCurrentTokenId == 7 || iCurrentTokenId == 8) {
                        return Float.valueOf(jsonParser.getFloatValue());
                    }
                    return (Float) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                strExtractScalarFromObject = jsonParser.getText();
            }
            Float f_checkFloatSpecialValue = _checkFloatSpecialValue(strExtractScalarFromObject);
            if (f_checkFloatSpecialValue != null) {
                return f_checkFloatSpecialValue;
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Float) getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_checkTextualNull(deserializationContext, strTrim)) {
                return getNullValue(deserializationContext);
            }
            try {
                return Float.valueOf(Float.parseFloat(strTrim));
            } catch (IllegalArgumentException unused) {
                return (Float) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid `Float` value", new Object[0]);
            }
        }
    }

    @JacksonStdImpl
    public static class f extends PrimitiveOrWrapperDeserializer<Double> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final f f4136a = new f(Double.TYPE, Double.valueOf(0.0d));
        static final f d = new f(Double.class, null);
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws ym {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        public f(Class<Double> cls, Double d2) {
            super(cls, LogicalType.Float, d2, Double.valueOf(0.0d));
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Double deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.hasToken(JsonToken.VALUE_NUMBER_FLOAT)) {
                return Double.valueOf(jsonParser.getDoubleValue());
            }
            if (this._primitive) {
                return Double.valueOf(_parseDoublePrimitive(jsonParser, deserializationContext));
            }
            return d(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Double deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
            if (jsonParser.hasToken(JsonToken.VALUE_NUMBER_FLOAT)) {
                return Double.valueOf(jsonParser.getDoubleValue());
            }
            if (this._primitive) {
                return Double.valueOf(_parseDoublePrimitive(jsonParser, deserializationContext));
            }
            return d(jsonParser, deserializationContext);
        }

        protected final Double d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            int iCurrentTokenId = jsonParser.currentTokenId();
            if (iCurrentTokenId == 1) {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (iCurrentTokenId == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (iCurrentTokenId == 11) {
                    return getNullValue(deserializationContext);
                }
                if (iCurrentTokenId != 6) {
                    if (iCurrentTokenId == 7 || iCurrentTokenId == 8) {
                        return Double.valueOf(jsonParser.getDoubleValue());
                    }
                    return (Double) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                strExtractScalarFromObject = jsonParser.getText();
            }
            Double d_checkDoubleSpecialValue = _checkDoubleSpecialValue(strExtractScalarFromObject);
            if (d_checkDoubleSpecialValue != null) {
                return d_checkDoubleSpecialValue;
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (Double) getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_checkTextualNull(deserializationContext, strTrim)) {
                return getNullValue(deserializationContext);
            }
            try {
                return Double.valueOf(_parseDouble(strTrim));
            } catch (IllegalArgumentException unused) {
                return (Double) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid `Double` value", new Object[0]);
            }
        }
    }

    @JacksonStdImpl
    public static class i extends StdScalarDeserializer<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f4140b = new i();

        public i() {
            super((Class<?>) Number.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final LogicalType logicalType() {
            return LogicalType.Integer;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            int iCurrentTokenId = jsonParser.currentTokenId();
            if (iCurrentTokenId == 1) {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (iCurrentTokenId == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (iCurrentTokenId != 6) {
                    if (iCurrentTokenId == 7) {
                        if (deserializationContext.hasSomeOfFeatures(F_MASK_INT_COERCIONS)) {
                            return _coerceIntegral(jsonParser, deserializationContext);
                        }
                        return jsonParser.getNumberValue();
                    }
                    if (iCurrentTokenId == 8) {
                        if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) && !jsonParser.isNaN()) {
                            return jsonParser.getDecimalValue();
                        }
                        return jsonParser.getNumberValue();
                    }
                    return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                strExtractScalarFromObject = jsonParser.getText();
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_hasTextualNull(strTrim)) {
                return getNullValue(deserializationContext);
            }
            if (_isPosInf(strTrim)) {
                return Double.valueOf(Double.POSITIVE_INFINITY);
            }
            if (_isNegInf(strTrim)) {
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            }
            if (_isNaN(strTrim)) {
                return Double.valueOf(Double.NaN);
            }
            try {
                if (!_isIntNumber(strTrim)) {
                    if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                        return new BigDecimal(strTrim);
                    }
                    return Double.valueOf(strTrim);
                }
                if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
                    return new BigInteger(strTrim);
                }
                long j = Long.parseLong(strTrim);
                if (!deserializationContext.isEnabled(DeserializationFeature.USE_LONG_FOR_INTS) && j <= 2147483647L && j >= -2147483648L) {
                    return Integer.valueOf((int) j);
                }
                return Long.valueOf(j);
            } catch (IllegalArgumentException unused) {
                return deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid number", new Object[0]);
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
            int iCurrentTokenId = jsonParser.currentTokenId();
            if (iCurrentTokenId == 6 || iCurrentTokenId == 7 || iCurrentTokenId == 8) {
                return deserialize(jsonParser, deserializationContext);
            }
            return typeDeserializer.deserializeTypedFromScalar(jsonParser, deserializationContext);
        }
    }

    @JacksonStdImpl
    public static class e extends StdScalarDeserializer<BigInteger> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f4135b = new e();

        public e() {
            super((Class<?>) BigInteger.class);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return BigInteger.ZERO;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final LogicalType logicalType() {
            return LogicalType.Integer;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BigInteger deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            if (jsonParser.isExpectedNumberIntToken()) {
                return jsonParser.getBigIntegerValue();
            }
            int iCurrentTokenId = jsonParser.currentTokenId();
            if (iCurrentTokenId == 1) {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (iCurrentTokenId == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (iCurrentTokenId != 6) {
                    if (iCurrentTokenId == 8) {
                        CoercionAction coercionAction_checkFloatToIntCoercion = _checkFloatToIntCoercion(jsonParser, deserializationContext, this._valueClass);
                        if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsNull) {
                            return getNullValue(deserializationContext);
                        }
                        if (coercionAction_checkFloatToIntCoercion == CoercionAction.AsEmpty) {
                            return (BigInteger) getEmptyValue(deserializationContext);
                        }
                        return jsonParser.getDecimalValue().toBigInteger();
                    }
                    return (BigInteger) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                strExtractScalarFromObject = jsonParser.getText();
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (BigInteger) getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_hasTextualNull(strTrim)) {
                return getNullValue(deserializationContext);
            }
            try {
                return new BigInteger(strTrim);
            } catch (IllegalArgumentException unused) {
                return (BigInteger) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid representation", new Object[0]);
            }
        }
    }

    @JacksonStdImpl
    public static class d extends StdScalarDeserializer<BigDecimal> {
        public static final d d = new d();

        public d() {
            super((Class<?>) BigDecimal.class);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return BigDecimal.ZERO;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
        public final LogicalType logicalType() {
            return LogicalType.Float;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public BigDecimal deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strExtractScalarFromObject;
            int iCurrentTokenId = jsonParser.currentTokenId();
            if (iCurrentTokenId == 1) {
                strExtractScalarFromObject = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
            } else {
                if (iCurrentTokenId == 3) {
                    return _deserializeFromArray(jsonParser, deserializationContext);
                }
                if (iCurrentTokenId != 6) {
                    if (iCurrentTokenId == 7 || iCurrentTokenId == 8) {
                        return jsonParser.getDecimalValue();
                    }
                    return (BigDecimal) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                strExtractScalarFromObject = jsonParser.getText();
            }
            CoercionAction coercionAction_checkFromStringCoercion = _checkFromStringCoercion(deserializationContext, strExtractScalarFromObject);
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsNull) {
                return getNullValue(deserializationContext);
            }
            if (coercionAction_checkFromStringCoercion == CoercionAction.AsEmpty) {
                return (BigDecimal) getEmptyValue(deserializationContext);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (_hasTextualNull(strTrim)) {
                return getNullValue(deserializationContext);
            }
            try {
                return new BigDecimal(strTrim);
            } catch (IllegalArgumentException unused) {
                return (BigDecimal) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid representation", new Object[0]);
            }
        }
    }
}
