package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.util.AccessPattern;
import defpackage.esd;
import defpackage.n2h;
import defpackage.q4q;
import defpackage.qqd;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public class NumberDeserializers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet<String> f7654a = new HashSet<>();

    @qqd
    public static class BigDecimalDeserializer extends StdScalarDeserializer<BigDecimal> {
        public static final BigDecimalDeserializer instance = new BigDecimalDeserializer();

        public BigDecimalDeserializer() {
            super((Class<?>) BigDecimal.class);
        }

        @Override // defpackage.esd
        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return BigDecimal.ZERO;
        }

        @Override // defpackage.esd
        public BigDecimal deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            int iM = jsonParser.M();
            if (iM == 3) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (iM != 6) {
                return (iM == 7 || iM == 8) ? jsonParser.N() : (BigDecimal) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            String strTrim = jsonParser.d0().trim();
            if (_isEmptyOrTextualNull(strTrim)) {
                _verifyNullForScalarCoercion(deserializationContext, strTrim);
                return getNullValue(deserializationContext);
            }
            _verifyStringForScalarCoercion(deserializationContext, strTrim);
            try {
                return new BigDecimal(strTrim);
            } catch (IllegalArgumentException unused) {
                return (BigDecimal) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid representation", new Object[0]);
            }
        }
    }

    @qqd
    public static class BigIntegerDeserializer extends StdScalarDeserializer<BigInteger> {
        public static final BigIntegerDeserializer instance = new BigIntegerDeserializer();

        public BigIntegerDeserializer() {
            super((Class<?>) BigInteger.class);
        }

        @Override // defpackage.esd
        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return BigInteger.ZERO;
        }

        @Override // defpackage.esd
        public BigInteger deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            int iM = jsonParser.M();
            if (iM == 3) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (iM == 6) {
                String strTrim = jsonParser.d0().trim();
                if (_isEmptyOrTextualNull(strTrim)) {
                    _verifyNullForScalarCoercion(deserializationContext, strTrim);
                    return getNullValue(deserializationContext);
                }
                _verifyStringForScalarCoercion(deserializationContext, strTrim);
                try {
                    return new BigInteger(strTrim);
                } catch (IllegalArgumentException unused) {
                    return (BigInteger) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid representation", new Object[0]);
                }
            }
            if (iM == 7) {
                int i = a.f7655a[jsonParser.T().ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    return jsonParser.o();
                }
            } else if (iM == 8) {
                if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                    _failDoubleToIntCoercion(jsonParser, deserializationContext, "java.math.BigInteger");
                }
                return jsonParser.N().toBigInteger();
            }
            return (BigInteger) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }
    }

    @qqd
    public static final class BooleanDeserializer extends PrimitiveOrWrapperDeserializer<Boolean> {
        private static final long serialVersionUID = 1;
        static final BooleanDeserializer primitiveInstance = new BooleanDeserializer(Boolean.TYPE, Boolean.FALSE);
        static final BooleanDeserializer wrapperInstance = new BooleanDeserializer(Boolean.class, null);

        public BooleanDeserializer(Class<Boolean> cls, Boolean bool) {
            super(cls, bool, Boolean.FALSE);
        }

        public final Boolean _parseBoolean(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            JsonToken jsonTokenK = jsonParser.K();
            if (jsonTokenK == JsonToken.VALUE_NULL) {
                return (Boolean) _coerceNullToken(deserializationContext, this._primitive);
            }
            if (jsonTokenK == JsonToken.START_ARRAY) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (jsonTokenK == JsonToken.VALUE_NUMBER_INT) {
                return Boolean.valueOf(_parseBooleanFromInt(jsonParser, deserializationContext));
            }
            if (jsonTokenK != JsonToken.VALUE_STRING) {
                if (jsonTokenK == JsonToken.VALUE_TRUE) {
                    return Boolean.TRUE;
                }
                return jsonTokenK == JsonToken.VALUE_FALSE ? Boolean.FALSE : (Boolean) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            String strTrim = jsonParser.d0().trim();
            if ("true".equals(strTrim) || "True".equals(strTrim)) {
                _verifyStringForScalarCoercion(deserializationContext, strTrim);
                return Boolean.TRUE;
            }
            if ("false".equals(strTrim) || "False".equals(strTrim)) {
                _verifyStringForScalarCoercion(deserializationContext, strTrim);
                return Boolean.FALSE;
            }
            if (strTrim.length() == 0) {
                return (Boolean) _coerceEmptyString(deserializationContext, this._primitive);
            }
            return _hasTextualNull(strTrim) ? (Boolean) _coerceTextualNull(deserializationContext, this._primitive) : (Boolean) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "only \"true\" or \"false\" recognized", new Object[0]);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, defpackage.esd
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, defpackage.esd
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        @Override // defpackage.esd
        public Boolean deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            JsonToken jsonTokenK = jsonParser.K();
            if (jsonTokenK == JsonToken.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            return jsonTokenK == JsonToken.VALUE_FALSE ? Boolean.FALSE : _parseBoolean(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, defpackage.esd
        public Boolean deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
            JsonToken jsonTokenK = jsonParser.K();
            if (jsonTokenK == JsonToken.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            return jsonTokenK == JsonToken.VALUE_FALSE ? Boolean.FALSE : _parseBoolean(jsonParser, deserializationContext);
        }
    }

    @qqd
    public static class ByteDeserializer extends PrimitiveOrWrapperDeserializer<Byte> {
        private static final long serialVersionUID = 1;
        static final ByteDeserializer primitiveInstance = new ByteDeserializer(Byte.TYPE, (byte) 0);
        static final ByteDeserializer wrapperInstance = new ByteDeserializer(Byte.class, null);

        public ByteDeserializer(Class<Byte> cls, Byte b2) {
            super(cls, b2, (byte) 0);
        }

        public Byte _parseByte(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            JsonToken jsonTokenK = jsonParser.K();
            if (jsonTokenK == JsonToken.VALUE_STRING) {
                String strTrim = jsonParser.d0().trim();
                if (_hasTextualNull(strTrim)) {
                    return (Byte) _coerceTextualNull(deserializationContext, this._primitive);
                }
                if (strTrim.length() == 0) {
                    return (Byte) _coerceEmptyString(deserializationContext, this._primitive);
                }
                _verifyStringForScalarCoercion(deserializationContext, strTrim);
                try {
                    int iJ = n2h.j(strTrim);
                    return _byteOverflow(iJ) ? (Byte) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "overflow, value cannot be represented as 8-bit value", new Object[0]) : Byte.valueOf((byte) iJ);
                } catch (IllegalArgumentException unused) {
                    return (Byte) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid Byte value", new Object[0]);
                }
            }
            if (jsonTokenK == JsonToken.VALUE_NUMBER_FLOAT) {
                if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                    _failDoubleToIntCoercion(jsonParser, deserializationContext, "Byte");
                }
                return Byte.valueOf(jsonParser.y());
            }
            if (jsonTokenK == JsonToken.VALUE_NULL) {
                return (Byte) _coerceNullToken(deserializationContext, this._primitive);
            }
            if (jsonTokenK == JsonToken.START_ARRAY) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            return jsonTokenK == JsonToken.VALUE_NUMBER_INT ? Byte.valueOf(jsonParser.y()) : (Byte) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, defpackage.esd
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, defpackage.esd
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        @Override // defpackage.esd
        public Byte deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return jsonParser.y0(JsonToken.VALUE_NUMBER_INT) ? Byte.valueOf(jsonParser.y()) : _parseByte(jsonParser, deserializationContext);
        }
    }

    @qqd
    public static class CharacterDeserializer extends PrimitiveOrWrapperDeserializer<Character> {
        private static final long serialVersionUID = 1;
        static final CharacterDeserializer primitiveInstance = new CharacterDeserializer(Character.TYPE, 0);
        static final CharacterDeserializer wrapperInstance = new CharacterDeserializer(Character.class, null);

        public CharacterDeserializer(Class<Character> cls, Character ch) {
            super(cls, ch, (char) 0);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, defpackage.esd
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, defpackage.esd
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        @Override // defpackage.esd
        public Character deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            int iM = jsonParser.M();
            if (iM == 3) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (iM == 11) {
                return (Character) _coerceNullToken(deserializationContext, this._primitive);
            }
            if (iM == 6) {
                String strD0 = jsonParser.d0();
                if (strD0.length() == 1) {
                    return Character.valueOf(strD0.charAt(0));
                }
                if (strD0.length() == 0) {
                    return (Character) _coerceEmptyString(deserializationContext, this._primitive);
                }
            } else if (iM == 7) {
                _verifyNumberForScalarCoercion(deserializationContext, jsonParser);
                int iR = jsonParser.R();
                if (iR >= 0 && iR <= 65535) {
                    return Character.valueOf((char) iR);
                }
            }
            return (Character) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }
    }

    @qqd
    public static class DoubleDeserializer extends PrimitiveOrWrapperDeserializer<Double> {
        private static final long serialVersionUID = 1;
        static final DoubleDeserializer primitiveInstance = new DoubleDeserializer(Double.TYPE, Double.valueOf(0.0d));
        static final DoubleDeserializer wrapperInstance = new DoubleDeserializer(Double.class, null);

        public DoubleDeserializer(Class<Double> cls, Double d) {
            super(cls, d, Double.valueOf(0.0d));
        }

        public final Double _parseDouble(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            JsonToken jsonTokenK = jsonParser.K();
            if (jsonTokenK == JsonToken.VALUE_NUMBER_INT || jsonTokenK == JsonToken.VALUE_NUMBER_FLOAT) {
                return Double.valueOf(jsonParser.O());
            }
            if (jsonTokenK != JsonToken.VALUE_STRING) {
                if (jsonTokenK == JsonToken.VALUE_NULL) {
                    return (Double) _coerceNullToken(deserializationContext, this._primitive);
                }
                return jsonTokenK == JsonToken.START_ARRAY ? _deserializeFromArray(jsonParser, deserializationContext) : (Double) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            String strTrim = jsonParser.d0().trim();
            if (strTrim.length() == 0) {
                return (Double) _coerceEmptyString(deserializationContext, this._primitive);
            }
            if (_hasTextualNull(strTrim)) {
                return (Double) _coerceTextualNull(deserializationContext, this._primitive);
            }
            char cCharAt = strTrim.charAt(0);
            if (cCharAt != '-') {
                if (cCharAt != 'I') {
                    if (cCharAt == 'N' && _isNaN(strTrim)) {
                        return Double.valueOf(Double.NaN);
                    }
                } else if (_isPosInf(strTrim)) {
                    return Double.valueOf(Double.POSITIVE_INFINITY);
                }
            } else if (_isNegInf(strTrim)) {
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            }
            _verifyStringForScalarCoercion(deserializationContext, strTrim);
            try {
                return Double.valueOf(StdDeserializer.parseDouble(strTrim));
            } catch (IllegalArgumentException unused) {
                return (Double) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid Double value", new Object[0]);
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, defpackage.esd
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, defpackage.esd
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        @Override // defpackage.esd
        public Double deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return _parseDouble(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, defpackage.esd
        public Double deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
            return _parseDouble(jsonParser, deserializationContext);
        }
    }

    @qqd
    public static class FloatDeserializer extends PrimitiveOrWrapperDeserializer<Float> {
        private static final long serialVersionUID = 1;
        static final FloatDeserializer primitiveInstance = new FloatDeserializer(Float.TYPE, Float.valueOf(0.0f));
        static final FloatDeserializer wrapperInstance = new FloatDeserializer(Float.class, null);

        public FloatDeserializer(Class<Float> cls, Float f) {
            super(cls, f, Float.valueOf(0.0f));
        }

        public final Float _parseFloat(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            JsonToken jsonTokenK = jsonParser.K();
            if (jsonTokenK == JsonToken.VALUE_NUMBER_FLOAT || jsonTokenK == JsonToken.VALUE_NUMBER_INT) {
                return Float.valueOf(jsonParser.Q());
            }
            if (jsonTokenK != JsonToken.VALUE_STRING) {
                if (jsonTokenK == JsonToken.VALUE_NULL) {
                    return (Float) _coerceNullToken(deserializationContext, this._primitive);
                }
                return jsonTokenK == JsonToken.START_ARRAY ? _deserializeFromArray(jsonParser, deserializationContext) : (Float) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            String strTrim = jsonParser.d0().trim();
            if (strTrim.length() == 0) {
                return (Float) _coerceEmptyString(deserializationContext, this._primitive);
            }
            if (_hasTextualNull(strTrim)) {
                return (Float) _coerceTextualNull(deserializationContext, this._primitive);
            }
            char cCharAt = strTrim.charAt(0);
            if (cCharAt != '-') {
                if (cCharAt != 'I') {
                    if (cCharAt == 'N' && _isNaN(strTrim)) {
                        return Float.valueOf(Float.NaN);
                    }
                } else if (_isPosInf(strTrim)) {
                    return Float.valueOf(Float.POSITIVE_INFINITY);
                }
            } else if (_isNegInf(strTrim)) {
                return Float.valueOf(Float.NEGATIVE_INFINITY);
            }
            _verifyStringForScalarCoercion(deserializationContext, strTrim);
            try {
                return Float.valueOf(Float.parseFloat(strTrim));
            } catch (IllegalArgumentException unused) {
                return (Float) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid Float value", new Object[0]);
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, defpackage.esd
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, defpackage.esd
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        @Override // defpackage.esd
        public Float deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return _parseFloat(jsonParser, deserializationContext);
        }
    }

    @qqd
    public static final class IntegerDeserializer extends PrimitiveOrWrapperDeserializer<Integer> {
        private static final long serialVersionUID = 1;
        static final IntegerDeserializer primitiveInstance = new IntegerDeserializer(Integer.TYPE, 0);
        static final IntegerDeserializer wrapperInstance = new IntegerDeserializer(Integer.class, null);

        public IntegerDeserializer(Class<Integer> cls, Integer num) {
            super(cls, num, 0);
        }

        public final Integer _parseInteger(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            int iM = jsonParser.M();
            if (iM == 3) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (iM == 11) {
                return (Integer) _coerceNullToken(deserializationContext, this._primitive);
            }
            if (iM != 6) {
                if (iM == 7) {
                    return Integer.valueOf(jsonParser.R());
                }
                if (iM != 8) {
                    return (Integer) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
                }
                if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                    _failDoubleToIntCoercion(jsonParser, deserializationContext, "Integer");
                }
                return Integer.valueOf(jsonParser.o0());
            }
            String strTrim = jsonParser.d0().trim();
            int length = strTrim.length();
            if (length == 0) {
                return (Integer) _coerceEmptyString(deserializationContext, this._primitive);
            }
            if (_hasTextualNull(strTrim)) {
                return (Integer) _coerceTextualNull(deserializationContext, this._primitive);
            }
            _verifyStringForScalarCoercion(deserializationContext, strTrim);
            try {
                if (length <= 9) {
                    return Integer.valueOf(n2h.j(strTrim));
                }
                long j = Long.parseLong(strTrim);
                return _intOverflow(j) ? (Integer) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, String.format("Overflow: numeric value (%s) out of range of Integer (%d - %d)", strTrim, Integer.MIN_VALUE, Integer.MAX_VALUE), new Object[0]) : Integer.valueOf((int) j);
            } catch (IllegalArgumentException unused) {
                return (Integer) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid Integer value", new Object[0]);
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, defpackage.esd
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, defpackage.esd
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        @Override // defpackage.esd
        public boolean isCachable() {
            return true;
        }

        @Override // defpackage.esd
        public Integer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return jsonParser.y0(JsonToken.VALUE_NUMBER_INT) ? Integer.valueOf(jsonParser.R()) : _parseInteger(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, defpackage.esd
        public Integer deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
            return jsonParser.y0(JsonToken.VALUE_NUMBER_INT) ? Integer.valueOf(jsonParser.R()) : _parseInteger(jsonParser, deserializationContext);
        }
    }

    @qqd
    public static final class LongDeserializer extends PrimitiveOrWrapperDeserializer<Long> {
        private static final long serialVersionUID = 1;
        static final LongDeserializer primitiveInstance = new LongDeserializer(Long.TYPE, 0L);
        static final LongDeserializer wrapperInstance = new LongDeserializer(Long.class, null);

        public LongDeserializer(Class<Long> cls, Long l) {
            super(cls, l, 0L);
        }

        public final Long _parseLong(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            int iM = jsonParser.M();
            if (iM == 3) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (iM == 11) {
                return (Long) _coerceNullToken(deserializationContext, this._primitive);
            }
            if (iM != 6) {
                if (iM == 7) {
                    return Long.valueOf(jsonParser.S());
                }
                if (iM != 8) {
                    return (Long) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
                }
                if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                    _failDoubleToIntCoercion(jsonParser, deserializationContext, "Long");
                }
                return Long.valueOf(jsonParser.s0());
            }
            String strTrim = jsonParser.d0().trim();
            if (strTrim.length() == 0) {
                return (Long) _coerceEmptyString(deserializationContext, this._primitive);
            }
            if (_hasTextualNull(strTrim)) {
                return (Long) _coerceTextualNull(deserializationContext, this._primitive);
            }
            _verifyStringForScalarCoercion(deserializationContext, strTrim);
            try {
                return Long.valueOf(n2h.l(strTrim));
            } catch (IllegalArgumentException unused) {
                return (Long) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid Long value", new Object[0]);
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, defpackage.esd
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, defpackage.esd
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        @Override // defpackage.esd
        public boolean isCachable() {
            return true;
        }

        @Override // defpackage.esd
        public Long deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return jsonParser.y0(JsonToken.VALUE_NUMBER_INT) ? Long.valueOf(jsonParser.S()) : _parseLong(jsonParser, deserializationContext);
        }
    }

    @qqd
    public static class NumberDeserializer extends StdScalarDeserializer<Object> {
        public static final NumberDeserializer instance = new NumberDeserializer();

        public NumberDeserializer() {
            super((Class<?>) Number.class);
        }

        @Override // defpackage.esd
        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            int iM = jsonParser.M();
            if (iM == 3) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (iM != 6) {
                if (iM == 7) {
                    return deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS) ? _coerceIntegral(jsonParser, deserializationContext) : jsonParser.U();
                }
                if (iM != 8) {
                    return deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
                }
                return (!deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) || jsonParser.D0()) ? jsonParser.U() : jsonParser.N();
            }
            String strTrim = jsonParser.d0().trim();
            if (strTrim.length() != 0 && !_hasTextualNull(strTrim)) {
                if (_isPosInf(strTrim)) {
                    return Double.valueOf(Double.POSITIVE_INFINITY);
                }
                if (_isNegInf(strTrim)) {
                    return Double.valueOf(Double.NEGATIVE_INFINITY);
                }
                if (_isNaN(strTrim)) {
                    return Double.valueOf(Double.NaN);
                }
                _verifyStringForScalarCoercion(deserializationContext, strTrim);
                try {
                    if (!_isIntNumber(strTrim)) {
                        return deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? new BigDecimal(strTrim) : Double.valueOf(strTrim);
                    }
                    if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
                        return new BigInteger(strTrim);
                    }
                    long j = Long.parseLong(strTrim);
                    return (deserializationContext.isEnabled(DeserializationFeature.USE_LONG_FOR_INTS) || j > 2147483647L || j < -2147483648L) ? Long.valueOf(j) : Integer.valueOf((int) j);
                } catch (IllegalArgumentException unused) {
                    return deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid number", new Object[0]);
                }
            }
            return getNullValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, defpackage.esd
        public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
            int iM = jsonParser.M();
            return (iM == 6 || iM == 7 || iM == 8) ? deserialize(jsonParser, deserializationContext) : q4qVar.deserializeTypedFromScalar(jsonParser, deserializationContext);
        }
    }

    public static abstract class PrimitiveOrWrapperDeserializer<T> extends StdScalarDeserializer<T> {
        private static final long serialVersionUID = 1;
        protected final T _emptyValue;
        protected final T _nullValue;
        protected final boolean _primitive;

        public PrimitiveOrWrapperDeserializer(Class<T> cls, T t, T t2) {
            super((Class<?>) cls);
            this._nullValue = t;
            this._emptyValue = t2;
            this._primitive = cls.isPrimitive();
        }

        @Override // defpackage.esd
        public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return this._emptyValue;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, defpackage.esd
        public AccessPattern getNullAccessPattern() {
            if (this._primitive) {
                return AccessPattern.DYNAMIC;
            }
            return this._nullValue == null ? AccessPattern.ALWAYS_NULL : AccessPattern.CONSTANT;
        }

        @Override // defpackage.esd, defpackage.z1h
        public final T getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
            if (this._primitive && deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
                deserializationContext.reportInputMismatch(this, "Cannot map `null` into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", handledType().toString());
            }
            return this._nullValue;
        }
    }

    @qqd
    public static class ShortDeserializer extends PrimitiveOrWrapperDeserializer<Short> {
        private static final long serialVersionUID = 1;
        static final ShortDeserializer primitiveInstance = new ShortDeserializer(Short.TYPE, 0);
        static final ShortDeserializer wrapperInstance = new ShortDeserializer(Short.class, null);

        public ShortDeserializer(Class<Short> cls, Short sh) {
            super(cls, sh, (short) 0);
        }

        public Short _parseShort(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            JsonToken jsonTokenK = jsonParser.K();
            if (jsonTokenK == JsonToken.VALUE_NUMBER_INT) {
                return Short.valueOf(jsonParser.c0());
            }
            if (jsonTokenK != JsonToken.VALUE_STRING) {
                if (jsonTokenK == JsonToken.VALUE_NUMBER_FLOAT) {
                    if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                        _failDoubleToIntCoercion(jsonParser, deserializationContext, "Short");
                    }
                    return Short.valueOf(jsonParser.c0());
                }
                if (jsonTokenK == JsonToken.VALUE_NULL) {
                    return (Short) _coerceNullToken(deserializationContext, this._primitive);
                }
                return jsonTokenK == JsonToken.START_ARRAY ? _deserializeFromArray(jsonParser, deserializationContext) : (Short) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            String strTrim = jsonParser.d0().trim();
            if (strTrim.length() == 0) {
                return (Short) _coerceEmptyString(deserializationContext, this._primitive);
            }
            if (_hasTextualNull(strTrim)) {
                return (Short) _coerceTextualNull(deserializationContext, this._primitive);
            }
            _verifyStringForScalarCoercion(deserializationContext, strTrim);
            try {
                int iJ = n2h.j(strTrim);
                return _shortOverflow(iJ) ? (Short) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "overflow, value cannot be represented as 16-bit value", new Object[0]) : Short.valueOf((short) iJ);
            } catch (IllegalArgumentException unused) {
                return (Short) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "not a valid Short value", new Object[0]);
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, defpackage.esd
        public /* bridge */ /* synthetic */ Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return super.getEmptyValue(deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.NumberDeserializers.PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, defpackage.esd
        public /* bridge */ /* synthetic */ AccessPattern getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        @Override // defpackage.esd
        public Short deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return _parseShort(jsonParser, deserializationContext);
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7655a;

        static {
            int[] iArr = new int[JsonParser.NumberType.values().length];
            f7655a = iArr;
            try {
                iArr[JsonParser.NumberType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7655a[JsonParser.NumberType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7655a[JsonParser.NumberType.BIG_INTEGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        Class[] clsArr = {Boolean.class, Byte.class, Short.class, Character.class, Integer.class, Long.class, Float.class, Double.class, Number.class, BigDecimal.class, BigInteger.class};
        for (int i = 0; i < 11; i++) {
            f7654a.add(clsArr[i].getName());
        }
    }

    public static esd<?> a(Class<?> cls, String str) {
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return IntegerDeserializer.primitiveInstance;
            }
            if (cls == Boolean.TYPE) {
                return BooleanDeserializer.primitiveInstance;
            }
            if (cls == Long.TYPE) {
                return LongDeserializer.primitiveInstance;
            }
            if (cls == Double.TYPE) {
                return DoubleDeserializer.primitiveInstance;
            }
            if (cls == Character.TYPE) {
                return CharacterDeserializer.primitiveInstance;
            }
            if (cls == Byte.TYPE) {
                return ByteDeserializer.primitiveInstance;
            }
            if (cls == Short.TYPE) {
                return ShortDeserializer.primitiveInstance;
            }
            if (cls == Float.TYPE) {
                return FloatDeserializer.primitiveInstance;
            }
        } else {
            if (!f7654a.contains(str)) {
                return null;
            }
            if (cls == Integer.class) {
                return IntegerDeserializer.wrapperInstance;
            }
            if (cls == Boolean.class) {
                return BooleanDeserializer.wrapperInstance;
            }
            if (cls == Long.class) {
                return LongDeserializer.wrapperInstance;
            }
            if (cls == Double.class) {
                return DoubleDeserializer.wrapperInstance;
            }
            if (cls == Character.class) {
                return CharacterDeserializer.wrapperInstance;
            }
            if (cls == Byte.class) {
                return ByteDeserializer.wrapperInstance;
            }
            if (cls == Short.class) {
                return ShortDeserializer.wrapperInstance;
            }
            if (cls == Float.class) {
                return FloatDeserializer.wrapperInstance;
            }
            if (cls == Number.class) {
                return NumberDeserializer.instance;
            }
            if (cls == BigDecimal.class) {
                return BigDecimalDeserializer.instance;
            }
            if (cls == BigInteger.class) {
                return BigIntegerDeserializer.instance;
            }
        }
        throw new IllegalArgumentException("Internal error: can't find deserializer for " + cls.getName());
    }
}
