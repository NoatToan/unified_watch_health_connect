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
public class AirPurifier<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public enum AirPurifierFanLevel {
        Auto(0, "Auto（value=0）"),
        Low(1, "Low"),
        Medium(2, "Medium"),
        High(3, "High"),
        Quiet(4, "Quiet"),
        Turbo(5, "Turbo");

        private int id;
        private String name;

        AirPurifierFanLevel(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static AirPurifierFanLevel find(String str) {
            for (AirPurifierFanLevel airPurifierFanLevel : values()) {
                if (airPurifierFanLevel.name.equals(str)) {
                    return airPurifierFanLevel;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static AirPurifierFanLevel read(String str) {
            return find(str);
        }

        public static String write(AirPurifierFanLevel airPurifierFanLevel) {
            return airPurifierFanLevel.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum AirPurifierMode {
        Smart(1, "Smart"),
        Silent(2, "Silent"),
        Strong(3, "Strong"),
        None(4, "None"),
        Sleep(5, "Sleep"),
        Favorite(6, "Favorite"),
        Auto(7, "Auto"),
        Fan(8, AIApiConstants.Fan.NAME),
        Purification(9, "Purification");

        private int id;
        private String name;

        AirPurifierMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static AirPurifierMode find(String str) {
            for (AirPurifierMode airPurifierMode : values()) {
                if (airPurifierMode.name.equals(str)) {
                    return airPurifierMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static AirPurifierMode read(String str) {
            return find(str);
        }

        public static String write(AirPurifierMode airPurifierMode) {
            return airPurifierMode.getName();
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
        private Optional<Slot<AirPurifierFanLevel>> name = Optional.a();

        public static fanLevel read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            fanLevel fanlevel = new fanLevel();
            if (zsdVar.z(RealNameWebViewActivity.NUMBER)) {
                fanlevel.setNumber(IntentUtils.readSlot(zsdVar.w(RealNameWebViewActivity.NUMBER), Miai.Number.class));
            }
            if (zsdVar.z("name")) {
                fanlevel.setName(IntentUtils.readSlot(zsdVar.w("name"), AirPurifierFanLevel.class));
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

        public Optional<Slot<AirPurifierFanLevel>> getName() {
            return this.name;
        }

        public Optional<Slot<Miai.Number>> getNumber() {
            return this.number;
        }

        public fanLevel setName(Slot<AirPurifierFanLevel> slot) {
            this.name = Optional.e(slot);
            return this;
        }

        public fanLevel setNumber(Slot<Miai.Number> slot) {
            this.number = Optional.e(slot);
            return this;
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

    public static class horizontalSwing implements EntityType {
        public static horizontalSwing read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new horizontalSwing();
        }

        public static c4h write(horizontalSwing horizontalswing) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class mode implements EntityType {
        private Optional<Slot<AirPurifierMode>> name = Optional.a();

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            if (zsdVar.z("name")) {
                modeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), AirPurifierMode.class));
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

        public Optional<Slot<AirPurifierMode>> getName() {
            return this.name;
        }

        public mode setName(Slot<AirPurifierMode> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public AirPurifier() {
    }

    public static AirPurifier read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        AirPurifier airPurifier = new AirPurifier(IntentUtils.readEntityType(zsdVar, AIApiConstants.AirPurifier.NAME, optional));
        if (zsdVar.z("device")) {
            airPurifier.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            airPurifier.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            airPurifier.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            airPurifier.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            airPurifier.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            airPurifier.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            airPurifier.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return airPurifier;
    }

    public static zsd write(AirPurifier airPurifier) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(airPurifier.entity_type);
        if (airPurifier.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(airPurifier.device.b()));
        }
        if (airPurifier.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(airPurifier.room.b()));
        }
        if (airPurifier.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(airPurifier.is_all_to_operate.b()));
        }
        if (airPurifier.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(airPurifier.sub_category.b()));
        }
        if (airPurifier.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(airPurifier.service_entity.b()));
        }
        if (airPurifier.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(airPurifier.description.b()));
        }
        if (airPurifier.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(airPurifier.timing.b()));
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

    public AirPurifier setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public AirPurifier setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public AirPurifier setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public AirPurifier setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public AirPurifier setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public AirPurifier setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public AirPurifier setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public AirPurifier setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public AirPurifier(T t) {
        this.entity_type = t;
    }
}
