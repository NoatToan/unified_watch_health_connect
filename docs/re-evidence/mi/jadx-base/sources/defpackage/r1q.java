package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r1q {
    public abstract b createArrayNode();

    public abstract b createObjectNode();

    public abstract <T extends b> T readTree(JsonParser jsonParser) throws IOException;

    public abstract JsonParser treeAsTokens(b bVar);

    public abstract void writeTree(JsonGenerator jsonGenerator, b bVar) throws IOException;
}
