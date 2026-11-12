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
public class BathHeater<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public enum BathHeaterFanLevel {
        Auto(0, "Auto（value=0）"),
        Low(1, "Low"),
        Medium(2, "Medium"),
        High(3, "High"),
        Quiet(4, "Quiet"),
        Turbo(5, "Turbo");

        private int id;
        private String name;

        BathHeaterFanLevel(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static BathHeaterFanLevel find(String str) {
            for (BathHeaterFanLevel bathHeaterFanLevel : values()) {
                if (bathHeaterFanLevel.name.equals(str)) {
                    return bathHeaterFanLevel;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static BathHeaterFanLevel read(String str) {
            return find(str);
        }

        public static String write(BathHeaterFanLevel bathHeaterFanLevel) {
            return bathHeaterFanLevel.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum BathHeaterMode {
        Heat(1, "Heat"),
        Ventilate(2, "Ventilate"),
        Dry(3, "Dry"),
        Fan(4, AIApiConstants.Fan.NAME),
        Idle(5, "Idle"),
        Shower(6, "Shower"),
        QuickHeat(7, "QuickHeat"),
        QuickDefog(8, "QuickDefog"),
        Defog(9, "Defog");

        private int id;
        private String name;

        BathHeaterMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static BathHeaterMode find(String str) {
            for (BathHeaterMode bathHeaterMode : values()) {
                if (bathHeaterMode.name.equals(str)) {
                    return bathHeaterMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static BathHeaterMode read(String str) {
            return find(str);
        }

        public static String write(BathHeaterMode bathHeaterMode) {
            return bathHeaterMode.getName();
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
        private Optional<Slot<BathHeaterFanLevel>> name = Optional.a();

        public static fanLevel read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            fanLevel fanlevel = new fanLevel();
            if (zsdVar.z(RealNameWebViewActivity.NUMBER)) {
                fanlevel.setNumber(IntentUtils.readSlot(zsdVar.w(RealNameWebViewActivity.NUMBER), Miai.Number.class));
            }
            if (zsdVar.z("name")) {
                fanlevel.setName(IntentUtils.readSlot(zsdVar.w("name"), BathHeaterFanLevel.class));
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

        public Optional<Slot<BathHeaterFanLevel>> getName() {
            return this.name;
        }

        public Optional<Slot<Miai.Number>> getNumber() {
            return this.number;
        }

        public fanLevel setName(Slot<BathHeaterFanLevel> slot) {
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

    public static class mode implements EntityType {
        private Optional<Slot<BathHeaterMode>> name = Optional.a();

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            if (zsdVar.z("name")) {
                modeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), BathHeaterMode.class));
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

        public Optional<Slot<BathHeaterMode>> getName() {
            return this.name;
        }

        public mode setName(Slot<BathHeaterMode> slot) {
            this.name = Optional.e(slot);
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

    public BathHeater() {
    }

    public static BathHeater read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        BathHeater bathHeater = new BathHeater(IntentUtils.readEntityType(zsdVar, AIApiConstants.BathHeater.NAME, optional));
        if (zsdVar.z("device")) {
            bathHeater.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            bathHeater.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            bathHeater.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            bathHeater.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            bathHeater.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            bathHeater.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            bathHeater.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return bathHeater;
    }

    public static zsd write(BathHeater bathHeater) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(bathHeater.entity_type);
        if (bathHeater.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(bathHeater.device.b()));
        }
        if (bathHeater.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(bathHeater.room.b()));
        }
        if (bathHeater.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(bathHeater.is_all_to_operate.b()));
        }
        if (bathHeater.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(bathHeater.sub_category.b()));
        }
        if (bathHeater.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(bathHeater.service_entity.b()));
        }
        if (bathHeater.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(bathHeater.description.b()));
        }
        if (bathHeater.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(bathHeater.timing.b()));
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

    public BathHeater setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public BathHeater setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public BathHeater setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public BathHeater setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public BathHeater setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public BathHeater setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public BathHeater setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public BathHeater setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public BathHeater(T t) {
        this.entity_type = t;
    }
}
