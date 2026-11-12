package defpackage;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.b;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v3h extends r1q {
    @Override // defpackage.r1q
    public abstract b createArrayNode();

    @Override // defpackage.r1q
    public abstract b createObjectNode();

    public JsonFactory getFactory() {
        return getJsonFactory();
    }

    @Deprecated
    public JsonFactory getJsonFactory() {
        return getFactory();
    }

    @Override // defpackage.r1q
    public abstract <T extends b> T readTree(JsonParser jsonParser) throws IOException;

    public abstract <T> T readValue(JsonParser jsonParser, Class<T> cls) throws IOException;

    public abstract <T> T readValue(JsonParser jsonParser, jqk jqkVar) throws IOException;

    public abstract <T> T readValue(JsonParser jsonParser, z4q<?> z4qVar) throws IOException;

    public abstract <T> Iterator<T> readValues(JsonParser jsonParser, Class<T> cls) throws IOException;

    public abstract <T> Iterator<T> readValues(JsonParser jsonParser, jqk jqkVar) throws IOException;

    public abstract <T> Iterator<T> readValues(JsonParser jsonParser, z4q<?> z4qVar) throws IOException;

    @Override // defpackage.r1q
    public abstract JsonParser treeAsTokens(b bVar);

    public abstract <T> T treeToValue(b bVar, Class<T> cls) throws JsonProcessingException;

    public abstract Version version();

    @Override // defpackage.r1q
    public abstract void writeTree(JsonGenerator jsonGenerator, b bVar) throws IOException;

    public abstract void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException;
}
