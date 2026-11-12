package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.NullsAsEmptyProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsFailProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.util.AccessPattern;
import defpackage.ak4;
import defpackage.esd;
import defpackage.h04;
import defpackage.n2h;
import defpackage.q4q;
import defpackage.vzd;
import defpackage.z1h;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class StdDeserializer<T> extends esd<T> implements Serializable {
    private static final long serialVersionUID = 1;
    protected final Class<?> _valueClass;
    protected static final int F_MASK_INT_COERCIONS = DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.getMask() | DeserializationFeature.USE_LONG_FOR_INTS.getMask();
    protected static final int F_MASK_ACCEPT_ARRAYS = DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS.getMask() | DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT.getMask();

    public StdDeserializer(Class<?> cls) {
        this._valueClass = cls;
    }

    public static final boolean _neitherNull(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? false : true;
    }

    public static final double parseDouble(String str) throws NumberFormatException {
        if ("2.2250738585072012e-308".equals(str)) {
            return Double.MIN_NORMAL;
        }
        return Double.parseDouble(str);
    }

    public final boolean _byteOverflow(int i) {
        return i < -128 || i > 255;
    }

    public Object _coerceEmptyString(DeserializationContext deserializationContext, boolean z) throws JsonMappingException {
        boolean z2;
        DeserializationFeature deserializationFeature;
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.isEnabled(mapperFeature)) {
            if (z) {
                DeserializationFeature deserializationFeature2 = DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES;
                if (deserializationContext.isEnabled(deserializationFeature2)) {
                    z2 = false;
                    deserializationFeature = deserializationFeature2;
                }
            }
            return getNullValue(deserializationContext);
        }
        z2 = true;
        deserializationFeature = mapperFeature;
        _reportFailedNullCoerce(deserializationContext, z2, deserializationFeature, "empty String (\"\")");
        return null;
    }

    public Object _coerceIntegral(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int deserializationFeatures = deserializationContext.getDeserializationFeatures();
        if (!DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(deserializationFeatures) && DeserializationFeature.USE_LONG_FOR_INTS.enabledIn(deserializationFeatures)) {
            return Long.valueOf(jsonParser.S());
        }
        return jsonParser.o();
    }

    public Object _coerceNullToken(DeserializationContext deserializationContext, boolean z) throws JsonMappingException {
        if (z) {
            _verifyNullForPrimitive(deserializationContext);
        }
        return getNullValue(deserializationContext);
    }

    public Object _coerceTextualNull(DeserializationContext deserializationContext, boolean z) throws JsonMappingException {
        boolean z2;
        DeserializationFeature deserializationFeature;
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.isEnabled(mapperFeature)) {
            if (z) {
                DeserializationFeature deserializationFeature2 = DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES;
                if (deserializationContext.isEnabled(deserializationFeature2)) {
                    z2 = false;
                    deserializationFeature = deserializationFeature2;
                }
            }
            return getNullValue(deserializationContext);
        }
        z2 = true;
        deserializationFeature = mapperFeature;
        _reportFailedNullCoerce(deserializationContext, z2, deserializationFeature, "String \"null\"");
        return null;
    }

    public String _coercedTypeDesc() {
        String strT;
        JavaType valueType = getValueType();
        boolean z = true;
        if (valueType == null || valueType.isPrimitive()) {
            Class<?> clsHandledType = handledType();
            if (!clsHandledType.isArray() && !Collection.class.isAssignableFrom(clsHandledType) && !Map.class.isAssignableFrom(clsHandledType)) {
                z = false;
            }
            strT = h04.T(clsHandledType);
        } else {
            if (!valueType.isContainerType() && !valueType.isReferenceType()) {
                z = false;
            }
            strT = "'" + valueType.toString() + "'";
        }
        if (z) {
            return "as content of type " + strT;
        }
        return "for type " + strT;
    }

    public T _deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken jsonTokenK;
        if (deserializationContext.hasSomeOfFeatures(F_MASK_ACCEPT_ARRAYS)) {
            jsonTokenK = jsonParser.G0();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (jsonTokenK == jsonToken && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                return getNullValue(deserializationContext);
            }
            if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                T tDeserialize = deserialize(jsonParser, deserializationContext);
                if (jsonParser.G0() != jsonToken) {
                    handleMissingEndArrayForSingle(jsonParser, deserializationContext);
                }
                return tDeserialize;
            }
        } else {
            jsonTokenK = jsonParser.K();
        }
        return (T) deserializationContext.handleUnexpectedToken(this._valueClass, jsonTokenK, jsonParser, null, new Object[0]);
    }

    public T _deserializeFromEmpty(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken jsonTokenK = jsonParser.K();
        if (jsonTokenK == JsonToken.START_ARRAY) {
            if (deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                if (jsonParser.G0() == JsonToken.END_ARRAY) {
                    return null;
                }
                return (T) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
            }
        } else if (jsonTokenK == JsonToken.VALUE_STRING && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.d0().trim().isEmpty()) {
            return null;
        }
        return (T) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
    }

    public T _deserializeWrappedValue(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken jsonToken = JsonToken.START_ARRAY;
        if (!jsonParser.y0(jsonToken)) {
            return deserialize(jsonParser, deserializationContext);
        }
        return (T) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser.K(), jsonParser, String.format("Cannot deserialize instance of %s out of %s token: nested Arrays not allowed with %s", h04.T(this._valueClass), jsonToken, "DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS"), new Object[0]);
    }

    public void _failDoubleToIntCoercion(JsonParser jsonParser, DeserializationContext deserializationContext, String str) throws IOException {
        deserializationContext.reportInputMismatch(handledType(), "Cannot coerce a floating-point value ('%s') into %s (enable `DeserializationFeature.ACCEPT_FLOAT_AS_INT` to allow)", jsonParser.u0(), str);
    }

    public final z1h _findNullProvider(DeserializationContext deserializationContext, BeanProperty beanProperty, Nulls nulls, esd<?> esdVar) throws JsonMappingException {
        if (nulls == Nulls.FAIL) {
            return beanProperty == null ? NullsFailProvider.constructForRootValue(deserializationContext.constructType(esdVar.handledType())) : NullsFailProvider.constructForProperty(beanProperty);
        }
        if (nulls != Nulls.AS_EMPTY) {
            if (nulls == Nulls.SKIP) {
                return NullsConstantProvider.skipper();
            }
            return null;
        }
        if (esdVar == null) {
            return null;
        }
        if ((esdVar instanceof BeanDeserializerBase) && !((BeanDeserializerBase) esdVar).getValueInstantiator().canCreateUsingDefault()) {
            JavaType type = beanProperty.getType();
            deserializationContext.reportBadDefinition(type, String.format("Cannot create empty instance of %s, no default Creator", type));
        }
        AccessPattern emptyAccessPattern = esdVar.getEmptyAccessPattern();
        if (emptyAccessPattern == AccessPattern.ALWAYS_NULL) {
            return NullsConstantProvider.nuller();
        }
        return emptyAccessPattern == AccessPattern.CONSTANT ? NullsConstantProvider.forValue(esdVar.getEmptyValue(deserializationContext)) : new NullsAsEmptyProvider(esdVar);
    }

    public boolean _hasTextualNull(String str) {
        return AbstractJsonLexerKt.NULL.equals(str);
    }

    public final boolean _intOverflow(long j) {
        return j < -2147483648L || j > 2147483647L;
    }

    public boolean _isEmptyOrTextualNull(String str) {
        return str.isEmpty() || AbstractJsonLexerKt.NULL.equals(str);
    }

    public final boolean _isIntNumber(String str) {
        int length = str.length();
        if (length <= 0) {
            return false;
        }
        char cCharAt = str.charAt(0);
        for (int i = (cCharAt == '-' || cCharAt == '+') ? 1 : 0; i < length; i++) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 > '9' || cCharAt2 < '0') {
                return false;
            }
        }
        return true;
    }

    public final boolean _isNaN(String str) {
        return "NaN".equals(str);
    }

    public final boolean _isNegInf(String str) {
        return "-Infinity".equals(str) || "-INF".equals(str);
    }

    public final boolean _isPosInf(String str) {
        return "Infinity".equals(str) || "INF".equals(str);
    }

    public Number _nonNullNumber(Number number) {
        if (number == null) {
            return 0;
        }
        return number;
    }

    public boolean _parseBooleanFromInt(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        _verifyNumberForScalarCoercion(deserializationContext, jsonParser);
        return !"0".equals(jsonParser.d0());
    }

    public final boolean _parseBooleanPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken jsonTokenK = jsonParser.K();
        if (jsonTokenK == JsonToken.VALUE_TRUE) {
            return true;
        }
        if (jsonTokenK == JsonToken.VALUE_FALSE) {
            return false;
        }
        if (jsonTokenK == JsonToken.VALUE_NULL) {
            _verifyNullForPrimitive(deserializationContext);
            return false;
        }
        if (jsonTokenK == JsonToken.VALUE_NUMBER_INT) {
            return _parseBooleanFromInt(jsonParser, deserializationContext);
        }
        if (jsonTokenK != JsonToken.VALUE_STRING) {
            if (jsonTokenK != JsonToken.START_ARRAY || !deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                return ((Boolean) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser)).booleanValue();
            }
            jsonParser.G0();
            boolean z_parseBooleanPrimitive = _parseBooleanPrimitive(jsonParser, deserializationContext);
            _verifyEndArrayForSingle(jsonParser, deserializationContext);
            return z_parseBooleanPrimitive;
        }
        String strTrim = jsonParser.d0().trim();
        if ("true".equals(strTrim) || "True".equals(strTrim)) {
            return true;
        }
        if ("false".equals(strTrim) || "False".equals(strTrim)) {
            return false;
        }
        if (_isEmptyOrTextualNull(strTrim)) {
            _verifyNullForPrimitiveCoercion(deserializationContext, strTrim);
            return false;
        }
        return Boolean.TRUE.equals((Boolean) deserializationContext.handleWeirdStringValue(this._valueClass, strTrim, "only \"true\" or \"false\" recognized", new Object[0]));
    }

    public final byte _parseBytePrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int i_parseIntPrimitive = _parseIntPrimitive(jsonParser, deserializationContext);
        return _byteOverflow(i_parseIntPrimitive) ? _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(this._valueClass, String.valueOf(i_parseIntPrimitive), "overflow, value cannot be represented as 8-bit value", new Object[0])).byteValue() : (byte) i_parseIntPrimitive;
    }

    public Date _parseDate(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        long jLongValue;
        int iM = jsonParser.M();
        if (iM == 3) {
            return _parseDateFromArray(jsonParser, deserializationContext);
        }
        if (iM == 11) {
            return (Date) getNullValue(deserializationContext);
        }
        if (iM == 6) {
            return _parseDate(jsonParser.d0().trim(), deserializationContext);
        }
        if (iM != 7) {
            return (Date) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }
        try {
            jLongValue = jsonParser.S();
        } catch (JsonParseException unused) {
            jLongValue = ((Number) deserializationContext.handleWeirdNumberValue(this._valueClass, jsonParser.U(), "not a valid 64-bit long for creating `java.util.Date`", new Object[0])).longValue();
        }
        return new Date(jLongValue);
    }

    public Date _parseDateFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken jsonTokenK;
        if (deserializationContext.hasSomeOfFeatures(F_MASK_ACCEPT_ARRAYS)) {
            jsonTokenK = jsonParser.G0();
            if (jsonTokenK == JsonToken.END_ARRAY && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
                return (Date) getNullValue(deserializationContext);
            }
            if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                Date date_parseDate = _parseDate(jsonParser, deserializationContext);
                _verifyEndArrayForSingle(jsonParser, deserializationContext);
                return date_parseDate;
            }
        } else {
            jsonTokenK = jsonParser.K();
        }
        return (Date) deserializationContext.handleUnexpectedToken(this._valueClass, jsonTokenK, jsonParser, null, new Object[0]);
    }

    public final double _parseDoublePrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.y0(JsonToken.VALUE_NUMBER_FLOAT)) {
            return jsonParser.O();
        }
        int iM = jsonParser.M();
        if (iM != 3) {
            if (iM == 11) {
                _verifyNullForPrimitive(deserializationContext);
                return 0.0d;
            }
            if (iM == 6) {
                String strTrim = jsonParser.d0().trim();
                if (!_isEmptyOrTextualNull(strTrim)) {
                    return _parseDoublePrimitive(deserializationContext, strTrim);
                }
                _verifyNullForPrimitiveCoercion(deserializationContext, strTrim);
                return 0.0d;
            }
            if (iM == 7) {
                return jsonParser.O();
            }
        } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            jsonParser.G0();
            double d_parseDoublePrimitive = _parseDoublePrimitive(jsonParser, deserializationContext);
            _verifyEndArrayForSingle(jsonParser, deserializationContext);
            return d_parseDoublePrimitive;
        }
        return ((Number) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser)).doubleValue();
    }

    public final float _parseFloatPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.y0(JsonToken.VALUE_NUMBER_FLOAT)) {
            return jsonParser.Q();
        }
        int iM = jsonParser.M();
        if (iM != 3) {
            if (iM == 11) {
                _verifyNullForPrimitive(deserializationContext);
                return 0.0f;
            }
            if (iM == 6) {
                String strTrim = jsonParser.d0().trim();
                if (!_isEmptyOrTextualNull(strTrim)) {
                    return _parseFloatPrimitive(deserializationContext, strTrim);
                }
                _verifyNullForPrimitiveCoercion(deserializationContext, strTrim);
                return 0.0f;
            }
            if (iM == 7) {
                return jsonParser.Q();
            }
        } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            jsonParser.G0();
            float f_parseFloatPrimitive = _parseFloatPrimitive(jsonParser, deserializationContext);
            _verifyEndArrayForSingle(jsonParser, deserializationContext);
            return f_parseFloatPrimitive;
        }
        return ((Number) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser)).floatValue();
    }

    public final int _parseIntPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.y0(JsonToken.VALUE_NUMBER_INT)) {
            return jsonParser.R();
        }
        int iM = jsonParser.M();
        if (iM != 3) {
            if (iM == 6) {
                String strTrim = jsonParser.d0().trim();
                if (!_isEmptyOrTextualNull(strTrim)) {
                    return _parseIntPrimitive(deserializationContext, strTrim);
                }
                _verifyNullForPrimitiveCoercion(deserializationContext, strTrim);
                return 0;
            }
            if (iM == 8) {
                if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                    _failDoubleToIntCoercion(jsonParser, deserializationContext, "int");
                }
                return jsonParser.o0();
            }
            if (iM == 11) {
                _verifyNullForPrimitive(deserializationContext);
                return 0;
            }
        } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            jsonParser.G0();
            int i_parseIntPrimitive = _parseIntPrimitive(jsonParser, deserializationContext);
            _verifyEndArrayForSingle(jsonParser, deserializationContext);
            return i_parseIntPrimitive;
        }
        return ((Number) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser)).intValue();
    }

    public final long _parseLongPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.y0(JsonToken.VALUE_NUMBER_INT)) {
            return jsonParser.S();
        }
        int iM = jsonParser.M();
        if (iM != 3) {
            if (iM == 6) {
                String strTrim = jsonParser.d0().trim();
                if (!_isEmptyOrTextualNull(strTrim)) {
                    return _parseLongPrimitive(deserializationContext, strTrim);
                }
                _verifyNullForPrimitiveCoercion(deserializationContext, strTrim);
                return 0L;
            }
            if (iM == 8) {
                if (!deserializationContext.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                    _failDoubleToIntCoercion(jsonParser, deserializationContext, "long");
                }
                return jsonParser.s0();
            }
            if (iM == 11) {
                _verifyNullForPrimitive(deserializationContext);
                return 0L;
            }
        } else if (deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            jsonParser.G0();
            long j_parseLongPrimitive = _parseLongPrimitive(jsonParser, deserializationContext);
            _verifyEndArrayForSingle(jsonParser, deserializationContext);
            return j_parseLongPrimitive;
        }
        return ((Number) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser)).longValue();
    }

    public final short _parseShortPrimitive(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int i_parseIntPrimitive = _parseIntPrimitive(jsonParser, deserializationContext);
        return _shortOverflow(i_parseIntPrimitive) ? _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(this._valueClass, String.valueOf(i_parseIntPrimitive), "overflow, value cannot be represented as 16-bit value", new Object[0])).shortValue() : (short) i_parseIntPrimitive;
    }

    public final String _parseString(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.K() == JsonToken.VALUE_STRING) {
            return jsonParser.d0();
        }
        String strU0 = jsonParser.u0();
        return strU0 != null ? strU0 : (String) deserializationContext.handleUnexpectedToken(String.class, jsonParser);
    }

    public void _reportFailedNullCoerce(DeserializationContext deserializationContext, boolean z, Enum<?> r5, String str) throws JsonMappingException {
        deserializationContext.reportInputMismatch(this, "Cannot coerce %s to Null value %s (%s `%s.%s` to allow)", str, _coercedTypeDesc(), z ? "enable" : "disable", r5.getClass().getSimpleName(), r5.name());
    }

    public final boolean _shortOverflow(int i) {
        return i < -32768 || i > 32767;
    }

    public void _verifyEndArrayForSingle(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.G0() != JsonToken.END_ARRAY) {
            handleMissingEndArrayForSingle(jsonParser, deserializationContext);
        }
    }

    public final void _verifyNullForPrimitive(DeserializationContext deserializationContext) throws JsonMappingException {
        if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES)) {
            deserializationContext.reportInputMismatch(this, "Cannot coerce `null` %s (disable `DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES` to allow)", _coercedTypeDesc());
        }
    }

    public final void _verifyNullForPrimitiveCoercion(DeserializationContext deserializationContext, String str) throws JsonMappingException {
        boolean z;
        DeserializationFeature deserializationFeature;
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.isEnabled(mapperFeature)) {
            DeserializationFeature deserializationFeature2 = DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES;
            if (!deserializationContext.isEnabled(deserializationFeature2)) {
                return;
            }
            z = false;
            deserializationFeature = deserializationFeature2;
        } else {
            z = true;
            deserializationFeature = mapperFeature;
        }
        _reportFailedNullCoerce(deserializationContext, z, deserializationFeature, str.isEmpty() ? "empty String (\"\")" : String.format("String \"%s\"", str));
    }

    public final void _verifyNullForScalarCoercion(DeserializationContext deserializationContext, String str) throws JsonMappingException {
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.isEnabled(mapperFeature)) {
            return;
        }
        _reportFailedNullCoerce(deserializationContext, true, mapperFeature, str.isEmpty() ? "empty String (\"\")" : String.format("String \"%s\"", str));
    }

    public void _verifyNumberForScalarCoercion(DeserializationContext deserializationContext, JsonParser jsonParser) throws IOException {
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.isEnabled(mapperFeature)) {
            return;
        }
        deserializationContext.reportInputMismatch(this, "Cannot coerce Number (%s) %s (enable `%s.%s` to allow)", jsonParser.d0(), _coercedTypeDesc(), mapperFeature.getClass().getSimpleName(), mapperFeature.name());
    }

    public void _verifyStringForScalarCoercion(DeserializationContext deserializationContext, String str) throws JsonMappingException {
        MapperFeature mapperFeature = MapperFeature.ALLOW_COERCION_OF_SCALARS;
        if (deserializationContext.isEnabled(mapperFeature)) {
            return;
        }
        deserializationContext.reportInputMismatch(this, "Cannot coerce String \"%s\" %s (enable `%s.%s` to allow)", str, _coercedTypeDesc(), mapperFeature.getClass().getSimpleName(), mapperFeature.name());
    }

    @Override // defpackage.esd
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
        return q4qVar.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    public z1h findContentNullProvider(DeserializationContext deserializationContext, BeanProperty beanProperty, esd<?> esdVar) throws JsonMappingException {
        Nulls nullsFindContentNullStyle = findContentNullStyle(deserializationContext, beanProperty);
        if (nullsFindContentNullStyle == Nulls.SKIP) {
            return NullsConstantProvider.skipper();
        }
        z1h z1hVar_findNullProvider = _findNullProvider(deserializationContext, beanProperty, nullsFindContentNullStyle, esdVar);
        return z1hVar_findNullProvider != null ? z1hVar_findNullProvider : esdVar;
    }

    public Nulls findContentNullStyle(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        if (beanProperty != null) {
            return beanProperty.getMetadata().getContentNulls();
        }
        return null;
    }

    public esd<?> findConvertingContentDeserializer(DeserializationContext deserializationContext, BeanProperty beanProperty, esd<?> esdVar) throws JsonMappingException {
        AnnotatedMember member;
        Object objFindDeserializationContentConverter;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (!_neitherNull(annotationIntrospector, beanProperty) || (member = beanProperty.getMember()) == null || (objFindDeserializationContentConverter = annotationIntrospector.findDeserializationContentConverter(member)) == null) {
            return esdVar;
        }
        ak4<Object, Object> ak4VarConverterInstance = deserializationContext.converterInstance(beanProperty.getMember(), objFindDeserializationContentConverter);
        JavaType javaTypeA = ak4VarConverterInstance.a(deserializationContext.getTypeFactory());
        if (esdVar == null) {
            esdVar = deserializationContext.findContextualValueDeserializer(javaTypeA, beanProperty);
        }
        return new StdDelegatingDeserializer(ak4VarConverterInstance, javaTypeA, esdVar);
    }

    public esd<Object> findDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        return deserializationContext.findContextualValueDeserializer(javaType, beanProperty);
    }

    public Boolean findFormatFeature(DeserializationContext deserializationContext, BeanProperty beanProperty, Class<?> cls, JsonFormat.Feature feature) {
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(deserializationContext, beanProperty, cls);
        if (valueFindFormatOverrides != null) {
            return valueFindFormatOverrides.getFeature(feature);
        }
        return null;
    }

    public JsonFormat.Value findFormatOverrides(DeserializationContext deserializationContext, BeanProperty beanProperty, Class<?> cls) {
        return beanProperty != null ? beanProperty.findPropertyFormat(deserializationContext.getConfig(), cls) : deserializationContext.getDefaultPropertyFormat(cls);
    }

    public final z1h findValueNullProvider(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty, PropertyMetadata propertyMetadata) throws JsonMappingException {
        if (settableBeanProperty != null) {
            return _findNullProvider(deserializationContext, settableBeanProperty, propertyMetadata.getValueNulls(), settableBeanProperty.getValueDeserializer());
        }
        return null;
    }

    @Deprecated
    public final Class<?> getValueClass() {
        return this._valueClass;
    }

    public JavaType getValueType() {
        return null;
    }

    public void handleMissingEndArrayForSingle(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        deserializationContext.reportWrongTokenException(this, JsonToken.END_ARRAY, "Attempted to unwrap '%s' value from an array (with `DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS`) but it contains more than one value", handledType().getName());
    }

    public void handleUnknownProperty(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        if (obj == null) {
            obj = handledType();
        }
        if (deserializationContext.handleUnknownProperty(jsonParser, this, obj, str)) {
            return;
        }
        jsonParser.O0();
    }

    @Override // defpackage.esd
    public Class<?> handledType() {
        return this._valueClass;
    }

    public boolean isDefaultDeserializer(esd<?> esdVar) {
        return h04.N(esdVar);
    }

    public boolean isDefaultKeyDeserializer(vzd vzdVar) {
        return h04.N(vzdVar);
    }

    public StdDeserializer(JavaType javaType) {
        this._valueClass = javaType == null ? Object.class : javaType.getRawClass();
    }

    public StdDeserializer(StdDeserializer<?> stdDeserializer) {
        this._valueClass = stdDeserializer._valueClass;
    }

    public Date _parseDate(String str, DeserializationContext deserializationContext) throws IOException {
        try {
            if (_isEmptyOrTextualNull(str)) {
                return (Date) getNullValue(deserializationContext);
            }
            return deserializationContext.parseDate(str);
        } catch (IllegalArgumentException e) {
            return (Date) deserializationContext.handleWeirdStringValue(this._valueClass, str, "not a valid representation (error: %s)", h04.n(e));
        }
    }

    public final double _parseDoublePrimitive(DeserializationContext deserializationContext, String str) throws IOException {
        char cCharAt = str.charAt(0);
        if (cCharAt != '-') {
            if (cCharAt != 'I') {
                if (cCharAt == 'N' && _isNaN(str)) {
                    return Double.NaN;
                }
            } else if (_isPosInf(str)) {
                return Double.POSITIVE_INFINITY;
            }
        } else if (_isNegInf(str)) {
            return Double.NEGATIVE_INFINITY;
        }
        try {
            return parseDouble(str);
        } catch (IllegalArgumentException unused) {
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(this._valueClass, str, "not a valid double value (as String to convert)", new Object[0])).doubleValue();
        }
    }

    public final float _parseFloatPrimitive(DeserializationContext deserializationContext, String str) throws IOException {
        char cCharAt = str.charAt(0);
        if (cCharAt != '-') {
            if (cCharAt != 'I') {
                if (cCharAt == 'N' && _isNaN(str)) {
                    return Float.NaN;
                }
            } else if (_isPosInf(str)) {
                return Float.POSITIVE_INFINITY;
            }
        } else if (_isNegInf(str)) {
            return Float.NEGATIVE_INFINITY;
        }
        try {
            return Float.parseFloat(str);
        } catch (IllegalArgumentException unused) {
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(this._valueClass, str, "not a valid float value", new Object[0])).floatValue();
        }
    }

    public final int _parseIntPrimitive(DeserializationContext deserializationContext, String str) throws IOException {
        try {
            if (str.length() > 9) {
                long j = Long.parseLong(str);
                return _intOverflow(j) ? _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(this._valueClass, str, "Overflow: numeric value (%s) out of range of int (%d -%d)", str, Integer.MIN_VALUE, Integer.MAX_VALUE)).intValue() : (int) j;
            }
            return n2h.j(str);
        } catch (IllegalArgumentException unused) {
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(this._valueClass, str, "not a valid int value", new Object[0])).intValue();
        }
    }

    public final long _parseLongPrimitive(DeserializationContext deserializationContext, String str) throws IOException {
        try {
            return n2h.l(str);
        } catch (IllegalArgumentException unused) {
            return _nonNullNumber((Number) deserializationContext.handleWeirdStringValue(this._valueClass, str, "not a valid long value", new Object[0])).longValue();
        }
    }
}
