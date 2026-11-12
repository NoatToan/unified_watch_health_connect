package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import java.util.List;
import org.cybergarage.upnp.std.av.renderer.RenderingControl;

/* JADX INFO: loaded from: classes18.dex */
public class AutoController {

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

    @NamespaceName(name = "AdjustACTemperature", namespace = AIApiConstants.AutoController.NAME)
    public static class AdjustACTemperature implements InstructionPayload {
        private Optional<Position> position = Optional.empty();

        @Deprecated
        private Optional<Integer> value = Optional.empty();
        private Optional<Float> decimal_value = Optional.empty();
        private Optional<AdjustState> state = Optional.empty();

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
            this.decimal_value = Optional.ofNullable(Float.valueOf(f));
            return this;
        }

        public AdjustACTemperature setPosition(Position position) {
            this.position = Optional.ofNullable(position);
            return this;
        }

        public AdjustACTemperature setState(AdjustState adjustState) {
            this.state = Optional.ofNullable(adjustState);
            return this;
        }

        @Deprecated
        public AdjustACTemperature setValue(int i) {
            this.value = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "AdjustACWindSpeed", namespace = AIApiConstants.AutoController.NAME)
    public static class AdjustACWindSpeed implements InstructionPayload {
        private Optional<Position> position = Optional.empty();
        private Optional<Integer> value = Optional.empty();
        private Optional<AdjustState> state = Optional.empty();

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
            this.position = Optional.ofNullable(position);
            return this;
        }

        public AdjustACWindSpeed setState(AdjustState adjustState) {
            this.state = Optional.ofNullable(adjustState);
            return this;
        }

        public AdjustACWindSpeed setValue(int i) {
            this.value = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "AdjustBrightness", namespace = AIApiConstants.AutoController.NAME)
    public static class AdjustBrightness implements InstructionPayload {

        @Required
        private String identifier;

        @Required
        private String name;
        private Optional<AdjustState> state = Optional.empty();

        @Required
        private int value;

        public AdjustBrightness() {
        }

        public AdjustBrightness(String str, String str2, int i) {
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
            this.state = Optional.ofNullable(adjustState);
            return this;
        }

        @Required
        public AdjustBrightness setValue(int i) {
            this.value = i;
            return this;
        }
    }

    @NamespaceName(name = "AdjustHeight", namespace = AIApiConstants.AutoController.NAME)
    public static class AdjustHeight implements InstructionPayload {

        @Required
        private String identifier;

        @Required
        private String name;
        private Optional<AdjustState> state = Optional.empty();

        @Required
        private int value;

        public AdjustHeight() {
        }

        public AdjustHeight(String str, String str2, int i) {
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
            this.state = Optional.ofNullable(adjustState);
            return this;
        }

        @Required
        public AdjustHeight setValue(int i) {
            this.value = i;
            return this;
        }
    }

    @NamespaceName(name = "AdjustSeat", namespace = AIApiConstants.AutoController.NAME)
    public static class AdjustSeat implements InstructionPayload {

        @Required
        private Position position;
        private Optional<AdjustState> state = Optional.empty();

        @Required
        private SeatUnit unit;

        @Required
        private int value;

        public AdjustSeat() {
        }

        public AdjustSeat(Position position, SeatUnit seatUnit, int i) {
            this.position = position;
            this.unit = seatUnit;
            this.value = i;
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
            this.state = Optional.ofNullable(adjustState);
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
    }

    @NamespaceName(name = "AdjustSeatTemperature", namespace = AIApiConstants.AutoController.NAME)
    public static class AdjustSeatTemperature implements InstructionPayload {
        private Optional<Position> position = Optional.empty();

        @Deprecated
        private Optional<Integer> value = Optional.empty();
        private Optional<Float> decimal_value = Optional.empty();
        private Optional<AdjustState> state = Optional.empty();

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
            this.decimal_value = Optional.ofNullable(Float.valueOf(f));
            return this;
        }

        public AdjustSeatTemperature setPosition(Position position) {
            this.position = Optional.ofNullable(position);
            return this;
        }

        public AdjustSeatTemperature setState(AdjustState adjustState) {
            this.state = Optional.ofNullable(adjustState);
            return this;
        }

        @Deprecated
        public AdjustSeatTemperature setValue(int i) {
            this.value = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "AdjustSeatWindSpeed", namespace = AIApiConstants.AutoController.NAME)
    public static class AdjustSeatWindSpeed implements InstructionPayload {
        private Optional<Position> position = Optional.empty();
        private Optional<Integer> value = Optional.empty();
        private Optional<AdjustState> state = Optional.empty();

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
            this.position = Optional.ofNullable(position);
            return this;
        }

        public AdjustSeatWindSpeed setState(AdjustState adjustState) {
            this.state = Optional.ofNullable(adjustState);
            return this;
        }

        public AdjustSeatWindSpeed setValue(int i) {
            this.value = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }
    }

    public enum AdjustState {
        UNKNOWN(-1),
        UP(0),
        DOWN(1),
        MAX(2),
        MIN(3);

        private int id;

        AdjustState(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "AdjustSunroofStepless", namespace = AIApiConstants.AutoController.NAME)
    public static class AdjustSunroofStepless implements InstructionPayload {
        private Optional<AdjustState> state = Optional.empty();

        @Required
        private int value;

        public AdjustSunroofStepless() {
        }

        public AdjustSunroofStepless(int i) {
            this.value = i;
        }

        public Optional<AdjustState> getState() {
            return this.state;
        }

        @Required
        public int getValue() {
            return this.value;
        }

        public AdjustSunroofStepless setState(AdjustState adjustState) {
            this.state = Optional.ofNullable(adjustState);
            return this;
        }

        @Required
        public AdjustSunroofStepless setValue(int i) {
            this.value = i;
            return this;
        }
    }

    @NamespaceName(name = "AdjustSunshade", namespace = AIApiConstants.AutoController.NAME)
    public static class AdjustSunshade implements InstructionPayload {
        private Optional<AdjustState> state = Optional.empty();

        @Required
        private int value;

        public AdjustSunshade() {
        }

        public AdjustSunshade(int i) {
            this.value = i;
        }

        public Optional<AdjustState> getState() {
            return this.state;
        }

        @Required
        public int getValue() {
            return this.value;
        }

        public AdjustSunshade setState(AdjustState adjustState) {
            this.state = Optional.ofNullable(adjustState);
            return this;
        }

        @Required
        public AdjustSunshade setValue(int i) {
            this.value = i;
            return this;
        }
    }

    @NamespaceName(name = "AdjustWindow", namespace = AIApiConstants.AutoController.NAME)
    public static class AdjustWindow implements InstructionPayload {

        @Required
        private Position position;

        @Required
        private AdjustState state;
        private Optional<Integer> step = Optional.empty();

        public AdjustWindow() {
        }

        public AdjustWindow(Position position, AdjustState adjustState) {
            this.position = position;
            this.state = adjustState;
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
            this.step = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "AdjustWiperSpeed", namespace = AIApiConstants.AutoController.NAME)
    public static class AdjustWiperSpeed implements InstructionPayload {
        private Optional<Position> position = Optional.empty();
        private Optional<AdjustState> state = Optional.empty();

        @Required
        private int value;

        public AdjustWiperSpeed() {
        }

        public AdjustWiperSpeed(int i) {
            this.value = i;
        }

        public Optional<Position> getPosition() {
            return this.position;
        }

        public Optional<AdjustState> getState() {
            return this.state;
        }

        @Required
        public int getValue() {
            return this.value;
        }

        public AdjustWiperSpeed setPosition(Position position) {
            this.position = Optional.ofNullable(position);
            return this;
        }

        public AdjustWiperSpeed setState(AdjustState adjustState) {
            this.state = Optional.ofNullable(adjustState);
            return this;
        }

        @Required
        public AdjustWiperSpeed setValue(int i) {
            this.value = i;
            return this;
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
        RIGHT_WINDOW(12);

        private int id;

        Position(int i) {
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

    @NamespaceName(name = "SetACMode", namespace = AIApiConstants.AutoController.NAME)
    public static class SetACMode implements InstructionPayload {

        @Required
        private List<AirConditioningMode> mode;
        private Optional<Position> position = Optional.empty();

        public SetACMode() {
        }

        public SetACMode(List<AirConditioningMode> list) {
            this.mode = list;
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
            this.position = Optional.ofNullable(position);
            return this;
        }
    }

    @NamespaceName(name = "SetACTemperature", namespace = AIApiConstants.AutoController.NAME)
    public static class SetACTemperature implements InstructionPayload {
        private Optional<Position> position = Optional.empty();

        @Deprecated
        private Optional<Integer> value = Optional.empty();
        private Optional<Float> decimal_value = Optional.empty();

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
            this.decimal_value = Optional.ofNullable(Float.valueOf(f));
            return this;
        }

        public SetACTemperature setPosition(Position position) {
            this.position = Optional.ofNullable(position);
            return this;
        }

        @Deprecated
        public SetACTemperature setValue(int i) {
            this.value = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "SetACWindSpeed", namespace = AIApiConstants.AutoController.NAME)
    public static class SetACWindSpeed implements InstructionPayload {
        private Optional<Position> position = Optional.empty();
        private Optional<Integer> value = Optional.empty();

        public Optional<Position> getPosition() {
            return this.position;
        }

        public Optional<Integer> getValue() {
            return this.value;
        }

        public SetACWindSpeed setPosition(Position position) {
            this.position = Optional.ofNullable(position);
            return this;
        }

        public SetACWindSpeed setValue(int i) {
            this.value = Optional.ofNullable(Integer.valueOf(i));
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

    @NamespaceName(name = RenderingControl.SETBRIGHTNESS, namespace = AIApiConstants.AutoController.NAME)
    public static class SetBrightness implements InstructionPayload {

        @Required
        private String identifier;
        private Optional<String> level = Optional.empty();

        @Required
        private String name;

        @Required
        private int value;

        public SetBrightness() {
        }

        public SetBrightness(String str, String str2, int i) {
            this.name = str;
            this.identifier = str2;
            this.value = i;
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
            this.level = Optional.ofNullable(str);
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

    @NamespaceName(name = "SetSeatMode", namespace = AIApiConstants.AutoController.NAME)
    public static class SetSeatMode implements InstructionPayload {

        @Required
        private SeatMode mode;

        @Required
        private Position position;
        private Optional<SeatUnit> unit = Optional.empty();

        public SetSeatMode() {
        }

        public SetSeatMode(Position position, SeatMode seatMode) {
            this.position = position;
            this.mode = seatMode;
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
            this.unit = Optional.ofNullable(seatUnit);
            return this;
        }
    }

    @NamespaceName(name = "SetSeatTemperature", namespace = AIApiConstants.AutoController.NAME)
    public static class SetSeatTemperature implements InstructionPayload {
        private Optional<Position> position = Optional.empty();

        @Deprecated
        private Optional<Integer> value = Optional.empty();
        private Optional<Float> decimal_value = Optional.empty();
        private Optional<LevelType> level = Optional.empty();

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
            this.decimal_value = Optional.ofNullable(Float.valueOf(f));
            return this;
        }

        public SetSeatTemperature setLevel(LevelType levelType) {
            this.level = Optional.ofNullable(levelType);
            return this;
        }

        public SetSeatTemperature setPosition(Position position) {
            this.position = Optional.ofNullable(position);
            return this;
        }

        @Deprecated
        public SetSeatTemperature setValue(int i) {
            this.value = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "SetSeatWindSpeed", namespace = AIApiConstants.AutoController.NAME)
    public static class SetSeatWindSpeed implements InstructionPayload {
        private Optional<Position> position = Optional.empty();
        private Optional<Integer> value = Optional.empty();

        public Optional<Position> getPosition() {
            return this.position;
        }

        public Optional<Integer> getValue() {
            return this.value;
        }

        public SetSeatWindSpeed setPosition(Position position) {
            this.position = Optional.ofNullable(position);
            return this;
        }

        public SetSeatWindSpeed setValue(int i) {
            this.value = Optional.ofNullable(Integer.valueOf(i));
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

    @NamespaceName(name = "SetWindow", namespace = AIApiConstants.AutoController.NAME)
    public static class SetWindow implements InstructionPayload {
        private Optional<List<Position>> more_position = Optional.empty();

        @Required
        private Position position;

        @Required
        private int value;

        public SetWindow() {
        }

        public SetWindow(Position position, int i) {
            this.position = position;
            this.value = i;
        }

        public Optional<List<Position>> getMorePosition() {
            return this.more_position;
        }

        @Required
        public Position getPosition() {
            return this.position;
        }

        @Required
        public int getValue() {
            return this.value;
        }

        public SetWindow setMorePosition(List<Position> list) {
            this.more_position = Optional.ofNullable(list);
            return this;
        }

        @Required
        public SetWindow setPosition(Position position) {
            this.position = position;
            return this;
        }

        @Required
        public SetWindow setValue(int i) {
            this.value = i;
            return this;
        }
    }

    @NamespaceName(name = "SetWiperMode", namespace = AIApiConstants.AutoController.NAME)
    public static class SetWiperMode implements InstructionPayload {

        @Required
        private WiperMode mode;
        private Optional<Position> position = Optional.empty();

        public SetWiperMode() {
        }

        public SetWiperMode(WiperMode wiperMode) {
            this.mode = wiperMode;
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
            this.position = Optional.ofNullable(position);
            return this;
        }
    }

    @NamespaceName(name = "SetWiperSpeed", namespace = AIApiConstants.AutoController.NAME)
    public static class SetWiperSpeed implements InstructionPayload {
        private Optional<Position> position = Optional.empty();

        @Required
        private int value;

        public SetWiperSpeed() {
        }

        public SetWiperSpeed(int i) {
            this.value = i;
        }

        public Optional<Position> getPosition() {
            return this.position;
        }

        @Required
        public int getValue() {
            return this.value;
        }

        public SetWiperSpeed setPosition(Position position) {
            this.position = Optional.ofNullable(position);
            return this;
        }

        @Required
        public SetWiperSpeed setValue(int i) {
            this.value = i;
            return this;
        }
    }

    @NamespaceName(name = "Stop", namespace = AIApiConstants.AutoController.NAME)
    public static class Stop implements InstructionPayload {

        @Required
        private String identifier;

        @Required
        private String name;

        public Stop() {
        }

        public Stop(String str, String str2) {
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
        public Stop setIdentifier(String str) {
            this.identifier = str;
            return this;
        }

        @Required
        public Stop setName(String str) {
            this.name = str;
            return this;
        }
    }

    @NamespaceName(name = "SwitchACMode", namespace = AIApiConstants.AutoController.NAME)
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

    @NamespaceName(name = "TurnOff", namespace = AIApiConstants.AutoController.NAME)
    public static class TurnOff implements InstructionPayload {

        @Required
        private String identifier;

        @Required
        private String name;
        private Optional<List<String>> identifiers = Optional.empty();
        private Optional<Position> position = Optional.empty();

        public TurnOff() {
        }

        public TurnOff(String str, String str2) {
            this.name = str;
            this.identifier = str2;
        }

        @Required
        public String getIdentifier() {
            return this.identifier;
        }

        public Optional<List<String>> getIdentifiers() {
            return this.identifiers;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<Position> getPosition() {
            return this.position;
        }

        @Required
        public TurnOff setIdentifier(String str) {
            this.identifier = str;
            return this;
        }

        public TurnOff setIdentifiers(List<String> list) {
            this.identifiers = Optional.ofNullable(list);
            return this;
        }

        @Required
        public TurnOff setName(String str) {
            this.name = str;
            return this;
        }

        public TurnOff setPosition(Position position) {
            this.position = Optional.ofNullable(position);
            return this;
        }
    }

    @NamespaceName(name = "TurnOn", namespace = AIApiConstants.AutoController.NAME)
    public static class TurnOn implements InstructionPayload {

        @Required
        private String identifier;

        @Required
        private String name;
        private Optional<List<String>> identifiers = Optional.empty();
        private Optional<Position> position = Optional.empty();

        public TurnOn() {
        }

        public TurnOn(String str, String str2) {
            this.name = str;
            this.identifier = str2;
        }

        @Required
        public String getIdentifier() {
            return this.identifier;
        }

        public Optional<List<String>> getIdentifiers() {
            return this.identifiers;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<Position> getPosition() {
            return this.position;
        }

        @Required
        public TurnOn setIdentifier(String str) {
            this.identifier = str;
            return this;
        }

        public TurnOn setIdentifiers(List<String> list) {
            this.identifiers = Optional.ofNullable(list);
            return this;
        }

        @Required
        public TurnOn setName(String str) {
            this.name = str;
            return this;
        }

        public TurnOn setPosition(Position position) {
            this.position = Optional.ofNullable(position);
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
}
