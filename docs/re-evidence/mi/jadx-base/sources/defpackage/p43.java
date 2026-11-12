package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class p43 extends rnq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p43 f29979b = new p43(true);
    public static final p43 c = new p43(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f29980a;

    public p43(boolean z) {
        this.f29980a = z;
    }

    public static p43 V() {
        return c;
    }

    public static p43 W() {
        return f29979b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof p43) && this.f29980a == ((p43) obj).f29980a;
    }

    @Override // defpackage.rnq, com.fasterxml.jackson.core.b
    public JsonToken f() {
        return this.f29980a ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE;
    }

    public int hashCode() {
        return this.f29980a ? 3 : 1;
    }

    @Override // defpackage.zsd
    public int i(int i) {
        return this.f29980a ? 1 : 0;
    }

    @Override // defpackage.zsd
    public long k(long j) {
        return this.f29980a ? 1L : 0L;
    }

    @Override // defpackage.zsd
    public String l() {
        return this.f29980a ? "true" : "false";
    }

    @Override // defpackage.m82, defpackage.bud
    public final void serialize(JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        jsonGenerator.f0(this.f29980a);
    }

    @Override // defpackage.zsd
    public JsonNodeType x() {
        return JsonNodeType.BOOLEAN;
    }
}
