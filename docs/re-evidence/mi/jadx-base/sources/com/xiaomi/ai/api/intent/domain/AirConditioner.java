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
public class AirConditioner<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> device = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<Boolean>> is_all_to_operate = Optional.a();
    private Optional<Slot<String>> sub_category = Optional.a();
    private Optional<Slot<String>> service_entity = Optional.a();
    private Optional<Slot<String>> description = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public enum ACFanLevel {
        Auto(0, "Auto（value=0）"),
        Low(1, "Low"),
        Medium(2, "Medium"),
        High(3, "High"),
        Quiet(4, "Quiet"),
        Turbo(5, "Turbo"),
        Strong(6, "Strong");

        private int id;
        private String name;

        ACFanLevel(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static ACFanLevel find(String str) {
            for (ACFanLevel aCFanLevel : values()) {
                if (aCFanLevel.name.equals(str)) {
                    return aCFanLevel;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static ACFanLevel read(String str) {
            return find(str);
        }

        public static String write(ACFanLevel aCFanLevel) {
            return aCFanLevel.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum ACHorizontalPosition {
        LeftSweep(0, "LeftSweep"),
        FreezeLeft(1, "FreezeLeft"),
        MiddlePosition(2, "MiddlePosition"),
        FreezeRight(3, "FreezeRight"),
        RightSweep(4, "RightSweep");

        private int id;
        private String name;

        ACHorizontalPosition(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static ACHorizontalPosition find(String str) {
            for (ACHorizontalPosition aCHorizontalPosition : values()) {
                if (aCHorizontalPosition.name.equals(str)) {
                    return aCHorizontalPosition;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static ACHorizontalPosition read(String str) {
            return find(str);
        }

        public static String write(ACHorizontalPosition aCHorizontalPosition) {
            return aCHorizontalPosition.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum ACMode {
        Auto(0, "Auto（value=0）"),
        Heat(1, "Heat"),
        Cool(2, "Cool"),
        Dry(3, "Dry"),
        Fan(4, AIApiConstants.Fan.NAME),
        EnergySaving(5, "EnergySaving"),
        SoftWind(6, "SoftWind"),
        Sleep(7, "Sleep"),
        UnStraightBlowing(8, "UnStraightBlowing"),
        Strong(9, "Strong");

        private int id;
        private String name;

        ACMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static ACMode find(String str) {
            for (ACMode aCMode : values()) {
                if (aCMode.name.equals(str)) {
                    return aCMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static ACMode read(String str) {
            return find(str);
        }

        public static String write(ACMode aCMode) {
            return aCMode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum ACVerticalPosition {
        TopRating(0, "TopRating"),
        FreezeTop(1, "FreezeTop"),
        MiddleTop(2, "MiddleTop"),
        MiddlePosition(3, "MiddlePosition"),
        MiddleDown(4, "MiddleDown"),
        FreezeDown(5, "FreezeDown"),
        LowerRating(6, "LowerRating");

        private int id;
        private String name;

        ACVerticalPosition(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static ACVerticalPosition find(String str) {
            for (ACVerticalPosition aCVerticalPosition : values()) {
                if (aCVerticalPosition.name.equals(str)) {
                    return aCVerticalPosition;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static ACVerticalPosition read(String str) {
            return find(str);
        }

        public static String write(ACVerticalPosition aCVerticalPosition) {
            return aCVerticalPosition.getName();
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
        private Optional<Slot<ACFanLevel>> name = Optional.a();

        public static fanLevel read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            fanLevel fanlevel = new fanLevel();
            if (zsdVar.z(RealNameWebViewActivity.NUMBER)) {
                fanlevel.setNumber(IntentUtils.readSlot(zsdVar.w(RealNameWebViewActivity.NUMBER), Miai.Number.class));
            }
            if (zsdVar.z("name")) {
                fanlevel.setName(IntentUtils.readSlot(zsdVar.w("name"), ACFanLevel.class));
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

        public Optional<Slot<ACFanLevel>> getName() {
            return this.name;
        }

        public Optional<Slot<Miai.Number>> getNumber() {
            return this.number;
        }

        public fanLevel setName(Slot<ACFanLevel> slot) {
            this.name = Optional.e(slot);
            return this;
        }

        public fanLevel setNumber(Slot<Miai.Number> slot) {
            this.number = Optional.e(slot);
            return this;
        }
    }

    public static class heater implements EntityType {
        public static heater read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new heater();
        }

        public static c4h write(heater heaterVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class horizontalPosition implements EntityType {
        private Optional<Slot<ACHorizontalPosition>> name = Optional.a();

        public static horizontalPosition read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            horizontalPosition horizontalposition = new horizontalPosition();
            if (zsdVar.z("name")) {
                horizontalposition.setName(IntentUtils.readSlot(zsdVar.w("name"), ACHorizontalPosition.class));
            }
            return horizontalposition;
        }

        public static c4h write(horizontalPosition horizontalposition) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (horizontalposition.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(horizontalposition.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<ACHorizontalPosition>> getName() {
            return this.name;
        }

        public horizontalPosition setName(Slot<ACHorizontalPosition> slot) {
            this.name = Optional.e(slot);
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
        private Optional<Slot<ACMode>> name = Optional.a();

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            if (zsdVar.z("name")) {
                modeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), ACMode.class));
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

        public Optional<Slot<ACMode>> getName() {
            return this.name;
        }

        public mode setName(Slot<ACMode> slot) {
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

    public static class verticalPosition implements EntityType {
        private Optional<Slot<ACVerticalPosition>> name = Optional.a();

        public static verticalPosition read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            verticalPosition verticalposition = new verticalPosition();
            if (zsdVar.z("name")) {
                verticalposition.setName(IntentUtils.readSlot(zsdVar.w("name"), ACVerticalPosition.class));
            }
            return verticalposition;
        }

        public static c4h write(verticalPosition verticalposition) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (verticalposition.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(verticalposition.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<ACVerticalPosition>> getName() {
            return this.name;
        }

        public verticalPosition setName(Slot<ACVerticalPosition> slot) {
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

    public AirConditioner() {
    }

    public static AirConditioner read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        AirConditioner airConditioner = new AirConditioner(IntentUtils.readEntityType(zsdVar, AIApiConstants.AirConditioner.NAME, optional));
        if (zsdVar.z("device")) {
            airConditioner.setDevice(IntentUtils.readSlot(zsdVar.w("device"), String.class));
        }
        if (zsdVar.z("room")) {
            airConditioner.setRoom(IntentUtils.readSlot(zsdVar.w("room"), String.class));
        }
        if (zsdVar.z("is_all_to_operate")) {
            airConditioner.setIsAllToOperate(IntentUtils.readSlot(zsdVar.w("is_all_to_operate"), Boolean.class));
        }
        if (zsdVar.z("sub_category")) {
            airConditioner.setSubCategory(IntentUtils.readSlot(zsdVar.w("sub_category"), String.class));
        }
        if (zsdVar.z("service_entity")) {
            airConditioner.setServiceEntity(IntentUtils.readSlot(zsdVar.w("service_entity"), String.class));
        }
        if (zsdVar.z("description")) {
            airConditioner.setDescription(IntentUtils.readSlot(zsdVar.w("description"), String.class));
        }
        if (zsdVar.z("timing")) {
            airConditioner.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return airConditioner;
    }

    public static zsd write(AirConditioner airConditioner) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(airConditioner.entity_type);
        if (airConditioner.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(airConditioner.device.b()));
        }
        if (airConditioner.room.c()) {
            c4hVar.f0("room", IntentUtils.writeSlot(airConditioner.room.b()));
        }
        if (airConditioner.is_all_to_operate.c()) {
            c4hVar.f0("is_all_to_operate", IntentUtils.writeSlot(airConditioner.is_all_to_operate.b()));
        }
        if (airConditioner.sub_category.c()) {
            c4hVar.f0("sub_category", IntentUtils.writeSlot(airConditioner.sub_category.b()));
        }
        if (airConditioner.service_entity.c()) {
            c4hVar.f0("service_entity", IntentUtils.writeSlot(airConditioner.service_entity.b()));
        }
        if (airConditioner.description.c()) {
            c4hVar.f0("description", IntentUtils.writeSlot(airConditioner.description.b()));
        }
        if (airConditioner.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(airConditioner.timing.b()));
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

    public AirConditioner setDescription(Slot<String> slot) {
        this.description = Optional.e(slot);
        return this;
    }

    public AirConditioner setDevice(Slot<String> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public AirConditioner setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public AirConditioner setIsAllToOperate(Slot<Boolean> slot) {
        this.is_all_to_operate = Optional.e(slot);
        return this;
    }

    public AirConditioner setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public AirConditioner setServiceEntity(Slot<String> slot) {
        this.service_entity = Optional.e(slot);
        return this;
    }

    public AirConditioner setSubCategory(Slot<String> slot) {
        this.sub_category = Optional.e(slot);
        return this;
    }

    public AirConditioner setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public AirConditioner(T t) {
        this.entity_type = t;
    }
}
