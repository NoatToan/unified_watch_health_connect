package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class Launcher {

    public enum KuGouSDKIntentType {
        UNKNOWN(-1),
        SONG(0),
        ALBUM(1),
        STATION(2),
        SONG_SEARCH(3);

        private int id;

        KuGouSDKIntentType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum KuGouSDKRecommendType {
        UNKNOWN(-1),
        EVERYDAY(0),
        GUESS(1),
        NEW_SONG(2);

        private int id;

        KuGouSDKRecommendType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class KuGouSDKSlot {

        @Required
        private KuGouSDKSlotNameType name;

        @Required
        private KuGouSDKSlotType type;

        @Required
        private List<KuGouSDKSlotValue> values;

        public KuGouSDKSlot() {
        }

        public KuGouSDKSlot(KuGouSDKSlotNameType kuGouSDKSlotNameType, KuGouSDKSlotType kuGouSDKSlotType, List<KuGouSDKSlotValue> list) {
            this.name = kuGouSDKSlotNameType;
            this.type = kuGouSDKSlotType;
            this.values = list;
        }

        @Required
        public KuGouSDKSlotNameType getName() {
            return this.name;
        }

        @Required
        public KuGouSDKSlotType getType() {
            return this.type;
        }

        @Required
        public List<KuGouSDKSlotValue> getValues() {
            return this.values;
        }

        @Required
        public KuGouSDKSlot setName(KuGouSDKSlotNameType kuGouSDKSlotNameType) {
            this.name = kuGouSDKSlotNameType;
            return this;
        }

        @Required
        public KuGouSDKSlot setType(KuGouSDKSlotType kuGouSDKSlotType) {
            this.type = kuGouSDKSlotType;
            return this;
        }

        @Required
        public KuGouSDKSlot setValues(List<KuGouSDKSlotValue> list) {
            this.values = list;
            return this;
        }
    }

    public enum KuGouSDKSlotNameType {
        UNKNOWN(-1),
        SONG(0),
        SINGER(1),
        ALBUM(2),
        AGE(3),
        PEOPLE(4),
        TOPLIST(5),
        EMOTION(6),
        INSTRUMENT(7),
        LANGUAGE(8),
        SCENE(9),
        STYLE(10),
        THEME(11),
        TVFILM(12),
        VERSION(13),
        CODE(14),
        RADIO(15),
        LIST(16),
        GENDER(17),
        AREA(18),
        SOURCE(19),
        TAG(20);

        private int id;

        KuGouSDKSlotNameType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum KuGouSDKSlotType {
        UNKNOWN(-1),
        ENTITY(0),
        NUMBER(1);

        private int id;

        KuGouSDKSlotType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class KuGouSDKSlotValue {

        @Required
        private String original_text;

        @Required
        private String text;

        public KuGouSDKSlotValue() {
        }

        public KuGouSDKSlotValue(String str, String str2) {
            this.text = str;
            this.original_text = str2;
        }

        @Required
        public String getOriginalText() {
            return this.original_text;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public KuGouSDKSlotValue setOriginalText(String str) {
            this.original_text = str;
            return this;
        }

        @Required
        public KuGouSDKSlotValue setText(String str) {
            this.text = str;
            return this;
        }
    }

    public enum LaunchTargetType {
        UNKNOWN(-1),
        MAPPING(0),
        URL(1),
        ANDROID_INTENT(2),
        IOS_SCHEME(3),
        SDK(4),
        ANDROID_KEY_CODE(5),
        ANDROID_FULL_SEARCH(6),
        ANDROID_GLOBAL_SEARCH(7);

        private int id;

        LaunchTargetType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum LoadingType {
        UNKNOWN(-1),
        NONE(0),
        SYSTEM(1),
        CARD(2);

        private int id;

        LoadingType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum NetEaseParamType {
        UNKNOWN(-1),
        SONG(0),
        ARTIST(1);

        private int id;

        NetEaseParamType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class NetEaseSDKParam {
        private Optional<String> name = Optional.a();
        private Optional<String> tag = Optional.a();
        private Optional<NetEaseParamType> type = Optional.a();
        private Optional<String> keyword = Optional.a();

        public Optional<String> getKeyword() {
            return this.keyword;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<String> getTag() {
            return this.tag;
        }

        public Optional<NetEaseParamType> getType() {
            return this.type;
        }

        public NetEaseSDKParam setKeyword(String str) {
            this.keyword = Optional.e(str);
            return this;
        }

        public NetEaseSDKParam setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public NetEaseSDKParam setTag(String str) {
            this.tag = Optional.e(str);
            return this;
        }

        public NetEaseSDKParam setType(NetEaseParamType netEaseParamType) {
            this.type = Optional.e(netEaseParamType);
            return this;
        }
    }

    public enum ThirdPartyMapSDKCPType {
        UNKNOWN(-1),
        GAODE(0),
        BAIDU(1),
        TENCENT(2);

        private int id;

        ThirdPartyMapSDKCPType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum ThirdPartySDKType {
        UNKNOWN(-1),
        KUGOU(0),
        MAP(1),
        NETEASE(2),
        WEIXIN(3);

        private int id;

        ThirdPartySDKType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum UIType {
        UNKNOWN(-1),
        FULL(0),
        PART(1),
        ANIMATION(2);

        private int id;

        UIType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class WeiXinSDK {

        @Required
        private String id;

        @Required
        private String page_path;

        public WeiXinSDK() {
        }

        public WeiXinSDK(String str, String str2) {
            this.id = str;
            this.page_path = str2;
        }

        @Required
        public String getId() {
            return this.id;
        }

        @Required
        public String getPagePath() {
            return this.page_path;
        }

        @Required
        public WeiXinSDK setId(String str) {
            this.id = str;
            return this;
        }

        @Required
        public WeiXinSDK setPagePath(String str) {
            this.page_path = str;
            return this;
        }
    }

    public static class NetEaseSDK {

        @Required
        private String action_target;
        private Optional<NetEaseSDKParam> param = Optional.a();

        public NetEaseSDK() {
        }

        @Required
        public String getActionTarget() {
            return this.action_target;
        }

        public Optional<NetEaseSDKParam> getParam() {
            return this.param;
        }

        @Required
        public NetEaseSDK setActionTarget(String str) {
            this.action_target = str;
            return this;
        }

        public NetEaseSDK setParam(NetEaseSDKParam netEaseSDKParam) {
            this.param = Optional.e(netEaseSDKParam);
            return this;
        }

        public NetEaseSDK(String str) {
            this.action_target = str;
        }
    }

    public static class ThirdPartyMapSDKParam {

        @Required
        private ThirdPartyMapSDKCPType cp_name;

        @Required
        private String query;
        private Optional<String> token = Optional.a();

        public ThirdPartyMapSDKParam() {
        }

        @Required
        public ThirdPartyMapSDKCPType getCpName() {
            return this.cp_name;
        }

        @Required
        public String getQuery() {
            return this.query;
        }

        public Optional<String> getToken() {
            return this.token;
        }

        @Required
        public ThirdPartyMapSDKParam setCpName(ThirdPartyMapSDKCPType thirdPartyMapSDKCPType) {
            this.cp_name = thirdPartyMapSDKCPType;
            return this;
        }

        @Required
        public ThirdPartyMapSDKParam setQuery(String str) {
            this.query = str;
            return this;
        }

        public ThirdPartyMapSDKParam setToken(String str) {
            this.token = Optional.e(str);
            return this;
        }

        public ThirdPartyMapSDKParam(String str, ThirdPartyMapSDKCPType thirdPartyMapSDKCPType) {
            this.query = str;
            this.cp_name = thirdPartyMapSDKCPType;
        }
    }

    public static class ThirdPartySDK {
        private Optional<c4h> params = Optional.a();

        @Required
        private ThirdPartySDKType type;

        public ThirdPartySDK() {
        }

        public Optional<c4h> getParams() {
            return this.params;
        }

        @Required
        public ThirdPartySDKType getType() {
            return this.type;
        }

        public ThirdPartySDK setParams(c4h c4hVar) {
            this.params = Optional.e(c4hVar);
            return this;
        }

        @Required
        public ThirdPartySDK setType(ThirdPartySDKType thirdPartySDKType) {
            this.type = thirdPartySDKType;
            return this;
        }

        public ThirdPartySDK(ThirdPartySDKType thirdPartySDKType) {
            this.type = thirdPartySDKType;
        }
    }

    public static class AndroidGlobalSearch {

        @Required
        private String auth;

        @Required
        private String title;
        private Optional<String> pre_title = Optional.a();
        private Optional<String> pre_auth = Optional.a();

        public AndroidGlobalSearch() {
        }

        @Required
        public String getAuth() {
            return this.auth;
        }

        public Optional<String> getPreAuth() {
            return this.pre_auth;
        }

        public Optional<String> getPreTitle() {
            return this.pre_title;
        }

        @Required
        public String getTitle() {
            return this.title;
        }

        @Required
        public AndroidGlobalSearch setAuth(String str) {
            this.auth = str;
            return this;
        }

        public AndroidGlobalSearch setPreAuth(String str) {
            this.pre_auth = Optional.e(str);
            return this;
        }

        public AndroidGlobalSearch setPreTitle(String str) {
            this.pre_title = Optional.e(str);
            return this;
        }

        @Required
        public AndroidGlobalSearch setTitle(String str) {
            this.title = str;
            return this;
        }

        public AndroidGlobalSearch(String str, String str2) {
            this.title = str;
            this.auth = str2;
        }
    }

    @NamespaceName(name = "LaunchGeneralQuickApp", namespace = AIApiConstants.Launcher.NAME)
    public static class LaunchGeneralQuickApp implements InstructionPayload {

        @Required
        private String path;

        @Required
        private String pkg_name;
        private Optional<String> parameters = Optional.a();
        private Optional<c4h> extra = Optional.a();

        public LaunchGeneralQuickApp() {
        }

        public Optional<c4h> getExtra() {
            return this.extra;
        }

        public Optional<String> getParameters() {
            return this.parameters;
        }

        @Required
        public String getPath() {
            return this.path;
        }

        @Required
        public String getPkgName() {
            return this.pkg_name;
        }

        public LaunchGeneralQuickApp setExtra(c4h c4hVar) {
            this.extra = Optional.e(c4hVar);
            return this;
        }

        public LaunchGeneralQuickApp setParameters(String str) {
            this.parameters = Optional.e(str);
            return this;
        }

        @Required
        public LaunchGeneralQuickApp setPath(String str) {
            this.path = str;
            return this;
        }

        @Required
        public LaunchGeneralQuickApp setPkgName(String str) {
            this.pkg_name = str;
            return this;
        }

        public LaunchGeneralQuickApp(String str, String str2) {
            this.pkg_name = str;
            this.path = str2;
        }
    }

    @NamespaceName(name = "LaunchShortcut", namespace = AIApiConstants.Launcher.NAME)
    public static class LaunchShortcut implements InstructionPayload {

        @Required
        private String identifier;

        @Required
        private String name;
        private Optional<LaunchTargetType> type = Optional.a();
        private Optional<Template.AndroidIntent> intent = Optional.a();

        public LaunchShortcut() {
        }

        @Required
        public String getIdentifier() {
            return this.identifier;
        }

        public Optional<Template.AndroidIntent> getIntent() {
            return this.intent;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<LaunchTargetType> getType() {
            return this.type;
        }

        @Required
        public LaunchShortcut setIdentifier(String str) {
            this.identifier = str;
            return this;
        }

        public LaunchShortcut setIntent(Template.AndroidIntent androidIntent) {
            this.intent = Optional.e(androidIntent);
            return this;
        }

        @Required
        public LaunchShortcut setName(String str) {
            this.name = str;
            return this;
        }

        public LaunchShortcut setType(LaunchTargetType launchTargetType) {
            this.type = Optional.e(launchTargetType);
            return this;
        }

        public LaunchShortcut(String str, String str2) {
            this.name = str;
            this.identifier = str2;
        }
    }

    public static class KuGouSDK {

        @Required
        private boolean is_recommend;
        private Optional<KuGouSDKRecommendType> recommend_type = Optional.a();
        private Optional<String> domain = Optional.a();
        private Optional<KuGouSDKIntentType> intent = Optional.a();
        private Optional<List<KuGouSDKSlot>> slots = Optional.a();
        private Optional<String> query = Optional.a();

        public KuGouSDK() {
        }

        public Optional<String> getDomain() {
            return this.domain;
        }

        public Optional<KuGouSDKIntentType> getIntent() {
            return this.intent;
        }

        public Optional<String> getQuery() {
            return this.query;
        }

        public Optional<KuGouSDKRecommendType> getRecommendType() {
            return this.recommend_type;
        }

        public Optional<List<KuGouSDKSlot>> getSlots() {
            return this.slots;
        }

        @Required
        public boolean isRecommend() {
            return this.is_recommend;
        }

        public KuGouSDK setDomain(String str) {
            this.domain = Optional.e(str);
            return this;
        }

        public KuGouSDK setIntent(KuGouSDKIntentType kuGouSDKIntentType) {
            this.intent = Optional.e(kuGouSDKIntentType);
            return this;
        }

        @Required
        public KuGouSDK setIsRecommend(boolean z) {
            this.is_recommend = z;
            return this;
        }

        public KuGouSDK setQuery(String str) {
            this.query = Optional.e(str);
            return this;
        }

        public KuGouSDK setRecommendType(KuGouSDKRecommendType kuGouSDKRecommendType) {
            this.recommend_type = Optional.e(kuGouSDKRecommendType);
            return this;
        }

        public KuGouSDK setSlots(List<KuGouSDKSlot> list) {
            this.slots = Optional.e(list);
            return this;
        }

        public KuGouSDK(boolean z) {
            this.is_recommend = z;
        }
    }

    @NamespaceName(name = "LaunchQuickApp", namespace = AIApiConstants.Launcher.NAME)
    public static class LaunchQuickApp implements InstructionPayload {

        @Required
        private c4h params;

        @Required
        private String pkg_name;

        @Required
        private int size;

        @Required
        private Template.AppVersion version;
        private Optional<LoadingType> loading_type = Optional.a();
        private Optional<UIType> ui_type = Optional.a();
        private Optional<Template.CustomBackground> background = Optional.a();
        private Optional<Template.Task> task = Optional.a();
        private Optional<Template.FullScreen> full_screen = Optional.a();

        public LaunchQuickApp() {
        }

        public Optional<Template.CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<Template.FullScreen> getFullScreen() {
            return this.full_screen;
        }

        public Optional<LoadingType> getLoadingType() {
            return this.loading_type;
        }

        @Required
        public c4h getParams() {
            return this.params;
        }

        @Required
        public String getPkgName() {
            return this.pkg_name;
        }

        @Required
        public int getSize() {
            return this.size;
        }

        public Optional<Template.Task> getTask() {
            return this.task;
        }

        public Optional<UIType> getUiType() {
            return this.ui_type;
        }

        @Required
        public Template.AppVersion getVersion() {
            return this.version;
        }

        public LaunchQuickApp setBackground(Template.CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public LaunchQuickApp setFullScreen(Template.FullScreen fullScreen) {
            this.full_screen = Optional.e(fullScreen);
            return this;
        }

        public LaunchQuickApp setLoadingType(LoadingType loadingType) {
            this.loading_type = Optional.e(loadingType);
            return this;
        }

        @Required
        public LaunchQuickApp setParams(c4h c4hVar) {
            this.params = c4hVar;
            return this;
        }

        @Required
        public LaunchQuickApp setPkgName(String str) {
            this.pkg_name = str;
            return this;
        }

        @Required
        public LaunchQuickApp setSize(int i) {
            this.size = i;
            return this;
        }

        public LaunchQuickApp setTask(Template.Task task) {
            this.task = Optional.e(task);
            return this;
        }

        public LaunchQuickApp setUiType(UIType uIType) {
            this.ui_type = Optional.e(uIType);
            return this;
        }

        @Required
        public LaunchQuickApp setVersion(Template.AppVersion appVersion) {
            this.version = appVersion;
            return this;
        }

        public LaunchQuickApp(String str, int i, Template.AppVersion appVersion, c4h c4hVar) {
            this.pkg_name = str;
            this.size = i;
            this.version = appVersion;
            this.params = c4hVar;
        }
    }

    @NamespaceName(name = "LaunchApp", namespace = AIApiConstants.Launcher.NAME)
    public static class LaunchApp implements InstructionPayload {

        @Required
        private String identifier;

        @Required
        private String name;
        private Optional<Template.AndroidIntent> intent = Optional.a();

        @Deprecated
        private Optional<Template.OnError> on_error = Optional.a();
        private Optional<String> url = Optional.a();
        private Optional<LaunchTargetType> type = Optional.a();
        private Optional<Boolean> cacheable = Optional.a();
        private Optional<ThirdPartySDK> sdk = Optional.a();
        private Optional<Template.AndroidKeyCode> key_code = Optional.a();
        private Optional<AndroidGlobalSearch> global_search = Optional.a();

        public LaunchApp() {
        }

        public Optional<AndroidGlobalSearch> getGlobalSearch() {
            return this.global_search;
        }

        @Required
        public String getIdentifier() {
            return this.identifier;
        }

        public Optional<Template.AndroidIntent> getIntent() {
            return this.intent;
        }

        public Optional<Template.AndroidKeyCode> getKeyCode() {
            return this.key_code;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Deprecated
        public Optional<Template.OnError> getOnError() {
            return this.on_error;
        }

        public Optional<ThirdPartySDK> getSdk() {
            return this.sdk;
        }

        public Optional<LaunchTargetType> getType() {
            return this.type;
        }

        public Optional<String> getUrl() {
            return this.url;
        }

        public Optional<Boolean> isCacheable() {
            return this.cacheable;
        }

        public LaunchApp setCacheable(boolean z) {
            this.cacheable = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public LaunchApp setGlobalSearch(AndroidGlobalSearch androidGlobalSearch) {
            this.global_search = Optional.e(androidGlobalSearch);
            return this;
        }

        @Required
        public LaunchApp setIdentifier(String str) {
            this.identifier = str;
            return this;
        }

        public LaunchApp setIntent(Template.AndroidIntent androidIntent) {
            this.intent = Optional.e(androidIntent);
            return this;
        }

        public LaunchApp setKeyCode(Template.AndroidKeyCode androidKeyCode) {
            this.key_code = Optional.e(androidKeyCode);
            return this;
        }

        @Required
        public LaunchApp setName(String str) {
            this.name = str;
            return this;
        }

        @Deprecated
        public LaunchApp setOnError(Template.OnError onError) {
            this.on_error = Optional.e(onError);
            return this;
        }

        public LaunchApp setSdk(ThirdPartySDK thirdPartySDK) {
            this.sdk = Optional.e(thirdPartySDK);
            return this;
        }

        public LaunchApp setType(LaunchTargetType launchTargetType) {
            this.type = Optional.e(launchTargetType);
            return this;
        }

        public LaunchApp setUrl(String str) {
            this.url = Optional.e(str);
            return this;
        }

        public LaunchApp(String str, String str2) {
            this.name = str;
            this.identifier = str2;
        }
    }
}
