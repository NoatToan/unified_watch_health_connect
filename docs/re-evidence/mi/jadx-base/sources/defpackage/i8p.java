package defpackage;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.a;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class i8p extends rnq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i8p f20888b = new i8p("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20889a;

    public i8p(String str) {
        this.f20889a = str;
    }

    public static void V(StringBuilder sb, String str) {
        sb.append('\"');
        xt3.a(sb, str);
        sb.append('\"');
    }

    public static i8p X(String str) {
        if (str == null) {
            return null;
        }
        return str.length() == 0 ? f20888b : new i8p(str);
    }

    @Override // defpackage.zsd
    public String U() {
        return this.f20889a;
    }

    public byte[] W(Base64Variant base64Variant) throws IOException {
        String strTrim = this.f20889a.trim();
        t63 t63Var = new t63(((strTrim.length() * 3) << 2) + 4);
        try {
            base64Variant.decode(strTrim, t63Var);
            return t63Var.D();
        } catch (IllegalArgumentException e) {
            throw InvalidFormatException.from(null, String.format("Cannot access contents of TextNode as binary due to broken Base64 encoding: %s", e.getMessage()), strTrim, byte[].class);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof i8p)) {
            return ((i8p) obj).f20889a.equals(this.f20889a);
        }
        return false;
    }

    @Override // defpackage.rnq, com.fasterxml.jackson.core.b
    public JsonToken f() {
        return JsonToken.VALUE_STRING;
    }

    public int hashCode() {
        return this.f20889a.hashCode();
    }

    @Override // defpackage.zsd
    public int i(int i) {
        return n2h.d(this.f20889a, i);
    }

    @Override // defpackage.zsd
    public long k(long j) {
        return n2h.e(this.f20889a, j);
    }

    @Override // defpackage.zsd
    public String l() {
        return this.f20889a;
    }

    @Override // defpackage.zsd
    public byte[] o() throws IOException {
        return W(a.a());
    }

    @Override // defpackage.m82, defpackage.bud
    public final void serialize(JsonGenerator jsonGenerator, wwl wwlVar) throws IOException {
        String str = this.f20889a;
        if (str == null) {
            jsonGenerator.s0();
        } else {
            jsonGenerator.Q0(str);
        }
    }

    @Override // defpackage.rnq, defpackage.zsd
    public String toString() {
        int length = this.f20889a.length();
        StringBuilder sb = new StringBuilder(length + 2 + (length >> 4));
        V(sb, this.f20889a);
        return sb.toString();
    }

    @Override // defpackage.zsd
    public JsonNodeType x() {
        return JsonNodeType.STRING;
    }
}
