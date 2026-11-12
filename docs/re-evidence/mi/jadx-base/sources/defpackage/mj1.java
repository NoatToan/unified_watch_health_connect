package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class mj1 extends eh4<mj1> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<zsd> f26917b;

    public mj1(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
        this.f26917b = new ArrayList();
    }

    @Override // defpackage.zsd
    public boolean C() {
        return true;
    }

    @Override // defpackage.zsd
    public zsd T(String str) {
        return e5g.V();
    }

    public mj1 c0(zsd zsdVar) {
        this.f26917b.add(zsdVar);
        return this;
    }

    public mj1 d0(zsd zsdVar) {
        if (zsdVar == null) {
            zsdVar = X();
        }
        c0(zsdVar);
        return this;
    }

    public mj1 e0(String str) {
        return str == null ? g0() : c0(b0(str));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof mj1)) {
            return this.f26917b.equals(((mj1) obj).f26917b);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.b
    public JsonToken f() {
        return JsonToken.START_ARRAY;
    }

    public mj1 f0(mj1 mj1Var) {
        this.f26917b.addAll(mj1Var.f26917b);
        return this;
    }

    @Override // bud.a
    public boolean g(wwl wwlVar) {
        return this.f26917b.isEmpty();
    }

    public mj1 g0() {
        c0(X());
        return this;
    }

    @Override // defpackage.zsd
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public mj1 r() {
        mj1 mj1Var = new mj1(this.f16638a);
        Iterator<zsd> it = this.f26917b.iterator();
        while (it.hasNext()) {
            mj1Var.f26917b.add(it.next().r());
        }
        return mj1Var;
    }

    public int hashCode() {
        return this.f26917b.hashCode();
    }

    public zsd i0(int i) {
        if (i < 0 || i >= this.f26917b.size()) {
            return null;
        }
        return this.f26917b.get(i);
    }

    public zsd j0(int i) {
        if (i < 0 || i >= this.f26917b.size()) {
            return null;
        }
        return this.f26917b.remove(i);
    }

    public mj1 k0() {
        this.f26917b.clear();
        return this;
    }

    @Override // defpackage.m82, defpackage.bud
    public void serialize(JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        List<zsd> list = this.f26917b;
        int size = list.size();
        jsonGenerator.M0(size);
        for (int i = 0; i < size; i++) {
            ((m82) list.get(i)).serialize(jsonGenerator, wwlVar);
        }
        jsonGenerator.i0();
    }

    @Override // defpackage.bud
    public void serializeWithType(JsonGenerator jsonGenerator, wwl wwlVar, e5q e5qVar) throws IOException {
        WritableTypeId writableTypeIdG = e5qVar.g(jsonGenerator, e5qVar.d(this, JsonToken.START_ARRAY));
        Iterator<zsd> it = this.f26917b.iterator();
        while (it.hasNext()) {
            ((m82) it.next()).serialize(jsonGenerator, wwlVar);
        }
        e5qVar.h(jsonGenerator, writableTypeIdG);
    }

    @Override // defpackage.eh4, defpackage.zsd
    public int size() {
        return this.f26917b.size();
    }

    @Override // defpackage.zsd
    public String toString() {
        StringBuilder sb = new StringBuilder((size() << 4) + 16);
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        int size = this.f26917b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(this.f26917b.get(i).toString());
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Override // defpackage.zsd
    public Iterator<zsd> u() {
        return this.f26917b.iterator();
    }

    @Override // defpackage.zsd
    public zsd w(String str) {
        return null;
    }

    @Override // defpackage.zsd
    public JsonNodeType x() {
        return JsonNodeType.ARRAY;
    }

    public mj1(JsonNodeFactory jsonNodeFactory, int i) {
        super(jsonNodeFactory);
        this.f26917b = new ArrayList(i);
    }
}
