package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes21.dex */
public class aao extends StdScalarDeserializer<AtomicInteger> {
    private static final long serialVersionUID = 1;

    public aao() {
        super((Class<?>) AtomicInteger.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AtomicInteger deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.isExpectedNumberIntToken()) {
            return new AtomicInteger(jsonParser.getIntValue());
        }
        Integer num_parseInteger = _parseInteger(jsonParser, deserializationContext, AtomicInteger.class);
        if (num_parseInteger == null) {
            return null;
        }
        return new AtomicInteger(num_parseInteger.intValue());
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Integer;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) throws ym {
        return new AtomicInteger();
    }
}
