package com.xiaomi.ai.api;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class TrackLogV3 {

    public static class AudioItemLog {

        @Required
        private String eid;

        @Required
        private String refer;

        public AudioItemLog() {
        }

        public AudioItemLog(String str, String str2) {
            this.eid = str;
            this.refer = str2;
        }

        @Required
        public String getEid() {
            return this.eid;
        }

        @Required
        public String getRefer() {
            return this.refer;
        }

        @Required
        public AudioItemLog setEid(String str) {
            this.eid = str;
            return this;
        }

        @Required
        public AudioItemLog setRefer(String str) {
            this.refer = str;
            return this;
        }
    }

    public enum ButtonContent {
        OPEN(0),
        NOT_YET(1);

        private int id;

        ButtonContent(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum DataType {
        UNKNOWN(-1),
        VOICE_ASSISTANT(0),
        TV(1),
        WAKE_UP(2),
        NEARBY_WAKE_UP(3),
        LITE(4),
        NO_SCREEN_BOX(5),
        PERF(6),
        SCREEN_BOX(7),
        H5(8),
        WATCH(9),
        OPENPLATFORM(10),
        MINIPROGRAM(11);

        private int id;

        DataType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class H5EventContext {
        private Optional<String> device_type = Optional.empty();
        private Optional<String> position = Optional.empty();
        private Optional<String> cur_page = Optional.empty();
        private Optional<String> ua = Optional.empty();
        private Optional<String> cid = Optional.empty();

        public Optional<String> getCid() {
            return this.cid;
        }

        public Optional<String> getCurPage() {
            return this.cur_page;
        }

        public Optional<String> getDeviceType() {
            return this.device_type;
        }

        public Optional<String> getPosition() {
            return this.position;
        }

        public Optional<String> getUa() {
            return this.ua;
        }

        public H5EventContext setCid(String str) {
            this.cid = Optional.ofNullable(str);
            return this;
        }

        public H5EventContext setCurPage(String str) {
            this.cur_page = Optional.ofNullable(str);
            return this;
        }

        public H5EventContext setDeviceType(String str) {
            this.device_type = Optional.ofNullable(str);
            return this;
        }

        public H5EventContext setPosition(String str) {
            this.position = Optional.ofNullable(str);
            return this;
        }

        public H5EventContext setUa(String str) {
            this.ua = Optional.ofNullable(str);
            return this;
        }
    }

    public static class H5EventParams {

        @Required
        private H5EventContext event_context;

        @Required
        private String event_data_type;
        private Optional<H5ExtendJson> extend_json = Optional.empty();

        @Required
        private long timestamp;

        @Required
        private String widget;

        public H5EventParams() {
        }

        public H5EventParams(String str, H5EventContext h5EventContext, String str2, long j) {
            this.widget = str;
            this.event_context = h5EventContext;
            this.event_data_type = str2;
            this.timestamp = j;
        }

        @Required
        public H5EventContext getEventContext() {
            return this.event_context;
        }

        @Required
        public String getEventDataType() {
            return this.event_data_type;
        }

        public Optional<H5ExtendJson> getExtendJson() {
            return this.extend_json;
        }

        @Required
        public long getTimestamp() {
            return this.timestamp;
        }

        @Required
        public String getWidget() {
            return this.widget;
        }

        @Required
        public H5EventParams setEventContext(H5EventContext h5EventContext) {
            this.event_context = h5EventContext;
            return this;
        }

        @Required
        public H5EventParams setEventDataType(String str) {
            this.event_data_type = str;
            return this;
        }

        public H5EventParams setExtendJson(H5ExtendJson h5ExtendJson) {
            this.extend_json = Optional.ofNullable(h5ExtendJson);
            return this;
        }

        @Required
        public H5EventParams setTimestamp(long j) {
            this.timestamp = j;
            return this;
        }

        @Required
        public H5EventParams setWidget(String str) {
            this.widget = str;
            return this;
        }
    }

    public enum H5EventType {
        EXPOSE(0),
        CLICK(1),
        ENTER(2),
        DELETE(3),
        EXIT(4);

        private int id;

        H5EventType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class H5ExtendJson {
        private Optional<String> from = Optional.empty();
        private Optional<String> open_from = Optional.empty();
        private Optional<String> dialog_id = Optional.empty();
        private Optional<String> template = Optional.empty();
        private Optional<String> activity_id = Optional.empty();
        private Optional<String> content = Optional.empty();
        private Optional<String> result_list = Optional.empty();
        private Optional<String> share_type = Optional.empty();
        private Optional<String> status = Optional.empty();
        private Optional<String> domain_id = Optional.empty();
        private Optional<String> remind_id = Optional.empty();
        private Optional<String> app_name = Optional.empty();
        private Optional<String> click_position = Optional.empty();
        private Optional<String> sec_status = Optional.empty();
        private Optional<Boolean> is_remind = Optional.empty();
        private Optional<Integer> position = Optional.empty();
        private Optional<String> btn_word = Optional.empty();
        private Optional<String> first_status = Optional.empty();
        private Optional<Integer> element_id = Optional.empty();
        private Optional<String> click_type = Optional.empty();

        public Optional<String> getActivityId() {
            return this.activity_id;
        }

        public Optional<String> getAppName() {
            return this.app_name;
        }

        public Optional<String> getBtnWord() {
            return this.btn_word;
        }

        public Optional<String> getClickPosition() {
            return this.click_position;
        }

        public Optional<String> getClickType() {
            return this.click_type;
        }

        public Optional<String> getContent() {
            return this.content;
        }

        public Optional<String> getDialogId() {
            return this.dialog_id;
        }

        public Optional<String> getDomainId() {
            return this.domain_id;
        }

        public Optional<Integer> getElementId() {
            return this.element_id;
        }

        public Optional<String> getFirstStatus() {
            return this.first_status;
        }

        public Optional<String> getFrom() {
            return this.from;
        }

        public Optional<String> getOpenFrom() {
            return this.open_from;
        }

        public Optional<Integer> getPosition() {
            return this.position;
        }

        public Optional<String> getRemindId() {
            return this.remind_id;
        }

        public Optional<String> getResultList() {
            return this.result_list;
        }

        public Optional<String> getSecStatus() {
            return this.sec_status;
        }

        public Optional<String> getShareType() {
            return this.share_type;
        }

        public Optional<String> getStatus() {
            return this.status;
        }

        public Optional<String> getTemplate() {
            return this.template;
        }

        public Optional<Boolean> isRemind() {
            return this.is_remind;
        }

        public H5ExtendJson setActivityId(String str) {
            this.activity_id = Optional.ofNullable(str);
            return this;
        }

        public H5ExtendJson setAppName(String str) {
            this.app_name = Optional.ofNullable(str);
            return this;
        }

        public H5ExtendJson setBtnWord(String str) {
            this.btn_word = Optional.ofNullable(str);
            return this;
        }

        public H5ExtendJson setClickPosition(String str) {
            this.click_position = Optional.ofNullable(str);
            return this;
        }

        public H5ExtendJson setClickType(String str) {
            this.click_type = Optional.ofNullable(str);
            return this;
        }

        public H5ExtendJson setContent(String str) {
            this.content = Optional.ofNullable(str);
            return this;
        }

        public H5ExtendJson setDialogId(String str) {
            this.dialog_id = Optional.ofNullable(str);
            return this;
        }

        public H5ExtendJson setDomainId(String str) {
            this.domain_id = Optional.ofNullable(str);
            return this;
        }

        public H5ExtendJson setElementId(int i) {
            this.element_id = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public H5ExtendJson setFirstStatus(String str) {
            this.first_status = Optional.ofNullable(str);
            return this;
        }

        public H5ExtendJson setFrom(String str) {
            this.from = Optional.ofNullable(str);
            return this;
        }

        public H5ExtendJson setIsRemind(boolean z) {
            this.is_remind = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public H5ExtendJson setOpenFrom(String str) {
            this.open_from = Optional.ofNullable(str);
            return this;
        }

        public H5ExtendJson setPosition(int i) {
            this.position = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public H5ExtendJson setRemindId(String str) {
            this.remind_id = Optional.ofNullable(str);
            return this;
        }

        public H5ExtendJson setResultList(String str) {
            this.result_list = Optional.ofNullable(str);
            return this;
        }

        public H5ExtendJson setSecStatus(String str) {
            this.sec_status = Optional.ofNullable(str);
            return this;
        }

        public H5ExtendJson setShareType(String str) {
            this.share_type = Optional.ofNullable(str);
            return this;
        }

        public H5ExtendJson setStatus(String str) {
            this.status = Optional.ofNullable(str);
            return this;
        }

        public H5ExtendJson setTemplate(String str) {
            this.template = Optional.ofNullable(str);
            return this;
        }
    }

    public static class H5TrackLog {

        @Required
        private H5EventParams event_params;

        @Required
        private H5EventType event_type;

        public H5TrackLog() {
        }

        public H5TrackLog(H5EventType h5EventType, H5EventParams h5EventParams) {
            this.event_type = h5EventType;
            this.event_params = h5EventParams;
        }

        @Required
        public H5EventParams getEventParams() {
            return this.event_params;
        }

        @Required
        public H5EventType getEventType() {
            return this.event_type;
        }

        @Required
        public H5TrackLog setEventParams(H5EventParams h5EventParams) {
            this.event_params = h5EventParams;
            return this;
        }

        @Required
        public H5TrackLog setEventType(H5EventType h5EventType) {
            this.event_type = h5EventType;
            return this;
        }
    }

    public static class LiteEventContext {

        @Required
        private String app_id;

        @Required
        private String device_id;
        private Optional<String> bt_device_mac_address = Optional.empty();
        private Optional<String> bt_device_name = Optional.empty();
        private Optional<String> bt_vid = Optional.empty();
        private Optional<String> bt_pid = Optional.empty();
        private Optional<String> uid = Optional.empty();
        private Optional<String> app_version = Optional.empty();
        private Optional<String> network_status = Optional.empty();
        private Optional<String> device_model = Optional.empty();
        private Optional<String> system_version = Optional.empty();
        private Optional<String> download_channel = Optional.empty();
        private Optional<String> bt_device_version = Optional.empty();
        private Optional<LiteEventContextAppState> app_state = Optional.empty();
        private Optional<LiteEventContextScreenState> screen_state = Optional.empty();

        public LiteEventContext() {
        }

        public LiteEventContext(String str, String str2) {
            this.device_id = str;
            this.app_id = str2;
        }

        @Required
        public String getAppId() {
            return this.app_id;
        }

        public Optional<LiteEventContextAppState> getAppState() {
            return this.app_state;
        }

        public Optional<String> getAppVersion() {
            return this.app_version;
        }

        public Optional<String> getBtDeviceMacAddress() {
            return this.bt_device_mac_address;
        }

        public Optional<String> getBtDeviceName() {
            return this.bt_device_name;
        }

        public Optional<String> getBtDeviceVersion() {
            return this.bt_device_version;
        }

        public Optional<String> getBtPid() {
            return this.bt_pid;
        }

        public Optional<String> getBtVid() {
            return this.bt_vid;
        }

        @Required
        public String getDeviceId() {
            return this.device_id;
        }

        public Optional<String> getDeviceModel() {
            return this.device_model;
        }

        public Optional<String> getDownloadChannel() {
            return this.download_channel;
        }

        public Optional<String> getNetworkStatus() {
            return this.network_status;
        }

        public Optional<LiteEventContextScreenState> getScreenState() {
            return this.screen_state;
        }

        public Optional<String> getSystemVersion() {
            return this.system_version;
        }

        public Optional<String> getUid() {
            return this.uid;
        }

        @Required
        public LiteEventContext setAppId(String str) {
            this.app_id = str;
            return this;
        }

        public LiteEventContext setAppState(LiteEventContextAppState liteEventContextAppState) {
            this.app_state = Optional.ofNullable(liteEventContextAppState);
            return this;
        }

        public LiteEventContext setAppVersion(String str) {
            this.app_version = Optional.ofNullable(str);
            return this;
        }

        public LiteEventContext setBtDeviceMacAddress(String str) {
            this.bt_device_mac_address = Optional.ofNullable(str);
            return this;
        }

        public LiteEventContext setBtDeviceName(String str) {
            this.bt_device_name = Optional.ofNullable(str);
            return this;
        }

        public LiteEventContext setBtDeviceVersion(String str) {
            this.bt_device_version = Optional.ofNullable(str);
            return this;
        }

        public LiteEventContext setBtPid(String str) {
            this.bt_pid = Optional.ofNullable(str);
            return this;
        }

        public LiteEventContext setBtVid(String str) {
            this.bt_vid = Optional.ofNullable(str);
            return this;
        }

        @Required
        public LiteEventContext setDeviceId(String str) {
            this.device_id = str;
            return this;
        }

        public LiteEventContext setDeviceModel(String str) {
            this.device_model = Optional.ofNullable(str);
            return this;
        }

        public LiteEventContext setDownloadChannel(String str) {
            this.download_channel = Optional.ofNullable(str);
            return this;
        }

        public LiteEventContext setNetworkStatus(String str) {
            this.network_status = Optional.ofNullable(str);
            return this;
        }

        public LiteEventContext setScreenState(LiteEventContextScreenState liteEventContextScreenState) {
            this.screen_state = Optional.ofNullable(liteEventContextScreenState);
            return this;
        }

        public LiteEventContext setSystemVersion(String str) {
            this.system_version = Optional.ofNullable(str);
            return this;
        }

        public LiteEventContext setUid(String str) {
            this.uid = Optional.ofNullable(str);
            return this;
        }
    }

    public enum LiteEventContextAppState {
        FOREGROUND(0),
        BACKGROUND(1);

        private int id;

        LiteEventContextAppState(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum LiteEventContextScreenState {
        ON(0),
        OFF(1);

        private int id;

        LiteEventContextScreenState(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class LiteEventParams {

        @Required
        private LiteEventContext event_context;

        @Required
        private String event_data_type;
        private Optional<LiteExtendJson> extend_json = Optional.empty();

        @Required
        private long timestamp;

        @Required
        private String widget;

        public LiteEventParams() {
        }

        public LiteEventParams(String str, String str2, long j, LiteEventContext liteEventContext) {
            this.widget = str;
            this.event_data_type = str2;
            this.timestamp = j;
            this.event_context = liteEventContext;
        }

        @Required
        public LiteEventContext getEventContext() {
            return this.event_context;
        }

        @Required
        public String getEventDataType() {
            return this.event_data_type;
        }

        public Optional<LiteExtendJson> getExtendJson() {
            return this.extend_json;
        }

        @Required
        public long getTimestamp() {
            return this.timestamp;
        }

        @Required
        public String getWidget() {
            return this.widget;
        }

        @Required
        public LiteEventParams setEventContext(LiteEventContext liteEventContext) {
            this.event_context = liteEventContext;
            return this;
        }

        @Required
        public LiteEventParams setEventDataType(String str) {
            this.event_data_type = str;
            return this;
        }

        public LiteEventParams setExtendJson(LiteExtendJson liteExtendJson) {
            this.extend_json = Optional.ofNullable(liteExtendJson);
            return this;
        }

        @Required
        public LiteEventParams setTimestamp(long j) {
            this.timestamp = j;
            return this;
        }

        @Required
        public LiteEventParams setWidget(String str) {
            this.widget = str;
            return this;
        }
    }

    public enum LiteEventType {
        EXPOSE(0),
        CLICK(1),
        ADD(2),
        EXECUTE(3),
        DELETE(4),
        EXIT(5),
        PLAY(6),
        PAUSE(7),
        DURATION(8),
        STATE(9),
        SCAN(10),
        CONNECT(11),
        RESULT(12),
        ENTER(13),
        AWAKE(14),
        LAUNCH(15),
        DISCONNECT(16),
        ERROR(17);

        private int id;

        LiteEventType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class LiteExtendJson {
        private Optional<Integer> status = Optional.empty();
        private Optional<String> from = Optional.empty();
        private Optional<String> content = Optional.empty();
        private Optional<Integer> position = Optional.empty();
        private Optional<String> extend_type = Optional.empty();
        private Optional<String> dialog_id = Optional.empty();
        private Optional<String> event_id = Optional.empty();
        private Optional<String> vidpid = Optional.empty();
        private Optional<String> model_id = Optional.empty();
        private Optional<String> template = Optional.empty();
        private Optional<String> results = Optional.empty();
        private Optional<String> click_type = Optional.empty();
        private Optional<String> scan_mode = Optional.empty();
        private Optional<Integer> item_position = Optional.empty();
        private Optional<String> scan_id = Optional.empty();
        private Optional<String> mac_address = Optional.empty();
        private Optional<String> connect_mode = Optional.empty();
        private Optional<String> appauto_connect_subtype = Optional.empty();
        private Optional<String> connect_id = Optional.empty();
        private Optional<String> status_code = Optional.empty();
        private Optional<Integer> is_mandatory_upgrade = Optional.empty();
        private Optional<Integer> appauto_subtype = Optional.empty();
        private Optional<String> bt_device_version = Optional.empty();
        private Optional<Boolean> is_guided = Optional.empty();
        private Optional<String> error_msg = Optional.empty();
        private Optional<String> function = Optional.empty();
        private Optional<String> func = Optional.empty();
        private Optional<String> msg_id = Optional.empty();
        private Optional<String> wakeup_channel = Optional.empty();
        private Optional<LiteExtendJsonMode> mode = Optional.empty();
        private Optional<String> origin_lang = Optional.empty();
        private Optional<String> target_lang = Optional.empty();
        private Optional<LiteExtendJsonInputMethod> input_method = Optional.empty();
        private Optional<Long> open_mic_time_length = Optional.empty();
        private Optional<LiteExtendJsonStopMicMethod> stop_mic_method = Optional.empty();
        private Optional<LiteExtendJsonSuggestionType> suggestion_type = Optional.empty();
        private Optional<List<String>> func_list = Optional.empty();
        private Optional<TrackCardType> card_type = Optional.empty();
        private Optional<String> bt_service_api_name = Optional.empty();
        private Optional<List<String>> bt_service_params = Optional.empty();
        private Optional<Boolean> is_floating_ball_switch_open = Optional.empty();
        private Optional<TrackFloatingBallWakeupMethod> floating_ball_wakeup_method = Optional.empty();
        private Optional<Boolean> floating_ball_invisible_swtich = Optional.empty();
        private Optional<Double> floating_ball_size = Optional.empty();

        public Optional<String> getAppautoConnectSubtype() {
            return this.appauto_connect_subtype;
        }

        public Optional<Integer> getAppautoSubtype() {
            return this.appauto_subtype;
        }

        public Optional<String> getBtDeviceVersion() {
            return this.bt_device_version;
        }

        public Optional<String> getBtServiceApiName() {
            return this.bt_service_api_name;
        }

        public Optional<List<String>> getBtServiceParams() {
            return this.bt_service_params;
        }

        public Optional<TrackCardType> getCardType() {
            return this.card_type;
        }

        public Optional<String> getClickType() {
            return this.click_type;
        }

        public Optional<String> getConnectId() {
            return this.connect_id;
        }

        public Optional<String> getConnectMode() {
            return this.connect_mode;
        }

        public Optional<String> getContent() {
            return this.content;
        }

        public Optional<String> getDialogId() {
            return this.dialog_id;
        }

        public Optional<String> getErrorMsg() {
            return this.error_msg;
        }

        public Optional<String> getEventId() {
            return this.event_id;
        }

        public Optional<String> getExtendType() {
            return this.extend_type;
        }

        public Optional<Double> getFloatingBallSize() {
            return this.floating_ball_size;
        }

        public Optional<TrackFloatingBallWakeupMethod> getFloatingBallWakeupMethod() {
            return this.floating_ball_wakeup_method;
        }

        public Optional<String> getFrom() {
            return this.from;
        }

        public Optional<String> getFunc() {
            return this.func;
        }

        public Optional<List<String>> getFuncList() {
            return this.func_list;
        }

        public Optional<String> getFunction() {
            return this.function;
        }

        public Optional<LiteExtendJsonInputMethod> getInputMethod() {
            return this.input_method;
        }

        public Optional<Integer> getIsMandatoryUpgrade() {
            return this.is_mandatory_upgrade;
        }

        public Optional<Integer> getItemPosition() {
            return this.item_position;
        }

        public Optional<String> getMacAddress() {
            return this.mac_address;
        }

        public Optional<LiteExtendJsonMode> getMode() {
            return this.mode;
        }

        public Optional<String> getModelId() {
            return this.model_id;
        }

        public Optional<String> getMsgId() {
            return this.msg_id;
        }

        public Optional<Long> getOpenMicTimeLength() {
            return this.open_mic_time_length;
        }

        public Optional<String> getOriginLang() {
            return this.origin_lang;
        }

        public Optional<Integer> getPosition() {
            return this.position;
        }

        public Optional<String> getResults() {
            return this.results;
        }

        public Optional<String> getScanId() {
            return this.scan_id;
        }

        public Optional<String> getScanMode() {
            return this.scan_mode;
        }

        public Optional<Integer> getStatus() {
            return this.status;
        }

        public Optional<String> getStatusCode() {
            return this.status_code;
        }

        public Optional<LiteExtendJsonStopMicMethod> getStopMicMethod() {
            return this.stop_mic_method;
        }

        public Optional<LiteExtendJsonSuggestionType> getSuggestionType() {
            return this.suggestion_type;
        }

        public Optional<String> getTargetLang() {
            return this.target_lang;
        }

        public Optional<String> getTemplate() {
            return this.template;
        }

        public Optional<String> getVidpid() {
            return this.vidpid;
        }

        public Optional<String> getWakeupChannel() {
            return this.wakeup_channel;
        }

        public Optional<Boolean> isFloatingBallInvisibleSwtich() {
            return this.floating_ball_invisible_swtich;
        }

        public Optional<Boolean> isFloatingBallSwitchOpen() {
            return this.is_floating_ball_switch_open;
        }

        public Optional<Boolean> isGuided() {
            return this.is_guided;
        }

        public LiteExtendJson setAppautoConnectSubtype(String str) {
            this.appauto_connect_subtype = Optional.ofNullable(str);
            return this;
        }

        public LiteExtendJson setAppautoSubtype(int i) {
            this.appauto_subtype = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public LiteExtendJson setBtDeviceVersion(String str) {
            this.bt_device_version = Optional.ofNullable(str);
            return this;
        }

        public LiteExtendJson setBtServiceApiName(String str) {
            this.bt_service_api_name = Optional.ofNullable(str);
            return this;
        }

        public LiteExtendJson setBtServiceParams(List<String> list) {
            this.bt_service_params = Optional.ofNullable(list);
            return this;
        }

        public LiteExtendJson setCardType(TrackCardType trackCardType) {
            this.card_type = Optional.ofNullable(trackCardType);
            return this;
        }

        public LiteExtendJson setClickType(String str) {
            this.click_type = Optional.ofNullable(str);
            return this;
        }

        public LiteExtendJson setConnectId(String str) {
            this.connect_id = Optional.ofNullable(str);
            return this;
        }

        public LiteExtendJson setConnectMode(String str) {
            this.connect_mode = Optional.ofNullable(str);
            return this;
        }

        public LiteExtendJson setContent(String str) {
            this.content = Optional.ofNullable(str);
            return this;
        }

        public LiteExtendJson setDialogId(String str) {
            this.dialog_id = Optional.ofNullable(str);
            return this;
        }

        public LiteExtendJson setErrorMsg(String str) {
            this.error_msg = Optional.ofNullable(str);
            return this;
        }

        public LiteExtendJson setEventId(String str) {
            this.event_id = Optional.ofNullable(str);
            return this;
        }

        public LiteExtendJson setExtendType(String str) {
            this.extend_type = Optional.ofNullable(str);
            return this;
        }

        public LiteExtendJson setFloatingBallInvisibleSwtich(boolean z) {
            this.floating_ball_invisible_swtich = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public LiteExtendJson setFloatingBallSize(double d) {
            this.floating_ball_size = Optional.ofNullable(Double.valueOf(d));
            return this;
        }

        public LiteExtendJson setFloatingBallWakeupMethod(TrackFloatingBallWakeupMethod trackFloatingBallWakeupMethod) {
            this.floating_ball_wakeup_method = Optional.ofNullable(trackFloatingBallWakeupMethod);
            return this;
        }

        public LiteExtendJson setFrom(String str) {
            this.from = Optional.ofNullable(str);
            return this;
        }

        public LiteExtendJson setFunc(String str) {
            this.func = Optional.ofNullable(str);
            return this;
        }

        public LiteExtendJson setFuncList(List<String> list) {
            this.func_list = Optional.ofNullable(list);
            return this;
        }

        public LiteExtendJson setFunction(String str) {
            this.function = Optional.ofNullable(str);
            return this;
        }

        public LiteExtendJson setInputMethod(LiteExtendJsonInputMethod liteExtendJsonInputMethod) {
            this.input_method = Optional.ofNullable(liteExtendJsonInputMethod);
            return this;
        }

        public LiteExtendJson setIsFloatingBallSwitchOpen(boolean z) {
            this.is_floating_ball_switch_open = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public LiteExtendJson setIsGuided(boolean z) {
            this.is_guided = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public LiteExtendJson setIsMandatoryUpgrade(int i) {
            this.is_mandatory_upgrade = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public LiteExtendJson setItemPosition(int i) {
            this.item_position = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public LiteExtendJson setMacAddress(String str) {
            this.mac_address = Optional.ofNullable(str);
            return this;
        }

        public LiteExtendJson setMode(LiteExtendJsonMode liteExtendJsonMode) {
            this.mode = Optional.ofNullable(liteExtendJsonMode);
            return this;
        }

        public LiteExtendJson setModelId(String str) {
            this.model_id = Optional.ofNullable(str);
            return this;
        }

        public LiteExtendJson setMsgId(String str) {
            this.msg_id = Optional.ofNullable(str);
            return this;
        }

        public LiteExtendJson setOpenMicTimeLength(long j) {
            this.open_mic_time_length = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public LiteExtendJson setOriginLang(String str) {
            this.origin_lang = Optional.ofNullable(str);
            return this;
        }

        public LiteExtendJson setPosition(int i) {
            this.position = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public LiteExtendJson setResults(String str) {
            this.results = Optional.ofNullable(str);
            return this;
        }

        public LiteExtendJson setScanId(String str) {
            this.scan_id = Optional.ofNullable(str);
            return this;
        }

        public LiteExtendJson setScanMode(String str) {
            this.scan_mode = Optional.ofNullable(str);
            return this;
        }

        public LiteExtendJson setStatus(int i) {
            this.status = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public LiteExtendJson setStatusCode(String str) {
            this.status_code = Optional.ofNullable(str);
            return this;
        }

        public LiteExtendJson setStopMicMethod(LiteExtendJsonStopMicMethod liteExtendJsonStopMicMethod) {
            this.stop_mic_method = Optional.ofNullable(liteExtendJsonStopMicMethod);
            return this;
        }

        public LiteExtendJson setSuggestionType(LiteExtendJsonSuggestionType liteExtendJsonSuggestionType) {
            this.suggestion_type = Optional.ofNullable(liteExtendJsonSuggestionType);
            return this;
        }

        public LiteExtendJson setTargetLang(String str) {
            this.target_lang = Optional.ofNullable(str);
            return this;
        }

        public LiteExtendJson setTemplate(String str) {
            this.template = Optional.ofNullable(str);
            return this;
        }

        public LiteExtendJson setVidpid(String str) {
            this.vidpid = Optional.ofNullable(str);
            return this;
        }

        public LiteExtendJson setWakeupChannel(String str) {
            this.wakeup_channel = Optional.ofNullable(str);
            return this;
        }
    }

    public enum LiteExtendJsonInputMethod {
        VOICEBTN(0),
        KEYBOARD(1);

        private int id;

        LiteExtendJsonInputMethod(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum LiteExtendJsonMode {
        SMALL(0),
        FULLSCREEN(1);

        private int id;

        LiteExtendJsonMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum LiteExtendJsonStopMicMethod {
        VAD(0),
        VOICE_BTN(1),
        TIMEOUT(2);

        private int id;

        LiteExtendJsonStopMicMethod(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum LiteExtendJsonSuggestionType {
        ENV(0),
        CLASS_SCHEDULE(1);

        private int id;

        LiteExtendJsonSuggestionType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class LiteTrackLog {

        @Required
        private LiteEventParams event_params;

        @Required
        private LiteEventType event_type;

        public LiteTrackLog() {
        }

        public LiteTrackLog(LiteEventType liteEventType, LiteEventParams liteEventParams) {
            this.event_type = liteEventType;
            this.event_params = liteEventParams;
        }

        @Required
        public LiteEventParams getEventParams() {
            return this.event_params;
        }

        @Required
        public LiteEventType getEventType() {
            return this.event_type;
        }

        @Required
        public LiteTrackLog setEventParams(LiteEventParams liteEventParams) {
            this.event_params = liteEventParams;
            return this;
        }

        @Required
        public LiteTrackLog setEventType(LiteEventType liteEventType) {
            this.event_type = liteEventType;
            return this;
        }
    }

    public static class MiniProgramEventContext {

        @Required
        private String device_type;

        @Required
        private String miai_version;

        @Required
        private String platform_id;

        @Required
        private String uid;
        private Optional<String> dialog_id = Optional.empty();
        private Optional<String> rom_version = Optional.empty();

        public MiniProgramEventContext() {
        }

        public MiniProgramEventContext(String str, String str2, String str3, String str4) {
            this.uid = str;
            this.platform_id = str2;
            this.device_type = str3;
            this.miai_version = str4;
        }

        @Required
        public String getDeviceType() {
            return this.device_type;
        }

        public Optional<String> getDialogId() {
            return this.dialog_id;
        }

        @Required
        public String getMiaiVersion() {
            return this.miai_version;
        }

        @Required
        public String getPlatformId() {
            return this.platform_id;
        }

        public Optional<String> getRomVersion() {
            return this.rom_version;
        }

        @Required
        public String getUid() {
            return this.uid;
        }

        @Required
        public MiniProgramEventContext setDeviceType(String str) {
            this.device_type = str;
            return this;
        }

        public MiniProgramEventContext setDialogId(String str) {
            this.dialog_id = Optional.ofNullable(str);
            return this;
        }

        @Required
        public MiniProgramEventContext setMiaiVersion(String str) {
            this.miai_version = str;
            return this;
        }

        @Required
        public MiniProgramEventContext setPlatformId(String str) {
            this.platform_id = str;
            return this;
        }

        public MiniProgramEventContext setRomVersion(String str) {
            this.rom_version = Optional.ofNullable(str);
            return this;
        }

        @Required
        public MiniProgramEventContext setUid(String str) {
            this.uid = str;
            return this;
        }
    }

    public static class MiniProgramEventParams {

        @Required
        private MiniProgramEventContext event_context;

        @Required
        private String event_data_type;
        private Optional<MiniProgramExtendJson> extend_json = Optional.empty();

        @Required
        private long timestamp;

        @Required
        private String widget;

        public MiniProgramEventParams() {
        }

        public MiniProgramEventParams(String str, MiniProgramEventContext miniProgramEventContext, String str2, long j) {
            this.widget = str;
            this.event_context = miniProgramEventContext;
            this.event_data_type = str2;
            this.timestamp = j;
        }

        @Required
        public MiniProgramEventContext getEventContext() {
            return this.event_context;
        }

        @Required
        public String getEventDataType() {
            return this.event_data_type;
        }

        public Optional<MiniProgramExtendJson> getExtendJson() {
            return this.extend_json;
        }

        @Required
        public long getTimestamp() {
            return this.timestamp;
        }

        @Required
        public String getWidget() {
            return this.widget;
        }

        @Required
        public MiniProgramEventParams setEventContext(MiniProgramEventContext miniProgramEventContext) {
            this.event_context = miniProgramEventContext;
            return this;
        }

        @Required
        public MiniProgramEventParams setEventDataType(String str) {
            this.event_data_type = str;
            return this;
        }

        public MiniProgramEventParams setExtendJson(MiniProgramExtendJson miniProgramExtendJson) {
            this.extend_json = Optional.ofNullable(miniProgramExtendJson);
            return this;
        }

        @Required
        public MiniProgramEventParams setTimestamp(long j) {
            this.timestamp = j;
            return this;
        }

        @Required
        public MiniProgramEventParams setWidget(String str) {
            this.widget = str;
            return this;
        }
    }

    public enum MiniProgramEventType {
        PLAY(0),
        STATE(1);

        private int id;

        MiniProgramEventType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class MiniProgramExtendJson {
        private Optional<String> from = Optional.empty();
        private Optional<String> click_type = Optional.empty();

        public Optional<String> getClickType() {
            return this.click_type;
        }

        public Optional<String> getFrom() {
            return this.from;
        }

        public MiniProgramExtendJson setClickType(String str) {
            this.click_type = Optional.ofNullable(str);
            return this;
        }

        public MiniProgramExtendJson setFrom(String str) {
            this.from = Optional.ofNullable(str);
            return this;
        }
    }

    public static class MiniProgramTrackLog {

        @Required
        private MiniProgramEventParams event_params;

        @Required
        private MiniProgramEventType event_type;

        public MiniProgramTrackLog() {
        }

        public MiniProgramTrackLog(MiniProgramEventType miniProgramEventType, MiniProgramEventParams miniProgramEventParams) {
            this.event_type = miniProgramEventType;
            this.event_params = miniProgramEventParams;
        }

        @Required
        public MiniProgramEventParams getEventParams() {
            return this.event_params;
        }

        @Required
        public MiniProgramEventType getEventType() {
            return this.event_type;
        }

        @Required
        public MiniProgramTrackLog setEventParams(MiniProgramEventParams miniProgramEventParams) {
            this.event_params = miniProgramEventParams;
            return this;
        }

        @Required
        public MiniProgramTrackLog setEventType(MiniProgramEventType miniProgramEventType) {
            this.event_type = miniProgramEventType;
            return this;
        }
    }

    public static class NoScreenBoxEventContext {

        @Required
        private String app_id;

        @Required
        private String device_id;

        @Required
        private String hardware;

        @Required
        private String rom_version;

        @Required
        private String serial_number;
        private Optional<String> uid = Optional.empty();
        private Optional<String> district_setting = Optional.empty();
        private Optional<String> device_model = Optional.empty();
        private Optional<String> channel_version = Optional.empty();
        private Optional<String> os = Optional.empty();

        public NoScreenBoxEventContext() {
        }

        public NoScreenBoxEventContext(String str, String str2, String str3, String str4, String str5) {
            this.device_id = str;
            this.serial_number = str2;
            this.hardware = str3;
            this.app_id = str4;
            this.rom_version = str5;
        }

        @Required
        public String getAppId() {
            return this.app_id;
        }

        public Optional<String> getChannelVersion() {
            return this.channel_version;
        }

        @Required
        public String getDeviceId() {
            return this.device_id;
        }

        public Optional<String> getDeviceModel() {
            return this.device_model;
        }

        public Optional<String> getDistrictSetting() {
            return this.district_setting;
        }

        @Required
        public String getHardware() {
            return this.hardware;
        }

        public Optional<String> getOs() {
            return this.os;
        }

        @Required
        public String getRomVersion() {
            return this.rom_version;
        }

        @Required
        public String getSerialNumber() {
            return this.serial_number;
        }

        public Optional<String> getUid() {
            return this.uid;
        }

        @Required
        public NoScreenBoxEventContext setAppId(String str) {
            this.app_id = str;
            return this;
        }

        public NoScreenBoxEventContext setChannelVersion(String str) {
            this.channel_version = Optional.ofNullable(str);
            return this;
        }

        @Required
        public NoScreenBoxEventContext setDeviceId(String str) {
            this.device_id = str;
            return this;
        }

        public NoScreenBoxEventContext setDeviceModel(String str) {
            this.device_model = Optional.ofNullable(str);
            return this;
        }

        public NoScreenBoxEventContext setDistrictSetting(String str) {
            this.district_setting = Optional.ofNullable(str);
            return this;
        }

        @Required
        public NoScreenBoxEventContext setHardware(String str) {
            this.hardware = str;
            return this;
        }

        public NoScreenBoxEventContext setOs(String str) {
            this.os = Optional.ofNullable(str);
            return this;
        }

        @Required
        public NoScreenBoxEventContext setRomVersion(String str) {
            this.rom_version = str;
            return this;
        }

        @Required
        public NoScreenBoxEventContext setSerialNumber(String str) {
            this.serial_number = str;
            return this;
        }

        public NoScreenBoxEventContext setUid(String str) {
            this.uid = Optional.ofNullable(str);
            return this;
        }
    }

    public static class NoScreenBoxEventParams {

        @Required
        private String dialog_id;

        @Required
        private NoScreenBoxEventContext event_context;

        @Required
        private long timestamp;
        private Optional<NoScreenBoxExtendJson> extend_json = Optional.empty();
        private Optional<String> widget = Optional.empty();
        private Optional<String> event_data_type = Optional.empty();

        public NoScreenBoxEventParams() {
        }

        public NoScreenBoxEventParams(String str, long j, NoScreenBoxEventContext noScreenBoxEventContext) {
            this.dialog_id = str;
            this.timestamp = j;
            this.event_context = noScreenBoxEventContext;
        }

        @Required
        public String getDialogId() {
            return this.dialog_id;
        }

        @Required
        public NoScreenBoxEventContext getEventContext() {
            return this.event_context;
        }

        public Optional<String> getEventDataType() {
            return this.event_data_type;
        }

        public Optional<NoScreenBoxExtendJson> getExtendJson() {
            return this.extend_json;
        }

        @Required
        public long getTimestamp() {
            return this.timestamp;
        }

        public Optional<String> getWidget() {
            return this.widget;
        }

        @Required
        public NoScreenBoxEventParams setDialogId(String str) {
            this.dialog_id = str;
            return this;
        }

        @Required
        public NoScreenBoxEventParams setEventContext(NoScreenBoxEventContext noScreenBoxEventContext) {
            this.event_context = noScreenBoxEventContext;
            return this;
        }

        public NoScreenBoxEventParams setEventDataType(String str) {
            this.event_data_type = Optional.ofNullable(str);
            return this;
        }

        public NoScreenBoxEventParams setExtendJson(NoScreenBoxExtendJson noScreenBoxExtendJson) {
            this.extend_json = Optional.ofNullable(noScreenBoxExtendJson);
            return this;
        }

        @Required
        public NoScreenBoxEventParams setTimestamp(long j) {
            this.timestamp = j;
            return this;
        }

        public NoScreenBoxEventParams setWidget(String str) {
            this.widget = Optional.ofNullable(str);
            return this;
        }
    }

    public enum NoScreenBoxEventType {
        PLAY(0),
        LOAD_ERROR(1),
        LOAD_TIME(2),
        LOAD_MORE(3),
        DURATION(4),
        FINISH(5),
        SWITCH(6);

        private int id;

        NoScreenBoxEventType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class NoScreenBoxExtendJson {
        private Optional<String> origin_id = Optional.empty();
        private Optional<String> loadmore_token = Optional.empty();
        private Optional<String> request_type = Optional.empty();
        private Optional<String> audio_type = Optional.empty();
        private Optional<String> error_type = Optional.empty();
        private Optional<Boolean> is_interrupted = Optional.empty();
        private Optional<String> interrupted_type = Optional.empty();
        private Optional<String> audio_id = Optional.empty();
        private Optional<String> cp_id = Optional.empty();
        private Optional<String> cp_name = Optional.empty();
        private Optional<Long> start_time = Optional.empty();
        private Optional<Long> end_time = Optional.empty();
        private Optional<Long> length = Optional.empty();
        private Optional<Long> position = Optional.empty();
        private Optional<Integer> offset = Optional.empty();
        private Optional<String> switch_type = Optional.empty();
        private Optional<Integer> mdplay = Optional.empty();
        private Optional<String> cp_album_id = Optional.empty();
        private Optional<Integer> episode_index = Optional.empty();
        private Optional<String> dialog_id = Optional.empty();
        private Optional<ObjectNode> log_extension = Optional.empty();
        private Optional<String> origin = Optional.empty();
        private Optional<String> widget = Optional.empty();
        private Optional<String> target = Optional.empty();
        private Optional<String> error_code = Optional.empty();

        public Optional<String> getAudioId() {
            return this.audio_id;
        }

        public Optional<String> getAudioType() {
            return this.audio_type;
        }

        public Optional<String> getCpAlbumId() {
            return this.cp_album_id;
        }

        public Optional<String> getCpId() {
            return this.cp_id;
        }

        public Optional<String> getCpName() {
            return this.cp_name;
        }

        public Optional<String> getDialogId() {
            return this.dialog_id;
        }

        public Optional<Long> getEndTime() {
            return this.end_time;
        }

        public Optional<Integer> getEpisodeIndex() {
            return this.episode_index;
        }

        public Optional<String> getErrorCode() {
            return this.error_code;
        }

        public Optional<String> getErrorType() {
            return this.error_type;
        }

        public Optional<String> getInterruptedType() {
            return this.interrupted_type;
        }

        public Optional<Long> getLength() {
            return this.length;
        }

        public Optional<String> getLoadmoreToken() {
            return this.loadmore_token;
        }

        public Optional<ObjectNode> getLogExtension() {
            return this.log_extension;
        }

        public Optional<Integer> getMdplay() {
            return this.mdplay;
        }

        public Optional<Integer> getOffset() {
            return this.offset;
        }

        public Optional<String> getOrigin() {
            return this.origin;
        }

        public Optional<String> getOriginId() {
            return this.origin_id;
        }

        public Optional<Long> getPosition() {
            return this.position;
        }

        public Optional<String> getRequestType() {
            return this.request_type;
        }

        public Optional<Long> getStartTime() {
            return this.start_time;
        }

        public Optional<String> getSwitchType() {
            return this.switch_type;
        }

        public Optional<String> getTarget() {
            return this.target;
        }

        public Optional<String> getWidget() {
            return this.widget;
        }

        public Optional<Boolean> isInterrupted() {
            return this.is_interrupted;
        }

        public NoScreenBoxExtendJson setAudioId(String str) {
            this.audio_id = Optional.ofNullable(str);
            return this;
        }

        public NoScreenBoxExtendJson setAudioType(String str) {
            this.audio_type = Optional.ofNullable(str);
            return this;
        }

        public NoScreenBoxExtendJson setCpAlbumId(String str) {
            this.cp_album_id = Optional.ofNullable(str);
            return this;
        }

        public NoScreenBoxExtendJson setCpId(String str) {
            this.cp_id = Optional.ofNullable(str);
            return this;
        }

        public NoScreenBoxExtendJson setCpName(String str) {
            this.cp_name = Optional.ofNullable(str);
            return this;
        }

        public NoScreenBoxExtendJson setDialogId(String str) {
            this.dialog_id = Optional.ofNullable(str);
            return this;
        }

        public NoScreenBoxExtendJson setEndTime(long j) {
            this.end_time = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public NoScreenBoxExtendJson setEpisodeIndex(int i) {
            this.episode_index = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public NoScreenBoxExtendJson setErrorCode(String str) {
            this.error_code = Optional.ofNullable(str);
            return this;
        }

        public NoScreenBoxExtendJson setErrorType(String str) {
            this.error_type = Optional.ofNullable(str);
            return this;
        }

        public NoScreenBoxExtendJson setInterruptedType(String str) {
            this.interrupted_type = Optional.ofNullable(str);
            return this;
        }

        public NoScreenBoxExtendJson setIsInterrupted(boolean z) {
            this.is_interrupted = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public NoScreenBoxExtendJson setLength(long j) {
            this.length = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public NoScreenBoxExtendJson setLoadmoreToken(String str) {
            this.loadmore_token = Optional.ofNullable(str);
            return this;
        }

        public NoScreenBoxExtendJson setLogExtension(ObjectNode objectNode) {
            this.log_extension = Optional.ofNullable(objectNode);
            return this;
        }

        public NoScreenBoxExtendJson setMdplay(int i) {
            this.mdplay = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public NoScreenBoxExtendJson setOffset(int i) {
            this.offset = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public NoScreenBoxExtendJson setOrigin(String str) {
            this.origin = Optional.ofNullable(str);
            return this;
        }

        public NoScreenBoxExtendJson setOriginId(String str) {
            this.origin_id = Optional.ofNullable(str);
            return this;
        }

        public NoScreenBoxExtendJson setPosition(long j) {
            this.position = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public NoScreenBoxExtendJson setRequestType(String str) {
            this.request_type = Optional.ofNullable(str);
            return this;
        }

        public NoScreenBoxExtendJson setStartTime(long j) {
            this.start_time = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public NoScreenBoxExtendJson setSwitchType(String str) {
            this.switch_type = Optional.ofNullable(str);
            return this;
        }

        public NoScreenBoxExtendJson setTarget(String str) {
            this.target = Optional.ofNullable(str);
            return this;
        }

        public NoScreenBoxExtendJson setWidget(String str) {
            this.widget = Optional.ofNullable(str);
            return this;
        }
    }

    public static class NoScreenBoxTrackLog {

        @Required
        private NoScreenBoxEventParams event_params;

        @Required
        private NoScreenBoxEventType event_type;

        public NoScreenBoxTrackLog() {
        }

        public NoScreenBoxTrackLog(NoScreenBoxEventType noScreenBoxEventType, NoScreenBoxEventParams noScreenBoxEventParams) {
            this.event_type = noScreenBoxEventType;
            this.event_params = noScreenBoxEventParams;
        }

        @Required
        public NoScreenBoxEventParams getEventParams() {
            return this.event_params;
        }

        @Required
        public NoScreenBoxEventType getEventType() {
            return this.event_type;
        }

        @Required
        public NoScreenBoxTrackLog setEventParams(NoScreenBoxEventParams noScreenBoxEventParams) {
            this.event_params = noScreenBoxEventParams;
            return this;
        }

        @Required
        public NoScreenBoxTrackLog setEventType(NoScreenBoxEventType noScreenBoxEventType) {
            this.event_type = noScreenBoxEventType;
            return this;
        }
    }

    public static class OpenplatformEventContext {

        @Required
        private String app_id;

        @Required
        private String device_id;

        @Required
        private String device_type;

        @Required
        private String miai_version;

        @Required
        private String platform_id;

        @Required
        private String uid;
        private Optional<String> sid = Optional.empty();
        private Optional<String> dialog_id = Optional.empty();
        private Optional<String> rom_version = Optional.empty();

        public OpenplatformEventContext() {
        }

        public OpenplatformEventContext(String str, String str2, String str3, String str4, String str5, String str6) {
            this.device_id = str;
            this.platform_id = str2;
            this.app_id = str3;
            this.uid = str4;
            this.device_type = str5;
            this.miai_version = str6;
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
        public String getDeviceType() {
            return this.device_type;
        }

        public Optional<String> getDialogId() {
            return this.dialog_id;
        }

        @Required
        public String getMiaiVersion() {
            return this.miai_version;
        }

        @Required
        public String getPlatformId() {
            return this.platform_id;
        }

        public Optional<String> getRomVersion() {
            return this.rom_version;
        }

        public Optional<String> getSid() {
            return this.sid;
        }

        @Required
        public String getUid() {
            return this.uid;
        }

        @Required
        public OpenplatformEventContext setAppId(String str) {
            this.app_id = str;
            return this;
        }

        @Required
        public OpenplatformEventContext setDeviceId(String str) {
            this.device_id = str;
            return this;
        }

        @Required
        public OpenplatformEventContext setDeviceType(String str) {
            this.device_type = str;
            return this;
        }

        public OpenplatformEventContext setDialogId(String str) {
            this.dialog_id = Optional.ofNullable(str);
            return this;
        }

        @Required
        public OpenplatformEventContext setMiaiVersion(String str) {
            this.miai_version = str;
            return this;
        }

        @Required
        public OpenplatformEventContext setPlatformId(String str) {
            this.platform_id = str;
            return this;
        }

        public OpenplatformEventContext setRomVersion(String str) {
            this.rom_version = Optional.ofNullable(str);
            return this;
        }

        public OpenplatformEventContext setSid(String str) {
            this.sid = Optional.ofNullable(str);
            return this;
        }

        @Required
        public OpenplatformEventContext setUid(String str) {
            this.uid = str;
            return this;
        }
    }

    public static class OpenplatformEventParams {

        @Required
        private OpenplatformEventContext event_context;

        @Required
        private String event_data_type;
        private Optional<OpenplatformExtendJson> extend_json = Optional.empty();

        @Required
        private long timestamp;

        @Required
        private String widget;

        public OpenplatformEventParams() {
        }

        public OpenplatformEventParams(String str, OpenplatformEventContext openplatformEventContext, String str2, long j) {
            this.widget = str;
            this.event_context = openplatformEventContext;
            this.event_data_type = str2;
            this.timestamp = j;
        }

        @Required
        public OpenplatformEventContext getEventContext() {
            return this.event_context;
        }

        @Required
        public String getEventDataType() {
            return this.event_data_type;
        }

        public Optional<OpenplatformExtendJson> getExtendJson() {
            return this.extend_json;
        }

        @Required
        public long getTimestamp() {
            return this.timestamp;
        }

        @Required
        public String getWidget() {
            return this.widget;
        }

        @Required
        public OpenplatformEventParams setEventContext(OpenplatformEventContext openplatformEventContext) {
            this.event_context = openplatformEventContext;
            return this;
        }

        @Required
        public OpenplatformEventParams setEventDataType(String str) {
            this.event_data_type = str;
            return this;
        }

        public OpenplatformEventParams setExtendJson(OpenplatformExtendJson openplatformExtendJson) {
            this.extend_json = Optional.ofNullable(openplatformExtendJson);
            return this;
        }

        @Required
        public OpenplatformEventParams setTimestamp(long j) {
            this.timestamp = j;
            return this;
        }

        @Required
        public OpenplatformEventParams setWidget(String str) {
            this.widget = str;
            return this;
        }
    }

    public enum OpenplatformEventType {
        PLAY(0),
        STATE(1),
        EXPOSE(2),
        CLICK(3),
        LAUNCH(4),
        ENTER(5),
        CONNECT(6),
        DISCONNECT(7),
        EXIT(8),
        DURATION(9);

        private int id;

        OpenplatformEventType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class OpenplatformExtendJson {
        private Optional<String> audio_id = Optional.empty();
        private Optional<String> audio_type = Optional.empty();
        private Optional<String> cp_name = Optional.empty();
        private Optional<String> cp_id = Optional.empty();
        private Optional<String> label = Optional.empty();
        private Optional<String> label_id = Optional.empty();
        private Optional<String> album_id = Optional.empty();
        private Optional<Integer> episode_index = Optional.empty();
        private Optional<Integer> time_cost = Optional.empty();
        private Optional<Long> duration_in_milli = Optional.empty();
        private Optional<Integer> position = Optional.empty();
        private Optional<String> switch_type = Optional.empty();
        private Optional<Long> start_time = Optional.empty();
        private Optional<Long> end_time = Optional.empty();
        private Optional<Integer> volume = Optional.empty();
        private Optional<Boolean> is_alarm = Optional.empty();
        private Optional<Boolean> is_kid_mode = Optional.empty();
        private Optional<Boolean> is_disable_personalize = Optional.empty();
        private Optional<String> play_mode = Optional.empty();
        private Optional<Integer> status = Optional.empty();
        private Optional<Integer> error_code = Optional.empty();
        private Optional<String> key_value = Optional.empty();
        private Optional<String> click_type = Optional.empty();
        private Optional<String> extend_type = Optional.empty();
        private Optional<Integer> status_code = Optional.empty();
        private Optional<Boolean> is_true = Optional.empty();
        private Optional<String> name = Optional.empty();
        private Optional<String> content = Optional.empty();

        public Optional<String> getAlbumId() {
            return this.album_id;
        }

        public Optional<String> getAudioId() {
            return this.audio_id;
        }

        public Optional<String> getAudioType() {
            return this.audio_type;
        }

        public Optional<String> getClickType() {
            return this.click_type;
        }

        public Optional<String> getContent() {
            return this.content;
        }

        public Optional<String> getCpId() {
            return this.cp_id;
        }

        public Optional<String> getCpName() {
            return this.cp_name;
        }

        public Optional<Long> getDurationInMilli() {
            return this.duration_in_milli;
        }

        public Optional<Long> getEndTime() {
            return this.end_time;
        }

        public Optional<Integer> getEpisodeIndex() {
            return this.episode_index;
        }

        public Optional<Integer> getErrorCode() {
            return this.error_code;
        }

        public Optional<String> getExtendType() {
            return this.extend_type;
        }

        public Optional<String> getKeyValue() {
            return this.key_value;
        }

        public Optional<String> getLabel() {
            return this.label;
        }

        public Optional<String> getLabelId() {
            return this.label_id;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<String> getPlayMode() {
            return this.play_mode;
        }

        public Optional<Integer> getPosition() {
            return this.position;
        }

        public Optional<Long> getStartTime() {
            return this.start_time;
        }

        public Optional<Integer> getStatus() {
            return this.status;
        }

        public Optional<Integer> getStatusCode() {
            return this.status_code;
        }

        public Optional<String> getSwitchType() {
            return this.switch_type;
        }

        public Optional<Integer> getTimeCost() {
            return this.time_cost;
        }

        public Optional<Integer> getVolume() {
            return this.volume;
        }

        public Optional<Boolean> isAlarm() {
            return this.is_alarm;
        }

        public Optional<Boolean> isDisablePersonalize() {
            return this.is_disable_personalize;
        }

        public Optional<Boolean> isKidMode() {
            return this.is_kid_mode;
        }

        public Optional<Boolean> isTrue() {
            return this.is_true;
        }

        public OpenplatformExtendJson setAlbumId(String str) {
            this.album_id = Optional.ofNullable(str);
            return this;
        }

        public OpenplatformExtendJson setAudioId(String str) {
            this.audio_id = Optional.ofNullable(str);
            return this;
        }

        public OpenplatformExtendJson setAudioType(String str) {
            this.audio_type = Optional.ofNullable(str);
            return this;
        }

        public OpenplatformExtendJson setClickType(String str) {
            this.click_type = Optional.ofNullable(str);
            return this;
        }

        public OpenplatformExtendJson setContent(String str) {
            this.content = Optional.ofNullable(str);
            return this;
        }

        public OpenplatformExtendJson setCpId(String str) {
            this.cp_id = Optional.ofNullable(str);
            return this;
        }

        public OpenplatformExtendJson setCpName(String str) {
            this.cp_name = Optional.ofNullable(str);
            return this;
        }

        public OpenplatformExtendJson setDurationInMilli(long j) {
            this.duration_in_milli = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public OpenplatformExtendJson setEndTime(long j) {
            this.end_time = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public OpenplatformExtendJson setEpisodeIndex(int i) {
            this.episode_index = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public OpenplatformExtendJson setErrorCode(int i) {
            this.error_code = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public OpenplatformExtendJson setExtendType(String str) {
            this.extend_type = Optional.ofNullable(str);
            return this;
        }

        public OpenplatformExtendJson setIsAlarm(boolean z) {
            this.is_alarm = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public OpenplatformExtendJson setIsDisablePersonalize(boolean z) {
            this.is_disable_personalize = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public OpenplatformExtendJson setIsKidMode(boolean z) {
            this.is_kid_mode = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public OpenplatformExtendJson setIsTrue(boolean z) {
            this.is_true = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public OpenplatformExtendJson setKeyValue(String str) {
            this.key_value = Optional.ofNullable(str);
            return this;
        }

        public OpenplatformExtendJson setLabel(String str) {
            this.label = Optional.ofNullable(str);
            return this;
        }

        public OpenplatformExtendJson setLabelId(String str) {
            this.label_id = Optional.ofNullable(str);
            return this;
        }

        public OpenplatformExtendJson setName(String str) {
            this.name = Optional.ofNullable(str);
            return this;
        }

        public OpenplatformExtendJson setPlayMode(String str) {
            this.play_mode = Optional.ofNullable(str);
            return this;
        }

        public OpenplatformExtendJson setPosition(int i) {
            this.position = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public OpenplatformExtendJson setStartTime(long j) {
            this.start_time = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public OpenplatformExtendJson setStatus(int i) {
            this.status = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public OpenplatformExtendJson setStatusCode(int i) {
            this.status_code = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public OpenplatformExtendJson setSwitchType(String str) {
            this.switch_type = Optional.ofNullable(str);
            return this;
        }

        public OpenplatformExtendJson setTimeCost(int i) {
            this.time_cost = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public OpenplatformExtendJson setVolume(int i) {
            this.volume = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }
    }

    public static class OpenplatformTrackLog {

        @Required
        private OpenplatformEventParams event_params;

        @Required
        private OpenplatformEventType event_type;

        public OpenplatformTrackLog() {
        }

        public OpenplatformTrackLog(OpenplatformEventType openplatformEventType, OpenplatformEventParams openplatformEventParams) {
            this.event_type = openplatformEventType;
            this.event_params = openplatformEventParams;
        }

        @Required
        public OpenplatformEventParams getEventParams() {
            return this.event_params;
        }

        @Required
        public OpenplatformEventType getEventType() {
            return this.event_type;
        }

        @Required
        public OpenplatformTrackLog setEventParams(OpenplatformEventParams openplatformEventParams) {
            this.event_params = openplatformEventParams;
            return this;
        }

        @Required
        public OpenplatformTrackLog setEventType(OpenplatformEventType openplatformEventType) {
            this.event_type = openplatformEventType;
            return this;
        }
    }

    public static class PerfEventContext {

        @Required
        private String app_id;

        @Required
        private String device_id;
        private Optional<String> bt_device_mac_address = Optional.empty();
        private Optional<String> bt_device_name = Optional.empty();
        private Optional<String> uid = Optional.empty();
        private Optional<String> network_status = Optional.empty();
        private Optional<String> rom_version = Optional.empty();
        private Optional<String> device_model = Optional.empty();
        private Optional<String> miai_version = Optional.empty();
        private Optional<String> build_versioncode = Optional.empty();
        private Optional<Boolean> channel_rom_version = Optional.empty();
        private Optional<String> device_model_codename = Optional.empty();
        private Optional<String> android_version = Optional.empty();
        private Optional<String> android_sdk_version = Optional.empty();
        private Optional<String> upgrade_channel = Optional.empty();
        private Optional<String> device_type = Optional.empty();
        private Optional<String> position = Optional.empty();
        private Optional<String> cur_page = Optional.empty();
        private Optional<String> ua = Optional.empty();
        private Optional<String> cid = Optional.empty();

        public PerfEventContext() {
        }

        public PerfEventContext(String str, String str2) {
            this.device_id = str;
            this.app_id = str2;
        }

        public Optional<String> getAndroidSdkVersion() {
            return this.android_sdk_version;
        }

        public Optional<String> getAndroidVersion() {
            return this.android_version;
        }

        @Required
        public String getAppId() {
            return this.app_id;
        }

        public Optional<String> getBtDeviceMacAddress() {
            return this.bt_device_mac_address;
        }

        public Optional<String> getBtDeviceName() {
            return this.bt_device_name;
        }

        public Optional<String> getBuildVersioncode() {
            return this.build_versioncode;
        }

        public Optional<String> getCid() {
            return this.cid;
        }

        public Optional<String> getCurPage() {
            return this.cur_page;
        }

        @Required
        public String getDeviceId() {
            return this.device_id;
        }

        public Optional<String> getDeviceModel() {
            return this.device_model;
        }

        public Optional<String> getDeviceModelCodename() {
            return this.device_model_codename;
        }

        public Optional<String> getDeviceType() {
            return this.device_type;
        }

        public Optional<String> getMiaiVersion() {
            return this.miai_version;
        }

        public Optional<String> getNetworkStatus() {
            return this.network_status;
        }

        public Optional<String> getPosition() {
            return this.position;
        }

        public Optional<String> getRomVersion() {
            return this.rom_version;
        }

        public Optional<String> getUa() {
            return this.ua;
        }

        public Optional<String> getUid() {
            return this.uid;
        }

        public Optional<String> getUpgradeChannel() {
            return this.upgrade_channel;
        }

        public Optional<Boolean> isChannelRomVersion() {
            return this.channel_rom_version;
        }

        public PerfEventContext setAndroidSdkVersion(String str) {
            this.android_sdk_version = Optional.ofNullable(str);
            return this;
        }

        public PerfEventContext setAndroidVersion(String str) {
            this.android_version = Optional.ofNullable(str);
            return this;
        }

        @Required
        public PerfEventContext setAppId(String str) {
            this.app_id = str;
            return this;
        }

        public PerfEventContext setBtDeviceMacAddress(String str) {
            this.bt_device_mac_address = Optional.ofNullable(str);
            return this;
        }

        public PerfEventContext setBtDeviceName(String str) {
            this.bt_device_name = Optional.ofNullable(str);
            return this;
        }

        public PerfEventContext setBuildVersioncode(String str) {
            this.build_versioncode = Optional.ofNullable(str);
            return this;
        }

        public PerfEventContext setChannelRomVersion(boolean z) {
            this.channel_rom_version = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public PerfEventContext setCid(String str) {
            this.cid = Optional.ofNullable(str);
            return this;
        }

        public PerfEventContext setCurPage(String str) {
            this.cur_page = Optional.ofNullable(str);
            return this;
        }

        @Required
        public PerfEventContext setDeviceId(String str) {
            this.device_id = str;
            return this;
        }

        public PerfEventContext setDeviceModel(String str) {
            this.device_model = Optional.ofNullable(str);
            return this;
        }

        public PerfEventContext setDeviceModelCodename(String str) {
            this.device_model_codename = Optional.ofNullable(str);
            return this;
        }

        public PerfEventContext setDeviceType(String str) {
            this.device_type = Optional.ofNullable(str);
            return this;
        }

        public PerfEventContext setMiaiVersion(String str) {
            this.miai_version = Optional.ofNullable(str);
            return this;
        }

        public PerfEventContext setNetworkStatus(String str) {
            this.network_status = Optional.ofNullable(str);
            return this;
        }

        public PerfEventContext setPosition(String str) {
            this.position = Optional.ofNullable(str);
            return this;
        }

        public PerfEventContext setRomVersion(String str) {
            this.rom_version = Optional.ofNullable(str);
            return this;
        }

        public PerfEventContext setUa(String str) {
            this.ua = Optional.ofNullable(str);
            return this;
        }

        public PerfEventContext setUid(String str) {
            this.uid = Optional.ofNullable(str);
            return this;
        }

        public PerfEventContext setUpgradeChannel(String str) {
            this.upgrade_channel = Optional.ofNullable(str);
            return this;
        }
    }

    public static class PerfEventParams {

        @Required
        private PerfEventContext event_context;

        @Required
        private String event_data_type;
        private Optional<PerfExtendJson> extend_json = Optional.empty();

        @Required
        private long timestamp;

        @Required
        private String widget;

        public PerfEventParams() {
        }

        public PerfEventParams(String str, PerfEventContext perfEventContext, String str2, long j) {
            this.widget = str;
            this.event_context = perfEventContext;
            this.event_data_type = str2;
            this.timestamp = j;
        }

        @Required
        public PerfEventContext getEventContext() {
            return this.event_context;
        }

        @Required
        public String getEventDataType() {
            return this.event_data_type;
        }

        public Optional<PerfExtendJson> getExtendJson() {
            return this.extend_json;
        }

        @Required
        public long getTimestamp() {
            return this.timestamp;
        }

        @Required
        public String getWidget() {
            return this.widget;
        }

        @Required
        public PerfEventParams setEventContext(PerfEventContext perfEventContext) {
            this.event_context = perfEventContext;
            return this;
        }

        @Required
        public PerfEventParams setEventDataType(String str) {
            this.event_data_type = str;
            return this;
        }

        public PerfEventParams setExtendJson(PerfExtendJson perfExtendJson) {
            this.extend_json = Optional.ofNullable(perfExtendJson);
            return this;
        }

        @Required
        public PerfEventParams setTimestamp(long j) {
            this.timestamp = j;
            return this;
        }

        @Required
        public PerfEventParams setWidget(String str) {
            this.widget = str;
            return this;
        }
    }

    public enum PerfEventType {
        DURATION(0),
        STATE(1),
        LOAD_ERROR(2),
        TIMESTAMP_GROUP(3),
        EXPOSE(4),
        CLICK(5),
        RATE(6);

        private int id;

        PerfEventType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class PerfExtendJson {
        private Optional<String> rpk_packagename = Optional.empty();
        private Optional<Integer> rpk_version_code = Optional.empty();
        private Optional<String> url = Optional.empty();
        private Optional<Long> length = Optional.empty();
        private Optional<String> status_code = Optional.empty();
        private Optional<String> message = Optional.empty();
        private Optional<String> page_url = Optional.empty();
        private Optional<String> item_list = Optional.empty();
        private Optional<String> get_type = Optional.empty();
        private Optional<String> from = Optional.empty();
        private Optional<Boolean> support = Optional.empty();
        private Optional<String> version = Optional.empty();
        private Optional<Integer> sw_handle_times = Optional.empty();
        private Optional<Integer> sw_cache_will_be_used_times = Optional.empty();
        private Optional<String> sw_cache_will_be_load_urls = Optional.empty();
        private Optional<Integer> static_load_success_times = Optional.empty();
        private Optional<Integer> static_handle_times = Optional.empty();
        private Optional<String> static_urls = Optional.empty();
        private Optional<String> uuid = Optional.empty();
        private Optional<String> cid = Optional.empty();
        private Optional<String> user_defined_id = Optional.empty();
        private Optional<Double> rate = Optional.empty();
        private Optional<String> stage = Optional.empty();
        private Optional<Integer> status = Optional.empty();

        public Optional<String> getCid() {
            return this.cid;
        }

        public Optional<String> getFrom() {
            return this.from;
        }

        public Optional<String> getGetType() {
            return this.get_type;
        }

        public Optional<String> getItemList() {
            return this.item_list;
        }

        public Optional<Long> getLength() {
            return this.length;
        }

        public Optional<String> getMessage() {
            return this.message;
        }

        public Optional<String> getPageUrl() {
            return this.page_url;
        }

        public Optional<Double> getRate() {
            return this.rate;
        }

        public Optional<String> getRpkPackagename() {
            return this.rpk_packagename;
        }

        public Optional<Integer> getRpkVersionCode() {
            return this.rpk_version_code;
        }

        public Optional<String> getStage() {
            return this.stage;
        }

        public Optional<Integer> getStaticHandleTimes() {
            return this.static_handle_times;
        }

        public Optional<Integer> getStaticLoadSuccessTimes() {
            return this.static_load_success_times;
        }

        public Optional<String> getStaticUrls() {
            return this.static_urls;
        }

        public Optional<Integer> getStatus() {
            return this.status;
        }

        public Optional<String> getStatusCode() {
            return this.status_code;
        }

        public Optional<String> getSwCacheWillBeLoadUrls() {
            return this.sw_cache_will_be_load_urls;
        }

        public Optional<Integer> getSwCacheWillBeUsedTimes() {
            return this.sw_cache_will_be_used_times;
        }

        public Optional<Integer> getSwHandleTimes() {
            return this.sw_handle_times;
        }

        public Optional<String> getUrl() {
            return this.url;
        }

        public Optional<String> getUserDefinedId() {
            return this.user_defined_id;
        }

        public Optional<String> getUuid() {
            return this.uuid;
        }

        public Optional<String> getVersion() {
            return this.version;
        }

        public Optional<Boolean> isSupport() {
            return this.support;
        }

        public PerfExtendJson setCid(String str) {
            this.cid = Optional.ofNullable(str);
            return this;
        }

        public PerfExtendJson setFrom(String str) {
            this.from = Optional.ofNullable(str);
            return this;
        }

        public PerfExtendJson setGetType(String str) {
            this.get_type = Optional.ofNullable(str);
            return this;
        }

        public PerfExtendJson setItemList(String str) {
            this.item_list = Optional.ofNullable(str);
            return this;
        }

        public PerfExtendJson setLength(long j) {
            this.length = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public PerfExtendJson setMessage(String str) {
            this.message = Optional.ofNullable(str);
            return this;
        }

        public PerfExtendJson setPageUrl(String str) {
            this.page_url = Optional.ofNullable(str);
            return this;
        }

        public PerfExtendJson setRate(double d) {
            this.rate = Optional.ofNullable(Double.valueOf(d));
            return this;
        }

        public PerfExtendJson setRpkPackagename(String str) {
            this.rpk_packagename = Optional.ofNullable(str);
            return this;
        }

        public PerfExtendJson setRpkVersionCode(int i) {
            this.rpk_version_code = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public PerfExtendJson setStage(String str) {
            this.stage = Optional.ofNullable(str);
            return this;
        }

        public PerfExtendJson setStaticHandleTimes(int i) {
            this.static_handle_times = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public PerfExtendJson setStaticLoadSuccessTimes(int i) {
            this.static_load_success_times = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public PerfExtendJson setStaticUrls(String str) {
            this.static_urls = Optional.ofNullable(str);
            return this;
        }

        public PerfExtendJson setStatus(int i) {
            this.status = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public PerfExtendJson setStatusCode(String str) {
            this.status_code = Optional.ofNullable(str);
            return this;
        }

        public PerfExtendJson setSupport(boolean z) {
            this.support = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public PerfExtendJson setSwCacheWillBeLoadUrls(String str) {
            this.sw_cache_will_be_load_urls = Optional.ofNullable(str);
            return this;
        }

        public PerfExtendJson setSwCacheWillBeUsedTimes(int i) {
            this.sw_cache_will_be_used_times = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public PerfExtendJson setSwHandleTimes(int i) {
            this.sw_handle_times = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public PerfExtendJson setUrl(String str) {
            this.url = Optional.ofNullable(str);
            return this;
        }

        public PerfExtendJson setUserDefinedId(String str) {
            this.user_defined_id = Optional.ofNullable(str);
            return this;
        }

        public PerfExtendJson setUuid(String str) {
            this.uuid = Optional.ofNullable(str);
            return this;
        }

        public PerfExtendJson setVersion(String str) {
            this.version = Optional.ofNullable(str);
            return this;
        }
    }

    public static class PerfTrackLog {

        @Required
        private PerfEventParams event_params;

        @Required
        private PerfEventType event_type;

        public PerfTrackLog() {
        }

        public PerfTrackLog(PerfEventType perfEventType, PerfEventParams perfEventParams) {
            this.event_type = perfEventType;
            this.event_params = perfEventParams;
        }

        @Required
        public PerfEventParams getEventParams() {
            return this.event_params;
        }

        @Required
        public PerfEventType getEventType() {
            return this.event_type;
        }

        @Required
        public PerfTrackLog setEventParams(PerfEventParams perfEventParams) {
            this.event_params = perfEventParams;
            return this;
        }

        @Required
        public PerfTrackLog setEventType(PerfEventType perfEventType) {
            this.event_type = perfEventType;
            return this;
        }
    }

    public enum ProductType {
        YEAR_CARD(0),
        SEASONLY_CARD(1),
        MONTHLY_CARD(2),
        HALF_YEAR_CARD(3),
        SEASON_CARD(4),
        MONTH_CARD(5);

        private int id;

        ProductType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class ScreenBoxEventContext {

        @Required
        private String app_id;

        @Required
        private String device_id;

        @Required
        private String hardware;

        @Required
        private String os_version;

        @Required
        private String rom_version;

        @Required
        private String serial_number;
        private Optional<String> district_setting = Optional.empty();
        private Optional<String> channel_version = Optional.empty();
        private Optional<String> uid = Optional.empty();
        private Optional<TrackNetworkStatus> network_status = Optional.empty();
        private Optional<TrackUserMode> user_mode = Optional.empty();
        private Optional<TrackPageType> page_type = Optional.empty();

        public ScreenBoxEventContext() {
        }

        public ScreenBoxEventContext(String str, String str2, String str3, String str4, String str5, String str6) {
            this.device_id = str;
            this.serial_number = str2;
            this.hardware = str3;
            this.app_id = str4;
            this.rom_version = str5;
            this.os_version = str6;
        }

        @Required
        public String getAppId() {
            return this.app_id;
        }

        public Optional<String> getChannelVersion() {
            return this.channel_version;
        }

        @Required
        public String getDeviceId() {
            return this.device_id;
        }

        public Optional<String> getDistrictSetting() {
            return this.district_setting;
        }

        @Required
        public String getHardware() {
            return this.hardware;
        }

        public Optional<TrackNetworkStatus> getNetworkStatus() {
            return this.network_status;
        }

        @Required
        public String getOsVersion() {
            return this.os_version;
        }

        public Optional<TrackPageType> getPageType() {
            return this.page_type;
        }

        @Required
        public String getRomVersion() {
            return this.rom_version;
        }

        @Required
        public String getSerialNumber() {
            return this.serial_number;
        }

        public Optional<String> getUid() {
            return this.uid;
        }

        public Optional<TrackUserMode> getUserMode() {
            return this.user_mode;
        }

        @Required
        public ScreenBoxEventContext setAppId(String str) {
            this.app_id = str;
            return this;
        }

        public ScreenBoxEventContext setChannelVersion(String str) {
            this.channel_version = Optional.ofNullable(str);
            return this;
        }

        @Required
        public ScreenBoxEventContext setDeviceId(String str) {
            this.device_id = str;
            return this;
        }

        public ScreenBoxEventContext setDistrictSetting(String str) {
            this.district_setting = Optional.ofNullable(str);
            return this;
        }

        @Required
        public ScreenBoxEventContext setHardware(String str) {
            this.hardware = str;
            return this;
        }

        public ScreenBoxEventContext setNetworkStatus(TrackNetworkStatus trackNetworkStatus) {
            this.network_status = Optional.ofNullable(trackNetworkStatus);
            return this;
        }

        @Required
        public ScreenBoxEventContext setOsVersion(String str) {
            this.os_version = str;
            return this;
        }

        public ScreenBoxEventContext setPageType(TrackPageType trackPageType) {
            this.page_type = Optional.ofNullable(trackPageType);
            return this;
        }

        @Required
        public ScreenBoxEventContext setRomVersion(String str) {
            this.rom_version = str;
            return this;
        }

        @Required
        public ScreenBoxEventContext setSerialNumber(String str) {
            this.serial_number = str;
            return this;
        }

        public ScreenBoxEventContext setUid(String str) {
            this.uid = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxEventContext setUserMode(TrackUserMode trackUserMode) {
            this.user_mode = Optional.ofNullable(trackUserMode);
            return this;
        }
    }

    public static class ScreenBoxEventParams {

        @Required
        private ScreenBoxEventContext event_context;

        @Required
        private String event_data_type;
        private Optional<ScreenBoxExtendJson> extend_json = Optional.empty();

        @Required
        private long timestamp;

        @Required
        private String widget;

        public ScreenBoxEventParams() {
        }

        public ScreenBoxEventParams(String str, ScreenBoxEventContext screenBoxEventContext, String str2, long j) {
            this.widget = str;
            this.event_context = screenBoxEventContext;
            this.event_data_type = str2;
            this.timestamp = j;
        }

        @Required
        public ScreenBoxEventContext getEventContext() {
            return this.event_context;
        }

        @Required
        public String getEventDataType() {
            return this.event_data_type;
        }

        public Optional<ScreenBoxExtendJson> getExtendJson() {
            return this.extend_json;
        }

        @Required
        public long getTimestamp() {
            return this.timestamp;
        }

        @Required
        public String getWidget() {
            return this.widget;
        }

        @Required
        public ScreenBoxEventParams setEventContext(ScreenBoxEventContext screenBoxEventContext) {
            this.event_context = screenBoxEventContext;
            return this;
        }

        @Required
        public ScreenBoxEventParams setEventDataType(String str) {
            this.event_data_type = str;
            return this;
        }

        public ScreenBoxEventParams setExtendJson(ScreenBoxExtendJson screenBoxExtendJson) {
            this.extend_json = Optional.ofNullable(screenBoxExtendJson);
            return this;
        }

        @Required
        public ScreenBoxEventParams setTimestamp(long j) {
            this.timestamp = j;
            return this;
        }

        @Required
        public ScreenBoxEventParams setWidget(String str) {
            this.widget = str;
            return this;
        }
    }

    public enum ScreenBoxEventType {
        EXPOSE(0),
        CLICK(1),
        FINISH(2),
        PLAY(3),
        FAVORITE(4),
        ENTER(5),
        EXIT(6),
        CANCEL_FAVORITE(7);

        private int id;

        ScreenBoxEventType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class ScreenBoxExtendJson {
        private Optional<String> meta_id = Optional.empty();
        private Optional<String> resource_id = Optional.empty();
        private Optional<String> cp = Optional.empty();
        private Optional<String> from = Optional.empty();
        private Optional<String> media_type = Optional.empty();
        private Optional<String> click_type = Optional.empty();

        @Deprecated
        private Optional<String> play_type = Optional.empty();
        private Optional<Long> duration = Optional.empty();

        @Deprecated
        private Optional<Long> position = Optional.empty();
        private Optional<String> cp_id = Optional.empty();
        private Optional<String> cp_name = Optional.empty();
        private Optional<Integer> offset = Optional.empty();
        private Optional<String> dialog_id = Optional.empty();
        private Optional<String> exp_id = Optional.empty();
        private Optional<String> imp_area = Optional.empty();
        private Optional<String> content_mode = Optional.empty();
        private Optional<String> control_type = Optional.empty();
        private Optional<String> category = Optional.empty();
        private Optional<String> dialog_origin = Optional.empty();
        private Optional<String> shortvideo_type = Optional.empty();
        private Optional<String> element_id = Optional.empty();
        private Optional<String> trace_id = Optional.empty();
        private Optional<String> tab = Optional.empty();
        private Optional<Integer> tab_offset = Optional.empty();
        private Optional<String> audio_id = Optional.empty();
        private Optional<String> audio_source = Optional.empty();
        private Optional<Long> play_start_time = Optional.empty();
        private Optional<Long> play_position = Optional.empty();
        private Optional<ScreenBoxPlayFinishType> play_finish_type = Optional.empty();
        private Optional<String> play_event_type = Optional.empty();
        private Optional<Boolean> is_interrupted = Optional.empty();
        private Optional<String> music_copyright_party = Optional.empty();
        private Optional<String> music_copyright_party_id = Optional.empty();
        private Optional<String> album_id = Optional.empty();
        private Optional<Integer> episode_index = Optional.empty();
        private Optional<String> query_string = Optional.empty();
        private Optional<ScreenBoxStatus> status = Optional.empty();
        private Optional<ScreenBoxExtendType> extend_type = Optional.empty();
        private Optional<String> debug_info = Optional.empty();
        private Optional<String> query_source = Optional.empty();
        private Optional<String> app_name = Optional.empty();
        private Optional<String> query_text = Optional.empty();
        private Optional<String> send_query = Optional.empty();
        private Optional<String> query_id = Optional.empty();
        private Optional<String> domain = Optional.empty();
        private Optional<Boolean> is_cut_in = Optional.empty();
        private Optional<String> origin_id = Optional.empty();
        private Optional<Long> play_end_time = Optional.empty();
        private Optional<ObjectNode> log_extension = Optional.empty();
        private Optional<String> cp_album_id = Optional.empty();
        private Optional<String> switch_type = Optional.empty();
        private Optional<String> audio_type = Optional.empty();
        private Optional<String> button_content = Optional.empty();
        private Optional<String> product = Optional.empty();
        private Optional<Double> price = Optional.empty();
        private Optional<String> recall_type = Optional.empty();
        private Optional<String> sub_tab = Optional.empty();
        private Optional<String> module_name = Optional.empty();
        private Optional<String> page_type = Optional.empty();
        private Optional<String> float_type = Optional.empty();
        private Optional<Boolean> is_true = Optional.empty();
        private Optional<String> exit_type = Optional.empty();

        public Optional<String> getAlbumId() {
            return this.album_id;
        }

        public Optional<String> getAppName() {
            return this.app_name;
        }

        public Optional<String> getAudioId() {
            return this.audio_id;
        }

        public Optional<String> getAudioSource() {
            return this.audio_source;
        }

        public Optional<String> getAudioType() {
            return this.audio_type;
        }

        public Optional<String> getButtonContent() {
            return this.button_content;
        }

        public Optional<String> getCategory() {
            return this.category;
        }

        public Optional<String> getClickType() {
            return this.click_type;
        }

        public Optional<String> getContentMode() {
            return this.content_mode;
        }

        public Optional<String> getControlType() {
            return this.control_type;
        }

        public Optional<String> getCp() {
            return this.cp;
        }

        public Optional<String> getCpAlbumId() {
            return this.cp_album_id;
        }

        public Optional<String> getCpId() {
            return this.cp_id;
        }

        public Optional<String> getCpName() {
            return this.cp_name;
        }

        public Optional<String> getDebugInfo() {
            return this.debug_info;
        }

        public Optional<String> getDialogId() {
            return this.dialog_id;
        }

        public Optional<String> getDialogOrigin() {
            return this.dialog_origin;
        }

        public Optional<String> getDomain() {
            return this.domain;
        }

        public Optional<Long> getDuration() {
            return this.duration;
        }

        public Optional<String> getElementId() {
            return this.element_id;
        }

        public Optional<Integer> getEpisodeIndex() {
            return this.episode_index;
        }

        public Optional<String> getExitType() {
            return this.exit_type;
        }

        public Optional<String> getExpId() {
            return this.exp_id;
        }

        public Optional<ScreenBoxExtendType> getExtendType() {
            return this.extend_type;
        }

        public Optional<String> getFloatType() {
            return this.float_type;
        }

        public Optional<String> getFrom() {
            return this.from;
        }

        public Optional<String> getImpArea() {
            return this.imp_area;
        }

        public Optional<ObjectNode> getLogExtension() {
            return this.log_extension;
        }

        public Optional<String> getMediaType() {
            return this.media_type;
        }

        public Optional<String> getMetaId() {
            return this.meta_id;
        }

        public Optional<String> getModuleName() {
            return this.module_name;
        }

        public Optional<String> getMusicCopyrightParty() {
            return this.music_copyright_party;
        }

        public Optional<String> getMusicCopyrightPartyId() {
            return this.music_copyright_party_id;
        }

        public Optional<Integer> getOffset() {
            return this.offset;
        }

        public Optional<String> getOriginId() {
            return this.origin_id;
        }

        public Optional<String> getPageType() {
            return this.page_type;
        }

        public Optional<Long> getPlayEndTime() {
            return this.play_end_time;
        }

        public Optional<String> getPlayEventType() {
            return this.play_event_type;
        }

        public Optional<ScreenBoxPlayFinishType> getPlayFinishType() {
            return this.play_finish_type;
        }

        public Optional<Long> getPlayPosition() {
            return this.play_position;
        }

        public Optional<Long> getPlayStartTime() {
            return this.play_start_time;
        }

        @Deprecated
        public Optional<String> getPlayType() {
            return this.play_type;
        }

        @Deprecated
        public Optional<Long> getPosition() {
            return this.position;
        }

        public Optional<Double> getPrice() {
            return this.price;
        }

        public Optional<String> getProduct() {
            return this.product;
        }

        public Optional<String> getQueryId() {
            return this.query_id;
        }

        public Optional<String> getQuerySource() {
            return this.query_source;
        }

        public Optional<String> getQueryString() {
            return this.query_string;
        }

        public Optional<String> getQueryText() {
            return this.query_text;
        }

        public Optional<String> getRecallType() {
            return this.recall_type;
        }

        public Optional<String> getResourceId() {
            return this.resource_id;
        }

        public Optional<String> getSendQuery() {
            return this.send_query;
        }

        public Optional<String> getShortvideoType() {
            return this.shortvideo_type;
        }

        public Optional<ScreenBoxStatus> getStatus() {
            return this.status;
        }

        public Optional<String> getSubTab() {
            return this.sub_tab;
        }

        public Optional<String> getSwitchType() {
            return this.switch_type;
        }

        public Optional<String> getTab() {
            return this.tab;
        }

        public Optional<Integer> getTabOffset() {
            return this.tab_offset;
        }

        public Optional<String> getTraceId() {
            return this.trace_id;
        }

        public Optional<Boolean> isCutIn() {
            return this.is_cut_in;
        }

        public Optional<Boolean> isInterrupted() {
            return this.is_interrupted;
        }

        public Optional<Boolean> isTrue() {
            return this.is_true;
        }

        public ScreenBoxExtendJson setAlbumId(String str) {
            this.album_id = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setAppName(String str) {
            this.app_name = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setAudioId(String str) {
            this.audio_id = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setAudioSource(String str) {
            this.audio_source = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setAudioType(String str) {
            this.audio_type = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setButtonContent(String str) {
            this.button_content = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setCategory(String str) {
            this.category = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setClickType(String str) {
            this.click_type = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setContentMode(String str) {
            this.content_mode = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setControlType(String str) {
            this.control_type = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setCp(String str) {
            this.cp = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setCpAlbumId(String str) {
            this.cp_album_id = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setCpId(String str) {
            this.cp_id = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setCpName(String str) {
            this.cp_name = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setDebugInfo(String str) {
            this.debug_info = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setDialogId(String str) {
            this.dialog_id = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setDialogOrigin(String str) {
            this.dialog_origin = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setDomain(String str) {
            this.domain = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setDuration(long j) {
            this.duration = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public ScreenBoxExtendJson setElementId(String str) {
            this.element_id = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setEpisodeIndex(int i) {
            this.episode_index = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public ScreenBoxExtendJson setExitType(String str) {
            this.exit_type = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setExpId(String str) {
            this.exp_id = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setExtendType(ScreenBoxExtendType screenBoxExtendType) {
            this.extend_type = Optional.ofNullable(screenBoxExtendType);
            return this;
        }

        public ScreenBoxExtendJson setFloatType(String str) {
            this.float_type = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setFrom(String str) {
            this.from = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setImpArea(String str) {
            this.imp_area = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setIsCutIn(boolean z) {
            this.is_cut_in = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public ScreenBoxExtendJson setIsInterrupted(boolean z) {
            this.is_interrupted = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public ScreenBoxExtendJson setIsTrue(boolean z) {
            this.is_true = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public ScreenBoxExtendJson setLogExtension(ObjectNode objectNode) {
            this.log_extension = Optional.ofNullable(objectNode);
            return this;
        }

        public ScreenBoxExtendJson setMediaType(String str) {
            this.media_type = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setMetaId(String str) {
            this.meta_id = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setModuleName(String str) {
            this.module_name = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setMusicCopyrightParty(String str) {
            this.music_copyright_party = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setMusicCopyrightPartyId(String str) {
            this.music_copyright_party_id = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setOffset(int i) {
            this.offset = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public ScreenBoxExtendJson setOriginId(String str) {
            this.origin_id = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setPageType(String str) {
            this.page_type = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setPlayEndTime(long j) {
            this.play_end_time = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public ScreenBoxExtendJson setPlayEventType(String str) {
            this.play_event_type = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setPlayFinishType(ScreenBoxPlayFinishType screenBoxPlayFinishType) {
            this.play_finish_type = Optional.ofNullable(screenBoxPlayFinishType);
            return this;
        }

        public ScreenBoxExtendJson setPlayPosition(long j) {
            this.play_position = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public ScreenBoxExtendJson setPlayStartTime(long j) {
            this.play_start_time = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        @Deprecated
        public ScreenBoxExtendJson setPlayType(String str) {
            this.play_type = Optional.ofNullable(str);
            return this;
        }

        @Deprecated
        public ScreenBoxExtendJson setPosition(long j) {
            this.position = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public ScreenBoxExtendJson setPrice(double d) {
            this.price = Optional.ofNullable(Double.valueOf(d));
            return this;
        }

        public ScreenBoxExtendJson setProduct(String str) {
            this.product = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setQueryId(String str) {
            this.query_id = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setQuerySource(String str) {
            this.query_source = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setQueryString(String str) {
            this.query_string = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setQueryText(String str) {
            this.query_text = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setRecallType(String str) {
            this.recall_type = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setResourceId(String str) {
            this.resource_id = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setSendQuery(String str) {
            this.send_query = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setShortvideoType(String str) {
            this.shortvideo_type = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setStatus(ScreenBoxStatus screenBoxStatus) {
            this.status = Optional.ofNullable(screenBoxStatus);
            return this;
        }

        public ScreenBoxExtendJson setSubTab(String str) {
            this.sub_tab = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setSwitchType(String str) {
            this.switch_type = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setTab(String str) {
            this.tab = Optional.ofNullable(str);
            return this;
        }

        public ScreenBoxExtendJson setTabOffset(int i) {
            this.tab_offset = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public ScreenBoxExtendJson setTraceId(String str) {
            this.trace_id = Optional.ofNullable(str);
            return this;
        }
    }

    public enum ScreenBoxExtendType {
        SWITCH(0),
        INTENT(1);

        private int id;

        ScreenBoxExtendType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum ScreenBoxPlayEventType {
        FINISH(0),
        PAUSE(1),
        PLAY(2),
        FAST_FORWARD(3),
        FAST_REWIND(4),
        NEXT(5),
        PREV(6),
        PROGRESS_BAR(7);

        private int id;

        ScreenBoxPlayEventType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum ScreenBoxPlayFinishType {
        AUTO_SWITCH(0),
        MAN_SWITCH(1);

        private int id;

        ScreenBoxPlayFinishType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum ScreenBoxStatus {
        UNKNOWN(-1),
        SUCCEED(0),
        FAILED(1);

        private int id;

        ScreenBoxStatus(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class ScreenBoxTrackLog {

        @Required
        private ScreenBoxEventParams event_params;

        @Required
        private ScreenBoxEventType event_type;

        public ScreenBoxTrackLog() {
        }

        public ScreenBoxTrackLog(ScreenBoxEventType screenBoxEventType, ScreenBoxEventParams screenBoxEventParams) {
            this.event_type = screenBoxEventType;
            this.event_params = screenBoxEventParams;
        }

        @Required
        public ScreenBoxEventParams getEventParams() {
            return this.event_params;
        }

        @Required
        public ScreenBoxEventType getEventType() {
            return this.event_type;
        }

        @Required
        public ScreenBoxTrackLog setEventParams(ScreenBoxEventParams screenBoxEventParams) {
            this.event_params = screenBoxEventParams;
            return this;
        }

        @Required
        public ScreenBoxTrackLog setEventType(ScreenBoxEventType screenBoxEventType) {
            this.event_type = screenBoxEventType;
            return this;
        }
    }

    public enum TrackCardType {
        FULL_SCREEN(0),
        SMALL(1),
        TOAST(2);

        private int id;

        TrackCardType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum TrackFloatingBallWakeupMethod {
        SINGLE_CLICK(0),
        DOUBLE_CLICK(1),
        LONG_PRESS(2);

        private int id;

        TrackFloatingBallWakeupMethod(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class TrackLog {

        @Required
        private ObjectNode data;

        @Required
        private DataType data_type;

        public TrackLog() {
        }

        public TrackLog(DataType dataType, ObjectNode objectNode) {
            this.data_type = dataType;
            this.data = objectNode;
        }

        @Required
        public ObjectNode getData() {
            return this.data;
        }

        @Required
        public DataType getDataType() {
            return this.data_type;
        }

        @Required
        public TrackLog setData(ObjectNode objectNode) {
            this.data = objectNode;
            return this;
        }

        @Required
        public TrackLog setDataType(DataType dataType) {
            this.data_type = dataType;
            return this;
        }
    }

    public enum TrackNetworkStatus {
        WIFI(0),
        NONE(1);

        private int id;

        TrackNetworkStatus(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum TrackPageType {
        CHILDREN_PAGE(0);

        private int id;

        TrackPageType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum TrackUserMode {
        KID(0),
        NORMAL(1);

        private int id;

        TrackUserMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum TvButton {
        PLAY(0),
        SELECT(1),
        FAVORITE(2),
        UNFAVORITE(3);

        private int id;

        TvButton(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class TvEventContext {
        private Optional<String> device_id = Optional.empty();
        private Optional<String> platform_id = Optional.empty();
        private Optional<String> uid = Optional.empty();
        private Optional<String> app_id = Optional.empty();
        private Optional<String> miai_version = Optional.empty();
        private Optional<String> wakeup_version = Optional.empty();
        private Optional<String> wakeup_channel = Optional.empty();
        private Optional<String> patchwall_version = Optional.empty();
        private Optional<Integer> operator = Optional.empty();
        private Optional<String> source = Optional.empty();
        private Optional<String> mode = Optional.empty();
        private Optional<TvUserMode> user_mode = Optional.empty();
        private Optional<Boolean> is_continuous_dialog = Optional.empty();
        private Optional<TvNetworkStatus> network_status = Optional.empty();

        public Optional<String> getAppId() {
            return this.app_id;
        }

        public Optional<String> getDeviceId() {
            return this.device_id;
        }

        public Optional<String> getMiaiVersion() {
            return this.miai_version;
        }

        public Optional<String> getMode() {
            return this.mode;
        }

        public Optional<TvNetworkStatus> getNetworkStatus() {
            return this.network_status;
        }

        public Optional<Integer> getOperator() {
            return this.operator;
        }

        public Optional<String> getPatchwallVersion() {
            return this.patchwall_version;
        }

        public Optional<String> getPlatformId() {
            return this.platform_id;
        }

        public Optional<String> getSource() {
            return this.source;
        }

        public Optional<String> getUid() {
            return this.uid;
        }

        public Optional<TvUserMode> getUserMode() {
            return this.user_mode;
        }

        public Optional<String> getWakeupChannel() {
            return this.wakeup_channel;
        }

        public Optional<String> getWakeupVersion() {
            return this.wakeup_version;
        }

        public Optional<Boolean> isContinuousDialog() {
            return this.is_continuous_dialog;
        }

        public TvEventContext setAppId(String str) {
            this.app_id = Optional.ofNullable(str);
            return this;
        }

        public TvEventContext setDeviceId(String str) {
            this.device_id = Optional.ofNullable(str);
            return this;
        }

        public TvEventContext setIsContinuousDialog(boolean z) {
            this.is_continuous_dialog = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public TvEventContext setMiaiVersion(String str) {
            this.miai_version = Optional.ofNullable(str);
            return this;
        }

        public TvEventContext setMode(String str) {
            this.mode = Optional.ofNullable(str);
            return this;
        }

        public TvEventContext setNetworkStatus(TvNetworkStatus tvNetworkStatus) {
            this.network_status = Optional.ofNullable(tvNetworkStatus);
            return this;
        }

        public TvEventContext setOperator(int i) {
            this.operator = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public TvEventContext setPatchwallVersion(String str) {
            this.patchwall_version = Optional.ofNullable(str);
            return this;
        }

        public TvEventContext setPlatformId(String str) {
            this.platform_id = Optional.ofNullable(str);
            return this;
        }

        public TvEventContext setSource(String str) {
            this.source = Optional.ofNullable(str);
            return this;
        }

        public TvEventContext setUid(String str) {
            this.uid = Optional.ofNullable(str);
            return this;
        }

        public TvEventContext setUserMode(TvUserMode tvUserMode) {
            this.user_mode = Optional.ofNullable(tvUserMode);
            return this;
        }

        public TvEventContext setWakeupChannel(String str) {
            this.wakeup_channel = Optional.ofNullable(str);
            return this;
        }

        public TvEventContext setWakeupVersion(String str) {
            this.wakeup_version = Optional.ofNullable(str);
            return this;
        }
    }

    public static class TvEventParams {

        @Required
        private TvEventContext event_context;

        @Required
        private String event_data_type;
        private Optional<TvExtendJson> extend_json = Optional.empty();

        @Required
        private long timestamp;

        @Required
        private String widget;

        public TvEventParams() {
        }

        public TvEventParams(String str, TvEventContext tvEventContext, String str2, long j) {
            this.widget = str;
            this.event_context = tvEventContext;
            this.event_data_type = str2;
            this.timestamp = j;
        }

        @Required
        public TvEventContext getEventContext() {
            return this.event_context;
        }

        @Required
        public String getEventDataType() {
            return this.event_data_type;
        }

        public Optional<TvExtendJson> getExtendJson() {
            return this.extend_json;
        }

        @Required
        public long getTimestamp() {
            return this.timestamp;
        }

        @Required
        public String getWidget() {
            return this.widget;
        }

        @Required
        public TvEventParams setEventContext(TvEventContext tvEventContext) {
            this.event_context = tvEventContext;
            return this;
        }

        @Required
        public TvEventParams setEventDataType(String str) {
            this.event_data_type = str;
            return this;
        }

        public TvEventParams setExtendJson(TvExtendJson tvExtendJson) {
            this.extend_json = Optional.ofNullable(tvExtendJson);
            return this;
        }

        @Required
        public TvEventParams setTimestamp(long j) {
            this.timestamp = j;
            return this;
        }

        @Required
        public TvEventParams setWidget(String str) {
            this.widget = str;
            return this;
        }
    }

    public enum TvEventType {
        EXPOSE(0),
        CLICK(1),
        FINISH(2),
        PLAY(3),
        FAVORITE(4),
        DURATION(5),
        EXIT(6),
        STATE(7),
        RESULT(8);

        private int id;

        TvEventType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum TvExitType {
        CLICK_RESULT(0),
        OVERTIME(1),
        EXIT(2);

        private int id;

        TvExitType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class TvExtendJson {
        private Optional<String> dialog_id = Optional.empty();
        private Optional<String> extend_type = Optional.empty();
        private Optional<Long> start_time = Optional.empty();
        private Optional<Boolean> is_interrupted = Optional.empty();
        private Optional<String> click_type = Optional.empty();
        private Optional<Integer> position = Optional.empty();
        private Optional<String> media_id = Optional.empty();
        private Optional<String> media_name = Optional.empty();
        private Optional<String> from_type = Optional.empty();
        private Optional<String> instruction_id = Optional.empty();
        private Optional<String> cp = Optional.empty();
        private Optional<String> audio_id = Optional.empty();
        private Optional<Boolean> is_accurate = Optional.empty();
        private Optional<String> eid = Optional.empty();
        private Optional<String> audio_type = Optional.empty();
        private Optional<String> resource_cp = Optional.empty();
        private Optional<String> resource_id = Optional.empty();
        private Optional<String> meta_id = Optional.empty();
        private Optional<String> grade = Optional.empty();
        private Optional<String> intention = Optional.empty();
        private Optional<Long> end_time = Optional.empty();
        private Optional<Long> duration = Optional.empty();
        private Optional<String> switch_type = Optional.empty();
        private Optional<String> mode = Optional.empty();
        private Optional<String> action_type = Optional.empty();
        private Optional<String> request_type = Optional.empty();
        private Optional<Integer> current_episode = Optional.empty();
        private Optional<Long> length = Optional.empty();
        private Optional<Double> played_ratio = Optional.empty();
        private Optional<String> event_id = Optional.empty();
        private Optional<String> tab_name = Optional.empty();
        private Optional<TvExitType> exit_type = Optional.empty();
        private Optional<TvButton> button = Optional.empty();
        private Optional<String> wakeup_channel = Optional.empty();
        private Optional<TvLanguageType> language_type = Optional.empty();
        private Optional<Boolean> mute_music_at_slient = Optional.empty();
        private Optional<Integer> screen_resolution = Optional.empty();
        private Optional<Integer> screen_luminance = Optional.empty();
        private Optional<String> app_name = Optional.empty();
        private Optional<String> app_page = Optional.empty();
        private Optional<String> query_source = Optional.empty();
        private Optional<List<String>> exposure_queries = Optional.empty();
        private Optional<TvGuidanceType> guidance_type = Optional.empty();
        private Optional<Integer> time_cost = Optional.empty();
        private Optional<Integer> max_wait_time = Optional.empty();
        private Optional<String> card_type = Optional.empty();
        private Optional<String> debug_info = Optional.empty();
        private Optional<Integer> query_version = Optional.empty();
        private Optional<String> origin_id = Optional.empty();
        private Optional<String> query_text = Optional.empty();
        private Optional<String> send_query = Optional.empty();
        private Optional<String> query_id = Optional.empty();
        private Optional<Boolean> is_mobile_app_advertise = Optional.empty();
        private Optional<String> domain = Optional.empty();
        private Optional<ObjectNode> log_extension = Optional.empty();
        private Optional<String> status = Optional.empty();
        private Optional<String> error_code = Optional.empty();
        private Optional<String> package_name = Optional.empty();
        private Optional<String> button_type = Optional.empty();
        private Optional<String> result_type = Optional.empty();
        private Optional<String> page_type = Optional.empty();
        private Optional<String> end_percent = Optional.empty();
        private Optional<String> start_percent = Optional.empty();
        private Optional<String> origin = Optional.empty();
        private Optional<String> target = Optional.empty();
        private Optional<String> content = Optional.empty();
        private Optional<String> from_page = Optional.empty();
        private Optional<String> title = Optional.empty();
        private Optional<Boolean> is_historic = Optional.empty();
        private Optional<String> pay_type = Optional.empty();
        private Optional<String> present_type = Optional.empty();
        private Optional<Long> ad_time = Optional.empty();

        public Optional<String> getActionType() {
            return this.action_type;
        }

        public Optional<Long> getAdTime() {
            return this.ad_time;
        }

        public Optional<String> getAppName() {
            return this.app_name;
        }

        public Optional<String> getAppPage() {
            return this.app_page;
        }

        public Optional<String> getAudioId() {
            return this.audio_id;
        }

        public Optional<String> getAudioType() {
            return this.audio_type;
        }

        public Optional<TvButton> getButton() {
            return this.button;
        }

        public Optional<String> getButtonType() {
            return this.button_type;
        }

        public Optional<String> getCardType() {
            return this.card_type;
        }

        public Optional<String> getClickType() {
            return this.click_type;
        }

        public Optional<String> getContent() {
            return this.content;
        }

        public Optional<String> getCp() {
            return this.cp;
        }

        public Optional<Integer> getCurrentEpisode() {
            return this.current_episode;
        }

        public Optional<String> getDebugInfo() {
            return this.debug_info;
        }

        public Optional<String> getDialogId() {
            return this.dialog_id;
        }

        public Optional<String> getDomain() {
            return this.domain;
        }

        public Optional<Long> getDuration() {
            return this.duration;
        }

        public Optional<String> getEid() {
            return this.eid;
        }

        public Optional<String> getEndPercent() {
            return this.end_percent;
        }

        public Optional<Long> getEndTime() {
            return this.end_time;
        }

        public Optional<String> getErrorCode() {
            return this.error_code;
        }

        public Optional<String> getEventId() {
            return this.event_id;
        }

        public Optional<TvExitType> getExitType() {
            return this.exit_type;
        }

        public Optional<List<String>> getExposureQueries() {
            return this.exposure_queries;
        }

        public Optional<String> getExtendType() {
            return this.extend_type;
        }

        public Optional<String> getFromPage() {
            return this.from_page;
        }

        public Optional<String> getFromType() {
            return this.from_type;
        }

        public Optional<String> getGrade() {
            return this.grade;
        }

        public Optional<TvGuidanceType> getGuidanceType() {
            return this.guidance_type;
        }

        public Optional<String> getInstructionId() {
            return this.instruction_id;
        }

        public Optional<String> getIntention() {
            return this.intention;
        }

        public Optional<TvLanguageType> getLanguageType() {
            return this.language_type;
        }

        public Optional<Long> getLength() {
            return this.length;
        }

        public Optional<ObjectNode> getLogExtension() {
            return this.log_extension;
        }

        public Optional<Integer> getMaxWaitTime() {
            return this.max_wait_time;
        }

        public Optional<String> getMediaId() {
            return this.media_id;
        }

        public Optional<String> getMediaName() {
            return this.media_name;
        }

        public Optional<String> getMetaId() {
            return this.meta_id;
        }

        public Optional<String> getMode() {
            return this.mode;
        }

        public Optional<String> getOrigin() {
            return this.origin;
        }

        public Optional<String> getOriginId() {
            return this.origin_id;
        }

        public Optional<String> getPackageName() {
            return this.package_name;
        }

        public Optional<String> getPageType() {
            return this.page_type;
        }

        public Optional<String> getPayType() {
            return this.pay_type;
        }

        public Optional<Double> getPlayedRatio() {
            return this.played_ratio;
        }

        public Optional<Integer> getPosition() {
            return this.position;
        }

        public Optional<String> getPresentType() {
            return this.present_type;
        }

        public Optional<String> getQueryId() {
            return this.query_id;
        }

        public Optional<String> getQuerySource() {
            return this.query_source;
        }

        public Optional<String> getQueryText() {
            return this.query_text;
        }

        public Optional<Integer> getQueryVersion() {
            return this.query_version;
        }

        public Optional<String> getRequestType() {
            return this.request_type;
        }

        public Optional<String> getResourceCp() {
            return this.resource_cp;
        }

        public Optional<String> getResourceId() {
            return this.resource_id;
        }

        public Optional<String> getResultType() {
            return this.result_type;
        }

        public Optional<Integer> getScreenLuminance() {
            return this.screen_luminance;
        }

        public Optional<Integer> getScreenResolution() {
            return this.screen_resolution;
        }

        public Optional<String> getSendQuery() {
            return this.send_query;
        }

        public Optional<String> getStartPercent() {
            return this.start_percent;
        }

        public Optional<Long> getStartTime() {
            return this.start_time;
        }

        public Optional<String> getStatus() {
            return this.status;
        }

        public Optional<String> getSwitchType() {
            return this.switch_type;
        }

        public Optional<String> getTabName() {
            return this.tab_name;
        }

        public Optional<String> getTarget() {
            return this.target;
        }

        public Optional<Integer> getTimeCost() {
            return this.time_cost;
        }

        public Optional<String> getTitle() {
            return this.title;
        }

        public Optional<String> getWakeupChannel() {
            return this.wakeup_channel;
        }

        public Optional<Boolean> isAccurate() {
            return this.is_accurate;
        }

        public Optional<Boolean> isHistoric() {
            return this.is_historic;
        }

        public Optional<Boolean> isInterrupted() {
            return this.is_interrupted;
        }

        public Optional<Boolean> isMobileAppAdvertise() {
            return this.is_mobile_app_advertise;
        }

        public Optional<Boolean> isMuteMusicAtSlient() {
            return this.mute_music_at_slient;
        }

        public TvExtendJson setActionType(String str) {
            this.action_type = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setAdTime(long j) {
            this.ad_time = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public TvExtendJson setAppName(String str) {
            this.app_name = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setAppPage(String str) {
            this.app_page = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setAudioId(String str) {
            this.audio_id = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setAudioType(String str) {
            this.audio_type = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setButton(TvButton tvButton) {
            this.button = Optional.ofNullable(tvButton);
            return this;
        }

        public TvExtendJson setButtonType(String str) {
            this.button_type = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setCardType(String str) {
            this.card_type = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setClickType(String str) {
            this.click_type = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setContent(String str) {
            this.content = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setCp(String str) {
            this.cp = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setCurrentEpisode(int i) {
            this.current_episode = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public TvExtendJson setDebugInfo(String str) {
            this.debug_info = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setDialogId(String str) {
            this.dialog_id = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setDomain(String str) {
            this.domain = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setDuration(long j) {
            this.duration = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public TvExtendJson setEid(String str) {
            this.eid = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setEndPercent(String str) {
            this.end_percent = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setEndTime(long j) {
            this.end_time = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public TvExtendJson setErrorCode(String str) {
            this.error_code = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setEventId(String str) {
            this.event_id = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setExitType(TvExitType tvExitType) {
            this.exit_type = Optional.ofNullable(tvExitType);
            return this;
        }

        public TvExtendJson setExposureQueries(List<String> list) {
            this.exposure_queries = Optional.ofNullable(list);
            return this;
        }

        public TvExtendJson setExtendType(String str) {
            this.extend_type = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setFromPage(String str) {
            this.from_page = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setFromType(String str) {
            this.from_type = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setGrade(String str) {
            this.grade = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setGuidanceType(TvGuidanceType tvGuidanceType) {
            this.guidance_type = Optional.ofNullable(tvGuidanceType);
            return this;
        }

        public TvExtendJson setInstructionId(String str) {
            this.instruction_id = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setIntention(String str) {
            this.intention = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setIsAccurate(boolean z) {
            this.is_accurate = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public TvExtendJson setIsHistoric(boolean z) {
            this.is_historic = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public TvExtendJson setIsInterrupted(boolean z) {
            this.is_interrupted = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public TvExtendJson setIsMobileAppAdvertise(boolean z) {
            this.is_mobile_app_advertise = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public TvExtendJson setLanguageType(TvLanguageType tvLanguageType) {
            this.language_type = Optional.ofNullable(tvLanguageType);
            return this;
        }

        public TvExtendJson setLength(long j) {
            this.length = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public TvExtendJson setLogExtension(ObjectNode objectNode) {
            this.log_extension = Optional.ofNullable(objectNode);
            return this;
        }

        public TvExtendJson setMaxWaitTime(int i) {
            this.max_wait_time = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public TvExtendJson setMediaId(String str) {
            this.media_id = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setMediaName(String str) {
            this.media_name = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setMetaId(String str) {
            this.meta_id = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setMode(String str) {
            this.mode = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setMuteMusicAtSlient(boolean z) {
            this.mute_music_at_slient = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public TvExtendJson setOrigin(String str) {
            this.origin = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setOriginId(String str) {
            this.origin_id = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setPackageName(String str) {
            this.package_name = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setPageType(String str) {
            this.page_type = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setPayType(String str) {
            this.pay_type = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setPlayedRatio(double d) {
            this.played_ratio = Optional.ofNullable(Double.valueOf(d));
            return this;
        }

        public TvExtendJson setPosition(int i) {
            this.position = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public TvExtendJson setPresentType(String str) {
            this.present_type = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setQueryId(String str) {
            this.query_id = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setQuerySource(String str) {
            this.query_source = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setQueryText(String str) {
            this.query_text = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setQueryVersion(int i) {
            this.query_version = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public TvExtendJson setRequestType(String str) {
            this.request_type = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setResourceCp(String str) {
            this.resource_cp = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setResourceId(String str) {
            this.resource_id = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setResultType(String str) {
            this.result_type = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setScreenLuminance(int i) {
            this.screen_luminance = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public TvExtendJson setScreenResolution(int i) {
            this.screen_resolution = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public TvExtendJson setSendQuery(String str) {
            this.send_query = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setStartPercent(String str) {
            this.start_percent = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setStartTime(long j) {
            this.start_time = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public TvExtendJson setStatus(String str) {
            this.status = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setSwitchType(String str) {
            this.switch_type = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setTabName(String str) {
            this.tab_name = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setTarget(String str) {
            this.target = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setTimeCost(int i) {
            this.time_cost = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public TvExtendJson setTitle(String str) {
            this.title = Optional.ofNullable(str);
            return this;
        }

        public TvExtendJson setWakeupChannel(String str) {
            this.wakeup_channel = Optional.ofNullable(str);
            return this;
        }
    }

    public enum TvGuidanceType {
        CONTEXT(0),
        GUIDANCE(1);

        private int id;

        TvGuidanceType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum TvLanguageType {
        ZH_CN(0),
        ZH_TW(1),
        EN_US(2);

        private int id;

        TvLanguageType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum TvNetworkStatus {
        WIFI(0),
        NONE(1),
        ETHERNET(2);

        private int id;

        TvNetworkStatus(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class TvTrackLog {

        @Required
        private TvEventParams event_params;

        @Required
        private TvEventType event_type;

        public TvTrackLog() {
        }

        public TvTrackLog(TvEventType tvEventType, TvEventParams tvEventParams) {
            this.event_type = tvEventType;
            this.event_params = tvEventParams;
        }

        @Required
        public TvEventParams getEventParams() {
            return this.event_params;
        }

        @Required
        public TvEventType getEventType() {
            return this.event_type;
        }

        @Required
        public TvTrackLog setEventParams(TvEventParams tvEventParams) {
            this.event_params = tvEventParams;
            return this;
        }

        @Required
        public TvTrackLog setEventType(TvEventType tvEventType) {
            this.event_type = tvEventType;
            return this;
        }
    }

    public enum TvUserMode {
        NORMAL(0),
        KID(1);

        private int id;

        TvUserMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class VaEventContext {

        @Required
        private String app_id;

        @Required
        private String device_id;
        private Optional<String> bt_device_mac_address = Optional.empty();
        private Optional<String> bt_device_name = Optional.empty();
        private Optional<String> uid = Optional.empty();
        private Optional<String> network_status = Optional.empty();
        private Optional<String> rom_version = Optional.empty();
        private Optional<String> device_model = Optional.empty();
        private Optional<String> miai_version = Optional.empty();
        private Optional<String> build_versioncode = Optional.empty();
        private Optional<Boolean> channel_rom_version = Optional.empty();
        private Optional<String> device_model_codename = Optional.empty();
        private Optional<String> android_version = Optional.empty();
        private Optional<String> android_sdk_version = Optional.empty();
        private Optional<String> upgrade_channel = Optional.empty();
        private Optional<String> oaid = Optional.empty();
        private Optional<Boolean> is_lock_screen = Optional.empty();
        private Optional<Integer> silent_mode = Optional.empty();
        private Optional<Boolean> mute_music_at_slient = Optional.empty();
        private Optional<Boolean> mute_voiceassist_at_slient = Optional.empty();
        private Optional<Integer> electric_quantity = Optional.empty();
        private Optional<Integer> screen_resolution = Optional.empty();
        private Optional<Integer> screen_luminance = Optional.empty();
        private Optional<String> language_type = Optional.empty();
        private Optional<String> network_company = Optional.empty();
        private Optional<String> wakeup_id = Optional.empty();

        public VaEventContext() {
        }

        public VaEventContext(String str, String str2) {
            this.device_id = str;
            this.app_id = str2;
        }

        public Optional<String> getAndroidSdkVersion() {
            return this.android_sdk_version;
        }

        public Optional<String> getAndroidVersion() {
            return this.android_version;
        }

        @Required
        public String getAppId() {
            return this.app_id;
        }

        public Optional<String> getBtDeviceMacAddress() {
            return this.bt_device_mac_address;
        }

        public Optional<String> getBtDeviceName() {
            return this.bt_device_name;
        }

        public Optional<String> getBuildVersioncode() {
            return this.build_versioncode;
        }

        @Required
        public String getDeviceId() {
            return this.device_id;
        }

        public Optional<String> getDeviceModel() {
            return this.device_model;
        }

        public Optional<String> getDeviceModelCodename() {
            return this.device_model_codename;
        }

        public Optional<Integer> getElectricQuantity() {
            return this.electric_quantity;
        }

        public Optional<String> getLanguageType() {
            return this.language_type;
        }

        public Optional<String> getMiaiVersion() {
            return this.miai_version;
        }

        public Optional<String> getNetworkCompany() {
            return this.network_company;
        }

        public Optional<String> getNetworkStatus() {
            return this.network_status;
        }

        public Optional<String> getOaid() {
            return this.oaid;
        }

        public Optional<String> getRomVersion() {
            return this.rom_version;
        }

        public Optional<Integer> getScreenLuminance() {
            return this.screen_luminance;
        }

        public Optional<Integer> getScreenResolution() {
            return this.screen_resolution;
        }

        public Optional<Integer> getSilentMode() {
            return this.silent_mode;
        }

        public Optional<String> getUid() {
            return this.uid;
        }

        public Optional<String> getUpgradeChannel() {
            return this.upgrade_channel;
        }

        public Optional<String> getWakeupId() {
            return this.wakeup_id;
        }

        public Optional<Boolean> isChannelRomVersion() {
            return this.channel_rom_version;
        }

        public Optional<Boolean> isLockScreen() {
            return this.is_lock_screen;
        }

        public Optional<Boolean> isMuteMusicAtSlient() {
            return this.mute_music_at_slient;
        }

        public Optional<Boolean> isMuteVoiceassistAtSlient() {
            return this.mute_voiceassist_at_slient;
        }

        public VaEventContext setAndroidSdkVersion(String str) {
            this.android_sdk_version = Optional.ofNullable(str);
            return this;
        }

        public VaEventContext setAndroidVersion(String str) {
            this.android_version = Optional.ofNullable(str);
            return this;
        }

        @Required
        public VaEventContext setAppId(String str) {
            this.app_id = str;
            return this;
        }

        public VaEventContext setBtDeviceMacAddress(String str) {
            this.bt_device_mac_address = Optional.ofNullable(str);
            return this;
        }

        public VaEventContext setBtDeviceName(String str) {
            this.bt_device_name = Optional.ofNullable(str);
            return this;
        }

        public VaEventContext setBuildVersioncode(String str) {
            this.build_versioncode = Optional.ofNullable(str);
            return this;
        }

        public VaEventContext setChannelRomVersion(boolean z) {
            this.channel_rom_version = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        @Required
        public VaEventContext setDeviceId(String str) {
            this.device_id = str;
            return this;
        }

        public VaEventContext setDeviceModel(String str) {
            this.device_model = Optional.ofNullable(str);
            return this;
        }

        public VaEventContext setDeviceModelCodename(String str) {
            this.device_model_codename = Optional.ofNullable(str);
            return this;
        }

        public VaEventContext setElectricQuantity(int i) {
            this.electric_quantity = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VaEventContext setIsLockScreen(boolean z) {
            this.is_lock_screen = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaEventContext setLanguageType(String str) {
            this.language_type = Optional.ofNullable(str);
            return this;
        }

        public VaEventContext setMiaiVersion(String str) {
            this.miai_version = Optional.ofNullable(str);
            return this;
        }

        public VaEventContext setMuteMusicAtSlient(boolean z) {
            this.mute_music_at_slient = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaEventContext setMuteVoiceassistAtSlient(boolean z) {
            this.mute_voiceassist_at_slient = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaEventContext setNetworkCompany(String str) {
            this.network_company = Optional.ofNullable(str);
            return this;
        }

        public VaEventContext setNetworkStatus(String str) {
            this.network_status = Optional.ofNullable(str);
            return this;
        }

        public VaEventContext setOaid(String str) {
            this.oaid = Optional.ofNullable(str);
            return this;
        }

        public VaEventContext setRomVersion(String str) {
            this.rom_version = Optional.ofNullable(str);
            return this;
        }

        public VaEventContext setScreenLuminance(int i) {
            this.screen_luminance = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VaEventContext setScreenResolution(int i) {
            this.screen_resolution = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VaEventContext setSilentMode(int i) {
            this.silent_mode = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VaEventContext setUid(String str) {
            this.uid = Optional.ofNullable(str);
            return this;
        }

        public VaEventContext setUpgradeChannel(String str) {
            this.upgrade_channel = Optional.ofNullable(str);
            return this;
        }

        public VaEventContext setWakeupId(String str) {
            this.wakeup_id = Optional.ofNullable(str);
            return this;
        }
    }

    public static class VaEventParams {

        @Required
        private VaEventContext event_context;

        @Required
        private String event_data_type;
        private Optional<ObjectNode> extend_json = Optional.empty();
        private Optional<VaExtendJson> extend_json_v3 = Optional.empty();

        @Required
        private long timestamp;

        @Required
        private String widget;

        public VaEventParams() {
        }

        public VaEventParams(String str, String str2, long j, VaEventContext vaEventContext) {
            this.widget = str;
            this.event_data_type = str2;
            this.timestamp = j;
            this.event_context = vaEventContext;
        }

        @Required
        public VaEventContext getEventContext() {
            return this.event_context;
        }

        @Required
        public String getEventDataType() {
            return this.event_data_type;
        }

        public Optional<ObjectNode> getExtendJson() {
            return this.extend_json;
        }

        public Optional<VaExtendJson> getExtendJsonV3() {
            return this.extend_json_v3;
        }

        @Required
        public long getTimestamp() {
            return this.timestamp;
        }

        @Required
        public String getWidget() {
            return this.widget;
        }

        @Required
        public VaEventParams setEventContext(VaEventContext vaEventContext) {
            this.event_context = vaEventContext;
            return this;
        }

        @Required
        public VaEventParams setEventDataType(String str) {
            this.event_data_type = str;
            return this;
        }

        public VaEventParams setExtendJson(ObjectNode objectNode) {
            this.extend_json = Optional.ofNullable(objectNode);
            return this;
        }

        public VaEventParams setExtendJsonV3(VaExtendJson vaExtendJson) {
            this.extend_json_v3 = Optional.ofNullable(vaExtendJson);
            return this;
        }

        @Required
        public VaEventParams setTimestamp(long j) {
            this.timestamp = j;
            return this;
        }

        @Required
        public VaEventParams setWidget(String str) {
            this.widget = str;
            return this;
        }
    }

    public enum VaEventType {
        EXPOSE(0),
        CLICK(1),
        ADD(2),
        EXECUTE(3),
        DELETE(4),
        EXIT(5),
        PLAY(6),
        PAUSE(7),
        DURATION(8),
        STATE(9),
        AWAKE(10),
        RESULT(11),
        REFRESH(12),
        CANCEL(13),
        RECOGNIZE(14),
        RESPONSE(15),
        FINISH(16),
        BACKGROUND(17),
        SPEAK(18),
        FAVOR(19),
        OPEN_MIC(20),
        ENTER(21),
        START(22),
        LAUNCH(23),
        SLIDE(24),
        SCAN(25),
        CONNECT(26),
        DISCONNECT(27);

        private int id;

        VaEventType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class VaExtendJson {
        private Optional<String> from = Optional.empty();
        private Optional<String> content = Optional.empty();
        private Optional<Integer> status = Optional.empty();
        private Optional<Integer> page_num = Optional.empty();
        private Optional<Integer> position = Optional.empty();
        private Optional<String> extend_type = Optional.empty();
        private Optional<String> card_id = Optional.empty();
        private Optional<String> source_type = Optional.empty();
        private Optional<Boolean> is_lock_screen = Optional.empty();
        private Optional<Boolean> is_long_click = Optional.empty();
        private Optional<String> landing_page = Optional.empty();
        private Optional<String> template_name = Optional.empty();
        private Optional<String> dialog_id = Optional.empty();
        private Optional<String> instruction_id = Optional.empty();
        private Optional<String> cp = Optional.empty();
        private Optional<String> resource_id = Optional.empty();
        private Optional<String> meta_id = Optional.empty();
        private Optional<String> eid = Optional.empty();
        private Optional<String> query = Optional.empty();
        private Optional<String> home_expose_list = Optional.empty();
        private Optional<Integer> item_position = Optional.empty();
        private Optional<Long> length = Optional.empty();
        private Optional<Integer> response_code = Optional.empty();
        private Optional<String> param_query_edit_origin = Optional.empty();
        private Optional<String> param_query_edit_done = Optional.empty();
        private Optional<String> request_id = Optional.empty();
        private Optional<String> query_origin = Optional.empty();
        private Optional<String> package_name = Optional.empty();
        private Optional<String> result_type = Optional.empty();
        private Optional<Boolean> is_used = Optional.empty();
        private Optional<Integer> index = Optional.empty();
        private Optional<Boolean> is_last = Optional.empty();
        private Optional<String> session_id = Optional.empty();
        private Optional<Boolean> is_empty = Optional.empty();
        private Optional<Long> time = Optional.empty();
        private Optional<String> flag = Optional.empty();
        private Optional<Integer> is_requesting = Optional.empty();
        private Optional<Boolean> is_aec_mode = Optional.empty();
        private Optional<Boolean> is_full_duplex = Optional.empty();
        private Optional<Boolean> is_answer = Optional.empty();
        private Optional<Boolean> is_interrupted = Optional.empty();
        private Optional<String> query_text = Optional.empty();
        private Optional<String> query_id = Optional.empty();
        private Optional<String> debug_info = Optional.empty();
        private Optional<String> app_name = Optional.empty();
        private Optional<String> slide_type = Optional.empty();
        private Optional<String> network_company = Optional.empty();
        private Optional<String> result_list = Optional.empty();
        private Optional<Integer> cp_position = Optional.empty();
        private Optional<String> instruction_name = Optional.empty();
        private Optional<Long> create_time = Optional.empty();
        private Optional<String> message = Optional.empty();
        private Optional<Boolean> is_dialing = Optional.empty();
        private Optional<Boolean> is_2g = Optional.empty();
        private Optional<String> key_phrase = Optional.empty();
        private Optional<String> voicetrigger_version_name = Optional.empty();
        private Optional<String> voicetrigger_version_code = Optional.empty();
        private Optional<Integer> voiceprint_switch_status = Optional.empty();
        private Optional<String> voicetrigger_switch_status = Optional.empty();
        private Optional<String> sensitivity = Optional.empty();
        private Optional<String> browser_versioncode = Optional.empty();
        private Optional<Boolean> is_device_supported = Optional.empty();
        private Optional<Integer> electric_quantity = Optional.empty();
        private Optional<Integer> screen_resolution = Optional.empty();
        private Optional<Integer> screen_luminance = Optional.empty();
        private Optional<String> language_type = Optional.empty();
        private Optional<String> activity_id = Optional.empty();
        private Optional<String> sec_status = Optional.empty();
        private Optional<Integer> is_popup_option = Optional.empty();
        private Optional<Integer> silent_mode = Optional.empty();
        private Optional<Boolean> mute_music_at_slient = Optional.empty();
        private Optional<Boolean> mute_voiceassist_at_slient = Optional.empty();
        private Optional<Boolean> is_headline = Optional.empty();
        private Optional<String> origin_id = Optional.empty();
        private Optional<String> card_type = Optional.empty();
        private Optional<String> optional_info = Optional.empty();
        private Optional<Boolean> is_2m = Optional.empty();
        private Optional<Boolean> is_highlight = Optional.empty();
        private Optional<String> android_component_name = Optional.empty();
        private Optional<String> url = Optional.empty();
        private Optional<Boolean> is_vertical = Optional.empty();
        private Optional<Integer> num = Optional.empty();
        private Optional<Long> create_done_time = Optional.empty();
        private Optional<Long> process_start_time = Optional.empty();
        private Optional<Long> process_end_time = Optional.empty();
        private Optional<String> result = Optional.empty();
        private Optional<String> operation_state = Optional.empty();
        private Optional<String> final_execute_node_name = Optional.empty();
        private Optional<Boolean> auto_mic = Optional.empty();
        private Optional<String> group_id = Optional.empty();
        private Optional<String> rpk_packagename = Optional.empty();
        private Optional<String> rpk_version_code = Optional.empty();
        private Optional<String> rpk_version_name = Optional.empty();
        private Optional<String> share_content = Optional.empty();
        private Optional<Integer> is_selected_all = Optional.empty();
        private Optional<String> local_info = Optional.empty();
        private Optional<String> online_info = Optional.empty();
        private Optional<String> artist = Optional.empty();
        private Optional<String> song = Optional.empty();
        private Optional<String> album = Optional.empty();
        private Optional<Boolean> is_fav = Optional.empty();
        private Optional<Integer> status_code = Optional.empty();
        private Optional<Integer> responsecode = Optional.empty();
        private Optional<String> expection = Optional.empty();
        private Optional<Boolean> is_calling = Optional.empty();
        private Optional<String> name = Optional.empty();
        private Optional<Integer> list_position = Optional.empty();
        private Optional<String> new_list = Optional.empty();
        private Optional<String> old_list = Optional.empty();
        private Optional<String> page_url = Optional.empty();
        private Optional<Integer> page_id = Optional.empty();
        private Optional<Integer> element_id = Optional.empty();
        private Optional<String> model_name = Optional.empty();
        private Optional<String> key_value = Optional.empty();
        private Optional<Boolean> is_click_to_score = Optional.empty();
        private Optional<String> button = Optional.empty();
        private Optional<String> file_name = Optional.empty();
        private Optional<Integer> file_version = Optional.empty();
        private Optional<String> relation = Optional.empty();
        private Optional<String> entity_id = Optional.empty();
        private Optional<String> cp_id = Optional.empty();
        private Optional<Integer> play_music_error_code = Optional.empty();
        private Optional<String> scan_mode = Optional.empty();
        private Optional<String> scan_id = Optional.empty();
        private Optional<String> vidpid = Optional.empty();
        private Optional<String> mac_address = Optional.empty();
        private Optional<String> bt_device_version = Optional.empty();
        private Optional<String> connect_mode = Optional.empty();
        private Optional<String> appauto_connect_subtype = Optional.empty();
        private Optional<String> connect_id = Optional.empty();
        private Optional<Integer> is_mandatory_upgrade = Optional.empty();
        private Optional<String> click_type = Optional.empty();
        private Optional<String> content_type = Optional.empty();
        private Optional<String> user_defined_dialog_id = Optional.empty();
        private Optional<String> query_from = Optional.empty();
        private Optional<Double> offline_asr_score = Optional.empty();
        private Optional<String> domain = Optional.empty();
        private Optional<String> intention = Optional.empty();
        private Optional<String> page_name = Optional.empty();
        private Optional<String> event_id = Optional.empty();
        private Optional<String> trace_id = Optional.empty();
        private Optional<Boolean> is_appear_ad = Optional.empty();
        private Optional<String> send_query = Optional.empty();
        private Optional<Boolean> is_appear_gross_blowhole = Optional.empty();
        private Optional<String> page_type = Optional.empty();
        private Optional<String> msg_id = Optional.empty();
        private Optional<Double> percentage = Optional.empty();
        private Optional<String> old_version = Optional.empty();
        private Optional<String> new_version = Optional.empty();
        private Optional<String> query_source = Optional.empty();
        private Optional<Boolean> is_mobile_app_advertise = Optional.empty();
        private Optional<String> origin = Optional.empty();
        private Optional<String> target = Optional.empty();
        private Optional<Boolean> is_l2_wakeup_model_pass = Optional.empty();
        private Optional<Boolean> is_l2_voiceprint_model_pass = Optional.empty();
        private Optional<String> scheme = Optional.empty();
        private Optional<String> screen_status = Optional.empty();
        private Optional<String> l2_wakeup_model_version = Optional.empty();
        private Optional<String> l2_wakeup_engine_version = Optional.empty();
        private Optional<String> audio_md5 = Optional.empty();
        private Optional<Boolean> is_exist = Optional.empty();
        private Optional<String> l2_voiceprint_model_version = Optional.empty();
        private Optional<String> l2_voiceprint_engine_version = Optional.empty();
        private Optional<Double> l2_wakeup_score = Optional.empty();
        private Optional<Double> l2_voiceprint_score = Optional.empty();
        private Optional<Double> l1_wakeup_score = Optional.empty();
        private Optional<Double> l1_voiceprint_score = Optional.empty();
        private Optional<Long> start_time = Optional.empty();
        private Optional<Long> end_time = Optional.empty();
        private Optional<Long> l2_wakeup_start = Optional.empty();
        private Optional<Long> l2_wakeup_end = Optional.empty();
        private Optional<Long> l2_voiceprint_start = Optional.empty();
        private Optional<Long> l2_voiceprint_end = Optional.empty();
        private Optional<Long> l2_wakeup_result_start = Optional.empty();
        private Optional<Long> l2_wakeup_result_end = Optional.empty();
        private Optional<Long> l1_wakeup_time = Optional.empty();
        private Optional<Long> l2_wakeup_time = Optional.empty();
        private Optional<Long> l2_wakeup_audio_length = Optional.empty();
        private Optional<String> vendor_version = Optional.empty();
        private Optional<Double> score = Optional.empty();
        private Optional<Double> miai_volume = Optional.empty();
        private Optional<Double> media_volume = Optional.empty();
        private Optional<Double> phone_volume = Optional.empty();
        private Optional<Boolean> is_mute_phone_volume = Optional.empty();
        private Optional<Boolean> is_mute = Optional.empty();
        private Optional<Boolean> is_not_disturb = Optional.empty();
        private Optional<Boolean> is_have_media_play = Optional.empty();
        private Optional<Boolean> is_connect = Optional.empty();

        public Optional<String> getActivityId() {
            return this.activity_id;
        }

        public Optional<String> getAlbum() {
            return this.album;
        }

        public Optional<String> getAndroidComponentName() {
            return this.android_component_name;
        }

        public Optional<String> getAppName() {
            return this.app_name;
        }

        public Optional<String> getAppautoConnectSubtype() {
            return this.appauto_connect_subtype;
        }

        public Optional<String> getArtist() {
            return this.artist;
        }

        public Optional<String> getAudioMd5() {
            return this.audio_md5;
        }

        public Optional<String> getBrowserVersioncode() {
            return this.browser_versioncode;
        }

        public Optional<String> getBtDeviceVersion() {
            return this.bt_device_version;
        }

        public Optional<String> getButton() {
            return this.button;
        }

        public Optional<String> getCardId() {
            return this.card_id;
        }

        public Optional<String> getCardType() {
            return this.card_type;
        }

        public Optional<String> getClickType() {
            return this.click_type;
        }

        public Optional<String> getConnectId() {
            return this.connect_id;
        }

        public Optional<String> getConnectMode() {
            return this.connect_mode;
        }

        public Optional<String> getContent() {
            return this.content;
        }

        public Optional<String> getContentType() {
            return this.content_type;
        }

        public Optional<String> getCp() {
            return this.cp;
        }

        public Optional<String> getCpId() {
            return this.cp_id;
        }

        public Optional<Integer> getCpPosition() {
            return this.cp_position;
        }

        public Optional<Long> getCreateDoneTime() {
            return this.create_done_time;
        }

        public Optional<Long> getCreateTime() {
            return this.create_time;
        }

        public Optional<String> getDebugInfo() {
            return this.debug_info;
        }

        public Optional<String> getDialogId() {
            return this.dialog_id;
        }

        public Optional<String> getDomain() {
            return this.domain;
        }

        public Optional<String> getEid() {
            return this.eid;
        }

        public Optional<Integer> getElectricQuantity() {
            return this.electric_quantity;
        }

        public Optional<Integer> getElementId() {
            return this.element_id;
        }

        public Optional<Long> getEndTime() {
            return this.end_time;
        }

        public Optional<String> getEntityId() {
            return this.entity_id;
        }

        public Optional<String> getEventId() {
            return this.event_id;
        }

        public Optional<String> getExpection() {
            return this.expection;
        }

        public Optional<String> getExtendType() {
            return this.extend_type;
        }

        public Optional<String> getFileName() {
            return this.file_name;
        }

        public Optional<Integer> getFileVersion() {
            return this.file_version;
        }

        public Optional<String> getFinalExecuteNodeName() {
            return this.final_execute_node_name;
        }

        public Optional<String> getFlag() {
            return this.flag;
        }

        public Optional<String> getFrom() {
            return this.from;
        }

        public Optional<String> getGroupId() {
            return this.group_id;
        }

        public Optional<String> getHomeExposeList() {
            return this.home_expose_list;
        }

        public Optional<Integer> getIndex() {
            return this.index;
        }

        public Optional<String> getInstructionId() {
            return this.instruction_id;
        }

        public Optional<String> getInstructionName() {
            return this.instruction_name;
        }

        public Optional<String> getIntention() {
            return this.intention;
        }

        public Optional<Integer> getIsMandatoryUpgrade() {
            return this.is_mandatory_upgrade;
        }

        public Optional<Integer> getIsPopupOption() {
            return this.is_popup_option;
        }

        public Optional<Integer> getIsRequesting() {
            return this.is_requesting;
        }

        public Optional<Integer> getIsSelectedAll() {
            return this.is_selected_all;
        }

        public Optional<Integer> getItemPosition() {
            return this.item_position;
        }

        public Optional<String> getKeyPhrase() {
            return this.key_phrase;
        }

        public Optional<String> getKeyValue() {
            return this.key_value;
        }

        public Optional<Double> getL1VoiceprintScore() {
            return this.l1_voiceprint_score;
        }

        public Optional<Double> getL1WakeupScore() {
            return this.l1_wakeup_score;
        }

        public Optional<Long> getL1WakeupTime() {
            return this.l1_wakeup_time;
        }

        public Optional<Long> getL2VoiceprintEnd() {
            return this.l2_voiceprint_end;
        }

        public Optional<String> getL2VoiceprintEngineVersion() {
            return this.l2_voiceprint_engine_version;
        }

        public Optional<String> getL2VoiceprintModelVersion() {
            return this.l2_voiceprint_model_version;
        }

        public Optional<Double> getL2VoiceprintScore() {
            return this.l2_voiceprint_score;
        }

        public Optional<Long> getL2VoiceprintStart() {
            return this.l2_voiceprint_start;
        }

        public Optional<Long> getL2WakeupAudioLength() {
            return this.l2_wakeup_audio_length;
        }

        public Optional<Long> getL2WakeupEnd() {
            return this.l2_wakeup_end;
        }

        public Optional<String> getL2WakeupEngineVersion() {
            return this.l2_wakeup_engine_version;
        }

        public Optional<String> getL2WakeupModelVersion() {
            return this.l2_wakeup_model_version;
        }

        public Optional<Long> getL2WakeupResultEnd() {
            return this.l2_wakeup_result_end;
        }

        public Optional<Long> getL2WakeupResultStart() {
            return this.l2_wakeup_result_start;
        }

        public Optional<Double> getL2WakeupScore() {
            return this.l2_wakeup_score;
        }

        public Optional<Long> getL2WakeupStart() {
            return this.l2_wakeup_start;
        }

        public Optional<Long> getL2WakeupTime() {
            return this.l2_wakeup_time;
        }

        public Optional<String> getLandingPage() {
            return this.landing_page;
        }

        public Optional<String> getLanguageType() {
            return this.language_type;
        }

        public Optional<Long> getLength() {
            return this.length;
        }

        public Optional<Integer> getListPosition() {
            return this.list_position;
        }

        public Optional<String> getLocalInfo() {
            return this.local_info;
        }

        public Optional<String> getMacAddress() {
            return this.mac_address;
        }

        public Optional<Double> getMediaVolume() {
            return this.media_volume;
        }

        public Optional<String> getMessage() {
            return this.message;
        }

        public Optional<String> getMetaId() {
            return this.meta_id;
        }

        public Optional<Double> getMiaiVolume() {
            return this.miai_volume;
        }

        public Optional<String> getModelName() {
            return this.model_name;
        }

        public Optional<String> getMsgId() {
            return this.msg_id;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<String> getNetworkCompany() {
            return this.network_company;
        }

        public Optional<String> getNewList() {
            return this.new_list;
        }

        public Optional<String> getNewVersion() {
            return this.new_version;
        }

        public Optional<Integer> getNum() {
            return this.num;
        }

        public Optional<Double> getOfflineAsrScore() {
            return this.offline_asr_score;
        }

        public Optional<String> getOldList() {
            return this.old_list;
        }

        public Optional<String> getOldVersion() {
            return this.old_version;
        }

        public Optional<String> getOnlineInfo() {
            return this.online_info;
        }

        public Optional<String> getOperationState() {
            return this.operation_state;
        }

        public Optional<String> getOptionalInfo() {
            return this.optional_info;
        }

        public Optional<String> getOrigin() {
            return this.origin;
        }

        public Optional<String> getOriginId() {
            return this.origin_id;
        }

        public Optional<String> getPackageName() {
            return this.package_name;
        }

        public Optional<Integer> getPageId() {
            return this.page_id;
        }

        public Optional<String> getPageName() {
            return this.page_name;
        }

        public Optional<Integer> getPageNum() {
            return this.page_num;
        }

        public Optional<String> getPageType() {
            return this.page_type;
        }

        public Optional<String> getPageUrl() {
            return this.page_url;
        }

        public Optional<String> getParamQueryEditDone() {
            return this.param_query_edit_done;
        }

        public Optional<String> getParamQueryEditOrigin() {
            return this.param_query_edit_origin;
        }

        public Optional<Double> getPercentage() {
            return this.percentage;
        }

        public Optional<Double> getPhoneVolume() {
            return this.phone_volume;
        }

        public Optional<Integer> getPlayMusicErrorCode() {
            return this.play_music_error_code;
        }

        public Optional<Integer> getPosition() {
            return this.position;
        }

        public Optional<Long> getProcessEndTime() {
            return this.process_end_time;
        }

        public Optional<Long> getProcessStartTime() {
            return this.process_start_time;
        }

        public Optional<String> getQuery() {
            return this.query;
        }

        public Optional<String> getQueryFrom() {
            return this.query_from;
        }

        public Optional<String> getQueryId() {
            return this.query_id;
        }

        public Optional<String> getQueryOrigin() {
            return this.query_origin;
        }

        public Optional<String> getQuerySource() {
            return this.query_source;
        }

        public Optional<String> getQueryText() {
            return this.query_text;
        }

        public Optional<String> getRelation() {
            return this.relation;
        }

        public Optional<String> getRequestId() {
            return this.request_id;
        }

        public Optional<String> getResourceId() {
            return this.resource_id;
        }

        public Optional<Integer> getResponseCode() {
            return this.response_code;
        }

        public Optional<Integer> getResponsecode() {
            return this.responsecode;
        }

        public Optional<String> getResult() {
            return this.result;
        }

        public Optional<String> getResultList() {
            return this.result_list;
        }

        public Optional<String> getResultType() {
            return this.result_type;
        }

        public Optional<String> getRpkPackagename() {
            return this.rpk_packagename;
        }

        public Optional<String> getRpkVersionCode() {
            return this.rpk_version_code;
        }

        public Optional<String> getRpkVersionName() {
            return this.rpk_version_name;
        }

        public Optional<String> getScanId() {
            return this.scan_id;
        }

        public Optional<String> getScanMode() {
            return this.scan_mode;
        }

        public Optional<String> getScheme() {
            return this.scheme;
        }

        public Optional<Double> getScore() {
            return this.score;
        }

        public Optional<Integer> getScreenLuminance() {
            return this.screen_luminance;
        }

        public Optional<Integer> getScreenResolution() {
            return this.screen_resolution;
        }

        public Optional<String> getScreenStatus() {
            return this.screen_status;
        }

        public Optional<String> getSecStatus() {
            return this.sec_status;
        }

        public Optional<String> getSendQuery() {
            return this.send_query;
        }

        public Optional<String> getSensitivity() {
            return this.sensitivity;
        }

        public Optional<String> getSessionId() {
            return this.session_id;
        }

        public Optional<String> getShareContent() {
            return this.share_content;
        }

        public Optional<Integer> getSilentMode() {
            return this.silent_mode;
        }

        public Optional<String> getSlideType() {
            return this.slide_type;
        }

        public Optional<String> getSong() {
            return this.song;
        }

        public Optional<String> getSourceType() {
            return this.source_type;
        }

        public Optional<Long> getStartTime() {
            return this.start_time;
        }

        public Optional<Integer> getStatus() {
            return this.status;
        }

        public Optional<Integer> getStatusCode() {
            return this.status_code;
        }

        public Optional<String> getTarget() {
            return this.target;
        }

        public Optional<String> getTemplateName() {
            return this.template_name;
        }

        public Optional<Long> getTime() {
            return this.time;
        }

        public Optional<String> getTraceId() {
            return this.trace_id;
        }

        public Optional<String> getUrl() {
            return this.url;
        }

        public Optional<String> getUserDefinedDialogId() {
            return this.user_defined_dialog_id;
        }

        public Optional<String> getVendorVersion() {
            return this.vendor_version;
        }

        public Optional<String> getVidpid() {
            return this.vidpid;
        }

        public Optional<Integer> getVoiceprintSwitchStatus() {
            return this.voiceprint_switch_status;
        }

        public Optional<String> getVoicetriggerSwitchStatus() {
            return this.voicetrigger_switch_status;
        }

        public Optional<String> getVoicetriggerVersionCode() {
            return this.voicetrigger_version_code;
        }

        public Optional<String> getVoicetriggerVersionName() {
            return this.voicetrigger_version_name;
        }

        public Optional<Boolean> is2g() {
            return this.is_2g;
        }

        public Optional<Boolean> is2m() {
            return this.is_2m;
        }

        public Optional<Boolean> isAecMode() {
            return this.is_aec_mode;
        }

        public Optional<Boolean> isAnswer() {
            return this.is_answer;
        }

        public Optional<Boolean> isAppearAd() {
            return this.is_appear_ad;
        }

        public Optional<Boolean> isAppearGrossBlowhole() {
            return this.is_appear_gross_blowhole;
        }

        public Optional<Boolean> isAutoMic() {
            return this.auto_mic;
        }

        public Optional<Boolean> isCalling() {
            return this.is_calling;
        }

        public Optional<Boolean> isClickToScore() {
            return this.is_click_to_score;
        }

        public Optional<Boolean> isConnect() {
            return this.is_connect;
        }

        public Optional<Boolean> isDeviceSupported() {
            return this.is_device_supported;
        }

        public Optional<Boolean> isDialing() {
            return this.is_dialing;
        }

        public Optional<Boolean> isEmpty() {
            return this.is_empty;
        }

        public Optional<Boolean> isExist() {
            return this.is_exist;
        }

        public Optional<Boolean> isFav() {
            return this.is_fav;
        }

        public Optional<Boolean> isFullDuplex() {
            return this.is_full_duplex;
        }

        public Optional<Boolean> isHaveMediaPlay() {
            return this.is_have_media_play;
        }

        public Optional<Boolean> isHeadline() {
            return this.is_headline;
        }

        public Optional<Boolean> isHighlight() {
            return this.is_highlight;
        }

        public Optional<Boolean> isInterrupted() {
            return this.is_interrupted;
        }

        public Optional<Boolean> isL2VoiceprintModelPass() {
            return this.is_l2_voiceprint_model_pass;
        }

        public Optional<Boolean> isL2WakeupModelPass() {
            return this.is_l2_wakeup_model_pass;
        }

        public Optional<Boolean> isLast() {
            return this.is_last;
        }

        public Optional<Boolean> isLockScreen() {
            return this.is_lock_screen;
        }

        public Optional<Boolean> isLongClick() {
            return this.is_long_click;
        }

        public Optional<Boolean> isMobileAppAdvertise() {
            return this.is_mobile_app_advertise;
        }

        public Optional<Boolean> isMute() {
            return this.is_mute;
        }

        public Optional<Boolean> isMuteMusicAtSlient() {
            return this.mute_music_at_slient;
        }

        public Optional<Boolean> isMutePhoneVolume() {
            return this.is_mute_phone_volume;
        }

        public Optional<Boolean> isMuteVoiceassistAtSlient() {
            return this.mute_voiceassist_at_slient;
        }

        public Optional<Boolean> isNotDisturb() {
            return this.is_not_disturb;
        }

        public Optional<Boolean> isUsed() {
            return this.is_used;
        }

        public Optional<Boolean> isVertical() {
            return this.is_vertical;
        }

        public VaExtendJson setActivityId(String str) {
            this.activity_id = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setAlbum(String str) {
            this.album = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setAndroidComponentName(String str) {
            this.android_component_name = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setAppName(String str) {
            this.app_name = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setAppautoConnectSubtype(String str) {
            this.appauto_connect_subtype = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setArtist(String str) {
            this.artist = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setAudioMd5(String str) {
            this.audio_md5 = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setAutoMic(boolean z) {
            this.auto_mic = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setBrowserVersioncode(String str) {
            this.browser_versioncode = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setBtDeviceVersion(String str) {
            this.bt_device_version = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setButton(String str) {
            this.button = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setCardId(String str) {
            this.card_id = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setCardType(String str) {
            this.card_type = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setClickType(String str) {
            this.click_type = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setConnectId(String str) {
            this.connect_id = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setConnectMode(String str) {
            this.connect_mode = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setContent(String str) {
            this.content = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setContentType(String str) {
            this.content_type = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setCp(String str) {
            this.cp = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setCpId(String str) {
            this.cp_id = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setCpPosition(int i) {
            this.cp_position = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VaExtendJson setCreateDoneTime(long j) {
            this.create_done_time = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public VaExtendJson setCreateTime(long j) {
            this.create_time = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public VaExtendJson setDebugInfo(String str) {
            this.debug_info = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setDialogId(String str) {
            this.dialog_id = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setDomain(String str) {
            this.domain = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setEid(String str) {
            this.eid = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setElectricQuantity(int i) {
            this.electric_quantity = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VaExtendJson setElementId(int i) {
            this.element_id = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VaExtendJson setEndTime(long j) {
            this.end_time = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public VaExtendJson setEntityId(String str) {
            this.entity_id = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setEventId(String str) {
            this.event_id = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setExpection(String str) {
            this.expection = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setExtendType(String str) {
            this.extend_type = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setFileName(String str) {
            this.file_name = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setFileVersion(int i) {
            this.file_version = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VaExtendJson setFinalExecuteNodeName(String str) {
            this.final_execute_node_name = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setFlag(String str) {
            this.flag = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setFrom(String str) {
            this.from = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setGroupId(String str) {
            this.group_id = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setHomeExposeList(String str) {
            this.home_expose_list = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setIndex(int i) {
            this.index = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VaExtendJson setInstructionId(String str) {
            this.instruction_id = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setInstructionName(String str) {
            this.instruction_name = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setIntention(String str) {
            this.intention = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setIs2g(boolean z) {
            this.is_2g = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIs2m(boolean z) {
            this.is_2m = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIsAecMode(boolean z) {
            this.is_aec_mode = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIsAnswer(boolean z) {
            this.is_answer = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIsAppearAd(boolean z) {
            this.is_appear_ad = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIsAppearGrossBlowhole(boolean z) {
            this.is_appear_gross_blowhole = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIsCalling(boolean z) {
            this.is_calling = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIsClickToScore(boolean z) {
            this.is_click_to_score = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIsConnect(boolean z) {
            this.is_connect = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIsDeviceSupported(boolean z) {
            this.is_device_supported = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIsDialing(boolean z) {
            this.is_dialing = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIsEmpty(boolean z) {
            this.is_empty = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIsExist(boolean z) {
            this.is_exist = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIsFav(boolean z) {
            this.is_fav = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIsFullDuplex(boolean z) {
            this.is_full_duplex = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIsHaveMediaPlay(boolean z) {
            this.is_have_media_play = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIsHeadline(boolean z) {
            this.is_headline = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIsHighlight(boolean z) {
            this.is_highlight = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIsInterrupted(boolean z) {
            this.is_interrupted = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIsL2VoiceprintModelPass(boolean z) {
            this.is_l2_voiceprint_model_pass = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIsL2WakeupModelPass(boolean z) {
            this.is_l2_wakeup_model_pass = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIsLast(boolean z) {
            this.is_last = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIsLockScreen(boolean z) {
            this.is_lock_screen = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIsLongClick(boolean z) {
            this.is_long_click = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIsMandatoryUpgrade(int i) {
            this.is_mandatory_upgrade = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VaExtendJson setIsMobileAppAdvertise(boolean z) {
            this.is_mobile_app_advertise = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIsMute(boolean z) {
            this.is_mute = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIsMutePhoneVolume(boolean z) {
            this.is_mute_phone_volume = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIsNotDisturb(boolean z) {
            this.is_not_disturb = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIsPopupOption(int i) {
            this.is_popup_option = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VaExtendJson setIsRequesting(int i) {
            this.is_requesting = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VaExtendJson setIsSelectedAll(int i) {
            this.is_selected_all = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VaExtendJson setIsUsed(boolean z) {
            this.is_used = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setIsVertical(boolean z) {
            this.is_vertical = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setItemPosition(int i) {
            this.item_position = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VaExtendJson setKeyPhrase(String str) {
            this.key_phrase = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setKeyValue(String str) {
            this.key_value = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setL1VoiceprintScore(double d) {
            this.l1_voiceprint_score = Optional.ofNullable(Double.valueOf(d));
            return this;
        }

        public VaExtendJson setL1WakeupScore(double d) {
            this.l1_wakeup_score = Optional.ofNullable(Double.valueOf(d));
            return this;
        }

        public VaExtendJson setL1WakeupTime(long j) {
            this.l1_wakeup_time = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public VaExtendJson setL2VoiceprintEnd(long j) {
            this.l2_voiceprint_end = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public VaExtendJson setL2VoiceprintEngineVersion(String str) {
            this.l2_voiceprint_engine_version = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setL2VoiceprintModelVersion(String str) {
            this.l2_voiceprint_model_version = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setL2VoiceprintScore(double d) {
            this.l2_voiceprint_score = Optional.ofNullable(Double.valueOf(d));
            return this;
        }

        public VaExtendJson setL2VoiceprintStart(long j) {
            this.l2_voiceprint_start = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public VaExtendJson setL2WakeupAudioLength(long j) {
            this.l2_wakeup_audio_length = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public VaExtendJson setL2WakeupEnd(long j) {
            this.l2_wakeup_end = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public VaExtendJson setL2WakeupEngineVersion(String str) {
            this.l2_wakeup_engine_version = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setL2WakeupModelVersion(String str) {
            this.l2_wakeup_model_version = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setL2WakeupResultEnd(long j) {
            this.l2_wakeup_result_end = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public VaExtendJson setL2WakeupResultStart(long j) {
            this.l2_wakeup_result_start = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public VaExtendJson setL2WakeupScore(double d) {
            this.l2_wakeup_score = Optional.ofNullable(Double.valueOf(d));
            return this;
        }

        public VaExtendJson setL2WakeupStart(long j) {
            this.l2_wakeup_start = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public VaExtendJson setL2WakeupTime(long j) {
            this.l2_wakeup_time = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public VaExtendJson setLandingPage(String str) {
            this.landing_page = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setLanguageType(String str) {
            this.language_type = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setLength(long j) {
            this.length = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public VaExtendJson setListPosition(int i) {
            this.list_position = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VaExtendJson setLocalInfo(String str) {
            this.local_info = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setMacAddress(String str) {
            this.mac_address = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setMediaVolume(double d) {
            this.media_volume = Optional.ofNullable(Double.valueOf(d));
            return this;
        }

        public VaExtendJson setMessage(String str) {
            this.message = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setMetaId(String str) {
            this.meta_id = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setMiaiVolume(double d) {
            this.miai_volume = Optional.ofNullable(Double.valueOf(d));
            return this;
        }

        public VaExtendJson setModelName(String str) {
            this.model_name = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setMsgId(String str) {
            this.msg_id = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setMuteMusicAtSlient(boolean z) {
            this.mute_music_at_slient = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setMuteVoiceassistAtSlient(boolean z) {
            this.mute_voiceassist_at_slient = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VaExtendJson setName(String str) {
            this.name = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setNetworkCompany(String str) {
            this.network_company = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setNewList(String str) {
            this.new_list = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setNewVersion(String str) {
            this.new_version = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setNum(int i) {
            this.num = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VaExtendJson setOfflineAsrScore(double d) {
            this.offline_asr_score = Optional.ofNullable(Double.valueOf(d));
            return this;
        }

        public VaExtendJson setOldList(String str) {
            this.old_list = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setOldVersion(String str) {
            this.old_version = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setOnlineInfo(String str) {
            this.online_info = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setOperationState(String str) {
            this.operation_state = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setOptionalInfo(String str) {
            this.optional_info = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setOrigin(String str) {
            this.origin = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setOriginId(String str) {
            this.origin_id = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setPackageName(String str) {
            this.package_name = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setPageId(int i) {
            this.page_id = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VaExtendJson setPageName(String str) {
            this.page_name = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setPageNum(int i) {
            this.page_num = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VaExtendJson setPageType(String str) {
            this.page_type = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setPageUrl(String str) {
            this.page_url = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setParamQueryEditDone(String str) {
            this.param_query_edit_done = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setParamQueryEditOrigin(String str) {
            this.param_query_edit_origin = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setPercentage(double d) {
            this.percentage = Optional.ofNullable(Double.valueOf(d));
            return this;
        }

        public VaExtendJson setPhoneVolume(double d) {
            this.phone_volume = Optional.ofNullable(Double.valueOf(d));
            return this;
        }

        public VaExtendJson setPlayMusicErrorCode(int i) {
            this.play_music_error_code = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VaExtendJson setPosition(int i) {
            this.position = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VaExtendJson setProcessEndTime(long j) {
            this.process_end_time = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public VaExtendJson setProcessStartTime(long j) {
            this.process_start_time = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public VaExtendJson setQuery(String str) {
            this.query = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setQueryFrom(String str) {
            this.query_from = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setQueryId(String str) {
            this.query_id = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setQueryOrigin(String str) {
            this.query_origin = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setQuerySource(String str) {
            this.query_source = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setQueryText(String str) {
            this.query_text = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setRelation(String str) {
            this.relation = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setRequestId(String str) {
            this.request_id = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setResourceId(String str) {
            this.resource_id = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setResponseCode(int i) {
            this.response_code = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VaExtendJson setResponsecode(int i) {
            this.responsecode = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VaExtendJson setResult(String str) {
            this.result = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setResultList(String str) {
            this.result_list = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setResultType(String str) {
            this.result_type = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setRpkPackagename(String str) {
            this.rpk_packagename = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setRpkVersionCode(String str) {
            this.rpk_version_code = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setRpkVersionName(String str) {
            this.rpk_version_name = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setScanId(String str) {
            this.scan_id = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setScanMode(String str) {
            this.scan_mode = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setScheme(String str) {
            this.scheme = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setScore(double d) {
            this.score = Optional.ofNullable(Double.valueOf(d));
            return this;
        }

        public VaExtendJson setScreenLuminance(int i) {
            this.screen_luminance = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VaExtendJson setScreenResolution(int i) {
            this.screen_resolution = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VaExtendJson setScreenStatus(String str) {
            this.screen_status = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setSecStatus(String str) {
            this.sec_status = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setSendQuery(String str) {
            this.send_query = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setSensitivity(String str) {
            this.sensitivity = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setSessionId(String str) {
            this.session_id = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setShareContent(String str) {
            this.share_content = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setSilentMode(int i) {
            this.silent_mode = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VaExtendJson setSlideType(String str) {
            this.slide_type = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setSong(String str) {
            this.song = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setSourceType(String str) {
            this.source_type = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setStartTime(long j) {
            this.start_time = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public VaExtendJson setStatus(int i) {
            this.status = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VaExtendJson setStatusCode(int i) {
            this.status_code = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VaExtendJson setTarget(String str) {
            this.target = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setTemplateName(String str) {
            this.template_name = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setTime(long j) {
            this.time = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public VaExtendJson setTraceId(String str) {
            this.trace_id = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setUrl(String str) {
            this.url = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setUserDefinedDialogId(String str) {
            this.user_defined_dialog_id = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setVendorVersion(String str) {
            this.vendor_version = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setVidpid(String str) {
            this.vidpid = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setVoiceprintSwitchStatus(int i) {
            this.voiceprint_switch_status = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VaExtendJson setVoicetriggerSwitchStatus(String str) {
            this.voicetrigger_switch_status = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setVoicetriggerVersionCode(String str) {
            this.voicetrigger_version_code = Optional.ofNullable(str);
            return this;
        }

        public VaExtendJson setVoicetriggerVersionName(String str) {
            this.voicetrigger_version_name = Optional.ofNullable(str);
            return this;
        }
    }

    public static class VaTrackLog {

        @Required
        private VaEventParams event_params;

        @Required
        private VaEventType event_type;

        public VaTrackLog() {
        }

        public VaTrackLog(VaEventType vaEventType, VaEventParams vaEventParams) {
            this.event_type = vaEventType;
            this.event_params = vaEventParams;
        }

        @Required
        public VaEventParams getEventParams() {
            return this.event_params;
        }

        @Required
        public VaEventType getEventType() {
            return this.event_type;
        }

        @Required
        public VaTrackLog setEventParams(VaEventParams vaEventParams) {
            this.event_params = vaEventParams;
            return this;
        }

        @Required
        public VaTrackLog setEventType(VaEventType vaEventType) {
            this.event_type = vaEventType;
            return this;
        }
    }

    public static class VideoItemLog {
        private Optional<String> eid = Optional.empty();
        private Optional<String> meta_id = Optional.empty();
        private Optional<String> resource_id = Optional.empty();
        private Optional<String> refer = Optional.empty();
        private Optional<String> audio_id = Optional.empty();
        private Optional<String> third_cp_name = Optional.empty();
        private Optional<String> category = Optional.empty();

        public Optional<String> getAudioId() {
            return this.audio_id;
        }

        public Optional<String> getCategory() {
            return this.category;
        }

        public Optional<String> getEid() {
            return this.eid;
        }

        public Optional<String> getMetaId() {
            return this.meta_id;
        }

        public Optional<String> getRefer() {
            return this.refer;
        }

        public Optional<String> getResourceId() {
            return this.resource_id;
        }

        public Optional<String> getThirdCpName() {
            return this.third_cp_name;
        }

        public VideoItemLog setAudioId(String str) {
            this.audio_id = Optional.ofNullable(str);
            return this;
        }

        public VideoItemLog setCategory(String str) {
            this.category = Optional.ofNullable(str);
            return this;
        }

        public VideoItemLog setEid(String str) {
            this.eid = Optional.ofNullable(str);
            return this;
        }

        public VideoItemLog setMetaId(String str) {
            this.meta_id = Optional.ofNullable(str);
            return this;
        }

        public VideoItemLog setRefer(String str) {
            this.refer = Optional.ofNullable(str);
            return this;
        }

        public VideoItemLog setResourceId(String str) {
            this.resource_id = Optional.ofNullable(str);
            return this;
        }

        public VideoItemLog setThirdCpName(String str) {
            this.third_cp_name = Optional.ofNullable(str);
            return this;
        }
    }

    public static class WakeUpEventContext {

        @Required
        private String app_id;

        @Required
        private String device_id;
        private Optional<String> uid = Optional.empty();
        private Optional<String> bt_device_mac_address = Optional.empty();
        private Optional<String> bt_device_name = Optional.empty();
        private Optional<String> network_status = Optional.empty();
        private Optional<String> rom_version = Optional.empty();
        private Optional<String> device_model = Optional.empty();
        private Optional<String> miai_version = Optional.empty();
        private Optional<String> build_versioncode = Optional.empty();
        private Optional<Boolean> channel_rom_version = Optional.empty();
        private Optional<String> device_model_codename = Optional.empty();
        private Optional<String> android_version = Optional.empty();
        private Optional<String> android_sdk_version = Optional.empty();
        private Optional<String> upgrade_channel = Optional.empty();
        private Optional<String> wakeup_version = Optional.empty();
        private Optional<String> wakeup_channel = Optional.empty();
        private Optional<String> channel_version = Optional.empty();
        private Optional<String> os = Optional.empty();

        public WakeUpEventContext() {
        }

        public WakeUpEventContext(String str, String str2) {
            this.device_id = str;
            this.app_id = str2;
        }

        public Optional<String> getAndroidSdkVersion() {
            return this.android_sdk_version;
        }

        public Optional<String> getAndroidVersion() {
            return this.android_version;
        }

        @Required
        public String getAppId() {
            return this.app_id;
        }

        public Optional<String> getBtDeviceMacAddress() {
            return this.bt_device_mac_address;
        }

        public Optional<String> getBtDeviceName() {
            return this.bt_device_name;
        }

        public Optional<String> getBuildVersioncode() {
            return this.build_versioncode;
        }

        public Optional<String> getChannelVersion() {
            return this.channel_version;
        }

        @Required
        public String getDeviceId() {
            return this.device_id;
        }

        public Optional<String> getDeviceModel() {
            return this.device_model;
        }

        public Optional<String> getDeviceModelCodename() {
            return this.device_model_codename;
        }

        public Optional<String> getMiaiVersion() {
            return this.miai_version;
        }

        public Optional<String> getNetworkStatus() {
            return this.network_status;
        }

        public Optional<String> getOs() {
            return this.os;
        }

        public Optional<String> getRomVersion() {
            return this.rom_version;
        }

        public Optional<String> getUid() {
            return this.uid;
        }

        public Optional<String> getUpgradeChannel() {
            return this.upgrade_channel;
        }

        public Optional<String> getWakeupChannel() {
            return this.wakeup_channel;
        }

        public Optional<String> getWakeupVersion() {
            return this.wakeup_version;
        }

        public Optional<Boolean> isChannelRomVersion() {
            return this.channel_rom_version;
        }

        public WakeUpEventContext setAndroidSdkVersion(String str) {
            this.android_sdk_version = Optional.ofNullable(str);
            return this;
        }

        public WakeUpEventContext setAndroidVersion(String str) {
            this.android_version = Optional.ofNullable(str);
            return this;
        }

        @Required
        public WakeUpEventContext setAppId(String str) {
            this.app_id = str;
            return this;
        }

        public WakeUpEventContext setBtDeviceMacAddress(String str) {
            this.bt_device_mac_address = Optional.ofNullable(str);
            return this;
        }

        public WakeUpEventContext setBtDeviceName(String str) {
            this.bt_device_name = Optional.ofNullable(str);
            return this;
        }

        public WakeUpEventContext setBuildVersioncode(String str) {
            this.build_versioncode = Optional.ofNullable(str);
            return this;
        }

        public WakeUpEventContext setChannelRomVersion(boolean z) {
            this.channel_rom_version = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public WakeUpEventContext setChannelVersion(String str) {
            this.channel_version = Optional.ofNullable(str);
            return this;
        }

        @Required
        public WakeUpEventContext setDeviceId(String str) {
            this.device_id = str;
            return this;
        }

        public WakeUpEventContext setDeviceModel(String str) {
            this.device_model = Optional.ofNullable(str);
            return this;
        }

        public WakeUpEventContext setDeviceModelCodename(String str) {
            this.device_model_codename = Optional.ofNullable(str);
            return this;
        }

        public WakeUpEventContext setMiaiVersion(String str) {
            this.miai_version = Optional.ofNullable(str);
            return this;
        }

        public WakeUpEventContext setNetworkStatus(String str) {
            this.network_status = Optional.ofNullable(str);
            return this;
        }

        public WakeUpEventContext setOs(String str) {
            this.os = Optional.ofNullable(str);
            return this;
        }

        public WakeUpEventContext setRomVersion(String str) {
            this.rom_version = Optional.ofNullable(str);
            return this;
        }

        public WakeUpEventContext setUid(String str) {
            this.uid = Optional.ofNullable(str);
            return this;
        }

        public WakeUpEventContext setUpgradeChannel(String str) {
            this.upgrade_channel = Optional.ofNullable(str);
            return this;
        }

        public WakeUpEventContext setWakeupChannel(String str) {
            this.wakeup_channel = Optional.ofNullable(str);
            return this;
        }

        public WakeUpEventContext setWakeupVersion(String str) {
            this.wakeup_version = Optional.ofNullable(str);
            return this;
        }
    }

    public static class WakeUpEventParams {

        @Required
        private String dialog_id;

        @Required
        private WakeUpEventContext event_context;

        @Required
        private String event_data_type;

        @Deprecated
        private Optional<ObjectNode> extend_json = Optional.empty();
        private Optional<WakeUpExtendJson> extend_json_v3 = Optional.empty();

        @Required
        private long timestamp;

        public WakeUpEventParams() {
        }

        public WakeUpEventParams(String str, String str2, long j, WakeUpEventContext wakeUpEventContext) {
            this.dialog_id = str;
            this.event_data_type = str2;
            this.timestamp = j;
            this.event_context = wakeUpEventContext;
        }

        @Required
        public String getDialogId() {
            return this.dialog_id;
        }

        @Required
        public WakeUpEventContext getEventContext() {
            return this.event_context;
        }

        @Required
        public String getEventDataType() {
            return this.event_data_type;
        }

        @Deprecated
        public Optional<ObjectNode> getExtendJson() {
            return this.extend_json;
        }

        public Optional<WakeUpExtendJson> getExtendJsonV3() {
            return this.extend_json_v3;
        }

        @Required
        public long getTimestamp() {
            return this.timestamp;
        }

        @Required
        public WakeUpEventParams setDialogId(String str) {
            this.dialog_id = str;
            return this;
        }

        @Required
        public WakeUpEventParams setEventContext(WakeUpEventContext wakeUpEventContext) {
            this.event_context = wakeUpEventContext;
            return this;
        }

        @Required
        public WakeUpEventParams setEventDataType(String str) {
            this.event_data_type = str;
            return this;
        }

        @Deprecated
        public WakeUpEventParams setExtendJson(ObjectNode objectNode) {
            this.extend_json = Optional.ofNullable(objectNode);
            return this;
        }

        public WakeUpEventParams setExtendJsonV3(WakeUpExtendJson wakeUpExtendJson) {
            this.extend_json_v3 = Optional.ofNullable(wakeUpExtendJson);
            return this;
        }

        @Required
        public WakeUpEventParams setTimestamp(long j) {
            this.timestamp = j;
            return this;
        }
    }

    public enum WakeUpEventType {
        TV_WAKEUP_NEARFIELD_COUNT(0),
        TV_WAKEUP_REAL_FARFIELD_COUNT(1),
        TV_WAKEUP_SUSPECT_FARFIELD_COUNT(2),
        TV_SPEECH_ASR_RESULT(3),
        TV_SPEECH_ASR_FAILURE(4),
        TV_SPEECH_NLP_RESULT(5),
        TV_SPEECH_SDK_ERR_COUNT(6),
        PH_WAKEUP_REAL_COUNT(30),
        PH_WAKEUP_SUSPECT_COUNT(31),
        PH_SPEECH_STATE_COUNT(32),
        PH_WAKEUP_FUNC(33),
        sound_wakeup_real_count(60),
        sound_wakeup_suspect_count(61),
        sound_speech_asr_no_query_count(62),
        sound_speech_no_response_count(63),
        sound_speech_invalid_domain_action_count(64),
        sound_speech_success_count(65),
        sound_speech_sdk_err_count(66);

        private int id;

        WakeUpEventType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class WakeUpExtendJson {
        private Optional<String> app_name = Optional.empty();
        private Optional<String> func = Optional.empty();
        private Optional<String> query = Optional.empty();

        public Optional<String> getAppName() {
            return this.app_name;
        }

        public Optional<String> getFunc() {
            return this.func;
        }

        public Optional<String> getQuery() {
            return this.query;
        }

        public WakeUpExtendJson setAppName(String str) {
            this.app_name = Optional.ofNullable(str);
            return this;
        }

        public WakeUpExtendJson setFunc(String str) {
            this.func = Optional.ofNullable(str);
            return this;
        }

        public WakeUpExtendJson setQuery(String str) {
            this.query = Optional.ofNullable(str);
            return this;
        }
    }

    public static class WakeUpTrackLog {

        @Required
        private WakeUpEventParams event_params;

        @Required
        private WakeUpEventType event_type;

        public WakeUpTrackLog() {
        }

        public WakeUpTrackLog(WakeUpEventType wakeUpEventType, WakeUpEventParams wakeUpEventParams) {
            this.event_type = wakeUpEventType;
            this.event_params = wakeUpEventParams;
        }

        @Required
        public WakeUpEventParams getEventParams() {
            return this.event_params;
        }

        @Required
        public WakeUpEventType getEventType() {
            return this.event_type;
        }

        @Required
        public WakeUpTrackLog setEventParams(WakeUpEventParams wakeUpEventParams) {
            this.event_params = wakeUpEventParams;
            return this;
        }

        @Required
        public WakeUpTrackLog setEventType(WakeUpEventType wakeUpEventType) {
            this.event_type = wakeUpEventType;
            return this;
        }
    }

    public static class WatchEventContext {

        @Required
        private String app_id;

        @Required
        private String device_id;

        @Required
        private String miai_version;

        @Required
        private String network_status;

        @Required
        private String platform_id;

        @Required
        private String uid;
        private Optional<String> android_version = Optional.empty();
        private Optional<String> position = Optional.empty();
        private Optional<String> android_sdk_version = Optional.empty();

        public WatchEventContext() {
        }

        public WatchEventContext(String str, String str2, String str3, String str4, String str5, String str6) {
            this.device_id = str;
            this.platform_id = str2;
            this.app_id = str3;
            this.uid = str4;
            this.network_status = str5;
            this.miai_version = str6;
        }

        public Optional<String> getAndroidSdkVersion() {
            return this.android_sdk_version;
        }

        public Optional<String> getAndroidVersion() {
            return this.android_version;
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
        public String getMiaiVersion() {
            return this.miai_version;
        }

        @Required
        public String getNetworkStatus() {
            return this.network_status;
        }

        @Required
        public String getPlatformId() {
            return this.platform_id;
        }

        public Optional<String> getPosition() {
            return this.position;
        }

        @Required
        public String getUid() {
            return this.uid;
        }

        public WatchEventContext setAndroidSdkVersion(String str) {
            this.android_sdk_version = Optional.ofNullable(str);
            return this;
        }

        public WatchEventContext setAndroidVersion(String str) {
            this.android_version = Optional.ofNullable(str);
            return this;
        }

        @Required
        public WatchEventContext setAppId(String str) {
            this.app_id = str;
            return this;
        }

        @Required
        public WatchEventContext setDeviceId(String str) {
            this.device_id = str;
            return this;
        }

        @Required
        public WatchEventContext setMiaiVersion(String str) {
            this.miai_version = str;
            return this;
        }

        @Required
        public WatchEventContext setNetworkStatus(String str) {
            this.network_status = str;
            return this;
        }

        @Required
        public WatchEventContext setPlatformId(String str) {
            this.platform_id = str;
            return this;
        }

        public WatchEventContext setPosition(String str) {
            this.position = Optional.ofNullable(str);
            return this;
        }

        @Required
        public WatchEventContext setUid(String str) {
            this.uid = str;
            return this;
        }
    }

    public static class WatchEventParams {

        @Required
        private WatchEventContext event_context;

        @Required
        private String event_data_type;
        private Optional<WatchExtendJson> extend_json = Optional.empty();

        @Required
        private long timestamp;

        @Required
        private String widget;

        public WatchEventParams() {
        }

        public WatchEventParams(String str, WatchEventContext watchEventContext, String str2, long j) {
            this.widget = str;
            this.event_context = watchEventContext;
            this.event_data_type = str2;
            this.timestamp = j;
        }

        @Required
        public WatchEventContext getEventContext() {
            return this.event_context;
        }

        @Required
        public String getEventDataType() {
            return this.event_data_type;
        }

        public Optional<WatchExtendJson> getExtendJson() {
            return this.extend_json;
        }

        @Required
        public long getTimestamp() {
            return this.timestamp;
        }

        @Required
        public String getWidget() {
            return this.widget;
        }

        @Required
        public WatchEventParams setEventContext(WatchEventContext watchEventContext) {
            this.event_context = watchEventContext;
            return this;
        }

        @Required
        public WatchEventParams setEventDataType(String str) {
            this.event_data_type = str;
            return this;
        }

        public WatchEventParams setExtendJson(WatchExtendJson watchExtendJson) {
            this.extend_json = Optional.ofNullable(watchExtendJson);
            return this;
        }

        @Required
        public WatchEventParams setTimestamp(long j) {
            this.timestamp = j;
            return this;
        }

        @Required
        public WatchEventParams setWidget(String str) {
            this.widget = str;
            return this;
        }
    }

    public enum WatchEventType {
        EXPOSE(0),
        CLICK(1),
        EXIT(2),
        STATE(3),
        ENTER(4),
        DURATION(5),
        AWAKE(6),
        SLIDE(7);

        private int id;

        WatchEventType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class WatchExtendJson {
        private Optional<String> exp_id = Optional.empty();
        private Optional<String> dialog_id = Optional.empty();
        private Optional<String> query_source = Optional.empty();
        private Optional<String> exposure_queries = Optional.empty();
        private Optional<String> click_queries = Optional.empty();
        private Optional<Long> end_time = Optional.empty();
        private Optional<String> query_origin = Optional.empty();
        private Optional<String> guidance_type = Optional.empty();
        private Optional<Integer> time_cost = Optional.empty();
        private Optional<Integer> max_wait_time = Optional.empty();
        private Optional<String> card_type = Optional.empty();
        private Optional<String> debug_info = Optional.empty();
        private Optional<Integer> query_version = Optional.empty();
        private Optional<String> extend_type = Optional.empty();
        private Optional<String> language_type = Optional.empty();
        private Optional<String> from = Optional.empty();
        private Optional<String> network_company = Optional.empty();
        private Optional<Integer> silent_mode = Optional.empty();
        private Optional<Boolean> mute_music_at_slient = Optional.empty();
        private Optional<Integer> electric_quantity = Optional.empty();
        private Optional<Integer> screen_resolution = Optional.empty();
        private Optional<Integer> screen_luminance = Optional.empty();
        private Optional<String> key_value = Optional.empty();
        private Optional<Integer> position = Optional.empty();
        private Optional<String> status = Optional.empty();
        private Optional<String> error_code = Optional.empty();
        private Optional<String> element_id = Optional.empty();
        private Optional<Double> percentage = Optional.empty();
        private Optional<String> origin_id = Optional.empty();
        private Optional<Boolean> is_true = Optional.empty();
        private Optional<Integer> length = Optional.empty();
        private Optional<String> model_name = Optional.empty();

        public Optional<String> getCardType() {
            return this.card_type;
        }

        public Optional<String> getClickQueries() {
            return this.click_queries;
        }

        public Optional<String> getDebugInfo() {
            return this.debug_info;
        }

        public Optional<String> getDialogId() {
            return this.dialog_id;
        }

        public Optional<Integer> getElectricQuantity() {
            return this.electric_quantity;
        }

        public Optional<String> getElementId() {
            return this.element_id;
        }

        public Optional<Long> getEndTime() {
            return this.end_time;
        }

        public Optional<String> getErrorCode() {
            return this.error_code;
        }

        public Optional<String> getExpId() {
            return this.exp_id;
        }

        public Optional<String> getExposureQueries() {
            return this.exposure_queries;
        }

        public Optional<String> getExtendType() {
            return this.extend_type;
        }

        public Optional<String> getFrom() {
            return this.from;
        }

        public Optional<String> getGuidanceType() {
            return this.guidance_type;
        }

        public Optional<String> getKeyValue() {
            return this.key_value;
        }

        public Optional<String> getLanguageType() {
            return this.language_type;
        }

        public Optional<Integer> getLength() {
            return this.length;
        }

        public Optional<Integer> getMaxWaitTime() {
            return this.max_wait_time;
        }

        public Optional<String> getModelName() {
            return this.model_name;
        }

        public Optional<String> getNetworkCompany() {
            return this.network_company;
        }

        public Optional<String> getOriginId() {
            return this.origin_id;
        }

        public Optional<Double> getPercentage() {
            return this.percentage;
        }

        public Optional<Integer> getPosition() {
            return this.position;
        }

        public Optional<String> getQueryOrigin() {
            return this.query_origin;
        }

        public Optional<String> getQuerySource() {
            return this.query_source;
        }

        public Optional<Integer> getQueryVersion() {
            return this.query_version;
        }

        public Optional<Integer> getScreenLuminance() {
            return this.screen_luminance;
        }

        public Optional<Integer> getScreenResolution() {
            return this.screen_resolution;
        }

        public Optional<Integer> getSilentMode() {
            return this.silent_mode;
        }

        public Optional<String> getStatus() {
            return this.status;
        }

        public Optional<Integer> getTimeCost() {
            return this.time_cost;
        }

        public Optional<Boolean> isMuteMusicAtSlient() {
            return this.mute_music_at_slient;
        }

        public Optional<Boolean> isTrue() {
            return this.is_true;
        }

        public WatchExtendJson setCardType(String str) {
            this.card_type = Optional.ofNullable(str);
            return this;
        }

        public WatchExtendJson setClickQueries(String str) {
            this.click_queries = Optional.ofNullable(str);
            return this;
        }

        public WatchExtendJson setDebugInfo(String str) {
            this.debug_info = Optional.ofNullable(str);
            return this;
        }

        public WatchExtendJson setDialogId(String str) {
            this.dialog_id = Optional.ofNullable(str);
            return this;
        }

        public WatchExtendJson setElectricQuantity(int i) {
            this.electric_quantity = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public WatchExtendJson setElementId(String str) {
            this.element_id = Optional.ofNullable(str);
            return this;
        }

        public WatchExtendJson setEndTime(long j) {
            this.end_time = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public WatchExtendJson setErrorCode(String str) {
            this.error_code = Optional.ofNullable(str);
            return this;
        }

        public WatchExtendJson setExpId(String str) {
            this.exp_id = Optional.ofNullable(str);
            return this;
        }

        public WatchExtendJson setExposureQueries(String str) {
            this.exposure_queries = Optional.ofNullable(str);
            return this;
        }

        public WatchExtendJson setExtendType(String str) {
            this.extend_type = Optional.ofNullable(str);
            return this;
        }

        public WatchExtendJson setFrom(String str) {
            this.from = Optional.ofNullable(str);
            return this;
        }

        public WatchExtendJson setGuidanceType(String str) {
            this.guidance_type = Optional.ofNullable(str);
            return this;
        }

        public WatchExtendJson setIsTrue(boolean z) {
            this.is_true = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public WatchExtendJson setKeyValue(String str) {
            this.key_value = Optional.ofNullable(str);
            return this;
        }

        public WatchExtendJson setLanguageType(String str) {
            this.language_type = Optional.ofNullable(str);
            return this;
        }

        public WatchExtendJson setLength(int i) {
            this.length = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public WatchExtendJson setMaxWaitTime(int i) {
            this.max_wait_time = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public WatchExtendJson setModelName(String str) {
            this.model_name = Optional.ofNullable(str);
            return this;
        }

        public WatchExtendJson setMuteMusicAtSlient(boolean z) {
            this.mute_music_at_slient = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public WatchExtendJson setNetworkCompany(String str) {
            this.network_company = Optional.ofNullable(str);
            return this;
        }

        public WatchExtendJson setOriginId(String str) {
            this.origin_id = Optional.ofNullable(str);
            return this;
        }

        public WatchExtendJson setPercentage(double d) {
            this.percentage = Optional.ofNullable(Double.valueOf(d));
            return this;
        }

        public WatchExtendJson setPosition(int i) {
            this.position = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public WatchExtendJson setQueryOrigin(String str) {
            this.query_origin = Optional.ofNullable(str);
            return this;
        }

        public WatchExtendJson setQuerySource(String str) {
            this.query_source = Optional.ofNullable(str);
            return this;
        }

        public WatchExtendJson setQueryVersion(int i) {
            this.query_version = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public WatchExtendJson setScreenLuminance(int i) {
            this.screen_luminance = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public WatchExtendJson setScreenResolution(int i) {
            this.screen_resolution = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public WatchExtendJson setSilentMode(int i) {
            this.silent_mode = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public WatchExtendJson setStatus(String str) {
            this.status = Optional.ofNullable(str);
            return this;
        }

        public WatchExtendJson setTimeCost(int i) {
            this.time_cost = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }
    }

    public static class WatchTrackLog {

        @Required
        private WatchEventParams event_params;

        @Required
        private WatchEventType event_type;

        public WatchTrackLog() {
        }

        public WatchTrackLog(WatchEventType watchEventType, WatchEventParams watchEventParams) {
            this.event_type = watchEventType;
            this.event_params = watchEventParams;
        }

        @Required
        public WatchEventParams getEventParams() {
            return this.event_params;
        }

        @Required
        public WatchEventType getEventType() {
            return this.event_type;
        }

        @Required
        public WatchTrackLog setEventParams(WatchEventParams watchEventParams) {
            this.event_params = watchEventParams;
            return this;
        }

        @Required
        public WatchTrackLog setEventType(WatchEventType watchEventType) {
            this.event_type = watchEventType;
            return this;
        }
    }
}
