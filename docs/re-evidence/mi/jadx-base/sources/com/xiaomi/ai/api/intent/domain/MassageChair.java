package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.ai.api.intent.slots.Miai;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class MassageChair<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public enum Manipulation {
        FullBody(1, "FullBody"),
        ShoulderAndNeck(2, "ShoulderAndNeck"),
        WaistAndHip(3, "WaistAndHip"),
        Vitality(4, "Vitality"),
        Relaxed(5, "Relaxed"),
        ZeroGravity(6, "ZeroGravity"),
        Reading(7, "Reading"),
        Sleep(8, "Sleep"),
        RelieveStress(9, "RelieveStress"),
        Favorites(10, "Favorites");

        private int id;
        private String name;

        Manipulation(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static Manipulation find(String str) {
            for (Manipulation manipulation : values()) {
                if (manipulation.name.equals(str)) {
                    return manipulation;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static Manipulation read(String str) {
            return find(str);
        }

        public static String write(Manipulation manipulation) {
            return manipulation.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class __switch implements EntityType {
        public static __switch read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new __switch();
        }

        public static c4h write(__switch __switchVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class allAirbagSwitch implements EntityType {
        public static allAirbagSwitch read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new allAirbagSwitch();
        }

        public static c4h write(allAirbagSwitch allairbagswitch) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class backrestAngle implements EntityType {
        private Optional<Slot<Miai.Number>> value = Optional.a();

        public static backrestAngle read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            backrestAngle backrestangle = new backrestAngle();
            if (zsdVar.z("value")) {
                backrestangle.setValue(IntentUtils.readSlot(zsdVar.w("value"), Miai.Number.class));
            }
            return backrestangle;
        }

        public static c4h write(backrestAngle backrestangle) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (backrestangle.value.c()) {
                c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(backrestangle.value.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Number>> getValue() {
            return this.value;
        }

        public backrestAngle setValue(Slot<Miai.Number> slot) {
            this.value = Optional.e(slot);
            return this;
        }
    }

    public static class footRollerSwitch implements EntityType {
        public static footRollerSwitch read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new footRollerSwitch();
        }

        public static c4h write(footRollerSwitch footrollerswitch) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class massage implements EntityType {
        public static massage read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new massage();
        }

        public static c4h write(massage massageVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class massageStrength implements EntityType {
        private Optional<Slot<Miai.Number>> value = Optional.a();

        public static massageStrength read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            massageStrength massagestrength = new massageStrength();
            if (zsdVar.z("value")) {
                massagestrength.setValue(IntentUtils.readSlot(zsdVar.w("value"), Miai.Number.class));
            }
            return massagestrength;
        }

        public static c4h write(massageStrength massagestrength) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (massagestrength.value.c()) {
                c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(massagestrength.value.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Number>> getValue() {
            return this.value;
        }

        public massageStrength setValue(Slot<Miai.Number> slot) {
            this.value = Optional.e(slot);
            return this;
        }
    }

    public static class mode implements EntityType {
        private Optional<Slot<Manipulation>> name = Optional.a();

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            if (zsdVar.z("name")) {
                modeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), Manipulation.class));
            }
            return modeVar;
        }

        public static c4h write(mode modeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (modeVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(modeVar.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Manipulation>> getName() {
            return this.name;
        }

        public mode setName(Slot<Manipulation> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public MassageChair() {
    }

    public static MassageChair read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        MassageChair massageChair = new MassageChair(IntentUtils.readEntityType(zsdVar, AIApiConstants.MassageChair.NAME, optional));
        if (zsdVar.z("device")) {
            massageChair.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            massageChair.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            massageChair.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            massageChair.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            massageChair.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            massageChair.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            massageChair.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return massageChair;
    }

    public static zsd write(MassageChair massageChair) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(massageChair.entity_type);
        if (massageChair.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(massageChair.device.b()));
        }
        if (massageChair.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(massageChair.room.b()));
        }
        if (massageChair.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(massageChair.is_all_to_operate.b()));
        }
        if (massageChair.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(massageChair.sub_category.b()));
        }
        if (massageChair.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(massageChair.service_entity.b()));
        }
        if (massageChair.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(massageChair.description.b()));
        }
        if (massageChair.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(massageChair.timing.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getDescription() {
        return this.description;
    }

    public Optional<Slot<String>> getDevice() {
        return this.device;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<Boolean>> getIsAllToOperate() {
        return this.is_all_to_operate;
    }

    public Optional<Slot<String>> getRoom() {
        return this.room;
    }

    public Optional<Slot<String>> getServiceEntity() {
        return this.service_entity;
    }

    public Optional<Slot<String>> getSubCategory() {
        return this.sub_category;
    }

    public Optional<Slot<Miai.Datetime>> getTiming() {
        return this.timing;
    }

    public MassageChair setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public MassageChair setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public MassageChair setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public MassageChair setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public MassageChair setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public MassageChair setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public MassageChair setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public MassageChair setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public MassageChair(T t) {
        this.entity_type = t;
    }
}
