package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.util.AccessPattern;
import defpackage.aj4;
import defpackage.esd;
import defpackage.q4q;
import defpackage.qqd;
import defpackage.u3h;
import defpackage.z1h;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public final class StringArrayDeserializer extends StdDeserializer<String[]> implements aj4 {
    private static final String[] NO_STRINGS = new String[0];
    public static final StringArrayDeserializer instance = new StringArrayDeserializer();
    private static final long serialVersionUID = 2;
    protected esd<String> _elementDeserializer;
    protected final z1h _nullProvider;
    protected final boolean _skipNullValues;
    protected final Boolean _unwrapSingle;

    public StringArrayDeserializer() {
        this(null, null, null);
    }

    private final String[] handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Boolean bool = this._unwrapSingle;
        if (bool == Boolean.TRUE || (bool == null && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return new String[]{jsonParser.y0(JsonToken.VALUE_NULL) ? (String) this._nullProvider.getNullValue(deserializationContext) : _parseString(jsonParser, deserializationContext)};
        }
        if (jsonParser.y0(JsonToken.VALUE_STRING) && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.d0().length() == 0) {
            return null;
        }
        return (String[]) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
    }

    public final String[] _deserializeCustom(JsonParser jsonParser, DeserializationContext deserializationContext, String[] strArr) throws IOException {
        int length;
        Object[] objArrJ;
        String strDeserialize;
        int i;
        u3h u3hVarLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        if (strArr == null) {
            objArrJ = u3hVarLeaseObjectBuffer.i();
            length = 0;
        } else {
            length = strArr.length;
            objArrJ = u3hVarLeaseObjectBuffer.j(strArr, length);
        }
        esd<String> esdVar = this._elementDeserializer;
        while (true) {
            try {
                try {
                    if (jsonParser.F0() == null) {
                        JsonToken jsonTokenK = jsonParser.K();
                        if (jsonTokenK == JsonToken.END_ARRAY) {
                            String[] strArr2 = (String[]) u3hVarLeaseObjectBuffer.g(objArrJ, length, String.class);
                            deserializationContext.returnObjectBuffer(u3hVarLeaseObjectBuffer);
                            return strArr2;
                        }
                        if (jsonTokenK != JsonToken.VALUE_NULL) {
                            strDeserialize = esdVar.deserialize(jsonParser, deserializationContext);
                        } else if (!this._skipNullValues) {
                            strDeserialize = (String) this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else {
                        strDeserialize = esdVar.deserialize(jsonParser, deserializationContext);
                    }
                    objArrJ[length] = strDeserialize;
                    length = i;
                } catch (Exception e) {
                    e = e;
                    length = i;
                    throw JsonMappingException.wrapWithPath(e, String.class, length);
                }
                if (length >= objArrJ.length) {
                    objArrJ = u3hVarLeaseObjectBuffer.c(objArrJ);
                    length = 0;
                }
                i = length + 1;
            } catch (Exception e2) {
                e = e2;
            }
        }
    }

    @Override // defpackage.aj4
    public esd<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        esd<?> esdVarFindConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, this._elementDeserializer);
        JavaType javaTypeConstructType = deserializationContext.constructType(String.class);
        esd<?> esdVarFindContextualValueDeserializer = esdVarFindConvertingContentDeserializer == null ? deserializationContext.findContextualValueDeserializer(javaTypeConstructType, beanProperty) : deserializationContext.handleSecondaryContextualization(esdVarFindConvertingContentDeserializer, beanProperty, javaTypeConstructType);
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, String[].class, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        z1h z1hVarFindContentNullProvider = findContentNullProvider(deserializationContext, beanProperty, esdVarFindContextualValueDeserializer);
        if (esdVarFindContextualValueDeserializer != null && isDefaultDeserializer(esdVarFindContextualValueDeserializer)) {
            esdVarFindContextualValueDeserializer = null;
        }
        return (this._elementDeserializer == esdVarFindContextualValueDeserializer && this._unwrapSingle == boolFindFormatFeature && this._nullProvider == z1hVarFindContentNullProvider) ? this : new StringArrayDeserializer(esdVarFindContextualValueDeserializer, z1hVarFindContentNullProvider, boolFindFormatFeature);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, defpackage.esd
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
        return q4qVar.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    @Override // defpackage.esd
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    @Override // defpackage.esd
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return NO_STRINGS;
    }

    @Override // defpackage.esd
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StringArrayDeserializer(esd<?> esdVar, z1h z1hVar, Boolean bool) {
        super((Class<?>) String[].class);
        this._elementDeserializer = esdVar;
        this._nullProvider = z1hVar;
        this._unwrapSingle = bool;
        this._skipNullValues = NullsConstantProvider.isSkipper(z1hVar);
    }

    @Override // defpackage.esd
    public String[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int i;
        if (!jsonParser.B0()) {
            return handleNonArray(jsonParser, deserializationContext);
        }
        if (this._elementDeserializer != null) {
            return _deserializeCustom(jsonParser, deserializationContext, null);
        }
        u3h u3hVarLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] objArrI = u3hVarLeaseObjectBuffer.i();
        int i2 = 0;
        while (true) {
            try {
                String strF0 = jsonParser.F0();
                try {
                    if (strF0 == null) {
                        JsonToken jsonTokenK = jsonParser.K();
                        if (jsonTokenK == JsonToken.END_ARRAY) {
                            String[] strArr = (String[]) u3hVarLeaseObjectBuffer.g(objArrI, i2, String.class);
                            deserializationContext.returnObjectBuffer(u3hVarLeaseObjectBuffer);
                            return strArr;
                        }
                        if (jsonTokenK == JsonToken.VALUE_NULL) {
                            if (!this._skipNullValues) {
                                strF0 = (String) this._nullProvider.getNullValue(deserializationContext);
                            }
                        } else {
                            strF0 = _parseString(jsonParser, deserializationContext);
                        }
                    }
                    objArrI[i2] = strF0;
                    i2 = i;
                } catch (Exception e) {
                    e = e;
                    i2 = i;
                    throw JsonMappingException.wrapWithPath(e, objArrI, u3hVarLeaseObjectBuffer.d() + i2);
                }
                if (i2 >= objArrI.length) {
                    objArrI = u3hVarLeaseObjectBuffer.c(objArrI);
                    i2 = 0;
                }
                i = i2 + 1;
            } catch (Exception e2) {
                e = e2;
            }
        }
    }

    @Override // defpackage.esd
    public String[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, String[] strArr) throws IOException {
        if (!jsonParser.B0()) {
            String[] strArrHandleNonArray = handleNonArray(jsonParser, deserializationContext);
            if (strArrHandleNonArray == null) {
                return strArr;
            }
            int length = strArr.length;
            String[] strArr2 = new String[strArrHandleNonArray.length + length];
            System.arraycopy(strArr, 0, strArr2, 0, length);
            System.arraycopy(strArrHandleNonArray, 0, strArr2, length, strArrHandleNonArray.length);
            return strArr2;
        }
        if (this._elementDeserializer != null) {
            return _deserializeCustom(jsonParser, deserializationContext, strArr);
        }
        u3h u3hVarLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        int length2 = strArr.length;
        Object[] objArrJ = u3hVarLeaseObjectBuffer.j(strArr, length2);
        while (true) {
            try {
                String strF0 = jsonParser.F0();
                if (strF0 == null) {
                    JsonToken jsonTokenK = jsonParser.K();
                    if (jsonTokenK == JsonToken.END_ARRAY) {
                        String[] strArr3 = (String[]) u3hVarLeaseObjectBuffer.g(objArrJ, length2, String.class);
                        deserializationContext.returnObjectBuffer(u3hVarLeaseObjectBuffer);
                        return strArr3;
                    }
                    if (jsonTokenK == JsonToken.VALUE_NULL) {
                        if (this._skipNullValues) {
                            return NO_STRINGS;
                        }
                        strF0 = (String) this._nullProvider.getNullValue(deserializationContext);
                    } else {
                        strF0 = _parseString(jsonParser, deserializationContext);
                    }
                    throw JsonMappingException.wrapWithPath(e, objArrJ, u3hVarLeaseObjectBuffer.d() + length2);
                }
                if (length2 >= objArrJ.length) {
                    objArrJ = u3hVarLeaseObjectBuffer.c(objArrJ);
                    length2 = 0;
                }
                int i = length2 + 1;
                try {
                    objArrJ[length2] = strF0;
                    length2 = i;
                } catch (Exception e) {
                    e = e;
                    length2 = i;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
    }
}
