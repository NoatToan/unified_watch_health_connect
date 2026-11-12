package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class y1h extends rnq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y1h f39683a = new y1h();

    public static y1h V() {
        return f39683a;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // defpackage.rnq, com.fasterxml.jackson.core.b
    public JsonToken f() {
        return JsonToken.VALUE_NULL;
    }

    public int hashCode() {
        return JsonNodeType.NULL.ordinal();
    }

    @Override // defpackage.zsd
    public String l() {
        return AbstractJsonLexerKt.NULL;
    }

    @Override // defpackage.m82, defpackage.bud
    public final void serialize(JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        wwlVar.defaultSerializeNull(jsonGenerator);
    }

    @Override // defpackage.zsd
    public JsonNodeType x() {
        return JsonNodeType.NULL;
    }
}
