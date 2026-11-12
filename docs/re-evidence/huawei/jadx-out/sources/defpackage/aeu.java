package defpackage;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.BaseJsonNode;
import com.fasterxml.jackson.databind.node.ContainerNode;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.huawei.operation.utils.Constants;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class aeu extends ContainerNode<aeu> implements Serializable {
    private static final long serialVersionUID = 1;
    protected final Map<String, JsonNode> d;

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonNode get(int i) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public final boolean isObject() {
        return true;
    }

    public aeu(aes aesVar) {
        super(aesVar);
        this.d = new LinkedHashMap();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode _at(wo woVar) {
        return get(woVar.d());
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public aeu deepCopy() {
        aeu aeuVar = new aeu(this._nodeFactory);
        for (Map.Entry<String, JsonNode> entry : this.d.entrySet()) {
            aeuVar.d.put(entry.getKey(), entry.getValue().deepCopy());
        }
        return aeuVar;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable.Base
    public boolean isEmpty(SerializerProvider serializerProvider) {
        return this.d.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.OBJECT;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonToken asToken() {
        return JsonToken.START_OBJECT;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public int size() {
        return this.d.size();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public Iterator<JsonNode> elements() {
        return this.d.values().iterator();
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonNode get(String str) {
        return this.d.get(str);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public Iterator<String> fieldNames() {
        return this.d.keySet().iterator();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonNode path(int i) {
        return aeq.b();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonNode path(String str) {
        JsonNode jsonNode = this.d.get(str);
        return jsonNode != null ? jsonNode : aeq.b();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonNode
    public JsonNode required(String str) {
        JsonNode jsonNode = this.d.get(str);
        return jsonNode != null ? jsonNode : (JsonNode) _reportRequiredViolation("No value for property '%s' of `ObjectNode`", str);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public Iterator<Map.Entry<String, JsonNode>> fields() {
        return this.d.entrySet().iterator();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public aeu with(String str) {
        JsonNode jsonNode = this.d.get(str);
        if (jsonNode != null) {
            if (jsonNode instanceof aeu) {
                return (aeu) jsonNode;
            }
            throw new UnsupportedOperationException("Property '" + str + "' has value that is not of type ObjectNode (but " + jsonNode.getClass().getName() + Constants.RIGHT_BRACKET_ONLY);
        }
        aeu aeuVarObjectNode = objectNode();
        this.d.put(str, aeuVarObjectNode);
        return aeuVarObjectNode;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public aeg withArray(String str) {
        JsonNode jsonNode = this.d.get(str);
        if (jsonNode != null) {
            if (jsonNode instanceof aeg) {
                return (aeg) jsonNode;
            }
            throw new UnsupportedOperationException("Property '" + str + "' has value that is not of type ArrayNode (but " + jsonNode.getClass().getName() + Constants.RIGHT_BRACKET_ONLY);
        }
        aeg aegVarArrayNode = arrayNode();
        this.d.put(str, aegVarArrayNode);
        return aegVarArrayNode;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Comparator<JsonNode> comparator, JsonNode jsonNode) {
        if (!(jsonNode instanceof aeu)) {
            return false;
        }
        Map<String, JsonNode> map = this.d;
        Map<String, JsonNode> map2 = ((aeu) jsonNode).d;
        if (map2.size() != map.size()) {
            return false;
        }
        for (Map.Entry<String, JsonNode> entry : map.entrySet()) {
            JsonNode jsonNode2 = map2.get(entry.getKey());
            if (jsonNode2 == null || !entry.getValue().equals(comparator, jsonNode2)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode findValue(String str) {
        for (Map.Entry<String, JsonNode> entry : this.d.entrySet()) {
            if (str.equals(entry.getKey())) {
                return entry.getValue();
            }
            JsonNode jsonNodeFindValue = entry.getValue().findValue(str);
            if (jsonNodeFindValue != null) {
                return jsonNodeFindValue;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public List<JsonNode> findValues(String str, List<JsonNode> list) {
        for (Map.Entry<String, JsonNode> entry : this.d.entrySet()) {
            if (str.equals(entry.getKey())) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(entry.getValue());
            } else {
                list = entry.getValue().findValues(str, list);
            }
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public List<String> findValuesAsText(String str, List<String> list) {
        for (Map.Entry<String, JsonNode> entry : this.d.entrySet()) {
            if (str.equals(entry.getKey())) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(entry.getValue().asText());
            } else {
                list = entry.getValue().findValuesAsText(str, list);
            }
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public aeu findParent(String str) {
        for (Map.Entry<String, JsonNode> entry : this.d.entrySet()) {
            if (str.equals(entry.getKey())) {
                return this;
            }
            JsonNode jsonNodeFindParent = entry.getValue().findParent(str);
            if (jsonNodeFindParent != null) {
                return (aeu) jsonNodeFindParent;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public List<JsonNode> findParents(String str, List<JsonNode> list) {
        for (Map.Entry<String, JsonNode> entry : this.d.entrySet()) {
            if (str.equals(entry.getKey())) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(this);
            } else {
                list = entry.getValue().findParents(str, list);
            }
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        boolean z = (serializerProvider == null || serializerProvider.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS)) ? false : true;
        jsonGenerator.writeStartObject(this);
        for (Map.Entry<String, JsonNode> entry : this.d.entrySet()) {
            BaseJsonNode baseJsonNode = (BaseJsonNode) entry.getValue();
            if (!z || !baseJsonNode.isArray() || !baseJsonNode.isEmpty(serializerProvider)) {
                jsonGenerator.writeFieldName(entry.getKey());
                baseJsonNode.serialize(jsonGenerator, serializerProvider);
            }
        }
        jsonGenerator.writeEndObject();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        boolean z = (serializerProvider == null || serializerProvider.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS)) ? false : true;
        WritableTypeId writableTypeIdWriteTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(this, JsonToken.START_OBJECT));
        for (Map.Entry<String, JsonNode> entry : this.d.entrySet()) {
            BaseJsonNode baseJsonNode = (BaseJsonNode) entry.getValue();
            if (!z || !baseJsonNode.isArray() || !baseJsonNode.isEmpty(serializerProvider)) {
                jsonGenerator.writeFieldName(entry.getKey());
                baseJsonNode.serialize(jsonGenerator, serializerProvider);
            }
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, writableTypeIdWriteTypePrefix);
    }

    public <T extends JsonNode> T b(String str, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        this.d.put(str, jsonNode);
        return this;
    }

    public JsonNode e(String str, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        return this.d.put(str, jsonNode);
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public aeu removeAll() {
        this.d.clear();
        return this;
    }

    public aeg a(String str) {
        aeg aegVarArrayNode = arrayNode();
        c(str, aegVarArrayNode);
        return aegVarArrayNode;
    }

    public aeu c(String str, String str2) {
        JsonNode jsonNodeTextNode;
        if (str2 == null) {
            jsonNodeTextNode = nullNode();
        } else {
            jsonNodeTextNode = textNode(str2);
        }
        return c(str, jsonNodeTextNode);
    }

    public aeu c(String str, boolean z) {
        return c(str, booleanNode(z));
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof aeu)) {
            return d((aeu) obj);
        }
        return false;
    }

    protected boolean d(aeu aeuVar) {
        return this.d.equals(aeuVar.d);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this.d.hashCode();
    }

    protected aeu c(String str, JsonNode jsonNode) {
        this.d.put(str, jsonNode);
        return this;
    }
}
