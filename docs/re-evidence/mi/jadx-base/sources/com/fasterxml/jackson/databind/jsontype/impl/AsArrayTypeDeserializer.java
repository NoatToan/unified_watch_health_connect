package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import defpackage.bip;
import defpackage.esd;
import defpackage.otd;
import defpackage.q4q;
import defpackage.r4q;
import defpackage.v3h;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class AsArrayTypeDeserializer extends TypeDeserializerBase implements Serializable {
    private static final long serialVersionUID = 1;

    public AsArrayTypeDeserializer(JavaType javaType, r4q r4qVar, String str, boolean z, JavaType javaType2) {
        super(javaType, r4qVar, str, z, javaType2);
    }

    public Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objN0;
        if (jsonParser.d() && (objN0 = jsonParser.n0()) != null) {
            return _deserializeWithNativeTypeId(jsonParser, deserializationContext, objN0);
        }
        boolean zB0 = jsonParser.B0();
        String str_locateTypeId = _locateTypeId(jsonParser, deserializationContext);
        esd<Object> esdVar_findDeserializer = _findDeserializer(deserializationContext, str_locateTypeId);
        if (this._typeIdVisible && !_usesExternalId() && jsonParser.K() == JsonToken.START_OBJECT) {
            bip bipVar = new bip((v3h) null, false);
            bipVar.N0();
            bipVar.r0(this._typePropertyName);
            bipVar.Q0(str_locateTypeId);
            jsonParser.l();
            jsonParser = otd.Q0(false, bipVar.h1(jsonParser), jsonParser);
            jsonParser.G0();
        }
        Object objDeserialize = esdVar_findDeserializer.deserialize(jsonParser, deserializationContext);
        if (zB0) {
            JsonToken jsonTokenG0 = jsonParser.G0();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (jsonTokenG0 != jsonToken) {
                deserializationContext.reportWrongTokenException(baseType(), jsonToken, "expected closing END_ARRAY after type information and deserialized value", new Object[0]);
            }
        }
        return objDeserialize;
    }

    public String _locateTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.B0()) {
            if (this._defaultImpl != null) {
                return this._idResolver.f();
            }
            deserializationContext.reportWrongTokenException(baseType(), JsonToken.START_ARRAY, "need JSON Array to contain As.WRAPPER_ARRAY type information for class " + baseTypeName(), new Object[0]);
            return null;
        }
        JsonToken jsonTokenG0 = jsonParser.G0();
        JsonToken jsonToken = JsonToken.VALUE_STRING;
        if (jsonTokenG0 == jsonToken) {
            String strD0 = jsonParser.d0();
            jsonParser.G0();
            return strD0;
        }
        if (this._defaultImpl != null) {
            return this._idResolver.f();
        }
        deserializationContext.reportWrongTokenException(baseType(), jsonToken, "need JSON String that contains type id (for subtype of %s)", baseTypeName());
        return null;
    }

    public boolean _usesExternalId() {
        return false;
    }

    @Override // defpackage.q4q
    public Object deserializeTypedFromAny(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    @Override // defpackage.q4q
    public Object deserializeTypedFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    @Override // defpackage.q4q
    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    @Override // defpackage.q4q
    public Object deserializeTypedFromScalar(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, defpackage.q4q
    public q4q forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new AsArrayTypeDeserializer(this, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, defpackage.q4q
    public JsonTypeInfo.As getTypeInclusion() {
        return JsonTypeInfo.As.WRAPPER_ARRAY;
    }

    public AsArrayTypeDeserializer(AsArrayTypeDeserializer asArrayTypeDeserializer, BeanProperty beanProperty) {
        super(asArrayTypeDeserializer, beanProperty);
    }
}
