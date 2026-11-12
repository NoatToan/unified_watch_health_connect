package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.dialog;
import com.xiaomi.ai.api.intent.session.BeliefState;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.mj1;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class Nlp {

    public static class AIRelayParam {
        private Optional<Boolean> is_intelligent_reply = Optional.a();
        private Optional<AIRelayStyle> ai_relay_style = Optional.a();

        public Optional<AIRelayStyle> getAiRelayStyle() {
            return this.ai_relay_style;
        }

        public Optional<Boolean> isIntelligentReply() {
            return this.is_intelligent_reply;
        }

        public AIRelayParam setAiRelayStyle(AIRelayStyle aIRelayStyle) {
            this.ai_relay_style = Optional.e(aIRelayStyle);
            return this;
        }

        public AIRelayParam setIsIntelligentReply(boolean z) {
            this.is_intelligent_reply = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    public enum AIRelayStyle {
        UNKNOWN(-1),
        NATURE(0),
        FORMAL(1),
        HUMOUR(2);

        private int id;

        AIRelayStyle(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum AddressToModify {
        UNKNOWN(-1),
        HOME(0),
        COMPANY(1);

        private int id;

        AddressToModify(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class AgeRange {

        @Required
        private float end;

        @Required
        private float start;

        public AgeRange() {
        }

        public AgeRange(float f, float f2) {
            this.start = f;
            this.end = f2;
        }

        @Required
        public float getEnd() {
            return this.end;
        }

        @Required
        public float getStart() {
            return this.start;
        }

        @Required
        public AgeRange setEnd(float f) {
            this.end = f;
            return this;
        }

        @Required
        public AgeRange setStart(float f) {
            this.start = f;
            return this;
        }
    }

    public enum AiLocalApiType {
        f25(0),
        GET_SIGNAL(1),
        GET_SIGNAL_WITH_UNIT(2);

        private int id;

        AiLocalApiType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum AnchorPointInfoFunctionType {
        f28(0),
        f26(1),
        f27(2);

        private int id;

        AnchorPointInfoFunctionType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum AnchorPointInfoValueType {
        UNKNOWN(0),
        ENUM(1),
        NUMBER(2),
        BOOLEAN(3);

        private int id;

        AnchorPointInfoValueType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum AppName {
        UNKNOWN(-1),
        XIMALAYA(0),
        QQ_MUSIC(1),
        KUGOU_MUSIC(2),
        NETEASE_CLOUD_MUSIC(3);

        private int id;

        AppName(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class ArithIntention {
        private Optional<String> formula = Optional.a();

        public Optional<String> getFormula() {
            return this.formula;
        }

        public ArithIntention setFormula(String str) {
            this.formula = Optional.e(str);
            return this;
        }
    }

    public static class BaikeIntention {

        @Required
        private String entity;

        public BaikeIntention() {
        }

        public BaikeIntention(String str) {
            this.entity = str;
        }

        @Required
        public String getEntity() {
            return this.entity;
        }

        @Required
        public BaikeIntention setEntity(String str) {
            this.entity = str;
            return this;
        }
    }

    public enum CalendarType {
        UNKNOWN(-1),
        LUNAR(0),
        SOLAR(1),
        FACTOID_LUNAR(2);

        private int id;

        CalendarType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class ConstellationIntention {
        private Optional<String> action = Optional.a();
        private Optional<String> time_value = Optional.a();
        private Optional<String> time_origin = Optional.a();
        private Optional<TimeUnitType> time_unit = Optional.a();
        private Optional<String> constellation_name = Optional.a();
        private Optional<String> constellation_pair = Optional.a();
        private Optional<String> attribute = Optional.a();

        public Optional<String> getAction() {
            return this.action;
        }

        public Optional<String> getAttribute() {
            return this.attribute;
        }

        public Optional<String> getConstellationName() {
            return this.constellation_name;
        }

        public Optional<String> getConstellationPair() {
            return this.constellation_pair;
        }

        public Optional<String> getTimeOrigin() {
            return this.time_origin;
        }

        public Optional<TimeUnitType> getTimeUnit() {
            return this.time_unit;
        }

        public Optional<String> getTimeValue() {
            return this.time_value;
        }

        public ConstellationIntention setAction(String str) {
            this.action = Optional.e(str);
            return this;
        }

        public ConstellationIntention setAttribute(String str) {
            this.attribute = Optional.e(str);
            return this;
        }

        public ConstellationIntention setConstellationName(String str) {
            this.constellation_name = Optional.e(str);
            return this;
        }

        public ConstellationIntention setConstellationPair(String str) {
            this.constellation_pair = Optional.e(str);
            return this;
        }

        public ConstellationIntention setTimeOrigin(String str) {
            this.time_origin = Optional.e(str);
            return this;
        }

        public ConstellationIntention setTimeUnit(TimeUnitType timeUnitType) {
            this.time_unit = Optional.e(timeUnitType);
            return this;
        }

        public ConstellationIntention setTimeValue(String str) {
            this.time_value = Optional.e(str);
            return this;
        }
    }

    public enum ContactSyncState {
        UNKNOWN(-1),
        FAILURE(0),
        NOTREADY(1),
        SYNCHRONIZING(2),
        SYNCHRONIZED(3);

        private int id;

        ContactSyncState(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "DocumentSummary", namespace = AIApiConstants.Nlp.NAME)
    public static class DocumentSummary implements EventPayload {
        private Optional<String> query = Optional.a();
        private Optional<String> file_id = Optional.a();
        private Optional<String> file_name = Optional.a();
        private Optional<String> file_type = Optional.a();
        private Optional<Integer> index = Optional.a();

        public Optional<String> getFileId() {
            return this.file_id;
        }

        public Optional<String> getFileName() {
            return this.file_name;
        }

        public Optional<String> getFileType() {
            return this.file_type;
        }

        public Optional<Integer> getIndex() {
            return this.index;
        }

        public Optional<String> getQuery() {
            return this.query;
        }

        public DocumentSummary setFileId(String str) {
            this.file_id = Optional.e(str);
            return this;
        }

        public DocumentSummary setFileName(String str) {
            this.file_name = Optional.e(str);
            return this;
        }

        public DocumentSummary setFileType(String str) {
            this.file_type = Optional.e(str);
            return this;
        }

        public DocumentSummary setIndex(int i) {
            this.index = Optional.e(Integer.valueOf(i));
            return this;
        }

        public DocumentSummary setQuery(String str) {
            this.query = Optional.e(str);
            return this;
        }
    }

    public static class EducationIntention {
        private Optional<String> subject = Optional.a();
        private Optional<String> grade = Optional.a();
        private Optional<String> version = Optional.a();
        private Optional<String> volume = Optional.a();
        private Optional<String> exam = Optional.a();
        private Optional<String> tag = Optional.a();
        private Optional<String> name = Optional.a();
        private Optional<String> text_name = Optional.a();
        private Optional<String> episode = Optional.a();
        private Optional<Payment> payment = Optional.a();
        private Optional<Integer> year = Optional.a();
        private Optional<String> keyword = Optional.a();

        public Optional<String> getEpisode() {
            return this.episode;
        }

        public Optional<String> getExam() {
            return this.exam;
        }

        public Optional<String> getGrade() {
            return this.grade;
        }

        public Optional<String> getKeyword() {
            return this.keyword;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<Payment> getPayment() {
            return this.payment;
        }

        public Optional<String> getSubject() {
            return this.subject;
        }

        public Optional<String> getTag() {
            return this.tag;
        }

        public Optional<String> getTextName() {
            return this.text_name;
        }

        public Optional<String> getVersion() {
            return this.version;
        }

        public Optional<String> getVolume() {
            return this.volume;
        }

        public Optional<Integer> getYear() {
            return this.year;
        }

        public EducationIntention setEpisode(String str) {
            this.episode = Optional.e(str);
            return this;
        }

        public EducationIntention setExam(String str) {
            this.exam = Optional.e(str);
            return this;
        }

        public EducationIntention setGrade(String str) {
            this.grade = Optional.e(str);
            return this;
        }

        public EducationIntention setKeyword(String str) {
            this.keyword = Optional.e(str);
            return this;
        }

        public EducationIntention setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public EducationIntention setPayment(Payment payment) {
            this.payment = Optional.e(payment);
            return this;
        }

        public EducationIntention setSubject(String str) {
            this.subject = Optional.e(str);
            return this;
        }

        public EducationIntention setTag(String str) {
            this.tag = Optional.e(str);
            return this;
        }

        public EducationIntention setTextName(String str) {
            this.text_name = Optional.e(str);
            return this;
        }

        public EducationIntention setVersion(String str) {
            this.version = Optional.e(str);
            return this;
        }

        public EducationIntention setVolume(String str) {
            this.volume = Optional.e(str);
            return this;
        }

        public EducationIntention setYear(int i) {
            this.year = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "EventACK", namespace = AIApiConstants.Nlp.NAME)
    public static class EventACK implements InstructionPayload {

        @Required
        private int status;

        public EventACK() {
        }

        public EventACK(int i) {
            this.status = i;
        }

        @Required
        public int getStatus() {
            return this.status;
        }

        @Required
        public EventACK setStatus(int i) {
            this.status = i;
            return this;
        }
    }

    @NamespaceName(name = "ExecuteQuery", namespace = AIApiConstants.Nlp.NAME)
    public static class ExecuteQuery implements InstructionPayload {

        @Required
        private String query;

        public ExecuteQuery() {
        }

        public ExecuteQuery(String str) {
            this.query = str;
        }

        @Required
        public String getQuery() {
            return this.query;
        }

        @Required
        public ExecuteQuery setQuery(String str) {
            this.query = str;
            return this;
        }
    }

    @NamespaceName(name = "ExpectStream", namespace = AIApiConstants.Nlp.NAME)
    public static class ExpectStream implements InstructionPayload {
    }

    public enum FavListActionType {
        UNKNOWN(-1),
        COLLECT(0),
        PLAY(1),
        CANCEL(2);

        private int id;

        FavListActionType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class FavListIntention {

        @Required
        private FavListActionType action;

        @Required
        private FavListTargetType target;

        public FavListIntention() {
        }

        public FavListIntention(FavListActionType favListActionType, FavListTargetType favListTargetType) {
            this.action = favListActionType;
            this.target = favListTargetType;
        }

        @Required
        public FavListActionType getAction() {
            return this.action;
        }

        @Required
        public FavListTargetType getTarget() {
            return this.target;
        }

        @Required
        public FavListIntention setAction(FavListActionType favListActionType) {
            this.action = favListActionType;
            return this;
        }

        @Required
        public FavListIntention setTarget(FavListTargetType favListTargetType) {
            this.target = favListTargetType;
            return this;
        }
    }

    public enum FavListTargetType {
        UNKNOWN(-1),
        SONG(0),
        ARTIST(1),
        SONG_LIST(2),
        CHANNEL(3),
        STATION(4),
        ALBUM(5),
        RADIO(6);

        private int id;

        FavListTargetType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "FinishAnswer", namespace = AIApiConstants.Nlp.NAME)
    public static class FinishAnswer implements InstructionPayload {
    }

    @NamespaceName(name = "FinishPreStream", namespace = AIApiConstants.Nlp.NAME)
    public static class FinishPreStream implements InstructionPayload {
    }

    @NamespaceName(name = "FinishStream", namespace = AIApiConstants.Nlp.NAME)
    public static class FinishStream implements InstructionPayload {
    }

    public enum GenderDef {
        UNKNOWN(-1),
        MALE(0),
        FEMALE(1);

        private int id;

        GenderDef(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum HotelAction {
        UNKNOWN(-1),
        HOTEL_BOOK(0);

        private int id;

        HotelAction(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum HotelRoomType {
        UNKNOWN(-1),
        STANDARD_ROOM(0),
        DOUBLE_ROOM(1),
        KING_ROOM(2),
        SINGLE_ROOM(3);

        private int id;

        HotelRoomType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum HotelStarLevel {
        UNKNOWN(-1),
        ONE_STAR(0),
        TWO_STAR(1),
        THREE_STAR(2),
        FOUR_STAR(3),
        FIVE_STAR(4);

        private int id;

        HotelStarLevel(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum HotelType {
        UNKNOWN(-1),
        HOTEL(0);

        private int id;

        HotelType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum IntentionActionType {
        UNKNOWN(-1),
        HISTORY_QUERY(0),
        PLAY(1),
        PLAY_HISTORY(2),
        PLAY_LOCAL(3);

        private int id;

        IntentionActionType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum IntentionType {
        UNKNOWN(-1),
        STATION(0),
        RADIO(1),
        MUSIC(2),
        VIDEO(3),
        QA(4),
        FAV_LIST(5),
        PHONE(6),
        VIDEORECOG(7),
        SONGLIST(8),
        WEATHER(9),
        JOKE(10),
        NEWS(11),
        ANCIENT_POEM(12),
        SECURITY(13),
        SMART_APP(14),
        TRANSLATION(15),
        TRANSPORT_TICKET(16),
        SPORTS(17),
        BAIKE(18),
        RECIPE(19),
        CONSTELLATION(20),
        VIOLATION(21),
        ARITH(22),
        RESTRICT_DRIVING(23),
        SOUNDBOX_CONTROL(24),
        TODOLIST(25),
        TIME(26),
        HOTEL(27),
        LOTTERY(28),
        EDUCATION(29),
        MAPAPP(30),
        VOICE(31);

        private int id;

        IntentionType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class InvokeNlpRequest {

        @Required
        private String query;

        public InvokeNlpRequest() {
        }

        public InvokeNlpRequest(String str) {
            this.query = str;
        }

        @Required
        public String getQuery() {
            return this.query;
        }

        @Required
        public InvokeNlpRequest setQuery(String str) {
            this.query = str;
            return this;
        }
    }

    public enum JokeAction {
        UNKNOWN(-1),
        RAND(0),
        QUERY(1),
        DU_JI_TANG(2),
        TONGUE_TWISTER(3);

        private int id;

        JokeAction(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum JokeType {
        DEFAULT(0),
        CHILD(1),
        COMMON(2),
        ADULT(3);

        private int id;

        JokeType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "LargeLanguageModelContent", namespace = AIApiConstants.Nlp.NAME)
    public static class LargeLanguageModelContent implements InstructionPayload {
        private Optional<String> bottom_explain = Optional.a();

        public Optional<String> getBottomExplain() {
            return this.bottom_explain;
        }

        public LargeLanguageModelContent setBottomExplain(String str) {
            this.bottom_explain = Optional.e(str);
            return this;
        }
    }

    public enum LocalStrategyType {
        UNKNOWN(-1),
        MAP_NAVIGATION(0),
        SYSTEM_CONTROL(1),
        PHONE_CALL(2),
        VEHICLE_CONTROL(3),
        MUSIC(4),
        SMART_MIOT(5),
        CAR_INSTRUCTION(6),
        MULTI_INSTRUCTIONS(7),
        CAR_IOT_CONTROL(8),
        CAR_IDENTIFY(9);

        private int id;

        LocalStrategyType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum LotteryAction {
        UNKNOWN(-1),
        QUERY_HISTORY(0),
        QUERY_INTRODUCTION(1),
        QUERY_TREND(2),
        QUERY_RESULT(3),
        RECOMMEND(4),
        QUERY_TIME(5),
        BUY(6);

        private int id;

        LotteryAction(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum LotteryCategory {
        UNKNOWN(-1),
        WELFARE(0),
        SPORTS(1),
        FOOTBALL(2);

        private int id;

        LotteryCategory(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum LotteryType {
        UNKNOWN(-1),
        LOTTERY(0),
        HEBEI_ARRANGMENT_7(1),
        HENAN_22_CHOOSE_5(2),
        XINJIANG_35_CHOOSE_7(3),
        FUJIAN_31_CHOOSE_7(4),
        FUJIAN_22_CHOOSE_5(5);

        private int id;

        LotteryType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum MapAppAction {
        UNKNOWN(-1),
        NAVIGATION(0),
        SEARCH(1),
        DIRECTION(2),
        WHERE(3),
        SET_MAP_MODE(4),
        NEED_HOW_LONG(5),
        NEED_HOW_FAR(6),
        OPERATE_MAP(7),
        SEARCH_ALNOG(8),
        QUERY(9);

        private int id;

        MapAppAction(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum MapModes {
        UNKNOWN(-1),
        CAR_FOLLOWING_MODE(0),
        NORTH_MODE(1),
        FLAT_MODE(2),
        STEREO_MODE(3),
        WHOLE_JOURNEY(4),
        EXIT_WHOLE_ROUTE(5),
        SWITCH_MODE(6),
        COLLECT_POI(7),
        NEARBY_TRAFFIC_COND(8),
        MUTE_MODE(9),
        CANCEL_MUTE_MODE(10);

        private int id;

        MapModes(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class MiotEvalInfo {
        private Optional<String> miot_eval_id = Optional.a();
        private Optional<mj1> miot_eval_devices = Optional.a();
        private Optional<mj1> miot_eval_rooms = Optional.a();

        public Optional<mj1> getMiotEvalDevices() {
            return this.miot_eval_devices;
        }

        public Optional<String> getMiotEvalId() {
            return this.miot_eval_id;
        }

        public Optional<mj1> getMiotEvalRooms() {
            return this.miot_eval_rooms;
        }

        public MiotEvalInfo setMiotEvalDevices(mj1 mj1Var) {
            this.miot_eval_devices = Optional.e(mj1Var);
            return this;
        }

        public MiotEvalInfo setMiotEvalId(String str) {
            this.miot_eval_id = Optional.e(str);
            return this;
        }

        public MiotEvalInfo setMiotEvalRooms(mj1 mj1Var) {
            this.miot_eval_rooms = Optional.e(mj1Var);
            return this;
        }
    }

    public static class MusicIntention {
        private Optional<List<String>> artists = Optional.a();
        private Optional<String> song = Optional.a();
        private Optional<String> album = Optional.a();
        private Optional<String> keyword = Optional.a();
        private Optional<List<String>> tags = Optional.a();
        private Optional<IntentionActionType> action = Optional.a();
        private Optional<Period> duration = Optional.a();
        private Optional<AppName> execute_app = Optional.a();

        public Optional<IntentionActionType> getAction() {
            return this.action;
        }

        public Optional<String> getAlbum() {
            return this.album;
        }

        public Optional<List<String>> getArtists() {
            return this.artists;
        }

        public Optional<Period> getDuration() {
            return this.duration;
        }

        public Optional<AppName> getExecuteApp() {
            return this.execute_app;
        }

        public Optional<String> getKeyword() {
            return this.keyword;
        }

        public Optional<String> getSong() {
            return this.song;
        }

        public Optional<List<String>> getTags() {
            return this.tags;
        }

        public MusicIntention setAction(IntentionActionType intentionActionType) {
            this.action = Optional.e(intentionActionType);
            return this;
        }

        public MusicIntention setAlbum(String str) {
            this.album = Optional.e(str);
            return this;
        }

        public MusicIntention setArtists(List<String> list) {
            this.artists = Optional.e(list);
            return this;
        }

        public MusicIntention setDuration(Period period) {
            this.duration = Optional.e(period);
            return this;
        }

        public MusicIntention setExecuteApp(AppName appName) {
            this.execute_app = Optional.e(appName);
            return this;
        }

        public MusicIntention setKeyword(String str) {
            this.keyword = Optional.e(str);
            return this;
        }

        public MusicIntention setSong(String str) {
            this.song = Optional.e(str);
            return this;
        }

        public MusicIntention setTags(List<String> list) {
            this.tags = Optional.e(list);
            return this;
        }
    }

    public static class NewsIntention {
        private Optional<String> time = Optional.a();
        private Optional<String> area = Optional.a();
        private Optional<String> type = Optional.a();
        private Optional<String> tag = Optional.a();
        private Optional<String> keyword = Optional.a();
        private Optional<String> program = Optional.a();

        public Optional<String> getArea() {
            return this.area;
        }

        public Optional<String> getKeyword() {
            return this.keyword;
        }

        public Optional<String> getProgram() {
            return this.program;
        }

        public Optional<String> getTag() {
            return this.tag;
        }

        public Optional<String> getTime() {
            return this.time;
        }

        public Optional<String> getType() {
            return this.type;
        }

        public NewsIntention setArea(String str) {
            this.area = Optional.e(str);
            return this;
        }

        public NewsIntention setKeyword(String str) {
            this.keyword = Optional.e(str);
            return this;
        }

        public NewsIntention setProgram(String str) {
            this.program = Optional.e(str);
            return this;
        }

        public NewsIntention setTag(String str) {
            this.tag = Optional.e(str);
            return this;
        }

        public NewsIntention setTime(String str) {
            this.time = Optional.e(str);
            return this;
        }

        public NewsIntention setType(String str) {
            this.type = Optional.e(str);
            return this;
        }
    }

    public static class NlgFreqTextInfo {

        @Required
        private String nlg_key;

        @Required
        private String text;

        public NlgFreqTextInfo() {
        }

        public NlgFreqTextInfo(String str, String str2) {
            this.nlg_key = str;
            this.text = str2;
        }

        @Required
        public String getNlgKey() {
            return this.nlg_key;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public NlgFreqTextInfo setNlgKey(String str) {
            this.nlg_key = str;
            return this;
        }

        @Required
        public NlgFreqTextInfo setText(String str) {
            this.text = str;
            return this;
        }
    }

    public static class NlpSimpleDevice {

        @Required
        private String device_id;

        public NlpSimpleDevice() {
        }

        public NlpSimpleDevice(String str) {
            this.device_id = str;
        }

        @Required
        public String getDeviceId() {
            return this.device_id;
        }

        @Required
        public NlpSimpleDevice setDeviceId(String str) {
            this.device_id = str;
            return this;
        }
    }

    public static class OfflineDialogSystemResult {

        @Required
        private List<OfflineSkillAction> actions;

        @Required
        private int ask_count;

        @Required
        private List<BeliefState> belief_states;

        @Required
        private boolean is_ask;

        @Required
        private String to_speak;

        public OfflineDialogSystemResult() {
        }

        public OfflineDialogSystemResult(List<OfflineSkillAction> list, String str, boolean z, int i, List<BeliefState> list2) {
            this.actions = list;
            this.to_speak = str;
            this.is_ask = z;
            this.ask_count = i;
            this.belief_states = list2;
        }

        @Required
        public List<OfflineSkillAction> getActions() {
            return this.actions;
        }

        @Required
        public int getAskCount() {
            return this.ask_count;
        }

        @Required
        public List<BeliefState> getBeliefStates() {
            return this.belief_states;
        }

        @Required
        public String getToSpeak() {
            return this.to_speak;
        }

        @Required
        public boolean isAsk() {
            return this.is_ask;
        }

        @Required
        public OfflineDialogSystemResult setActions(List<OfflineSkillAction> list) {
            this.actions = list;
            return this;
        }

        @Required
        public OfflineDialogSystemResult setAskCount(int i) {
            this.ask_count = i;
            return this;
        }

        @Required
        public OfflineDialogSystemResult setBeliefStates(List<BeliefState> list) {
            this.belief_states = list;
            return this;
        }

        @Required
        public OfflineDialogSystemResult setIsAsk(boolean z) {
            this.is_ask = z;
            return this;
        }

        @Required
        public OfflineDialogSystemResult setToSpeak(String str) {
            this.to_speak = str;
            return this;
        }
    }

    public static class OfflineSkillAction {

        @Required
        private String name;

        @Required
        private Map<String, c4h> slots;

        @Required
        private String value;

        public OfflineSkillAction() {
        }

        public OfflineSkillAction(String str, String str2, Map<String, c4h> map) {
            this.name = str;
            this.value = str2;
            this.slots = map;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public Map<String, c4h> getSlots() {
            return this.slots;
        }

        @Required
        public String getValue() {
            return this.value;
        }

        @Required
        public OfflineSkillAction setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public OfflineSkillAction setSlots(Map<String, c4h> map) {
            this.slots = map;
            return this;
        }

        @Required
        public OfflineSkillAction setValue(String str) {
            this.value = str;
            return this;
        }
    }

    @NamespaceName(name = "OfflineState", namespace = AIApiConstants.Nlp.NAME)
    public static class OfflineState implements ContextPayload {
        private Optional<String> last_online_asr_request_id = Optional.a();
        private Optional<Boolean> enable_weak_network_merge = Optional.a();

        public Optional<String> getLastOnlineAsrRequestId() {
            return this.last_online_asr_request_id;
        }

        public Optional<Boolean> isEnableWeakNetworkMerge() {
            return this.enable_weak_network_merge;
        }

        public OfflineState setEnableWeakNetworkMerge(boolean z) {
            this.enable_weak_network_merge = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public OfflineState setLastOnlineAsrRequestId(String str) {
            this.last_online_asr_request_id = Optional.e(str);
            return this;
        }
    }

    public static class PassToLocalParams {
        private Optional<Settings.TtsStyle> speak_style = Optional.a();
        private Optional<List<NlgFreqTextInfo>> nlg_freq_texts = Optional.a();
        private Optional<Maps.MapPoiSearchResponse> map_intervene_poi_search_result = Optional.a();
        private Optional<AnchorPointInfo> anchor_point_Info = Optional.a();
        private Optional<List<String>> split_queries = Optional.a();
        private Optional<Integer> merge_tts_timeout_ms = Optional.a();
        private Optional<String> vehicle_function_version = Optional.a();

        public Optional<AnchorPointInfo> getAnchorPointInfo() {
            return this.anchor_point_Info;
        }

        public Optional<Maps.MapPoiSearchResponse> getMapIntervenePoiSearchResult() {
            return this.map_intervene_poi_search_result;
        }

        public Optional<Integer> getMergeTtsTimeoutMs() {
            return this.merge_tts_timeout_ms;
        }

        public Optional<List<NlgFreqTextInfo>> getNlgFreqTexts() {
            return this.nlg_freq_texts;
        }

        public Optional<Settings.TtsStyle> getSpeakStyle() {
            return this.speak_style;
        }

        public Optional<List<String>> getSplitQueries() {
            return this.split_queries;
        }

        public Optional<String> getVehicleFunctionVersion() {
            return this.vehicle_function_version;
        }

        public PassToLocalParams setAnchorPointInfo(AnchorPointInfo anchorPointInfo) {
            this.anchor_point_Info = Optional.e(anchorPointInfo);
            return this;
        }

        public PassToLocalParams setMapIntervenePoiSearchResult(Maps.MapPoiSearchResponse mapPoiSearchResponse) {
            this.map_intervene_poi_search_result = Optional.e(mapPoiSearchResponse);
            return this;
        }

        public PassToLocalParams setMergeTtsTimeoutMs(int i) {
            this.merge_tts_timeout_ms = Optional.e(Integer.valueOf(i));
            return this;
        }

        public PassToLocalParams setNlgFreqTexts(List<NlgFreqTextInfo> list) {
            this.nlg_freq_texts = Optional.e(list);
            return this;
        }

        public PassToLocalParams setSpeakStyle(Settings.TtsStyle ttsStyle) {
            this.speak_style = Optional.e(ttsStyle);
            return this;
        }

        public PassToLocalParams setSplitQueries(List<String> list) {
            this.split_queries = Optional.e(list);
            return this;
        }

        public PassToLocalParams setVehicleFunctionVersion(String str) {
            this.vehicle_function_version = Optional.e(str);
            return this;
        }
    }

    public enum Payment {
        UNKNOWN(-1),
        FREE(0),
        PAY(1),
        LIMITED_FREE(2);

        private int id;

        Payment(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class Period {

        @Required
        private long end_timestamp;

        @Required
        private long start_timestamp;

        public Period() {
        }

        public Period(long j, long j2) {
            this.start_timestamp = j;
            this.end_timestamp = j2;
        }

        @Required
        public long getEndTimestamp() {
            return this.end_timestamp;
        }

        @Required
        public long getStartTimestamp() {
            return this.start_timestamp;
        }

        @Required
        public Period setEndTimestamp(long j) {
            this.end_timestamp = j;
            return this;
        }

        @Required
        public Period setStartTimestamp(long j) {
            this.start_timestamp = j;
            return this;
        }
    }

    public static class PhoneCallParam {
        private Optional<ContactSyncState> contact_sync_state = Optional.a();

        public Optional<ContactSyncState> getContactSyncState() {
            return this.contact_sync_state;
        }

        public PhoneCallParam setContactSyncState(ContactSyncState contactSyncState) {
            this.contact_sync_state = Optional.e(contactSyncState);
            return this;
        }
    }

    public enum PoemAction {
        UNKNOWN(-1),
        QUERY(0),
        MEANING(1),
        AUTHOR(2),
        DYNASTY(3),
        VERSE_MEANING(4),
        PREV(5),
        NEXT(6),
        POEM_NAME(7),
        POET_VERSE(8),
        WORKS(9);

        private int id;

        PoemAction(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum PoemType {
        UNKNOWN(-1),
        POETRY(0),
        DITTIES(1),
        DRAMA(2),
        WRITING(3);

        private int id;

        PoemType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "PostBackRequest", namespace = AIApiConstants.Nlp.NAME)
    public static class PostBackRequest implements EventPayload {

        @Required
        private String token;

        public PostBackRequest() {
        }

        public PostBackRequest(String str) {
            this.token = str;
        }

        @Required
        public String getToken() {
            return this.token;
        }

        @Required
        public PostBackRequest setToken(String str) {
            this.token = str;
            return this;
        }
    }

    public static class QAIntention {

        @Required
        private List<String> ids;

        public QAIntention() {
        }

        public QAIntention(List<String> list) {
            this.ids = list;
        }

        @Required
        public List<String> getIds() {
            return this.ids;
        }

        @Required
        public QAIntention setIds(List<String> list) {
            this.ids = list;
            return this;
        }
    }

    public static class RadioIntention {
        private Optional<IntentionNameItem> name = Optional.a();
        private Optional<String> fm = Optional.a();
        private Optional<String> location = Optional.a();
        private Optional<List<String>> tags = Optional.a();

        public Optional<String> getFm() {
            return this.fm;
        }

        public Optional<String> getLocation() {
            return this.location;
        }

        public Optional<IntentionNameItem> getName() {
            return this.name;
        }

        public Optional<List<String>> getTags() {
            return this.tags;
        }

        public RadioIntention setFm(String str) {
            this.fm = Optional.e(str);
            return this;
        }

        public RadioIntention setLocation(String str) {
            this.location = Optional.e(str);
            return this;
        }

        public RadioIntention setName(IntentionNameItem intentionNameItem) {
            this.name = Optional.e(intentionNameItem);
            return this;
        }

        public RadioIntention setTags(List<String> list) {
            this.tags = Optional.e(list);
            return this;
        }
    }

    public enum RecipeAction {
        UNKNOWN(-1),
        QUERY(0),
        PRACTICE(1),
        PREPARETIME(2),
        EFFECT(3),
        SKILL(4),
        COOKTIME(5),
        STYLE(6),
        MATERIAL(7),
        TABOO(8);

        private int id;

        RecipeAction(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum RelationInTargetValueAndRealValue {
        f29(0),
        CONTAIN(1),
        NOT_CONTAIN(2);

        private int id;

        RelationInTargetValueAndRealValue(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "RequestSummaryText", namespace = AIApiConstants.Nlp.NAME)
    public static class RequestSummaryText implements InstructionPayload {
    }

    public enum RestrictDrivingAction {
        UNKNOWN(-1),
        WRITE_CAR_NUM(0),
        NO_LOCATION(1),
        WHEN_RESTRICT(2),
        REGION(3),
        PLAT_NUM(4),
        CITY_QUERY(5),
        TIME(6),
        WHY_NOT(7),
        PLATE_NUM(8),
        ASK_NUM_RESTRICT(9),
        DEDUCTION(10),
        MY_CAR_QUERY(11),
        VEHICLE_ON(12),
        VEHICLE_OFF(13),
        QUERY(14);

        private int id;

        RestrictDrivingAction(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum ScreenResolution {
        UNKNOWN(-1),
        FD(0),
        SD(1),
        HD(2),
        FULL_HD(3),
        BD(4),
        FK(5),
        HIGHER(6),
        LOWER(7),
        MAX(8),
        MIN(9);

        private int id;

        ScreenResolution(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SecurityAction {
        UNKNOWN(-1),
        RECOMMEND(0),
        GENERAL_FUTURE(1),
        QUERY_FUTURE(2),
        GENERAL(3),
        SUBSCRIBE(4),
        SUBSCRIPTION(5),
        GOLD_GAS(6),
        QUERY(7);

        private int id;

        SecurityAction(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SecurityMarketType {
        UNKNOWN(0),
        SH(1),
        SZ(2),
        US(3),
        HK(4),
        SH_INDEX(5),
        SZ_INDEX(6),
        US_INDEX(7),
        HK_INDEX(8),
        CHINA(9);

        private int id;

        SecurityMarketType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SecurityType {
        UNKNOWN(-1),
        STOCK(0),
        FUTURE(1);

        private int id;

        SecurityType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SmartAppActionType {
        UNKNOWN(-1),
        OPEN(0),
        CLOSE(1),
        CLOSE_CURRENT(2),
        INSTALL(3),
        UNINSTALL(4),
        GUIDE(5);

        private int id;

        SmartAppActionType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SmartAppHitType {
        UNKNOWN(-1),
        NONE(0),
        NAME(1),
        TAG(2);

        private int id;

        SmartAppHitType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SongListResourceType {
        UNKNOWN(-1),
        MUSIC(0),
        STATION(1);

        private int id;

        SongListResourceType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SoundboxLoopMode {
        UNKNOWN(-1),
        SINGLE(0),
        RANDOM(1),
        LIST(2),
        SEQUENCE(3);

        private int id;

        SoundboxLoopMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SourceType {
        UNKNOWN(-1),
        OFFLINE_ASR_OFFLINE_NLP(0),
        OFFLINE_ASR_ONLINE_NLP(1),
        ONLINE_ASR_ONLINE_NLP(2),
        ONLINE_ASR_OFFLINE_NLP(3);

        private int id;

        SourceType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SportCompetitionType {
        UNKNOWN(-1),
        NONE(0),
        PREMIER_LEAGUE(1),
        CHAMPIONS_LEAGUE(2),
        NBA(3),
        WORLD_CUP(4),
        OLYMPIC_GAMES(5);

        private int id;

        SportCompetitionType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SportGrainType {
        UNKNOWN(-1),
        None(0),
        YEAR(1),
        MONTH(2),
        WEEK(3),
        DAY(4),
        HOUR(5),
        MINUTE(6),
        SECOND(7),
        ARBITRARY(8),
        PART_OF_DAY(9),
        RECENT(10),
        DATETIME(11),
        DATE(12);

        private int id;

        SportGrainType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SportHomeAway {
        UNKNOWN(-1),
        None(0),
        HOME(1),
        AWAY(2);

        private int id;

        SportHomeAway(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SportRoleType {
        UNKNOWN(-1),
        None(0),
        COACH(1),
        GOAL_KEEPER(2);

        private int id;

        SportRoleType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SportStageType {
        UNKNOWN(-1),
        NONE(0),
        REGULAR(1),
        GROUP(2),
        TOP16(3),
        TOP8(4),
        FINALS(5),
        PLAYOFFS(6);

        private int id;

        SportStageType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SportStateItem {
        UNKNOWN(-1),
        None(0),
        Rebound(1),
        ASSIISTS(2),
        STEAL(3),
        CAP(4),
        HIT_RATE(5),
        FOUL(6);

        private int id;

        SportStateItem(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SportSubject {
        UNKNOWN(-1),
        NONE(0),
        SCHEDULE(1),
        MATCH_RESULT(2),
        QUALIFICATION(3),
        PREDICT(4),
        ACHIEVEMENT(5);

        private int id;

        SportSubject(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SportTargetType {
        UNKNOWN(-1),
        SCHEDULE(0),
        BOARD(1),
        TEAM_ACHIEVEMENT(2),
        PLAYER_ACHIEVEMENT(3),
        WHOLE_ACHIEVEMENT(4),
        MATCH_RESULT(5),
        TEAM_MATCH_RESULT(6),
        PLAYER_MATCH_RESULT(7),
        MATCH_RESULT_PREDICT(8),
        CHAMPION_PREDICT(9),
        QUALIFICATION(10),
        TEAM(11),
        PLAYER(12),
        FORMATION(13),
        DATETIME(14),
        COUNT(15),
        RANK(16),
        VIDEO(17),
        RATE(18);

        private int id;

        SportTargetType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SportsType {
        UNKNOWN(-1),
        NONE(0),
        BASKETBALL(1),
        SOCCER(2);

        private int id;

        SportsType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "StartAnswer", namespace = AIApiConstants.Nlp.NAME)
    public static class StartAnswer implements InstructionPayload {
    }

    @NamespaceName(name = "StartPreStream", namespace = AIApiConstants.Nlp.NAME)
    public static class StartPreStream implements InstructionPayload {
    }

    @NamespaceName(name = "StartStream", namespace = AIApiConstants.Nlp.NAME)
    public static class StartStream implements InstructionPayload {
    }

    public enum StationFilterType {
        UNKNOWN(-1),
        PURCHASED(0);

        private int id;

        StationFilterType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class StationIntention {
        private Optional<IntentionNameItem> primary_name = Optional.a();
        private Optional<IntentionNameItem> secondary_name = Optional.a();
        private Optional<Integer> season = Optional.a();
        private Optional<Integer> episode = Optional.a();
        private Optional<List<String>> artists = Optional.a();
        private Optional<List<String>> types = Optional.a();
        private Optional<List<String>> tags = Optional.a();
        private Optional<List<String>> characters = Optional.a();
        private Optional<List<StationFilterType>> filters = Optional.a();
        private Optional<Period> duration = Optional.a();
        private Optional<GenderDef> gender = Optional.a();
        private Optional<AgeRange> ageRange = Optional.a();
        private Optional<Boolean> updated = Optional.a();
        private Optional<AppName> execute_app = Optional.a();
        private Optional<IntentionActionType> action = Optional.a();

        public Optional<IntentionActionType> getAction() {
            return this.action;
        }

        public Optional<AgeRange> getAgeRange() {
            return this.ageRange;
        }

        public Optional<List<String>> getArtists() {
            return this.artists;
        }

        public Optional<List<String>> getCharacters() {
            return this.characters;
        }

        public Optional<Period> getDuration() {
            return this.duration;
        }

        public Optional<Integer> getEpisode() {
            return this.episode;
        }

        public Optional<AppName> getExecuteApp() {
            return this.execute_app;
        }

        public Optional<List<StationFilterType>> getFilters() {
            return this.filters;
        }

        public Optional<GenderDef> getGender() {
            return this.gender;
        }

        public Optional<IntentionNameItem> getPrimaryName() {
            return this.primary_name;
        }

        public Optional<Integer> getSeason() {
            return this.season;
        }

        public Optional<IntentionNameItem> getSecondaryName() {
            return this.secondary_name;
        }

        public Optional<List<String>> getTags() {
            return this.tags;
        }

        public Optional<List<String>> getTypes() {
            return this.types;
        }

        public Optional<Boolean> isUpdated() {
            return this.updated;
        }

        public StationIntention setAction(IntentionActionType intentionActionType) {
            this.action = Optional.e(intentionActionType);
            return this;
        }

        public StationIntention setAgeRange(AgeRange ageRange) {
            this.ageRange = Optional.e(ageRange);
            return this;
        }

        public StationIntention setArtists(List<String> list) {
            this.artists = Optional.e(list);
            return this;
        }

        public StationIntention setCharacters(List<String> list) {
            this.characters = Optional.e(list);
            return this;
        }

        public StationIntention setDuration(Period period) {
            this.duration = Optional.e(period);
            return this;
        }

        public StationIntention setEpisode(int i) {
            this.episode = Optional.e(Integer.valueOf(i));
            return this;
        }

        public StationIntention setExecuteApp(AppName appName) {
            this.execute_app = Optional.e(appName);
            return this;
        }

        public StationIntention setFilters(List<StationFilterType> list) {
            this.filters = Optional.e(list);
            return this;
        }

        public StationIntention setGender(GenderDef genderDef) {
            this.gender = Optional.e(genderDef);
            return this;
        }

        public StationIntention setPrimaryName(IntentionNameItem intentionNameItem) {
            this.primary_name = Optional.e(intentionNameItem);
            return this;
        }

        public StationIntention setSeason(int i) {
            this.season = Optional.e(Integer.valueOf(i));
            return this;
        }

        public StationIntention setSecondaryName(IntentionNameItem intentionNameItem) {
            this.secondary_name = Optional.e(intentionNameItem);
            return this;
        }

        public StationIntention setTags(List<String> list) {
            this.tags = Optional.e(list);
            return this;
        }

        public StationIntention setTypes(List<String> list) {
            this.types = Optional.e(list);
            return this;
        }

        public StationIntention setUpdated(boolean z) {
            this.updated = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    public enum StockPriceType {
        UNKNOWN(-1),
        CURRENT(0),
        OPENING(1),
        CLOSE(2),
        HIGH(3),
        LOW(4),
        VOLUME(5),
        TURNOVER(6),
        MARKET_VALUE(7),
        P_E_RATIO(8),
        ADVANCE_DECLINE_QUOTA(9),
        ADVANCE_DECLINE_CHANGE(10);

        private int id;

        StockPriceType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SummaryTextScenario {
        MEETING(0),
        MEDIA(1),
        COMMUNICATION(2),
        ARTICLE(3),
        MULTI_INTENTIONS(4);

        private int id;

        SummaryTextScenario(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum TimeAction {
        UNKNOWN(-1),
        ASK_LEAP(0),
        CHECK_WEEK_DAY(1),
        ASK_TGDZ(2),
        CONVERT(3),
        RECENT_FESTIVAL(4),
        ASK_DURATION(5),
        SHU_JIU(6),
        ASK_VACATION(7),
        ASK_TIME(8),
        ASK_WEEK_DAY(9),
        ASK_DATE(10),
        CHECK_DATE(11),
        RECENT_VACATION(12),
        ASK_WORKDAY(13),
        ASK_WEEK_OF_YEAR(14),
        EXIST(15);

        private int id;

        TimeAction(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum TimeUnitType {
        UNKNOWN(-1),
        DAY(0),
        WEEK(1),
        MONTH(2),
        YEAR(3);

        private int id;

        TimeUnitType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum ToDoListAction {
        UNKNOWN(-1),
        ADD(0),
        ADD_NEXT(1),
        SEARCH(2),
        DELETE(3),
        DELETE_CANCEL(4),
        EDITOR(5);

        private int id;

        ToDoListAction(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum TranslationFuncType {
        UNKNOWN(-1),
        SEARCH_SPELL(0),
        CNH_TO_OTHER(1),
        ENG_TO_CNH(2);

        private int id;

        TranslationFuncType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class TranslationIntention {

        @Required
        private String dest_lang;

        @Required
        private TranslationFuncType func;

        @Required
        private String src_lang;

        @Required
        private String word;

        public TranslationIntention() {
        }

        public TranslationIntention(TranslationFuncType translationFuncType, String str, String str2, String str3) {
            this.func = translationFuncType;
            this.word = str;
            this.src_lang = str2;
            this.dest_lang = str3;
        }

        @Required
        public String getDestLang() {
            return this.dest_lang;
        }

        @Required
        public TranslationFuncType getFunc() {
            return this.func;
        }

        @Required
        public String getSrcLang() {
            return this.src_lang;
        }

        @Required
        public String getWord() {
            return this.word;
        }

        @Required
        public TranslationIntention setDestLang(String str) {
            this.dest_lang = str;
            return this;
        }

        @Required
        public TranslationIntention setFunc(TranslationFuncType translationFuncType) {
            this.func = translationFuncType;
            return this;
        }

        @Required
        public TranslationIntention setSrcLang(String str) {
            this.src_lang = str;
            return this;
        }

        @Required
        public TranslationIntention setWord(String str) {
            this.word = str;
            return this;
        }
    }

    public enum TransportTicketAction {
        DEFAULT(0),
        INFORM_SEAT_NUMBER(1),
        INFORM_TRAFFIC_NUMBER(2),
        INFORM_GENERAL_INFO(3),
        INFORM_DEPARTURE_TIME(4),
        INFORM_TRAVEL_DURATION(5),
        INFORM_BOARDING_GATE(6),
        INFORM_ARRIVAL_TIME(7),
        INFORM_DELAY_INFO(8),
        ORDER_TRAIN_TICKET(9),
        ORDER_PANIC_TRAIN_TICKET(10),
        ORDER_FLIGHT_TICKET(11),
        SEARCH_TRAIN_TICKET(12),
        QUERY_SPRING_FESTIVAL_TRAVEL_RUSH_TIME(13),
        QUERY_SALE_DATE(14),
        QUERY_AVAILABLE_DATE(15),
        QUERY_TRAIN_TICKET(16),
        QUERY_PANIC_TRAIN_TICKET(17),
        QUERY_DAYS_TO_SALE_TIME(18),
        CLOSE_BALL(19);

        private int id;

        TransportTicketAction(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum TransportTicketType {
        DEFAULT(0),
        HIGH_SPEED_RAIL(1),
        NORMAL_TICKET(2);

        private int id;

        TransportTicketType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum TransportType {
        DEFAULT(0),
        TRAIN(1),
        BUS(2),
        FLIGHT(3);

        private int id;

        TransportType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum TravelPreference {
        UNKNOWN(-1),
        HIGH_WAY_FIRST(0),
        NO_HIGH_WAY(1),
        AVOID_CONGESTION(2),
        NO_FEE(3),
        FOLLOW_MY_SETTING(4),
        SHORTEST_TIME(5),
        SHORTEST_DISTANCE(6),
        MAIN_ROAD(7),
        SIDE_ROAD(8),
        SWITCH_ROAD(9),
        ON_VIADUCT(10),
        UNDER_VIADUCT(11);

        private int id;

        TravelPreference(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "UpdateLLMBottomExplain", namespace = AIApiConstants.Nlp.NAME)
    public static class UpdateLLMBottomExplain implements InstructionPayload {

        @Required
        private String bottom_explain;

        public UpdateLLMBottomExplain() {
        }

        public UpdateLLMBottomExplain(String str) {
            this.bottom_explain = str;
        }

        @Required
        public String getBottomExplain() {
            return this.bottom_explain;
        }

        @Required
        public UpdateLLMBottomExplain setBottomExplain(String str) {
            this.bottom_explain = str;
            return this;
        }
    }

    @NamespaceName(name = "UpdateStreamProperties", namespace = AIApiConstants.Nlp.NAME)
    public static class UpdateStreamProperties implements InstructionPayload {
        private Optional<Boolean> is_search_enhancer = Optional.a();
        private Optional<Boolean> is_simply_speak = Optional.a();

        public Optional<Boolean> isSearchEnhancer() {
            return this.is_search_enhancer;
        }

        public Optional<Boolean> isSimplySpeak() {
            return this.is_simply_speak;
        }

        public UpdateStreamProperties setIsSearchEnhancer(boolean z) {
            this.is_search_enhancer = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public UpdateStreamProperties setIsSimplySpeak(boolean z) {
            this.is_simply_speak = Optional.e(Boolean.valueOf(z));
            return this;
        }
    }

    @NamespaceName(name = "UploadDialogState", namespace = AIApiConstants.Nlp.NAME)
    public static class UploadDialogState implements EventPayload {

        @Required
        private List<dialog.DialogState> dialog_states;

        @Required
        private String last_request_id;

        public UploadDialogState() {
        }

        public UploadDialogState(String str, List<dialog.DialogState> list) {
            this.last_request_id = str;
            this.dialog_states = list;
        }

        @Required
        public List<dialog.DialogState> getDialogStates() {
            return this.dialog_states;
        }

        @Required
        public String getLastRequestId() {
            return this.last_request_id;
        }

        @Required
        public UploadDialogState setDialogStates(List<dialog.DialogState> list) {
            this.dialog_states = list;
            return this;
        }

        @Required
        public UploadDialogState setLastRequestId(String str) {
            this.last_request_id = str;
            return this;
        }
    }

    @NamespaceName(name = "UploadOfflineSession", namespace = AIApiConstants.Nlp.NAME)
    public static class UploadOfflineSession implements EventPayload {

        @Required
        private OfflineSession offline_session;

        public UploadOfflineSession() {
        }

        public UploadOfflineSession(OfflineSession offlineSession) {
            this.offline_session = offlineSession;
        }

        @Required
        public OfflineSession getOfflineSession() {
            return this.offline_session;
        }

        @Required
        public UploadOfflineSession setOfflineSession(OfflineSession offlineSession) {
            this.offline_session = offlineSession;
            return this;
        }
    }

    public static class VideoIntention {
        private Optional<String> name = Optional.a();
        private Optional<Integer> season = Optional.a();
        private Optional<String> category = Optional.a();
        private Optional<List<String>> tags = Optional.a();
        private Optional<List<String>> characters = Optional.a();
        private Optional<List<String>> directors = Optional.a();
        private Optional<Period> period = Optional.a();
        private Optional<Integer> episode = Optional.a();
        private Optional<String> style = Optional.a();
        private Optional<String> keyword = Optional.a();
        private Optional<String> theme = Optional.a();
        private Optional<String> plot = Optional.a();
        private Optional<String> emotion = Optional.a();
        private Optional<String> subject = Optional.a();
        private Optional<String> time = Optional.a();
        private Optional<String> video_type = Optional.a();
        private Optional<Boolean> payment = Optional.a();
        private Optional<String> area = Optional.a();
        private Optional<String> award = Optional.a();
        private Optional<String> resolution = Optional.a();
        private Optional<String> rating = Optional.a();
        private Optional<String> age = Optional.a();
        private Optional<String> language = Optional.a();
        private Optional<String> vtype = Optional.a();
        private Optional<String> publisher = Optional.a();
        private Optional<VideoOrder> popularity = Optional.a();
        private Optional<VideoOrder> year_order = Optional.a();
        private Optional<String> award_year = Optional.a();

        public Optional<String> getAge() {
            return this.age;
        }

        public Optional<String> getArea() {
            return this.area;
        }

        public Optional<String> getAward() {
            return this.award;
        }

        public Optional<String> getAwardYear() {
            return this.award_year;
        }

        public Optional<String> getCategory() {
            return this.category;
        }

        public Optional<List<String>> getCharacters() {
            return this.characters;
        }

        public Optional<List<String>> getDirectors() {
            return this.directors;
        }

        public Optional<String> getEmotion() {
            return this.emotion;
        }

        public Optional<Integer> getEpisode() {
            return this.episode;
        }

        public Optional<String> getKeyword() {
            return this.keyword;
        }

        public Optional<String> getLanguage() {
            return this.language;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<Period> getPeriod() {
            return this.period;
        }

        public Optional<String> getPlot() {
            return this.plot;
        }

        public Optional<VideoOrder> getPopularity() {
            return this.popularity;
        }

        public Optional<String> getPublisher() {
            return this.publisher;
        }

        public Optional<String> getRating() {
            return this.rating;
        }

        public Optional<String> getResolution() {
            return this.resolution;
        }

        public Optional<Integer> getSeason() {
            return this.season;
        }

        public Optional<String> getStyle() {
            return this.style;
        }

        public Optional<String> getSubject() {
            return this.subject;
        }

        public Optional<List<String>> getTags() {
            return this.tags;
        }

        public Optional<String> getTheme() {
            return this.theme;
        }

        public Optional<String> getTime() {
            return this.time;
        }

        public Optional<String> getVideoType() {
            return this.video_type;
        }

        public Optional<String> getVtype() {
            return this.vtype;
        }

        public Optional<VideoOrder> getYearOrder() {
            return this.year_order;
        }

        public Optional<Boolean> isPayment() {
            return this.payment;
        }

        public VideoIntention setAge(String str) {
            this.age = Optional.e(str);
            return this;
        }

        public VideoIntention setArea(String str) {
            this.area = Optional.e(str);
            return this;
        }

        public VideoIntention setAward(String str) {
            this.award = Optional.e(str);
            return this;
        }

        public VideoIntention setAwardYear(String str) {
            this.award_year = Optional.e(str);
            return this;
        }

        public VideoIntention setCategory(String str) {
            this.category = Optional.e(str);
            return this;
        }

        public VideoIntention setCharacters(List<String> list) {
            this.characters = Optional.e(list);
            return this;
        }

        public VideoIntention setDirectors(List<String> list) {
            this.directors = Optional.e(list);
            return this;
        }

        public VideoIntention setEmotion(String str) {
            this.emotion = Optional.e(str);
            return this;
        }

        public VideoIntention setEpisode(int i) {
            this.episode = Optional.e(Integer.valueOf(i));
            return this;
        }

        public VideoIntention setKeyword(String str) {
            this.keyword = Optional.e(str);
            return this;
        }

        public VideoIntention setLanguage(String str) {
            this.language = Optional.e(str);
            return this;
        }

        public VideoIntention setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public VideoIntention setPayment(boolean z) {
            this.payment = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public VideoIntention setPeriod(Period period) {
            this.period = Optional.e(period);
            return this;
        }

        public VideoIntention setPlot(String str) {
            this.plot = Optional.e(str);
            return this;
        }

        public VideoIntention setPopularity(VideoOrder videoOrder) {
            this.popularity = Optional.e(videoOrder);
            return this;
        }

        public VideoIntention setPublisher(String str) {
            this.publisher = Optional.e(str);
            return this;
        }

        public VideoIntention setRating(String str) {
            this.rating = Optional.e(str);
            return this;
        }

        public VideoIntention setResolution(String str) {
            this.resolution = Optional.e(str);
            return this;
        }

        public VideoIntention setSeason(int i) {
            this.season = Optional.e(Integer.valueOf(i));
            return this;
        }

        public VideoIntention setStyle(String str) {
            this.style = Optional.e(str);
            return this;
        }

        public VideoIntention setSubject(String str) {
            this.subject = Optional.e(str);
            return this;
        }

        public VideoIntention setTags(List<String> list) {
            this.tags = Optional.e(list);
            return this;
        }

        public VideoIntention setTheme(String str) {
            this.theme = Optional.e(str);
            return this;
        }

        public VideoIntention setTime(String str) {
            this.time = Optional.e(str);
            return this;
        }

        public VideoIntention setVideoType(String str) {
            this.video_type = Optional.e(str);
            return this;
        }

        public VideoIntention setVtype(String str) {
            this.vtype = Optional.e(str);
            return this;
        }

        public VideoIntention setYearOrder(VideoOrder videoOrder) {
            this.year_order = Optional.e(videoOrder);
            return this;
        }
    }

    public enum VideoOrder {
        UNKNOWN(-1),
        DES(0),
        ASC(1);

        private int id;

        VideoOrder(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum ViolationAction {
        UNKNOWN(-1),
        QUERY(0);

        private int id;

        ViolationAction(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class VoiceIntention {
        private Optional<String> query = Optional.a();
        private Optional<String> object = Optional.a();
        private Optional<String> last_object = Optional.a();
        private Optional<VoiceSlotType> slot = Optional.a();

        public Optional<String> getLastObject() {
            return this.last_object;
        }

        public Optional<String> getObject() {
            return this.object;
        }

        public Optional<String> getQuery() {
            return this.query;
        }

        public Optional<VoiceSlotType> getSlot() {
            return this.slot;
        }

        public VoiceIntention setLastObject(String str) {
            this.last_object = Optional.e(str);
            return this;
        }

        public VoiceIntention setObject(String str) {
            this.object = Optional.e(str);
            return this;
        }

        public VoiceIntention setQuery(String str) {
            this.query = Optional.e(str);
            return this;
        }

        public VoiceIntention setSlot(VoiceSlotType voiceSlotType) {
            this.slot = Optional.e(voiceSlotType);
            return this;
        }
    }

    public enum VoiceSlotType {
        UNKNOWN(-1),
        ANIMAL(0),
        SIMULATOR(1),
        INTERESTING(2),
        WHITE_NOISE(3),
        TYPE(4),
        TRIVIA(5),
        CHARACTER_VOICE(6),
        RECOMMEND(7),
        NEXT(8),
        NATURE(9),
        BLACK(10),
        UNKNOWN_OBJECT(11),
        NO_SOUND(12);

        private int id;

        VoiceSlotType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum WeatherBroadcastType {
        UNKNOWN(-1),
        FORECAST(0),
        CURRENT(1);

        private int id;

        WeatherBroadcastType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum WeatherIntentType {
        DEFAULT(0),
        HUMIDITY_TIME(1),
        HUMIDITY_DATE(2),
        HUMIDITY_DURATION(3),
        SUN_RISE_INQUIRY(4),
        SUN_SET_INQUIRY(5),
        CAR_WASH_INQUIRY(6),
        UV_INQUIRY(7),
        SPORT_INQUIRY(8),
        SPECIFIC_CLOTHES_INQUIRY(9),
        CLOTHES_INQUIRY(10),
        TYPHOON_ASSERT(11),
        ALERT_ASSERT(12),
        METEOR_INQUIRY_HOUR_DATE(13),
        METEOR_ASSERT_DATE_RANGE(14),
        TEMP_MAX(15),
        TEMP_MIN(16),
        TEMP_INQUIRY(17),
        AIR_ASSERT(18),
        AIR_ASSERT_DATE_RANGE(19),
        WIND_ASSERT(20),
        WIND_ASSERT_DATE_RANGE(21),
        TEMP_INQUIRY_DATE_RANGE(22),
        TEMP_ASSERT_DATE_RANGE(23),
        AIR_INQUIRY_DATE_RANGE(24),
        AIR_INQUIRY(25),
        TEMP_ASSERT(26),
        WEATHER_INQUIRY(27),
        WEATHER_INQUIRY_DATE_RANGE(28),
        METEOR_ASSERT(29);

        private int id;

        WeatherIntentType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum WeatherSportType {
        UNKNOWN(-1),
        SPORT(0),
        TRAVEL(1);

        private int id;

        WeatherSportType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "AuxiliaryIntention", namespace = AIApiConstants.Nlp.NAME)
    public static class AuxiliaryIntention implements InstructionPayload {

        @Required
        private c4h intention;
        private Optional<String> three_level_intent_name = Optional.a();

        @Required
        private IntentionType type;

        public AuxiliaryIntention() {
        }

        @Required
        public c4h getIntention() {
            return this.intention;
        }

        public Optional<String> getThreeLevelIntentName() {
            return this.three_level_intent_name;
        }

        @Required
        public IntentionType getType() {
            return this.type;
        }

        @Required
        public AuxiliaryIntention setIntention(c4h c4hVar) {
            this.intention = c4hVar;
            return this;
        }

        public AuxiliaryIntention setThreeLevelIntentName(String str) {
            this.three_level_intent_name = Optional.e(str);
            return this;
        }

        @Required
        public AuxiliaryIntention setType(IntentionType intentionType) {
            this.type = intentionType;
            return this;
        }

        public AuxiliaryIntention(IntentionType intentionType, c4h c4hVar) {
            this.type = intentionType;
            this.intention = c4hVar;
        }
    }

    @NamespaceName(name = "ConstructRequest", namespace = AIApiConstants.Nlp.NAME)
    public static class ConstructRequest implements InstructionPayload {

        @Required
        private c4h request;
        private Optional<Integer> trigger_after = Optional.a();

        public ConstructRequest() {
        }

        @Required
        public c4h getRequest() {
            return this.request;
        }

        public Optional<Integer> getTriggerAfter() {
            return this.trigger_after;
        }

        @Required
        public ConstructRequest setRequest(c4h c4hVar) {
            this.request = c4hVar;
            return this;
        }

        public ConstructRequest setTriggerAfter(int i) {
            this.trigger_after = Optional.e(Integer.valueOf(i));
            return this;
        }

        public ConstructRequest(c4h c4hVar) {
            this.request = c4hVar;
        }
    }

    public static class IntentionNameItem {
        private Optional<String> keyword = Optional.a();

        @Required
        private String name;

        public IntentionNameItem() {
        }

        public Optional<String> getKeyword() {
            return this.keyword;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public IntentionNameItem setKeyword(String str) {
            this.keyword = Optional.e(str);
            return this;
        }

        @Required
        public IntentionNameItem setName(String str) {
            this.name = str;
            return this;
        }

        public IntentionNameItem(String str) {
            this.name = str;
        }
    }

    @NamespaceName(name = "LocalStrategy", namespace = AIApiConstants.Nlp.NAME)
    public static class LocalStrategy implements InstructionPayload {

        @Required
        private List<String> instruction_ids;
        private Optional<PassToLocalParams> pass_to_local_params = Optional.a();

        @Required
        private LocalStrategyType strategy_type;

        public LocalStrategy() {
        }

        @Required
        public List<String> getInstructionIds() {
            return this.instruction_ids;
        }

        public Optional<PassToLocalParams> getPassToLocalParams() {
            return this.pass_to_local_params;
        }

        @Required
        public LocalStrategyType getStrategyType() {
            return this.strategy_type;
        }

        @Required
        public LocalStrategy setInstructionIds(List<String> list) {
            this.instruction_ids = list;
            return this;
        }

        public LocalStrategy setPassToLocalParams(PassToLocalParams passToLocalParams) {
            this.pass_to_local_params = Optional.e(passToLocalParams);
            return this;
        }

        @Required
        public LocalStrategy setStrategyType(LocalStrategyType localStrategyType) {
            this.strategy_type = localStrategyType;
            return this;
        }

        public LocalStrategy(LocalStrategyType localStrategyType, List<String> list) {
            this.strategy_type = localStrategyType;
            this.instruction_ids = list;
        }
    }

    public static class SecurityIntention {

        @Required
        private SecurityAction action;

        @Required
        private String datetime;

        @Required
        private String datetime_word;

        @Required
        private String security_code;

        @Required
        private SecurityMarketType security_market;

        @Required
        private String security_norm_name;

        @Required
        private String security_query_name;

        @Required
        private SecurityType security_type;
        private Optional<StockPriceType> stock_price = Optional.a();

        public SecurityIntention() {
        }

        @Required
        public SecurityAction getAction() {
            return this.action;
        }

        @Required
        public String getDatetime() {
            return this.datetime;
        }

        @Required
        public String getDatetimeWord() {
            return this.datetime_word;
        }

        @Required
        public String getSecurityCode() {
            return this.security_code;
        }

        @Required
        public SecurityMarketType getSecurityMarket() {
            return this.security_market;
        }

        @Required
        public String getSecurityNormName() {
            return this.security_norm_name;
        }

        @Required
        public String getSecurityQueryName() {
            return this.security_query_name;
        }

        @Required
        public SecurityType getSecurityType() {
            return this.security_type;
        }

        public Optional<StockPriceType> getStockPrice() {
            return this.stock_price;
        }

        @Required
        public SecurityIntention setAction(SecurityAction securityAction) {
            this.action = securityAction;
            return this;
        }

        @Required
        public SecurityIntention setDatetime(String str) {
            this.datetime = str;
            return this;
        }

        @Required
        public SecurityIntention setDatetimeWord(String str) {
            this.datetime_word = str;
            return this;
        }

        @Required
        public SecurityIntention setSecurityCode(String str) {
            this.security_code = str;
            return this;
        }

        @Required
        public SecurityIntention setSecurityMarket(SecurityMarketType securityMarketType) {
            this.security_market = securityMarketType;
            return this;
        }

        @Required
        public SecurityIntention setSecurityNormName(String str) {
            this.security_norm_name = str;
            return this;
        }

        @Required
        public SecurityIntention setSecurityQueryName(String str) {
            this.security_query_name = str;
            return this;
        }

        @Required
        public SecurityIntention setSecurityType(SecurityType securityType) {
            this.security_type = securityType;
            return this;
        }

        public SecurityIntention setStockPrice(StockPriceType stockPriceType) {
            this.stock_price = Optional.e(stockPriceType);
            return this;
        }

        public SecurityIntention(SecurityAction securityAction, String str, String str2, SecurityType securityType, String str3, String str4, String str5, SecurityMarketType securityMarketType) {
            this.action = securityAction;
            this.datetime = str;
            this.datetime_word = str2;
            this.security_type = securityType;
            this.security_query_name = str3;
            this.security_norm_name = str4;
            this.security_code = str5;
            this.security_market = securityMarketType;
        }
    }

    public static class ToDoListIntention {

        @Required
        private ToDoListAction action;
        private Optional<String> todo = Optional.a();

        public ToDoListIntention() {
        }

        @Required
        public ToDoListAction getAction() {
            return this.action;
        }

        public Optional<String> getTodo() {
            return this.todo;
        }

        @Required
        public ToDoListIntention setAction(ToDoListAction toDoListAction) {
            this.action = toDoListAction;
            return this;
        }

        public ToDoListIntention setTodo(String str) {
            this.todo = Optional.e(str);
            return this;
        }

        public ToDoListIntention(ToDoListAction toDoListAction) {
            this.action = toDoListAction;
        }
    }

    @NamespaceName(name = "IntentsWithRelation", namespace = AIApiConstants.Nlp.NAME)
    public static class IntentsWithRelation implements InstructionPayload {

        @Required
        private c4h intent;
        private Optional<List<dialog.DialogState>> dialog_states = Optional.a();
        private Optional<List<dialog.DialogState>> parser_score_dialog_states = Optional.a();

        public IntentsWithRelation() {
        }

        public Optional<List<dialog.DialogState>> getDialogStates() {
            return this.dialog_states;
        }

        @Required
        public c4h getIntent() {
            return this.intent;
        }

        public Optional<List<dialog.DialogState>> getParserScoreDialogStates() {
            return this.parser_score_dialog_states;
        }

        public IntentsWithRelation setDialogStates(List<dialog.DialogState> list) {
            this.dialog_states = Optional.e(list);
            return this;
        }

        @Required
        public IntentsWithRelation setIntent(c4h c4hVar) {
            this.intent = c4hVar;
            return this;
        }

        public IntentsWithRelation setParserScoreDialogStates(List<dialog.DialogState> list) {
            this.parser_score_dialog_states = Optional.e(list);
            return this;
        }

        public IntentsWithRelation(c4h c4hVar) {
            this.intent = c4hVar;
        }
    }

    public static class JokeIntention {

        @Required
        private JokeAction action;

        @Required
        private boolean is_multi_turn;

        @Required
        private JokeType joke_type;
        private Optional<String> keyword = Optional.a();
        private Optional<String> tags = Optional.a();

        public JokeIntention() {
        }

        @Required
        public JokeAction getAction() {
            return this.action;
        }

        @Required
        public JokeType getJokeType() {
            return this.joke_type;
        }

        public Optional<String> getKeyword() {
            return this.keyword;
        }

        public Optional<String> getTags() {
            return this.tags;
        }

        @Required
        public boolean isMultiTurn() {
            return this.is_multi_turn;
        }

        @Required
        public JokeIntention setAction(JokeAction jokeAction) {
            this.action = jokeAction;
            return this;
        }

        @Required
        public JokeIntention setIsMultiTurn(boolean z) {
            this.is_multi_turn = z;
            return this;
        }

        @Required
        public JokeIntention setJokeType(JokeType jokeType) {
            this.joke_type = jokeType;
            return this;
        }

        public JokeIntention setKeyword(String str) {
            this.keyword = Optional.e(str);
            return this;
        }

        public JokeIntention setTags(String str) {
            this.tags = Optional.e(str);
            return this;
        }

        public JokeIntention(JokeAction jokeAction, JokeType jokeType, boolean z) {
            this.action = jokeAction;
            this.joke_type = jokeType;
            this.is_multi_turn = z;
        }
    }

    @NamespaceName(name = "OfflineSession", namespace = AIApiConstants.Nlp.NAME)
    public static class OfflineSession implements ContextPayload {

        @Required
        private List<OfflineSessionItemInfo> data;
        private Optional<OfflineDialogSystemResult> dialog_system_result = Optional.a();
        private Optional<Long> client_timestamp = Optional.a();

        public OfflineSession() {
        }

        public Optional<Long> getClientTimestamp() {
            return this.client_timestamp;
        }

        @Required
        public List<OfflineSessionItemInfo> getData() {
            return this.data;
        }

        public Optional<OfflineDialogSystemResult> getDialogSystemResult() {
            return this.dialog_system_result;
        }

        public OfflineSession setClientTimestamp(long j) {
            this.client_timestamp = Optional.e(Long.valueOf(j));
            return this;
        }

        @Required
        public OfflineSession setData(List<OfflineSessionItemInfo> list) {
            this.data = list;
            return this;
        }

        public OfflineSession setDialogSystemResult(OfflineDialogSystemResult offlineDialogSystemResult) {
            this.dialog_system_result = Optional.e(offlineDialogSystemResult);
            return this;
        }

        public OfflineSession(List<OfflineSessionItemInfo> list) {
            this.data = list;
        }
    }

    @NamespaceName(name = "Request", namespace = AIApiConstants.Nlp.NAME)
    public static class Request implements EventPayload {

        @Required
        private String query;
        private Optional<String> locale = Optional.a();
        private Optional<Settings.TtsConfig> tts = Optional.a();

        public Request() {
        }

        public Optional<String> getLocale() {
            return this.locale;
        }

        @Required
        public String getQuery() {
            return this.query;
        }

        public Optional<Settings.TtsConfig> getTts() {
            return this.tts;
        }

        public Request setLocale(String str) {
            this.locale = Optional.e(str);
            return this;
        }

        @Required
        public Request setQuery(String str) {
            this.query = str;
            return this;
        }

        public Request setTts(Settings.TtsConfig ttsConfig) {
            this.tts = Optional.e(ttsConfig);
            return this;
        }

        public Request(String str) {
            this.query = str;
        }
    }

    public static class SmartAppIntention {

        @Required
        private SmartAppActionType action;

        @Required
        private SmartAppHitType hit_type;
        private Optional<String> name = Optional.a();
        private Optional<String> tag = Optional.a();

        public SmartAppIntention() {
        }

        @Required
        public SmartAppActionType getAction() {
            return this.action;
        }

        @Required
        public SmartAppHitType getHitType() {
            return this.hit_type;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<String> getTag() {
            return this.tag;
        }

        @Required
        public SmartAppIntention setAction(SmartAppActionType smartAppActionType) {
            this.action = smartAppActionType;
            return this;
        }

        @Required
        public SmartAppIntention setHitType(SmartAppHitType smartAppHitType) {
            this.hit_type = smartAppHitType;
            return this;
        }

        public SmartAppIntention setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public SmartAppIntention setTag(String str) {
            this.tag = Optional.e(str);
            return this;
        }

        public SmartAppIntention(SmartAppActionType smartAppActionType, SmartAppHitType smartAppHitType) {
            this.action = smartAppActionType;
            this.hit_type = smartAppHitType;
        }
    }

    public static class ViolationIntention {

        @Required
        private ViolationAction action;
        private Optional<String> car = Optional.a();
        private Optional<String> number = Optional.a();

        public ViolationIntention() {
        }

        @Required
        public ViolationAction getAction() {
            return this.action;
        }

        public Optional<String> getCar() {
            return this.car;
        }

        public Optional<String> getNumber() {
            return this.number;
        }

        @Required
        public ViolationIntention setAction(ViolationAction violationAction) {
            this.action = violationAction;
            return this;
        }

        public ViolationIntention setCar(String str) {
            this.car = Optional.e(str);
            return this;
        }

        public ViolationIntention setNumber(String str) {
            this.number = Optional.e(str);
            return this;
        }

        public ViolationIntention(ViolationAction violationAction) {
            this.action = violationAction;
        }
    }

    @NamespaceName(name = "SummaryText", namespace = AIApiConstants.Nlp.NAME)
    public static class SummaryText implements EventPayload {

        @Required
        private SummaryTextScenario scenario;

        @Required
        private List<String> text;
        private Optional<String> dest_lang = Optional.a();
        private Optional<List<String>> split_queries = Optional.a();
        private Optional<String> query = Optional.a();

        public SummaryText() {
        }

        public Optional<String> getDestLang() {
            return this.dest_lang;
        }

        public Optional<String> getQuery() {
            return this.query;
        }

        @Required
        public SummaryTextScenario getScenario() {
            return this.scenario;
        }

        public Optional<List<String>> getSplitQueries() {
            return this.split_queries;
        }

        @Required
        public List<String> getText() {
            return this.text;
        }

        public SummaryText setDestLang(String str) {
            this.dest_lang = Optional.e(str);
            return this;
        }

        public SummaryText setQuery(String str) {
            this.query = Optional.e(str);
            return this;
        }

        @Required
        public SummaryText setScenario(SummaryTextScenario summaryTextScenario) {
            this.scenario = summaryTextScenario;
            return this;
        }

        public SummaryText setSplitQueries(List<String> list) {
            this.split_queries = Optional.e(list);
            return this;
        }

        @Required
        public SummaryText setText(List<String> list) {
            this.text = list;
            return this;
        }

        public SummaryText(SummaryTextScenario summaryTextScenario, List<String> list) {
            this.scenario = summaryTextScenario;
            this.text = list;
        }
    }

    public static class SonglistIntention {

        @Required
        private boolean kid_mode;

        @Required
        private int offset;

        @Required
        private String prefer_source;

        @Required
        private SongListResourceType resource_type;

        @Required
        private int total;
        private Optional<String> list_name = Optional.a();
        private Optional<String> list_id = Optional.a();
        private Optional<String> album_id = Optional.a();
        private Optional<String> album_name = Optional.a();

        public SonglistIntention() {
        }

        public Optional<String> getAlbumId() {
            return this.album_id;
        }

        public Optional<String> getAlbumName() {
            return this.album_name;
        }

        public Optional<String> getListId() {
            return this.list_id;
        }

        public Optional<String> getListName() {
            return this.list_name;
        }

        @Required
        public int getOffset() {
            return this.offset;
        }

        @Required
        public String getPreferSource() {
            return this.prefer_source;
        }

        @Required
        public SongListResourceType getResourceType() {
            return this.resource_type;
        }

        @Required
        public int getTotal() {
            return this.total;
        }

        @Required
        public boolean isKidMode() {
            return this.kid_mode;
        }

        public SonglistIntention setAlbumId(String str) {
            this.album_id = Optional.e(str);
            return this;
        }

        public SonglistIntention setAlbumName(String str) {
            this.album_name = Optional.e(str);
            return this;
        }

        @Required
        public SonglistIntention setKidMode(boolean z) {
            this.kid_mode = z;
            return this;
        }

        public SonglistIntention setListId(String str) {
            this.list_id = Optional.e(str);
            return this;
        }

        public SonglistIntention setListName(String str) {
            this.list_name = Optional.e(str);
            return this;
        }

        @Required
        public SonglistIntention setOffset(int i) {
            this.offset = i;
            return this;
        }

        @Required
        public SonglistIntention setPreferSource(String str) {
            this.prefer_source = str;
            return this;
        }

        @Required
        public SonglistIntention setResourceType(SongListResourceType songListResourceType) {
            this.resource_type = songListResourceType;
            return this;
        }

        @Required
        public SonglistIntention setTotal(int i) {
            this.total = i;
            return this;
        }

        public SonglistIntention(SongListResourceType songListResourceType, String str, int i, int i2, boolean z) {
            this.resource_type = songListResourceType;
            this.prefer_source = str;
            this.total = i;
            this.offset = i2;
            this.kid_mode = z;
        }
    }

    public static class PoemIntention {

        @Required
        private PoemAction action;
        private Optional<String> poet = Optional.a();
        private Optional<String> title = Optional.a();
        private Optional<String> verse = Optional.a();
        private Optional<String> dynasty = Optional.a();
        private Optional<PoemType> poem_type = Optional.a();

        public PoemIntention() {
        }

        @Required
        public PoemAction getAction() {
            return this.action;
        }

        public Optional<String> getDynasty() {
            return this.dynasty;
        }

        public Optional<PoemType> getPoemType() {
            return this.poem_type;
        }

        public Optional<String> getPoet() {
            return this.poet;
        }

        public Optional<String> getTitle() {
            return this.title;
        }

        public Optional<String> getVerse() {
            return this.verse;
        }

        @Required
        public PoemIntention setAction(PoemAction poemAction) {
            this.action = poemAction;
            return this;
        }

        public PoemIntention setDynasty(String str) {
            this.dynasty = Optional.e(str);
            return this;
        }

        public PoemIntention setPoemType(PoemType poemType) {
            this.poem_type = Optional.e(poemType);
            return this;
        }

        public PoemIntention setPoet(String str) {
            this.poet = Optional.e(str);
            return this;
        }

        public PoemIntention setTitle(String str) {
            this.title = Optional.e(str);
            return this;
        }

        public PoemIntention setVerse(String str) {
            this.verse = Optional.e(str);
            return this;
        }

        public PoemIntention(PoemAction poemAction) {
            this.action = poemAction;
        }
    }

    @NamespaceName(name = "RequestLargeLanguageModelContent", namespace = AIApiConstants.Nlp.NAME)
    public static class RequestLargeLanguageModelContent implements EventPayload {

        @Required
        private String query;
        private Optional<String> skill_id = Optional.a();
        private Optional<Boolean> change_llm_vendor = Optional.a();
        private Optional<Boolean> is_search_enhancer = Optional.a();
        private Optional<AIRelayParam> ai_reply = Optional.a();
        private Optional<PhoneCallParam> phone_call = Optional.a();

        public RequestLargeLanguageModelContent() {
        }

        public Optional<AIRelayParam> getAiReply() {
            return this.ai_reply;
        }

        public Optional<PhoneCallParam> getPhoneCall() {
            return this.phone_call;
        }

        @Required
        public String getQuery() {
            return this.query;
        }

        public Optional<String> getSkillId() {
            return this.skill_id;
        }

        public Optional<Boolean> isChangeLlmVendor() {
            return this.change_llm_vendor;
        }

        public Optional<Boolean> isSearchEnhancer() {
            return this.is_search_enhancer;
        }

        public RequestLargeLanguageModelContent setAiReply(AIRelayParam aIRelayParam) {
            this.ai_reply = Optional.e(aIRelayParam);
            return this;
        }

        public RequestLargeLanguageModelContent setChangeLlmVendor(boolean z) {
            this.change_llm_vendor = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public RequestLargeLanguageModelContent setIsSearchEnhancer(boolean z) {
            this.is_search_enhancer = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public RequestLargeLanguageModelContent setPhoneCall(PhoneCallParam phoneCallParam) {
            this.phone_call = Optional.e(phoneCallParam);
            return this;
        }

        @Required
        public RequestLargeLanguageModelContent setQuery(String str) {
            this.query = str;
            return this;
        }

        public RequestLargeLanguageModelContent setSkillId(String str) {
            this.skill_id = Optional.e(str);
            return this;
        }

        public RequestLargeLanguageModelContent(String str) {
            this.query = str;
        }
    }

    public static class RestrictDrivingIntention {

        @Required
        private RestrictDrivingAction action;
        private Optional<String> date = Optional.a();
        private Optional<String> city = Optional.a();
        private Optional<Integer> restrict_num = Optional.a();
        private Optional<String> plate_num = Optional.a();
        private Optional<String> time_spec = Optional.a();

        public RestrictDrivingIntention() {
        }

        @Required
        public RestrictDrivingAction getAction() {
            return this.action;
        }

        public Optional<String> getCity() {
            return this.city;
        }

        public Optional<String> getDate() {
            return this.date;
        }

        public Optional<String> getPlateNum() {
            return this.plate_num;
        }

        public Optional<Integer> getRestrictNum() {
            return this.restrict_num;
        }

        public Optional<String> getTimeSpec() {
            return this.time_spec;
        }

        @Required
        public RestrictDrivingIntention setAction(RestrictDrivingAction restrictDrivingAction) {
            this.action = restrictDrivingAction;
            return this;
        }

        public RestrictDrivingIntention setCity(String str) {
            this.city = Optional.e(str);
            return this;
        }

        public RestrictDrivingIntention setDate(String str) {
            this.date = Optional.e(str);
            return this;
        }

        public RestrictDrivingIntention setPlateNum(String str) {
            this.plate_num = Optional.e(str);
            return this;
        }

        public RestrictDrivingIntention setRestrictNum(int i) {
            this.restrict_num = Optional.e(Integer.valueOf(i));
            return this;
        }

        public RestrictDrivingIntention setTimeSpec(String str) {
            this.time_spec = Optional.e(str);
            return this;
        }

        public RestrictDrivingIntention(RestrictDrivingAction restrictDrivingAction) {
            this.action = restrictDrivingAction;
        }
    }

    @NamespaceName(name = "LoadMore", namespace = AIApiConstants.Nlp.NAME)
    public static class LoadMore implements EventPayload {

        @Required
        private String origin_id;
        private Optional<String> token = Optional.a();
        private Optional<Integer> offset = Optional.a();
        private Optional<Integer> delta = Optional.a();
        private Optional<Video.DisplayCategory> category = Optional.a();
        private Optional<Video.DisplayMatchLevel> match_level = Optional.a();
        private Optional<String> origin_voice_request_id = Optional.a();

        public LoadMore() {
        }

        public Optional<Video.DisplayCategory> getCategory() {
            return this.category;
        }

        public Optional<Integer> getDelta() {
            return this.delta;
        }

        public Optional<Video.DisplayMatchLevel> getMatchLevel() {
            return this.match_level;
        }

        public Optional<Integer> getOffset() {
            return this.offset;
        }

        @Required
        public String getOriginId() {
            return this.origin_id;
        }

        public Optional<String> getOriginVoiceRequestId() {
            return this.origin_voice_request_id;
        }

        public Optional<String> getToken() {
            return this.token;
        }

        public LoadMore setCategory(Video.DisplayCategory displayCategory) {
            this.category = Optional.e(displayCategory);
            return this;
        }

        public LoadMore setDelta(int i) {
            this.delta = Optional.e(Integer.valueOf(i));
            return this;
        }

        public LoadMore setMatchLevel(Video.DisplayMatchLevel displayMatchLevel) {
            this.match_level = Optional.e(displayMatchLevel);
            return this;
        }

        public LoadMore setOffset(int i) {
            this.offset = Optional.e(Integer.valueOf(i));
            return this;
        }

        @Required
        public LoadMore setOriginId(String str) {
            this.origin_id = str;
            return this;
        }

        public LoadMore setOriginVoiceRequestId(String str) {
            this.origin_voice_request_id = Optional.e(str);
            return this;
        }

        public LoadMore setToken(String str) {
            this.token = Optional.e(str);
            return this;
        }

        public LoadMore(String str) {
            this.origin_id = str;
        }
    }

    public static class LotteryIntention {

        @Required
        private LotteryAction action;
        private Optional<LotteryType> lottery = Optional.a();
        private Optional<LotteryCategory> category = Optional.a();
        private Optional<String> name = Optional.a();
        private Optional<String> area = Optional.a();
        private Optional<String> time = Optional.a();
        private Optional<Integer> issue = Optional.a();

        public LotteryIntention() {
        }

        @Required
        public LotteryAction getAction() {
            return this.action;
        }

        public Optional<String> getArea() {
            return this.area;
        }

        public Optional<LotteryCategory> getCategory() {
            return this.category;
        }

        public Optional<Integer> getIssue() {
            return this.issue;
        }

        public Optional<LotteryType> getLottery() {
            return this.lottery;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<String> getTime() {
            return this.time;
        }

        @Required
        public LotteryIntention setAction(LotteryAction lotteryAction) {
            this.action = lotteryAction;
            return this;
        }

        public LotteryIntention setArea(String str) {
            this.area = Optional.e(str);
            return this;
        }

        public LotteryIntention setCategory(LotteryCategory lotteryCategory) {
            this.category = Optional.e(lotteryCategory);
            return this;
        }

        public LotteryIntention setIssue(int i) {
            this.issue = Optional.e(Integer.valueOf(i));
            return this;
        }

        public LotteryIntention setLottery(LotteryType lotteryType) {
            this.lottery = Optional.e(lotteryType);
            return this;
        }

        public LotteryIntention setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public LotteryIntention setTime(String str) {
            this.time = Optional.e(str);
            return this;
        }

        public LotteryIntention(LotteryAction lotteryAction) {
            this.action = lotteryAction;
        }
    }

    public static class OfflineSessionItemInfo {

        @Required
        private mj1 answer;

        @Required
        private boolean duplex_rejected;

        @Required
        private String request_id;

        @Required
        private long timestamp;
        private Optional<c4h> intention = Optional.a();
        private Optional<mj1> instructions = Optional.a();
        private Optional<List<dialog.DialogState>> dialog_states = Optional.a();
        private Optional<List<dialog.DialogState>> parser_score_dialog_states = Optional.a();
        private Optional<SourceType> source_type = Optional.a();
        private Optional<Common.KeyWordFreeType> key_word_free_type = Optional.a();
        private Optional<AutoController.Position> voice_position = Optional.a();

        public OfflineSessionItemInfo() {
        }

        @Required
        public mj1 getAnswer() {
            return this.answer;
        }

        public Optional<List<dialog.DialogState>> getDialogStates() {
            return this.dialog_states;
        }

        public Optional<mj1> getInstructions() {
            return this.instructions;
        }

        public Optional<c4h> getIntention() {
            return this.intention;
        }

        public Optional<Common.KeyWordFreeType> getKeyWordFreeType() {
            return this.key_word_free_type;
        }

        public Optional<List<dialog.DialogState>> getParserScoreDialogStates() {
            return this.parser_score_dialog_states;
        }

        @Required
        public String getRequestId() {
            return this.request_id;
        }

        public Optional<SourceType> getSourceType() {
            return this.source_type;
        }

        @Required
        public long getTimestamp() {
            return this.timestamp;
        }

        public Optional<AutoController.Position> getVoicePosition() {
            return this.voice_position;
        }

        @Required
        public boolean isDuplexRejected() {
            return this.duplex_rejected;
        }

        @Required
        public OfflineSessionItemInfo setAnswer(mj1 mj1Var) {
            this.answer = mj1Var;
            return this;
        }

        public OfflineSessionItemInfo setDialogStates(List<dialog.DialogState> list) {
            this.dialog_states = Optional.e(list);
            return this;
        }

        @Required
        public OfflineSessionItemInfo setDuplexRejected(boolean z) {
            this.duplex_rejected = z;
            return this;
        }

        public OfflineSessionItemInfo setInstructions(mj1 mj1Var) {
            this.instructions = Optional.e(mj1Var);
            return this;
        }

        public OfflineSessionItemInfo setIntention(c4h c4hVar) {
            this.intention = Optional.e(c4hVar);
            return this;
        }

        public OfflineSessionItemInfo setKeyWordFreeType(Common.KeyWordFreeType keyWordFreeType) {
            this.key_word_free_type = Optional.e(keyWordFreeType);
            return this;
        }

        public OfflineSessionItemInfo setParserScoreDialogStates(List<dialog.DialogState> list) {
            this.parser_score_dialog_states = Optional.e(list);
            return this;
        }

        @Required
        public OfflineSessionItemInfo setRequestId(String str) {
            this.request_id = str;
            return this;
        }

        public OfflineSessionItemInfo setSourceType(SourceType sourceType) {
            this.source_type = Optional.e(sourceType);
            return this;
        }

        @Required
        public OfflineSessionItemInfo setTimestamp(long j) {
            this.timestamp = j;
            return this;
        }

        public OfflineSessionItemInfo setVoicePosition(AutoController.Position position) {
            this.voice_position = Optional.e(position);
            return this;
        }

        public OfflineSessionItemInfo(long j, mj1 mj1Var, boolean z, String str) {
            this.timestamp = j;
            this.answer = mj1Var;
            this.duplex_rejected = z;
            this.request_id = str;
        }
    }

    public static class TransportTicketIntention {

        @Required
        private TransportTicketAction action;
        private Optional<String> raw_order_time = Optional.a();
        private Optional<String> standard_order_begin_time = Optional.a();
        private Optional<String> standard_order_end_time = Optional.a();
        private Optional<String> from_city = Optional.a();
        private Optional<String> to_city = Optional.a();
        private Optional<TransportTicketType> ticket_type = Optional.a();
        private Optional<TransportType> transport_type = Optional.a();

        public TransportTicketIntention() {
        }

        @Required
        public TransportTicketAction getAction() {
            return this.action;
        }

        public Optional<String> getFromCity() {
            return this.from_city;
        }

        public Optional<String> getRawOrderTime() {
            return this.raw_order_time;
        }

        public Optional<String> getStandardOrderBeginTime() {
            return this.standard_order_begin_time;
        }

        public Optional<String> getStandardOrderEndTime() {
            return this.standard_order_end_time;
        }

        public Optional<TransportTicketType> getTicketType() {
            return this.ticket_type;
        }

        public Optional<String> getToCity() {
            return this.to_city;
        }

        public Optional<TransportType> getTransportType() {
            return this.transport_type;
        }

        @Required
        public TransportTicketIntention setAction(TransportTicketAction transportTicketAction) {
            this.action = transportTicketAction;
            return this;
        }

        public TransportTicketIntention setFromCity(String str) {
            this.from_city = Optional.e(str);
            return this;
        }

        public TransportTicketIntention setRawOrderTime(String str) {
            this.raw_order_time = Optional.e(str);
            return this;
        }

        public TransportTicketIntention setStandardOrderBeginTime(String str) {
            this.standard_order_begin_time = Optional.e(str);
            return this;
        }

        public TransportTicketIntention setStandardOrderEndTime(String str) {
            this.standard_order_end_time = Optional.e(str);
            return this;
        }

        public TransportTicketIntention setTicketType(TransportTicketType transportTicketType) {
            this.ticket_type = Optional.e(transportTicketType);
            return this;
        }

        public TransportTicketIntention setToCity(String str) {
            this.to_city = Optional.e(str);
            return this;
        }

        public TransportTicketIntention setTransportType(TransportType transportType) {
            this.transport_type = Optional.e(transportType);
            return this;
        }

        public TransportTicketIntention(TransportTicketAction transportTicketAction) {
            this.action = transportTicketAction;
        }
    }

    public static class TimeIntention {

        @Required
        private TimeAction action;
        private Optional<String> start_time = Optional.a();
        private Optional<Boolean> start_time_festival_flag = Optional.a();
        private Optional<String> end_time = Optional.a();
        private Optional<Boolean> end_time_festival_flag = Optional.a();
        private Optional<String> time_zone = Optional.a();
        private Optional<CalendarType> calendar = Optional.a();
        private Optional<Boolean> solar_lunar_trans = Optional.a();
        private Optional<Boolean> is_confirm_date_or_festival = Optional.a();

        public TimeIntention() {
        }

        @Required
        public TimeAction getAction() {
            return this.action;
        }

        public Optional<CalendarType> getCalendar() {
            return this.calendar;
        }

        public Optional<String> getEndTime() {
            return this.end_time;
        }

        public Optional<String> getStartTime() {
            return this.start_time;
        }

        public Optional<String> getTimeZone() {
            return this.time_zone;
        }

        public Optional<Boolean> isConfirmDateOrFestival() {
            return this.is_confirm_date_or_festival;
        }

        public Optional<Boolean> isEndTimeFestivalFlag() {
            return this.end_time_festival_flag;
        }

        public Optional<Boolean> isSolarLunarTrans() {
            return this.solar_lunar_trans;
        }

        public Optional<Boolean> isStartTimeFestivalFlag() {
            return this.start_time_festival_flag;
        }

        @Required
        public TimeIntention setAction(TimeAction timeAction) {
            this.action = timeAction;
            return this;
        }

        public TimeIntention setCalendar(CalendarType calendarType) {
            this.calendar = Optional.e(calendarType);
            return this;
        }

        public TimeIntention setEndTime(String str) {
            this.end_time = Optional.e(str);
            return this;
        }

        public TimeIntention setEndTimeFestivalFlag(boolean z) {
            this.end_time_festival_flag = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public TimeIntention setIsConfirmDateOrFestival(boolean z) {
            this.is_confirm_date_or_festival = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public TimeIntention setSolarLunarTrans(boolean z) {
            this.solar_lunar_trans = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public TimeIntention setStartTime(String str) {
            this.start_time = Optional.e(str);
            return this;
        }

        public TimeIntention setStartTimeFestivalFlag(boolean z) {
            this.start_time_festival_flag = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public TimeIntention setTimeZone(String str) {
            this.time_zone = Optional.e(str);
            return this;
        }

        public TimeIntention(TimeAction timeAction) {
            this.action = timeAction;
        }
    }

    public static class HotelIntention {

        @Required
        private HotelAction action;
        private Optional<String> city = Optional.a();
        private Optional<String> address = Optional.a();
        private Optional<String> time = Optional.a();
        private Optional<String> hotel_name = Optional.a();
        private Optional<HotelType> hotel_type = Optional.a();
        private Optional<HotelStarLevel> star_level = Optional.a();
        private Optional<HotelRoomType> room_type = Optional.a();
        private Optional<Integer> min_price = Optional.a();
        private Optional<Integer> max_price = Optional.a();

        public HotelIntention() {
        }

        @Required
        public HotelAction getAction() {
            return this.action;
        }

        public Optional<String> getAddress() {
            return this.address;
        }

        public Optional<String> getCity() {
            return this.city;
        }

        public Optional<String> getHotelName() {
            return this.hotel_name;
        }

        public Optional<HotelType> getHotelType() {
            return this.hotel_type;
        }

        public Optional<Integer> getMaxPrice() {
            return this.max_price;
        }

        public Optional<Integer> getMinPrice() {
            return this.min_price;
        }

        public Optional<HotelRoomType> getRoomType() {
            return this.room_type;
        }

        public Optional<HotelStarLevel> getStarLevel() {
            return this.star_level;
        }

        public Optional<String> getTime() {
            return this.time;
        }

        @Required
        public HotelIntention setAction(HotelAction hotelAction) {
            this.action = hotelAction;
            return this;
        }

        public HotelIntention setAddress(String str) {
            this.address = Optional.e(str);
            return this;
        }

        public HotelIntention setCity(String str) {
            this.city = Optional.e(str);
            return this;
        }

        public HotelIntention setHotelName(String str) {
            this.hotel_name = Optional.e(str);
            return this;
        }

        public HotelIntention setHotelType(HotelType hotelType) {
            this.hotel_type = Optional.e(hotelType);
            return this;
        }

        public HotelIntention setMaxPrice(int i) {
            this.max_price = Optional.e(Integer.valueOf(i));
            return this;
        }

        public HotelIntention setMinPrice(int i) {
            this.min_price = Optional.e(Integer.valueOf(i));
            return this;
        }

        public HotelIntention setRoomType(HotelRoomType hotelRoomType) {
            this.room_type = Optional.e(hotelRoomType);
            return this;
        }

        public HotelIntention setStarLevel(HotelStarLevel hotelStarLevel) {
            this.star_level = Optional.e(hotelStarLevel);
            return this;
        }

        public HotelIntention setTime(String str) {
            this.time = Optional.e(str);
            return this;
        }

        public HotelIntention(HotelAction hotelAction) {
            this.action = hotelAction;
        }
    }

    public static class MapAppIntention {

        @Required
        private MapAppAction action;
        private Optional<String> sub_action = Optional.a();
        private Optional<String> origin = Optional.a();
        private Optional<String> dest = Optional.a();
        private Optional<String> tag = Optional.a();
        private Optional<AddressToModify> address_to_modify = Optional.a();
        private Optional<String> map_keyword = Optional.a();
        private Optional<TravelPreference> travel_preference = Optional.a();
        private Optional<Integer> route_num = Optional.a();
        private Optional<List<MapModes>> map_modes = Optional.a();

        public MapAppIntention() {
        }

        @Required
        public MapAppAction getAction() {
            return this.action;
        }

        public Optional<AddressToModify> getAddressToModify() {
            return this.address_to_modify;
        }

        public Optional<String> getDest() {
            return this.dest;
        }

        public Optional<String> getMapKeyword() {
            return this.map_keyword;
        }

        public Optional<List<MapModes>> getMapModes() {
            return this.map_modes;
        }

        public Optional<String> getOrigin() {
            return this.origin;
        }

        public Optional<Integer> getRouteNum() {
            return this.route_num;
        }

        public Optional<String> getSubAction() {
            return this.sub_action;
        }

        public Optional<String> getTag() {
            return this.tag;
        }

        public Optional<TravelPreference> getTravelPreference() {
            return this.travel_preference;
        }

        @Required
        public MapAppIntention setAction(MapAppAction mapAppAction) {
            this.action = mapAppAction;
            return this;
        }

        public MapAppIntention setAddressToModify(AddressToModify addressToModify) {
            this.address_to_modify = Optional.e(addressToModify);
            return this;
        }

        public MapAppIntention setDest(String str) {
            this.dest = Optional.e(str);
            return this;
        }

        public MapAppIntention setMapKeyword(String str) {
            this.map_keyword = Optional.e(str);
            return this;
        }

        public MapAppIntention setMapModes(List<MapModes> list) {
            this.map_modes = Optional.e(list);
            return this;
        }

        public MapAppIntention setOrigin(String str) {
            this.origin = Optional.e(str);
            return this;
        }

        public MapAppIntention setRouteNum(int i) {
            this.route_num = Optional.e(Integer.valueOf(i));
            return this;
        }

        public MapAppIntention setSubAction(String str) {
            this.sub_action = Optional.e(str);
            return this;
        }

        public MapAppIntention setTag(String str) {
            this.tag = Optional.e(str);
            return this;
        }

        public MapAppIntention setTravelPreference(TravelPreference travelPreference) {
            this.travel_preference = Optional.e(travelPreference);
            return this;
        }

        public MapAppIntention(MapAppAction mapAppAction) {
            this.action = mapAppAction;
        }
    }

    public static class RecipeIntention {

        @Required
        private RecipeAction action;
        private Optional<String> recipe = Optional.a();
        private Optional<String> style = Optional.a();
        private Optional<String> effect = Optional.a();
        private Optional<String> tasty = Optional.a();
        private Optional<String> varity = Optional.a();
        private Optional<String> scene = Optional.a();
        private Optional<String> crowd = Optional.a();
        private Optional<String> material = Optional.a();
        private Optional<String> festival = Optional.a();

        public RecipeIntention() {
        }

        @Required
        public RecipeAction getAction() {
            return this.action;
        }

        public Optional<String> getCrowd() {
            return this.crowd;
        }

        public Optional<String> getEffect() {
            return this.effect;
        }

        public Optional<String> getFestival() {
            return this.festival;
        }

        public Optional<String> getMaterial() {
            return this.material;
        }

        public Optional<String> getRecipe() {
            return this.recipe;
        }

        public Optional<String> getScene() {
            return this.scene;
        }

        public Optional<String> getStyle() {
            return this.style;
        }

        public Optional<String> getTasty() {
            return this.tasty;
        }

        public Optional<String> getVarity() {
            return this.varity;
        }

        @Required
        public RecipeIntention setAction(RecipeAction recipeAction) {
            this.action = recipeAction;
            return this;
        }

        public RecipeIntention setCrowd(String str) {
            this.crowd = Optional.e(str);
            return this;
        }

        public RecipeIntention setEffect(String str) {
            this.effect = Optional.e(str);
            return this;
        }

        public RecipeIntention setFestival(String str) {
            this.festival = Optional.e(str);
            return this;
        }

        public RecipeIntention setMaterial(String str) {
            this.material = Optional.e(str);
            return this;
        }

        public RecipeIntention setRecipe(String str) {
            this.recipe = Optional.e(str);
            return this;
        }

        public RecipeIntention setScene(String str) {
            this.scene = Optional.e(str);
            return this;
        }

        public RecipeIntention setStyle(String str) {
            this.style = Optional.e(str);
            return this;
        }

        public RecipeIntention setTasty(String str) {
            this.tasty = Optional.e(str);
            return this;
        }

        public RecipeIntention setVarity(String str) {
            this.varity = Optional.e(str);
            return this;
        }

        public RecipeIntention(RecipeAction recipeAction) {
            this.action = recipeAction;
        }
    }

    public static class SoundboxControlIntention {

        @Required
        private String action;
        private Optional<Integer> duration = Optional.a();
        private Optional<String> object_name = Optional.a();
        private Optional<Integer> value = Optional.a();
        private Optional<Integer> index = Optional.a();
        private Optional<String> dialect = Optional.a();
        private Optional<Speaker.VolumeType> volume_type = Optional.a();
        private Optional<Integer> volume = Optional.a();
        private Optional<Speaker.UnitDef> volume_unit = Optional.a();
        private Optional<String> after_finish = Optional.a();
        private Optional<Float> seed = Optional.a();
        private Optional<SoundboxLoopMode> mode = Optional.a();
        private Optional<ScreenResolution> resolution = Optional.a();

        public SoundboxControlIntention() {
        }

        @Required
        public String getAction() {
            return this.action;
        }

        public Optional<String> getAfterFinish() {
            return this.after_finish;
        }

        public Optional<String> getDialect() {
            return this.dialect;
        }

        public Optional<Integer> getDuration() {
            return this.duration;
        }

        public Optional<Integer> getIndex() {
            return this.index;
        }

        public Optional<SoundboxLoopMode> getMode() {
            return this.mode;
        }

        public Optional<String> getObjectName() {
            return this.object_name;
        }

        public Optional<ScreenResolution> getResolution() {
            return this.resolution;
        }

        public Optional<Float> getSeed() {
            return this.seed;
        }

        public Optional<Integer> getValue() {
            return this.value;
        }

        public Optional<Integer> getVolume() {
            return this.volume;
        }

        public Optional<Speaker.VolumeType> getVolumeType() {
            return this.volume_type;
        }

        public Optional<Speaker.UnitDef> getVolumeUnit() {
            return this.volume_unit;
        }

        @Required
        public SoundboxControlIntention setAction(String str) {
            this.action = str;
            return this;
        }

        public SoundboxControlIntention setAfterFinish(String str) {
            this.after_finish = Optional.e(str);
            return this;
        }

        public SoundboxControlIntention setDialect(String str) {
            this.dialect = Optional.e(str);
            return this;
        }

        public SoundboxControlIntention setDuration(int i) {
            this.duration = Optional.e(Integer.valueOf(i));
            return this;
        }

        public SoundboxControlIntention setIndex(int i) {
            this.index = Optional.e(Integer.valueOf(i));
            return this;
        }

        public SoundboxControlIntention setMode(SoundboxLoopMode soundboxLoopMode) {
            this.mode = Optional.e(soundboxLoopMode);
            return this;
        }

        public SoundboxControlIntention setObjectName(String str) {
            this.object_name = Optional.e(str);
            return this;
        }

        public SoundboxControlIntention setResolution(ScreenResolution screenResolution) {
            this.resolution = Optional.e(screenResolution);
            return this;
        }

        public SoundboxControlIntention setSeed(float f) {
            this.seed = Optional.e(Float.valueOf(f));
            return this;
        }

        public SoundboxControlIntention setValue(int i) {
            this.value = Optional.e(Integer.valueOf(i));
            return this;
        }

        public SoundboxControlIntention setVolume(int i) {
            this.volume = Optional.e(Integer.valueOf(i));
            return this;
        }

        public SoundboxControlIntention setVolumeType(Speaker.VolumeType volumeType) {
            this.volume_type = Optional.e(volumeType);
            return this;
        }

        public SoundboxControlIntention setVolumeUnit(Speaker.UnitDef unitDef) {
            this.volume_unit = Optional.e(unitDef);
            return this;
        }

        public SoundboxControlIntention(String str) {
            this.action = str;
        }
    }

    public static class WeatherIntention {

        @Required
        private WeatherIntentType intent;
        private Optional<String> date = Optional.a();
        private Optional<String> duration = Optional.a();
        private Optional<String> time = Optional.a();
        private Optional<String> poi = Optional.a();
        private Optional<String> district = Optional.a();
        private Optional<String> city = Optional.a();
        private Optional<String> province = Optional.a();
        private Optional<String> country = Optional.a();
        private Optional<WeatherBroadcastType> broadcast = Optional.a();
        private Optional<String> meteor_assert_value = Optional.a();
        private Optional<String> time_spec = Optional.a();
        private Optional<WeatherSportType> sport_type = Optional.a();

        public WeatherIntention() {
        }

        public Optional<WeatherBroadcastType> getBroadcast() {
            return this.broadcast;
        }

        public Optional<String> getCity() {
            return this.city;
        }

        public Optional<String> getCountry() {
            return this.country;
        }

        public Optional<String> getDate() {
            return this.date;
        }

        public Optional<String> getDistrict() {
            return this.district;
        }

        public Optional<String> getDuration() {
            return this.duration;
        }

        @Required
        public WeatherIntentType getIntent() {
            return this.intent;
        }

        public Optional<String> getMeteorAssertValue() {
            return this.meteor_assert_value;
        }

        public Optional<String> getPoi() {
            return this.poi;
        }

        public Optional<String> getProvince() {
            return this.province;
        }

        public Optional<WeatherSportType> getSportType() {
            return this.sport_type;
        }

        public Optional<String> getTime() {
            return this.time;
        }

        public Optional<String> getTimeSpec() {
            return this.time_spec;
        }

        public WeatherIntention setBroadcast(WeatherBroadcastType weatherBroadcastType) {
            this.broadcast = Optional.e(weatherBroadcastType);
            return this;
        }

        public WeatherIntention setCity(String str) {
            this.city = Optional.e(str);
            return this;
        }

        public WeatherIntention setCountry(String str) {
            this.country = Optional.e(str);
            return this;
        }

        public WeatherIntention setDate(String str) {
            this.date = Optional.e(str);
            return this;
        }

        public WeatherIntention setDistrict(String str) {
            this.district = Optional.e(str);
            return this;
        }

        public WeatherIntention setDuration(String str) {
            this.duration = Optional.e(str);
            return this;
        }

        @Required
        public WeatherIntention setIntent(WeatherIntentType weatherIntentType) {
            this.intent = weatherIntentType;
            return this;
        }

        public WeatherIntention setMeteorAssertValue(String str) {
            this.meteor_assert_value = Optional.e(str);
            return this;
        }

        public WeatherIntention setPoi(String str) {
            this.poi = Optional.e(str);
            return this;
        }

        public WeatherIntention setProvince(String str) {
            this.province = Optional.e(str);
            return this;
        }

        public WeatherIntention setSportType(WeatherSportType weatherSportType) {
            this.sport_type = Optional.e(weatherSportType);
            return this;
        }

        public WeatherIntention setTime(String str) {
            this.time = Optional.e(str);
            return this;
        }

        public WeatherIntention setTimeSpec(String str) {
            this.time_spec = Optional.e(str);
            return this;
        }

        public WeatherIntention(WeatherIntentType weatherIntentType) {
            this.intent = weatherIntentType;
        }
    }

    public static class AnchorPointInfo {

        @Required
        private AnchorPointInfoFunctionType function_type;

        @Required
        private LocalStrategyType service_type;
        private Optional<String> widget_name = Optional.a();
        private Optional<String> widget_id = Optional.a();
        private Optional<String> widget_value = Optional.a();
        private Optional<String> page_name = Optional.a();
        private Optional<String> function_name = Optional.a();
        private Optional<Integer> round_state = Optional.a();
        private Optional<AnchorPointInfoValueType> widget_value_type = Optional.a();
        private Optional<Boolean> is_safe_function = Optional.a();
        private Optional<String> widget_nickname = Optional.a();
        private Optional<String> intent_url = Optional.a();
        private Optional<String> package_name = Optional.a();
        private Optional<String> prop_id = Optional.a();
        private Optional<Integer> area_id = Optional.a();
        private Optional<List<Float>> target_value = Optional.a();
        private Optional<RelationInTargetValueAndRealValue> relation = Optional.a();
        private Optional<AiLocalApiType> api_name = Optional.a();

        public AnchorPointInfo() {
        }

        public Optional<AiLocalApiType> getApiName() {
            return this.api_name;
        }

        public Optional<Integer> getAreaId() {
            return this.area_id;
        }

        public Optional<String> getFunctionName() {
            return this.function_name;
        }

        @Required
        public AnchorPointInfoFunctionType getFunctionType() {
            return this.function_type;
        }

        public Optional<String> getIntentUrl() {
            return this.intent_url;
        }

        public Optional<String> getPackageName() {
            return this.package_name;
        }

        public Optional<String> getPageName() {
            return this.page_name;
        }

        public Optional<String> getPropId() {
            return this.prop_id;
        }

        public Optional<RelationInTargetValueAndRealValue> getRelation() {
            return this.relation;
        }

        public Optional<Integer> getRoundState() {
            return this.round_state;
        }

        @Required
        public LocalStrategyType getServiceType() {
            return this.service_type;
        }

        public Optional<List<Float>> getTargetValue() {
            return this.target_value;
        }

        public Optional<String> getWidgetId() {
            return this.widget_id;
        }

        public Optional<String> getWidgetName() {
            return this.widget_name;
        }

        public Optional<String> getWidgetNickname() {
            return this.widget_nickname;
        }

        public Optional<String> getWidgetValue() {
            return this.widget_value;
        }

        public Optional<AnchorPointInfoValueType> getWidgetValueType() {
            return this.widget_value_type;
        }

        public Optional<Boolean> isSafeFunction() {
            return this.is_safe_function;
        }

        public AnchorPointInfo setApiName(AiLocalApiType aiLocalApiType) {
            this.api_name = Optional.e(aiLocalApiType);
            return this;
        }

        public AnchorPointInfo setAreaId(int i) {
            this.area_id = Optional.e(Integer.valueOf(i));
            return this;
        }

        public AnchorPointInfo setFunctionName(String str) {
            this.function_name = Optional.e(str);
            return this;
        }

        @Required
        public AnchorPointInfo setFunctionType(AnchorPointInfoFunctionType anchorPointInfoFunctionType) {
            this.function_type = anchorPointInfoFunctionType;
            return this;
        }

        public AnchorPointInfo setIntentUrl(String str) {
            this.intent_url = Optional.e(str);
            return this;
        }

        public AnchorPointInfo setIsSafeFunction(boolean z) {
            this.is_safe_function = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public AnchorPointInfo setPackageName(String str) {
            this.package_name = Optional.e(str);
            return this;
        }

        public AnchorPointInfo setPageName(String str) {
            this.page_name = Optional.e(str);
            return this;
        }

        public AnchorPointInfo setPropId(String str) {
            this.prop_id = Optional.e(str);
            return this;
        }

        public AnchorPointInfo setRelation(RelationInTargetValueAndRealValue relationInTargetValueAndRealValue) {
            this.relation = Optional.e(relationInTargetValueAndRealValue);
            return this;
        }

        public AnchorPointInfo setRoundState(int i) {
            this.round_state = Optional.e(Integer.valueOf(i));
            return this;
        }

        @Required
        public AnchorPointInfo setServiceType(LocalStrategyType localStrategyType) {
            this.service_type = localStrategyType;
            return this;
        }

        public AnchorPointInfo setTargetValue(List<Float> list) {
            this.target_value = Optional.e(list);
            return this;
        }

        public AnchorPointInfo setWidgetId(String str) {
            this.widget_id = Optional.e(str);
            return this;
        }

        public AnchorPointInfo setWidgetName(String str) {
            this.widget_name = Optional.e(str);
            return this;
        }

        public AnchorPointInfo setWidgetNickname(String str) {
            this.widget_nickname = Optional.e(str);
            return this;
        }

        public AnchorPointInfo setWidgetValue(String str) {
            this.widget_value = Optional.e(str);
            return this;
        }

        public AnchorPointInfo setWidgetValueType(AnchorPointInfoValueType anchorPointInfoValueType) {
            this.widget_value_type = Optional.e(anchorPointInfoValueType);
            return this;
        }

        public AnchorPointInfo(LocalStrategyType localStrategyType, AnchorPointInfoFunctionType anchorPointInfoFunctionType) {
            this.service_type = localStrategyType;
            this.function_type = anchorPointInfoFunctionType;
        }
    }

    public static class SportsIntention {

        @Required
        private SportSubject subject;

        @Required
        private SportTargetType target_type;
        private Optional<SportsType> sports_type = Optional.a();
        private Optional<SportCompetitionType> competition_type = Optional.a();
        private Optional<String> season = Optional.a();
        private Optional<SportStageType> stage = Optional.a();
        private Optional<String> team1 = Optional.a();
        private Optional<String> team2 = Optional.a();
        private Optional<String> player = Optional.a();
        private Optional<String> round = Optional.a();
        private Optional<String> group = Optional.a();
        private Optional<String> time_type = Optional.a();
        private Optional<String> start_time = Optional.a();
        private Optional<String> end_time = Optional.a();
        private Optional<SportGrainType> grain = Optional.a();
        private Optional<Boolean> festival_flag = Optional.a();
        private Optional<Boolean> exceptional = Optional.a();
        private Optional<String> token = Optional.a();
        private Optional<Long> start_timestamp = Optional.a();
        private Optional<Long> end_timestamp = Optional.a();
        private Optional<SportStateItem> stat_item = Optional.a();
        private Optional<SportHomeAway> home_away = Optional.a();
        private Optional<String> rank = Optional.a();
        private Optional<String> rank_by = Optional.a();
        private Optional<String> top_n = Optional.a();
        private Optional<String> number = Optional.a();
        private Optional<Boolean> first = Optional.a();
        private Optional<Boolean> outlet = Optional.a();
        private Optional<SportRoleType> role = Optional.a();
        private Optional<String> sport_competition = Optional.a();

        public SportsIntention() {
        }

        public Optional<SportCompetitionType> getCompetitionType() {
            return this.competition_type;
        }

        public Optional<String> getEndTime() {
            return this.end_time;
        }

        public Optional<Long> getEndTimestamp() {
            return this.end_timestamp;
        }

        public Optional<SportGrainType> getGrain() {
            return this.grain;
        }

        public Optional<String> getGroup() {
            return this.group;
        }

        public Optional<SportHomeAway> getHomeAway() {
            return this.home_away;
        }

        public Optional<String> getNumber() {
            return this.number;
        }

        public Optional<String> getPlayer() {
            return this.player;
        }

        public Optional<String> getRank() {
            return this.rank;
        }

        public Optional<String> getRankBy() {
            return this.rank_by;
        }

        public Optional<SportRoleType> getRole() {
            return this.role;
        }

        public Optional<String> getRound() {
            return this.round;
        }

        public Optional<String> getSeason() {
            return this.season;
        }

        public Optional<String> getSportCompetition() {
            return this.sport_competition;
        }

        public Optional<SportsType> getSportsType() {
            return this.sports_type;
        }

        public Optional<SportStageType> getStage() {
            return this.stage;
        }

        public Optional<String> getStartTime() {
            return this.start_time;
        }

        public Optional<Long> getStartTimestamp() {
            return this.start_timestamp;
        }

        public Optional<SportStateItem> getStatItem() {
            return this.stat_item;
        }

        @Required
        public SportSubject getSubject() {
            return this.subject;
        }

        @Required
        public SportTargetType getTargetType() {
            return this.target_type;
        }

        public Optional<String> getTeam1() {
            return this.team1;
        }

        public Optional<String> getTeam2() {
            return this.team2;
        }

        public Optional<String> getTimeType() {
            return this.time_type;
        }

        public Optional<String> getToken() {
            return this.token;
        }

        public Optional<String> getTopN() {
            return this.top_n;
        }

        public Optional<Boolean> isExceptional() {
            return this.exceptional;
        }

        public Optional<Boolean> isFestivalFlag() {
            return this.festival_flag;
        }

        public Optional<Boolean> isFirst() {
            return this.first;
        }

        public Optional<Boolean> isOutlet() {
            return this.outlet;
        }

        public SportsIntention setCompetitionType(SportCompetitionType sportCompetitionType) {
            this.competition_type = Optional.e(sportCompetitionType);
            return this;
        }

        public SportsIntention setEndTime(String str) {
            this.end_time = Optional.e(str);
            return this;
        }

        public SportsIntention setEndTimestamp(long j) {
            this.end_timestamp = Optional.e(Long.valueOf(j));
            return this;
        }

        public SportsIntention setExceptional(boolean z) {
            this.exceptional = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public SportsIntention setFestivalFlag(boolean z) {
            this.festival_flag = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public SportsIntention setFirst(boolean z) {
            this.first = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public SportsIntention setGrain(SportGrainType sportGrainType) {
            this.grain = Optional.e(sportGrainType);
            return this;
        }

        public SportsIntention setGroup(String str) {
            this.group = Optional.e(str);
            return this;
        }

        public SportsIntention setHomeAway(SportHomeAway sportHomeAway) {
            this.home_away = Optional.e(sportHomeAway);
            return this;
        }

        public SportsIntention setNumber(String str) {
            this.number = Optional.e(str);
            return this;
        }

        public SportsIntention setOutlet(boolean z) {
            this.outlet = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public SportsIntention setPlayer(String str) {
            this.player = Optional.e(str);
            return this;
        }

        public SportsIntention setRank(String str) {
            this.rank = Optional.e(str);
            return this;
        }

        public SportsIntention setRankBy(String str) {
            this.rank_by = Optional.e(str);
            return this;
        }

        public SportsIntention setRole(SportRoleType sportRoleType) {
            this.role = Optional.e(sportRoleType);
            return this;
        }

        public SportsIntention setRound(String str) {
            this.round = Optional.e(str);
            return this;
        }

        public SportsIntention setSeason(String str) {
            this.season = Optional.e(str);
            return this;
        }

        public SportsIntention setSportCompetition(String str) {
            this.sport_competition = Optional.e(str);
            return this;
        }

        public SportsIntention setSportsType(SportsType sportsType) {
            this.sports_type = Optional.e(sportsType);
            return this;
        }

        public SportsIntention setStage(SportStageType sportStageType) {
            this.stage = Optional.e(sportStageType);
            return this;
        }

        public SportsIntention setStartTime(String str) {
            this.start_time = Optional.e(str);
            return this;
        }

        public SportsIntention setStartTimestamp(long j) {
            this.start_timestamp = Optional.e(Long.valueOf(j));
            return this;
        }

        public SportsIntention setStatItem(SportStateItem sportStateItem) {
            this.stat_item = Optional.e(sportStateItem);
            return this;
        }

        @Required
        public SportsIntention setSubject(SportSubject sportSubject) {
            this.subject = sportSubject;
            return this;
        }

        @Required
        public SportsIntention setTargetType(SportTargetType sportTargetType) {
            this.target_type = sportTargetType;
            return this;
        }

        public SportsIntention setTeam1(String str) {
            this.team1 = Optional.e(str);
            return this;
        }

        public SportsIntention setTeam2(String str) {
            this.team2 = Optional.e(str);
            return this;
        }

        public SportsIntention setTimeType(String str) {
            this.time_type = Optional.e(str);
            return this;
        }

        public SportsIntention setToken(String str) {
            this.token = Optional.e(str);
            return this;
        }

        public SportsIntention setTopN(String str) {
            this.top_n = Optional.e(str);
            return this;
        }

        public SportsIntention(SportSubject sportSubject, SportTargetType sportTargetType) {
            this.subject = sportSubject;
            this.target_type = sportTargetType;
        }
    }
}
