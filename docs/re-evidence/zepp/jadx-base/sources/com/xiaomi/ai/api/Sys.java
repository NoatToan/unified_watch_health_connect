package com.xiaomi.ai.api;

import com.amazon.alexa.avs.AVSAPIConstants;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class Sys {

    @NamespaceName(name = "Ack", namespace = "System")
    public static class Ack implements EventPayload {

        @Required
        private String id;

        @Required
        private String type;

        public Ack() {
        }

        public Ack(String str, String str2) {
            this.id = str;
            this.type = str2;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public String getType() {
            return this.type;
        }

        @Required
        public Ack setId(String str) {
            this.id = str;
            return this;
        }

        @Required
        public Ack setType(String str) {
            this.type = str;
            return this;
        }
    }

    public enum ApplicationDeviceRunningMode {
        Unknown(-1),
        SoundBox(0),
        TV(1),
        BlueTooth(2),
        Automotive(3);

        private int id;

        ApplicationDeviceRunningMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum ApplicationLevelMode {
        Standard(0),
        Kids(1),
        Simple(2),
        Office(3);

        private int id;

        ApplicationLevelMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class ApplicationMode {

        @Required
        private ApplicationLevelMode application;

        @Required
        private ApplicationDeviceRunningMode device_running;

        public ApplicationMode() {
        }

        public ApplicationMode(ApplicationDeviceRunningMode applicationDeviceRunningMode, ApplicationLevelMode applicationLevelMode) {
            this.device_running = applicationDeviceRunningMode;
            this.application = applicationLevelMode;
        }

        @Required
        public ApplicationLevelMode getApplication() {
            return this.application;
        }

        @Required
        public ApplicationDeviceRunningMode getDeviceRunning() {
            return this.device_running;
        }

        @Required
        public ApplicationMode setApplication(ApplicationLevelMode applicationLevelMode) {
            this.application = applicationLevelMode;
            return this;
        }

        @Required
        public ApplicationMode setDeviceRunning(ApplicationDeviceRunningMode applicationDeviceRunningMode) {
            this.device_running = applicationDeviceRunningMode;
            return this;
        }
    }

    @NamespaceName(name = "AudioStore", namespace = "System")
    public static class AudioStore implements EventPayload {
    }

    @NamespaceName(name = "AudioStoreStreamFinished", namespace = "System")
    public static class AudioStoreStreamFinished implements EventPayload {
    }

    @NamespaceName(name = "AutoLock", namespace = "System")
    public static class AutoLock implements InstructionPayload {
        private Optional<Integer> delay = Optional.empty();

        public Optional<Integer> getDelay() {
            return this.delay;
        }

        public AutoLock setDelay(int i) {
            this.delay = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }
    }

    public enum BluetoothConnectState {
        UNKNOWN(-1),
        DEVICE_CONNECT_DISCONNECT(0),
        DEVICE_CONNECT_NORMAL(1),
        DEVICE_CONNECT_LOW_BATTERY(2),
        DEVICE_CONNECT_UPDATE(3),
        DEVICE_CONNECT_WAIT(4);

        private int id;

        BluetoothConnectState(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class BluetoothDeviceElectricInfo {
        private Optional<BluetoothDeviceElectricType> electric_type = Optional.empty();
        private Optional<Integer> electric_value = Optional.empty();
        private Optional<String> electri_unit = Optional.empty();

        public Optional<String> getElectriUnit() {
            return this.electri_unit;
        }

        public Optional<BluetoothDeviceElectricType> getElectricType() {
            return this.electric_type;
        }

        public Optional<Integer> getElectricValue() {
            return this.electric_value;
        }

        public BluetoothDeviceElectricInfo setElectriUnit(String str) {
            this.electri_unit = Optional.ofNullable(str);
            return this;
        }

        public BluetoothDeviceElectricInfo setElectricType(BluetoothDeviceElectricType bluetoothDeviceElectricType) {
            this.electric_type = Optional.ofNullable(bluetoothDeviceElectricType);
            return this;
        }

        public BluetoothDeviceElectricInfo setElectricValue(int i) {
            this.electric_value = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }
    }

    public enum BluetoothDeviceElectricType {
        UNKNOWN(-1),
        R(0),
        L(1);

        private int id;

        BluetoothDeviceElectricType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "BluetoothDeviceInfo", namespace = "System")
    public static class BluetoothDeviceInfo {
        private Optional<String> classic_address = Optional.empty();
        private Optional<String> ble_address = Optional.empty();
        private Optional<BluetoothConnectState> connect_state = Optional.empty();
        private Optional<String> device_name = Optional.empty();
        private Optional<String> icon_url = Optional.empty();
        private Optional<List<BluetoothDeviceElectricInfo>> electric_infos = Optional.empty();
        private Optional<BluetoothDeviceType> device_type = Optional.empty();

        public Optional<String> getBleAddress() {
            return this.ble_address;
        }

        public Optional<String> getClassicAddress() {
            return this.classic_address;
        }

        public Optional<BluetoothConnectState> getConnectState() {
            return this.connect_state;
        }

        public Optional<String> getDeviceName() {
            return this.device_name;
        }

        public Optional<BluetoothDeviceType> getDeviceType() {
            return this.device_type;
        }

        public Optional<List<BluetoothDeviceElectricInfo>> getElectricInfos() {
            return this.electric_infos;
        }

        public Optional<String> getIconUrl() {
            return this.icon_url;
        }

        public BluetoothDeviceInfo setBleAddress(String str) {
            this.ble_address = Optional.ofNullable(str);
            return this;
        }

        public BluetoothDeviceInfo setClassicAddress(String str) {
            this.classic_address = Optional.ofNullable(str);
            return this;
        }

        public BluetoothDeviceInfo setConnectState(BluetoothConnectState bluetoothConnectState) {
            this.connect_state = Optional.ofNullable(bluetoothConnectState);
            return this;
        }

        public BluetoothDeviceInfo setDeviceName(String str) {
            this.device_name = Optional.ofNullable(str);
            return this;
        }

        public BluetoothDeviceInfo setDeviceType(BluetoothDeviceType bluetoothDeviceType) {
            this.device_type = Optional.ofNullable(bluetoothDeviceType);
            return this;
        }

        public BluetoothDeviceInfo setElectricInfos(List<BluetoothDeviceElectricInfo> list) {
            this.electric_infos = Optional.ofNullable(list);
            return this;
        }

        public BluetoothDeviceInfo setIconUrl(String str) {
            this.icon_url = Optional.ofNullable(str);
            return this;
        }
    }

    public enum BluetoothDeviceType {
        UNKNOWN(-1),
        OTHER(0),
        EARPHONE(1),
        SOUND_BOX(2);

        private int id;

        BluetoothDeviceType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "ChangeVoiceAssistantLogo", namespace = "System")
    public static class ChangeVoiceAssistantLogo implements InstructionPayload {

        @Required
        private String name;

        @Required
        private String sha1;

        @Required
        private String url;

        public ChangeVoiceAssistantLogo() {
        }

        public ChangeVoiceAssistantLogo(String str, String str2, String str3) {
            this.name = str;
            this.sha1 = str2;
            this.url = str3;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public String getSha1() {
            return this.sha1;
        }

        @Required
        public String getUrl() {
            return this.url;
        }

        @Required
        public ChangeVoiceAssistantLogo setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public ChangeVoiceAssistantLogo setSha1(String str) {
            this.sha1 = str;
            return this;
        }

        @Required
        public ChangeVoiceAssistantLogo setUrl(String str) {
            this.url = str;
            return this;
        }
    }

    @NamespaceName(name = "CheckScreenUnlocked", namespace = "System")
    public static class CheckScreenUnlocked implements InstructionPayload {
    }

    @NamespaceName(name = "ClientPing", namespace = "System")
    public static class ClientPing implements EventPayload {
    }

    public enum DeviceAppliedScenario {
        HOTEL(0),
        GOVERNMENT(1),
        SCHOOL(2),
        HOSPITAL(3),
        FACTORY(4),
        RESTAURANT(5),
        ENTERTAINMENT(6),
        ENTERPRISE(7);

        private int id;

        DeviceAppliedScenario(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class DeviceScreen {
        private Optional<Boolean> locked = Optional.empty();
        private Optional<Integer> brightness = Optional.empty();
        private Optional<LockedScreenOps> locked_ops = Optional.empty();
        private Optional<Boolean> screen_lock = Optional.empty();

        public Optional<Integer> getBrightness() {
            return this.brightness;
        }

        public Optional<LockedScreenOps> getLockedOps() {
            return this.locked_ops;
        }

        public Optional<Boolean> isLocked() {
            return this.locked;
        }

        public Optional<Boolean> isScreenLock() {
            return this.screen_lock;
        }

        public DeviceScreen setBrightness(int i) {
            this.brightness = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public DeviceScreen setLocked(boolean z) {
            this.locked = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public DeviceScreen setLockedOps(LockedScreenOps lockedScreenOps) {
            this.locked_ops = Optional.ofNullable(lockedScreenOps);
            return this;
        }

        public DeviceScreen setScreenLock(boolean z) {
            this.screen_lock = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }
    }

    @NamespaceName(name = "DeviceState", namespace = "System")
    public static class DeviceState implements ContextPayload {
        private Optional<String> mode = Optional.empty();

        @Deprecated
        private Optional<List<String>> imeis = Optional.empty();
        private Optional<DeviceScreen> screen = Optional.empty();
        private Optional<DeviceVolume> volume = Optional.empty();
        private Optional<DeviceAppliedScenario> scenario = Optional.empty();
        private Optional<List<BluetoothDeviceInfo>> bluetooth_device_infos = Optional.empty();
        private Optional<Boolean> find_phone_enabled = Optional.empty();
        private Optional<Boolean> shutdown_password = Optional.empty();

        public Optional<List<BluetoothDeviceInfo>> getBluetoothDeviceInfos() {
            return this.bluetooth_device_infos;
        }

        @Deprecated
        public Optional<List<String>> getImeis() {
            return this.imeis;
        }

        public Optional<String> getMode() {
            return this.mode;
        }

        public Optional<DeviceAppliedScenario> getScenario() {
            return this.scenario;
        }

        public Optional<DeviceScreen> getScreen() {
            return this.screen;
        }

        public Optional<DeviceVolume> getVolume() {
            return this.volume;
        }

        public Optional<Boolean> isFindPhoneEnabled() {
            return this.find_phone_enabled;
        }

        public Optional<Boolean> isShutdownPassword() {
            return this.shutdown_password;
        }

        public DeviceState setBluetoothDeviceInfos(List<BluetoothDeviceInfo> list) {
            this.bluetooth_device_infos = Optional.ofNullable(list);
            return this;
        }

        public DeviceState setFindPhoneEnabled(boolean z) {
            this.find_phone_enabled = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        @Deprecated
        public DeviceState setImeis(List<String> list) {
            this.imeis = Optional.ofNullable(list);
            return this;
        }

        public DeviceState setMode(String str) {
            this.mode = Optional.ofNullable(str);
            return this;
        }

        public DeviceState setScenario(DeviceAppliedScenario deviceAppliedScenario) {
            this.scenario = Optional.ofNullable(deviceAppliedScenario);
            return this;
        }

        public DeviceState setScreen(DeviceScreen deviceScreen) {
            this.screen = Optional.ofNullable(deviceScreen);
            return this;
        }

        public DeviceState setShutdownPassword(boolean z) {
            this.shutdown_password = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public DeviceState setVolume(DeviceVolume deviceVolume) {
            this.volume = Optional.ofNullable(deviceVolume);
            return this;
        }
    }

    public static class DeviceVolume {
        private Optional<Integer> media = Optional.empty();
        private Optional<Integer> voice_assistant = Optional.empty();

        public Optional<Integer> getMedia() {
            return this.media;
        }

        public Optional<Integer> getVoiceAssistant() {
            return this.voice_assistant;
        }

        public DeviceVolume setMedia(int i) {
            this.media = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public DeviceVolume setVoiceAssistant(int i) {
            this.voice_assistant = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }
    }

    public enum Diagnose {
        UNKNOWN(-1),
        CLIENT(0),
        SERVER(1);

        private int id;

        Diagnose(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "DisplayState", namespace = "System")
    public static class DisplayState implements ContextPayload {
        private Optional<Boolean> is_dark_mode = Optional.empty();

        public Optional<Boolean> isDarkMode() {
            return this.is_dark_mode;
        }

        public DisplayState setIsDarkMode(boolean z) {
            this.is_dark_mode = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }
    }

    @NamespaceName(name = "EnvSwitch", namespace = "System")
    public static class EnvSwitch implements InstructionPayload {

        @Required
        private Environment env;

        public EnvSwitch() {
        }

        public EnvSwitch(Environment environment) {
            this.env = environment;
        }

        @Required
        public Environment getEnv() {
            return this.env;
        }

        @Required
        public EnvSwitch setEnv(Environment environment) {
            this.env = environment;
            return this;
        }
    }

    public enum Environment {
        PRODUCTION(0),
        PREVIEW(1),
        PREVIEW4TEST(2);

        private int id;

        Environment(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "EventRoute", namespace = "System")
    public static class EventRoute implements ContextPayload {

        @Required
        private String id;

        public EventRoute() {
        }

        public EventRoute(String str) {
            this.id = str;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public EventRoute setId(String str) {
            this.id = str;
            return this;
        }
    }

    @NamespaceName(name = AVSAPIConstants.System.Exception.NAME, namespace = "System")
    public static class Exception implements InstructionPayload {

        @Required
        private int code;

        @Required
        private int http_status_code;
        private Optional<String> id = Optional.empty();

        @Required
        private String message;

        public Exception() {
        }

        public Exception(int i, String str, int i2) {
            this.code = i;
            this.message = str;
            this.http_status_code = i2;
        }

        @Required
        public int getCode() {
            return this.code;
        }

        @Required
        public int getHttpStatusCode() {
            return this.http_status_code;
        }

        public Optional<String> getId() {
            return this.id;
        }

        @Required
        public String getMessage() {
            return this.message;
        }

        @Required
        public Exception setCode(int i) {
            this.code = i;
            return this;
        }

        @Required
        public Exception setHttpStatusCode(int i) {
            this.http_status_code = i;
            return this;
        }

        public Exception setId(String str) {
            this.id = Optional.ofNullable(str);
            return this;
        }

        @Required
        public Exception setMessage(String str) {
            this.message = str;
            return this;
        }
    }

    @NamespaceName(name = "FileStoreFailedNotification", namespace = "System")
    public static class FileStoreFailedNotification implements InstructionPayload {
    }

    @NamespaceName(name = "Heartbeat", namespace = "System")
    public static class Heartbeat implements InstructionPayload {
    }

    @NamespaceName(name = "LockScreen", namespace = "System")
    public static class LockScreen implements InstructionPayload {
    }

    public static class LockedScreenOps {
        private Optional<Boolean> call = Optional.empty();
        private Optional<Boolean> device_control = Optional.empty();

        public Optional<Boolean> isCall() {
            return this.call;
        }

        public Optional<Boolean> isDeviceControl() {
            return this.device_control;
        }

        public LockedScreenOps setCall(boolean z) {
            this.call = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public LockedScreenOps setDeviceControl(boolean z) {
            this.device_control = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }
    }

    @NamespaceName(name = "PhoneLag", namespace = "System")
    public static class PhoneLag implements EventPayload {

        @Required
        private ObjectNode data;

        @Required
        private Diagnose diagnose;

        public PhoneLag() {
        }

        public PhoneLag(Diagnose diagnose, ObjectNode objectNode) {
            this.diagnose = diagnose;
            this.data = objectNode;
        }

        @Required
        public ObjectNode getData() {
            return this.data;
        }

        @Required
        public Diagnose getDiagnose() {
            return this.diagnose;
        }

        @Required
        public PhoneLag setData(ObjectNode objectNode) {
            this.data = objectNode;
            return this;
        }

        @Required
        public PhoneLag setDiagnose(Diagnose diagnose) {
            this.diagnose = diagnose;
            return this;
        }
    }

    @NamespaceName(name = "Ping", namespace = "System")
    public static class Ping implements InstructionPayload {

        @Required
        private String id;

        @Required
        private String type;

        public Ping() {
        }

        public Ping(String str, String str2) {
            this.id = str;
            this.type = str2;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public String getType() {
            return this.type;
        }

        @Required
        public Ping setId(String str) {
            this.id = str;
            return this;
        }

        @Required
        public Ping setType(String str) {
            this.type = str;
            return this;
        }
    }

    @NamespaceName(name = "Pong", namespace = "System")
    public static class Pong implements InstructionPayload {
    }

    @NamespaceName(name = "Power", namespace = "System")
    public static class Power implements InstructionPayload {

        @Required
        private PowerOp operation;
        private Optional<Integer> delay = Optional.empty();
        private Optional<Boolean> confirmation = Optional.empty();
        private Optional<String> bluetooth_mac = Optional.empty();

        public Power() {
        }

        public Power(PowerOp powerOp) {
            this.operation = powerOp;
        }

        public Optional<String> getBluetoothMac() {
            return this.bluetooth_mac;
        }

        public Optional<Integer> getDelay() {
            return this.delay;
        }

        @Required
        public PowerOp getOperation() {
            return this.operation;
        }

        public Optional<Boolean> isConfirmation() {
            return this.confirmation;
        }

        public Power setBluetoothMac(String str) {
            this.bluetooth_mac = Optional.ofNullable(str);
            return this;
        }

        public Power setConfirmation(boolean z) {
            this.confirmation = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public Power setDelay(int i) {
            this.delay = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        @Required
        public Power setOperation(PowerOp powerOp) {
            this.operation = powerOp;
            return this;
        }
    }

    public enum PowerOp {
        UNKNOWN(-1),
        BOOT(0),
        REBOOT(1),
        SLEEP(2),
        HIBERNATE(3),
        SHUTDOWN(4),
        CANCEL_SHUTDOWN(5);

        private int id;

        PowerOp(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "ReportPhoneLag", namespace = "System")
    public static class ReportPhoneLag implements InstructionPayload {
    }

    @NamespaceName(name = AIApiConstants.Scene.NAME, namespace = "System")
    public static class Scene implements ContextPayload {

        @Required
        private SceneCategory category;

        public Scene() {
        }

        public Scene(SceneCategory sceneCategory) {
            this.category = sceneCategory;
        }

        @Required
        public SceneCategory getCategory() {
            return this.category;
        }

        @Required
        public Scene setCategory(SceneCategory sceneCategory) {
            this.category = sceneCategory;
            return this;
        }
    }

    public enum SceneCategory {
        INPUT_METHOD(0);

        private int id;

        SceneCategory(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "SetProperty", namespace = "System")
    public static class SetProperty implements InstructionPayload {

        @Required
        private String name;

        @Required
        private String value;

        public SetProperty() {
        }

        public SetProperty(String str, String str2) {
            this.name = str;
            this.value = str2;
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
        public SetProperty setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public SetProperty setValue(String str) {
            this.value = str;
            return this;
        }
    }

    @NamespaceName(name = "Sleep", namespace = "System")
    public static class Sleep implements InstructionPayload {

        @Required
        private int duration;

        public Sleep() {
        }

        public Sleep(int i) {
            this.duration = i;
        }

        @Required
        public int getDuration() {
            return this.duration;
        }

        @Required
        public Sleep setDuration(int i) {
            this.duration = i;
            return this;
        }
    }

    @NamespaceName(name = "Theme", namespace = "System")
    public static class Theme implements ContextPayload {
        private Optional<String> id = Optional.empty();

        public Optional<String> getId() {
            return this.id;
        }

        public Theme setId(String str) {
            this.id = Optional.ofNullable(str);
            return this;
        }
    }

    @NamespaceName(name = "TruncationNotification", namespace = "System")
    public static class TruncationNotification implements InstructionPayload {

        @Required
        private int received_bytes;

        @Required
        private boolean received_stream_finished;

        public TruncationNotification() {
        }

        public TruncationNotification(int i, boolean z) {
            this.received_bytes = i;
            this.received_stream_finished = z;
        }

        @Required
        public int getReceivedBytes() {
            return this.received_bytes;
        }

        @Required
        public boolean isReceivedStreamFinished() {
            return this.received_stream_finished;
        }

        @Required
        public TruncationNotification setReceivedBytes(int i) {
            this.received_bytes = i;
            return this;
        }

        @Required
        public TruncationNotification setReceivedStreamFinished(boolean z) {
            this.received_stream_finished = z;
            return this;
        }
    }

    @NamespaceName(name = "UnlockScreen", namespace = "System")
    public static class UnlockScreen implements InstructionPayload {
    }

    @NamespaceName(name = "UpgradeRom", namespace = "System")
    public static class UpgradeRom implements InstructionPayload {
    }
}
