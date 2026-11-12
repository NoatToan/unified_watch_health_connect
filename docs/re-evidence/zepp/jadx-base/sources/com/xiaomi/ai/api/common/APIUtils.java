package com.xiaomi.ai.api.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.cfg.MutableConfigOverride;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.a.c;
import com.xiaomi.common.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes18.dex */
public class APIUtils {
    private static ApiNameMapping mapping;
    private static ObjectMapper objectMapper = buildObjectMapper(false);
    private static ObjectMapper objectMapperAllowNull = buildObjectMapper(true);

    static {
        try {
            mapping = (ApiNameMapping) APIUtils.class.getClassLoader().loadClass("com.xiaomi.ai.api.AIApiNameMapping").newInstance();
        } catch (Throwable th) {
            throw new IllegalStateException(th);
        }
    }

    public static <T extends ContextPayload> Context<T> buildContext(T t) {
        NamespaceName namespaceName = getNamespaceName(t);
        return new Context<>(new ContextHeader(namespaceName.namespace(), namespaceName.name()), t);
    }

    public static <T extends EventPayload> Event<T> buildEvent(T t) {
        return buildEvent(t, null, randomRequestId(false));
    }

    public static <T extends EventPayload> Event<T> buildEvent(T t, List<Context> list) {
        return buildEvent(t, list, randomRequestId(false));
    }

    public static <T extends EventPayload> Event<T> buildEvent(T t, List<Context> list, String str) {
        NamespaceName namespaceName = getNamespaceName(t);
        return new Event<>(list, new EventHeader(namespaceName.namespace(), namespaceName.name()).setId(str), t);
    }

    public static <T extends InstructionPayload> Instruction<T> buildInstruction(T t) {
        return buildInstruction(t, randomRequestId(false));
    }

    public static <T extends InstructionPayload> Instruction<T> buildInstruction(T t, String str) {
        NamespaceName namespaceName = getNamespaceName(t);
        return new Instruction<>(new InstructionHeader(namespaceName.namespace(), namespaceName.name()).setId(str), t);
    }

    private static ObjectMapper buildObjectMapper(boolean z) {
        DefaultSerializerProvider.Impl impl = new DefaultSerializerProvider.Impl();
        if (!z) {
            impl.setNullValueSerializer(new a());
        }
        ObjectMapper objectMapperRegisterModule = new ObjectMapper().setSerializerProvider(impl).setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE).setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY).setSerializationInclusion(JsonInclude.Include.ALWAYS).disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES).enable(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE).registerModule(new c());
        MutableConfigOverride mutableConfigOverrideConfigOverride = objectMapperRegisterModule.configOverride(Optional.class);
        JsonInclude.Include include = JsonInclude.Include.NON_ABSENT;
        mutableConfigOverrideConfigOverride.setInclude(JsonInclude.Value.construct(include, include));
        JsonInclude.Value valueConstruct = JsonInclude.Value.construct(include, include);
        objectMapperRegisterModule.configOverride(List.class).setInclude(valueConstruct);
        objectMapperRegisterModule.configOverride(Set.class).setInclude(valueConstruct);
        objectMapperRegisterModule.configOverride(Map.class).setInclude(valueConstruct);
        return objectMapperRegisterModule;
    }

    public static <T> Instruction<T> findInstructionOrNull(ArrayNode arrayNode, String str, String str2) {
        for (JsonNode jsonNode : arrayNode) {
            JsonNode jsonNode2 = jsonNode.get("header");
            if (jsonNode2 != null && jsonNode2.has("namespace") && jsonNode2.has("name")) {
                String strAsText = jsonNode2.get("namespace").asText();
                String strAsText2 = jsonNode2.get("name").asText();
                if (str.equals(strAsText) && str2.equals(strAsText2)) {
                    return readInstruction(jsonNode);
                }
            }
        }
        return null;
    }

    public static <T> Instruction<T> findInstructionOrNull(List<Instruction<?>> list, String str, String str2) {
        Iterator<Instruction<?>> it2 = list.iterator();
        while (it2.hasNext()) {
            Instruction<T> instruction = (Instruction) it2.next();
            InstructionHeader header = instruction.getHeader();
            if (str.equals(header.getNamespace()) && str2.equals(header.getName())) {
                return instruction;
            }
        }
        return null;
    }

    private static <H extends MessageHeader<H>, P> P findPayload(H h, JsonNode jsonNode) {
        Class<?> clsFindClass = mapping.findClass(h.getNamespace(), h.getName());
        if (clsFindClass != null) {
            return (P) fromJsonNode(jsonNode.get("payload"), clsFindClass);
        }
        return null;
    }

    public static <T> T fromJsonNode(JsonNode jsonNode, Class<T> cls) {
        return (T) objectMapper.treeToValue(jsonNode, cls);
    }

    public static <T> T fromJsonString(String str, Class<T> cls) {
        return (T) objectMapper.readValue(str, cls);
    }

    private static NamespaceName getNamespaceName(Object obj) {
        NamespaceName namespaceName = (NamespaceName) obj.getClass().getAnnotation(NamespaceName.class);
        if (namespaceName != null) {
            return namespaceName;
        }
        throw new UnsupportedOperationException("Cannot find NamespaceName");
    }

    public static ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public static String randomRequestId(boolean z) {
        UUID uuidRandomUUID = UUID.randomUUID();
        if (z) {
            return uuidRandomUUID.toString();
        }
        return Long.toHexString(uuidRandomUUID.getMostSignificantBits()) + Long.toHexString(uuidRandomUUID.getLeastSignificantBits());
    }

    public static <T> Context<T> readContext(JsonNode jsonNode) {
        ContextHeader contextHeader = (ContextHeader) fromJsonNode(jsonNode.get("header"), ContextHeader.class);
        Object objFindPayload = findPayload(contextHeader, jsonNode);
        if (objFindPayload == null) {
            return null;
        }
        return new Context<>(contextHeader, objFindPayload);
    }

    public static <T> Context<T> readContext(String str) {
        return readContext(getObjectMapper().readTree(str));
    }

    public static <T> Event<T> readEvent(JsonNode jsonNode) {
        ArrayList arrayList;
        EventHeader eventHeader = (EventHeader) fromJsonNode(jsonNode.get("header"), EventHeader.class);
        JsonNode jsonNode2 = jsonNode.get(DbUtils.Const.Table.CONTEXT);
        if (jsonNode2 == null || !jsonNode2.isArray()) {
            arrayList = null;
        } else {
            ArrayNode arrayNode = (ArrayNode) jsonNode2;
            arrayList = new ArrayList(arrayNode.size());
            Iterator<JsonNode> itElements = arrayNode.elements();
            while (itElements.hasNext()) {
                Context context = readContext(itElements.next());
                if (context != null) {
                    arrayList.add(context);
                }
            }
        }
        Object objFindPayload = findPayload(eventHeader, jsonNode);
        if (objFindPayload == null) {
            return null;
        }
        return new Event<>(arrayList, eventHeader, objFindPayload);
    }

    public static <T> Event<T> readEvent(String str) {
        return readEvent(getObjectMapper().readTree(str));
    }

    public static <T> Instruction<T> readInstruction(JsonNode jsonNode) {
        InstructionHeader instructionHeader = (InstructionHeader) fromJsonNode(jsonNode.get("header"), InstructionHeader.class);
        Object objFindPayload = findPayload(instructionHeader, jsonNode);
        if (objFindPayload == null) {
            return new Instruction<>(instructionHeader, jsonNode.get("payload") == null ? objectMapper.createObjectNode() : jsonNode.get("payload"));
        }
        return new Instruction<>(instructionHeader, objFindPayload);
    }

    public static <T> Instruction<T> readInstruction(String str) {
        return readInstruction(getObjectMapper().readTree(str));
    }

    public static List<Instruction<?>> readInstructions(ArrayNode arrayNode) {
        ArrayList arrayList = new ArrayList();
        Iterator<JsonNode> it2 = arrayNode.iterator();
        while (it2.hasNext()) {
            try {
                Instruction instruction = readInstruction(it2.next());
                if (instruction != null) {
                    arrayList.add(instruction);
                }
            } catch (JsonProcessingException unused) {
            }
        }
        return arrayList;
    }

    public static <T extends JsonNode> T toJsonNode(Object obj) {
        return (T) objectMapper.valueToTree(obj);
    }

    public static <T extends JsonNode> T toJsonNodeAllowNull(Object obj) {
        return (T) objectMapperAllowNull.valueToTree(obj);
    }

    public static String toJsonString(Object obj) {
        return objectMapper.writeValueAsString(obj);
    }

    public static String toJsonString(Object obj, boolean z) {
        return toJsonStringImpl(objectMapper, obj, z);
    }

    public static String toJsonStringAllowNull(Object obj) {
        return objectMapperAllowNull.writeValueAsString(obj);
    }

    public static String toJsonStringAllowNull(Object obj, boolean z) {
        return toJsonStringImpl(objectMapperAllowNull, obj, z);
    }

    private static String toJsonStringImpl(ObjectMapper objectMapper2, Object obj, boolean z) {
        return z ? objectMapper2.writer(SerializationFeature.INDENT_OUTPUT).writeValueAsString(obj) : objectMapper2.writeValueAsString(obj);
    }

    public static ArrayNode writeInstructions(List<Instruction<?>> list) {
        ArrayNode arrayNodeCreateArrayNode = objectMapper.createArrayNode();
        Iterator<Instruction<?>> it2 = list.iterator();
        while (it2.hasNext()) {
            JsonNode jsonNode = toJsonNode(it2.next());
            if (jsonNode != null) {
                arrayNodeCreateArrayNode.add(jsonNode);
            }
        }
        return arrayNodeCreateArrayNode;
    }
}
