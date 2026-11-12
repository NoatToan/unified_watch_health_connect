package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class aal extends StdDeserializer<Object> {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final String f178c;
    protected final JavaType d;

    public aal(JavaType javaType, String str) {
        super(javaType);
        this.d = javaType;
        this.f178c = str;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        deserializationContext.reportBadDefinition(this.d, this.f178c);
        return null;
    }
}
