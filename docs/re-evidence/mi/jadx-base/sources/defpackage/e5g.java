package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class e5g extends rnq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e5g f16283a = new e5g();

    public static e5g V() {
        return f16283a;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // defpackage.rnq, com.fasterxml.jackson.core.b
    public JsonToken f() {
        return JsonToken.NOT_AVAILABLE;
    }

    public int hashCode() {
        return JsonNodeType.MISSING.ordinal();
    }

    @Override // defpackage.zsd
    public String l() {
        return "";
    }

    @Override // defpackage.rnq, defpackage.zsd
    public <T extends zsd> T r() {
        return this;
    }

    @Override // defpackage.m82, defpackage.bud
    public final void serialize(JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        jsonGenerator.s0();
    }

    @Override // defpackage.rnq, defpackage.bud
    public void serializeWithType(JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        jsonGenerator.s0();
    }

    @Override // defpackage.rnq, defpackage.zsd
    public String toString() {
        return "";
    }

    @Override // defpackage.zsd
    public JsonNodeType x() {
        return JsonNodeType.MISSING;
    }
}
