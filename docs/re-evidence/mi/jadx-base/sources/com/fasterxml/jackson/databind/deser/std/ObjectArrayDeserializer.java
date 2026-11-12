package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.util.AccessPattern;
import defpackage.aj4;
import defpackage.esd;
import defpackage.q4q;
import defpackage.qqd;
import defpackage.u3h;
import defpackage.z1h;
import java.io.IOException;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public class ObjectArrayDeserializer extends ContainerDeserializerBase<Object[]> implements aj4 {
    protected static final Object[] NO_OBJECTS = new Object[0];
    private static final long serialVersionUID = 1;
    protected final Class<?> _elementClass;
    protected esd<Object> _elementDeserializer;
    protected final q4q _elementTypeDeserializer;
    protected final boolean _untyped;

    public ObjectArrayDeserializer(JavaType javaType, esd<Object> esdVar, q4q q4qVar) {
        super(javaType, (z1h) null, (Boolean) null);
        Class<?> rawClass = javaType.getContentType().getRawClass();
        this._elementClass = rawClass;
        this._untyped = rawClass == Object.class;
        this._elementDeserializer = esdVar;
        this._elementTypeDeserializer = q4qVar;
    }

    @Override // defpackage.aj4
    public esd<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        esd<?> esdVar = this._elementDeserializer;
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, this._containerType.getRawClass(), JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        esd<?> esdVarFindConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, esdVar);
        JavaType contentType = this._containerType.getContentType();
        esd<?> esdVarFindContextualValueDeserializer = esdVarFindConvertingContentDeserializer == null ? deserializationContext.findContextualValueDeserializer(contentType, beanProperty) : deserializationContext.handleSecondaryContextualization(esdVarFindConvertingContentDeserializer, beanProperty, contentType);
        q4q q4qVarForProperty = this._elementTypeDeserializer;
        if (q4qVarForProperty != null) {
            q4qVarForProperty = q4qVarForProperty.forProperty(beanProperty);
        }
        return withResolved(q4qVarForProperty, esdVarFindContextualValueDeserializer, findContentNullProvider(deserializationContext, beanProperty, esdVarFindContextualValueDeserializer), boolFindFormatFeature);
    }

    public Byte[] deserializeFromBase64(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        byte[] bArrS = jsonParser.s(deserializationContext.getBase64Variant());
        Byte[] bArr = new Byte[bArrS.length];
        int length = bArrS.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = Byte.valueOf(bArrS[i]);
        }
        return bArr;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public esd<Object> getContentDeserializer() {
        return this._elementDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, defpackage.esd
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, defpackage.esd
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return NO_OBJECTS;
    }

    public Object[] handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objDeserialize;
        JsonToken jsonToken = JsonToken.VALUE_STRING;
        if (jsonParser.y0(jsonToken) && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.d0().length() == 0) {
            return null;
        }
        Boolean bool = this._unwrapSingle;
        if (bool != Boolean.TRUE && (bool != null || !deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return (jsonParser.K() == jsonToken && this._elementClass == Byte.class) ? deserializeFromBase64(jsonParser, deserializationContext) : (Object[]) deserializationContext.handleUnexpectedToken(this._containerType.getRawClass(), jsonParser);
        }
        if (jsonParser.K() != JsonToken.VALUE_NULL) {
            q4q q4qVar = this._elementTypeDeserializer;
            objDeserialize = q4qVar == null ? this._elementDeserializer.deserialize(jsonParser, deserializationContext) : this._elementDeserializer.deserializeWithType(jsonParser, deserializationContext, q4qVar);
        } else {
            if (this._skipNullValues) {
                return NO_OBJECTS;
            }
            objDeserialize = this._nullProvider.getNullValue(deserializationContext);
        }
        Object[] objArr = this._untyped ? new Object[1] : (Object[]) Array.newInstance(this._elementClass, 1);
        objArr[0] = objDeserialize;
        return objArr;
    }

    @Override // defpackage.esd
    public boolean isCachable() {
        return this._elementDeserializer == null && this._elementTypeDeserializer == null;
    }

    public ObjectArrayDeserializer withDeserializer(q4q q4qVar, esd<?> esdVar) {
        return withResolved(q4qVar, esdVar, this._nullProvider, this._unwrapSingle);
    }

    public ObjectArrayDeserializer withResolved(q4q q4qVar, esd<?> esdVar, z1h z1hVar, Boolean bool) {
        return (bool == this._unwrapSingle && z1hVar == this._nullProvider && esdVar == this._elementDeserializer && q4qVar == this._elementTypeDeserializer) ? this : new ObjectArrayDeserializer(this, esdVar, q4qVar, z1hVar, bool);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, defpackage.esd
    public Object[] deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
        return (Object[]) q4qVar.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    @Override // defpackage.esd
    public Object[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object[] objArrG;
        Object objDeserializeWithType;
        int i;
        if (!jsonParser.B0()) {
            return handleNonArray(jsonParser, deserializationContext);
        }
        u3h u3hVarLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] objArrI = u3hVarLeaseObjectBuffer.i();
        q4q q4qVar = this._elementTypeDeserializer;
        int i2 = 0;
        while (true) {
            try {
                JsonToken jsonTokenG0 = jsonParser.G0();
                if (jsonTokenG0 == JsonToken.END_ARRAY) {
                    break;
                }
                try {
                    if (jsonTokenG0 == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else if (q4qVar == null) {
                        objDeserializeWithType = this._elementDeserializer.deserialize(jsonParser, deserializationContext);
                    } else {
                        objDeserializeWithType = this._elementDeserializer.deserializeWithType(jsonParser, deserializationContext, q4qVar);
                    }
                    objArrI[i2] = objDeserializeWithType;
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
        if (this._untyped) {
            objArrG = u3hVarLeaseObjectBuffer.f(objArrI, i2);
        } else {
            objArrG = u3hVarLeaseObjectBuffer.g(objArrI, i2, this._elementClass);
        }
        deserializationContext.returnObjectBuffer(u3hVarLeaseObjectBuffer);
        return objArrG;
    }

    public ObjectArrayDeserializer(ObjectArrayDeserializer objectArrayDeserializer, esd<Object> esdVar, q4q q4qVar, z1h z1hVar, Boolean bool) {
        super(objectArrayDeserializer, z1hVar, bool);
        this._elementClass = objectArrayDeserializer._elementClass;
        this._untyped = objectArrayDeserializer._untyped;
        this._elementDeserializer = esdVar;
        this._elementTypeDeserializer = q4qVar;
    }

    @Override // defpackage.esd
    public Object[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object[] objArr) throws IOException {
        Object[] objArrG;
        Object objDeserializeWithType;
        int i;
        if (!jsonParser.B0()) {
            Object[] objArrHandleNonArray = handleNonArray(jsonParser, deserializationContext);
            if (objArrHandleNonArray == null) {
                return objArr;
            }
            int length = objArr.length;
            Object[] objArr2 = new Object[objArrHandleNonArray.length + length];
            System.arraycopy(objArr, 0, objArr2, 0, length);
            System.arraycopy(objArrHandleNonArray, 0, objArr2, length, objArrHandleNonArray.length);
            return objArr2;
        }
        u3h u3hVarLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        int length2 = objArr.length;
        Object[] objArrJ = u3hVarLeaseObjectBuffer.j(objArr, length2);
        q4q q4qVar = this._elementTypeDeserializer;
        while (true) {
            try {
                JsonToken jsonTokenG0 = jsonParser.G0();
                if (jsonTokenG0 == JsonToken.END_ARRAY) {
                    break;
                }
                try {
                    if (jsonTokenG0 == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else if (q4qVar == null) {
                        objDeserializeWithType = this._elementDeserializer.deserialize(jsonParser, deserializationContext);
                    } else {
                        objDeserializeWithType = this._elementDeserializer.deserializeWithType(jsonParser, deserializationContext, q4qVar);
                    }
                    objArrJ[length2] = objDeserializeWithType;
                    length2 = i;
                } catch (Exception e) {
                    e = e;
                    length2 = i;
                    throw JsonMappingException.wrapWithPath(e, objArrJ, u3hVarLeaseObjectBuffer.d() + length2);
                }
                if (length2 >= objArrJ.length) {
                    objArrJ = u3hVarLeaseObjectBuffer.c(objArrJ);
                    length2 = 0;
                }
                i = length2 + 1;
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (this._untyped) {
            objArrG = u3hVarLeaseObjectBuffer.f(objArrJ, length2);
        } else {
            objArrG = u3hVarLeaseObjectBuffer.g(objArrJ, length2, this._elementClass);
        }
        deserializationContext.returnObjectBuffer(u3hVarLeaseObjectBuffer);
        return objArrG;
    }
}
