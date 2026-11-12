package com.xiaomi.ai.api;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.huami.moving.ui.utils.SportAnalytics;
import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class Application {

    @NamespaceName(name = "AdsInfo", namespace = AIApiConstants.Application.NAME)
    public static class AdsInfo implements InstructionPayload {
        private Optional<List<AdsTrackInfo>> track_info = Optional.empty();

        public Optional<List<AdsTrackInfo>> getTrackInfo() {
            return this.track_info;
        }

        public AdsInfo setTrackInfo(List<AdsTrackInfo> list) {
            this.track_info = Optional.ofNullable(list);
            return this;
        }
    }

    public static class AdsTrackInfo {

        @Required
        private List<String> click_monitor_urls;

        @Required
        private String extra;
        private Optional<String> id = Optional.empty();
        private Optional<AdsTrackType> type = Optional.empty();

        @Required
        private List<String> view_monitor_urls;

        public AdsTrackInfo() {
        }

        public AdsTrackInfo(String str, List<String> list, List<String> list2) {
            this.extra = str;
            this.view_monitor_urls = list;
            this.click_monitor_urls = list2;
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
            this.id = Optional.ofNullable(str);
            return this;
        }

        public AdsTrackInfo setType(AdsTrackType adsTrackType) {
            this.type = Optional.ofNullable(adsTrackType);
            return this;
        }

        @Required
        public AdsTrackInfo setViewMonitorUrls(List<String> list) {
            this.view_monitor_urls = list;
            return this;
        }
    }

    public enum AdsTrackType {
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

    @NamespaceName(name = "AppDetail", namespace = AIApiConstants.Application.NAME)
    @Deprecated
    public static class AppDetail implements ContextPayload {

        @Required
        private List<AppItem> available_apps;
        private Optional<AppItem> foreground_app = Optional.empty();

        public AppDetail() {
        }

        public AppDetail(List<AppItem> list) {
            this.available_apps = list;
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
            this.foreground_app = Optional.ofNullable(appItem);
            return this;
        }
    }

    @NamespaceName(name = "AppDetailV1", namespace = AIApiConstants.Application.NAME)
    public static class AppDetailV1 implements ContextPayload {

        @Required
        private List<AppItem> available_apps;
        private Optional<String> foreground_app = Optional.empty();
        private Optional<List<String>> recently_used_apps = Optional.empty();
        private Optional<List<AppItem>> available_quick_apps = Optional.empty();

        public AppDetailV1() {
        }

        public AppDetailV1(List<AppItem> list) {
            this.available_apps = list;
        }

        @Required
        public List<AppItem> getAvailableApps() {
            return this.available_apps;
        }

        public Optional<List<AppItem>> getAvailableQuickApps() {
            return this.available_quick_apps;
        }

        public Optional<String> getForegroundApp() {
            return this.foreground_app;
        }

        public Optional<List<String>> getRecentlyUsedApps() {
            return this.recently_used_apps;
        }

        @Required
        public AppDetailV1 setAvailableApps(List<AppItem> list) {
            this.available_apps = list;
            return this;
        }

        public AppDetailV1 setAvailableQuickApps(List<AppItem> list) {
            this.available_quick_apps = Optional.ofNullable(list);
            return this;
        }

        public AppDetailV1 setForegroundApp(String str) {
            this.foreground_app = Optional.ofNullable(str);
            return this;
        }

        public AppDetailV1 setRecentlyUsedApps(List<String> list) {
            this.recently_used_apps = Optional.ofNullable(list);
            return this;
        }
    }

    public static class AppExtra {

        @Required
        private String pkg_name;
        private Optional<Template.AppControl> control = Optional.empty();
        private Optional<Template.AppAds> ads = Optional.empty();

        public AppExtra() {
        }

        public AppExtra(String str) {
            this.pkg_name = str;
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
            this.ads = Optional.ofNullable(appAds);
            return this;
        }

        public AppExtra setControl(Template.AppControl appControl) {
            this.control = Optional.ofNullable(appControl);
            return this;
        }

        @Required
        public AppExtra setPkgName(String str) {
            this.pkg_name = str;
            return this;
        }
    }

    public static class AppItem {

        @Required
        private String pkg_name;

        @Required
        private int version_code;
        private Optional<String> version_name = Optional.empty();
        private Optional<Integer> framework_version = Optional.empty();
        private Optional<String> category = Optional.empty();
        private Optional<Boolean> accessibility = Optional.empty();
        private Optional<Boolean> is_background = Optional.empty();

        public AppItem() {
        }

        public AppItem(String str, int i) {
            this.pkg_name = str;
            this.version_code = i;
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

        public Optional<Boolean> isAccessibility() {
            return this.accessibility;
        }

        public Optional<Boolean> isBackground() {
            return this.is_background;
        }

        public AppItem setAccessibility(boolean z) {
            this.accessibility = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public AppItem setCategory(String str) {
            this.category = Optional.ofNullable(str);
            return this;
        }

        public AppItem setFrameworkVersion(int i) {
            this.framework_version = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public AppItem setIsBackground(boolean z) {
            this.is_background = Optional.ofNullable(Boolean.valueOf(z));
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
            this.version_name = Optional.ofNullable(str);
            return this;
        }
    }

    public static class AppState {
        private Optional<Boolean> support_smart_app = Optional.empty();

        public Optional<Boolean> isSupportSmartApp() {
            return this.support_smart_app;
        }

        public AppState setSupportSmartApp(boolean z) {
            this.support_smart_app = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }
    }

    public enum ApplicationOp {
        UNKNOWN(-1),
        OPEN(0),
        INSTALL(1),
        UNINSTALL(2),
        CLOSE(3),
        SEARCH(4);

        private int id;

        ApplicationOp(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "BaikeEvent", namespace = AIApiConstants.Application.NAME)
    public static class BaikeEvent implements EventPayload {
        private Optional<Template.WikiEvent> wiki_data = Optional.empty();

        public Optional<Template.WikiEvent> getWikiData() {
            return this.wiki_data;
        }

        public BaikeEvent setWikiData(Template.WikiEvent wikiEvent) {
            this.wiki_data = Optional.ofNullable(wikiEvent);
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

    public static class CheckAppFailedItem {

        @Required
        private int cur_version;

        @Required
        private String pkg_name;
        private Optional<Boolean> launched = Optional.empty();
        private Optional<String> name = Optional.empty();
        private Optional<Boolean> is_system_app = Optional.empty();

        public CheckAppFailedItem() {
        }

        public CheckAppFailedItem(String str, int i) {
            this.pkg_name = str;
            this.cur_version = i;
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
            this.is_system_app = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public CheckAppFailedItem setLaunched(boolean z) {
            this.launched = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public CheckAppFailedItem setName(String str) {
            this.name = Optional.ofNullable(str);
            return this;
        }

        @Required
        public CheckAppFailedItem setPkgName(String str) {
            this.pkg_name = str;
            return this;
        }
    }

    public static class CheckAppItem {

        @Required
        private int min_version;

        @Required
        private String pkg_name;
        private Optional<Boolean> launched = Optional.empty();
        private Optional<String> name = Optional.empty();

        public CheckAppItem() {
        }

        public CheckAppItem(String str, int i) {
            this.pkg_name = str;
            this.min_version = i;
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
            this.launched = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        @Required
        public CheckAppItem setMinVersion(int i) {
            this.min_version = i;
            return this;
        }

        public CheckAppItem setName(String str) {
            this.name = Optional.ofNullable(str);
            return this;
        }

        @Required
        public CheckAppItem setPkgName(String str) {
            this.pkg_name = str;
            return this;
        }
    }

    @NamespaceName(name = "CheckApps", namespace = AIApiConstants.Application.NAME)
    public static class CheckApps implements InstructionPayload {

        @Required
        private List<CheckAppItem> apps;
        private Optional<List<String>> names = Optional.empty();

        public CheckApps() {
        }

        public CheckApps(List<CheckAppItem> list) {
            this.apps = list;
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
            this.names = Optional.ofNullable(list);
            return this;
        }
    }

    @NamespaceName(name = "CheckAppsFailed", namespace = AIApiConstants.Application.NAME)
    public static class CheckAppsFailed implements EventPayload {

        @Required
        private List<CheckAppFailedItem> apps;
        private Optional<String> dialog_id = Optional.empty();

        public CheckAppsFailed() {
        }

        public CheckAppsFailed(List<CheckAppFailedItem> list) {
            this.apps = list;
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
            this.dialog_id = Optional.ofNullable(str);
            return this;
        }
    }

    public enum CpLevel {
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

    @NamespaceName(name = "DisableDriveMode", namespace = AIApiConstants.Application.NAME)
    public static class DisableDriveMode implements InstructionPayload {
    }

    @NamespaceName(name = "DisplayAvatar", namespace = AIApiConstants.Application.NAME)
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

    @NamespaceName(name = "DriveModeState", namespace = AIApiConstants.Application.NAME)
    public static class DriveModeState implements ContextPayload {
        private Optional<Boolean> available = Optional.empty();
        private Optional<Boolean> enable = Optional.empty();
        private Optional<Boolean> call = Optional.empty();
        private Optional<WeChatStateInDriveMode> wechat_state = Optional.empty();
        private Optional<Boolean> no_mask = Optional.empty();

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
            this.available = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public DriveModeState setCall(boolean z) {
            this.call = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public DriveModeState setEnable(boolean z) {
            this.enable = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public DriveModeState setNoMask(boolean z) {
            this.no_mask = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public DriveModeState setWechatState(WeChatStateInDriveMode weChatStateInDriveMode) {
            this.wechat_state = Optional.ofNullable(weChatStateInDriveMode);
            return this;
        }
    }

    @NamespaceName(name = "EnableDriveMode", namespace = AIApiConstants.Application.NAME)
    public static class EnableDriveMode implements InstructionPayload {
    }

    @NamespaceName(name = "GenerateSpeak", namespace = AIApiConstants.Application.NAME)
    public static class GenerateSpeak implements EventPayload {
        private Optional<String> text = Optional.empty();

        public Optional<String> getText() {
            return this.text;
        }

        public GenerateSpeak setText(String str) {
            this.text = Optional.ofNullable(str);
            return this;
        }
    }

    public static class Hint {
        private Optional<String> audio_url = Optional.empty();

        @Required
        private String description;

        @Required
        private HintTag tag;

        public Hint() {
        }

        public Hint(HintTag hintTag, String str) {
            this.tag = hintTag;
            this.description = str;
        }

        public Optional<String> getAudioUrl() {
            return this.audio_url;
        }

        @Required
        public String getDescription() {
            return this.description;
        }

        @Required
        public HintTag getTag() {
            return this.tag;
        }

        public Hint setAudioUrl(String str) {
            this.audio_url = Optional.ofNullable(str);
            return this;
        }

        @Required
        public Hint setDescription(String str) {
            this.description = str;
            return this;
        }

        @Required
        public Hint setTag(HintTag hintTag) {
            this.tag = hintTag;
            return this;
        }
    }

    public enum HintTag {
        UNKNOWN(-1),
        EXECUTE(0),
        TOO_MANY(1),
        NOT_INSTALLED(2),
        NOT_SUPPORTED(3);

        private int id;

        HintTag(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class LockScreenFunctionSwitch {
        private Optional<Boolean> query_alarm = Optional.empty();

        public Optional<Boolean> isQueryAlarm() {
            return this.query_alarm;
        }

        public LockScreenFunctionSwitch setQueryAlarm(boolean z) {
            this.query_alarm = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }
    }

    public enum MIOTExecuteMode {
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
        private Optional<MIOTExecuteMode> execute_mode = Optional.empty();

        public Optional<MIOTExecuteMode> getExecuteMode() {
            return this.execute_mode;
        }

        public MIOTState setExecuteMode(MIOTExecuteMode mIOTExecuteMode) {
            this.execute_mode = Optional.ofNullable(mIOTExecuteMode);
            return this;
        }
    }

    public static class MiPlayAudioRelayDevice {

        @Required
        private String miot_did;

        @Required
        private MiPlayAudioRelayDeviceStatus status;

        @Required
        private String uid;
        private Optional<String> name = Optional.empty();
        private Optional<String> house_id = Optional.empty();
        private Optional<String> room_id = Optional.empty();
        private Optional<String> room_name = Optional.empty();
        private Optional<String> alias = Optional.empty();
        private Optional<String> room_alias = Optional.empty();
        private Optional<String> mac = Optional.empty();

        public MiPlayAudioRelayDevice() {
        }

        public MiPlayAudioRelayDevice(String str, String str2, MiPlayAudioRelayDeviceStatus miPlayAudioRelayDeviceStatus) {
            this.uid = str;
            this.miot_did = str2;
            this.status = miPlayAudioRelayDeviceStatus;
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
            this.alias = Optional.ofNullable(str);
            return this;
        }

        public MiPlayAudioRelayDevice setHouseId(String str) {
            this.house_id = Optional.ofNullable(str);
            return this;
        }

        public MiPlayAudioRelayDevice setMac(String str) {
            this.mac = Optional.ofNullable(str);
            return this;
        }

        @Required
        public MiPlayAudioRelayDevice setMiotDid(String str) {
            this.miot_did = str;
            return this;
        }

        public MiPlayAudioRelayDevice setName(String str) {
            this.name = Optional.ofNullable(str);
            return this;
        }

        public MiPlayAudioRelayDevice setRoomAlias(String str) {
            this.room_alias = Optional.ofNullable(str);
            return this;
        }

        public MiPlayAudioRelayDevice setRoomId(String str) {
            this.room_id = Optional.ofNullable(str);
            return this;
        }

        public MiPlayAudioRelayDevice setRoomName(String str) {
            this.room_name = Optional.ofNullable(str);
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

    @NamespaceName(name = "Operate", namespace = AIApiConstants.Application.NAME)
    public static class Operate implements InstructionPayload {
        private Optional<List<AppExtra>> app_extras = Optional.empty();

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

        public Operate(ApplicationOp applicationOp, List<Template.AndroidApp> list, String str, boolean z, List<Hint> list2) {
            this.operation = applicationOp;
            this.apps = list;
            this.keyword = str;
            this.use_local_app = z;
            this.hints = list2;
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
            this.app_extras = Optional.ofNullable(list);
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
    }

    @NamespaceName(name = "OperateTvApp", namespace = AIApiConstants.Application.NAME)
    public static class OperateTvApp implements InstructionPayload {

        @Required
        private List<String> app_names;

        @Required
        private ObjectNode content;

        @Required
        private ApplicationOp operation;
        private Optional<List<String>> pkg_names = Optional.empty();

        public OperateTvApp() {
        }

        public OperateTvApp(ApplicationOp applicationOp, List<String> list, ObjectNode objectNode) {
            this.operation = applicationOp;
            this.app_names = list;
            this.content = objectNode;
        }

        @Required
        public List<String> getAppNames() {
            return this.app_names;
        }

        @Required
        public ObjectNode getContent() {
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
        public OperateTvApp setContent(ObjectNode objectNode) {
            this.content = objectNode;
            return this;
        }

        @Required
        public OperateTvApp setOperation(ApplicationOp applicationOp) {
            this.operation = applicationOp;
            return this;
        }

        public OperateTvApp setPkgNames(List<String> list) {
            this.pkg_names = Optional.ofNullable(list);
            return this;
        }
    }

    @NamespaceName(name = "OperateWXInDriveMode", namespace = AIApiConstants.Application.NAME)
    public static class OperateWXInDriveMode implements InstructionPayload {

        @Required
        private WeiXinDriveModeOp operate;
        private Optional<String> receiver = Optional.empty();
        private Optional<String> message = Optional.empty();

        public OperateWXInDriveMode() {
        }

        public OperateWXInDriveMode(WeiXinDriveModeOp weiXinDriveModeOp) {
            this.operate = weiXinDriveModeOp;
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
            this.message = Optional.ofNullable(str);
            return this;
        }

        @Required
        public OperateWXInDriveMode setOperate(WeiXinDriveModeOp weiXinDriveModeOp) {
            this.operate = weiXinDriveModeOp;
            return this;
        }

        public OperateWXInDriveMode setReceiver(String str) {
            this.receiver = Optional.ofNullable(str);
            return this;
        }
    }

    @NamespaceName(name = "PersonEvent", namespace = AIApiConstants.Application.NAME)
    public static class PersonEvent implements EventPayload {
        private Optional<Template.WikiEvent> wiki_data = Optional.empty();

        public Optional<Template.WikiEvent> getWikiData() {
            return this.wiki_data;
        }

        public PersonEvent setWikiData(Template.WikiEvent wikiEvent) {
            this.wiki_data = Optional.ofNullable(wikiEvent);
            return this;
        }
    }

    public static class PrivacySetting {
        private Optional<Boolean> smart_travel = Optional.empty();

        public Optional<Boolean> isSmartTravel() {
            return this.smart_travel;
        }

        public PrivacySetting setSmartTravel(boolean z) {
            this.smart_travel = Optional.ofNullable(Boolean.valueOf(z));
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
        private Optional<ObjectNode> cookie = Optional.empty();

        public Optional<ObjectNode> getCookie() {
            return this.cookie;
        }

        public QuickAppState setCookie(ObjectNode objectNode) {
            this.cookie = Optional.ofNullable(objectNode);
            return this;
        }
    }

    @NamespaceName(name = "RelayContent", namespace = AIApiConstants.Application.NAME)
    public static class RelayContent implements InstructionPayload {

        @Required
        private RelayContentType type;
        private Optional<Common.CommonDeviceCategory> from_device = Optional.empty();
        private Optional<Common.CommonDeviceCategory> to_device = Optional.empty();
        private Optional<MiPlayAudioRelayParam> audio_relay_param = Optional.empty();

        public RelayContent() {
        }

        public RelayContent(RelayContentType relayContentType) {
            this.type = relayContentType;
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
            this.audio_relay_param = Optional.ofNullable(miPlayAudioRelayParam);
            return this;
        }

        public RelayContent setFromDevice(Common.CommonDeviceCategory commonDeviceCategory) {
            this.from_device = Optional.ofNullable(commonDeviceCategory);
            return this;
        }

        public RelayContent setToDevice(Common.CommonDeviceCategory commonDeviceCategory) {
            this.to_device = Optional.ofNullable(commonDeviceCategory);
            return this;
        }

        @Required
        public RelayContent setType(RelayContentType relayContentType) {
            this.type = relayContentType;
            return this;
        }
    }

    public enum RelayContentType {
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
        private Optional<Boolean> need_paid_resource = Optional.empty();

        public Optional<Boolean> isNeedPaidResource() {
            return this.need_paid_resource;
        }

        public ResourceInfo setNeedPaidResource(boolean z) {
            this.need_paid_resource = Optional.ofNullable(Boolean.valueOf(z));
            return this;
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

    @NamespaceName(name = SportAnalytics.Params.VALUE_SHARE, namespace = AIApiConstants.Application.NAME)
    public static class Share implements InstructionPayload {

        @Required
        private ObjectNode params;

        @Required
        private ShareStyle style;

        @Required
        private ShareType type;

        public Share() {
        }

        public Share(ShareType shareType, ObjectNode objectNode, ShareStyle shareStyle) {
            this.type = shareType;
            this.params = objectNode;
            this.style = shareStyle;
        }

        @Required
        public ObjectNode getParams() {
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
        public Share setParams(ObjectNode objectNode) {
            this.params = objectNode;
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

    public static class ShareAnimationParam {

        @Required
        private String title;

        @Required
        private String url;
        private Optional<String> description = Optional.empty();
        private Optional<String> icon_url = Optional.empty();
        private Optional<String> animation_url = Optional.empty();

        public ShareAnimationParam() {
        }

        public ShareAnimationParam(String str, String str2) {
            this.url = str;
            this.title = str2;
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
            this.animation_url = Optional.ofNullable(str);
            return this;
        }

        public ShareAnimationParam setDescription(String str) {
            this.description = Optional.ofNullable(str);
            return this;
        }

        public ShareAnimationParam setIconUrl(String str) {
            this.icon_url = Optional.ofNullable(str);
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
    }

    public static class ShareLinkParam {

        @Required
        private String title;

        @Required
        private String url;
        private Optional<String> icon_url = Optional.empty();
        private Optional<String> description = Optional.empty();

        public ShareLinkParam() {
        }

        public ShareLinkParam(String str, String str2) {
            this.url = str;
            this.title = str2;
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
            this.description = Optional.ofNullable(str);
            return this;
        }

        public ShareLinkParam setIconUrl(String str) {
            this.icon_url = Optional.ofNullable(str);
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
    }

    public static class SharePicParam {

        @Required
        private String qrcode_url;

        @Required
        private String title;
        private Optional<String> description = Optional.empty();
        private Optional<String> icon_url = Optional.empty();
        private Optional<String> screenshot_placeholder = Optional.empty();

        public SharePicParam() {
        }

        public SharePicParam(String str, String str2) {
            this.qrcode_url = str;
            this.title = str2;
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
            this.description = Optional.ofNullable(str);
            return this;
        }

        public SharePicParam setIconUrl(String str) {
            this.icon_url = Optional.ofNullable(str);
            return this;
        }

        @Required
        public SharePicParam setQrcodeUrl(String str) {
            this.qrcode_url = str;
            return this;
        }

        public SharePicParam setScreenshotPlaceholder(String str) {
            this.screenshot_placeholder = Optional.ofNullable(str);
            return this;
        }

        @Required
        public SharePicParam setTitle(String str) {
            this.title = str;
            return this;
        }
    }

    public static class ShareStyle {

        @Required
        private ShareStyleType type;
        private Optional<String> title = Optional.empty();
        private Optional<String> description = Optional.empty();
        private Optional<String> pic_url = Optional.empty();

        public ShareStyle() {
        }

        public ShareStyle(ShareStyleType shareStyleType) {
            this.type = shareStyleType;
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
            this.description = Optional.ofNullable(str);
            return this;
        }

        public ShareStyle setPicUrl(String str) {
            this.pic_url = Optional.ofNullable(str);
            return this;
        }

        public ShareStyle setTitle(String str) {
            this.title = Optional.ofNullable(str);
            return this;
        }

        @Required
        public ShareStyle setType(ShareStyleType shareStyleType) {
            this.type = shareStyleType;
            return this;
        }
    }

    public enum ShareStyleType {
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

    public static class ShareWXMiniProgramParam {

        @Required
        private String id;

        @Required
        private String path;

        @Required
        private String title;

        @Required
        private String url;
        private Optional<String> description = Optional.empty();
        private Optional<String> icon_url = Optional.empty();
        private Optional<WXMiniProgramType> tpe = Optional.empty();

        public ShareWXMiniProgramParam() {
        }

        public ShareWXMiniProgramParam(String str, String str2, String str3, String str4) {
            this.url = str;
            this.title = str2;
            this.id = str3;
            this.path = str4;
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
            this.description = Optional.ofNullable(str);
            return this;
        }

        public ShareWXMiniProgramParam setIconUrl(String str) {
            this.icon_url = Optional.ofNullable(str);
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
            this.tpe = Optional.ofNullable(wXMiniProgramType);
            return this;
        }

        @Required
        public ShareWXMiniProgramParam setUrl(String str) {
            this.url = str;
            return this;
        }
    }

    @NamespaceName(name = "ShowBottomCapture", namespace = AIApiConstants.Application.NAME)
    public static class ShowBottomCapture implements InstructionPayload {
        private Optional<String> guide = Optional.empty();

        public Optional<String> getGuide() {
            return this.guide;
        }

        public ShowBottomCapture setGuide(String str) {
            this.guide = Optional.ofNullable(str);
            return this;
        }
    }

    @NamespaceName(name = "SimulateClickState", namespace = AIApiConstants.Application.NAME)
    public static class SimulateClickState implements ContextPayload {
        private Optional<Boolean> input_method_running = Optional.empty();
        private Optional<Integer> node_id = Optional.empty();
        private Optional<String> wechat_contact_matched = Optional.empty();
        private Optional<String> page_id = Optional.empty();

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
            this.input_method_running = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public SimulateClickState setNodeId(int i) {
            this.node_id = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public SimulateClickState setPageId(String str) {
            this.page_id = Optional.ofNullable(str);
            return this;
        }

        public SimulateClickState setWechatContactMatched(String str) {
            this.wechat_contact_matched = Optional.ofNullable(str);
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

    @NamespaceName(name = "SimulateClickV0", namespace = AIApiConstants.Application.NAME)
    public static class SimulateClickV0 implements InstructionPayload {

        @Required
        private ArrayNode nodes;

        @Required
        private List<Integer> rcmd_list;
        private Optional<Boolean> is_final_round = Optional.empty();
        private Optional<ArrayNode> hints = Optional.empty();
        private Optional<String> directive = Optional.empty();
        private Optional<WeixinContactSlot> contact_slots = Optional.empty();
        private Optional<SimulateClickType> type = Optional.empty();

        public SimulateClickV0() {
        }

        public SimulateClickV0(ArrayNode arrayNode, List<Integer> list) {
            this.nodes = arrayNode;
            this.rcmd_list = list;
        }

        public Optional<WeixinContactSlot> getContactSlots() {
            return this.contact_slots;
        }

        public Optional<String> getDirective() {
            return this.directive;
        }

        public Optional<ArrayNode> getHints() {
            return this.hints;
        }

        @Required
        public ArrayNode getNodes() {
            return this.nodes;
        }

        @Required
        public List<Integer> getRcmdList() {
            return this.rcmd_list;
        }

        public Optional<SimulateClickType> getType() {
            return this.type;
        }

        public Optional<Boolean> isFinalRound() {
            return this.is_final_round;
        }

        public SimulateClickV0 setContactSlots(WeixinContactSlot weixinContactSlot) {
            this.contact_slots = Optional.ofNullable(weixinContactSlot);
            return this;
        }

        public SimulateClickV0 setDirective(String str) {
            this.directive = Optional.ofNullable(str);
            return this;
        }

        public SimulateClickV0 setHints(ArrayNode arrayNode) {
            this.hints = Optional.ofNullable(arrayNode);
            return this;
        }

        public SimulateClickV0 setIsFinalRound(boolean z) {
            this.is_final_round = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        @Required
        public SimulateClickV0 setNodes(ArrayNode arrayNode) {
            this.nodes = arrayNode;
            return this;
        }

        @Required
        public SimulateClickV0 setRcmdList(List<Integer> list) {
            this.rcmd_list = list;
            return this;
        }

        public SimulateClickV0 setType(SimulateClickType simulateClickType) {
            this.type = Optional.ofNullable(simulateClickType);
            return this;
        }
    }

    @NamespaceName(name = TrainingAnalytics.ParamKey.STATE, namespace = AIApiConstants.Application.NAME)
    public static class State implements ContextPayload {
        private Optional<Boolean> screening_on = Optional.empty();

        @Deprecated
        private Optional<Boolean> parental_control_mode = Optional.empty();
        private Optional<List<ToneInfo>> support_tones = Optional.empty();
        private Optional<String> current_tone_id = Optional.empty();
        private Optional<String> current_music_player_pkg = Optional.empty();
        private Optional<String> current_music_player_version = Optional.empty();
        private Optional<Boolean> enable_screening = Optional.empty();
        private Optional<Boolean> use_trip_app_data = Optional.empty();
        private Optional<Boolean> shutoff_timer = Optional.empty();
        private Optional<String> current_tone_vendor_id = Optional.empty();
        private Optional<Boolean> showing_bottom_capture = Optional.empty();
        private Optional<List<SwitchStatus>> switch_status = Optional.empty();
        private Optional<AppState> app_state = Optional.empty();
        private Optional<MIOTState> miot_state = Optional.empty();
        private Optional<UserState> user_state = Optional.empty();
        private Optional<CpState> cp_state = Optional.empty();
        private Optional<PrivacySetting> privacy_setting = Optional.empty();
        private Optional<LockScreenFunctionSwitch> lock_screen_switch = Optional.empty();

        public Optional<AppState> getAppState() {
            return this.app_state;
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

        public Optional<Boolean> isEnableScreening() {
            return this.enable_screening;
        }

        @Deprecated
        public Optional<Boolean> isParentalControlMode() {
            return this.parental_control_mode;
        }

        public Optional<Boolean> isScreeningOn() {
            return this.screening_on;
        }

        public Optional<Boolean> isShowingBottomCapture() {
            return this.showing_bottom_capture;
        }

        public Optional<Boolean> isShutoffTimer() {
            return this.shutoff_timer;
        }

        public Optional<Boolean> isUseTripAppData() {
            return this.use_trip_app_data;
        }

        public State setAppState(AppState appState) {
            this.app_state = Optional.ofNullable(appState);
            return this;
        }

        public State setCpState(CpState cpState) {
            this.cp_state = Optional.ofNullable(cpState);
            return this;
        }

        public State setCurrentMusicPlayerPkg(String str) {
            this.current_music_player_pkg = Optional.ofNullable(str);
            return this;
        }

        public State setCurrentMusicPlayerVersion(String str) {
            this.current_music_player_version = Optional.ofNullable(str);
            return this;
        }

        public State setCurrentToneId(String str) {
            this.current_tone_id = Optional.ofNullable(str);
            return this;
        }

        public State setCurrentToneVendorId(String str) {
            this.current_tone_vendor_id = Optional.ofNullable(str);
            return this;
        }

        public State setEnableScreening(boolean z) {
            this.enable_screening = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public State setLockScreenSwitch(LockScreenFunctionSwitch lockScreenFunctionSwitch) {
            this.lock_screen_switch = Optional.ofNullable(lockScreenFunctionSwitch);
            return this;
        }

        public State setMiotState(MIOTState mIOTState) {
            this.miot_state = Optional.ofNullable(mIOTState);
            return this;
        }

        @Deprecated
        public State setParentalControlMode(boolean z) {
            this.parental_control_mode = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public State setPrivacySetting(PrivacySetting privacySetting) {
            this.privacy_setting = Optional.ofNullable(privacySetting);
            return this;
        }

        public State setScreeningOn(boolean z) {
            this.screening_on = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public State setShowingBottomCapture(boolean z) {
            this.showing_bottom_capture = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public State setShutoffTimer(boolean z) {
            this.shutoff_timer = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public State setSupportTones(List<ToneInfo> list) {
            this.support_tones = Optional.ofNullable(list);
            return this;
        }

        public State setSwitchStatus(List<SwitchStatus> list) {
            this.switch_status = Optional.ofNullable(list);
            return this;
        }

        public State setUseTripAppData(boolean z) {
            this.use_trip_app_data = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public State setUserState(UserState userState) {
            this.user_state = Optional.ofNullable(userState);
            return this;
        }
    }

    @NamespaceName(name = "StopRelayContent", namespace = AIApiConstants.Application.NAME)
    public static class StopRelayContent implements InstructionPayload {
    }

    public enum SwitchFeature {
        SMART_KID_PROTECTION(0);

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

    @NamespaceName(name = "TaskState", namespace = AIApiConstants.Application.NAME)
    public static class TaskState implements ContextPayload {
        private Optional<String> foreground = Optional.empty();
        private Optional<List<String>> all = Optional.empty();

        public Optional<List<String>> getAll() {
            return this.all;
        }

        public Optional<String> getForeground() {
            return this.foreground;
        }

        public TaskState setAll(List<String> list) {
            this.all = Optional.ofNullable(list);
            return this;
        }

        public TaskState setForeground(String str) {
            this.foreground = Optional.ofNullable(str);
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
        PAO_FU(3);

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

    @NamespaceName(name = "Translation", namespace = AIApiConstants.Application.NAME)
    public static class Translation implements EventPayload {

        @Required
        private String src_lang;

        @Required
        private List<String> support_lang;

        @Required
        private String target_lang;

        @Required
        private String text;
        private Optional<TranslationType> type = Optional.empty();
        private Optional<String> backup = Optional.empty();

        public Translation() {
        }

        public Translation(String str, String str2, String str3, List<String> list) {
            this.src_lang = str;
            this.target_lang = str2;
            this.text = str3;
            this.support_lang = list;
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
            this.backup = Optional.ofNullable(str);
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
            this.type = Optional.ofNullable(translationType);
            return this;
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

    public static class UserState {
        private Optional<List<UserVipState>> user_vip_states = Optional.empty();

        public Optional<List<UserVipState>> getUserVipStates() {
            return this.user_vip_states;
        }

        public UserState setUserVipStates(List<UserVipState> list) {
            this.user_vip_states = Optional.ofNullable(list);
            return this;
        }
    }

    public static class UserVipState {
        private Optional<UserVipType> vip_type = Optional.empty();
        private Optional<Boolean> is_valid = Optional.empty();

        public Optional<UserVipType> getVipType() {
            return this.vip_type;
        }

        public Optional<Boolean> isValid() {
            return this.is_valid;
        }

        public UserVipState setIsValid(boolean z) {
            this.is_valid = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public UserVipState setVipType(UserVipType userVipType) {
            this.vip_type = Optional.ofNullable(userVipType);
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
        MOVIES(9);

        private int id;

        UserVipType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "VoiceWakeupState", namespace = AIApiConstants.Application.NAME)
    public static class VoiceWakeupState implements ContextPayload {
        private Optional<VoiceWakeupType> type = Optional.empty();
        private Optional<Boolean> is_open = Optional.empty();
        private Optional<Long> last_close_time = Optional.empty();

        public Optional<Long> getLastCloseTime() {
            return this.last_close_time;
        }

        public Optional<VoiceWakeupType> getType() {
            return this.type;
        }

        public Optional<Boolean> isOpen() {
            return this.is_open;
        }

        public VoiceWakeupState setIsOpen(boolean z) {
            this.is_open = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VoiceWakeupState setLastCloseTime(long j) {
            this.last_close_time = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public VoiceWakeupState setType(VoiceWakeupType voiceWakeupType) {
            this.type = Optional.ofNullable(voiceWakeupType);
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

    public static class WeChatStateInDriveMode {
        private Optional<Boolean> prompt_for_blocked_message_sender = Optional.empty();
        private Optional<Boolean> need_confirm_education = Optional.empty();
        private Optional<Boolean> need_reply_education = Optional.empty();
        private Optional<Boolean> reinput_button_clicked = Optional.empty();
        private Optional<Boolean> is_passive_mode = Optional.empty();
        private Optional<Boolean> need_finish_education = Optional.empty();

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
            this.is_passive_mode = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public WeChatStateInDriveMode setNeedConfirmEducation(boolean z) {
            this.need_confirm_education = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public WeChatStateInDriveMode setNeedFinishEducation(boolean z) {
            this.need_finish_education = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public WeChatStateInDriveMode setNeedReplyEducation(boolean z) {
            this.need_reply_education = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public WeChatStateInDriveMode setPromptForBlockedMessageSender(boolean z) {
            this.prompt_for_blocked_message_sender = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public WeChatStateInDriveMode setReinputButtonClicked(boolean z) {
            this.reinput_button_clicked = Optional.ofNullable(Boolean.valueOf(z));
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
}
