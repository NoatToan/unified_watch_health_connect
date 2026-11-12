package com.xiaomi.ai.api.intent;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.cfg.MutableConfigOverride;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.mibi.sdk.component.Constants;
import com.xiaomi.common.Optional;
import com.xiaomi.common.Pair;
import defpackage.a2h;
import defpackage.c4h;
import defpackage.drd;
import defpackage.gv5;
import defpackage.mj1;
import defpackage.zsd;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

/* JADX INFO: loaded from: classes7.dex */
public class IntentUtils {
    private static ApiNameMapping mapping;
    public static ObjectMapper objectMapper = buildObjectMapper(false);
    public static ObjectMapper objectMapperAllowNull = buildObjectMapper(true);

    static {
        try {
            mapping = (ApiNameMapping) IntentUtils.class.getClassLoader().loadClass("com.xiaomi.ai.api.intent.AIApiNameMapping").newInstance();
        } catch (Throwable th) {
            throw new IllegalStateException(th);
        }
    }

    public static <T> Slot<T> and(Slot<T>... slotArr) {
        return relationApply(ValueRelation.and, Arrays.asList(slotArr));
    }

    public static AndThenRelation andThen(IntentsWithRelation... intentsWithRelationArr) {
        return new AndThenRelation(flatten(intentsWithRelationArr));
    }

    private static ObjectMapper buildObjectMapper(boolean z) {
        DefaultSerializerProvider.Impl impl = new DefaultSerializerProvider.Impl();
        if (!z) {
            impl.setNullValueSerializer(new a2h());
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

    private static String combine(String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            if (i != 0) {
                sb.append(".");
            }
            sb.append(strArr[i]);
        }
        return sb.toString();
    }

    private static Intention find(List<Intention> list, String str) {
        for (Intention intention : list) {
            if (intention.getId().equals(str)) {
                return intention;
            }
        }
        return null;
    }

    private static List<IntentsWithRelation> flatten(IntentsWithRelation... intentsWithRelationArr) {
        ArrayList arrayList = new ArrayList();
        for (IntentsWithRelation intentsWithRelation : intentsWithRelationArr) {
            if (intentsWithRelation instanceof AndThenRelation) {
                arrayList.addAll(flatten((IntentsWithRelation) ((AndThenRelation) intentsWithRelation).getRelations()));
            } else {
                arrayList.add(intentsWithRelation);
            }
        }
        return arrayList;
    }

    public static <T> T fromJsonNode(zsd zsdVar, Class<T> cls) throws JsonProcessingException {
        return (T) objectMapper.treeToValue(zsdVar, cls);
    }

    public static <T> T fromJsonString(String str, Class<T> cls) throws IOException {
        return (T) objectMapper.readValue(str, cls);
    }

    private static Optional<List<String>> getEnumValues(Class<?> cls) throws ClassNotFoundException {
        if (!Enum.class.isAssignableFrom(cls)) {
            return Optional.a();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : Class.forName(cls.getName()).getEnumConstants()) {
            arrayList.add(obj.toString());
        }
        return Optional.d(arrayList);
    }

    public static ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    private static List<SlotInfo> getSlotsInfo(Class<?> cls) throws ClassNotFoundException {
        ArrayList arrayList = new ArrayList();
        for (Field field : cls.getDeclaredFields()) {
            SlotInfo slotInfo = new SlotInfo();
            slotInfo.setName(field.getName());
            if (Slot.class.isAssignableFrom(field.getType())) {
                slotInfo.setRequired(true);
                ParameterizedTypeImpl parameterizedTypeImpl = field.getGenericType().getActualTypeArguments()[0];
                if (parameterizedTypeImpl instanceof ParameterizedTypeImpl) {
                    setTypeInfo(slotInfo, parameterizedTypeImpl.getRawType());
                } else {
                    setTypeInfo(slotInfo, (Class) parameterizedTypeImpl);
                }
            } else {
                if (Optional.class.isAssignableFrom(field.getType()) && Slot.class.isAssignableFrom(field.getGenericType().getActualTypeArguments()[0].getRawType())) {
                    slotInfo.setRequired(false);
                    ParameterizedTypeImpl parameterizedTypeImpl2 = field.getGenericType().getActualTypeArguments()[0].getActualTypeArguments()[0];
                    if (parameterizedTypeImpl2 instanceof ParameterizedTypeImpl) {
                        setTypeInfo(slotInfo, parameterizedTypeImpl2.getRawType());
                    } else {
                        setTypeInfo(slotInfo, (Class) parameterizedTypeImpl2);
                    }
                }
            }
            arrayList.add(slotInfo);
        }
        return arrayList;
    }

    public static List<IntentInfo> intents() throws ClassNotFoundException {
        ArrayList arrayList = new ArrayList();
        for (action.ActionName actionName : ActionFormatRegistry.intentFormatCache.values()) {
            IntentInfo intentInfo = new IntentInfo();
            intentInfo.setName(actionName.intentName()).setCategory(actionName.getCategory()).setSubCategory(actionName.getSubCategory()).setSlotsInfo(slots(actionName.toString()));
            arrayList.add(intentInfo);
        }
        return arrayList;
    }

    public static <T> Slot<T> not(Slot<T>... slotArr) {
        return relationApply(ValueRelation.not, Arrays.asList(slotArr));
    }

    public static OrRelation or(IntentsWithRelation... intentsWithRelationArr) {
        ArrayList arrayList = new ArrayList();
        for (IntentsWithRelation intentsWithRelation : intentsWithRelationArr) {
            if (intentsWithRelation instanceof SelfRelation) {
                arrayList.add((SelfRelation) intentsWithRelation);
            } else {
                if (!(intentsWithRelation instanceof OrRelation)) {
                    throw new IllegalArgumentException("or relation only connect self relations.");
                }
                arrayList.addAll(((OrRelation) intentsWithRelation).getSelfRelations());
            }
        }
        return new OrRelation(arrayList);
    }

    public static IntentionAction readAction(zsd zsdVar, action.ActionName actionName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (IntentionAction) mapping.findClass(actionName.getAction()).getDeclaredMethod("read", zsd.class, action.ActionName.class).invoke(null, zsdVar, actionName);
    }

    public static DialogTask readDialogTask(zsd zsdVar) throws JsonProcessingException {
        DialogTask dialogTask = new DialogTask((String) fromJsonNode(zsdVar.w("name"), String.class), DialogTask.DialogAction.read(zsdVar.w("action").l()));
        if (zsdVar.z("error_type")) {
            dialogTask.setError_type(DialogTask.ErrorType.read(zsdVar.w("error_type").l()));
        }
        if (zsdVar.z("slots")) {
            dialogTask.setSlots((zsd) fromJsonNode(zsdVar.w("slots"), zsd.class));
        }
        if (zsdVar.z("focus_slots")) {
            dialogTask.setFocus_slots((List) fromJsonNode(zsdVar.w("focus_slots"), List.class));
        }
        return dialogTask;
    }

    public static <T extends EntityType> T readEntityType(zsd zsdVar, String str, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> clsFindClass;
        if (optional.c()) {
            clsFindClass = mapping.findClass(str + "." + optional.b());
        } else {
            clsFindClass = mapping.findClass("general");
        }
        Method declaredMethod = clsFindClass.getDeclaredMethod("read", zsd.class);
        return optional.c() ? (T) declaredMethod.invoke(null, readWrapName(zsdVar, optional.b())) : (T) declaredMethod.invoke(null, zsdVar);
    }

    public static <S> Intention<S> readIntention(String str) throws IOException {
        return readIntention(getObjectMapper().readTree(str));
    }

    public static <T extends EntityType> IntentionEntity<T, general> readIntentionEntity(zsd zsdVar, action.EntityName entityName) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (IntentionEntity) mapping.findClass("IntentionEntity." + entityName.getName()).getDeclaredMethod("read", zsd.class, Optional.class).invoke(null, zsdVar, entityName.getProp());
    }

    public static IntentsWithRelation readIntentsWithRelation(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        zsd zsdVarW = zsdVar.w("relation");
        ArrayList arrayList = new ArrayList();
        Iterator<zsd> it = zsdVar.w("intentions").iterator();
        while (it.hasNext()) {
            arrayList.add(readIntention(it.next()));
        }
        return readRelation(zsdVarW, arrayList);
    }

    public static IntentsWithRelation readRelation(zsd zsdVar, List<Intention> list) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Iterator<Map.Entry<String, zsd>> itV = zsdVar.v();
        if (!itV.hasNext()) {
            return null;
        }
        Map.Entry<String, zsd> next = itV.next();
        if (next.getKey().equals("intent")) {
            SelfRelation selfRelation = new SelfRelation(find(list, zsdVar.w("intent").l()));
            if (zsdVar.z("executor")) {
                selfRelation.setExecutor(Optional.e(readSlot(zsdVar.w("executor"), IntentExecutor.class)));
            }
            return selfRelation;
        }
        if (next.getKey().equals("or")) {
            mj1 mj1Var = (mj1) next.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator<zsd> it = mj1Var.iterator();
            while (it.hasNext()) {
                arrayList.add((SelfRelation) readRelation(it.next(), list));
            }
            return new OrRelation(arrayList);
        }
        if (!next.getKey().equals("andthen")) {
            throw new IllegalArgumentException("unsupported relation intention, you should update spec version.");
        }
        mj1 mj1Var2 = (mj1) next.getValue();
        ArrayList arrayList2 = new ArrayList();
        Iterator<zsd> it2 = mj1Var2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(readRelation(it2.next(), list));
        }
        return new AndThenRelation(arrayList2);
    }

    public static <T> Slot<T> readSlot(zsd zsdVar, Class<?> cls) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Slot<T> slot;
        Class<?> clsFindClass = mapping.findClass("Miai." + cls.getSimpleName());
        if (clsFindClass == null) {
            clsFindClass = mapping.findClass("Enum." + cls.getSimpleName());
        }
        if (clsFindClass != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) fromJsonNode(zsdVar.w(Constants.KEY_RECHARGE_VALUES), List.class)).iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod("read", String.class).invoke(null, it.next()));
            }
            slot = new Slot<>(arrayList);
        } else if (DomainType.class.isAssignableFrom(cls)) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<zsd> it2 = zsdVar.w(Constants.KEY_RECHARGE_VALUES).iterator();
            while (it2.hasNext()) {
                arrayList2.add(fromJsonNode(it2.next(), cls));
            }
            slot = new Slot<>(arrayList2);
        } else if (IntentExecutor.class.isAssignableFrom(cls)) {
            ArrayList arrayList3 = new ArrayList();
            Iterator<zsd> it3 = zsdVar.w(Constants.KEY_RECHARGE_VALUES).iterator();
            while (it3.hasNext()) {
                arrayList3.add(IntentExecutor.read(it3.next()));
            }
            slot = new Slot<>(arrayList3);
        } else {
            slot = new Slot<>((List) fromJsonNode(zsdVar.w(Constants.KEY_RECHARGE_VALUES), List.class));
        }
        if (zsdVar.z("resolution")) {
            ArrayList arrayList4 = new ArrayList();
            Iterator<zsd> it4 = zsdVar.w("resolution").iterator();
            while (it4.hasNext()) {
                arrayList4.add(fromJsonNode(it4.next(), Resolution.class));
            }
            if (!arrayList4.isEmpty()) {
                slot.setResolution(Optional.d(arrayList4));
            }
        }
        if (zsdVar.z("relation")) {
            slot.setRelation(Optional.e(ValueRelation.find(zsdVar.w("relation").l())));
        }
        if (zsdVar.z("expression")) {
            slot.setExpression(Optional.d(fromJsonNode(zsdVar.w("expression"), String.class)));
        }
        if (zsdVar.z("scores")) {
            slot.setScores(Optional.d((List) fromJsonNode(zsdVar.w("resolution"), List.class)));
        }
        if (zsdVar.z("hits")) {
            slot.setHits(Optional.d(fromJsonNode(zsdVar.w("hits"), Integer.class)));
        }
        return slot;
    }

    public static zsd readWrapName(zsd zsdVar, String str) {
        c4h c4hVarCreateObjectNode = objectMapper.createObjectNode();
        Iterator<Map.Entry<String, zsd>> itV = zsdVar.v();
        while (itV.hasNext()) {
            Map.Entry<String, zsd> next = itV.next();
            if (next.getKey().startsWith(str)) {
                c4hVarCreateObjectNode.f0(next.getKey().substring(str.length() + 1), next.getValue());
            }
        }
        return c4hVarCreateObjectNode;
    }

    private static <T> Slot<T> relationApply(ValueRelation valueRelation, List<Slot<T>> list) {
        String string;
        StringBuilder sb;
        ValueRelation valueRelation2 = ValueRelation.not;
        int i = 0;
        if (valueRelation == valueRelation2 && list.size() == 1) {
            Slot<T> slot = list.get(0);
            String strB = slot.getExpression().c() ? slot.getExpression().b() : slot.value().toString();
            if (slot.getRelation().c()) {
                sb = new StringBuilder();
                sb.append("!(");
                sb.append(strB);
                sb.append(")");
            } else {
                sb = new StringBuilder();
                sb.append("!");
                sb.append(strB);
            }
            string = sb.toString();
        } else if (valueRelation == valueRelation2) {
            string = "";
            while (i < list.size()) {
                Slot<T> slot2 = list.get(i);
                if (i != 0) {
                    string = string + gv5.CONNECT_STR;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(slot2.getExpression().c() ? slot2.getExpression().b() : slot2.value().toString());
                string = sb2.toString();
                i++;
            }
        } else {
            string = "";
            while (i < list.size()) {
                Slot<T> slot3 = list.get(i);
                if (i != 0) {
                    string = string + valueRelation.getName();
                }
                String strB2 = slot3.getExpression().c() ? slot3.getExpression().b() : slot3.value().toString();
                if (slot3.getRelation().c() && slot3.getRelation().b() != ValueRelation.not) {
                    strB2 = "(" + strB2 + ")";
                }
                string = string + strB2;
                i++;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Slot<T> slot4 : list) {
            arrayList.addAll(slot4.getValues());
            if (slot4.getResolution().c()) {
                arrayList2.addAll(slot4.getResolution().b());
            }
        }
        Slot<T> slot5 = new Slot<>(arrayList);
        if (!arrayList2.isEmpty()) {
            slot5.setResolution(Optional.d(arrayList2));
        }
        slot5.setRelation(Optional.d(valueRelation));
        slot5.setExpression(Optional.d(string));
        return slot5;
    }

    private static void setTypeInfo(SlotInfo slotInfo, Class<?> cls) throws ClassNotFoundException {
        if (Enum.class.isAssignableFrom(cls)) {
            slotInfo.setType("enum").setValues(getEnumValues(cls));
            return;
        }
        if (!GeneralType.class.isAssignableFrom(cls)) {
            slotInfo.setType(cls.getSimpleName());
            return;
        }
        slotInfo.setType("Miai." + cls.getSimpleName());
        for (Field field : cls.getDeclaredFields()) {
            if (Enum.class.isAssignableFrom(field.getType())) {
                slotInfo.setValues(getEnumValues(field.getType()));
                return;
            }
        }
    }

    public static List<SlotInfo> slots(String str) throws ClassNotFoundException {
        Optional<action.ActionName> optionalFindActionName = ActionFormatRegistry.findActionName(action.ActionName.newInstance(str).intentName());
        if (!optionalFindActionName.c()) {
            throw new IllegalArgumentException("intention name is illegal.");
        }
        action.ActionName actionNameB = optionalFindActionName.b();
        ArrayList arrayList = new ArrayList();
        for (Pair<String, action.EntityName> pair : actionNameB.getEntities()) {
            String key = pair.getKey();
            action.EntityName value = pair.getValue();
            if (value.getProp().c()) {
                for (SlotInfo slotInfo : getSlotsInfo(mapping.findClass(combine(value.getName(), value.getProp().b())))) {
                    slotInfo.setName(combine(key, value.getProp().b(), slotInfo.getName()));
                    arrayList.add(slotInfo);
                }
            }
            Class<?> clsFindClass = mapping.findClass(combine("IntentionEntity", value.getName()));
            for (SlotInfo slotInfo2 : getSlotsInfo(clsFindClass)) {
                slotInfo2.setName(combine(key, slotInfo2.getName()));
                arrayList.add(slotInfo2);
            }
            clsFindClass.getDeclaredFields();
        }
        return arrayList;
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

    public static zsd writeAction(IntentionAction intentionAction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> clsFindClass = mapping.findClass(intentionAction.getClass().getSimpleName());
        return (zsd) clsFindClass.getDeclaredMethod("write", clsFindClass).invoke(null, intentionAction);
    }

    public static zsd writeDialogTask(DialogTask dialogTask) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = objectMapper.createObjectNode();
        c4hVarCreateObjectNode.f0("name", toJsonNode(dialogTask.getName()));
        c4hVarCreateObjectNode.f0("action", toJsonNode(dialogTask.getAction()));
        if (dialogTask.getSlots() instanceof zsd) {
            c4hVarCreateObjectNode.f0("slots", (zsd) dialogTask.getSlots());
        } else {
            c4hVarCreateObjectNode.f0("slots", writeEntityType((EntityType) dialogTask.getSlots()));
        }
        if (dialogTask.getError_type().c()) {
            c4hVarCreateObjectNode.f0("error_type", toJsonNode(dialogTask.getError_type().b()));
        }
        c4hVarCreateObjectNode.f0("focus_slots", toJsonNode(dialogTask.getFocus_slots()));
        return c4hVarCreateObjectNode;
    }

    public static <T extends EntityType> zsd writeEntityType(T t) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        String canonicalName = t.getClass().getCanonicalName();
        int i = 0;
        for (int i2 = 0; i2 < canonicalName.length(); i2++) {
            if (canonicalName.charAt(i2) >= 'A' && canonicalName.charAt(i2) <= 'Z') {
                i = i2;
                break;
            }
        }
        if (canonicalName.equals("com.xiaomi.ai.api.intent.general")) {
            canonicalName = "general";
        }
        Class<?> clsFindClass = mapping.findClass(canonicalName.substring(i));
        return writeWrapName((zsd) clsFindClass.getDeclaredMethod("write", clsFindClass).invoke(null, t), t.getClass().getSimpleName());
    }

    public static <S> zsd writeIntention(Intention<S> intention) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar;
        c4h c4hVarCreateObjectNode = objectMapper.createObjectNode();
        c4hVarCreateObjectNode.f0("id", toJsonNode(intention.getId()));
        c4hVarCreateObjectNode.f0("name", toJsonNode(intention.getName()));
        c4hVarCreateObjectNode.f0("category", toJsonNode(intention.getCategory()));
        c4hVarCreateObjectNode.f0("sub_category", toJsonNode(intention.getSubCategory()));
        c4hVarCreateObjectNode.f0("info", toJsonNode(intention.getInfo()));
        if (intention.getTask().c()) {
            c4hVarCreateObjectNode.f0("task", intention.getTask().b());
        }
        S slots = intention.getSlots();
        if (slots instanceof zsd) {
            c4hVar = (c4h) slots;
        } else {
            if (!ActionFormatRegistry.findActionName(intention.getName()).c()) {
                throw new IllegalArgumentException(String.format("intent %s is not supported to write.", intention.getName()));
            }
            c4hVar = (c4h) writeAction((IntentionAction) slots);
        }
        Iterator<Map.Entry<String, zsd>> itV = c4hVar.v();
        while (itV.hasNext()) {
            Map.Entry<String, zsd> next = itV.next();
            c4hVar.f0(next.getKey(), ((c4h) next.getValue()).j0("name", next.getKey()));
        }
        c4hVarCreateObjectNode.f0("slots", c4hVar);
        return c4hVarCreateObjectNode;
    }

    public static <T extends EntityType> zsd writeIntentionEntity(IntentionEntity<T, general> intentionEntity) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        String simpleName = intentionEntity.getClass().getSimpleName();
        Class<?> clsFindClass = mapping.findClass("IntentionEntity." + simpleName);
        return (zsd) clsFindClass.getDeclaredMethod("write", clsFindClass).invoke(null, intentionEntity);
    }

    public static zsd writeIntentsWithRelation(IntentsWithRelation intentsWithRelation) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = objectMapper.createObjectNode();
        mj1 mj1VarCreateArrayNode = objectMapper.createArrayNode();
        Iterator<Intention> it = intentsWithRelation.intents().iterator();
        while (it.hasNext()) {
            mj1VarCreateArrayNode.d0(writeIntention(it.next()));
        }
        c4hVarCreateObjectNode.f0("intentions", mj1VarCreateArrayNode);
        c4hVarCreateObjectNode.f0("relation", writeRelation(intentsWithRelation));
        return c4hVarCreateObjectNode;
    }

    private static <T extends GeneralType<?>> String writeMiai(T t) {
        return t.toString();
    }

    public static zsd writeRelation(IntentsWithRelation intentsWithRelation) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = objectMapper.createObjectNode();
        if (intentsWithRelation instanceof SelfRelation) {
            SelfRelation selfRelation = (SelfRelation) intentsWithRelation;
            c4hVarCreateObjectNode.j0("intent", selfRelation.getIntent().getId());
            if (selfRelation.getExecutor().c()) {
                c4hVarCreateObjectNode.f0("executor", writeSlot(selfRelation.getExecutor().b()));
            }
        } else if (intentsWithRelation instanceof OrRelation) {
            mj1 mj1VarCreateArrayNode = objectMapper.createArrayNode();
            Iterator<SelfRelation> it = ((OrRelation) intentsWithRelation).getSelfRelations().iterator();
            while (it.hasNext()) {
                mj1VarCreateArrayNode.d0(writeRelation(it.next()));
            }
            c4hVarCreateObjectNode.f0("or", mj1VarCreateArrayNode);
        } else {
            if (!(intentsWithRelation instanceof AndThenRelation)) {
                throw new IllegalArgumentException("unsupported relation intention, you should update spec version.");
            }
            mj1 mj1VarCreateArrayNode2 = objectMapper.createArrayNode();
            Iterator<IntentsWithRelation> it2 = ((AndThenRelation) intentsWithRelation).getRelations().iterator();
            while (it2.hasNext()) {
                mj1VarCreateArrayNode2.d0(writeRelation(it2.next()));
            }
            c4hVarCreateObjectNode.f0("andthen", mj1VarCreateArrayNode2);
        }
        return c4hVarCreateObjectNode;
    }

    public static <T> c4h writeSlot(Slot<T> slot) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = objectMapper.createObjectNode();
        if (slot.value() instanceof GeneralType) {
            mj1 mj1VarCreateArrayNode = objectMapper.createArrayNode();
            Iterator<T> it = slot.getValues().iterator();
            while (it.hasNext()) {
                mj1VarCreateArrayNode.e0(writeMiai((GeneralType) it.next()));
            }
            c4hVarCreateObjectNode.f0(Constants.KEY_RECHARGE_VALUES, mj1VarCreateArrayNode);
        } else if (slot.value() instanceof Enumeration) {
            Class<?> clsFindClass = mapping.findClass("Enum." + slot.value().getClass().getSimpleName());
            if (clsFindClass != null) {
                mj1 mj1VarCreateArrayNode2 = objectMapper.createArrayNode();
                Iterator<T> it2 = slot.getValues().iterator();
                while (it2.hasNext()) {
                    mj1VarCreateArrayNode2.d0((zsd) clsFindClass.getDeclaredMethod("read", zsd.class).invoke(null, it2.next()));
                }
                c4hVarCreateObjectNode.f0(Constants.KEY_RECHARGE_VALUES, mj1VarCreateArrayNode2);
            } else {
                c4hVarCreateObjectNode.f0(Constants.KEY_RECHARGE_VALUES, toJsonNode(slot.getValues()));
            }
        } else if (slot.value() instanceof IntentExecutor) {
            mj1 mj1VarCreateArrayNode3 = objectMapper.createArrayNode();
            Iterator<T> it3 = slot.getValues().iterator();
            while (it3.hasNext()) {
                mj1VarCreateArrayNode3.d0(IntentExecutor.write((IntentExecutor) it3.next()));
            }
            c4hVarCreateObjectNode.f0(Constants.KEY_RECHARGE_VALUES, mj1VarCreateArrayNode3);
        } else {
            c4hVarCreateObjectNode.f0(Constants.KEY_RECHARGE_VALUES, toJsonNode(slot.getValues()));
        }
        if (slot.getResolution().c()) {
            c4hVarCreateObjectNode.f0("resolution", toJsonNode(slot.getResolution()));
        }
        if (slot.getRelation().c()) {
            c4hVarCreateObjectNode.f0("relation", toJsonNode(slot.getRelation().b().getName()));
        }
        if (slot.getExpression().c()) {
            c4hVarCreateObjectNode.f0("expression", toJsonNode(slot.getExpression()));
        }
        if (slot.getScores().c()) {
            c4hVarCreateObjectNode.f0("scores", toJsonNode(slot.getScores()));
        }
        if (slot.getHits().c()) {
            c4hVarCreateObjectNode.f0("hits", toJsonNode(slot.getHits()));
        }
        return c4hVarCreateObjectNode;
    }

    public static zsd writeWrapName(zsd zsdVar, String str) {
        c4h c4hVarCreateObjectNode = objectMapper.createObjectNode();
        Iterator<Map.Entry<String, zsd>> itV = zsdVar.v();
        while (itV.hasNext()) {
            Map.Entry<String, zsd> next = itV.next();
            c4hVarCreateObjectNode.f0(str + "." + next.getKey(), next.getValue());
        }
        return c4hVarCreateObjectNode;
    }

    public static <S> Intention<S> readIntention(zsd zsdVar) throws JsonProcessingException {
        String str = (String) fromJsonNode(zsdVar.w("id"), String.class);
        Intention<S> intention = new Intention<>((String) fromJsonNode(zsdVar.w("name"), String.class), IntentionInfo.read(zsdVar.w("info")), (zsd) fromJsonNode(zsdVar.w("slots"), zsd.class), (String) fromJsonNode(zsdVar.w("category"), String.class), (String) fromJsonNode(zsdVar.w("sub_category"), String.class), str);
        if (zsdVar.z("task")) {
            intention.setTask(Optional.e(zsdVar.w("task")));
        }
        return intention;
    }

    public static String toJsonString(Object obj) throws JsonProcessingException {
        return objectMapper.writeValueAsString(obj);
    }

    public static String toJsonStringAllowNull(Object obj) throws JsonProcessingException {
        return objectMapperAllowNull.writeValueAsString(obj);
    }

    public static IntentsWithRelation readIntentsWithRelation(String str) throws IllegalAccessException, NoSuchMethodException, IOException, InvocationTargetException {
        return readIntentsWithRelation(getObjectMapper().readTree(str));
    }

    public static <T> Slot<T> or(Slot<T>... slotArr) {
        return relationApply(ValueRelation.or, Arrays.asList(slotArr));
    }
}
