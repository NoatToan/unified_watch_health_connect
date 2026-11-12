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
public class PressureCooker<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public enum PressureCookMode {
        MultigrainPorridge(1, "MultigrainPorridge"),
        RedMeat(2, "RedMeat"),
        Poultry(3, "Poultry"),
        Beans(4, "Beans"),
        Tendons(5, "Tendons"),
        LowTemperature(6, "LowTemperature"),
        OpenLid(7, "OpenLid"),
        ReheatRice(8, "ReheatRice"),
        Soup(9, "Soup"),
        KeepWarm(10, "KeepWarm"),
        Reheat(11, "Reheat");

        private int id;
        private String name;

        PressureCookMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static PressureCookMode find(String str) {
            for (PressureCookMode pressureCookMode : values()) {
                if (pressureCookMode.name.equals(str)) {
                    return pressureCookMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static PressureCookMode read(String str) {
            return find(str);
        }

        public static String write(PressureCookMode pressureCookMode) {
            return pressureCookMode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class cooking implements EntityType {
        private Optional<Slot<PressureCookMode>> mode = Optional.a();

        public static cooking read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            cooking cookingVar = new cooking();
            if (zsdVar.z("mode")) {
                cookingVar.setMode(IntentUtils.readSlot(zsdVar.w("mode"), PressureCookMode.class));
            }
            return cookingVar;
        }

        public static c4h write(cooking cookingVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (cookingVar.mode.c()) {
                c4hVarCreateObjectNode.f0("mode", IntentUtils.writeSlot(cookingVar.mode.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<PressureCookMode>> getMode() {
            return this.mode;
        }

        public cooking setMode(Slot<PressureCookMode> slot) {
            this.mode = Optional.e(slot);
            return this;
        }
    }

    public static class leftTime implements EntityType {
        public static leftTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new leftTime();
        }

        public static c4h write(leftTime lefttime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class mode implements EntityType {
        private Optional<Slot<PressureCookMode>> name = Optional.a();

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            if (zsdVar.z("name")) {
                modeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), PressureCookMode.class));
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

        public Optional<Slot<PressureCookMode>> getName() {
            return this.name;
        }

        public mode setName(Slot<PressureCookMode> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public PressureCooker() {
    }

    public static PressureCooker read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        PressureCooker pressureCooker = new PressureCooker(IntentUtils.readEntityType(zsdVar, AIApiConstants.PressureCooker.NAME, optional));
        if (zsdVar.z("device")) {
            pressureCooker.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            pressureCooker.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            pressureCooker.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            pressureCooker.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            pressureCooker.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            pressureCooker.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            pressureCooker.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return pressureCooker;
    }

    public static zsd write(PressureCooker pressureCooker) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(pressureCooker.entity_type);
        if (pressureCooker.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(pressureCooker.device.b()));
        }
        if (pressureCooker.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(pressureCooker.room.b()));
        }
        if (pressureCooker.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(pressureCooker.is_all_to_operate.b()));
        }
        if (pressureCooker.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(pressureCooker.sub_category.b()));
        }
        if (pressureCooker.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(pressureCooker.service_entity.b()));
        }
        if (pressureCooker.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(pressureCooker.description.b()));
        }
        if (pressureCooker.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(pressureCooker.timing.b()));
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

    public PressureCooker setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public PressureCooker setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public PressureCooker setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public PressureCooker setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public PressureCooker setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public PressureCooker setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public PressureCooker setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public PressureCooker setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public PressureCooker(T t) {
        this.entity_type = t;
    }
}
