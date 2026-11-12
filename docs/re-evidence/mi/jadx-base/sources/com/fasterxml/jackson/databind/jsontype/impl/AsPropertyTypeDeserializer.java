package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import defpackage.bip;
import defpackage.esd;
import defpackage.otd;
import defpackage.q4q;
import defpackage.r4q;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class AsPropertyTypeDeserializer extends AsArrayTypeDeserializer {
    private static final long serialVersionUID = 1;
    protected final JsonTypeInfo.As _inclusion;

    public AsPropertyTypeDeserializer(JavaType javaType, r4q r4qVar, String str, boolean z, JavaType javaType2) {
        this(javaType, r4qVar, str, z, javaType2, JsonTypeInfo.As.PROPERTY);
    }

    public Object _deserializeTypedForId(JsonParser jsonParser, DeserializationContext deserializationContext, bip bipVar) throws IOException {
        String strD0 = jsonParser.d0();
        esd<Object> esdVar_findDeserializer = _findDeserializer(deserializationContext, strD0);
        if (this._typeIdVisible) {
            if (bipVar == null) {
                bipVar = new bip(jsonParser, deserializationContext);
            }
            bipVar.r0(jsonParser.J());
            bipVar.Q0(strD0);
        }
        if (bipVar != null) {
            jsonParser.l();
            jsonParser = otd.Q0(false, bipVar.h1(jsonParser), jsonParser);
        }
        jsonParser.G0();
        return esdVar_findDeserializer.deserialize(jsonParser, deserializationContext);
    }

    public Object _deserializeTypedUsingDefaultImpl(JsonParser jsonParser, DeserializationContext deserializationContext, bip bipVar) throws IOException {
        esd<Object> esdVar_findDefaultImplDeserializer = _findDefaultImplDeserializer(deserializationContext);
        if (esdVar_findDefaultImplDeserializer == null) {
            Object objDeserializeIfNatural = q4q.deserializeIfNatural(jsonParser, deserializationContext, this._baseType);
            if (objDeserializeIfNatural != null) {
                return objDeserializeIfNatural;
            }
            if (jsonParser.B0()) {
                return super.deserializeTypedFromAny(jsonParser, deserializationContext);
            }
            if (jsonParser.y0(JsonToken.VALUE_STRING) && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.d0().trim().isEmpty()) {
                return null;
            }
            String str = String.format("missing type id property '%s'", this._typePropertyName);
            BeanProperty beanProperty = this._property;
            if (beanProperty != null) {
                str = String.format("%s (for POJO property '%s')", str, beanProperty.getName());
            }
            JavaType javaType_handleMissingTypeId = _handleMissingTypeId(deserializationContext, str);
            if (javaType_handleMissingTypeId == null) {
                return null;
            }
            esdVar_findDefaultImplDeserializer = deserializationContext.findContextualValueDeserializer(javaType_handleMissingTypeId, this._property);
        }
        if (bipVar != null) {
            bipVar.m0();
            jsonParser = bipVar.h1(jsonParser);
            jsonParser.G0();
        }
        return esdVar_findDefaultImplDeserializer.deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, defpackage.q4q
    public Object deserializeTypedFromAny(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return jsonParser.K() == JsonToken.START_ARRAY ? super.deserializeTypedFromArray(jsonParser, deserializationContext) : deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, defpackage.q4q
    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objN0;
        if (jsonParser.d() && (objN0 = jsonParser.n0()) != null) {
            return _deserializeWithNativeTypeId(jsonParser, deserializationContext, objN0);
        }
        JsonToken jsonTokenK = jsonParser.K();
        bip bipVar = null;
        if (jsonTokenK == JsonToken.START_OBJECT) {
            jsonTokenK = jsonParser.G0();
        } else if (jsonTokenK != JsonToken.FIELD_NAME) {
            return _deserializeTypedUsingDefaultImpl(jsonParser, deserializationContext, null);
        }
        while (jsonTokenK == JsonToken.FIELD_NAME) {
            String strJ = jsonParser.J();
            jsonParser.G0();
            if (strJ.equals(this._typePropertyName)) {
                return _deserializeTypedForId(jsonParser, deserializationContext, bipVar);
            }
            if (bipVar == null) {
                bipVar = new bip(jsonParser, deserializationContext);
            }
            bipVar.r0(strJ);
            bipVar.k1(jsonParser);
            jsonTokenK = jsonParser.G0();
        }
        return _deserializeTypedUsingDefaultImpl(jsonParser, deserializationContext, bipVar);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, defpackage.q4q
    public q4q forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new AsPropertyTypeDeserializer(this, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, defpackage.q4q
    public JsonTypeInfo.As getTypeInclusion() {
        return this._inclusion;
    }

    public AsPropertyTypeDeserializer(JavaType javaType, r4q r4qVar, String str, boolean z, JavaType javaType2, JsonTypeInfo.As as) {
        super(javaType, r4qVar, str, z, javaType2);
        this._inclusion = as;
    }

    public AsPropertyTypeDeserializer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, BeanProperty beanProperty) {
        super(asPropertyTypeDeserializer, beanProperty);
        this._inclusion = asPropertyTypeDeserializer._inclusion;
    }
}
