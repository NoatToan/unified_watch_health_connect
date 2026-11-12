package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class AutoController {

    public static class ACConfig {
        private Optional<HVACType> hvac_type = Optional.a();
        private Optional<Boolean> has_console_display = Optional.a();
        private Optional<Boolean> has_hepa_filter = Optional.a();
        private Optional<SecondRowAirOutletType> second_row_air_outlet_type = Optional.a();

        public Optional<HVACType> getHvacType() {
            return this.hvac_type;
        }

        public Optional<SecondRowAirOutletType> getSecondRowAirOutletType() {
            return this.second_row_air_outlet_type;
        }

        public Optional<Boolean> isHasConsoleDisplay() {
            return this.has_console_display;
        }

        public Optional<Boolean> isHasHepaFilter() {
            return this.has_hepa_filter;
        }

        public ACConfig setHasConsoleDisplay(boolean z) {
            this.has_console_display = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ACConfig setHasHepaFilter(boolean z) {
            this.has_hepa_filter = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ACConfig setHvacType(HVACType hVACType) {
            this.hvac_type = Optional.e(hVACType);
            return this;
        }

        public ACConfig setSecondRowAirOutletType(SecondRowAirOutletType secondRowAirOutletType) {
            this.second_row_air_outlet_type = Optional.e(secondRowAirOutletType);
            return this;
        }
    }

    public enum ACGeneralMode {
        UNKNOWN(-1),
        BLOW_MODE(0),
        RECIRCULATION_MODE(1),
        AC_MODE(2);

        private int id;

        ACGeneralMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class APAState {
        private Optional<Boolean> is_parking = Optional.a();
        private Optional<Integer> parking_lot = Optional.a();

        public Optional<Integer> getParkingLot() {
            return this.parking_lot;
        }

        public Optional<Boolean> isParking() {
            return this.is_parking;
        }

        public APAState setIsParking(boolean z) {
            this.is_parking = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public APAState setParkingLot(int i) {
            this.parking_lot = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "AdjustACTemperature", namespace = AIApiConstants.AutoController.NAME)
    @Deprecated
    public static class AdjustACTemperature implements InstructionPayload {
        private Optional<Position> position = Optional.a();

        @Deprecated
        private Optional<Integer> value = Optional.a();
        private Optional<Float> decimal_value = Optional.a();
        private Optional<AdjustState> state = Optional.a();

        public Optional<Float> getDecimalValue() {
            return this.decimal_value;
        }

        public Optional<Position> getPosition() {
            return this.position;
        }

        public Optional<AdjustState> getState() {
            return this.state;
        }

        @Deprecated
        public Optional<Integer> getValue() {
            return this.value;
        }

        public AdjustACTemperature setDecimalValue(float f) {
            this.decimal_value = Optional.e(Float.valueOf(f));
            return this;
        }

        public AdjustACTemperature setPosition(Position position) {
            this.position = Optional.e(position);
            return this;
        }

        public AdjustACTemperature setState(AdjustState adjustState) {
            this.state = Optional.e(adjustState);
            return this;
        }

        @Deprecated
        public AdjustACTemperature setValue(int i) {
            this.value = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "AdjustACWindSpeed", namespace = AIApiConstants.AutoController.NAME)
    @Deprecated
    public static class AdjustACWindSpeed implements InstructionPayload {
        private Optional<Position> position = Optional.a();
        private Optional<Integer> value = Optional.a();
        private Optional<AdjustState> state = Optional.a();

        public Optional<Position> getPosition() {
            return this.position;
        }

        public Optional<AdjustState> getState() {
            return this.state;
        }

        public Optional<Integer> getValue() {
            return this.value;
        }

        public AdjustACWindSpeed setPosition(Position position) {
            this.position = Optional.e(position);
            return this;
        }

        public AdjustACWindSpeed setState(AdjustState adjustState) {
            this.state = Optional.e(adjustState);
            return this;
        }

        public AdjustACWindSpeed setValue(int i) {
            this.value = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "AdjustSeatTemperature", namespace = AIApiConstants.AutoController.NAME)
    @Deprecated
    public static class AdjustSeatTemperature implements InstructionPayload {
        private Optional<Position> position = Optional.a();

        @Deprecated
        private Optional<Integer> value = Optional.a();
        private Optional<Float> decimal_value = Optional.a();
        private Optional<AdjustState> state = Optional.a();

        public Optional<Float> getDecimalValue() {
            return this.decimal_value;
        }

        public Optional<Position> getPosition() {
            return this.position;
        }

        public Optional<AdjustState> getState() {
            return this.state;
        }

        @Deprecated
        public Optional<Integer> getValue() {
            return this.value;
        }

        public AdjustSeatTemperature setDecimalValue(float f) {
            this.decimal_value = Optional.e(Float.valueOf(f));
            return this;
        }

        public AdjustSeatTemperature setPosition(Position position) {
            this.position = Optional.e(position);
            return this;
        }

        public AdjustSeatTemperature setState(AdjustState adjustState) {
            this.state = Optional.e(adjustState);
            return this;
        }

        @Deprecated
        public AdjustSeatTemperature setValue(int i) {
            this.value = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "AdjustSeatWindSpeed", namespace = AIApiConstants.AutoController.NAME)
    @Deprecated
    public static class AdjustSeatWindSpeed implements InstructionPayload {
        private Optional<Position> position = Optional.a();
        private Optional<Integer> value = Optional.a();
        private Optional<AdjustState> state = Optional.a();

        public Optional<Position> getPosition() {
            return this.position;
        }

        public Optional<AdjustState> getState() {
            return this.state;
        }

        public Optional<Integer> getValue() {
            return this.value;
        }

        public AdjustSeatWindSpeed setPosition(Position position) {
            this.position = Optional.e(position);
            return this;
        }

        public AdjustSeatWindSpeed setState(AdjustState adjustState) {
            this.state = Optional.e(adjustState);
            return this;
        }

        public AdjustSeatWindSpeed setValue(int i) {
            this.value = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    public enum AdjustState {
        UNKNOWN(-1),
        UP(0),
        DOWN(1),
        MAX(2),
        MIN(3),
        ENV(4),
        AUTO(5),
        CUSTOM(6),
        CLOSE(7),
        OPEN(8),
        MIDDLE(9),
        BLOWING(10),
        COLDING(11),
        SEAM(12),
        DEFAULT(13);

        private int id;

        AdjustState(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum AirCleanerMode {
        UNKNOWN(-1),
        AUTO(0),
        OPERATION(1),
        MUTE(2);

        private int id;

        AirCleanerMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum AirConditioningMode {
        UNKNOWN(-1),
        REFRIGERATION(0),
        HEATING(1),
        INNER_RECIRCULATION(2),
        OUTER_RECIRCULATION(3),
        AUTOMATIC_RECIRCULATION(4),
        BLOW_FACE(5),
        BLOW_FOOT(6),
        DEFROST(7),
        AUTO(8),
        COMFORTABLE(9),
        VENTILATION(10),
        ENERGY_SAVING(11),
        BLOW_WINDOW(12),
        STRONG_REFRIGERATION(13),
        STRONG_HEATING(14);

        private int id;

        AirConditioningMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class AlertTimes {
        private Optional<Integer> volume_too_loud = Optional.a();
        private Optional<Integer> volume_too_low = Optional.a();

        public Optional<Integer> getVolumeTooLoud() {
            return this.volume_too_loud;
        }

        public Optional<Integer> getVolumeTooLow() {
            return this.volume_too_low;
        }

        public AlertTimes setVolumeTooLoud(int i) {
            this.volume_too_loud = Optional.e(Integer.valueOf(i));
            return this;
        }

        public AlertTimes setVolumeTooLow(int i) {
            this.volume_too_low = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    public enum AmbientLightMode {
        UNKNOWN(-1),
        DYNAMIC(0),
        STATIC(1),
        RHYTHM(2);

        private int id;

        AmbientLightMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum Attribute {
        UNKNOWN(-1),
        TEMPERATURE(0),
        SENSITIVITY(1),
        SPEED(2),
        HORIZONTAL_POSITION(3),
        VERTICAL_POSITION(4),
        ANGLE(5),
        OPENING(6),
        GEAR(7),
        BRIGHTNESS(8),
        COLOR(9),
        LIGHT_MODE(10),
        BLN_MODE(11),
        DRIVE_MODE(12),
        DRIVE_SCENE_MODE(13),
        DISTANCE(14),
        COMMON_MODE(15),
        SWITCH(16),
        DURATION(17),
        CONCENTRATION(18),
        FOLLOW_NEAR_LIGHT(19),
        FOLLOW_HEADLAMP_DELAY(20),
        FRAGRANCE_TYPE(21),
        FRAGRANCE_SUPPLIES(22),
        LIGHTING_EFFECT_SYNCHRONIZATION(23),
        DISPLAY_CONTENT(24),
        WIRELESS_CHARGING(25),
        PHONE_FORGET_REMINDER(26),
        PARKING_LIGHTS(27),
        SEAT_NOTIFY(28),
        TOUCH_TO_CONNECT(29),
        PAGE(30),
        AUTO_BRIGHTNESS(31),
        MI_SHARE(32),
        HUMIDIFIER_LIGHT(33),
        HOT_PORT(34),
        HUMIDITY(35),
        BREATHING_EFFECT(36),
        NATURAL_WIND(37);

        private int id;

        Attribute(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum AutoPropertyName {
        Unknown(-1),
        HEADREST_MODE(0),
        SOUND_FIELD(1),
        SOUND_EFFECT(2),
        BALANCE_SETTINGS(3),
        ELECTRICITY_UNIT(4),
        CAR_PLAY(5);

        private int id;

        AutoPropertyName(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum AutoPropertyState {
        Unknown(-1),
        ON(0),
        OFF(1),
        INIT(2);

        private int id;

        AutoPropertyState(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum AutoWikiType {
        UNKNOWN(-1),
        TELLTALE(0);

        private int id;

        AutoWikiType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "BatchStop", namespace = AIApiConstants.AutoController.NAME)
    public static class BatchStop implements InstructionPayload {

        @Required
        private List<VehicleControlDevice> devices;

        public BatchStop() {
        }

        public BatchStop(List<VehicleControlDevice> list) {
            this.devices = list;
        }

        @Required
        public List<VehicleControlDevice> getDevices() {
            return this.devices;
        }

        @Required
        public BatchStop setDevices(List<VehicleControlDevice> list) {
            this.devices = list;
            return this;
        }
    }

    public enum BrakeDiscType {
        UNKNOWN(-1),
        UNPUNCHED_VENTILATED(0),
        PUNCHED_VENTILATED(1),
        PUNCHED_CARBON_CERAMIC(2),
        LINEAR_VENTILATED(3);

        private int id;

        BrakeDiscType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "ButtonLocationEvent", namespace = AIApiConstants.AutoController.NAME)
    public static class ButtonLocationEvent implements EventPayload {

        @Required
        private String action;

        @Required
        private String id;

        @Required
        private String name;

        @Required
        private String pkg_name;

        public ButtonLocationEvent() {
        }

        public ButtonLocationEvent(String str, String str2, String str3, String str4) {
            this.name = str;
            this.id = str2;
            this.action = str3;
            this.pkg_name = str4;
        }

        @Required
        public String getAction() {
            return this.action;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public String getPkgName() {
            return this.pkg_name;
        }

        @Required
        public ButtonLocationEvent setAction(String str) {
            this.action = str;
            return this;
        }

        @Required
        public ButtonLocationEvent setId(String str) {
            this.id = str;
            return this;
        }

        @Required
        public ButtonLocationEvent setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public ButtonLocationEvent setPkgName(String str) {
            this.pkg_name = str;
            return this;
        }
    }

    public enum CameraDirective {
        UNKNOWN(-1),
        SELFIE_PHOTO(0),
        SELFIE_VIDEO(1),
        PHOTO_IN_CAR(2),
        VIDEO_IN_CAR(3);

        private int id;

        CameraDirective(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum CarType {
        UNKNOWN(-1),
        MS11(0),
        MX11(1),
        MS11_P(2);

        private int id;

        CarType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum CheckRange {
        Unknown(-1),
        THIS_RID(0),
        SINCE_LAST_CHARGE(1),
        SUBTOTAL_MILEAGE_A(2),
        SUBTOTAL_MILEAGE_B(3),
        TOTAL(4),
        LAST_10_KM(5),
        LAST_50_KM(6),
        LAST_100_KM(7);

        private int id;

        CheckRange(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum CheckSpeedScene {
        UNKNOWN(-1),
        EQUAL(0),
        GREATER(1),
        GREATER_EQUAL(2),
        LESS(3),
        LESS_EQUAL(4);

        private int id;

        CheckSpeedScene(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum CheckType {
        UNKNOWN(-1),
        VALUE(0),
        SWITCH_STATUS(1);

        private int id;

        CheckType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum ColumnAdjustType {
        UNKNOWN(-1),
        WITHOUT(0),
        ELECTRICAL_COLUMN_FOUR_WAY(1);

        private int id;

        ColumnAdjustType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "ConnectDevice", namespace = AIApiConstants.AutoController.NAME)
    public static class ConnectDevice implements InstructionPayload {
        private Optional<String> name = Optional.a();
        private Optional<String> identifier = Optional.a();

        public Optional<String> getIdentifier() {
            return this.identifier;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public ConnectDevice setIdentifier(String str) {
            this.identifier = Optional.e(str);
            return this;
        }

        public ConnectDevice setName(String str) {
            this.name = Optional.e(str);
            return this;
        }
    }

    public static class ConnectDeviceInfo {
        private Optional<DeviceConnectState> connect_state = Optional.a();
        private Optional<String> device_name = Optional.a();

        public Optional<DeviceConnectState> getConnectState() {
            return this.connect_state;
        }

        public Optional<String> getDeviceName() {
            return this.device_name;
        }

        public ConnectDeviceInfo setConnectState(DeviceConnectState deviceConnectState) {
            this.connect_state = Optional.e(deviceConnectState);
            return this;
        }

        public ConnectDeviceInfo setDeviceName(String str) {
            this.device_name = Optional.e(str);
            return this;
        }
    }

    @NamespaceName(name = "ControlAmbientLight", namespace = AIApiConstants.AutoController.NAME)
    public static class ControlAmbientLight implements InstructionPayload {

        @Required
        private ControlCmd cmd;

        @Required
        private AmbientLightMode mode;

        public ControlAmbientLight() {
        }

        public ControlAmbientLight(ControlCmd controlCmd, AmbientLightMode ambientLightMode) {
            this.cmd = controlCmd;
            this.mode = ambientLightMode;
        }

        @Required
        public ControlCmd getCmd() {
            return this.cmd;
        }

        @Required
        public AmbientLightMode getMode() {
            return this.mode;
        }

        @Required
        public ControlAmbientLight setCmd(ControlCmd controlCmd) {
            this.cmd = controlCmd;
            return this;
        }

        @Required
        public ControlAmbientLight setMode(AmbientLightMode ambientLightMode) {
            this.mode = ambientLightMode;
            return this;
        }
    }

    public enum ControlCmd {
        UNKNOWN(-1),
        TURN_ON(0),
        TURN_OFF(1);

        private int id;

        ControlCmd(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum DRDirective {
        UNKNOWN(-1),
        PHOTOGRAPH(0),
        CAPTURE_VIDEO(1),
        SWITCH_FRONT_VIDEO_RECORDING(2),
        SWITCH_BACK_VIDEO_RECORDING(3),
        OPEN_STOP_MONITOR(4),
        CLOSE_STOP_MONITOR(5),
        START_VIDEO_RECORDING(6),
        STOP_VIDEO_RECORDING(7),
        START_SOUND_RECORDING(8),
        STOP_SOUND_RECORDING(9);

        private int id;

        DRDirective(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum DeviceClickType {
        UNKNOWN(-1),
        HOME_CONFIRM(0),
        HOME_CANCEL(1),
        DEVICE_CONFIRM(2),
        DEVICE_CANCEL(3);

        private int id;

        DeviceClickType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum DeviceConnectState {
        UNKNOWN(-1),
        DEVICE_CONNECT_DISCONNECT(0),
        DEVICE_CONNECT_NORMAL(1);

        private int id;

        DeviceConnectState(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum Direction {
        UNKNOWN(-1),
        UP(0),
        DOWN(1),
        LEFT(2),
        RIGHT(3),
        FRONT(4),
        BACK(5);

        private int id;

        Direction(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "Downdip", namespace = AIApiConstants.AutoController.NAME)
    public static class Downdip implements InstructionPayload {

        @Required
        private String identifier;

        @Required
        private String name;

        public Downdip() {
        }

        public Downdip(String str, String str2) {
            this.name = str;
            this.identifier = str2;
        }

        @Required
        public String getIdentifier() {
            return this.identifier;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public Downdip setIdentifier(String str) {
            this.identifier = str;
            return this;
        }

        @Required
        public Downdip setName(String str) {
            this.name = str;
            return this;
        }
    }

    public enum DrivetrainType {
        UNKNOWN(-1),
        TWO_WHEEL_DRIVE(0),
        ALL_WHEEL_DRIVE(1);

        private int id;

        DrivetrainType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum DrivingAssistanceControllerType {
        UNKNOWN(-1),
        DAC_J3_DRIVING(1),
        ADD_2_ORIN_DRIVING_PARKING_508TOPS(2),
        ADD_1_ORIN_DRIVING_PARKING_84TOPS(3);

        private int id;

        DrivingAssistanceControllerType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum DrivingMode {
        UNKNOWN(-1),
        NORMAL(0),
        ECONOMICAL(1),
        DEFAULT(2),
        HYBRID_FIRST(3),
        ELECTRIC_FIRST(4),
        DRIVING_CHARGE(5),
        SPORT(6),
        PERFORMANCE(7),
        CUSTOM(8);

        private int id;

        DrivingMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum EnduranceType {
        UNKNOWN(-1),
        COMPREHENSIVE(0),
        TOTAL(1);

        private int id;

        EnduranceType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "ExecuteCameraDirective", namespace = AIApiConstants.AutoController.NAME)
    public static class ExecuteCameraDirective implements InstructionPayload {

        @Required
        private CameraDirective directive;

        @Required
        private String identifier;

        @Required
        private String name;

        public ExecuteCameraDirective() {
        }

        public ExecuteCameraDirective(String str, String str2, CameraDirective cameraDirective) {
            this.name = str;
            this.identifier = str2;
            this.directive = cameraDirective;
        }

        @Required
        public CameraDirective getDirective() {
            return this.directive;
        }

        @Required
        public String getIdentifier() {
            return this.identifier;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public ExecuteCameraDirective setDirective(CameraDirective cameraDirective) {
            this.directive = cameraDirective;
            return this;
        }

        @Required
        public ExecuteCameraDirective setIdentifier(String str) {
            this.identifier = str;
            return this;
        }

        @Required
        public ExecuteCameraDirective setName(String str) {
            this.name = str;
            return this;
        }
    }

    @NamespaceName(name = "ExecuteDRDirective", namespace = AIApiConstants.AutoController.NAME)
    public static class ExecuteDRDirective implements InstructionPayload {

        @Required
        private DRDirective directive;

        public ExecuteDRDirective() {
        }

        public ExecuteDRDirective(DRDirective dRDirective) {
            this.directive = dRDirective;
        }

        @Required
        public DRDirective getDirective() {
            return this.directive;
        }

        @Required
        public ExecuteDRDirective setDirective(DRDirective dRDirective) {
            this.directive = dRDirective;
            return this;
        }
    }

    public static class ExtensionInfo {
        private Optional<Long> car_dial_version = Optional.a();

        public Optional<Long> getCarDialVersion() {
            return this.car_dial_version;
        }

        public ExtensionInfo setCarDialVersion(long j) {
            this.car_dial_version = Optional.e(Long.valueOf(j));
            return this;
        }
    }

    public enum ExteriorColourType {
        UNKNOWN(-1),
        FROZEN_SNOW_WHITE(1),
        SPINEL_BLUE(2),
        WILDERNESS_GREEN(3),
        MORNING_SUNLIGHT(4),
        MOUNTAIN_GRAY(5),
        ASPIRATION_YELLOW(6),
        MINERAL_GRAY(7),
        MYSTERIOUS_FOG(8),
        WATERFALL_BLUE(9),
        MIDNITHT_BLACK(16),
        FLUID_SILVER(17),
        TI_SILVER(18),
        PORCELAIN_GREEN(19),
        SAMURAI_BLACK(20),
        MET_ICDLANDIC_ROCK(21),
        MET_PEARLESCENT_WHITE(22),
        MET_TI_SILVER(23),
        LAVA_RED(24);

        private int id;

        ExteriorColourType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum ExteriorLightState {
        UNKNOWN(-1),
        OFF(0),
        POSITION_LIGHT(1),
        DIPPED_HEADLIGHTS(2),
        AUTO(3);

        private int id;

        ExteriorLightState(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "Fold", namespace = AIApiConstants.AutoController.NAME)
    public static class Fold implements InstructionPayload {

        @Required
        private String identifier;

        @Required
        private String name;

        public Fold() {
        }

        public Fold(String str, String str2) {
            this.name = str;
            this.identifier = str2;
        }

        @Required
        public String getIdentifier() {
            return this.identifier;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public Fold setIdentifier(String str) {
            this.identifier = str;
            return this;
        }

        @Required
        public Fold setName(String str) {
            this.name = str;
            return this;
        }
    }

    public enum FounderEditionNameplate {
        UNKNOWN(-1),
        WITHOUT(1),
        FOUNDER_EDITIOIN_NAMEPLAE_MODENA(2);

        private int id;

        FounderEditionNameplate(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum FragranceType {
        UNKNOWN(-1),
        MIDNIGHT_ORANGE_BLOSSOM(0),
        NOON_LILAC(1),
        MORNING_PINE(2);

        private int id;

        FragranceType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class FreeSpaceState {
        private Optional<Integer> rest_mode_default_time = Optional.a();
        private Optional<Boolean> in_rest_mode_space = Optional.a();

        public Optional<Integer> getRestModeDefaultTime() {
            return this.rest_mode_default_time;
        }

        public Optional<Boolean> isInRestModeSpace() {
            return this.in_rest_mode_space;
        }

        public FreeSpaceState setInRestModeSpace(boolean z) {
            this.in_rest_mode_space = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public FreeSpaceState setRestModeDefaultTime(int i) {
            this.rest_mode_default_time = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    public enum FrontHatchType {
        UNKNOWN(-1),
        MECHANICAL_RELEASE(0),
        POWER_UNLOCK(1),
        POWER_RELEASE(2);

        private int id;

        FrontHatchType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum FrontTyreDimention {
        UNKNOWN(-1),
        R19_245_45(1),
        R20_245_40_SA(2),
        R21_245_35(3),
        R21_265_35_9J(4),
        R21_275_35_10J(5),
        R20_245_50(7),
        R21_245_45(8),
        R19_245_45_LRR(16),
        R21_265_35_9J_LRR(17);

        private int id;

        FrontTyreDimention(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class FunctionConfig {
        private Optional<Boolean> has_suspension = Optional.a();
        private Optional<Boolean> has_refrigerator = Optional.a();
        private Optional<Boolean> has_wiper_heating = Optional.a();
        private Optional<Boolean> has_side_ground_lamp = Optional.a();
        private Optional<Boolean> has_add = Optional.a();
        private Optional<Boolean> has_etc = Optional.a();
        private Optional<SuspensionControlConfig> suspension_config = Optional.a();
        private Optional<Boolean> has_amp = Optional.a();
        private Optional<Boolean> has_adm = Optional.a();
        private Optional<PowerDoorHandlerType> power_door_handler_type = Optional.a();
        private Optional<ExteriorColourType> exterior_colour = Optional.a();
        private Optional<InteriorColourType> interior_colour = Optional.a();
        private Optional<HubStyle> hub_style = Optional.a();
        private Optional<FrontTyreDimention> front_tyre_dimention = Optional.a();
        private Optional<RearTyreDimention> rear_tyre_dimention = Optional.a();
        private Optional<HighVoltageBattery> high_voltage_battery = Optional.a();
        private Optional<FounderEditionNameplate> founder_edition_nameplate = Optional.a();
        private Optional<OutsideRearViewMirrorMaterials> outside_rear_view_mirror_materials = Optional.a();
        private Optional<Boolean> has_outside_rear_view_mirror_anti_glare = Optional.a();
        private Optional<InsideRearViewMirrorAntiGlareType> inside_rear_view_mirror_anti_glare_type = Optional.a();
        private Optional<FrontHatchType> front_hatch_type = Optional.a();
        private Optional<Boolean> has_auto_level_head_lamp = Optional.a();
        private Optional<Boolean> has_driver_wireless_power_charging = Optional.a();
        private Optional<Boolean> has_passenger_wireless_power_charging = Optional.a();
        private Optional<BrakeDiscType> front_brake_type = Optional.a();
        private Optional<BrakeDiscType> back_brake_type = Optional.a();
        private Optional<Boolean> has_roof_rack_power_switch = Optional.a();
        private Optional<Boolean> has_dimming_roof = Optional.a();
        private Optional<Boolean> has_electrical_storage_box = Optional.a();

        public Optional<BrakeDiscType> getBackBrakeType() {
            return this.back_brake_type;
        }

        public Optional<ExteriorColourType> getExteriorColour() {
            return this.exterior_colour;
        }

        public Optional<FounderEditionNameplate> getFounderEditionNameplate() {
            return this.founder_edition_nameplate;
        }

        public Optional<BrakeDiscType> getFrontBrakeType() {
            return this.front_brake_type;
        }

        public Optional<FrontHatchType> getFrontHatchType() {
            return this.front_hatch_type;
        }

        public Optional<FrontTyreDimention> getFrontTyreDimention() {
            return this.front_tyre_dimention;
        }

        public Optional<HighVoltageBattery> getHighVoltageBattery() {
            return this.high_voltage_battery;
        }

        public Optional<HubStyle> getHubStyle() {
            return this.hub_style;
        }

        public Optional<InsideRearViewMirrorAntiGlareType> getInsideRearViewMirrorAntiGlareType() {
            return this.inside_rear_view_mirror_anti_glare_type;
        }

        public Optional<InteriorColourType> getInteriorColour() {
            return this.interior_colour;
        }

        public Optional<OutsideRearViewMirrorMaterials> getOutsideRearViewMirrorMaterials() {
            return this.outside_rear_view_mirror_materials;
        }

        public Optional<PowerDoorHandlerType> getPowerDoorHandlerType() {
            return this.power_door_handler_type;
        }

        public Optional<RearTyreDimention> getRearTyreDimention() {
            return this.rear_tyre_dimention;
        }

        public Optional<SuspensionControlConfig> getSuspensionConfig() {
            return this.suspension_config;
        }

        public Optional<Boolean> isHasAdd() {
            return this.has_add;
        }

        public Optional<Boolean> isHasAdm() {
            return this.has_adm;
        }

        public Optional<Boolean> isHasAmp() {
            return this.has_amp;
        }

        public Optional<Boolean> isHasAutoLevelHeadLamp() {
            return this.has_auto_level_head_lamp;
        }

        public Optional<Boolean> isHasDimmingRoof() {
            return this.has_dimming_roof;
        }

        public Optional<Boolean> isHasDriverWirelessPowerCharging() {
            return this.has_driver_wireless_power_charging;
        }

        public Optional<Boolean> isHasElectricalStorageBox() {
            return this.has_electrical_storage_box;
        }

        public Optional<Boolean> isHasEtc() {
            return this.has_etc;
        }

        public Optional<Boolean> isHasOutsideRearViewMirrorAntiGlare() {
            return this.has_outside_rear_view_mirror_anti_glare;
        }

        public Optional<Boolean> isHasPassengerWirelessPowerCharging() {
            return this.has_passenger_wireless_power_charging;
        }

        public Optional<Boolean> isHasRefrigerator() {
            return this.has_refrigerator;
        }

        public Optional<Boolean> isHasRoofRackPowerSwitch() {
            return this.has_roof_rack_power_switch;
        }

        public Optional<Boolean> isHasSideGroundLamp() {
            return this.has_side_ground_lamp;
        }

        public Optional<Boolean> isHasSuspension() {
            return this.has_suspension;
        }

        public Optional<Boolean> isHasWiperHeating() {
            return this.has_wiper_heating;
        }

        public FunctionConfig setBackBrakeType(BrakeDiscType brakeDiscType) {
            this.back_brake_type = Optional.e(brakeDiscType);
            return this;
        }

        public FunctionConfig setExteriorColour(ExteriorColourType exteriorColourType) {
            this.exterior_colour = Optional.e(exteriorColourType);
            return this;
        }

        public FunctionConfig setFounderEditionNameplate(FounderEditionNameplate founderEditionNameplate) {
            this.founder_edition_nameplate = Optional.e(founderEditionNameplate);
            return this;
        }

        public FunctionConfig setFrontBrakeType(BrakeDiscType brakeDiscType) {
            this.front_brake_type = Optional.e(brakeDiscType);
            return this;
        }

        public FunctionConfig setFrontHatchType(FrontHatchType frontHatchType) {
            this.front_hatch_type = Optional.e(frontHatchType);
            return this;
        }

        public FunctionConfig setFrontTyreDimention(FrontTyreDimention frontTyreDimention) {
            this.front_tyre_dimention = Optional.e(frontTyreDimention);
            return this;
        }

        public FunctionConfig setHasAdd(boolean z) {
            this.has_add = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public FunctionConfig setHasAdm(boolean z) {
            this.has_adm = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public FunctionConfig setHasAmp(boolean z) {
            this.has_amp = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public FunctionConfig setHasAutoLevelHeadLamp(boolean z) {
            this.has_auto_level_head_lamp = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public FunctionConfig setHasDimmingRoof(boolean z) {
            this.has_dimming_roof = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public FunctionConfig setHasDriverWirelessPowerCharging(boolean z) {
            this.has_driver_wireless_power_charging = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public FunctionConfig setHasElectricalStorageBox(boolean z) {
            this.has_electrical_storage_box = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public FunctionConfig setHasEtc(boolean z) {
            this.has_etc = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public FunctionConfig setHasOutsideRearViewMirrorAntiGlare(boolean z) {
            this.has_outside_rear_view_mirror_anti_glare = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public FunctionConfig setHasPassengerWirelessPowerCharging(boolean z) {
            this.has_passenger_wireless_power_charging = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public FunctionConfig setHasRefrigerator(boolean z) {
            this.has_refrigerator = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public FunctionConfig setHasRoofRackPowerSwitch(boolean z) {
            this.has_roof_rack_power_switch = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public FunctionConfig setHasSideGroundLamp(boolean z) {
            this.has_side_ground_lamp = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public FunctionConfig setHasSuspension(boolean z) {
            this.has_suspension = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public FunctionConfig setHasWiperHeating(boolean z) {
            this.has_wiper_heating = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public FunctionConfig setHighVoltageBattery(HighVoltageBattery highVoltageBattery) {
            this.high_voltage_battery = Optional.e(highVoltageBattery);
            return this;
        }

        public FunctionConfig setHubStyle(HubStyle hubStyle) {
            this.hub_style = Optional.e(hubStyle);
            return this;
        }

        public FunctionConfig setInsideRearViewMirrorAntiGlareType(InsideRearViewMirrorAntiGlareType insideRearViewMirrorAntiGlareType) {
            this.inside_rear_view_mirror_anti_glare_type = Optional.e(insideRearViewMirrorAntiGlareType);
            return this;
        }

        public FunctionConfig setInteriorColour(InteriorColourType interiorColourType) {
            this.interior_colour = Optional.e(interiorColourType);
            return this;
        }

        public FunctionConfig setOutsideRearViewMirrorMaterials(OutsideRearViewMirrorMaterials outsideRearViewMirrorMaterials) {
            this.outside_rear_view_mirror_materials = Optional.e(outsideRearViewMirrorMaterials);
            return this;
        }

        public FunctionConfig setPowerDoorHandlerType(PowerDoorHandlerType powerDoorHandlerType) {
            this.power_door_handler_type = Optional.e(powerDoorHandlerType);
            return this;
        }

        public FunctionConfig setRearTyreDimention(RearTyreDimention rearTyreDimention) {
            this.rear_tyre_dimention = Optional.e(rearTyreDimention);
            return this;
        }

        public FunctionConfig setSuspensionConfig(SuspensionControlConfig suspensionControlConfig) {
            this.suspension_config = Optional.e(suspensionControlConfig);
            return this;
        }
    }

    public static class HUDConfig {
        private Optional<HUDType> hud_type = Optional.a();

        public Optional<HUDType> getHudType() {
            return this.hud_type;
        }

        public HUDConfig setHudType(HUDType hUDType) {
            this.hud_type = Optional.e(hUDType);
            return this;
        }
    }

    public enum HUDMode {
        UNKNOWN(-1),
        STANDARD(0),
        MAXIMALISM(1),
        MINIMALISM(2);

        private int id;

        HUDMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum HUDType {
        UNKNOWN(-1),
        WITHOUT(0),
        WHUD_CLUSTERINFO_NAVI_ADAS(1),
        ARHUD_CLUSTERINFO_AR_NAVI_ARADAS(2);

        private int id;

        HUDType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum HVACType {
        UNKNOWN(-1),
        ZONE_2(0),
        ZONE_3(1),
        ZONE_4(2);

        private int id;

        HVACType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum HeadrestMode {
        Unknown(-1),
        FOCUS(0),
        PRIVATE(1);

        private int id;

        HeadrestMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum HighVoltageBattery {
        UNKNOWN(-1),
        V400(1),
        V800(2);

        private int id;

        HighVoltageBattery(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "HomeDeviceState", namespace = AIApiConstants.AutoController.NAME)
    public static class HomeDeviceState implements EventPayload {
        private Optional<DeviceClickType> click_type = Optional.a();
        private Optional<List<String>> home_list = Optional.a();
        private Optional<List<String>> device_list = Optional.a();

        public Optional<DeviceClickType> getClickType() {
            return this.click_type;
        }

        public Optional<List<String>> getDeviceList() {
            return this.device_list;
        }

        public Optional<List<String>> getHomeList() {
            return this.home_list;
        }

        public HomeDeviceState setClickType(DeviceClickType deviceClickType) {
            this.click_type = Optional.e(deviceClickType);
            return this;
        }

        public HomeDeviceState setDeviceList(List<String> list) {
            this.device_list = Optional.e(list);
            return this;
        }

        public HomeDeviceState setHomeList(List<String> list) {
            this.home_list = Optional.e(list);
            return this;
        }
    }

    public enum HubStyle {
        UNKNOWN(-1),
        INCH_19_AERO_DYNAMIC(1),
        INCH_20_SPORTS(2),
        INCH_21_SPORTS_MS11(3),
        INCH_19_SPORTS(4),
        INCH_21_SPORTS(5),
        INCH_21_RACE(6),
        INCH_20_AERO_DYNAMIC_LEMANS(7),
        INCH_20_SPORTS_LEMANS(8),
        INCH_21_SPORTS_LEMANS(9),
        INCH_20_TAILORED_STYLE_A_1(16),
        INCH_20_TAILORED_STYLE_A_2(17),
        INCH_20_TAILORED_STYLE_A_3(18),
        INCH_21_TAILORED_STYLE_B_1(19),
        INCH_21_TAILORED_STYLE_B_2(20),
        INCH_21_TAILORED_STYLE_B_3(21);

        private int id;

        HubStyle(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum InsideRearViewMirrorAntiGlareType {
        UNKNOWN(-1),
        NORMAL(0),
        SINGLE_STAGE(1),
        MULTI_STAGE(2);

        private int id;

        InsideRearViewMirrorAntiGlareType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class IntelligentDrivingConfig {
        private Optional<DrivingAssistanceControllerType> driving_assistance_controller_type = Optional.a();
        private Optional<Boolean> has_hnoa = Optional.a();
        private Optional<Boolean> has_cnoa = Optional.a();
        private Optional<Boolean> has_hpp = Optional.a();
        private Optional<Boolean> has_avp = Optional.a();
        private Optional<Boolean> has_rctb = Optional.a();

        public Optional<DrivingAssistanceControllerType> getDrivingAssistanceControllerType() {
            return this.driving_assistance_controller_type;
        }

        public Optional<Boolean> isHasAvp() {
            return this.has_avp;
        }

        public Optional<Boolean> isHasCnoa() {
            return this.has_cnoa;
        }

        public Optional<Boolean> isHasHnoa() {
            return this.has_hnoa;
        }

        public Optional<Boolean> isHasHpp() {
            return this.has_hpp;
        }

        public Optional<Boolean> isHasRctb() {
            return this.has_rctb;
        }

        public IntelligentDrivingConfig setDrivingAssistanceControllerType(DrivingAssistanceControllerType drivingAssistanceControllerType) {
            this.driving_assistance_controller_type = Optional.e(drivingAssistanceControllerType);
            return this;
        }

        public IntelligentDrivingConfig setHasAvp(boolean z) {
            this.has_avp = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public IntelligentDrivingConfig setHasCnoa(boolean z) {
            this.has_cnoa = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public IntelligentDrivingConfig setHasHnoa(boolean z) {
            this.has_hnoa = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public IntelligentDrivingConfig setHasHpp(boolean z) {
            this.has_hpp = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public IntelligentDrivingConfig setHasRctb(boolean z) {
            this.has_rctb = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    public enum InteriorColourType {
        UNKNOWN(-1),
        GREEN(1),
        MILKY_WAY_SILVER(2),
        ROCKY_BROWN(3),
        TWINLIGHT_RED(4),
        STORMING_YELLOW(5),
        PYROLITE_BLACK(6),
        GLACIER_BLUE(7),
        NEBULA_PURPLE(8),
        SILVER_OBSIDIAN(9),
        TURQUOISE_GREEN(16),
        TYRIAN_PURPLE(17),
        APRICOT_YELLOW(18);

        private int id;

        InteriorColourType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum LevelType {
        UNKNOWN(-1),
        HIGH(0),
        MIDDLE(1),
        LOW(2);

        private int id;

        LevelType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum LocationShareState {
        UNKNOWN(-1),
        DISABLED(0),
        ENABLING(1),
        ENABLED(2),
        DISABLING(3);

        private int id;

        LocationShareState(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum OutsideRearViewMirrorMaterials {
        UNKNOWN(-1),
        PLASTIC(1),
        CARBON_FIBER(2);

        private int id;

        OutsideRearViewMirrorMaterials(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum Position {
        UNKNOWN(-1),
        DRIVER(0),
        PASSENGER(1),
        FRONT(2),
        REAR(3),
        WHOLE(4),
        LEFT_SEAT_OF_SECOND_ROW(5),
        RIGHT_SEAT_OF_SECOND_ROW(6),
        FRONT_LEFT(7),
        FRONT_RIGHT(8),
        REAR_LEFT(9),
        REAR_RIGHT(10),
        LEFT_WINDOW(11),
        RIGHT_WINDOW(12),
        REAR_MIDDLE(13),
        ROW_2_LEFT(14),
        ROW_2_CENTER(15),
        ROW_2_RIGHT(16);

        private int id;

        Position(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class PowerConfig {
        private Optional<DrivetrainType> drivetrain = Optional.a();
        private Optional<Boolean> is_with_trail_mode = Optional.a();

        public Optional<DrivetrainType> getDrivetrain() {
            return this.drivetrain;
        }

        public Optional<Boolean> isWithTrailMode() {
            return this.is_with_trail_mode;
        }

        public PowerConfig setDrivetrain(DrivetrainType drivetrainType) {
            this.drivetrain = Optional.e(drivetrainType);
            return this;
        }

        public PowerConfig setIsWithTrailMode(boolean z) {
            this.is_with_trail_mode = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    public enum PowerDoorHandlerType {
        UNKNOWN(-1),
        WITHOUT_POWER_DOOR_HANDLE(0),
        FOUR_POWER_DOOR_HANDLE(1);

        private int id;

        PowerDoorHandlerType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "QueryAirCleaner", namespace = AIApiConstants.AutoController.NAME)
    public static class QueryAirCleaner implements InstructionPayload {
    }

    @NamespaceName(name = "QueryEndurance", namespace = AIApiConstants.AutoController.NAME)
    @Deprecated
    public static class QueryEndurance implements InstructionPayload {

        @Required
        private EnduranceType type;

        public QueryEndurance() {
        }

        public QueryEndurance(EnduranceType enduranceType) {
            this.type = enduranceType;
        }

        @Required
        public EnduranceType getType() {
            return this.type;
        }

        @Required
        public QueryEndurance setType(EnduranceType enduranceType) {
            this.type = enduranceType;
            return this;
        }
    }

    @NamespaceName(name = "QueryVehicleCondition", namespace = AIApiConstants.AutoController.NAME)
    public static class QueryVehicleCondition implements InstructionPayload {

        @Required
        private VehicleConditionType type;

        public QueryVehicleCondition() {
        }

        public QueryVehicleCondition(VehicleConditionType vehicleConditionType) {
            this.type = vehicleConditionType;
        }

        @Required
        public VehicleConditionType getType() {
            return this.type;
        }

        @Required
        public QueryVehicleCondition setType(VehicleConditionType vehicleConditionType) {
            this.type = vehicleConditionType;
            return this;
        }
    }

    public static class RadarConfig {
        private Optional<Boolean> has_front = Optional.a();
        private Optional<Boolean> has_left = Optional.a();
        private Optional<Boolean> has_right = Optional.a();

        public Optional<Boolean> isHasFront() {
            return this.has_front;
        }

        public Optional<Boolean> isHasLeft() {
            return this.has_left;
        }

        public Optional<Boolean> isHasRight() {
            return this.has_right;
        }

        public RadarConfig setHasFront(boolean z) {
            this.has_front = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public RadarConfig setHasLeft(boolean z) {
            this.has_left = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public RadarConfig setHasRight(boolean z) {
            this.has_right = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    public enum RearBackrestType {
        UNKNOWN(-1),
        FIXED(0),
        POWER_FOLD(1),
        POWER_FOLD_AND_POWER_LIFT(2),
        MANUAL_FOLD_AND_MANUAL_LIFT(3),
        POWER_FOLD_AND_LIFT_WITH_ANGLE_ADJUSTMENT(4);

        private int id;

        RearBackrestType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum RearTyreDimention {
        UNKNOWN(-1),
        R19_245_45(1),
        R20_265_40_SA(2),
        R21_265_35(3),
        R19_265_45(4),
        R20_245_40_SA(5),
        R21_305_30_10_5J(6),
        R21_315_30_11_5J(7),
        R20_245_50(8),
        R21_275_40(9),
        R19_245_45_LRR(16),
        R21_305_30_10_5J_LRR(17);

        private int id;

        RearTyreDimention(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "RotateScreen", namespace = AIApiConstants.AutoController.NAME)
    public static class RotateScreen implements InstructionPayload {
    }

    public enum ScreenMode {
        UNKNOWN(-1),
        LANDSCAPE(0),
        PORTRAIT(1),
        CINEMA(2);

        private int id;

        ScreenMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class SeatConfig {
        private Optional<List<Position>> position_of_heating = Optional.a();
        private Optional<List<Position>> position_of_ventilation = Optional.a();
        private Optional<List<Position>> position_of_lumbar_support = Optional.a();
        private Optional<List<Position>> position_of_side_support = Optional.a();
        private Optional<List<Position>> position_of_massage = Optional.a();
        private Optional<List<Position>> position_of_calf_rest = Optional.a();
        private Optional<List<Position>> position_of_0_G = Optional.a();
        private Optional<RearBackrestType> rear_backrest_config = Optional.a();

        public Optional<List<Position>> getPositionOf0G() {
            return this.position_of_0_G;
        }

        public Optional<List<Position>> getPositionOfCalfRest() {
            return this.position_of_calf_rest;
        }

        public Optional<List<Position>> getPositionOfHeating() {
            return this.position_of_heating;
        }

        public Optional<List<Position>> getPositionOfLumbarSupport() {
            return this.position_of_lumbar_support;
        }

        public Optional<List<Position>> getPositionOfMassage() {
            return this.position_of_massage;
        }

        public Optional<List<Position>> getPositionOfSideSupport() {
            return this.position_of_side_support;
        }

        public Optional<List<Position>> getPositionOfVentilation() {
            return this.position_of_ventilation;
        }

        public Optional<RearBackrestType> getRearBackrestConfig() {
            return this.rear_backrest_config;
        }

        public SeatConfig setPositionOf0G(List<Position> list) {
            this.position_of_0_G = Optional.e(list);
            return this;
        }

        public SeatConfig setPositionOfCalfRest(List<Position> list) {
            this.position_of_calf_rest = Optional.e(list);
            return this;
        }

        public SeatConfig setPositionOfHeating(List<Position> list) {
            this.position_of_heating = Optional.e(list);
            return this;
        }

        public SeatConfig setPositionOfLumbarSupport(List<Position> list) {
            this.position_of_lumbar_support = Optional.e(list);
            return this;
        }

        public SeatConfig setPositionOfMassage(List<Position> list) {
            this.position_of_massage = Optional.e(list);
            return this;
        }

        public SeatConfig setPositionOfSideSupport(List<Position> list) {
            this.position_of_side_support = Optional.e(list);
            return this;
        }

        public SeatConfig setPositionOfVentilation(List<Position> list) {
            this.position_of_ventilation = Optional.e(list);
            return this;
        }

        public SeatConfig setRearBackrestConfig(RearBackrestType rearBackrestType) {
            this.rear_backrest_config = Optional.e(rearBackrestType);
            return this;
        }
    }

    public enum SeatMemoryPosition {
        UNKNOWN(-1),
        MEMORY_POSITION_1(0),
        MEMORY_POSITION_2(1),
        MEMORY_POSITION_3(2);

        private int id;

        SeatMemoryPosition(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SeatMode {
        UNKNOWN(-1),
        DEFAULT(0);

        private int id;

        SeatMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SeatUnit {
        UNKNOWN(-1),
        BACK(0),
        LUMBAR(1),
        FRONT_BACK(2);

        private int id;

        SeatUnit(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SecondRowAirOutletType {
        UNKNOWN(-1),
        WITHOUT_SECOND_ROW_AIR_OUTLET(0),
        MANUAL_SECOND_ROW_AIR_OUTLET(1),
        ELECTRICAL_SECOND_ROW_AIR_OUTLET(2);

        private int id;

        SecondRowAirOutletType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "SetACTemperature", namespace = AIApiConstants.AutoController.NAME)
    @Deprecated
    public static class SetACTemperature implements InstructionPayload {
        private Optional<Position> position = Optional.a();

        @Deprecated
        private Optional<Integer> value = Optional.a();
        private Optional<Float> decimal_value = Optional.a();

        public Optional<Float> getDecimalValue() {
            return this.decimal_value;
        }

        public Optional<Position> getPosition() {
            return this.position;
        }

        @Deprecated
        public Optional<Integer> getValue() {
            return this.value;
        }

        public SetACTemperature setDecimalValue(float f) {
            this.decimal_value = Optional.e(Float.valueOf(f));
            return this;
        }

        public SetACTemperature setPosition(Position position) {
            this.position = Optional.e(position);
            return this;
        }

        @Deprecated
        public SetACTemperature setValue(int i) {
            this.value = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "SetACWindSpeed", namespace = AIApiConstants.AutoController.NAME)
    @Deprecated
    public static class SetACWindSpeed implements InstructionPayload {
        private Optional<Position> position = Optional.a();
        private Optional<Integer> value = Optional.a();

        public Optional<Position> getPosition() {
            return this.position;
        }

        public Optional<Integer> getValue() {
            return this.value;
        }

        public SetACWindSpeed setPosition(Position position) {
            this.position = Optional.e(position);
            return this;
        }

        public SetACWindSpeed setValue(int i) {
            this.value = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "SetAirCleanerMode", namespace = AIApiConstants.AutoController.NAME)
    public static class SetAirCleanerMode implements InstructionPayload {

        @Required
        private AirCleanerMode mode;

        public SetAirCleanerMode() {
        }

        public SetAirCleanerMode(AirCleanerMode airCleanerMode) {
            this.mode = airCleanerMode;
        }

        @Required
        public AirCleanerMode getMode() {
            return this.mode;
        }

        @Required
        public SetAirCleanerMode setMode(AirCleanerMode airCleanerMode) {
            this.mode = airCleanerMode;
            return this;
        }
    }

    @NamespaceName(name = "SetAutoProperty", namespace = AIApiConstants.AutoController.NAME)
    public static class SetAutoProperty implements InstructionPayload {
        private Optional<SwitchProperty> switch_property = Optional.a();
        private Optional<TabProperty> tab_property = Optional.a();

        public Optional<SwitchProperty> getSwitchProperty() {
            return this.switch_property;
        }

        public Optional<TabProperty> getTabProperty() {
            return this.tab_property;
        }

        public SetAutoProperty setSwitchProperty(SwitchProperty switchProperty) {
            this.switch_property = Optional.e(switchProperty);
            return this;
        }

        public SetAutoProperty setTabProperty(TabProperty tabProperty) {
            this.tab_property = Optional.e(tabProperty);
            return this;
        }
    }

    @NamespaceName(name = "SetColor", namespace = AIApiConstants.AutoController.NAME)
    public static class SetColor implements InstructionPayload {

        @Required
        private String identifier;

        @Required
        private String name;

        @Required
        private String value;

        public SetColor() {
        }

        public SetColor(String str, String str2, String str3) {
            this.name = str;
            this.identifier = str2;
            this.value = str3;
        }

        @Required
        public String getIdentifier() {
            return this.identifier;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public String getValue() {
            return this.value;
        }

        @Required
        public SetColor setIdentifier(String str) {
            this.identifier = str;
            return this;
        }

        @Required
        public SetColor setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public SetColor setValue(String str) {
            this.value = str;
            return this;
        }
    }

    @NamespaceName(name = "SetDrivingMode", namespace = AIApiConstants.AutoController.NAME)
    public static class SetDrivingMode implements InstructionPayload {

        @Required
        private DrivingMode mode;

        public SetDrivingMode() {
        }

        public SetDrivingMode(DrivingMode drivingMode) {
            this.mode = drivingMode;
        }

        @Required
        public DrivingMode getMode() {
            return this.mode;
        }

        @Required
        public SetDrivingMode setMode(DrivingMode drivingMode) {
            this.mode = drivingMode;
            return this;
        }
    }

    @NamespaceName(name = "SetEnergyRecoveryLevel", namespace = AIApiConstants.AutoController.NAME)
    public static class SetEnergyRecoveryLevel implements InstructionPayload {

        @Required
        private String level;

        public SetEnergyRecoveryLevel() {
        }

        public SetEnergyRecoveryLevel(String str) {
            this.level = str;
        }

        @Required
        public String getLevel() {
            return this.level;
        }

        @Required
        public SetEnergyRecoveryLevel setLevel(String str) {
            this.level = str;
            return this;
        }
    }

    @NamespaceName(name = "SetHeight", namespace = AIApiConstants.AutoController.NAME)
    public static class SetHeight implements InstructionPayload {

        @Required
        private String identifier;

        @Required
        private String name;

        @Required
        private int value;

        public SetHeight() {
        }

        public SetHeight(String str, String str2, int i) {
            this.name = str;
            this.identifier = str2;
            this.value = i;
        }

        @Required
        public String getIdentifier() {
            return this.identifier;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public int getValue() {
            return this.value;
        }

        @Required
        public SetHeight setIdentifier(String str) {
            this.identifier = str;
            return this;
        }

        @Required
        public SetHeight setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public SetHeight setValue(int i) {
            this.value = i;
            return this;
        }
    }

    @NamespaceName(name = "SetScreenMode", namespace = AIApiConstants.AutoController.NAME)
    public static class SetScreenMode implements InstructionPayload {

        @Required
        private ScreenMode mode;

        public SetScreenMode() {
        }

        public SetScreenMode(ScreenMode screenMode) {
            this.mode = screenMode;
        }

        @Required
        public ScreenMode getMode() {
            return this.mode;
        }

        @Required
        public SetScreenMode setMode(ScreenMode screenMode) {
            this.mode = screenMode;
            return this;
        }
    }

    @NamespaceName(name = "SetSeat", namespace = AIApiConstants.AutoController.NAME)
    @Deprecated
    public static class SetSeat implements InstructionPayload {

        @Required
        private Position position;

        @Required
        private SeatUnit unit;

        @Required
        private int value;

        public SetSeat() {
        }

        public SetSeat(Position position, SeatUnit seatUnit, int i) {
            this.position = position;
            this.unit = seatUnit;
            this.value = i;
        }

        @Required
        public Position getPosition() {
            return this.position;
        }

        @Required
        public SeatUnit getUnit() {
            return this.unit;
        }

        @Required
        public int getValue() {
            return this.value;
        }

        @Required
        public SetSeat setPosition(Position position) {
            this.position = position;
            return this;
        }

        @Required
        public SetSeat setUnit(SeatUnit seatUnit) {
            this.unit = seatUnit;
            return this;
        }

        @Required
        public SetSeat setValue(int i) {
            this.value = i;
            return this;
        }
    }

    @NamespaceName(name = "SetSeatTemperature", namespace = AIApiConstants.AutoController.NAME)
    @Deprecated
    public static class SetSeatTemperature implements InstructionPayload {
        private Optional<Position> position = Optional.a();

        @Deprecated
        private Optional<Integer> value = Optional.a();
        private Optional<Float> decimal_value = Optional.a();
        private Optional<LevelType> level = Optional.a();

        public Optional<Float> getDecimalValue() {
            return this.decimal_value;
        }

        public Optional<LevelType> getLevel() {
            return this.level;
        }

        public Optional<Position> getPosition() {
            return this.position;
        }

        @Deprecated
        public Optional<Integer> getValue() {
            return this.value;
        }

        public SetSeatTemperature setDecimalValue(float f) {
            this.decimal_value = Optional.e(Float.valueOf(f));
            return this;
        }

        public SetSeatTemperature setLevel(LevelType levelType) {
            this.level = Optional.e(levelType);
            return this;
        }

        public SetSeatTemperature setPosition(Position position) {
            this.position = Optional.e(position);
            return this;
        }

        @Deprecated
        public SetSeatTemperature setValue(int i) {
            this.value = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "SetSeatWindSpeed", namespace = AIApiConstants.AutoController.NAME)
    @Deprecated
    public static class SetSeatWindSpeed implements InstructionPayload {
        private Optional<Position> position = Optional.a();
        private Optional<Integer> value = Optional.a();

        public Optional<Position> getPosition() {
            return this.position;
        }

        public Optional<Integer> getValue() {
            return this.value;
        }

        public SetSeatWindSpeed setPosition(Position position) {
            this.position = Optional.e(position);
            return this;
        }

        public SetSeatWindSpeed setValue(int i) {
            this.value = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "SetSteeringMode", namespace = AIApiConstants.AutoController.NAME)
    public static class SetSteeringMode implements InstructionPayload {

        @Required
        private String mode;

        public SetSteeringMode() {
        }

        public SetSteeringMode(String str) {
            this.mode = str;
        }

        @Required
        public String getMode() {
            return this.mode;
        }

        @Required
        public SetSteeringMode setMode(String str) {
            this.mode = str;
            return this;
        }
    }

    @NamespaceName(name = "SetSunroofStepless", namespace = AIApiConstants.AutoController.NAME)
    public static class SetSunroofStepless implements InstructionPayload {

        @Required
        private int value;

        public SetSunroofStepless() {
        }

        public SetSunroofStepless(int i) {
            this.value = i;
        }

        @Required
        public int getValue() {
            return this.value;
        }

        @Required
        public SetSunroofStepless setValue(int i) {
            this.value = i;
            return this;
        }
    }

    @NamespaceName(name = "SetSunshade", namespace = AIApiConstants.AutoController.NAME)
    public static class SetSunshade implements InstructionPayload {

        @Required
        private int value;

        public SetSunshade() {
        }

        public SetSunshade(int i) {
            this.value = i;
        }

        @Required
        public int getValue() {
            return this.value;
        }

        @Required
        public SetSunshade setValue(int i) {
            this.value = i;
            return this;
        }
    }

    public enum SignalStatus {
        UNKNOWN(-1),
        SUC(0),
        QUERY_CONFIGURE_WORD_FAIL(1),
        DISABLED_CONFIGURE_VALUE(2),
        QUERY_VALUE_FAIL(3),
        QUERY_VALUE_ERR_STATUS(4),
        QUERY_UNIT_FAIL(5),
        QUERY_EXCEPTION_FAIL(6);

        private int id;

        SignalStatus(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SignalValueType {
        UNKNOWN(-1),
        INT(0),
        FLOAT(1),
        BYTE(2),
        STRING(3),
        INT_LIST(4),
        FLOAT_LIST(5),
        BYTE_LIST(6),
        STRING_LIST(7);

        private int id;

        SignalValueType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class SignalWithUnit {
        private Optional<SignalStatus> status = Optional.a();
        private Optional<Signal> configure_signal = Optional.a();
        private Optional<Signal> signal = Optional.a();
        private Optional<Signal> unit = Optional.a();
        private Optional<Signal> exception = Optional.a();
        private Optional<String> name = Optional.a();
        private Optional<String> category = Optional.a();
        private Optional<String> signal_id = Optional.a();

        public Optional<String> getCategory() {
            return this.category;
        }

        public Optional<Signal> getConfigureSignal() {
            return this.configure_signal;
        }

        public Optional<Signal> getException() {
            return this.exception;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<Signal> getSignal() {
            return this.signal;
        }

        public Optional<String> getSignalId() {
            return this.signal_id;
        }

        public Optional<SignalStatus> getStatus() {
            return this.status;
        }

        public Optional<Signal> getUnit() {
            return this.unit;
        }

        public SignalWithUnit setCategory(String str) {
            this.category = Optional.e(str);
            return this;
        }

        public SignalWithUnit setConfigureSignal(Signal signal) {
            this.configure_signal = Optional.e(signal);
            return this;
        }

        public SignalWithUnit setException(Signal signal) {
            this.exception = Optional.e(signal);
            return this;
        }

        public SignalWithUnit setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public SignalWithUnit setSignal(Signal signal) {
            this.signal = Optional.e(signal);
            return this;
        }

        public SignalWithUnit setSignalId(String str) {
            this.signal_id = Optional.e(str);
            return this;
        }

        public SignalWithUnit setStatus(SignalStatus signalStatus) {
            this.status = Optional.e(signalStatus);
            return this;
        }

        public SignalWithUnit setUnit(Signal signal) {
            this.unit = Optional.e(signal);
            return this;
        }
    }

    public static class SlotDescription {

        @Required
        private String slot_name;

        @Required
        private String slot_value;

        public SlotDescription() {
        }

        public SlotDescription(String str, String str2) {
            this.slot_name = str;
            this.slot_value = str2;
        }

        @Required
        public String getSlotName() {
            return this.slot_name;
        }

        @Required
        public String getSlotValue() {
            return this.slot_value;
        }

        @Required
        public SlotDescription setSlotName(String str) {
            this.slot_name = str;
            return this;
        }

        @Required
        public SlotDescription setSlotValue(String str) {
            this.slot_value = str;
            return this;
        }
    }

    public enum SoundEffect {
        Unknown(-1),
        DEFAULT(0),
        OPERA(1),
        HALL(2),
        EXCLUSIVE(3),
        SOUND_OF_VIDEO(4),
        SOUND_OF_MUSIC(5);

        private int id;

        SoundEffect(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class SoundEffectStatus {

        @Required
        private SoundEffect current;

        @Required
        private List<SoundEffect> support;

        public SoundEffectStatus() {
        }

        public SoundEffectStatus(SoundEffect soundEffect, List<SoundEffect> list) {
            this.current = soundEffect;
            this.support = list;
        }

        @Required
        public SoundEffect getCurrent() {
            return this.current;
        }

        @Required
        public List<SoundEffect> getSupport() {
            return this.support;
        }

        @Required
        public SoundEffectStatus setCurrent(SoundEffect soundEffect) {
            this.current = soundEffect;
            return this;
        }

        @Required
        public SoundEffectStatus setSupport(List<SoundEffect> list) {
            this.support = list;
            return this;
        }
    }

    public enum SoundField {
        Unknown(-1),
        WHOLE(0),
        FRONT_ROW(1),
        BACK_ROW(2),
        DRIVER(3),
        CUSTOM(4);

        private int id;

        SoundField(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class SteeringWheelConfig {
        private Optional<Boolean> has_heating = Optional.a();
        private Optional<Position> position = Optional.a();
        private Optional<ColumnAdjustType> adjust_type = Optional.a();

        public Optional<ColumnAdjustType> getAdjustType() {
            return this.adjust_type;
        }

        public Optional<Position> getPosition() {
            return this.position;
        }

        public Optional<Boolean> isHasHeating() {
            return this.has_heating;
        }

        public SteeringWheelConfig setAdjustType(ColumnAdjustType columnAdjustType) {
            this.adjust_type = Optional.e(columnAdjustType);
            return this;
        }

        public SteeringWheelConfig setHasHeating(boolean z) {
            this.has_heating = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public SteeringWheelConfig setPosition(Position position) {
            this.position = Optional.e(position);
            return this;
        }
    }

    public enum SuspensionControlConfig {
        UNKNOWN(-1),
        WITHOUT_AIR_SUSPENSION_CONTROL(0),
        AIR_SUSPENSION_CONTROL_4_GEAR(1),
        AIR_SUSPENSION_CONTROL_5_GEAR(2);

        private int id;

        SuspensionControlConfig(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "SwitchACMode", namespace = AIApiConstants.AutoController.NAME)
    @Deprecated
    public static class SwitchACMode implements InstructionPayload {

        @Required
        private ACGeneralMode general_mode;

        public SwitchACMode() {
        }

        public SwitchACMode(ACGeneralMode aCGeneralMode) {
            this.general_mode = aCGeneralMode;
        }

        @Required
        public ACGeneralMode getGeneralMode() {
            return this.general_mode;
        }

        @Required
        public SwitchACMode setGeneralMode(ACGeneralMode aCGeneralMode) {
            this.general_mode = aCGeneralMode;
            return this;
        }
    }

    public static class SwitchProperty {

        @Required
        private AutoPropertyName name;

        @Required
        private AutoPropertyState state;

        public SwitchProperty() {
        }

        public SwitchProperty(AutoPropertyName autoPropertyName, AutoPropertyState autoPropertyState) {
            this.name = autoPropertyName;
            this.state = autoPropertyState;
        }

        @Required
        public AutoPropertyName getName() {
            return this.name;
        }

        @Required
        public AutoPropertyState getState() {
            return this.state;
        }

        @Required
        public SwitchProperty setName(AutoPropertyName autoPropertyName) {
            this.name = autoPropertyName;
            return this;
        }

        @Required
        public SwitchProperty setState(AutoPropertyState autoPropertyState) {
            this.state = autoPropertyState;
            return this;
        }
    }

    public static class TailgateConfig {
        private Optional<Boolean> has_electric_spoiler = Optional.a();
        private Optional<TailgatePoleType> tailgate_pole_type = Optional.a();

        public Optional<TailgatePoleType> getTailgatePoleType() {
            return this.tailgate_pole_type;
        }

        public Optional<Boolean> isHasElectricSpoiler() {
            return this.has_electric_spoiler;
        }

        public TailgateConfig setHasElectricSpoiler(boolean z) {
            this.has_electric_spoiler = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public TailgateConfig setTailgatePoleType(TailgatePoleType tailgatePoleType) {
            this.tailgate_pole_type = Optional.e(tailgatePoleType);
            return this;
        }
    }

    public enum TailgatePoleType {
        UNKNOWN(-1),
        LEFT_ELECTRIC_POLE(0),
        RIGHT_ELECTRIC_POLE(1),
        LEFT_RIGHT_ELECTRIC_POLE(2),
        WITHOUT_ELECTRIC_POLE(3);

        private int id;

        TailgatePoleType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "TurnOffACMode", namespace = AIApiConstants.AutoController.NAME)
    @Deprecated
    public static class TurnOffACMode implements InstructionPayload {

        @Required
        private AirConditioningMode mode;

        public TurnOffACMode() {
        }

        public TurnOffACMode(AirConditioningMode airConditioningMode) {
            this.mode = airConditioningMode;
        }

        @Required
        public AirConditioningMode getMode() {
            return this.mode;
        }

        @Required
        public TurnOffACMode setMode(AirConditioningMode airConditioningMode) {
            this.mode = airConditioningMode;
            return this;
        }
    }

    @NamespaceName(name = "TurnUp", namespace = AIApiConstants.AutoController.NAME)
    public static class TurnUp implements InstructionPayload {

        @Required
        private String identifier;

        @Required
        private String name;

        public TurnUp() {
        }

        public TurnUp(String str, String str2) {
            this.name = str;
            this.identifier = str2;
        }

        @Required
        public String getIdentifier() {
            return this.identifier;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public TurnUp setIdentifier(String str) {
            this.identifier = str;
            return this;
        }

        @Required
        public TurnUp setName(String str) {
            this.name = str;
            return this;
        }
    }

    @NamespaceName(name = "UpgradeDeviceVersion", namespace = AIApiConstants.AutoController.NAME)
    public static class UpgradeDeviceVersion implements InstructionPayload {
        private Optional<String> name = Optional.a();
        private Optional<String> identifier = Optional.a();
        private Optional<String> version = Optional.a();

        public Optional<String> getIdentifier() {
            return this.identifier;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<String> getVersion() {
            return this.version;
        }

        public UpgradeDeviceVersion setIdentifier(String str) {
            this.identifier = Optional.e(str);
            return this;
        }

        public UpgradeDeviceVersion setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public UpgradeDeviceVersion setVersion(String str) {
            this.version = Optional.e(str);
            return this;
        }
    }

    @NamespaceName(name = "UploadSignal", namespace = AIApiConstants.AutoController.NAME)
    public static class UploadSignal implements InstructionPayload {

        @Required
        private List<SignalRequest> signals;

        public UploadSignal() {
        }

        public UploadSignal(List<SignalRequest> list) {
            this.signals = list;
        }

        @Required
        public List<SignalRequest> getSignals() {
            return this.signals;
        }

        @Required
        public UploadSignal setSignals(List<SignalRequest> list) {
            this.signals = list;
            return this;
        }
    }

    public static class VehicleBasicConfig {
        private Optional<CarType> car_type = Optional.a();
        private Optional<VehicleSuit> vehicle_suit = Optional.a();

        public Optional<CarType> getCarType() {
            return this.car_type;
        }

        public Optional<VehicleSuit> getVehicleSuit() {
            return this.vehicle_suit;
        }

        public VehicleBasicConfig setCarType(CarType carType) {
            this.car_type = Optional.e(carType);
            return this;
        }

        public VehicleBasicConfig setVehicleSuit(VehicleSuit vehicleSuit) {
            this.vehicle_suit = Optional.e(vehicleSuit);
            return this;
        }
    }

    public static class VehicleBrightnessState {
        private Optional<Integer> key_backlight = Optional.a();
        private Optional<Integer> instrument_panel = Optional.a();
        private Optional<Integer> central_control_screen = Optional.a();

        public Optional<Integer> getCentralControlScreen() {
            return this.central_control_screen;
        }

        public Optional<Integer> getInstrumentPanel() {
            return this.instrument_panel;
        }

        public Optional<Integer> getKeyBacklight() {
            return this.key_backlight;
        }

        public VehicleBrightnessState setCentralControlScreen(int i) {
            this.central_control_screen = Optional.e(Integer.valueOf(i));
            return this;
        }

        public VehicleBrightnessState setInstrumentPanel(int i) {
            this.instrument_panel = Optional.e(Integer.valueOf(i));
            return this;
        }

        public VehicleBrightnessState setKeyBacklight(int i) {
            this.key_backlight = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    public enum VehicleCenterScreenMode {
        UNKNOWN(-1),
        DARK(0),
        LIGHT(1),
        AUTO(2),
        AUTO_DARK(3),
        AUTO_LIGHT(4);

        private int id;

        VehicleCenterScreenMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class VehicleCenterScreenState {
        private Optional<VehicleCenterScreenMode> mode = Optional.a();

        public Optional<VehicleCenterScreenMode> getMode() {
            return this.mode;
        }

        public VehicleCenterScreenState setMode(VehicleCenterScreenMode vehicleCenterScreenMode) {
            this.mode = Optional.e(vehicleCenterScreenMode);
            return this;
        }
    }

    public enum VehicleConditionType {
        UNKNOWN(-1),
        COMPREHENSIVE_ENDURANCE(0),
        TOTAL_ENDURANCE(1),
        EV_ENDURANCE(2),
        FUEL_ENDURANCE(3),
        TYRE_PRESSURE(4),
        TYRE_TEMPERATURE(5),
        TYRE_CONDITION(6),
        MILEAGE(7),
        TOTAL_ENERGY_CONSUMPTION(8),
        AVERAGE_ENERGY_CONSUMPTION(9),
        TRAVEL_TIME(10),
        SERVICE_CYCLE(11),
        ECU_AND_SENSOR_FAULT(12),
        BATTERY(13),
        VEHICLE_CONFIGURATION(14),
        ENERGY(15);

        private int id;

        VehicleConditionType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "VehicleConfig", namespace = AIApiConstants.AutoController.NAME)
    public static class VehicleConfig implements ContextPayload {
        private Optional<SeatConfig> seat_config = Optional.a();
        private Optional<SteeringWheelConfig> steering_wheel_config = Optional.a();
        private Optional<RadarConfig> radar_config = Optional.a();
        private Optional<TailgateConfig> tailgate_config = Optional.a();
        private Optional<PowerConfig> power_config = Optional.a();
        private Optional<FunctionConfig> function_config = Optional.a();
        private Optional<HUDConfig> hud_config = Optional.a();
        private Optional<VehicleBasicConfig> vehicle_basic_config = Optional.a();
        private Optional<IntelligentDrivingConfig> intelligent_driving_config = Optional.a();
        private Optional<ACConfig> ac_config = Optional.a();

        public Optional<ACConfig> getAcConfig() {
            return this.ac_config;
        }

        public Optional<FunctionConfig> getFunctionConfig() {
            return this.function_config;
        }

        public Optional<HUDConfig> getHudConfig() {
            return this.hud_config;
        }

        public Optional<IntelligentDrivingConfig> getIntelligentDrivingConfig() {
            return this.intelligent_driving_config;
        }

        public Optional<PowerConfig> getPowerConfig() {
            return this.power_config;
        }

        public Optional<RadarConfig> getRadarConfig() {
            return this.radar_config;
        }

        public Optional<SeatConfig> getSeatConfig() {
            return this.seat_config;
        }

        public Optional<SteeringWheelConfig> getSteeringWheelConfig() {
            return this.steering_wheel_config;
        }

        public Optional<TailgateConfig> getTailgateConfig() {
            return this.tailgate_config;
        }

        public Optional<VehicleBasicConfig> getVehicleBasicConfig() {
            return this.vehicle_basic_config;
        }

        public VehicleConfig setAcConfig(ACConfig aCConfig) {
            this.ac_config = Optional.e(aCConfig);
            return this;
        }

        public VehicleConfig setFunctionConfig(FunctionConfig functionConfig) {
            this.function_config = Optional.e(functionConfig);
            return this;
        }

        public VehicleConfig setHudConfig(HUDConfig hUDConfig) {
            this.hud_config = Optional.e(hUDConfig);
            return this;
        }

        public VehicleConfig setIntelligentDrivingConfig(IntelligentDrivingConfig intelligentDrivingConfig) {
            this.intelligent_driving_config = Optional.e(intelligentDrivingConfig);
            return this;
        }

        public VehicleConfig setPowerConfig(PowerConfig powerConfig) {
            this.power_config = Optional.e(powerConfig);
            return this;
        }

        public VehicleConfig setRadarConfig(RadarConfig radarConfig) {
            this.radar_config = Optional.e(radarConfig);
            return this;
        }

        public VehicleConfig setSeatConfig(SeatConfig seatConfig) {
            this.seat_config = Optional.e(seatConfig);
            return this;
        }

        public VehicleConfig setSteeringWheelConfig(SteeringWheelConfig steeringWheelConfig) {
            this.steering_wheel_config = Optional.e(steeringWheelConfig);
            return this;
        }

        public VehicleConfig setTailgateConfig(TailgateConfig tailgateConfig) {
            this.tailgate_config = Optional.e(tailgateConfig);
            return this;
        }

        public VehicleConfig setVehicleBasicConfig(VehicleBasicConfig vehicleBasicConfig) {
            this.vehicle_basic_config = Optional.e(vehicleBasicConfig);
            return this;
        }
    }

    public static class VehicleConnectDeviceInfo {
        private Optional<List<ConnectDeviceInfo>> miShare_device_infos = Optional.a();
        private Optional<List<ConnectDeviceInfo>> carplay_device_infos = Optional.a();
        private Optional<List<ConnectDeviceInfo>> carlink_device_infos = Optional.a();

        public Optional<List<ConnectDeviceInfo>> getCarlinkDeviceInfos() {
            return this.carlink_device_infos;
        }

        public Optional<List<ConnectDeviceInfo>> getCarplayDeviceInfos() {
            return this.carplay_device_infos;
        }

        public Optional<List<ConnectDeviceInfo>> getMiShareDeviceInfos() {
            return this.miShare_device_infos;
        }

        public VehicleConnectDeviceInfo setCarlinkDeviceInfos(List<ConnectDeviceInfo> list) {
            this.carlink_device_infos = Optional.e(list);
            return this;
        }

        public VehicleConnectDeviceInfo setCarplayDeviceInfos(List<ConnectDeviceInfo> list) {
            this.carplay_device_infos = Optional.e(list);
            return this;
        }

        public VehicleConnectDeviceInfo setMiShareDeviceInfos(List<ConnectDeviceInfo> list) {
            this.miShare_device_infos = Optional.e(list);
            return this;
        }
    }

    public static class VehicleControlDevice {
        private Optional<Position> position = Optional.a();
        private Optional<String> identifier = Optional.a();

        public Optional<String> getIdentifier() {
            return this.identifier;
        }

        public Optional<Position> getPosition() {
            return this.position;
        }

        public VehicleControlDevice setIdentifier(String str) {
            this.identifier = Optional.e(str);
            return this;
        }

        public VehicleControlDevice setPosition(Position position) {
            this.position = Optional.e(position);
            return this;
        }
    }

    public static class VehicleFaultState {
        private Optional<Boolean> camera_has_fault = Optional.a();

        public Optional<Boolean> isCameraHasFault() {
            return this.camera_has_fault;
        }

        public VehicleFaultState setCameraHasFault(boolean z) {
            this.camera_has_fault = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    public enum VehicleLocalCardId {
        UNKNOWN(-1),
        WIPER_WASH_CARD(0),
        EXTERIOR_LIGHT_CARD(1),
        AMBIENT_LIGHT_BRIGHTNESS_CARD(2),
        REAR_SPOILER_CARD(3),
        VOLUME_CARD(4),
        BRIGHTNESS_CARD(5),
        CALL_VOLUME_CARD(6),
        MEDIA_VOLUME_CARD(7),
        XIAOAI_VOLUME_CARD(8),
        NAVIGATION_VOLUME_CARD(9),
        REAR_FOG_LAMPS_CARD(10),
        TYRE_PRESSURE_CARD(11),
        SUSPENSION_GEAR_CARD(12),
        SUSPENSION_SPEED_CARD(13),
        RING_VOLUME_CARD(14),
        PROJECTION_GUIDE_CARD(15);

        private int id;

        VehicleLocalCardId(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class VehicleSoundState {
        private Optional<Integer> headrest_speaker_volume = Optional.a();

        public Optional<Integer> getHeadrestSpeakerVolume() {
            return this.headrest_speaker_volume;
        }

        public VehicleSoundState setHeadrestSpeakerVolume(int i) {
            this.headrest_speaker_volume = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "VehicleState", namespace = AIApiConstants.AutoController.NAME)
    public static class VehicleState implements ContextPayload {

        @Deprecated
        private Optional<List<Integer>> zone_info = Optional.a();
        private Optional<List<Position>> zone_info_with_position = Optional.a();
        private Optional<List<SetAutoProperty>> property_status = Optional.a();
        private Optional<List<SoundEffect>> support = Optional.a();
        private Optional<LocationShareState> location_share_state = Optional.a();
        private Optional<List<VoiceRegionSwitchStatus>> voice_region_switch_status = Optional.a();
        private Optional<VehicleDrivingStatus> vehicle_driving_status = Optional.a();
        private Optional<Common.DriveMode> drive_mode = Optional.a();
        private Optional<Common.DriveSceneMode> drive_scene_mode = Optional.a();
        private Optional<Boolean> is_four_wheel_drive = Optional.a();
        private Optional<HUDStatus> hud_status = Optional.a();
        private Optional<VehicleSwitchStatus> vehicle_switch_status = Optional.a();
        private Optional<List<SeatStatus>> seat_status = Optional.a();
        private Optional<Common.RhythmType> rhythm_type = Optional.a();
        private Optional<AlertTimes> alert_times = Optional.a();
        private Optional<VehicleSupportState> vehicle_support_state = Optional.a();
        private Optional<APAState> apa_state = Optional.a();
        private Optional<VehicleSoundState> sound_state = Optional.a();
        private Optional<VehicleBrightnessState> brightness = Optional.a();
        private Optional<VehicleCenterScreenState> center_screen = Optional.a();
        private Optional<VehicleConnectDeviceInfo> connect_device_info = Optional.a();
        private Optional<Common.ElectricityUnit> electricity_unit_state = Optional.a();
        private Optional<FreeSpaceState> free_space = Optional.a();
        private Optional<List<Position>> zero_g_active_position = Optional.a();
        private Optional<ExtensionInfo> extension_info = Optional.a();
        private Optional<VehicleFaultState> vehicle_fault = Optional.a();

        public Optional<AlertTimes> getAlertTimes() {
            return this.alert_times;
        }

        public Optional<APAState> getApaState() {
            return this.apa_state;
        }

        public Optional<VehicleBrightnessState> getBrightness() {
            return this.brightness;
        }

        public Optional<VehicleCenterScreenState> getCenterScreen() {
            return this.center_screen;
        }

        public Optional<VehicleConnectDeviceInfo> getConnectDeviceInfo() {
            return this.connect_device_info;
        }

        public Optional<Common.DriveMode> getDriveMode() {
            return this.drive_mode;
        }

        public Optional<Common.DriveSceneMode> getDriveSceneMode() {
            return this.drive_scene_mode;
        }

        public Optional<Common.ElectricityUnit> getElectricityUnitState() {
            return this.electricity_unit_state;
        }

        public Optional<ExtensionInfo> getExtensionInfo() {
            return this.extension_info;
        }

        public Optional<FreeSpaceState> getFreeSpace() {
            return this.free_space;
        }

        public Optional<HUDStatus> getHudStatus() {
            return this.hud_status;
        }

        public Optional<LocationShareState> getLocationShareState() {
            return this.location_share_state;
        }

        public Optional<List<SetAutoProperty>> getPropertyStatus() {
            return this.property_status;
        }

        public Optional<Common.RhythmType> getRhythmType() {
            return this.rhythm_type;
        }

        public Optional<List<SeatStatus>> getSeatStatus() {
            return this.seat_status;
        }

        public Optional<VehicleSoundState> getSoundState() {
            return this.sound_state;
        }

        public Optional<List<SoundEffect>> getSupport() {
            return this.support;
        }

        public Optional<VehicleDrivingStatus> getVehicleDrivingStatus() {
            return this.vehicle_driving_status;
        }

        public Optional<VehicleFaultState> getVehicleFault() {
            return this.vehicle_fault;
        }

        public Optional<VehicleSupportState> getVehicleSupportState() {
            return this.vehicle_support_state;
        }

        public Optional<VehicleSwitchStatus> getVehicleSwitchStatus() {
            return this.vehicle_switch_status;
        }

        public Optional<List<VoiceRegionSwitchStatus>> getVoiceRegionSwitchStatus() {
            return this.voice_region_switch_status;
        }

        public Optional<List<Position>> getZeroGActivePosition() {
            return this.zero_g_active_position;
        }

        @Deprecated
        public Optional<List<Integer>> getZoneInfo() {
            return this.zone_info;
        }

        public Optional<List<Position>> getZoneInfoWithPosition() {
            return this.zone_info_with_position;
        }

        public Optional<Boolean> isFourWheelDrive() {
            return this.is_four_wheel_drive;
        }

        public VehicleState setAlertTimes(AlertTimes alertTimes) {
            this.alert_times = Optional.e(alertTimes);
            return this;
        }

        public VehicleState setApaState(APAState aPAState) {
            this.apa_state = Optional.e(aPAState);
            return this;
        }

        public VehicleState setBrightness(VehicleBrightnessState vehicleBrightnessState) {
            this.brightness = Optional.e(vehicleBrightnessState);
            return this;
        }

        public VehicleState setCenterScreen(VehicleCenterScreenState vehicleCenterScreenState) {
            this.center_screen = Optional.e(vehicleCenterScreenState);
            return this;
        }

        public VehicleState setConnectDeviceInfo(VehicleConnectDeviceInfo vehicleConnectDeviceInfo) {
            this.connect_device_info = Optional.e(vehicleConnectDeviceInfo);
            return this;
        }

        public VehicleState setDriveMode(Common.DriveMode driveMode) {
            this.drive_mode = Optional.e(driveMode);
            return this;
        }

        public VehicleState setDriveSceneMode(Common.DriveSceneMode driveSceneMode) {
            this.drive_scene_mode = Optional.e(driveSceneMode);
            return this;
        }

        public VehicleState setElectricityUnitState(Common.ElectricityUnit electricityUnit) {
            this.electricity_unit_state = Optional.e(electricityUnit);
            return this;
        }

        public VehicleState setExtensionInfo(ExtensionInfo extensionInfo) {
            this.extension_info = Optional.e(extensionInfo);
            return this;
        }

        public VehicleState setFreeSpace(FreeSpaceState freeSpaceState) {
            this.free_space = Optional.e(freeSpaceState);
            return this;
        }

        public VehicleState setHudStatus(HUDStatus hUDStatus) {
            this.hud_status = Optional.e(hUDStatus);
            return this;
        }

        public VehicleState setIsFourWheelDrive(boolean z) {
            this.is_four_wheel_drive = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VehicleState setLocationShareState(LocationShareState locationShareState) {
            this.location_share_state = Optional.e(locationShareState);
            return this;
        }

        public VehicleState setPropertyStatus(List<SetAutoProperty> list) {
            this.property_status = Optional.e(list);
            return this;
        }

        public VehicleState setRhythmType(Common.RhythmType rhythmType) {
            this.rhythm_type = Optional.e(rhythmType);
            return this;
        }

        public VehicleState setSeatStatus(List<SeatStatus> list) {
            this.seat_status = Optional.e(list);
            return this;
        }

        public VehicleState setSoundState(VehicleSoundState vehicleSoundState) {
            this.sound_state = Optional.e(vehicleSoundState);
            return this;
        }

        public VehicleState setSupport(List<SoundEffect> list) {
            this.support = Optional.e(list);
            return this;
        }

        public VehicleState setVehicleDrivingStatus(VehicleDrivingStatus vehicleDrivingStatus) {
            this.vehicle_driving_status = Optional.e(vehicleDrivingStatus);
            return this;
        }

        public VehicleState setVehicleFault(VehicleFaultState vehicleFaultState) {
            this.vehicle_fault = Optional.e(vehicleFaultState);
            return this;
        }

        public VehicleState setVehicleSupportState(VehicleSupportState vehicleSupportState) {
            this.vehicle_support_state = Optional.e(vehicleSupportState);
            return this;
        }

        public VehicleState setVehicleSwitchStatus(VehicleSwitchStatus vehicleSwitchStatus) {
            this.vehicle_switch_status = Optional.e(vehicleSwitchStatus);
            return this;
        }

        public VehicleState setVoiceRegionSwitchStatus(List<VoiceRegionSwitchStatus> list) {
            this.voice_region_switch_status = Optional.e(list);
            return this;
        }

        public VehicleState setZeroGActivePosition(List<Position> list) {
            this.zero_g_active_position = Optional.e(list);
            return this;
        }

        @Deprecated
        public VehicleState setZoneInfo(List<Integer> list) {
            this.zone_info = Optional.e(list);
            return this;
        }

        public VehicleState setZoneInfoWithPosition(List<Position> list) {
            this.zone_info_with_position = Optional.e(list);
            return this;
        }
    }

    public enum VehicleStatusType {
        Unknown(-1),
        BASIC(0),
        TIRE_PRESSURE(1),
        MILEAGE(2),
        TRAVEL_TIME(3),
        TOTAL_ENERGY_CONSUMPTION(4),
        AVERAGE_ENERGY_CONSUMPTION(5),
        PM2_5(6),
        AIR_QUALITY_OUT_CAR(7),
        TEMPERATURE_IN_CAR(8),
        ENDURANCE_RANGE(9),
        REMAINING_CHARGE(10),
        IDLING_CHARGE(11),
        TEMPERATURE_OUT_CAR(12),
        REMAINING_CHARGE_TIME(13),
        SPEED(14),
        DRIVING_MODE(15),
        ESTIMATE_ENDURANCE_RANGE(16),
        STANDARD_ENDURANCE_RANGE(17),
        CONSUMED_ENDURANCE_RANGE(18);

        private int id;

        VehicleStatusType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum VehicleSuit {
        UNKNOWN(-1),
        MS11_1(1),
        MS11_2(2),
        MS11_3(3),
        MS11_4(4),
        MS11_5(5),
        MS11_P_BASE(17),
        LE_MANS_1(33),
        LE_MANS_2(34),
        LE_MANS_4(36),
        LE_MANS_5(37);

        private int id;

        VehicleSuit(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class VehicleSupportState {
        private Optional<Boolean> is_support_driver_fatigue_monitor = Optional.a();

        public Optional<Boolean> isSupportDriverFatigueMonitor() {
            return this.is_support_driver_fatigue_monitor;
        }

        public VehicleSupportState setIsSupportDriverFatigueMonitor(boolean z) {
            this.is_support_driver_fatigue_monitor = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    public static class VehicleSwitchStatus {
        private Optional<Boolean> camera_status = Optional.a();
        private Optional<Boolean> driver_fatigue_monitor = Optional.a();
        private Optional<Boolean> driver_distraction_monitor = Optional.a();
        private Optional<Boolean> sentinel_mode_status = Optional.a();
        private Optional<Boolean> headrest_speaker = Optional.a();
        private Optional<Boolean> car_play = Optional.a();
        private Optional<Boolean> car_link = Optional.a();
        private Optional<Boolean> wireless_charging = Optional.a();
        private Optional<Boolean> instrument_panel_brightness = Optional.a();
        private Optional<Boolean> rain_fog_light_reminder = Optional.a();
        private Optional<Boolean> phone_forget_reminder = Optional.a();
        private Optional<Boolean> pulse_heating = Optional.a();
        private Optional<Boolean> ota_version_need_update = Optional.a();
        private Optional<Boolean> ac_keep_work_in_parked_switch = Optional.a();
        private Optional<Boolean> one_click_privacy_switch = Optional.a();
        private Optional<Boolean> parking_image_delay_switch = Optional.a();
        private Optional<Boolean> narrow_path_assistance_switch = Optional.a();
        private Optional<Boolean> steering_image_switch = Optional.a();
        private Optional<Boolean> low_speed_prompt_switch = Optional.a();
        private Optional<Boolean> free_space_switch = Optional.a();
        private Optional<Boolean> rest_mode_switch = Optional.a();
        private Optional<Boolean> ac_auto_switch = Optional.a();
        private Optional<Boolean> avm_delay_switch = Optional.a();

        public Optional<Boolean> isAcAutoSwitch() {
            return this.ac_auto_switch;
        }

        public Optional<Boolean> isAcKeepWorkInParkedSwitch() {
            return this.ac_keep_work_in_parked_switch;
        }

        public Optional<Boolean> isAvmDelaySwitch() {
            return this.avm_delay_switch;
        }

        public Optional<Boolean> isCameraStatus() {
            return this.camera_status;
        }

        public Optional<Boolean> isCarLink() {
            return this.car_link;
        }

        public Optional<Boolean> isCarPlay() {
            return this.car_play;
        }

        public Optional<Boolean> isDriverDistractionMonitor() {
            return this.driver_distraction_monitor;
        }

        public Optional<Boolean> isDriverFatigueMonitor() {
            return this.driver_fatigue_monitor;
        }

        public Optional<Boolean> isFreeSpaceSwitch() {
            return this.free_space_switch;
        }

        public Optional<Boolean> isHeadrestSpeaker() {
            return this.headrest_speaker;
        }

        public Optional<Boolean> isInstrumentPanelBrightness() {
            return this.instrument_panel_brightness;
        }

        public Optional<Boolean> isLowSpeedPromptSwitch() {
            return this.low_speed_prompt_switch;
        }

        public Optional<Boolean> isNarrowPathAssistanceSwitch() {
            return this.narrow_path_assistance_switch;
        }

        public Optional<Boolean> isOneClickPrivacySwitch() {
            return this.one_click_privacy_switch;
        }

        public Optional<Boolean> isOtaVersionNeedUpdate() {
            return this.ota_version_need_update;
        }

        public Optional<Boolean> isParkingImageDelaySwitch() {
            return this.parking_image_delay_switch;
        }

        public Optional<Boolean> isPhoneForgetReminder() {
            return this.phone_forget_reminder;
        }

        public Optional<Boolean> isPulseHeating() {
            return this.pulse_heating;
        }

        public Optional<Boolean> isRainFogLightReminder() {
            return this.rain_fog_light_reminder;
        }

        public Optional<Boolean> isRestModeSwitch() {
            return this.rest_mode_switch;
        }

        public Optional<Boolean> isSentinelModeStatus() {
            return this.sentinel_mode_status;
        }

        public Optional<Boolean> isSteeringImageSwitch() {
            return this.steering_image_switch;
        }

        public Optional<Boolean> isWirelessCharging() {
            return this.wireless_charging;
        }

        public VehicleSwitchStatus setAcAutoSwitch(boolean z) {
            this.ac_auto_switch = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VehicleSwitchStatus setAcKeepWorkInParkedSwitch(boolean z) {
            this.ac_keep_work_in_parked_switch = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VehicleSwitchStatus setAvmDelaySwitch(boolean z) {
            this.avm_delay_switch = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VehicleSwitchStatus setCameraStatus(boolean z) {
            this.camera_status = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VehicleSwitchStatus setCarLink(boolean z) {
            this.car_link = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VehicleSwitchStatus setCarPlay(boolean z) {
            this.car_play = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VehicleSwitchStatus setDriverDistractionMonitor(boolean z) {
            this.driver_distraction_monitor = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VehicleSwitchStatus setDriverFatigueMonitor(boolean z) {
            this.driver_fatigue_monitor = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VehicleSwitchStatus setFreeSpaceSwitch(boolean z) {
            this.free_space_switch = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VehicleSwitchStatus setHeadrestSpeaker(boolean z) {
            this.headrest_speaker = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VehicleSwitchStatus setInstrumentPanelBrightness(boolean z) {
            this.instrument_panel_brightness = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VehicleSwitchStatus setLowSpeedPromptSwitch(boolean z) {
            this.low_speed_prompt_switch = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VehicleSwitchStatus setNarrowPathAssistanceSwitch(boolean z) {
            this.narrow_path_assistance_switch = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VehicleSwitchStatus setOneClickPrivacySwitch(boolean z) {
            this.one_click_privacy_switch = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VehicleSwitchStatus setOtaVersionNeedUpdate(boolean z) {
            this.ota_version_need_update = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VehicleSwitchStatus setParkingImageDelaySwitch(boolean z) {
            this.parking_image_delay_switch = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VehicleSwitchStatus setPhoneForgetReminder(boolean z) {
            this.phone_forget_reminder = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VehicleSwitchStatus setPulseHeating(boolean z) {
            this.pulse_heating = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VehicleSwitchStatus setRainFogLightReminder(boolean z) {
            this.rain_fog_light_reminder = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VehicleSwitchStatus setRestModeSwitch(boolean z) {
            this.rest_mode_switch = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VehicleSwitchStatus setSentinelModeStatus(boolean z) {
            this.sentinel_mode_status = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VehicleSwitchStatus setSteeringImageSwitch(boolean z) {
            this.steering_image_switch = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VehicleSwitchStatus setWirelessCharging(boolean z) {
            this.wireless_charging = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    public static class VoiceRegionSwitchStatus {

        @Required
        private boolean is_open;

        @Required
        private Position position;

        public VoiceRegionSwitchStatus() {
        }

        public VoiceRegionSwitchStatus(Position position, boolean z) {
            this.position = position;
            this.is_open = z;
        }

        @Required
        public Position getPosition() {
            return this.position;
        }

        @Required
        public boolean isOpen() {
            return this.is_open;
        }

        @Required
        public VoiceRegionSwitchStatus setIsOpen(boolean z) {
            this.is_open = z;
            return this;
        }

        @Required
        public VoiceRegionSwitchStatus setPosition(Position position) {
            this.position = position;
            return this;
        }
    }

    public enum WiperMode {
        UNKNOWN(-1),
        FAST(0),
        SLOW(1),
        CLEAN(2);

        private int id;

        WiperMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "AdjustBrightness", namespace = AIApiConstants.AutoController.NAME)
    public static class AdjustBrightness implements InstructionPayload {

        @Required
        private String identifier;

        @Required
        private String name;
        private Optional<AdjustState> state = Optional.a();

        @Required
        private int value;

        public AdjustBrightness() {
        }

        @Required
        public String getIdentifier() {
            return this.identifier;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<AdjustState> getState() {
            return this.state;
        }

        @Required
        public int getValue() {
            return this.value;
        }

        @Required
        public AdjustBrightness setIdentifier(String str) {
            this.identifier = str;
            return this;
        }

        @Required
        public AdjustBrightness setName(String str) {
            this.name = str;
            return this;
        }

        public AdjustBrightness setState(AdjustState adjustState) {
            this.state = Optional.e(adjustState);
            return this;
        }

        @Required
        public AdjustBrightness setValue(int i) {
            this.value = i;
            return this;
        }

        public AdjustBrightness(String str, String str2, int i) {
            this.name = str;
            this.identifier = str2;
            this.value = i;
        }
    }

    @NamespaceName(name = "AdjustHeight", namespace = AIApiConstants.AutoController.NAME)
    public static class AdjustHeight implements InstructionPayload {

        @Required
        private String identifier;

        @Required
        private String name;
        private Optional<AdjustState> state = Optional.a();

        @Required
        private int value;

        public AdjustHeight() {
        }

        @Required
        public String getIdentifier() {
            return this.identifier;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<AdjustState> getState() {
            return this.state;
        }

        @Required
        public int getValue() {
            return this.value;
        }

        @Required
        public AdjustHeight setIdentifier(String str) {
            this.identifier = str;
            return this;
        }

        @Required
        public AdjustHeight setName(String str) {
            this.name = str;
            return this;
        }

        public AdjustHeight setState(AdjustState adjustState) {
            this.state = Optional.e(adjustState);
            return this;
        }

        @Required
        public AdjustHeight setValue(int i) {
            this.value = i;
            return this;
        }

        public AdjustHeight(String str, String str2, int i) {
            this.name = str;
            this.identifier = str2;
            this.value = i;
        }
    }

    @NamespaceName(name = "AdjustSeat", namespace = AIApiConstants.AutoController.NAME)
    @Deprecated
    public static class AdjustSeat implements InstructionPayload {

        @Required
        private Position position;
        private Optional<AdjustState> state = Optional.a();

        @Required
        private SeatUnit unit;

        @Required
        private int value;

        public AdjustSeat() {
        }

        @Required
        public Position getPosition() {
            return this.position;
        }

        public Optional<AdjustState> getState() {
            return this.state;
        }

        @Required
        public SeatUnit getUnit() {
            return this.unit;
        }

        @Required
        public int getValue() {
            return this.value;
        }

        @Required
        public AdjustSeat setPosition(Position position) {
            this.position = position;
            return this;
        }

        public AdjustSeat setState(AdjustState adjustState) {
            this.state = Optional.e(adjustState);
            return this;
        }

        @Required
        public AdjustSeat setUnit(SeatUnit seatUnit) {
            this.unit = seatUnit;
            return this;
        }

        @Required
        public AdjustSeat setValue(int i) {
            this.value = i;
            return this;
        }

        public AdjustSeat(Position position, SeatUnit seatUnit, int i) {
            this.position = position;
            this.unit = seatUnit;
            this.value = i;
        }
    }

    @NamespaceName(name = "AdjustSunroofStepless", namespace = AIApiConstants.AutoController.NAME)
    public static class AdjustSunroofStepless implements InstructionPayload {
        private Optional<AdjustState> state = Optional.a();

        @Required
        private int value;

        public AdjustSunroofStepless() {
        }

        public Optional<AdjustState> getState() {
            return this.state;
        }

        @Required
        public int getValue() {
            return this.value;
        }

        public AdjustSunroofStepless setState(AdjustState adjustState) {
            this.state = Optional.e(adjustState);
            return this;
        }

        @Required
        public AdjustSunroofStepless setValue(int i) {
            this.value = i;
            return this;
        }

        public AdjustSunroofStepless(int i) {
            this.value = i;
        }
    }

    @NamespaceName(name = "AdjustSunshade", namespace = AIApiConstants.AutoController.NAME)
    public static class AdjustSunshade implements InstructionPayload {
        private Optional<AdjustState> state = Optional.a();

        @Required
        private int value;

        public AdjustSunshade() {
        }

        public Optional<AdjustState> getState() {
            return this.state;
        }

        @Required
        public int getValue() {
            return this.value;
        }

        public AdjustSunshade setState(AdjustState adjustState) {
            this.state = Optional.e(adjustState);
            return this;
        }

        @Required
        public AdjustSunshade setValue(int i) {
            this.value = i;
            return this;
        }

        public AdjustSunshade(int i) {
            this.value = i;
        }
    }

    @NamespaceName(name = "AdjustWindow", namespace = AIApiConstants.AutoController.NAME)
    @Deprecated
    public static class AdjustWindow implements InstructionPayload {

        @Required
        private Position position;

        @Required
        private AdjustState state;
        private Optional<Integer> step = Optional.a();

        public AdjustWindow() {
        }

        @Required
        public Position getPosition() {
            return this.position;
        }

        @Required
        public AdjustState getState() {
            return this.state;
        }

        public Optional<Integer> getStep() {
            return this.step;
        }

        @Required
        public AdjustWindow setPosition(Position position) {
            this.position = position;
            return this;
        }

        @Required
        public AdjustWindow setState(AdjustState adjustState) {
            this.state = adjustState;
            return this;
        }

        public AdjustWindow setStep(int i) {
            this.step = Optional.e(Integer.valueOf(i));
            return this;
        }

        public AdjustWindow(Position position, AdjustState adjustState) {
            this.position = position;
            this.state = adjustState;
        }
    }

    @NamespaceName(name = "CheckSpeed", namespace = AIApiConstants.AutoController.NAME)
    public static class CheckSpeed implements InstructionPayload {
        private Optional<CheckSpeedScene> check_scene = Optional.a();

        @Required
        private double speed;

        public CheckSpeed() {
        }

        public Optional<CheckSpeedScene> getCheckScene() {
            return this.check_scene;
        }

        @Required
        public double getSpeed() {
            return this.speed;
        }

        public CheckSpeed setCheckScene(CheckSpeedScene checkSpeedScene) {
            this.check_scene = Optional.e(checkSpeedScene);
            return this;
        }

        @Required
        public CheckSpeed setSpeed(double d) {
            this.speed = d;
            return this;
        }

        public CheckSpeed(double d) {
            this.speed = d;
        }
    }

    @NamespaceName(name = "SetACMode", namespace = AIApiConstants.AutoController.NAME)
    @Deprecated
    public static class SetACMode implements InstructionPayload {

        @Required
        private List<AirConditioningMode> mode;
        private Optional<Position> position = Optional.a();

        public SetACMode() {
        }

        @Required
        public List<AirConditioningMode> getMode() {
            return this.mode;
        }

        public Optional<Position> getPosition() {
            return this.position;
        }

        @Required
        public SetACMode setMode(List<AirConditioningMode> list) {
            this.mode = list;
            return this;
        }

        public SetACMode setPosition(Position position) {
            this.position = Optional.e(position);
            return this;
        }

        public SetACMode(List<AirConditioningMode> list) {
            this.mode = list;
        }
    }

    @NamespaceName(name = "SetBrightness", namespace = AIApiConstants.AutoController.NAME)
    public static class SetBrightness implements InstructionPayload {

        @Required
        private String identifier;
        private Optional<String> level = Optional.a();

        @Required
        private String name;

        @Required
        private int value;

        public SetBrightness() {
        }

        @Required
        public String getIdentifier() {
            return this.identifier;
        }

        public Optional<String> getLevel() {
            return this.level;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public int getValue() {
            return this.value;
        }

        @Required
        public SetBrightness setIdentifier(String str) {
            this.identifier = str;
            return this;
        }

        public SetBrightness setLevel(String str) {
            this.level = Optional.e(str);
            return this;
        }

        @Required
        public SetBrightness setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public SetBrightness setValue(int i) {
            this.value = i;
            return this;
        }

        public SetBrightness(String str, String str2, int i) {
            this.name = str;
            this.identifier = str2;
            this.value = i;
        }
    }

    @NamespaceName(name = "SetSeatMode", namespace = AIApiConstants.AutoController.NAME)
    @Deprecated
    public static class SetSeatMode implements InstructionPayload {

        @Required
        private SeatMode mode;

        @Required
        private Position position;
        private Optional<SeatUnit> unit = Optional.a();

        public SetSeatMode() {
        }

        @Required
        public SeatMode getMode() {
            return this.mode;
        }

        @Required
        public Position getPosition() {
            return this.position;
        }

        public Optional<SeatUnit> getUnit() {
            return this.unit;
        }

        @Required
        public SetSeatMode setMode(SeatMode seatMode) {
            this.mode = seatMode;
            return this;
        }

        @Required
        public SetSeatMode setPosition(Position position) {
            this.position = position;
            return this;
        }

        public SetSeatMode setUnit(SeatUnit seatUnit) {
            this.unit = Optional.e(seatUnit);
            return this;
        }

        public SetSeatMode(Position position, SeatMode seatMode) {
            this.position = position;
            this.mode = seatMode;
        }
    }

    @NamespaceName(name = "SetWiperMode", namespace = AIApiConstants.AutoController.NAME)
    @Deprecated
    public static class SetWiperMode implements InstructionPayload {

        @Required
        private WiperMode mode;
        private Optional<Position> position = Optional.a();

        public SetWiperMode() {
        }

        @Required
        public WiperMode getMode() {
            return this.mode;
        }

        public Optional<Position> getPosition() {
            return this.position;
        }

        @Required
        public SetWiperMode setMode(WiperMode wiperMode) {
            this.mode = wiperMode;
            return this;
        }

        public SetWiperMode setPosition(Position position) {
            this.position = Optional.e(position);
            return this;
        }

        public SetWiperMode(WiperMode wiperMode) {
            this.mode = wiperMode;
        }
    }

    @NamespaceName(name = "TelltaleList", namespace = AIApiConstants.AutoController.NAME)
    public static class TelltaleList implements InstructionPayload {

        @Required
        private List<Telltale> items;
        private Optional<String> text = Optional.a();

        public TelltaleList() {
        }

        @Required
        public List<Telltale> getItems() {
            return this.items;
        }

        public Optional<String> getText() {
            return this.text;
        }

        @Required
        public TelltaleList setItems(List<Telltale> list) {
            this.items = list;
            return this;
        }

        public TelltaleList setText(String str) {
            this.text = Optional.e(str);
            return this;
        }

        public TelltaleList(List<Telltale> list) {
            this.items = list;
        }
    }

    @NamespaceName(name = "UploadSignalResult", namespace = AIApiConstants.AutoController.NAME)
    public static class UploadSignalResult implements EventPayload {
        private Optional<String> error_msg = Optional.a();

        @Required
        private List<SignalWithUnit> signals;

        @Required
        private int std_status;

        public UploadSignalResult() {
        }

        public Optional<String> getErrorMsg() {
            return this.error_msg;
        }

        @Required
        public List<SignalWithUnit> getSignals() {
            return this.signals;
        }

        @Required
        public int getStdStatus() {
            return this.std_status;
        }

        public UploadSignalResult setErrorMsg(String str) {
            this.error_msg = Optional.e(str);
            return this;
        }

        @Required
        public UploadSignalResult setSignals(List<SignalWithUnit> list) {
            this.signals = list;
            return this;
        }

        @Required
        public UploadSignalResult setStdStatus(int i) {
            this.std_status = i;
            return this;
        }

        public UploadSignalResult(List<SignalWithUnit> list, int i) {
            this.signals = list;
            this.std_status = i;
        }
    }

    @NamespaceName(name = "AutoWikiEvent", namespace = AIApiConstants.AutoController.NAME)
    public static class AutoWikiEvent implements EventPayload {
        private Optional<String> id = Optional.a();
        private Optional<String> name = Optional.a();

        @Required
        private AutoWikiType type;

        public AutoWikiEvent() {
        }

        public Optional<String> getId() {
            return this.id;
        }

        public Optional<String> getName() {
            return this.name;
        }

        @Required
        public AutoWikiType getType() {
            return this.type;
        }

        public AutoWikiEvent setId(String str) {
            this.id = Optional.e(str);
            return this;
        }

        public AutoWikiEvent setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        @Required
        public AutoWikiEvent setType(AutoWikiType autoWikiType) {
            this.type = autoWikiType;
            return this;
        }

        public AutoWikiEvent(AutoWikiType autoWikiType) {
            this.type = autoWikiType;
        }
    }

    @NamespaceName(name = "CheckAutoCondition", namespace = AIApiConstants.AutoController.NAME)
    public static class CheckAutoCondition implements InstructionPayload {
        private Optional<CheckRange> range = Optional.a();
        private Optional<List<SlotDescription>> slot_description = Optional.a();

        @Required
        private VehicleStatusType status;

        public CheckAutoCondition() {
        }

        public Optional<CheckRange> getRange() {
            return this.range;
        }

        public Optional<List<SlotDescription>> getSlotDescription() {
            return this.slot_description;
        }

        @Required
        public VehicleStatusType getStatus() {
            return this.status;
        }

        public CheckAutoCondition setRange(CheckRange checkRange) {
            this.range = Optional.e(checkRange);
            return this;
        }

        public CheckAutoCondition setSlotDescription(List<SlotDescription> list) {
            this.slot_description = Optional.e(list);
            return this;
        }

        @Required
        public CheckAutoCondition setStatus(VehicleStatusType vehicleStatusType) {
            this.status = vehicleStatusType;
            return this;
        }

        public CheckAutoCondition(VehicleStatusType vehicleStatusType) {
            this.status = vehicleStatusType;
        }
    }

    @NamespaceName(name = "ExecuteLocationShare", namespace = AIApiConstants.AutoController.NAME)
    public static class ExecuteLocationShare implements InstructionPayload {

        @Required
        private boolean open_location_share;
        private Optional<List<String>> device_id_list = Optional.a();
        private Optional<c4h> pass_through = Optional.a();

        public ExecuteLocationShare() {
        }

        public Optional<List<String>> getDeviceIdList() {
            return this.device_id_list;
        }

        public Optional<c4h> getPassThrough() {
            return this.pass_through;
        }

        @Required
        public boolean isOpenLocationShare() {
            return this.open_location_share;
        }

        public ExecuteLocationShare setDeviceIdList(List<String> list) {
            this.device_id_list = Optional.e(list);
            return this;
        }

        @Required
        public ExecuteLocationShare setOpenLocationShare(boolean z) {
            this.open_location_share = z;
            return this;
        }

        public ExecuteLocationShare setPassThrough(c4h c4hVar) {
            this.pass_through = Optional.e(c4hVar);
            return this;
        }

        public ExecuteLocationShare(boolean z) {
            this.open_location_share = z;
        }
    }

    @NamespaceName(name = "SetWindow", namespace = AIApiConstants.AutoController.NAME)
    @Deprecated
    public static class SetWindow implements InstructionPayload {

        @Required
        private Position position;

        @Required
        private int value;
        private Optional<List<Position>> more_position = Optional.a();
        private Optional<Speaker.UnitDef> unit = Optional.a();

        public SetWindow() {
        }

        public Optional<List<Position>> getMorePosition() {
            return this.more_position;
        }

        @Required
        public Position getPosition() {
            return this.position;
        }

        public Optional<Speaker.UnitDef> getUnit() {
            return this.unit;
        }

        @Required
        public int getValue() {
            return this.value;
        }

        public SetWindow setMorePosition(List<Position> list) {
            this.more_position = Optional.e(list);
            return this;
        }

        @Required
        public SetWindow setPosition(Position position) {
            this.position = position;
            return this;
        }

        public SetWindow setUnit(Speaker.UnitDef unitDef) {
            this.unit = Optional.e(unitDef);
            return this;
        }

        @Required
        public SetWindow setValue(int i) {
            this.value = i;
            return this;
        }

        public SetWindow(Position position, int i) {
            this.position = position;
            this.value = i;
        }
    }

    @NamespaceName(name = "SetWiperSpeed", namespace = AIApiConstants.AutoController.NAME)
    @Deprecated
    public static class SetWiperSpeed implements InstructionPayload {

        @Required
        @Deprecated
        private int value;
        private Optional<Position> position = Optional.a();
        private Optional<Float> fvalue = Optional.a();

        public SetWiperSpeed() {
        }

        public Optional<Float> getFvalue() {
            return this.fvalue;
        }

        public Optional<Position> getPosition() {
            return this.position;
        }

        @Required
        @Deprecated
        public int getValue() {
            return this.value;
        }

        public SetWiperSpeed setFvalue(float f) {
            this.fvalue = Optional.e(Float.valueOf(f));
            return this;
        }

        public SetWiperSpeed setPosition(Position position) {
            this.position = Optional.e(position);
            return this;
        }

        @Required
        @Deprecated
        public SetWiperSpeed setValue(int i) {
            this.value = i;
            return this;
        }

        public SetWiperSpeed(int i) {
            this.value = i;
        }
    }

    @NamespaceName(name = "ShowLocalCards", namespace = AIApiConstants.AutoController.NAME)
    public static class ShowLocalCards implements InstructionPayload {

        @Required
        private VehicleLocalCardId id;
        private Optional<Template.Launcher> launcher = Optional.a();
        private Optional<Float> cur_value = Optional.a();

        public ShowLocalCards() {
        }

        public Optional<Float> getCurValue() {
            return this.cur_value;
        }

        @Required
        public VehicleLocalCardId getId() {
            return this.id;
        }

        public Optional<Template.Launcher> getLauncher() {
            return this.launcher;
        }

        public ShowLocalCards setCurValue(float f) {
            this.cur_value = Optional.e(Float.valueOf(f));
            return this;
        }

        @Required
        public ShowLocalCards setId(VehicleLocalCardId vehicleLocalCardId) {
            this.id = vehicleLocalCardId;
            return this;
        }

        public ShowLocalCards setLauncher(Template.Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public ShowLocalCards(VehicleLocalCardId vehicleLocalCardId) {
            this.id = vehicleLocalCardId;
        }
    }

    public static class Telltale {

        @Required
        private String id;

        @Required
        private String name;
        private Optional<String> desc = Optional.a();
        private Optional<Template.Launcher> launcher = Optional.a();

        public Telltale() {
        }

        public Optional<String> getDesc() {
            return this.desc;
        }

        @Required
        public String getId() {
            return this.id;
        }

        public Optional<Template.Launcher> getLauncher() {
            return this.launcher;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Telltale setDesc(String str) {
            this.desc = Optional.e(str);
            return this;
        }

        @Required
        public Telltale setId(String str) {
            this.id = str;
            return this;
        }

        public Telltale setLauncher(Template.Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        @Required
        public Telltale setName(String str) {
            this.name = str;
            return this;
        }

        public Telltale(String str, String str2) {
            this.id = str;
            this.name = str2;
        }
    }

    public static class VehicleDrivingStatus {

        @Required
        private boolean is_driving;
        private Optional<Integer> driver_fatigue_monitor_sensitivity = Optional.a();
        private Optional<Boolean> display_model_switch = Optional.a();

        public VehicleDrivingStatus() {
        }

        public Optional<Integer> getDriverFatigueMonitorSensitivity() {
            return this.driver_fatigue_monitor_sensitivity;
        }

        public Optional<Boolean> isDisplayModelSwitch() {
            return this.display_model_switch;
        }

        @Required
        public boolean isDriving() {
            return this.is_driving;
        }

        public VehicleDrivingStatus setDisplayModelSwitch(boolean z) {
            this.display_model_switch = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VehicleDrivingStatus setDriverFatigueMonitorSensitivity(int i) {
            this.driver_fatigue_monitor_sensitivity = Optional.e(Integer.valueOf(i));
            return this;
        }

        @Required
        public VehicleDrivingStatus setIsDriving(boolean z) {
            this.is_driving = z;
            return this;
        }

        public VehicleDrivingStatus(boolean z) {
            this.is_driving = z;
        }
    }

    @NamespaceName(name = "AdjustWiperSpeed", namespace = AIApiConstants.AutoController.NAME)
    @Deprecated
    public static class AdjustWiperSpeed implements InstructionPayload {

        @Required
        @Deprecated
        private int value;
        private Optional<Position> position = Optional.a();
        private Optional<AdjustState> state = Optional.a();
        private Optional<Float> fvalue = Optional.a();

        public AdjustWiperSpeed() {
        }

        public Optional<Float> getFvalue() {
            return this.fvalue;
        }

        public Optional<Position> getPosition() {
            return this.position;
        }

        public Optional<AdjustState> getState() {
            return this.state;
        }

        @Required
        @Deprecated
        public int getValue() {
            return this.value;
        }

        public AdjustWiperSpeed setFvalue(float f) {
            this.fvalue = Optional.e(Float.valueOf(f));
            return this;
        }

        public AdjustWiperSpeed setPosition(Position position) {
            this.position = Optional.e(position);
            return this;
        }

        public AdjustWiperSpeed setState(AdjustState adjustState) {
            this.state = Optional.e(adjustState);
            return this;
        }

        @Required
        @Deprecated
        public AdjustWiperSpeed setValue(int i) {
            this.value = i;
            return this;
        }

        public AdjustWiperSpeed(int i) {
            this.value = i;
        }
    }

    public static class HUDStatus {

        @Required
        private int hud_angle;

        @Required
        private int hud_brightness;

        @Required
        private int hud_height;
        private Optional<HUDMode> hud_mode = Optional.a();
        private Optional<Integer> hud_horizontal_position = Optional.a();
        private Optional<Boolean> hud_demonstrate_model_status = Optional.a();
        private Optional<Boolean> snow_color_enhancement_status = Optional.a();

        public HUDStatus() {
        }

        @Required
        public int getHudAngle() {
            return this.hud_angle;
        }

        @Required
        public int getHudBrightness() {
            return this.hud_brightness;
        }

        @Required
        public int getHudHeight() {
            return this.hud_height;
        }

        public Optional<Integer> getHudHorizontalPosition() {
            return this.hud_horizontal_position;
        }

        public Optional<HUDMode> getHudMode() {
            return this.hud_mode;
        }

        public Optional<Boolean> isHudDemonstrateModelStatus() {
            return this.hud_demonstrate_model_status;
        }

        public Optional<Boolean> isSnowColorEnhancementStatus() {
            return this.snow_color_enhancement_status;
        }

        @Required
        public HUDStatus setHudAngle(int i) {
            this.hud_angle = i;
            return this;
        }

        @Required
        public HUDStatus setHudBrightness(int i) {
            this.hud_brightness = i;
            return this;
        }

        public HUDStatus setHudDemonstrateModelStatus(boolean z) {
            this.hud_demonstrate_model_status = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Required
        public HUDStatus setHudHeight(int i) {
            this.hud_height = i;
            return this;
        }

        public HUDStatus setHudHorizontalPosition(int i) {
            this.hud_horizontal_position = Optional.e(Integer.valueOf(i));
            return this;
        }

        public HUDStatus setHudMode(HUDMode hUDMode) {
            this.hud_mode = Optional.e(hUDMode);
            return this;
        }

        public HUDStatus setSnowColorEnhancementStatus(boolean z) {
            this.snow_color_enhancement_status = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public HUDStatus(int i, int i2, int i3) {
            this.hud_height = i;
            this.hud_angle = i2;
            this.hud_brightness = i3;
        }
    }

    @NamespaceName(name = "Stop", namespace = AIApiConstants.AutoController.NAME)
    public static class Stop implements InstructionPayload {

        @Required
        private String identifier;

        @Required
        private String name;
        private Optional<Attribute> attribute = Optional.a();
        private Optional<List<Position>> positions = Optional.a();
        private Optional<String> position_desc = Optional.a();
        private Optional<List<SlotDescription>> slot_description = Optional.a();

        public Stop() {
        }

        public Optional<Attribute> getAttribute() {
            return this.attribute;
        }

        @Required
        public String getIdentifier() {
            return this.identifier;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<String> getPositionDesc() {
            return this.position_desc;
        }

        public Optional<List<Position>> getPositions() {
            return this.positions;
        }

        public Optional<List<SlotDescription>> getSlotDescription() {
            return this.slot_description;
        }

        public Stop setAttribute(Attribute attribute) {
            this.attribute = Optional.e(attribute);
            return this;
        }

        @Required
        public Stop setIdentifier(String str) {
            this.identifier = str;
            return this;
        }

        @Required
        public Stop setName(String str) {
            this.name = str;
            return this;
        }

        public Stop setPositionDesc(String str) {
            this.position_desc = Optional.e(str);
            return this;
        }

        public Stop setPositions(List<Position> list) {
            this.positions = Optional.e(list);
            return this;
        }

        public Stop setSlotDescription(List<SlotDescription> list) {
            this.slot_description = Optional.e(list);
            return this;
        }

        public Stop(String str, String str2) {
            this.name = str;
            this.identifier = str2;
        }
    }

    public static class TabProperty {

        @Required
        private AutoPropertyName name;
        private Optional<HeadrestMode> headrest_mode_value = Optional.a();
        private Optional<SoundField> sound_field_value = Optional.a();
        private Optional<SoundEffect> sound_effect_value = Optional.a();
        private Optional<Common.ElectricityUnit> electricity_unit_value = Optional.a();

        public TabProperty() {
        }

        public Optional<Common.ElectricityUnit> getElectricityUnitValue() {
            return this.electricity_unit_value;
        }

        public Optional<HeadrestMode> getHeadrestModeValue() {
            return this.headrest_mode_value;
        }

        @Required
        public AutoPropertyName getName() {
            return this.name;
        }

        public Optional<SoundEffect> getSoundEffectValue() {
            return this.sound_effect_value;
        }

        public Optional<SoundField> getSoundFieldValue() {
            return this.sound_field_value;
        }

        public TabProperty setElectricityUnitValue(Common.ElectricityUnit electricityUnit) {
            this.electricity_unit_value = Optional.e(electricityUnit);
            return this;
        }

        public TabProperty setHeadrestModeValue(HeadrestMode headrestMode) {
            this.headrest_mode_value = Optional.e(headrestMode);
            return this;
        }

        @Required
        public TabProperty setName(AutoPropertyName autoPropertyName) {
            this.name = autoPropertyName;
            return this;
        }

        public TabProperty setSoundEffectValue(SoundEffect soundEffect) {
            this.sound_effect_value = Optional.e(soundEffect);
            return this;
        }

        public TabProperty setSoundFieldValue(SoundField soundField) {
            this.sound_field_value = Optional.e(soundField);
            return this;
        }

        public TabProperty(AutoPropertyName autoPropertyName) {
            this.name = autoPropertyName;
        }
    }

    @NamespaceName(name = "CheckDeviceStatus", namespace = AIApiConstants.AutoController.NAME)
    public static class CheckDeviceStatus implements InstructionPayload {

        @Required
        private String identifier;

        @Required
        private String name;
        private Optional<Attribute> attribute = Optional.a();
        private Optional<List<Position>> positions = Optional.a();
        private Optional<String> position_desc = Optional.a();
        private Optional<CheckType> check_type = Optional.a();
        private Optional<List<SlotDescription>> slot_description = Optional.a();
        private Optional<Direction> direction = Optional.a();

        public CheckDeviceStatus() {
        }

        public Optional<Attribute> getAttribute() {
            return this.attribute;
        }

        public Optional<CheckType> getCheckType() {
            return this.check_type;
        }

        public Optional<Direction> getDirection() {
            return this.direction;
        }

        @Required
        public String getIdentifier() {
            return this.identifier;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<String> getPositionDesc() {
            return this.position_desc;
        }

        public Optional<List<Position>> getPositions() {
            return this.positions;
        }

        public Optional<List<SlotDescription>> getSlotDescription() {
            return this.slot_description;
        }

        public CheckDeviceStatus setAttribute(Attribute attribute) {
            this.attribute = Optional.e(attribute);
            return this;
        }

        public CheckDeviceStatus setCheckType(CheckType checkType) {
            this.check_type = Optional.e(checkType);
            return this;
        }

        public CheckDeviceStatus setDirection(Direction direction) {
            this.direction = Optional.e(direction);
            return this;
        }

        @Required
        public CheckDeviceStatus setIdentifier(String str) {
            this.identifier = str;
            return this;
        }

        @Required
        public CheckDeviceStatus setName(String str) {
            this.name = str;
            return this;
        }

        public CheckDeviceStatus setPositionDesc(String str) {
            this.position_desc = Optional.e(str);
            return this;
        }

        public CheckDeviceStatus setPositions(List<Position> list) {
            this.positions = Optional.e(list);
            return this;
        }

        public CheckDeviceStatus setSlotDescription(List<SlotDescription> list) {
            this.slot_description = Optional.e(list);
            return this;
        }

        public CheckDeviceStatus(String str, String str2) {
            this.name = str;
            this.identifier = str2;
        }
    }

    @NamespaceName(name = "SetValueCombined", namespace = AIApiConstants.AutoController.NAME)
    public static class SetValueCombined implements InstructionPayload {

        @Required
        private String identifier;
        private Optional<Attribute> attribute = Optional.a();
        private Optional<Float> value = Optional.a();
        private Optional<List<Position>> positions = Optional.a();
        private Optional<String> name = Optional.a();
        private Optional<List<String>> need_open_identifiers = Optional.a();
        private Optional<List<String>> need_close_identifiers = Optional.a();

        public SetValueCombined() {
        }

        public Optional<Attribute> getAttribute() {
            return this.attribute;
        }

        @Required
        public String getIdentifier() {
            return this.identifier;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<List<String>> getNeedCloseIdentifiers() {
            return this.need_close_identifiers;
        }

        public Optional<List<String>> getNeedOpenIdentifiers() {
            return this.need_open_identifiers;
        }

        public Optional<List<Position>> getPositions() {
            return this.positions;
        }

        public Optional<Float> getValue() {
            return this.value;
        }

        public SetValueCombined setAttribute(Attribute attribute) {
            this.attribute = Optional.e(attribute);
            return this;
        }

        @Required
        public SetValueCombined setIdentifier(String str) {
            this.identifier = str;
            return this;
        }

        public SetValueCombined setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public SetValueCombined setNeedCloseIdentifiers(List<String> list) {
            this.need_close_identifiers = Optional.e(list);
            return this;
        }

        public SetValueCombined setNeedOpenIdentifiers(List<String> list) {
            this.need_open_identifiers = Optional.e(list);
            return this;
        }

        public SetValueCombined setPositions(List<Position> list) {
            this.positions = Optional.e(list);
            return this;
        }

        public SetValueCombined setValue(float f) {
            this.value = Optional.e(Float.valueOf(f));
            return this;
        }

        public SetValueCombined(String str) {
            this.identifier = str;
        }
    }

    public static class SeatStatus {

        @Required
        private Position position;
        private Optional<SeatMemoryPosition> current_position = Optional.a();
        private Optional<Boolean> is_flat = Optional.a();
        private Optional<Boolean> is_forward = Optional.a();
        private Optional<Boolean> is_occupied = Optional.a();
        private Optional<Boolean> is_exist_memory_position_1 = Optional.a();
        private Optional<Boolean> is_exist_memory_position_2 = Optional.a();
        private Optional<Boolean> is_exist_memory_position_3 = Optional.a();

        public SeatStatus() {
        }

        public Optional<SeatMemoryPosition> getCurrentPosition() {
            return this.current_position;
        }

        @Required
        public Position getPosition() {
            return this.position;
        }

        public Optional<Boolean> isExistMemoryPosition1() {
            return this.is_exist_memory_position_1;
        }

        public Optional<Boolean> isExistMemoryPosition2() {
            return this.is_exist_memory_position_2;
        }

        public Optional<Boolean> isExistMemoryPosition3() {
            return this.is_exist_memory_position_3;
        }

        public Optional<Boolean> isFlat() {
            return this.is_flat;
        }

        public Optional<Boolean> isForward() {
            return this.is_forward;
        }

        public Optional<Boolean> isOccupied() {
            return this.is_occupied;
        }

        public SeatStatus setCurrentPosition(SeatMemoryPosition seatMemoryPosition) {
            this.current_position = Optional.e(seatMemoryPosition);
            return this;
        }

        public SeatStatus setIsExistMemoryPosition1(boolean z) {
            this.is_exist_memory_position_1 = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public SeatStatus setIsExistMemoryPosition2(boolean z) {
            this.is_exist_memory_position_2 = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public SeatStatus setIsExistMemoryPosition3(boolean z) {
            this.is_exist_memory_position_3 = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public SeatStatus setIsFlat(boolean z) {
            this.is_flat = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public SeatStatus setIsForward(boolean z) {
            this.is_forward = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public SeatStatus setIsOccupied(boolean z) {
            this.is_occupied = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Required
        public SeatStatus setPosition(Position position) {
            this.position = position;
            return this;
        }

        public SeatStatus(Position position) {
            this.position = position;
        }
    }

    public static class Signal {

        @Required
        private int area_id;

        @Required
        private int prop_id;

        @Required
        private int status;
        private Optional<Float> value = Optional.a();
        private Optional<Integer> int_value = Optional.a();
        private Optional<String> string_value = Optional.a();
        private Optional<Byte> byte_value = Optional.a();
        private Optional<List<Integer>> int_list = Optional.a();
        private Optional<List<Float>> float_list = Optional.a();
        private Optional<List<Byte>> byte_list = Optional.a();
        private Optional<List<String>> string_list = Optional.a();

        public Signal() {
        }

        @Required
        public int getAreaId() {
            return this.area_id;
        }

        public Optional<List<Byte>> getByteList() {
            return this.byte_list;
        }

        public Optional<Byte> getByteValue() {
            return this.byte_value;
        }

        public Optional<List<Float>> getFloatList() {
            return this.float_list;
        }

        public Optional<List<Integer>> getIntList() {
            return this.int_list;
        }

        public Optional<Integer> getIntValue() {
            return this.int_value;
        }

        @Required
        public int getPropId() {
            return this.prop_id;
        }

        @Required
        public int getStatus() {
            return this.status;
        }

        public Optional<List<String>> getStringList() {
            return this.string_list;
        }

        public Optional<String> getStringValue() {
            return this.string_value;
        }

        public Optional<Float> getValue() {
            return this.value;
        }

        @Required
        public Signal setAreaId(int i) {
            this.area_id = i;
            return this;
        }

        public Signal setByteList(List<Byte> list) {
            this.byte_list = Optional.e(list);
            return this;
        }

        public Signal setByteValue(Byte b2) {
            this.byte_value = Optional.e(b2);
            return this;
        }

        public Signal setFloatList(List<Float> list) {
            this.float_list = Optional.e(list);
            return this;
        }

        public Signal setIntList(List<Integer> list) {
            this.int_list = Optional.e(list);
            return this;
        }

        public Signal setIntValue(int i) {
            this.int_value = Optional.e(Integer.valueOf(i));
            return this;
        }

        @Required
        public Signal setPropId(int i) {
            this.prop_id = i;
            return this;
        }

        @Required
        public Signal setStatus(int i) {
            this.status = i;
            return this;
        }

        public Signal setStringList(List<String> list) {
            this.string_list = Optional.e(list);
            return this;
        }

        public Signal setStringValue(String str) {
            this.string_value = Optional.e(str);
            return this;
        }

        public Signal setValue(float f) {
            this.value = Optional.e(Float.valueOf(f));
            return this;
        }

        public Signal(int i, int i2, int i3) {
            this.prop_id = i;
            this.area_id = i2;
            this.status = i3;
        }
    }

    @NamespaceName(name = "TurnOn", namespace = AIApiConstants.AutoController.NAME)
    public static class TurnOn implements InstructionPayload {

        @Required
        private String identifier;

        @Required
        private String name;

        @Deprecated
        private Optional<List<String>> identifiers = Optional.a();

        @Deprecated
        private Optional<Position> position = Optional.a();
        private Optional<List<Position>> positions = Optional.a();
        private Optional<Attribute> attribute = Optional.a();
        private Optional<String> position_desc = Optional.a();
        private Optional<Direction> direction = Optional.a();
        private Optional<Position> voice_region_position = Optional.a();
        private Optional<List<SlotDescription>> slot_description = Optional.a();

        public TurnOn() {
        }

        public Optional<Attribute> getAttribute() {
            return this.attribute;
        }

        public Optional<Direction> getDirection() {
            return this.direction;
        }

        @Required
        public String getIdentifier() {
            return this.identifier;
        }

        @Deprecated
        public Optional<List<String>> getIdentifiers() {
            return this.identifiers;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Deprecated
        public Optional<Position> getPosition() {
            return this.position;
        }

        public Optional<String> getPositionDesc() {
            return this.position_desc;
        }

        public Optional<List<Position>> getPositions() {
            return this.positions;
        }

        public Optional<List<SlotDescription>> getSlotDescription() {
            return this.slot_description;
        }

        public Optional<Position> getVoiceRegionPosition() {
            return this.voice_region_position;
        }

        public TurnOn setAttribute(Attribute attribute) {
            this.attribute = Optional.e(attribute);
            return this;
        }

        public TurnOn setDirection(Direction direction) {
            this.direction = Optional.e(direction);
            return this;
        }

        @Required
        public TurnOn setIdentifier(String str) {
            this.identifier = str;
            return this;
        }

        @Deprecated
        public TurnOn setIdentifiers(List<String> list) {
            this.identifiers = Optional.e(list);
            return this;
        }

        @Required
        public TurnOn setName(String str) {
            this.name = str;
            return this;
        }

        @Deprecated
        public TurnOn setPosition(Position position) {
            this.position = Optional.e(position);
            return this;
        }

        public TurnOn setPositionDesc(String str) {
            this.position_desc = Optional.e(str);
            return this;
        }

        public TurnOn setPositions(List<Position> list) {
            this.positions = Optional.e(list);
            return this;
        }

        public TurnOn setSlotDescription(List<SlotDescription> list) {
            this.slot_description = Optional.e(list);
            return this;
        }

        public TurnOn setVoiceRegionPosition(Position position) {
            this.voice_region_position = Optional.e(position);
            return this;
        }

        public TurnOn(String str, String str2) {
            this.name = str;
            this.identifier = str2;
        }
    }

    @NamespaceName(name = "TurnOff", namespace = AIApiConstants.AutoController.NAME)
    public static class TurnOff implements InstructionPayload {

        @Required
        private String identifier;

        @Required
        private String name;

        @Deprecated
        private Optional<List<String>> identifiers = Optional.a();

        @Deprecated
        private Optional<Position> position = Optional.a();
        private Optional<List<Position>> positions = Optional.a();
        private Optional<Attribute> attribute = Optional.a();
        private Optional<String> position_desc = Optional.a();
        private Optional<Direction> direction = Optional.a();
        private Optional<Common.LightMode> light_mode = Optional.a();
        private Optional<Common.BLNMode> bln_mode = Optional.a();
        private Optional<Common.DriveMode> drive_mode = Optional.a();
        private Optional<Common.DriveSceneMode> drive_scene_mode = Optional.a();
        private Optional<Common.CommonMode> common_mode = Optional.a();
        private Optional<Position> voice_region_position = Optional.a();
        private Optional<List<SlotDescription>> slot_description = Optional.a();

        public TurnOff() {
        }

        public Optional<Attribute> getAttribute() {
            return this.attribute;
        }

        public Optional<Common.BLNMode> getBlnMode() {
            return this.bln_mode;
        }

        public Optional<Common.CommonMode> getCommonMode() {
            return this.common_mode;
        }

        public Optional<Direction> getDirection() {
            return this.direction;
        }

        public Optional<Common.DriveMode> getDriveMode() {
            return this.drive_mode;
        }

        public Optional<Common.DriveSceneMode> getDriveSceneMode() {
            return this.drive_scene_mode;
        }

        @Required
        public String getIdentifier() {
            return this.identifier;
        }

        @Deprecated
        public Optional<List<String>> getIdentifiers() {
            return this.identifiers;
        }

        public Optional<Common.LightMode> getLightMode() {
            return this.light_mode;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Deprecated
        public Optional<Position> getPosition() {
            return this.position;
        }

        public Optional<String> getPositionDesc() {
            return this.position_desc;
        }

        public Optional<List<Position>> getPositions() {
            return this.positions;
        }

        public Optional<List<SlotDescription>> getSlotDescription() {
            return this.slot_description;
        }

        public Optional<Position> getVoiceRegionPosition() {
            return this.voice_region_position;
        }

        public TurnOff setAttribute(Attribute attribute) {
            this.attribute = Optional.e(attribute);
            return this;
        }

        public TurnOff setBlnMode(Common.BLNMode bLNMode) {
            this.bln_mode = Optional.e(bLNMode);
            return this;
        }

        public TurnOff setCommonMode(Common.CommonMode commonMode) {
            this.common_mode = Optional.e(commonMode);
            return this;
        }

        public TurnOff setDirection(Direction direction) {
            this.direction = Optional.e(direction);
            return this;
        }

        public TurnOff setDriveMode(Common.DriveMode driveMode) {
            this.drive_mode = Optional.e(driveMode);
            return this;
        }

        public TurnOff setDriveSceneMode(Common.DriveSceneMode driveSceneMode) {
            this.drive_scene_mode = Optional.e(driveSceneMode);
            return this;
        }

        @Required
        public TurnOff setIdentifier(String str) {
            this.identifier = str;
            return this;
        }

        @Deprecated
        public TurnOff setIdentifiers(List<String> list) {
            this.identifiers = Optional.e(list);
            return this;
        }

        public TurnOff setLightMode(Common.LightMode lightMode) {
            this.light_mode = Optional.e(lightMode);
            return this;
        }

        @Required
        public TurnOff setName(String str) {
            this.name = str;
            return this;
        }

        @Deprecated
        public TurnOff setPosition(Position position) {
            this.position = Optional.e(position);
            return this;
        }

        public TurnOff setPositionDesc(String str) {
            this.position_desc = Optional.e(str);
            return this;
        }

        public TurnOff setPositions(List<Position> list) {
            this.positions = Optional.e(list);
            return this;
        }

        public TurnOff setSlotDescription(List<SlotDescription> list) {
            this.slot_description = Optional.e(list);
            return this;
        }

        public TurnOff setVoiceRegionPosition(Position position) {
            this.voice_region_position = Optional.e(position);
            return this;
        }

        public TurnOff(String str, String str2) {
            this.name = str;
            this.identifier = str2;
        }
    }

    public static class SignalRequest {

        @Required
        private int area_id;

        @Required
        private int prop_id;
        private Optional<Integer> unit_prop_id = Optional.a();
        private Optional<Integer> unit_area_id = Optional.a();
        private Optional<Integer> exception_prop_id = Optional.a();
        private Optional<Integer> exception_area_id = Optional.a();
        private Optional<Integer> configure_prop_id = Optional.a();
        private Optional<Integer> configure_area_id = Optional.a();
        private Optional<List<Integer>> disable_configure_value = Optional.a();
        private Optional<String> name = Optional.a();
        private Optional<String> category = Optional.a();
        private Optional<String> signal_id = Optional.a();
        private Optional<SignalValueType> value_type = Optional.a();
        private Optional<SignalValueType> unit_value_type = Optional.a();
        private Optional<SignalValueType> configure_value_type = Optional.a();
        private Optional<SignalValueType> exception_value_type = Optional.a();

        public SignalRequest() {
        }

        @Required
        public int getAreaId() {
            return this.area_id;
        }

        public Optional<String> getCategory() {
            return this.category;
        }

        public Optional<Integer> getConfigureAreaId() {
            return this.configure_area_id;
        }

        public Optional<Integer> getConfigurePropId() {
            return this.configure_prop_id;
        }

        public Optional<SignalValueType> getConfigureValueType() {
            return this.configure_value_type;
        }

        public Optional<List<Integer>> getDisableConfigureValue() {
            return this.disable_configure_value;
        }

        public Optional<Integer> getExceptionAreaId() {
            return this.exception_area_id;
        }

        public Optional<Integer> getExceptionPropId() {
            return this.exception_prop_id;
        }

        public Optional<SignalValueType> getExceptionValueType() {
            return this.exception_value_type;
        }

        public Optional<String> getName() {
            return this.name;
        }

        @Required
        public int getPropId() {
            return this.prop_id;
        }

        public Optional<String> getSignalId() {
            return this.signal_id;
        }

        public Optional<Integer> getUnitAreaId() {
            return this.unit_area_id;
        }

        public Optional<Integer> getUnitPropId() {
            return this.unit_prop_id;
        }

        public Optional<SignalValueType> getUnitValueType() {
            return this.unit_value_type;
        }

        public Optional<SignalValueType> getValueType() {
            return this.value_type;
        }

        @Required
        public SignalRequest setAreaId(int i) {
            this.area_id = i;
            return this;
        }

        public SignalRequest setCategory(String str) {
            this.category = Optional.e(str);
            return this;
        }

        public SignalRequest setConfigureAreaId(int i) {
            this.configure_area_id = Optional.e(Integer.valueOf(i));
            return this;
        }

        public SignalRequest setConfigurePropId(int i) {
            this.configure_prop_id = Optional.e(Integer.valueOf(i));
            return this;
        }

        public SignalRequest setConfigureValueType(SignalValueType signalValueType) {
            this.configure_value_type = Optional.e(signalValueType);
            return this;
        }

        public SignalRequest setDisableConfigureValue(List<Integer> list) {
            this.disable_configure_value = Optional.e(list);
            return this;
        }

        public SignalRequest setExceptionAreaId(int i) {
            this.exception_area_id = Optional.e(Integer.valueOf(i));
            return this;
        }

        public SignalRequest setExceptionPropId(int i) {
            this.exception_prop_id = Optional.e(Integer.valueOf(i));
            return this;
        }

        public SignalRequest setExceptionValueType(SignalValueType signalValueType) {
            this.exception_value_type = Optional.e(signalValueType);
            return this;
        }

        public SignalRequest setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        @Required
        public SignalRequest setPropId(int i) {
            this.prop_id = i;
            return this;
        }

        public SignalRequest setSignalId(String str) {
            this.signal_id = Optional.e(str);
            return this;
        }

        public SignalRequest setUnitAreaId(int i) {
            this.unit_area_id = Optional.e(Integer.valueOf(i));
            return this;
        }

        public SignalRequest setUnitPropId(int i) {
            this.unit_prop_id = Optional.e(Integer.valueOf(i));
            return this;
        }

        public SignalRequest setUnitValueType(SignalValueType signalValueType) {
            this.unit_value_type = Optional.e(signalValueType);
            return this;
        }

        public SignalRequest setValueType(SignalValueType signalValueType) {
            this.value_type = Optional.e(signalValueType);
            return this;
        }

        public SignalRequest(int i, int i2) {
            this.prop_id = i;
            this.area_id = i2;
        }
    }

    @NamespaceName(name = "SetValue", namespace = AIApiConstants.AutoController.NAME)
    public static class SetValue implements InstructionPayload {

        @Required
        private String identifier;
        private Optional<Attribute> attribute = Optional.a();
        private Optional<Float> value = Optional.a();
        private Optional<Float> delta = Optional.a();
        private Optional<AdjustState> state = Optional.a();
        private Optional<List<Position>> positions = Optional.a();
        private Optional<String> position_desc = Optional.a();
        private Optional<Common.Color> color_value = Optional.a();
        private Optional<Common.LightMode> light_mode = Optional.a();
        private Optional<Common.BLNMode> bln_mode = Optional.a();
        private Optional<Common.DriveMode> drive_mode = Optional.a();
        private Optional<Common.DriveSceneMode> drive_scene_mode = Optional.a();
        private Optional<Common.CommonMode> common_mode = Optional.a();
        private Optional<Direction> direction = Optional.a();
        private Optional<String> name = Optional.a();
        private Optional<Common.RhythmType> rhythm_type = Optional.a();
        private Optional<ExteriorLightState> exterior_light_state = Optional.a();
        private Optional<Position> voice_region_position = Optional.a();
        private Optional<List<SlotDescription>> slot_description = Optional.a();
        private Optional<FragranceType> fragrance_type = Optional.a();

        public SetValue() {
        }

        public Optional<Attribute> getAttribute() {
            return this.attribute;
        }

        public Optional<Common.BLNMode> getBlnMode() {
            return this.bln_mode;
        }

        public Optional<Common.Color> getColorValue() {
            return this.color_value;
        }

        public Optional<Common.CommonMode> getCommonMode() {
            return this.common_mode;
        }

        public Optional<Float> getDelta() {
            return this.delta;
        }

        public Optional<Direction> getDirection() {
            return this.direction;
        }

        public Optional<Common.DriveMode> getDriveMode() {
            return this.drive_mode;
        }

        public Optional<Common.DriveSceneMode> getDriveSceneMode() {
            return this.drive_scene_mode;
        }

        public Optional<ExteriorLightState> getExteriorLightState() {
            return this.exterior_light_state;
        }

        public Optional<FragranceType> getFragranceType() {
            return this.fragrance_type;
        }

        @Required
        public String getIdentifier() {
            return this.identifier;
        }

        public Optional<Common.LightMode> getLightMode() {
            return this.light_mode;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<String> getPositionDesc() {
            return this.position_desc;
        }

        public Optional<List<Position>> getPositions() {
            return this.positions;
        }

        public Optional<Common.RhythmType> getRhythmType() {
            return this.rhythm_type;
        }

        public Optional<List<SlotDescription>> getSlotDescription() {
            return this.slot_description;
        }

        public Optional<AdjustState> getState() {
            return this.state;
        }

        public Optional<Float> getValue() {
            return this.value;
        }

        public Optional<Position> getVoiceRegionPosition() {
            return this.voice_region_position;
        }

        public SetValue setAttribute(Attribute attribute) {
            this.attribute = Optional.e(attribute);
            return this;
        }

        public SetValue setBlnMode(Common.BLNMode bLNMode) {
            this.bln_mode = Optional.e(bLNMode);
            return this;
        }

        public SetValue setColorValue(Common.Color color) {
            this.color_value = Optional.e(color);
            return this;
        }

        public SetValue setCommonMode(Common.CommonMode commonMode) {
            this.common_mode = Optional.e(commonMode);
            return this;
        }

        public SetValue setDelta(float f) {
            this.delta = Optional.e(Float.valueOf(f));
            return this;
        }

        public SetValue setDirection(Direction direction) {
            this.direction = Optional.e(direction);
            return this;
        }

        public SetValue setDriveMode(Common.DriveMode driveMode) {
            this.drive_mode = Optional.e(driveMode);
            return this;
        }

        public SetValue setDriveSceneMode(Common.DriveSceneMode driveSceneMode) {
            this.drive_scene_mode = Optional.e(driveSceneMode);
            return this;
        }

        public SetValue setExteriorLightState(ExteriorLightState exteriorLightState) {
            this.exterior_light_state = Optional.e(exteriorLightState);
            return this;
        }

        public SetValue setFragranceType(FragranceType fragranceType) {
            this.fragrance_type = Optional.e(fragranceType);
            return this;
        }

        @Required
        public SetValue setIdentifier(String str) {
            this.identifier = str;
            return this;
        }

        public SetValue setLightMode(Common.LightMode lightMode) {
            this.light_mode = Optional.e(lightMode);
            return this;
        }

        public SetValue setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public SetValue setPositionDesc(String str) {
            this.position_desc = Optional.e(str);
            return this;
        }

        public SetValue setPositions(List<Position> list) {
            this.positions = Optional.e(list);
            return this;
        }

        public SetValue setRhythmType(Common.RhythmType rhythmType) {
            this.rhythm_type = Optional.e(rhythmType);
            return this;
        }

        public SetValue setSlotDescription(List<SlotDescription> list) {
            this.slot_description = Optional.e(list);
            return this;
        }

        public SetValue setState(AdjustState adjustState) {
            this.state = Optional.e(adjustState);
            return this;
        }

        public SetValue setValue(float f) {
            this.value = Optional.e(Float.valueOf(f));
            return this;
        }

        public SetValue setVoiceRegionPosition(Position position) {
            this.voice_region_position = Optional.e(position);
            return this;
        }

        public SetValue(String str) {
            this.identifier = str;
        }
    }
}
