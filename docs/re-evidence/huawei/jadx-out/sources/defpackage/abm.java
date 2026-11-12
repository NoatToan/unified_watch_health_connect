package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
@JacksonStdImpl
public class abm extends StdScalarDeserializer<aii> {
    private static final long serialVersionUID = 1;

    public abm() {
        super((Class<?>) aii.class);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Untyped;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public aii deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return a(jsonParser).c(jsonParser, deserializationContext);
    }

    protected aii a(JsonParser jsonParser) {
        return new aii(jsonParser);
    }
}
