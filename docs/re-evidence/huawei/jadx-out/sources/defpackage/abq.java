package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
@JacksonStdImpl
public class abq extends StdScalarDeserializer<String> {
    public static final abq e = new abq();
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }

    public abq() {
        super((Class<?>) String.class);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Textual;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) throws ym {
        return "";
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String valueAsString;
        if (jsonParser.hasToken(JsonToken.VALUE_STRING)) {
            return jsonParser.getText();
        }
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken == JsonToken.START_ARRAY) {
            return _deserializeFromArray(jsonParser, deserializationContext);
        }
        if (jsonTokenCurrentToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
            Object embeddedObject = jsonParser.getEmbeddedObject();
            if (embeddedObject == null) {
                return null;
            }
            if (embeddedObject instanceof byte[]) {
                return deserializationContext.getBase64Variant().e((byte[]) embeddedObject, false);
            }
            return embeddedObject.toString();
        }
        if (jsonTokenCurrentToken == JsonToken.START_OBJECT) {
            return deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
        }
        return (!jsonTokenCurrentToken.isScalarValue() || (valueAsString = jsonParser.getValueAsString()) == null) ? (String) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser) : valueAsString;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return deserialize(jsonParser, deserializationContext);
    }
}
