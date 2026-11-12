package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.node.ValueNode;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public final class aeq extends ValueNode {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final aeq f337b = new aeq();
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText(String str) {
        return str;
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.JsonNode
    public <T extends JsonNode> T deepCopy() {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public boolean isMissingNode() {
        return true;
    }

    protected aeq() {
    }

    protected Object readResolve() {
        return f337b;
    }

    public static aeq b() {
        return f337b;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.MISSING;
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonToken asToken() {
        return JsonToken.NOT_AVAILABLE;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return "";
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeNull();
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        jsonGenerator.writeNull();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode require() {
        return (JsonNode) _reportRequiredViolation("require() called on `MissingNode`", new Object[0]);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode requireNonNull() {
        return (JsonNode) _reportRequiredViolation("requireNonNull() called on `MissingNode`", new Object[0]);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return JsonNodeType.MISSING.ordinal();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonNode
    public String toString() {
        return "";
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonNode
    public String toPrettyString() {
        return "";
    }
}
