package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class c4h extends eh4<c4h> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, zsd> f4912b;

    public c4h(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
        this.f4912b = new LinkedHashMap();
    }

    @Override // defpackage.zsd
    public final boolean H() {
        return true;
    }

    @Override // defpackage.zsd
    public zsd T(String str) {
        zsd zsdVar = this.f4912b.get(str);
        return zsdVar != null ? zsdVar : e5g.V();
    }

    public boolean c0(c4h c4hVar) {
        return this.f4912b.equals(c4hVar.f4912b);
    }

    public c4h d0(String str, zsd zsdVar) {
        this.f4912b.put(str, zsdVar);
        return this;
    }

    @Override // defpackage.zsd
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public c4h r() {
        c4h c4hVar = new c4h(this.f16638a);
        for (Map.Entry<String, zsd> entry : this.f4912b.entrySet()) {
            c4hVar.f4912b.put(entry.getKey(), entry.getValue().r());
        }
        return c4hVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof c4h)) {
            return c0((c4h) obj);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.b
    public JsonToken f() {
        return JsonToken.START_OBJECT;
    }

    @Deprecated
    public zsd f0(String str, zsd zsdVar) {
        if (zsdVar == null) {
            zsdVar = X();
        }
        return this.f4912b.put(str, zsdVar);
    }

    @Override // bud.a
    public boolean g(wwl wwlVar) {
        return this.f4912b.isEmpty();
    }

    public c4h g0(String str, int i) {
        return d0(str, Y(i));
    }

    public c4h h0(String str, long j) {
        return d0(str, Z(j));
    }

    public int hashCode() {
        return this.f4912b.hashCode();
    }

    public c4h i0(String str, Long l) {
        return d0(str, l == null ? X() : Z(l.longValue()));
    }

    public c4h j0(String str, String str2) {
        return d0(str, str2 == null ? X() : b0(str2));
    }

    public c4h k0(String str, boolean z) {
        return d0(str, W(z));
    }

    @Deprecated
    public zsd l0(c4h c4hVar) {
        return r0(c4hVar);
    }

    public mj1 m0(String str) {
        mj1 mj1VarV = V();
        d0(str, mj1VarV);
        return mj1VarV;
    }

    public zsd n0(String str) {
        return this.f4912b.remove(str);
    }

    public c4h o0() {
        this.f4912b.clear();
        return this;
    }

    public zsd p0(String str, zsd zsdVar) {
        if (zsdVar == null) {
            zsdVar = X();
        }
        return this.f4912b.put(str, zsdVar);
    }

    public zsd q0(String str, zsd zsdVar) {
        if (zsdVar == null) {
            zsdVar = X();
        }
        this.f4912b.put(str, zsdVar);
        return this;
    }

    public zsd r0(c4h c4hVar) {
        this.f4912b.putAll(c4hVar.f4912b);
        return this;
    }

    @Override // defpackage.m82, defpackage.bud
    public void serialize(JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        boolean z = (wwlVar == null || wwlVar.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS)) ? false : true;
        jsonGenerator.O0(this);
        for (Map.Entry<String, zsd> entry : this.f4912b.entrySet()) {
            m82 m82Var = (m82) entry.getValue();
            if (!z || !m82Var.C() || !m82Var.g(wwlVar)) {
                jsonGenerator.r0(entry.getKey());
                m82Var.serialize(jsonGenerator, wwlVar);
            }
        }
        jsonGenerator.m0();
    }

    @Override // defpackage.bud
    public void serializeWithType(JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        boolean z = (wwlVar == null || wwlVar.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS)) ? false : true;
        WritableTypeId writableTypeIdG = e5qVar.g(jsonGenerator, e5qVar.d(this, JsonToken.START_OBJECT));
        for (Map.Entry<String, zsd> entry : this.f4912b.entrySet()) {
            m82 m82Var = (m82) entry.getValue();
            if (!z || !m82Var.C() || !m82Var.g(wwlVar)) {
                jsonGenerator.r0(entry.getKey());
                m82Var.serialize(jsonGenerator, wwlVar);
            }
        }
        e5qVar.h(jsonGenerator, writableTypeIdG);
    }

    @Override // defpackage.eh4, defpackage.zsd
    public int size() {
        return this.f4912b.size();
    }

    @Override // defpackage.zsd
    public String toString() {
        StringBuilder sb = new StringBuilder((size() << 4) + 32);
        sb.append("{");
        int i = 0;
        for (Map.Entry<String, zsd> entry : this.f4912b.entrySet()) {
            if (i > 0) {
                sb.append(",");
            }
            i++;
            i8p.V(sb, entry.getKey());
            sb.append(AbstractJsonLexerKt.COLON);
            sb.append(entry.getValue().toString());
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.zsd
    public Iterator<zsd> u() {
        return this.f4912b.values().iterator();
    }

    @Override // defpackage.zsd
    public Iterator<Map.Entry<String, zsd>> v() {
        return this.f4912b.entrySet().iterator();
    }

    @Override // defpackage.zsd
    public zsd w(String str) {
        return this.f4912b.get(str);
    }

    @Override // defpackage.zsd
    public JsonNodeType x() {
        return JsonNodeType.OBJECT;
    }
}
