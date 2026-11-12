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
public class Sofa<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public enum SofaMode {
        Leisure(1, "Leisure"),
        Daily(2, "Daily"),
        Tv(3, "Tv");

        private int id;
        private String name;

        SofaMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static SofaMode find(String str) {
            for (SofaMode sofaMode : values()) {
                if (sofaMode.name.equals(str)) {
                    return sofaMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static SofaMode read(String str) {
            return find(str);
        }

        public static String write(SofaMode sofaMode) {
            return sofaMode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class mode implements EntityType {
        private Optional<Slot<SofaMode>> name = Optional.a();

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            if (zsdVar.z("name")) {
                modeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), SofaMode.class));
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

        public Optional<Slot<SofaMode>> getName() {
            return this.name;
        }

        public mode setName(Slot<SofaMode> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public Sofa() {
    }

    public static Sofa read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Sofa sofa = new Sofa(IntentUtils.readEntityType(zsdVar, AIApiConstants.Sofa.NAME, optional));
        if (zsdVar.z("device")) {
            sofa.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            sofa.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            sofa.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            sofa.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            sofa.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            sofa.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            sofa.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return sofa;
    }

    public static zsd write(Sofa sofa) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(sofa.entity_type);
        if (sofa.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(sofa.device.b()));
        }
        if (sofa.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(sofa.room.b()));
        }
        if (sofa.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(sofa.is_all_to_operate.b()));
        }
        if (sofa.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(sofa.sub_category.b()));
        }
        if (sofa.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(sofa.service_entity.b()));
        }
        if (sofa.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(sofa.description.b()));
        }
        if (sofa.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(sofa.timing.b()));
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

    public Sofa setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public Sofa setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public Sofa setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Sofa setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public Sofa setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public Sofa setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public Sofa setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public Sofa setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public Sofa(T t) {
        this.entity_type = t;
    }
}
