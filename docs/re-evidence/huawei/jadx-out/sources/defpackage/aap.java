package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes21.dex */
public class aap extends StdScalarDeserializer<AtomicBoolean> {
    private static final long serialVersionUID = 1;

    public aap() {
        super((Class<?>) AtomicBoolean.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AtomicBoolean deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken == JsonToken.VALUE_TRUE) {
            return new AtomicBoolean(true);
        }
        if (jsonTokenCurrentToken == JsonToken.VALUE_FALSE) {
            return new AtomicBoolean(false);
        }
        Boolean bool_parseBoolean = _parseBoolean(jsonParser, deserializationContext, AtomicBoolean.class);
        if (bool_parseBoolean == null) {
            return null;
        }
        return new AtomicBoolean(bool_parseBoolean.booleanValue());
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Boolean;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) throws ym {
        return new AtomicBoolean(false);
    }
}
