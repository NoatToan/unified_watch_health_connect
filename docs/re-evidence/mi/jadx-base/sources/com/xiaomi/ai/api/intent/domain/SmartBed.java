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
public class SmartBed<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public enum SmartBedHardness {
        Soft(1, "Soft"),
        Medium(2, "Medium"),
        Hard(3, "Hard");

        private int id;
        private String name;

        SmartBedHardness(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static SmartBedHardness find(String str) {
            for (SmartBedHardness smartBedHardness : values()) {
                if (smartBedHardness.name.equals(str)) {
                    return smartBedHardness;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static SmartBedHardness read(String str) {
            return find(str);
        }

        public static String write(SmartBedHardness smartBedHardness) {
            return smartBedHardness.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum SmartBedMode {
        Reading(1, "Reading"),
        Tv(2, "Tv"),
        ZeroGravity(3, "ZeroGravity"),
        LieFlat(4, "LieFlat"),
        AntiSnoring(5, "AntiSnoring"),
        Idle(6, "Idle"),
        Smart(7, "Smart"),
        Yoga(8, "Yoga");

        private int id;
        private String name;

        SmartBedMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static SmartBedMode find(String str) {
            for (SmartBedMode smartBedMode : values()) {
                if (smartBedMode.name.equals(str)) {
                    return smartBedMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static SmartBedMode read(String str) {
            return find(str);
        }

        public static String write(SmartBedMode smartBedMode) {
            return smartBedMode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
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

    public static class childLock implements EntityType {
        public static childLock read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new childLock();
        }

        public static c4h write(childLock childlock) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class hardness implements EntityType {
        private Optional<Slot<SmartBedHardness>> name = Optional.a();

        public static hardness read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            hardness hardnessVar = new hardness();
            if (zsdVar.z("name")) {
                hardnessVar.setName(IntentUtils.readSlot(zsdVar.w("name"), SmartBedHardness.class));
            }
            return hardnessVar;
        }

        public static c4h write(hardness hardnessVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (hardnessVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(hardnessVar.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<SmartBedHardness>> getName() {
            return this.name;
        }

        public hardness setName(Slot<SmartBedHardness> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public static class legRestAngle implements EntityType {
        private Optional<Slot<Miai.Number>> value = Optional.a();

        public static legRestAngle read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            legRestAngle legrestangle = new legRestAngle();
            if (zsdVar.z("value")) {
                legrestangle.setValue(IntentUtils.readSlot(zsdVar.w("value"), Miai.Number.class));
            }
            return legrestangle;
        }

        public static c4h write(legRestAngle legrestangle) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (legrestangle.value.c()) {
                c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(legrestangle.value.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Number>> getValue() {
            return this.value;
        }

        public legRestAngle setValue(Slot<Miai.Number> slot) {
            this.value = Optional.e(slot);
            return this;
        }
    }

    public static class mode implements EntityType {
        private Optional<Slot<SmartBedMode>> name = Optional.a();

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            if (zsdVar.z("name")) {
                modeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), SmartBedMode.class));
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

        public Optional<Slot<SmartBedMode>> getName() {
            return this.name;
        }

        public mode setName(Slot<SmartBedMode> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public SmartBed() {
    }

    public static SmartBed read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        SmartBed smartBed = new SmartBed(IntentUtils.readEntityType(zsdVar, AIApiConstants.SmartBed.NAME, optional));
        if (zsdVar.z("device")) {
            smartBed.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            smartBed.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            smartBed.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            smartBed.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            smartBed.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            smartBed.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            smartBed.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return smartBed;
    }

    public static zsd write(SmartBed smartBed) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(smartBed.entity_type);
        if (smartBed.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(smartBed.device.b()));
        }
        if (smartBed.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(smartBed.room.b()));
        }
        if (smartBed.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(smartBed.is_all_to_operate.b()));
        }
        if (smartBed.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(smartBed.sub_category.b()));
        }
        if (smartBed.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(smartBed.service_entity.b()));
        }
        if (smartBed.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(smartBed.description.b()));
        }
        if (smartBed.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(smartBed.timing.b()));
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

    public SmartBed setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public SmartBed setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public SmartBed setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public SmartBed setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public SmartBed setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public SmartBed setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public SmartBed setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public SmartBed setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public SmartBed(T t) {
        this.entity_type = t;
    }
}
