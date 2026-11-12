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
public class AsWrapperTypeDeserializer extends TypeDeserializerBase implements Serializable {
    private static final long serialVersionUID = 1;

    public AsWrapperTypeDeserializer(JavaType javaType, r4q r4qVar, String str, boolean z, JavaType javaType2) {
        super(javaType, r4qVar, str, z, javaType2);
    }

    public Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objN0;
        if (jsonParser.d() && (objN0 = jsonParser.n0()) != null) {
            return _deserializeWithNativeTypeId(jsonParser, deserializationContext, objN0);
        }
        JsonToken jsonTokenK = jsonParser.K();
        JsonToken jsonToken = JsonToken.START_OBJECT;
        if (jsonTokenK == jsonToken) {
            JsonToken jsonTokenG0 = jsonParser.G0();
            JsonToken jsonToken2 = JsonToken.FIELD_NAME;
            if (jsonTokenG0 != jsonToken2) {
                deserializationContext.reportWrongTokenException(baseType(), jsonToken2, "need JSON String that contains type id (for subtype of " + baseTypeName() + ")", new Object[0]);
            }
        } else if (jsonTokenK != JsonToken.FIELD_NAME) {
            deserializationContext.reportWrongTokenException(baseType(), jsonToken, "need JSON Object to contain As.WRAPPER_OBJECT type information for class " + baseTypeName(), new Object[0]);
        }
        String strD0 = jsonParser.d0();
        esd<Object> esdVar_findDeserializer = _findDeserializer(deserializationContext, strD0);
        jsonParser.G0();
        if (this._typeIdVisible && jsonParser.K() == jsonToken) {
            bip bipVar = new bip((v3h) null, false);
            bipVar.N0();
            bipVar.r0(this._typePropertyName);
            bipVar.Q0(strD0);
            jsonParser.l();
            jsonParser = otd.Q0(false, bipVar.h1(jsonParser), jsonParser);
            jsonParser.G0();
        }
        Object objDeserialize = esdVar_findDeserializer.deserialize(jsonParser, deserializationContext);
        JsonToken jsonTokenG1 = jsonParser.G0();
        JsonToken jsonToken3 = JsonToken.END_OBJECT;
        if (jsonTokenG1 != jsonToken3) {
            deserializationContext.reportWrongTokenException(baseType(), jsonToken3, "expected closing END_OBJECT after type information and deserialized value", new Object[0]);
        }
        return objDeserialize;
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
        return beanProperty == this._property ? this : new AsWrapperTypeDeserializer(this, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, defpackage.q4q
    public JsonTypeInfo.As getTypeInclusion() {
        return JsonTypeInfo.As.WRAPPER_OBJECT;
    }

    public AsWrapperTypeDeserializer(AsWrapperTypeDeserializer asWrapperTypeDeserializer, BeanProperty beanProperty) {
        super(asWrapperTypeDeserializer, beanProperty);
    }
}
