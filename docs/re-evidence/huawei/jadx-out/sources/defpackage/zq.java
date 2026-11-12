package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public class zq extends BeanDeserializerBase {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final JavaType f54462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final BeanDeserializerBase f54463c;
    protected final aco d;
    protected final SettableBeanProperty[] e;

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase asArrayDeserializer() {
        return this;
    }

    public zq(BeanDeserializerBase beanDeserializerBase, JavaType javaType, SettableBeanProperty[] settableBeanPropertyArr, aco acoVar) {
        super(beanDeserializerBase);
        this.f54463c = beanDeserializerBase;
        this.f54462b = javaType;
        this.e = settableBeanPropertyArr;
        this.d = acoVar;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        return this.f54463c.unwrappingDeserializer(nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withObjectIdReader(aah aahVar) {
        return new zq(this.f54463c.withObjectIdReader(aahVar), this.f54462b, this.e, this.d);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withByNameInclusion(Set<String> set, Set<String> set2) {
        return new zq(this.f54463c.withByNameInclusion(set, set2), this.f54462b, this.e, this.d);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withIgnoreAllUnknown(boolean z) {
        return new zq(this.f54463c.withIgnoreAllUnknown(z), this.f54462b, this.e, this.d);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withBeanProperties(zr zrVar) {
        return new zq(this.f54463c.withBeanProperties(zrVar), this.f54462b, this.e, this.d);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(yi yiVar) {
        return Boolean.FALSE;
    }

    protected final Object c(DeserializationContext deserializationContext, Object obj) throws IOException {
        try {
            return this.d.getMember().invoke(obj, null);
        } catch (Exception e) {
            return wrapInstantiationProblem(e, deserializationContext);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.isExpectedStartArrayToken()) {
            return c(deserializationContext, c(jsonParser, deserializationContext));
        }
        if (!this._vanillaProcessing) {
            return c(deserializationContext, b(jsonParser, deserializationContext));
        }
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        SettableBeanProperty[] settableBeanPropertyArr = this.e;
        int length = settableBeanPropertyArr.length;
        int i = 0;
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            if (i != length) {
                SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
                if (settableBeanProperty != null) {
                    try {
                        objCreateUsingDefault = settableBeanProperty.deserializeSetAndReturn(jsonParser, deserializationContext, objCreateUsingDefault);
                    } catch (Exception e) {
                        wrapAndThrow(e, objCreateUsingDefault, settableBeanProperty.getName(), deserializationContext);
                    }
                } else {
                    jsonParser.skipChildren();
                }
                i++;
            } else {
                if (!this._ignoreAllUnknown && deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    deserializationContext.reportInputMismatch(handledType(), "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    jsonParser.skipChildren();
                }
                return c(deserializationContext, objCreateUsingDefault);
            }
        }
        return c(deserializationContext, objCreateUsingDefault);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return this.f54463c.deserialize(jsonParser, deserializationContext, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return c(jsonParser, deserializationContext);
    }

    protected Object b(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._nonStandardCreation) {
            return deserializeFromObjectUsingNonDefault(jsonParser, deserializationContext);
        }
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDefault);
        }
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        SettableBeanProperty[] settableBeanPropertyArr = this.e;
        int length = settableBeanPropertyArr.length;
        int i = 0;
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            if (i != length) {
                SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
                i++;
                if (settableBeanProperty != null && (activeView == null || settableBeanProperty.visibleInView(activeView))) {
                    try {
                        settableBeanProperty.deserializeSetAndReturn(jsonParser, deserializationContext, objCreateUsingDefault);
                    } catch (Exception e) {
                        wrapAndThrow(e, objCreateUsingDefault, settableBeanProperty.getName(), deserializationContext);
                    }
                } else {
                    jsonParser.skipChildren();
                }
            } else {
                if (!this._ignoreAllUnknown && deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    deserializationContext.reportWrongTokenException(this, JsonToken.END_ARRAY, "Unexpected JSON value(s); expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                    jsonParser.skipChildren();
                }
                break;
            }
        }
        return objCreateUsingDefault;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        aag aagVar = this._propertyBasedCreator;
        aai aaiVarE = aagVar.e(jsonParser, deserializationContext, this._objectIdReader);
        SettableBeanProperty[] settableBeanPropertyArr = this.e;
        int length = settableBeanPropertyArr.length;
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        int i = 0;
        Object objDeserializeSetAndReturn = null;
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            SettableBeanProperty settableBeanProperty = i < length ? settableBeanPropertyArr[i] : null;
            if (settableBeanProperty == null) {
                jsonParser.skipChildren();
            } else if (activeView != null && !settableBeanProperty.visibleInView(activeView)) {
                jsonParser.skipChildren();
            } else if (objDeserializeSetAndReturn != null) {
                try {
                    objDeserializeSetAndReturn = settableBeanProperty.deserializeSetAndReturn(jsonParser, deserializationContext, objDeserializeSetAndReturn);
                } catch (Exception e) {
                    wrapAndThrow(e, objDeserializeSetAndReturn, settableBeanProperty.getName(), deserializationContext);
                }
            } else {
                String name = settableBeanProperty.getName();
                SettableBeanProperty settableBeanPropertyE = aagVar.e(name);
                if (!aaiVarE.e(name) || settableBeanPropertyE != null) {
                    if (settableBeanPropertyE != null) {
                        if (aaiVarE.b(settableBeanPropertyE, settableBeanPropertyE.deserialize(jsonParser, deserializationContext))) {
                            try {
                                objDeserializeSetAndReturn = aagVar.a(deserializationContext, aaiVarE);
                                if (objDeserializeSetAndReturn.getClass() != this._beanType.getRawClass()) {
                                    return deserializationContext.reportBadDefinition(this._beanType, String.format("Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s", ahw.a(this._beanType), objDeserializeSetAndReturn.getClass().getName()));
                                }
                            } catch (Exception e2) {
                                wrapAndThrow(e2, this._beanType.getRawClass(), name, deserializationContext);
                            }
                        } else {
                            continue;
                        }
                    } else {
                        aaiVarE.e(settableBeanProperty, settableBeanProperty.deserialize(jsonParser, deserializationContext));
                    }
                }
            }
            i++;
        }
        if (objDeserializeSetAndReturn != null) {
            return objDeserializeSetAndReturn;
        }
        try {
            return aagVar.a(deserializationContext, aaiVarE);
        } catch (Exception e3) {
            return wrapInstantiationProblem(e3, deserializationContext);
        }
    }

    protected Object c(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser.currentToken(), jsonParser, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", this._beanType.getRawClass().getName(), jsonParser.currentToken());
    }
}
