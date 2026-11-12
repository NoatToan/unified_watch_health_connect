package com.xiaomi.ai.api;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class FullScreenTemplate {

    public static class Animation {

        @Required
        private String audio;

        @Required
        private String text;

        @Required
        private String url;
        private Optional<String> name = Optional.empty();
        private Optional<Long> version = Optional.empty();
        private Optional<Long> duration = Optional.empty();

        public Animation() {
        }

        public Animation(String str, String str2, String str3) {
            this.url = str;
            this.audio = str2;
            this.text = str3;
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
            this.duration = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public Animation setName(String str) {
            this.name = Optional.ofNullable(str);
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
            this.version = Optional.ofNullable(Long.valueOf(j));
            return this;
        }
    }

    public static class ArtistInfo {
        private Optional<String> name = Optional.empty();
        private Optional<String> character = Optional.empty();
        private Optional<Image> image = Optional.empty();

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
            this.character = Optional.ofNullable(str);
            return this;
        }

        public ArtistInfo setImage(Image image) {
            this.image = Optional.ofNullable(image);
            return this;
        }

        public ArtistInfo setName(String str) {
            this.name = Optional.ofNullable(str);
            return this;
        }
    }

    public static class CPInfo {
        private Optional<String> key = Optional.empty();
        private Optional<String> name = Optional.empty();
        private Optional<Image> icon = Optional.empty();
        private Optional<String> package_name = Optional.empty();
        private Optional<String> version = Optional.empty();

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
            this.icon = Optional.ofNullable(image);
            return this;
        }

        public CPInfo setKey(String str) {
            this.key = Optional.ofNullable(str);
            return this;
        }

        public CPInfo setName(String str) {
            this.name = Optional.ofNullable(str);
            return this;
        }

        public CPInfo setPackageName(String str) {
            this.package_name = Optional.ofNullable(str);
            return this;
        }

        public CPInfo setVersion(String str) {
            this.version = Optional.ofNullable(str);
            return this;
        }
    }

    public static class CardGuideInfo {
        private Optional<Integer> position = Optional.empty();
        private Optional<String> name = Optional.empty();
        private Optional<String> request_query = Optional.empty();

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
            this.name = Optional.ofNullable(str);
            return this;
        }

        public CardGuideInfo setPosition(int i) {
            this.position = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public CardGuideInfo setRequestQuery(String str) {
            this.request_query = Optional.ofNullable(str);
            return this;
        }
    }

    public static class CinemaInfo {
        private Optional<Integer> rank = Optional.empty();
        private Optional<List<Template.Launcher>> buy_launcher = Optional.empty();
        private Optional<List<Template.Launcher>> play_launcher = Optional.empty();

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
            this.buy_launcher = Optional.ofNullable(list);
            return this;
        }

        public CinemaInfo setPlayLauncher(List<Template.Launcher> list) {
            this.play_launcher = Optional.ofNullable(list);
            return this;
        }

        public CinemaInfo setRank(int i) {
            this.rank = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }
    }

    public enum CompositionContentType {
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

    public static class CpLauncher {
        private Optional<String> key = Optional.empty();
        private Optional<String> url = Optional.empty();

        public Optional<String> getKey() {
            return this.key;
        }

        public Optional<String> getUrl() {
            return this.url;
        }

        public CpLauncher setKey(String str) {
            this.key = Optional.ofNullable(str);
            return this;
        }

        public CpLauncher setUrl(String str) {
            this.url = Optional.ofNullable(str);
            return this;
        }
    }

    public static class Dialog {

        @Required
        private List<Message> messages;
        private Optional<String> background_image = Optional.empty();
        private Optional<String> query = Optional.empty();
        private Optional<Boolean> open_mic = Optional.empty();
        private Optional<Template.CustomBackground> background = Optional.empty();

        public Dialog() {
        }

        public Dialog(List<Message> list) {
            this.messages = list;
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
            this.background = Optional.ofNullable(customBackground);
            return this;
        }

        public Dialog setBackgroundImage(String str) {
            this.background_image = Optional.ofNullable(str);
            return this;
        }

        @Required
        public Dialog setMessages(List<Message> list) {
            this.messages = list;
            return this;
        }

        public Dialog setOpenMic(boolean z) {
            this.open_mic = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public Dialog setQuery(String str) {
            this.query = Optional.ofNullable(str);
            return this;
        }
    }

    @NamespaceName(name = "Dialogue", namespace = AIApiConstants.FullScreenTemplate.NAME)
    public static class Dialogue implements InstructionPayload {

        @Required
        private Dialog data;
        private Optional<Template.Task> task = Optional.empty();

        public Dialogue() {
        }

        public Dialogue(Dialog dialog) {
            this.data = dialog;
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
            this.task = Optional.ofNullable(task);
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

    public static class DictionaryItem {

        @Required
        private Template.Title title;
        private Optional<String> text = Optional.empty();
        private Optional<Template.Image> icon = Optional.empty();

        public DictionaryItem() {
        }

        public DictionaryItem(Template.Title title) {
            this.title = title;
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
            this.icon = Optional.ofNullable(image);
            return this;
        }

        public DictionaryItem setText(String str) {
            this.text = Optional.ofNullable(str);
            return this;
        }

        @Required
        public DictionaryItem setTitle(Template.Title title) {
            this.title = title;
            return this;
        }
    }

    public enum DictionaryItemType {
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

    public static class DictionaryProperty {
        private Optional<List<H5WordItem>> h5_items = Optional.empty();
        private Optional<DictionaryItemType> h5_items_type = Optional.empty();
        private Optional<List<DictionarySimpleProperty>> multi_properties = Optional.empty();

        @Required
        private String text;

        @Required
        private String title;

        public DictionaryProperty() {
        }

        public DictionaryProperty(String str, String str2) {
            this.title = str;
            this.text = str2;
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

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public String getTitle() {
            return this.title;
        }

        public DictionaryProperty setH5Items(List<H5WordItem> list) {
            this.h5_items = Optional.ofNullable(list);
            return this;
        }

        public DictionaryProperty setH5ItemsType(DictionaryItemType dictionaryItemType) {
            this.h5_items_type = Optional.ofNullable(dictionaryItemType);
            return this;
        }

        public DictionaryProperty setMultiProperties(List<DictionarySimpleProperty> list) {
            this.multi_properties = Optional.ofNullable(list);
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
    }

    public enum DictionaryPropertyType {
        PHRASE(0),
        WORD_SIMPLE(1),
        WORD(2);

        private int id;

        DictionaryPropertyType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class DictionarySimpleProperty {
        private Optional<List<H5WordItem>> h5_items = Optional.empty();
        private Optional<DictionaryItemType> h5_items_type = Optional.empty();

        @Required
        private String text;

        @Required
        private String title;

        public DictionarySimpleProperty() {
        }

        public DictionarySimpleProperty(String str, String str2) {
            this.title = str;
            this.text = str2;
        }

        public Optional<List<H5WordItem>> getH5Items() {
            return this.h5_items;
        }

        public Optional<DictionaryItemType> getH5ItemsType() {
            return this.h5_items_type;
        }

        @Required
        public String getText() {
            return this.text;
        }

        @Required
        public String getTitle() {
            return this.title;
        }

        public DictionarySimpleProperty setH5Items(List<H5WordItem> list) {
            this.h5_items = Optional.ofNullable(list);
            return this;
        }

        public DictionarySimpleProperty setH5ItemsType(DictionaryItemType dictionaryItemType) {
            this.h5_items_type = Optional.ofNullable(dictionaryItemType);
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
    }

    public static class DictionaryWord {

        @Required
        private String text;
        private Optional<String> pinyin = Optional.empty();
        private Optional<Template.Image> image = Optional.empty();

        public DictionaryWord() {
        }

        public DictionaryWord(String str) {
            this.text = str;
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
            this.image = Optional.ofNullable(image);
            return this;
        }

        public DictionaryWord setPinyin(String str) {
            this.pinyin = Optional.ofNullable(str);
            return this;
        }

        @Required
        public DictionaryWord setText(String str) {
            this.text = str;
            return this;
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
        private Optional<Template.Title> title = Optional.empty();
        private Optional<String> app_url_identity = Optional.empty();
        private Optional<String> h5_url_identity = Optional.empty();

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
            this.app_url_identity = Optional.ofNullable(str);
            return this;
        }

        public EpisodeDetail setH5UrlIdentity(String str) {
            this.h5_url_identity = Optional.ofNullable(str);
            return this;
        }

        public EpisodeDetail setTitle(Template.Title title) {
            this.title = Optional.ofNullable(title);
            return this;
        }
    }

    public static class EpisodeInfo {
        private Optional<Integer> season = Optional.empty();
        private Optional<Integer> total_episode = Optional.empty();
        private Optional<Integer> latest_episode = Optional.empty();
        private Optional<List<EpisodeInfoItem>> items = Optional.empty();

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
            this.items = Optional.ofNullable(list);
            return this;
        }

        public EpisodeInfo setLatestEpisode(int i) {
            this.latest_episode = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public EpisodeInfo setSeason(int i) {
            this.season = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public EpisodeInfo setTotalEpisode(int i) {
            this.total_episode = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }
    }

    public static class EpisodeInfoItem {
        private Optional<String> key = Optional.empty();
        private Optional<String> app_url_prev = Optional.empty();
        private Optional<String> app_url_suffix = Optional.empty();
        private Optional<String> H5_url_prev = Optional.empty();
        private Optional<String> H5_url_suffix = Optional.empty();
        private Optional<List<EpisodeDetail>> detail = Optional.empty();

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
            this.app_url_prev = Optional.ofNullable(str);
            return this;
        }

        public EpisodeInfoItem setAppUrlSuffix(String str) {
            this.app_url_suffix = Optional.ofNullable(str);
            return this;
        }

        public EpisodeInfoItem setDetail(List<EpisodeDetail> list) {
            this.detail = Optional.ofNullable(list);
            return this;
        }

        public EpisodeInfoItem setH5UrlPrev(String str) {
            this.H5_url_prev = Optional.ofNullable(str);
            return this;
        }

        public EpisodeInfoItem setH5UrlSuffix(String str) {
            this.H5_url_suffix = Optional.ofNullable(str);
            return this;
        }

        public EpisodeInfoItem setKey(String str) {
            this.key = Optional.ofNullable(str);
            return this;
        }
    }

    public static class ExampleSentence {
        private Optional<String> tts_url = Optional.empty();
        private Optional<String> en = Optional.empty();

        /* JADX INFO: renamed from: cn, reason: collision with root package name */
        private Optional<String> f215cn = Optional.empty();

        public Optional<String> getCn() {
            return this.f215cn;
        }

        public Optional<String> getEn() {
            return this.en;
        }

        public Optional<String> getTtsUrl() {
            return this.tts_url;
        }

        public ExampleSentence setCn(String str) {
            this.f215cn = Optional.ofNullable(str);
            return this;
        }

        public ExampleSentence setEn(String str) {
            this.en = Optional.ofNullable(str);
            return this;
        }

        public ExampleSentence setTtsUrl(String str) {
            this.tts_url = Optional.ofNullable(str);
            return this;
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
        private Optional<String> content = Optional.empty();
        private Optional<String> url = Optional.empty();

        public H5Composition() {
        }

        public H5Composition(String str, String str2, String str3, String str4, CompositionContentType compositionContentType) {
            this.name = str;
            this.grade = str2;
            this.word_count = str3;
            this.summary = str4;
            this.typ = compositionContentType;
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
            this.content = Optional.ofNullable(str);
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
            this.url = Optional.ofNullable(str);
            return this;
        }

        @Required
        public H5Composition setWordCount(String str) {
            this.word_count = str;
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

    public static class H5Dictionaries {

        @Required
        private List<H5Dictionary> dictionaries;

        public H5Dictionaries() {
        }

        public H5Dictionaries(List<H5Dictionary> list) {
            this.dictionaries = list;
        }

        @Required
        public List<H5Dictionary> getDictionaries() {
            return this.dictionaries;
        }

        @Required
        public H5Dictionaries setDictionaries(List<H5Dictionary> list) {
            this.dictionaries = list;
            return this;
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
        private Optional<List<H5WordItem>> homophones = Optional.empty();
        private Optional<String> id = Optional.empty();
        private Optional<DictionaryPropertyType> type = Optional.empty();

        public H5Dictionary() {
        }

        public H5Dictionary(String str, List<DictionaryWord> list, List<DictionaryAudioInfo> list2, List<DictionarySimpleProperty> list3, List<DictionaryProperty> list4) {
            this.name = str;
            this.words = list;
            this.audio_infos = list2;
            this.simple_properties = list3;
            this.properties = list4;
        }

        @Required
        public List<DictionaryAudioInfo> getAudioInfos() {
            return this.audio_infos;
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

        @Required
        public List<DictionaryProperty> getProperties() {
            return this.properties;
        }

        @Required
        public List<DictionarySimpleProperty> getSimpleProperties() {
            return this.simple_properties;
        }

        public Optional<DictionaryPropertyType> getType() {
            return this.type;
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

        public H5Dictionary setHomophones(List<H5WordItem> list) {
            this.homophones = Optional.ofNullable(list);
            return this;
        }

        public H5Dictionary setId(String str) {
            this.id = Optional.ofNullable(str);
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

        @Required
        public H5Dictionary setSimpleProperties(List<DictionarySimpleProperty> list) {
            this.simple_properties = list;
            return this;
        }

        public H5Dictionary setType(DictionaryPropertyType dictionaryPropertyType) {
            this.type = Optional.ofNullable(dictionaryPropertyType);
            return this;
        }

        @Required
        public H5Dictionary setWords(List<DictionaryWord> list) {
            this.words = list;
            return this;
        }
    }

    public static class H5Qabot {
        private Optional<QabotData> data = Optional.empty();
        private Optional<QabotCpSearchResult> cp_search_result = Optional.empty();

        public Optional<QabotCpSearchResult> getCpSearchResult() {
            return this.cp_search_result;
        }

        public Optional<QabotData> getData() {
            return this.data;
        }

        public H5Qabot setCpSearchResult(QabotCpSearchResult qabotCpSearchResult) {
            this.cp_search_result = Optional.ofNullable(qabotCpSearchResult);
            return this;
        }

        public H5Qabot setData(QabotData qabotData) {
            this.data = Optional.ofNullable(qabotData);
            return this;
        }
    }

    public static class H5Station {

        @Required
        private StationPageType page_type;
        private Optional<StationResourceType> resource_type = Optional.empty();
        private Optional<List<CardGuideInfo>> card_guide_info = Optional.empty();
        private Optional<List<StationInfo>> stations = Optional.empty();
        private Optional<List<StationRadioInfo>> radios = Optional.empty();
        private Optional<List<Template.AppEntity>> app_ads_info = Optional.empty();

        public H5Station() {
        }

        public H5Station(StationPageType stationPageType) {
            this.page_type = stationPageType;
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

        public H5Station setAppAdsInfo(List<Template.AppEntity> list) {
            this.app_ads_info = Optional.ofNullable(list);
            return this;
        }

        public H5Station setCardGuideInfo(List<CardGuideInfo> list) {
            this.card_guide_info = Optional.ofNullable(list);
            return this;
        }

        @Required
        public H5Station setPageType(StationPageType stationPageType) {
            this.page_type = stationPageType;
            return this;
        }

        public H5Station setRadios(List<StationRadioInfo> list) {
            this.radios = Optional.ofNullable(list);
            return this;
        }

        public H5Station setResourceType(StationResourceType stationResourceType) {
            this.resource_type = Optional.ofNullable(stationResourceType);
            return this;
        }

        public H5Station setStations(List<StationInfo> list) {
            this.stations = Optional.ofNullable(list);
            return this;
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
        private Optional<Boolean> open_mic = Optional.empty();
        private Optional<String> word_meaning = Optional.empty();
        private Optional<String> ph_symbol = Optional.empty();

        public H5Translation() {
        }

        public H5Translation(String str, String str2, String str3, String str4, String str5) {
            this.src_language = str;
            this.src_text = str2;
            this.dest_language = str3;
            this.dest_text = str4;
            this.dest_text_audio_url = str5;
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
            this.open_mic = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public H5Translation setPhSymbol(String str) {
            this.ph_symbol = Optional.ofNullable(str);
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
            this.word_meaning = Optional.ofNullable(str);
            return this;
        }
    }

    public static class H5TranslationV2 {

        @Required
        private String dest_language;

        @Required
        private String src_language;

        @Required
        private String src_text;
        private Optional<Boolean> open_mic = Optional.empty();
        private Optional<SynonymCard> synonym_card = Optional.empty();
        private Optional<PartSimple> part_simple = Optional.empty();
        private Optional<WordDetail> word_detail = Optional.empty();
        private Optional<H5Translation> word_simple = Optional.empty();

        public H5TranslationV2() {
        }

        public H5TranslationV2(String str, String str2, String str3) {
            this.src_language = str;
            this.src_text = str2;
            this.dest_language = str3;
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
            this.open_mic = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public H5TranslationV2 setPartSimple(PartSimple partSimple) {
            this.part_simple = Optional.ofNullable(partSimple);
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
            this.synonym_card = Optional.ofNullable(synonymCard);
            return this;
        }

        public H5TranslationV2 setWordDetail(WordDetail wordDetail) {
            this.word_detail = Optional.ofNullable(wordDetail);
            return this;
        }

        public H5TranslationV2 setWordSimple(H5Translation h5Translation) {
            this.word_simple = Optional.ofNullable(h5Translation);
            return this;
        }
    }

    public static class H5TranslationV3 {

        @Required
        private String dest_language;

        @Required
        private String src_language;

        @Required
        private String src_text;
        private Optional<String> dest_text = Optional.empty();
        private Optional<String> dest_text_audio_url = Optional.empty();
        private Optional<Boolean> open_mic = Optional.empty();
        private Optional<String> word_meaning = Optional.empty();
        private Optional<String> ph_symbol = Optional.empty();
        private Optional<SynonymCard> synonym_card = Optional.empty();
        private Optional<PartSimple> part_simple = Optional.empty();
        private Optional<WordDetail> word_detail = Optional.empty();
        private Optional<H5Translation> word_simple = Optional.empty();

        public H5TranslationV3() {
        }

        public H5TranslationV3(String str, String str2, String str3) {
            this.src_language = str;
            this.src_text = str2;
            this.dest_language = str3;
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
            this.dest_text = Optional.ofNullable(str);
            return this;
        }

        public H5TranslationV3 setDestTextAudioUrl(String str) {
            this.dest_text_audio_url = Optional.ofNullable(str);
            return this;
        }

        public H5TranslationV3 setOpenMic(boolean z) {
            this.open_mic = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public H5TranslationV3 setPartSimple(PartSimple partSimple) {
            this.part_simple = Optional.ofNullable(partSimple);
            return this;
        }

        public H5TranslationV3 setPhSymbol(String str) {
            this.ph_symbol = Optional.ofNullable(str);
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
            this.synonym_card = Optional.ofNullable(synonymCard);
            return this;
        }

        public H5TranslationV3 setWordDetail(WordDetail wordDetail) {
            this.word_detail = Optional.ofNullable(wordDetail);
            return this;
        }

        public H5TranslationV3 setWordMeaning(String str) {
            this.word_meaning = Optional.ofNullable(str);
            return this;
        }

        public H5TranslationV3 setWordSimple(H5Translation h5Translation) {
            this.word_simple = Optional.ofNullable(h5Translation);
            return this;
        }
    }

    public static class H5Video {
        private Optional<String> query = Optional.empty();
        private Optional<String> to_display = Optional.empty();
        private Optional<String> to_speak = Optional.empty();
        private Optional<List<CPInfo>> cp_info = Optional.empty();
        private Optional<List<CardGuideInfo>> card_guide_info = Optional.empty();
        private Optional<List<MovieInfo>> movie = Optional.empty();
        private Optional<Template.SearchHitLevel> hit_level = Optional.empty();
        private Optional<VideoPageType> page_type = Optional.empty();

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
            this.card_guide_info = Optional.ofNullable(list);
            return this;
        }

        public H5Video setCpInfo(List<CPInfo> list) {
            this.cp_info = Optional.ofNullable(list);
            return this;
        }

        public H5Video setHitLevel(Template.SearchHitLevel searchHitLevel) {
            this.hit_level = Optional.ofNullable(searchHitLevel);
            return this;
        }

        public H5Video setMovie(List<MovieInfo> list) {
            this.movie = Optional.ofNullable(list);
            return this;
        }

        public H5Video setPageType(VideoPageType videoPageType) {
            this.page_type = Optional.ofNullable(videoPageType);
            return this;
        }

        public H5Video setQuery(String str) {
            this.query = Optional.ofNullable(str);
            return this;
        }

        public H5Video setToDisplay(String str) {
            this.to_display = Optional.ofNullable(str);
            return this;
        }

        public H5Video setToSpeak(String str) {
            this.to_speak = Optional.ofNullable(str);
            return this;
        }
    }

    public static class H5WordItem {

        @Required
        private String text;
        private Optional<String> id = Optional.empty();
        private Optional<Integer> color = Optional.empty();
        private Optional<Integer> font_size = Optional.empty();

        public H5WordItem() {
        }

        public H5WordItem(String str) {
            this.text = str;
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
            this.color = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public H5WordItem setFontSize(int i) {
            this.font_size = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public H5WordItem setId(String str) {
            this.id = Optional.ofNullable(str);
            return this;
        }

        @Required
        public H5WordItem setText(String str) {
            this.text = str;
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
        private Optional<List<Template.Image>> images = Optional.empty();
        private Optional<Template.Launcher> launcher = Optional.empty();

        public Optional<List<Template.Image>> getImages() {
            return this.images;
        }

        public Optional<Template.Launcher> getLauncher() {
            return this.launcher;
        }

        public JokeData setImages(List<Template.Image> list) {
            this.images = Optional.ofNullable(list);
            return this;
        }

        public JokeData setLauncher(Template.Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }
    }

    public static class Message {

        @Required
        private String avatar;

        @Required
        private MessageType type;
        private Optional<TTS> tts = Optional.empty();
        private Optional<Image> image = Optional.empty();
        private Optional<Animation> animation = Optional.empty();
        private Optional<Emoji> emoji = Optional.empty();

        public Message() {
        }

        public Message(MessageType messageType, String str) {
            this.type = messageType;
            this.avatar = str;
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
            this.animation = Optional.ofNullable(animation);
            return this;
        }

        @Required
        public Message setAvatar(String str) {
            this.avatar = str;
            return this;
        }

        public Message setEmoji(Emoji emoji) {
            this.emoji = Optional.ofNullable(emoji);
            return this;
        }

        public Message setImage(Image image) {
            this.image = Optional.ofNullable(image);
            return this;
        }

        public Message setTts(TTS tts) {
            this.tts = Optional.ofNullable(tts);
            return this;
        }

        @Required
        public Message setType(MessageType messageType) {
            this.type = messageType;
            return this;
        }
    }

    public enum MessageType {
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
        private Optional<MovieBaseInfo> base_info = Optional.empty();
        private Optional<List<SimilarMovie>> similar = Optional.empty();

        public Optional<MovieBaseInfo> getBaseInfo() {
            return this.base_info;
        }

        public Optional<List<SimilarMovie>> getSimilar() {
            return this.similar;
        }

        public Movie setBaseInfo(MovieBaseInfo movieBaseInfo) {
            this.base_info = Optional.ofNullable(movieBaseInfo);
            return this;
        }

        public Movie setSimilar(List<SimilarMovie> list) {
            this.similar = Optional.ofNullable(list);
            return this;
        }
    }

    public static class MovieBaseInfo {
        private Optional<String> id = Optional.empty();
        private Optional<String> name = Optional.empty();
        private Optional<Integer> year = Optional.empty();
        private Optional<Double> rating = Optional.empty();
        private Optional<Image> image = Optional.empty();
        private Optional<String> category = Optional.empty();
        private Optional<Boolean> is_vip = Optional.empty();
        private Optional<Template.VideoShowStatus> show_status = Optional.empty();
        private Optional<String> type = Optional.empty();
        private Optional<String> area = Optional.empty();
        private Optional<Boolean> is_short = Optional.empty();
        private Optional<String> style = Optional.empty();
        private Optional<String> date = Optional.empty();
        private Optional<Integer> duration = Optional.empty();
        private Optional<String> description = Optional.empty();
        private Optional<List<MovieSource>> sources = Optional.empty();
        private Optional<MovieComments> comments = Optional.empty();
        private Optional<CinemaInfo> cinema = Optional.empty();
        private Optional<List<ArtistInfo>> artists = Optional.empty();
        private Optional<EpisodeInfo> episode = Optional.empty();

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

        public Optional<String> getName() {
            return this.name;
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

        public Optional<Boolean> isShort() {
            return this.is_short;
        }

        public Optional<Boolean> isVip() {
            return this.is_vip;
        }

        public MovieBaseInfo setArea(String str) {
            this.area = Optional.ofNullable(str);
            return this;
        }

        public MovieBaseInfo setArtists(List<ArtistInfo> list) {
            this.artists = Optional.ofNullable(list);
            return this;
        }

        public MovieBaseInfo setCategory(String str) {
            this.category = Optional.ofNullable(str);
            return this;
        }

        public MovieBaseInfo setCinema(CinemaInfo cinemaInfo) {
            this.cinema = Optional.ofNullable(cinemaInfo);
            return this;
        }

        public MovieBaseInfo setComments(MovieComments movieComments) {
            this.comments = Optional.ofNullable(movieComments);
            return this;
        }

        public MovieBaseInfo setDate(String str) {
            this.date = Optional.ofNullable(str);
            return this;
        }

        public MovieBaseInfo setDescription(String str) {
            this.description = Optional.ofNullable(str);
            return this;
        }

        public MovieBaseInfo setDuration(int i) {
            this.duration = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public MovieBaseInfo setEpisode(EpisodeInfo episodeInfo) {
            this.episode = Optional.ofNullable(episodeInfo);
            return this;
        }

        public MovieBaseInfo setId(String str) {
            this.id = Optional.ofNullable(str);
            return this;
        }

        public MovieBaseInfo setImage(Image image) {
            this.image = Optional.ofNullable(image);
            return this;
        }

        public MovieBaseInfo setIsShort(boolean z) {
            this.is_short = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public MovieBaseInfo setIsVip(boolean z) {
            this.is_vip = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public MovieBaseInfo setName(String str) {
            this.name = Optional.ofNullable(str);
            return this;
        }

        public MovieBaseInfo setRating(double d) {
            this.rating = Optional.ofNullable(Double.valueOf(d));
            return this;
        }

        public MovieBaseInfo setShowStatus(Template.VideoShowStatus videoShowStatus) {
            this.show_status = Optional.ofNullable(videoShowStatus);
            return this;
        }

        public MovieBaseInfo setSources(List<MovieSource> list) {
            this.sources = Optional.ofNullable(list);
            return this;
        }

        public MovieBaseInfo setStyle(String str) {
            this.style = Optional.ofNullable(str);
            return this;
        }

        public MovieBaseInfo setType(String str) {
            this.type = Optional.ofNullable(str);
            return this;
        }

        public MovieBaseInfo setYear(int i) {
            this.year = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }
    }

    public static class MovieCommentItem {
        private Optional<Image> user_icon = Optional.empty();
        private Optional<String> user_name = Optional.empty();
        private Optional<Double> rating = Optional.empty();
        private Optional<String> time = Optional.empty();
        private Optional<String> text = Optional.empty();
        private Optional<CpLauncher> launcher = Optional.empty();
        private Optional<String> h5_url = Optional.empty();

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
            this.h5_url = Optional.ofNullable(str);
            return this;
        }

        public MovieCommentItem setLauncher(CpLauncher cpLauncher) {
            this.launcher = Optional.ofNullable(cpLauncher);
            return this;
        }

        public MovieCommentItem setRating(double d) {
            this.rating = Optional.ofNullable(Double.valueOf(d));
            return this;
        }

        public MovieCommentItem setText(String str) {
            this.text = Optional.ofNullable(str);
            return this;
        }

        public MovieCommentItem setTime(String str) {
            this.time = Optional.ofNullable(str);
            return this;
        }

        public MovieCommentItem setUserIcon(Image image) {
            this.user_icon = Optional.ofNullable(image);
            return this;
        }

        public MovieCommentItem setUserName(String str) {
            this.user_name = Optional.ofNullable(str);
            return this;
        }
    }

    public static class MovieComments {
        private Optional<String> title = Optional.empty();
        private Optional<List<MovieCommentItem>> comments = Optional.empty();

        public Optional<List<MovieCommentItem>> getComments() {
            return this.comments;
        }

        public Optional<String> getTitle() {
            return this.title;
        }

        public MovieComments setComments(List<MovieCommentItem> list) {
            this.comments = Optional.ofNullable(list);
            return this;
        }

        public MovieComments setTitle(String str) {
            this.title = Optional.ofNullable(str);
            return this;
        }
    }

    public static class MovieInfo {
        private Optional<Template.Title> title = Optional.empty();
        private Optional<Boolean> isAccurateSearch = Optional.empty();
        private Optional<List<Movie>> movies = Optional.empty();

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
            this.isAccurateSearch = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public MovieInfo setMovies(List<Movie> list) {
            this.movies = Optional.ofNullable(list);
            return this;
        }

        public MovieInfo setTitle(Template.Title title) {
            this.title = Optional.ofNullable(title);
            return this;
        }
    }

    public static class MovieSource {
        private Optional<String> id = Optional.empty();
        private Optional<Boolean> can_play = Optional.empty();
        private Optional<CpLauncher> launcher = Optional.empty();
        private Optional<String> h5_url = Optional.empty();

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
            this.can_play = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public MovieSource setH5Url(String str) {
            this.h5_url = Optional.ofNullable(str);
            return this;
        }

        public MovieSource setId(String str) {
            this.id = Optional.ofNullable(str);
            return this;
        }

        public MovieSource setLauncher(CpLauncher cpLauncher) {
            this.launcher = Optional.ofNullable(cpLauncher);
            return this;
        }
    }

    public static class PartMeaning {
        private Optional<String> speech_part = Optional.empty();
        private Optional<String> meaning = Optional.empty();

        public Optional<String> getMeaning() {
            return this.meaning;
        }

        public Optional<String> getSpeechPart() {
            return this.speech_part;
        }

        public PartMeaning setMeaning(String str) {
            this.meaning = Optional.ofNullable(str);
            return this;
        }

        public PartMeaning setSpeechPart(String str) {
            this.speech_part = Optional.ofNullable(str);
            return this;
        }
    }

    public static class PartSimple {

        @Required
        private String word;
        private Optional<List<PhoneticSymbol>> phonetic_symbols = Optional.empty();
        private Optional<List<PartMeaning>> meanings = Optional.empty();
        private Optional<List<String>> word_tags = Optional.empty();

        public PartSimple() {
        }

        public PartSimple(String str) {
            this.word = str;
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
            this.meanings = Optional.ofNullable(list);
            return this;
        }

        public PartSimple setPhoneticSymbols(List<PhoneticSymbol> list) {
            this.phonetic_symbols = Optional.ofNullable(list);
            return this;
        }

        @Required
        public PartSimple setWord(String str) {
            this.word = str;
            return this;
        }

        public PartSimple setWordTags(List<String> list) {
            this.word_tags = Optional.ofNullable(list);
            return this;
        }
    }

    public static class PhoneticSymbol {
        private Optional<String> ph_symbol = Optional.empty();
        private Optional<String> ph_url = Optional.empty();
        private Optional<PhoneticType> ph_type = Optional.empty();

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
            this.ph_symbol = Optional.ofNullable(str);
            return this;
        }

        public PhoneticSymbol setPhType(PhoneticType phoneticType) {
            this.ph_type = Optional.ofNullable(phoneticType);
            return this;
        }

        public PhoneticSymbol setPhUrl(String str) {
            this.ph_url = Optional.ofNullable(str);
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
        private Optional<List<PoemParagraph>> full_text = Optional.empty();
        private Optional<PoemVideo> video_img = Optional.empty();
        private Optional<Boolean> show_pinyin = Optional.empty();
        private Optional<List<PoemTag>> tags = Optional.empty();
        private Optional<PoemTextStyle> text_style = Optional.empty();
        private Optional<PoemMeaning> poem_meaning = Optional.empty();
        private Optional<PoemAnnotates> poem_annotates = Optional.empty();
        private Optional<PoemAppreciation> poem_appreciation = Optional.empty();
        private Optional<PoemTailInfo> tail_info = Optional.empty();
        private Optional<PoemLocationInfo> location_info = Optional.empty();

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

        public PoemData setFullText(List<PoemParagraph> list) {
            this.full_text = Optional.ofNullable(list);
            return this;
        }

        public PoemData setLocationInfo(PoemLocationInfo poemLocationInfo) {
            this.location_info = Optional.ofNullable(poemLocationInfo);
            return this;
        }

        public PoemData setPoemAnnotates(PoemAnnotates poemAnnotates) {
            this.poem_annotates = Optional.ofNullable(poemAnnotates);
            return this;
        }

        public PoemData setPoemAppreciation(PoemAppreciation poemAppreciation) {
            this.poem_appreciation = Optional.ofNullable(poemAppreciation);
            return this;
        }

        public PoemData setPoemMeaning(PoemMeaning poemMeaning) {
            this.poem_meaning = Optional.ofNullable(poemMeaning);
            return this;
        }

        public PoemData setShowPinyin(boolean z) {
            this.show_pinyin = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public PoemData setTags(List<PoemTag> list) {
            this.tags = Optional.ofNullable(list);
            return this;
        }

        public PoemData setTailInfo(PoemTailInfo poemTailInfo) {
            this.tail_info = Optional.ofNullable(poemTailInfo);
            return this;
        }

        public PoemData setTextStyle(PoemTextStyle poemTextStyle) {
            this.text_style = Optional.ofNullable(poemTextStyle);
            return this;
        }

        public PoemData setVideoImg(PoemVideo poemVideo) {
            this.video_img = Optional.ofNullable(poemVideo);
            return this;
        }
    }

    public static class PoemLocationInfo {
        private Optional<List<Integer>> index_list = Optional.empty();

        @Required
        private PoemLocationType location_type;

        public PoemLocationInfo() {
        }

        public PoemLocationInfo(PoemLocationType poemLocationType) {
            this.location_type = poemLocationType;
        }

        public Optional<List<Integer>> getIndexList() {
            return this.index_list;
        }

        @Required
        public PoemLocationType getLocationType() {
            return this.location_type;
        }

        public PoemLocationInfo setIndexList(List<Integer> list) {
            this.index_list = Optional.ofNullable(list);
            return this;
        }

        @Required
        public PoemLocationInfo setLocationType(PoemLocationType poemLocationType) {
            this.location_type = poemLocationType;
            return this;
        }
    }

    public enum PoemLocationType {
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

    public static class PoemSentence {

        @Required
        private List<PoemWord> grid_list;
        private Optional<Boolean> highlight = Optional.empty();
        private Optional<String> text = Optional.empty();
        private Optional<List<PoemAnnotate>> annotate_list = Optional.empty();

        public PoemSentence() {
        }

        public PoemSentence(List<PoemWord> list) {
            this.grid_list = list;
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
            this.annotate_list = Optional.ofNullable(list);
            return this;
        }

        @Required
        public PoemSentence setGridList(List<PoemWord> list) {
            this.grid_list = list;
            return this;
        }

        public PoemSentence setHighlight(boolean z) {
            this.highlight = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public PoemSentence setText(String str) {
            this.text = Optional.ofNullable(str);
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

    public static class PoemWord {

        @Required
        private String word;
        private Optional<String> pinyin = Optional.empty();
        private Optional<Boolean> is_punctuation = Optional.empty();

        public PoemWord() {
        }

        public PoemWord(String str) {
            this.word = str;
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
            this.is_punctuation = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public PoemWord setPinyin(String str) {
            this.pinyin = Optional.ofNullable(str);
            return this;
        }

        @Required
        public PoemWord setWord(String str) {
            this.word = str;
            return this;
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

    public static class QabotData {

        @Required
        private QabotDataSource data_source;
        private Optional<List<Template.Image>> images = Optional.empty();
        private Optional<Template.Launcher> launcher = Optional.empty();
        private Optional<String> show_more_tip = Optional.empty();

        @Required
        private String text;

        @Required
        private Template.Title title;

        public QabotData() {
        }

        public QabotData(Template.Title title, String str, QabotDataSource qabotDataSource) {
            this.title = title;
            this.text = str;
            this.data_source = qabotDataSource;
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
            this.images = Optional.ofNullable(list);
            return this;
        }

        public QabotData setLauncher(Template.Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        public QabotData setShowMoreTip(String str) {
            this.show_more_tip = Optional.ofNullable(str);
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
        private Optional<String> name = Optional.empty();
        private Optional<Boolean> is_live = Optional.empty();
        private Optional<StationLiveStatus> live_status = Optional.empty();
        private Optional<String> live_range = Optional.empty();
        private Optional<String> cp_raw_name = Optional.empty();
        private Optional<String> resource_id = Optional.empty();
        private Optional<String> cp_id = Optional.empty();
        private Optional<String> cp_album_id = Optional.empty();
        private Optional<Integer> rank = Optional.empty();
        private Optional<String> play_track_url = Optional.empty();

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
            this.cp_album_id = Optional.ofNullable(str);
            return this;
        }

        public RadioProgram setCpId(String str) {
            this.cp_id = Optional.ofNullable(str);
            return this;
        }

        public RadioProgram setCpRawName(String str) {
            this.cp_raw_name = Optional.ofNullable(str);
            return this;
        }

        public RadioProgram setIsLive(boolean z) {
            this.is_live = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public RadioProgram setLiveRange(String str) {
            this.live_range = Optional.ofNullable(str);
            return this;
        }

        public RadioProgram setLiveStatus(StationLiveStatus stationLiveStatus) {
            this.live_status = Optional.ofNullable(stationLiveStatus);
            return this;
        }

        public RadioProgram setName(String str) {
            this.name = Optional.ofNullable(str);
            return this;
        }

        public RadioProgram setPlayTrackUrl(String str) {
            this.play_track_url = Optional.ofNullable(str);
            return this;
        }

        public RadioProgram setRank(int i) {
            this.rank = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public RadioProgram setResourceId(String str) {
            this.resource_id = Optional.ofNullable(str);
            return this;
        }
    }

    public static class RecipeDetail {

        @Required
        private String name;
        private Optional<String> img_url = Optional.empty();
        private Optional<String> practice = Optional.empty();
        private Optional<List<String>> practice_list = Optional.empty();
        private Optional<String> skill = Optional.empty();
        private Optional<String> material = Optional.empty();
        private Optional<String> difficult = Optional.empty();
        private Optional<String> cookTime = Optional.empty();
        private Optional<String> cuisine = Optional.empty();
        private Optional<List<RecipeSuggest>> recipeSuggest = Optional.empty();

        public RecipeDetail() {
        }

        public RecipeDetail(String str) {
            this.name = str;
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
            this.cookTime = Optional.ofNullable(str);
            return this;
        }

        public RecipeDetail setCuisine(String str) {
            this.cuisine = Optional.ofNullable(str);
            return this;
        }

        public RecipeDetail setDifficult(String str) {
            this.difficult = Optional.ofNullable(str);
            return this;
        }

        public RecipeDetail setImgUrl(String str) {
            this.img_url = Optional.ofNullable(str);
            return this;
        }

        public RecipeDetail setMaterial(String str) {
            this.material = Optional.ofNullable(str);
            return this;
        }

        @Required
        public RecipeDetail setName(String str) {
            this.name = str;
            return this;
        }

        public RecipeDetail setPractice(String str) {
            this.practice = Optional.ofNullable(str);
            return this;
        }

        public RecipeDetail setPracticeList(List<String> list) {
            this.practice_list = Optional.ofNullable(list);
            return this;
        }

        public RecipeDetail setRecipeSuggest(List<RecipeSuggest> list) {
            this.recipeSuggest = Optional.ofNullable(list);
            return this;
        }

        public RecipeDetail setSkill(String str) {
            this.skill = Optional.ofNullable(str);
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
        private ArrayNode instructions;

        @Required
        private RecipeDetail recipe_detail;

        public RecipeListItem() {
        }

        public RecipeListItem(RecipeDetail recipeDetail, ArrayNode arrayNode) {
            this.recipe_detail = recipeDetail;
            this.instructions = arrayNode;
        }

        @Required
        public ArrayNode getInstructions() {
            return this.instructions;
        }

        @Required
        public RecipeDetail getRecipeDetail() {
            return this.recipe_detail;
        }

        @Required
        public RecipeListItem setInstructions(ArrayNode arrayNode) {
            this.instructions = arrayNode;
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
        private Optional<String> title = Optional.empty();
        private Optional<List<MovieBaseInfo>> movies = Optional.empty();

        public Optional<List<MovieBaseInfo>> getMovies() {
            return this.movies;
        }

        public Optional<String> getTitle() {
            return this.title;
        }

        public SimilarMovie setMovies(List<MovieBaseInfo> list) {
            this.movies = Optional.ofNullable(list);
            return this;
        }

        public SimilarMovie setTitle(String str) {
            this.title = Optional.ofNullable(str);
            return this;
        }
    }

    public static class StationAlbumChapter {
        private Optional<String> chapter_name = Optional.empty();
        private Optional<Common.PaymentType> payment_type = Optional.empty();
        private Optional<String> update_time = Optional.empty();
        private Optional<Long> play_count = Optional.empty();
        private Optional<Integer> rank = Optional.empty();
        private Optional<Long> duration = Optional.empty();
        private Optional<Long> position = Optional.empty();
        private Optional<Integer> episode = Optional.empty();
        private Optional<String> cp_raw_name = Optional.empty();
        private Optional<String> resource_id = Optional.empty();
        private Optional<String> cp_id = Optional.empty();
        private Optional<String> cp_album_id = Optional.empty();
        private Optional<String> cp_album_type = Optional.empty();
        private Optional<String> play_track_url = Optional.empty();
        private Optional<String> audio_id = Optional.empty();
        private Optional<String> album_name = Optional.empty();
        private Optional<String> cover_url = Optional.empty();

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

        public Optional<String> getCpRawName() {
            return this.cp_raw_name;
        }

        public Optional<Long> getDuration() {
            return this.duration;
        }

        public Optional<Integer> getEpisode() {
            return this.episode;
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

        public Optional<String> getUpdateTime() {
            return this.update_time;
        }

        public StationAlbumChapter setAlbumName(String str) {
            this.album_name = Optional.ofNullable(str);
            return this;
        }

        public StationAlbumChapter setAudioId(String str) {
            this.audio_id = Optional.ofNullable(str);
            return this;
        }

        public StationAlbumChapter setChapterName(String str) {
            this.chapter_name = Optional.ofNullable(str);
            return this;
        }

        public StationAlbumChapter setCoverUrl(String str) {
            this.cover_url = Optional.ofNullable(str);
            return this;
        }

        public StationAlbumChapter setCpAlbumId(String str) {
            this.cp_album_id = Optional.ofNullable(str);
            return this;
        }

        public StationAlbumChapter setCpAlbumType(String str) {
            this.cp_album_type = Optional.ofNullable(str);
            return this;
        }

        public StationAlbumChapter setCpId(String str) {
            this.cp_id = Optional.ofNullable(str);
            return this;
        }

        public StationAlbumChapter setCpRawName(String str) {
            this.cp_raw_name = Optional.ofNullable(str);
            return this;
        }

        public StationAlbumChapter setDuration(long j) {
            this.duration = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public StationAlbumChapter setEpisode(int i) {
            this.episode = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public StationAlbumChapter setPaymentType(Common.PaymentType paymentType) {
            this.payment_type = Optional.ofNullable(paymentType);
            return this;
        }

        public StationAlbumChapter setPlayCount(long j) {
            this.play_count = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public StationAlbumChapter setPlayTrackUrl(String str) {
            this.play_track_url = Optional.ofNullable(str);
            return this;
        }

        public StationAlbumChapter setPosition(long j) {
            this.position = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public StationAlbumChapter setRank(int i) {
            this.rank = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public StationAlbumChapter setResourceId(String str) {
            this.resource_id = Optional.ofNullable(str);
            return this;
        }

        public StationAlbumChapter setUpdateTime(String str) {
            this.update_time = Optional.ofNullable(str);
            return this;
        }
    }

    public static class StationCardHead {

        @Required
        private String name;
        private Optional<String> cover_url = Optional.empty();
        private Optional<String> introduction = Optional.empty();
        private Optional<Long> play_count = Optional.empty();
        private Optional<Integer> rank = Optional.empty();
        private Optional<String> broadcaster = Optional.empty();
        private Optional<String> update_time = Optional.empty();
        private Optional<Common.PaymentType> payment_type = Optional.empty();
        private Optional<String> live_radio = Optional.empty();
        private Optional<CPInfo> cp_app_info = Optional.empty();

        public StationCardHead() {
        }

        public StationCardHead(String str) {
            this.name = str;
        }

        public Optional<String> getBroadcaster() {
            return this.broadcaster;
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

        public StationCardHead setBroadcaster(String str) {
            this.broadcaster = Optional.ofNullable(str);
            return this;
        }

        public StationCardHead setCoverUrl(String str) {
            this.cover_url = Optional.ofNullable(str);
            return this;
        }

        public StationCardHead setCpAppInfo(CPInfo cPInfo) {
            this.cp_app_info = Optional.ofNullable(cPInfo);
            return this;
        }

        public StationCardHead setIntroduction(String str) {
            this.introduction = Optional.ofNullable(str);
            return this;
        }

        public StationCardHead setLiveRadio(String str) {
            this.live_radio = Optional.ofNullable(str);
            return this;
        }

        @Required
        public StationCardHead setName(String str) {
            this.name = str;
            return this;
        }

        public StationCardHead setPaymentType(Common.PaymentType paymentType) {
            this.payment_type = Optional.ofNullable(paymentType);
            return this;
        }

        public StationCardHead setPlayCount(long j) {
            this.play_count = Optional.ofNullable(Long.valueOf(j));
            return this;
        }

        public StationCardHead setRank(int i) {
            this.rank = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public StationCardHead setUpdateTime(String str) {
            this.update_time = Optional.ofNullable(str);
            return this;
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
        private Optional<StationAlbumChapter> chapter = Optional.empty();
        private Optional<List<StationAlbumChapter>> chapters = Optional.empty();
        private Optional<StationResourceOrderType> order_type = Optional.empty();
        private Optional<String> open_play_url = Optional.empty();

        public StationInfo() {
        }

        public StationInfo(StationCardHead stationCardHead, int i, int i2, String str, boolean z, boolean z2) {
            this.card_head = stationCardHead;
            this.episode_count = i;
            this.starting_episode = i2;
            this.resource_id = str;
            this.is_boutique = z;
            this.is_final = z2;
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
            this.chapter = Optional.ofNullable(stationAlbumChapter);
            return this;
        }

        public StationInfo setChapters(List<StationAlbumChapter> list) {
            this.chapters = Optional.ofNullable(list);
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
            this.open_play_url = Optional.ofNullable(str);
            return this;
        }

        public StationInfo setOrderType(StationResourceOrderType stationResourceOrderType) {
            this.order_type = Optional.ofNullable(stationResourceOrderType);
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
    }

    public enum StationLiveStatus {
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

    public static class StationRadioInfo {

        @Required
        private StationCardHead card_head;

        @Required
        private boolean is_boutique;
        private Optional<String> open_play_url = Optional.empty();

        @Required
        private List<RadioProgram> radio_programs;

        @Required
        private String resource_id;

        public StationRadioInfo() {
        }

        public StationRadioInfo(StationCardHead stationCardHead, List<RadioProgram> list, String str, boolean z) {
            this.card_head = stationCardHead;
            this.radio_programs = list;
            this.resource_id = str;
            this.is_boutique = z;
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
            this.open_play_url = Optional.ofNullable(str);
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
    }

    public enum StationResourceOrderType {
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

    @NamespaceName(name = "Suite", namespace = AIApiConstants.FullScreenTemplate.NAME)
    public static class Suite implements InstructionPayload {
        private Optional<Template.FullScreen> full_screen = Optional.empty();

        @Required
        private ArrayNode instructions;

        @Required
        private Template.Image skill_icon;

        @Required
        private SuiteType ui_type;

        public Suite() {
        }

        public Suite(ArrayNode arrayNode, Template.Image image, SuiteType suiteType) {
            this.instructions = arrayNode;
            this.skill_icon = image;
            this.ui_type = suiteType;
        }

        public Optional<Template.FullScreen> getFullScreen() {
            return this.full_screen;
        }

        @Required
        public ArrayNode getInstructions() {
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
            this.full_screen = Optional.ofNullable(fullScreen);
            return this;
        }

        @Required
        public Suite setInstructions(ArrayNode arrayNode) {
            this.instructions = arrayNode;
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
    }

    public enum SuiteType {
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
        private Optional<String> speech_part = Optional.empty();
        private Optional<List<SynonymDetail>> details = Optional.empty();

        public Optional<List<SynonymDetail>> getDetails() {
            return this.details;
        }

        public Optional<String> getSpeechPart() {
            return this.speech_part;
        }

        public Synonym setDetails(List<SynonymDetail> list) {
            this.details = Optional.ofNullable(list);
            return this;
        }

        public Synonym setSpeechPart(String str) {
            this.speech_part = Optional.ofNullable(str);
            return this;
        }
    }

    public static class SynonymCard {
        private Optional<List<H5Translation>> h5_translations = Optional.empty();
        private Optional<List<String>> synonym_words = Optional.empty();

        public Optional<List<H5Translation>> getH5Translations() {
            return this.h5_translations;
        }

        public Optional<List<String>> getSynonymWords() {
            return this.synonym_words;
        }

        public SynonymCard setH5Translations(List<H5Translation> list) {
            this.h5_translations = Optional.ofNullable(list);
            return this;
        }

        public SynonymCard setSynonymWords(List<String> list) {
            this.synonym_words = Optional.ofNullable(list);
            return this;
        }
    }

    public static class SynonymDetail {
        private Optional<List<String>> words = Optional.empty();
        private Optional<String> word_meaning = Optional.empty();

        public Optional<String> getWordMeaning() {
            return this.word_meaning;
        }

        public Optional<List<String>> getWords() {
            return this.words;
        }

        public SynonymDetail setWordMeaning(String str) {
            this.word_meaning = Optional.ofNullable(str);
            return this;
        }

        public SynonymDetail setWords(List<String> list) {
            this.words = Optional.ofNullable(list);
            return this;
        }
    }

    public static class TTS {
        private Optional<String> url = Optional.empty();
        private Optional<String> text = Optional.empty();
        private Optional<Integer> length = Optional.empty();
        private Optional<String> display_text = Optional.empty();

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
            this.display_text = Optional.ofNullable(str);
            return this;
        }

        public TTS setLength(int i) {
            this.length = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public TTS setText(String str) {
            this.text = Optional.ofNullable(str);
            return this;
        }

        public TTS setUrl(String str) {
            this.url = Optional.ofNullable(str);
            return this;
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
        private Optional<List<String>> synonym_words = Optional.empty();
        private Optional<Boolean> show_dic_btn = Optional.empty();

        public TranslationDialog() {
        }

        public TranslationDialog(String str, String str2, String str3, String str4, String str5) {
            this.src_language = str;
            this.src_text = str2;
            this.dest_language = str3;
            this.dest_text = str4;
            this.dest_text_audio_url = str5;
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
            this.show_dic_btn = Optional.ofNullable(Boolean.valueOf(z));
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
            this.synonym_words = Optional.ofNullable(list);
            return this;
        }
    }

    public enum VideoPageType {
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

    public static class WeatherAlert {

        @Required
        private Template.Title title;
        private Optional<Template.Image> icon = Optional.empty();
        private Optional<String> detail = Optional.empty();

        public WeatherAlert() {
        }

        public WeatherAlert(Template.Title title) {
            this.title = title;
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
            this.detail = Optional.ofNullable(str);
            return this;
        }

        public WeatherAlert setIcon(Template.Image image) {
            this.icon = Optional.ofNullable(image);
            return this;
        }

        @Required
        public WeatherAlert setTitle(Template.Title title) {
            this.title = title;
            return this;
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

    public static class WeatherFragmentData {

        @Required
        private WeatherFragmentDataType type;
        private Optional<Template.Title> title = Optional.empty();
        private Optional<Template.WeatherItem> single_day_weather = Optional.empty();
        private Optional<List<Template.WeatherItem>> multi_weather_items = Optional.empty();
        private Optional<List<WeatherAlert>> alerts = Optional.empty();
        private Optional<List<WeatherIndex>> indices = Optional.empty();
        private Optional<Integer> offset = Optional.empty();
        private Optional<Template.Launcher> launcher = Optional.empty();

        public WeatherFragmentData() {
        }

        public WeatherFragmentData(WeatherFragmentDataType weatherFragmentDataType) {
            this.type = weatherFragmentDataType;
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
            this.alerts = Optional.ofNullable(list);
            return this;
        }

        public WeatherFragmentData setIndices(List<WeatherIndex> list) {
            this.indices = Optional.ofNullable(list);
            return this;
        }

        public WeatherFragmentData setLauncher(Template.Launcher launcher) {
            this.launcher = Optional.ofNullable(launcher);
            return this;
        }

        public WeatherFragmentData setMultiWeatherItems(List<Template.WeatherItem> list) {
            this.multi_weather_items = Optional.ofNullable(list);
            return this;
        }

        public WeatherFragmentData setOffset(int i) {
            this.offset = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public WeatherFragmentData setSingleDayWeather(Template.WeatherItem weatherItem) {
            this.single_day_weather = Optional.ofNullable(weatherItem);
            return this;
        }

        public WeatherFragmentData setTitle(Template.Title title) {
            this.title = Optional.ofNullable(title);
            return this;
        }

        @Required
        public WeatherFragmentData setType(WeatherFragmentDataType weatherFragmentDataType) {
            this.type = weatherFragmentDataType;
            return this;
        }
    }

    public enum WeatherFragmentDataType {
        DAY(0),
        FORECAST_DAILY(1),
        CURRENT_HORIZONTAL(2),
        CURRENT_VERTICAL(3),
        WEEKEND(4),
        FORECAST_HOURLY(5),
        ALERTS(6),
        INDICES(7);

        private int id;

        WeatherFragmentDataType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class WeatherIndex {
        private Optional<Template.Image> icon = Optional.empty();
        private Optional<Template.Title> title = Optional.empty();
        private Optional<String> detail = Optional.empty();

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
            this.detail = Optional.ofNullable(str);
            return this;
        }

        public WeatherIndex setIcon(Template.Image image) {
            this.icon = Optional.ofNullable(image);
            return this;
        }

        public WeatherIndex setTitle(Template.Title title) {
            this.title = Optional.ofNullable(title);
            return this;
        }
    }

    public static class WordDeformation {
        private Optional<String> part_name = Optional.empty();
        private Optional<List<String>> word = Optional.empty();

        public Optional<String> getPartName() {
            return this.part_name;
        }

        public Optional<List<String>> getWord() {
            return this.word;
        }

        public WordDeformation setPartName(String str) {
            this.part_name = Optional.ofNullable(str);
            return this;
        }

        public WordDeformation setWord(List<String> list) {
            this.word = Optional.ofNullable(list);
            return this;
        }
    }

    public static class WordDetail {
        private Optional<PartSimple> parts = Optional.empty();
        private Optional<List<WordDeformation>> deformations = Optional.empty();
        private Optional<List<ExampleSentence>> sentences = Optional.empty();
        private Optional<List<Synonym>> synonym = Optional.empty();
        private Optional<List<Synonym>> antonym = Optional.empty();

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
            this.antonym = Optional.ofNullable(list);
            return this;
        }

        public WordDetail setDeformations(List<WordDeformation> list) {
            this.deformations = Optional.ofNullable(list);
            return this;
        }

        public WordDetail setParts(PartSimple partSimple) {
            this.parts = Optional.ofNullable(partSimple);
            return this;
        }

        public WordDetail setSentences(List<ExampleSentence> list) {
            this.sentences = Optional.ofNullable(list);
            return this;
        }

        public WordDetail setSynonym(List<Synonym> list) {
            this.synonym = Optional.ofNullable(list);
            return this;
        }
    }

    public static class WordsDetail {

        @Required
        private List<DictionaryItem> dictionaryItems;
        private Optional<Template.Title> title = Optional.empty();

        public WordsDetail() {
        }

        public WordsDetail(List<DictionaryItem> list) {
            this.dictionaryItems = list;
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
            this.title = Optional.ofNullable(title);
            return this;
        }
    }
}
