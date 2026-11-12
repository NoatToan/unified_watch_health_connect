package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import defpackage.aaa;
import defpackage.aae;
import defpackage.abz;
import defpackage.aht;
import defpackage.wm;
import defpackage.wn;
import defpackage.yi;
import defpackage.ym;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public abstract class PrimitiveArrayDeserializers<T> extends StdDeserializer<T> implements ContextualDeserializer {
    private transient Object _emptyValue;
    protected final NullValueProvider _nuller;
    protected final Boolean _unwrapSingle;

    protected abstract T _concat(T t, T t2);

    protected abstract T _constructEmpty();

    protected abstract T handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    protected abstract PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool);

    protected PrimitiveArrayDeserializers(Class<T> cls) {
        super((Class<?>) cls);
        this._unwrapSingle = null;
        this._nuller = null;
    }

    protected PrimitiveArrayDeserializers(PrimitiveArrayDeserializers<?> primitiveArrayDeserializers, NullValueProvider nullValueProvider, Boolean bool) {
        super(primitiveArrayDeserializers._valueClass);
        this._unwrapSingle = bool;
        this._nuller = nullValueProvider;
    }

    public static JsonDeserializer<?> forType(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return i.f4143b;
        }
        if (cls == Long.TYPE) {
            return f.f4142c;
        }
        if (cls == Byte.TYPE) {
            return new c();
        }
        if (cls == Short.TYPE) {
            return new h();
        }
        if (cls == Float.TYPE) {
            return new a();
        }
        if (cls == Double.TYPE) {
            return new b();
        }
        if (cls == Boolean.TYPE) {
            return new d();
        }
        if (cls == Character.TYPE) {
            return new e();
        }
        throw new IllegalStateException();
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws ym {
        NullValueProvider nullValueProviderE;
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, this._valueClass, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        Nulls nullsFindContentNullStyle = findContentNullStyle(deserializationContext, beanProperty);
        if (nullsFindContentNullStyle == Nulls.SKIP) {
            nullValueProviderE = aaa.b();
        } else if (nullsFindContentNullStyle != Nulls.FAIL) {
            nullValueProviderE = null;
        } else if (beanProperty == null) {
            nullValueProviderE = aae.b(deserializationContext.constructType(this._valueClass.getComponentType()));
        } else {
            nullValueProviderE = aae.e(beanProperty, beanProperty.getType().getContentType());
        }
        return (Objects.equals(boolFindFormatFeature, this._unwrapSingle) && nullValueProviderE == this._nuller) ? this : withResolved(nullValueProviderE, boolFindFormatFeature);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Array;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(yi yiVar) {
        return Boolean.TRUE;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) throws ym {
        Object obj = this._emptyValue;
        if (obj != null) {
            return obj;
        }
        T t_constructEmpty = _constructEmpty();
        this._emptyValue = t_constructEmpty;
        return t_constructEmpty;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, T t) throws IOException {
        T tDeserialize = deserialize(jsonParser, deserializationContext);
        return (t == null || Array.getLength(t) == 0) ? tDeserialize : _concat(t, tDeserialize);
    }

    protected T handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.hasToken(JsonToken.VALUE_STRING)) {
            return _deserializeFromString(jsonParser, deserializationContext);
        }
        if (this._unwrapSingle == Boolean.TRUE || (this._unwrapSingle == null && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return handleSingleElementUnwrapped(jsonParser, deserializationContext);
        }
        return (T) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
    }

    protected void _failOnNull(DeserializationContext deserializationContext) throws IOException {
        throw abz.a(deserializationContext, null, deserializationContext.constructType(this._valueClass));
    }

    @JacksonStdImpl
    static final class e extends PrimitiveArrayDeserializers<char[]> {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        protected PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return this;
        }

        public e() {
            super(char[].class);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public char[] _constructEmpty() {
            return new char[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public char[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String text;
            if (jsonParser.hasToken(JsonToken.VALUE_STRING)) {
                char[] textCharacters = jsonParser.getTextCharacters();
                int textOffset = jsonParser.getTextOffset();
                int textLength = jsonParser.getTextLength();
                char[] cArr = new char[textLength];
                System.arraycopy(textCharacters, textOffset, cArr, 0, textLength);
                return cArr;
            }
            if (jsonParser.isExpectedStartArrayToken()) {
                StringBuilder sb = new StringBuilder(64);
                while (true) {
                    JsonToken jsonTokenNextToken = jsonParser.nextToken();
                    if (jsonTokenNextToken != JsonToken.END_ARRAY) {
                        if (jsonTokenNextToken == JsonToken.VALUE_STRING) {
                            text = jsonParser.getText();
                        } else if (jsonTokenNextToken == JsonToken.VALUE_NULL) {
                            if (this._nuller != null) {
                                this._nuller.getNullValue(deserializationContext);
                            } else {
                                _verifyNullForPrimitive(deserializationContext);
                                text = "\u0000";
                            }
                        } else {
                            text = ((CharSequence) deserializationContext.handleUnexpectedToken(Character.TYPE, jsonParser)).toString();
                        }
                        if (text.length() != 1) {
                            deserializationContext.reportInputMismatch(this, "Cannot convert a JSON String of length %d into a char element of char array", Integer.valueOf(text.length()));
                        }
                        sb.append(text.charAt(0));
                    } else {
                        return sb.toString().toCharArray();
                    }
                }
            } else {
                if (jsonParser.hasToken(JsonToken.VALUE_EMBEDDED_OBJECT)) {
                    Object embeddedObject = jsonParser.getEmbeddedObject();
                    if (embeddedObject == null) {
                        return null;
                    }
                    if (embeddedObject instanceof char[]) {
                        return (char[]) embeddedObject;
                    }
                    if (embeddedObject instanceof String) {
                        return ((String) embeddedObject).toCharArray();
                    }
                    if (embeddedObject instanceof byte[]) {
                        return wm.d().e((byte[]) embeddedObject, false).toCharArray();
                    }
                }
                return (char[]) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public char[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return (char[]) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public char[] _concat(char[] cArr, char[] cArr2) {
            int length = cArr.length;
            int length2 = cArr2.length;
            char[] cArrCopyOf = Arrays.copyOf(cArr, length + length2);
            System.arraycopy(cArr2, 0, cArrCopyOf, length, length2);
            return cArrCopyOf;
        }
    }

    @JacksonStdImpl
    static final class d extends PrimitiveArrayDeserializers<boolean[]> {
        private static final long serialVersionUID = 1;

        public d() {
            super(boolean[].class);
        }

        protected d(d dVar, NullValueProvider nullValueProvider, Boolean bool) {
            super(dVar, nullValueProvider, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        protected PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return new d(this, nullValueProvider, bool);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean[] _constructEmpty() {
            return new boolean[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            boolean z_parseBooleanPrimitive;
            int i;
            if (!jsonParser.isExpectedStartArrayToken()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            aht.a aVarB = deserializationContext.getArrayBuilders().b();
            boolean[] zArrResetAndStart = aVarB.resetAndStart();
            int i2 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenNextToken = jsonParser.nextToken();
                    if (jsonTokenNextToken != JsonToken.END_ARRAY) {
                        try {
                            if (jsonTokenNextToken == JsonToken.VALUE_TRUE) {
                                z_parseBooleanPrimitive = true;
                            } else {
                                if (jsonTokenNextToken != JsonToken.VALUE_FALSE) {
                                    if (jsonTokenNextToken == JsonToken.VALUE_NULL) {
                                        if (this._nuller != null) {
                                            this._nuller.getNullValue(deserializationContext);
                                        } else {
                                            _verifyNullForPrimitive(deserializationContext);
                                        }
                                    } else {
                                        z_parseBooleanPrimitive = _parseBooleanPrimitive(jsonParser, deserializationContext);
                                    }
                                }
                                z_parseBooleanPrimitive = false;
                            }
                            zArrResetAndStart[i2] = z_parseBooleanPrimitive;
                            i2 = i;
                        } catch (Exception e) {
                            e = e;
                            i2 = i;
                            throw ym.wrapWithPath(e, zArrResetAndStart, aVarB.bufferedSize() + i2);
                        }
                        if (i2 >= zArrResetAndStart.length) {
                            boolean[] zArrAppendCompletedChunk = aVarB.appendCompletedChunk(zArrResetAndStart, i2);
                            i2 = 0;
                            zArrResetAndStart = zArrAppendCompletedChunk;
                        }
                        i = i2 + 1;
                    } else {
                        return aVarB.completeAndClearBuffer(zArrResetAndStart, i2);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new boolean[]{_parseBooleanPrimitive(jsonParser, deserializationContext)};
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean[] _concat(boolean[] zArr, boolean[] zArr2) {
            int length = zArr.length;
            int length2 = zArr2.length;
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
            System.arraycopy(zArr2, 0, zArrCopyOf, length, length2);
            return zArrCopyOf;
        }
    }

    @JacksonStdImpl
    static final class c extends PrimitiveArrayDeserializers<byte[]> {
        private static final long serialVersionUID = 1;

        public c() {
            super(byte[].class);
        }

        protected c(c cVar, NullValueProvider nullValueProvider, Boolean bool) {
            super(cVar, nullValueProvider, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        protected PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return new c(this, nullValueProvider, bool);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public byte[] _constructEmpty() {
            return new byte[0];
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers, com.fasterxml.jackson.databind.JsonDeserializer
        public LogicalType logicalType() {
            return LogicalType.Binary;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            byte byteValue;
            int i;
            JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
            if (jsonTokenCurrentToken == JsonToken.VALUE_STRING) {
                try {
                    return jsonParser.getBinaryValue(deserializationContext.getBase64Variant());
                } catch (wn e) {
                    String originalMessage = e.getOriginalMessage();
                    if (originalMessage.contains("base64")) {
                        return (byte[]) deserializationContext.handleWeirdStringValue(byte[].class, jsonParser.getText(), originalMessage, new Object[0]);
                    }
                }
            }
            if (jsonTokenCurrentToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object embeddedObject = jsonParser.getEmbeddedObject();
                if (embeddedObject == null) {
                    return null;
                }
                if (embeddedObject instanceof byte[]) {
                    return (byte[]) embeddedObject;
                }
            }
            if (!jsonParser.isExpectedStartArrayToken()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            aht.d dVarE = deserializationContext.getArrayBuilders().e();
            byte[] bArrResetAndStart = dVarE.resetAndStart();
            int i2 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenNextToken = jsonParser.nextToken();
                    if (jsonTokenNextToken != JsonToken.END_ARRAY) {
                        try {
                            if (jsonTokenNextToken == JsonToken.VALUE_NUMBER_INT) {
                                byteValue = jsonParser.getByteValue();
                            } else if (jsonTokenNextToken == JsonToken.VALUE_NULL) {
                                if (this._nuller != null) {
                                    this._nuller.getNullValue(deserializationContext);
                                } else {
                                    _verifyNullForPrimitive(deserializationContext);
                                    byteValue = 0;
                                }
                            } else {
                                byteValue = _parseBytePrimitive(jsonParser, deserializationContext);
                            }
                            bArrResetAndStart[i2] = byteValue;
                            i2 = i;
                        } catch (Exception e2) {
                            e = e2;
                            i2 = i;
                            throw ym.wrapWithPath(e, bArrResetAndStart, dVarE.bufferedSize() + i2);
                        }
                        if (i2 >= bArrResetAndStart.length) {
                            byte[] bArrAppendCompletedChunk = dVarE.appendCompletedChunk(bArrResetAndStart, i2);
                            i2 = 0;
                            bArrResetAndStart = bArrAppendCompletedChunk;
                        }
                        i = i2 + 1;
                    } else {
                        return dVarE.completeAndClearBuffer(bArrResetAndStart, i2);
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            byte bByteValue;
            JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
            if (jsonTokenCurrentToken == JsonToken.VALUE_NUMBER_INT) {
                bByteValue = jsonParser.getByteValue();
            } else {
                if (jsonTokenCurrentToken == JsonToken.VALUE_NULL) {
                    if (this._nuller != null) {
                        this._nuller.getNullValue(deserializationContext);
                        return (byte[]) getEmptyValue(deserializationContext);
                    }
                    _verifyNullForPrimitive(deserializationContext);
                    return null;
                }
                bByteValue = ((Number) deserializationContext.handleUnexpectedToken(this._valueClass.getComponentType(), jsonParser)).byteValue();
            }
            return new byte[]{bByteValue};
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public byte[] _concat(byte[] bArr, byte[] bArr2) {
            int length = bArr.length;
            int length2 = bArr2.length;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
            System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
            return bArrCopyOf;
        }
    }

    @JacksonStdImpl
    static final class h extends PrimitiveArrayDeserializers<short[]> {
        private static final long serialVersionUID = 1;

        public h() {
            super(short[].class);
        }

        protected h(h hVar, NullValueProvider nullValueProvider, Boolean bool) {
            super(hVar, nullValueProvider, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        protected PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return new h(this, nullValueProvider, bool);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public short[] _constructEmpty() {
            return new short[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public short[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            short s_parseShortPrimitive;
            int i;
            if (!jsonParser.isExpectedStartArrayToken()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            aht.h hVarF = deserializationContext.getArrayBuilders().f();
            short[] sArrResetAndStart = hVarF.resetAndStart();
            int i2 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenNextToken = jsonParser.nextToken();
                    if (jsonTokenNextToken != JsonToken.END_ARRAY) {
                        try {
                            if (jsonTokenNextToken == JsonToken.VALUE_NULL) {
                                if (this._nuller != null) {
                                    this._nuller.getNullValue(deserializationContext);
                                } else {
                                    _verifyNullForPrimitive(deserializationContext);
                                    s_parseShortPrimitive = 0;
                                }
                            } else {
                                s_parseShortPrimitive = _parseShortPrimitive(jsonParser, deserializationContext);
                            }
                            sArrResetAndStart[i2] = s_parseShortPrimitive;
                            i2 = i;
                        } catch (Exception e) {
                            e = e;
                            i2 = i;
                            throw ym.wrapWithPath(e, sArrResetAndStart, hVarF.bufferedSize() + i2);
                        }
                        if (i2 >= sArrResetAndStart.length) {
                            short[] sArrAppendCompletedChunk = hVarF.appendCompletedChunk(sArrResetAndStart, i2);
                            i2 = 0;
                            sArrResetAndStart = sArrAppendCompletedChunk;
                        }
                        i = i2 + 1;
                    } else {
                        return hVarF.completeAndClearBuffer(sArrResetAndStart, i2);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public short[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new short[]{_parseShortPrimitive(jsonParser, deserializationContext)};
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public short[] _concat(short[] sArr, short[] sArr2) {
            int length = sArr.length;
            int length2 = sArr2.length;
            short[] sArrCopyOf = Arrays.copyOf(sArr, length + length2);
            System.arraycopy(sArr2, 0, sArrCopyOf, length, length2);
            return sArrCopyOf;
        }
    }

    @JacksonStdImpl
    static final class i extends PrimitiveArrayDeserializers<int[]> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f4143b = new i();
        private static final long serialVersionUID = 1;

        public i() {
            super(int[].class);
        }

        protected i(i iVar, NullValueProvider nullValueProvider, Boolean bool) {
            super(iVar, nullValueProvider, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        protected PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return new i(this, nullValueProvider, bool);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int[] _constructEmpty() {
            return new int[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            int intValue;
            int i;
            if (!jsonParser.isExpectedStartArrayToken()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            aht.b bVarD = deserializationContext.getArrayBuilders().d();
            int[] iArr = (int[]) bVarD.resetAndStart();
            int i2 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenNextToken = jsonParser.nextToken();
                    if (jsonTokenNextToken != JsonToken.END_ARRAY) {
                        try {
                            if (jsonTokenNextToken == JsonToken.VALUE_NUMBER_INT) {
                                intValue = jsonParser.getIntValue();
                            } else if (jsonTokenNextToken == JsonToken.VALUE_NULL) {
                                if (this._nuller != null) {
                                    this._nuller.getNullValue(deserializationContext);
                                } else {
                                    _verifyNullForPrimitive(deserializationContext);
                                    intValue = 0;
                                }
                            } else {
                                intValue = _parseIntPrimitive(jsonParser, deserializationContext);
                            }
                            iArr[i2] = intValue;
                            i2 = i;
                        } catch (Exception e) {
                            e = e;
                            i2 = i;
                            throw ym.wrapWithPath(e, iArr, bVarD.bufferedSize() + i2);
                        }
                        if (i2 >= iArr.length) {
                            int[] iArr2 = (int[]) bVarD.appendCompletedChunk(iArr, i2);
                            i2 = 0;
                            iArr = iArr2;
                        }
                        i = i2 + 1;
                    } else {
                        return (int[]) bVarD.completeAndClearBuffer(iArr, i2);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new int[]{_parseIntPrimitive(jsonParser, deserializationContext)};
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int[] _concat(int[] iArr, int[] iArr2) {
            int length = iArr.length;
            int length2 = iArr2.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
            System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
            return iArrCopyOf;
        }
    }

    @JacksonStdImpl
    static final class f extends PrimitiveArrayDeserializers<long[]> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f4142c = new f();
        private static final long serialVersionUID = 1;

        public f() {
            super(long[].class);
        }

        protected f(f fVar, NullValueProvider nullValueProvider, Boolean bool) {
            super(fVar, nullValueProvider, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        protected PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return new f(this, nullValueProvider, bool);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public long[] _constructEmpty() {
            return new long[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public long[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            long longValue;
            int i;
            if (!jsonParser.isExpectedStartArrayToken()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            aht.j jVarJ = deserializationContext.getArrayBuilders().j();
            long[] jArr = (long[]) jVarJ.resetAndStart();
            int i2 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenNextToken = jsonParser.nextToken();
                    if (jsonTokenNextToken != JsonToken.END_ARRAY) {
                        try {
                            if (jsonTokenNextToken == JsonToken.VALUE_NUMBER_INT) {
                                longValue = jsonParser.getLongValue();
                            } else if (jsonTokenNextToken == JsonToken.VALUE_NULL) {
                                if (this._nuller != null) {
                                    this._nuller.getNullValue(deserializationContext);
                                } else {
                                    _verifyNullForPrimitive(deserializationContext);
                                    longValue = 0;
                                }
                            } else {
                                longValue = _parseLongPrimitive(jsonParser, deserializationContext);
                            }
                            jArr[i2] = longValue;
                            i2 = i;
                        } catch (Exception e) {
                            e = e;
                            i2 = i;
                            throw ym.wrapWithPath(e, jArr, jVarJ.bufferedSize() + i2);
                        }
                        if (i2 >= jArr.length) {
                            long[] jArr2 = (long[]) jVarJ.appendCompletedChunk(jArr, i2);
                            i2 = 0;
                            jArr = jArr2;
                        }
                        i = i2 + 1;
                    } else {
                        return (long[]) jVarJ.completeAndClearBuffer(jArr, i2);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public long[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new long[]{_parseLongPrimitive(jsonParser, deserializationContext)};
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public long[] _concat(long[] jArr, long[] jArr2) {
            int length = jArr.length;
            int length2 = jArr2.length;
            long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
            System.arraycopy(jArr2, 0, jArrCopyOf, length, length2);
            return jArrCopyOf;
        }
    }

    @JacksonStdImpl
    static final class a extends PrimitiveArrayDeserializers<float[]> {
        private static final long serialVersionUID = 1;

        public a() {
            super(float[].class);
        }

        protected a(a aVar, NullValueProvider nullValueProvider, Boolean bool) {
            super(aVar, nullValueProvider, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        protected PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return new a(this, nullValueProvider, bool);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public float[] _constructEmpty() {
            return new float[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (!jsonParser.isExpectedStartArrayToken()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            aht.e eVarC = deserializationContext.getArrayBuilders().c();
            float[] fArr = (float[]) eVarC.resetAndStart();
            int i = 0;
            while (true) {
                try {
                    JsonToken jsonTokenNextToken = jsonParser.nextToken();
                    if (jsonTokenNextToken != JsonToken.END_ARRAY) {
                        if (jsonTokenNextToken == JsonToken.VALUE_NULL && this._nuller != null) {
                            this._nuller.getNullValue(deserializationContext);
                        } else {
                            float f_parseFloatPrimitive = _parseFloatPrimitive(jsonParser, deserializationContext);
                            if (i >= fArr.length) {
                                float[] fArr2 = (float[]) eVarC.appendCompletedChunk(fArr, i);
                                i = 0;
                                fArr = fArr2;
                            }
                            int i2 = i + 1;
                            try {
                                fArr[i] = f_parseFloatPrimitive;
                                i = i2;
                            } catch (Exception e) {
                                e = e;
                                i = i2;
                                throw ym.wrapWithPath(e, fArr, eVarC.bufferedSize() + i);
                            }
                        }
                    } else {
                        return (float[]) eVarC.completeAndClearBuffer(fArr, i);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public float[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new float[]{_parseFloatPrimitive(jsonParser, deserializationContext)};
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float[] _concat(float[] fArr, float[] fArr2) {
            int length = fArr.length;
            int length2 = fArr2.length;
            float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
            System.arraycopy(fArr2, 0, fArrCopyOf, length, length2);
            return fArrCopyOf;
        }
    }

    @JacksonStdImpl
    static final class b extends PrimitiveArrayDeserializers<double[]> {
        private static final long serialVersionUID = 1;

        public b() {
            super(double[].class);
        }

        protected b(b bVar, NullValueProvider nullValueProvider, Boolean bool) {
            super(bVar, nullValueProvider, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        protected PrimitiveArrayDeserializers<?> withResolved(NullValueProvider nullValueProvider, Boolean bool) {
            return new b(this, nullValueProvider, bool);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public double[] _constructEmpty() {
            return new double[0];
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public double[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (!jsonParser.isExpectedStartArrayToken()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            aht.c cVarA = deserializationContext.getArrayBuilders().a();
            double[] dArr = (double[]) cVarA.resetAndStart();
            int i = 0;
            while (true) {
                try {
                    JsonToken jsonTokenNextToken = jsonParser.nextToken();
                    if (jsonTokenNextToken != JsonToken.END_ARRAY) {
                        if (jsonTokenNextToken == JsonToken.VALUE_NULL && this._nuller != null) {
                            this._nuller.getNullValue(deserializationContext);
                        } else {
                            double d_parseDoublePrimitive = _parseDoublePrimitive(jsonParser, deserializationContext);
                            if (i >= dArr.length) {
                                double[] dArr2 = (double[]) cVarA.appendCompletedChunk(dArr, i);
                                i = 0;
                                dArr = dArr2;
                            }
                            int i2 = i + 1;
                            try {
                                dArr[i] = d_parseDoublePrimitive;
                                i = i2;
                            } catch (Exception e) {
                                e = e;
                                i = i2;
                                throw ym.wrapWithPath(e, dArr, cVarA.bufferedSize() + i);
                            }
                        }
                    } else {
                        return (double[]) cVarA.completeAndClearBuffer(dArr, i);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public double[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new double[]{_parseDoublePrimitive(jsonParser, deserializationContext)};
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public double[] _concat(double[] dArr, double[] dArr2) {
            int length = dArr.length;
            int length2 = dArr2.length;
            double[] dArrCopyOf = Arrays.copyOf(dArr, length + length2);
            System.arraycopy(dArr2, 0, dArrCopyOf, length, length2);
            return dArrCopyOf;
        }
    }
}
