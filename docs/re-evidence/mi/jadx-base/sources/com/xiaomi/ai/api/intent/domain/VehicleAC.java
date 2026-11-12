package com.xiaomi.ai.api.intent.domain;

import androidx.health.connect.client.records.metadata.DeviceTypes;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class VehicleAC<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<VehiclePosition>> position = Optional.a();

    public enum AirConditioningMode {
        UNKNOWN(-1, DeviceTypes.UNKNOWN),
        REFRIGERATION(0, "REFRIGERATION"),
        HEATING(1, "HEATING"),
        INNER_RECIRCULATION(2, "INNER_RECIRCULATION"),
        OUTER_RECIRCULATION(3, "OUTER_RECIRCULATION"),
        AUTOMATIC_RECIRCULATION(4, "AUTOMATIC_RECIRCULATION"),
        BLOW_FACE(5, "BLOW_FACE"),
        BLOW_FOOT(6, "BLOW_FOOT"),
        DEFROST(7, "DEFROST"),
        AUTO(8, "AUTO"),
        COMFORTABLE(9, "COMFORTABLE"),
        VENTILATION(10, "VENTILATION"),
        ENERGY_SAVING(11, "ENERGY_SAVING"),
        BLOW_WINDOW(12, "BLOW_WINDOW");

        private int id;
        private String name;

        AirConditioningMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static AirConditioningMode find(String str) {
            for (AirConditioningMode airConditioningMode : values()) {
                if (airConditioningMode.name.equals(str)) {
                    return airConditioningMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static AirConditioningMode read(String str) {
            return find(str);
        }

        public static String write(AirConditioningMode airConditioningMode) {
            return airConditioningMode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class cold implements EntityType {
        public static cold read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new cold();
        }

        public static c4h write(cold coldVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class fanLevel implements EntityType {

        @Required
        private Slot<Integer> value;

        public fanLevel() {
        }

        public fanLevel(Slot<Integer> slot) {
            this.value = slot;
        }

        public static fanLevel read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            fanLevel fanlevel = new fanLevel();
            fanlevel.setValue(IntentUtils.readSlot(zsdVar.w("value"), Integer.class));
            return fanlevel;
        }

        public static c4h write(fanLevel fanlevel) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(fanlevel.value));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Integer> getValue() {
            return this.value;
        }

        @Required
        public fanLevel setValue(Slot<Integer> slot) {
            this.value = slot;
            return this;
        }
    }

    public static class mode implements EntityType {

        @Required
        private Slot<AirConditioningMode> name;

        public mode() {
        }

        public mode(Slot<AirConditioningMode> slot) {
            this.name = slot;
        }

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            modeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), AirConditioningMode.class));
            return modeVar;
        }

        public static c4h write(mode modeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(modeVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<AirConditioningMode> getName() {
            return this.name;
        }

        @Required
        public mode setName(Slot<AirConditioningMode> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class temperature implements EntityType {

        @Required
        private Slot<Double> value;

        public temperature() {
        }

        public temperature(Slot<Double> slot) {
            this.value = slot;
        }

        public static temperature read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            temperature temperatureVar = new temperature();
            temperatureVar.setValue(IntentUtils.readSlot(zsdVar.w("value"), Double.class));
            return temperatureVar;
        }

        public static c4h write(temperature temperatureVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(temperatureVar.value));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Double> getValue() {
            return this.value;
        }

        @Required
        public temperature setValue(Slot<Double> slot) {
            this.value = slot;
            return this;
        }
    }

    public VehicleAC() {
    }

    public static VehicleAC read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        VehicleAC vehicleAC = new VehicleAC(IntentUtils.readEntityType(zsdVar, AIApiConstants.VehicleAC.NAME, optional));
        if (zsdVar.z("position")) {
            vehicleAC.setPosition(IntentUtils.readSlot(zsdVar.w("position"), VehiclePosition.class));
        }
        return vehicleAC;
    }

    public static zsd write(VehicleAC vehicleAC) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(vehicleAC.entity_type);
        if (vehicleAC.position.c()) {
            c4hVar.f0("position", IntentUtils.writeSlot(vehicleAC.position.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<VehiclePosition>> getPosition() {
        return this.position;
    }

    @Required
    public VehicleAC setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public VehicleAC setPosition(Slot<VehiclePosition> slot) {
        this.position = Optional.e(slot);
        return this;
    }

    public VehicleAC(T t) {
        this.entity_type = t;
    }
}
