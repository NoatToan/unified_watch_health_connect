package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.ai.api.common.Required;
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
public class PetDrinkingFountain<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public enum DrinkingMode {
        Smart(1, "Smart"),
        Common(2, AIApiConstants.Common.NAME),
        Circle(3, "Circle");

        private int id;
        private String name;

        DrinkingMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static DrinkingMode find(String str) {
            for (DrinkingMode drinkingMode : values()) {
                if (drinkingMode.name.equals(str)) {
                    return drinkingMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static DrinkingMode read(String str) {
            return find(str);
        }

        public static String write(DrinkingMode drinkingMode) {
            return drinkingMode.getName();
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

    public static class filterLife implements EntityType {
        public static filterLife read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new filterLife();
        }

        public static c4h write(filterLife filterlife) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class mode implements EntityType {
        private Optional<Slot<DrinkingMode>> name = Optional.a();

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            if (zsdVar.z("name")) {
                modeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), DrinkingMode.class));
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

        public Optional<Slot<DrinkingMode>> getName() {
            return this.name;
        }

        public mode setName(Slot<DrinkingMode> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public PetDrinkingFountain() {
    }

    public static PetDrinkingFountain read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        PetDrinkingFountain petDrinkingFountain = new PetDrinkingFountain(IntentUtils.readEntityType(zsdVar, com.xiaomi.ai.api.intent.AIApiConstants.PetDrinkingFountain.NAME, optional));
        if (zsdVar.z("device")) {
            petDrinkingFountain.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            petDrinkingFountain.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            petDrinkingFountain.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            petDrinkingFountain.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            petDrinkingFountain.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            petDrinkingFountain.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            petDrinkingFountain.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return petDrinkingFountain;
    }

    public static zsd write(PetDrinkingFountain petDrinkingFountain) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(petDrinkingFountain.entity_type);
        if (petDrinkingFountain.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(petDrinkingFountain.device.b()));
        }
        if (petDrinkingFountain.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(petDrinkingFountain.room.b()));
        }
        if (petDrinkingFountain.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(petDrinkingFountain.is_all_to_operate.b()));
        }
        if (petDrinkingFountain.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(petDrinkingFountain.sub_category.b()));
        }
        if (petDrinkingFountain.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(petDrinkingFountain.service_entity.b()));
        }
        if (petDrinkingFountain.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(petDrinkingFountain.description.b()));
        }
        if (petDrinkingFountain.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(petDrinkingFountain.timing.b()));
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

    public PetDrinkingFountain setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public PetDrinkingFountain setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public PetDrinkingFountain setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public PetDrinkingFountain setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public PetDrinkingFountain setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public PetDrinkingFountain setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public PetDrinkingFountain setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public PetDrinkingFountain setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public PetDrinkingFountain(T t) {
        this.entity_type = t;
    }
}
