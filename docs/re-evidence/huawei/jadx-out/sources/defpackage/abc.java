package defpackage;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
@JacksonStdImpl
public class abc extends ContainerDeserializerBase<Object[]> implements ContextualDeserializer {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected JsonDeserializer<Object> f200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Object[] f201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final boolean f202c;
    protected final Class<?> d;
    protected final TypeDeserializer e;

    public abc(JavaType javaType, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer) {
        super(javaType, (NullValueProvider) null, (Boolean) null);
        ahe aheVar = (ahe) javaType;
        Class<?> rawClass = aheVar.getContentType().getRawClass();
        this.d = rawClass;
        this.f202c = rawClass == Object.class;
        this.f200a = jsonDeserializer;
        this.e = typeDeserializer;
        this.f201b = aheVar.d();
    }

    protected abc(abc abcVar, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider, Boolean bool) {
        super(abcVar, nullValueProvider, bool);
        this.d = abcVar.d;
        this.f202c = abcVar.f202c;
        this.f201b = abcVar.f201b;
        this.f200a = jsonDeserializer;
        this.e = typeDeserializer;
    }

    public abc c(TypeDeserializer typeDeserializer, JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider, Boolean bool) {
        return (Objects.equals(bool, this._unwrapSingle) && nullValueProvider == this._nullProvider && jsonDeserializer == this.f200a && typeDeserializer == this.e) ? this : new abc(this, jsonDeserializer, typeDeserializer, nullValueProvider, bool);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return this.f200a == null && this.e == null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Array;
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws ym {
        JsonDeserializer<?> jsonDeserializerHandleSecondaryContextualization;
        JsonDeserializer<?> jsonDeserializer = this.f200a;
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, this._containerType.getRawClass(), JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        JsonDeserializer<?> jsonDeserializerFindConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, jsonDeserializer);
        JavaType contentType = this._containerType.getContentType();
        if (jsonDeserializerFindConvertingContentDeserializer == null) {
            jsonDeserializerHandleSecondaryContextualization = deserializationContext.findContextualValueDeserializer(contentType, beanProperty);
        } else {
            jsonDeserializerHandleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(jsonDeserializerFindConvertingContentDeserializer, beanProperty, contentType);
        }
        TypeDeserializer typeDeserializerForProperty = this.e;
        if (typeDeserializerForProperty != null) {
            typeDeserializerForProperty = typeDeserializerForProperty.forProperty(beanProperty);
        }
        return c(typeDeserializerForProperty, jsonDeserializerHandleSecondaryContextualization, findContentNullProvider(deserializationContext, beanProperty, jsonDeserializerHandleSecondaryContextualization), boolFindFormatFeature);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public JsonDeserializer<Object> getContentDeserializer() {
        return this.f200a;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) throws ym {
        return this.f201b;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object[] objArrA;
        Object objDeserializeWithType;
        int i;
        if (!jsonParser.isExpectedStartArrayToken()) {
            return b(jsonParser, deserializationContext);
        }
        aib aibVarLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] objArrD = aibVarLeaseObjectBuffer.d();
        TypeDeserializer typeDeserializer = this.e;
        int i2 = 0;
        while (true) {
            try {
                JsonToken jsonTokenNextToken = jsonParser.nextToken();
                if (jsonTokenNextToken == JsonToken.END_ARRAY) {
                    break;
                }
                try {
                    if (jsonTokenNextToken == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else if (typeDeserializer == null) {
                        objDeserializeWithType = this.f200a.deserialize(jsonParser, deserializationContext);
                    } else {
                        objDeserializeWithType = this.f200a.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                    }
                    objArrD[i2] = objDeserializeWithType;
                    i2 = i;
                } catch (Exception e) {
                    e = e;
                    i2 = i;
                    throw ym.wrapWithPath(e, objArrD, aibVarLeaseObjectBuffer.c() + i2);
                }
                if (i2 >= objArrD.length) {
                    objArrD = aibVarLeaseObjectBuffer.d(objArrD);
                    i2 = 0;
                }
                i = i2 + 1;
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (this.f202c) {
            objArrA = aibVarLeaseObjectBuffer.c(objArrD, i2);
        } else {
            objArrA = aibVarLeaseObjectBuffer.a(objArrD, i2, this.d);
        }
        deserializationContext.returnObjectBuffer(aibVarLeaseObjectBuffer);
        return objArrA;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object[] deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return (Object[]) typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Object[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object[] objArr) throws IOException {
        Object[] objArrA;
        Object objDeserializeWithType;
        int i;
        if (!jsonParser.isExpectedStartArrayToken()) {
            Object[] objArrB = b(jsonParser, deserializationContext);
            if (objArrB == null) {
                return objArr;
            }
            int length = objArr.length;
            Object[] objArr2 = new Object[objArrB.length + length];
            System.arraycopy(objArr, 0, objArr2, 0, length);
            System.arraycopy(objArrB, 0, objArr2, length, objArrB.length);
            return objArr2;
        }
        aib aibVarLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        int length2 = objArr.length;
        Object[] objArrD = aibVarLeaseObjectBuffer.d(objArr, length2);
        TypeDeserializer typeDeserializer = this.e;
        while (true) {
            try {
                JsonToken jsonTokenNextToken = jsonParser.nextToken();
                if (jsonTokenNextToken == JsonToken.END_ARRAY) {
                    break;
                }
                try {
                    if (jsonTokenNextToken == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else if (typeDeserializer == null) {
                        objDeserializeWithType = this.f200a.deserialize(jsonParser, deserializationContext);
                    } else {
                        objDeserializeWithType = this.f200a.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
                    }
                    objArrD[length2] = objDeserializeWithType;
                    length2 = i;
                } catch (Exception e) {
                    e = e;
                    length2 = i;
                    throw ym.wrapWithPath(e, objArrD, aibVarLeaseObjectBuffer.c() + length2);
                }
                if (length2 >= objArrD.length) {
                    objArrD = aibVarLeaseObjectBuffer.d(objArrD);
                    length2 = 0;
                }
                i = length2 + 1;
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (this.f202c) {
            objArrA = aibVarLeaseObjectBuffer.c(objArrD, length2);
        } else {
            objArrA = aibVarLeaseObjectBuffer.a(objArrD, length2, this.d);
        }
        deserializationContext.returnObjectBuffer(aibVarLeaseObjectBuffer);
        return objArrA;
    }

    protected Byte[] c(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        byte[] binaryValue = jsonParser.getBinaryValue(deserializationContext.getBase64Variant());
        Byte[] bArr = new Byte[binaryValue.length];
        int length = binaryValue.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = Byte.valueOf(binaryValue[i]);
        }
        return bArr;
    }

    protected Object[] b(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objDeserializeWithType;
        Object[] objArr;
        if (this._unwrapSingle != Boolean.TRUE && (this._unwrapSingle != null || !deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            if (jsonParser.hasToken(JsonToken.VALUE_STRING)) {
                if (this.d == Byte.class) {
                    return c(jsonParser, deserializationContext);
                }
                return _deserializeFromString(jsonParser, deserializationContext);
            }
            return (Object[]) deserializationContext.handleUnexpectedToken(this._containerType, jsonParser);
        }
        if (jsonParser.hasToken(JsonToken.VALUE_NULL)) {
            if (this._skipNullValues) {
                return this.f201b;
            }
            objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
        } else {
            TypeDeserializer typeDeserializer = this.e;
            if (typeDeserializer == null) {
                objDeserializeWithType = this.f200a.deserialize(jsonParser, deserializationContext);
            } else {
                objDeserializeWithType = this.f200a.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
            }
        }
        if (this.f202c) {
            objArr = new Object[1];
        } else {
            objArr = (Object[]) Array.newInstance(this.d, 1);
        }
        objArr[0] = objDeserializeWithType;
        return objArr;
    }
}
