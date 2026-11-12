package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.node.ValueNode;
import com.huawei.operation.utils.Constants;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class aew extends ValueNode {
    private static final long serialVersionUID = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Object f346c;

    public aew(Object obj) {
        this.f346c = obj;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.POJO;
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonToken asToken() {
        return JsonToken.VALUE_EMBEDDED_OBJECT;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public byte[] binaryValue() throws IOException {
        Object obj = this.f346c;
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        return super.binaryValue();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        Object obj = this.f346c;
        return obj == null ? Constants.NULL : obj.toString();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText(String str) {
        Object obj = this.f346c;
        return obj == null ? str : obj.toString();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean asBoolean(boolean z) {
        Object obj = this.f346c;
        return (obj == null || !(obj instanceof Boolean)) ? z : ((Boolean) obj).booleanValue();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public int asInt(int i) {
        Object obj = this.f346c;
        return obj instanceof Number ? ((Number) obj).intValue() : i;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public long asLong(long j) {
        Object obj = this.f346c;
        return obj instanceof Number ? ((Number) obj).longValue() : j;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public double asDouble(double d) {
        Object obj = this.f346c;
        return obj instanceof Number ? ((Number) obj).doubleValue() : d;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        Object obj = this.f346c;
        if (obj == null) {
            serializerProvider.defaultSerializeNull(jsonGenerator);
        } else if (obj instanceof JsonSerializable) {
            ((JsonSerializable) obj).serialize(jsonGenerator, serializerProvider);
        } else {
            serializerProvider.defaultSerializeValue(obj, jsonGenerator);
        }
    }

    public Object b() {
        return this.f346c;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aew)) {
            return c((aew) obj);
        }
        return false;
    }

    protected boolean c(aew aewVar) {
        Object obj = this.f346c;
        if (obj == null) {
            return aewVar.f346c == null;
        }
        return obj.equals(aewVar.f346c);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this.f346c.hashCode();
    }
}
