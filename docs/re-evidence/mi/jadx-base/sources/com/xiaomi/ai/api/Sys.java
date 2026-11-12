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
public class Sys {

    public static class AISubtitles {
        private Optional<Boolean> support_ai_subtitles = Optional.a();
        private Optional<Boolean> ai_subtitles_switch = Optional.a();
        private Optional<Boolean> ai_subtitles_translation_switch = Optional.a();
        private Optional<ScreenState> ai_subtitles_font_size = Optional.a();
        private Optional<Language> ai_subtitles_source_language = Optional.a();

        public Optional<ScreenState> getAiSubtitlesFontSize() {
            return this.ai_subtitles_font_size;
        }

        public Optional<Language> getAiSubtitlesSourceLanguage() {
            return this.ai_subtitles_source_language;
        }

        public Optional<Boolean> isAiSubtitlesSwitch() {
            return this.ai_subtitles_switch;
        }

        public Optional<Boolean> isAiSubtitlesTranslationSwitch() {
            return this.ai_subtitles_translation_switch;
        }

        public Optional<Boolean> isSupportAiSubtitles() {
            return this.support_ai_subtitles;
        }

        public AISubtitles setAiSubtitlesFontSize(ScreenState screenState) {
            this.ai_subtitles_font_size = Optional.e(screenState);
            return this;
        }

        public AISubtitles setAiSubtitlesSourceLanguage(Language language) {
            this.ai_subtitles_source_language = Optional.e(language);
            return this;
        }

        public AISubtitles setAiSubtitlesSwitch(boolean z) {
            this.ai_subtitles_switch = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public AISubtitles setAiSubtitlesTranslationSwitch(boolean z) {
            this.ai_subtitles_translation_switch = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public AISubtitles setSupportAiSubtitles(boolean z) {
            this.support_ai_subtitles = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    @NamespaceName(name = "Abort", namespace = AIApiConstants.System.NAME)
    public static class Abort implements InstructionPayload {

        @Required
        private String reason;

        public Abort() {
        }

        public Abort(String str) {
            this.reason = str;
        }

        @Required
        public String getReason() {
            return this.reason;
        }

        @Required
        public Abort setReason(String str) {
            this.reason = str;
            return this;
        }
    }

    @NamespaceName(name = "Ack", namespace = AIApiConstants.System.NAME)
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

    public static class AiSystem {
        private Optional<Boolean> exist_system = Optional.a();
        private Optional<String> name = Optional.a();
        private Optional<AiSystemPaintStatus> status = Optional.a();

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<AiSystemPaintStatus> getStatus() {
            return this.status;
        }

        public Optional<Boolean> isExistSystem() {
            return this.exist_system;
        }

        public AiSystem setExistSystem(boolean z) {
            this.exist_system = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public AiSystem setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public AiSystem setStatus(AiSystemPaintStatus aiSystemPaintStatus) {
            this.status = Optional.e(aiSystemPaintStatus);
            return this;
        }
    }

    public enum AiSystemPaintStatus {
        UNKNOWN(-1),
        UNDOWNLOADED(0),
        UNSUPPORTED(1),
        CONNECTED(2),
        UNCONNECTED(3),
        LOW_POWER(4),
        OVER_HEATING(5);

        private int id;

        AiSystemPaintStatus(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum ApplicationDeviceRunningMode {
        Unknown(-1),
        SoundBox(0),
        TV(1),
        BlueTooth(2),
        Automotive(3),
        Phone(4),
        PAD(5);

        private int id;

        ApplicationDeviceRunningMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum ApplicationLevelMode {
        Unknown(-1),
        Standard(0),
        Kids(1),
        Simple(2),
        Office(3),
        Mi(4),
        MiuiDKTMode(5),
        AIInputMethod(6),
        LLM_Geek(7);

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

    @NamespaceName(name = "AudioStore", namespace = AIApiConstants.System.NAME)
    public static class AudioStore implements EventPayload {
    }

    @NamespaceName(name = "AudioStoreStreamFinished", namespace = AIApiConstants.System.NAME)
    public static class AudioStoreStreamFinished implements EventPayload {
    }

    @NamespaceName(name = "AutoLock", namespace = AIApiConstants.System.NAME)
    public static class AutoLock implements InstructionPayload {
        private Optional<Integer> delay = Optional.a();

        public Optional<Integer> getDelay() {
            return this.delay;
        }

        public AutoLock setDelay(int i) {
            this.delay = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    public static class BasicDeviceInfo {
        private Optional<String> alias = Optional.a();
        private Optional<String> model = Optional.a();

        public Optional<String> getAlias() {
            return this.alias;
        }

        public Optional<String> getModel() {
            return this.model;
        }

        public BasicDeviceInfo setAlias(String str) {
            this.alias = Optional.e(str);
            return this;
        }

        public BasicDeviceInfo setModel(String str) {
            this.model = Optional.e(str);
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
        private Optional<BluetoothDeviceElectricType> electric_type = Optional.a();
        private Optional<Integer> electric_value = Optional.a();
        private Optional<String> electri_unit = Optional.a();

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
            this.electri_unit = Optional.e(str);
            return this;
        }

        public BluetoothDeviceElectricInfo setElectricType(BluetoothDeviceElectricType bluetoothDeviceElectricType) {
            this.electric_type = Optional.e(bluetoothDeviceElectricType);
            return this;
        }

        public BluetoothDeviceElectricInfo setElectricValue(int i) {
            this.electric_value = Optional.e(Integer.valueOf(i));
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

    public enum BluetoothDeviceHFPState {
        UNKNOWN(-1),
        DISABLED(0),
        ENABLED(1),
        CONNECTED(2);

        private int id;

        BluetoothDeviceHFPState(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "BluetoothDeviceInfo", namespace = AIApiConstants.System.NAME)
    public static class BluetoothDeviceInfo {
        private Optional<String> classic_address = Optional.a();
        private Optional<String> ble_address = Optional.a();
        private Optional<BluetoothConnectState> connect_state = Optional.a();
        private Optional<String> device_name = Optional.a();
        private Optional<String> icon_url = Optional.a();
        private Optional<List<BluetoothDeviceElectricInfo>> electric_infos = Optional.a();
        private Optional<BluetoothDeviceType> device_type = Optional.a();
        private Optional<Boolean> phone_call_enabled = Optional.a();
        private Optional<BluetoothDeviceHFPState> HFP_state = Optional.a();
        private Optional<BluetoothDevicePBAPState> PBAP_state = Optional.a();
        private Optional<ContactSynState> contact_syn_state = Optional.a();
        private Optional<Boolean> is_apple_device = Optional.a();

        public Optional<String> getBleAddress() {
            return this.ble_address;
        }

        public Optional<String> getClassicAddress() {
            return this.classic_address;
        }

        public Optional<BluetoothConnectState> getConnectState() {
            return this.connect_state;
        }

        public Optional<ContactSynState> getContactSynState() {
            return this.contact_syn_state;
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

        public Optional<BluetoothDeviceHFPState> getHFPState() {
            return this.HFP_state;
        }

        public Optional<String> getIconUrl() {
            return this.icon_url;
        }

        public Optional<BluetoothDevicePBAPState> getPBAPState() {
            return this.PBAP_state;
        }

        public Optional<Boolean> isAppleDevice() {
            return this.is_apple_device;
        }

        public Optional<Boolean> isPhoneCallEnabled() {
            return this.phone_call_enabled;
        }

        public BluetoothDeviceInfo setBleAddress(String str) {
            this.ble_address = Optional.e(str);
            return this;
        }

        public BluetoothDeviceInfo setClassicAddress(String str) {
            this.classic_address = Optional.e(str);
            return this;
        }

        public BluetoothDeviceInfo setConnectState(BluetoothConnectState bluetoothConnectState) {
            this.connect_state = Optional.e(bluetoothConnectState);
            return this;
        }

        public BluetoothDeviceInfo setContactSynState(ContactSynState contactSynState) {
            this.contact_syn_state = Optional.e(contactSynState);
            return this;
        }

        public BluetoothDeviceInfo setDeviceName(String str) {
            this.device_name = Optional.e(str);
            return this;
        }

        public BluetoothDeviceInfo setDeviceType(BluetoothDeviceType bluetoothDeviceType) {
            this.device_type = Optional.e(bluetoothDeviceType);
            return this;
        }

        public BluetoothDeviceInfo setElectricInfos(List<BluetoothDeviceElectricInfo> list) {
            this.electric_infos = Optional.e(list);
            return this;
        }

        public BluetoothDeviceInfo setHFPState(BluetoothDeviceHFPState bluetoothDeviceHFPState) {
            this.HFP_state = Optional.e(bluetoothDeviceHFPState);
            return this;
        }

        public BluetoothDeviceInfo setIconUrl(String str) {
            this.icon_url = Optional.e(str);
            return this;
        }

        public BluetoothDeviceInfo setIsAppleDevice(boolean z) {
            this.is_apple_device = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public BluetoothDeviceInfo setPBAPState(BluetoothDevicePBAPState bluetoothDevicePBAPState) {
            this.PBAP_state = Optional.e(bluetoothDevicePBAPState);
            return this;
        }

        public BluetoothDeviceInfo setPhoneCallEnabled(boolean z) {
            this.phone_call_enabled = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    public enum BluetoothDevicePBAPState {
        UNKNOWN(-1),
        DISABLED(0),
        ENABLED(1),
        CONNECTED(2);

        private int id;

        BluetoothDevicePBAPState(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
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

    public static class BluetoothModule {
        private Optional<Boolean> visible = Optional.a();
        private Optional<Boolean> bluetooth_active = Optional.a();

        public Optional<Boolean> isBluetoothActive() {
            return this.bluetooth_active;
        }

        public Optional<Boolean> isVisible() {
            return this.visible;
        }

        public BluetoothModule setBluetoothActive(boolean z) {
            this.bluetooth_active = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public BluetoothModule setVisible(boolean z) {
            this.visible = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    @NamespaceName(name = "ChangeVoiceAssistantLogo", namespace = AIApiConstants.System.NAME)
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

    @NamespaceName(name = "CheckScreenUnlocked", namespace = AIApiConstants.System.NAME)
    public static class CheckScreenUnlocked implements InstructionPayload {
    }

    @NamespaceName(name = "ClientPing", namespace = AIApiConstants.System.NAME)
    public static class ClientPing implements EventPayload {
    }

    public enum ContactSynState {
        UNKNOWN(-1),
        FAILURE(0),
        NOT_READY(1),
        SYNCHRONIZING(2),
        SYNCHRONIZED(3);

        private int id;

        ContactSynState(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class ControlDevice {
        private Optional<String> device_id = Optional.a();
        private Optional<String> native_device_id = Optional.a();

        public Optional<String> getDeviceId() {
            return this.device_id;
        }

        public Optional<String> getNativeDeviceId() {
            return this.native_device_id;
        }

        public ControlDevice setDeviceId(String str) {
            this.device_id = Optional.e(str);
            return this;
        }

        public ControlDevice setNativeDeviceId(String str) {
            this.native_device_id = Optional.e(str);
            return this;
        }
    }

    public enum DeviceAppliedScenario {
        UNKNOWN(-1),
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

    public static class DeviceConfig {
        private Optional<String> theme = Optional.a();
        private Optional<String> time_format = Optional.a();
        private Optional<String> temperature_unit = Optional.a();
        private Optional<DistanceUnit> distance_unit = Optional.a();
        private Optional<PressureUnit> tire_pressure_unit = Optional.a();
        private Optional<String> language = Optional.a();
        private Optional<UserConfigLocation> user_config_location = Optional.a();
        private Optional<String> hub_mode = Optional.a();

        public Optional<DistanceUnit> getDistanceUnit() {
            return this.distance_unit;
        }

        public Optional<String> getHubMode() {
            return this.hub_mode;
        }

        public Optional<String> getLanguage() {
            return this.language;
        }

        public Optional<String> getTemperatureUnit() {
            return this.temperature_unit;
        }

        public Optional<String> getTheme() {
            return this.theme;
        }

        public Optional<String> getTimeFormat() {
            return this.time_format;
        }

        public Optional<PressureUnit> getTirePressureUnit() {
            return this.tire_pressure_unit;
        }

        public Optional<UserConfigLocation> getUserConfigLocation() {
            return this.user_config_location;
        }

        public DeviceConfig setDistanceUnit(DistanceUnit distanceUnit) {
            this.distance_unit = Optional.e(distanceUnit);
            return this;
        }

        public DeviceConfig setHubMode(String str) {
            this.hub_mode = Optional.e(str);
            return this;
        }

        public DeviceConfig setLanguage(String str) {
            this.language = Optional.e(str);
            return this;
        }

        public DeviceConfig setTemperatureUnit(String str) {
            this.temperature_unit = Optional.e(str);
            return this;
        }

        public DeviceConfig setTheme(String str) {
            this.theme = Optional.e(str);
            return this;
        }

        public DeviceConfig setTimeFormat(String str) {
            this.time_format = Optional.e(str);
            return this;
        }

        public DeviceConfig setTirePressureUnit(PressureUnit pressureUnit) {
            this.tire_pressure_unit = Optional.e(pressureUnit);
            return this;
        }

        public DeviceConfig setUserConfigLocation(UserConfigLocation userConfigLocation) {
            this.user_config_location = Optional.e(userConfigLocation);
            return this;
        }
    }

    public static class DevicePowerInfo {
        private Optional<Boolean> has_battery = Optional.a();
        private Optional<Boolean> is_connect_power = Optional.a();

        public Optional<Boolean> isConnectPower() {
            return this.is_connect_power;
        }

        public Optional<Boolean> isHasBattery() {
            return this.has_battery;
        }

        public DevicePowerInfo setHasBattery(boolean z) {
            this.has_battery = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public DevicePowerInfo setIsConnectPower(boolean z) {
            this.is_connect_power = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    public static class DeviceScreen {
        private Optional<Boolean> locked = Optional.a();
        private Optional<Integer> brightness = Optional.a();
        private Optional<LockedScreenOps> locked_ops = Optional.a();
        private Optional<Boolean> screen_lock = Optional.a();
        private Optional<Boolean> display_enhance = Optional.a();
        private Optional<Integer> instrument_brightness = Optional.a();
        private Optional<AISubtitles> ai_subtitles = Optional.a();

        public Optional<AISubtitles> getAiSubtitles() {
            return this.ai_subtitles;
        }

        public Optional<Integer> getBrightness() {
            return this.brightness;
        }

        public Optional<Integer> getInstrumentBrightness() {
            return this.instrument_brightness;
        }

        public Optional<LockedScreenOps> getLockedOps() {
            return this.locked_ops;
        }

        public Optional<Boolean> isDisplayEnhance() {
            return this.display_enhance;
        }

        public Optional<Boolean> isLocked() {
            return this.locked;
        }

        public Optional<Boolean> isScreenLock() {
            return this.screen_lock;
        }

        public DeviceScreen setAiSubtitles(AISubtitles aISubtitles) {
            this.ai_subtitles = Optional.e(aISubtitles);
            return this;
        }

        public DeviceScreen setBrightness(int i) {
            this.brightness = Optional.e(Integer.valueOf(i));
            return this;
        }

        public DeviceScreen setDisplayEnhance(boolean z) {
            this.display_enhance = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public DeviceScreen setInstrumentBrightness(int i) {
            this.instrument_brightness = Optional.e(Integer.valueOf(i));
            return this;
        }

        public DeviceScreen setLocked(boolean z) {
            this.locked = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public DeviceScreen setLockedOps(LockedScreenOps lockedScreenOps) {
            this.locked_ops = Optional.e(lockedScreenOps);
            return this;
        }

        public DeviceScreen setScreenLock(boolean z) {
            this.screen_lock = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    @NamespaceName(name = "DeviceState", namespace = AIApiConstants.System.NAME)
    public static class DeviceState implements ContextPayload {
        private Optional<String> mode = Optional.a();

        @Deprecated
        private Optional<List<String>> imeis = Optional.a();
        private Optional<DeviceScreen> screen = Optional.a();
        private Optional<DeviceVolume> volume = Optional.a();
        private Optional<DeviceAppliedScenario> scenario = Optional.a();
        private Optional<List<BluetoothDeviceInfo>> bluetooth_device_infos = Optional.a();
        private Optional<Boolean> find_phone_enabled = Optional.a();
        private Optional<Boolean> shutdown_password = Optional.a();
        private Optional<NetworkAttribute> network = Optional.a();
        private Optional<DeviceAuthInfo> auth_info = Optional.a();
        private Optional<DevicePowerInfo> power_info = Optional.a();
        private Optional<ServiceState> service_state = Optional.a();
        private Optional<DeviceConfig> device_config = Optional.a();
        private Optional<BluetoothModule> bluetooth_module = Optional.a();
        private Optional<AiSystem> ai_system = Optional.a();
        private Optional<BasicDeviceInfo> basic_device_info = Optional.a();

        public Optional<AiSystem> getAiSystem() {
            return this.ai_system;
        }

        public Optional<DeviceAuthInfo> getAuthInfo() {
            return this.auth_info;
        }

        public Optional<BasicDeviceInfo> getBasicDeviceInfo() {
            return this.basic_device_info;
        }

        public Optional<List<BluetoothDeviceInfo>> getBluetoothDeviceInfos() {
            return this.bluetooth_device_infos;
        }

        public Optional<BluetoothModule> getBluetoothModule() {
            return this.bluetooth_module;
        }

        public Optional<DeviceConfig> getDeviceConfig() {
            return this.device_config;
        }

        @Deprecated
        public Optional<List<String>> getImeis() {
            return this.imeis;
        }

        public Optional<String> getMode() {
            return this.mode;
        }

        public Optional<NetworkAttribute> getNetwork() {
            return this.network;
        }

        public Optional<DevicePowerInfo> getPowerInfo() {
            return this.power_info;
        }

        public Optional<DeviceAppliedScenario> getScenario() {
            return this.scenario;
        }

        public Optional<DeviceScreen> getScreen() {
            return this.screen;
        }

        public Optional<ServiceState> getServiceState() {
            return this.service_state;
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

        public DeviceState setAiSystem(AiSystem aiSystem) {
            this.ai_system = Optional.e(aiSystem);
            return this;
        }

        public DeviceState setAuthInfo(DeviceAuthInfo deviceAuthInfo) {
            this.auth_info = Optional.e(deviceAuthInfo);
            return this;
        }

        public DeviceState setBasicDeviceInfo(BasicDeviceInfo basicDeviceInfo) {
            this.basic_device_info = Optional.e(basicDeviceInfo);
            return this;
        }

        public DeviceState setBluetoothDeviceInfos(List<BluetoothDeviceInfo> list) {
            this.bluetooth_device_infos = Optional.e(list);
            return this;
        }

        public DeviceState setBluetoothModule(BluetoothModule bluetoothModule) {
            this.bluetooth_module = Optional.e(bluetoothModule);
            return this;
        }

        public DeviceState setDeviceConfig(DeviceConfig deviceConfig) {
            this.device_config = Optional.e(deviceConfig);
            return this;
        }

        public DeviceState setFindPhoneEnabled(boolean z) {
            this.find_phone_enabled = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Deprecated
        public DeviceState setImeis(List<String> list) {
            this.imeis = Optional.e(list);
            return this;
        }

        public DeviceState setMode(String str) {
            this.mode = Optional.e(str);
            return this;
        }

        public DeviceState setNetwork(NetworkAttribute networkAttribute) {
            this.network = Optional.e(networkAttribute);
            return this;
        }

        public DeviceState setPowerInfo(DevicePowerInfo devicePowerInfo) {
            this.power_info = Optional.e(devicePowerInfo);
            return this;
        }

        public DeviceState setScenario(DeviceAppliedScenario deviceAppliedScenario) {
            this.scenario = Optional.e(deviceAppliedScenario);
            return this;
        }

        public DeviceState setScreen(DeviceScreen deviceScreen) {
            this.screen = Optional.e(deviceScreen);
            return this;
        }

        public DeviceState setServiceState(ServiceState serviceState) {
            this.service_state = Optional.e(serviceState);
            return this;
        }

        public DeviceState setShutdownPassword(boolean z) {
            this.shutdown_password = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public DeviceState setVolume(DeviceVolume deviceVolume) {
            this.volume = Optional.e(deviceVolume);
            return this;
        }
    }

    public enum DeviceType {
        UNKNOWN(-1),
        CAMERA(0);

        private int id;

        DeviceType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class DeviceVolume {
        private Optional<Integer> media = Optional.a();
        private Optional<Integer> voice_assistant = Optional.a();
        private Optional<Boolean> is_silent_mode = Optional.a();
        private Optional<Boolean> is_not_disturb_mode = Optional.a();
        private Optional<Boolean> voice_media_stop_switch_in_silent = Optional.a();
        private Optional<Integer> navigation = Optional.a();
        private Optional<Integer> call = Optional.a();
        private Optional<Boolean> compensation_active = Optional.a();
        private Optional<Integer> ring = Optional.a();
        private Optional<Integer> alarm = Optional.a();

        public Optional<Integer> getAlarm() {
            return this.alarm;
        }

        public Optional<Integer> getCall() {
            return this.call;
        }

        public Optional<Integer> getMedia() {
            return this.media;
        }

        public Optional<Integer> getNavigation() {
            return this.navigation;
        }

        public Optional<Integer> getRing() {
            return this.ring;
        }

        public Optional<Integer> getVoiceAssistant() {
            return this.voice_assistant;
        }

        public Optional<Boolean> isCompensationActive() {
            return this.compensation_active;
        }

        public Optional<Boolean> isNotDisturbMode() {
            return this.is_not_disturb_mode;
        }

        public Optional<Boolean> isSilentMode() {
            return this.is_silent_mode;
        }

        public Optional<Boolean> isVoiceMediaStopSwitchInSilent() {
            return this.voice_media_stop_switch_in_silent;
        }

        public DeviceVolume setAlarm(int i) {
            this.alarm = Optional.e(Integer.valueOf(i));
            return this;
        }

        public DeviceVolume setCall(int i) {
            this.call = Optional.e(Integer.valueOf(i));
            return this;
        }

        public DeviceVolume setCompensationActive(boolean z) {
            this.compensation_active = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public DeviceVolume setIsNotDisturbMode(boolean z) {
            this.is_not_disturb_mode = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public DeviceVolume setIsSilentMode(boolean z) {
            this.is_silent_mode = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public DeviceVolume setMedia(int i) {
            this.media = Optional.e(Integer.valueOf(i));
            return this;
        }

        public DeviceVolume setNavigation(int i) {
            this.navigation = Optional.e(Integer.valueOf(i));
            return this;
        }

        public DeviceVolume setRing(int i) {
            this.ring = Optional.e(Integer.valueOf(i));
            return this;
        }

        public DeviceVolume setVoiceAssistant(int i) {
            this.voice_assistant = Optional.e(Integer.valueOf(i));
            return this;
        }

        public DeviceVolume setVoiceMediaStopSwitchInSilent(boolean z) {
            this.voice_media_stop_switch_in_silent = Optional.e(Boolean.valueOf(z));
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

    @NamespaceName(name = "DisplayState", namespace = AIApiConstants.System.NAME)
    public static class DisplayState implements ContextPayload {
        private Optional<Boolean> is_dark_mode = Optional.a();

        public Optional<Boolean> isDarkMode() {
            return this.is_dark_mode;
        }

        public DisplayState setIsDarkMode(boolean z) {
            this.is_dark_mode = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    public enum DistanceUnit {
        Unknown(-1),
        MILE(0),
        KILOMETER(1);

        private int id;

        DistanceUnit(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "EnvSwitch", namespace = AIApiConstants.System.NAME)
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
        UNKNOWN(-1),
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

    @NamespaceName(name = "EventRoute", namespace = AIApiConstants.System.NAME)
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

    @NamespaceName(name = "FileStoreFailedNotification", namespace = AIApiConstants.System.NAME)
    public static class FileStoreFailedNotification implements InstructionPayload {
    }

    @NamespaceName(name = "Heartbeat", namespace = AIApiConstants.System.NAME)
    public static class Heartbeat implements InstructionPayload {
    }

    public enum Language {
        UNKNOWN(-1),
        ENGLISH(0),
        CHINESE(1);

        private int id;

        Language(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "LockScreen", namespace = AIApiConstants.System.NAME)
    public static class LockScreen implements InstructionPayload {
    }

    public static class LockedScreenOps {
        private Optional<Boolean> call = Optional.a();
        private Optional<Boolean> device_control = Optional.a();

        public Optional<Boolean> isCall() {
            return this.call;
        }

        public Optional<Boolean> isDeviceControl() {
            return this.device_control;
        }

        public LockedScreenOps setCall(boolean z) {
            this.call = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public LockedScreenOps setDeviceControl(boolean z) {
            this.device_control = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    public static class NetworkAttribute {
        private Optional<String> bssid = Optional.a();
        private Optional<String> voip_id = Optional.a();
        private Optional<Network.NetworkType> type = Optional.a();

        public Optional<String> getBssid() {
            return this.bssid;
        }

        public Optional<Network.NetworkType> getType() {
            return this.type;
        }

        public Optional<String> getVoipId() {
            return this.voip_id;
        }

        public NetworkAttribute setBssid(String str) {
            this.bssid = Optional.e(str);
            return this;
        }

        public NetworkAttribute setType(Network.NetworkType networkType) {
            this.type = Optional.e(networkType);
            return this;
        }

        public NetworkAttribute setVoipId(String str) {
            this.voip_id = Optional.e(str);
            return this;
        }
    }

    public enum OperationType {
        UNKNOWN(-1),
        OPEN(0),
        CLOSE(1);

        private int id;

        OperationType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "PhoneLag", namespace = AIApiConstants.System.NAME)
    public static class PhoneLag implements EventPayload {

        @Required
        private c4h data;

        @Required
        private Diagnose diagnose;

        public PhoneLag() {
        }

        public PhoneLag(Diagnose diagnose, c4h c4hVar) {
            this.diagnose = diagnose;
            this.data = c4hVar;
        }

        @Required
        public c4h getData() {
            return this.data;
        }

        @Required
        public Diagnose getDiagnose() {
            return this.diagnose;
        }

        @Required
        public PhoneLag setData(c4h c4hVar) {
            this.data = c4hVar;
            return this;
        }

        @Required
        public PhoneLag setDiagnose(Diagnose diagnose) {
            this.diagnose = diagnose;
            return this;
        }
    }

    @NamespaceName(name = "Ping", namespace = AIApiConstants.System.NAME)
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

    @NamespaceName(name = "Pong", namespace = AIApiConstants.System.NAME)
    public static class Pong implements InstructionPayload {
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

    public enum PressureUnit {
        Unknown(-1),
        BAR(0),
        KPA(1),
        PSI(2);

        private int id;

        PressureUnit(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum PropertyType {
        Int(0),
        Long(1),
        String(2),
        Float(3);

        private int id;

        PropertyType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "ReportPhoneLag", namespace = AIApiConstants.System.NAME)
    public static class ReportPhoneLag implements InstructionPayload {
    }

    @NamespaceName(name = AIApiConstants.Scene.NAME, namespace = AIApiConstants.System.NAME)
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
        UNKNOWN(-1),
        INPUT_METHOD(0);

        private int id;

        SceneCategory(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum ScreenState {
        UNKNOWN(-1),
        SMALL(0),
        MIDDLE(1),
        LARGE(2);

        private int id;

        ScreenState(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class ServiceState {
        private Optional<Boolean> hot_sport_active = Optional.a();
        private Optional<Boolean> wireless_network_active = Optional.a();
        private Optional<Boolean> screen_clean_active = Optional.a();
        private Optional<Boolean> driving_recorder = Optional.a();
        private Optional<Boolean> driving_recorder_whistle_save = Optional.a();
        private Optional<Boolean> auto_sentinel_mode = Optional.a();
        private Optional<Boolean> tire_change_mode = Optional.a();
        private Optional<Boolean> hud_active = Optional.a();
        private Optional<Boolean> hud_auto_switch_of_sports_themes = Optional.a();
        private Optional<Boolean> hud_auto_switch_of_perception_themes = Optional.a();
        private Optional<Boolean> hud_speeding_reminder = Optional.a();
        private Optional<Boolean> hud_map_dynamic_display = Optional.a();
        private Optional<Boolean> hud_caller_info_display = Optional.a();
        private Optional<Boolean> hud_lane_keeping_assist = Optional.a();
        private Optional<Boolean> hud_parallel_rear_traffic_assist = Optional.a();
        private Optional<Boolean> wake_up_and_execute = Optional.a();
        private Optional<Boolean> screen_auto_brightness = Optional.a();
        private Optional<Boolean> notification_sound_switch = Optional.a();
        private Optional<Boolean> click_sound_switch = Optional.a();

        public Optional<Boolean> isAutoSentinelMode() {
            return this.auto_sentinel_mode;
        }

        public Optional<Boolean> isClickSoundSwitch() {
            return this.click_sound_switch;
        }

        public Optional<Boolean> isDrivingRecorder() {
            return this.driving_recorder;
        }

        public Optional<Boolean> isDrivingRecorderWhistleSave() {
            return this.driving_recorder_whistle_save;
        }

        public Optional<Boolean> isHotSportActive() {
            return this.hot_sport_active;
        }

        public Optional<Boolean> isHudActive() {
            return this.hud_active;
        }

        public Optional<Boolean> isHudAutoSwitchOfPerceptionThemes() {
            return this.hud_auto_switch_of_perception_themes;
        }

        public Optional<Boolean> isHudAutoSwitchOfSportsThemes() {
            return this.hud_auto_switch_of_sports_themes;
        }

        public Optional<Boolean> isHudCallerInfoDisplay() {
            return this.hud_caller_info_display;
        }

        public Optional<Boolean> isHudLaneKeepingAssist() {
            return this.hud_lane_keeping_assist;
        }

        public Optional<Boolean> isHudMapDynamicDisplay() {
            return this.hud_map_dynamic_display;
        }

        public Optional<Boolean> isHudParallelRearTrafficAssist() {
            return this.hud_parallel_rear_traffic_assist;
        }

        public Optional<Boolean> isHudSpeedingReminder() {
            return this.hud_speeding_reminder;
        }

        public Optional<Boolean> isNotificationSoundSwitch() {
            return this.notification_sound_switch;
        }

        public Optional<Boolean> isScreenAutoBrightness() {
            return this.screen_auto_brightness;
        }

        public Optional<Boolean> isScreenCleanActive() {
            return this.screen_clean_active;
        }

        public Optional<Boolean> isTireChangeMode() {
            return this.tire_change_mode;
        }

        public Optional<Boolean> isWakeUpAndExecute() {
            return this.wake_up_and_execute;
        }

        public Optional<Boolean> isWirelessNetworkActive() {
            return this.wireless_network_active;
        }

        public ServiceState setAutoSentinelMode(boolean z) {
            this.auto_sentinel_mode = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ServiceState setClickSoundSwitch(boolean z) {
            this.click_sound_switch = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ServiceState setDrivingRecorder(boolean z) {
            this.driving_recorder = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ServiceState setDrivingRecorderWhistleSave(boolean z) {
            this.driving_recorder_whistle_save = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ServiceState setHotSportActive(boolean z) {
            this.hot_sport_active = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ServiceState setHudActive(boolean z) {
            this.hud_active = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ServiceState setHudAutoSwitchOfPerceptionThemes(boolean z) {
            this.hud_auto_switch_of_perception_themes = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ServiceState setHudAutoSwitchOfSportsThemes(boolean z) {
            this.hud_auto_switch_of_sports_themes = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ServiceState setHudCallerInfoDisplay(boolean z) {
            this.hud_caller_info_display = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ServiceState setHudLaneKeepingAssist(boolean z) {
            this.hud_lane_keeping_assist = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ServiceState setHudMapDynamicDisplay(boolean z) {
            this.hud_map_dynamic_display = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ServiceState setHudParallelRearTrafficAssist(boolean z) {
            this.hud_parallel_rear_traffic_assist = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ServiceState setHudSpeedingReminder(boolean z) {
            this.hud_speeding_reminder = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ServiceState setNotificationSoundSwitch(boolean z) {
            this.notification_sound_switch = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ServiceState setScreenAutoBrightness(boolean z) {
            this.screen_auto_brightness = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ServiceState setScreenCleanActive(boolean z) {
            this.screen_clean_active = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ServiceState setTireChangeMode(boolean z) {
            this.tire_change_mode = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ServiceState setWakeUpAndExecute(boolean z) {
            this.wake_up_and_execute = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ServiceState setWirelessNetworkActive(boolean z) {
            this.wireless_network_active = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    @NamespaceName(name = "SetMiuiDatabase", namespace = AIApiConstants.System.NAME)
    public static class SetMiuiDatabase implements InstructionPayload {

        @Required
        private String database_name;

        @Required
        private String property_name;

        @Required
        private PropertyType property_type;

        @Required
        private String property_value;

        public SetMiuiDatabase() {
        }

        public SetMiuiDatabase(String str, String str2, PropertyType propertyType, String str3) {
            this.database_name = str;
            this.property_name = str2;
            this.property_type = propertyType;
            this.property_value = str3;
        }

        @Required
        public String getDatabaseName() {
            return this.database_name;
        }

        @Required
        public String getPropertyName() {
            return this.property_name;
        }

        @Required
        public PropertyType getPropertyType() {
            return this.property_type;
        }

        @Required
        public String getPropertyValue() {
            return this.property_value;
        }

        @Required
        public SetMiuiDatabase setDatabaseName(String str) {
            this.database_name = str;
            return this;
        }

        @Required
        public SetMiuiDatabase setPropertyName(String str) {
            this.property_name = str;
            return this;
        }

        @Required
        public SetMiuiDatabase setPropertyType(PropertyType propertyType) {
            this.property_type = propertyType;
            return this;
        }

        @Required
        public SetMiuiDatabase setPropertyValue(String str) {
            this.property_value = str;
            return this;
        }
    }

    @NamespaceName(name = "Sleep", namespace = AIApiConstants.System.NAME)
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

    @NamespaceName(name = "Theme", namespace = AIApiConstants.System.NAME)
    public static class Theme implements ContextPayload {
        private Optional<String> id = Optional.a();

        public Optional<String> getId() {
            return this.id;
        }

        public Theme setId(String str) {
            this.id = Optional.e(str);
            return this;
        }
    }

    @NamespaceName(name = "UnlockScreen", namespace = AIApiConstants.System.NAME)
    public static class UnlockScreen implements InstructionPayload {
    }

    @NamespaceName(name = "UpgradeRom", namespace = AIApiConstants.System.NAME)
    public static class UpgradeRom implements InstructionPayload {
    }

    public static class UserConfigLocation {
        private Optional<String> country = Optional.a();
        private Optional<String> province = Optional.a();
        private Optional<String> city = Optional.a();
        private Optional<String> district = Optional.a();

        public Optional<String> getCity() {
            return this.city;
        }

        public Optional<String> getCountry() {
            return this.country;
        }

        public Optional<String> getDistrict() {
            return this.district;
        }

        public Optional<String> getProvince() {
            return this.province;
        }

        public UserConfigLocation setCity(String str) {
            this.city = Optional.e(str);
            return this;
        }

        public UserConfigLocation setCountry(String str) {
            this.country = Optional.e(str);
            return this;
        }

        public UserConfigLocation setDistrict(String str) {
            this.district = Optional.e(str);
            return this;
        }

        public UserConfigLocation setProvince(String str) {
            this.province = Optional.e(str);
            return this;
        }
    }

    public static class DeviceAuthInfo {

        @Required
        private List<Common.MobileMIUI13DeviceAuthCode> voice_assistant_auth_codes;
        private Optional<List<Common.MobileMIUI13DeviceAuthCode>> voice_assistant_supporting_auth_codes = Optional.a();

        public DeviceAuthInfo() {
        }

        @Required
        public List<Common.MobileMIUI13DeviceAuthCode> getVoiceAssistantAuthCodes() {
            return this.voice_assistant_auth_codes;
        }

        public Optional<List<Common.MobileMIUI13DeviceAuthCode>> getVoiceAssistantSupportingAuthCodes() {
            return this.voice_assistant_supporting_auth_codes;
        }

        @Required
        public DeviceAuthInfo setVoiceAssistantAuthCodes(List<Common.MobileMIUI13DeviceAuthCode> list) {
            this.voice_assistant_auth_codes = list;
            return this;
        }

        public DeviceAuthInfo setVoiceAssistantSupportingAuthCodes(List<Common.MobileMIUI13DeviceAuthCode> list) {
            this.voice_assistant_supporting_auth_codes = Optional.e(list);
            return this;
        }

        public DeviceAuthInfo(List<Common.MobileMIUI13DeviceAuthCode> list) {
            this.voice_assistant_auth_codes = list;
        }
    }

    @NamespaceName(name = "Exception", namespace = AIApiConstants.System.NAME)
    public static class Exception implements InstructionPayload {

        @Required
        private int code;

        @Required
        private int http_status_code;
        private Optional<String> id = Optional.a();

        @Required
        private String message;

        public Exception() {
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
            this.id = Optional.e(str);
            return this;
        }

        @Required
        public Exception setMessage(String str) {
            this.message = str;
            return this;
        }

        public Exception(int i, String str, int i2) {
            this.code = i;
            this.message = str;
            this.http_status_code = i2;
        }
    }

    @NamespaceName(name = "Operate", namespace = AIApiConstants.System.NAME)
    public static class Operate implements InstructionPayload {
        private Optional<ControlDevice> control_device = Optional.a();

        @Required
        private DeviceType device;

        @Required
        private OperationType operation;

        public Operate() {
        }

        public Optional<ControlDevice> getControlDevice() {
            return this.control_device;
        }

        @Required
        public DeviceType getDevice() {
            return this.device;
        }

        @Required
        public OperationType getOperation() {
            return this.operation;
        }

        public Operate setControlDevice(ControlDevice controlDevice) {
            this.control_device = Optional.e(controlDevice);
            return this;
        }

        @Required
        public Operate setDevice(DeviceType deviceType) {
            this.device = deviceType;
            return this;
        }

        @Required
        public Operate setOperation(OperationType operationType) {
            this.operation = operationType;
            return this;
        }

        public Operate(DeviceType deviceType, OperationType operationType) {
            this.device = deviceType;
            this.operation = operationType;
        }
    }

    @NamespaceName(name = "SwitchMiuiDatabase", namespace = AIApiConstants.System.NAME)
    public static class SwitchMiuiDatabase implements InstructionPayload {

        @Required
        private String database_name;
        private Optional<String> default_value = Optional.a();

        @Required
        private String property_name;

        @Required
        private PropertyType property_type;

        public SwitchMiuiDatabase() {
        }

        @Required
        public String getDatabaseName() {
            return this.database_name;
        }

        public Optional<String> getDefaultValue() {
            return this.default_value;
        }

        @Required
        public String getPropertyName() {
            return this.property_name;
        }

        @Required
        public PropertyType getPropertyType() {
            return this.property_type;
        }

        @Required
        public SwitchMiuiDatabase setDatabaseName(String str) {
            this.database_name = str;
            return this;
        }

        public SwitchMiuiDatabase setDefaultValue(String str) {
            this.default_value = Optional.e(str);
            return this;
        }

        @Required
        public SwitchMiuiDatabase setPropertyName(String str) {
            this.property_name = str;
            return this;
        }

        @Required
        public SwitchMiuiDatabase setPropertyType(PropertyType propertyType) {
            this.property_type = propertyType;
            return this;
        }

        public SwitchMiuiDatabase(String str, String str2, PropertyType propertyType) {
            this.database_name = str;
            this.property_name = str2;
            this.property_type = propertyType;
        }
    }

    @NamespaceName(name = "TruncationNotification", namespace = AIApiConstants.System.NAME)
    public static class TruncationNotification implements InstructionPayload {

        @Required
        private int received_bytes;

        @Required
        private boolean received_stream_finished;
        private Optional<String> truncation_reason = Optional.a();

        public TruncationNotification() {
        }

        @Required
        public int getReceivedBytes() {
            return this.received_bytes;
        }

        public Optional<String> getTruncationReason() {
            return this.truncation_reason;
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

        public TruncationNotification setTruncationReason(String str) {
            this.truncation_reason = Optional.e(str);
            return this;
        }

        public TruncationNotification(int i, boolean z) {
            this.received_bytes = i;
            this.received_stream_finished = z;
        }
    }

    @NamespaceName(name = "SetProperty", namespace = AIApiConstants.System.NAME)
    public static class SetProperty implements InstructionPayload {

        @Required
        private String name;

        @Required
        private String value;
        private Optional<Integer> int_value = Optional.a();
        private Optional<String> switch_value = Optional.a();

        public SetProperty() {
        }

        public Optional<Integer> getIntValue() {
            return this.int_value;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<String> getSwitchValue() {
            return this.switch_value;
        }

        @Required
        public String getValue() {
            return this.value;
        }

        public SetProperty setIntValue(int i) {
            this.int_value = Optional.e(Integer.valueOf(i));
            return this;
        }

        @Required
        public SetProperty setName(String str) {
            this.name = str;
            return this;
        }

        public SetProperty setSwitchValue(String str) {
            this.switch_value = Optional.e(str);
            return this;
        }

        @Required
        public SetProperty setValue(String str) {
            this.value = str;
            return this;
        }

        public SetProperty(String str, String str2) {
            this.name = str;
            this.value = str2;
        }
    }

    @NamespaceName(name = "Power", namespace = AIApiConstants.System.NAME)
    public static class Power implements InstructionPayload {

        @Required
        private PowerOp operation;
        private Optional<Integer> delay = Optional.a();
        private Optional<Boolean> confirmation = Optional.a();
        private Optional<String> bluetooth_mac = Optional.a();

        public Power() {
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
            this.bluetooth_mac = Optional.e(str);
            return this;
        }

        public Power setConfirmation(boolean z) {
            this.confirmation = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public Power setDelay(int i) {
            this.delay = Optional.e(Integer.valueOf(i));
            return this;
        }

        @Required
        public Power setOperation(PowerOp powerOp) {
            this.operation = powerOp;
            return this;
        }

        public Power(PowerOp powerOp) {
            this.operation = powerOp;
        }
    }
}
