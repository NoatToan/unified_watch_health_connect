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
public class Fan<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public enum FanFanLevel {
        Auto(0, "Auto（value=0）"),
        Low(1, "Low"),
        Medium(2, "Medium"),
        High(3, "High"),
        Quiet(4, "Quiet"),
        Turbo(5, "Turbo");

        private int id;
        private String name;

        FanFanLevel(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static FanFanLevel find(String str) {
            for (FanFanLevel fanFanLevel : values()) {
                if (fanFanLevel.name.equals(str)) {
                    return fanFanLevel;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static FanFanLevel read(String str) {
            return find(str);
        }

        public static String write(FanFanLevel fanFanLevel) {
            return fanFanLevel.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum FanMode {
        Basic(1, "Basic"),
        NaturalWind(2, "NaturalWind"),
        StraightWind(3, "StraightWind"),
        EnergySaving(4, "EnergySaving"),
        None(5, "None"),
        Sleep(6, "Sleep"),
        Strong(7, "Strong"),
        Baby(8, "Baby"),
        CircularWind(9, "CircularWind"),
        Smart(10, "Smart");

        private int id;
        private String name;

        FanMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static FanMode find(String str) {
            for (FanMode fanMode : values()) {
                if (fanMode.name.equals(str)) {
                    return fanMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static FanMode read(String str) {
            return find(str);
        }

        public static String write(FanMode fanMode) {
            return fanMode.getName();
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
        private Optional<Slot<FanFanLevel>> name = Optional.a();

        public static fanLevel read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            fanLevel fanlevel = new fanLevel();
            if (zsdVar.z(RealNameWebViewActivity.NUMBER)) {
                fanlevel.setNumber(IntentUtils.readSlot(zsdVar.w(RealNameWebViewActivity.NUMBER), Miai.Number.class));
            }
            if (zsdVar.z("name")) {
                fanlevel.setName(IntentUtils.readSlot(zsdVar.w("name"), FanFanLevel.class));
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

        public Optional<Slot<FanFanLevel>> getName() {
            return this.name;
        }

        public Optional<Slot<Miai.Number>> getNumber() {
            return this.number;
        }

        public fanLevel setName(Slot<FanFanLevel> slot) {
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
        private Optional<Slot<FanMode>> name = Optional.a();

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            if (zsdVar.z("name")) {
                modeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), FanMode.class));
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

        public Optional<Slot<FanMode>> getName() {
            return this.name;
        }

        public mode setName(Slot<FanMode> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public static class verticalSwing implements EntityType {
        public static verticalSwing read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new verticalSwing();
        }

        public static c4h write(verticalSwing verticalswing) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class windDirection implements EntityType {
        public static windDirection read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new windDirection();
        }

        public static c4h write(windDirection winddirection) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Fan() {
    }

    public static Fan read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Fan fan = new Fan(IntentUtils.readEntityType(zsdVar, AIApiConstants.Fan.NAME, optional));
        if (zsdVar.z("device")) {
            fan.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            fan.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            fan.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            fan.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            fan.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            fan.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            fan.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return fan;
    }

    public static zsd write(Fan fan) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(fan.entity_type);
        if (fan.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(fan.device.b()));
        }
        if (fan.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(fan.room.b()));
        }
        if (fan.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(fan.is_all_to_operate.b()));
        }
        if (fan.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(fan.sub_category.b()));
        }
        if (fan.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(fan.service_entity.b()));
        }
        if (fan.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(fan.description.b()));
        }
        if (fan.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(fan.timing.b()));
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

    public Fan setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public Fan setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public Fan setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Fan setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public Fan setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public Fan setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public Fan setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public Fan setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public Fan(T t) {
        this.entity_type = t;
    }
}
