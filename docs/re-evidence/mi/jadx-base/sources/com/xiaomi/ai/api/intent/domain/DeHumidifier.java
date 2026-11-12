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
public class DeHumidifier<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public enum DeHumidifierFanLevel {
        Auto(0, "Auto（value=0）"),
        Low(1, "Low"),
        Medium(2, "Medium"),
        High(3, "High"),
        Quiet(4, "Quiet"),
        Turbo(5, "Turbo");

        private int id;
        private String name;

        DeHumidifierFanLevel(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static DeHumidifierFanLevel find(String str) {
            for (DeHumidifierFanLevel deHumidifierFanLevel : values()) {
                if (deHumidifierFanLevel.name.equals(str)) {
                    return deHumidifierFanLevel;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static DeHumidifierFanLevel read(String str) {
            return find(str);
        }

        public static String write(DeHumidifierFanLevel deHumidifierFanLevel) {
            return deHumidifierFanLevel.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum DeHumidifierMode {
        Auto(1, "Auto"),
        Sleep(2, "Sleep"),
        Smart(3, "Smart"),
        ClothesDrying(4, "ClothesDrying");

        private int id;
        private String name;

        DeHumidifierMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static DeHumidifierMode find(String str) {
            for (DeHumidifierMode deHumidifierMode : values()) {
                if (deHumidifierMode.name.equals(str)) {
                    return deHumidifierMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static DeHumidifierMode read(String str) {
            return find(str);
        }

        public static String write(DeHumidifierMode deHumidifierMode) {
            return deHumidifierMode.getName();
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

    public static class alarm implements EntityType {
        public static alarm read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new alarm();
        }

        public static c4h write(alarm alarmVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class childLock implements EntityType {
        public static childLock read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new childLock();
        }

        public static c4h write(childLock childlock) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class fanLevel implements EntityType {
        private Optional<Slot<Miai.Number>> number = Optional.a();
        private Optional<Slot<DeHumidifierFanLevel>> name = Optional.a();

        public static fanLevel read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            fanLevel fanlevel = new fanLevel();
            if (zsdVar.z(RealNameWebViewActivity.NUMBER)) {
                fanlevel.setNumber(IntentUtils.readSlot(zsdVar.w(RealNameWebViewActivity.NUMBER), Miai.Number.class));
            }
            if (zsdVar.z("name")) {
                fanlevel.setName(IntentUtils.readSlot(zsdVar.w("name"), DeHumidifierFanLevel.class));
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

        public Optional<Slot<DeHumidifierFanLevel>> getName() {
            return this.name;
        }

        public Optional<Slot<Miai.Number>> getNumber() {
            return this.number;
        }

        public fanLevel setName(Slot<DeHumidifierFanLevel> slot) {
            this.name = Optional.e(slot);
            return this;
        }

        public fanLevel setNumber(Slot<Miai.Number> slot) {
            this.number = Optional.e(slot);
            return this;
        }
    }

    public static class mode implements EntityType {
        private Optional<Slot<DeHumidifierMode>> name = Optional.a();

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            if (zsdVar.z("name")) {
                modeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), DeHumidifierMode.class));
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

        public Optional<Slot<DeHumidifierMode>> getName() {
            return this.name;
        }

        public mode setName(Slot<DeHumidifierMode> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public static class targetHumidity implements EntityType {
        private Optional<Slot<Miai.Number>> value = Optional.a();

        public static targetHumidity read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            targetHumidity targethumidity = new targetHumidity();
            if (zsdVar.z("value")) {
                targethumidity.setValue(IntentUtils.readSlot(zsdVar.w("value"), Miai.Number.class));
            }
            return targethumidity;
        }

        public static c4h write(targetHumidity targethumidity) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (targethumidity.value.c()) {
                c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(targethumidity.value.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Number>> getValue() {
            return this.value;
        }

        public targetHumidity setValue(Slot<Miai.Number> slot) {
            this.value = Optional.e(slot);
            return this;
        }
    }

    public DeHumidifier() {
    }

    public static DeHumidifier read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        DeHumidifier deHumidifier = new DeHumidifier(IntentUtils.readEntityType(zsdVar, AIApiConstants.DeHumidifier.NAME, optional));
        if (zsdVar.z("device")) {
            deHumidifier.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            deHumidifier.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            deHumidifier.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            deHumidifier.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            deHumidifier.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            deHumidifier.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            deHumidifier.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return deHumidifier;
    }

    public static zsd write(DeHumidifier deHumidifier) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(deHumidifier.entity_type);
        if (deHumidifier.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(deHumidifier.device.b()));
        }
        if (deHumidifier.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(deHumidifier.room.b()));
        }
        if (deHumidifier.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(deHumidifier.is_all_to_operate.b()));
        }
        if (deHumidifier.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(deHumidifier.sub_category.b()));
        }
        if (deHumidifier.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(deHumidifier.service_entity.b()));
        }
        if (deHumidifier.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(deHumidifier.description.b()));
        }
        if (deHumidifier.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(deHumidifier.timing.b()));
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

    public DeHumidifier setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public DeHumidifier setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public DeHumidifier setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public DeHumidifier setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public DeHumidifier setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public DeHumidifier setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public DeHumidifier setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public DeHumidifier setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public DeHumidifier(T t) {
        this.entity_type = t;
    }
}
