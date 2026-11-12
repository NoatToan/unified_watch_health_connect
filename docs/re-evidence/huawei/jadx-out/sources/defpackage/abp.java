package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class abp extends zf {
    private static final long serialVersionUID = 1;

    public abp(zf zfVar) {
        super(zfVar);
        this._vanillaProcessing = false;
    }

    protected abp(zf zfVar, NameTransformer nameTransformer) {
        super(zfVar, nameTransformer);
    }

    @Override // defpackage.zf, com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        return getClass() != abp.class ? this : new abp(this, nameTransformer);
    }

    @Override // defpackage.zf, com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objCreateUsingDefault;
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingPropertyBased(jsonParser, deserializationContext);
        }
        if (this._delegateDeserializer != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, this._delegateDeserializer.deserialize(jsonParser, deserializationContext));
        }
        if (this._beanType.isAbstract()) {
            return deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonParser, "abstract type (need to add/enable type information?)", new Object[0]);
        }
        boolean zCanCreateFromString = this._valueInstantiator.canCreateFromString();
        boolean zCanCreateUsingDefault = this._valueInstantiator.canCreateUsingDefault();
        if (!zCanCreateFromString && !zCanCreateUsingDefault) {
            return deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonParser, "Throwable needs a default constructor, a single-String-arg constructor; or explicit @JsonCreator", new Object[0]);
        }
        int i = 0;
        Object objCreateFromString = null;
        Object[] objArr = null;
        while (!jsonParser.hasToken(JsonToken.END_OBJECT)) {
            String strCurrentName = jsonParser.currentName();
            SettableBeanProperty settableBeanPropertyB = this._beanProperties.b(strCurrentName);
            jsonParser.nextToken();
            if (settableBeanPropertyB != null) {
                if (objCreateFromString != null) {
                    settableBeanPropertyB.deserializeAndSet(jsonParser, deserializationContext, objCreateFromString);
                } else {
                    if (objArr == null) {
                        int iD = this._beanProperties.d();
                        objArr = new Object[iD + iD];
                    }
                    objArr[i] = settableBeanPropertyB;
                    objArr[i + 1] = settableBeanPropertyB.deserialize(jsonParser, deserializationContext);
                    i += 2;
                }
            } else if ("message".equals(strCurrentName) && zCanCreateFromString) {
                objCreateFromString = this._valueInstantiator.createFromString(deserializationContext, jsonParser.getValueAsString());
                if (objArr != null) {
                    for (int i2 = 0; i2 < i; i2 += 2) {
                        ((SettableBeanProperty) objArr[i2]).set(objCreateFromString, objArr[i2 + 1]);
                    }
                    objArr = null;
                }
            } else if (this._ignorableProps != null && this._ignorableProps.contains(strCurrentName)) {
                jsonParser.skipChildren();
            } else if (this._anySetter != null) {
                this._anySetter.e(jsonParser, deserializationContext, objCreateFromString, strCurrentName);
            } else {
                handleUnknownProperty(jsonParser, deserializationContext, objCreateFromString, strCurrentName);
            }
            jsonParser.nextToken();
        }
        if (objCreateFromString != null) {
            return objCreateFromString;
        }
        if (zCanCreateFromString) {
            objCreateUsingDefault = this._valueInstantiator.createFromString(deserializationContext, null);
        } else {
            objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        }
        if (objArr != null) {
            for (int i3 = 0; i3 < i; i3 += 2) {
                ((SettableBeanProperty) objArr[i3]).set(objCreateUsingDefault, objArr[i3 + 1]);
            }
        }
        return objCreateUsingDefault;
    }
}
