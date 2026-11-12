package com.xiaomi.ai.api.common;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.cfg.MutableConfigOverride;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.common.Optional;
import defpackage.b2h;
import defpackage.drd;
import defpackage.mj1;
import defpackage.zsd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
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

    public static <T extends InstructionPayload> Instruction<T> buildInstruction(T t) {
        return buildInstruction(t, randomRequestId(false));
    }

    private static ObjectMapper buildObjectMapper(boolean z) {
        DefaultSerializerProvider.Impl impl = new DefaultSerializerProvider.Impl();
        if (!z) {
            impl.setNullValueSerializer(new b2h());
        }
        ObjectMapper objectMapperRegisterModule = new ObjectMapper().setSerializerProvider(impl).setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE).setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY).setSerializationInclusion(JsonInclude.Include.ALWAYS).disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES).enable(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE).registerModule(new drd());
        MutableConfigOverride mutableConfigOverrideConfigOverride = objectMapperRegisterModule.configOverride(Optional.class);
        JsonInclude.Include include = JsonInclude.Include.NON_ABSENT;
        mutableConfigOverrideConfigOverride.setInclude(JsonInclude.Value.construct(include, include));
        JsonInclude.Value valueConstruct = JsonInclude.Value.construct(include, include);
        objectMapperRegisterModule.configOverride(List.class).setInclude(valueConstruct);
        objectMapperRegisterModule.configOverride(Set.class).setInclude(valueConstruct);
        objectMapperRegisterModule.configOverride(Map.class).setInclude(valueConstruct);
        return objectMapperRegisterModule;
    }

    public static <T> Instruction<T> findInstructionOrNull(mj1 mj1Var, String str, String str2) throws JsonProcessingException {
        for (zsd zsdVar : mj1Var) {
            zsd zsdVarW = zsdVar.w("header");
            if (zsdVarW != null && zsdVarW.z("namespace") && zsdVarW.z("name")) {
                String strL = zsdVarW.w("namespace").l();
                String strL2 = zsdVarW.w("name").l();
                if (str.equals(strL) && str2.equals(strL2)) {
                    return readInstruction(zsdVar);
                }
            }
        }
        return null;
    }

    private static <H extends MessageHeader<H>, P> P findPayload(H h, zsd zsdVar) throws JsonProcessingException {
        Class<?> clsFindClass = mapping.findClass(h.getNamespace(), h.getName());
        if (clsFindClass != null) {
            return (P) fromJsonNode(zsdVar.w(TSMAuthContants.PARAM_PAYLOAD), clsFindClass);
        }
        return null;
    }

    public static <T> T fromJsonNode(zsd zsdVar, Class<T> cls) throws JsonProcessingException {
        return (T) objectMapper.treeToValue(zsdVar, cls);
    }

    public static <T> T fromJsonString(String str, Class<T> cls) throws IOException {
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

    public static <T> Context<T> readContext(String str) throws IOException {
        return readContext(getObjectMapper().readTree(str));
    }

    public static <T> Event<T> readEvent(zsd zsdVar) throws JsonProcessingException {
        return readEvent(zsdVar, false);
    }

    public static <T> Instruction<T> readInstruction(String str) throws IOException {
        return readInstruction(getObjectMapper().readTree(str));
    }

    public static List<Instruction<?>> readInstructions(mj1 mj1Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<zsd> it = mj1Var.iterator();
        while (it.hasNext()) {
            try {
                Instruction instruction = readInstruction(it.next());
                if (instruction != null) {
                    arrayList.add(instruction);
                }
            } catch (JsonProcessingException unused) {
            }
        }
        return arrayList;
    }

    public static <T> Event<T> readNonEmptyEvent(String str) throws IOException {
        return readEvent(getObjectMapper().readTree(str), true);
    }

    public static <T extends zsd> T toJsonNode(Object obj) {
        return (T) objectMapper.valueToTree(obj);
    }

    public static <T extends zsd> T toJsonNodeAllowNull(Object obj) {
        return (T) objectMapperAllowNull.valueToTree(obj);
    }

    public static String toJsonString(Object obj, boolean z) throws JsonProcessingException {
        return toJsonStringImpl(objectMapper, obj, z);
    }

    public static String toJsonStringAllowNull(Object obj, boolean z) throws JsonProcessingException {
        return toJsonStringImpl(objectMapperAllowNull, obj, z);
    }

    private static String toJsonStringImpl(ObjectMapper objectMapper2, Object obj, boolean z) throws JsonProcessingException {
        return z ? objectMapper2.writer(SerializationFeature.INDENT_OUTPUT).writeValueAsString(obj) : objectMapper2.writeValueAsString(obj);
    }

    public static mj1 writeInstructions(List<Instruction<?>> list) {
        mj1 mj1VarCreateArrayNode = objectMapper.createArrayNode();
        Iterator<Instruction<?>> it = list.iterator();
        while (it.hasNext()) {
            zsd jsonNode = toJsonNode(it.next());
            if (jsonNode != null) {
                mj1VarCreateArrayNode.d0(jsonNode);
            }
        }
        return mj1VarCreateArrayNode;
    }

    public static <T extends EventPayload> Event<T> buildEvent(T t, List<Context> list) {
        return buildEvent(t, list, randomRequestId(false));
    }

    public static <T extends InstructionPayload> Instruction<T> buildInstruction(T t, String str) {
        NamespaceName namespaceName = getNamespaceName(t);
        return new Instruction<>(new InstructionHeader(namespaceName.namespace(), namespaceName.name()).setId(str), t);
    }

    public static <T> Context<T> readContext(zsd zsdVar) throws JsonProcessingException {
        ContextHeader contextHeader = (ContextHeader) fromJsonNode(zsdVar.w("header"), ContextHeader.class);
        Object objFindPayload = findPayload(contextHeader, zsdVar);
        if (objFindPayload == null) {
            return null;
        }
        return new Context<>(contextHeader, objFindPayload);
    }

    public static <T> Instruction<T> readInstruction(zsd zsdVar) throws JsonProcessingException {
        InstructionHeader instructionHeader = (InstructionHeader) fromJsonNode(zsdVar.w("header"), InstructionHeader.class);
        Object objFindPayload = findPayload(instructionHeader, zsdVar);
        if (objFindPayload == null) {
            return new Instruction<>(instructionHeader, zsdVar.w(TSMAuthContants.PARAM_PAYLOAD) == null ? objectMapper.createObjectNode() : zsdVar.w(TSMAuthContants.PARAM_PAYLOAD));
        }
        return new Instruction<>(instructionHeader, objFindPayload);
    }

    public static String toJsonString(Object obj) throws JsonProcessingException {
        return objectMapper.writeValueAsString(obj);
    }

    public static String toJsonStringAllowNull(Object obj) throws JsonProcessingException {
        return objectMapperAllowNull.writeValueAsString(obj);
    }

    public static <T extends EventPayload> Event<T> buildEvent(T t, List<Context> list, String str) {
        NamespaceName namespaceName = getNamespaceName(t);
        return new Event<>(list, new EventHeader(namespaceName.namespace(), namespaceName.name()).setId(str), t);
    }

    public static <T> Event<T> readEvent(String str) throws IOException {
        return readEvent(getObjectMapper().readTree(str));
    }

    public static <T> Event<T> readEvent(zsd zsdVar, boolean z) throws JsonProcessingException {
        ArrayList arrayList;
        EventHeader eventHeader = (EventHeader) fromJsonNode(zsdVar.w("header"), EventHeader.class);
        zsd zsdVarW = zsdVar.w("context");
        if (zsdVarW == null || !zsdVarW.C()) {
            arrayList = null;
        } else {
            mj1 mj1Var = (mj1) zsdVarW;
            arrayList = new ArrayList(mj1Var.size());
            Iterator<zsd> itU = mj1Var.u();
            while (itU.hasNext()) {
                Context context = readContext(itU.next());
                if (context != null) {
                    arrayList.add(context);
                }
            }
        }
        Object objFindPayload = findPayload(eventHeader, zsdVar);
        if (z) {
            if (objFindPayload == null) {
                return new Event<>(arrayList, eventHeader, zsdVar.w(TSMAuthContants.PARAM_PAYLOAD) == null ? objectMapper.createObjectNode() : zsdVar.w(TSMAuthContants.PARAM_PAYLOAD));
            }
            return new Event<>(arrayList, eventHeader, objFindPayload);
        }
        if (objFindPayload == null) {
            return null;
        }
        return new Event<>(arrayList, eventHeader, objFindPayload);
    }

    public static <T extends EventPayload> Event<T> buildEvent(T t, List<Context> list, String str, Boolean bool) {
        NamespaceName namespaceName = getNamespaceName(t);
        return new Event<>(list, new EventHeader(namespaceName.namespace(), namespaceName.name()).setId(str).setIsPassive(bool), t);
    }

    public static <T> Instruction<T> findInstructionOrNull(List<Instruction<?>> list, String str, String str2) {
        Iterator<Instruction<?>> it = list.iterator();
        while (it.hasNext()) {
            Instruction<T> instruction = (Instruction) it.next();
            InstructionHeader header = instruction.getHeader();
            if (str.equals(header.getNamespace()) && str2.equals(header.getName())) {
                return instruction;
            }
        }
        return null;
    }
}
