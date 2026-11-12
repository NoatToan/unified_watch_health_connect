package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.node.ValueNode;
import com.huawei.operation.utils.Constants;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class aer extends ValueNode {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final aer f338b = new aer();
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText(String str) {
        return str;
    }

    protected aer() {
    }

    protected Object readResolve() {
        return f338b;
    }

    public static aer b() {
        return f338b;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.NULL;
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonToken asToken() {
        return JsonToken.VALUE_NULL;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return Constants.NULL;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode requireNonNull() {
        return (JsonNode) _reportRequiredViolation("requireNonNull() called on `NullNode`", new Object[0]);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        serializerProvider.defaultSerializeNull(jsonGenerator);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        return obj == this || (obj instanceof aer);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return JsonNodeType.NULL.ordinal();
    }
}
