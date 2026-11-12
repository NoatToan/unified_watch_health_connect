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
public class Vacuum<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public enum VacuumMode {
        Silent(1, "Silent"),
        Basic(2, "Basic"),
        Strong(3, "Strong"),
        FullSpeed(4, "FullSpeed"),
        Sweep(5, "Sweep"),
        Mop(6, "Mop"),
        SweepMop(7, "SweepMop");

        private int id;
        private String name;

        VacuumMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static VacuumMode find(String str) {
            for (VacuumMode vacuumMode : values()) {
                if (vacuumMode.name.equals(str)) {
                    return vacuumMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static VacuumMode read(String str) {
            return find(str);
        }

        public static String write(VacuumMode vacuumMode) {
            return vacuumMode.getName();
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

    public static class battery implements EntityType {
        public static battery read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new battery();
        }

        public static c4h write(battery batteryVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class buildMap implements EntityType {
        public static buildMap read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new buildMap();
        }

        public static c4h write(buildMap buildmap) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class callClean implements EntityType {
        public static callClean read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new callClean();
        }

        public static c4h write(callClean callclean) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class charge implements EntityType {
        public static charge read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new charge();
        }

        public static c4h write(charge chargeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class dustArrest implements EntityType {
        public static dustArrest read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new dustArrest();
        }

        public static c4h write(dustArrest dustarrest) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class eject implements EntityType {
        public static eject read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new eject();
        }

        public static c4h write(eject ejectVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class identify implements EntityType {
        public static identify read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new identify();
        }

        public static c4h write(identify identifyVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class level implements EntityType {
        private Optional<Slot<Miai.Number>> value = Optional.a();

        public static level read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            level levelVar = new level();
            if (zsdVar.z("value")) {
                levelVar.setValue(IntentUtils.readSlot(zsdVar.w("value"), Miai.Number.class));
            }
            return levelVar;
        }

        public static c4h write(level levelVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (levelVar.value.c()) {
                c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(levelVar.value.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Number>> getValue() {
            return this.value;
        }

        public level setValue(Slot<Miai.Number> slot) {
            this.value = Optional.e(slot);
            return this;
        }
    }

    public static class mode implements EntityType {
        private Optional<Slot<VacuumMode>> value = Optional.a();

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            if (zsdVar.z("value")) {
                modeVar.setValue(IntentUtils.readSlot(zsdVar.w("value"), VacuumMode.class));
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

        public Optional<Slot<VacuumMode>> getValue() {
            return this.value;
        }

        public mode setValue(Slot<VacuumMode> slot) {
            this.value = Optional.e(slot);
            return this;
        }
    }

    public static class mopDry implements EntityType {
        public static mopDry read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new mopDry();
        }

        public static c4h write(mopDry mopdry) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class mopWash implements EntityType {
        public static mopWash read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new mopWash();
        }

        public static c4h write(mopWash mopwash) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class mopWaterLevel implements EntityType {
        private Optional<Slot<Miai.Number>> value = Optional.a();

        public static mopWaterLevel read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mopWaterLevel mopwaterlevel = new mopWaterLevel();
            if (zsdVar.z("value")) {
                mopwaterlevel.setValue(IntentUtils.readSlot(zsdVar.w("value"), Miai.Number.class));
            }
            return mopwaterlevel;
        }

        public static c4h write(mopWaterLevel mopwaterlevel) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (mopwaterlevel.value.c()) {
                c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(mopwaterlevel.value.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Number>> getValue() {
            return this.value;
        }

        public mopWaterLevel setValue(Slot<Miai.Number> slot) {
            this.value = Optional.e(slot);
            return this;
        }
    }

    public static class sweep implements EntityType {
        private Optional<Slot<String>> room = Optional.a();

        public static sweep read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            sweep sweepVar = new sweep();
            if (zsdVar.z("room")) {
                sweepVar.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
            }
            return sweepVar;
        }

        public static c4h write(sweep sweepVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (sweepVar.room.c()) {
                c4hVarCreateObjectNode.f0("room", IntentUtils.writeSlot(sweepVar.room.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getRoom() {
            return this.room;
        }

        public sweep setRoom(Slot<String> slot) {
            this.room = Optional.e(slot);
            return this;
        }
    }

    public Vacuum() {
    }

    public static Vacuum read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Vacuum vacuum = new Vacuum(IntentUtils.readEntityType(zsdVar, AIApiConstants.Vacuum.NAME, optional));
        if (zsdVar.z("device")) {
            vacuum.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            vacuum.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            vacuum.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            vacuum.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            vacuum.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            vacuum.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            vacuum.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return vacuum;
    }

    public static zsd write(Vacuum vacuum) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(vacuum.entity_type);
        if (vacuum.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(vacuum.device.b()));
        }
        if (vacuum.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(vacuum.room.b()));
        }
        if (vacuum.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(vacuum.is_all_to_operate.b()));
        }
        if (vacuum.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(vacuum.sub_category.b()));
        }
        if (vacuum.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(vacuum.service_entity.b()));
        }
        if (vacuum.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(vacuum.description.b()));
        }
        if (vacuum.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(vacuum.timing.b()));
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

    public Vacuum setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public Vacuum setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public Vacuum setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Vacuum setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public Vacuum setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public Vacuum setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public Vacuum setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public Vacuum setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public Vacuum(T t) {
        this.entity_type = t;
    }
}
