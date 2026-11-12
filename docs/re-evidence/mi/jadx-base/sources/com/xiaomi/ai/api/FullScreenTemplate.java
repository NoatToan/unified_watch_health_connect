package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import defpackage.mj1;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class FullScreenTemplate {

    public enum AnniversaryType {
        DEFAULT(0),
        BIRTHDAY(1),
        LOVEDAY(2),
        WEDDINGDAY(3),
        CUSTOMDAY(4);

        private int id;

        AnniversaryType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class ArtistInfo {
        private Optional<String> name = Optional.a();
        private Optional<String> character = Optional.a();
        private Optional<Image> image = Optional.a();

        public Optional<String> getCharacter() {
            return this.character;
        }

        public Optional<Image> getImage() {
            return this.image;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public ArtistInfo setCharacter(String str) {
            this.character = Optional.e(str);
            return this;
        }

        public ArtistInfo setImage(Image image) {
            this.image = Optional.e(image);
            return this;
        }

        public ArtistInfo setName(String str) {
            this.name = Optional.e(str);
            return this;
        }
    }

    public static class CPInfo {
        private Optional<String> key = Optional.a();
        private Optional<String> name = Optional.a();
        private Optional<Image> icon = Optional.a();
        private Optional<String> package_name = Optional.a();
        private Optional<String> version = Optional.a();

        public Optional<Image> getIcon() {
            return this.icon;
        }

        public Optional<String> getKey() {
            return this.key;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<String> getPackageName() {
            return this.package_name;
        }

        public Optional<String> getVersion() {
            return this.version;
        }

        public CPInfo setIcon(Image image) {
            this.icon = Optional.e(image);
            return this;
        }

        public CPInfo setKey(String str) {
            this.key = Optional.e(str);
            return this;
        }

        public CPInfo setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public CPInfo setPackageName(String str) {
            this.package_name = Optional.e(str);
            return this;
        }

        public CPInfo setVersion(String str) {
            this.version = Optional.e(str);
            return this;
        }
    }

    public static class CardGuideInfo {
        private Optional<Integer> position = Optional.a();
        private Optional<String> name = Optional.a();
        private Optional<String> request_query = Optional.a();

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<Integer> getPosition() {
            return this.position;
        }

        public Optional<String> getRequestQuery() {
            return this.request_query;
        }

        public CardGuideInfo setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public CardGuideInfo setPosition(int i) {
            this.position = Optional.e(Integer.valueOf(i));
            return this;
        }

        public CardGuideInfo setRequestQuery(String str) {
            this.request_query = Optional.e(str);
            return this;
        }
    }

    public enum CardTextType {
        UNKNOWN(-1),
        SINGLE(0),
        MULTIPLE(1);

        private int id;

        CardTextType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class CinemaInfo {
        private Optional<Integer> rank = Optional.a();
        private Optional<List<Template.Launcher>> buy_launcher = Optional.a();
        private Optional<List<Template.Launcher>> play_launcher = Optional.a();

        public Optional<List<Template.Launcher>> getBuyLauncher() {
            return this.buy_launcher;
        }

        public Optional<List<Template.Launcher>> getPlayLauncher() {
            return this.play_launcher;
        }

        public Optional<Integer> getRank() {
            return this.rank;
        }

        public CinemaInfo setBuyLauncher(List<Template.Launcher> list) {
            this.buy_launcher = Optional.e(list);
            return this;
        }

        public CinemaInfo setPlayLauncher(List<Template.Launcher> list) {
            this.play_launcher = Optional.e(list);
            return this;
        }

        public CinemaInfo setRank(int i) {
            this.rank = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    public enum CompositionContentType {
        UNKNOWN(-1),
        TEXT(0),
        URL(1);

        private int id;

        CompositionContentType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum ConversationFlowAlignType {
        DEFAULT(0),
        LEFT(1),
        RIGHT(2),
        MIDDLE(3);

        private int id;

        ConversationFlowAlignType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class CpLauncher {
        private Optional<String> key = Optional.a();
        private Optional<String> url = Optional.a();

        public Optional<String> getKey() {
            return this.key;
        }

        public Optional<String> getUrl() {
            return this.url;
        }

        public CpLauncher setKey(String str) {
            this.key = Optional.e(str);
            return this;
        }

        public CpLauncher setUrl(String str) {
            this.url = Optional.e(str);
            return this;
        }
    }

    @NamespaceName(name = "Dictionaries", namespace = AIApiConstants.FullScreenTemplate.NAME)
    public static class Dictionaries implements InstructionPayload {

        @Required
        private List<H5Dictionary> dictionaries;

        public Dictionaries() {
        }

        public Dictionaries(List<H5Dictionary> list) {
            this.dictionaries = list;
        }

        @Required
        public List<H5Dictionary> getDictionaries() {
            return this.dictionaries;
        }

        @Required
        public Dictionaries setDictionaries(List<H5Dictionary> list) {
            this.dictionaries = list;
            return this;
        }
    }

    public static class DictionaryAudioInfo {

        @Required
        private String text;

        @Required
        private String url;

        public DictionaryAudioInfo() {
        }

        public DictionaryAudioInfo(String str, String str2) {
            this.text = str;
            this.url = str2;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public String getUrl() {
            return this.url;
        }

        @Required
        public DictionaryAudioInfo setText(String str) {
            this.text = str;
            return this;
        }

        @Required
        public DictionaryAudioInfo setUrl(String str) {
            this.url = str;
            return this;
        }
    }

    public enum DictionaryCardType {
        UNKNOWN(-1),
        DETAILS(0),
        LIST(1),
        TARGET(2);

        private int id;

        DictionaryCardType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum DictionaryItemType {
        UNKNOWN(-1),
        WORDS(0),
        SENTENCE(1);

        private int id;

        DictionaryItemType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum DictionaryPropertyType {
        UNKNOWN(-1),
        PHRASE(0),
        WORD_SIMPLE(1),
        WORD(2),
        JIEGENG(3);

        private int id;

        DictionaryPropertyType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum DictionaryTargetType {
        DEFAULT(0),
        PINYIN(1),
        STROKE_ORDER(2);

        private int id;

        DictionaryTargetType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum DictionaryWordCardType {
        UNKNOWN(-1),
        OTHER(0),
        ALL_CHINESE(1),
        ALL_ENGLISH(2);

        private int id;

        DictionaryWordCardType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum DictionaryWordSourceType {
        UNKNOWN(-1),
        XIAO_JI(0),
        QABOT(1),
        YUN_YING(2);

        private int id;

        DictionaryWordSourceType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class Emoji {

        @Required
        private String url;

        public Emoji() {
        }

        public Emoji(String str) {
            this.url = str;
        }

        @Required
        public String getUrl() {
            return this.url;
        }

        @Required
        public Emoji setUrl(String str) {
            this.url = str;
            return this;
        }
    }

    public static class EpisodeDetail {
        private Optional<Template.Title> title = Optional.a();
        private Optional<String> app_url_identity = Optional.a();
        private Optional<String> h5_url_identity = Optional.a();

        public Optional<String> getAppUrlIdentity() {
            return this.app_url_identity;
        }

        public Optional<String> getH5UrlIdentity() {
            return this.h5_url_identity;
        }

        public Optional<Template.Title> getTitle() {
            return this.title;
        }

        public EpisodeDetail setAppUrlIdentity(String str) {
            this.app_url_identity = Optional.e(str);
            return this;
        }

        public EpisodeDetail setH5UrlIdentity(String str) {
            this.h5_url_identity = Optional.e(str);
            return this;
        }

        public EpisodeDetail setTitle(Template.Title title) {
            this.title = Optional.e(title);
            return this;
        }
    }

    public static class EpisodeInfo {
        private Optional<Integer> season = Optional.a();
        private Optional<Integer> total_episode = Optional.a();
        private Optional<Integer> latest_episode = Optional.a();
        private Optional<List<EpisodeInfoItem>> items = Optional.a();

        public Optional<List<EpisodeInfoItem>> getItems() {
            return this.items;
        }

        public Optional<Integer> getLatestEpisode() {
            return this.latest_episode;
        }

        public Optional<Integer> getSeason() {
            return this.season;
        }

        public Optional<Integer> getTotalEpisode() {
            return this.total_episode;
        }

        public EpisodeInfo setItems(List<EpisodeInfoItem> list) {
            this.items = Optional.e(list);
            return this;
        }

        public EpisodeInfo setLatestEpisode(int i) {
            this.latest_episode = Optional.e(Integer.valueOf(i));
            return this;
        }

        public EpisodeInfo setSeason(int i) {
            this.season = Optional.e(Integer.valueOf(i));
            return this;
        }

        public EpisodeInfo setTotalEpisode(int i) {
            this.total_episode = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    public static class EpisodeInfoItem {
        private Optional<String> key = Optional.a();
        private Optional<String> app_url_prev = Optional.a();
        private Optional<String> app_url_suffix = Optional.a();
        private Optional<String> H5_url_prev = Optional.a();
        private Optional<String> H5_url_suffix = Optional.a();
        private Optional<List<EpisodeDetail>> detail = Optional.a();

        public Optional<String> getAppUrlPrev() {
            return this.app_url_prev;
        }

        public Optional<String> getAppUrlSuffix() {
            return this.app_url_suffix;
        }

        public Optional<List<EpisodeDetail>> getDetail() {
            return this.detail;
        }

        public Optional<String> getH5UrlPrev() {
            return this.H5_url_prev;
        }

        public Optional<String> getH5UrlSuffix() {
            return this.H5_url_suffix;
        }

        public Optional<String> getKey() {
            return this.key;
        }

        public EpisodeInfoItem setAppUrlPrev(String str) {
            this.app_url_prev = Optional.e(str);
            return this;
        }

        public EpisodeInfoItem setAppUrlSuffix(String str) {
            this.app_url_suffix = Optional.e(str);
            return this;
        }

        public EpisodeInfoItem setDetail(List<EpisodeDetail> list) {
            this.detail = Optional.e(list);
            return this;
        }

        public EpisodeInfoItem setH5UrlPrev(String str) {
            this.H5_url_prev = Optional.e(str);
            return this;
        }

        public EpisodeInfoItem setH5UrlSuffix(String str) {
            this.H5_url_suffix = Optional.e(str);
            return this;
        }

        public EpisodeInfoItem setKey(String str) {
            this.key = Optional.e(str);
            return this;
        }
    }

    public static class ExampleSentence {
        private Optional<String> tts_url = Optional.a();
        private Optional<String> en = Optional.a();

        /* JADX INFO: renamed from: cn, reason: collision with root package name */
        private Optional<String> f10995cn = Optional.a();

        public Optional<String> getCn() {
            return this.f10995cn;
        }

        public Optional<String> getEn() {
            return this.en;
        }

        public Optional<String> getTtsUrl() {
            return this.tts_url;
        }

        public ExampleSentence setCn(String str) {
            this.f10995cn = Optional.e(str);
            return this;
        }

        public ExampleSentence setEn(String str) {
            this.en = Optional.e(str);
            return this;
        }

        public ExampleSentence setTtsUrl(String str) {
            this.tts_url = Optional.e(str);
            return this;
        }
    }

    public static class FeihualingLevel {

        @Required
        private Image image;

        @Required
        private String name;

        @Required
        private String summary;

        public FeihualingLevel() {
        }

        public FeihualingLevel(String str, String str2, Image image) {
            this.name = str;
            this.summary = str2;
            this.image = image;
        }

        @Required
        public Image getImage() {
            return this.image;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public String getSummary() {
            return this.summary;
        }

        @Required
        public FeihualingLevel setImage(Image image) {
            this.image = image;
            return this;
        }

        @Required
        public FeihualingLevel setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public FeihualingLevel setSummary(String str) {
            this.summary = str;
            return this;
        }
    }

    public enum FeihualingMsgAlignType {
        DEFAULT(0),
        LEFT(1),
        RIGHT(2),
        MIDDLE(3);

        private int id;

        FeihualingMsgAlignType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum FoodDataCategory {
        UNKNOWN(-1),
        SHELF_LIFE(0);

        private int id;

        FoodDataCategory(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class FoodStorageInfo {

        @Required
        private boolean is_default;

        @Required
        private boolean is_recommend;

        @Required
        private FoodStorageType storage_type;

        public FoodStorageInfo() {
        }

        public FoodStorageInfo(FoodStorageType foodStorageType, boolean z, boolean z2) {
            this.storage_type = foodStorageType;
            this.is_recommend = z;
            this.is_default = z2;
        }

        @Required
        public FoodStorageType getStorageType() {
            return this.storage_type;
        }

        @Required
        public boolean isDefault() {
            return this.is_default;
        }

        @Required
        public boolean isRecommend() {
            return this.is_recommend;
        }

        @Required
        public FoodStorageInfo setIsDefault(boolean z) {
            this.is_default = z;
            return this;
        }

        @Required
        public FoodStorageInfo setIsRecommend(boolean z) {
            this.is_recommend = z;
            return this;
        }

        @Required
        public FoodStorageInfo setStorageType(FoodStorageType foodStorageType) {
            this.storage_type = foodStorageType;
            return this;
        }
    }

    public enum FoodStorageType {
        UNKNOWN(-1),
        FREEZE(0),
        COLD(1),
        NORMAL(2);

        private int id;

        FoodStorageType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class H5AssistMemo {

        @Required
        private MemoCardType card_type;

        @Required
        private List<MemoInfo> memo_infos;

        @Required
        private MemoType memo_type;

        public H5AssistMemo() {
        }

        public H5AssistMemo(MemoType memoType, MemoCardType memoCardType, List<MemoInfo> list) {
            this.memo_type = memoType;
            this.card_type = memoCardType;
            this.memo_infos = list;
        }

        @Required
        public MemoCardType getCardType() {
            return this.card_type;
        }

        @Required
        public List<MemoInfo> getMemoInfos() {
            return this.memo_infos;
        }

        @Required
        public MemoType getMemoType() {
            return this.memo_type;
        }

        @Required
        public H5AssistMemo setCardType(MemoCardType memoCardType) {
            this.card_type = memoCardType;
            return this;
        }

        @Required
        public H5AssistMemo setMemoInfos(List<MemoInfo> list) {
            this.memo_infos = list;
            return this;
        }

        @Required
        public H5AssistMemo setMemoType(MemoType memoType) {
            this.memo_type = memoType;
            return this;
        }
    }

    public static class H5Compositions {

        @Required
        private List<H5Composition> compositions;

        public H5Compositions() {
        }

        public H5Compositions(List<H5Composition> list) {
            this.compositions = list;
        }

        @Required
        public List<H5Composition> getCompositions() {
            return this.compositions;
        }

        @Required
        public H5Compositions setCompositions(List<H5Composition> list) {
            this.compositions = list;
            return this;
        }
    }

    public static class H5ConversationFlow {

        @Required
        private List<ConversationFlowMsg> messages;

        @Required
        private String query;

        public H5ConversationFlow() {
        }

        public H5ConversationFlow(String str, List<ConversationFlowMsg> list) {
            this.query = str;
            this.messages = list;
        }

        @Required
        public List<ConversationFlowMsg> getMessages() {
            return this.messages;
        }

        @Required
        public String getQuery() {
            return this.query;
        }

        @Required
        public H5ConversationFlow setMessages(List<ConversationFlowMsg> list) {
            this.messages = list;
            return this;
        }

        @Required
        public H5ConversationFlow setQuery(String str) {
            this.query = str;
            return this;
        }
    }

    public static class H5CourseSchedule {

        @Required
        private int day;

        @Required
        private int week;

        public H5CourseSchedule() {
        }

        public H5CourseSchedule(int i, int i2) {
            this.week = i;
            this.day = i2;
        }

        @Required
        public int getDay() {
            return this.day;
        }

        @Required
        public int getWeek() {
            return this.week;
        }

        @Required
        public H5CourseSchedule setDay(int i) {
            this.day = i;
            return this;
        }

        @Required
        public H5CourseSchedule setWeek(int i) {
            this.week = i;
            return this;
        }
    }

    public static class H5Qabot {
        private Optional<QabotData> data = Optional.a();
        private Optional<QabotCpSearchResult> cp_search_result = Optional.a();

        public Optional<QabotCpSearchResult> getCpSearchResult() {
            return this.cp_search_result;
        }

        public Optional<QabotData> getData() {
            return this.data;
        }

        public H5Qabot setCpSearchResult(QabotCpSearchResult qabotCpSearchResult) {
            this.cp_search_result = Optional.e(qabotCpSearchResult);
            return this;
        }

        public H5Qabot setData(QabotData qabotData) {
            this.data = Optional.e(qabotData);
            return this;
        }
    }

    public static class H5Video {
        private Optional<String> query = Optional.a();
        private Optional<String> to_display = Optional.a();
        private Optional<String> to_speak = Optional.a();
        private Optional<List<CPInfo>> cp_info = Optional.a();
        private Optional<List<CardGuideInfo>> card_guide_info = Optional.a();
        private Optional<List<MovieInfo>> movie = Optional.a();
        private Optional<Template.SearchHitLevel> hit_level = Optional.a();
        private Optional<VideoPageType> page_type = Optional.a();

        public Optional<List<CardGuideInfo>> getCardGuideInfo() {
            return this.card_guide_info;
        }

        public Optional<List<CPInfo>> getCpInfo() {
            return this.cp_info;
        }

        public Optional<Template.SearchHitLevel> getHitLevel() {
            return this.hit_level;
        }

        public Optional<List<MovieInfo>> getMovie() {
            return this.movie;
        }

        public Optional<VideoPageType> getPageType() {
            return this.page_type;
        }

        public Optional<String> getQuery() {
            return this.query;
        }

        public Optional<String> getToDisplay() {
            return this.to_display;
        }

        public Optional<String> getToSpeak() {
            return this.to_speak;
        }

        public H5Video setCardGuideInfo(List<CardGuideInfo> list) {
            this.card_guide_info = Optional.e(list);
            return this;
        }

        public H5Video setCpInfo(List<CPInfo> list) {
            this.cp_info = Optional.e(list);
            return this;
        }

        public H5Video setHitLevel(Template.SearchHitLevel searchHitLevel) {
            this.hit_level = Optional.e(searchHitLevel);
            return this;
        }

        public H5Video setMovie(List<MovieInfo> list) {
            this.movie = Optional.e(list);
            return this;
        }

        public H5Video setPageType(VideoPageType videoPageType) {
            this.page_type = Optional.e(videoPageType);
            return this;
        }

        public H5Video setQuery(String str) {
            this.query = Optional.e(str);
            return this;
        }

        public H5Video setToDisplay(String str) {
            this.to_display = Optional.e(str);
            return this;
        }

        public H5Video setToSpeak(String str) {
            this.to_speak = Optional.e(str);
            return this;
        }
    }

    public static class Image {

        @Required
        private String url;

        public Image() {
        }

        public Image(String str) {
            this.url = str;
        }

        @Required
        public String getUrl() {
            return this.url;
        }

        @Required
        public Image setUrl(String str) {
            this.url = str;
            return this;
        }
    }

    public static class JokeData {
        private Optional<List<Template.Image>> images = Optional.a();
        private Optional<Template.Launcher> launcher = Optional.a();

        public Optional<List<Template.Image>> getImages() {
            return this.images;
        }

        public Optional<Template.Launcher> getLauncher() {
            return this.launcher;
        }

        public JokeData setImages(List<Template.Image> list) {
            this.images = Optional.e(list);
            return this;
        }

        public JokeData setLauncher(Template.Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }
    }

    public enum LifeServicePageType {
        UNKNOWN(-1),
        LIST(0),
        DETAIL(1);

        private int id;

        LifeServicePageType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum MemoCardType {
        UNKNOWN(-1),
        DISPLAY(0),
        MODIFY(1);

        private int id;

        MemoCardType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum MemoType {
        UNKNOWN(-1),
        GENERAL(0),
        CAR(1),
        GOODS(2);

        private int id;

        MemoType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum MessageType {
        UNKNOWN(-1),
        TTS(0),
        IMAGE(1),
        ANIMATION(2),
        EMOJI(3);

        private int id;

        MessageType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class Movie {
        private Optional<MovieBaseInfo> base_info = Optional.a();
        private Optional<List<SimilarMovie>> similar = Optional.a();

        public Optional<MovieBaseInfo> getBaseInfo() {
            return this.base_info;
        }

        public Optional<List<SimilarMovie>> getSimilar() {
            return this.similar;
        }

        public Movie setBaseInfo(MovieBaseInfo movieBaseInfo) {
            this.base_info = Optional.e(movieBaseInfo);
            return this;
        }

        public Movie setSimilar(List<SimilarMovie> list) {
            this.similar = Optional.e(list);
            return this;
        }
    }

    public static class MovieBaseInfo {
        private Optional<String> id = Optional.a();
        private Optional<String> name = Optional.a();
        private Optional<Integer> year = Optional.a();
        private Optional<Double> rating = Optional.a();
        private Optional<Image> image = Optional.a();
        private Optional<String> category = Optional.a();
        private Optional<Boolean> is_vip = Optional.a();
        private Optional<Template.VideoShowStatus> show_status = Optional.a();
        private Optional<String> type = Optional.a();
        private Optional<String> area = Optional.a();
        private Optional<Boolean> is_short = Optional.a();
        private Optional<String> style = Optional.a();
        private Optional<String> date = Optional.a();
        private Optional<Integer> duration = Optional.a();
        private Optional<String> description = Optional.a();
        private Optional<List<MovieSource>> sources = Optional.a();
        private Optional<MovieComments> comments = Optional.a();
        private Optional<CinemaInfo> cinema = Optional.a();
        private Optional<List<ArtistInfo>> artists = Optional.a();
        private Optional<EpisodeInfo> episode = Optional.a();
        private Optional<Boolean> is_head_resource = Optional.a();
        private Optional<String> language = Optional.a();
        private Optional<VideoPageType> page_type = Optional.a();

        public Optional<String> getArea() {
            return this.area;
        }

        public Optional<List<ArtistInfo>> getArtists() {
            return this.artists;
        }

        public Optional<String> getCategory() {
            return this.category;
        }

        public Optional<CinemaInfo> getCinema() {
            return this.cinema;
        }

        public Optional<MovieComments> getComments() {
            return this.comments;
        }

        public Optional<String> getDate() {
            return this.date;
        }

        public Optional<String> getDescription() {
            return this.description;
        }

        public Optional<Integer> getDuration() {
            return this.duration;
        }

        public Optional<EpisodeInfo> getEpisode() {
            return this.episode;
        }

        public Optional<String> getId() {
            return this.id;
        }

        public Optional<Image> getImage() {
            return this.image;
        }

        public Optional<String> getLanguage() {
            return this.language;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<VideoPageType> getPageType() {
            return this.page_type;
        }

        public Optional<Double> getRating() {
            return this.rating;
        }

        public Optional<Template.VideoShowStatus> getShowStatus() {
            return this.show_status;
        }

        public Optional<List<MovieSource>> getSources() {
            return this.sources;
        }

        public Optional<String> getStyle() {
            return this.style;
        }

        public Optional<String> getType() {
            return this.type;
        }

        public Optional<Integer> getYear() {
            return this.year;
        }

        public Optional<Boolean> isHeadResource() {
            return this.is_head_resource;
        }

        public Optional<Boolean> isShort() {
            return this.is_short;
        }

        public Optional<Boolean> isVip() {
            return this.is_vip;
        }

        public MovieBaseInfo setArea(String str) {
            this.area = Optional.e(str);
            return this;
        }

        public MovieBaseInfo setArtists(List<ArtistInfo> list) {
            this.artists = Optional.e(list);
            return this;
        }

        public MovieBaseInfo setCategory(String str) {
            this.category = Optional.e(str);
            return this;
        }

        public MovieBaseInfo setCinema(CinemaInfo cinemaInfo) {
            this.cinema = Optional.e(cinemaInfo);
            return this;
        }

        public MovieBaseInfo setComments(MovieComments movieComments) {
            this.comments = Optional.e(movieComments);
            return this;
        }

        public MovieBaseInfo setDate(String str) {
            this.date = Optional.e(str);
            return this;
        }

        public MovieBaseInfo setDescription(String str) {
            this.description = Optional.e(str);
            return this;
        }

        public MovieBaseInfo setDuration(int i) {
            this.duration = Optional.e(Integer.valueOf(i));
            return this;
        }

        public MovieBaseInfo setEpisode(EpisodeInfo episodeInfo) {
            this.episode = Optional.e(episodeInfo);
            return this;
        }

        public MovieBaseInfo setId(String str) {
            this.id = Optional.e(str);
            return this;
        }

        public MovieBaseInfo setImage(Image image) {
            this.image = Optional.e(image);
            return this;
        }

        public MovieBaseInfo setIsHeadResource(boolean z) {
            this.is_head_resource = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public MovieBaseInfo setIsShort(boolean z) {
            this.is_short = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public MovieBaseInfo setIsVip(boolean z) {
            this.is_vip = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public MovieBaseInfo setLanguage(String str) {
            this.language = Optional.e(str);
            return this;
        }

        public MovieBaseInfo setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public MovieBaseInfo setPageType(VideoPageType videoPageType) {
            this.page_type = Optional.e(videoPageType);
            return this;
        }

        public MovieBaseInfo setRating(double d) {
            this.rating = Optional.e(Double.valueOf(d));
            return this;
        }

        public MovieBaseInfo setShowStatus(Template.VideoShowStatus videoShowStatus) {
            this.show_status = Optional.e(videoShowStatus);
            return this;
        }

        public MovieBaseInfo setSources(List<MovieSource> list) {
            this.sources = Optional.e(list);
            return this;
        }

        public MovieBaseInfo setStyle(String str) {
            this.style = Optional.e(str);
            return this;
        }

        public MovieBaseInfo setType(String str) {
            this.type = Optional.e(str);
            return this;
        }

        public MovieBaseInfo setYear(int i) {
            this.year = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    public static class MovieCommentItem {
        private Optional<Image> user_icon = Optional.a();
        private Optional<String> user_name = Optional.a();
        private Optional<Double> rating = Optional.a();
        private Optional<String> time = Optional.a();
        private Optional<String> text = Optional.a();
        private Optional<CpLauncher> launcher = Optional.a();
        private Optional<String> h5_url = Optional.a();

        public Optional<String> getH5Url() {
            return this.h5_url;
        }

        public Optional<CpLauncher> getLauncher() {
            return this.launcher;
        }

        public Optional<Double> getRating() {
            return this.rating;
        }

        public Optional<String> getText() {
            return this.text;
        }

        public Optional<String> getTime() {
            return this.time;
        }

        public Optional<Image> getUserIcon() {
            return this.user_icon;
        }

        public Optional<String> getUserName() {
            return this.user_name;
        }

        public MovieCommentItem setH5Url(String str) {
            this.h5_url = Optional.e(str);
            return this;
        }

        public MovieCommentItem setLauncher(CpLauncher cpLauncher) {
            this.launcher = Optional.e(cpLauncher);
            return this;
        }

        public MovieCommentItem setRating(double d) {
            this.rating = Optional.e(Double.valueOf(d));
            return this;
        }

        public MovieCommentItem setText(String str) {
            this.text = Optional.e(str);
            return this;
        }

        public MovieCommentItem setTime(String str) {
            this.time = Optional.e(str);
            return this;
        }

        public MovieCommentItem setUserIcon(Image image) {
            this.user_icon = Optional.e(image);
            return this;
        }

        public MovieCommentItem setUserName(String str) {
            this.user_name = Optional.e(str);
            return this;
        }
    }

    public static class MovieComments {
        private Optional<String> title = Optional.a();
        private Optional<List<MovieCommentItem>> comments = Optional.a();

        public Optional<List<MovieCommentItem>> getComments() {
            return this.comments;
        }

        public Optional<String> getTitle() {
            return this.title;
        }

        public MovieComments setComments(List<MovieCommentItem> list) {
            this.comments = Optional.e(list);
            return this;
        }

        public MovieComments setTitle(String str) {
            this.title = Optional.e(str);
            return this;
        }
    }

    public static class MovieInfo {
        private Optional<Template.Title> title = Optional.a();
        private Optional<Boolean> isAccurateSearch = Optional.a();
        private Optional<List<Movie>> movies = Optional.a();

        public Optional<List<Movie>> getMovies() {
            return this.movies;
        }

        public Optional<Template.Title> getTitle() {
            return this.title;
        }

        public Optional<Boolean> isIsAccurateSearch() {
            return this.isAccurateSearch;
        }

        public MovieInfo setIsAccurateSearch(boolean z) {
            this.isAccurateSearch = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public MovieInfo setMovies(List<Movie> list) {
            this.movies = Optional.e(list);
            return this;
        }

        public MovieInfo setTitle(Template.Title title) {
            this.title = Optional.e(title);
            return this;
        }
    }

    public static class MovieSource {
        private Optional<String> id = Optional.a();
        private Optional<Boolean> can_play = Optional.a();
        private Optional<CpLauncher> launcher = Optional.a();
        private Optional<String> h5_url = Optional.a();

        public Optional<String> getH5Url() {
            return this.h5_url;
        }

        public Optional<String> getId() {
            return this.id;
        }

        public Optional<CpLauncher> getLauncher() {
            return this.launcher;
        }

        public Optional<Boolean> isCanPlay() {
            return this.can_play;
        }

        public MovieSource setCanPlay(boolean z) {
            this.can_play = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public MovieSource setH5Url(String str) {
            this.h5_url = Optional.e(str);
            return this;
        }

        public MovieSource setId(String str) {
            this.id = Optional.e(str);
            return this;
        }

        public MovieSource setLauncher(CpLauncher cpLauncher) {
            this.launcher = Optional.e(cpLauncher);
            return this;
        }
    }

    public enum NucleicAcidTimeStatus {
        DEFAULT(0),
        NO_DATA(1),
        TIME_EXPIRED(2),
        TIME_VALID(3);

        private int id;

        NucleicAcidTimeStatus(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class PartMeaning {
        private Optional<String> speech_part = Optional.a();
        private Optional<String> meaning = Optional.a();

        public Optional<String> getMeaning() {
            return this.meaning;
        }

        public Optional<String> getSpeechPart() {
            return this.speech_part;
        }

        public PartMeaning setMeaning(String str) {
            this.meaning = Optional.e(str);
            return this;
        }

        public PartMeaning setSpeechPart(String str) {
            this.speech_part = Optional.e(str);
            return this;
        }
    }

    public static class PhoneticSymbol {
        private Optional<String> ph_symbol = Optional.a();
        private Optional<String> ph_url = Optional.a();
        private Optional<PhoneticType> ph_type = Optional.a();

        public Optional<String> getPhSymbol() {
            return this.ph_symbol;
        }

        public Optional<PhoneticType> getPhType() {
            return this.ph_type;
        }

        public Optional<String> getPhUrl() {
            return this.ph_url;
        }

        public PhoneticSymbol setPhSymbol(String str) {
            this.ph_symbol = Optional.e(str);
            return this;
        }

        public PhoneticSymbol setPhType(PhoneticType phoneticType) {
            this.ph_type = Optional.e(phoneticType);
            return this;
        }

        public PhoneticSymbol setPhUrl(String str) {
            this.ph_url = Optional.e(str);
            return this;
        }
    }

    public enum PhoneticType {
        UNKNOWN(-1),
        BRITISH(0),
        AMERICAN(1);

        private int id;

        PhoneticType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum PluginContentType {
        UNKNOWN(-1),
        MARKDOWN(0),
        LIFE_SERVICE_TRAIN(1);

        private int id;

        PluginContentType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class PluginInfo {
        private Optional<String> desc = Optional.a();
        private Optional<String> pkg_name = Optional.a();
        private Optional<String> url = Optional.a();
        private Optional<String> switch_info = Optional.a();
        private Optional<Boolean> is_selected = Optional.a();

        public Optional<String> getDesc() {
            return this.desc;
        }

        public Optional<String> getPkgName() {
            return this.pkg_name;
        }

        public Optional<String> getSwitchInfo() {
            return this.switch_info;
        }

        public Optional<String> getUrl() {
            return this.url;
        }

        public Optional<Boolean> isSelected() {
            return this.is_selected;
        }

        public PluginInfo setDesc(String str) {
            this.desc = Optional.e(str);
            return this;
        }

        public PluginInfo setIsSelected(boolean z) {
            this.is_selected = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public PluginInfo setPkgName(String str) {
            this.pkg_name = Optional.e(str);
            return this;
        }

        public PluginInfo setSwitchInfo(String str) {
            this.switch_info = Optional.e(str);
            return this;
        }

        public PluginInfo setUrl(String str) {
            this.url = Optional.e(str);
            return this;
        }
    }

    public static class PoemAnnotate {

        @Required
        private int pos;

        @Required
        private int source_size;

        @Required
        private String text;

        public PoemAnnotate() {
        }

        public PoemAnnotate(int i, int i2, String str) {
            this.pos = i;
            this.source_size = i2;
            this.text = str;
        }

        @Required
        public int getPos() {
            return this.pos;
        }

        @Required
        public int getSourceSize() {
            return this.source_size;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public PoemAnnotate setPos(int i) {
            this.pos = i;
            return this;
        }

        @Required
        public PoemAnnotate setSourceSize(int i) {
            this.source_size = i;
            return this;
        }

        @Required
        public PoemAnnotate setText(String str) {
            this.text = str;
            return this;
        }
    }

    public static class PoemAnnotates {

        @Required
        private String text;

        public PoemAnnotates() {
        }

        public PoemAnnotates(String str) {
            this.text = str;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public PoemAnnotates setText(String str) {
            this.text = str;
            return this;
        }
    }

    public static class PoemAppreciation {

        @Required
        private String text;

        public PoemAppreciation() {
        }

        public PoemAppreciation(String str) {
            this.text = str;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public PoemAppreciation setText(String str) {
            this.text = str;
            return this;
        }
    }

    public static class PoemData {
        private Optional<List<PoemParagraph>> full_text = Optional.a();
        private Optional<PoemVideo> video_img = Optional.a();
        private Optional<Boolean> show_pinyin = Optional.a();
        private Optional<List<PoemTag>> tags = Optional.a();
        private Optional<PoemTextStyle> text_style = Optional.a();
        private Optional<PoemMeaning> poem_meaning = Optional.a();
        private Optional<PoemAnnotates> poem_annotates = Optional.a();
        private Optional<PoemAppreciation> poem_appreciation = Optional.a();
        private Optional<PoemTailInfo> tail_info = Optional.a();
        private Optional<PoemLocationInfo> location_info = Optional.a();
        private Optional<PoemHeadInfo> poem_head_info = Optional.a();
        private Optional<PoemDisplayType> display_type = Optional.a();

        public Optional<PoemDisplayType> getDisplayType() {
            return this.display_type;
        }

        public Optional<List<PoemParagraph>> getFullText() {
            return this.full_text;
        }

        public Optional<PoemLocationInfo> getLocationInfo() {
            return this.location_info;
        }

        public Optional<PoemAnnotates> getPoemAnnotates() {
            return this.poem_annotates;
        }

        public Optional<PoemAppreciation> getPoemAppreciation() {
            return this.poem_appreciation;
        }

        public Optional<PoemHeadInfo> getPoemHeadInfo() {
            return this.poem_head_info;
        }

        public Optional<PoemMeaning> getPoemMeaning() {
            return this.poem_meaning;
        }

        public Optional<List<PoemTag>> getTags() {
            return this.tags;
        }

        public Optional<PoemTailInfo> getTailInfo() {
            return this.tail_info;
        }

        public Optional<PoemTextStyle> getTextStyle() {
            return this.text_style;
        }

        public Optional<PoemVideo> getVideoImg() {
            return this.video_img;
        }

        public Optional<Boolean> isShowPinyin() {
            return this.show_pinyin;
        }

        public PoemData setDisplayType(PoemDisplayType poemDisplayType) {
            this.display_type = Optional.e(poemDisplayType);
            return this;
        }

        public PoemData setFullText(List<PoemParagraph> list) {
            this.full_text = Optional.e(list);
            return this;
        }

        public PoemData setLocationInfo(PoemLocationInfo poemLocationInfo) {
            this.location_info = Optional.e(poemLocationInfo);
            return this;
        }

        public PoemData setPoemAnnotates(PoemAnnotates poemAnnotates) {
            this.poem_annotates = Optional.e(poemAnnotates);
            return this;
        }

        public PoemData setPoemAppreciation(PoemAppreciation poemAppreciation) {
            this.poem_appreciation = Optional.e(poemAppreciation);
            return this;
        }

        public PoemData setPoemHeadInfo(PoemHeadInfo poemHeadInfo) {
            this.poem_head_info = Optional.e(poemHeadInfo);
            return this;
        }

        public PoemData setPoemMeaning(PoemMeaning poemMeaning) {
            this.poem_meaning = Optional.e(poemMeaning);
            return this;
        }

        public PoemData setShowPinyin(boolean z) {
            this.show_pinyin = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public PoemData setTags(List<PoemTag> list) {
            this.tags = Optional.e(list);
            return this;
        }

        public PoemData setTailInfo(PoemTailInfo poemTailInfo) {
            this.tail_info = Optional.e(poemTailInfo);
            return this;
        }

        public PoemData setTextStyle(PoemTextStyle poemTextStyle) {
            this.text_style = Optional.e(poemTextStyle);
            return this;
        }

        public PoemData setVideoImg(PoemVideo poemVideo) {
            this.video_img = Optional.e(poemVideo);
            return this;
        }
    }

    public enum PoemDisplayType {
        UNKNOWN(-1),
        FULL_TEXT(1),
        MEANING(2);

        private int id;

        PoemDisplayType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class PoemHeadInfo {
        private Optional<String> poet = Optional.a();
        private Optional<String> dynasty = Optional.a();
        private Optional<String> name = Optional.a();
        private Optional<String> tune = Optional.a();
        private Optional<String> turn = Optional.a();

        public Optional<String> getDynasty() {
            return this.dynasty;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<String> getPoet() {
            return this.poet;
        }

        public Optional<String> getTune() {
            return this.tune;
        }

        public Optional<String> getTurn() {
            return this.turn;
        }

        public PoemHeadInfo setDynasty(String str) {
            this.dynasty = Optional.e(str);
            return this;
        }

        public PoemHeadInfo setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public PoemHeadInfo setPoet(String str) {
            this.poet = Optional.e(str);
            return this;
        }

        public PoemHeadInfo setTune(String str) {
            this.tune = Optional.e(str);
            return this;
        }

        public PoemHeadInfo setTurn(String str) {
            this.turn = Optional.e(str);
            return this;
        }
    }

    public enum PoemLocationType {
        UNKNOWN(-1),
        TITLE(0),
        FULL_TEXT(1),
        SENTENCE(2),
        ANNOTATE(3),
        MEANING(4),
        ANNOTATES(5),
        APPRECIATION(6);

        private int id;

        PoemLocationType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class PoemMeaning {

        @Required
        private String text;

        public PoemMeaning() {
        }

        public PoemMeaning(String str) {
            this.text = str;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public PoemMeaning setText(String str) {
            this.text = str;
            return this;
        }
    }

    public static class PoemParagraph {

        @Required
        private List<PoemSentence> sentences;

        public PoemParagraph() {
        }

        public PoemParagraph(List<PoemSentence> list) {
            this.sentences = list;
        }

        @Required
        public List<PoemSentence> getSentences() {
            return this.sentences;
        }

        @Required
        public PoemParagraph setSentences(List<PoemSentence> list) {
            this.sentences = list;
            return this;
        }
    }

    public static class PoemTag {

        @Required
        private Template.Launcher launcher;

        @Required
        private String tag;

        public PoemTag() {
        }

        public PoemTag(String str, Template.Launcher launcher) {
            this.tag = str;
            this.launcher = launcher;
        }

        @Required
        public Template.Launcher getLauncher() {
            return this.launcher;
        }

        @Required
        public String getTag() {
            return this.tag;
        }

        @Required
        public PoemTag setLauncher(Template.Launcher launcher) {
            this.launcher = launcher;
            return this;
        }

        @Required
        public PoemTag setTag(String str) {
            this.tag = str;
            return this;
        }
    }

    public static class PoemTailInfo {

        @Required
        private String text;

        public PoemTailInfo() {
        }

        public PoemTailInfo(String str) {
            this.text = str;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public PoemTailInfo setText(String str) {
            this.text = str;
            return this;
        }
    }

    public enum PoemTextStyle {
        UNKNOWN(-1),
        LEFT_ALIGN(0),
        CENTER_ALIGN(1);

        private int id;

        PoemTextStyle(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class PoemVideo {

        @Required
        private Template.Launcher action;

        @Required
        private Image img;

        public PoemVideo() {
        }

        public PoemVideo(Image image, Template.Launcher launcher) {
            this.img = image;
            this.action = launcher;
        }

        @Required
        public Template.Launcher getAction() {
            return this.action;
        }

        @Required
        public Image getImg() {
            return this.img;
        }

        @Required
        public PoemVideo setAction(Template.Launcher launcher) {
            this.action = launcher;
            return this;
        }

        @Required
        public PoemVideo setImg(Image image) {
            this.img = image;
            return this;
        }
    }

    @NamespaceName(name = "Poems", namespace = AIApiConstants.FullScreenTemplate.NAME)
    public static class Poems implements InstructionPayload {

        @Required
        private List<PoemData> data;

        public Poems() {
        }

        public Poems(List<PoemData> list) {
            this.data = list;
        }

        @Required
        public List<PoemData> getData() {
            return this.data;
        }

        @Required
        public Poems setData(List<PoemData> list) {
            this.data = list;
            return this;
        }
    }

    public enum PrivacyAuthCardType {
        UNKNOWN(-1),
        TITLE(0),
        AUTHORIZATION(1),
        INTRODUCE(2);

        private int id;

        PrivacyAuthCardType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class QabotCpSearchResult {

        @Required
        private String tip;

        @Required
        private String url;

        public QabotCpSearchResult() {
        }

        public QabotCpSearchResult(String str, String str2) {
            this.url = str;
            this.tip = str2;
        }

        @Required
        public String getTip() {
            return this.tip;
        }

        @Required
        public String getUrl() {
            return this.url;
        }

        @Required
        public QabotCpSearchResult setTip(String str) {
            this.tip = str;
            return this;
        }

        @Required
        public QabotCpSearchResult setUrl(String str) {
            this.url = str;
            return this;
        }
    }

    public enum QabotDataSource {
        UNKNOWN(-1),
        SOUGOU(0);

        private int id;

        QabotDataSource(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class RadioProgram {
        private Optional<String> name = Optional.a();
        private Optional<Boolean> is_live = Optional.a();
        private Optional<StationLiveStatus> live_status = Optional.a();
        private Optional<String> live_range = Optional.a();
        private Optional<String> cp_raw_name = Optional.a();
        private Optional<String> resource_id = Optional.a();
        private Optional<String> cp_id = Optional.a();
        private Optional<String> cp_album_id = Optional.a();
        private Optional<Integer> rank = Optional.a();
        private Optional<String> play_track_url = Optional.a();

        public Optional<String> getCpAlbumId() {
            return this.cp_album_id;
        }

        public Optional<String> getCpId() {
            return this.cp_id;
        }

        public Optional<String> getCpRawName() {
            return this.cp_raw_name;
        }

        public Optional<String> getLiveRange() {
            return this.live_range;
        }

        public Optional<StationLiveStatus> getLiveStatus() {
            return this.live_status;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<String> getPlayTrackUrl() {
            return this.play_track_url;
        }

        public Optional<Integer> getRank() {
            return this.rank;
        }

        public Optional<String> getResourceId() {
            return this.resource_id;
        }

        public Optional<Boolean> isLive() {
            return this.is_live;
        }

        public RadioProgram setCpAlbumId(String str) {
            this.cp_album_id = Optional.e(str);
            return this;
        }

        public RadioProgram setCpId(String str) {
            this.cp_id = Optional.e(str);
            return this;
        }

        public RadioProgram setCpRawName(String str) {
            this.cp_raw_name = Optional.e(str);
            return this;
        }

        public RadioProgram setIsLive(boolean z) {
            this.is_live = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public RadioProgram setLiveRange(String str) {
            this.live_range = Optional.e(str);
            return this;
        }

        public RadioProgram setLiveStatus(StationLiveStatus stationLiveStatus) {
            this.live_status = Optional.e(stationLiveStatus);
            return this;
        }

        public RadioProgram setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public RadioProgram setPlayTrackUrl(String str) {
            this.play_track_url = Optional.e(str);
            return this;
        }

        public RadioProgram setRank(int i) {
            this.rank = Optional.e(Integer.valueOf(i));
            return this;
        }

        public RadioProgram setResourceId(String str) {
            this.resource_id = Optional.e(str);
            return this;
        }
    }

    public static class RecipeList {

        @Required
        private List<RecipeListItem> recipe_list;

        public RecipeList() {
        }

        public RecipeList(List<RecipeListItem> list) {
            this.recipe_list = list;
        }

        @Required
        public List<RecipeListItem> getRecipeList() {
            return this.recipe_list;
        }

        @Required
        public RecipeList setRecipeList(List<RecipeListItem> list) {
            this.recipe_list = list;
            return this;
        }
    }

    @NamespaceName(name = "RecipeListItem", namespace = AIApiConstants.FullScreenTemplate.NAME)
    public static class RecipeListItem implements InstructionPayload {

        @Required
        private mj1 instructions;

        @Required
        private RecipeDetail recipe_detail;

        public RecipeListItem() {
        }

        public RecipeListItem(RecipeDetail recipeDetail, mj1 mj1Var) {
            this.recipe_detail = recipeDetail;
            this.instructions = mj1Var;
        }

        @Required
        public mj1 getInstructions() {
            return this.instructions;
        }

        @Required
        public RecipeDetail getRecipeDetail() {
            return this.recipe_detail;
        }

        @Required
        public RecipeListItem setInstructions(mj1 mj1Var) {
            this.instructions = mj1Var;
            return this;
        }

        @Required
        public RecipeListItem setRecipeDetail(RecipeDetail recipeDetail) {
            this.recipe_detail = recipeDetail;
            return this;
        }
    }

    public static class RecipeSuggest {

        @Required
        private Template.ImageSource image;

        @Required
        private Template.Launcher launcher;

        @Required
        private String name;

        public RecipeSuggest() {
        }

        public RecipeSuggest(String str, Template.Launcher launcher, Template.ImageSource imageSource) {
            this.name = str;
            this.launcher = launcher;
            this.image = imageSource;
        }

        @Required
        public Template.ImageSource getImage() {
            return this.image;
        }

        @Required
        public Template.Launcher getLauncher() {
            return this.launcher;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public RecipeSuggest setImage(Template.ImageSource imageSource) {
            this.image = imageSource;
            return this;
        }

        @Required
        public RecipeSuggest setLauncher(Template.Launcher launcher) {
            this.launcher = launcher;
            return this;
        }

        @Required
        public RecipeSuggest setName(String str) {
            this.name = str;
            return this;
        }
    }

    public static class SimilarMovie {
        private Optional<String> title = Optional.a();
        private Optional<List<MovieBaseInfo>> movies = Optional.a();

        public Optional<List<MovieBaseInfo>> getMovies() {
            return this.movies;
        }

        public Optional<String> getTitle() {
            return this.title;
        }

        public SimilarMovie setMovies(List<MovieBaseInfo> list) {
            this.movies = Optional.e(list);
            return this;
        }

        public SimilarMovie setTitle(String str) {
            this.title = Optional.e(str);
            return this;
        }
    }

    public static class StationAlbumChapter {
        private Optional<String> chapter_name = Optional.a();
        private Optional<Common.PaymentType> payment_type = Optional.a();
        private Optional<String> update_time = Optional.a();
        private Optional<Long> play_count = Optional.a();
        private Optional<Integer> rank = Optional.a();
        private Optional<Long> duration = Optional.a();
        private Optional<Long> position = Optional.a();
        private Optional<Integer> episode = Optional.a();
        private Optional<String> cp_raw_name = Optional.a();
        private Optional<String> resource_id = Optional.a();
        private Optional<String> cp_id = Optional.a();
        private Optional<String> cp_album_id = Optional.a();
        private Optional<String> cp_album_type = Optional.a();
        private Optional<String> play_track_url = Optional.a();
        private Optional<String> audio_id = Optional.a();
        private Optional<String> album_name = Optional.a();
        private Optional<String> cover_url = Optional.a();
        private Optional<String> cp_package_name = Optional.a();
        private Optional<Boolean> is_live = Optional.a();
        private Optional<StationLiveStatus> live_status = Optional.a();
        private Optional<String> live_range = Optional.a();
        private Optional<StationResourceType> resource_type = Optional.a();

        public Optional<String> getAlbumName() {
            return this.album_name;
        }

        public Optional<String> getAudioId() {
            return this.audio_id;
        }

        public Optional<String> getChapterName() {
            return this.chapter_name;
        }

        public Optional<String> getCoverUrl() {
            return this.cover_url;
        }

        public Optional<String> getCpAlbumId() {
            return this.cp_album_id;
        }

        public Optional<String> getCpAlbumType() {
            return this.cp_album_type;
        }

        public Optional<String> getCpId() {
            return this.cp_id;
        }

        public Optional<String> getCpPackageName() {
            return this.cp_package_name;
        }

        public Optional<String> getCpRawName() {
            return this.cp_raw_name;
        }

        public Optional<Long> getDuration() {
            return this.duration;
        }

        public Optional<Integer> getEpisode() {
            return this.episode;
        }

        public Optional<String> getLiveRange() {
            return this.live_range;
        }

        public Optional<StationLiveStatus> getLiveStatus() {
            return this.live_status;
        }

        public Optional<Common.PaymentType> getPaymentType() {
            return this.payment_type;
        }

        public Optional<Long> getPlayCount() {
            return this.play_count;
        }

        public Optional<String> getPlayTrackUrl() {
            return this.play_track_url;
        }

        public Optional<Long> getPosition() {
            return this.position;
        }

        public Optional<Integer> getRank() {
            return this.rank;
        }

        public Optional<String> getResourceId() {
            return this.resource_id;
        }

        public Optional<StationResourceType> getResourceType() {
            return this.resource_type;
        }

        public Optional<String> getUpdateTime() {
            return this.update_time;
        }

        public Optional<Boolean> isLive() {
            return this.is_live;
        }

        public StationAlbumChapter setAlbumName(String str) {
            this.album_name = Optional.e(str);
            return this;
        }

        public StationAlbumChapter setAudioId(String str) {
            this.audio_id = Optional.e(str);
            return this;
        }

        public StationAlbumChapter setChapterName(String str) {
            this.chapter_name = Optional.e(str);
            return this;
        }

        public StationAlbumChapter setCoverUrl(String str) {
            this.cover_url = Optional.e(str);
            return this;
        }

        public StationAlbumChapter setCpAlbumId(String str) {
            this.cp_album_id = Optional.e(str);
            return this;
        }

        public StationAlbumChapter setCpAlbumType(String str) {
            this.cp_album_type = Optional.e(str);
            return this;
        }

        public StationAlbumChapter setCpId(String str) {
            this.cp_id = Optional.e(str);
            return this;
        }

        public StationAlbumChapter setCpPackageName(String str) {
            this.cp_package_name = Optional.e(str);
            return this;
        }

        public StationAlbumChapter setCpRawName(String str) {
            this.cp_raw_name = Optional.e(str);
            return this;
        }

        public StationAlbumChapter setDuration(long j) {
            this.duration = Optional.e(Long.valueOf(j));
            return this;
        }

        public StationAlbumChapter setEpisode(int i) {
            this.episode = Optional.e(Integer.valueOf(i));
            return this;
        }

        public StationAlbumChapter setIsLive(boolean z) {
            this.is_live = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public StationAlbumChapter setLiveRange(String str) {
            this.live_range = Optional.e(str);
            return this;
        }

        public StationAlbumChapter setLiveStatus(StationLiveStatus stationLiveStatus) {
            this.live_status = Optional.e(stationLiveStatus);
            return this;
        }

        public StationAlbumChapter setPaymentType(Common.PaymentType paymentType) {
            this.payment_type = Optional.e(paymentType);
            return this;
        }

        public StationAlbumChapter setPlayCount(long j) {
            this.play_count = Optional.e(Long.valueOf(j));
            return this;
        }

        public StationAlbumChapter setPlayTrackUrl(String str) {
            this.play_track_url = Optional.e(str);
            return this;
        }

        public StationAlbumChapter setPosition(long j) {
            this.position = Optional.e(Long.valueOf(j));
            return this;
        }

        public StationAlbumChapter setRank(int i) {
            this.rank = Optional.e(Integer.valueOf(i));
            return this;
        }

        public StationAlbumChapter setResourceId(String str) {
            this.resource_id = Optional.e(str);
            return this;
        }

        public StationAlbumChapter setResourceType(StationResourceType stationResourceType) {
            this.resource_type = Optional.e(stationResourceType);
            return this;
        }

        public StationAlbumChapter setUpdateTime(String str) {
            this.update_time = Optional.e(str);
            return this;
        }
    }

    public enum StationLiveStatus {
        UNKNOWN(-1),
        LIVE(0),
        REPLAY(1),
        UNKOWN(2);

        private int id;

        StationLiveStatus(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum StationPageType {
        UNKNOWN(-1),
        LIST(0),
        DETAIL(1);

        private int id;

        StationPageType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum StationResourceOrderType {
        UNKNOWN(-1),
        ASC(0),
        DESC(1),
        None(2);

        private int id;

        StationResourceOrderType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum StationResourceType {
        UNKNOWN(-1),
        RADIO(0),
        ALBUM(1);

        private int id;

        StationResourceType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class StreamDialogAvatar {
        private Optional<Image> icon = Optional.a();
        private Optional<String> name = Optional.a();
        private Optional<String> desc = Optional.a();
        private Optional<Template.BackgroundColor> background_color = Optional.a();

        public Optional<Template.BackgroundColor> getBackgroundColor() {
            return this.background_color;
        }

        public Optional<String> getDesc() {
            return this.desc;
        }

        public Optional<Image> getIcon() {
            return this.icon;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public StreamDialogAvatar setBackgroundColor(Template.BackgroundColor backgroundColor) {
            this.background_color = Optional.e(backgroundColor);
            return this;
        }

        public StreamDialogAvatar setDesc(String str) {
            this.desc = Optional.e(str);
            return this;
        }

        public StreamDialogAvatar setIcon(Image image) {
            this.icon = Optional.e(image);
            return this;
        }

        public StreamDialogAvatar setName(String str) {
            this.name = Optional.e(str);
            return this;
        }
    }

    public enum StreamDialogType {
        UNKNOWN(-1),
        ROLE_PLAY_SKILL(0),
        NORMAL_LLM_SKILL(1),
        SUMMARY_SKILL(2),
        DOCUMENT_SKILL(3),
        VIDEO_SKILL(4),
        STAND_BY_SKILL(5);

        private int id;

        StreamDialogType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum SuiteType {
        UNKNOWN(-1),
        SCENE(0);

        private int id;

        SuiteType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class Synonym {
        private Optional<String> speech_part = Optional.a();
        private Optional<List<SynonymDetail>> details = Optional.a();

        public Optional<List<SynonymDetail>> getDetails() {
            return this.details;
        }

        public Optional<String> getSpeechPart() {
            return this.speech_part;
        }

        public Synonym setDetails(List<SynonymDetail> list) {
            this.details = Optional.e(list);
            return this;
        }

        public Synonym setSpeechPart(String str) {
            this.speech_part = Optional.e(str);
            return this;
        }
    }

    public static class SynonymCard {
        private Optional<List<H5Translation>> h5_translations = Optional.a();
        private Optional<List<String>> synonym_words = Optional.a();

        public Optional<List<H5Translation>> getH5Translations() {
            return this.h5_translations;
        }

        public Optional<List<String>> getSynonymWords() {
            return this.synonym_words;
        }

        public SynonymCard setH5Translations(List<H5Translation> list) {
            this.h5_translations = Optional.e(list);
            return this;
        }

        public SynonymCard setSynonymWords(List<String> list) {
            this.synonym_words = Optional.e(list);
            return this;
        }
    }

    public static class SynonymDetail {
        private Optional<List<String>> words = Optional.a();
        private Optional<String> word_meaning = Optional.a();

        public Optional<String> getWordMeaning() {
            return this.word_meaning;
        }

        public Optional<List<String>> getWords() {
            return this.words;
        }

        public SynonymDetail setWordMeaning(String str) {
            this.word_meaning = Optional.e(str);
            return this;
        }

        public SynonymDetail setWords(List<String> list) {
            this.words = Optional.e(list);
            return this;
        }
    }

    public static class TTS {
        private Optional<String> url = Optional.a();
        private Optional<String> text = Optional.a();
        private Optional<Integer> length = Optional.a();
        private Optional<String> display_text = Optional.a();

        public Optional<String> getDisplayText() {
            return this.display_text;
        }

        public Optional<Integer> getLength() {
            return this.length;
        }

        public Optional<String> getText() {
            return this.text;
        }

        public Optional<String> getUrl() {
            return this.url;
        }

        public TTS setDisplayText(String str) {
            this.display_text = Optional.e(str);
            return this;
        }

        public TTS setLength(int i) {
            this.length = Optional.e(Integer.valueOf(i));
            return this;
        }

        public TTS setText(String str) {
            this.text = Optional.e(str);
            return this;
        }

        public TTS setUrl(String str) {
            this.url = Optional.e(str);
            return this;
        }
    }

    public static class TrainInfo {
        private Optional<String> departure_date_time = Optional.a();
        private Optional<String> arrival_date_time = Optional.a();
        private Optional<String> departure_station = Optional.a();
        private Optional<String> arrival_station = Optional.a();
        private Optional<String> trip_id = Optional.a();
        private Optional<Integer> duration_time = Optional.a();
        private Optional<Integer> interval_day = Optional.a();
        private Optional<List<TrainSeatInfo>> train_seats = Optional.a();
        private Optional<Long> expire_time = Optional.a();
        private Optional<Template.Launcher> launcher = Optional.a();

        public Optional<String> getArrivalDateTime() {
            return this.arrival_date_time;
        }

        public Optional<String> getArrivalStation() {
            return this.arrival_station;
        }

        public Optional<String> getDepartureDateTime() {
            return this.departure_date_time;
        }

        public Optional<String> getDepartureStation() {
            return this.departure_station;
        }

        public Optional<Integer> getDurationTime() {
            return this.duration_time;
        }

        public Optional<Long> getExpireTime() {
            return this.expire_time;
        }

        public Optional<Integer> getIntervalDay() {
            return this.interval_day;
        }

        public Optional<Template.Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<List<TrainSeatInfo>> getTrainSeats() {
            return this.train_seats;
        }

        public Optional<String> getTripId() {
            return this.trip_id;
        }

        public TrainInfo setArrivalDateTime(String str) {
            this.arrival_date_time = Optional.e(str);
            return this;
        }

        public TrainInfo setArrivalStation(String str) {
            this.arrival_station = Optional.e(str);
            return this;
        }

        public TrainInfo setDepartureDateTime(String str) {
            this.departure_date_time = Optional.e(str);
            return this;
        }

        public TrainInfo setDepartureStation(String str) {
            this.departure_station = Optional.e(str);
            return this;
        }

        public TrainInfo setDurationTime(int i) {
            this.duration_time = Optional.e(Integer.valueOf(i));
            return this;
        }

        public TrainInfo setExpireTime(long j) {
            this.expire_time = Optional.e(Long.valueOf(j));
            return this;
        }

        public TrainInfo setIntervalDay(int i) {
            this.interval_day = Optional.e(Integer.valueOf(i));
            return this;
        }

        public TrainInfo setLauncher(Template.Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public TrainInfo setTrainSeats(List<TrainSeatInfo> list) {
            this.train_seats = Optional.e(list);
            return this;
        }

        public TrainInfo setTripId(String str) {
            this.trip_id = Optional.e(str);
            return this;
        }
    }

    public static class TrainSeatInfo {
        private Optional<String> seat_name = Optional.a();
        private Optional<String> adult_price = Optional.a();
        private Optional<String> child_price = Optional.a();
        private Optional<String> student_price = Optional.a();
        private Optional<String> seat_count = Optional.a();
        private Optional<String> seat_status = Optional.a();

        public Optional<String> getAdultPrice() {
            return this.adult_price;
        }

        public Optional<String> getChildPrice() {
            return this.child_price;
        }

        public Optional<String> getSeatCount() {
            return this.seat_count;
        }

        public Optional<String> getSeatName() {
            return this.seat_name;
        }

        public Optional<String> getSeatStatus() {
            return this.seat_status;
        }

        public Optional<String> getStudentPrice() {
            return this.student_price;
        }

        public TrainSeatInfo setAdultPrice(String str) {
            this.adult_price = Optional.e(str);
            return this;
        }

        public TrainSeatInfo setChildPrice(String str) {
            this.child_price = Optional.e(str);
            return this;
        }

        public TrainSeatInfo setSeatCount(String str) {
            this.seat_count = Optional.e(str);
            return this;
        }

        public TrainSeatInfo setSeatName(String str) {
            this.seat_name = Optional.e(str);
            return this;
        }

        public TrainSeatInfo setSeatStatus(String str) {
            this.seat_status = Optional.e(str);
            return this;
        }

        public TrainSeatInfo setStudentPrice(String str) {
            this.student_price = Optional.e(str);
            return this;
        }
    }

    public enum VideoPageType {
        UNKNOWN(-1),
        RELEASE(0),
        RELEASE_CAN_PLAY(1),
        SINGLE(2),
        TV(3),
        VARIETY(4);

        private int id;

        VideoPageType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class WeatherDetail {

        @Required
        private List<WeatherFragmentData> data;

        public WeatherDetail() {
        }

        public WeatherDetail(List<WeatherFragmentData> list) {
            this.data = list;
        }

        @Required
        public List<WeatherFragmentData> getData() {
            return this.data;
        }

        @Required
        public WeatherDetail setData(List<WeatherFragmentData> list) {
            this.data = list;
            return this;
        }
    }

    public enum WeatherFragmentDataType {
        UNKNOWN(-1),
        DAY(0),
        FORECAST_DAILY(1),
        CURRENT_HORIZONTAL(2),
        CURRENT_VERTICAL(3),
        WEEKEND(4),
        FORECAST_HOURLY(5),
        ALERTS(6),
        INDICES(7),
        FORECAST_DAILY_AIRQUALITY(8),
        FORECAST_DAILY_WINDSPEED(9);

        private int id;

        WeatherFragmentDataType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class WeatherIndex {
        private Optional<Template.Image> icon = Optional.a();
        private Optional<Template.Title> title = Optional.a();
        private Optional<String> detail = Optional.a();

        public Optional<String> getDetail() {
            return this.detail;
        }

        public Optional<Template.Image> getIcon() {
            return this.icon;
        }

        public Optional<Template.Title> getTitle() {
            return this.title;
        }

        public WeatherIndex setDetail(String str) {
            this.detail = Optional.e(str);
            return this;
        }

        public WeatherIndex setIcon(Template.Image image) {
            this.icon = Optional.e(image);
            return this;
        }

        public WeatherIndex setTitle(Template.Title title) {
            this.title = Optional.e(title);
            return this;
        }
    }

    public static class WordDeformation {
        private Optional<String> part_name = Optional.a();
        private Optional<List<String>> word = Optional.a();

        public Optional<String> getPartName() {
            return this.part_name;
        }

        public Optional<List<String>> getWord() {
            return this.word;
        }

        public WordDeformation setPartName(String str) {
            this.part_name = Optional.e(str);
            return this;
        }

        public WordDeformation setWord(List<String> list) {
            this.word = Optional.e(list);
            return this;
        }
    }

    public static class WordDetail {
        private Optional<PartSimple> parts = Optional.a();
        private Optional<List<WordDeformation>> deformations = Optional.a();
        private Optional<List<ExampleSentence>> sentences = Optional.a();
        private Optional<List<Synonym>> synonym = Optional.a();
        private Optional<List<Synonym>> antonym = Optional.a();

        public Optional<List<Synonym>> getAntonym() {
            return this.antonym;
        }

        public Optional<List<WordDeformation>> getDeformations() {
            return this.deformations;
        }

        public Optional<PartSimple> getParts() {
            return this.parts;
        }

        public Optional<List<ExampleSentence>> getSentences() {
            return this.sentences;
        }

        public Optional<List<Synonym>> getSynonym() {
            return this.synonym;
        }

        public WordDetail setAntonym(List<Synonym> list) {
            this.antonym = Optional.e(list);
            return this;
        }

        public WordDetail setDeformations(List<WordDeformation> list) {
            this.deformations = Optional.e(list);
            return this;
        }

        public WordDetail setParts(PartSimple partSimple) {
            this.parts = Optional.e(partSimple);
            return this;
        }

        public WordDetail setSentences(List<ExampleSentence> list) {
            this.sentences = Optional.e(list);
            return this;
        }

        public WordDetail setSynonym(List<Synonym> list) {
            this.synonym = Optional.e(list);
            return this;
        }
    }

    public static class ConversationFlowIcon {
        private Optional<ConversationFlowAlignType> align = Optional.a();

        @Required
        private String icon;

        public ConversationFlowIcon() {
        }

        public Optional<ConversationFlowAlignType> getAlign() {
            return this.align;
        }

        @Required
        public String getIcon() {
            return this.icon;
        }

        public ConversationFlowIcon setAlign(ConversationFlowAlignType conversationFlowAlignType) {
            this.align = Optional.e(conversationFlowAlignType);
            return this;
        }

        @Required
        public ConversationFlowIcon setIcon(String str) {
            this.icon = str;
            return this;
        }

        public ConversationFlowIcon(String str) {
            this.icon = str;
        }
    }

    public static class ConversationFlowText {
        private Optional<ConversationFlowAlignType> align = Optional.a();

        @Required
        private String text;

        public ConversationFlowText() {
        }

        public Optional<ConversationFlowAlignType> getAlign() {
            return this.align;
        }

        @Required
        public String getText() {
            return this.text;
        }

        public ConversationFlowText setAlign(ConversationFlowAlignType conversationFlowAlignType) {
            this.align = Optional.e(conversationFlowAlignType);
            return this;
        }

        @Required
        public ConversationFlowText setText(String str) {
            this.text = str;
            return this;
        }

        public ConversationFlowText(String str) {
            this.text = str;
        }
    }

    @NamespaceName(name = "Dialogue", namespace = AIApiConstants.FullScreenTemplate.NAME)
    public static class Dialogue implements InstructionPayload {

        @Required
        private Dialog data;
        private Optional<Template.Task> task = Optional.a();

        public Dialogue() {
        }

        @Required
        public Dialog getData() {
            return this.data;
        }

        public Optional<Template.Task> getTask() {
            return this.task;
        }

        @Required
        public Dialogue setData(Dialog dialog) {
            this.data = dialog;
            return this;
        }

        public Dialogue setTask(Template.Task task) {
            this.task = Optional.e(task);
            return this;
        }

        public Dialogue(Dialog dialog) {
            this.data = dialog;
        }
    }

    public static class DictionaryPropertyEvent {

        @Required
        private String description;
        private Optional<String> icon = Optional.a();

        @Required
        private String name;

        public DictionaryPropertyEvent() {
        }

        @Required
        public String getDescription() {
            return this.description;
        }

        public Optional<String> getIcon() {
            return this.icon;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public DictionaryPropertyEvent setDescription(String str) {
            this.description = str;
            return this;
        }

        public DictionaryPropertyEvent setIcon(String str) {
            this.icon = Optional.e(str);
            return this;
        }

        @Required
        public DictionaryPropertyEvent setName(String str) {
            this.name = str;
            return this;
        }

        public DictionaryPropertyEvent(String str, String str2) {
            this.name = str;
            this.description = str2;
        }
    }

    public static class FoodShelfLifeData {

        @Required
        private long expire;
        private Optional<Long> id = Optional.a();

        @Required
        private List<FoodStorageInfo> storage_info;

        @Required
        private String storage_time;

        public FoodShelfLifeData() {
        }

        @Required
        public long getExpire() {
            return this.expire;
        }

        public Optional<Long> getId() {
            return this.id;
        }

        @Required
        public List<FoodStorageInfo> getStorageInfo() {
            return this.storage_info;
        }

        @Required
        public String getStorageTime() {
            return this.storage_time;
        }

        @Required
        public FoodShelfLifeData setExpire(long j) {
            this.expire = j;
            return this;
        }

        public FoodShelfLifeData setId(long j) {
            this.id = Optional.e(Long.valueOf(j));
            return this;
        }

        @Required
        public FoodShelfLifeData setStorageInfo(List<FoodStorageInfo> list) {
            this.storage_info = list;
            return this;
        }

        @Required
        public FoodShelfLifeData setStorageTime(String str) {
            this.storage_time = str;
            return this;
        }

        public FoodShelfLifeData(String str, List<FoodStorageInfo> list, long j) {
            this.storage_time = str;
            this.storage_info = list;
            this.expire = j;
        }
    }

    public static class H5Anniversary {

        @Required
        private AnniversaryReminder current_data;

        @Required
        private boolean is_first_Use;

        @Required
        private String query;
        private Optional<List<AnniversaryReminder>> recent_data = Optional.a();

        public H5Anniversary() {
        }

        @Required
        public AnniversaryReminder getCurrentData() {
            return this.current_data;
        }

        @Required
        public String getQuery() {
            return this.query;
        }

        public Optional<List<AnniversaryReminder>> getRecentData() {
            return this.recent_data;
        }

        @Required
        public boolean isFirstUse() {
            return this.is_first_Use;
        }

        @Required
        public H5Anniversary setCurrentData(AnniversaryReminder anniversaryReminder) {
            this.current_data = anniversaryReminder;
            return this;
        }

        @Required
        public H5Anniversary setIsFirstUse(boolean z) {
            this.is_first_Use = z;
            return this;
        }

        @Required
        public H5Anniversary setQuery(String str) {
            this.query = str;
            return this;
        }

        public H5Anniversary setRecentData(List<AnniversaryReminder> list) {
            this.recent_data = Optional.e(list);
            return this;
        }

        public H5Anniversary(String str, boolean z, AnniversaryReminder anniversaryReminder) {
            this.query = str;
            this.is_first_Use = z;
            this.current_data = anniversaryReminder;
        }
    }

    public static class H5Dictionaries {

        @Required
        private List<H5Dictionary> dictionaries;
        private Optional<DictionaryCardType> type = Optional.a();

        public H5Dictionaries() {
        }

        @Required
        public List<H5Dictionary> getDictionaries() {
            return this.dictionaries;
        }

        public Optional<DictionaryCardType> getType() {
            return this.type;
        }

        @Required
        public H5Dictionaries setDictionaries(List<H5Dictionary> list) {
            this.dictionaries = list;
            return this;
        }

        public H5Dictionaries setType(DictionaryCardType dictionaryCardType) {
            this.type = Optional.e(dictionaryCardType);
            return this;
        }

        public H5Dictionaries(List<H5Dictionary> list) {
            this.dictionaries = list;
        }
    }

    public static class H5Feihualing {
        private Optional<List<ConversationFlowMsg>> append_messages = Optional.a();

        @Required
        private List<FeihualingMsg> messages;

        @Required
        private String query;

        public H5Feihualing() {
        }

        public Optional<List<ConversationFlowMsg>> getAppendMessages() {
            return this.append_messages;
        }

        @Required
        public List<FeihualingMsg> getMessages() {
            return this.messages;
        }

        @Required
        public String getQuery() {
            return this.query;
        }

        public H5Feihualing setAppendMessages(List<ConversationFlowMsg> list) {
            this.append_messages = Optional.e(list);
            return this;
        }

        @Required
        public H5Feihualing setMessages(List<FeihualingMsg> list) {
            this.messages = list;
            return this;
        }

        @Required
        public H5Feihualing setQuery(String str) {
            this.query = str;
            return this;
        }

        public H5Feihualing(String str, List<FeihualingMsg> list) {
            this.query = str;
            this.messages = list;
        }
    }

    public static class H5Food {

        @Required
        private FoodDataCategory category;
        private Optional<FoodShelfLifeData> shelf_life_data = Optional.a();

        public H5Food() {
        }

        @Required
        public FoodDataCategory getCategory() {
            return this.category;
        }

        public Optional<FoodShelfLifeData> getShelfLifeData() {
            return this.shelf_life_data;
        }

        @Required
        public H5Food setCategory(FoodDataCategory foodDataCategory) {
            this.category = foodDataCategory;
            return this;
        }

        public H5Food setShelfLifeData(FoodShelfLifeData foodShelfLifeData) {
            this.shelf_life_data = Optional.e(foodShelfLifeData);
            return this;
        }

        public H5Food(FoodDataCategory foodDataCategory) {
            this.category = foodDataCategory;
        }
    }

    public static class PluginContent {

        @Required
        private PluginContentType content_type;
        private Optional<List<TrainInfo>> params = Optional.a();

        public PluginContent() {
        }

        @Required
        public PluginContentType getContentType() {
            return this.content_type;
        }

        public Optional<List<TrainInfo>> getParams() {
            return this.params;
        }

        @Required
        public PluginContent setContentType(PluginContentType pluginContentType) {
            this.content_type = pluginContentType;
            return this;
        }

        public PluginContent setParams(List<TrainInfo> list) {
            this.params = Optional.e(list);
            return this;
        }

        public PluginContent(PluginContentType pluginContentType) {
            this.content_type = pluginContentType;
        }
    }

    public static class PoemLocationInfo {
        private Optional<List<Integer>> index_list = Optional.a();

        @Required
        private PoemLocationType location_type;

        public PoemLocationInfo() {
        }

        public Optional<List<Integer>> getIndexList() {
            return this.index_list;
        }

        @Required
        public PoemLocationType getLocationType() {
            return this.location_type;
        }

        public PoemLocationInfo setIndexList(List<Integer> list) {
            this.index_list = Optional.e(list);
            return this;
        }

        @Required
        public PoemLocationInfo setLocationType(PoemLocationType poemLocationType) {
            this.location_type = poemLocationType;
            return this;
        }

        public PoemLocationInfo(PoemLocationType poemLocationType) {
            this.location_type = poemLocationType;
        }
    }

    @NamespaceName(name = "PrivacyAuthGuide", namespace = AIApiConstants.FullScreenTemplate.NAME)
    public static class PrivacyAuthGuide implements InstructionPayload {

        @Required
        private List<PrivacyAuthCardItem> items;
        private Optional<Template.Image> skill_icon = Optional.a();

        @Required
        private int stdstatus_code;

        public PrivacyAuthGuide() {
        }

        @Required
        public List<PrivacyAuthCardItem> getItems() {
            return this.items;
        }

        public Optional<Template.Image> getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public int getStdstatusCode() {
            return this.stdstatus_code;
        }

        @Required
        public PrivacyAuthGuide setItems(List<PrivacyAuthCardItem> list) {
            this.items = list;
            return this;
        }

        public PrivacyAuthGuide setSkillIcon(Template.Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        @Required
        public PrivacyAuthGuide setStdstatusCode(int i) {
            this.stdstatus_code = i;
            return this;
        }

        public PrivacyAuthGuide(int i, List<PrivacyAuthCardItem> list) {
            this.stdstatus_code = i;
            this.items = list;
        }
    }

    public static class StationRadioInfo {

        @Required
        private StationCardHead card_head;

        @Required
        private boolean is_boutique;
        private Optional<String> open_play_url = Optional.a();

        @Required
        private List<RadioProgram> radio_programs;

        @Required
        private String resource_id;

        public StationRadioInfo() {
        }

        @Required
        public StationCardHead getCardHead() {
            return this.card_head;
        }

        public Optional<String> getOpenPlayUrl() {
            return this.open_play_url;
        }

        @Required
        public List<RadioProgram> getRadioPrograms() {
            return this.radio_programs;
        }

        @Required
        public String getResourceId() {
            return this.resource_id;
        }

        @Required
        public boolean isBoutique() {
            return this.is_boutique;
        }

        @Required
        public StationRadioInfo setCardHead(StationCardHead stationCardHead) {
            this.card_head = stationCardHead;
            return this;
        }

        @Required
        public StationRadioInfo setIsBoutique(boolean z) {
            this.is_boutique = z;
            return this;
        }

        public StationRadioInfo setOpenPlayUrl(String str) {
            this.open_play_url = Optional.e(str);
            return this;
        }

        @Required
        public StationRadioInfo setRadioPrograms(List<RadioProgram> list) {
            this.radio_programs = list;
            return this;
        }

        @Required
        public StationRadioInfo setResourceId(String str) {
            this.resource_id = str;
            return this;
        }

        public StationRadioInfo(StationCardHead stationCardHead, List<RadioProgram> list, String str, boolean z) {
            this.card_head = stationCardHead;
            this.radio_programs = list;
            this.resource_id = str;
            this.is_boutique = z;
        }
    }

    @NamespaceName(name = "Suite", namespace = AIApiConstants.FullScreenTemplate.NAME)
    public static class Suite implements InstructionPayload {
        private Optional<Template.FullScreen> full_screen = Optional.a();

        @Required
        private mj1 instructions;

        @Required
        private Template.Image skill_icon;

        @Required
        private SuiteType ui_type;

        public Suite() {
        }

        public Optional<Template.FullScreen> getFullScreen() {
            return this.full_screen;
        }

        @Required
        public mj1 getInstructions() {
            return this.instructions;
        }

        @Required
        public Template.Image getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public SuiteType getUiType() {
            return this.ui_type;
        }

        public Suite setFullScreen(Template.FullScreen fullScreen) {
            this.full_screen = Optional.e(fullScreen);
            return this;
        }

        @Required
        public Suite setInstructions(mj1 mj1Var) {
            this.instructions = mj1Var;
            return this;
        }

        @Required
        public Suite setSkillIcon(Template.Image image) {
            this.skill_icon = image;
            return this;
        }

        @Required
        public Suite setUiType(SuiteType suiteType) {
            this.ui_type = suiteType;
            return this;
        }

        public Suite(mj1 mj1Var, Template.Image image, SuiteType suiteType) {
            this.instructions = mj1Var;
            this.skill_icon = image;
            this.ui_type = suiteType;
        }
    }

    public static class WordsDetail {

        @Required
        private List<DictionaryItem> dictionaryItems;
        private Optional<Template.Title> title = Optional.a();

        public WordsDetail() {
        }

        @Required
        public List<DictionaryItem> getDictionaryItems() {
            return this.dictionaryItems;
        }

        public Optional<Template.Title> getTitle() {
            return this.title;
        }

        @Required
        public WordsDetail setDictionaryItems(List<DictionaryItem> list) {
            this.dictionaryItems = list;
            return this;
        }

        public WordsDetail setTitle(Template.Title title) {
            this.title = Optional.e(title);
            return this;
        }

        public WordsDetail(List<DictionaryItem> list) {
            this.dictionaryItems = list;
        }
    }

    public static class ConversationFlowMsg {

        @Required
        private boolean display_dialog_box;
        private Optional<ConversationFlowTitle> title = Optional.a();
        private Optional<ConversationFlowText> text = Optional.a();

        public ConversationFlowMsg() {
        }

        public Optional<ConversationFlowText> getText() {
            return this.text;
        }

        public Optional<ConversationFlowTitle> getTitle() {
            return this.title;
        }

        @Required
        public boolean isDisplayDialogBox() {
            return this.display_dialog_box;
        }

        @Required
        public ConversationFlowMsg setDisplayDialogBox(boolean z) {
            this.display_dialog_box = z;
            return this;
        }

        public ConversationFlowMsg setText(ConversationFlowText conversationFlowText) {
            this.text = Optional.e(conversationFlowText);
            return this;
        }

        public ConversationFlowMsg setTitle(ConversationFlowTitle conversationFlowTitle) {
            this.title = Optional.e(conversationFlowTitle);
            return this;
        }

        public ConversationFlowMsg(boolean z) {
            this.display_dialog_box = z;
        }
    }

    public static class ConversationFlowTitle {

        @Required
        private ConversationFlowText main_title;
        private Optional<ConversationFlowText> sub_title = Optional.a();
        private Optional<ConversationFlowIcon> icon = Optional.a();

        public ConversationFlowTitle() {
        }

        public Optional<ConversationFlowIcon> getIcon() {
            return this.icon;
        }

        @Required
        public ConversationFlowText getMainTitle() {
            return this.main_title;
        }

        public Optional<ConversationFlowText> getSubTitle() {
            return this.sub_title;
        }

        public ConversationFlowTitle setIcon(ConversationFlowIcon conversationFlowIcon) {
            this.icon = Optional.e(conversationFlowIcon);
            return this;
        }

        @Required
        public ConversationFlowTitle setMainTitle(ConversationFlowText conversationFlowText) {
            this.main_title = conversationFlowText;
            return this;
        }

        public ConversationFlowTitle setSubTitle(ConversationFlowText conversationFlowText) {
            this.sub_title = Optional.e(conversationFlowText);
            return this;
        }

        public ConversationFlowTitle(ConversationFlowText conversationFlowText) {
            this.main_title = conversationFlowText;
        }
    }

    public static class DictionaryItem {

        @Required
        private Template.Title title;
        private Optional<String> text = Optional.a();
        private Optional<Template.Image> icon = Optional.a();

        public DictionaryItem() {
        }

        public Optional<Template.Image> getIcon() {
            return this.icon;
        }

        public Optional<String> getText() {
            return this.text;
        }

        @Required
        public Template.Title getTitle() {
            return this.title;
        }

        public DictionaryItem setIcon(Template.Image image) {
            this.icon = Optional.e(image);
            return this;
        }

        public DictionaryItem setText(String str) {
            this.text = Optional.e(str);
            return this;
        }

        @Required
        public DictionaryItem setTitle(Template.Title title) {
            this.title = title;
            return this;
        }

        public DictionaryItem(Template.Title title) {
            this.title = title;
        }
    }

    public static class DictionaryWord {

        @Required
        private String text;
        private Optional<String> pinyin = Optional.a();
        private Optional<Template.Image> image = Optional.a();

        public DictionaryWord() {
        }

        public Optional<Template.Image> getImage() {
            return this.image;
        }

        public Optional<String> getPinyin() {
            return this.pinyin;
        }

        @Required
        public String getText() {
            return this.text;
        }

        public DictionaryWord setImage(Template.Image image) {
            this.image = Optional.e(image);
            return this;
        }

        public DictionaryWord setPinyin(String str) {
            this.pinyin = Optional.e(str);
            return this;
        }

        @Required
        public DictionaryWord setText(String str) {
            this.text = str;
            return this;
        }

        public DictionaryWord(String str) {
            this.text = str;
        }
    }

    public static class H5Composition {

        @Required
        private String grade;

        @Required
        private String name;

        @Required
        private String summary;

        @Required
        private CompositionContentType typ;

        @Required
        private String word_count;
        private Optional<String> content = Optional.a();
        private Optional<String> url = Optional.a();

        public H5Composition() {
        }

        public Optional<String> getContent() {
            return this.content;
        }

        @Required
        public String getGrade() {
            return this.grade;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public String getSummary() {
            return this.summary;
        }

        @Required
        public CompositionContentType getTyp() {
            return this.typ;
        }

        public Optional<String> getUrl() {
            return this.url;
        }

        @Required
        public String getWordCount() {
            return this.word_count;
        }

        public H5Composition setContent(String str) {
            this.content = Optional.e(str);
            return this;
        }

        @Required
        public H5Composition setGrade(String str) {
            this.grade = str;
            return this;
        }

        @Required
        public H5Composition setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public H5Composition setSummary(String str) {
            this.summary = str;
            return this;
        }

        @Required
        public H5Composition setTyp(CompositionContentType compositionContentType) {
            this.typ = compositionContentType;
            return this;
        }

        public H5Composition setUrl(String str) {
            this.url = Optional.e(str);
            return this;
        }

        @Required
        public H5Composition setWordCount(String str) {
            this.word_count = str;
            return this;
        }

        public H5Composition(String str, String str2, String str3, String str4, CompositionContentType compositionContentType) {
            this.name = str;
            this.grade = str2;
            this.word_count = str3;
            this.summary = str4;
            this.typ = compositionContentType;
        }
    }

    public static class H5LifeService {

        @Required
        private LifeServicePageType page_type;
        private Optional<List<PluginInfo>> plugins = Optional.a();
        private Optional<List<PluginContent>> plugin_content = Optional.a();

        public H5LifeService() {
        }

        @Required
        public LifeServicePageType getPageType() {
            return this.page_type;
        }

        public Optional<List<PluginContent>> getPluginContent() {
            return this.plugin_content;
        }

        public Optional<List<PluginInfo>> getPlugins() {
            return this.plugins;
        }

        @Required
        public H5LifeService setPageType(LifeServicePageType lifeServicePageType) {
            this.page_type = lifeServicePageType;
            return this;
        }

        public H5LifeService setPluginContent(List<PluginContent> list) {
            this.plugin_content = Optional.e(list);
            return this;
        }

        public H5LifeService setPlugins(List<PluginInfo> list) {
            this.plugins = Optional.e(list);
            return this;
        }

        public H5LifeService(LifeServicePageType lifeServicePageType) {
            this.page_type = lifeServicePageType;
        }
    }

    public static class PoemWord {

        @Required
        private String word;
        private Optional<String> pinyin = Optional.a();
        private Optional<Boolean> is_punctuation = Optional.a();

        public PoemWord() {
        }

        public Optional<String> getPinyin() {
            return this.pinyin;
        }

        @Required
        public String getWord() {
            return this.word;
        }

        public Optional<Boolean> isPunctuation() {
            return this.is_punctuation;
        }

        public PoemWord setIsPunctuation(boolean z) {
            this.is_punctuation = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public PoemWord setPinyin(String str) {
            this.pinyin = Optional.e(str);
            return this;
        }

        @Required
        public PoemWord setWord(String str) {
            this.word = str;
            return this;
        }

        public PoemWord(String str) {
            this.word = str;
        }
    }

    @NamespaceName(name = "TranslationDialog", namespace = AIApiConstants.FullScreenTemplate.NAME)
    public static class TranslationDialog implements InstructionPayload {

        @Required
        private String dest_language;

        @Required
        private String dest_text;

        @Required
        private String dest_text_audio_url;

        @Required
        private String src_language;

        @Required
        private String src_text;
        private Optional<List<String>> synonym_words = Optional.a();
        private Optional<Boolean> show_dic_btn = Optional.a();

        public TranslationDialog() {
        }

        @Required
        public String getDestLanguage() {
            return this.dest_language;
        }

        @Required
        public String getDestText() {
            return this.dest_text;
        }

        @Required
        public String getDestTextAudioUrl() {
            return this.dest_text_audio_url;
        }

        @Required
        public String getSrcLanguage() {
            return this.src_language;
        }

        @Required
        public String getSrcText() {
            return this.src_text;
        }

        public Optional<List<String>> getSynonymWords() {
            return this.synonym_words;
        }

        public Optional<Boolean> isShowDicBtn() {
            return this.show_dic_btn;
        }

        @Required
        public TranslationDialog setDestLanguage(String str) {
            this.dest_language = str;
            return this;
        }

        @Required
        public TranslationDialog setDestText(String str) {
            this.dest_text = str;
            return this;
        }

        @Required
        public TranslationDialog setDestTextAudioUrl(String str) {
            this.dest_text_audio_url = str;
            return this;
        }

        public TranslationDialog setShowDicBtn(boolean z) {
            this.show_dic_btn = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Required
        public TranslationDialog setSrcLanguage(String str) {
            this.src_language = str;
            return this;
        }

        @Required
        public TranslationDialog setSrcText(String str) {
            this.src_text = str;
            return this;
        }

        public TranslationDialog setSynonymWords(List<String> list) {
            this.synonym_words = Optional.e(list);
            return this;
        }

        public TranslationDialog(String str, String str2, String str3, String str4, String str5) {
            this.src_language = str;
            this.src_text = str2;
            this.dest_language = str3;
            this.dest_text = str4;
            this.dest_text_audio_url = str5;
        }
    }

    public static class WeatherAlert {

        @Required
        private Template.Title title;
        private Optional<Template.Image> icon = Optional.a();
        private Optional<String> detail = Optional.a();

        public WeatherAlert() {
        }

        public Optional<String> getDetail() {
            return this.detail;
        }

        public Optional<Template.Image> getIcon() {
            return this.icon;
        }

        @Required
        public Template.Title getTitle() {
            return this.title;
        }

        public WeatherAlert setDetail(String str) {
            this.detail = Optional.e(str);
            return this;
        }

        public WeatherAlert setIcon(Template.Image image) {
            this.icon = Optional.e(image);
            return this;
        }

        @Required
        public WeatherAlert setTitle(Template.Title title) {
            this.title = title;
            return this;
        }

        public WeatherAlert(Template.Title title) {
            this.title = title;
        }
    }

    public static class Animation {

        @Required
        private String audio;

        @Required
        private String text;

        @Required
        private String url;
        private Optional<String> name = Optional.a();
        private Optional<Long> version = Optional.a();
        private Optional<Long> duration = Optional.a();

        public Animation() {
        }

        @Required
        public String getAudio() {
            return this.audio;
        }

        public Optional<Long> getDuration() {
            return this.duration;
        }

        public Optional<String> getName() {
            return this.name;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public String getUrl() {
            return this.url;
        }

        public Optional<Long> getVersion() {
            return this.version;
        }

        @Required
        public Animation setAudio(String str) {
            this.audio = str;
            return this;
        }

        public Animation setDuration(long j) {
            this.duration = Optional.e(Long.valueOf(j));
            return this;
        }

        public Animation setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        @Required
        public Animation setText(String str) {
            this.text = str;
            return this;
        }

        @Required
        public Animation setUrl(String str) {
            this.url = str;
            return this;
        }

        public Animation setVersion(long j) {
            this.version = Optional.e(Long.valueOf(j));
            return this;
        }

        public Animation(String str, String str2, String str3) {
            this.url = str;
            this.audio = str2;
            this.text = str3;
        }
    }

    public static class AnniversaryReminder {

        @Required
        private AnniversaryType card_type;

        @Required
        private String event_name;
        private Optional<String> date_time = Optional.a();
        private Optional<Integer> days = Optional.a();
        private Optional<Long> id = Optional.a();

        public AnniversaryReminder() {
        }

        @Required
        public AnniversaryType getCardType() {
            return this.card_type;
        }

        public Optional<String> getDateTime() {
            return this.date_time;
        }

        public Optional<Integer> getDays() {
            return this.days;
        }

        @Required
        public String getEventName() {
            return this.event_name;
        }

        public Optional<Long> getId() {
            return this.id;
        }

        @Required
        public AnniversaryReminder setCardType(AnniversaryType anniversaryType) {
            this.card_type = anniversaryType;
            return this;
        }

        public AnniversaryReminder setDateTime(String str) {
            this.date_time = Optional.e(str);
            return this;
        }

        public AnniversaryReminder setDays(int i) {
            this.days = Optional.e(Integer.valueOf(i));
            return this;
        }

        @Required
        public AnniversaryReminder setEventName(String str) {
            this.event_name = str;
            return this;
        }

        public AnniversaryReminder setId(long j) {
            this.id = Optional.e(Long.valueOf(j));
            return this;
        }

        public AnniversaryReminder(String str, AnniversaryType anniversaryType) {
            this.event_name = str;
            this.card_type = anniversaryType;
        }
    }

    public static class FeihualingMsg {

        @Required
        private FeihualingMsgAlignType align;

        @Required
        private boolean display_dialog_box;
        private Optional<String> text = Optional.a();
        private Optional<FeihualingVerse> verse = Optional.a();
        private Optional<FeihualingLevel> level = Optional.a();

        public FeihualingMsg() {
        }

        @Required
        public FeihualingMsgAlignType getAlign() {
            return this.align;
        }

        public Optional<FeihualingLevel> getLevel() {
            return this.level;
        }

        public Optional<String> getText() {
            return this.text;
        }

        public Optional<FeihualingVerse> getVerse() {
            return this.verse;
        }

        @Required
        public boolean isDisplayDialogBox() {
            return this.display_dialog_box;
        }

        @Required
        public FeihualingMsg setAlign(FeihualingMsgAlignType feihualingMsgAlignType) {
            this.align = feihualingMsgAlignType;
            return this;
        }

        @Required
        public FeihualingMsg setDisplayDialogBox(boolean z) {
            this.display_dialog_box = z;
            return this;
        }

        public FeihualingMsg setLevel(FeihualingLevel feihualingLevel) {
            this.level = Optional.e(feihualingLevel);
            return this;
        }

        public FeihualingMsg setText(String str) {
            this.text = Optional.e(str);
            return this;
        }

        public FeihualingMsg setVerse(FeihualingVerse feihualingVerse) {
            this.verse = Optional.e(feihualingVerse);
            return this;
        }

        public FeihualingMsg(FeihualingMsgAlignType feihualingMsgAlignType, boolean z) {
            this.align = feihualingMsgAlignType;
            this.display_dialog_box = z;
        }
    }

    public static class FeihualingVerse {

        @Required
        private List<String> verse;
        private Optional<String> keyword = Optional.a();
        private Optional<String> subtitle = Optional.a();
        private Optional<String> footer = Optional.a();

        public FeihualingVerse() {
        }

        public Optional<String> getFooter() {
            return this.footer;
        }

        public Optional<String> getKeyword() {
            return this.keyword;
        }

        public Optional<String> getSubtitle() {
            return this.subtitle;
        }

        @Required
        public List<String> getVerse() {
            return this.verse;
        }

        public FeihualingVerse setFooter(String str) {
            this.footer = Optional.e(str);
            return this;
        }

        public FeihualingVerse setKeyword(String str) {
            this.keyword = Optional.e(str);
            return this;
        }

        public FeihualingVerse setSubtitle(String str) {
            this.subtitle = Optional.e(str);
            return this;
        }

        @Required
        public FeihualingVerse setVerse(List<String> list) {
            this.verse = list;
            return this;
        }

        public FeihualingVerse(List<String> list) {
            this.verse = list;
        }
    }

    public static class H5NucleicAcidData {

        @Required
        private NucleicAcidTimeStatus time_type;
        private Optional<String> sampling_time = Optional.a();
        private Optional<String> expiration = Optional.a();
        private Optional<Integer> left_days = Optional.a();

        public H5NucleicAcidData() {
        }

        public Optional<String> getExpiration() {
            return this.expiration;
        }

        public Optional<Integer> getLeftDays() {
            return this.left_days;
        }

        public Optional<String> getSamplingTime() {
            return this.sampling_time;
        }

        @Required
        public NucleicAcidTimeStatus getTimeType() {
            return this.time_type;
        }

        public H5NucleicAcidData setExpiration(String str) {
            this.expiration = Optional.e(str);
            return this;
        }

        public H5NucleicAcidData setLeftDays(int i) {
            this.left_days = Optional.e(Integer.valueOf(i));
            return this;
        }

        public H5NucleicAcidData setSamplingTime(String str) {
            this.sampling_time = Optional.e(str);
            return this;
        }

        @Required
        public H5NucleicAcidData setTimeType(NucleicAcidTimeStatus nucleicAcidTimeStatus) {
            this.time_type = nucleicAcidTimeStatus;
            return this;
        }

        public H5NucleicAcidData(NucleicAcidTimeStatus nucleicAcidTimeStatus) {
            this.time_type = nucleicAcidTimeStatus;
        }
    }

    public static class H5Translation {

        @Required
        private String dest_language;

        @Required
        private String dest_text;

        @Required
        private String dest_text_audio_url;

        @Required
        private String src_language;

        @Required
        private String src_text;
        private Optional<Boolean> open_mic = Optional.a();
        private Optional<String> word_meaning = Optional.a();
        private Optional<String> ph_symbol = Optional.a();

        public H5Translation() {
        }

        @Required
        public String getDestLanguage() {
            return this.dest_language;
        }

        @Required
        public String getDestText() {
            return this.dest_text;
        }

        @Required
        public String getDestTextAudioUrl() {
            return this.dest_text_audio_url;
        }

        public Optional<String> getPhSymbol() {
            return this.ph_symbol;
        }

        @Required
        public String getSrcLanguage() {
            return this.src_language;
        }

        @Required
        public String getSrcText() {
            return this.src_text;
        }

        public Optional<String> getWordMeaning() {
            return this.word_meaning;
        }

        public Optional<Boolean> isOpenMic() {
            return this.open_mic;
        }

        @Required
        public H5Translation setDestLanguage(String str) {
            this.dest_language = str;
            return this;
        }

        @Required
        public H5Translation setDestText(String str) {
            this.dest_text = str;
            return this;
        }

        @Required
        public H5Translation setDestTextAudioUrl(String str) {
            this.dest_text_audio_url = str;
            return this;
        }

        public H5Translation setOpenMic(boolean z) {
            this.open_mic = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public H5Translation setPhSymbol(String str) {
            this.ph_symbol = Optional.e(str);
            return this;
        }

        @Required
        public H5Translation setSrcLanguage(String str) {
            this.src_language = str;
            return this;
        }

        @Required
        public H5Translation setSrcText(String str) {
            this.src_text = str;
            return this;
        }

        public H5Translation setWordMeaning(String str) {
            this.word_meaning = Optional.e(str);
            return this;
        }

        public H5Translation(String str, String str2, String str3, String str4, String str5) {
            this.src_language = str;
            this.src_text = str2;
            this.dest_language = str3;
            this.dest_text = str4;
            this.dest_text_audio_url = str5;
        }
    }

    public static class H5WordItem {

        @Required
        private String text;
        private Optional<String> id = Optional.a();
        private Optional<Integer> color = Optional.a();
        private Optional<Integer> font_size = Optional.a();

        public H5WordItem() {
        }

        public Optional<Integer> getColor() {
            return this.color;
        }

        public Optional<Integer> getFontSize() {
            return this.font_size;
        }

        public Optional<String> getId() {
            return this.id;
        }

        @Required
        public String getText() {
            return this.text;
        }

        public H5WordItem setColor(int i) {
            this.color = Optional.e(Integer.valueOf(i));
            return this;
        }

        public H5WordItem setFontSize(int i) {
            this.font_size = Optional.e(Integer.valueOf(i));
            return this;
        }

        public H5WordItem setId(String str) {
            this.id = Optional.e(str);
            return this;
        }

        @Required
        public H5WordItem setText(String str) {
            this.text = str;
            return this;
        }

        public H5WordItem(String str) {
            this.text = str;
        }
    }

    public static class PartSimple {

        @Required
        private String word;
        private Optional<List<PhoneticSymbol>> phonetic_symbols = Optional.a();
        private Optional<List<PartMeaning>> meanings = Optional.a();
        private Optional<List<String>> word_tags = Optional.a();

        public PartSimple() {
        }

        public Optional<List<PartMeaning>> getMeanings() {
            return this.meanings;
        }

        public Optional<List<PhoneticSymbol>> getPhoneticSymbols() {
            return this.phonetic_symbols;
        }

        @Required
        public String getWord() {
            return this.word;
        }

        public Optional<List<String>> getWordTags() {
            return this.word_tags;
        }

        public PartSimple setMeanings(List<PartMeaning> list) {
            this.meanings = Optional.e(list);
            return this;
        }

        public PartSimple setPhoneticSymbols(List<PhoneticSymbol> list) {
            this.phonetic_symbols = Optional.e(list);
            return this;
        }

        @Required
        public PartSimple setWord(String str) {
            this.word = str;
            return this;
        }

        public PartSimple setWordTags(List<String> list) {
            this.word_tags = Optional.e(list);
            return this;
        }

        public PartSimple(String str) {
            this.word = str;
        }
    }

    public static class PoemSentence {

        @Required
        private List<PoemWord> grid_list;
        private Optional<Boolean> highlight = Optional.a();
        private Optional<String> text = Optional.a();
        private Optional<List<PoemAnnotate>> annotate_list = Optional.a();

        public PoemSentence() {
        }

        public Optional<List<PoemAnnotate>> getAnnotateList() {
            return this.annotate_list;
        }

        @Required
        public List<PoemWord> getGridList() {
            return this.grid_list;
        }

        public Optional<String> getText() {
            return this.text;
        }

        public Optional<Boolean> isHighlight() {
            return this.highlight;
        }

        public PoemSentence setAnnotateList(List<PoemAnnotate> list) {
            this.annotate_list = Optional.e(list);
            return this;
        }

        @Required
        public PoemSentence setGridList(List<PoemWord> list) {
            this.grid_list = list;
            return this;
        }

        public PoemSentence setHighlight(boolean z) {
            this.highlight = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public PoemSentence setText(String str) {
            this.text = Optional.e(str);
            return this;
        }

        public PoemSentence(List<PoemWord> list) {
            this.grid_list = list;
        }
    }

    public static class QabotData {

        @Required
        private QabotDataSource data_source;
        private Optional<List<Template.Image>> images = Optional.a();
        private Optional<Template.Launcher> launcher = Optional.a();
        private Optional<String> show_more_tip = Optional.a();

        @Required
        private String text;

        @Required
        private Template.Title title;

        public QabotData() {
        }

        @Required
        public QabotDataSource getDataSource() {
            return this.data_source;
        }

        public Optional<List<Template.Image>> getImages() {
            return this.images;
        }

        public Optional<Template.Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<String> getShowMoreTip() {
            return this.show_more_tip;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public Template.Title getTitle() {
            return this.title;
        }

        @Required
        public QabotData setDataSource(QabotDataSource qabotDataSource) {
            this.data_source = qabotDataSource;
            return this;
        }

        public QabotData setImages(List<Template.Image> list) {
            this.images = Optional.e(list);
            return this;
        }

        public QabotData setLauncher(Template.Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public QabotData setShowMoreTip(String str) {
            this.show_more_tip = Optional.e(str);
            return this;
        }

        @Required
        public QabotData setText(String str) {
            this.text = str;
            return this;
        }

        @Required
        public QabotData setTitle(Template.Title title) {
            this.title = title;
            return this;
        }

        public QabotData(Template.Title title, String str, QabotDataSource qabotDataSource) {
            this.title = title;
            this.text = str;
            this.data_source = qabotDataSource;
        }
    }

    public static class Dialog {

        @Required
        private List<Message> messages;
        private Optional<String> background_image = Optional.a();
        private Optional<String> query = Optional.a();
        private Optional<Boolean> open_mic = Optional.a();
        private Optional<Template.CustomBackground> background = Optional.a();

        public Dialog() {
        }

        public Optional<Template.CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<String> getBackgroundImage() {
            return this.background_image;
        }

        @Required
        public List<Message> getMessages() {
            return this.messages;
        }

        public Optional<String> getQuery() {
            return this.query;
        }

        public Optional<Boolean> isOpenMic() {
            return this.open_mic;
        }

        public Dialog setBackground(Template.CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public Dialog setBackgroundImage(String str) {
            this.background_image = Optional.e(str);
            return this;
        }

        @Required
        public Dialog setMessages(List<Message> list) {
            this.messages = list;
            return this;
        }

        public Dialog setOpenMic(boolean z) {
            this.open_mic = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public Dialog setQuery(String str) {
            this.query = Optional.e(str);
            return this;
        }

        public Dialog(List<Message> list) {
            this.messages = list;
        }
    }

    public static class DictionarySimpleProperty {

        @Required
        private String text;

        @Required
        private String title;
        private Optional<List<H5WordItem>> h5_items = Optional.a();
        private Optional<DictionaryItemType> h5_items_type = Optional.a();
        private Optional<DictionaryPropertyEvent> property_event = Optional.a();
        private Optional<List<List<H5WordItem>>> h5_classfiy_items = Optional.a();

        public DictionarySimpleProperty() {
        }

        public Optional<List<List<H5WordItem>>> getH5ClassfiyItems() {
            return this.h5_classfiy_items;
        }

        public Optional<List<H5WordItem>> getH5Items() {
            return this.h5_items;
        }

        public Optional<DictionaryItemType> getH5ItemsType() {
            return this.h5_items_type;
        }

        public Optional<DictionaryPropertyEvent> getPropertyEvent() {
            return this.property_event;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public String getTitle() {
            return this.title;
        }

        public DictionarySimpleProperty setH5ClassfiyItems(List<List<H5WordItem>> list) {
            this.h5_classfiy_items = Optional.e(list);
            return this;
        }

        public DictionarySimpleProperty setH5Items(List<H5WordItem> list) {
            this.h5_items = Optional.e(list);
            return this;
        }

        public DictionarySimpleProperty setH5ItemsType(DictionaryItemType dictionaryItemType) {
            this.h5_items_type = Optional.e(dictionaryItemType);
            return this;
        }

        public DictionarySimpleProperty setPropertyEvent(DictionaryPropertyEvent dictionaryPropertyEvent) {
            this.property_event = Optional.e(dictionaryPropertyEvent);
            return this;
        }

        @Required
        public DictionarySimpleProperty setText(String str) {
            this.text = str;
            return this;
        }

        @Required
        public DictionarySimpleProperty setTitle(String str) {
            this.title = str;
            return this;
        }

        public DictionarySimpleProperty(String str, String str2) {
            this.title = str;
            this.text = str2;
        }
    }

    public static class MemoInfo {

        @Required
        private String id;
        private Optional<String> name = Optional.a();
        private Optional<String> place = Optional.a();
        private Optional<String> content = Optional.a();
        private Optional<String> category = Optional.a();

        public MemoInfo() {
        }

        public Optional<String> getCategory() {
            return this.category;
        }

        public Optional<String> getContent() {
            return this.content;
        }

        @Required
        public String getId() {
            return this.id;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<String> getPlace() {
            return this.place;
        }

        public MemoInfo setCategory(String str) {
            this.category = Optional.e(str);
            return this;
        }

        public MemoInfo setContent(String str) {
            this.content = Optional.e(str);
            return this;
        }

        @Required
        public MemoInfo setId(String str) {
            this.id = str;
            return this;
        }

        public MemoInfo setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public MemoInfo setPlace(String str) {
            this.place = Optional.e(str);
            return this;
        }

        public MemoInfo(String str) {
            this.id = str;
        }
    }

    public static class Message {

        @Required
        private String avatar;

        @Required
        private MessageType type;
        private Optional<TTS> tts = Optional.a();
        private Optional<Image> image = Optional.a();
        private Optional<Animation> animation = Optional.a();
        private Optional<Emoji> emoji = Optional.a();

        public Message() {
        }

        public Optional<Animation> getAnimation() {
            return this.animation;
        }

        @Required
        public String getAvatar() {
            return this.avatar;
        }

        public Optional<Emoji> getEmoji() {
            return this.emoji;
        }

        public Optional<Image> getImage() {
            return this.image;
        }

        public Optional<TTS> getTts() {
            return this.tts;
        }

        @Required
        public MessageType getType() {
            return this.type;
        }

        public Message setAnimation(Animation animation) {
            this.animation = Optional.e(animation);
            return this;
        }

        @Required
        public Message setAvatar(String str) {
            this.avatar = str;
            return this;
        }

        public Message setEmoji(Emoji emoji) {
            this.emoji = Optional.e(emoji);
            return this;
        }

        public Message setImage(Image image) {
            this.image = Optional.e(image);
            return this;
        }

        public Message setTts(TTS tts) {
            this.tts = Optional.e(tts);
            return this;
        }

        @Required
        public Message setType(MessageType messageType) {
            this.type = messageType;
            return this;
        }

        public Message(MessageType messageType, String str) {
            this.type = messageType;
            this.avatar = str;
        }
    }

    public static class StationInfo {

        @Required
        private StationCardHead card_head;

        @Required
        private int episode_count;

        @Required
        private boolean is_boutique;

        @Required
        private boolean is_final;

        @Required
        private String resource_id;

        @Required
        private int starting_episode;
        private Optional<StationAlbumChapter> chapter = Optional.a();
        private Optional<List<StationAlbumChapter>> chapters = Optional.a();
        private Optional<StationResourceOrderType> order_type = Optional.a();
        private Optional<String> open_play_url = Optional.a();

        public StationInfo() {
        }

        @Required
        public StationCardHead getCardHead() {
            return this.card_head;
        }

        public Optional<StationAlbumChapter> getChapter() {
            return this.chapter;
        }

        public Optional<List<StationAlbumChapter>> getChapters() {
            return this.chapters;
        }

        @Required
        public int getEpisodeCount() {
            return this.episode_count;
        }

        public Optional<String> getOpenPlayUrl() {
            return this.open_play_url;
        }

        public Optional<StationResourceOrderType> getOrderType() {
            return this.order_type;
        }

        @Required
        public String getResourceId() {
            return this.resource_id;
        }

        @Required
        public int getStartingEpisode() {
            return this.starting_episode;
        }

        @Required
        public boolean isBoutique() {
            return this.is_boutique;
        }

        @Required
        public boolean isFinal() {
            return this.is_final;
        }

        @Required
        public StationInfo setCardHead(StationCardHead stationCardHead) {
            this.card_head = stationCardHead;
            return this;
        }

        public StationInfo setChapter(StationAlbumChapter stationAlbumChapter) {
            this.chapter = Optional.e(stationAlbumChapter);
            return this;
        }

        public StationInfo setChapters(List<StationAlbumChapter> list) {
            this.chapters = Optional.e(list);
            return this;
        }

        @Required
        public StationInfo setEpisodeCount(int i) {
            this.episode_count = i;
            return this;
        }

        @Required
        public StationInfo setIsBoutique(boolean z) {
            this.is_boutique = z;
            return this;
        }

        @Required
        public StationInfo setIsFinal(boolean z) {
            this.is_final = z;
            return this;
        }

        public StationInfo setOpenPlayUrl(String str) {
            this.open_play_url = Optional.e(str);
            return this;
        }

        public StationInfo setOrderType(StationResourceOrderType stationResourceOrderType) {
            this.order_type = Optional.e(stationResourceOrderType);
            return this;
        }

        @Required
        public StationInfo setResourceId(String str) {
            this.resource_id = str;
            return this;
        }

        @Required
        public StationInfo setStartingEpisode(int i) {
            this.starting_episode = i;
            return this;
        }

        public StationInfo(StationCardHead stationCardHead, int i, int i2, String str, boolean z, boolean z2) {
            this.card_head = stationCardHead;
            this.episode_count = i;
            this.starting_episode = i2;
            this.resource_id = str;
            this.is_boutique = z;
            this.is_final = z2;
        }
    }

    public static class DictionaryProperty {

        @Required
        private String text;

        @Required
        private String title;
        private Optional<List<H5WordItem>> h5_items = Optional.a();
        private Optional<DictionaryItemType> h5_items_type = Optional.a();
        private Optional<List<DictionarySimpleProperty>> multi_properties = Optional.a();
        private Optional<DictionaryPropertyEvent> property_event = Optional.a();
        private Optional<List<List<H5WordItem>>> h5_classfiy_items = Optional.a();

        public DictionaryProperty() {
        }

        public Optional<List<List<H5WordItem>>> getH5ClassfiyItems() {
            return this.h5_classfiy_items;
        }

        public Optional<List<H5WordItem>> getH5Items() {
            return this.h5_items;
        }

        public Optional<DictionaryItemType> getH5ItemsType() {
            return this.h5_items_type;
        }

        public Optional<List<DictionarySimpleProperty>> getMultiProperties() {
            return this.multi_properties;
        }

        public Optional<DictionaryPropertyEvent> getPropertyEvent() {
            return this.property_event;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public String getTitle() {
            return this.title;
        }

        public DictionaryProperty setH5ClassfiyItems(List<List<H5WordItem>> list) {
            this.h5_classfiy_items = Optional.e(list);
            return this;
        }

        public DictionaryProperty setH5Items(List<H5WordItem> list) {
            this.h5_items = Optional.e(list);
            return this;
        }

        public DictionaryProperty setH5ItemsType(DictionaryItemType dictionaryItemType) {
            this.h5_items_type = Optional.e(dictionaryItemType);
            return this;
        }

        public DictionaryProperty setMultiProperties(List<DictionarySimpleProperty> list) {
            this.multi_properties = Optional.e(list);
            return this;
        }

        public DictionaryProperty setPropertyEvent(DictionaryPropertyEvent dictionaryPropertyEvent) {
            this.property_event = Optional.e(dictionaryPropertyEvent);
            return this;
        }

        @Required
        public DictionaryProperty setText(String str) {
            this.text = str;
            return this;
        }

        @Required
        public DictionaryProperty setTitle(String str) {
            this.title = str;
            return this;
        }

        public DictionaryProperty(String str, String str2) {
            this.title = str;
            this.text = str2;
        }
    }

    public static class H5TranslationV2 {

        @Required
        private String dest_language;

        @Required
        private String src_language;

        @Required
        private String src_text;
        private Optional<Boolean> open_mic = Optional.a();
        private Optional<SynonymCard> synonym_card = Optional.a();
        private Optional<PartSimple> part_simple = Optional.a();
        private Optional<WordDetail> word_detail = Optional.a();
        private Optional<H5Translation> word_simple = Optional.a();

        public H5TranslationV2() {
        }

        @Required
        public String getDestLanguage() {
            return this.dest_language;
        }

        public Optional<PartSimple> getPartSimple() {
            return this.part_simple;
        }

        @Required
        public String getSrcLanguage() {
            return this.src_language;
        }

        @Required
        public String getSrcText() {
            return this.src_text;
        }

        public Optional<SynonymCard> getSynonymCard() {
            return this.synonym_card;
        }

        public Optional<WordDetail> getWordDetail() {
            return this.word_detail;
        }

        public Optional<H5Translation> getWordSimple() {
            return this.word_simple;
        }

        public Optional<Boolean> isOpenMic() {
            return this.open_mic;
        }

        @Required
        public H5TranslationV2 setDestLanguage(String str) {
            this.dest_language = str;
            return this;
        }

        public H5TranslationV2 setOpenMic(boolean z) {
            this.open_mic = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public H5TranslationV2 setPartSimple(PartSimple partSimple) {
            this.part_simple = Optional.e(partSimple);
            return this;
        }

        @Required
        public H5TranslationV2 setSrcLanguage(String str) {
            this.src_language = str;
            return this;
        }

        @Required
        public H5TranslationV2 setSrcText(String str) {
            this.src_text = str;
            return this;
        }

        public H5TranslationV2 setSynonymCard(SynonymCard synonymCard) {
            this.synonym_card = Optional.e(synonymCard);
            return this;
        }

        public H5TranslationV2 setWordDetail(WordDetail wordDetail) {
            this.word_detail = Optional.e(wordDetail);
            return this;
        }

        public H5TranslationV2 setWordSimple(H5Translation h5Translation) {
            this.word_simple = Optional.e(h5Translation);
            return this;
        }

        public H5TranslationV2(String str, String str2, String str3) {
            this.src_language = str;
            this.src_text = str2;
            this.dest_language = str3;
        }
    }

    public static class H5Station {

        @Required
        private StationPageType page_type;
        private Optional<StationResourceType> resource_type = Optional.a();
        private Optional<List<CardGuideInfo>> card_guide_info = Optional.a();
        private Optional<List<StationInfo>> stations = Optional.a();
        private Optional<List<StationRadioInfo>> radios = Optional.a();
        private Optional<List<Template.AppEntity>> app_ads_info = Optional.a();
        private Optional<Boolean> auto_play = Optional.a();

        public H5Station() {
        }

        public Optional<List<Template.AppEntity>> getAppAdsInfo() {
            return this.app_ads_info;
        }

        public Optional<List<CardGuideInfo>> getCardGuideInfo() {
            return this.card_guide_info;
        }

        @Required
        public StationPageType getPageType() {
            return this.page_type;
        }

        public Optional<List<StationRadioInfo>> getRadios() {
            return this.radios;
        }

        public Optional<StationResourceType> getResourceType() {
            return this.resource_type;
        }

        public Optional<List<StationInfo>> getStations() {
            return this.stations;
        }

        public Optional<Boolean> isAutoPlay() {
            return this.auto_play;
        }

        public H5Station setAppAdsInfo(List<Template.AppEntity> list) {
            this.app_ads_info = Optional.e(list);
            return this;
        }

        public H5Station setAutoPlay(boolean z) {
            this.auto_play = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public H5Station setCardGuideInfo(List<CardGuideInfo> list) {
            this.card_guide_info = Optional.e(list);
            return this;
        }

        @Required
        public H5Station setPageType(StationPageType stationPageType) {
            this.page_type = stationPageType;
            return this;
        }

        public H5Station setRadios(List<StationRadioInfo> list) {
            this.radios = Optional.e(list);
            return this;
        }

        public H5Station setResourceType(StationResourceType stationResourceType) {
            this.resource_type = Optional.e(stationResourceType);
            return this;
        }

        public H5Station setStations(List<StationInfo> list) {
            this.stations = Optional.e(list);
            return this;
        }

        public H5Station(StationPageType stationPageType) {
            this.page_type = stationPageType;
        }
    }

    public static class PrivacyAuthCardItem {

        @Required
        private Template.Title title;

        @Required
        private PrivacyAuthCardType type;
        private Optional<Image> title_icon = Optional.a();
        private Optional<String> description = Optional.a();
        private Optional<List<String>> text = Optional.a();
        private Optional<CardTextType> text_type = Optional.a();
        private Optional<Template.CustomBackground> background = Optional.a();
        private Optional<Image> card_icon = Optional.a();

        public PrivacyAuthCardItem() {
        }

        public Optional<Template.CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<Image> getCardIcon() {
            return this.card_icon;
        }

        public Optional<String> getDescription() {
            return this.description;
        }

        public Optional<List<String>> getText() {
            return this.text;
        }

        public Optional<CardTextType> getTextType() {
            return this.text_type;
        }

        @Required
        public Template.Title getTitle() {
            return this.title;
        }

        public Optional<Image> getTitleIcon() {
            return this.title_icon;
        }

        @Required
        public PrivacyAuthCardType getType() {
            return this.type;
        }

        public PrivacyAuthCardItem setBackground(Template.CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public PrivacyAuthCardItem setCardIcon(Image image) {
            this.card_icon = Optional.e(image);
            return this;
        }

        public PrivacyAuthCardItem setDescription(String str) {
            this.description = Optional.e(str);
            return this;
        }

        public PrivacyAuthCardItem setText(List<String> list) {
            this.text = Optional.e(list);
            return this;
        }

        public PrivacyAuthCardItem setTextType(CardTextType cardTextType) {
            this.text_type = Optional.e(cardTextType);
            return this;
        }

        @Required
        public PrivacyAuthCardItem setTitle(Template.Title title) {
            this.title = title;
            return this;
        }

        public PrivacyAuthCardItem setTitleIcon(Image image) {
            this.title_icon = Optional.e(image);
            return this;
        }

        @Required
        public PrivacyAuthCardItem setType(PrivacyAuthCardType privacyAuthCardType) {
            this.type = privacyAuthCardType;
            return this;
        }

        public PrivacyAuthCardItem(PrivacyAuthCardType privacyAuthCardType, Template.Title title) {
            this.type = privacyAuthCardType;
            this.title = title;
        }
    }

    public static class WeatherFragmentData {

        @Required
        private WeatherFragmentDataType type;
        private Optional<Template.Title> title = Optional.a();
        private Optional<Template.WeatherItem> single_day_weather = Optional.a();
        private Optional<List<Template.WeatherItem>> multi_weather_items = Optional.a();
        private Optional<List<WeatherAlert>> alerts = Optional.a();
        private Optional<List<WeatherIndex>> indices = Optional.a();
        private Optional<Integer> offset = Optional.a();
        private Optional<Template.Launcher> launcher = Optional.a();

        public WeatherFragmentData() {
        }

        public Optional<List<WeatherAlert>> getAlerts() {
            return this.alerts;
        }

        public Optional<List<WeatherIndex>> getIndices() {
            return this.indices;
        }

        public Optional<Template.Launcher> getLauncher() {
            return this.launcher;
        }

        public Optional<List<Template.WeatherItem>> getMultiWeatherItems() {
            return this.multi_weather_items;
        }

        public Optional<Integer> getOffset() {
            return this.offset;
        }

        public Optional<Template.WeatherItem> getSingleDayWeather() {
            return this.single_day_weather;
        }

        public Optional<Template.Title> getTitle() {
            return this.title;
        }

        @Required
        public WeatherFragmentDataType getType() {
            return this.type;
        }

        public WeatherFragmentData setAlerts(List<WeatherAlert> list) {
            this.alerts = Optional.e(list);
            return this;
        }

        public WeatherFragmentData setIndices(List<WeatherIndex> list) {
            this.indices = Optional.e(list);
            return this;
        }

        public WeatherFragmentData setLauncher(Template.Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        public WeatherFragmentData setMultiWeatherItems(List<Template.WeatherItem> list) {
            this.multi_weather_items = Optional.e(list);
            return this;
        }

        public WeatherFragmentData setOffset(int i) {
            this.offset = Optional.e(Integer.valueOf(i));
            return this;
        }

        public WeatherFragmentData setSingleDayWeather(Template.WeatherItem weatherItem) {
            this.single_day_weather = Optional.e(weatherItem);
            return this;
        }

        public WeatherFragmentData setTitle(Template.Title title) {
            this.title = Optional.e(title);
            return this;
        }

        @Required
        public WeatherFragmentData setType(WeatherFragmentDataType weatherFragmentDataType) {
            this.type = weatherFragmentDataType;
            return this;
        }

        public WeatherFragmentData(WeatherFragmentDataType weatherFragmentDataType) {
            this.type = weatherFragmentDataType;
        }
    }

    public static class H5DictionaryTarget {

        @Required
        private DictionaryTargetType h5_dictionary_type;

        @Required
        private String name;
        private Optional<String> id = Optional.a();
        private Optional<List<DictionaryWord>> words = Optional.a();
        private Optional<List<DictionaryAudioInfo>> audio_infos = Optional.a();
        private Optional<List<List<Template.Image>>> strokes = Optional.a();
        private Optional<List<DictionarySimpleProperty>> simple_properties = Optional.a();
        private Optional<List<DictionaryProperty>> properties = Optional.a();
        private Optional<List<H5WordItem>> homophones = Optional.a();
        private Optional<DictionaryPropertyType> type = Optional.a();

        public H5DictionaryTarget() {
        }

        public Optional<List<DictionaryAudioInfo>> getAudioInfos() {
            return this.audio_infos;
        }

        @Required
        public DictionaryTargetType getH5DictionaryType() {
            return this.h5_dictionary_type;
        }

        public Optional<List<H5WordItem>> getHomophones() {
            return this.homophones;
        }

        public Optional<String> getId() {
            return this.id;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<List<DictionaryProperty>> getProperties() {
            return this.properties;
        }

        public Optional<List<DictionarySimpleProperty>> getSimpleProperties() {
            return this.simple_properties;
        }

        public Optional<List<List<Template.Image>>> getStrokes() {
            return this.strokes;
        }

        public Optional<DictionaryPropertyType> getType() {
            return this.type;
        }

        public Optional<List<DictionaryWord>> getWords() {
            return this.words;
        }

        public H5DictionaryTarget setAudioInfos(List<DictionaryAudioInfo> list) {
            this.audio_infos = Optional.e(list);
            return this;
        }

        @Required
        public H5DictionaryTarget setH5DictionaryType(DictionaryTargetType dictionaryTargetType) {
            this.h5_dictionary_type = dictionaryTargetType;
            return this;
        }

        public H5DictionaryTarget setHomophones(List<H5WordItem> list) {
            this.homophones = Optional.e(list);
            return this;
        }

        public H5DictionaryTarget setId(String str) {
            this.id = Optional.e(str);
            return this;
        }

        @Required
        public H5DictionaryTarget setName(String str) {
            this.name = str;
            return this;
        }

        public H5DictionaryTarget setProperties(List<DictionaryProperty> list) {
            this.properties = Optional.e(list);
            return this;
        }

        public H5DictionaryTarget setSimpleProperties(List<DictionarySimpleProperty> list) {
            this.simple_properties = Optional.e(list);
            return this;
        }

        public H5DictionaryTarget setStrokes(List<List<Template.Image>> list) {
            this.strokes = Optional.e(list);
            return this;
        }

        public H5DictionaryTarget setType(DictionaryPropertyType dictionaryPropertyType) {
            this.type = Optional.e(dictionaryPropertyType);
            return this;
        }

        public H5DictionaryTarget setWords(List<DictionaryWord> list) {
            this.words = Optional.e(list);
            return this;
        }

        public H5DictionaryTarget(String str, DictionaryTargetType dictionaryTargetType) {
            this.name = str;
            this.h5_dictionary_type = dictionaryTargetType;
        }
    }

    public static class H5Dictionary {

        @Required
        private List<DictionaryAudioInfo> audio_infos;

        @Required
        private String name;

        @Required
        private List<DictionaryProperty> properties;

        @Required
        private List<DictionarySimpleProperty> simple_properties;

        @Required
        private List<DictionaryWord> words;
        private Optional<List<H5WordItem>> homophones = Optional.a();
        private Optional<String> id = Optional.a();
        private Optional<DictionaryPropertyType> type = Optional.a();
        private Optional<List<List<Template.Image>>> strokes = Optional.a();
        private Optional<String> property_name = Optional.a();
        private Optional<Template.VideoSnapshot> video_snapshot = Optional.a();
        private Optional<Template.Launcher> launcher = Optional.a();
        private Optional<DictionaryWordSourceType> source_type = Optional.a();
        private Optional<DictionaryWordCardType> card_type = Optional.a();

        public H5Dictionary() {
        }

        @Required
        public List<DictionaryAudioInfo> getAudioInfos() {
            return this.audio_infos;
        }

        public Optional<DictionaryWordCardType> getCardType() {
            return this.card_type;
        }

        public Optional<List<H5WordItem>> getHomophones() {
            return this.homophones;
        }

        public Optional<String> getId() {
            return this.id;
        }

        public Optional<Template.Launcher> getLauncher() {
            return this.launcher;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public List<DictionaryProperty> getProperties() {
            return this.properties;
        }

        public Optional<String> getPropertyName() {
            return this.property_name;
        }

        @Required
        public List<DictionarySimpleProperty> getSimpleProperties() {
            return this.simple_properties;
        }

        public Optional<DictionaryWordSourceType> getSourceType() {
            return this.source_type;
        }

        public Optional<List<List<Template.Image>>> getStrokes() {
            return this.strokes;
        }

        public Optional<DictionaryPropertyType> getType() {
            return this.type;
        }

        public Optional<Template.VideoSnapshot> getVideoSnapshot() {
            return this.video_snapshot;
        }

        @Required
        public List<DictionaryWord> getWords() {
            return this.words;
        }

        @Required
        public H5Dictionary setAudioInfos(List<DictionaryAudioInfo> list) {
            this.audio_infos = list;
            return this;
        }

        public H5Dictionary setCardType(DictionaryWordCardType dictionaryWordCardType) {
            this.card_type = Optional.e(dictionaryWordCardType);
            return this;
        }

        public H5Dictionary setHomophones(List<H5WordItem> list) {
            this.homophones = Optional.e(list);
            return this;
        }

        public H5Dictionary setId(String str) {
            this.id = Optional.e(str);
            return this;
        }

        public H5Dictionary setLauncher(Template.Launcher launcher) {
            this.launcher = Optional.e(launcher);
            return this;
        }

        @Required
        public H5Dictionary setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public H5Dictionary setProperties(List<DictionaryProperty> list) {
            this.properties = list;
            return this;
        }

        public H5Dictionary setPropertyName(String str) {
            this.property_name = Optional.e(str);
            return this;
        }

        @Required
        public H5Dictionary setSimpleProperties(List<DictionarySimpleProperty> list) {
            this.simple_properties = list;
            return this;
        }

        public H5Dictionary setSourceType(DictionaryWordSourceType dictionaryWordSourceType) {
            this.source_type = Optional.e(dictionaryWordSourceType);
            return this;
        }

        public H5Dictionary setStrokes(List<List<Template.Image>> list) {
            this.strokes = Optional.e(list);
            return this;
        }

        public H5Dictionary setType(DictionaryPropertyType dictionaryPropertyType) {
            this.type = Optional.e(dictionaryPropertyType);
            return this;
        }

        public H5Dictionary setVideoSnapshot(Template.VideoSnapshot videoSnapshot) {
            this.video_snapshot = Optional.e(videoSnapshot);
            return this;
        }

        @Required
        public H5Dictionary setWords(List<DictionaryWord> list) {
            this.words = list;
            return this;
        }

        public H5Dictionary(String str, List<DictionaryWord> list, List<DictionaryAudioInfo> list2, List<DictionarySimpleProperty> list3, List<DictionaryProperty> list4) {
            this.name = str;
            this.words = list;
            this.audio_infos = list2;
            this.simple_properties = list3;
            this.properties = list4;
        }
    }

    public static class H5TranslationV3 {

        @Required
        private String dest_language;

        @Required
        private String src_language;

        @Required
        private String src_text;
        private Optional<String> dest_text = Optional.a();
        private Optional<String> dest_text_audio_url = Optional.a();
        private Optional<Boolean> open_mic = Optional.a();
        private Optional<String> word_meaning = Optional.a();
        private Optional<String> ph_symbol = Optional.a();
        private Optional<SynonymCard> synonym_card = Optional.a();
        private Optional<PartSimple> part_simple = Optional.a();
        private Optional<WordDetail> word_detail = Optional.a();
        private Optional<H5Translation> word_simple = Optional.a();

        public H5TranslationV3() {
        }

        @Required
        public String getDestLanguage() {
            return this.dest_language;
        }

        public Optional<String> getDestText() {
            return this.dest_text;
        }

        public Optional<String> getDestTextAudioUrl() {
            return this.dest_text_audio_url;
        }

        public Optional<PartSimple> getPartSimple() {
            return this.part_simple;
        }

        public Optional<String> getPhSymbol() {
            return this.ph_symbol;
        }

        @Required
        public String getSrcLanguage() {
            return this.src_language;
        }

        @Required
        public String getSrcText() {
            return this.src_text;
        }

        public Optional<SynonymCard> getSynonymCard() {
            return this.synonym_card;
        }

        public Optional<WordDetail> getWordDetail() {
            return this.word_detail;
        }

        public Optional<String> getWordMeaning() {
            return this.word_meaning;
        }

        public Optional<H5Translation> getWordSimple() {
            return this.word_simple;
        }

        public Optional<Boolean> isOpenMic() {
            return this.open_mic;
        }

        @Required
        public H5TranslationV3 setDestLanguage(String str) {
            this.dest_language = str;
            return this;
        }

        public H5TranslationV3 setDestText(String str) {
            this.dest_text = Optional.e(str);
            return this;
        }

        public H5TranslationV3 setDestTextAudioUrl(String str) {
            this.dest_text_audio_url = Optional.e(str);
            return this;
        }

        public H5TranslationV3 setOpenMic(boolean z) {
            this.open_mic = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public H5TranslationV3 setPartSimple(PartSimple partSimple) {
            this.part_simple = Optional.e(partSimple);
            return this;
        }

        public H5TranslationV3 setPhSymbol(String str) {
            this.ph_symbol = Optional.e(str);
            return this;
        }

        @Required
        public H5TranslationV3 setSrcLanguage(String str) {
            this.src_language = str;
            return this;
        }

        @Required
        public H5TranslationV3 setSrcText(String str) {
            this.src_text = str;
            return this;
        }

        public H5TranslationV3 setSynonymCard(SynonymCard synonymCard) {
            this.synonym_card = Optional.e(synonymCard);
            return this;
        }

        public H5TranslationV3 setWordDetail(WordDetail wordDetail) {
            this.word_detail = Optional.e(wordDetail);
            return this;
        }

        public H5TranslationV3 setWordMeaning(String str) {
            this.word_meaning = Optional.e(str);
            return this;
        }

        public H5TranslationV3 setWordSimple(H5Translation h5Translation) {
            this.word_simple = Optional.e(h5Translation);
            return this;
        }

        public H5TranslationV3(String str, String str2, String str3) {
            this.src_language = str;
            this.src_text = str2;
            this.dest_language = str3;
        }
    }

    public static class RecipeDetail {

        @Required
        private String name;
        private Optional<String> img_url = Optional.a();
        private Optional<String> practice = Optional.a();
        private Optional<List<String>> practice_list = Optional.a();
        private Optional<String> skill = Optional.a();
        private Optional<String> material = Optional.a();
        private Optional<String> difficult = Optional.a();
        private Optional<String> cookTime = Optional.a();
        private Optional<String> cuisine = Optional.a();
        private Optional<List<RecipeSuggest>> recipeSuggest = Optional.a();

        public RecipeDetail() {
        }

        public Optional<String> getCookTime() {
            return this.cookTime;
        }

        public Optional<String> getCuisine() {
            return this.cuisine;
        }

        public Optional<String> getDifficult() {
            return this.difficult;
        }

        public Optional<String> getImgUrl() {
            return this.img_url;
        }

        public Optional<String> getMaterial() {
            return this.material;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<String> getPractice() {
            return this.practice;
        }

        public Optional<List<String>> getPracticeList() {
            return this.practice_list;
        }

        public Optional<List<RecipeSuggest>> getRecipeSuggest() {
            return this.recipeSuggest;
        }

        public Optional<String> getSkill() {
            return this.skill;
        }

        public RecipeDetail setCookTime(String str) {
            this.cookTime = Optional.e(str);
            return this;
        }

        public RecipeDetail setCuisine(String str) {
            this.cuisine = Optional.e(str);
            return this;
        }

        public RecipeDetail setDifficult(String str) {
            this.difficult = Optional.e(str);
            return this;
        }

        public RecipeDetail setImgUrl(String str) {
            this.img_url = Optional.e(str);
            return this;
        }

        public RecipeDetail setMaterial(String str) {
            this.material = Optional.e(str);
            return this;
        }

        @Required
        public RecipeDetail setName(String str) {
            this.name = str;
            return this;
        }

        public RecipeDetail setPractice(String str) {
            this.practice = Optional.e(str);
            return this;
        }

        public RecipeDetail setPracticeList(List<String> list) {
            this.practice_list = Optional.e(list);
            return this;
        }

        public RecipeDetail setRecipeSuggest(List<RecipeSuggest> list) {
            this.recipeSuggest = Optional.e(list);
            return this;
        }

        public RecipeDetail setSkill(String str) {
            this.skill = Optional.e(str);
            return this;
        }

        public RecipeDetail(String str) {
            this.name = str;
        }
    }

    public static class StationCardHead {

        @Required
        private String name;
        private Optional<String> cover_url = Optional.a();
        private Optional<String> introduction = Optional.a();
        private Optional<Long> play_count = Optional.a();
        private Optional<Integer> rank = Optional.a();
        private Optional<String> broadcaster = Optional.a();
        private Optional<String> update_time = Optional.a();
        private Optional<Common.PaymentType> payment_type = Optional.a();
        private Optional<String> live_radio = Optional.a();
        private Optional<CPInfo> cp_app_info = Optional.a();
        private Optional<String> category = Optional.a();
        private Optional<String> artist = Optional.a();

        public StationCardHead() {
        }

        public Optional<String> getArtist() {
            return this.artist;
        }

        public Optional<String> getBroadcaster() {
            return this.broadcaster;
        }

        public Optional<String> getCategory() {
            return this.category;
        }

        public Optional<String> getCoverUrl() {
            return this.cover_url;
        }

        public Optional<CPInfo> getCpAppInfo() {
            return this.cp_app_info;
        }

        public Optional<String> getIntroduction() {
            return this.introduction;
        }

        public Optional<String> getLiveRadio() {
            return this.live_radio;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<Common.PaymentType> getPaymentType() {
            return this.payment_type;
        }

        public Optional<Long> getPlayCount() {
            return this.play_count;
        }

        public Optional<Integer> getRank() {
            return this.rank;
        }

        public Optional<String> getUpdateTime() {
            return this.update_time;
        }

        public StationCardHead setArtist(String str) {
            this.artist = Optional.e(str);
            return this;
        }

        public StationCardHead setBroadcaster(String str) {
            this.broadcaster = Optional.e(str);
            return this;
        }

        public StationCardHead setCategory(String str) {
            this.category = Optional.e(str);
            return this;
        }

        public StationCardHead setCoverUrl(String str) {
            this.cover_url = Optional.e(str);
            return this;
        }

        public StationCardHead setCpAppInfo(CPInfo cPInfo) {
            this.cp_app_info = Optional.e(cPInfo);
            return this;
        }

        public StationCardHead setIntroduction(String str) {
            this.introduction = Optional.e(str);
            return this;
        }

        public StationCardHead setLiveRadio(String str) {
            this.live_radio = Optional.e(str);
            return this;
        }

        @Required
        public StationCardHead setName(String str) {
            this.name = str;
            return this;
        }

        public StationCardHead setPaymentType(Common.PaymentType paymentType) {
            this.payment_type = Optional.e(paymentType);
            return this;
        }

        public StationCardHead setPlayCount(long j) {
            this.play_count = Optional.e(Long.valueOf(j));
            return this;
        }

        public StationCardHead setRank(int i) {
            this.rank = Optional.e(Integer.valueOf(i));
            return this;
        }

        public StationCardHead setUpdateTime(String str) {
            this.update_time = Optional.e(str);
            return this;
        }

        public StationCardHead(String str) {
            this.name = str;
        }
    }

    @NamespaceName(name = "StreamDialog", namespace = AIApiConstants.FullScreenTemplate.NAME)
    public static class StreamDialog implements InstructionPayload {

        @Required
        private Image icon;
        private Optional<String> welcome = Optional.a();
        private Optional<StreamDialogAvatar> avatar = Optional.a();
        private Optional<List<String>> suggests = Optional.a();
        private Optional<Template.CustomBackground> background = Optional.a();
        private Optional<Boolean> is_hide_dialog_avatar = Optional.a();
        private Optional<StreamDialogType> type = Optional.a();
        private Optional<String> name = Optional.a();
        private Optional<String> description = Optional.a();
        private Optional<Internal.SpeechTTSConfig> tts = Optional.a();
        private Optional<Boolean> is_hide_icon = Optional.a();
        private Optional<String> dialog_history_id = Optional.a();

        public StreamDialog() {
        }

        public Optional<StreamDialogAvatar> getAvatar() {
            return this.avatar;
        }

        public Optional<Template.CustomBackground> getBackground() {
            return this.background;
        }

        public Optional<String> getDescription() {
            return this.description;
        }

        public Optional<String> getDialogHistoryId() {
            return this.dialog_history_id;
        }

        @Required
        public Image getIcon() {
            return this.icon;
        }

        public Optional<String> getName() {
            return this.name;
        }

        public Optional<List<String>> getSuggests() {
            return this.suggests;
        }

        public Optional<Internal.SpeechTTSConfig> getTts() {
            return this.tts;
        }

        public Optional<StreamDialogType> getType() {
            return this.type;
        }

        public Optional<String> getWelcome() {
            return this.welcome;
        }

        public Optional<Boolean> isHideDialogAvatar() {
            return this.is_hide_dialog_avatar;
        }

        public Optional<Boolean> isHideIcon() {
            return this.is_hide_icon;
        }

        public StreamDialog setAvatar(StreamDialogAvatar streamDialogAvatar) {
            this.avatar = Optional.e(streamDialogAvatar);
            return this;
        }

        public StreamDialog setBackground(Template.CustomBackground customBackground) {
            this.background = Optional.e(customBackground);
            return this;
        }

        public StreamDialog setDescription(String str) {
            this.description = Optional.e(str);
            return this;
        }

        public StreamDialog setDialogHistoryId(String str) {
            this.dialog_history_id = Optional.e(str);
            return this;
        }

        @Required
        public StreamDialog setIcon(Image image) {
            this.icon = image;
            return this;
        }

        public StreamDialog setIsHideDialogAvatar(boolean z) {
            this.is_hide_dialog_avatar = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public StreamDialog setIsHideIcon(boolean z) {
            this.is_hide_icon = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public StreamDialog setName(String str) {
            this.name = Optional.e(str);
            return this;
        }

        public StreamDialog setSuggests(List<String> list) {
            this.suggests = Optional.e(list);
            return this;
        }

        public StreamDialog setTts(Internal.SpeechTTSConfig speechTTSConfig) {
            this.tts = Optional.e(speechTTSConfig);
            return this;
        }

        public StreamDialog setType(StreamDialogType streamDialogType) {
            this.type = Optional.e(streamDialogType);
            return this;
        }

        public StreamDialog setWelcome(String str) {
            this.welcome = Optional.e(str);
            return this;
        }

        public StreamDialog(Image image) {
            this.icon = image;
        }
    }
}
