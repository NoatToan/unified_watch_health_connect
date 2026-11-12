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
public class Cooker<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public enum CookMode {
        FineCook(1, "FineCook"),
        QuickCook(2, "QuickCook"),
        CookCongee(3, "CookCongee"),
        KeepWarm(4, "KeepWarm"),
        ClaypotRice(5, "ClaypotRice"),
        MultigrainRice(6, "MultigrainRice");

        private int id;
        private String name;

        CookMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static CookMode find(String str) {
            for (CookMode cookMode : values()) {
                if (cookMode.name.equals(str)) {
                    return cookMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static CookMode read(String str) {
            return find(str);
        }

        public static String write(CookMode cookMode) {
            return cookMode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class cooking implements EntityType {
        private Optional<Slot<CookMode>> mode = Optional.a();

        public static cooking read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            cooking cookingVar = new cooking();
            if (zsdVar.z("mode")) {
                cookingVar.setMode(IntentUtils.readSlot(zsdVar.w("mode"), CookMode.class));
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

        public Optional<Slot<CookMode>> getMode() {
            return this.mode;
        }

        public cooking setMode(Slot<CookMode> slot) {
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
        private Optional<Slot<CookMode>> name = Optional.a();

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            if (zsdVar.z("name")) {
                modeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), CookMode.class));
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

        public Optional<Slot<CookMode>> getName() {
            return this.name;
        }

        public mode setName(Slot<CookMode> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public Cooker() {
    }

    public static Cooker read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Cooker cooker = new Cooker(IntentUtils.readEntityType(zsdVar, AIApiConstants.Cooker.NAME, optional));
        if (zsdVar.z("device")) {
            cooker.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            cooker.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            cooker.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            cooker.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            cooker.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            cooker.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            cooker.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return cooker;
    }

    public static zsd write(Cooker cooker) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(cooker.entity_type);
        if (cooker.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(cooker.device.b()));
        }
        if (cooker.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(cooker.room.b()));
        }
        if (cooker.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(cooker.is_all_to_operate.b()));
        }
        if (cooker.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(cooker.sub_category.b()));
        }
        if (cooker.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(cooker.service_entity.b()));
        }
        if (cooker.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(cooker.description.b()));
        }
        if (cooker.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(cooker.timing.b()));
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

    public Cooker setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public Cooker setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public Cooker setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Cooker setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public Cooker setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public Cooker setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public Cooker setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public Cooker setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public Cooker(T t) {
        this.entity_type = t;
    }
}
