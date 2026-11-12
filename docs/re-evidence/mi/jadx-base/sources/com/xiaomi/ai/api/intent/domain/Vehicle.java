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
import com.xiaomi.wearable.hm.ChangeListenerImpl;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class Vehicle<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    public enum ACGeneralMode {
        UNKNOWN(-1, DeviceTypes.UNKNOWN),
        BLOW_MODE(0, "BLOW_MODE"),
        RECIRCULATION_MODE(1, "RECIRCULATION_MODE"),
        AC_MODE(2, "AC_MODE");

        private int id;
        private String name;

        ACGeneralMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static ACGeneralMode find(String str) {
            for (ACGeneralMode aCGeneralMode : values()) {
                if (aCGeneralMode.name.equals(str)) {
                    return aCGeneralMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static ACGeneralMode read(String str) {
            return find(str);
        }

        public static String write(ACGeneralMode aCGeneralMode) {
            return aCGeneralMode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum CameraDirective {
        UNKNOWN(-1, DeviceTypes.UNKNOWN),
        SELFIE_PHOTO(0, "SELFIE_PHOTO"),
        SELFIE_VIDEO(1, "SELFIE_VIDEO"),
        PHOTO_IN_CAR(2, "PHOTO_IN_CAR"),
        VIDEO_IN_CAR(3, "VIDEO_IN_CAR");

        private int id;
        private String name;

        CameraDirective(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static CameraDirective find(String str) {
            for (CameraDirective cameraDirective : values()) {
                if (cameraDirective.name.equals(str)) {
                    return cameraDirective;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static CameraDirective read(String str) {
            return find(str);
        }

        public static String write(CameraDirective cameraDirective) {
            return cameraDirective.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum DRDirective {
        UNKNOWN(-1, DeviceTypes.UNKNOWN),
        PHOTOGRAPH(0, "PHOTOGRAPH"),
        CAPTURE_VIDEO(1, "CAPTURE_VIDEO"),
        SWITCH_FRONT_VIDEO_RECORDING(2, "SWITCH_FRONT_VIDEO_RECORDING"),
        SWITCH_BACK_VIDEO_RECORDING(3, "SWITCH_BACK_VIDEO_RECORDING"),
        OPEN_STOP_MONITOR(4, "OPEN_STOP_MONITOR"),
        CLOSE_STOP_MONITOR(5, "CLOSE_STOP_MONITOR"),
        START_VIDEO_RECORDING(6, "START_VIDEO_RECORDING"),
        STOP_VIDEO_RECORDING(7, "STOP_VIDEO_RECORDING"),
        START_SOUND_RECORDING(8, "START_SOUND_RECORDING"),
        STOP_SOUND_RECORDING(9, "STOP_SOUND_RECORDING");

        private int id;
        private String name;

        DRDirective(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static DRDirective find(String str) {
            for (DRDirective dRDirective : values()) {
                if (dRDirective.name.equals(str)) {
                    return dRDirective;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static DRDirective read(String str) {
            return find(str);
        }

        public static String write(DRDirective dRDirective) {
            return dRDirective.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum DrivingMode {
        UNKNOWN(-1, DeviceTypes.UNKNOWN),
        NORMAL(0, "NORMAL"),
        ECONOMICAL(1, "ECONOMICAL"),
        DEFAULT(2, "DEFAULT"),
        HYBRID_FIRST(3, "HYBRID_FIRST"),
        ELECTRIC_FIRST(4, "ELECTRIC_FIRST"),
        DRIVING_CHARGE(5, "DRIVING_CHARGE"),
        SPORT(6, ChangeListenerImpl.SETTING_GROUP_TYPE_SPORT),
        PERFORMANCE(7, "PERFORMANCE"),
        CUSTOM(8, "CUSTOM");

        private int id;
        private String name;

        DrivingMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static DrivingMode find(String str) {
            for (DrivingMode drivingMode : values()) {
                if (drivingMode.name.equals(str)) {
                    return drivingMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static DrivingMode read(String str) {
            return find(str);
        }

        public static String write(DrivingMode drivingMode) {
            return drivingMode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum EnergyLevel {
        Standard(1, "Standard"),
        Strong(2, "Strong");

        private int id;
        private String name;

        EnergyLevel(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static EnergyLevel find(String str) {
            for (EnergyLevel energyLevel : values()) {
                if (energyLevel.name.equals(str)) {
                    return energyLevel;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static EnergyLevel read(String str) {
            return find(str);
        }

        public static String write(EnergyLevel energyLevel) {
            return energyLevel.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum ScreenMode {
        UNKNOWN(-1, DeviceTypes.UNKNOWN),
        LANDSCAPE(0, "LANDSCAPE"),
        PORTRAIT(1, "PORTRAIT"),
        CINEMA(2, "CINEMA");

        private int id;
        private String name;

        ScreenMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static ScreenMode find(String str) {
            for (ScreenMode screenMode : values()) {
                if (screenMode.name.equals(str)) {
                    return screenMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static ScreenMode read(String str) {
            return find(str);
        }

        public static String write(ScreenMode screenMode) {
            return screenMode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum VehicleConditionType {
        UNKNOWN(-1, DeviceTypes.UNKNOWN),
        COMPREHENSIVE_ENDURANCE(0, "COMPREHENSIVE_ENDURANCE"),
        TOTAL_ENDURANCE(1, "TOTAL_ENDURANCE"),
        EV_ENDURANCE(2, "EV_ENDURANCE"),
        FUEL_ENDURANCE(3, "FUEL_ENDURANCE"),
        TYRE_PRESSURE(4, "TYRE_PRESSURE"),
        TYRE_TEMPERATURE(5, "TYRE_TEMPERATURE"),
        TYRE_CONDITION(6, "TYRE_CONDITION"),
        MILEAGE(7, "MILEAGE"),
        TOTAL_ENERGY_CONSUMPTION(8, "TOTAL_ENERGY_CONSUMPTION"),
        AVERAGE_ENERGY_CONSUMPTION(9, "AVERAGE_ENERGY_CONSUMPTION"),
        TRAVEL_TIME(10, "TRAVEL_TIME"),
        SERVICE_CYCLE(11, "SERVICE_CYCLE"),
        ECU_AND_SENSOR_FAULT(12, "ECU_AND_SENSOR_FAULT"),
        BATTERY(13, "BATTERY"),
        VEHICLE_CONFIGURATION(14, "VEHICLE_CONFIGURATION"),
        ENERGY(15, "ENERGY");

        private int id;
        private String name;

        VehicleConditionType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static VehicleConditionType find(String str) {
            for (VehicleConditionType vehicleConditionType : values()) {
                if (vehicleConditionType.name.equals(str)) {
                    return vehicleConditionType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static VehicleConditionType read(String str) {
            return find(str);
        }

        public static String write(VehicleConditionType vehicleConditionType) {
            return vehicleConditionType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class acSweepWind implements EntityType {

        @Required
        private Slot<VehiclePosition> position;

        public acSweepWind() {
        }

        public acSweepWind(Slot<VehiclePosition> slot) {
            this.position = slot;
        }

        public static acSweepWind read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            acSweepWind acsweepwind = new acSweepWind();
            acsweepwind.setPosition(IntentUtils.readSlot(zsdVar.w("position"), VehiclePosition.class));
            return acsweepwind;
        }

        public static c4h write(acSweepWind acsweepwind) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("position", IntentUtils.writeSlot(acsweepwind.position));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<VehiclePosition> getPosition() {
            return this.position;
        }

        @Required
        public acSweepWind setPosition(Slot<VehiclePosition> slot) {
            this.position = slot;
            return this;
        }
    }

    public static class acc implements EntityType {
        public static acc read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new acc();
        }

        public static c4h write(acc accVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class adas implements EntityType {
        public static adas read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new adas();
        }

        public static c4h write(adas adasVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class autoArea implements EntityType {

        @Required
        private Slot<VehiclePosition> position;

        public autoArea() {
        }

        public autoArea(Slot<VehiclePosition> slot) {
            this.position = slot;
        }

        public static autoArea read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            autoArea autoarea = new autoArea();
            autoarea.setPosition(IntentUtils.readSlot(zsdVar.w("position"), VehiclePosition.class));
            return autoarea;
        }

        public static c4h write(autoArea autoarea) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("position", IntentUtils.writeSlot(autoarea.position));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<VehiclePosition> getPosition() {
            return this.position;
        }

        @Required
        public autoArea setPosition(Slot<VehiclePosition> slot) {
            this.position = slot;
            return this;
        }
    }

    public static class autoDefogDefrost implements EntityType {
        public static autoDefogDefrost read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new autoDefogDefrost();
        }

        public static c4h write(autoDefogDefrost autodefogdefrost) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class bsd implements EntityType {
        public static bsd read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new bsd();
        }

        public static c4h write(bsd bsdVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class camera implements EntityType {

        @Required
        private Slot<CameraDirective> directive;

        public camera() {
        }

        public camera(Slot<CameraDirective> slot) {
            this.directive = slot;
        }

        public static camera read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            camera cameraVar = new camera();
            cameraVar.setDirective(IntentUtils.readSlot(zsdVar.w("directive"), CameraDirective.class));
            return cameraVar;
        }

        public static c4h write(camera cameraVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("directive", IntentUtils.writeSlot(cameraVar.directive));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<CameraDirective> getDirective() {
            return this.directive;
        }

        @Required
        public camera setDirective(Slot<CameraDirective> slot) {
            this.directive = slot;
            return this;
        }
    }

    public static class cellularData implements EntityType {
        public static cellularData read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new cellularData();
        }

        public static c4h write(cellularData cellulardata) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class centralLock implements EntityType {
        public static centralLock read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new centralLock();
        }

        public static c4h write(centralLock centrallock) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class comprehensiveEndurance implements EntityType {
        public static comprehensiveEndurance read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new comprehensiveEndurance();
        }

        public static c4h write(comprehensiveEndurance comprehensiveendurance) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class condition implements EntityType {

        @Required
        private Slot<VehicleConditionType> name;

        public condition() {
        }

        public condition(Slot<VehicleConditionType> slot) {
            this.name = slot;
        }

        public static condition read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            condition conditionVar = new condition();
            conditionVar.setName(IntentUtils.readSlot(zsdVar.w("name"), VehicleConditionType.class));
            return conditionVar;
        }

        public static c4h write(condition conditionVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(conditionVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<VehicleConditionType> getName() {
            return this.name;
        }

        @Required
        public condition setName(Slot<VehicleConditionType> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class doorHandle implements EntityType {

        @Required
        private Slot<VehiclePosition> position;

        public doorHandle() {
        }

        public doorHandle(Slot<VehiclePosition> slot) {
            this.position = slot;
        }

        public static doorHandle read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            doorHandle doorhandle = new doorHandle();
            doorhandle.setPosition(IntentUtils.readSlot(zsdVar.w("position"), VehiclePosition.class));
            return doorhandle;
        }

        public static c4h write(doorHandle doorhandle) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("position", IntentUtils.writeSlot(doorhandle.position));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<VehiclePosition> getPosition() {
            return this.position;
        }

        @Required
        public doorHandle setPosition(Slot<VehiclePosition> slot) {
            this.position = slot;
            return this;
        }
    }

    public static class energyManagement implements EntityType {
        public static energyManagement read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new energyManagement();
        }

        public static c4h write(energyManagement energymanagement) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class energyRecovery implements EntityType {
        private Optional<Slot<EnergyLevel>> level = Optional.a();

        public static energyRecovery read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            energyRecovery energyrecovery = new energyRecovery();
            if (zsdVar.z("level")) {
                energyrecovery.setLevel(IntentUtils.readSlot(zsdVar.w("level"), EnergyLevel.class));
            }
            return energyrecovery;
        }

        public static c4h write(energyRecovery energyrecovery) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (energyrecovery.level.c()) {
                c4hVarCreateObjectNode.f0("level", IntentUtils.writeSlot(energyrecovery.level.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<EnergyLevel>> getLevel() {
            return this.level;
        }

        public energyRecovery setLevel(Slot<EnergyLevel> slot) {
            this.level = Optional.e(slot);
            return this;
        }
    }

    public static class esp implements EntityType {
        public static esp read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new esp();
        }

        public static c4h write(esp espVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class evEndurance implements EntityType {
        public static evEndurance read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new evEndurance();
        }

        public static c4h write(evEndurance evendurance) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class fm implements EntityType {
        public static fm read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new fm();
        }

        public static c4h write(fm fmVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class frontArea implements EntityType {
        public static frontArea read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new frontArea();
        }

        public static c4h write(frontArea frontarea) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class fuelEndurance implements EntityType {
        public static fuelEndurance read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new fuelEndurance();
        }

        public static c4h write(fuelEndurance fuelendurance) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class fuelLock implements EntityType {
        public static fuelLock read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new fuelLock();
        }

        public static c4h write(fuelLock fuellock) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class fullView implements EntityType {
        public static fullView read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new fullView();
        }

        public static c4h write(fullView fullview) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class greetingSeat implements EntityType {

        @Required
        private Slot<VehiclePosition> position;

        public greetingSeat() {
        }

        public greetingSeat(Slot<VehiclePosition> slot) {
            this.position = slot;
        }

        public static greetingSeat read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            greetingSeat greetingseat = new greetingSeat();
            greetingseat.setPosition(IntentUtils.readSlot(zsdVar.w("position"), VehiclePosition.class));
            return greetingseat;
        }

        public static c4h write(greetingSeat greetingseat) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("position", IntentUtils.writeSlot(greetingseat.position));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<VehiclePosition> getPosition() {
            return this.position;
        }

        @Required
        public greetingSeat setPosition(Slot<VehiclePosition> slot) {
            this.position = slot;
            return this;
        }
    }

    public static class hdc implements EntityType {
        public static hdc read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new hdc();
        }

        public static c4h write(hdc hdcVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class ldw implements EntityType {
        public static ldw read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new ldw();
        }

        public static c4h write(ldw ldwVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class lka implements EntityType {
        public static lka read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new lka();
        }

        public static c4h write(lka lkaVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class mode implements EntityType {

        @Required
        private Slot<DrivingMode> name;

        public mode() {
        }

        public mode(Slot<DrivingMode> slot) {
            this.name = slot;
        }

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            modeVar.setName(IntentUtils.readSlot(zsdVar.w("name"), DrivingMode.class));
            return modeVar;
        }

        public static c4h write(mode modeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(modeVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<DrivingMode> getName() {
            return this.name;
        }

        @Required
        public mode setName(Slot<DrivingMode> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class negativeOxygenIon implements EntityType {
        public static negativeOxygenIon read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new negativeOxygenIon();
        }

        public static c4h write(negativeOxygenIon negativeoxygenion) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class pullMode implements EntityType {
        public static pullMode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new pullMode();
        }

        public static c4h write(pullMode pullmode) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class radarWarning implements EntityType {
        public static radarWarning read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new radarWarning();
        }

        public static c4h write(radarWarning radarwarning) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class rainAndSnowMode implements EntityType {
        public static rainAndSnowMode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new rainAndSnowMode();
        }

        public static c4h write(rainAndSnowMode rainandsnowmode) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class rearArea implements EntityType {
        public static rearArea read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new rearArea();
        }

        public static c4h write(rearArea reararea) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class scanRadio implements EntityType {
        public static scanRadio read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new scanRadio();
        }

        public static c4h write(scanRadio scanradio) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class scentSystem implements EntityType {
        public static scentSystem read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new scentSystem();
        }

        public static c4h write(scentSystem scentsystem) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class screen implements EntityType {
        private Optional<Slot<ScreenMode>> mode = Optional.a();

        public static screen read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            screen screenVar = new screen();
            if (zsdVar.z("mode")) {
                screenVar.setMode(IntentUtils.readSlot(zsdVar.w("mode"), ScreenMode.class));
            }
            return screenVar;
        }

        public static c4h write(screen screenVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (screenVar.mode.c()) {
                c4hVarCreateObjectNode.f0("mode", IntentUtils.writeSlot(screenVar.mode.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<ScreenMode>> getMode() {
            return this.mode;
        }

        public screen setMode(Slot<ScreenMode> slot) {
            this.mode = Optional.e(slot);
            return this;
        }
    }

    public static class screensaver implements EntityType {
        public static screensaver read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new screensaver();
        }

        public static c4h write(screensaver screensaverVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class syncTemperatureControl implements EntityType {
        public static syncTemperatureControl read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new syncTemperatureControl();
        }

        public static c4h write(syncTemperatureControl synctemperaturecontrol) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class tailGate implements EntityType {
        public static tailGate read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new tailGate();
        }

        public static c4h write(tailGate tailgate) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class totalEndurance implements EntityType {
        public static totalEndurance read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new totalEndurance();
        }

        public static c4h write(totalEndurance totalendurance) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class ventilationMode implements EntityType {

        @Required
        private Slot<VehiclePosition> position;

        public ventilationMode() {
        }

        public ventilationMode(Slot<VehiclePosition> slot) {
            this.position = slot;
        }

        public static ventilationMode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            ventilationMode ventilationmode = new ventilationMode();
            ventilationmode.setPosition(IntentUtils.readSlot(zsdVar.w("position"), VehiclePosition.class));
            return ventilationmode;
        }

        public static c4h write(ventilationMode ventilationmode) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("position", IntentUtils.writeSlot(ventilationmode.position));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<VehiclePosition> getPosition() {
            return this.position;
        }

        @Required
        public ventilationMode setPosition(Slot<VehiclePosition> slot) {
            this.position = slot;
            return this;
        }
    }

    public static class wiperMaintenance implements EntityType {

        @Required
        private Slot<VehiclePosition> position;

        public wiperMaintenance() {
        }

        public wiperMaintenance(Slot<VehiclePosition> slot) {
            this.position = slot;
        }

        public static wiperMaintenance read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            wiperMaintenance wipermaintenance = new wiperMaintenance();
            wipermaintenance.setPosition(IntentUtils.readSlot(zsdVar.w("position"), VehiclePosition.class));
            return wipermaintenance;
        }

        public static c4h write(wiperMaintenance wipermaintenance) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("position", IntentUtils.writeSlot(wipermaintenance.position));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<VehiclePosition> getPosition() {
            return this.position;
        }

        @Required
        public wiperMaintenance setPosition(Slot<VehiclePosition> slot) {
            this.position = slot;
            return this;
        }
    }

    public static class wirelessPower implements EntityType {
        public static wirelessPower read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new wirelessPower();
        }

        public static c4h write(wirelessPower wirelesspower) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Vehicle() {
    }

    public static Vehicle read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        return new Vehicle(IntentUtils.readEntityType(zsdVar, AIApiConstants.Vehicle.NAME, optional));
    }

    public static zsd write(Vehicle vehicle) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return (c4h) IntentUtils.writeEntityType(vehicle.entity_type);
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
    public Vehicle setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Vehicle(T t) {
        this.entity_type = t;
    }
}
