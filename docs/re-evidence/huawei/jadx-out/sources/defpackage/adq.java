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
import com.huawei.operation.utils.Constants;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes21.dex */
public class adq extends TypeDeserializerBase implements Serializable {
    private static final long serialVersionUID = 1;

    public adq(JavaType javaType, TypeIdResolver typeIdResolver, String str, boolean z, JavaType javaType2) {
        super(javaType, typeIdResolver, str, z, javaType2);
    }

    protected adq(adq adqVar, BeanProperty beanProperty) {
        super(adqVar, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public TypeDeserializer forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new adq(this, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public JsonTypeInfo.As getTypeInclusion() {
        return JsonTypeInfo.As.WRAPPER_OBJECT;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return c(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.TypeDeserializer
    public Object deserializeTypedFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
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
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken == JsonToken.START_OBJECT) {
            if (jsonParser.nextToken() != JsonToken.FIELD_NAME) {
                deserializationContext.reportWrongTokenException(baseType(), JsonToken.FIELD_NAME, "need JSON String that contains type id (for subtype of " + baseTypeName() + Constants.RIGHT_BRACKET_ONLY, new Object[0]);
            }
        } else if (jsonTokenCurrentToken != JsonToken.FIELD_NAME) {
            deserializationContext.reportWrongTokenException(baseType(), JsonToken.START_OBJECT, "need JSON Object to contain As.WRAPPER_OBJECT type information for class " + baseTypeName(), new Object[0]);
        }
        String text = jsonParser.getText();
        JsonDeserializer<Object> jsonDeserializer_findDeserializer = _findDeserializer(deserializationContext, text);
        jsonParser.nextToken();
        if (this._typeIdVisible && jsonParser.hasToken(JsonToken.START_OBJECT)) {
            aii aiiVar = new aii((ObjectCodec) null, false);
            aiiVar.writeStartObject();
            aiiVar.writeFieldName(this._typePropertyName);
            aiiVar.writeString(text);
            jsonParser.clearCurrentToken();
            jsonParser = yc.d(false, aiiVar.a(jsonParser), jsonParser);
            jsonParser.nextToken();
        }
        Object objDeserialize = jsonDeserializer_findDeserializer.deserialize(jsonParser, deserializationContext);
        if (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            deserializationContext.reportWrongTokenException(baseType(), JsonToken.END_OBJECT, "expected closing END_OBJECT after type information and deserialized value", new Object[0]);
        }
        return objDeserialize;
    }
}
