package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import defpackage.esd;
import defpackage.ldi;
import defpackage.qdi;
import java.io.IOException;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class BeanAsArrayDeserializer extends BeanDeserializerBase {
    private static final long serialVersionUID = 1;
    protected final BeanDeserializerBase _delegate;
    protected final SettableBeanProperty[] _orderedProperties;

    public BeanAsArrayDeserializer(BeanDeserializerBase beanDeserializerBase, SettableBeanProperty[] settableBeanPropertyArr) {
        super(beanDeserializerBase);
        this._delegate = beanDeserializerBase;
        this._orderedProperties = settableBeanPropertyArr;
    }

    public Object _deserializeFromNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return deserializationContext.handleUnexpectedToken(handledType(), jsonParser.K(), jsonParser, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", this._beanType.getRawClass().getName(), jsonParser.K());
    }

    public Object _deserializeNonVanilla(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._nonStandardCreation) {
            return deserializeFromObjectUsingNonDefault(jsonParser, deserializationContext);
        }
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.M0(objCreateUsingDefault);
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDefault);
        }
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        SettableBeanProperty[] settableBeanPropertyArr = this._orderedProperties;
        int length = settableBeanPropertyArr.length;
        int i = 0;
        while (true) {
            JsonToken jsonTokenG0 = jsonParser.G0();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (jsonTokenG0 == jsonToken) {
                return objCreateUsingDefault;
            }
            if (i == length) {
                if (!this._ignoreAllUnknown) {
                    deserializationContext.reportWrongTokenException(this, jsonToken, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                do {
                    jsonParser.O0();
                } while (jsonParser.G0() != JsonToken.END_ARRAY);
                return objCreateUsingDefault;
            }
            SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
            i++;
            if (settableBeanProperty == null || !(activeView == null || settableBeanProperty.visibleInView(activeView))) {
                jsonParser.O0();
            } else {
                try {
                    settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, objCreateUsingDefault);
                } catch (Exception e) {
                    wrapAndThrow(e, objCreateUsingDefault, settableBeanProperty.getName(), deserializationContext);
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ldi ldiVar = this._propertyBasedCreator;
        qdi qdiVarG = ldiVar.g(jsonParser, deserializationContext, this._objectIdReader);
        SettableBeanProperty[] settableBeanPropertyArr = this._orderedProperties;
        int length = settableBeanPropertyArr.length;
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        int i = 0;
        Object objA = null;
        while (jsonParser.G0() != JsonToken.END_ARRAY) {
            SettableBeanProperty settableBeanProperty = i < length ? settableBeanPropertyArr[i] : null;
            if (settableBeanProperty == null) {
                jsonParser.O0();
            } else if (activeView != null && !settableBeanProperty.visibleInView(activeView)) {
                jsonParser.O0();
            } else if (objA != null) {
                try {
                    settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, objA);
                } catch (Exception e) {
                    wrapAndThrow(e, objA, settableBeanProperty.getName(), deserializationContext);
                }
            } else {
                String name = settableBeanProperty.getName();
                SettableBeanProperty settableBeanPropertyE = ldiVar.e(name);
                if (settableBeanPropertyE != null) {
                    if (qdiVarG.b(settableBeanPropertyE, settableBeanPropertyE.deserialize(jsonParser, deserializationContext))) {
                        try {
                            objA = ldiVar.a(deserializationContext, qdiVarG);
                            jsonParser.M0(objA);
                            if (objA.getClass() != this._beanType.getRawClass()) {
                                JavaType javaType = this._beanType;
                                deserializationContext.reportBadDefinition(javaType, String.format("Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s", javaType.getRawClass().getName(), objA.getClass().getName()));
                            }
                        } catch (Exception e2) {
                            wrapAndThrow(e2, this._beanType.getRawClass(), name, deserializationContext);
                        }
                    }
                } else if (!qdiVarG.i(name)) {
                    qdiVarG.e(settableBeanProperty, settableBeanProperty.deserialize(jsonParser, deserializationContext));
                }
            }
            i++;
        }
        if (objA != null) {
            return objA;
        }
        try {
            return ldiVar.a(deserializationContext, qdiVarG);
        } catch (Exception e3) {
            return wrapInstantiationProblem(e3, deserializationContext);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase asArrayDeserializer() {
        return this;
    }

    @Override // defpackage.esd
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.B0()) {
            return _deserializeFromNonArray(jsonParser, deserializationContext);
        }
        if (!this._vanillaProcessing) {
            return _deserializeNonVanilla(jsonParser, deserializationContext);
        }
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.M0(objCreateUsingDefault);
        SettableBeanProperty[] settableBeanPropertyArr = this._orderedProperties;
        int length = settableBeanPropertyArr.length;
        int i = 0;
        while (true) {
            JsonToken jsonTokenG0 = jsonParser.G0();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (jsonTokenG0 == jsonToken) {
                return objCreateUsingDefault;
            }
            if (i == length) {
                if (!this._ignoreAllUnknown && deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    deserializationContext.reportWrongTokenException(this, jsonToken, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                do {
                    jsonParser.O0();
                } while (jsonParser.G0() != JsonToken.END_ARRAY);
                return objCreateUsingDefault;
            }
            SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
            if (settableBeanProperty != null) {
                try {
                    settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, objCreateUsingDefault);
                } catch (Exception e) {
                    wrapAndThrow(e, objCreateUsingDefault, settableBeanProperty.getName(), deserializationContext);
                }
            } else {
                jsonParser.O0();
            }
            i++;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserializeFromNonArray(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, defpackage.esd
    public esd<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        return this._delegate.unwrappingDeserializer(nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withBeanProperties(BeanPropertyMap beanPropertyMap) {
        return new BeanAsArrayDeserializer(this._delegate.withBeanProperties(beanPropertyMap), this._orderedProperties);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withIgnorableProperties(Set<String> set) {
        return new BeanAsArrayDeserializer(this._delegate.withIgnorableProperties(set), this._orderedProperties);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withObjectIdReader(ObjectIdReader objectIdReader) {
        return new BeanAsArrayDeserializer(this._delegate.withObjectIdReader(objectIdReader), this._orderedProperties);
    }

    @Override // defpackage.esd
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        jsonParser.M0(obj);
        if (!jsonParser.B0()) {
            return _deserializeFromNonArray(jsonParser, deserializationContext);
        }
        if (this._injectables != null) {
            injectValues(deserializationContext, obj);
        }
        SettableBeanProperty[] settableBeanPropertyArr = this._orderedProperties;
        int length = settableBeanPropertyArr.length;
        int i = 0;
        while (true) {
            JsonToken jsonTokenG0 = jsonParser.G0();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (jsonTokenG0 == jsonToken) {
                return obj;
            }
            if (i == length) {
                if (!this._ignoreAllUnknown && deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    deserializationContext.reportWrongTokenException(this, jsonToken, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                do {
                    jsonParser.O0();
                } while (jsonParser.G0() != JsonToken.END_ARRAY);
                return obj;
            }
            SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
            if (settableBeanProperty != null) {
                try {
                    settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, obj);
                } catch (Exception e) {
                    wrapAndThrow(e, obj, settableBeanProperty.getName(), deserializationContext);
                }
            } else {
                jsonParser.O0();
            }
            i++;
        }
    }
}
