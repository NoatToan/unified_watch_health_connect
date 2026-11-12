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
public class WaterPurifier<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public enum WaterPurifierFilterType {
        Ro(1, "Ro"),
        Ppc(2, "Ppc"),
        Composite(3, "Composite"),
        Ro800(4, "Ro800"),
        Ro400(5, "Ro400"),
        Pp(6, "Pp"),
        ThreeInOne(7, "ThreeInOne");

        private int id;
        private String name;

        WaterPurifierFilterType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static WaterPurifierFilterType find(String str) {
            for (WaterPurifierFilterType waterPurifierFilterType : values()) {
                if (waterPurifierFilterType.name.equals(str)) {
                    return waterPurifierFilterType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static WaterPurifierFilterType read(String str) {
            return find(str);
        }

        public static String write(WaterPurifierFilterType waterPurifierFilterType) {
            return waterPurifierFilterType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class filterLife implements EntityType {
        private Optional<Slot<WaterPurifierFilterType>> type = Optional.a();

        public static filterLife read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            filterLife filterlife = new filterLife();
            if (zsdVar.z("type")) {
                filterlife.setType(IntentUtils.readSlot(zsdVar.w("type"), WaterPurifierFilterType.class));
            }
            return filterlife;
        }

        public static c4h write(filterLife filterlife) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (filterlife.type.c()) {
                c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(filterlife.type.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<WaterPurifierFilterType>> getType() {
            return this.type;
        }

        public filterLife setType(Slot<WaterPurifierFilterType> slot) {
            this.type = Optional.e(slot);
            return this;
        }
    }

    public static class tdsIn implements EntityType {
        public static tdsIn read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new tdsIn();
        }

        public static c4h write(tdsIn tdsin) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class tdsOut implements EntityType {
        public static tdsOut read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new tdsOut();
        }

        public static c4h write(tdsOut tdsout) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public WaterPurifier() {
    }

    public static WaterPurifier read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        WaterPurifier waterPurifier = new WaterPurifier(IntentUtils.readEntityType(zsdVar, AIApiConstants.WaterPurifier.NAME, optional));
        if (zsdVar.z("device")) {
            waterPurifier.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            waterPurifier.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            waterPurifier.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            waterPurifier.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            waterPurifier.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            waterPurifier.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            waterPurifier.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return waterPurifier;
    }

    public static zsd write(WaterPurifier waterPurifier) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(waterPurifier.entity_type);
        if (waterPurifier.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(waterPurifier.device.b()));
        }
        if (waterPurifier.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(waterPurifier.room.b()));
        }
        if (waterPurifier.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(waterPurifier.is_all_to_operate.b()));
        }
        if (waterPurifier.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(waterPurifier.sub_category.b()));
        }
        if (waterPurifier.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(waterPurifier.service_entity.b()));
        }
        if (waterPurifier.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(waterPurifier.description.b()));
        }
        if (waterPurifier.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(waterPurifier.timing.b()));
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

    public WaterPurifier setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public WaterPurifier setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public WaterPurifier setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public WaterPurifier setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public WaterPurifier setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public WaterPurifier setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public WaterPurifier setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public WaterPurifier setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public WaterPurifier(T t) {
        this.entity_type = t;
    }
}
