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
public class Humidifier<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public enum HumidifierFanLevel {
        Auto(0, "Auto（value=0）"),
        Low(1, "Low"),
        Medium(2, "Medium"),
        High(3, "High"),
        Quiet(4, "Quiet"),
        Turbo(5, "Turbo");

        private int id;
        private String name;

        HumidifierFanLevel(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static HumidifierFanLevel find(String str) {
            for (HumidifierFanLevel humidifierFanLevel : values()) {
                if (humidifierFanLevel.name.equals(str)) {
                    return humidifierFanLevel;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static HumidifierFanLevel read(String str) {
            return find(str);
        }

        public static String write(HumidifierFanLevel humidifierFanLevel) {
            return humidifierFanLevel.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum HumidifierMode {
        ConstHumidity(0, "ConstHumidity"),
        Strong(1, "Strong"),
        Sleep(2, "Sleep");

        private int id;
        private String name;

        HumidifierMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static HumidifierMode find(String str) {
            for (HumidifierMode humidifierMode : values()) {
                if (humidifierMode.name.equals(str)) {
                    return humidifierMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static HumidifierMode read(String str) {
            return find(str);
        }

        public static String write(HumidifierMode humidifierMode) {
            return humidifierMode.getName();
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
        private Optional<Slot<HumidifierFanLevel>> name = Optional.a();

        public static fanLevel read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            fanLevel fanlevel = new fanLevel();
            if (zsdVar.z(RealNameWebViewActivity.NUMBER)) {
                fanlevel.setNumber(IntentUtils.readSlot(zsdVar.w(RealNameWebViewActivity.NUMBER), Miai.Number.class));
            }
            if (zsdVar.z("name")) {
                fanlevel.setName(IntentUtils.readSlot(zsdVar.w("name"), HumidifierFanLevel.class));
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

        public Optional<Slot<HumidifierFanLevel>> getName() {
            return this.name;
        }

        public Optional<Slot<Miai.Number>> getNumber() {
            return this.number;
        }

        public fanLevel setName(Slot<HumidifierFanLevel> slot) {
            this.name = Optional.e(slot);
            return this;
        }

        public fanLevel setNumber(Slot<Miai.Number> slot) {
            this.number = Optional.e(slot);
            return this;
        }
    }

    public static class mode implements EntityType {
        private Optional<Slot<HumidifierMode>> name = Optional.a();

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            if (zsdVar.z("name")) {
                modeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), HumidifierMode.class));
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

        public Optional<Slot<HumidifierMode>> getName() {
            return this.name;
        }

        public mode setName(Slot<HumidifierMode> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public static class relativeHumidity implements EntityType {
        private Optional<Slot<Miai.Number>> value = Optional.a();

        public static relativeHumidity read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            relativeHumidity relativehumidity = new relativeHumidity();
            if (zsdVar.z("value")) {
                relativehumidity.setValue(IntentUtils.readSlot(zsdVar.w("value"), Miai.Number.class));
            }
            return relativehumidity;
        }

        public static c4h write(relativeHumidity relativehumidity) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (relativehumidity.value.c()) {
                c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(relativehumidity.value.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Number>> getValue() {
            return this.value;
        }

        public relativeHumidity setValue(Slot<Miai.Number> slot) {
            this.value = Optional.e(slot);
            return this;
        }
    }

    public Humidifier() {
    }

    public static Humidifier read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Humidifier humidifier = new Humidifier(IntentUtils.readEntityType(zsdVar, AIApiConstants.Humidifier.NAME, optional));
        if (zsdVar.z("device")) {
            humidifier.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            humidifier.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            humidifier.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            humidifier.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            humidifier.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            humidifier.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            humidifier.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return humidifier;
    }

    public static zsd write(Humidifier humidifier) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(humidifier.entity_type);
        if (humidifier.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(humidifier.device.b()));
        }
        if (humidifier.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(humidifier.room.b()));
        }
        if (humidifier.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(humidifier.is_all_to_operate.b()));
        }
        if (humidifier.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(humidifier.sub_category.b()));
        }
        if (humidifier.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(humidifier.service_entity.b()));
        }
        if (humidifier.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(humidifier.description.b()));
        }
        if (humidifier.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(humidifier.timing.b()));
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

    public Humidifier setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public Humidifier setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public Humidifier setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Humidifier setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public Humidifier setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public Humidifier setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public Humidifier setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public Humidifier setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public Humidifier(T t) {
        this.entity_type = t;
    }
}
