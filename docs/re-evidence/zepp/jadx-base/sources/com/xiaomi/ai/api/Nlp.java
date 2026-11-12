package com.xiaomi.ai.api;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class Nlp {

    public enum AddressToModify {
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
        private Optional<String> formula = Optional.empty();

        public Optional<String> getFormula() {
            return this.formula;
        }

        public ArithIntention setFormula(String str) {
            this.formula = Optional.ofNullable(str);
            return this;
        }
    }

    @NamespaceName(name = "AuxiliaryIntention", namespace = AIApiConstants.Nlp.NAME)
    public static class AuxiliaryIntention implements InstructionPayload {

        @Required
        private ObjectNode intention;

        @Required
        private IntentionType type;

        public AuxiliaryIntention() {
        }

        public AuxiliaryIntention(IntentionType intentionType, ObjectNode objectNode) {
            this.type = intentionType;
            this.intention = objectNode;
        }

        @Required
        public ObjectNode getIntention() {
            return this.intention;
        }

        @Required
        public IntentionType getType() {
            return this.type;
        }

        @Required
        public AuxiliaryIntention setIntention(ObjectNode objectNode) {
            this.intention = objectNode;
            return this;
        }

        @Required
        public AuxiliaryIntention setType(IntentionType intentionType) {
            this.type = intentionType;
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
        private Optional<String> action = Optional.empty();
        private Optional<String> time_value = Optional.empty();
        private Optional<String> time_origin = Optional.empty();
        private Optional<TimeUnitType> time_unit = Optional.empty();
        private Optional<String> constellation_name = Optional.empty();
        private Optional<String> constellation_pair = Optional.empty();
        private Optional<String> attribute = Optional.empty();

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
            this.action = Optional.ofNullable(str);
            return this;
        }

        public ConstellationIntention setAttribute(String str) {
            this.attribute = Optional.ofNullable(str);
            return this;
        }

        public ConstellationIntention setConstellationName(String str) {
            this.constellation_name = Optional.ofNullable(str);
            return this;
        }

        public ConstellationIntention setConstellationPair(String str) {
            this.constellation_pair = Optional.ofNullable(str);
            return this;
        }

        public ConstellationIntention setTimeOrigin(String str) {
            this.time_origin = Optional.ofNullable(str);
            return this;
        }

        public ConstellationIntention setTimeUnit(TimeUnitType timeUnitType) {
            this.time_unit = Optional.ofNullable(timeUnitType);
            return this;
        }

        public ConstellationIntention setTimeValue(String str) {
            this.time_value = Optional.ofNullable(str);
            return this;
        }
    }

    @NamespaceName(name = "ConstructRequest", namespace = AIApiConstants.Nlp.NAME)
    public static class ConstructRequest implements InstructionPayload {

        @Required
        private ObjectNode request;
        private Optional<Integer> trigger_after = Optional.empty();

        public ConstructRequest() {
        }

        public ConstructRequest(ObjectNode objectNode) {
            this.request = objectNode;
        }

        @Required
        public ObjectNode getRequest() {
            return this.request;
        }

        public Optional<Integer> getTriggerAfter() {
            return this.trigger_after;
        }

        @Required
        public ConstructRequest setRequest(ObjectNode objectNode) {
            this.request = objectNode;
            return this;
        }

        public ConstructRequest setTriggerAfter(int i) {
            this.trigger_after = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }
    }

    public static class EducationIntention {
        private Optional<String> subject = Optional.empty();
        private Optional<String> grade = Optional.empty();
        private Optional<String> version = Optional.empty();
        private Optional<String> volume = Optional.empty();
        private Optional<String> exam = Optional.empty();
        private Optional<String> tag = Optional.empty();
        private Optional<String> name = Optional.empty();
        private Optional<String> text_name = Optional.empty();
        private Optional<String> episode = Optional.empty();
        private Optional<Payment> payment = Optional.empty();
        private Optional<Integer> year = Optional.empty();
        private Optional<String> keyword = Optional.empty();

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
            this.episode = Optional.ofNullable(str);
            return this;
        }

        public EducationIntention setExam(String str) {
            this.exam = Optional.ofNullable(str);
            return this;
        }

        public EducationIntention setGrade(String str) {
            this.grade = Optional.ofNullable(str);
            return this;
        }

        public EducationIntention setKeyword(String str) {
            this.keyword = Optional.ofNullable(str);
            return this;
        }

        public EducationIntention setName(String str) {
            this.name = Optional.ofNullable(str);
            return this;
        }

        public EducationIntention setPayment(Payment payment) {
            this.payment = Optional.ofNullable(payment);
            return this;
        }

        public EducationIntention setSubject(String str) {
            this.subject = Optional.ofNullable(str);
            return this;
        }

        public EducationIntention setTag(String str) {
            this.tag = Optional.ofNullable(str);
            return this;
        }

        public EducationIntention setTextName(String str) {
            this.text_name = Optional.ofNullable(str);
            return this;
        }

        public EducationIntention setVersion(String str) {
            this.version = Optional.ofNullable(str);
            return this;
        }

        public EducationIntention setVolume(String str) {
            this.volume = Optional.ofNullable(str);
            return this;
        }

        public EducationIntention setYear(int i) {
            this.year = Optional.ofNullable(Integer.valueOf(i));
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
        HOTEL_BOOK(0);

        private int id;

        HotelAction(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class HotelIntention {

        @Required
        private HotelAction action;
        private Optional<String> city = Optional.empty();
        private Optional<String> address = Optional.empty();
        private Optional<String> time = Optional.empty();
        private Optional<String> hotel_name = Optional.empty();
        private Optional<HotelType> hotel_type = Optional.empty();
        private Optional<HotelStarLevel> star_level = Optional.empty();
        private Optional<HotelRoomType> room_type = Optional.empty();
        private Optional<Integer> min_price = Optional.empty();
        private Optional<Integer> max_price = Optional.empty();

        public HotelIntention() {
        }

        public HotelIntention(HotelAction hotelAction) {
            this.action = hotelAction;
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
            this.address = Optional.ofNullable(str);
            return this;
        }

        public HotelIntention setCity(String str) {
            this.city = Optional.ofNullable(str);
            return this;
        }

        public HotelIntention setHotelName(String str) {
            this.hotel_name = Optional.ofNullable(str);
            return this;
        }

        public HotelIntention setHotelType(HotelType hotelType) {
            this.hotel_type = Optional.ofNullable(hotelType);
            return this;
        }

        public HotelIntention setMaxPrice(int i) {
            this.max_price = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public HotelIntention setMinPrice(int i) {
            this.min_price = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public HotelIntention setRoomType(HotelRoomType hotelRoomType) {
            this.room_type = Optional.ofNullable(hotelRoomType);
            return this;
        }

        public HotelIntention setStarLevel(HotelStarLevel hotelStarLevel) {
            this.star_level = Optional.ofNullable(hotelStarLevel);
            return this;
        }

        public HotelIntention setTime(String str) {
            this.time = Optional.ofNullable(str);
            return this;
        }
    }

    public enum HotelRoomType {
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

    public static class IntentionNameItem {
        private Optional<String> keyword = Optional.empty();

        @Required
        private String name;

        public IntentionNameItem() {
        }

        public IntentionNameItem(String str) {
            this.name = str;
        }

        public Optional<String> getKeyword() {
            return this.keyword;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public IntentionNameItem setKeyword(String str) {
            this.keyword = Optional.ofNullable(str);
            return this;
        }

        @Required
        public IntentionNameItem setName(String str) {
            this.name = str;
            return this;
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

    public static class JokeIntention {

        @Required
        private JokeAction action;

        @Required
        private boolean is_multi_turn;

        @Required
        private JokeType joke_type;
        private Optional<String> keyword = Optional.empty();
        private Optional<String> tags = Optional.empty();

        public JokeIntention() {
        }

        public JokeIntention(JokeAction jokeAction, JokeType jokeType, boolean z) {
            this.action = jokeAction;
            this.joke_type = jokeType;
            this.is_multi_turn = z;
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
            this.keyword = Optional.ofNullable(str);
            return this;
        }

        public JokeIntention setTags(String str) {
            this.tags = Optional.ofNullable(str);
            return this;
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

    @NamespaceName(name = "LoadMore", namespace = AIApiConstants.Nlp.NAME)
    public static class LoadMore implements EventPayload {

        @Required
        private String origin_id;
        private Optional<String> token = Optional.empty();
        private Optional<Integer> offset = Optional.empty();
        private Optional<Integer> delta = Optional.empty();

        public LoadMore() {
        }

        public LoadMore(String str) {
            this.origin_id = str;
        }

        public Optional<Integer> getDelta() {
            return this.delta;
        }

        public Optional<Integer> getOffset() {
            return this.offset;
        }

        @Required
        public String getOriginId() {
            return this.origin_id;
        }

        public Optional<String> getToken() {
            return this.token;
        }

        public LoadMore setDelta(int i) {
            this.delta = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public LoadMore setOffset(int i) {
            this.offset = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        @Required
        public LoadMore setOriginId(String str) {
            this.origin_id = str;
            return this;
        }

        public LoadMore setToken(String str) {
            this.token = Optional.ofNullable(str);
            return this;
        }
    }

    public enum LotteryAction {
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

    public static class LotteryIntention {

        @Required
        private LotteryAction action;
        private Optional<LotteryType> lottery = Optional.empty();
        private Optional<LotteryCategory> category = Optional.empty();
        private Optional<String> name = Optional.empty();
        private Optional<String> area = Optional.empty();
        private Optional<String> time = Optional.empty();
        private Optional<Integer> issue = Optional.empty();

        public LotteryIntention() {
        }

        public LotteryIntention(LotteryAction lotteryAction) {
            this.action = lotteryAction;
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
            this.area = Optional.ofNullable(str);
            return this;
        }

        public LotteryIntention setCategory(LotteryCategory lotteryCategory) {
            this.category = Optional.ofNullable(lotteryCategory);
            return this;
        }

        public LotteryIntention setIssue(int i) {
            this.issue = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public LotteryIntention setLottery(LotteryType lotteryType) {
            this.lottery = Optional.ofNullable(lotteryType);
            return this;
        }

        public LotteryIntention setName(String str) {
            this.name = Optional.ofNullable(str);
            return this;
        }

        public LotteryIntention setTime(String str) {
            this.time = Optional.ofNullable(str);
            return this;
        }
    }

    public enum LotteryType {
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

    public static class MapAppIntention {

        @Required
        private MapAppAction action;
        private Optional<String> sub_action = Optional.empty();
        private Optional<String> origin = Optional.empty();
        private Optional<String> dest = Optional.empty();
        private Optional<String> tag = Optional.empty();
        private Optional<AddressToModify> address_to_modify = Optional.empty();
        private Optional<String> map_keyword = Optional.empty();
        private Optional<TravelPreference> travel_preference = Optional.empty();
        private Optional<Integer> route_num = Optional.empty();
        private Optional<List<MapModes>> map_modes = Optional.empty();

        public MapAppIntention() {
        }

        public MapAppIntention(MapAppAction mapAppAction) {
            this.action = mapAppAction;
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
            this.address_to_modify = Optional.ofNullable(addressToModify);
            return this;
        }

        public MapAppIntention setDest(String str) {
            this.dest = Optional.ofNullable(str);
            return this;
        }

        public MapAppIntention setMapKeyword(String str) {
            this.map_keyword = Optional.ofNullable(str);
            return this;
        }

        public MapAppIntention setMapModes(List<MapModes> list) {
            this.map_modes = Optional.ofNullable(list);
            return this;
        }

        public MapAppIntention setOrigin(String str) {
            this.origin = Optional.ofNullable(str);
            return this;
        }

        public MapAppIntention setRouteNum(int i) {
            this.route_num = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public MapAppIntention setSubAction(String str) {
            this.sub_action = Optional.ofNullable(str);
            return this;
        }

        public MapAppIntention setTag(String str) {
            this.tag = Optional.ofNullable(str);
            return this;
        }

        public MapAppIntention setTravelPreference(TravelPreference travelPreference) {
            this.travel_preference = Optional.ofNullable(travelPreference);
            return this;
        }
    }

    public enum MapModes {
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

    public static class MusicIntention {
        private Optional<List<String>> artists = Optional.empty();
        private Optional<String> song = Optional.empty();
        private Optional<String> album = Optional.empty();
        private Optional<String> keyword = Optional.empty();
        private Optional<List<String>> tags = Optional.empty();
        private Optional<IntentionActionType> action = Optional.empty();
        private Optional<Period> duration = Optional.empty();
        private Optional<AppName> execute_app = Optional.empty();

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
            this.action = Optional.ofNullable(intentionActionType);
            return this;
        }

        public MusicIntention setAlbum(String str) {
            this.album = Optional.ofNullable(str);
            return this;
        }

        public MusicIntention setArtists(List<String> list) {
            this.artists = Optional.ofNullable(list);
            return this;
        }

        public MusicIntention setDuration(Period period) {
            this.duration = Optional.ofNullable(period);
            return this;
        }

        public MusicIntention setExecuteApp(AppName appName) {
            this.execute_app = Optional.ofNullable(appName);
            return this;
        }

        public MusicIntention setKeyword(String str) {
            this.keyword = Optional.ofNullable(str);
            return this;
        }

        public MusicIntention setSong(String str) {
            this.song = Optional.ofNullable(str);
            return this;
        }

        public MusicIntention setTags(List<String> list) {
            this.tags = Optional.ofNullable(list);
            return this;
        }
    }

    public static class NewsIntention {
        private Optional<String> time = Optional.empty();
        private Optional<String> area = Optional.empty();
        private Optional<String> type = Optional.empty();
        private Optional<String> tag = Optional.empty();
        private Optional<String> keyword = Optional.empty();
        private Optional<String> program = Optional.empty();

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
            this.area = Optional.ofNullable(str);
            return this;
        }

        public NewsIntention setKeyword(String str) {
            this.keyword = Optional.ofNullable(str);
            return this;
        }

        public NewsIntention setProgram(String str) {
            this.program = Optional.ofNullable(str);
            return this;
        }

        public NewsIntention setTag(String str) {
            this.tag = Optional.ofNullable(str);
            return this;
        }

        public NewsIntention setTime(String str) {
            this.time = Optional.ofNullable(str);
            return this;
        }

        public NewsIntention setType(String str) {
            this.type = Optional.ofNullable(str);
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

    public enum Payment {
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

    public enum PoemAction {
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

    public static class PoemIntention {

        @Required
        private PoemAction action;
        private Optional<String> poet = Optional.empty();
        private Optional<String> title = Optional.empty();
        private Optional<String> verse = Optional.empty();
        private Optional<String> dynasty = Optional.empty();
        private Optional<PoemType> poem_type = Optional.empty();

        public PoemIntention() {
        }

        public PoemIntention(PoemAction poemAction) {
            this.action = poemAction;
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
            this.dynasty = Optional.ofNullable(str);
            return this;
        }

        public PoemIntention setPoemType(PoemType poemType) {
            this.poem_type = Optional.ofNullable(poemType);
            return this;
        }

        public PoemIntention setPoet(String str) {
            this.poet = Optional.ofNullable(str);
            return this;
        }

        public PoemIntention setTitle(String str) {
            this.title = Optional.ofNullable(str);
            return this;
        }

        public PoemIntention setVerse(String str) {
            this.verse = Optional.ofNullable(str);
            return this;
        }
    }

    public enum PoemType {
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
        private Optional<IntentionNameItem> name = Optional.empty();
        private Optional<String> fm = Optional.empty();
        private Optional<String> location = Optional.empty();
        private Optional<List<String>> tags = Optional.empty();

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
            this.fm = Optional.ofNullable(str);
            return this;
        }

        public RadioIntention setLocation(String str) {
            this.location = Optional.ofNullable(str);
            return this;
        }

        public RadioIntention setName(IntentionNameItem intentionNameItem) {
            this.name = Optional.ofNullable(intentionNameItem);
            return this;
        }

        public RadioIntention setTags(List<String> list) {
            this.tags = Optional.ofNullable(list);
            return this;
        }
    }

    public enum RecipeAction {
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

    public static class RecipeIntention {

        @Required
        private RecipeAction action;
        private Optional<String> recipe = Optional.empty();
        private Optional<String> style = Optional.empty();
        private Optional<String> effect = Optional.empty();
        private Optional<String> tasty = Optional.empty();
        private Optional<String> varity = Optional.empty();
        private Optional<String> scene = Optional.empty();
        private Optional<String> crowd = Optional.empty();
        private Optional<String> material = Optional.empty();
        private Optional<String> festival = Optional.empty();

        public RecipeIntention() {
        }

        public RecipeIntention(RecipeAction recipeAction) {
            this.action = recipeAction;
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
            this.crowd = Optional.ofNullable(str);
            return this;
        }

        public RecipeIntention setEffect(String str) {
            this.effect = Optional.ofNullable(str);
            return this;
        }

        public RecipeIntention setFestival(String str) {
            this.festival = Optional.ofNullable(str);
            return this;
        }

        public RecipeIntention setMaterial(String str) {
            this.material = Optional.ofNullable(str);
            return this;
        }

        public RecipeIntention setRecipe(String str) {
            this.recipe = Optional.ofNullable(str);
            return this;
        }

        public RecipeIntention setScene(String str) {
            this.scene = Optional.ofNullable(str);
            return this;
        }

        public RecipeIntention setStyle(String str) {
            this.style = Optional.ofNullable(str);
            return this;
        }

        public RecipeIntention setTasty(String str) {
            this.tasty = Optional.ofNullable(str);
            return this;
        }

        public RecipeIntention setVarity(String str) {
            this.varity = Optional.ofNullable(str);
            return this;
        }
    }

    @NamespaceName(name = "Request", namespace = AIApiConstants.Nlp.NAME)
    public static class Request implements EventPayload {

        @Required
        private String query;
        private Optional<String> locale = Optional.empty();
        private Optional<Settings.TtsConfig> tts = Optional.empty();

        public Request() {
        }

        public Request(String str) {
            this.query = str;
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
            this.locale = Optional.ofNullable(str);
            return this;
        }

        @Required
        public Request setQuery(String str) {
            this.query = str;
            return this;
        }

        public Request setTts(Settings.TtsConfig ttsConfig) {
            this.tts = Optional.ofNullable(ttsConfig);
            return this;
        }
    }

    public enum RestrictDrivingAction {
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

    public static class RestrictDrivingIntention {

        @Required
        private RestrictDrivingAction action;
        private Optional<String> date = Optional.empty();
        private Optional<String> city = Optional.empty();
        private Optional<Integer> restrict_num = Optional.empty();
        private Optional<String> plate_num = Optional.empty();
        private Optional<String> time_spec = Optional.empty();

        public RestrictDrivingIntention() {
        }

        public RestrictDrivingIntention(RestrictDrivingAction restrictDrivingAction) {
            this.action = restrictDrivingAction;
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
            this.city = Optional.ofNullable(str);
            return this;
        }

        public RestrictDrivingIntention setDate(String str) {
            this.date = Optional.ofNullable(str);
            return this;
        }

        public RestrictDrivingIntention setPlateNum(String str) {
            this.plate_num = Optional.ofNullable(str);
            return this;
        }

        public RestrictDrivingIntention setRestrictNum(int i) {
            this.restrict_num = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public RestrictDrivingIntention setTimeSpec(String str) {
            this.time_spec = Optional.ofNullable(str);
            return this;
        }
    }

    public enum ScreenResolution {
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
        private Optional<StockPriceType> stock_price = Optional.empty();

        public SecurityIntention() {
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
            this.stock_price = Optional.ofNullable(stockPriceType);
            return this;
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

    public static class SmartAppIntention {

        @Required
        private SmartAppActionType action;

        @Required
        private SmartAppHitType hit_type;
        private Optional<String> name = Optional.empty();
        private Optional<String> tag = Optional.empty();

        public SmartAppIntention() {
        }

        public SmartAppIntention(SmartAppActionType smartAppActionType, SmartAppHitType smartAppHitType) {
            this.action = smartAppActionType;
            this.hit_type = smartAppHitType;
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
            this.name = Optional.ofNullable(str);
            return this;
        }

        public SmartAppIntention setTag(String str) {
            this.tag = Optional.ofNullable(str);
            return this;
        }
    }

    public enum SongListResourceType {
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
        private Optional<String> list_name = Optional.empty();
        private Optional<String> list_id = Optional.empty();
        private Optional<String> album_id = Optional.empty();
        private Optional<String> album_name = Optional.empty();

        public SonglistIntention() {
        }

        public SonglistIntention(SongListResourceType songListResourceType, String str, int i, int i2, boolean z) {
            this.resource_type = songListResourceType;
            this.prefer_source = str;
            this.total = i;
            this.offset = i2;
            this.kid_mode = z;
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
            this.album_id = Optional.ofNullable(str);
            return this;
        }

        public SonglistIntention setAlbumName(String str) {
            this.album_name = Optional.ofNullable(str);
            return this;
        }

        @Required
        public SonglistIntention setKidMode(boolean z) {
            this.kid_mode = z;
            return this;
        }

        public SonglistIntention setListId(String str) {
            this.list_id = Optional.ofNullable(str);
            return this;
        }

        public SonglistIntention setListName(String str) {
            this.list_name = Optional.ofNullable(str);
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
    }

    public static class SoundboxControlIntention {

        @Required
        private String action;
        private Optional<Integer> duration = Optional.empty();
        private Optional<String> object_name = Optional.empty();
        private Optional<Integer> value = Optional.empty();
        private Optional<Integer> index = Optional.empty();
        private Optional<String> dialect = Optional.empty();
        private Optional<Speaker.VolumeType> volume_type = Optional.empty();
        private Optional<Integer> volume = Optional.empty();
        private Optional<Speaker.UnitDef> volume_unit = Optional.empty();
        private Optional<String> after_finish = Optional.empty();
        private Optional<Float> seed = Optional.empty();
        private Optional<SoundboxLoopMode> mode = Optional.empty();
        private Optional<ScreenResolution> resolution = Optional.empty();

        public SoundboxControlIntention() {
        }

        public SoundboxControlIntention(String str) {
            this.action = str;
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
            this.after_finish = Optional.ofNullable(str);
            return this;
        }

        public SoundboxControlIntention setDialect(String str) {
            this.dialect = Optional.ofNullable(str);
            return this;
        }

        public SoundboxControlIntention setDuration(int i) {
            this.duration = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public SoundboxControlIntention setIndex(int i) {
            this.index = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public SoundboxControlIntention setMode(SoundboxLoopMode soundboxLoopMode) {
            this.mode = Optional.ofNullable(soundboxLoopMode);
            return this;
        }

        public SoundboxControlIntention setObjectName(String str) {
            this.object_name = Optional.ofNullable(str);
            return this;
        }

        public SoundboxControlIntention setResolution(ScreenResolution screenResolution) {
            this.resolution = Optional.ofNullable(screenResolution);
            return this;
        }

        public SoundboxControlIntention setSeed(float f) {
            this.seed = Optional.ofNullable(Float.valueOf(f));
            return this;
        }

        public SoundboxControlIntention setValue(int i) {
            this.value = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public SoundboxControlIntention setVolume(int i) {
            this.volume = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public SoundboxControlIntention setVolumeType(Speaker.VolumeType volumeType) {
            this.volume_type = Optional.ofNullable(volumeType);
            return this;
        }

        public SoundboxControlIntention setVolumeUnit(Speaker.UnitDef unitDef) {
            this.volume_unit = Optional.ofNullable(unitDef);
            return this;
        }
    }

    public enum SoundboxLoopMode {
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

    public enum SportCompetitionType {
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

    public static class SportsIntention {

        @Required
        private SportSubject subject;

        @Required
        private SportTargetType target_type;
        private Optional<SportsType> sports_type = Optional.empty();
        private Optional<SportCompetitionType> competition_type = Optional.empty();
        private Optional<String> season = Optional.empty();
        private Optional<SportStageType> stage = Optional.empty();
        private Optional<String> team1 = Optional.empty();
        private Optional<String> team2 = Optional.empty();
        private Optional<String> player = Optional.empty();
        private Optional<String> round = Optional.empty();
        private Optional<String> group = Optional.empty();
        private Optional<String> time_type = Optional.empty();
        private Optional<String> start_time = Optional.empty();
        private Optional<String> end_time = Optional.empty();
        private Optional<SportGrainType> grain = Optional.empty();
        private Optional<Boolean> festival_flag = Optional.empty();
        private Optional<Boolean> exceptional = Optional.empty();
        private Optional<String> token = Optional.empty();
        private Optional<Long> start_timestamp = Optional.empty();
        private Optional<Long> end_timestamp = Optional.empty();
        private Optional<SportStateItem> stat_item = Optional.empty();
        private Optional<SportHomeAway> home_away = Optional.empty();
        private Optional<String> rank = Optional.empty();
        private Optional<String> rank_by = Optional.empty();
        private Optional<String> top_n = Optional.empty();
        private Optional<String> number = Optional.empty();
        private Optional<Boolean> first = Optional.empty();
        private Optional<Boolean> outlet = Optional.empty();
        private Optional<SportRoleType> role = Optional.empty();
        private Optional<String> sport_competition = Optional.empty();

        public SportsIntention() {
        }

        public SportsIntention(SportSubject sportSubject, SportTargetType sportTargetType) {
            this.subject = sportSubject;
            this.target_type = sportTargetType;
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
            this.competition_type = Optional.ofNullable(sportCompetitionType);
            return this;
        }

        public SportsIntention setEndTime(String str) {
            this.end_time = Optional.ofNullable(str);
            return this;
        }

        public SportsIntention setEndTimestamp(long j) {
            this.end_timestamp = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public SportsIntention setExceptional(boolean z) {
            this.exceptional = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public SportsIntention setFestivalFlag(boolean z) {
            this.festival_flag = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public SportsIntention setFirst(boolean z) {
            this.first = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public SportsIntention setGrain(SportGrainType sportGrainType) {
            this.grain = Optional.ofNullable(sportGrainType);
            return this;
        }

        public SportsIntention setGroup(String str) {
            this.group = Optional.ofNullable(str);
            return this;
        }

        public SportsIntention setHomeAway(SportHomeAway sportHomeAway) {
            this.home_away = Optional.ofNullable(sportHomeAway);
            return this;
        }

        public SportsIntention setNumber(String str) {
            this.number = Optional.ofNullable(str);
            return this;
        }

        public SportsIntention setOutlet(boolean z) {
            this.outlet = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public SportsIntention setPlayer(String str) {
            this.player = Optional.ofNullable(str);
            return this;
        }

        public SportsIntention setRank(String str) {
            this.rank = Optional.ofNullable(str);
            return this;
        }

        public SportsIntention setRankBy(String str) {
            this.rank_by = Optional.ofNullable(str);
            return this;
        }

        public SportsIntention setRole(SportRoleType sportRoleType) {
            this.role = Optional.ofNullable(sportRoleType);
            return this;
        }

        public SportsIntention setRound(String str) {
            this.round = Optional.ofNullable(str);
            return this;
        }

        public SportsIntention setSeason(String str) {
            this.season = Optional.ofNullable(str);
            return this;
        }

        public SportsIntention setSportCompetition(String str) {
            this.sport_competition = Optional.ofNullable(str);
            return this;
        }

        public SportsIntention setSportsType(SportsType sportsType) {
            this.sports_type = Optional.ofNullable(sportsType);
            return this;
        }

        public SportsIntention setStage(SportStageType sportStageType) {
            this.stage = Optional.ofNullable(sportStageType);
            return this;
        }

        public SportsIntention setStartTime(String str) {
            this.start_time = Optional.ofNullable(str);
            return this;
        }

        public SportsIntention setStartTimestamp(long j) {
            this.start_timestamp = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public SportsIntention setStatItem(SportStateItem sportStateItem) {
            this.stat_item = Optional.ofNullable(sportStateItem);
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
            this.team1 = Optional.ofNullable(str);
            return this;
        }

        public SportsIntention setTeam2(String str) {
            this.team2 = Optional.ofNullable(str);
            return this;
        }

        public SportsIntention setTimeType(String str) {
            this.time_type = Optional.ofNullable(str);
            return this;
        }

        public SportsIntention setToken(String str) {
            this.token = Optional.ofNullable(str);
            return this;
        }

        public SportsIntention setTopN(String str) {
            this.top_n = Optional.ofNullable(str);
            return this;
        }
    }

    public enum SportsType {
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

    public enum StationFilterType {
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
        private Optional<IntentionNameItem> primary_name = Optional.empty();
        private Optional<IntentionNameItem> secondary_name = Optional.empty();
        private Optional<Integer> season = Optional.empty();
        private Optional<Integer> episode = Optional.empty();
        private Optional<List<String>> artists = Optional.empty();
        private Optional<List<String>> types = Optional.empty();
        private Optional<List<String>> tags = Optional.empty();
        private Optional<List<String>> characters = Optional.empty();
        private Optional<List<StationFilterType>> filters = Optional.empty();
        private Optional<Period> duration = Optional.empty();
        private Optional<GenderDef> gender = Optional.empty();
        private Optional<AgeRange> ageRange = Optional.empty();
        private Optional<Boolean> updated = Optional.empty();
        private Optional<AppName> execute_app = Optional.empty();
        private Optional<IntentionActionType> action = Optional.empty();

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
            this.action = Optional.ofNullable(intentionActionType);
            return this;
        }

        public StationIntention setAgeRange(AgeRange ageRange) {
            this.ageRange = Optional.ofNullable(ageRange);
            return this;
        }

        public StationIntention setArtists(List<String> list) {
            this.artists = Optional.ofNullable(list);
            return this;
        }

        public StationIntention setCharacters(List<String> list) {
            this.characters = Optional.ofNullable(list);
            return this;
        }

        public StationIntention setDuration(Period period) {
            this.duration = Optional.ofNullable(period);
            return this;
        }

        public StationIntention setEpisode(int i) {
            this.episode = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public StationIntention setExecuteApp(AppName appName) {
            this.execute_app = Optional.ofNullable(appName);
            return this;
        }

        public StationIntention setFilters(List<StationFilterType> list) {
            this.filters = Optional.ofNullable(list);
            return this;
        }

        public StationIntention setGender(GenderDef genderDef) {
            this.gender = Optional.ofNullable(genderDef);
            return this;
        }

        public StationIntention setPrimaryName(IntentionNameItem intentionNameItem) {
            this.primary_name = Optional.ofNullable(intentionNameItem);
            return this;
        }

        public StationIntention setSeason(int i) {
            this.season = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public StationIntention setSecondaryName(IntentionNameItem intentionNameItem) {
            this.secondary_name = Optional.ofNullable(intentionNameItem);
            return this;
        }

        public StationIntention setTags(List<String> list) {
            this.tags = Optional.ofNullable(list);
            return this;
        }

        public StationIntention setTypes(List<String> list) {
            this.types = Optional.ofNullable(list);
            return this;
        }

        public StationIntention setUpdated(boolean z) {
            this.updated = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }
    }

    public enum StockPriceType {
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

    public enum TimeAction {
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

    public static class TimeIntention {

        @Required
        private TimeAction action;
        private Optional<String> start_time = Optional.empty();
        private Optional<Boolean> start_time_festival_flag = Optional.empty();
        private Optional<String> end_time = Optional.empty();
        private Optional<Boolean> end_time_festival_flag = Optional.empty();
        private Optional<String> time_zone = Optional.empty();
        private Optional<CalendarType> calendar = Optional.empty();

        public TimeIntention() {
        }

        public TimeIntention(TimeAction timeAction) {
            this.action = timeAction;
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

        public Optional<Boolean> isEndTimeFestivalFlag() {
            return this.end_time_festival_flag;
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
            this.calendar = Optional.ofNullable(calendarType);
            return this;
        }

        public TimeIntention setEndTime(String str) {
            this.end_time = Optional.ofNullable(str);
            return this;
        }

        public TimeIntention setEndTimeFestivalFlag(boolean z) {
            this.end_time_festival_flag = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public TimeIntention setStartTime(String str) {
            this.start_time = Optional.ofNullable(str);
            return this;
        }

        public TimeIntention setStartTimeFestivalFlag(boolean z) {
            this.start_time_festival_flag = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public TimeIntention setTimeZone(String str) {
            this.time_zone = Optional.ofNullable(str);
            return this;
        }
    }

    public enum TimeUnitType {
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

    public static class ToDoListIntention {

        @Required
        private ToDoListAction action;
        private Optional<String> todo = Optional.empty();

        public ToDoListIntention() {
        }

        public ToDoListIntention(ToDoListAction toDoListAction) {
            this.action = toDoListAction;
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
            this.todo = Optional.ofNullable(str);
            return this;
        }
    }

    public enum TranslationFuncType {
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

    public static class TransportTicketIntention {

        @Required
        private TransportTicketAction action;
        private Optional<String> raw_order_time = Optional.empty();
        private Optional<String> standard_order_begin_time = Optional.empty();
        private Optional<String> standard_order_end_time = Optional.empty();
        private Optional<String> from_city = Optional.empty();
        private Optional<String> to_city = Optional.empty();
        private Optional<TransportTicketType> ticket_type = Optional.empty();
        private Optional<TransportType> transport_type = Optional.empty();

        public TransportTicketIntention() {
        }

        public TransportTicketIntention(TransportTicketAction transportTicketAction) {
            this.action = transportTicketAction;
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
            this.from_city = Optional.ofNullable(str);
            return this;
        }

        public TransportTicketIntention setRawOrderTime(String str) {
            this.raw_order_time = Optional.ofNullable(str);
            return this;
        }

        public TransportTicketIntention setStandardOrderBeginTime(String str) {
            this.standard_order_begin_time = Optional.ofNullable(str);
            return this;
        }

        public TransportTicketIntention setStandardOrderEndTime(String str) {
            this.standard_order_end_time = Optional.ofNullable(str);
            return this;
        }

        public TransportTicketIntention setTicketType(TransportTicketType transportTicketType) {
            this.ticket_type = Optional.ofNullable(transportTicketType);
            return this;
        }

        public TransportTicketIntention setToCity(String str) {
            this.to_city = Optional.ofNullable(str);
            return this;
        }

        public TransportTicketIntention setTransportType(TransportType transportType) {
            this.transport_type = Optional.ofNullable(transportType);
            return this;
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

    public static class VideoIntention {
        private Optional<String> name = Optional.empty();
        private Optional<Integer> season = Optional.empty();
        private Optional<String> category = Optional.empty();
        private Optional<List<String>> tags = Optional.empty();
        private Optional<List<String>> characters = Optional.empty();
        private Optional<List<String>> directors = Optional.empty();
        private Optional<Period> period = Optional.empty();
        private Optional<Integer> episode = Optional.empty();
        private Optional<String> style = Optional.empty();
        private Optional<String> keyword = Optional.empty();
        private Optional<String> theme = Optional.empty();
        private Optional<String> plot = Optional.empty();
        private Optional<String> emotion = Optional.empty();
        private Optional<String> subject = Optional.empty();
        private Optional<String> time = Optional.empty();
        private Optional<String> video_type = Optional.empty();
        private Optional<Boolean> payment = Optional.empty();
        private Optional<String> area = Optional.empty();
        private Optional<String> award = Optional.empty();
        private Optional<String> resolution = Optional.empty();
        private Optional<String> rating = Optional.empty();
        private Optional<String> age = Optional.empty();
        private Optional<String> language = Optional.empty();
        private Optional<String> vtype = Optional.empty();
        private Optional<String> publisher = Optional.empty();
        private Optional<VideoOrder> popularity = Optional.empty();
        private Optional<VideoOrder> year_order = Optional.empty();
        private Optional<String> award_year = Optional.empty();

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
            this.age = Optional.ofNullable(str);
            return this;
        }

        public VideoIntention setArea(String str) {
            this.area = Optional.ofNullable(str);
            return this;
        }

        public VideoIntention setAward(String str) {
            this.award = Optional.ofNullable(str);
            return this;
        }

        public VideoIntention setAwardYear(String str) {
            this.award_year = Optional.ofNullable(str);
            return this;
        }

        public VideoIntention setCategory(String str) {
            this.category = Optional.ofNullable(str);
            return this;
        }

        public VideoIntention setCharacters(List<String> list) {
            this.characters = Optional.ofNullable(list);
            return this;
        }

        public VideoIntention setDirectors(List<String> list) {
            this.directors = Optional.ofNullable(list);
            return this;
        }

        public VideoIntention setEmotion(String str) {
            this.emotion = Optional.ofNullable(str);
            return this;
        }

        public VideoIntention setEpisode(int i) {
            this.episode = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VideoIntention setKeyword(String str) {
            this.keyword = Optional.ofNullable(str);
            return this;
        }

        public VideoIntention setLanguage(String str) {
            this.language = Optional.ofNullable(str);
            return this;
        }

        public VideoIntention setName(String str) {
            this.name = Optional.ofNullable(str);
            return this;
        }

        public VideoIntention setPayment(boolean z) {
            this.payment = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public VideoIntention setPeriod(Period period) {
            this.period = Optional.ofNullable(period);
            return this;
        }

        public VideoIntention setPlot(String str) {
            this.plot = Optional.ofNullable(str);
            return this;
        }

        public VideoIntention setPopularity(VideoOrder videoOrder) {
            this.popularity = Optional.ofNullable(videoOrder);
            return this;
        }

        public VideoIntention setPublisher(String str) {
            this.publisher = Optional.ofNullable(str);
            return this;
        }

        public VideoIntention setRating(String str) {
            this.rating = Optional.ofNullable(str);
            return this;
        }

        public VideoIntention setResolution(String str) {
            this.resolution = Optional.ofNullable(str);
            return this;
        }

        public VideoIntention setSeason(int i) {
            this.season = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public VideoIntention setStyle(String str) {
            this.style = Optional.ofNullable(str);
            return this;
        }

        public VideoIntention setSubject(String str) {
            this.subject = Optional.ofNullable(str);
            return this;
        }

        public VideoIntention setTags(List<String> list) {
            this.tags = Optional.ofNullable(list);
            return this;
        }

        public VideoIntention setTheme(String str) {
            this.theme = Optional.ofNullable(str);
            return this;
        }

        public VideoIntention setTime(String str) {
            this.time = Optional.ofNullable(str);
            return this;
        }

        public VideoIntention setVideoType(String str) {
            this.video_type = Optional.ofNullable(str);
            return this;
        }

        public VideoIntention setVtype(String str) {
            this.vtype = Optional.ofNullable(str);
            return this;
        }

        public VideoIntention setYearOrder(VideoOrder videoOrder) {
            this.year_order = Optional.ofNullable(videoOrder);
            return this;
        }
    }

    public enum VideoOrder {
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
        QUERY(0);

        private int id;

        ViolationAction(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class ViolationIntention {

        @Required
        private ViolationAction action;
        private Optional<String> car = Optional.empty();
        private Optional<String> number = Optional.empty();

        public ViolationIntention() {
        }

        public ViolationIntention(ViolationAction violationAction) {
            this.action = violationAction;
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
            this.car = Optional.ofNullable(str);
            return this;
        }

        public ViolationIntention setNumber(String str) {
            this.number = Optional.ofNullable(str);
            return this;
        }
    }

    public static class VoiceIntention {
        private Optional<String> query = Optional.empty();
        private Optional<String> object = Optional.empty();
        private Optional<String> last_object = Optional.empty();
        private Optional<VoiceSlotType> slot = Optional.empty();

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
            this.last_object = Optional.ofNullable(str);
            return this;
        }

        public VoiceIntention setObject(String str) {
            this.object = Optional.ofNullable(str);
            return this;
        }

        public VoiceIntention setQuery(String str) {
            this.query = Optional.ofNullable(str);
            return this;
        }

        public VoiceIntention setSlot(VoiceSlotType voiceSlotType) {
            this.slot = Optional.ofNullable(voiceSlotType);
            return this;
        }
    }

    public enum VoiceSlotType {
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

    public static class WeatherIntention {

        @Required
        private WeatherIntentType intent;
        private Optional<String> date = Optional.empty();
        private Optional<String> duration = Optional.empty();
        private Optional<String> time = Optional.empty();
        private Optional<String> poi = Optional.empty();
        private Optional<String> district = Optional.empty();
        private Optional<String> city = Optional.empty();
        private Optional<String> province = Optional.empty();
        private Optional<String> country = Optional.empty();
        private Optional<WeatherBroadcastType> broadcast = Optional.empty();
        private Optional<String> meteor_assert_value = Optional.empty();
        private Optional<String> time_spec = Optional.empty();
        private Optional<WeatherSportType> sport_type = Optional.empty();

        public WeatherIntention() {
        }

        public WeatherIntention(WeatherIntentType weatherIntentType) {
            this.intent = weatherIntentType;
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
            this.broadcast = Optional.ofNullable(weatherBroadcastType);
            return this;
        }

        public WeatherIntention setCity(String str) {
            this.city = Optional.ofNullable(str);
            return this;
        }

        public WeatherIntention setCountry(String str) {
            this.country = Optional.ofNullable(str);
            return this;
        }

        public WeatherIntention setDate(String str) {
            this.date = Optional.ofNullable(str);
            return this;
        }

        public WeatherIntention setDistrict(String str) {
            this.district = Optional.ofNullable(str);
            return this;
        }

        public WeatherIntention setDuration(String str) {
            this.duration = Optional.ofNullable(str);
            return this;
        }

        @Required
        public WeatherIntention setIntent(WeatherIntentType weatherIntentType) {
            this.intent = weatherIntentType;
            return this;
        }

        public WeatherIntention setMeteorAssertValue(String str) {
            this.meteor_assert_value = Optional.ofNullable(str);
            return this;
        }

        public WeatherIntention setPoi(String str) {
            this.poi = Optional.ofNullable(str);
            return this;
        }

        public WeatherIntention setProvince(String str) {
            this.province = Optional.ofNullable(str);
            return this;
        }

        public WeatherIntention setSportType(WeatherSportType weatherSportType) {
            this.sport_type = Optional.ofNullable(weatherSportType);
            return this;
        }

        public WeatherIntention setTime(String str) {
            this.time = Optional.ofNullable(str);
            return this;
        }

        public WeatherIntention setTimeSpec(String str) {
            this.time_spec = Optional.ofNullable(str);
            return this;
        }
    }

    public enum WeatherSportType {
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
}
