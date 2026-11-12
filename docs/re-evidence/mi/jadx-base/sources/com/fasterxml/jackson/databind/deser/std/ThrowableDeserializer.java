package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import defpackage.esd;
import java.io.IOException;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class ThrowableDeserializer extends BeanDeserializer {
    protected static final String PROP_NAME_MESSAGE = "message";
    private static final long serialVersionUID = 1;

    public ThrowableDeserializer(BeanDeserializer beanDeserializer) {
        super(beanDeserializer);
        this._vanillaProcessing = false;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializer, com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingPropertyBased(jsonParser, deserializationContext);
        }
        esd<Object> esdVar = this._delegateDeserializer;
        if (esdVar != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, esdVar.deserialize(jsonParser, deserializationContext));
        }
        if (this._beanType.isAbstract()) {
            return deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonParser, "abstract type (need to add/enable type information?)", new Object[0]);
        }
        boolean zCanCreateFromString = this._valueInstantiator.canCreateFromString();
        boolean zCanCreateUsingDefault = this._valueInstantiator.canCreateUsingDefault();
        if (!zCanCreateFromString && !zCanCreateUsingDefault) {
            return deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonParser, "Throwable needs a default contructor, a single-String-arg constructor; or explicit @JsonCreator", new Object[0]);
        }
        int i = 0;
        Object objCreateFromString = null;
        Object[] objArr = null;
        while (jsonParser.K() != JsonToken.END_OBJECT) {
            String strJ = jsonParser.J();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strJ);
            jsonParser.G0();
            if (settableBeanPropertyFind != null) {
                if (objCreateFromString != null) {
                    settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, objCreateFromString);
                } else {
                    if (objArr == null) {
                        int size = this._beanProperties.size();
                        objArr = new Object[size + size];
                    }
                    int i2 = i + 1;
                    objArr[i] = settableBeanPropertyFind;
                    i += 2;
                    objArr[i2] = settableBeanPropertyFind.deserialize(jsonParser, deserializationContext);
                }
            } else if ("message".equals(strJ) && zCanCreateFromString) {
                objCreateFromString = this._valueInstantiator.createFromString(deserializationContext, jsonParser.u0());
                if (objArr != null) {
                    for (int i3 = 0; i3 < i; i3 += 2) {
                        ((SettableBeanProperty) objArr[i3]).set(objCreateFromString, objArr[i3 + 1]);
                    }
                    objArr = null;
                }
            } else {
                Set<String> set = this._ignorableProps;
                if (set == null || !set.contains(strJ)) {
                    SettableAnyProperty settableAnyProperty = this._anySetter;
                    if (settableAnyProperty != null) {
                        settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, objCreateFromString, strJ);
                    } else {
                        handleUnknownProperty(jsonParser, deserializationContext, objCreateFromString, strJ);
                    }
                } else {
                    jsonParser.O0();
                }
            }
            jsonParser.G0();
        }
        if (objCreateFromString == null) {
            objCreateFromString = zCanCreateFromString ? this._valueInstantiator.createFromString(deserializationContext, null) : this._valueInstantiator.createUsingDefault(deserializationContext);
            if (objArr != null) {
                for (int i4 = 0; i4 < i; i4 += 2) {
                    ((SettableBeanProperty) objArr[i4]).set(objCreateFromString, objArr[i4 + 1]);
                }
            }
        }
        return objCreateFromString;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializer, com.fasterxml.jackson.databind.deser.BeanDeserializerBase, defpackage.esd
    public esd<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        return getClass() != ThrowableDeserializer.class ? this : new ThrowableDeserializer(this, nameTransformer);
    }

    public ThrowableDeserializer(BeanDeserializer beanDeserializer, NameTransformer nameTransformer) {
        super(beanDeserializer, nameTransformer);
    }
}
