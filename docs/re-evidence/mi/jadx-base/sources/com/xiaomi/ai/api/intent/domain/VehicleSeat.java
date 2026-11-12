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
public class VehicleSeat<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<VehiclePosition> position;

    @Required
    private Slot<SeatUnit> unit;

    public enum SeatMode {
        DEFAULT(0, "DEFAULT");

        private int id;
        private String name;

        SeatMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static SeatMode find(String str) {
            for (SeatMode seatMode : values()) {
                if (seatMode.name.equals(str)) {
                    return seatMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static SeatMode read(String str) {
            return find(str);
        }

        public static String write(SeatMode seatMode) {
            return seatMode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum SeatUnit {
        UNKNOWN(-1, DeviceTypes.UNKNOWN),
        BACK(0, "BACK"),
        LUMBAR(1, "LUMBAR"),
        FRONT_BACK(2, "FRONT_BACK");

        private int id;
        private String name;

        SeatUnit(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static SeatUnit find(String str) {
            for (SeatUnit seatUnit : values()) {
                if (seatUnit.name.equals(str)) {
                    return seatUnit;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static SeatUnit read(String str) {
            return find(str);
        }

        public static String write(SeatUnit seatUnit) {
            return seatUnit.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
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

    public static class heating implements EntityType {
        private Optional<Slot<Integer>> value = Optional.a();

        public static heating read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            heating heatingVar = new heating();
            if (zsdVar.z("value")) {
                heatingVar.setValue(IntentUtils.readSlot(zsdVar.w("value"), Integer.class));
            }
            return heatingVar;
        }

        public static c4h write(heating heatingVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (heatingVar.value.c()) {
                c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(heatingVar.value.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Integer>> getValue() {
            return this.value;
        }

        public heating setValue(Slot<Integer> slot) {
            this.value = Optional.e(slot);
            return this;
        }
    }

    public static class mode implements EntityType {

        @Required
        private Slot<SeatMode> name;

        public mode() {
        }

        public mode(Slot<SeatMode> slot) {
            this.name = slot;
        }

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            modeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), SeatMode.class));
            return modeVar;
        }

        public static c4h write(mode modeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(modeVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<SeatMode> getName() {
            return this.name;
        }

        @Required
        public mode setName(Slot<SeatMode> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class reclineDegree implements EntityType {

        @Required
        private Slot<Integer> value;

        public reclineDegree() {
        }

        public reclineDegree(Slot<Integer> slot) {
            this.value = slot;
        }

        public static reclineDegree read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            reclineDegree reclinedegree = new reclineDegree();
            reclinedegree.setValue(IntentUtils.readSlot(zsdVar.w("value"), Integer.class));
            return reclinedegree;
        }

        public static c4h write(reclineDegree reclinedegree) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(reclinedegree.value));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Integer> getValue() {
            return this.value;
        }

        @Required
        public reclineDegree setValue(Slot<Integer> slot) {
            this.value = slot;
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

    public static class ventilation implements EntityType {
        public static ventilation read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new ventilation();
        }

        public static c4h write(ventilation ventilationVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public VehicleSeat() {
    }

    public static VehicleSeat read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        VehicleSeat vehicleSeat = new VehicleSeat(IntentUtils.readEntityType(zsdVar, AIApiConstants.VehicleSeat.NAME, optional));
        vehicleSeat.setPosition(IntentUtils.readSlot(zsdVar.w("position"), VehiclePosition.class));
        vehicleSeat.setUnit(IntentUtils.readSlot(zsdVar.w("unit"), SeatUnit.class));
        return vehicleSeat;
    }

    public static zsd write(VehicleSeat vehicleSeat) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(vehicleSeat.entity_type);
        c4hVar.f0("position", IntentUtils.writeSlot(vehicleSeat.position));
        c4hVar.f0("unit", IntentUtils.writeSlot(vehicleSeat.unit));
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

    @Required
    public Slot<VehiclePosition> getPosition() {
        return this.position;
    }

    @Required
    public Slot<SeatUnit> getUnit() {
        return this.unit;
    }

    @Required
    public VehicleSeat setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    @Required
    public VehicleSeat setPosition(Slot<VehiclePosition> slot) {
        this.position = slot;
        return this;
    }

    @Required
    public VehicleSeat setUnit(Slot<SeatUnit> slot) {
        this.unit = slot;
        return this;
    }

    public VehicleSeat(T t) {
        this.entity_type = t;
    }

    public VehicleSeat(T t, Slot<VehiclePosition> slot, Slot<SeatUnit> slot2) {
        this.entity_type = t;
        this.position = slot;
        this.unit = slot2;
    }
}
