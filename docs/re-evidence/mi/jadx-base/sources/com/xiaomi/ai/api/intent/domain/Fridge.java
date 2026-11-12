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
public class Fridge<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public enum FridgeIceMaker {
        Normal(0, "Normal"),
        Quick(1, "Quick"),
        Clean(2, "Clean");

        private int id;
        private String name;

        FridgeIceMaker(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static FridgeIceMaker find(String str) {
            for (FridgeIceMaker fridgeIceMaker : values()) {
                if (fridgeIceMaker.name.equals(str)) {
                    return fridgeIceMaker;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static FridgeIceMaker read(String str) {
            return find(str);
        }

        public static String write(FridgeIceMaker fridgeIceMaker) {
            return fridgeIceMaker.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum FridgeMode {
        None(0, "None"),
        Holiday(1, "Holiday"),
        Smart(2, "Smart"),
        QuickCooling(3, "QuickCooling"),
        QuickFrozen(4, "QuickFrozen");

        private int id;
        private String name;

        FridgeMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static FridgeMode find(String str) {
            for (FridgeMode fridgeMode : values()) {
                if (fridgeMode.name.equals(str)) {
                    return fridgeMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static FridgeMode read(String str) {
            return find(str);
        }

        public static String write(FridgeMode fridgeMode) {
            return fridgeMode.getName();
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

    public static class iceMaker implements EntityType {
        private Optional<Slot<FridgeIceMaker>> value = Optional.a();

        public static iceMaker read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            iceMaker icemaker = new iceMaker();
            if (zsdVar.z("value")) {
                icemaker.setValue(IntentUtils.readSlot(zsdVar.w("value"), FridgeIceMaker.class));
            }
            return icemaker;
        }

        public static c4h write(iceMaker icemaker) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (icemaker.value.c()) {
                c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(icemaker.value.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<FridgeIceMaker>> getValue() {
            return this.value;
        }

        public iceMaker setValue(Slot<FridgeIceMaker> slot) {
            this.value = Optional.e(slot);
            return this;
        }
    }

    public static class mode implements EntityType {
        private Optional<Slot<FridgeMode>> value = Optional.a();

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            if (zsdVar.z("value")) {
                modeVar.setValue(IntentUtils.readSlot(zsdVar.w("value"), FridgeMode.class));
            }
            return modeVar;
        }

        public static c4h write(mode modeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (modeVar.value.c()) {
                c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(modeVar.value.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<FridgeMode>> getValue() {
            return this.value;
        }

        public mode setValue(Slot<FridgeMode> slot) {
            this.value = Optional.e(slot);
            return this;
        }
    }

    public static class temperature implements EntityType {
        private Optional<Slot<Miai.Number>> value = Optional.a();

        public static temperature read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            temperature temperatureVar = new temperature();
            if (zsdVar.z("value")) {
                temperatureVar.setValue(IntentUtils.readSlot(zsdVar.w("value"), Miai.Number.class));
            }
            return temperatureVar;
        }

        public static c4h write(temperature temperatureVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (temperatureVar.value.c()) {
                c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(temperatureVar.value.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Number>> getValue() {
            return this.value;
        }

        public temperature setValue(Slot<Miai.Number> slot) {
            this.value = Optional.e(slot);
            return this;
        }
    }

    public Fridge() {
    }

    public static Fridge read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Fridge fridge = new Fridge(IntentUtils.readEntityType(zsdVar, AIApiConstants.Fridge.NAME, optional));
        if (zsdVar.z("device")) {
            fridge.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            fridge.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            fridge.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            fridge.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            fridge.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            fridge.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            fridge.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return fridge;
    }

    public static zsd write(Fridge fridge) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(fridge.entity_type);
        if (fridge.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(fridge.device.b()));
        }
        if (fridge.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(fridge.room.b()));
        }
        if (fridge.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(fridge.is_all_to_operate.b()));
        }
        if (fridge.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(fridge.sub_category.b()));
        }
        if (fridge.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(fridge.service_entity.b()));
        }
        if (fridge.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(fridge.description.b()));
        }
        if (fridge.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(fridge.timing.b()));
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

    public Fridge setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public Fridge setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public Fridge setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Fridge setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public Fridge setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public Fridge setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public Fridge setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public Fridge setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public Fridge(T t) {
        this.entity_type = t;
    }
}
