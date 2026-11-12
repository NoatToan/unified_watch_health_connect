package defpackage;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.node.ValueNode;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class aex extends ValueNode {
    static final aex d = new aex("");
    private static final long serialVersionUID = 2;
    protected final String e;

    public aex(String str) {
        this.e = str;
    }

    public static aex c(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return d;
        }
        return new aex(str);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.STRING;
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonToken asToken() {
        return JsonToken.VALUE_STRING;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String textValue() {
        return this.e;
    }

    public byte[] c(Base64Variant base64Variant) throws IOException {
        String strTrim = this.e.trim();
        xx xxVar = new xx(Math.max(16, Math.min(65536, ((strTrim.length() >> 2) * 3) + 4)));
        try {
            base64Variant.b(strTrim, xxVar);
            return xxVar.i();
        } catch (IllegalArgumentException e) {
            throw abs.b(null, String.format("Cannot access contents of TextNode as binary due to broken Base64 encoding: %s", e.getMessage()), strTrim, byte[].class);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public byte[] binaryValue() throws IOException {
        return c(wm.d());
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return this.e;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText(String str) {
        String str2 = this.e;
        return str2 == null ? str : str2;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean asBoolean(boolean z) {
        String str = this.e;
        if (str == null) {
            return z;
        }
        String strTrim = str.trim();
        if ("true".equals(strTrim)) {
            return true;
        }
        if ("false".equals(strTrim)) {
            return false;
        }
        return z;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public int asInt(int i) {
        return xd.b(this.e, i);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public long asLong(long j) {
        return xd.e(this.e, j);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public double asDouble(double d2) {
        return xd.a(this.e, d2);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        String str = this.e;
        if (str == null) {
            jsonGenerator.writeNull();
        } else {
            jsonGenerator.writeString(str);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aex)) {
            return ((aex) obj).e.equals(this.e);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this.e.hashCode();
    }
}
