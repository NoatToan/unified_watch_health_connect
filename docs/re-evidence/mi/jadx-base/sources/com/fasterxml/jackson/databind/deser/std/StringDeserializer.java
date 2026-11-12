package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.q4q;
import defpackage.qqd;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@qqd
public class StringDeserializer extends StdScalarDeserializer<String> {
    public static final StringDeserializer instance = new StringDeserializer();
    private static final long serialVersionUID = 1;

    public StringDeserializer() {
        super((Class<?>) String.class);
    }

    @Override // defpackage.esd
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return "";
    }

    @Override // defpackage.esd
    public boolean isCachable() {
        return true;
    }

    @Override // defpackage.esd
    public String deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strU0;
        if (jsonParser.y0(JsonToken.VALUE_STRING)) {
            return jsonParser.d0();
        }
        JsonToken jsonTokenK = jsonParser.K();
        if (jsonTokenK == JsonToken.START_ARRAY) {
            return _deserializeFromArray(jsonParser, deserializationContext);
        }
        if (jsonTokenK != JsonToken.VALUE_EMBEDDED_OBJECT) {
            return (!jsonTokenK.isScalarValue() || (strU0 = jsonParser.u0()) == null) ? (String) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser) : strU0;
        }
        Object objP = jsonParser.P();
        if (objP == null) {
            return null;
        }
        return objP instanceof byte[] ? deserializationContext.getBase64Variant().encode((byte[]) objP, false) : objP.toString();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, defpackage.esd
    public String deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
        return deserialize(jsonParser, deserializationContext);
    }
}
