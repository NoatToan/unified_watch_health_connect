package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.BaseJsonNode;
import com.fasterxml.jackson.databind.node.ContainerNode;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class aeg extends ContainerNode<aeg> implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<JsonNode> f323b;

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonNode get(String str) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public boolean isArray() {
        return true;
    }

    public aeg(aes aesVar) {
        super(aesVar);
        this.f323b = new ArrayList();
    }

    public aeg(aes aesVar, int i) {
        super(aesVar);
        this.f323b = new ArrayList(i);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode _at(wo woVar) {
        return get(woVar.c());
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public aeg deepCopy() {
        aeg aegVar = new aeg(this._nodeFactory);
        Iterator<JsonNode> it = this.f323b.iterator();
        while (it.hasNext()) {
            aegVar.f323b.add(it.next().deepCopy());
        }
        return aegVar;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable.Base
    public boolean isEmpty(SerializerProvider serializerProvider) {
        return this.f323b.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.ARRAY;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonToken asToken() {
        return JsonToken.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public int size() {
        return this.f323b.size();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean isEmpty() {
        return this.f323b.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public Iterator<JsonNode> elements() {
        return this.f323b.iterator();
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonNode get(int i) {
        if (i < 0 || i >= this.f323b.size()) {
            return null;
        }
        return this.f323b.get(i);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonNode path(String str) {
        return aeq.b();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonNode path(int i) {
        if (i >= 0 && i < this.f323b.size()) {
            return this.f323b.get(i);
        }
        return aeq.b();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonNode
    public JsonNode required(int i) {
        if (i >= 0 && i < this.f323b.size()) {
            return this.f323b.get(i);
        }
        return (JsonNode) _reportRequiredViolation("No value at index #%d [0, %d) of `ArrayNode`", Integer.valueOf(i), Integer.valueOf(this.f323b.size()));
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Comparator<JsonNode> comparator, JsonNode jsonNode) {
        if (!(jsonNode instanceof aeg)) {
            return false;
        }
        aeg aegVar = (aeg) jsonNode;
        int size = this.f323b.size();
        if (aegVar.size() != size) {
            return false;
        }
        List<JsonNode> list = this.f323b;
        List<JsonNode> list2 = aegVar.f323b;
        for (int i = 0; i < size; i++) {
            if (!list.get(i).equals(comparator, list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        List<JsonNode> list = this.f323b;
        int size = list.size();
        jsonGenerator.writeStartArray(this, size);
        for (int i = 0; i < size; i++) {
            ((BaseJsonNode) list.get(i)).serialize(jsonGenerator, serializerProvider);
        }
        jsonGenerator.writeEndArray();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        WritableTypeId writableTypeIdWriteTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(this, JsonToken.START_ARRAY));
        Iterator<JsonNode> it = this.f323b.iterator();
        while (it.hasNext()) {
            ((BaseJsonNode) it.next()).serialize(jsonGenerator, serializerProvider);
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, writableTypeIdWriteTypePrefix);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode findValue(String str) {
        Iterator<JsonNode> it = this.f323b.iterator();
        while (it.hasNext()) {
            JsonNode jsonNodeFindValue = it.next().findValue(str);
            if (jsonNodeFindValue != null) {
                return jsonNodeFindValue;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public List<JsonNode> findValues(String str, List<JsonNode> list) {
        Iterator<JsonNode> it = this.f323b.iterator();
        while (it.hasNext()) {
            list = it.next().findValues(str, list);
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public List<String> findValuesAsText(String str, List<String> list) {
        Iterator<JsonNode> it = this.f323b.iterator();
        while (it.hasNext()) {
            list = it.next().findValuesAsText(str, list);
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public aeu findParent(String str) {
        Iterator<JsonNode> it = this.f323b.iterator();
        while (it.hasNext()) {
            JsonNode jsonNodeFindParent = it.next().findParent(str);
            if (jsonNodeFindParent != null) {
                return (aeu) jsonNodeFindParent;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public List<JsonNode> findParents(String str, List<JsonNode> list) {
        Iterator<JsonNode> it = this.f323b.iterator();
        while (it.hasNext()) {
            list = it.next().findParents(str, list);
        }
        return list;
    }

    public aeg a(JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        e(jsonNode);
        return this;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public aeg removeAll() {
        this.f323b.clear();
        return this;
    }

    public aeg c() {
        e(nullNode());
        return this;
    }

    public aeg c(String str) {
        if (str == null) {
            return c();
        }
        return e(textNode(str));
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aeg)) {
            return this.f323b.equals(((aeg) obj).f323b);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this.f323b.hashCode();
    }

    protected aeg e(JsonNode jsonNode) {
        this.f323b.add(jsonNode);
        return this;
    }
}
