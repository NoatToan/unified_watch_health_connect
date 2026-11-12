package defpackage;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public class adf extends TypeDeserializerBase implements Serializable {
    private static final long serialVersionUID = 1;

    protected boolean d() {
        return false;
    }

    public adf(JavaType javaType, TypeIdResolver typeIdResolver, String str, boolean z, JavaType javaType2) {
        super(javaType, typeIdResolver, str, z, javaType2);
    }

    public adf(adf adfVar, BeanProperty beanProperty) {
        super(adfVar, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public TypeDeserializer forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new adf(this, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public JsonTypeInfo.As getTypeInclusion() {
        return JsonTypeInfo.As.WRAPPER_ARRAY;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return c(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return c(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromScalar(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return c(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromAny(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return c(jsonParser, deserializationContext);
    }

    protected Object c(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object typeId;
        if (jsonParser.canReadTypeId() && (typeId = jsonParser.getTypeId()) != null) {
            return _deserializeWithNativeTypeId(jsonParser, deserializationContext, typeId);
        }
        boolean zIsExpectedStartArrayToken = jsonParser.isExpectedStartArrayToken();
        String strA = a(jsonParser, deserializationContext);
        JsonDeserializer<Object> jsonDeserializer_findDeserializer = _findDeserializer(deserializationContext, strA);
        if (this._typeIdVisible && !d() && jsonParser.hasToken(JsonToken.START_OBJECT)) {
            aii aiiVar = new aii((ObjectCodec) null, false);
            aiiVar.writeStartObject();
            aiiVar.writeFieldName(this._typePropertyName);
            aiiVar.writeString(strA);
            jsonParser.clearCurrentToken();
            jsonParser = yc.d(false, aiiVar.a(jsonParser), jsonParser);
            jsonParser.nextToken();
        }
        if (zIsExpectedStartArrayToken && jsonParser.currentToken() == JsonToken.END_ARRAY) {
            return jsonDeserializer_findDeserializer.getNullValue(deserializationContext);
        }
        Object objDeserialize = jsonDeserializer_findDeserializer.deserialize(jsonParser, deserializationContext);
        if (zIsExpectedStartArrayToken && jsonParser.nextToken() != JsonToken.END_ARRAY) {
            deserializationContext.reportWrongTokenException(baseType(), JsonToken.END_ARRAY, "expected closing END_ARRAY after type information and deserialized value", new Object[0]);
        }
        return objDeserialize;
    }

    protected String a(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.isExpectedStartArrayToken()) {
            if (this._defaultImpl != null) {
                return this._idResolver.idFromBaseType();
            }
            deserializationContext.reportWrongTokenException(baseType(), JsonToken.START_ARRAY, "need JSON Array to contain As.WRAPPER_ARRAY type information for class " + baseTypeName(), new Object[0]);
            return null;
        }
        if (jsonParser.nextToken() == JsonToken.VALUE_STRING) {
            String text = jsonParser.getText();
            jsonParser.nextToken();
            return text;
        }
        deserializationContext.reportWrongTokenException(baseType(), JsonToken.VALUE_STRING, "need JSON String that contains type id (for subtype of %s)", baseTypeName());
        return null;
    }
}
