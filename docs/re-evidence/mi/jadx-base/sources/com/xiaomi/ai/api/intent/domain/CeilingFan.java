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
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class CeilingFan<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public enum CeilingFanFanLevel {
        Auto(0, "Auto（value=0）"),
        Low(1, "Low"),
        Medium(2, "Medium"),
        High(3, "High"),
        Quiet(4, "Quiet"),
        Turbo(5, "Turbo");

        private int id;
        private String name;

        CeilingFanFanLevel(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static CeilingFanFanLevel find(String str) {
            for (CeilingFanFanLevel ceilingFanFanLevel : values()) {
                if (ceilingFanFanLevel.name.equals(str)) {
                    return ceilingFanFanLevel;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static CeilingFanFanLevel read(String str) {
            return find(str);
        }

        public static String write(CeilingFanFanLevel ceilingFanFanLevel) {
            return ceilingFanFanLevel.getName();
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

    public static class fanLevel implements EntityType {
        private Optional<Slot<Miai.Number>> number = Optional.a();
        private Optional<Slot<CeilingFanFanLevel>> name = Optional.a();

        public static fanLevel read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            fanLevel fanlevel = new fanLevel();
            if (zsdVar.z(RealNameWebViewActivity.NUMBER)) {
                fanlevel.setNumber(IntentUtils.readSlot(zsdVar.w(RealNameWebViewActivity.NUMBER), Miai.Number.class));
            }
            if (zsdVar.z("name")) {
                fanlevel.setName(IntentUtils.readSlot(zsdVar.w("name"), CeilingFanFanLevel.class));
            }
            return fanlevel;
        }

        public static c4h write(fanLevel fanlevel) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (fanlevel.number.c()) {
                c4hVarCreateObjectNode.f0(RealNameWebViewActivity.NUMBER, IntentUtils.writeSlot(fanlevel.number.b()));
            }
            if (fanlevel.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(fanlevel.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<CeilingFanFanLevel>> getName() {
            return this.name;
        }

        public Optional<Slot<Miai.Number>> getNumber() {
            return this.number;
        }

        public fanLevel setName(Slot<CeilingFanFanLevel> slot) {
            this.name = Optional.e(slot);
            return this;
        }

        public fanLevel setNumber(Slot<Miai.Number> slot) {
            this.number = Optional.e(slot);
            return this;
        }
    }

    public static class horizontalSwing implements EntityType {
        public static horizontalSwing read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new horizontalSwing();
        }

        public static c4h write(horizontalSwing horizontalswing) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class verticalSwing implements EntityType {
        public static verticalSwing read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new verticalSwing();
        }

        public static c4h write(verticalSwing verticalswing) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public CeilingFan() {
    }

    public static CeilingFan read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        CeilingFan ceilingFan = new CeilingFan(IntentUtils.readEntityType(zsdVar, AIApiConstants.CeilingFan.NAME, optional));
        if (zsdVar.z("device")) {
            ceilingFan.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            ceilingFan.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            ceilingFan.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            ceilingFan.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            ceilingFan.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            ceilingFan.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            ceilingFan.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return ceilingFan;
    }

    public static zsd write(CeilingFan ceilingFan) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(ceilingFan.entity_type);
        if (ceilingFan.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(ceilingFan.device.b()));
        }
        if (ceilingFan.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(ceilingFan.room.b()));
        }
        if (ceilingFan.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(ceilingFan.is_all_to_operate.b()));
        }
        if (ceilingFan.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(ceilingFan.sub_category.b()));
        }
        if (ceilingFan.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(ceilingFan.service_entity.b()));
        }
        if (ceilingFan.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(ceilingFan.description.b()));
        }
        if (ceilingFan.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(ceilingFan.timing.b()));
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

    public CeilingFan setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public CeilingFan setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public CeilingFan setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public CeilingFan setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public CeilingFan setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public CeilingFan setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public CeilingFan setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public CeilingFan setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public CeilingFan(T t) {
        this.entity_type = t;
    }
}
