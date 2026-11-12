package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes21.dex */
public class aau extends StdScalarDeserializer<AtomicLong> {
    private static final long serialVersionUID = 1;

    public aau() {
        super((Class<?>) AtomicLong.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public AtomicLong deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.isExpectedNumberIntToken()) {
            return new AtomicLong(jsonParser.getLongValue());
        }
        Long l_parseLong = _parseLong(jsonParser, deserializationContext, AtomicLong.class);
        if (l_parseLong == null) {
            return null;
        }
        return new AtomicLong(l_parseLong.intValue());
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Integer;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) throws ym {
        return new AtomicLong();
    }
}
