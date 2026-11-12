package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.Context;
import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.mj1;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class Application {

    public static class AIInputMethodInfo {
        private Optional<Boolean> is_referenced = Optional.a();
        private Optional<String> package_name = Optional.a();
        private Optional<String> page_name = Optional.a();
        private Optional<Boolean> is_inlets = Optional.a();

        public Optional<String> getPackageName() {
            return this.package_name;
        }

        public Optional<String> getPageName() {
            return this.page_name;
        }

        public Optional<Boolean> isInlets() {
            return this.is_inlets;
        }

        public Optional<Boolean> isReferenced() {
            return this.is_referenced;
        }

        public AIInputMethodInfo setIsInlets(boolean z) {
            this.is_inlets = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public AIInputMethodInfo setIsReferenced(boolean z) {
            this.is_referenced = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public AIInputMethodInfo setPackageName(String str) {
            this.package_name = Optional.e(str);
            return this;
        }

        public AIInputMethodInfo setPageName(String str) {
            this.page_name = Optional.e(str);
            return this;
        }
    }

    @NamespaceName(name = "AdsInfo", namespace = AIApiConstants.Application.NAME)
    public static class AdsInfo implements InstructionPayload {
        private Optional<List<AdsTrackInfo>> track_info = Optional.a();

        public Optional<List<AdsTrackInfo>> getTrackInfo() {
            return this.track_info;
        }

        public AdsInfo setTrackInfo(List<AdsTrackInfo> list) {
            this.track_info = Optional.e(list);
            return this;
        }
    }

    public enum AdsTrackSourceType {
        UNKNOWN(-1),
        COMMERCIAL(0),
        COMMERCIAL_TAIL(1);

        private int id;

        AdsTrackSourceType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum AdsTrackType {
        UNKNOWN(-1),
        TOAST(0),
        AUDIO_PLAYER(1),
        ATTACHMENT(2),
        SPEAKER(3);

        private int id;

        AdsTrackType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class AppState {
        private Optional<Boolean> support_smart_app = Optional.a();
        private Optional<Boolean> show_cp_icon = Optional.a();
        private Optional<Boolean> is_icon_hidden = Optional.a();
        private Optional<HealthCodeAppType> open_health_code_app = Optional.a();
        private Optional<Boolean> support_xiaomi_share = Optional.a();
        private Optional<String> multi_media_app_id = Optional.a();
        private Optional<Boolean> added_suggestion_widget_desktop = Optional.a();
        private Optional<AIInputMethodInfo> ai_input_method = Optional.a();
        private Optional<Boolean> new_aireco_portal = Optional.a();
        private Optional<Boolean> painting_status = Optional.a();
        private Optional<BackgroundAppType> current_background_app_type = Optional.a();
        private Optional<Boolean> is_support_voice_translation = Optional.a();
        private Optional<InteractionMode> interaction_mode = Optional.a();
        private Optional<UploadMode> upload_mode = Optional.a();
        private Optional<ScreenPermissionState> screen_permission_state = Optional.a();

        public Optional<AIInputMethodInfo> getAiInputMethod() {
            return this.ai_input_method;
        }

        public Optional<BackgroundAppType> getCurrentBackgroundAppType() {
            return this.current_background_app_type;
        }

        public Optional<InteractionMode> getInteractionMode() {
            return this.interaction_mode;
        }

        public Optional<String> getMultiMediaAppId() {
            return this.multi_media_app_id;
        }

        public Optional<HealthCodeAppType> getOpenHealthCodeApp() {
            return this.open_health_code_app;
        }

        public Optional<ScreenPermissionState> getScreenPermissionState() {
            return this.screen_permission_state;
        }

        public Optional<UploadMode> getUploadMode() {
            return this.upload_mode;
        }

        public Optional<Boolean> isAddedSuggestionWidgetDesktop() {
            return this.added_suggestion_widget_desktop;
        }

        public Optional<Boolean> isIconHidden() {
            return this.is_icon_hidden;
        }

        public Optional<Boolean> isNewAirecoPortal() {
            return this.new_aireco_portal;
        }

        public Optional<Boolean> isPaintingStatus() {
            return this.painting_status;
        }

        public Optional<Boolean> isShowCpIcon() {
            return this.show_cp_icon;
        }

        public Optional<Boolean> isSupportSmartApp() {
            return this.support_smart_app;
        }

        public Optional<Boolean> isSupportVoiceTranslation() {
            return this.is_support_voice_translation;
        }

        public Optional<Boolean> isSupportXiaomiShare() {
            return this.support_xiaomi_share;
        }

        public AppState setAddedSuggestionWidgetDesktop(boolean z) {
            this.added_suggestion_widget_desktop = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public AppState setAiInputMethod(AIInputMethodInfo aIInputMethodInfo) {
            this.ai_input_method = Optional.e(aIInputMethodInfo);
            return this;
        }

        public AppState setCurrentBackgroundAppType(BackgroundAppType backgroundAppType) {
            this.current_background_app_type = Optional.e(backgroundAppType);
            return this;
        }

        public AppState setInteractionMode(InteractionMode interactionMode) {
            this.interaction_mode = Optional.e(interactionMode);
            return this;
        }

        public AppState setIsIconHidden(boolean z) {
            this.is_icon_hidden = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public AppState setIsSupportVoiceTranslation(boolean z) {
            this.is_support_voice_translation = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public AppState setMultiMediaAppId(String str) {
            this.multi_media_app_id = Optional.e(str);
            return this;
        }

        public AppState setNewAirecoPortal(boolean z) {
            this.new_aireco_portal = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public AppState setOpenHealthCodeApp(HealthCodeAppType healthCodeAppType) {
            this.open_health_code_app = Optional.e(healthCodeAppType);
            return this;
        }

        public AppState setPaintingStatus(boolean z) {
            this.painting_status = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public AppState setScreenPermissionState(ScreenPermissionState screenPermissionState) {
            this.screen_permission_state = Optional.e(screenPermissionState);
            return this;
        }

        public AppState setShowCpIcon(boolean z) {
            this.show_cp_icon = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public AppState setSupportSmartApp(boolean z) {
            this.support_smart_app = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public AppState setSupportXiaomiShare(boolean z) {
            this.support_xiaomi_share = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public AppState setUploadMode(UploadMode uploadMode) {
            this.upload_mode = Optional.e(uploadMode);
            return this;
        }
    }

    public static class ApplicationCountDown {

        @Required
        private String app_pkg_name;

        @Required
        private CountDownMode count_down_mode;

        public ApplicationCountDown() {
        }

        public ApplicationCountDown(String str, CountDownMode countDownMode) {
            this.app_pkg_name = str;
            this.count_down_mode = countDownMode;
        }

        @Required
        public String getAppPkgName() {
            return this.app_pkg_name;
        }

        @Required
        public CountDownMode getCountDownMode() {
            return this.count_down_mode;
        }

        @Required
        public ApplicationCountDown setAppPkgName(String str) {
            this.app_pkg_name = str;
            return this;
        }

        @Required
        public ApplicationCountDown setCountDownMode(CountDownMode countDownMode) {
            this.count_down_mode = countDownMode;
            return this;
        }
    }

    public enum ApplicationOp {
        UNKNOWN(-1),
        OPEN(0),
        INSTALL(1),
        UNINSTALL(2),
        CLOSE(3),
        SEARCH(4),
        BACK_GROUND(5),
        OPEN_PAGE(6),
        CLOSE_PAGE(7),
        PROJECT_FULLSCREEN(8),
        FORCE_OPEN_PAGE(9),
        PIN_ON_CAR(10);

        private int id;

        ApplicationOp(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class ApplicationStatePayload {
        private Optional<ApplicationSupport> supports = Optional.a();
        private Optional<List<ApplicationCountDown>> count_down_apps = Optional.a();
        private Optional<TTSToneInfo> tts_tone_info = Optional.a();
        private Optional<ScreenProjectionInfo> screen_projection_info = Optional.a();
        private Optional<ApplicationVersionInfo> versions = Optional.a();
        private Optional<ScreenProjectionInfo> pad_screen_projection_info = Optional.a();

        public Optional<List<ApplicationCountDown>> getCountDownApps() {
            return this.count_down_apps;
        }

        public Optional<ScreenProjectionInfo> getPadScreenProjectionInfo() {
            return this.pad_screen_projection_info;
        }

        public Optional<ScreenProjectionInfo> getScreenProjectionInfo() {
            return this.screen_projection_info;
        }

        public Optional<ApplicationSupport> getSupports() {
            return this.supports;
        }

        public Optional<TTSToneInfo> getTtsToneInfo() {
            return this.tts_tone_info;
        }

        public Optional<ApplicationVersionInfo> getVersions() {
            return this.versions;
        }

        public ApplicationStatePayload setCountDownApps(List<ApplicationCountDown> list) {
            this.count_down_apps = Optional.e(list);
            return this;
        }

        public ApplicationStatePayload setPadScreenProjectionInfo(ScreenProjectionInfo screenProjectionInfo) {
            this.pad_screen_projection_info = Optional.e(screenProjectionInfo);
            return this;
        }

        public ApplicationStatePayload setScreenProjectionInfo(ScreenProjectionInfo screenProjectionInfo) {
            this.screen_projection_info = Optional.e(screenProjectionInfo);
            return this;
        }

        public ApplicationStatePayload setSupports(ApplicationSupport applicationSupport) {
            this.supports = Optional.e(applicationSupport);
            return this;
        }

        public ApplicationStatePayload setTtsToneInfo(TTSToneInfo tTSToneInfo) {
            this.tts_tone_info = Optional.e(tTSToneInfo);
            return this;
        }

        public ApplicationStatePayload setVersions(ApplicationVersionInfo applicationVersionInfo) {
            this.versions = Optional.e(applicationVersionInfo);
            return this;
        }
    }

    public static class ApplicationSupport {
        private Optional<Boolean> smart_alarm = Optional.a();
        private Optional<Boolean> ai_subtitles = Optional.a();
        private Optional<Boolean> altitude_query = Optional.a();
        private Optional<Boolean> foreground_app_support_split_screen = Optional.a();

        public Optional<Boolean> isAiSubtitles() {
            return this.ai_subtitles;
        }

        public Optional<Boolean> isAltitudeQuery() {
            return this.altitude_query;
        }

        public Optional<Boolean> isForegroundAppSupportSplitScreen() {
            return this.foreground_app_support_split_screen;
        }

        public Optional<Boolean> isSmartAlarm() {
            return this.smart_alarm;
        }

        public ApplicationSupport setAiSubtitles(boolean z) {
            this.ai_subtitles = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ApplicationSupport setAltitudeQuery(boolean z) {
            this.altitude_query = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ApplicationSupport setForegroundAppSupportSplitScreen(boolean z) {
            this.foreground_app_support_split_screen = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ApplicationSupport setSmartAlarm(boolean z) {
            this.smart_alarm = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    public static class ApplicationVersionInfo {
        private Optional<Integer> stream_markdown_version = Optional.a();

        public Optional<Integer> getStreamMarkdownVersion() {
            return this.stream_markdown_version;
        }

        public ApplicationVersionInfo setStreamMarkdownVersion(int i) {
            this.stream_markdown_version = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "AutoAppInfo", namespace = AIApiConstants.Application.NAME)
    public static class AutoAppInfo implements ContextPayload {

        @Required
        private List<AutoAppItem> available_apps;

        public AutoAppInfo() {
        }

        public AutoAppInfo(List<AutoAppItem> list) {
            this.available_apps = list;
        }

        @Required
        public List<AutoAppItem> getAvailableApps() {
            return this.available_apps;
        }

        @Required
        public AutoAppInfo setAvailableApps(List<AutoAppItem> list) {
            this.available_apps = list;
            return this;
        }
    }

    @NamespaceName(name = "AvailableApps", namespace = AIApiConstants.Application.NAME)
    public static class AvailableApps implements ContextPayload {

        @Required
        private List<AppItem> apps;

        public AvailableApps() {
        }

        public AvailableApps(List<AppItem> list) {
            this.apps = list;
        }

        @Required
        public List<AppItem> getApps() {
            return this.apps;
        }

        @Required
        public AvailableApps setApps(List<AppItem> list) {
            this.apps = list;
            return this;
        }
    }

    @NamespaceName(name = "AvatarRequest", namespace = AIApiConstants.Application.NAME)
    public static class AvatarRequest implements EventPayload {
        private Optional<String> query = Optional.a();
        private Optional<Settings.TtsConfig> tts = Optional.a();

        public Optional<String> getQuery() {
            return this.query;
        }

        public Optional<Settings.TtsConfig> getTts() {
            return this.tts;
        }

        public AvatarRequest setQuery(String str) {
            this.query = Optional.e(str);
            return this;
        }

        public AvatarRequest setTts(Settings.TtsConfig ttsConfig) {
            this.tts = Optional.e(ttsConfig);
            return this;
        }
    }

    public static class AvatarState {
        private Optional<Boolean> is_support = Optional.a();

        public Optional<Boolean> isSupport() {
            return this.is_support;
        }

        public AvatarState setIsSupport(boolean z) {
            this.is_support = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    public enum BackgroundAppType {
        UNKNOWN(-1),
        IMAGE_PREVIEW(0),
        DOC_READING(1);

        private int id;

        BackgroundAppType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "BaikeEvent", namespace = AIApiConstants.Application.NAME)
    public static class BaikeEvent implements EventPayload {
        private Optional<Template.WikiEvent> wiki_data = Optional.a();

        public Optional<Template.WikiEvent> getWikiData() {
            return this.wiki_data;
        }

        public BaikeEvent setWikiData(Template.WikiEvent wikiEvent) {
            this.wiki_data = Optional.e(wikiEvent);
            return this;
        }
    }

    public enum CameraLensType {
        UNKNOWN(-1),
        BACK(0),
        FRONT(1);

        private int id;

        CameraLensType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum CameraModuleType {
        UNKNOWN(-1),
        VIDEO(162),
        PHOTO(163),
        PORTRAIT(171);

        private int id;

        CameraModuleType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "CameraState", namespace = AIApiConstants.Application.NAME)
    public static class CameraState implements ContextPayload {

        @Required
        private CameraLensType lens;

        @Required
        private CameraModuleType module;

        public CameraState() {
        }

        public CameraState(CameraModuleType cameraModuleType, CameraLensType cameraLensType) {
            this.module = cameraModuleType;
            this.lens = cameraLensType;
        }

        @Required
        public CameraLensType getLens() {
            return this.lens;
        }

        @Required
        public CameraModuleType getModule() {
            return this.module;
        }

        @Required
        public CameraState setLens(CameraLensType cameraLensType) {
            this.lens = cameraLensType;
            return this;
        }

        @Required
        public CameraState setModule(CameraModuleType cameraModuleType) {
            this.module = cameraModuleType;
            return this;
        }
    }

    @NamespaceName(name = "CancelUserDeviceExecution", namespace = AIApiConstants.Application.NAME)
    public static class CancelUserDeviceExecution implements EventPayload {
    }

    @NamespaceName(name = "CheckAuths", namespace = AIApiConstants.Application.NAME)
    public static class CheckAuths implements InstructionPayload {

        @Required
        private List<Common.MobileMIUI13DeviceAuthCode> voice_assistant_auth_codes;

        public CheckAuths() {
        }

        public CheckAuths(List<Common.MobileMIUI13DeviceAuthCode> list) {
            this.voice_assistant_auth_codes = list;
        }

        @Required
        public List<Common.MobileMIUI13DeviceAuthCode> getVoiceAssistantAuthCodes() {
            return this.voice_assistant_auth_codes;
        }

        @Required
        public CheckAuths setVoiceAssistantAuthCodes(List<Common.MobileMIUI13DeviceAuthCode> list) {
            this.voice_assistant_auth_codes = list;
            return this;
        }
    }

    @NamespaceName(name = "CheckLockScreenAuths", namespace = AIApiConstants.Application.NAME)
    public static class CheckLockScreenAuths implements InstructionPayload {

        @Required
        private List<LockScreenAuthCode> auth_codes;

        public CheckLockScreenAuths() {
        }

        public CheckLockScreenAuths(List<LockScreenAuthCode> list) {
            this.auth_codes = list;
        }

        @Required
        public List<LockScreenAuthCode> getAuthCodes() {
            return this.auth_codes;
        }

        @Required
        public CheckLockScreenAuths setAuthCodes(List<LockScreenAuthCode> list) {
            this.auth_codes = list;
            return this;
        }
    }

    @NamespaceName(name = "CountDown", namespace = AIApiConstants.Application.NAME)
    public static class CountDown implements InstructionPayload {

        @Required
        private List<CountDownItem> count_down_items;

        public CountDown() {
        }

        public CountDown(List<CountDownItem> list) {
            this.count_down_items = list;
        }

        @Required
        public List<CountDownItem> getCountDownItems() {
            return this.count_down_items;
        }

        @Required
        public CountDown setCountDownItems(List<CountDownItem> list) {
            this.count_down_items = list;
            return this;
        }
    }

    public static class CountDownItem {

        @Required
        private String app_pkg_name;

        @Required
        private CountDownOperationType operation_type;

        public CountDownItem() {
        }

        public CountDownItem(String str, CountDownOperationType countDownOperationType) {
            this.app_pkg_name = str;
            this.operation_type = countDownOperationType;
        }

        @Required
        public String getAppPkgName() {
            return this.app_pkg_name;
        }

        @Required
        public CountDownOperationType getOperationType() {
            return this.operation_type;
        }

        @Required
        public CountDownItem setAppPkgName(String str) {
            this.app_pkg_name = str;
            return this;
        }

        @Required
        public CountDownItem setOperationType(CountDownOperationType countDownOperationType) {
            this.operation_type = countDownOperationType;
            return this;
        }
    }

    public enum CountDownMode {
        UNKNOWN(-1),
        READY(0),
        STARTING(1),
        SUSPEND(2),
        CANCELED(3);

        private int id;

        CountDownMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum CountDownOperationType {
        UNKNOWN(-1),
        START(0),
        CANCEL(1),
        SUSPEND(2),
        RESTART(3);

        private int id;

        CountDownOperationType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum CpLevel {
        UNKNOWN(-1),
        ONE(1),
        MULTIPLE(2),
        AGGREGATE(3);

        private int id;

        CpLevel(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class CpState {

        @Required
        private CpLevel cp_level;

        @Required
        private List<String> cps;

        public CpState() {
        }

        public CpState(List<String> list, CpLevel cpLevel) {
            this.cps = list;
            this.cp_level = cpLevel;
        }

        @Required
        public CpLevel getCpLevel() {
            return this.cp_level;
        }

        @Required
        public List<String> getCps() {
            return this.cps;
        }

        @Required
        public CpState setCpLevel(CpLevel cpLevel) {
            this.cp_level = cpLevel;
            return this;
        }

        @Required
        public CpState setCps(List<String> list) {
            this.cps = list;
            return this;
        }
    }

    public enum CrossDeviceConnectType {
        UNKNOWN(-1),
        P2P(0),
        WIFI(1);

        private int id;

        CrossDeviceConnectType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "CrossDeviceEvent", namespace = AIApiConstants.Application.NAME)
    public static class CrossDeviceEvent implements EventPayload {

        @Required
        private String app_id;

        @Required
        private String device_id;

        @Required
        private c4h event;

        public CrossDeviceEvent() {
        }

        public CrossDeviceEvent(String str, c4h c4hVar, String str2) {
            this.device_id = str;
            this.event = c4hVar;
            this.app_id = str2;
        }

        @Required
        public String getAppId() {
            return this.app_id;
        }

        @Required
        public String getDeviceId() {
            return this.device_id;
        }

        @Required
        public c4h getEvent() {
            return this.event;
        }

        @Required
        public CrossDeviceEvent setAppId(String str) {
            this.app_id = str;
            return this;
        }

        @Required
        public CrossDeviceEvent setDeviceId(String str) {
            this.device_id = str;
            return this;
        }

        @Required
        public CrossDeviceEvent setEvent(c4h c4hVar) {
            this.event = c4hVar;
            return this;
        }
    }

    @NamespaceName(name = "CrossDeviceInfo", namespace = AIApiConstants.Application.NAME)
    public static class CrossDeviceInfo implements ContextPayload {

        @Deprecated
        private Optional<ControlPhoneInfo> phone = Optional.a();

        @Deprecated
        private Optional<List<ControlPhoneInfo>> phone_list = Optional.a();
        private Optional<List<ControlDeviceInfo>> device_list = Optional.a();
        private Optional<Boolean> enable_auto_projection = Optional.a();

        public Optional<List<ControlDeviceInfo>> getDeviceList() {
            return this.device_list;
        }

        @Deprecated
        public Optional<ControlPhoneInfo> getPhone() {
            return this.phone;
        }

        @Deprecated
        public Optional<List<ControlPhoneInfo>> getPhoneList() {
            return this.phone_list;
        }

        public Optional<Boolean> isEnableAutoProjection() {
            return this.enable_auto_projection;
        }

        public CrossDeviceInfo setDeviceList(List<ControlDeviceInfo> list) {
            this.device_list = Optional.e(list);
            return this;
        }

        public CrossDeviceInfo setEnableAutoProjection(boolean z) {
            this.enable_auto_projection = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Deprecated
        public CrossDeviceInfo setPhone(ControlPhoneInfo controlPhoneInfo) {
            this.phone = Optional.e(controlPhoneInfo);
            return this;
        }

        @Deprecated
        public CrossDeviceInfo setPhoneList(List<ControlPhoneInfo> list) {
            this.phone_list = Optional.e(list);
            return this;
        }
    }

    @NamespaceName(name = "DisableDriveMode", namespace = AIApiConstants.Application.NAME)
    public static class DisableDriveMode implements InstructionPayload {
    }

    @NamespaceName(name = "DisplayAvatar", namespace = AIApiConstants.Application.NAME)
    @Deprecated
    public static class DisplayAvatar implements InstructionPayload {

        @Required
        private String action;

        public DisplayAvatar() {
        }

        public DisplayAvatar(String str) {
            this.action = str;
        }

        @Required
        public String getAction() {
            return this.action;
        }

        @Required
        public DisplayAvatar setAction(String str) {
            this.action = str;
            return this;
        }
    }

    @NamespaceName(name = "DisplayAvatarV2", namespace = AIApiConstants.Application.NAME)
    public static class DisplayAvatarV2 implements InstructionPayload {

        @Required
        private List<AvatarAction> avatar_list;

        public DisplayAvatarV2() {
        }

        public DisplayAvatarV2(List<AvatarAction> list) {
            this.avatar_list = list;
        }

        @Required
        public List<AvatarAction> getAvatarList() {
            return this.avatar_list;
        }

        @Required
        public DisplayAvatarV2 setAvatarList(List<AvatarAction> list) {
            this.avatar_list = list;
            return this;
        }
    }

    @NamespaceName(name = "DisplayAvatarV3", namespace = AIApiConstants.Application.NAME)
    public static class DisplayAvatarV3 implements InstructionPayload {
        private Optional<TTSActionSourceType> source_type = Optional.a();
        private Optional<AvatarActionInfo> avatar_action_info = Optional.a();
        private Optional<List<AvatarAction>> body_action = Optional.a();
        private Optional<String> depend_instruction_id = Optional.a();
        private Optional<Integer> sequence_id = Optional.a();
        private Optional<Boolean> no_time_info = Optional.a();

        public Optional<AvatarActionInfo> getAvatarActionInfo() {
            return this.avatar_action_info;
        }

        public Optional<List<AvatarAction>> getBodyAction() {
            return this.body_action;
        }

        public Optional<String> getDependInstructionId() {
            return this.depend_instruction_id;
        }

        public Optional<Integer> getSequenceId() {
            return this.sequence_id;
        }

        public Optional<TTSActionSourceType> getSourceType() {
            return this.source_type;
        }

        public Optional<Boolean> isNoTimeInfo() {
            return this.no_time_info;
        }

        public DisplayAvatarV3 setAvatarActionInfo(AvatarActionInfo avatarActionInfo) {
            this.avatar_action_info = Optional.e(avatarActionInfo);
            return this;
        }

        public DisplayAvatarV3 setBodyAction(List<AvatarAction> list) {
            this.body_action = Optional.e(list);
            return this;
        }

        public DisplayAvatarV3 setDependInstructionId(String str) {
            this.depend_instruction_id = Optional.e(str);
            return this;
        }

        public DisplayAvatarV3 setNoTimeInfo(boolean z) {
            this.no_time_info = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public DisplayAvatarV3 setSequenceId(int i) {
            this.sequence_id = Optional.e(Integer.valueOf(i));
            return this;
        }

        public DisplayAvatarV3 setSourceType(TTSActionSourceType tTSActionSourceType) {
            this.source_type = Optional.e(tTSActionSourceType);
            return this;
        }
    }

    @NamespaceName(name = "DriveModeState", namespace = AIApiConstants.Application.NAME)
    public static class DriveModeState implements ContextPayload {
        private Optional<Boolean> available = Optional.a();
        private Optional<Boolean> enable = Optional.a();
        private Optional<Boolean> call = Optional.a();
        private Optional<WeChatStateInDriveMode> wechat_state = Optional.a();
        private Optional<Boolean> no_mask = Optional.a();

        public Optional<WeChatStateInDriveMode> getWechatState() {
            return this.wechat_state;
        }

        public Optional<Boolean> isAvailable() {
            return this.available;
        }

        public Optional<Boolean> isCall() {
            return this.call;
        }

        public Optional<Boolean> isEnable() {
            return this.enable;
        }

        public Optional<Boolean> isNoMask() {
            return this.no_mask;
        }

        public DriveModeState setAvailable(boolean z) {
            this.available = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public DriveModeState setCall(boolean z) {
            this.call = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public DriveModeState setEnable(boolean z) {
            this.enable = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public DriveModeState setNoMask(boolean z) {
            this.no_mask = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public DriveModeState setWechatState(WeChatStateInDriveMode weChatStateInDriveMode) {
            this.wechat_state = Optional.e(weChatStateInDriveMode);
            return this;
        }
    }

    @NamespaceName(name = "EnableDriveMode", namespace = AIApiConstants.Application.NAME)
    public static class EnableDriveMode implements InstructionPayload {
    }

    public enum ExamEventType {
        UNKNOWN(-1),
        REGISTRATION(0),
        PRINT_ADMISSION_CARD(1),
        TAKE_EXAM(2),
        RESULT_PUBLISH(3);

        private int id;

        ExamEventType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class ExamInfo {
        private Optional<String> name = Optional.a();
        private Optional<ExamEventType> event_type = Optional.a();
        private Optional<ExamName> exam_name = Optional.a();
        private Optional<Long> start_time = Optional.a();
        private Optional<Long> end_time = Optional.a();
        private Optional<String> location = Optional.a();
        private Optional<Long> reminder = Optional.a();
        private Optional<Long> last_update_time = Optional.a();

        public Optional<Long> getEndTime() {
            return this.end_time;
        }

        public Optional<ExamEventType> getEventType() {
            return this.event_type;
        }

        public Optional<ExamName> getExamName() {
            return this.exam_name;
        }

        public Optional<Long> getLastUpdateTime() {
            return this.last_update_time;
        }

        public Optional<String> getLocation() {
            return this.location;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<Long> getReminder() {
            return this.reminder;
        }

        public Optional<Long> getStartTime() {
            return this.start_time;
        }

        public ExamInfo setEndTime(long j) {
            this.end_time = Optional.e(Long.valueOf(j));
            return this;
        }

        public ExamInfo setEventType(ExamEventType examEventType) {
            this.event_type = Optional.e(examEventType);
            return this;
        }

        public ExamInfo setExamName(ExamName examName) {
            this.exam_name = Optional.e(examName);
            return this;
        }

        public ExamInfo setLastUpdateTime(long j) {
            this.last_update_time = Optional.e(Long.valueOf(j));
            return this;
        }

        public ExamInfo setLocation(String str) {
            this.location = Optional.e(str);
            return this;
        }

        public ExamInfo setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public ExamInfo setReminder(long j) {
            this.reminder = Optional.e(Long.valueOf(j));
            return this;
        }

        public ExamInfo setStartTime(long j) {
            this.start_time = Optional.e(Long.valueOf(j));
            return this;
        }
    }

    public enum ExamName {
        UNKNOWN(-1),
        CET_4(0),
        CET_6(1),
        UNGEE(2);

        private int id;

        ExamName(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class ExceptionMessage {

        @Required
        private ExceptionMessageCode code;

        @Required
        private String message;

        public ExceptionMessage() {
        }

        public ExceptionMessage(ExceptionMessageCode exceptionMessageCode, String str) {
            this.code = exceptionMessageCode;
            this.message = str;
        }

        @Required
        public ExceptionMessageCode getCode() {
            return this.code;
        }

        @Required
        public String getMessage() {
            return this.message;
        }

        @Required
        public ExceptionMessage setCode(ExceptionMessageCode exceptionMessageCode) {
            this.code = exceptionMessageCode;
            return this;
        }

        @Required
        public ExceptionMessage setMessage(String str) {
            this.message = str;
            return this;
        }
    }

    public enum ExceptionMessageCode {
        UNKNOWN(-1),
        AUTO_DRIVE_AWAY(0),
        AUTO_HIDDEN_MODE(1),
        LOW_BATTERY(2),
        IN_ECONOMIC_MODE_EXCEPTION(3),
        IN_CAR_WASH_MODE_EXCEPTION(4),
        ADD_SYSTEM_EXCEPTION(5),
        NOT_SUPPORT_MODE_EXCEPTION(6),
        IN_ONE_CLICK_BELOW_HIGH_VOLTAGE_EXCEPTION(7),
        OTA_UPDATING_EXCEPTION(8),
        NON_P_GEAR_EXCEPTION(9),
        UP_HIGH_VOLTAGE_FAIL(10),
        PERCEPTION_SYSTEM_OPEN_FAIL(11),
        UNAUTHORIZED_SENTINEL_SERVICE(12),
        PRIVACY_RESTRICT_EXCEPTION(13),
        FULLSCREEN_PROJECT_NO_APP(14),
        FULLSCREEN_PROJECT_NOT_SUPPORT(15),
        FULLSCREEN_PROJECT_READY(16),
        FULLSCREEN_PROJECT_FAILED(17),
        TARGET_PAGE_STATUS_IS_READY(18),
        NO_SONGS_IN_FAVORITES(19),
        PHONE_IS_RINGING(20),
        PHONE_IS_NOT_RINGING(21),
        VOICE_CHANNEL_MUTE_STATUS_IS_READY(22),
        FULLSCREEN_PROJECT_NOT_ALLOWED_IN_DRIVING(23),
        MI_SHARE_IS_BUSY(24),
        PROJECT_STATE_IS_READY(25),
        CONTROLLED_DEVICE_SCREEN_LOCKED(26),
        MEDIA_PLAYER_NOT_SUPPORT_FUNCTION(27),
        BATTERY_FAILURE_NOT_SUPPORT_FUNCTION(28),
        OPEN_REST_MODE_TTS_NOT_RING(29),
        OPEN_REST_MODE_TTS_RING(30),
        PAD_CAMERA_UNAUTHORIZED(31),
        PAD_CAMERA_SWITCH_STATUS_IS_READY(32),
        OPEN_REST_MODE_SSB_ON_EXCEPTION(33),
        APP_NOT_SUPPORT_PIN_OPERATION(34),
        APP_IS_PINNED_ALREADY(35),
        PIN_OPERATION_NOT_ALLOWED_CURRENTLY(36),
        UNABLE_AVOID_DETOURS(37),
        AUTOMATIC_EXECUTE_FAILURE(38),
        AUTOMATIC_EXECUTE_PARTIAL_FAILED(39);

        private int id;

        ExceptionMessageCode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "ExceptionMessageList", namespace = AIApiConstants.Application.NAME)
    public static class ExceptionMessageList implements InstructionPayload {

        @Required
        private List<ExceptionMessage> messages;

        public ExceptionMessageList() {
        }

        public ExceptionMessageList(List<ExceptionMessage> list) {
            this.messages = list;
        }

        @Required
        public List<ExceptionMessage> getMessages() {
            return this.messages;
        }

        @Required
        public ExceptionMessageList setMessages(List<ExceptionMessage> list) {
            this.messages = list;
            return this;
        }
    }

    @NamespaceName(name = "GenerateSpeak", namespace = AIApiConstants.Application.NAME)
    public static class GenerateSpeak implements EventPayload {
        private Optional<String> text = Optional.a();

        public Optional<String> getText() {
            return this.text;
        }

        public GenerateSpeak setText(String str) {
            this.text = Optional.e(str);
            return this;
        }
    }

    public enum HealthCodeAppType {
        UNKNOWN(-1),
        ALIPAY(0),
        WECHAT(1);

        private int id;

        HealthCodeAppType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum HintTag {
        UNKNOWN(-1),
        EXECUTE(0),
        TOO_MANY(1),
        NOT_INSTALLED(2),
        NOT_SUPPORTED(3),
        ACCURATE_MATCH(4),
        NO_MATCH(5),
        CANCEL(6),
        FAILED_MSG(7);

        private int id;

        HintTag(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum InteractionMode {
        UNKNOWN(-1),
        VOICE(0),
        VIDEO(1);

        private int id;

        InteractionMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum LockScreenAuthCode {
        UNKNOWN(-1),
        QUERY_ALARM(0),
        SHOW_MAP(1);

        private int id;

        LockScreenAuthCode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class LockScreenFunctionSwitch {
        private Optional<Boolean> query_alarm = Optional.a();
        private Optional<Boolean> show_map = Optional.a();

        public Optional<Boolean> isQueryAlarm() {
            return this.query_alarm;
        }

        public Optional<Boolean> isShowMap() {
            return this.show_map;
        }

        public LockScreenFunctionSwitch setQueryAlarm(boolean z) {
            this.query_alarm = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public LockScreenFunctionSwitch setShowMap(boolean z) {
            this.show_map = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    public enum MIOTExecuteMode {
        UNKNOWN(-1),
        ONLINE_NLP_OFFLINE_EXEC(0),
        ONLINE_NLP_ONLINE_EXEC(1),
        RACING_NLP_OFFLINE_EXEC(2),
        OFFLINE_NLP_OFFLINE_EXEC(3);

        private int id;

        MIOTExecuteMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class MIOTState {
        private Optional<MIOTExecuteMode> execute_mode = Optional.a();

        public Optional<MIOTExecuteMode> getExecuteMode() {
            return this.execute_mode;
        }

        public MIOTState setExecuteMode(MIOTExecuteMode mIOTExecuteMode) {
            this.execute_mode = Optional.e(mIOTExecuteMode);
            return this;
        }
    }

    @NamespaceName(name = "MemoryData", namespace = AIApiConstants.Application.NAME)
    public static class MemoryData implements InstructionPayload {
        private Optional<String> memory_content = Optional.a();

        public Optional<String> getMemoryContent() {
            return this.memory_content;
        }

        public MemoryData setMemoryContent(String str) {
            this.memory_content = Optional.e(str);
            return this;
        }
    }

    public static class MenstrualData {
        private Optional<Long> period_begin_timestamp = Optional.a();
        private Optional<Long> period_end_timestamp = Optional.a();
        private Optional<Long> predict_period_begin_timestamp = Optional.a();
        private Optional<Long> predict_period_end_timestamp = Optional.a();
        private Optional<Long> last_update_timestamp = Optional.a();

        public Optional<Long> getLastUpdateTimestamp() {
            return this.last_update_timestamp;
        }

        public Optional<Long> getPeriodBeginTimestamp() {
            return this.period_begin_timestamp;
        }

        public Optional<Long> getPeriodEndTimestamp() {
            return this.period_end_timestamp;
        }

        public Optional<Long> getPredictPeriodBeginTimestamp() {
            return this.predict_period_begin_timestamp;
        }

        public Optional<Long> getPredictPeriodEndTimestamp() {
            return this.predict_period_end_timestamp;
        }

        public MenstrualData setLastUpdateTimestamp(long j) {
            this.last_update_timestamp = Optional.e(Long.valueOf(j));
            return this;
        }

        public MenstrualData setPeriodBeginTimestamp(long j) {
            this.period_begin_timestamp = Optional.e(Long.valueOf(j));
            return this;
        }

        public MenstrualData setPeriodEndTimestamp(long j) {
            this.period_end_timestamp = Optional.e(Long.valueOf(j));
            return this;
        }

        public MenstrualData setPredictPeriodBeginTimestamp(long j) {
            this.predict_period_begin_timestamp = Optional.e(Long.valueOf(j));
            return this;
        }

        public MenstrualData setPredictPeriodEndTimestamp(long j) {
            this.predict_period_end_timestamp = Optional.e(Long.valueOf(j));
            return this;
        }
    }

    public enum MiPlayAudioRelayDeviceStatus {
        UNKNOWN(-1),
        IDLE(0),
        PLAYING(1),
        CAST_PLAYING(2),
        CAST_PAUSED(3);

        private int id;

        MiPlayAudioRelayDeviceStatus(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class MiPlayAudioRelayParam {

        @Required
        private List<MiPlayAudioRelayDevice> devices;

        public MiPlayAudioRelayParam() {
        }

        public MiPlayAudioRelayParam(List<MiPlayAudioRelayDevice> list) {
            this.devices = list;
        }

        @Required
        public List<MiPlayAudioRelayDevice> getDevices() {
            return this.devices;
        }

        @Required
        public MiPlayAudioRelayParam setDevices(List<MiPlayAudioRelayDevice> list) {
            this.devices = list;
            return this;
        }
    }

    public static class NeteaseVipState {
        private Optional<Integer> vip_type = Optional.a();
        private Optional<Long> expire_time = Optional.a();

        public Optional<Long> getExpireTime() {
            return this.expire_time;
        }

        public Optional<Integer> getVipType() {
            return this.vip_type;
        }

        public NeteaseVipState setExpireTime(long j) {
            this.expire_time = Optional.e(Long.valueOf(j));
            return this;
        }

        public NeteaseVipState setVipType(int i) {
            this.vip_type = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "PersonEvent", namespace = AIApiConstants.Application.NAME)
    public static class PersonEvent implements EventPayload {
        private Optional<Template.WikiEvent> wiki_data = Optional.a();

        public Optional<Template.WikiEvent> getWikiData() {
            return this.wiki_data;
        }

        public PersonEvent setWikiData(Template.WikiEvent wikiEvent) {
            this.wiki_data = Optional.e(wikiEvent);
            return this;
        }
    }

    @NamespaceName(name = "PersonalState", namespace = AIApiConstants.Application.NAME)
    public static class PersonalState implements ContextPayload {
        private Optional<MenstrualData> menstrual = Optional.a();
        private Optional<List<ExamInfo>> exams = Optional.a();

        public Optional<List<ExamInfo>> getExams() {
            return this.exams;
        }

        public Optional<MenstrualData> getMenstrual() {
            return this.menstrual;
        }

        public PersonalState setExams(List<ExamInfo> list) {
            this.exams = Optional.e(list);
            return this;
        }

        public PersonalState setMenstrual(MenstrualData menstrualData) {
            this.menstrual = Optional.e(menstrualData);
            return this;
        }
    }

    public static class PrivacySetting {
        private Optional<Boolean> smart_travel = Optional.a();
        private Optional<Boolean> menstruation = Optional.a();
        private Optional<Boolean> personalize = Optional.a();

        public Optional<Boolean> isMenstruation() {
            return this.menstruation;
        }

        public Optional<Boolean> isPersonalize() {
            return this.personalize;
        }

        public Optional<Boolean> isSmartTravel() {
            return this.smart_travel;
        }

        public PrivacySetting setMenstruation(boolean z) {
            this.menstruation = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public PrivacySetting setPersonalize(boolean z) {
            this.personalize = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public PrivacySetting setSmartTravel(boolean z) {
            this.smart_travel = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    @NamespaceName(name = "QueryBonusAssistant", namespace = AIApiConstants.Application.NAME)
    public static class QueryBonusAssistant implements InstructionPayload {

        @Required
        private String directive;

        public QueryBonusAssistant() {
        }

        public QueryBonusAssistant(String str) {
            this.directive = str;
        }

        @Required
        public String getDirective() {
            return this.directive;
        }

        @Required
        public QueryBonusAssistant setDirective(String str) {
            this.directive = str;
            return this;
        }
    }

    @NamespaceName(name = "QuickAppState", namespace = AIApiConstants.Application.NAME)
    public static class QuickAppState implements ContextPayload {
        private Optional<c4h> cookie = Optional.a();

        public Optional<c4h> getCookie() {
            return this.cookie;
        }

        public QuickAppState setCookie(c4h c4hVar) {
            this.cookie = Optional.e(c4hVar);
            return this;
        }
    }

    public enum RelayContentType {
        UNKNOWN(-1),
        VIDEO_TELEPHONE(0),
        VIDEO(1),
        AUDIO(2);

        private int id;

        RelayContentType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "ReportRelayDevices", namespace = AIApiConstants.Application.NAME)
    public static class ReportRelayDevices implements EventPayload {

        @Required
        private List<MiPlayAudioRelayDevice> devices;

        public ReportRelayDevices() {
        }

        public ReportRelayDevices(List<MiPlayAudioRelayDevice> list) {
            this.devices = list;
        }

        @Required
        public List<MiPlayAudioRelayDevice> getDevices() {
            return this.devices;
        }

        @Required
        public ReportRelayDevices setDevices(List<MiPlayAudioRelayDevice> list) {
            this.devices = list;
            return this;
        }
    }

    @NamespaceName(name = "ResourceInfo", namespace = AIApiConstants.Application.NAME)
    public static class ResourceInfo implements ContextPayload {
        private Optional<Boolean> need_paid_resource = Optional.a();

        public Optional<Boolean> isNeedPaidResource() {
            return this.need_paid_resource;
        }

        public ResourceInfo setNeedPaidResource(boolean z) {
            this.need_paid_resource = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    public enum ScheduleCircleType {
        UNKNOWN(-1),
        EVERYDAY(0),
        WORKDAY(1),
        MONDAY_TO_FRIDAY(2),
        ONCE(3),
        WEEKLY(4);

        private int id;

        ScheduleCircleType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class ScheduleTime {

        @Required
        private ScheduleTimeFormat format;

        @Required
        private String time;

        public ScheduleTime() {
        }

        public ScheduleTime(ScheduleTimeFormat scheduleTimeFormat, String str) {
            this.format = scheduleTimeFormat;
            this.time = str;
        }

        @Required
        public ScheduleTimeFormat getFormat() {
            return this.format;
        }

        @Required
        public String getTime() {
            return this.time;
        }

        @Required
        public ScheduleTime setFormat(ScheduleTimeFormat scheduleTimeFormat) {
            this.format = scheduleTimeFormat;
            return this;
        }

        @Required
        public ScheduleTime setTime(String str) {
            this.time = str;
            return this;
        }
    }

    public enum ScheduleTimeFormat {
        UNKNOWN(-1),
        TIME(0),
        DATETIME(1);

        private int id;

        ScheduleTimeFormat(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum ScheduleTimeType {
        UNKNOWN(-1),
        CRON(0),
        DURATION(1);

        private int id;

        ScheduleTimeType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum ScreenPermissionState {
        UNKNOWN(-1),
        PERMISSION_GRANTED(0),
        PERMISSION_DENIED(1),
        PERMISSION_ONETIME(2),
        PERMISSION_PROMPT(3),
        PERMISSION_USER_FIX(4),
        PERMISSION_USER_FIX_LATER(5);

        private int id;

        ScreenPermissionState(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum ScreenProjectionState {
        UNKNOWN(-1),
        NOT_PROJECTING(0),
        MIRROR_PROJECTING(1),
        SECONDARY_SCREEN_PROJECTING(2),
        HORIZONTAL_MIRROR_PROJECTING(3),
        MIN_SECONDARY_PROJECTING(4),
        MIN_SECONDARY_AND_MIRROR_PROJECTING(5);

        private int id;

        ScreenProjectionState(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "SetBonusAssistantProperty", namespace = AIApiConstants.Application.NAME)
    public static class SetBonusAssistantProperty implements InstructionPayload {

        @Required
        private String name;

        @Required
        private String value;

        public SetBonusAssistantProperty() {
        }

        public SetBonusAssistantProperty(String str, String str2) {
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
        public SetBonusAssistantProperty setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public SetBonusAssistantProperty setValue(String str) {
            this.value = str;
            return this;
        }
    }

    @NamespaceName(name = "SetSwitchStatus", namespace = AIApiConstants.Application.NAME)
    public static class SetSwitchStatus implements InstructionPayload {

        @Required
        private List<SwitchStatus> status;

        public SetSwitchStatus() {
        }

        public SetSwitchStatus(List<SwitchStatus> list) {
            this.status = list;
        }

        @Required
        public List<SwitchStatus> getStatus() {
            return this.status;
        }

        @Required
        public SetSwitchStatus setStatus(List<SwitchStatus> list) {
            this.status = list;
            return this;
        }
    }

    @NamespaceName(name = "Share", namespace = AIApiConstants.Application.NAME)
    public static class Share implements InstructionPayload {

        @Required
        private c4h params;

        @Required
        private ShareStyle style;

        @Required
        private ShareType type;

        public Share() {
        }

        public Share(ShareType shareType, c4h c4hVar, ShareStyle shareStyle) {
            this.type = shareType;
            this.params = c4hVar;
            this.style = shareStyle;
        }

        @Required
        public c4h getParams() {
            return this.params;
        }

        @Required
        public ShareStyle getStyle() {
            return this.style;
        }

        @Required
        public ShareType getType() {
            return this.type;
        }

        @Required
        public Share setParams(c4h c4hVar) {
            this.params = c4hVar;
            return this;
        }

        @Required
        public Share setStyle(ShareStyle shareStyle) {
            this.style = shareStyle;
            return this;
        }

        @Required
        public Share setType(ShareType shareType) {
            this.type = shareType;
            return this;
        }
    }

    public enum ShareStyleType {
        UNKNOWN(-1),
        CARD(0),
        BUTTON(1),
        HIGHLIGHT_BUTTON(2);

        private int id;

        ShareStyleType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum ShareType {
        UNKNOWN(-1),
        LINK(0),
        PIC(1),
        ANIMATION(2),
        WX_MINI_PROGRAM(3);

        private int id;

        ShareType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "ShowBottomCapture", namespace = AIApiConstants.Application.NAME)
    public static class ShowBottomCapture implements InstructionPayload {
        private Optional<String> guide = Optional.a();

        public Optional<String> getGuide() {
            return this.guide;
        }

        public ShowBottomCapture setGuide(String str) {
            this.guide = Optional.e(str);
            return this;
        }
    }

    public enum SimulateClickSearchType {
        UNKNOWN(-1),
        USER(0),
        GROUP(1);

        private int id;

        SimulateClickSearchType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "SimulateClickState", namespace = AIApiConstants.Application.NAME)
    public static class SimulateClickState implements ContextPayload {
        private Optional<Boolean> input_method_running = Optional.a();
        private Optional<Integer> node_id = Optional.a();
        private Optional<String> wechat_contact_matched = Optional.a();
        private Optional<String> page_id = Optional.a();

        public Optional<Integer> getNodeId() {
            return this.node_id;
        }

        public Optional<String> getPageId() {
            return this.page_id;
        }

        public Optional<String> getWechatContactMatched() {
            return this.wechat_contact_matched;
        }

        public Optional<Boolean> isInputMethodRunning() {
            return this.input_method_running;
        }

        public SimulateClickState setInputMethodRunning(boolean z) {
            this.input_method_running = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public SimulateClickState setNodeId(int i) {
            this.node_id = Optional.e(Integer.valueOf(i));
            return this;
        }

        public SimulateClickState setPageId(String str) {
            this.page_id = Optional.e(str);
            return this;
        }

        public SimulateClickState setWechatContactMatched(String str) {
            this.wechat_contact_matched = Optional.e(str);
            return this;
        }
    }

    public enum SimulateClickType {
        UNKNOWN(-1),
        DEFAULT(0),
        WECHAT(1),
        PERSONALIZE(2);

        private int id;

        SimulateClickType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SpecialCardStatus {
        UNKNOWN(-1),
        OPEN(0),
        CLOSE(1);

        private int id;

        SpecialCardStatus(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "SpecialCards", namespace = AIApiConstants.Application.NAME)
    public static class SpecialCards implements ContextPayload {

        @Required
        private List<SpecialCardInfo> cards;

        public SpecialCards() {
        }

        public SpecialCards(List<SpecialCardInfo> list) {
            this.cards = list;
        }

        @Required
        public List<SpecialCardInfo> getCards() {
            return this.cards;
        }

        @Required
        public SpecialCards setCards(List<SpecialCardInfo> list) {
            this.cards = list;
            return this;
        }
    }

    @NamespaceName(name = "State", namespace = AIApiConstants.Application.NAME)
    public static class State implements ContextPayload {

        @Deprecated
        private Optional<Boolean> screening_on = Optional.a();

        @Deprecated
        private Optional<Boolean> parental_control_mode = Optional.a();
        private Optional<List<ToneInfo>> support_tones = Optional.a();
        private Optional<String> current_tone_id = Optional.a();
        private Optional<String> current_music_player_pkg = Optional.a();
        private Optional<String> current_music_player_version = Optional.a();
        private Optional<Boolean> enable_screening = Optional.a();
        private Optional<Boolean> use_trip_app_data = Optional.a();
        private Optional<Boolean> shutoff_timer = Optional.a();
        private Optional<String> current_tone_vendor_id = Optional.a();
        private Optional<Boolean> showing_bottom_capture = Optional.a();
        private Optional<List<SwitchStatus>> switch_status = Optional.a();
        private Optional<AppState> app_state = Optional.a();
        private Optional<MIOTState> miot_state = Optional.a();
        private Optional<UserState> user_state = Optional.a();
        private Optional<CpState> cp_state = Optional.a();
        private Optional<PrivacySetting> privacy_setting = Optional.a();
        private Optional<LockScreenFunctionSwitch> lock_screen_switch = Optional.a();
        private Optional<Boolean> is_avatar_open = Optional.a();
        private Optional<WakeupSetting> wakeup = Optional.a();
        private Optional<Boolean> smart_alarm_opened = Optional.a();
        private Optional<ApplicationStatePayload> next_level_state = Optional.a();
        private Optional<AvatarState> avatar_state = Optional.a();

        public Optional<AppState> getAppState() {
            return this.app_state;
        }

        public Optional<AvatarState> getAvatarState() {
            return this.avatar_state;
        }

        public Optional<CpState> getCpState() {
            return this.cp_state;
        }

        public Optional<String> getCurrentMusicPlayerPkg() {
            return this.current_music_player_pkg;
        }

        public Optional<String> getCurrentMusicPlayerVersion() {
            return this.current_music_player_version;
        }

        public Optional<String> getCurrentToneId() {
            return this.current_tone_id;
        }

        public Optional<String> getCurrentToneVendorId() {
            return this.current_tone_vendor_id;
        }

        public Optional<LockScreenFunctionSwitch> getLockScreenSwitch() {
            return this.lock_screen_switch;
        }

        public Optional<MIOTState> getMiotState() {
            return this.miot_state;
        }

        public Optional<ApplicationStatePayload> getNextLevelState() {
            return this.next_level_state;
        }

        public Optional<PrivacySetting> getPrivacySetting() {
            return this.privacy_setting;
        }

        public Optional<List<ToneInfo>> getSupportTones() {
            return this.support_tones;
        }

        public Optional<List<SwitchStatus>> getSwitchStatus() {
            return this.switch_status;
        }

        public Optional<UserState> getUserState() {
            return this.user_state;
        }

        public Optional<WakeupSetting> getWakeup() {
            return this.wakeup;
        }

        public Optional<Boolean> isAvatarOpen() {
            return this.is_avatar_open;
        }

        public Optional<Boolean> isEnableScreening() {
            return this.enable_screening;
        }

        @Deprecated
        public Optional<Boolean> isParentalControlMode() {
            return this.parental_control_mode;
        }

        @Deprecated
        public Optional<Boolean> isScreeningOn() {
            return this.screening_on;
        }

        public Optional<Boolean> isShowingBottomCapture() {
            return this.showing_bottom_capture;
        }

        public Optional<Boolean> isShutoffTimer() {
            return this.shutoff_timer;
        }

        public Optional<Boolean> isSmartAlarmOpened() {
            return this.smart_alarm_opened;
        }

        public Optional<Boolean> isUseTripAppData() {
            return this.use_trip_app_data;
        }

        public State setAppState(AppState appState) {
            this.app_state = Optional.e(appState);
            return this;
        }

        public State setAvatarState(AvatarState avatarState) {
            this.avatar_state = Optional.e(avatarState);
            return this;
        }

        public State setCpState(CpState cpState) {
            this.cp_state = Optional.e(cpState);
            return this;
        }

        public State setCurrentMusicPlayerPkg(String str) {
            this.current_music_player_pkg = Optional.e(str);
            return this;
        }

        public State setCurrentMusicPlayerVersion(String str) {
            this.current_music_player_version = Optional.e(str);
            return this;
        }

        public State setCurrentToneId(String str) {
            this.current_tone_id = Optional.e(str);
            return this;
        }

        public State setCurrentToneVendorId(String str) {
            this.current_tone_vendor_id = Optional.e(str);
            return this;
        }

        public State setEnableScreening(boolean z) {
            this.enable_screening = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public State setIsAvatarOpen(boolean z) {
            this.is_avatar_open = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public State setLockScreenSwitch(LockScreenFunctionSwitch lockScreenFunctionSwitch) {
            this.lock_screen_switch = Optional.e(lockScreenFunctionSwitch);
            return this;
        }

        public State setMiotState(MIOTState mIOTState) {
            this.miot_state = Optional.e(mIOTState);
            return this;
        }

        public State setNextLevelState(ApplicationStatePayload applicationStatePayload) {
            this.next_level_state = Optional.e(applicationStatePayload);
            return this;
        }

        @Deprecated
        public State setParentalControlMode(boolean z) {
            this.parental_control_mode = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public State setPrivacySetting(PrivacySetting privacySetting) {
            this.privacy_setting = Optional.e(privacySetting);
            return this;
        }

        @Deprecated
        public State setScreeningOn(boolean z) {
            this.screening_on = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public State setShowingBottomCapture(boolean z) {
            this.showing_bottom_capture = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public State setShutoffTimer(boolean z) {
            this.shutoff_timer = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public State setSmartAlarmOpened(boolean z) {
            this.smart_alarm_opened = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public State setSupportTones(List<ToneInfo> list) {
            this.support_tones = Optional.e(list);
            return this;
        }

        public State setSwitchStatus(List<SwitchStatus> list) {
            this.switch_status = Optional.e(list);
            return this;
        }

        public State setUseTripAppData(boolean z) {
            this.use_trip_app_data = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public State setUserState(UserState userState) {
            this.user_state = Optional.e(userState);
            return this;
        }

        public State setWakeup(WakeupSetting wakeupSetting) {
            this.wakeup = Optional.e(wakeupSetting);
            return this;
        }
    }

    @NamespaceName(name = "StopRelayContent", namespace = AIApiConstants.Application.NAME)
    public static class StopRelayContent implements InstructionPayload {
    }

    public enum SwitchFeature {
        UNKNOWN(-1),
        SMART_KID_PROTECTION(0),
        VOICE_ASSISTANT_BROADCAST_IN_SILENT(1),
        AI_READING(2),
        MIUI_SIMPLE(3),
        ONE_SHOT(4),
        VOICE_WAKE_UP(5),
        LLM(6),
        HIDDEN_MODE(7),
        MEMORY(8);

        private int id;

        SwitchFeature(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class SwitchStatus {

        @Required
        private boolean enabled;

        @Required
        private SwitchFeature name;

        public SwitchStatus() {
        }

        public SwitchStatus(SwitchFeature switchFeature, boolean z) {
            this.name = switchFeature;
            this.enabled = z;
        }

        @Required
        public SwitchFeature getName() {
            return this.name;
        }

        @Required
        public boolean isEnabled() {
            return this.enabled;
        }

        @Required
        public SwitchStatus setEnabled(boolean z) {
            this.enabled = z;
            return this;
        }

        @Required
        public SwitchStatus setName(SwitchFeature switchFeature) {
            this.name = switchFeature;
            return this;
        }
    }

    @NamespaceName(name = "SwitchTimeFormat", namespace = AIApiConstants.Application.NAME)
    public static class SwitchTimeFormat implements InstructionPayload {

        @Required
        private Common.TimeFormat format;

        public SwitchTimeFormat() {
        }

        public SwitchTimeFormat(Common.TimeFormat timeFormat) {
            this.format = timeFormat;
        }

        @Required
        public Common.TimeFormat getFormat() {
            return this.format;
        }

        @Required
        public SwitchTimeFormat setFormat(Common.TimeFormat timeFormat) {
            this.format = timeFormat;
            return this;
        }
    }

    public enum TTSActionSourceType {
        UNKNOWN(-1),
        SPEAK(0),
        AUDIO_PLAY(1);

        private int id;

        TTSActionSourceType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "TaskState", namespace = AIApiConstants.Application.NAME)
    public static class TaskState implements ContextPayload {
        private Optional<String> foreground = Optional.a();
        private Optional<List<String>> all = Optional.a();

        public Optional<List<String>> getAll() {
            return this.all;
        }

        public Optional<String> getForeground() {
            return this.foreground;
        }

        public TaskState setAll(List<String> list) {
            this.all = Optional.e(list);
            return this;
        }

        public TaskState setForeground(String str) {
            this.foreground = Optional.e(str);
            return this;
        }
    }

    public static class ToneInfo {

        @Required
        private String id;

        @Required
        private ToneName name;

        @Required
        private ToneType type;

        public ToneInfo() {
        }

        public ToneInfo(String str, ToneType toneType, ToneName toneName) {
            this.id = str;
            this.type = toneType;
            this.name = toneName;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public ToneName getName() {
            return this.name;
        }

        @Required
        public ToneType getType() {
            return this.type;
        }

        @Required
        public ToneInfo setId(String str) {
            this.id = str;
            return this;
        }

        @Required
        public ToneInfo setName(ToneName toneName) {
            this.name = toneName;
            return this;
        }

        @Required
        public ToneInfo setType(ToneType toneType) {
            this.type = toneType;
            return this;
        }
    }

    public enum ToneName {
        UNKNOWN(-1),
        MI_TANG(0),
        QING_CONG(1),
        MO_LI(2),
        PAO_FU(3),
        MATURE_MALE(4),
        MATURE_FEMALE(5);

        private int id;

        ToneName(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum ToneType {
        UNKNOWN(-1),
        MALE(0),
        FEMALE(1),
        CHILD(2);

        private int id;

        ToneType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum TranslationType {
        UNKNOWN(-1),
        DIALOG(0),
        WORD(1),
        SWITCH_WORD(2),
        SWITCH_SYNONYM_WORD(3);

        private int id;

        TranslationType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "UIAgentInfo", namespace = AIApiConstants.Application.NAME)
    public static class UIAgentInfo implements ContextPayload {
        private Optional<String> image_id = Optional.a();
        private Optional<Integer> width = Optional.a();
        private Optional<Integer> height = Optional.a();
        private Optional<Integer> compression_rate = Optional.a();

        public Optional<Integer> getCompressionRate() {
            return this.compression_rate;
        }

        public Optional<Integer> getHeight() {
            return this.height;
        }

        public Optional<String> getImageId() {
            return this.image_id;
        }

        public Optional<Integer> getWidth() {
            return this.width;
        }

        public UIAgentInfo setCompressionRate(int i) {
            this.compression_rate = Optional.e(Integer.valueOf(i));
            return this;
        }

        public UIAgentInfo setHeight(int i) {
            this.height = Optional.e(Integer.valueOf(i));
            return this;
        }

        public UIAgentInfo setImageId(String str) {
            this.image_id = Optional.e(str);
            return this;
        }

        public UIAgentInfo setWidth(int i) {
            this.width = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    public static class UIAgentPosition {

        @Required
        private float x;

        @Required
        private float y;

        public UIAgentPosition() {
        }

        public UIAgentPosition(float f, float f2) {
            this.x = f;
            this.y = f2;
        }

        @Required
        public float getX() {
            return this.x;
        }

        @Required
        public float getY() {
            return this.y;
        }

        @Required
        public UIAgentPosition setX(float f) {
            this.x = f;
            return this;
        }

        @Required
        public UIAgentPosition setY(float f) {
            this.y = f;
            return this;
        }
    }

    public enum UIAgentType {
        UNKNOWN(-1),
        TAP(0),
        TYPING(1),
        SWIPE(2),
        LONG_PRESS(3);

        private int id;

        UIAgentType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum UploadMode {
        UNKNOWN(-1),
        AUTO(0),
        MANUAL(1);

        private int id;

        UploadMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class UserState {
        private Optional<List<UserVipState>> user_vip_states = Optional.a();
        private Optional<Boolean> is_child = Optional.a();
        private Optional<String> qq_open_id = Optional.a();
        private Optional<String> netease_open_id = Optional.a();
        private Optional<String> vip_binary = Optional.a();
        private Optional<String> kugou_open_id = Optional.a();
        private Optional<String> ximalaya_open_id = Optional.a();
        private Optional<List<NeteaseVipState>> netease_vip_states = Optional.a();
        private Optional<String> gaode_open_id = Optional.a();
        private Optional<Boolean> invite_test_passed = Optional.a();
        private Optional<String> car_number = Optional.a();

        public Optional<String> getCarNumber() {
            return this.car_number;
        }

        public Optional<String> getGaodeOpenId() {
            return this.gaode_open_id;
        }

        public Optional<String> getKugouOpenId() {
            return this.kugou_open_id;
        }

        public Optional<String> getNeteaseOpenId() {
            return this.netease_open_id;
        }

        public Optional<List<NeteaseVipState>> getNeteaseVipStates() {
            return this.netease_vip_states;
        }

        public Optional<String> getQqOpenId() {
            return this.qq_open_id;
        }

        public Optional<List<UserVipState>> getUserVipStates() {
            return this.user_vip_states;
        }

        public Optional<String> getVipBinary() {
            return this.vip_binary;
        }

        public Optional<String> getXimalayaOpenId() {
            return this.ximalaya_open_id;
        }

        public Optional<Boolean> isChild() {
            return this.is_child;
        }

        public Optional<Boolean> isInviteTestPassed() {
            return this.invite_test_passed;
        }

        public UserState setCarNumber(String str) {
            this.car_number = Optional.e(str);
            return this;
        }

        public UserState setGaodeOpenId(String str) {
            this.gaode_open_id = Optional.e(str);
            return this;
        }

        public UserState setInviteTestPassed(boolean z) {
            this.invite_test_passed = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public UserState setIsChild(boolean z) {
            this.is_child = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public UserState setKugouOpenId(String str) {
            this.kugou_open_id = Optional.e(str);
            return this;
        }

        public UserState setNeteaseOpenId(String str) {
            this.netease_open_id = Optional.e(str);
            return this;
        }

        public UserState setNeteaseVipStates(List<NeteaseVipState> list) {
            this.netease_vip_states = Optional.e(list);
            return this;
        }

        public UserState setQqOpenId(String str) {
            this.qq_open_id = Optional.e(str);
            return this;
        }

        public UserState setUserVipStates(List<UserVipState> list) {
            this.user_vip_states = Optional.e(list);
            return this;
        }

        public UserState setVipBinary(String str) {
            this.vip_binary = Optional.e(str);
            return this;
        }

        public UserState setXimalayaOpenId(String str) {
            this.ximalaya_open_id = Optional.e(str);
            return this;
        }
    }

    public static class UserVipState {
        private Optional<UserVipType> vip_type = Optional.a();
        private Optional<Boolean> is_valid = Optional.a();

        public Optional<UserVipType> getVipType() {
            return this.vip_type;
        }

        public Optional<Boolean> isValid() {
            return this.is_valid;
        }

        public UserVipState setIsValid(boolean z) {
            this.is_valid = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public UserVipState setVipType(UserVipType userVipType) {
            this.vip_type = Optional.e(userVipType);
            return this;
        }
    }

    public enum UserVipType {
        UNKNOWN(-1),
        KIDS(1),
        EDU_PRIMARY(2),
        EDU_JUNIOR(3),
        EDU_SENIOR(4),
        CHANGBA(5),
        QUANMIN_KTV(6),
        QQ_MUSIC(7),
        DVD(8),
        MOVIES(9),
        NETEASE_MUSIC(10),
        DB_KUGOU_MUSIC(11),
        KUGOU_MUSIC(12),
        XIMALAYA(13);

        private int id;

        UserVipType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = com.xiaomi.ai.api.intent.AIApiConstants.Vibrate.NAME, namespace = AIApiConstants.Application.NAME)
    public static class Vibrate implements InstructionPayload {

        @Required
        private long duration_in_ms;

        public Vibrate() {
        }

        public Vibrate(long j) {
            this.duration_in_ms = j;
        }

        @Required
        public long getDurationInMs() {
            return this.duration_in_ms;
        }

        @Required
        public Vibrate setDurationInMs(long j) {
            this.duration_in_ms = j;
            return this;
        }
    }

    @NamespaceName(name = "VoiceWakeupState", namespace = AIApiConstants.Application.NAME)
    public static class VoiceWakeupState implements ContextPayload {
        private Optional<VoiceWakeupType> type = Optional.a();
        private Optional<Boolean> is_open = Optional.a();
        private Optional<Long> last_close_time = Optional.a();
        private Optional<Boolean> is_voiceprint_enter = Optional.a();
        private Optional<Boolean> is_long_press_power_open = Optional.a();

        public Optional<Long> getLastCloseTime() {
            return this.last_close_time;
        }

        public Optional<VoiceWakeupType> getType() {
            return this.type;
        }

        public Optional<Boolean> isLongPressPowerOpen() {
            return this.is_long_press_power_open;
        }

        public Optional<Boolean> isOpen() {
            return this.is_open;
        }

        public Optional<Boolean> isVoiceprintEnter() {
            return this.is_voiceprint_enter;
        }

        public VoiceWakeupState setIsLongPressPowerOpen(boolean z) {
            this.is_long_press_power_open = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VoiceWakeupState setIsOpen(boolean z) {
            this.is_open = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VoiceWakeupState setIsVoiceprintEnter(boolean z) {
            this.is_voiceprint_enter = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VoiceWakeupState setLastCloseTime(long j) {
            this.last_close_time = Optional.e(Long.valueOf(j));
            return this;
        }

        public VoiceWakeupState setType(VoiceWakeupType voiceWakeupType) {
            this.type = Optional.e(voiceWakeupType);
            return this;
        }
    }

    public enum VoiceWakeupType {
        UNKNOWN(-1),
        TYPE_A(0);

        private int id;

        VoiceWakeupType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum WXMiniProgramType {
        UNKNOWN(-1),
        TEST(0),
        PREVIEW(1),
        RELEASE(2);

        private int id;

        WXMiniProgramType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class WakeupSetting {
        private Optional<Boolean> is_request_sound_off = Optional.a();

        public Optional<Boolean> isRequestSoundOff() {
            return this.is_request_sound_off;
        }

        public WakeupSetting setIsRequestSoundOff(boolean z) {
            this.is_request_sound_off = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    public static class WeChatStateInDriveMode {
        private Optional<Boolean> prompt_for_blocked_message_sender = Optional.a();
        private Optional<Boolean> need_confirm_education = Optional.a();
        private Optional<Boolean> need_reply_education = Optional.a();
        private Optional<Boolean> reinput_button_clicked = Optional.a();
        private Optional<Boolean> is_passive_mode = Optional.a();
        private Optional<Boolean> need_finish_education = Optional.a();

        public Optional<Boolean> isNeedConfirmEducation() {
            return this.need_confirm_education;
        }

        public Optional<Boolean> isNeedFinishEducation() {
            return this.need_finish_education;
        }

        public Optional<Boolean> isNeedReplyEducation() {
            return this.need_reply_education;
        }

        public Optional<Boolean> isPassiveMode() {
            return this.is_passive_mode;
        }

        public Optional<Boolean> isPromptForBlockedMessageSender() {
            return this.prompt_for_blocked_message_sender;
        }

        public Optional<Boolean> isReinputButtonClicked() {
            return this.reinput_button_clicked;
        }

        public WeChatStateInDriveMode setIsPassiveMode(boolean z) {
            this.is_passive_mode = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public WeChatStateInDriveMode setNeedConfirmEducation(boolean z) {
            this.need_confirm_education = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public WeChatStateInDriveMode setNeedFinishEducation(boolean z) {
            this.need_finish_education = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public WeChatStateInDriveMode setNeedReplyEducation(boolean z) {
            this.need_reply_education = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public WeChatStateInDriveMode setPromptForBlockedMessageSender(boolean z) {
            this.prompt_for_blocked_message_sender = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public WeChatStateInDriveMode setReinputButtonClicked(boolean z) {
            this.reinput_button_clicked = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    public enum WeiXinDriveModeOp {
        UNKNOWN(-1),
        REPROMPT(0),
        READ_MESSAGE(1),
        NO_READ(2),
        SEND_MESSAGE(3),
        REINPUT_MESSAGE(4),
        SKIP(5),
        CLOSE_IM_BROADCAST(6),
        BLOCK_MESSAGE_SENDER(7),
        PROACTIVE_SEND_MESSAGE(8),
        PROACTIVE_SEND_MESSAGE_SKIP(9);

        private int id;

        WeiXinDriveModeOp(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class WeixinContactSlot {

        @Required
        private String name;

        @Required
        private String raw_name;

        public WeixinContactSlot() {
        }

        public WeixinContactSlot(String str, String str2) {
            this.name = str;
            this.raw_name = str2;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public String getRawName() {
            return this.raw_name;
        }

        @Required
        public WeixinContactSlot setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public WeixinContactSlot setRawName(String str) {
            this.raw_name = str;
            return this;
        }
    }

    @NamespaceName(name = "WholeHousePlay", namespace = AIApiConstants.Application.NAME)
    public static class WholeHousePlay implements InstructionPayload {
    }

    @NamespaceName(name = "AppDetail", namespace = AIApiConstants.Application.NAME)
    @Deprecated
    public static class AppDetail implements ContextPayload {

        @Required
        private List<AppItem> available_apps;
        private Optional<AppItem> foreground_app = Optional.a();

        public AppDetail() {
        }

        @Required
        public List<AppItem> getAvailableApps() {
            return this.available_apps;
        }

        public Optional<AppItem> getForegroundApp() {
            return this.foreground_app;
        }

        @Required
        public AppDetail setAvailableApps(List<AppItem> list) {
            this.available_apps = list;
            return this;
        }

        public AppDetail setForegroundApp(AppItem appItem) {
            this.foreground_app = Optional.e(appItem);
            return this;
        }

        public AppDetail(List<AppItem> list) {
            this.available_apps = list;
        }
    }

    public static class AvatarActionInfo {
        private Optional<Boolean> is_end = Optional.a();

        @Required
        private String time_info;

        public AvatarActionInfo() {
        }

        @Required
        public String getTimeInfo() {
            return this.time_info;
        }

        public Optional<Boolean> isEnd() {
            return this.is_end;
        }

        public AvatarActionInfo setIsEnd(boolean z) {
            this.is_end = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Required
        public AvatarActionInfo setTimeInfo(String str) {
            this.time_info = str;
            return this;
        }

        public AvatarActionInfo(String str) {
            this.time_info = str;
        }
    }

    @NamespaceName(name = "CheckApps", namespace = AIApiConstants.Application.NAME)
    public static class CheckApps implements InstructionPayload {

        @Required
        private List<CheckAppItem> apps;
        private Optional<List<String>> names = Optional.a();

        public CheckApps() {
        }

        @Required
        public List<CheckAppItem> getApps() {
            return this.apps;
        }

        public Optional<List<String>> getNames() {
            return this.names;
        }

        @Required
        public CheckApps setApps(List<CheckAppItem> list) {
            this.apps = list;
            return this;
        }

        public CheckApps setNames(List<String> list) {
            this.names = Optional.e(list);
            return this;
        }

        public CheckApps(List<CheckAppItem> list) {
            this.apps = list;
        }
    }

    @NamespaceName(name = "CheckAppsFailed", namespace = AIApiConstants.Application.NAME)
    public static class CheckAppsFailed implements EventPayload {

        @Required
        private List<CheckAppFailedItem> apps;
        private Optional<String> dialog_id = Optional.a();

        public CheckAppsFailed() {
        }

        @Required
        public List<CheckAppFailedItem> getApps() {
            return this.apps;
        }

        public Optional<String> getDialogId() {
            return this.dialog_id;
        }

        @Required
        public CheckAppsFailed setApps(List<CheckAppFailedItem> list) {
            this.apps = list;
            return this;
        }

        public CheckAppsFailed setDialogId(String str) {
            this.dialog_id = Optional.e(str);
            return this;
        }

        public CheckAppsFailed(List<CheckAppFailedItem> list) {
            this.apps = list;
        }
    }

    @NamespaceName(name = "ExpectPush", namespace = AIApiConstants.Application.NAME)
    public static class ExpectPush implements InstructionPayload {

        @Required
        private String source;
        private Optional<Long> timeout_in_millis = Optional.a();

        public ExpectPush() {
        }

        @Required
        public String getSource() {
            return this.source;
        }

        public Optional<Long> getTimeoutInMillis() {
            return this.timeout_in_millis;
        }

        @Required
        public ExpectPush setSource(String str) {
            this.source = str;
            return this;
        }

        public ExpectPush setTimeoutInMillis(long j) {
            this.timeout_in_millis = Optional.e(Long.valueOf(j));
            return this;
        }

        public ExpectPush(String str) {
            this.source = str;
        }
    }

    @NamespaceName(name = "Operate", namespace = AIApiConstants.Application.NAME)
    public static class Operate implements InstructionPayload {
        private Optional<List<AppExtra>> app_extras = Optional.a();

        @Required
        private List<Template.AndroidApp> apps;

        @Required
        private List<Hint> hints;

        @Required
        private String keyword;

        @Required
        private ApplicationOp operation;

        @Required
        private boolean use_local_app;

        public Operate() {
        }

        public Optional<List<AppExtra>> getAppExtras() {
            return this.app_extras;
        }

        @Required
        public List<Template.AndroidApp> getApps() {
            return this.apps;
        }

        @Required
        public List<Hint> getHints() {
            return this.hints;
        }

        @Required
        public String getKeyword() {
            return this.keyword;
        }

        @Required
        public ApplicationOp getOperation() {
            return this.operation;
        }

        @Required
        public boolean isUseLocalApp() {
            return this.use_local_app;
        }

        public Operate setAppExtras(List<AppExtra> list) {
            this.app_extras = Optional.e(list);
            return this;
        }

        @Required
        public Operate setApps(List<Template.AndroidApp> list) {
            this.apps = list;
            return this;
        }

        @Required
        public Operate setHints(List<Hint> list) {
            this.hints = list;
            return this;
        }

        @Required
        public Operate setKeyword(String str) {
            this.keyword = str;
            return this;
        }

        @Required
        public Operate setOperation(ApplicationOp applicationOp) {
            this.operation = applicationOp;
            return this;
        }

        @Required
        public Operate setUseLocalApp(boolean z) {
            this.use_local_app = z;
            return this;
        }

        public Operate(ApplicationOp applicationOp, List<Template.AndroidApp> list, String str, boolean z, List<Hint> list2) {
            this.operation = applicationOp;
            this.apps = list;
            this.keyword = str;
            this.use_local_app = z;
            this.hints = list2;
        }
    }

    @NamespaceName(name = "OperateTvApp", namespace = AIApiConstants.Application.NAME)
    public static class OperateTvApp implements InstructionPayload {

        @Required
        private List<String> app_names;

        @Required
        private c4h content;

        @Required
        private ApplicationOp operation;
        private Optional<List<String>> pkg_names = Optional.a();

        public OperateTvApp() {
        }

        @Required
        public List<String> getAppNames() {
            return this.app_names;
        }

        @Required
        public c4h getContent() {
            return this.content;
        }

        @Required
        public ApplicationOp getOperation() {
            return this.operation;
        }

        public Optional<List<String>> getPkgNames() {
            return this.pkg_names;
        }

        @Required
        public OperateTvApp setAppNames(List<String> list) {
            this.app_names = list;
            return this;
        }

        @Required
        public OperateTvApp setContent(c4h c4hVar) {
            this.content = c4hVar;
            return this;
        }

        @Required
        public OperateTvApp setOperation(ApplicationOp applicationOp) {
            this.operation = applicationOp;
            return this;
        }

        public OperateTvApp setPkgNames(List<String> list) {
            this.pkg_names = Optional.e(list);
            return this;
        }

        public OperateTvApp(ApplicationOp applicationOp, List<String> list, c4h c4hVar) {
            this.operation = applicationOp;
            this.app_names = list;
            this.content = c4hVar;
        }
    }

    public static class ScheduleDuration {

        @Required
        private String end;
        private Optional<ScheduleTimeFormat> format = Optional.a();

        @Required
        private String start;

        public ScheduleDuration() {
        }

        @Required
        public String getEnd() {
            return this.end;
        }

        public Optional<ScheduleTimeFormat> getFormat() {
            return this.format;
        }

        @Required
        public String getStart() {
            return this.start;
        }

        @Required
        public ScheduleDuration setEnd(String str) {
            this.end = str;
            return this;
        }

        public ScheduleDuration setFormat(ScheduleTimeFormat scheduleTimeFormat) {
            this.format = Optional.e(scheduleTimeFormat);
            return this;
        }

        @Required
        public ScheduleDuration setStart(String str) {
            this.start = str;
            return this;
        }

        public ScheduleDuration(String str, String str2) {
            this.start = str;
            this.end = str2;
        }
    }

    public static class SpecialCardInfo {
        private Optional<c4h> info = Optional.a();

        @Required
        private String name;

        @Required
        private SpecialCardStatus status;

        public SpecialCardInfo() {
        }

        public Optional<c4h> getInfo() {
            return this.info;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public SpecialCardStatus getStatus() {
            return this.status;
        }

        public SpecialCardInfo setInfo(c4h c4hVar) {
            this.info = Optional.e(c4hVar);
            return this;
        }

        @Required
        public SpecialCardInfo setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public SpecialCardInfo setStatus(SpecialCardStatus specialCardStatus) {
            this.status = specialCardStatus;
            return this;
        }

        public SpecialCardInfo(String str, SpecialCardStatus specialCardStatus) {
            this.name = str;
            this.status = specialCardStatus;
        }
    }

    public static class TTSToneInfo {
        private Optional<String> lang = Optional.a();

        @Required
        private String speaker;

        @Required
        private String vendor;

        public TTSToneInfo() {
        }

        public Optional<String> getLang() {
            return this.lang;
        }

        @Required
        public String getSpeaker() {
            return this.speaker;
        }

        @Required
        public String getVendor() {
            return this.vendor;
        }

        public TTSToneInfo setLang(String str) {
            this.lang = Optional.e(str);
            return this;
        }

        @Required
        public TTSToneInfo setSpeaker(String str) {
            this.speaker = str;
            return this;
        }

        @Required
        public TTSToneInfo setVendor(String str) {
            this.vendor = str;
            return this;
        }

        public TTSToneInfo(String str, String str2) {
            this.vendor = str;
            this.speaker = str2;
        }
    }

    public static class AppExtra {

        @Required
        private String pkg_name;
        private Optional<Template.AppControl> control = Optional.a();
        private Optional<Template.AppAds> ads = Optional.a();

        public AppExtra() {
        }

        public Optional<Template.AppAds> getAds() {
            return this.ads;
        }

        public Optional<Template.AppControl> getControl() {
            return this.control;
        }

        @Required
        public String getPkgName() {
            return this.pkg_name;
        }

        public AppExtra setAds(Template.AppAds appAds) {
            this.ads = Optional.e(appAds);
            return this;
        }

        public AppExtra setControl(Template.AppControl appControl) {
            this.control = Optional.e(appControl);
            return this;
        }

        @Required
        public AppExtra setPkgName(String str) {
            this.pkg_name = str;
            return this;
        }

        public AppExtra(String str) {
            this.pkg_name = str;
        }
    }

    public static class AutoAppItem {

        @Required
        private String pkg_name;
        private Optional<Integer> version_code = Optional.a();
        private Optional<List<AutoWidgetGroup>> widget_groups = Optional.a();

        public AutoAppItem() {
        }

        @Required
        public String getPkgName() {
            return this.pkg_name;
        }

        public Optional<Integer> getVersionCode() {
            return this.version_code;
        }

        public Optional<List<AutoWidgetGroup>> getWidgetGroups() {
            return this.widget_groups;
        }

        @Required
        public AutoAppItem setPkgName(String str) {
            this.pkg_name = str;
            return this;
        }

        public AutoAppItem setVersionCode(int i) {
            this.version_code = Optional.e(Integer.valueOf(i));
            return this;
        }

        public AutoAppItem setWidgetGroups(List<AutoWidgetGroup> list) {
            this.widget_groups = Optional.e(list);
            return this;
        }

        public AutoAppItem(String str) {
            this.pkg_name = str;
        }
    }

    public static class AutoWidget {

        @Required
        private String id;

        @Required
        private String name;
        private Optional<Integer> level = Optional.a();
        private Optional<String> parent_id = Optional.a();

        public AutoWidget() {
        }

        @Required
        public String getId() {
            return this.id;
        }

        public Optional<Integer> getLevel() {
            return this.level;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<String> getParentId() {
            return this.parent_id;
        }

        @Required
        public AutoWidget setId(String str) {
            this.id = str;
            return this;
        }

        public AutoWidget setLevel(int i) {
            this.level = Optional.e(Integer.valueOf(i));
            return this;
        }

        @Required
        public AutoWidget setName(String str) {
            this.name = str;
            return this;
        }

        public AutoWidget setParentId(String str) {
            this.parent_id = Optional.e(str);
            return this;
        }

        public AutoWidget(String str, String str2) {
            this.name = str;
            this.id = str2;
        }
    }

    public static class CheckAppItem {

        @Required
        private int min_version;

        @Required
        private String pkg_name;
        private Optional<Boolean> launched = Optional.a();
        private Optional<String> name = Optional.a();

        public CheckAppItem() {
        }

        @Required
        public int getMinVersion() {
            return this.min_version;
        }

        public Optional<String> getName() {
            return this.name;
        }

        @Required
        public String getPkgName() {
            return this.pkg_name;
        }

        public Optional<Boolean> isLaunched() {
            return this.launched;
        }

        public CheckAppItem setLaunched(boolean z) {
            this.launched = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Required
        public CheckAppItem setMinVersion(int i) {
            this.min_version = i;
            return this;
        }

        public CheckAppItem setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        @Required
        public CheckAppItem setPkgName(String str) {
            this.pkg_name = str;
            return this;
        }

        public CheckAppItem(String str, int i) {
            this.pkg_name = str;
            this.min_version = i;
        }
    }

    public static class Hint {

        @Required
        private String description;

        @Required
        private HintTag tag;
        private Optional<String> audio_url = Optional.a();
        private Optional<String> failed_msg = Optional.a();

        public Hint() {
        }

        public Optional<String> getAudioUrl() {
            return this.audio_url;
        }

        @Required
        public String getDescription() {
            return this.description;
        }

        public Optional<String> getFailedMsg() {
            return this.failed_msg;
        }

        @Required
        public HintTag getTag() {
            return this.tag;
        }

        public Hint setAudioUrl(String str) {
            this.audio_url = Optional.e(str);
            return this;
        }

        @Required
        public Hint setDescription(String str) {
            this.description = str;
            return this;
        }

        public Hint setFailedMsg(String str) {
            this.failed_msg = Optional.e(str);
            return this;
        }

        @Required
        public Hint setTag(HintTag hintTag) {
            this.tag = hintTag;
            return this;
        }

        public Hint(HintTag hintTag, String str) {
            this.tag = hintTag;
            this.description = str;
        }
    }

    @NamespaceName(name = "OperateWXInDriveMode", namespace = AIApiConstants.Application.NAME)
    public static class OperateWXInDriveMode implements InstructionPayload {

        @Required
        private WeiXinDriveModeOp operate;
        private Optional<String> receiver = Optional.a();
        private Optional<String> message = Optional.a();

        public OperateWXInDriveMode() {
        }

        public Optional<String> getMessage() {
            return this.message;
        }

        @Required
        public WeiXinDriveModeOp getOperate() {
            return this.operate;
        }

        public Optional<String> getReceiver() {
            return this.receiver;
        }

        public OperateWXInDriveMode setMessage(String str) {
            this.message = Optional.e(str);
            return this;
        }

        @Required
        public OperateWXInDriveMode setOperate(WeiXinDriveModeOp weiXinDriveModeOp) {
            this.operate = weiXinDriveModeOp;
            return this;
        }

        public OperateWXInDriveMode setReceiver(String str) {
            this.receiver = Optional.e(str);
            return this;
        }

        public OperateWXInDriveMode(WeiXinDriveModeOp weiXinDriveModeOp) {
            this.operate = weiXinDriveModeOp;
        }
    }

    public static class ShareLinkParam {

        @Required
        private String title;

        @Required
        private String url;
        private Optional<String> icon_url = Optional.a();
        private Optional<String> description = Optional.a();

        public ShareLinkParam() {
        }

        public Optional<String> getDescription() {
            return this.description;
        }

        public Optional<String> getIconUrl() {
            return this.icon_url;
        }

        @Required
        public String getTitle() {
            return this.title;
        }

        @Required
        public String getUrl() {
            return this.url;
        }

        public ShareLinkParam setDescription(String str) {
            this.description = Optional.e(str);
            return this;
        }

        public ShareLinkParam setIconUrl(String str) {
            this.icon_url = Optional.e(str);
            return this;
        }

        @Required
        public ShareLinkParam setTitle(String str) {
            this.title = str;
            return this;
        }

        @Required
        public ShareLinkParam setUrl(String str) {
            this.url = str;
            return this;
        }

        public ShareLinkParam(String str, String str2) {
            this.url = str;
            this.title = str2;
        }
    }

    @NamespaceName(name = com.xiaomi.ai.api.intent.AIApiConstants.Translation.NAME, namespace = AIApiConstants.Application.NAME)
    public static class Translation implements EventPayload {

        @Required
        private String src_lang;

        @Required
        private List<String> support_lang;

        @Required
        private String target_lang;

        @Required
        private String text;
        private Optional<TranslationType> type = Optional.a();
        private Optional<String> backup = Optional.a();

        public Translation() {
        }

        public Optional<String> getBackup() {
            return this.backup;
        }

        @Required
        public String getSrcLang() {
            return this.src_lang;
        }

        @Required
        public List<String> getSupportLang() {
            return this.support_lang;
        }

        @Required
        public String getTargetLang() {
            return this.target_lang;
        }

        @Required
        public String getText() {
            return this.text;
        }

        public Optional<TranslationType> getType() {
            return this.type;
        }

        public Translation setBackup(String str) {
            this.backup = Optional.e(str);
            return this;
        }

        @Required
        public Translation setSrcLang(String str) {
            this.src_lang = str;
            return this;
        }

        @Required
        public Translation setSupportLang(List<String> list) {
            this.support_lang = list;
            return this;
        }

        @Required
        public Translation setTargetLang(String str) {
            this.target_lang = str;
            return this;
        }

        @Required
        public Translation setText(String str) {
            this.text = str;
            return this;
        }

        public Translation setType(TranslationType translationType) {
            this.type = Optional.e(translationType);
            return this;
        }

        public Translation(String str, String str2, String str3, List<String> list) {
            this.src_lang = str;
            this.target_lang = str2;
            this.text = str3;
            this.support_lang = list;
        }
    }

    public static class AvatarAction {
        private Optional<String> action = Optional.a();
        private Optional<String> expression = Optional.a();
        private Optional<Boolean> is_empty = Optional.a();

        @Required
        private int location;

        public AvatarAction() {
        }

        public Optional<String> getAction() {
            return this.action;
        }

        public Optional<String> getExpression() {
            return this.expression;
        }

        @Required
        public int getLocation() {
            return this.location;
        }

        public Optional<Boolean> isEmpty() {
            return this.is_empty;
        }

        public AvatarAction setAction(String str) {
            this.action = Optional.e(str);
            return this;
        }

        public AvatarAction setExpression(String str) {
            this.expression = Optional.e(str);
            return this;
        }

        public AvatarAction setIsEmpty(boolean z) {
            this.is_empty = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Required
        public AvatarAction setLocation(int i) {
            this.location = i;
            return this;
        }

        public AvatarAction(int i) {
            this.location = i;
        }
    }

    public static class CheckAppFailedItem {

        @Required
        private int cur_version;

        @Required
        private String pkg_name;
        private Optional<Boolean> launched = Optional.a();
        private Optional<String> name = Optional.a();
        private Optional<Boolean> is_system_app = Optional.a();

        public CheckAppFailedItem() {
        }

        @Required
        public int getCurVersion() {
            return this.cur_version;
        }

        public Optional<String> getName() {
            return this.name;
        }

        @Required
        public String getPkgName() {
            return this.pkg_name;
        }

        public Optional<Boolean> isLaunched() {
            return this.launched;
        }

        public Optional<Boolean> isSystemApp() {
            return this.is_system_app;
        }

        @Required
        public CheckAppFailedItem setCurVersion(int i) {
            this.cur_version = i;
            return this;
        }

        public CheckAppFailedItem setIsSystemApp(boolean z) {
            this.is_system_app = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public CheckAppFailedItem setLaunched(boolean z) {
            this.launched = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public CheckAppFailedItem setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        @Required
        public CheckAppFailedItem setPkgName(String str) {
            this.pkg_name = str;
            return this;
        }

        public CheckAppFailedItem(String str, int i) {
            this.pkg_name = str;
            this.cur_version = i;
        }
    }

    @NamespaceName(name = com.xiaomi.ai.api.intent.AIApiConstants.RelayContent.NAME, namespace = AIApiConstants.Application.NAME)
    public static class RelayContent implements InstructionPayload {

        @Required
        private RelayContentType type;
        private Optional<Common.CommonDeviceCategory> from_device = Optional.a();
        private Optional<Common.CommonDeviceCategory> to_device = Optional.a();
        private Optional<MiPlayAudioRelayParam> audio_relay_param = Optional.a();

        public RelayContent() {
        }

        public Optional<MiPlayAudioRelayParam> getAudioRelayParam() {
            return this.audio_relay_param;
        }

        public Optional<Common.CommonDeviceCategory> getFromDevice() {
            return this.from_device;
        }

        public Optional<Common.CommonDeviceCategory> getToDevice() {
            return this.to_device;
        }

        @Required
        public RelayContentType getType() {
            return this.type;
        }

        public RelayContent setAudioRelayParam(MiPlayAudioRelayParam miPlayAudioRelayParam) {
            this.audio_relay_param = Optional.e(miPlayAudioRelayParam);
            return this;
        }

        public RelayContent setFromDevice(Common.CommonDeviceCategory commonDeviceCategory) {
            this.from_device = Optional.e(commonDeviceCategory);
            return this;
        }

        public RelayContent setToDevice(Common.CommonDeviceCategory commonDeviceCategory) {
            this.to_device = Optional.e(commonDeviceCategory);
            return this;
        }

        @Required
        public RelayContent setType(RelayContentType relayContentType) {
            this.type = relayContentType;
            return this;
        }

        public RelayContent(RelayContentType relayContentType) {
            this.type = relayContentType;
        }
    }

    @NamespaceName(name = "Schedule", namespace = AIApiConstants.Application.NAME)
    @Deprecated
    public static class Schedule implements InstructionPayload {

        @Required
        private mj1 operations;

        @Required
        private ScheduleTimeType time_type;
        private Optional<ScheduleCircleType> circle = Optional.a();
        private Optional<String> time = Optional.a();
        private Optional<ScheduleDuration> duration = Optional.a();

        public Schedule() {
        }

        public Optional<ScheduleCircleType> getCircle() {
            return this.circle;
        }

        public Optional<ScheduleDuration> getDuration() {
            return this.duration;
        }

        @Required
        public mj1 getOperations() {
            return this.operations;
        }

        public Optional<String> getTime() {
            return this.time;
        }

        @Required
        public ScheduleTimeType getTimeType() {
            return this.time_type;
        }

        public Schedule setCircle(ScheduleCircleType scheduleCircleType) {
            this.circle = Optional.e(scheduleCircleType);
            return this;
        }

        public Schedule setDuration(ScheduleDuration scheduleDuration) {
            this.duration = Optional.e(scheduleDuration);
            return this;
        }

        @Required
        public Schedule setOperations(mj1 mj1Var) {
            this.operations = mj1Var;
            return this;
        }

        public Schedule setTime(String str) {
            this.time = Optional.e(str);
            return this;
        }

        @Required
        public Schedule setTimeType(ScheduleTimeType scheduleTimeType) {
            this.time_type = scheduleTimeType;
            return this;
        }

        public Schedule(ScheduleTimeType scheduleTimeType, mj1 mj1Var) {
            this.time_type = scheduleTimeType;
            this.operations = mj1Var;
        }
    }

    public static class ShareAnimationParam {

        @Required
        private String title;

        @Required
        private String url;
        private Optional<String> description = Optional.a();
        private Optional<String> icon_url = Optional.a();
        private Optional<String> animation_url = Optional.a();

        public ShareAnimationParam() {
        }

        public Optional<String> getAnimationUrl() {
            return this.animation_url;
        }

        public Optional<String> getDescription() {
            return this.description;
        }

        public Optional<String> getIconUrl() {
            return this.icon_url;
        }

        @Required
        public String getTitle() {
            return this.title;
        }

        @Required
        public String getUrl() {
            return this.url;
        }

        public ShareAnimationParam setAnimationUrl(String str) {
            this.animation_url = Optional.e(str);
            return this;
        }

        public ShareAnimationParam setDescription(String str) {
            this.description = Optional.e(str);
            return this;
        }

        public ShareAnimationParam setIconUrl(String str) {
            this.icon_url = Optional.e(str);
            return this;
        }

        @Required
        public ShareAnimationParam setTitle(String str) {
            this.title = str;
            return this;
        }

        @Required
        public ShareAnimationParam setUrl(String str) {
            this.url = str;
            return this;
        }

        public ShareAnimationParam(String str, String str2) {
            this.url = str;
            this.title = str2;
        }
    }

    public static class SharePicParam {

        @Required
        private String qrcode_url;

        @Required
        private String title;
        private Optional<String> description = Optional.a();
        private Optional<String> icon_url = Optional.a();
        private Optional<String> screenshot_placeholder = Optional.a();

        public SharePicParam() {
        }

        public Optional<String> getDescription() {
            return this.description;
        }

        public Optional<String> getIconUrl() {
            return this.icon_url;
        }

        @Required
        public String getQrcodeUrl() {
            return this.qrcode_url;
        }

        public Optional<String> getScreenshotPlaceholder() {
            return this.screenshot_placeholder;
        }

        @Required
        public String getTitle() {
            return this.title;
        }

        public SharePicParam setDescription(String str) {
            this.description = Optional.e(str);
            return this;
        }

        public SharePicParam setIconUrl(String str) {
            this.icon_url = Optional.e(str);
            return this;
        }

        @Required
        public SharePicParam setQrcodeUrl(String str) {
            this.qrcode_url = str;
            return this;
        }

        public SharePicParam setScreenshotPlaceholder(String str) {
            this.screenshot_placeholder = Optional.e(str);
            return this;
        }

        @Required
        public SharePicParam setTitle(String str) {
            this.title = str;
            return this;
        }

        public SharePicParam(String str, String str2) {
            this.qrcode_url = str;
            this.title = str2;
        }
    }

    public static class ShareStyle {

        @Required
        private ShareStyleType type;
        private Optional<String> title = Optional.a();
        private Optional<String> description = Optional.a();
        private Optional<String> pic_url = Optional.a();

        public ShareStyle() {
        }

        public Optional<String> getDescription() {
            return this.description;
        }

        public Optional<String> getPicUrl() {
            return this.pic_url;
        }

        public Optional<String> getTitle() {
            return this.title;
        }

        @Required
        public ShareStyleType getType() {
            return this.type;
        }

        public ShareStyle setDescription(String str) {
            this.description = Optional.e(str);
            return this;
        }

        public ShareStyle setPicUrl(String str) {
            this.pic_url = Optional.e(str);
            return this;
        }

        public ShareStyle setTitle(String str) {
            this.title = Optional.e(str);
            return this;
        }

        @Required
        public ShareStyle setType(ShareStyleType shareStyleType) {
            this.type = shareStyleType;
            return this;
        }

        public ShareStyle(ShareStyleType shareStyleType) {
            this.type = shareStyleType;
        }
    }

    public static class ShareWXMiniProgramParam {

        @Required
        private String id;

        @Required
        private String path;

        @Required
        private String title;

        @Required
        private String url;
        private Optional<String> description = Optional.a();
        private Optional<String> icon_url = Optional.a();
        private Optional<WXMiniProgramType> tpe = Optional.a();

        public ShareWXMiniProgramParam() {
        }

        public Optional<String> getDescription() {
            return this.description;
        }

        public Optional<String> getIconUrl() {
            return this.icon_url;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public String getPath() {
            return this.path;
        }

        @Required
        public String getTitle() {
            return this.title;
        }

        public Optional<WXMiniProgramType> getTpe() {
            return this.tpe;
        }

        @Required
        public String getUrl() {
            return this.url;
        }

        public ShareWXMiniProgramParam setDescription(String str) {
            this.description = Optional.e(str);
            return this;
        }

        public ShareWXMiniProgramParam setIconUrl(String str) {
            this.icon_url = Optional.e(str);
            return this;
        }

        @Required
        public ShareWXMiniProgramParam setId(String str) {
            this.id = str;
            return this;
        }

        @Required
        public ShareWXMiniProgramParam setPath(String str) {
            this.path = str;
            return this;
        }

        @Required
        public ShareWXMiniProgramParam setTitle(String str) {
            this.title = str;
            return this;
        }

        public ShareWXMiniProgramParam setTpe(WXMiniProgramType wXMiniProgramType) {
            this.tpe = Optional.e(wXMiniProgramType);
            return this;
        }

        @Required
        public ShareWXMiniProgramParam setUrl(String str) {
            this.url = str;
            return this;
        }

        public ShareWXMiniProgramParam(String str, String str2, String str3, String str4) {
            this.url = str;
            this.title = str2;
            this.id = str3;
            this.path = str4;
        }
    }

    public static class AdsTrackInfo {

        @Required
        private List<String> click_monitor_urls;

        @Required
        private String extra;

        @Required
        private List<String> view_monitor_urls;
        private Optional<String> id = Optional.a();
        private Optional<AdsTrackType> type = Optional.a();
        private Optional<AdsTrackSourceType> source = Optional.a();
        private Optional<String> tracking_strategy = Optional.a();

        public AdsTrackInfo() {
        }

        @Required
        public List<String> getClickMonitorUrls() {
            return this.click_monitor_urls;
        }

        @Required
        public String getExtra() {
            return this.extra;
        }

        public Optional<String> getId() {
            return this.id;
        }

        public Optional<AdsTrackSourceType> getSource() {
            return this.source;
        }

        public Optional<String> getTrackingStrategy() {
            return this.tracking_strategy;
        }

        public Optional<AdsTrackType> getType() {
            return this.type;
        }

        @Required
        public List<String> getViewMonitorUrls() {
            return this.view_monitor_urls;
        }

        @Required
        public AdsTrackInfo setClickMonitorUrls(List<String> list) {
            this.click_monitor_urls = list;
            return this;
        }

        @Required
        public AdsTrackInfo setExtra(String str) {
            this.extra = str;
            return this;
        }

        public AdsTrackInfo setId(String str) {
            this.id = Optional.e(str);
            return this;
        }

        public AdsTrackInfo setSource(AdsTrackSourceType adsTrackSourceType) {
            this.source = Optional.e(adsTrackSourceType);
            return this;
        }

        public AdsTrackInfo setTrackingStrategy(String str) {
            this.tracking_strategy = Optional.e(str);
            return this;
        }

        public AdsTrackInfo setType(AdsTrackType adsTrackType) {
            this.type = Optional.e(adsTrackType);
            return this;
        }

        @Required
        public AdsTrackInfo setViewMonitorUrls(List<String> list) {
            this.view_monitor_urls = list;
            return this;
        }

        public AdsTrackInfo(String str, List<String> list, List<String> list2) {
            this.extra = str;
            this.view_monitor_urls = list;
            this.click_monitor_urls = list2;
        }
    }

    public static class AutoWidgetGroup {

        @Required
        private String action;
        private Optional<List<AutoWidget>> widgets = Optional.a();
        private Optional<String> id = Optional.a();
        private Optional<String> name = Optional.a();
        private Optional<String> parent_id = Optional.a();

        public AutoWidgetGroup() {
        }

        @Required
        public String getAction() {
            return this.action;
        }

        public Optional<String> getId() {
            return this.id;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<String> getParentId() {
            return this.parent_id;
        }

        public Optional<List<AutoWidget>> getWidgets() {
            return this.widgets;
        }

        @Required
        public AutoWidgetGroup setAction(String str) {
            this.action = str;
            return this;
        }

        public AutoWidgetGroup setId(String str) {
            this.id = Optional.e(str);
            return this;
        }

        public AutoWidgetGroup setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public AutoWidgetGroup setParentId(String str) {
            this.parent_id = Optional.e(str);
            return this;
        }

        public AutoWidgetGroup setWidgets(List<AutoWidget> list) {
            this.widgets = Optional.e(list);
            return this;
        }

        public AutoWidgetGroup(String str) {
            this.action = str;
        }
    }

    @NamespaceName(name = "ScheduleV2", namespace = AIApiConstants.Application.NAME)
    public static class ScheduleV2 implements InstructionPayload {

        @Required
        private mj1 operations;
        private Optional<ScheduleCircleType> circle = Optional.a();
        private Optional<List<Integer>> weeks = Optional.a();
        private Optional<ScheduleTime> datetime = Optional.a();
        private Optional<ScheduleDuration> duration = Optional.a();

        public ScheduleV2() {
        }

        public Optional<ScheduleCircleType> getCircle() {
            return this.circle;
        }

        public Optional<ScheduleTime> getDatetime() {
            return this.datetime;
        }

        public Optional<ScheduleDuration> getDuration() {
            return this.duration;
        }

        @Required
        public mj1 getOperations() {
            return this.operations;
        }

        public Optional<List<Integer>> getWeeks() {
            return this.weeks;
        }

        public ScheduleV2 setCircle(ScheduleCircleType scheduleCircleType) {
            this.circle = Optional.e(scheduleCircleType);
            return this;
        }

        public ScheduleV2 setDatetime(ScheduleTime scheduleTime) {
            this.datetime = Optional.e(scheduleTime);
            return this;
        }

        public ScheduleV2 setDuration(ScheduleDuration scheduleDuration) {
            this.duration = Optional.e(scheduleDuration);
            return this;
        }

        @Required
        public ScheduleV2 setOperations(mj1 mj1Var) {
            this.operations = mj1Var;
            return this;
        }

        public ScheduleV2 setWeeks(List<Integer> list) {
            this.weeks = Optional.e(list);
            return this;
        }

        public ScheduleV2(mj1 mj1Var) {
            this.operations = mj1Var;
        }
    }

    public static class ScreenProjectionInfo {

        @Required
        private ScreenProjectionState state;
        private Optional<AppItem> projecting_app = Optional.a();
        private Optional<List<AppItem>> projectable_apps = Optional.a();
        private Optional<AppItem> pinned_app = Optional.a();
        private Optional<String> native_device_id = Optional.a();

        public ScreenProjectionInfo() {
        }

        public Optional<String> getNativeDeviceId() {
            return this.native_device_id;
        }

        public Optional<AppItem> getPinnedApp() {
            return this.pinned_app;
        }

        public Optional<List<AppItem>> getProjectableApps() {
            return this.projectable_apps;
        }

        public Optional<AppItem> getProjectingApp() {
            return this.projecting_app;
        }

        @Required
        public ScreenProjectionState getState() {
            return this.state;
        }

        public ScreenProjectionInfo setNativeDeviceId(String str) {
            this.native_device_id = Optional.e(str);
            return this;
        }

        public ScreenProjectionInfo setPinnedApp(AppItem appItem) {
            this.pinned_app = Optional.e(appItem);
            return this;
        }

        public ScreenProjectionInfo setProjectableApps(List<AppItem> list) {
            this.projectable_apps = Optional.e(list);
            return this;
        }

        public ScreenProjectionInfo setProjectingApp(AppItem appItem) {
            this.projecting_app = Optional.e(appItem);
            return this;
        }

        @Required
        public ScreenProjectionInfo setState(ScreenProjectionState screenProjectionState) {
            this.state = screenProjectionState;
            return this;
        }

        public ScreenProjectionInfo(ScreenProjectionState screenProjectionState) {
            this.state = screenProjectionState;
        }
    }

    @NamespaceName(name = "UIAgent", namespace = AIApiConstants.Application.NAME)
    public static class UIAgent implements InstructionPayload {

        @Required
        private UIAgentType ui_agent_type;
        private Optional<UIAgentPosition> start_pos = Optional.a();
        private Optional<UIAgentPosition> end_pos = Optional.a();
        private Optional<String> text = Optional.a();
        private Optional<Integer> start_time = Optional.a();
        private Optional<Integer> duration = Optional.a();

        public UIAgent() {
        }

        public Optional<Integer> getDuration() {
            return this.duration;
        }

        public Optional<UIAgentPosition> getEndPos() {
            return this.end_pos;
        }

        public Optional<UIAgentPosition> getStartPos() {
            return this.start_pos;
        }

        public Optional<Integer> getStartTime() {
            return this.start_time;
        }

        public Optional<String> getText() {
            return this.text;
        }

        @Required
        public UIAgentType getUiAgentType() {
            return this.ui_agent_type;
        }

        public UIAgent setDuration(int i) {
            this.duration = Optional.e(Integer.valueOf(i));
            return this;
        }

        public UIAgent setEndPos(UIAgentPosition uIAgentPosition) {
            this.end_pos = Optional.e(uIAgentPosition);
            return this;
        }

        public UIAgent setStartPos(UIAgentPosition uIAgentPosition) {
            this.start_pos = Optional.e(uIAgentPosition);
            return this;
        }

        public UIAgent setStartTime(int i) {
            this.start_time = Optional.e(Integer.valueOf(i));
            return this;
        }

        public UIAgent setText(String str) {
            this.text = Optional.e(str);
            return this;
        }

        @Required
        public UIAgent setUiAgentType(UIAgentType uIAgentType) {
            this.ui_agent_type = uIAgentType;
            return this;
        }

        public UIAgent(UIAgentType uIAgentType) {
            this.ui_agent_type = uIAgentType;
        }
    }

    @NamespaceName(name = "AppDetailV1", namespace = AIApiConstants.Application.NAME)
    public static class AppDetailV1 implements ContextPayload {

        @Required
        @Deprecated
        private List<AppItem> available_apps;
        private Optional<String> foreground_app = Optional.a();
        private Optional<List<String>> recently_used_apps = Optional.a();
        private Optional<List<AppItem>> available_quick_apps = Optional.a();
        private Optional<String> foreground_page = Optional.a();
        private Optional<String> foreground_android_window = Optional.a();
        private Optional<String> foreground_app_name = Optional.a();

        public AppDetailV1() {
        }

        @Required
        @Deprecated
        public List<AppItem> getAvailableApps() {
            return this.available_apps;
        }

        public Optional<List<AppItem>> getAvailableQuickApps() {
            return this.available_quick_apps;
        }

        public Optional<String> getForegroundAndroidWindow() {
            return this.foreground_android_window;
        }

        public Optional<String> getForegroundApp() {
            return this.foreground_app;
        }

        public Optional<String> getForegroundAppName() {
            return this.foreground_app_name;
        }

        public Optional<String> getForegroundPage() {
            return this.foreground_page;
        }

        public Optional<List<String>> getRecentlyUsedApps() {
            return this.recently_used_apps;
        }

        @Required
        @Deprecated
        public AppDetailV1 setAvailableApps(List<AppItem> list) {
            this.available_apps = list;
            return this;
        }

        public AppDetailV1 setAvailableQuickApps(List<AppItem> list) {
            this.available_quick_apps = Optional.e(list);
            return this;
        }

        public AppDetailV1 setForegroundAndroidWindow(String str) {
            this.foreground_android_window = Optional.e(str);
            return this;
        }

        public AppDetailV1 setForegroundApp(String str) {
            this.foreground_app = Optional.e(str);
            return this;
        }

        public AppDetailV1 setForegroundAppName(String str) {
            this.foreground_app_name = Optional.e(str);
            return this;
        }

        public AppDetailV1 setForegroundPage(String str) {
            this.foreground_page = Optional.e(str);
            return this;
        }

        public AppDetailV1 setRecentlyUsedApps(List<String> list) {
            this.recently_used_apps = Optional.e(list);
            return this;
        }

        public AppDetailV1(List<AppItem> list) {
            this.available_apps = list;
        }
    }

    @NamespaceName(name = "SimulateClickV0", namespace = AIApiConstants.Application.NAME)
    public static class SimulateClickV0 implements InstructionPayload {

        @Required
        private mj1 nodes;

        @Required
        private List<Integer> rcmd_list;
        private Optional<Boolean> is_final_round = Optional.a();
        private Optional<mj1> hints = Optional.a();
        private Optional<String> directive = Optional.a();
        private Optional<WeixinContactSlot> contact_slots = Optional.a();
        private Optional<SimulateClickType> type = Optional.a();
        private Optional<SimulateClickSearchType> simulate_click_search_type = Optional.a();

        public SimulateClickV0() {
        }

        public Optional<WeixinContactSlot> getContactSlots() {
            return this.contact_slots;
        }

        public Optional<String> getDirective() {
            return this.directive;
        }

        public Optional<mj1> getHints() {
            return this.hints;
        }

        @Required
        public mj1 getNodes() {
            return this.nodes;
        }

        @Required
        public List<Integer> getRcmdList() {
            return this.rcmd_list;
        }

        public Optional<SimulateClickSearchType> getSimulateClickSearchType() {
            return this.simulate_click_search_type;
        }

        public Optional<SimulateClickType> getType() {
            return this.type;
        }

        public Optional<Boolean> isFinalRound() {
            return this.is_final_round;
        }

        public SimulateClickV0 setContactSlots(WeixinContactSlot weixinContactSlot) {
            this.contact_slots = Optional.e(weixinContactSlot);
            return this;
        }

        public SimulateClickV0 setDirective(String str) {
            this.directive = Optional.e(str);
            return this;
        }

        public SimulateClickV0 setHints(mj1 mj1Var) {
            this.hints = Optional.e(mj1Var);
            return this;
        }

        public SimulateClickV0 setIsFinalRound(boolean z) {
            this.is_final_round = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Required
        public SimulateClickV0 setNodes(mj1 mj1Var) {
            this.nodes = mj1Var;
            return this;
        }

        @Required
        public SimulateClickV0 setRcmdList(List<Integer> list) {
            this.rcmd_list = list;
            return this;
        }

        public SimulateClickV0 setSimulateClickSearchType(SimulateClickSearchType simulateClickSearchType) {
            this.simulate_click_search_type = Optional.e(simulateClickSearchType);
            return this;
        }

        public SimulateClickV0 setType(SimulateClickType simulateClickType) {
            this.type = Optional.e(simulateClickType);
            return this;
        }

        public SimulateClickV0(mj1 mj1Var, List<Integer> list) {
            this.nodes = mj1Var;
            this.rcmd_list = list;
        }
    }

    public static class ControlDeviceInfo {

        @Required
        private String app_id;

        @Required
        @Deprecated
        private long cap_version;

        @Required
        private CrossDeviceConnectType connect_type;

        @Required
        @Deprecated
        private String device_id;

        @Required
        private Common.CommonDeviceCategory device_type;

        @Required
        private String user_agent;
        private Optional<List<Context<Object>>> contexts = Optional.a();

        @Deprecated
        private Optional<String> device_name = Optional.a();

        @Deprecated
        private Optional<Boolean> is_mi_phone = Optional.a();

        @Deprecated
        private Optional<Boolean> is_mi_pad = Optional.a();
        private Optional<Settings.ClientInfo> client_info = Optional.a();
        private Optional<String> native_device_id = Optional.a();
        private Optional<Integer> device_state = Optional.a();

        public ControlDeviceInfo() {
        }

        @Required
        public String getAppId() {
            return this.app_id;
        }

        @Required
        @Deprecated
        public long getCapVersion() {
            return this.cap_version;
        }

        public Optional<Settings.ClientInfo> getClientInfo() {
            return this.client_info;
        }

        @Required
        public CrossDeviceConnectType getConnectType() {
            return this.connect_type;
        }

        public Optional<List<Context<Object>>> getContexts() {
            return this.contexts;
        }

        @Required
        @Deprecated
        public String getDeviceId() {
            return this.device_id;
        }

        @Deprecated
        public Optional<String> getDeviceName() {
            return this.device_name;
        }

        public Optional<Integer> getDeviceState() {
            return this.device_state;
        }

        @Required
        public Common.CommonDeviceCategory getDeviceType() {
            return this.device_type;
        }

        public Optional<String> getNativeDeviceId() {
            return this.native_device_id;
        }

        @Required
        public String getUserAgent() {
            return this.user_agent;
        }

        @Deprecated
        public Optional<Boolean> isMiPad() {
            return this.is_mi_pad;
        }

        @Deprecated
        public Optional<Boolean> isMiPhone() {
            return this.is_mi_phone;
        }

        @Required
        public ControlDeviceInfo setAppId(String str) {
            this.app_id = str;
            return this;
        }

        @Required
        @Deprecated
        public ControlDeviceInfo setCapVersion(long j) {
            this.cap_version = j;
            return this;
        }

        public ControlDeviceInfo setClientInfo(Settings.ClientInfo clientInfo) {
            this.client_info = Optional.e(clientInfo);
            return this;
        }

        @Required
        public ControlDeviceInfo setConnectType(CrossDeviceConnectType crossDeviceConnectType) {
            this.connect_type = crossDeviceConnectType;
            return this;
        }

        public ControlDeviceInfo setContexts(List<Context<Object>> list) {
            this.contexts = Optional.e(list);
            return this;
        }

        @Required
        @Deprecated
        public ControlDeviceInfo setDeviceId(String str) {
            this.device_id = str;
            return this;
        }

        @Deprecated
        public ControlDeviceInfo setDeviceName(String str) {
            this.device_name = Optional.e(str);
            return this;
        }

        public ControlDeviceInfo setDeviceState(int i) {
            this.device_state = Optional.e(Integer.valueOf(i));
            return this;
        }

        @Required
        public ControlDeviceInfo setDeviceType(Common.CommonDeviceCategory commonDeviceCategory) {
            this.device_type = commonDeviceCategory;
            return this;
        }

        @Deprecated
        public ControlDeviceInfo setIsMiPad(boolean z) {
            this.is_mi_pad = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Deprecated
        public ControlDeviceInfo setIsMiPhone(boolean z) {
            this.is_mi_phone = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public ControlDeviceInfo setNativeDeviceId(String str) {
            this.native_device_id = Optional.e(str);
            return this;
        }

        @Required
        public ControlDeviceInfo setUserAgent(String str) {
            this.user_agent = str;
            return this;
        }

        public ControlDeviceInfo(String str, String str2, String str3, long j, CrossDeviceConnectType crossDeviceConnectType, Common.CommonDeviceCategory commonDeviceCategory) {
            this.app_id = str;
            this.device_id = str2;
            this.user_agent = str3;
            this.cap_version = j;
            this.connect_type = crossDeviceConnectType;
            this.device_type = commonDeviceCategory;
        }
    }

    public static class MiPlayAudioRelayDevice {

        @Required
        private String miot_did;

        @Required
        private MiPlayAudioRelayDeviceStatus status;

        @Required
        private String uid;
        private Optional<String> name = Optional.a();
        private Optional<String> house_id = Optional.a();
        private Optional<String> room_id = Optional.a();
        private Optional<String> room_name = Optional.a();
        private Optional<String> alias = Optional.a();
        private Optional<String> room_alias = Optional.a();
        private Optional<String> mac = Optional.a();

        public MiPlayAudioRelayDevice() {
        }

        public Optional<String> getAlias() {
            return this.alias;
        }

        public Optional<String> getHouseId() {
            return this.house_id;
        }

        public Optional<String> getMac() {
            return this.mac;
        }

        @Required
        public String getMiotDid() {
            return this.miot_did;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<String> getRoomAlias() {
            return this.room_alias;
        }

        public Optional<String> getRoomId() {
            return this.room_id;
        }

        public Optional<String> getRoomName() {
            return this.room_name;
        }

        @Required
        public MiPlayAudioRelayDeviceStatus getStatus() {
            return this.status;
        }

        @Required
        public String getUid() {
            return this.uid;
        }

        public MiPlayAudioRelayDevice setAlias(String str) {
            this.alias = Optional.e(str);
            return this;
        }

        public MiPlayAudioRelayDevice setHouseId(String str) {
            this.house_id = Optional.e(str);
            return this;
        }

        public MiPlayAudioRelayDevice setMac(String str) {
            this.mac = Optional.e(str);
            return this;
        }

        @Required
        public MiPlayAudioRelayDevice setMiotDid(String str) {
            this.miot_did = str;
            return this;
        }

        public MiPlayAudioRelayDevice setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public MiPlayAudioRelayDevice setRoomAlias(String str) {
            this.room_alias = Optional.e(str);
            return this;
        }

        public MiPlayAudioRelayDevice setRoomId(String str) {
            this.room_id = Optional.e(str);
            return this;
        }

        public MiPlayAudioRelayDevice setRoomName(String str) {
            this.room_name = Optional.e(str);
            return this;
        }

        @Required
        public MiPlayAudioRelayDevice setStatus(MiPlayAudioRelayDeviceStatus miPlayAudioRelayDeviceStatus) {
            this.status = miPlayAudioRelayDeviceStatus;
            return this;
        }

        @Required
        public MiPlayAudioRelayDevice setUid(String str) {
            this.uid = str;
            return this;
        }

        public MiPlayAudioRelayDevice(String str, String str2, MiPlayAudioRelayDeviceStatus miPlayAudioRelayDeviceStatus) {
            this.uid = str;
            this.miot_did = str2;
            this.status = miPlayAudioRelayDeviceStatus;
        }
    }

    public static class ControlPhoneInfo {

        @Required
        private boolean is_mi_phone;

        @Required
        private long xiaoai_build;

        @Deprecated
        private Optional<String> device_id = Optional.a();
        private Optional<List<Context<Object>>> contexts = Optional.a();
        private Optional<CrossDeviceConnectType> connect_type = Optional.a();

        @Deprecated
        private Optional<Long> cap_version = Optional.a();
        private Optional<String> user_agent = Optional.a();
        private Optional<String> app_id = Optional.a();
        private Optional<Settings.ClientInfo> client_info = Optional.a();
        private Optional<String> native_device_id = Optional.a();
        private Optional<Integer> device_state = Optional.a();

        public ControlPhoneInfo() {
        }

        public Optional<String> getAppId() {
            return this.app_id;
        }

        @Deprecated
        public Optional<Long> getCapVersion() {
            return this.cap_version;
        }

        public Optional<Settings.ClientInfo> getClientInfo() {
            return this.client_info;
        }

        public Optional<CrossDeviceConnectType> getConnectType() {
            return this.connect_type;
        }

        public Optional<List<Context<Object>>> getContexts() {
            return this.contexts;
        }

        @Deprecated
        public Optional<String> getDeviceId() {
            return this.device_id;
        }

        public Optional<Integer> getDeviceState() {
            return this.device_state;
        }

        public Optional<String> getNativeDeviceId() {
            return this.native_device_id;
        }

        public Optional<String> getUserAgent() {
            return this.user_agent;
        }

        @Required
        public long getXiaoaiBuild() {
            return this.xiaoai_build;
        }

        @Required
        public boolean isMiPhone() {
            return this.is_mi_phone;
        }

        public ControlPhoneInfo setAppId(String str) {
            this.app_id = Optional.e(str);
            return this;
        }

        @Deprecated
        public ControlPhoneInfo setCapVersion(long j) {
            this.cap_version = Optional.e(Long.valueOf(j));
            return this;
        }

        public ControlPhoneInfo setClientInfo(Settings.ClientInfo clientInfo) {
            this.client_info = Optional.e(clientInfo);
            return this;
        }

        public ControlPhoneInfo setConnectType(CrossDeviceConnectType crossDeviceConnectType) {
            this.connect_type = Optional.e(crossDeviceConnectType);
            return this;
        }

        public ControlPhoneInfo setContexts(List<Context<Object>> list) {
            this.contexts = Optional.e(list);
            return this;
        }

        @Deprecated
        public ControlPhoneInfo setDeviceId(String str) {
            this.device_id = Optional.e(str);
            return this;
        }

        public ControlPhoneInfo setDeviceState(int i) {
            this.device_state = Optional.e(Integer.valueOf(i));
            return this;
        }

        @Required
        public ControlPhoneInfo setIsMiPhone(boolean z) {
            this.is_mi_phone = z;
            return this;
        }

        public ControlPhoneInfo setNativeDeviceId(String str) {
            this.native_device_id = Optional.e(str);
            return this;
        }

        public ControlPhoneInfo setUserAgent(String str) {
            this.user_agent = Optional.e(str);
            return this;
        }

        @Required
        public ControlPhoneInfo setXiaoaiBuild(long j) {
            this.xiaoai_build = j;
            return this;
        }

        public ControlPhoneInfo(boolean z, long j) {
            this.is_mi_phone = z;
            this.xiaoai_build = j;
        }
    }

    public static class AppItem {

        @Required
        private String pkg_name;

        @Required
        private int version_code;
        private Optional<String> version_name = Optional.a();
        private Optional<Integer> framework_version = Optional.a();
        private Optional<String> category = Optional.a();
        private Optional<Boolean> accessibility = Optional.a();
        private Optional<Boolean> is_background = Optional.a();
        private Optional<Boolean> is_foreground = Optional.a();
        private Optional<List<AutoWidgetGroup>> widget_groups = Optional.a();
        private Optional<String> app_name = Optional.a();
        private Optional<Boolean> is_system_app = Optional.a();
        private Optional<Boolean> is_dual_app = Optional.a();

        public AppItem() {
        }

        public Optional<String> getAppName() {
            return this.app_name;
        }

        public Optional<String> getCategory() {
            return this.category;
        }

        public Optional<Integer> getFrameworkVersion() {
            return this.framework_version;
        }

        @Required
        public String getPkgName() {
            return this.pkg_name;
        }

        @Required
        public int getVersionCode() {
            return this.version_code;
        }

        public Optional<String> getVersionName() {
            return this.version_name;
        }

        public Optional<List<AutoWidgetGroup>> getWidgetGroups() {
            return this.widget_groups;
        }

        public Optional<Boolean> isAccessibility() {
            return this.accessibility;
        }

        public Optional<Boolean> isBackground() {
            return this.is_background;
        }

        public Optional<Boolean> isDualApp() {
            return this.is_dual_app;
        }

        public Optional<Boolean> isForeground() {
            return this.is_foreground;
        }

        public Optional<Boolean> isSystemApp() {
            return this.is_system_app;
        }

        public AppItem setAccessibility(boolean z) {
            this.accessibility = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public AppItem setAppName(String str) {
            this.app_name = Optional.e(str);
            return this;
        }

        public AppItem setCategory(String str) {
            this.category = Optional.e(str);
            return this;
        }

        public AppItem setFrameworkVersion(int i) {
            this.framework_version = Optional.e(Integer.valueOf(i));
            return this;
        }

        public AppItem setIsBackground(boolean z) {
            this.is_background = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public AppItem setIsDualApp(boolean z) {
            this.is_dual_app = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public AppItem setIsForeground(boolean z) {
            this.is_foreground = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public AppItem setIsSystemApp(boolean z) {
            this.is_system_app = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Required
        public AppItem setPkgName(String str) {
            this.pkg_name = str;
            return this;
        }

        @Required
        public AppItem setVersionCode(int i) {
            this.version_code = i;
            return this;
        }

        public AppItem setVersionName(String str) {
            this.version_name = Optional.e(str);
            return this;
        }

        public AppItem setWidgetGroups(List<AutoWidgetGroup> list) {
            this.widget_groups = Optional.e(list);
            return this;
        }

        public AppItem(String str, int i) {
            this.pkg_name = str;
            this.version_code = i;
        }
    }
}
