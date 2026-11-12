package defpackage;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class zx extends JsonDeserializer<Object> {
    private final Error d;

    public zx(NoClassDefFoundError noClassDefFoundError) {
        this.d = noClassDefFoundError;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        throw this.d;
    }
}
