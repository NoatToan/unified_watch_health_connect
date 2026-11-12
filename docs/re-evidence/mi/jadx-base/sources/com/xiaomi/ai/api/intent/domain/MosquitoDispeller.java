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
public class MosquitoDispeller<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public enum MosquitoDispellerMode {
        Sleep(0, "Sleep"),
        Strong(1, "Strong");

        private int id;
        private String name;

        MosquitoDispellerMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static MosquitoDispellerMode find(String str) {
            for (MosquitoDispellerMode mosquitoDispellerMode : values()) {
                if (mosquitoDispellerMode.name.equals(str)) {
                    return mosquitoDispellerMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static MosquitoDispellerMode read(String str) {
            return find(str);
        }

        public static String write(MosquitoDispellerMode mosquitoDispellerMode) {
            return mosquitoDispellerMode.getName();
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

    public static class mode implements EntityType {
        private Optional<Slot<MosquitoDispellerMode>> name = Optional.a();

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            if (zsdVar.z("name")) {
                modeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), MosquitoDispellerMode.class));
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

        public Optional<Slot<MosquitoDispellerMode>> getName() {
            return this.name;
        }

        public mode setName(Slot<MosquitoDispellerMode> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public static class repellentLeftLevel implements EntityType {
        public static repellentLeftLevel read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new repellentLeftLevel();
        }

        public static c4h write(repellentLeftLevel repellentleftlevel) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public MosquitoDispeller() {
    }

    public static MosquitoDispeller read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        MosquitoDispeller mosquitoDispeller = new MosquitoDispeller(IntentUtils.readEntityType(zsdVar, AIApiConstants.MosquitoDispeller.NAME, optional));
        if (zsdVar.z("device")) {
            mosquitoDispeller.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            mosquitoDispeller.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            mosquitoDispeller.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            mosquitoDispeller.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            mosquitoDispeller.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            mosquitoDispeller.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            mosquitoDispeller.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return mosquitoDispeller;
    }

    public static zsd write(MosquitoDispeller mosquitoDispeller) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(mosquitoDispeller.entity_type);
        if (mosquitoDispeller.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(mosquitoDispeller.device.b()));
        }
        if (mosquitoDispeller.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(mosquitoDispeller.room.b()));
        }
        if (mosquitoDispeller.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(mosquitoDispeller.is_all_to_operate.b()));
        }
        if (mosquitoDispeller.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(mosquitoDispeller.sub_category.b()));
        }
        if (mosquitoDispeller.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(mosquitoDispeller.service_entity.b()));
        }
        if (mosquitoDispeller.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(mosquitoDispeller.description.b()));
        }
        if (mosquitoDispeller.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(mosquitoDispeller.timing.b()));
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

    public MosquitoDispeller setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public MosquitoDispeller setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public MosquitoDispeller setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public MosquitoDispeller setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public MosquitoDispeller setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public MosquitoDispeller setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public MosquitoDispeller setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public MosquitoDispeller setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public MosquitoDispeller(T t) {
        this.entity_type = t;
    }
}
