package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import defpackage.q4q;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class NullifyingDeserializer extends StdDeserializer<Object> {
    public static final NullifyingDeserializer instance = new NullifyingDeserializer();
    private static final long serialVersionUID = 1;

    public NullifyingDeserializer() {
        super((Class<?>) Object.class);
    }

    @Override // defpackage.esd
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.y0(JsonToken.FIELD_NAME)) {
            jsonParser.O0();
            return null;
        }
        while (true) {
            JsonToken jsonTokenG0 = jsonParser.G0();
            if (jsonTokenG0 == null || jsonTokenG0 == JsonToken.END_OBJECT) {
                return null;
            }
            jsonParser.O0();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, defpackage.esd
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, q4q q4qVar) throws IOException {
        int iM = jsonParser.M();
        if (iM == 1 || iM == 3 || iM == 5) {
            return q4qVar.deserializeTypedFromAny(jsonParser, deserializationContext);
        }
        return null;
    }

    @Override // defpackage.esd
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }
}
