package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public class zp extends BeanDeserializerBase {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final BeanDeserializerBase f54420a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final SettableBeanProperty[] f54421c;

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase asArrayDeserializer() {
        return this;
    }

    public zp(BeanDeserializerBase beanDeserializerBase, SettableBeanProperty[] settableBeanPropertyArr) {
        super(beanDeserializerBase);
        this.f54420a = beanDeserializerBase;
        this.f54421c = settableBeanPropertyArr;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        return this.f54420a.unwrappingDeserializer(nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withObjectIdReader(aah aahVar) {
        return new zp(this.f54420a.withObjectIdReader(aahVar), this.f54421c);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withByNameInclusion(Set<String> set, Set<String> set2) {
        return new zp(this.f54420a.withByNameInclusion(set, set2), this.f54421c);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withIgnoreAllUnknown(boolean z) {
        return new zp(this.f54420a.withIgnoreAllUnknown(z), this.f54421c);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withBeanProperties(zr zrVar) {
        return new zp(this.f54420a.withBeanProperties(zrVar), this.f54421c);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.isExpectedStartArrayToken()) {
            return a(jsonParser, deserializationContext);
        }
        if (!this._vanillaProcessing) {
            return b(jsonParser, deserializationContext);
        }
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.setCurrentValue(objCreateUsingDefault);
        SettableBeanProperty[] settableBeanPropertyArr = this.f54421c;
        int length = settableBeanPropertyArr.length;
        int i = 0;
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            if (i != length) {
                SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
                if (settableBeanProperty != null) {
                    try {
                        settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, objCreateUsingDefault);
                    } catch (Exception e) {
                        wrapAndThrow(e, objCreateUsingDefault, settableBeanProperty.getName(), deserializationContext);
                    }
                } else {
                    jsonParser.skipChildren();
                }
                i++;
            } else {
                if (!this._ignoreAllUnknown && deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    deserializationContext.reportWrongTokenException(this, JsonToken.END_ARRAY, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                do {
                    jsonParser.skipChildren();
                } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
            }
        }
        return objCreateUsingDefault;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        jsonParser.setCurrentValue(obj);
        if (!jsonParser.isExpectedStartArrayToken()) {
            return a(jsonParser, deserializationContext);
        }
        if (this._injectables != null) {
            injectValues(deserializationContext, obj);
        }
        SettableBeanProperty[] settableBeanPropertyArr = this.f54421c;
        int length = settableBeanPropertyArr.length;
        int i = 0;
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            if (i != length) {
                SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
                if (settableBeanProperty != null) {
                    try {
                        settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, obj);
                    } catch (Exception e) {
                        wrapAndThrow(e, obj, settableBeanProperty.getName(), deserializationContext);
                    }
                } else {
                    jsonParser.skipChildren();
                }
                i++;
            } else {
                if (!this._ignoreAllUnknown && deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    deserializationContext.reportWrongTokenException(this, JsonToken.END_ARRAY, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                do {
                    jsonParser.skipChildren();
                } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
            }
        }
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return a(jsonParser, deserializationContext);
    }

    protected Object b(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._nonStandardCreation) {
            return deserializeFromObjectUsingNonDefault(jsonParser, deserializationContext);
        }
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.setCurrentValue(objCreateUsingDefault);
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDefault);
        }
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        SettableBeanProperty[] settableBeanPropertyArr = this.f54421c;
        int length = settableBeanPropertyArr.length;
        int i = 0;
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            if (i != length) {
                SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
                i++;
                if (settableBeanProperty != null && (activeView == null || settableBeanProperty.visibleInView(activeView))) {
                    try {
                        settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, objCreateUsingDefault);
                    } catch (Exception e) {
                        wrapAndThrow(e, objCreateUsingDefault, settableBeanProperty.getName(), deserializationContext);
                    }
                } else {
                    jsonParser.skipChildren();
                }
            } else {
                if (!this._ignoreAllUnknown) {
                    deserializationContext.reportWrongTokenException(this, JsonToken.END_ARRAY, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                do {
                    jsonParser.skipChildren();
                } while (jsonParser.nextToken() != JsonToken.END_ARRAY);
            }
        }
        return objCreateUsingDefault;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        aag aagVar = this._propertyBasedCreator;
        aai aaiVarE = aagVar.e(jsonParser, deserializationContext, this._objectIdReader);
        SettableBeanProperty[] settableBeanPropertyArr = this.f54421c;
        int length = settableBeanPropertyArr.length;
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        int i = 0;
        Object objA = null;
        while (jsonParser.nextToken() != JsonToken.END_ARRAY) {
            SettableBeanProperty settableBeanProperty = i < length ? settableBeanPropertyArr[i] : null;
            if (settableBeanProperty == null) {
                jsonParser.skipChildren();
            } else if (activeView != null && !settableBeanProperty.visibleInView(activeView)) {
                jsonParser.skipChildren();
            } else if (objA != null) {
                try {
                    settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, objA);
                } catch (Exception e) {
                    wrapAndThrow(e, objA, settableBeanProperty.getName(), deserializationContext);
                }
            } else {
                String name = settableBeanProperty.getName();
                SettableBeanProperty settableBeanPropertyE = aagVar.e(name);
                if (!aaiVarE.e(name) || settableBeanPropertyE != null) {
                    if (settableBeanPropertyE != null) {
                        if (aaiVarE.b(settableBeanPropertyE, settableBeanPropertyE.deserialize(jsonParser, deserializationContext))) {
                            try {
                                objA = aagVar.a(deserializationContext, aaiVarE);
                                jsonParser.setCurrentValue(objA);
                                if (objA.getClass() != this._beanType.getRawClass()) {
                                    deserializationContext.reportBadDefinition(this._beanType, String.format("Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s", ahw.a(this._beanType), ahw.a(objA)));
                                }
                            } catch (Exception e2) {
                                wrapAndThrow(e2, this._beanType.getRawClass(), name, deserializationContext);
                            }
                        }
                    } else {
                        aaiVarE.e(settableBeanProperty, settableBeanProperty.deserialize(jsonParser, deserializationContext));
                    }
                }
            }
            i++;
        }
        if (objA != null) {
            return objA;
        }
        try {
            return aagVar.a(deserializationContext, aaiVarE);
        } catch (Exception e3) {
            return wrapInstantiationProblem(e3, deserializationContext);
        }
    }

    protected Object a(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser.currentToken(), jsonParser, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", ahw.a(this._beanType), jsonParser.currentToken());
    }
}
