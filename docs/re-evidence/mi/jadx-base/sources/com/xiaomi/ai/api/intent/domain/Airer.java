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
public class Airer<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public enum AirerMode {
        Dry(1, "Dry"),
        Disinfecting(2, "Disinfecting");

        private int id;
        private String name;

        AirerMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static AirerMode find(String str) {
            for (AirerMode airerMode : values()) {
                if (airerMode.name.equals(str)) {
                    return airerMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static AirerMode read(String str) {
            return find(str);
        }

        public static String write(AirerMode airerMode) {
            return airerMode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class mode implements EntityType {
        private Optional<Slot<AirerMode>> name = Optional.a();

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            if (zsdVar.z("name")) {
                modeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), AirerMode.class));
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

        public Optional<Slot<AirerMode>> getName() {
            return this.name;
        }

        public mode setName(Slot<AirerMode> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public Airer() {
    }

    public static Airer read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Airer airer = new Airer(IntentUtils.readEntityType(zsdVar, AIApiConstants.Airer.NAME, optional));
        if (zsdVar.z("device")) {
            airer.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            airer.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            airer.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            airer.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            airer.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            airer.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            airer.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return airer;
    }

    public static zsd write(Airer airer) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(airer.entity_type);
        if (airer.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(airer.device.b()));
        }
        if (airer.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(airer.room.b()));
        }
        if (airer.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(airer.is_all_to_operate.b()));
        }
        if (airer.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(airer.sub_category.b()));
        }
        if (airer.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(airer.service_entity.b()));
        }
        if (airer.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(airer.description.b()));
        }
        if (airer.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(airer.timing.b()));
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

    public Airer setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public Airer setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public Airer setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Airer setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public Airer setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public Airer setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public Airer setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public Airer setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public Airer(T t) {
        this.entity_type = t;
    }
}
