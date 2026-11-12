package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class kgh extends rnq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f23828a;

    public kgh(Object obj) {
        this.f23828a = obj;
    }

    public boolean V(kgh kghVar) {
        Object obj = this.f23828a;
        if (obj == null) {
            return kghVar.f23828a == null;
        }
        return obj.equals(kghVar.f23828a);
    }

    public Object W() {
        return this.f23828a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof kgh)) {
            return V((kgh) obj);
        }
        return false;
    }

    @Override // defpackage.rnq, com.fasterxml.jackson.core.b
    public JsonToken f() {
        return JsonToken.VALUE_EMBEDDED_OBJECT;
    }

    public int hashCode() {
        return this.f23828a.hashCode();
    }

    @Override // defpackage.zsd
    public int i(int i) {
        Object obj = this.f23828a;
        return obj instanceof Number ? ((Number) obj).intValue() : i;
    }

    @Override // defpackage.zsd
    public long k(long j) {
        Object obj = this.f23828a;
        return obj instanceof Number ? ((Number) obj).longValue() : j;
    }

    @Override // defpackage.zsd
    public String l() {
        Object obj = this.f23828a;
        return obj == null ? AbstractJsonLexerKt.NULL : obj.toString();
    }

    @Override // defpackage.zsd
    public byte[] o() throws IOException {
        Object obj = this.f23828a;
        return obj instanceof byte[] ? (byte[]) obj : super.o();
    }

    @Override // defpackage.m82, defpackage.bud
    public final void serialize(JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        Object obj = this.f23828a;
        if (obj == null) {
            wwlVar.defaultSerializeNull(jsonGenerator);
        } else if (obj instanceof bud) {
            ((bud) obj).serialize(jsonGenerator, wwlVar);
        } else {
            wwlVar.defaultSerializeValue(obj, jsonGenerator);
        }
    }

    @Override // defpackage.rnq, defpackage.zsd
    public String toString() {
        Object obj = this.f23828a;
        if (obj instanceof byte[]) {
            return String.format("(binary value of %d bytes)", Integer.valueOf(((byte[]) obj).length));
        }
        return obj instanceof fcj ? String.format("(raw value '%s')", ((fcj) obj).toString()) : String.valueOf(obj);
    }

    @Override // defpackage.zsd
    public JsonNodeType x() {
        return JsonNodeType.POJO;
    }
}
