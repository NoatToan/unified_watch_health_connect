package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m82 extends zsd implements bud {
    public JsonParser.NumberType e() {
        return null;
    }

    @Override // defpackage.bud
    public abstract void serialize(JsonGenerator jsonGenerator, wwl wwlVar) throws IOException;
}
