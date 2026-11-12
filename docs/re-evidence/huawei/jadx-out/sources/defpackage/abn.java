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
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
@JacksonStdImpl
public final class abn extends StdDeserializer<String[]> implements ContextualDeserializer {
    private static final long serialVersionUID = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected JsonDeserializer<String> f225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final NullValueProvider f226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final boolean f227c;
    protected final Boolean d;
    private static final String[] h = new String[0];
    public static final abn e = new abn();

    public abn() {
        this(null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected abn(JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider, Boolean bool) {
        super((Class<?>) String[].class);
        this.f225a = jsonDeserializer;
        this.f226b = nullValueProvider;
        this.d = bool;
        this.f227c = aaa.c(nullValueProvider);
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
        return h;
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws ym {
        JsonDeserializer<?> jsonDeserializerHandleSecondaryContextualization;
        JsonDeserializer<?> jsonDeserializerFindConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, this.f225a);
        JavaType javaTypeConstructType = deserializationContext.constructType(String.class);
        if (jsonDeserializerFindConvertingContentDeserializer == null) {
            jsonDeserializerHandleSecondaryContextualization = deserializationContext.findContextualValueDeserializer(javaTypeConstructType, beanProperty);
        } else {
            jsonDeserializerHandleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(jsonDeserializerFindConvertingContentDeserializer, beanProperty, javaTypeConstructType);
        }
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, String[].class, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        NullValueProvider nullValueProviderFindContentNullProvider = findContentNullProvider(deserializationContext, beanProperty, jsonDeserializerHandleSecondaryContextualization);
        if (jsonDeserializerHandleSecondaryContextualization != null && isDefaultDeserializer(jsonDeserializerHandleSecondaryContextualization)) {
            jsonDeserializerHandleSecondaryContextualization = null;
        }
        return (this.f225a == jsonDeserializerHandleSecondaryContextualization && Objects.equals(this.d, boolFindFormatFeature) && this.f226b == nullValueProviderFindContentNullProvider) ? this : new abn(jsonDeserializerHandleSecondaryContextualization, nullValueProviderFindContentNullProvider, boolFindFormatFeature);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int i;
        if (!jsonParser.isExpectedStartArrayToken()) {
            return c(jsonParser, deserializationContext);
        }
        if (this.f225a != null) {
            return d(jsonParser, deserializationContext, null);
        }
        aib aibVarLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] objArrD = aibVarLeaseObjectBuffer.d();
        int i2 = 0;
        while (true) {
            try {
                String strNextTextValue = jsonParser.nextTextValue();
                try {
                    if (strNextTextValue == null) {
                        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
                        if (jsonTokenCurrentToken != JsonToken.END_ARRAY) {
                            if (jsonTokenCurrentToken == JsonToken.VALUE_NULL) {
                                if (!this.f227c) {
                                    strNextTextValue = (String) this.f226b.getNullValue(deserializationContext);
                                }
                            } else {
                                strNextTextValue = _parseString(jsonParser, deserializationContext);
                            }
                        } else {
                            String[] strArr = (String[]) aibVarLeaseObjectBuffer.a(objArrD, i2, String.class);
                            deserializationContext.returnObjectBuffer(aibVarLeaseObjectBuffer);
                            return strArr;
                        }
                    }
                    objArrD[i2] = strNextTextValue;
                    i2 = i;
                } catch (Exception e2) {
                    e = e2;
                    i2 = i;
                    throw ym.wrapWithPath(e, objArrD, aibVarLeaseObjectBuffer.c() + i2);
                }
                if (i2 >= objArrD.length) {
                    objArrD = aibVarLeaseObjectBuffer.d(objArrD);
                    i2 = 0;
                }
                i = i2 + 1;
            } catch (Exception e3) {
                e = e3;
            }
        }
    }

    protected final String[] d(JsonParser jsonParser, DeserializationContext deserializationContext, String[] strArr) throws IOException {
        int length;
        Object[] objArrD;
        String strDeserialize;
        int i;
        aib aibVarLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        if (strArr == null) {
            objArrD = aibVarLeaseObjectBuffer.d();
            length = 0;
        } else {
            length = strArr.length;
            objArrD = aibVarLeaseObjectBuffer.d(strArr, length);
        }
        JsonDeserializer<String> jsonDeserializer = this.f225a;
        while (true) {
            try {
                try {
                    if (jsonParser.nextTextValue() == null) {
                        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
                        if (jsonTokenCurrentToken != JsonToken.END_ARRAY) {
                            if (jsonTokenCurrentToken == JsonToken.VALUE_NULL) {
                                if (!this.f227c) {
                                    strDeserialize = (String) this.f226b.getNullValue(deserializationContext);
                                }
                            } else {
                                strDeserialize = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                            }
                        } else {
                            String[] strArr2 = (String[]) aibVarLeaseObjectBuffer.a(objArrD, length, String.class);
                            deserializationContext.returnObjectBuffer(aibVarLeaseObjectBuffer);
                            return strArr2;
                        }
                    } else {
                        strDeserialize = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                    }
                    objArrD[length] = strDeserialize;
                    length = i;
                } catch (Exception e2) {
                    e = e2;
                    length = i;
                    throw ym.wrapWithPath(e, String.class, length);
                }
                if (length >= objArrD.length) {
                    objArrD = aibVarLeaseObjectBuffer.d(objArrD);
                    length = 0;
                }
                i = length + 1;
            } catch (Exception e3) {
                e = e3;
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, String[] strArr) throws IOException {
        if (!jsonParser.isExpectedStartArrayToken()) {
            String[] strArrC = c(jsonParser, deserializationContext);
            if (strArrC == null) {
                return strArr;
            }
            int length = strArr.length;
            String[] strArr2 = new String[strArrC.length + length];
            System.arraycopy(strArr, 0, strArr2, 0, length);
            System.arraycopy(strArrC, 0, strArr2, length, strArrC.length);
            return strArr2;
        }
        if (this.f225a != null) {
            return d(jsonParser, deserializationContext, strArr);
        }
        aib aibVarLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        int length2 = strArr.length;
        Object[] objArrD = aibVarLeaseObjectBuffer.d(strArr, length2);
        while (true) {
            try {
                String strNextTextValue = jsonParser.nextTextValue();
                if (strNextTextValue == null) {
                    JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
                    if (jsonTokenCurrentToken != JsonToken.END_ARRAY) {
                        if (jsonTokenCurrentToken == JsonToken.VALUE_NULL) {
                            if (this.f227c) {
                                return h;
                            }
                            strNextTextValue = (String) this.f226b.getNullValue(deserializationContext);
                        } else {
                            strNextTextValue = _parseString(jsonParser, deserializationContext);
                        }
                    } else {
                        String[] strArr3 = (String[]) aibVarLeaseObjectBuffer.a(objArrD, length2, String.class);
                        deserializationContext.returnObjectBuffer(aibVarLeaseObjectBuffer);
                        return strArr3;
                    }
                    throw ym.wrapWithPath(e, objArrD, aibVarLeaseObjectBuffer.c() + length2);
                }
                if (length2 >= objArrD.length) {
                    objArrD = aibVarLeaseObjectBuffer.d(objArrD);
                    length2 = 0;
                }
                int i = length2 + 1;
                try {
                    objArrD[length2] = strNextTextValue;
                    length2 = i;
                } catch (Exception e2) {
                    e = e2;
                    length2 = i;
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
    }

    private final String[] c(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str_parseString;
        if (this.d == Boolean.TRUE || (this.d == null && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            if (jsonParser.hasToken(JsonToken.VALUE_NULL)) {
                str_parseString = (String) this.f226b.getNullValue(deserializationContext);
            } else {
                str_parseString = _parseString(jsonParser, deserializationContext);
            }
            return new String[]{str_parseString};
        }
        if (jsonParser.hasToken(JsonToken.VALUE_STRING)) {
            return _deserializeFromString(jsonParser, deserializationContext);
        }
        return (String[]) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
    }
}
