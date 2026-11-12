package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.node.ValueNode;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class aef extends ValueNode {
    private static final long serialVersionUID = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f322a;
    public static final aef d = new aef(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final aef f321c = new aef(false);

    protected aef(boolean z) {
        this.f322a = z;
    }

    protected Object readResolve() {
        return this.f322a ? d : f321c;
    }

    public static aef d() {
        return d;
    }

    public static aef c() {
        return f321c;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.BOOLEAN;
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonToken asToken() {
        return this.f322a ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean booleanValue() {
        return this.f322a;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return this.f322a ? "true" : "false";
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean asBoolean() {
        return this.f322a;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean asBoolean(boolean z) {
        return this.f322a;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public int asInt(int i) {
        return this.f322a ? 1 : 0;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public long asLong(long j) {
        return this.f322a ? 1L : 0L;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public double asDouble(double d2) {
        return this.f322a ? 1.0d : 0.0d;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeBoolean(this.f322a);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this.f322a ? 3 : 1;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof aef) && this.f322a == ((aef) obj).f322a;
    }
}
